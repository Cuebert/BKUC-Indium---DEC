package com.google.android.gms.measurement.internal;

import p070f3.InterfaceC3130d;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o8 */
/* loaded from: classes.dex */
public final class C2245o8 {

    /* renamed from: a */
    private final InterfaceC3130d f8408a;

    /* renamed from: b */
    private long f8409b;

    public C2245o8(InterfaceC3130d interfaceC3130d) {
        C5984j.m21286j(interfaceC3130d);
        this.f8408a = interfaceC3130d;
    }

    /* renamed from: a */
    public final void m10201a() {
        this.f8409b = 0L;
    }

    /* renamed from: b */
    public final void m10202b() {
        this.f8409b = this.f8408a.mo13782b();
    }

    /* renamed from: c */
    public final boolean m10203c(long j10) {
        return this.f8409b == 0 || this.f8408a.mo13782b() - this.f8409b >= 3600000;
    }
}
