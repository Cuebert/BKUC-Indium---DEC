package com.appsflyer.internal;

import android.content.Context;

/* renamed from: com.appsflyer.internal.u */
/* loaded from: classes.dex */
final class C1278u {

    /* renamed from: com.appsflyer.internal.u$c */
    /* loaded from: classes.dex */
    static final class c {
        static final C1278u AFInAppEventParameterName = new C1278u();
    }

    C1278u() {
    }

    private static boolean AFInAppEventParameterName(Context context, String[] strArr) {
        for (String str : strArr) {
            if (C1215aa.AFInAppEventParameterName(context, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (60000 < (r3.getTime() - r9.getTime())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location valueOf(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r1 = 0
            java.lang.String r2 = "location"
            java.lang.Object r2 = r9.getSystemService(r2)     // Catch: java.lang.Throwable -> L55
            android.location.LocationManager r2 = (android.location.LocationManager) r2     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "network"
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}     // Catch: java.lang.Throwable -> L55
            boolean r4 = AFInAppEventParameterName(r9, r4)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L1e
            android.location.Location r3 = r2.getLastKnownLocation(r3)     // Catch: java.lang.Throwable -> L55
            goto L1f
        L1e:
            r3 = r1
        L1f:
            java.lang.String r4 = "gps"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L55
            boolean r9 = AFInAppEventParameterName(r9, r0)     // Catch: java.lang.Throwable -> L55
            if (r9 == 0) goto L30
            android.location.Location r9 = r2.getLastKnownLocation(r4)     // Catch: java.lang.Throwable -> L55
            goto L31
        L30:
            r9 = r1
        L31:
            if (r9 != 0) goto L37
            if (r3 != 0) goto L37
            r3 = r1
            goto L52
        L37:
            if (r9 != 0) goto L3c
            if (r3 == 0) goto L3c
            goto L52
        L3c:
            if (r3 != 0) goto L40
            if (r9 != 0) goto L51
        L40:
            long r4 = r3.getTime()     // Catch: java.lang.Throwable -> L55
            long r6 = r9.getTime()     // Catch: java.lang.Throwable -> L55
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L51
            goto L52
        L51:
            r3 = r9
        L52:
            if (r3 == 0) goto L55
            r1 = r3
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C1278u.valueOf(android.content.Context):android.location.Location");
    }
}
