-if class net.github.dn12.network.api.response.Pod
-keepnames class net.github.dn12.network.api.response.Pod
-if class net.github.dn12.network.api.response.Pod
-keep class net.github.dn12.network.api.response.PodJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
