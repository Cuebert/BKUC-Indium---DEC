package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b8 */
/* loaded from: classes.dex */
final class C1501b8 {

    /* renamed from: a */
    private final Object f6662a;

    /* renamed from: b */
    private final int f6663b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1501b8(Object obj, int i10) {
        this.f6662a = obj;
        this.f6663b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1501b8)) {
            return false;
        }
        C1501b8 c1501b8 = (C1501b8) obj;
        return this.f6662a == c1501b8.f6662a && this.f6663b == c1501b8.f6663b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6662a) * 65535) + this.f6663b;
    }
}
