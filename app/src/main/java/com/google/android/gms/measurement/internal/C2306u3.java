package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* loaded from: classes.dex */
public final class C2306u3 {

    /* renamed from: a */
    private final String f8589a;

    /* renamed from: b */
    private boolean f8590b;

    /* renamed from: c */
    private String f8591c;

    /* renamed from: d */
    final /* synthetic */ C2326w3 f8592d;

    public C2306u3(C2326w3 c2326w3, String str, String str2) {
        this.f8592d = c2326w3;
        C5984j.m21282f(str);
        this.f8589a = str;
    }

    /* renamed from: a */
    public final String m10311a() {
        if (!this.f8590b) {
            this.f8590b = true;
            this.f8591c = this.f8592d.m10319o().getString(this.f8589a, null);
        }
        return this.f8591c;
    }

    /* renamed from: b */
    public final void m10312b(String str) {
        SharedPreferences.Editor edit = this.f8592d.m10319o().edit();
        edit.putString(this.f8589a, str);
        edit.apply();
        this.f8591c = str;
    }
}
