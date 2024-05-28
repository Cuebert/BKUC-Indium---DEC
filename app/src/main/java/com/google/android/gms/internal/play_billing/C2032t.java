package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.play_billing.t */
/* loaded from: classes.dex */
final class C2032t implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC1914c0 abstractC1914c0 = (AbstractC1914c0) obj;
        AbstractC1914c0 abstractC1914c02 = (AbstractC1914c0) obj2;
        C2025s c2025s = new C2025s(abstractC1914c0);
        C2025s c2025s2 = new C2025s(abstractC1914c02);
        while (c2025s.hasNext() && c2025s2.hasNext()) {
            int compareTo = Integer.valueOf(c2025s.zza() & 255).compareTo(Integer.valueOf(c2025s2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC1914c0.mo9271i()).compareTo(Integer.valueOf(abstractC1914c02.mo9271i()));
    }
}
