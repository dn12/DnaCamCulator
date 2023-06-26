-if class net.github.dn12.network.api.response.Subpod
-keepnames class net.github.dn12.network.api.response.Subpod
-if class net.github.dn12.network.api.response.Subpod
-keep class net.github.dn12.network.api.response.SubpodJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
