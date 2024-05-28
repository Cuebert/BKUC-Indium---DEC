package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* loaded from: classes.dex */
public final class C2321v8 implements InterfaceC2196k3 {

    /* renamed from: a */
    final /* synthetic */ String f8616a;

    /* renamed from: b */
    final /* synthetic */ C2103b9 f8617b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2321v8(C2103b9 c2103b9, String str) {
        this.f8617b = c2103b9;
        this.f8616a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2196k3
    /* renamed from: a */
    public final void mo10065a(String str, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f8617b.m9782o(i10, th, bArr, this.f8616a);
    }
}
