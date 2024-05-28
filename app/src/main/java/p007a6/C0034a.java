package p007a6;

import java.util.Objects;

/* renamed from: a6.a */
/* loaded from: classes.dex */
public final class C0034a extends AbstractC0039f {

    /* renamed from: a */
    private final String f187a;

    /* renamed from: b */
    private final String f188b;

    public C0034a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f187a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f188b = str2;
    }

    @Override // p007a6.AbstractC0039f
    /* renamed from: b */
    public String mo228b() {
        return this.f187a;
    }

    @Override // p007a6.AbstractC0039f
    /* renamed from: c */
    public String mo229c() {
        return this.f188b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0039f)) {
            return false;
        }
        AbstractC0039f abstractC0039f = (AbstractC0039f) obj;
        return this.f187a.equals(abstractC0039f.mo228b()) && this.f188b.equals(abstractC0039f.mo229c());
    }

    public int hashCode() {
        return ((this.f187a.hashCode() ^ 1000003) * 1000003) ^ this.f188b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f187a + ", version=" + this.f188b + "}";
    }
}
