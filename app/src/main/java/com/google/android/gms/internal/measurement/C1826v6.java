package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
/* loaded from: classes.dex */
final class C1826v6<T> implements InterfaceC1794t6<T> {

    /* renamed from: n */
    volatile InterfaceC1794t6<T> f7260n;

    /* renamed from: o */
    volatile boolean f7261o;

    /* renamed from: p */
    T f7262p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1826v6(InterfaceC1794t6<T> interfaceC1794t6) {
        Objects.requireNonNull(interfaceC1794t6);
        this.f7260n = interfaceC1794t6;
    }

    public final String toString() {
        Object obj = this.f7260n;
        if (obj == null) {
            String valueOf = String.valueOf(this.f7262p);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb3 = new StringBuilder(obj2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(obj2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1794t6
    public final T zza() {
        if (!this.f7261o) {
            synchronized (this) {
                if (!this.f7261o) {
                    InterfaceC1794t6<T> interfaceC1794t6 = this.f7260n;
                    interfaceC1794t6.getClass();
                    T zza = interfaceC1794t6.zza();
                    this.f7262p = zza;
                    this.f7261o = true;
                    this.f7260n = null;
                    return zza;
                }
            }
        }
        return this.f7262p;
    }
}
