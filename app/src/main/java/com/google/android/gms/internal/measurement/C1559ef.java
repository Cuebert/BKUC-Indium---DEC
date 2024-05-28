package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ef */
/* loaded from: classes.dex */
public final class C1559ef extends AbstractC1627j {

    /* renamed from: p */
    private final C1779s7 f6783p;

    /* renamed from: q */
    final Map<String, AbstractC1627j> f6784q;

    public C1559ef(C1779s7 c1779s7) {
        super("require");
        this.f6784q = new HashMap();
        this.f6783p = c1779s7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1627j
    /* renamed from: a */
    public final InterfaceC1739q mo7931a(C1728p4 c1728p4, List<InterfaceC1739q> list) {
        AbstractC1627j abstractC1627j;
        C1745q5.m8722h("require", 1, list);
        String mo8132e = c1728p4.m8655b(list.get(0)).mo8132e();
        if (this.f6784q.containsKey(mo8132e)) {
            return this.f6784q.get(mo8132e);
        }
        C1779s7 c1779s7 = this.f6783p;
        if (c1779s7.f7231a.containsKey(mo8132e)) {
            try {
                abstractC1627j = c1779s7.f7231a.get(mo8132e).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(mo8132e);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            abstractC1627j = InterfaceC1739q.f7165b;
        }
        if (abstractC1627j instanceof AbstractC1627j) {
            this.f6784q.put(mo8132e, (AbstractC1627j) abstractC1627j);
        }
        return abstractC1627j;
    }
}
