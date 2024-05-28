package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Objects;
import p279w.AbstractC5032h;

/* renamed from: androidx.camera.camera2.internal.l1 */
/* loaded from: classes.dex */
final class C0320l1 extends AbstractC5032h {

    /* renamed from: a */
    private final CameraCaptureSession.CaptureCallback f1453a;

    private C0320l1(CameraCaptureSession.CaptureCallback captureCallback) {
        Objects.requireNonNull(captureCallback, "captureCallback is null");
        this.f1453a = captureCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C0320l1 m1602d(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C0320l1(captureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public CameraCaptureSession.CaptureCallback m1603e() {
        return this.f1453a;
    }
}
