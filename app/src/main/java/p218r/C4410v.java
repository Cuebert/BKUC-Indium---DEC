package p218r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.v */
/* loaded from: classes.dex */
public class C4410v extends C4411w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4410v(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p218r.C4411w, p218r.C4384g.a
    /* renamed from: a */
    public int mo18126a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f17982a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // p218r.C4411w, p218r.C4384g.a
    /* renamed from: c */
    public int mo18128c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f17982a.captureBurstRequests(list, executor, captureCallback);
    }
}
