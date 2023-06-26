-if class net.github.dn12.network.api.response.Queryresult
-keepnames class net.github.dn12.network.api.response.Queryresult
-if class net.github.dn12.network.api.response.Queryresult
-keep class net.github.dn12.network.api.response.QueryresultJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
