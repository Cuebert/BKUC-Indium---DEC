package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.play_billing.k3 */
/* loaded from: classes.dex */
final class C1973k3 extends AbstractC1959i3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: a */
    public final /* synthetic */ int mo9390a(Object obj) {
        return ((C1966j3) obj).m9459a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: b */
    public final /* synthetic */ int mo9391b(Object obj) {
        return ((C1966j3) obj).m9460b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9392c(Object obj) {
        AbstractC1922d1 abstractC1922d1 = (AbstractC1922d1) obj;
        C1966j3 c1966j3 = abstractC1922d1.zzc;
        if (c1966j3 != C1966j3.m9455c()) {
            return c1966j3;
        }
        C1966j3 m9457f = C1966j3.m9457f();
        abstractC1922d1.zzc = m9457f;
        return m9457f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: d */
    public final /* synthetic */ Object mo9393d(Object obj) {
        return ((AbstractC1922d1) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo9394e(Object obj, Object obj2) {
        if (C1966j3.m9455c().equals(obj2)) {
            return obj;
        }
        if (C1966j3.m9455c().equals(obj)) {
            return C1966j3.m9456e((C1966j3) obj, (C1966j3) obj2);
        }
        ((C1966j3) obj).m9461d((C1966j3) obj2);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo9395f(Object obj, int i10, long j10) {
        ((C1966j3) obj).m9465j(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: g */
    public final void mo9396g(Object obj) {
        ((AbstractC1922d1) obj).zzc.m9463h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: h */
    public final /* synthetic */ void mo9397h(Object obj, Object obj2) {
        ((AbstractC1922d1) obj).zzc = (C1966j3) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1959i3
    /* renamed from: i */
    public final /* synthetic */ void mo9398i(Object obj, InterfaceC1904a4 interfaceC1904a4) throws IOException {
        ((C1966j3) obj).m9466k(interfaceC1904a4);
    }
}
