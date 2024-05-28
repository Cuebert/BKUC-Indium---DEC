package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
/* loaded from: classes.dex */
final class C1619i7 implements Comparator<AbstractC1731p7> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(AbstractC1731p7 abstractC1731p7, AbstractC1731p7 abstractC1731p72) {
        AbstractC1731p7 abstractC1731p73 = abstractC1731p7;
        AbstractC1731p7 abstractC1731p74 = abstractC1731p72;
        C1585g7 c1585g7 = new C1585g7(abstractC1731p73);
        C1585g7 c1585g72 = new C1585g7(abstractC1731p74);
        while (c1585g7.hasNext() && c1585g72.hasNext()) {
            int m8230a = C1602h7.m8230a(c1585g7.zza() & 255, c1585g72.zza() & 255);
            if (m8230a != 0) {
                return m8230a;
            }
        }
        return C1602h7.m8230a(abstractC1731p73.mo8352i(), abstractC1731p74.mo8352i());
    }
}
