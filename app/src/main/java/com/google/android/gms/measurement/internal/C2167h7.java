package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* loaded from: classes.dex */
public final class C2167h7 extends AbstractC2203l {

    /* renamed from: e */
    final /* synthetic */ C2350y7 f8142e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2167h7(C2350y7 c2350y7, InterfaceC2176i5 interfaceC2176i5) {
        super(interfaceC2176i5);
        this.f8142e = c2350y7;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2203l
    /* renamed from: c */
    public final void mo9925c() {
        C2350y7 c2350y7 = this.f8142e;
        c2350y7.mo9917h();
        if (c2350y7.m10390z()) {
            c2350y7.f8118a.mo9765d().m10052v().m9893a("Inactivity, disconnecting from the service");
            c2350y7.m10372Q();
        }
    }
}
