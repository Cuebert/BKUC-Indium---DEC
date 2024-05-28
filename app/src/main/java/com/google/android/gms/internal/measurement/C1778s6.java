package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s6 */
/* loaded from: classes.dex */
public final class C1778s6<T> extends AbstractC1746q6<T> {

    /* renamed from: n */
    private final T f7230n;

    public C1778s6(T t10) {
        this.f7230n = t10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1746q6
    /* renamed from: a */
    public final T mo8638a() {
        return this.f7230n;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1746q6
    /* renamed from: b */
    public final boolean mo8639b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1778s6) {
            return this.f7230n.equals(((C1778s6) obj).f7230n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7230n.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f7230n.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
