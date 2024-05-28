package com.google.android.material.bottomappbar;

import p310y4.C5887f;
import p310y4.C5894m;

/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes.dex */
public class C2411a extends C5887f implements Cloneable {

    /* renamed from: n */
    private float f9059n;

    /* renamed from: o */
    private float f9060o;

    /* renamed from: p */
    private float f9061p;

    /* renamed from: q */
    private float f9062q;

    /* renamed from: r */
    private float f9063r;

    /* renamed from: s */
    private float f9064s;

    @Override // p310y4.C5887f
    /* renamed from: d */
    public void mo10643d(float f10, float f11, float f12, C5894m c5894m) {
        float f13;
        float f14;
        float f15 = this.f9061p;
        if (f15 == 0.0f) {
            c5894m.m20951m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f9060o * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f9059n;
        float f18 = f11 + this.f9063r;
        float f19 = (this.f9062q * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            c5894m.m20951m(f10, 0.0f);
            return;
        }
        float f20 = this.f9064s;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float sqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - sqrt;
        float f25 = f18 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        c5894m.m20951m(f24, 0.0f);
        float f27 = f17 * 2.0f;
        c5894m.m20943a(f24 - f17, 0.0f, f24 + f17, f27, 270.0f, degrees);
        if (z10) {
            c5894m.m20943a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f28 = this.f9060o;
            float f29 = f21 * 2.0f;
            float f30 = f18 - f16;
            c5894m.m20943a(f30, -(f21 + f28), f30 + f28 + f29, f28 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f18 + f16;
            float f32 = this.f9060o;
            c5894m.m20951m(f31 - ((f32 / 2.0f) + f21), f32 + f21);
            float f33 = this.f9060o;
            c5894m.m20943a(f31 - (f29 + f33), -(f21 + f33), f31, f33 + f21, 90.0f, f26 - 90.0f);
        }
        c5894m.m20943a(f25 - f17, 0.0f, f25 + f17, f27, 270.0f - degrees, degrees);
        c5894m.m20951m(f10, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m10644f() {
        return this.f9062q;
    }

    /* renamed from: g */
    public float m10645g() {
        return this.f9064s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m10646h() {
        return this.f9060o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m10647j() {
        return this.f9059n;
    }

    /* renamed from: k */
    public float m10648k() {
        return this.f9061p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m10649m(float f10) {
        if (f10 >= 0.0f) {
            this.f9062q = f10;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: n */
    public void m10650n(float f10) {
        this.f9064s = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m10651o(float f10) {
        this.f9060o = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m10652p(float f10) {
        this.f9059n = f10;
    }

    /* renamed from: q */
    public void m10653q(float f10) {
        this.f9061p = f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m10654r(float f10) {
        this.f9063r = f10;
    }
}
