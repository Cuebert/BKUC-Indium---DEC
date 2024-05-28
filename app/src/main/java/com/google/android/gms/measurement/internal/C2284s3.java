package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* loaded from: classes.dex */
public final class C2284s3 {

    /* renamed from: a */
    private final String f8528a;

    /* renamed from: b */
    private final long f8529b;

    /* renamed from: c */
    private boolean f8530c;

    /* renamed from: d */
    private long f8531d;

    /* renamed from: e */
    final /* synthetic */ C2326w3 f8532e;

    public C2284s3(C2326w3 c2326w3, String str, long j10) {
        this.f8532e = c2326w3;
        C5984j.m21282f(str);
        this.f8528a = str;
        this.f8529b = j10;
    }

    /* renamed from: a */
    public final long m10298a() {
        if (!this.f8530c) {
            this.f8530c = true;
            this.f8531d = this.f8532e.m10319o().getLong(this.f8528a, this.f8529b);
        }
        return this.f8531d;
    }

    /* renamed from: b */
    public final void m10299b(long j10) {
        SharedPreferences.Editor edit = this.f8532e.m10319o().edit();
        edit.putLong(this.f8528a, j10);
        edit.apply();
        this.f8531d = j10;
    }
}
