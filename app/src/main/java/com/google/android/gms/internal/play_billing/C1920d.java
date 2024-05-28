package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.play_billing.d */
/* loaded from: classes.dex */
final class C1920d extends AbstractC2052v5 {

    /* renamed from: p */
    private final transient AbstractC2045u5 f7642p;

    /* renamed from: q */
    private final transient Object[] f7643q;

    /* renamed from: r */
    private final transient int f7644r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1920d(AbstractC2045u5 abstractC2045u5, Object[] objArr, int i10, int i11) {
        this.f7642p = abstractC2045u5;
        this.f7643q = objArr;
        this.f7644r = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: c */
    public final int mo9237c(Object[] objArr, int i10) {
        return mo9319k().mo9237c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7642p.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo9319k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: l */
    public final AbstractC1955i iterator() {
        return mo9319k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2052v5
    /* renamed from: p */
    final AbstractC2024r5 mo9288p() {
        return new C1913c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7644r;
    }
}
