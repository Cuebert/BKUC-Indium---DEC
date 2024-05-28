package com.roblox.engine.jni.locale;

import p116i9.C3547a;

/* loaded from: classes.dex */
public class NativeLocaleJavaInterface {
    private static C3547a sImplementation = new C3547a();

    public static String getGameLocale() {
        return sImplementation.mo15348a();
    }

    public static String getLocale() {
        return sImplementation.mo15349b();
    }

    public static String getRobloxLocale() {
        return sImplementation.mo15350c();
    }

    public static void setImplementation(C3547a c3547a) {
        sImplementation = c3547a;
    }
}
