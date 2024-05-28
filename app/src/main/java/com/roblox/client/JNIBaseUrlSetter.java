package com.roblox.client;

import android.util.Log;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public class JNIBaseUrlSetter {

    /* renamed from: a */
    private static final String f10375a = "JNIBaseUrlSetter";

    @Keep
    static void setBaseUrl(String str) {
        Log.d(f10375a, "setBaseUrl(" + str + ")");
        C2877p0.m12877M0(str);
    }
}
