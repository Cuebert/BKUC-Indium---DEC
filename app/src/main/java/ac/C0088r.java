package ac;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ac.r */
/* loaded from: classes.dex */
public final class C0088r extends C0076f {

    /* renamed from: s */
    final transient byte[][] f314s;

    /* renamed from: t */
    final transient int[] f315t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0088r(C0073c c0073c, int i10) {
        super(null);
        C0092v.m453b(c0073c.f270o, 0L, i10);
        C0086p c0086p = c0073c.f269n;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = c0086p.f307c;
            int i15 = c0086p.f306b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                c0086p = c0086p.f310f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f314s = new byte[i13];
        this.f315t = new int[i13 * 2];
        C0086p c0086p2 = c0073c.f269n;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f314s;
            bArr[i16] = c0086p2.f305a;
            int i17 = c0086p2.f307c;
            int i18 = c0086p2.f306b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f315t;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            c0086p2.f308d = true;
            i16++;
            c0086p2 = c0086p2.f310f;
        }
    }

    /* renamed from: y */
    private int m449y(int i10) {
        int binarySearch = Arrays.binarySearch(this.f315t, 0, this.f314s.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: z */
    private C0076f m450z() {
        return new C0076f(mo403v());
    }

    @Override // ac.C0076f
    /* renamed from: b */
    public String mo390b() {
        return m450z().mo390b();
    }

    @Override // ac.C0076f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0076f) {
            C0076f c0076f = (C0076f) obj;
            if (c0076f.mo399r() == mo399r() && mo395n(0, c0076f, 0, mo399r())) {
                return true;
            }
        }
        return false;
    }

    @Override // ac.C0076f
    public int hashCode() {
        int i10 = this.f276o;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f314s.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            byte[] bArr = this.f314s[i11];
            int[] iArr = this.f315t;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f276o = i13;
        return i13;
    }

    @Override // ac.C0076f
    /* renamed from: j */
    public byte mo392j(int i10) {
        C0092v.m453b(this.f315t[this.f314s.length - 1], i10, 1L);
        int m449y = m449y(i10);
        int i11 = m449y == 0 ? 0 : this.f315t[m449y - 1];
        int[] iArr = this.f315t;
        byte[][] bArr = this.f314s;
        return bArr[m449y][(i10 - i11) + iArr[bArr.length + m449y]];
    }

    @Override // ac.C0076f
    /* renamed from: k */
    public String mo393k() {
        return m450z().mo393k();
    }

    @Override // ac.C0076f
    /* renamed from: l */
    public C0076f mo394l() {
        return m450z().mo394l();
    }

    @Override // ac.C0076f
    /* renamed from: n */
    public boolean mo395n(int i10, C0076f c0076f, int i11, int i12) {
        if (i10 < 0 || i10 > mo399r() - i12) {
            return false;
        }
        int m449y = m449y(i10);
        while (i12 > 0) {
            int i13 = m449y == 0 ? 0 : this.f315t[m449y - 1];
            int min = Math.min(i12, ((this.f315t[m449y] - i13) + i13) - i10);
            int[] iArr = this.f315t;
            byte[][] bArr = this.f314s;
            if (!c0076f.mo396o(i11, bArr[m449y], (i10 - i13) + iArr[bArr.length + m449y], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            m449y++;
        }
        return true;
    }

    @Override // ac.C0076f
    /* renamed from: o */
    public boolean mo396o(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > mo399r() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int m449y = m449y(i10);
        while (i12 > 0) {
            int i13 = m449y == 0 ? 0 : this.f315t[m449y - 1];
            int min = Math.min(i12, ((this.f315t[m449y] - i13) + i13) - i10);
            int[] iArr = this.f315t;
            byte[][] bArr2 = this.f314s;
            if (!C0092v.m452a(bArr2[m449y], (i10 - i13) + iArr[bArr2.length + m449y], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            m449y++;
        }
        return true;
    }

    @Override // ac.C0076f
    /* renamed from: p */
    public C0076f mo397p() {
        return m450z().mo397p();
    }

    @Override // ac.C0076f
    /* renamed from: q */
    public C0076f mo398q() {
        return m450z().mo398q();
    }

    @Override // ac.C0076f
    /* renamed from: r */
    public int mo399r() {
        return this.f315t[this.f314s.length - 1];
    }

    @Override // ac.C0076f
    /* renamed from: t */
    public C0076f mo401t(int i10, int i11) {
        return m450z().mo401t(i10, i11);
    }

    @Override // ac.C0076f
    public String toString() {
        return m450z().toString();
    }

    @Override // ac.C0076f
    /* renamed from: u */
    public C0076f mo402u() {
        return m450z().mo402u();
    }

    @Override // ac.C0076f
    /* renamed from: v */
    public byte[] mo403v() {
        int[] iArr = this.f315t;
        byte[][] bArr = this.f314s;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f315t;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f314s[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // ac.C0076f
    /* renamed from: w */
    public String mo404w() {
        return m450z().mo404w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ac.C0076f
    /* renamed from: x */
    public void mo405x(C0073c c0073c) {
        int length = this.f314s.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f315t;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            C0086p c0086p = new C0086p(this.f314s[i10], i12, (i12 + i13) - i11, true, false);
            C0086p c0086p2 = c0073c.f269n;
            if (c0086p2 == null) {
                c0086p.f311g = c0086p;
                c0086p.f310f = c0086p;
                c0073c.f269n = c0086p;
            } else {
                c0086p2.f311g.m443c(c0086p);
            }
            i10++;
            i11 = i13;
        }
        c0073c.f270o += i11;
    }
}
