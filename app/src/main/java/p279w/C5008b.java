package p279w;

import java.util.Objects;
import p279w.InterfaceC5061o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.b */
/* loaded from: classes.dex */
public final class C5008b<T> extends InterfaceC5061o0.a<T> {

    /* renamed from: a */
    private final String f19118a;

    /* renamed from: b */
    private final Class<T> f19119b;

    /* renamed from: c */
    private final Object f19120c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5008b(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f19118a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f19119b = cls;
        this.f19120c = obj;
    }

    @Override // p279w.InterfaceC5061o0.a
    /* renamed from: c */
    public String mo19483c() {
        return this.f19118a;
    }

    @Override // p279w.InterfaceC5061o0.a
    /* renamed from: d */
    public Object mo19484d() {
        return this.f19120c;
    }

    @Override // p279w.InterfaceC5061o0.a
    /* renamed from: e */
    public Class<T> mo19485e() {
        return this.f19119b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC5061o0.a)) {
            return false;
        }
        InterfaceC5061o0.a aVar = (InterfaceC5061o0.a) obj;
        if (this.f19118a.equals(aVar.mo19483c()) && this.f19119b.equals(aVar.mo19485e())) {
            Object obj2 = this.f19120c;
            if (obj2 == null) {
                if (aVar.mo19484d() == null) {
                    return true;
                }
            } else if (obj2.equals(aVar.mo19484d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f19118a.hashCode() ^ 1000003) * 1000003) ^ this.f19119b.hashCode()) * 1000003;
        Object obj = this.f19120c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f19118a + ", valueClass=" + this.f19119b + ", token=" + this.f19120c + "}";
    }
}
