package p218r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: r.d */
/* loaded from: classes.dex */
public class C4378d {
    /* renamed from: a */
    public static <T> OutputConfiguration m18113a(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: b */
    public static void m18114b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
