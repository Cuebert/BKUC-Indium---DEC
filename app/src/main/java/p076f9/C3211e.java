package p076f9;

import android.content.Context;
import android.graphics.Point;

/* renamed from: f9.e */
/* loaded from: classes.dex */
public class C3211e {

    /* renamed from: a */
    private float f13506a = 0.0f;

    /* renamed from: b */
    private float f13507b = 0.0f;

    /* renamed from: a */
    private boolean m14252a(double d10, double d11, double d12) {
        return m14254d(d10, d12) && m14254d(d11, d12);
    }

    /* renamed from: c */
    private double m14253c(double d10, double d11, double d12) {
        int i10 = 1;
        double m14258h = m14258h(d12, 1);
        if (m14256f() && d12 <= m14257g()) {
            return d12;
        }
        if (m14252a(d10, d11, m14258h)) {
            return m14258h;
        }
        while (true) {
            double d13 = i10;
            if (d13 >= 10.0d) {
                return d12;
            }
            double d14 = d13 * 0.1d;
            double d15 = m14258h - d14;
            if (m14252a(d10, d11, d15)) {
                return d15;
            }
            double d16 = d14 + m14258h;
            if (m14252a(d10, d11, d16)) {
                return d16;
            }
            i10++;
        }
    }

    /* renamed from: d */
    private boolean m14254d(double d10, double d11) {
        double abs = Math.abs(d10 % d11);
        return abs < 9.999999747378752E-6d || Math.abs(d11 - abs) < 9.999999747378752E-6d;
    }

    /* renamed from: e */
    private boolean m14255e() {
        return C3207a.m14200d();
    }

    /* renamed from: f */
    private boolean m14256f() {
        return C3207a.m14201e();
    }

    /* renamed from: g */
    private int m14257g() {
        return C3207a.m14197a();
    }

    /* renamed from: h */
    private double m14258h(double d10, int i10) {
        return Math.round(d10 * r0) / Math.pow(10.0d, i10);
    }

    /* renamed from: b */
    public float m14259b(Context context) {
        if (m14255e()) {
            if (this.f13506a != context.getResources().getDisplayMetrics().density) {
                this.f13506a = context.getResources().getDisplayMetrics().density;
                Point point = new Point();
                point.x = context.getResources().getDisplayMetrics().widthPixels;
                int i10 = context.getResources().getDisplayMetrics().heightPixels;
                point.y = i10;
                this.f13507b = (float) m14253c(point.x, i10, this.f13506a);
            }
            return this.f13507b;
        }
        return context.getResources().getDisplayMetrics().density;
    }
}
