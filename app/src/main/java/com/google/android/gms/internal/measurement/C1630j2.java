package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import p110i3.BinderC3517b;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* loaded from: classes.dex */
final class C1630j2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ Bundle f6917r;

    /* renamed from: s */
    final /* synthetic */ Activity f6918s;

    /* renamed from: t */
    final /* synthetic */ C1758r2 f6919t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1630j2(C1758r2 c1758r2, Bundle bundle, Activity activity) {
        super(c1758r2.f7193n, true);
        this.f6919t = c1758r2;
        this.f6917r = bundle;
        this.f6918s = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        Bundle bundle;
        InterfaceC1562f1 interfaceC1562f1;
        if (this.f6917r != null) {
            bundle = new Bundle();
            if (this.f6917r.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f6917r.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC1562f1 = this.f6919t.f7193n.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).onActivityCreated(BinderC3517b.m15328J0(this.f6918s), bundle, this.f6840o);
    }
}
