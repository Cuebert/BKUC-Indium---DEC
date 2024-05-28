package p218r;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: r.b */
/* loaded from: classes.dex */
public class C4374b {
    /* renamed from: a */
    public static void m18111a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
