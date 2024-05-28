package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* loaded from: classes.dex */
public final class C1580g2 extends AbstractRunnableC1614i2 {

    /* renamed from: r */
    final /* synthetic */ Long f6800r;

    /* renamed from: s */
    final /* synthetic */ String f6801s;

    /* renamed from: t */
    final /* synthetic */ String f6802t;

    /* renamed from: u */
    final /* synthetic */ Bundle f6803u;

    /* renamed from: v */
    final /* synthetic */ boolean f6804v;

    /* renamed from: w */
    final /* synthetic */ boolean f6805w;

    /* renamed from: x */
    final /* synthetic */ C1774s2 f6806x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580g2(C1774s2 c1774s2, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c1774s2, true);
        this.f6806x = c1774s2;
        this.f6800r = l10;
        this.f6801s = str;
        this.f6802t = str2;
        this.f6803u = bundle;
        this.f6804v = z10;
        this.f6805w = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1614i2
    /* renamed from: a */
    final void mo7878a() throws RemoteException {
        InterfaceC1562f1 interfaceC1562f1;
        Long l10 = this.f6800r;
        long longValue = l10 == null ? this.f6839n : l10.longValue();
        interfaceC1562f1 = this.f6806x.f7229i;
        ((InterfaceC1562f1) C5984j.m21286j(interfaceC1562f1)).logEvent(this.f6801s, this.f6802t, this.f6803u, this.f6804v, this.f6805w, longValue);
    }
}
