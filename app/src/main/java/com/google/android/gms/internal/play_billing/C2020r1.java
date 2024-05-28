package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.r1 */
/* loaded from: classes.dex */
final class C2020r1 extends AbstractC2034t1 {
    public /* synthetic */ C2020r1(C2013q1 c2013q1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2034t1
    /* renamed from: a */
    public final void mo9539a(Object obj, long j10) {
        ((InterfaceC1943g1) C2029s3.m9627k(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2034t1
    /* renamed from: b */
    public final void mo9540b(Object obj, Object obj2, long j10) {
        InterfaceC1943g1 interfaceC1943g1 = (InterfaceC1943g1) C2029s3.m9627k(obj, j10);
        InterfaceC1943g1 interfaceC1943g12 = (InterfaceC1943g1) C2029s3.m9627k(obj2, j10);
        int size = interfaceC1943g1.size();
        int size2 = interfaceC1943g12.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC1943g1.mo9351a()) {
                interfaceC1943g1 = interfaceC1943g1.mo9324g(size2 + size);
            }
            interfaceC1943g1.addAll(interfaceC1943g12);
        }
        if (size > 0) {
            interfaceC1943g12 = interfaceC1943g1;
        }
        C2029s3.m9640x(obj, j10, interfaceC1943g12);
    }
}
