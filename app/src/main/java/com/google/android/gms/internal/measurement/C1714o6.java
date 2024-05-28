package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o6 */
/* loaded from: classes.dex */
public final class C1714o6<T> extends AbstractC1746q6<T> {

    /* renamed from: n */
    static final C1714o6<Object> f7118n = new C1714o6<>();

    private C1714o6() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1746q6
    /* renamed from: a */
    public final T mo8638a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1746q6
    /* renamed from: b */
    public final boolean mo8639b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
