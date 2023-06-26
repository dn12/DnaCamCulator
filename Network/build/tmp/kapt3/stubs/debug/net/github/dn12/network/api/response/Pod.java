package net.github.dn12.network.api.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0001\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JR\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0012\b\u0003\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006!"}, d2 = {"Lnet/github/dn12/network/api/response/Pod;", "", "error", "", "numsubpods", "", "scanner", "subpods", "", "Lnet/github/dn12/network/api/response/Subpod;", "title", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getNumsubpods", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScanner", "getSubpods", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lnet/github/dn12/network/api/response/Pod;", "equals", "", "other", "hashCode", "toString", "Network_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Pod {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer numsubpods = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String scanner = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<net.github.dn12.network.api.response.Subpod> subpods = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    
    @org.jetbrains.annotations.NotNull()
    public final net.github.dn12.network.api.response.Pod copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "error")
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "numsubpods")
    java.lang.Integer numsubpods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "scanner")
    java.lang.String scanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subpods")
    java.util.List<net.github.dn12.network.api.response.Subpod> subpods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title) {
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
    
    public Pod(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "error")
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "numsubpods")
    java.lang.Integer numsubpods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "scanner")
    java.lang.String scanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "subpods")
    java.util.List<net.github.dn12.network.api.response.Subpod> subpods, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumsubpods() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScanner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<net.github.dn12.network.api.response.Subpod> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<net.github.dn12.network.api.response.Subpod> getSubpods() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
}