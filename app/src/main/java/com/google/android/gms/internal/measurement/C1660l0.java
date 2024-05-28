package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* loaded from: classes.dex */
public final class C1660l0 extends AbstractC1851x {
    @Override // com.google.android.gms.internal.measurement.AbstractC1851x
    /* renamed from: a */
    public final InterfaceC1739q mo7877a(String str, C1728p4 c1728p4, List<InterfaceC1739q> list) {
        if (str != null && !str.isEmpty() && c1728p4.m8661h(str)) {
            InterfaceC1739q m8657d = c1728p4.m8657d(str);
            if (m8657d instanceof AbstractC1627j) {
                return ((AbstractC1627j) m8657d).mo7931a(c1728p4, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
