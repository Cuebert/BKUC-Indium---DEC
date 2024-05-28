package p307y1;

import java.util.Objects;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public final class C5593b {

    /* renamed from: a */
    private final String f20767a;

    private C5593b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f20767a = str;
    }

    /* renamed from: b */
    public static C5593b m20616b(String str) {
        return new C5593b(str);
    }

    /* renamed from: a */
    public String m20617a() {
        return this.f20767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5593b) {
            return this.f20767a.equals(((C5593b) obj).f20767a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20767a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f20767a + "\"}";
    }
}
