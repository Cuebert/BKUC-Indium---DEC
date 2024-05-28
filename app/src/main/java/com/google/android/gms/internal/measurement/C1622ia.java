package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ia */
/* loaded from: classes.dex */
public final class C1622ia extends C1734pa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1622ia(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.measurement.C1734pa
    /* renamed from: a */
    public final void mo8309a() {
        if (!m8698j()) {
            for (int i10 = 0; i10 < m8694b(); i10++) {
                Map.Entry m8697g = m8697g(i10);
                if (((InterfaceC1586g8) m8697g.getKey()).m8197a()) {
                    m8697g.setValue(Collections.unmodifiableList((List) m8697g.getValue()));
                }
            }
            for (Map.Entry entry : m8695c()) {
                if (((InterfaceC1586g8) entry.getKey()).m8197a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo8309a();
    }
}
