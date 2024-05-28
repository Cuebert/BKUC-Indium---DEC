package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.p5 */
/* loaded from: classes.dex */
public final class C2010p5 extends AbstractC1982l5 {

    /* renamed from: p */
    private final AbstractC2024r5 f7770p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2010p5(AbstractC2024r5 abstractC2024r5, int i10) {
        super(abstractC2024r5.size(), i10);
        this.f7770p = abstractC2024r5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1982l5
    /* renamed from: a */
    protected final Object mo9498a(int i10) {
        return this.f7770p.get(i10);
    }
}
