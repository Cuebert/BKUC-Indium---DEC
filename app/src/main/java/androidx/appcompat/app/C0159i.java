package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
class C0159i {

    /* renamed from: d */
    private static C0159i f711d;

    /* renamed from: a */
    public long f712a;

    /* renamed from: b */
    public long f713b;

    /* renamed from: c */
    public int f714c;

    C0159i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0159i m878b() {
        if (f711d == null) {
            f711d = new C0159i();
        }
        return f711d;
    }

    /* renamed from: a */
    public void m879a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - 9.0E-4f) - r9)) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(asin))) / (Math.cos(d13) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f714c = 1;
            this.f712a = -1L;
            this.f713b = -1L;
        } else {
            if (sin2 <= -1.0d) {
                this.f714c = 0;
                this.f712a = -1L;
                this.f713b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f712a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f713b = round2;
            if (round2 < j10 && this.f712a > j10) {
                this.f714c = 0;
            } else {
                this.f714c = 1;
            }
        }
    }
}
