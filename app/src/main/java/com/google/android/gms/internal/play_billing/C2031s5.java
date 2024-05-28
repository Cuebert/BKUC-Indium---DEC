package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.s5 */
/* loaded from: classes.dex */
final class C2031s5 {

    /* renamed from: a */
    private final Object f7797a;

    /* renamed from: b */
    private final Object f7798b;

    /* renamed from: c */
    private final Object f7799c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2031s5(Object obj, Object obj2, Object obj3) {
        this.f7797a = obj;
        this.f7798b = obj2;
        this.f7799c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException m9644a() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.f7797a) + "=" + String.valueOf(this.f7798b) + " and " + String.valueOf(this.f7797a) + "=" + String.valueOf(this.f7799c));
    }
}
