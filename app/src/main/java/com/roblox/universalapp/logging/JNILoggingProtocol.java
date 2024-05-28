package com.roblox.universalapp.logging;

/* loaded from: classes.dex */
public class JNILoggingProtocol {
    /* renamed from: a */
    public static void m13358a(String str, long j10, Object... objArr) {
        nativeLogEvent(str, j10, objArr);
    }

    public static native long nativeGetTimestamp();

    private static native void nativeLogEvent(String str, long j10, Object[] objArr);
}
