package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.internal.C0377z2;
import androidx.camera.core.C0445m;
import androidx.concurrent.futures.C0541c;
import p206q.C4288a;
import p218r.C4414z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.a */
/* loaded from: classes.dex */
public final class C0267a implements C0377z2.b {

    /* renamed from: a */
    private final C4414z f1227a;

    /* renamed from: b */
    private final Range<Float> f1228b;

    /* renamed from: d */
    private C0541c.a<Void> f1230d;

    /* renamed from: c */
    private float f1229c = 1.0f;

    /* renamed from: e */
    private float f1231e = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0267a(C4414z c4414z) {
        this.f1227a = c4414z;
        this.f1228b = (Range) c4414z.m18192a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: a */
    public void mo1327a(TotalCaptureResult totalCaptureResult) {
        if (this.f1230d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f1231e == f10.floatValue()) {
                this.f1230d.m2519c(null);
                this.f1230d = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: b */
    public float mo1328b() {
        return this.f1228b.getUpper().floatValue();
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: c */
    public void mo1329c(C4288a.a aVar) {
        aVar.m17775e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f1229c));
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: d */
    public float mo1330d() {
        return this.f1228b.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: e */
    public void mo1331e() {
        this.f1229c = 1.0f;
        C0541c.a<Void> aVar = this.f1230d;
        if (aVar != null) {
            aVar.m2521f(new C0445m("Camera is not active."));
            this.f1230d = null;
        }
    }
}
