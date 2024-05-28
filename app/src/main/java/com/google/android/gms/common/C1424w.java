package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.w */
/* loaded from: classes.dex */
public class C1424w {

    /* renamed from: e */
    private static final C1424w f6412e = new C1424w(true, 3, 1, null, null);

    /* renamed from: a */
    final boolean f6413a;

    /* renamed from: b */
    final String f6414b;

    /* renamed from: c */
    final Throwable f6415c;

    /* renamed from: d */
    final int f6416d;

    private C1424w(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f6413a = z10;
        this.f6416d = i10;
        this.f6414b = str;
        this.f6415c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: b */
    public static C1424w m7743b() {
        return f6412e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1424w m7744c(String str) {
        return new C1424w(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C1424w m7745d(String str, Throwable th) {
        return new C1424w(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C1424w m7746f(int i10) {
        return new C1424w(true, i10, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C1424w m7747g(int i10, int i11, String str, Throwable th) {
        return new C1424w(false, i10, i11, str, th);
    }

    /* renamed from: a */
    String mo7742a() {
        return this.f6414b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m7748e() {
        if (this.f6413a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f6415c != null) {
            Log.d("GoogleCertificatesRslt", mo7742a(), this.f6415c);
        } else {
            Log.d("GoogleCertificatesRslt", mo7742a());
        }
    }
}
