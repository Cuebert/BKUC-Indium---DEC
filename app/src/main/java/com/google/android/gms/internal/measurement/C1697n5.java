package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.n5 */
/* loaded from: classes.dex */
final class C1697n5 extends AbstractC1634j6 {

    /* renamed from: a */
    private final Context f7095a;

    /* renamed from: b */
    private final InterfaceC1794t6<AbstractC1746q6<C1889z5>> f7096b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1697n5(Context context, InterfaceC1794t6<AbstractC1746q6<C1889z5>> interfaceC1794t6) {
        Objects.requireNonNull(context, "Null context");
        this.f7095a = context;
        this.f7096b = interfaceC1794t6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1634j6
    /* renamed from: a */
    public final Context mo8329a() {
        return this.f7095a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1634j6
    /* renamed from: b */
    public final InterfaceC1794t6<AbstractC1746q6<C1889z5>> mo8330b() {
        return this.f7096b;
    }

    public final boolean equals(Object obj) {
        InterfaceC1794t6<AbstractC1746q6<C1889z5>> interfaceC1794t6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1634j6) {
            AbstractC1634j6 abstractC1634j6 = (AbstractC1634j6) obj;
            if (this.f7095a.equals(abstractC1634j6.mo8329a()) && ((interfaceC1794t6 = this.f7096b) != null ? interfaceC1794t6.equals(abstractC1634j6.mo8330b()) : abstractC1634j6.mo8330b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7095a.hashCode() ^ 1000003) * 1000003;
        InterfaceC1794t6<AbstractC1746q6<C1889z5>> interfaceC1794t6 = this.f7096b;
        return hashCode ^ (interfaceC1794t6 == null ? 0 : interfaceC1794t6.hashCode());
    }

    public final String toString() {
        String obj = this.f7095a.toString();
        String valueOf = String.valueOf(this.f7096b);
        StringBuilder sb2 = new StringBuilder(obj.length() + 46 + valueOf.length());
        sb2.append("FlagsContext{context=");
        sb2.append(obj);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
