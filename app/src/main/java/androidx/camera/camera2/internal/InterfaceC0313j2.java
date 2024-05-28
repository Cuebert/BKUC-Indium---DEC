package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.List;
import p218r.C4384g;

/* renamed from: androidx.camera.camera2.internal.j2 */
/* loaded from: classes.dex */
public interface InterfaceC0313j2 {

    /* renamed from: androidx.camera.camera2.internal.j2$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo1591n(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo1592o(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* renamed from: p */
        public void mo1593p(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* renamed from: q */
        public void mo1594q(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo1595r(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo1596s(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo1597t(InterfaceC0313j2 interfaceC0313j2) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo1598u(InterfaceC0313j2 interfaceC0313j2, Surface surface) {
        }
    }

    /* renamed from: a */
    a mo1582a();

    /* renamed from: b */
    void mo1583b();

    void close();

    /* renamed from: e */
    void mo1584e() throws CameraAccessException;

    /* renamed from: g */
    int mo1585g(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    /* renamed from: h */
    InterfaceFutureC2565m<Void> mo1586h();

    /* renamed from: i */
    C4384g mo1587i();

    /* renamed from: j */
    void mo1588j() throws CameraAccessException;

    /* renamed from: k */
    CameraDevice mo1589k();

    /* renamed from: m */
    int mo1590m(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
}
