package p318z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C5933a extends AbstractC5938f {

    /* renamed from: a */
    private final float f21820a;

    /* renamed from: b */
    private final float f21821b;

    /* renamed from: c */
    private final float f21822c;

    /* renamed from: d */
    private final float f21823d;

    public C5933a(float f10, float f11, float f12, float f13) {
        this.f21820a = f10;
        this.f21821b = f11;
        this.f21822c = f12;
        this.f21823d = f13;
    }

    @Override // p318z.AbstractC5938f, androidx.camera.core.InterfaceC0408f3
    /* renamed from: a */
    public float mo1339a() {
        return this.f21821b;
    }

    @Override // p318z.AbstractC5938f, androidx.camera.core.InterfaceC0408f3
    /* renamed from: b */
    public float mo1340b() {
        return this.f21820a;
    }

    @Override // p318z.AbstractC5938f, androidx.camera.core.InterfaceC0408f3
    /* renamed from: c */
    public float mo1341c() {
        return this.f21823d;
    }

    @Override // p318z.AbstractC5938f, androidx.camera.core.InterfaceC0408f3
    /* renamed from: d */
    public float mo1342d() {
        return this.f21822c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5938f)) {
            return false;
        }
        AbstractC5938f abstractC5938f = (AbstractC5938f) obj;
        return Float.floatToIntBits(this.f21820a) == Float.floatToIntBits(abstractC5938f.mo1340b()) && Float.floatToIntBits(this.f21821b) == Float.floatToIntBits(abstractC5938f.mo1339a()) && Float.floatToIntBits(this.f21822c) == Float.floatToIntBits(abstractC5938f.mo1342d()) && Float.floatToIntBits(this.f21823d) == Float.floatToIntBits(abstractC5938f.mo1341c());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f21820a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f21821b)) * 1000003) ^ Float.floatToIntBits(this.f21822c)) * 1000003) ^ Float.floatToIntBits(this.f21823d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f21820a + ", maxZoomRatio=" + this.f21821b + ", minZoomRatio=" + this.f21822c + ", linearZoom=" + this.f21823d + "}";
    }
}
