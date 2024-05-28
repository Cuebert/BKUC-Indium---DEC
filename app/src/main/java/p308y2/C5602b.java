package p308y2;

import p295x2.C5506a;
import p295x2.C5506a.d;
import p321z2.C5980h;

/* renamed from: y2.b */
/* loaded from: classes.dex */
public final class C5602b<O extends C5506a.d> {

    /* renamed from: a */
    private final int f20773a;

    /* renamed from: b */
    private final C5506a<O> f20774b;

    /* renamed from: c */
    private final O f20775c;

    /* renamed from: d */
    private final String f20776d;

    private C5602b(C5506a<O> c5506a, O o10, String str) {
        this.f20774b = c5506a;
        this.f20775c = o10;
        this.f20776d = str;
        this.f20773a = C5980h.m21270c(c5506a, o10, str);
    }

    /* renamed from: a */
    public static <O extends C5506a.d> C5602b<O> m20621a(C5506a<O> c5506a, O o10, String str) {
        return new C5602b<>(c5506a, o10, str);
    }

    /* renamed from: b */
    public final String m20622b() {
        return this.f20774b.m20245c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5602b)) {
            return false;
        }
        C5602b c5602b = (C5602b) obj;
        return C5980h.m21269b(this.f20774b, c5602b.f20774b) && C5980h.m21269b(this.f20775c, c5602b.f20775c) && C5980h.m21269b(this.f20776d, c5602b.f20776d);
    }

    public final int hashCode() {
        return this.f20773a;
    }
}
