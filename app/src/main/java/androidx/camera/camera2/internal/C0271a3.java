package androidx.camera.camera2.internal;

import androidx.camera.core.InterfaceC0408f3;

/* renamed from: androidx.camera.camera2.internal.a3 */
/* loaded from: classes.dex */
class C0271a3 implements InterfaceC0408f3 {

    /* renamed from: a */
    private float f1239a;

    /* renamed from: b */
    private final float f1240b;

    /* renamed from: c */
    private final float f1241c;

    /* renamed from: d */
    private float f1242d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0271a3(float f10, float f11) {
        this.f1240b = f10;
        this.f1241c = f11;
    }

    /* renamed from: e */
    private float m1338e(float f10) {
        float f11 = this.f1240b;
        float f12 = this.f1241c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    @Override // androidx.camera.core.InterfaceC0408f3
    /* renamed from: a */
    public float mo1339a() {
        return this.f1240b;
    }

    @Override // androidx.camera.core.InterfaceC0408f3
    /* renamed from: b */
    public float mo1340b() {
        return this.f1239a;
    }

    @Override // androidx.camera.core.InterfaceC0408f3
    /* renamed from: c */
    public float mo1341c() {
        return this.f1242d;
    }

    @Override // androidx.camera.core.InterfaceC0408f3
    /* renamed from: d */
    public float mo1342d() {
        return this.f1241c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1343f(float f10) throws IllegalArgumentException {
        if (f10 <= this.f1240b && f10 >= this.f1241c) {
            this.f1239a = f10;
            this.f1242d = m1338e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f1241c + " , " + this.f1240b + "]");
    }
}
