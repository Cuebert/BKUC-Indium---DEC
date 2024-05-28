package p016b2;

import android.content.Context;
import java.util.Objects;
import p136k2.InterfaceC3749a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b2.c */
/* loaded from: classes.dex */
public final class C0971c extends AbstractC0976h {

    /* renamed from: a */
    private final Context f5146a;

    /* renamed from: b */
    private final InterfaceC3749a f5147b;

    /* renamed from: c */
    private final InterfaceC3749a f5148c;

    /* renamed from: d */
    private final String f5149d;

    public C0971c(Context context, InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f5146a = context;
        Objects.requireNonNull(interfaceC3749a, "Null wallClock");
        this.f5147b = interfaceC3749a;
        Objects.requireNonNull(interfaceC3749a2, "Null monotonicClock");
        this.f5148c = interfaceC3749a2;
        Objects.requireNonNull(str, "Null backendName");
        this.f5149d = str;
    }

    @Override // p016b2.AbstractC0976h
    /* renamed from: b */
    public Context mo6153b() {
        return this.f5146a;
    }

    @Override // p016b2.AbstractC0976h
    /* renamed from: c */
    public String mo6154c() {
        return this.f5149d;
    }

    @Override // p016b2.AbstractC0976h
    /* renamed from: d */
    public InterfaceC3749a mo6155d() {
        return this.f5148c;
    }

    @Override // p016b2.AbstractC0976h
    /* renamed from: e */
    public InterfaceC3749a mo6156e() {
        return this.f5147b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0976h)) {
            return false;
        }
        AbstractC0976h abstractC0976h = (AbstractC0976h) obj;
        return this.f5146a.equals(abstractC0976h.mo6153b()) && this.f5147b.equals(abstractC0976h.mo6156e()) && this.f5148c.equals(abstractC0976h.mo6155d()) && this.f5149d.equals(abstractC0976h.mo6154c());
    }

    public int hashCode() {
        return ((((((this.f5146a.hashCode() ^ 1000003) * 1000003) ^ this.f5147b.hashCode()) * 1000003) ^ this.f5148c.hashCode()) * 1000003) ^ this.f5149d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5146a + ", wallClock=" + this.f5147b + ", monotonicClock=" + this.f5148c + ", backendName=" + this.f5149d + "}";
    }
}
