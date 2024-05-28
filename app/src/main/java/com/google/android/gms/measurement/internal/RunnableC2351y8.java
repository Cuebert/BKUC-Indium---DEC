package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
/* loaded from: classes.dex */
final class RunnableC2351y8 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ String f8793n;

    /* renamed from: o */
    final /* synthetic */ String f8794o = "_err";

    /* renamed from: p */
    final /* synthetic */ Bundle f8795p;

    /* renamed from: q */
    final /* synthetic */ C2361z8 f8796q;

    public RunnableC2351y8(C2361z8 c2361z8, String str, String str2, Bundle bundle) {
        this.f8796q = c2361z8;
        this.f8793n = str;
        this.f8795p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8796q.f8825a.m9776j((zzat) C5984j.m21286j(this.f8796q.f8825a.m9771g0().m9984w0(this.f8793n, this.f8794o, this.f8795p, "auto", this.f8796q.f8825a.mo9767e().mo13781a(), false, true)), this.f8793n);
    }
}
