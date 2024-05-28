package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.t2 */
/* loaded from: classes.dex */
public final class C2035t2 extends C1931e3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2035t2(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.play_billing.C1931e3
    /* renamed from: a */
    public final void mo9336a() {
        if (!m9341j()) {
            for (int i10 = 0; i10 < m9337b(); i10++) {
                Map.Entry m9340g = m9340g(i10);
                if (((InterfaceC2033t0) m9340g.getKey()).m9645a()) {
                    m9340g.setValue(Collections.unmodifiableList((List) m9340g.getValue()));
                }
            }
            for (Map.Entry entry : m9338c()) {
                if (((InterfaceC2033t0) entry.getKey()).m9645a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo9336a();
    }
}
