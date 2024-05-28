package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
/* loaded from: classes.dex */
final class C1810u6<T> implements Serializable, InterfaceC1794t6 {

    /* renamed from: n */
    final InterfaceC1794t6<T> f7253n;

    /* renamed from: o */
    volatile transient boolean f7254o;

    /* renamed from: p */
    transient T f7255p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1810u6(InterfaceC1794t6<T> interfaceC1794t6) {
        Objects.requireNonNull(interfaceC1794t6);
        this.f7253n = interfaceC1794t6;
    }

    public final String toString() {
        Object obj;
        if (this.f7254o) {
            String valueOf = String.valueOf(this.f7255p);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f7253n;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1794t6
    public final T zza() {
        if (!this.f7254o) {
            synchronized (this) {
                if (!this.f7254o) {
                    T zza = this.f7253n.zza();
                    this.f7255p = zza;
                    this.f7254o = true;
                    return zza;
                }
            }
        }
        return this.f7255p;
    }
}
