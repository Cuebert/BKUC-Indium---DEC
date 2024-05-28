package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.q5 */
/* loaded from: classes.dex */
public final class C2017q5 extends AbstractC2024r5 {

    /* renamed from: q */
    final transient int f7774q;

    /* renamed from: r */
    final transient int f7775r;

    /* renamed from: s */
    final /* synthetic */ AbstractC2024r5 f7776s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2017q5(AbstractC2024r5 abstractC2024r5, int i10, int i11) {
        this.f7776s = abstractC2024r5;
        this.f7774q = i10;
        this.f7775r = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: e */
    final int mo9238e() {
        return this.f7776s.mo9239i() + this.f7774q + this.f7775r;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C1968j5.m9470a(i10, this.f7775r, "index");
        return this.f7776s.get(i10 + this.f7774q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: i */
    public final int mo9239i() {
        return this.f7776s.mo9239i() + this.f7774q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: m */
    public final boolean mo9240m() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: o */
    public final Object[] mo9241o() {
        return this.f7776s.mo9241o();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2024r5
    /* renamed from: p */
    public final AbstractC2024r5 subList(int i10, int i11) {
        C1968j5.m9473d(i10, i11, this.f7775r);
        AbstractC2024r5 abstractC2024r5 = this.f7776s;
        int i12 = this.f7774q;
        return abstractC2024r5.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7775r;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2024r5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
