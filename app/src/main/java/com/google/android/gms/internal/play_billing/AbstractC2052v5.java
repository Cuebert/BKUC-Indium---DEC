package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.v5 */
/* loaded from: classes.dex */
public abstract class AbstractC2052v5 extends AbstractC2003o5 implements Set {

    /* renamed from: o */
    private transient AbstractC2024r5 f7873o;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C1948h.m9357a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2003o5
    /* renamed from: k */
    public AbstractC2024r5 mo9319k() {
        AbstractC2024r5 abstractC2024r5 = this.f7873o;
        if (abstractC2024r5 != null) {
            return abstractC2024r5;
        }
        AbstractC2024r5 mo9288p = mo9288p();
        this.f7873o = mo9288p;
        return mo9288p;
    }

    /* renamed from: p */
    AbstractC2024r5 mo9288p() {
        Object[] array = toArray();
        int i10 = AbstractC2024r5.f7779p;
        return AbstractC2024r5.m9558q(array, array.length);
    }
}
