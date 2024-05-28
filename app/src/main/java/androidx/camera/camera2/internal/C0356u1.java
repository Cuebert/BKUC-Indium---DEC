package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0377z2;
import androidx.camera.core.C0445m;
import androidx.concurrent.futures.C0541c;
import p206q.C4288a;
import p218r.C4414z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.u1 */
/* loaded from: classes.dex */
public final class C0356u1 implements C0377z2.b {

    /* renamed from: a */
    private final C4414z f1608a;

    /* renamed from: c */
    private C0541c.a<Void> f1610c;

    /* renamed from: b */
    private Rect f1609b = null;

    /* renamed from: d */
    private Rect f1611d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0356u1(C4414z c4414z) {
        this.f1608a = c4414z;
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: a */
    public void mo1327a(TotalCaptureResult totalCaptureResult) {
        if (this.f1610c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f1611d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f1610c.m2519c(null);
            this.f1610c = null;
            this.f1611d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: b */
    public float mo1328b() {
        Float f10 = (Float) this.f1608a.m18192a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        if (f10.floatValue() < mo1330d()) {
            return mo1330d();
        }
        return f10.floatValue();
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: c */
    public void mo1329c(C4288a.a aVar) {
        Rect rect = this.f1609b;
        if (rect != null) {
            aVar.m17775e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: d */
    public float mo1330d() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.C0377z2.b
    /* renamed from: e */
    public void mo1331e() {
        this.f1611d = null;
        this.f1609b = null;
        C0541c.a<Void> aVar = this.f1610c;
        if (aVar != null) {
            aVar.m2521f(new C0445m("Camera is not active."));
            this.f1610c = null;
        }
    }
}
