package net.github.dn12.dnacamculator.ui.home

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.os.ext.SdkExtensions.getExtensionVersion
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.latin.TextRecognizerOptions
import net.github.dn12.dnacamculator.BuildConfig
import net.github.dn12.dnacamculator.R
import net.github.dn12.dnacamculator.databinding.FragmentHomeBinding
import org.koin.android.ext.android.inject


private const val ANDROID_R_REQUIRED_EXTENSION_VERSION = 2

class HomeFragment : Fragment() {


    object PhotoPickerAvailabilityChecker {

        fun isPhotoPickerAvailable(): Boolean {
            return when {
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU -> true
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.R -> {
                    getExtensionVersion(Build.VERSION_CODES.R) >= ANDROID_R_REQUIRED_EXTENSION_VERSION
                }

                else -> false
            }
        }
    }

    private val viewModel: HomeViewModel by inject()

    private lateinit var binding: FragmentHomeBinding


    private val snackbarLoading: Snackbar by lazy {
        Snackbar.make(binding.root, R.string.location_loading, Snackbar.LENGTH_INDEFINITE)
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
    }

    private val snackbarError: Snackbar by lazy {
        Snackbar.make(
            binding.root,
            getString(R.string.message_general_error),
            Snackbar.LENGTH_INDEFINITE
        )
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btScan.setOnClickListener {
            if (BuildConfig.GALLERY)
                pickFromGallery()
            else
                takePhoto()
        }

        binding.btCalculate.setOnClickListener {
            viewModel.calculate(binding.etEquation.text.toString())
        }


        viewModel.equationResultLiveData.observeForever {
            binding.tvResult.text = it
        }
        viewModel.loadingStateLiveData.observeForever {
            binding.progressBar.isVisible= it
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            val recognizer =
                TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
            if (requestCode == 12) {
                (data?.extras?.get("data") as Bitmap).let {
                    recognizer.process(it, 0).addOnSuccessListener {
                        Log.e("TAG", "onActivityResult: " + it.text)
                        binding.etEquation.setText(it.text.lines().firstOrNull()?.toString())
                    }.addOnFailureListener {
                        it.printStackTrace()
                    }
                }
            }
            if (requestCode == 13) {
                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(
                        requireActivity().contentResolver,
                        data?.data
                    )
                    recognizer.process(bitmap, 0).addOnSuccessListener {
                        Log.e("TAG", "onActivityResult: " + it.text)
                        binding.etEquation.setText(it.text.lines().firstOrNull()?.toString())
                    }.addOnFailureListener {
                        it.printStackTrace()
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    }


    fun pickFromGallery() {
        val intent = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Intent(MediaStore.ACTION_PICK_IMAGES)
        } else {
            Intent(Intent.ACTION_PICK)
        }
        startActivityForResult(intent, 13)
    }

    fun takePhoto() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(cameraIntent, 12)
    }

}
