package com.roblox.engine.jni;

/* loaded from: classes.dex */
public class NativeReportingInterface {
    public static native void addStopwatchCheckpoint(String str);

    public static native void applicationBackgrounded();

    public static native void applicationForegrounded();

    public static native void gameBackgrounded();

    public static native void gameForegrounded();

    public static native void initAppShellReporter();

    public static native void initStopwatch();

    public static native void pushNotificationInteracted(String str, String str2, Object obj);

    public static native void reportStopwatchAllStats();

    public static native void stopPushNotificationSession();
}
