package net.github.dn12.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lnet/github/dn12/network/api/SymjaService;", "", "calculate", "Lretrofit2/Response;", "Lnet/github/dn12/network/api/response/SymjaResponse;", "equation", "", "limit", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Network_debug"})
public abstract interface SymjaService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/v1/api")
    public abstract java.lang.Object calculate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String equation, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "f")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<net.github.dn12.network.api.response.SymjaResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}