package p093h0;

/* renamed from: h0.d */
/* loaded from: classes.dex */
public class C3359d<E> implements Cloneable {

    /* renamed from: r */
    private static final Object f14073r = new Object();

    /* renamed from: n */
    private boolean f14074n;

    /* renamed from: o */
    private long[] f14075o;

    /* renamed from: p */
    private Object[] f14076p;

    /* renamed from: q */
    private int f14077q;

    public C3359d() {
        this(10);
    }

    /* renamed from: g */
    private void m14801g() {
        int i10 = this.f14077q;
        long[] jArr = this.f14075o;
        Object[] objArr = this.f14076p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f14073r) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f14074n = false;
        this.f14077q = i11;
    }

    /* renamed from: a */
    public void m14802a(long j10, E e10) {
        int i10 = this.f14077q;
        if (i10 != 0 && j10 <= this.f14075o[i10 - 1]) {
            m14809n(j10, e10);
            return;
        }
        if (this.f14074n && i10 >= this.f14075o.length) {
            m14801g();
        }
        int i11 = this.f14077q;
        if (i11 >= this.f14075o.length) {
            int m14800f = C3358c.m14800f(i11 + 1);
            long[] jArr = new long[m14800f];
            Object[] objArr = new Object[m14800f];
            long[] jArr2 = this.f14075o;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f14076p;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f14075o = jArr;
            this.f14076p = objArr;
        }
        this.f14075o[i11] = j10;
        this.f14076p[i11] = e10;
        this.f14077q = i11 + 1;
    }

    /* renamed from: d */
    public void m14803d() {
        int i10 = this.f14077q;
        Object[] objArr = this.f14076p;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f14077q = 0;
        this.f14074n = false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3359d<E> clone() {
        try {
            C3359d<E> c3359d = (C3359d) super.clone();
            c3359d.f14075o = (long[]) this.f14075o.clone();
            c3359d.f14076p = (Object[]) this.f14076p.clone();
            return c3359d;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: h */
    public E m14805h(long j10) {
        return m14806j(j10, null);
    }

    /* renamed from: j */
    public E m14806j(long j10, E e10) {
        int m14796b = C3358c.m14796b(this.f14075o, this.f14077q, j10);
        if (m14796b >= 0) {
            Object[] objArr = this.f14076p;
            if (objArr[m14796b] != f14073r) {
                return (E) objArr[m14796b];
            }
        }
        return e10;
    }

    /* renamed from: k */
    public int m14807k(long j10) {
        if (this.f14074n) {
            m14801g();
        }
        return C3358c.m14796b(this.f14075o, this.f14077q, j10);
    }

    /* renamed from: m */
    public long m14808m(int i10) {
        if (this.f14074n) {
            m14801g();
        }
        return this.f14075o[i10];
    }

    /* renamed from: n */
    public void m14809n(long j10, E e10) {
        int m14796b = C3358c.m14796b(this.f14075o, this.f14077q, j10);
        if (m14796b >= 0) {
            this.f14076p[m14796b] = e10;
            return;
        }
        int i10 = ~m14796b;
        int i11 = this.f14077q;
        if (i10 < i11) {
            Object[] objArr = this.f14076p;
            if (objArr[i10] == f14073r) {
                this.f14075o[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f14074n && i11 >= this.f14075o.length) {
            m14801g();
            i10 = ~C3358c.m14796b(this.f14075o, this.f14077q, j10);
        }
        int i12 = this.f14077q;
        if (i12 >= this.f14075o.length) {
            int m14800f = C3358c.m14800f(i12 + 1);
            long[] jArr = new long[m14800f];
            Object[] objArr2 = new Object[m14800f];
            long[] jArr2 = this.f14075o;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f14076p;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f14075o = jArr;
            this.f14076p = objArr2;
        }
        int i13 = this.f14077q;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f14075o;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f14076p;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f14077q - i10);
        }
        this.f14075o[i10] = j10;
        this.f14076p[i10] = e10;
        this.f14077q++;
    }

    /* renamed from: o */
    public void m14810o(long j10) {
        int m14796b = C3358c.m14796b(this.f14075o, this.f14077q, j10);
        if (m14796b >= 0) {
            Object[] objArr = this.f14076p;
            Object obj = objArr[m14796b];
            Object obj2 = f14073r;
            if (obj != obj2) {
                objArr[m14796b] = obj2;
                this.f14074n = true;
            }
        }
    }

    /* renamed from: p */
    public void m14811p(int i10) {
        Object[] objArr = this.f14076p;
        Object obj = objArr[i10];
        Object obj2 = f14073r;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f14074n = true;
        }
    }

    /* renamed from: q */
    public int m14812q() {
        if (this.f14074n) {
            m14801g();
        }
        return this.f14077q;
    }

    /* renamed from: r */
    public E m14813r(int i10) {
        if (this.f14074n) {
            m14801g();
        }
        return (E) this.f14076p[i10];
    }

    public String toString() {
        if (m14812q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14077q * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f14077q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m14808m(i10));
            sb2.append('=');
            E m14813r = m14813r(i10);
            if (m14813r != this) {
                sb2.append(m14813r);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C3359d(int i10) {
        this.f14074n = false;
        if (i10 == 0) {
            this.f14075o = C3358c.f14071b;
            this.f14076p = C3358c.f14072c;
        } else {
            int m14800f = C3358c.m14800f(i10);
            this.f14075o = new long[m14800f];
            this.f14076p = new Object[m14800f];
        }
    }
}
