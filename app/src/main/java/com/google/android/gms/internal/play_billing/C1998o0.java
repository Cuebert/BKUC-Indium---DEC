package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.o0 */
/* loaded from: classes.dex */
final class C1998o0 {

    /* renamed from: a */
    private final Object f7755a;

    /* renamed from: b */
    private final int f7756b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1998o0(Object obj, int i10) {
        this.f7755a = obj;
        this.f7756b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1998o0)) {
            return false;
        }
        C1998o0 c1998o0 = (C1998o0) obj;
        return this.f7755a == c1998o0.f7755a && this.f7756b == c1998o0.f7756b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7755a) * 65535) + this.f7756b;
    }
}
