package p093h0;

/* renamed from: h0.h */
/* loaded from: classes.dex */
public class C3363h<E> implements Cloneable {

    /* renamed from: r */
    private static final Object f14108r = new Object();

    /* renamed from: n */
    private boolean f14109n;

    /* renamed from: o */
    private int[] f14110o;

    /* renamed from: p */
    private Object[] f14111p;

    /* renamed from: q */
    private int f14112q;

    public C3363h() {
        this(10);
    }

    /* renamed from: g */
    private void m14845g() {
        int i10 = this.f14112q;
        int[] iArr = this.f14110o;
        Object[] objArr = this.f14111p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f14108r) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f14109n = false;
        this.f14112q = i11;
    }

    /* renamed from: a */
    public void m14846a(int i10, E e10) {
        int i11 = this.f14112q;
        if (i11 != 0 && i10 <= this.f14110o[i11 - 1]) {
            m14853n(i10, e10);
            return;
        }
        if (this.f14109n && i11 >= this.f14110o.length) {
            m14845g();
        }
        int i12 = this.f14112q;
        if (i12 >= this.f14110o.length) {
            int m14799e = C3358c.m14799e(i12 + 1);
            int[] iArr = new int[m14799e];
            Object[] objArr = new Object[m14799e];
            int[] iArr2 = this.f14110o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f14111p;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f14110o = iArr;
            this.f14111p = objArr;
        }
        this.f14110o[i12] = i10;
        this.f14111p[i12] = e10;
        this.f14112q = i12 + 1;
    }

    /* renamed from: d */
    public void m14847d() {
        int i10 = this.f14112q;
        Object[] objArr = this.f14111p;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f14112q = 0;
        this.f14109n = false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3363h<E> clone() {
        try {
            C3363h<E> c3363h = (C3363h) super.clone();
            c3363h.f14110o = (int[]) this.f14110o.clone();
            c3363h.f14111p = (Object[]) this.f14111p.clone();
            return c3363h;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: h */
    public E m14849h(int i10) {
        return m14850j(i10, null);
    }

    /* renamed from: j */
    public E m14850j(int i10, E e10) {
        int m14795a = C3358c.m14795a(this.f14110o, this.f14112q, i10);
        if (m14795a >= 0) {
            Object[] objArr = this.f14111p;
            if (objArr[m14795a] != f14108r) {
                return (E) objArr[m14795a];
            }
        }
        return e10;
    }

    /* renamed from: k */
    public int m14851k(E e10) {
        if (this.f14109n) {
            m14845g();
        }
        for (int i10 = 0; i10 < this.f14112q; i10++) {
            if (this.f14111p[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public int m14852m(int i10) {
        if (this.f14109n) {
            m14845g();
        }
        return this.f14110o[i10];
    }

    /* renamed from: n */
    public void m14853n(int i10, E e10) {
        int m14795a = C3358c.m14795a(this.f14110o, this.f14112q, i10);
        if (m14795a >= 0) {
            this.f14111p[m14795a] = e10;
            return;
        }
        int i11 = ~m14795a;
        int i12 = this.f14112q;
        if (i11 < i12) {
            Object[] objArr = this.f14111p;
            if (objArr[i11] == f14108r) {
                this.f14110o[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f14109n && i12 >= this.f14110o.length) {
            m14845g();
            i11 = ~C3358c.m14795a(this.f14110o, this.f14112q, i10);
        }
        int i13 = this.f14112q;
        if (i13 >= this.f14110o.length) {
            int m14799e = C3358c.m14799e(i13 + 1);
            int[] iArr = new int[m14799e];
            Object[] objArr2 = new Object[m14799e];
            int[] iArr2 = this.f14110o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f14111p;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f14110o = iArr;
            this.f14111p = objArr2;
        }
        int i14 = this.f14112q;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f14110o;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f14111p;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f14112q - i11);
        }
        this.f14110o[i11] = i10;
        this.f14111p[i11] = e10;
        this.f14112q++;
    }

    /* renamed from: o */
    public int m14854o() {
        if (this.f14109n) {
            m14845g();
        }
        return this.f14112q;
    }

    /* renamed from: p */
    public E m14855p(int i10) {
        if (this.f14109n) {
            m14845g();
        }
        return (E) this.f14111p[i10];
    }

    public String toString() {
        if (m14854o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14112q * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14112q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m14852m(i10));
            sb2.append('=');
            E m14855p = m14855p(i10);
            if (m14855p != this) {
                sb2.append(m14855p);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C3363h(int i10) {
        this.f14109n = false;
        if (i10 == 0) {
            this.f14110o = C3358c.f14070a;
            this.f14111p = C3358c.f14072c;
        } else {
            int m14799e = C3358c.m14799e(i10);
            this.f14110o = new int[m14799e];
            this.f14111p = new Object[m14799e];
        }
    }
}
