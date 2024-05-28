package com.roblox.client;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: com.roblox.client.m */
/* loaded from: classes.dex */
public class C2870m {

    /* renamed from: a */
    private static final String[] f11404a = new String[0];

    /* renamed from: b */
    private static String f11405b;

    /* renamed from: a */
    private static final String m12818a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        String str2 = BuildConfig.FLAVOR;
        boolean z10 = true;
        for (char c10 : charArray) {
            if (z10 && Character.isLetter(c10)) {
                str2 = str2 + Character.toUpperCase(c10);
                z10 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z10 = true;
                }
                str2 = str2 + c10;
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static String m12819b() {
        String str = f11405b;
        if (str != null) {
            return str;
        }
        String str2 = Build.DEVICE + "|" + Build.MODEL;
        for (String str3 : f11404a) {
            if (str3.endsWith(str2)) {
                String[] split = str3.split("\\|");
                String str4 = split[0];
                String str5 = split[1];
                if (str5.startsWith(str4)) {
                    f11405b = str5;
                } else {
                    f11405b = str4 + " " + str5;
                }
                return f11405b;
            }
        }
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (C2877p0.m12935m0()) {
            f11405b = m12818a(str6) + " " + str7 + Build.DEVICE;
        } else if (str7.startsWith(str6)) {
            f11405b = m12818a(str7);
        } else if (str6.equalsIgnoreCase("HTC")) {
            f11405b = "HTC " + str7;
        } else {
            f11405b = m12818a(str6) + " " + str7;
        }
        return f11405b;
    }
}
