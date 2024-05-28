package p253ta;

import gb.C3325c;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: ta.e */
/* loaded from: classes.dex */
public final class C4748e implements Comparable<C4748e> {

    /* renamed from: r */
    public static final a f18571r = new a(null);

    /* renamed from: s */
    public static final C4748e f18572s = C4749f.m18899a();

    /* renamed from: n */
    private final int f18573n;

    /* renamed from: o */
    private final int f18574o;

    /* renamed from: p */
    private final int f18575p;

    /* renamed from: q */
    private final int f18576q;

    /* renamed from: ta.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    public C4748e(int i10, int i11, int i12) {
        this.f18573n = i10;
        this.f18574o = i11;
        this.f18575p = i12;
        this.f18576q = m18897c(i10, i11, i12);
    }

    /* renamed from: c */
    private final int m18897c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new C3325c(0, 255).m14616l(i10) && new C3325c(0, 255).m14616l(i11) && new C3325c(0, 255).m14616l(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4748e other) {
        C3844i.m16253f(other, "other");
        return this.f18576q - other.f18576q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C4748e c4748e = obj instanceof C4748e ? (C4748e) obj : null;
        return c4748e != null && this.f18576q == c4748e.f18576q;
    }

    public int hashCode() {
        return this.f18576q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18573n);
        sb2.append('.');
        sb2.append(this.f18574o);
        sb2.append('.');
        sb2.append(this.f18575p);
        return sb2.toString();
    }
}
