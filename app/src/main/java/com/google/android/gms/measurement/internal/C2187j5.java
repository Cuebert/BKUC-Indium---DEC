package com.google.android.gms.measurement.internal;

import android.util.Log;
import p018b4.InterfaceC0991e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j5 */
/* loaded from: classes.dex */
public final class C2187j5 implements InterfaceC0991e {

    /* renamed from: a */
    final /* synthetic */ C2219m4 f8208a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2187j5(C2198k5 c2198k5, C2219m4 c2219m4) {
        this.f8208a = c2219m4;
    }

    @Override // p018b4.InterfaceC0991e
    public final boolean zza() {
        return this.f8208a.m10129q() && Log.isLoggable(this.f8208a.mo9765d().m10045C(), 3);
    }
}
