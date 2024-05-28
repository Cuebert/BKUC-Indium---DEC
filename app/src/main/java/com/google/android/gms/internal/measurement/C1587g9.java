package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g9 */
/* loaded from: classes.dex */
final class C1587g9 extends AbstractC1604h9 {
    public /* synthetic */ C1587g9(C1553e9 c1553e9) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1604h9
    /* renamed from: a */
    public final void mo8156a(Object obj, long j10) {
        ((InterfaceC1844w8) C1555eb.m8110k(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1604h9
    /* renamed from: b */
    public final <E> void mo8157b(Object obj, Object obj2, long j10) {
        InterfaceC1844w8 interfaceC1844w8 = (InterfaceC1844w8) C1555eb.m8110k(obj, j10);
        InterfaceC1844w8 interfaceC1844w82 = (InterfaceC1844w8) C1555eb.m8110k(obj2, j10);
        int size = interfaceC1844w8.size();
        int size2 = interfaceC1844w82.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC1844w8.mo7888a()) {
                interfaceC1844w8 = interfaceC1844w8.mo8008g(size2 + size);
            }
            interfaceC1844w8.addAll(interfaceC1844w82);
        }
        if (size > 0) {
            interfaceC1844w82 = interfaceC1844w8;
        }
        C1555eb.m8123x(obj, j10, interfaceC1844w82);
    }
}
