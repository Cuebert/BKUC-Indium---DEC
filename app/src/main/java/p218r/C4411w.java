package p218r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.core.util.C0654h;
import java.util.List;
import java.util.concurrent.Executor;
import p218r.C4384g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r.w */
/* loaded from: classes.dex */
public class C4411w implements C4384g.a {

    /* renamed from: a */
    final CameraCaptureSession f17982a;

    /* renamed from: b */
    final Object f17983b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.w$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Handler f17984a;

        a(Handler handler) {
            this.f17984a = handler;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4411w(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f17982a = (CameraCaptureSession) C0654h.m3467f(cameraCaptureSession);
        this.f17983b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C4384g.a m18188d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C4411w(cameraCaptureSession, new a(handler));
    }

    @Override // p218r.C4384g.a
    /* renamed from: a */
    public int mo18126a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f17982a.setRepeatingRequest(captureRequest, new C4384g.b(executor, captureCallback), ((a) this.f17983b).f17984a);
    }

    @Override // p218r.C4384g.a
    /* renamed from: b */
    public CameraCaptureSession mo18127b() {
        return this.f17982a;
    }

    @Override // p218r.C4384g.a
    /* renamed from: c */
    public int mo18128c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f17982a.captureBurst(list, new C4384g.b(executor, captureCallback), ((a) this.f17983b).f17984a);
    }
}
