package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.cct.C1304a;
import com.google.android.gms.internal.play_billing.C1907b0;
import com.google.android.gms.internal.play_billing.C2077z4;
import p003a2.C0025t;
import p307y1.AbstractC5594c;
import p307y1.C5593b;
import p307y1.InterfaceC5596e;
import p307y1.InterfaceC5597f;

/* renamed from: com.android.billingclient.api.q */
/* loaded from: classes.dex */
final class C1199q {

    /* renamed from: a */
    private boolean f5709a;

    /* renamed from: b */
    private InterfaceC5597f f5710b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1199q(Context context) {
        try {
            C0025t.m161f(context);
            this.f5710b = C0025t.m159c().m163g(C1304a.f5917g).mo151a("PLAY_BILLING_LIBRARY", C2077z4.class, C5593b.m20616b("proto"), new InterfaceC5596e() { // from class: n1.y
                @Override // p307y1.InterfaceC5596e
                /* renamed from: a */
                public final Object mo16838a(Object obj) {
                    return ((C2077z4) obj).m9488d();
                }
            });
        } catch (Throwable unused) {
            this.f5709a = true;
        }
    }

    /* renamed from: a */
    public final void m6956a(C2077z4 c2077z4) {
        if (this.f5709a) {
            C1907b0.m9250i("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f5710b.mo155a(AbstractC5594c.m20618d(c2077z4));
        } catch (Throwable unused) {
            C1907b0.m9250i("BillingLogger", "logging failed.");
        }
    }
}
