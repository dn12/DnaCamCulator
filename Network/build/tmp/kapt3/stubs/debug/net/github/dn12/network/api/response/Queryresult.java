package net.github.dn12.network.api.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003JF\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lnet/github/dn12/network/api/response/Queryresult;", "", "numpods", "", "pods", "", "Lnet/github/dn12/network/api/response/Pod;", "success", "", "version", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getNumpods", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPods", "()Ljava/util/List;", "getSuccess", "()Ljava/lang/String;", "getVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lnet/github/dn12/network/api/response/Queryresult;", "equals", "", "other", "hashCode", "toString", "Network_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Queryresult {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer numpods = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<net.github.dn12.network.api.response.Pod> pods = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String success = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String version = null;
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.api.response.Queryresult copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "numpods")
    java.lang.Integer numpods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pods")
    java.util.List<net.github.dn12.network.api.response.Pod> pods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "success")
    java.lang.String success, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "version")
    java.lang.String version) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Queryresult(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "numpods")
    java.lang.Integer numpods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pods")
    java.util.List<net.github.dn12.network.api.response.Pod> pods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "success")
    java.lang.String success, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "version")
    java.lang.String version) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumpods() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<net.github.dn12.network.api.response.Pod> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<net.github.dn12.network.api.response.Pod> getPods() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
}