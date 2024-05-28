package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import p018b4.C0992f;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* loaded from: classes.dex */
final class RunnableC2207l3 implements Runnable {

    /* renamed from: n */
    private final InterfaceC2196k3 f8260n;

    /* renamed from: o */
    private final int f8261o;

    /* renamed from: p */
    private final Throwable f8262p;

    /* renamed from: q */
    private final byte[] f8263q;

    /* renamed from: r */
    private final String f8264r;

    /* renamed from: s */
    private final Map<String, List<String>> f8265s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC2207l3(String str, InterfaceC2196k3 interfaceC2196k3, int i10, Throwable th, byte[] bArr, Map map, C0992f c0992f) {
        C5984j.m21286j(interfaceC2196k3);
        this.f8260n = interfaceC2196k3;
        this.f8261o = i10;
        this.f8262p = th;
        this.f8263q = bArr;
        this.f8264r = str;
        this.f8265s = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8260n.mo10065a(this.f8264r, this.f8261o, this.f8262p, this.f8263q, this.f8265s);
    }
}
