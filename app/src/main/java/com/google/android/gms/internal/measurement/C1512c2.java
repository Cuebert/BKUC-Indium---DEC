package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* loaded from: classes.dex */
public final class C1512c2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ String f6717r;

    /* renamed from: s */
    final /* synthetic */ Object f6718s;

    /* renamed from: t */
    final /* synthetic */ C1774s2 f6719t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1512c2(C1774s2 c1774s2, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c1774s2, false);
        this.f6719t = c1774s2;
        this.f6717r = str;
        this.f6718s = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        interfaceC1562f1 = this.f6719t.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).logHealthData(5, this.f6717r, BinderC3517b.m15328J0(this.f6718s), BinderC3517b.m15328J0(null), BinderC3517b.m15328J0(null));
    }
}
