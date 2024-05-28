package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1898ze;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* loaded from: classes.dex */
public final class C2131e4 implements InterfaceC1898ze {

    /* renamed from: a */
    final /* synthetic */ C2153g4 f8058a;

    public C2131e4(C2153g4 c2153g4) {
        this.f8058a = c2153g4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1898ze
    /* renamed from: a */
    public final void mo9190a(int i10, String str, List<String> list, boolean z10, boolean z11) {
        C2152g3 m10047q;
        int i11 = i10 - 1;
        if (i11 == 0) {
            m10047q = this.f8058a.f8118a.mo9765d().m10047q();
        } else if (i11 != 1) {
            if (i11 == 3) {
                m10047q = this.f8058a.f8118a.mo9765d().m10052v();
            } else if (i11 != 4) {
                m10047q = this.f8058a.f8118a.mo9765d().m10051u();
            } else if (z10) {
                m10047q = this.f8058a.f8118a.mo9765d().m10055y();
            } else if (!z11) {
                m10047q = this.f8058a.f8118a.mo9765d().m10054x();
            } else {
                m10047q = this.f8058a.f8118a.mo9765d().m10053w();
            }
        } else if (z10) {
            m10047q = this.f8058a.f8118a.mo9765d().m10050t();
        } else if (!z11) {
            m10047q = this.f8058a.f8118a.mo9765d().m10049s();
        } else {
            m10047q = this.f8058a.f8118a.mo9765d().m10048r();
        }
        int size = list.size();
        if (size == 1) {
            m10047q.m9894b(str, list.get(0));
            return;
        }
        if (size == 2) {
            m10047q.m9895c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            m10047q.m9893a(str);
        } else {
            m10047q.m9896d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
