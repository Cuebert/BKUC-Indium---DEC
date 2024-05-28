package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C1907b0;
import com.google.android.gms.internal.play_billing.C1925d4;
import com.google.android.gms.internal.play_billing.C1926d5;
import com.google.android.gms.internal.play_billing.C1953h4;
import com.google.android.gms.internal.play_billing.C2002o4;
import com.google.android.gms.internal.play_billing.C2071y4;
import com.google.android.gms.internal.play_billing.C2077z4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.p */
/* loaded from: classes.dex */
public final class C1198p implements InterfaceC1195n {

    /* renamed from: a */
    private final C2002o4 f5707a;

    /* renamed from: b */
    private final C1199q f5708b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1198p(Context context, C2002o4 c2002o4) {
        this.f5708b = new C1199q(context);
        this.f5707a = c2002o4;
    }

    @Override // com.android.billingclient.api.InterfaceC1195n
    /* renamed from: a */
    public final void mo6952a(C1953h4 c1953h4) {
        try {
            C2071y4 m9710x = C2077z4.m9710x();
            C2002o4 c2002o4 = this.f5707a;
            if (c2002o4 != null) {
                m9710x.m9692p(c2002o4);
            }
            m9710x.m9691o(c1953h4);
            this.f5708b.m6956a((C2077z4) m9710x.m9695h());
        } catch (Throwable unused) {
            C1907b0.m9250i("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.InterfaceC1195n
    /* renamed from: b */
    public final void mo6953b(C1926d5 c1926d5) {
        try {
            C2071y4 m9710x = C2077z4.m9710x();
            C2002o4 c2002o4 = this.f5707a;
            if (c2002o4 != null) {
                m9710x.m9692p(c2002o4);
            }
            m9710x.m9693q(c1926d5);
            this.f5708b.m6956a((C2077z4) m9710x.m9695h());
        } catch (Throwable unused) {
            C1907b0.m9250i("BillingLogger", "Unable to log.");
        }
    }

    @Override // com.android.billingclient.api.InterfaceC1195n
    /* renamed from: c */
    public final void mo6954c(C1925d4 c1925d4) {
        try {
            C2071y4 m9710x = C2077z4.m9710x();
            C2002o4 c2002o4 = this.f5707a;
            if (c2002o4 != null) {
                m9710x.m9692p(c2002o4);
            }
            m9710x.m9690n(c1925d4);
            this.f5708b.m6956a((C2077z4) m9710x.m9695h());
        } catch (Throwable unused) {
            C1907b0.m9250i("BillingLogger", "Unable to log.");
        }
    }
}
