package com.google.mlkit.vision.barcode.internal;

import p087g6.C3290d;
import p113i6.C3537c;
import p127j6.C3642b;
import p127j6.C3644d;
import p283w3.C5126ab;

/* renamed from: com.google.mlkit.vision.barcode.internal.b */
/* loaded from: classes.dex */
public final class C2708b {

    /* renamed from: a */
    private final C3644d f10303a;

    /* renamed from: b */
    private final C3290d f10304b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2708b(C3644d c3644d, C3290d c3290d) {
        this.f10303a = c3644d;
        this.f10304b = c3290d;
    }

    /* renamed from: a */
    public final BarcodeScannerImpl m12084a(C3537c c3537c) {
        return new BarcodeScannerImpl(c3537c, this.f10303a.m14551b(c3537c), this.f10304b.m14549a(c3537c.m15338b()), C5126ab.m19754b(C3642b.m15552d()));
    }
}
