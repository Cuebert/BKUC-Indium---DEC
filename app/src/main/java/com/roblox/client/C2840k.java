package com.roblox.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.engine.jni.NativeSettingsInterface;
import p076f9.C3213g;

/* renamed from: com.roblox.client.k */
/* loaded from: classes.dex */
public class C2840k {

    /* renamed from: a */
    private static String f11308a;

    /* renamed from: a */
    public static String m12660a(Context context) {
        if (f11308a == null) {
            m12663d(context);
        }
        return f11308a;
    }

    /* renamed from: b */
    public static String m12661b(Context context) {
        m12662c(context);
        return NativeSettingsInterface.nativeGetDevRpcConfiguration();
    }

    /* renamed from: c */
    public static void m12662c(Context context) {
        String str;
        if (NativeSettingsInterface.nativeIsDevRpcEnabled()) {
            String m14267g = C3213g.m14267g();
            if (TextUtils.isEmpty(m14267g)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = m14267g + "/bundles/ip.txt";
            }
            NativeSettingsInterface.nativeConfigureDevRpc(str, m12660a(context));
        }
    }

    /* renamed from: d */
    public static void m12663d(Context context) {
        f11308a = C2877p0.m12884Q(context).getString("dev_rpc_ip_port_override", BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    public static void m12664e(Context context, String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        f11308a = str;
        SharedPreferences.Editor edit = C2877p0.m12884Q(context).edit();
        edit.putString("dev_rpc_ip_port_override", str);
        edit.apply();
        m12662c(context);
    }
}
