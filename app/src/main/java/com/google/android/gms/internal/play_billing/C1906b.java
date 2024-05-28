package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.b */
/* loaded from: classes.dex */
public final class C1906b extends AbstractC2024r5 {

    /* renamed from: s */
    static final AbstractC2024r5 f7629s = new C1906b(new Object[0], 0);

    /* renamed from: q */
    final transient Object[] f7630q;

    /* renamed from: r */
    private final transient int f7631r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1906b(Object[] objArr, int i10) {
        this.f7630q = objArr;
        this.f7631r = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2024r5, com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: c */
    final int mo9237c(Object[] objArr, int i10) {
        System.arraycopy(this.f7630q, 0, objArr, 0, this.f7631r);
        return this.f7631r;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: e */
    final int mo9238e() {
        return this.f7631r;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C1968j5.m9470a(i10, this.f7631r, "index");
        Object obj = this.f7630q[i10];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: i */
    public final int mo9239i() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: m */
    public final boolean mo9240m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: o */
    public final Object[] mo9241o() {
        return this.f7630q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7631r;
    }
}
