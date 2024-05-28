package com.google.android.gms.common.api.internal;

import p295x2.C5506a;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes.dex */
final class RunnableC1365m implements Runnable {

    /* renamed from: n */
    final /* synthetic */ C1366n f6215n;

    public RunnableC1365m(C1366n c1366n) {
        this.f6215n = c1366n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5506a.f fVar;
        C5506a.f fVar2;
        C1367o c1367o = this.f6215n.f6216a;
        fVar = c1367o.f6218d;
        fVar2 = c1367o.f6218d;
        fVar.mo20251f(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
