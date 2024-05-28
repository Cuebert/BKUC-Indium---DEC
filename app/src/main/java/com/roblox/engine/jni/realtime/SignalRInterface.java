package com.roblox.engine.jni.realtime;

/* loaded from: classes.dex */
public class SignalRInterface {
    public static native void nativeStartSignalR(SignalRInterfaceCallback signalRInterfaceCallback, String str, String str2, String str3, String str4, String str5);

    public static native void nativeStopSignalR(boolean z10);
}
