package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p218r.C4374b;
import p218r.C4378d;

/* renamed from: androidx.camera.camera2.internal.f1 */
/* loaded from: classes.dex */
public final class C0294f1 {

    /* renamed from: androidx.camera.camera2.internal.f1$a */
    /* loaded from: classes.dex */
    static final class a extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        private final List<CameraCaptureSession.StateCallback> f1296a = new ArrayList();

        a(List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f1296a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                it.next().onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                C4378d.m18114b(it.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                it.next().onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                it.next().onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                it.next().onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Iterator<CameraCaptureSession.StateCallback> it = this.f1296a.iterator();
            while (it.hasNext()) {
                C4374b.m18111a(it.next(), cameraCaptureSession, surface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.f1$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }

    /* renamed from: a */
    public static CameraCaptureSession.StateCallback m1401a(List<CameraCaptureSession.StateCallback> list) {
        if (list.isEmpty()) {
            return m1402b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }

    /* renamed from: b */
    public static CameraCaptureSession.StateCallback m1402b() {
        return new b();
    }
}
