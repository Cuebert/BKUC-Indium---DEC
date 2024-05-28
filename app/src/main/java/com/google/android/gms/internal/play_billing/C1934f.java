package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.f */
/* loaded from: classes.dex */
final class C1934f extends AbstractC2024r5 {

    /* renamed from: q */
    private final transient Object[] f7663q;

    /* renamed from: r */
    private final transient int f7664r;

    /* renamed from: s */
    private final transient int f7665s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1934f(Object[] objArr, int i10, int i11) {
        this.f7663q = objArr;
        this.f7664r = i10;
        this.f7665s = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C1968j5.m9470a(i10, this.f7665s, "index");
        Object obj = this.f7663q[i10 + i10 + this.f7664r];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: m */
    public final boolean mo9240m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7665s;
    }
}
