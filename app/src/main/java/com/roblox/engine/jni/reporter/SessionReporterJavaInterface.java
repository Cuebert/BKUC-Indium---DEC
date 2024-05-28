package com.roblox.engine.jni.reporter;

import p130j9.C3673b;
import p130j9.InterfaceC3672a;

/* loaded from: classes.dex */
public class SessionReporterJavaInterface {
    private static InterfaceC3672a sImplementation = new C3673b();

    public static String getAppVersion() {
        return sImplementation.mo15616d();
    }

    public static String getFilesDir() {
        return sImplementation.mo15614b();
    }

    public static String getLastLoggedInUser() {
        return sImplementation.mo15615c();
    }

    public static String getLastLoggedInUserId() {
        return sImplementation.mo15613a();
    }

    public static void sendSessionReport(String str, String str2) {
        sImplementation.mo15617e(str, str2);
    }

    public static void setEventTrackingGoogleAnalytics(String str, String str2, String str3, long j10) {
        sImplementation.mo15618f(str, str2, str3, j10);
    }

    public static void setImplementation(InterfaceC3672a interfaceC3672a) {
        if (interfaceC3672a != null) {
            sImplementation = interfaceC3672a;
        }
    }
}
