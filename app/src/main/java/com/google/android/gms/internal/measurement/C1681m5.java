package com.google.android.gms.internal.measurement;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* loaded from: classes.dex */
public final class C1681m5 {

    /* renamed from: a */
    private static volatile boolean f7007a = !m8456a();

    /* renamed from: a */
    public static boolean m8456a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
