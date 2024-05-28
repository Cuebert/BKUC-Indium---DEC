package com.roblox.engine.jni.model;

/* loaded from: classes.dex */
public class NativeTextBoxInfo {
    public int font;
    public float fontSize;
    public float height;
    public boolean manualFocusRelease;
    public boolean multiline;
    public int returnKeyType;
    public int textColor;
    public int textInputType;
    public float width;

    /* renamed from: x */
    public float f12087x;
    public int xAlignment;

    /* renamed from: y */
    public float f12088y;
    public int yAlignment;

    public NativeTextBoxInfo(float f10, float f11, float f12, float f13, float f14, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, boolean z11) {
        this.f12087x = f10;
        this.f12088y = f11;
        this.width = f12;
        this.height = f13;
        this.fontSize = f14;
        this.multiline = z10;
        this.xAlignment = i10;
        this.yAlignment = i11;
        this.textColor = i12;
        this.font = i13;
        this.textInputType = i14;
        this.returnKeyType = i15;
        this.manualFocusRelease = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeTextBoxInfo)) {
            return false;
        }
        NativeTextBoxInfo nativeTextBoxInfo = (NativeTextBoxInfo) obj;
        return nativeTextBoxInfo.f12087x == this.f12087x && nativeTextBoxInfo.f12088y == this.f12088y && nativeTextBoxInfo.width == this.width && nativeTextBoxInfo.height == this.height && nativeTextBoxInfo.fontSize == this.fontSize && nativeTextBoxInfo.multiline == this.multiline && nativeTextBoxInfo.xAlignment == this.xAlignment && nativeTextBoxInfo.yAlignment == this.yAlignment && nativeTextBoxInfo.textColor == this.textColor && nativeTextBoxInfo.font == this.font && nativeTextBoxInfo.textInputType == this.textInputType && nativeTextBoxInfo.returnKeyType == this.returnKeyType && nativeTextBoxInfo.manualFocusRelease == this.manualFocusRelease;
    }

    public NativeTextBoxInfo(NativeTextBoxInfo nativeTextBoxInfo) {
        this.f12087x = nativeTextBoxInfo.f12087x;
        this.f12088y = nativeTextBoxInfo.f12088y;
        this.width = nativeTextBoxInfo.width;
        this.height = nativeTextBoxInfo.height;
        this.fontSize = nativeTextBoxInfo.fontSize;
        this.multiline = nativeTextBoxInfo.multiline;
        this.xAlignment = nativeTextBoxInfo.xAlignment;
        this.yAlignment = nativeTextBoxInfo.yAlignment;
        this.textColor = nativeTextBoxInfo.textColor;
        this.font = nativeTextBoxInfo.font;
        this.textInputType = nativeTextBoxInfo.textInputType;
        this.returnKeyType = nativeTextBoxInfo.returnKeyType;
        this.manualFocusRelease = nativeTextBoxInfo.manualFocusRelease;
    }
}
