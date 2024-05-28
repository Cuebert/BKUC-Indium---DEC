package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import p085g4.C3265m;
import p308y2.C5614h;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* loaded from: classes.dex */
public final class C1378z extends AbstractC1374v<Boolean> {

    /* renamed from: c */
    public final C5614h<?> f6255c;

    public C1378z(C5614h<?> c5614h, C3265m<Boolean> c3265m) {
        super(4, c3265m);
        this.f6255c = c5614h;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1347a0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo7451d(C1358g c1358g, boolean z10) {
    }

    @Override // p308y2.AbstractC5632v
    /* renamed from: f */
    public final boolean mo7587f(C1367o<?> c1367o) {
        if (c1367o.m7573x().get(this.f6255c) == null) {
            return false;
        }
        throw null;
    }

    @Override // p308y2.AbstractC5632v
    /* renamed from: g */
    public final Feature[] mo7588g(C1367o<?> c1367o) {
        if (c1367o.m7573x().get(this.f6255c) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1374v
    /* renamed from: h */
    public final void mo7586h(C1367o<?> c1367o) throws RemoteException {
        if (c1367o.m7573x().remove(this.f6255c) == null) {
            this.f6250b.m14516e(Boolean.FALSE);
        } else {
            c1367o.m7572v();
            throw null;
        }
    }
}
