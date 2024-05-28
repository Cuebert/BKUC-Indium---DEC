package gb;

import kotlin.jvm.internal.C3840e;
import p316ya.C5927c;
import ua.AbstractC4908z;

/* renamed from: gb.a */
/* loaded from: classes.dex */
public class C3323a implements Iterable<Integer> {

    /* renamed from: q */
    public static final a f13825q = new a(null);

    /* renamed from: n */
    private final int f13826n;

    /* renamed from: o */
    private final int f13827o;

    /* renamed from: p */
    private final int f13828p;

    /* renamed from: gb.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }

        /* renamed from: a */
        public final C3323a m14614a(int i10, int i11, int i12) {
            return new C3323a(i10, i11, i12);
        }
    }

    public C3323a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f13826n = i10;
            this.f13827o = C5927c.m21090b(i10, i11, i12);
            this.f13828p = i12;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    /* renamed from: c */
    public final int m14610c() {
        return this.f13826n;
    }

    /* renamed from: e */
    public final int m14611e() {
        return this.f13827o;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3323a) {
            if (!isEmpty() || !((C3323a) obj).isEmpty()) {
                C3323a c3323a = (C3323a) obj;
                if (this.f13826n != c3323a.f13826n || this.f13827o != c3323a.f13827o || this.f13828p != c3323a.f13828p) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f13826n * 31) + this.f13827o) * 31) + this.f13828p;
    }

    /* renamed from: i */
    public final int m14612i() {
        return this.f13828p;
    }

    public boolean isEmpty() {
        if (this.f13828p > 0) {
            if (this.f13826n > this.f13827o) {
                return true;
            }
        } else if (this.f13826n < this.f13827o) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: k */
    public AbstractC4908z iterator() {
        return new C3324b(this.f13826n, this.f13827o, this.f13828p);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f13828p > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f13826n);
            sb2.append("..");
            sb2.append(this.f13827o);
            sb2.append(" step ");
            i10 = this.f13828p;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f13826n);
            sb2.append(" downTo ");
            sb2.append(this.f13827o);
            sb2.append(" step ");
            i10 = -this.f13828p;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
