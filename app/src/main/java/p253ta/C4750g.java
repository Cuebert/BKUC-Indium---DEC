package p253ta;

import java.io.Serializable;
import kotlin.jvm.internal.C3844i;

/* renamed from: ta.g */
/* loaded from: classes.dex */
public final class C4750g<A, B> implements Serializable {

    /* renamed from: n */
    private final A f18578n;

    /* renamed from: o */
    private final B f18579o;

    public C4750g(A a10, B b10) {
        this.f18578n = a10;
        this.f18579o = b10;
    }

    /* renamed from: a */
    public final A m18900a() {
        return this.f18578n;
    }

    /* renamed from: b */
    public final B m18901b() {
        return this.f18579o;
    }

    /* renamed from: c */
    public final A m18902c() {
        return this.f18578n;
    }

    /* renamed from: d */
    public final B m18903d() {
        return this.f18579o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4750g)) {
            return false;
        }
        C4750g c4750g = (C4750g) obj;
        return C3844i.m16248a(this.f18578n, c4750g.f18578n) && C3844i.m16248a(this.f18579o, c4750g.f18579o);
    }

    public int hashCode() {
        A a10 = this.f18578n;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f18579o;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f18578n + ", " + this.f18579o + ')';
    }
}
