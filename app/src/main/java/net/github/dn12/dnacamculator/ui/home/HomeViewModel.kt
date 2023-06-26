package net.github.dn12.dnacamculator.ui.home

import android.app.Application
import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import net.github.dn12.network.repositories.SymjaRepository
import java.io.InputStream

class HomeViewModel(
    private val symjaRepository: SymjaRepository,
) : ViewModel() {

    val ERROR = "Unexpected Equation"
    val equationResultLiveData: MutableLiveData<String> = MutableLiveData()
    val loadingStateLiveData : MutableLiveData<Boolean> = MutableLiveData(false)

    fun calculate(equation : String){
        if(equation.length>2) {
            loadingStateLiveData.postValue(true)
            viewModelScope.launch {
                Log.e("TAG", "calculate: asking " + equation )
                val result = symjaRepository.calculate(equation)
                result.data?.let {
                    val result =
                        it.body()?.queryresult?.pods?.find { it?.title == "Result" || it?.title == "Decimal form" }?.subpods?.firstOrNull()?.plaintext
                            ?: ERROR
                    equationResultLiveData.postValue(result)

                }
                loadingStateLiveData.postValue(false)
            }
        }else{
            equationResultLiveData.postValue(ERROR)
        }
    }


}
