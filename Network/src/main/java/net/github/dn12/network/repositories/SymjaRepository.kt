

package net.github.dn12.network.repositories


import net.github.dn12.network.util.MyNetworkCallResult
import net.github.dn12.network.util.MyNetworkRequestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.github.dn12.network.api.SymjaService
import net.github.dn12.network.api.response.SymjaResponse
import retrofit2.Response
import kotlin.math.log

class SymjaRepository(
    private val onlineServices : SymjaService
) {

    suspend fun calculate(equation:String): MyNetworkRequestResult<Response<SymjaResponse>> =
        withContext(Dispatchers.IO) {
            return@withContext try {
                val resp = onlineServices.calculate(equation)
                MyNetworkRequestResult.success(resp)
            } catch (e: Exception) {
                e.printStackTrace()
                MyNetworkRequestResult.error(
                    MyNetworkCallResult.ERROR
                )
            }
        }


}
