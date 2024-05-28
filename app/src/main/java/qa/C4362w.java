package qa;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import qa.C4359t;

/* renamed from: qa.w */
/* loaded from: classes.dex */
public final class C4362w {

    /* renamed from: s */
    private static final long f17785s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f17786a;

    /* renamed from: b */
    long f17787b;

    /* renamed from: c */
    int f17788c;

    /* renamed from: d */
    public final Uri f17789d;

    /* renamed from: e */
    public final int f17790e;

    /* renamed from: f */
    public final String f17791f;

    /* renamed from: g */
    public final List<InterfaceC4342e0> f17792g;

    /* renamed from: h */
    public final int f17793h;

    /* renamed from: i */
    public final int f17794i;

    /* renamed from: j */
    public final boolean f17795j;

    /* renamed from: k */
    public final boolean f17796k;

    /* renamed from: l */
    public final boolean f17797l;

    /* renamed from: m */
    public final float f17798m;

    /* renamed from: n */
    public final float f17799n;

    /* renamed from: o */
    public final float f17800o;

    /* renamed from: p */
    public final boolean f17801p;

    /* renamed from: q */
    public final Bitmap.Config f17802q;

    /* renamed from: r */
    public final C4359t.f f17803r;

    /* renamed from: qa.w$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private Uri f17804a;

        /* renamed from: b */
        private int f17805b;

        /* renamed from: c */
        private String f17806c;

        /* renamed from: d */
        private int f17807d;

        /* renamed from: e */
        private int f17808e;

        /* renamed from: f */
        private boolean f17809f;

        /* renamed from: g */
        private boolean f17810g;

        /* renamed from: h */
        private boolean f17811h;

        /* renamed from: i */
        private float f17812i;

        /* renamed from: j */
        private float f17813j;

        /* renamed from: k */
        private float f17814k;

        /* renamed from: l */
        private boolean f17815l;

        /* renamed from: m */
        private List<InterfaceC4342e0> f17816m;

        /* renamed from: n */
        private Bitmap.Config f17817n;

        /* renamed from: o */
        private C4359t.f f17818o;

        public b(Uri uri, int i10, Bitmap.Config config) {
            this.f17804a = uri;
            this.f17805b = i10;
            this.f17817n = config;
        }

        /* renamed from: a */
        public C4362w m18035a() {
            boolean z10 = this.f17810g;
            if (z10 && this.f17809f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f17809f && this.f17807d == 0 && this.f17808e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z10 && this.f17807d == 0 && this.f17808e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f17818o == null) {
                this.f17818o = C4359t.f.NORMAL;
            }
            return new C4362w(this.f17804a, this.f17805b, this.f17806c, this.f17816m, this.f17807d, this.f17808e, this.f17809f, this.f17810g, this.f17811h, this.f17812i, this.f17813j, this.f17814k, this.f17815l, this.f17817n, this.f17818o);
        }

        /* renamed from: b */
        public boolean m18036b() {
            return (this.f17804a == null && this.f17805b == 0) ? false : true;
        }

        /* renamed from: c */
        public boolean m18037c() {
            return (this.f17807d == 0 && this.f17808e == 0) ? false : true;
        }

        /* renamed from: d */
        public b m18038d(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i11 == 0 && i10 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f17807d = i10;
            this.f17808e = i11;
            return this;
        }

        /* renamed from: e */
        public b m18039e(InterfaceC4342e0 interfaceC4342e0) {
            if (interfaceC4342e0 != null) {
                if (interfaceC4342e0.mo6705b() != null) {
                    if (this.f17816m == null) {
                        this.f17816m = new ArrayList(2);
                    }
                    this.f17816m.add(interfaceC4342e0);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* synthetic */ C4362w(Uri uri, int i10, String str, List list, int i11, int i12, boolean z10, boolean z11, boolean z12, float f10, float f11, float f12, boolean z13, Bitmap.Config config, C4359t.f fVar, a aVar) {
        this(uri, i10, str, list, i11, i12, z10, z11, z12, f10, f11, f12, z13, config, fVar);
    }

    /* renamed from: a */
    public String m18028a() {
        Uri uri = this.f17789d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f17790e);
    }

    /* renamed from: b */
    public boolean m18029b() {
        return this.f17792g != null;
    }

    /* renamed from: c */
    public boolean m18030c() {
        return (this.f17793h == 0 && this.f17794i == 0) ? false : true;
    }

    /* renamed from: d */
    public String m18031d() {
        long nanoTime = System.nanoTime() - this.f17787b;
        if (nanoTime > f17785s) {
            return m18034g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return m18034g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* renamed from: e */
    public boolean m18032e() {
        return m18030c() || this.f17798m != 0.0f;
    }

    /* renamed from: f */
    public boolean m18033f() {
        return m18032e() || m18029b();
    }

    /* renamed from: g */
    public String m18034g() {
        return "[R" + this.f17786a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f17790e;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f17789d);
        }
        List<InterfaceC4342e0> list = this.f17792g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC4342e0 interfaceC4342e0 : this.f17792g) {
                sb2.append(' ');
                sb2.append(interfaceC4342e0.mo6705b());
            }
        }
        if (this.f17791f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f17791f);
            sb2.append(')');
        }
        if (this.f17793h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f17793h);
            sb2.append(',');
            sb2.append(this.f17794i);
            sb2.append(')');
        }
        if (this.f17795j) {
            sb2.append(" centerCrop");
        }
        if (this.f17796k) {
            sb2.append(" centerInside");
        }
        if (this.f17798m != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f17798m);
            if (this.f17801p) {
                sb2.append(" @ ");
                sb2.append(this.f17799n);
                sb2.append(',');
                sb2.append(this.f17800o);
            }
            sb2.append(')');
        }
        if (this.f17802q != null) {
            sb2.append(' ');
            sb2.append(this.f17802q);
        }
        sb2.append('}');
        return sb2.toString();
    }

    private C4362w(Uri uri, int i10, String str, List<InterfaceC4342e0> list, int i11, int i12, boolean z10, boolean z11, boolean z12, float f10, float f11, float f12, boolean z13, Bitmap.Config config, C4359t.f fVar) {
        this.f17789d = uri;
        this.f17790e = i10;
        this.f17791f = str;
        if (list == null) {
            this.f17792g = null;
        } else {
            this.f17792g = Collections.unmodifiableList(list);
        }
        this.f17793h = i11;
        this.f17794i = i12;
        this.f17795j = z10;
        this.f17796k = z11;
        this.f17797l = z12;
        this.f17798m = f10;
        this.f17799n = f11;
        this.f17800o = f12;
        this.f17801p = z13;
        this.f17802q = config;
        this.f17803r = fVar;
    }
}
