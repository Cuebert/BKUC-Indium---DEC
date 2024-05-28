package androidx.camera.core;

import android.util.Rational;
import androidx.core.util.C0654h;

/* renamed from: androidx.camera.core.e3 */
/* loaded from: classes.dex */
public final class C0403e3 {

    /* renamed from: a */
    private int f1866a;

    /* renamed from: b */
    private Rational f1867b;

    /* renamed from: c */
    private int f1868c;

    /* renamed from: d */
    private int f1869d;

    /* renamed from: androidx.camera.core.e3$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        private final Rational f1871b;

        /* renamed from: c */
        private final int f1872c;

        /* renamed from: a */
        private int f1870a = 1;

        /* renamed from: d */
        private int f1873d = 0;

        public a(Rational rational, int i10) {
            this.f1871b = rational;
            this.f1872c = i10;
        }

        /* renamed from: a */
        public C0403e3 m2005a() {
            C0654h.m3468g(this.f1871b, "The crop aspect ratio must be set.");
            return new C0403e3(this.f1870a, this.f1871b, this.f1872c, this.f1873d);
        }

        /* renamed from: b */
        public a m2006b(int i10) {
            this.f1873d = i10;
            return this;
        }

        /* renamed from: c */
        public a m2007c(int i10) {
            this.f1870a = i10;
            return this;
        }
    }

    C0403e3(int i10, Rational rational, int i11, int i12) {
        this.f1866a = i10;
        this.f1867b = rational;
        this.f1868c = i11;
        this.f1869d = i12;
    }

    /* renamed from: a */
    public Rational m2001a() {
        return this.f1867b;
    }

    /* renamed from: b */
    public int m2002b() {
        return this.f1869d;
    }

    /* renamed from: c */
    public int m2003c() {
        return this.f1868c;
    }

    /* renamed from: d */
    public int m2004d() {
        return this.f1866a;
    }
}
