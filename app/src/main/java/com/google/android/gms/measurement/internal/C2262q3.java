package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
/* loaded from: classes.dex */
public final class C2262q3 {

    /* renamed from: a */
    private final String f8444a;

    /* renamed from: b */
    private final boolean f8445b;

    /* renamed from: c */
    private boolean f8446c;

    /* renamed from: d */
    private boolean f8447d;

    /* renamed from: e */
    final /* synthetic */ C2326w3 f8448e;

    public C2262q3(C2326w3 c2326w3, String str, boolean z10) {
        this.f8448e = c2326w3;
        C5984j.m21282f(str);
        this.f8444a = str;
        this.f8445b = z10;
    }

    /* renamed from: a */
    public final void m10212a(boolean z10) {
        SharedPreferences.Editor edit = this.f8448e.m10319o().edit();
        edit.putBoolean(this.f8444a, z10);
        edit.apply();
        this.f8447d = z10;
    }

    /* renamed from: b */
    public final boolean m10213b() {
        if (!this.f8446c) {
            this.f8446c = true;
            this.f8447d = this.f8448e.m10319o().getBoolean(this.f8444a, this.f8445b);
        }
        return this.f8447d;
    }
}
