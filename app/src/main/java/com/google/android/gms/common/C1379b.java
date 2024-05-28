package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p070f3.C3134h;
import p096h3.C3393c;
import p235s3.C4521d;
import p282w2.C5105c;
import p282w2.C5106d;

/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes.dex */
public class C1379b {

    /* renamed from: a */
    public static final int f6256a = C1381d.f6259a;

    /* renamed from: b */
    private static final C1379b f6257b = new C1379b();

    /* renamed from: f */
    public static C1379b m7589f() {
        return f6257b;
    }

    /* renamed from: a */
    public int m7590a(Context context) {
        return C1381d.m7596b(context);
    }

    /* renamed from: b */
    public Intent mo7387b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && C3134h.m13790d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f6256a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C3393c.m14952a(context).m14949d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* renamed from: c */
    public PendingIntent mo7388c(Context context, int i10, int i11) {
        return m7591d(context, i10, i11, null);
    }

    /* renamed from: d */
    public PendingIntent m7591d(Context context, int i10, int i11, String str) {
        Intent mo7387b = mo7387b(context, i10, str);
        if (mo7387b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, mo7387b, C4521d.f18270a | 134217728);
    }

    /* renamed from: e */
    public String mo7389e(int i10) {
        return C1381d.m7597c(i10);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: g */
    public int mo7390g(Context context) {
        return mo7391h(context, f6256a);
    }

    /* renamed from: h */
    public int mo7391h(Context context, int i10) {
        int m7601g = C1381d.m7601g(context, i10);
        if (C1381d.m7602h(context, m7601g)) {
            return 18;
        }
        return m7601g;
    }

    /* renamed from: i */
    public boolean m7592i(Context context, String str) {
        return C1381d.m7606l(context, str);
    }

    /* renamed from: j */
    public boolean mo7392j(int i10) {
        return C1381d.m7604j(i10);
    }

    /* renamed from: k */
    public void m7593k(Context context, int i10) throws C5106d, C5105c {
        C1381d.m7595a(context, i10);
    }
}
