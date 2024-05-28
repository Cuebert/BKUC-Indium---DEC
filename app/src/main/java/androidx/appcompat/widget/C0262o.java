package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: classes.dex */
class C0262o {

    /* renamed from: a */
    private int f1177a = 0;

    /* renamed from: b */
    private int f1178b = 0;

    /* renamed from: c */
    private int f1179c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1180d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1181e = 0;

    /* renamed from: f */
    private int f1182f = 0;

    /* renamed from: g */
    private boolean f1183g = false;

    /* renamed from: h */
    private boolean f1184h = false;

    /* renamed from: a */
    public int m1279a() {
        return this.f1183g ? this.f1177a : this.f1178b;
    }

    /* renamed from: b */
    public int m1280b() {
        return this.f1177a;
    }

    /* renamed from: c */
    public int m1281c() {
        return this.f1178b;
    }

    /* renamed from: d */
    public int m1282d() {
        return this.f1183g ? this.f1178b : this.f1177a;
    }

    /* renamed from: e */
    public void m1283e(int i10, int i11) {
        this.f1184h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1181e = i10;
            this.f1177a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1182f = i11;
            this.f1178b = i11;
        }
    }

    /* renamed from: f */
    public void m1284f(boolean z10) {
        if (z10 == this.f1183g) {
            return;
        }
        this.f1183g = z10;
        if (!this.f1184h) {
            this.f1177a = this.f1181e;
            this.f1178b = this.f1182f;
            return;
        }
        if (z10) {
            int i10 = this.f1180d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1181e;
            }
            this.f1177a = i10;
            int i11 = this.f1179c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1182f;
            }
            this.f1178b = i11;
            return;
        }
        int i12 = this.f1179c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f1181e;
        }
        this.f1177a = i12;
        int i13 = this.f1180d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f1182f;
        }
        this.f1178b = i13;
    }

    /* renamed from: g */
    public void m1285g(int i10, int i11) {
        this.f1179c = i10;
        this.f1180d = i11;
        this.f1184h = true;
        if (this.f1183g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1177a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1178b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1177a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1178b = i11;
        }
    }
}
