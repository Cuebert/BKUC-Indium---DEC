package com.roblox.engine.jni.video;

/* loaded from: classes.dex */
public class VideoCodecSupportedType {
    public String[] levels;
    public int maxBitrate;
    public int maxFps;
    public int maxHeight;
    public int maxInstances;
    public int maxWidth;
    public int minBitrate;
    public int minFps;
    public int minHeight;
    public int minWidth;
    public String name;
    public String[] profiles;

    public VideoCodecSupportedType(String str, int i10, String[] strArr, String[] strArr2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.name = str;
        this.maxInstances = i10;
        this.profiles = strArr;
        this.levels = strArr2;
        this.minWidth = i11;
        this.maxWidth = i12;
        this.minHeight = i13;
        this.maxHeight = i14;
        this.minFps = i15;
        this.maxFps = i16;
        this.minBitrate = i17;
        this.maxBitrate = i18;
    }
}
