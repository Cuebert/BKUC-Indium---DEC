package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* loaded from: classes.dex */
public final class C1476a0 extends AbstractC1851x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1476a0() {
        this.f7285a.add(EnumC1692n0.APPLY);
        this.f7285a.add(EnumC1692n0.BLOCK);
        this.f7285a.add(EnumC1692n0.BREAK);
        this.f7285a.add(EnumC1692n0.CASE);
        this.f7285a.add(EnumC1692n0.DEFAULT);
        this.f7285a.add(EnumC1692n0.CONTINUE);
        this.f7285a.add(EnumC1692n0.DEFINE_FUNCTION);
        this.f7285a.add(EnumC1692n0.FN);
        this.f7285a.add(EnumC1692n0.IF);
        this.f7285a.add(EnumC1692n0.QUOTE);
        this.f7285a.add(EnumC1692n0.RETURN);
        this.f7285a.add(EnumC1692n0.SWITCH);
        this.f7285a.add(EnumC1692n0.TERNARY);
    }

    /* renamed from: c */
    private static InterfaceC1739q m7876c(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        C1745q5.m8723i(EnumC1692n0.FN.name(), 2, list);
        InterfaceC1739q m8655b = c1728p4.m8655b(list.get(0));
        InterfaceC1739q m8655b2 = c1728p4.m8655b(list.get(1));
        if (m8655b2 instanceof C1560f) {
            List<InterfaceC1739q> m8144w = ((C1560f) m8655b2).m8144w();
            List<InterfaceC1739q> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C1723p(m8655b.mo8132e(), m8144w, arrayList, c1728p4);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m8655b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (r8.equals("continue") == false) goto L64;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1739q mo7877a(java.lang.String r8, com.google.android.gms.internal.measurement.C1728p4 r9, java.util.List<com.google.android.gms.internal.measurement.InterfaceC1739q> r10) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1476a0.mo7877a(java.lang.String, com.google.android.gms.internal.measurement.p4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
