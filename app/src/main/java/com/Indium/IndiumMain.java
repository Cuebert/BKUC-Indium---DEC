package com.Indium;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class IndiumMain {
    public static boolean debug_mode;
    public static Activity rbx_ctxt;

    public static void Start(Context context) {
        debug_mode = true;
        Activity activity = (Activity) context;
        rbx_ctxt = activity;
        CrashHandler.init(activity);
        Logcat.save_logs();
        rbx_ctxt.requestPermissions(new String[]{"android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.ACCESS_MEDIA_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES"}, 1);
        System.loadLibrary("Indium");
        Log.i(Logcat.log_tag, "Loaded lib!");
        Log.i(Logcat.log_tag, "Java Side initiated!");
    }
}
