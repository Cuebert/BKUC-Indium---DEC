package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1348b;
import p295x2.C5506a;
import p295x2.InterfaceC5518m;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* loaded from: classes.dex */
public final class C1376x<A extends AbstractC1348b<? extends InterfaceC5518m, C5506a.b>> extends AbstractC1347a0 {

    /* renamed from: b */
    protected final A f6251b;

    public C1376x(int i10, A a10) {
        super(i10);
        this.f6251b = (A) C5984j.m21287k(a10, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: a */
    public final void mo7448a(Status status) {
        try {
            this.f6251b.m7457q(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: b */
    public final void mo7449b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f6251b.m7457q(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: c */
    public final void mo7450c(C1367o<?> c1367o) throws DeadObjectException {
        try {
            this.f6251b.m7456o(c1367o.m7572v());
        } catch (RuntimeException e10) {
            mo7449b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: d */
    public final void mo7451d(C1358g c1358g, boolean z10) {
        c1358g.m7521c(this.f6251b, z10);
    }
}
