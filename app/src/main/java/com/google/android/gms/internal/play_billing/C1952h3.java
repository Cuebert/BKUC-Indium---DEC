package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h3 */
/* loaded from: classes.dex */
public final class C1952h3 extends RuntimeException {
    public C1952h3(InterfaceC1944g2 interfaceC1944g2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final C1964j1 m9381a() {
        return new C1964j1(getMessage());
    }
}
