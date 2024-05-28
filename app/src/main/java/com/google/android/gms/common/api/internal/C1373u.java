package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.AbstractC1352d;
import p085g4.C3265m;
import p295x2.C5506a;
import p308y2.InterfaceC5620k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes.dex */
public final class C1373u extends AbstractC1352d {

    /* renamed from: d */
    final /* synthetic */ AbstractC1352d.a f6249d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373u(AbstractC1352d.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f6249d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC1352d
    /* renamed from: b */
    public final void mo7498b(C5506a.b bVar, C3265m c3265m) throws RemoteException {
        InterfaceC5620k interfaceC5620k;
        interfaceC5620k = this.f6249d.f6190a;
        interfaceC5620k.mo6178a(bVar, c3265m);
    }
}
