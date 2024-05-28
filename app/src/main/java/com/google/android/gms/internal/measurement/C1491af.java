package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.af */
/* loaded from: classes.dex */
public final class C1491af extends AbstractC1627j {

    /* renamed from: p */
    final boolean f6646p;

    /* renamed from: q */
    final boolean f6647q;

    /* renamed from: r */
    final /* synthetic */ C1508bf f6648r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1491af(C1508bf c1508bf, boolean z10, boolean z11) {
        super("log");
        this.f6648r = c1508bf;
        this.f6646p = z10;
        this.f6647q = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        InterfaceC1898ze interfaceC1898ze;
        InterfaceC1898ze interfaceC1898ze2;
        InterfaceC1898ze interfaceC1898ze3;
        C1745q5.m8723i("log", 1, list);
        if (list.size() == 1) {
            interfaceC1898ze3 = this.f6648r.f6707p;
            interfaceC1898ze3.mo9190a(3, c1728p4.m8655b(list.get(0)).mo8132e(), Collections.emptyList(), this.f6646p, this.f6647q);
            return InterfaceC1739q.f7165b;
        }
        int m8716b = C1745q5.m8716b(c1728p4.m8655b(list.get(0)).mo8131d().doubleValue());
        int i10 = m8716b != 2 ? m8716b != 3 ? m8716b != 5 ? m8716b != 6 ? 3 : 2 : 5 : 1 : 4;
        String mo8132e = c1728p4.m8655b(list.get(1)).mo8132e();
        if (list.size() == 2) {
            interfaceC1898ze2 = this.f6648r.f6707p;
            interfaceC1898ze2.mo9190a(i10, mo8132e, Collections.emptyList(), this.f6646p, this.f6647q);
            return InterfaceC1739q.f7165b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(c1728p4.m8655b(list.get(i11)).mo8132e());
        }
        interfaceC1898ze = this.f6648r.f6707p;
        interfaceC1898ze.mo9190a(i10, mo8132e, arrayList, this.f6646p, this.f6647q);
        return InterfaceC1739q.f7165b;
    }
}
