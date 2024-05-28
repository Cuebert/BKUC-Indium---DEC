package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p295x2.C5506a;
import p308y2.AbstractC5632v;
import p308y2.InterfaceC5623m;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes.dex */
public final class C1377y<ResultT> extends AbstractC5632v {

    /* renamed from: b */
    private final AbstractC1352d<C5506a.b, ResultT> f6252b;

    /* renamed from: c */
    private final C3265m<ResultT> f6253c;

    /* renamed from: d */
    private final InterfaceC5623m f6254d;

    public C1377y(int i10, AbstractC1352d<C5506a.b, ResultT> abstractC1352d, C3265m<ResultT> c3265m, InterfaceC5623m interfaceC5623m) {
        super(i10);
        this.f6253c = c3265m;
        this.f6252b = abstractC1352d;
        this.f6254d = interfaceC5623m;
        if (i10 == 2 && abstractC1352d.m7499c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: a */
    public final void mo7448a(Status status) {
        this.f6253c.m14515d(this.f6254d.mo20620a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: b */
    public final void mo7449b(Exception exc) {
        this.f6253c.m14515d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: c */
    public final void mo7450c(C1367o<?> c1367o) throws DeadObjectException {
        try {
            this.f6252b.mo7498b(c1367o.m7572v(), this.f6253c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo7448a(AbstractC1347a0.m7447e(e11));
        } catch (RuntimeException e12) {
            this.f6253c.m14515d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: d */
    public final void mo7451d(C1358g c1358g, boolean z10) {
        c1358g.m7522d(this.f6253c, z10);
    }

    @Override // p308y2.AbstractC5632v
    /* renamed from: f */
    public final boolean mo7587f(C1367o<?> c1367o) {
        return this.f6252b.m7499c();
    }

    @Override // p308y2.AbstractC5632v
    /* renamed from: g */
    public final Feature[] mo7588g(C1367o<?> c1367o) {
        return this.f6252b.m7501e();
    }
}
