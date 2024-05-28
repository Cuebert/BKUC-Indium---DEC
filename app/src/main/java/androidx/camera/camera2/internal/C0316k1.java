package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.core.util.C0654h;
import java.util.Objects;
import p279w.AbstractC5032h;
import p279w.C5040j;
import p279w.C5043j2;

/* renamed from: androidx.camera.camera2.internal.k1 */
/* loaded from: classes.dex */
final class C0316k1 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final AbstractC5032h f1445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0316k1(AbstractC5032h abstractC5032h) {
        Objects.requireNonNull(abstractC5032h, "cameraCaptureCallback is null");
        this.f1445a = abstractC5032h;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C5043j2 m19576a;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C0654h.m3463b(tag instanceof C5043j2, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            m19576a = (C5043j2) tag;
        } else {
            m19576a = C5043j2.m19576a();
        }
        this.f1445a.mo1399b(new C0287e(m19576a, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f1445a.mo1639c(new C5040j(C5040j.a.ERROR));
    }
}
