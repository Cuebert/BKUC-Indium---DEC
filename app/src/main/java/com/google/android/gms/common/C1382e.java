package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;
import p321z2.C5984j;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.e */
/* loaded from: classes.dex */
public class C1382e {

    /* renamed from: c */
    private static C1382e f6264c;

    /* renamed from: a */
    private final Context f6265a;

    /* renamed from: b */
    private volatile String f6266b;

    public C1382e(Context context) {
        this.f6265a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1382e m7607a(Context context) {
        C5984j.m21286j(context);
        synchronized (C1382e.class) {
            if (f6264c == null) {
                C1419r.m7737d(context);
                f6264c = new C1382e(context);
            }
        }
        return f6264c;
    }

    /* renamed from: d */
    static final AbstractBinderC1415n m7608d(PackageInfo packageInfo, AbstractBinderC1415n... abstractBinderC1415nArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC1416o binderC1416o = new BinderC1416o(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < abstractBinderC1415nArr.length; i10++) {
            if (abstractBinderC1415nArr[i10].equals(binderC1416o)) {
                return abstractBinderC1415nArr[i10];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m7609e(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z10 ? m7608d(packageInfo, C1418q.f6403a) : m7608d(packageInfo, C1418q.f6403a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    private final C1424w m7610f(String str, boolean z10, boolean z11) {
        C1424w m7744c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C1424w.m7744c("null pkg");
        }
        if (str.equals(this.f6266b)) {
            return C1424w.m7743b();
        }
        if (C1419r.m7738e()) {
            m7744c = C1419r.m7735b(str, C1381d.m7600f(this.f6265a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f6265a.getPackageManager().getPackageInfo(str, 64);
                boolean m7600f = C1381d.m7600f(this.f6265a);
                if (packageInfo == null) {
                    m7744c = C1424w.m7744c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr != null && signatureArr.length == 1) {
                        BinderC1416o binderC1416o = new BinderC1416o(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C1424w m7734a = C1419r.m7734a(str2, binderC1416o, m7600f, false);
                        m7744c = (!m7734a.f6413a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !C1419r.m7734a(str2, binderC1416o, false, true).f6413a) ? m7734a : C1424w.m7744c("debuggable release cert app rejected");
                    } else {
                        m7744c = C1424w.m7744c("single cert required");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return C1424w.m7745d("no pkg ".concat(str), e10);
            }
        }
        if (m7744c.f6413a) {
            this.f6266b = str;
        }
        return m7744c;
    }

    /* renamed from: b */
    public boolean m7611b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m7609e(packageInfo, false)) {
            return true;
        }
        if (m7609e(packageInfo, true)) {
            if (C1381d.m7600f(this.f6265a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m7612c(int i10) {
        C1424w m7744c;
        int length;
        String[] packagesForUid = this.f6265a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m7744c = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    m7744c = m7610f(packagesForUid[i11], false, false);
                    if (m7744c.f6413a) {
                        break;
                    }
                    i11++;
                } else {
                    C5984j.m21286j(m7744c);
                    break;
                }
            }
        } else {
            m7744c = C1424w.m7744c("no pkgs");
        }
        m7744c.m7748e();
        return m7744c.f6413a;
    }
}
