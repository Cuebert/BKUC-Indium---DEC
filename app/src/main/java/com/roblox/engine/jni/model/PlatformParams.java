package com.roblox.engine.jni.model;

/* loaded from: classes.dex */
public class PlatformParams {
    public String assetFolderPath;
    public float dpiScale;
    public boolean isKeyboardDevice;
    public boolean isMouseDevice;
    public boolean isTouchDevice;

    /* renamed from: a */
    public void mo13339a(PlatformParams platformParams) {
        if (platformParams != null) {
            this.isTouchDevice = platformParams.isTouchDevice;
            this.isMouseDevice = platformParams.isMouseDevice;
            this.isKeyboardDevice = platformParams.isKeyboardDevice;
            this.dpiScale = platformParams.dpiScale;
            this.assetFolderPath = platformParams.assetFolderPath;
        }
    }
}
