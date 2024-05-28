package com.roblox.engine.jni.video;

/* loaded from: classes.dex */
public class VideoCodecCapability {
    boolean hardware;
    String simpleName;
    VideoCodecSupportedType[] supportedTypes;

    public VideoCodecCapability(boolean z10, String str, VideoCodecSupportedType[] videoCodecSupportedTypeArr) {
        this.hardware = z10;
        this.simpleName = str;
        this.supportedTypes = videoCodecSupportedTypeArr;
    }
}
