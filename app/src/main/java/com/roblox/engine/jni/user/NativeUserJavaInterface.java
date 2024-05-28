package com.roblox.engine.jni.user;

import p143k9.C3768a;

/* loaded from: classes.dex */
public class NativeUserJavaInterface {
    private static C3768a sImplementation;

    public static String getAlternateName() {
        return sImplementation.mo16012a();
    }

    public static String getDisplayName() {
        return sImplementation.mo16013b();
    }

    public static boolean getIsUnder13() {
        return sImplementation.mo16019h();
    }

    public static int getMembershipType() {
        return sImplementation.mo16014c();
    }

    public static String getPlatformName() {
        return sImplementation.m16015d();
    }

    public static String getTheme() {
        return sImplementation.mo16016e();
    }

    public static long getUserId() {
        return sImplementation.mo16017f();
    }

    public static String getUsername() {
        return sImplementation.mo16018g();
    }

    public static void setImplementation(C3768a c3768a) {
        if (c3768a != null) {
            sImplementation = c3768a;
        }
    }
}
