package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.w6 */
/* loaded from: classes.dex */
final class C1842w6<T> implements Serializable, InterfaceC1794t6 {

    /* renamed from: n */
    final T f7281n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1842w6(T t10) {
        this.f7281n = t10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1842w6)) {
            return false;
        }
        T t10 = this.f7281n;
        T t11 = ((C1842w6) obj).f7281n;
        return t10 == t11 || t10.equals(t11);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7281n});
    }

    public final String toString() {
        String obj = this.f7281n.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1794t6
    public final T zza() {
        return this.f7281n;
    }
}
