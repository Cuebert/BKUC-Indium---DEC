package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.measurement.u0 */
/* loaded from: classes.dex */
public final class C1804u0 {

    /* renamed from: a */
    public static final int f7250a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0.charAt(0) <= 'Z') goto L15;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = 0
            r3 = 31
            if (r0 < r3) goto La
            goto L29
        La:
            r3 = 30
            if (r0 < r3) goto L28
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r3 = r0.length()
            r4 = 1
            if (r3 != r4) goto L28
            char r3 = r0.charAt(r2)
            r4 = 83
            if (r3 < r4) goto L28
            char r0 = r0.charAt(r2)
            r3 = 90
            if (r0 > r3) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            com.google.android.gms.internal.measurement.C1804u0.f7250a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1804u0.<clinit>():void");
    }

    /* renamed from: a */
    public static PendingIntent m8855a(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, 0, intent, i11);
    }
}
