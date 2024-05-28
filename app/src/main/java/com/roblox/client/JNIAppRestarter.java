package com.roblox.client;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import p288w8.EnumC5480o;

/* loaded from: classes.dex */
public class JNIAppRestarter {

    /* renamed from: a */
    private static final String f10374a = "JNIAppRestarter";

    @Keep
    static void restartApp(Context context, String str) {
        Log.d(f10374a, "restartApp(" + str + ")");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.putExtra("STARTED_FOR_INTENT_KEY", EnumC5480o.APP_RESTART);
        intent.setFlags(268468224);
        context.startActivity(intent);
        Runtime.getRuntime().exit(0);
    }
}
