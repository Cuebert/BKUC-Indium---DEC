package p218r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.core.util.C0654h;
import p231s.C4487g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.h0 */
/* loaded from: classes.dex */
public class C4387h0 extends C4385g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4387h0(CameraDevice cameraDevice) {
        super((CameraDevice) C0654h.m3467f(cameraDevice), null);
    }

    @Override // p218r.C4385g0, p218r.C4383f0, p218r.C4389i0, p218r.C4373a0.a
    /* renamed from: a */
    public void mo18102a(C4487g c4487g) throws C4382f {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c4487g.m18455i();
        C0654h.m3467f(sessionConfiguration);
        try {
            this.f17927a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }
}
