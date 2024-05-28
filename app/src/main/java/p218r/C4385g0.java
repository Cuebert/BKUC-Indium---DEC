package p218r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.core.util.C0654h;
import java.util.List;
import p218r.C4384g;
import p218r.C4389i0;
import p231s.C4481a;
import p231s.C4482b;
import p231s.C4487g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.g0 */
/* loaded from: classes.dex */
public class C4385g0 extends C4383f0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4385g0(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C4385g0 m18157h(CameraDevice cameraDevice, Handler handler) {
        return new C4385g0(cameraDevice, new C4389i0.a(handler));
    }

    @Override // p218r.C4383f0, p218r.C4389i0, p218r.C4373a0.a
    /* renamed from: a */
    public void mo18102a(C4487g c4487g) throws C4382f {
        C4389i0.m18159c(this.f17927a, c4487g);
        C4384g.c cVar = new C4384g.c(c4487g.m18449a(), c4487g.m18453e());
        List<C4482b> m18451c = c4487g.m18451c();
        Handler handler = ((C4389i0.a) C0654h.m3467f((C4389i0.a) this.f17928b)).f17929a;
        C4481a m18450b = c4487g.m18450b();
        try {
            if (m18450b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) m18450b.m18430a();
                C0654h.m3467f(inputConfiguration);
                this.f17927a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C4487g.m18447g(m18451c), cVar, handler);
            } else if (c4487g.m18452d() == 1) {
                this.f17927a.createConstrainedHighSpeedCaptureSession(C4389i0.m18161f(m18451c), cVar, handler);
            } else {
                this.f17927a.createCaptureSessionByOutputConfigurations(C4487g.m18447g(m18451c), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw C4382f.m18119e(e10);
        }
    }
}
