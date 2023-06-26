

package net.github.dn12.network.api

import net.github.dn12.network.api.response.SymjaResponse
import net.github.dn12.network.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SymjaService {
    //https://symja.org/v1/api?i=5*5&appid=DEMO&f=plaintext

    @GET("/v1/api")
    suspend fun calculate(
        @Query("i") equation: String,
        @Query("appid") limit: String = Constants.DEMO,
        @Query("f") apiKey: String = Constants.PLAINTEXT
    ): Response<SymjaResponse>
}
