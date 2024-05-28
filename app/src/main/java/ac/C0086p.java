package ac;

/* renamed from: ac.p */
/* loaded from: classes.dex */
public final class C0086p {

    /* renamed from: a */
    final byte[] f305a;

    /* renamed from: b */
    int f306b;

    /* renamed from: c */
    int f307c;

    /* renamed from: d */
    boolean f308d;

    /* renamed from: e */
    boolean f309e;

    /* renamed from: f */
    C0086p f310f;

    /* renamed from: g */
    C0086p f311g;

    public C0086p() {
        this.f305a = new byte[8192];
        this.f309e = true;
        this.f308d = false;
    }

    /* renamed from: a */
    public final void m441a() {
        C0086p c0086p = this.f311g;
        if (c0086p != this) {
            if (c0086p.f309e) {
                int i10 = this.f307c - this.f306b;
                if (i10 > (8192 - c0086p.f307c) + (c0086p.f308d ? 0 : c0086p.f306b)) {
                    return;
                }
                m446f(c0086p, i10);
                m442b();
                C0087q.m447a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final C0086p m442b() {
        C0086p c0086p = this.f310f;
        C0086p c0086p2 = c0086p != this ? c0086p : null;
        C0086p c0086p3 = this.f311g;
        c0086p3.f310f = c0086p;
        this.f310f.f311g = c0086p3;
        this.f310f = null;
        this.f311g = null;
        return c0086p2;
    }

    /* renamed from: c */
    public final C0086p m443c(C0086p c0086p) {
        c0086p.f311g = this;
        c0086p.f310f = this.f310f;
        this.f310f.f311g = c0086p;
        this.f310f = c0086p;
        return c0086p;
    }

    /* renamed from: d */
    public final C0086p m444d() {
        this.f308d = true;
        return new C0086p(this.f305a, this.f306b, this.f307c, true, false);
    }

    /* renamed from: e */
    public final C0086p m445e(int i10) {
        C0086p m448b;
        if (i10 > 0 && i10 <= this.f307c - this.f306b) {
            if (i10 >= 1024) {
                m448b = m444d();
            } else {
                m448b = C0087q.m448b();
                System.arraycopy(this.f305a, this.f306b, m448b.f305a, 0, i10);
            }
            m448b.f307c = m448b.f306b + i10;
            this.f306b += i10;
            this.f311g.m443c(m448b);
            return m448b;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void m446f(C0086p c0086p, int i10) {
        if (c0086p.f309e) {
            int i11 = c0086p.f307c;
            if (i11 + i10 > 8192) {
                if (!c0086p.f308d) {
                    int i12 = c0086p.f306b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = c0086p.f305a;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        c0086p.f307c -= c0086p.f306b;
                        c0086p.f306b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f305a, this.f306b, c0086p.f305a, c0086p.f307c, i10);
            c0086p.f307c += i10;
            this.f306b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public C0086p(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f305a = bArr;
        this.f306b = i10;
        this.f307c = i11;
        this.f308d = z10;
        this.f309e = z11;
    }
}
