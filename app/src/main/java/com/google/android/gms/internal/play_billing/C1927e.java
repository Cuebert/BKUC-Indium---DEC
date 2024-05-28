package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.e */
/* loaded from: classes.dex */
final class C1927e extends AbstractC2052v5 {

    /* renamed from: p */
    private final transient AbstractC2045u5 f7645p;

    /* renamed from: q */
    private final transient AbstractC2024r5 f7646q;

    public C1927e(AbstractC2045u5 abstractC2045u5, AbstractC2024r5 abstractC2024r5) {
        this.f7645p = abstractC2045u5;
        this.f7646q = abstractC2024r5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: c */
    public final int mo9237c(Object[] objArr, int i10) {
        return this.f7646q.mo9237c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7645p.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f7646q.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2052v5, com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: k */
    public final AbstractC2024r5 mo9319k() {
        return this.f7646q;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: l */
    public final AbstractC1955i iterator() {
        return this.f7646q.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7645p.size();
    }
}
