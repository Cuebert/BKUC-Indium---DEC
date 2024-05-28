package androidx.camera.core;

import androidx.camera.core.AbstractC0473t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.g */
/* loaded from: classes.dex */
public final class C0409g extends AbstractC0473t.a {

    /* renamed from: a */
    private final int f1883a;

    /* renamed from: b */
    private final Throwable f1884b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0409g(int i10, Throwable th) {
        this.f1883a = i10;
        this.f1884b = th;
    }

    @Override // androidx.camera.core.AbstractC0473t.a
    /* renamed from: c */
    public Throwable mo2010c() {
        return this.f1884b;
    }

    @Override // androidx.camera.core.AbstractC0473t.a
    /* renamed from: d */
    public int mo2011d() {
        return this.f1883a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0473t.a)) {
            return false;
        }
        AbstractC0473t.a aVar = (AbstractC0473t.a) obj;
        if (this.f1883a == aVar.mo2011d()) {
            Throwable th = this.f1884b;
            if (th == null) {
                if (aVar.mo2010c() == null) {
                    return true;
                }
            } else if (th.equals(aVar.mo2010c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f1883a ^ 1000003) * 1000003;
        Throwable th = this.f1884b;
        return i10 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f1883a + ", cause=" + this.f1884b + "}";
    }
}
