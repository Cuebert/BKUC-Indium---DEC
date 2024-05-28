package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* loaded from: classes.dex */
public final class C1510c0 implements Comparator<InterfaceC1739q> {

    /* renamed from: n */
    final /* synthetic */ AbstractC1627j f6711n;

    /* renamed from: o */
    final /* synthetic */ C1728p4 f6712o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1510c0(AbstractC1627j abstractC1627j, C1728p4 c1728p4) {
        this.f6711n = abstractC1627j;
        this.f6712o = c1728p4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(InterfaceC1739q interfaceC1739q, InterfaceC1739q interfaceC1739q2) {
        InterfaceC1739q interfaceC1739q3 = interfaceC1739q;
        InterfaceC1739q interfaceC1739q4 = interfaceC1739q2;
        AbstractC1627j abstractC1627j = this.f6711n;
        C1728p4 c1728p4 = this.f6712o;
        if (interfaceC1739q3 instanceof C1819v) {
            return !(interfaceC1739q4 instanceof C1819v) ? 1 : 0;
        }
        if (interfaceC1739q4 instanceof C1819v) {
            return -1;
        }
        if (abstractC1627j == null) {
            return interfaceC1739q3.mo8132e().compareTo(interfaceC1739q4.mo8132e());
        }
        return (int) C1745q5.m8715a(abstractC1627j.mo7931a(c1728p4, Arrays.asList(interfaceC1739q3, interfaceC1739q4)).mo8131d().doubleValue());
    }
}
