-if class net.github.dn12.network.api.response.SymjaResponse
-keepnames class net.github.dn12.network.api.response.SymjaResponse
-if class net.github.dn12.network.api.response.SymjaResponse
-keep class net.github.dn12.network.api.response.SymjaResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
