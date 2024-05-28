package com.roblox.engine.jni;

/* loaded from: classes.dex */
public class NativeVideoInterface {

    /* loaded from: classes.dex */
    public enum ImageOrientation {
        Normal,
        FlipHorizontal,
        Rotate180,
        FlipVertical,
        Transpose,
        Rotate90,
        Transverse,
        Rotate270
    }

    /* loaded from: classes.dex */
    public static class VideoDeviceId {
    }

    /* loaded from: classes.dex */
    public interface VideoStreamListener {
    }

    public static native boolean connectListener(long j10, VideoStreamListener videoStreamListener);

    public static native long createCameraStream();

    public static native boolean destroyCameraStream(long j10);

    public static native VideoDeviceId[] nativeGetCameraDevices();

    public static native int openVideoStream(long j10, String str, int i10, int i11, double d10);

    public static native void setPlaying(long j10, boolean z10);
}
