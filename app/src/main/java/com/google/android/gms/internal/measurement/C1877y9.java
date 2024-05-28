package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
/* loaded from: classes.dex */
final class C1877y9<T> implements InterfaceC1571fa<T> {

    /* renamed from: a */
    private final InterfaceC1813u9 f7331a;

    /* renamed from: b */
    private final AbstractC1814ua<?, ?> f7332b;

    /* renamed from: c */
    private final boolean f7333c;

    /* renamed from: d */
    private final AbstractC1535d8<?> f7334d;

    private C1877y9(AbstractC1814ua<?, ?> abstractC1814ua, AbstractC1535d8<?> abstractC1535d8, InterfaceC1813u9 interfaceC1813u9) {
        this.f7332b = abstractC1814ua;
        this.f7333c = abstractC1535d8.mo8056c(interfaceC1813u9);
        this.f7334d = abstractC1535d8;
        this.f7331a = interfaceC1813u9;
    }

    /* renamed from: j */
    public static <T> C1877y9<T> m9106j(AbstractC1814ua<?, ?> abstractC1814ua, AbstractC1535d8<?> abstractC1535d8, InterfaceC1813u9 interfaceC1813u9) {
        return new C1877y9<>(abstractC1814ua, abstractC1535d8, interfaceC1813u9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: a */
    public final void mo8158a(T t10) {
        this.f7332b.mo8871g(t10);
        this.f7334d.mo8055b(t10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: b */
    public final T mo8159b() {
        return (T) this.f7331a.mo8681j().mo8461T();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: c */
    public final int mo8160c(T t10) {
        AbstractC1814ua<?, ?> abstractC1814ua = this.f7332b;
        int mo8866b = abstractC1814ua.mo8866b(abstractC1814ua.mo8867c(t10));
        if (!this.f7333c) {
            return mo8866b;
        }
        this.f7334d.mo8054a(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: d */
    public final void mo8161d(T t10, T t11) {
        C1605ha.m8270f(this.f7332b, t10, t11);
        if (this.f7333c) {
            C1605ha.m8269e(this.f7334d, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: e */
    public final int mo8162e(T t10) {
        int hashCode = this.f7332b.mo8867c(t10).hashCode();
        if (!this.f7333c) {
            return hashCode;
        }
        this.f7334d.mo8054a(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: f */
    public final boolean mo8163f(T t10) {
        this.f7334d.mo8054a(t10);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: g */
    public final void mo8164g(T t10, byte[] bArr, int i10, int i11, C1517c7 c1517c7) throws IOException {
        AbstractC1732p8 abstractC1732p8 = (AbstractC1732p8) t10;
        if (abstractC1732p8.zzc == C1830va.m8915c()) {
            abstractC1732p8.zzc = C1830va.m8917e();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: h */
    public final boolean mo8165h(T t10, T t11) {
        if (!this.f7332b.mo8867c(t10).equals(this.f7332b.mo8867c(t11))) {
            return false;
        }
        if (!this.f7333c) {
            return true;
        }
        this.f7334d.mo8054a(t10);
        this.f7334d.mo8054a(t11);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: i */
    public final void mo8166i(T t10, C1875y7 c1875y7) throws IOException {
        this.f7334d.mo8054a(t10);
        throw null;
    }
}
