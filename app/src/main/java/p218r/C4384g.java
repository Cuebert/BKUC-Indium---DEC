package p218r;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import p218r.C4384g;

/* renamed from: r.g */
/* loaded from: classes.dex */
public final class C4384g {

    /* renamed from: a */
    private final a f17915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.g$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        int mo18126a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

        /* renamed from: b */
        CameraCaptureSession mo18127b();

        /* renamed from: c */
        int mo18128c(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    /* renamed from: r.g$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final CameraCaptureSession.CaptureCallback f17916a;

        /* renamed from: b */
        private final Executor f17917b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f17917b = executor;
            this.f17916a = captureCallback;
        }

        /* renamed from: h */
        public /* synthetic */ void m18136h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            C4376c.m18112a(this.f17916a, cameraCaptureSession, captureRequest, surface, j10);
        }

        /* renamed from: i */
        public /* synthetic */ void m18137i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f17916a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* renamed from: j */
        public /* synthetic */ void m18138j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f17916a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* renamed from: k */
        public /* synthetic */ void m18139k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f17916a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* renamed from: l */
        public /* synthetic */ void m18140l(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f17916a.onCaptureSequenceAborted(cameraCaptureSession, i10);
        }

        /* renamed from: m */
        public /* synthetic */ void m18141m(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f17916a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
        }

        /* renamed from: n */
        public /* synthetic */ void m18142n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f17916a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            this.f17917b.execute(new Runnable() { // from class: r.n

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17959o;

                /* renamed from: p */
                public final /* synthetic */ CaptureRequest f17960p;

                /* renamed from: q */
                public final /* synthetic */ Surface f17961q;

                /* renamed from: r */
                public final /* synthetic */ long f17962r;

                public /* synthetic */ RunnableC4398n(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, Surface surface2, long j102) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = surface2;
                    r5 = j102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18136h(r2, r3, r4, r5);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f17917b.execute(new Runnable() { // from class: r.m

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17949o;

                /* renamed from: p */
                public final /* synthetic */ CaptureRequest f17950p;

                /* renamed from: q */
                public final /* synthetic */ TotalCaptureResult f17951q;

                public /* synthetic */ RunnableC4396m(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, TotalCaptureResult totalCaptureResult2) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = totalCaptureResult2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18137i(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f17917b.execute(new Runnable() { // from class: r.k

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17937o;

                /* renamed from: p */
                public final /* synthetic */ CaptureRequest f17938p;

                /* renamed from: q */
                public final /* synthetic */ CaptureFailure f17939q;

                public /* synthetic */ RunnableC4392k(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, CaptureFailure captureFailure2) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = captureFailure2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18138j(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f17917b.execute(new Runnable() { // from class: r.l

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17943o;

                /* renamed from: p */
                public final /* synthetic */ CaptureRequest f17944p;

                /* renamed from: q */
                public final /* synthetic */ CaptureResult f17945q;

                public /* synthetic */ RunnableC4394l(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, CaptureResult captureResult2) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = captureResult2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18139k(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f17917b.execute(new Runnable() { // from class: r.h

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17921o;

                /* renamed from: p */
                public final /* synthetic */ int f17922p;

                public /* synthetic */ RunnableC4386h(CameraCaptureSession cameraCaptureSession2, int i102) {
                    r2 = cameraCaptureSession2;
                    r3 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18140l(r2, r3);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f17917b.execute(new Runnable() { // from class: r.i

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17924o;

                /* renamed from: p */
                public final /* synthetic */ int f17925p;

                /* renamed from: q */
                public final /* synthetic */ long f17926q;

                public /* synthetic */ RunnableC4388i(CameraCaptureSession cameraCaptureSession2, int i102, long j102) {
                    r2 = cameraCaptureSession2;
                    r3 = i102;
                    r4 = j102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18141m(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f17917b.execute(new Runnable() { // from class: r.j

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17931o;

                /* renamed from: p */
                public final /* synthetic */ CaptureRequest f17932p;

                /* renamed from: q */
                public final /* synthetic */ long f17933q;

                /* renamed from: r */
                public final /* synthetic */ long f17934r;

                public /* synthetic */ RunnableC4390j(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, long j102, long j112) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = j102;
                    r6 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.b.this.m18142n(r2, r3, r4, r6);
                }
            });
        }
    }

    /* renamed from: r.g$c */
    /* loaded from: classes.dex */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final CameraCaptureSession.StateCallback f17918a;

        /* renamed from: b */
        private final Executor f17919b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f17919b = executor;
            this.f17918a = stateCallback;
        }

        /* renamed from: h */
        public /* synthetic */ void m18150h(CameraCaptureSession cameraCaptureSession) {
            this.f17918a.onActive(cameraCaptureSession);
        }

        /* renamed from: i */
        public /* synthetic */ void m18151i(CameraCaptureSession cameraCaptureSession) {
            C4378d.m18114b(this.f17918a, cameraCaptureSession);
        }

        /* renamed from: j */
        public /* synthetic */ void m18152j(CameraCaptureSession cameraCaptureSession) {
            this.f17918a.onClosed(cameraCaptureSession);
        }

        /* renamed from: k */
        public /* synthetic */ void m18153k(CameraCaptureSession cameraCaptureSession) {
            this.f17918a.onConfigureFailed(cameraCaptureSession);
        }

        /* renamed from: l */
        public /* synthetic */ void m18154l(CameraCaptureSession cameraCaptureSession) {
            this.f17918a.onConfigured(cameraCaptureSession);
        }

        /* renamed from: m */
        public /* synthetic */ void m18155m(CameraCaptureSession cameraCaptureSession) {
            this.f17918a.onReady(cameraCaptureSession);
        }

        /* renamed from: n */
        public /* synthetic */ void m18156n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C4374b.m18111a(this.f17918a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f17919b.execute(new Runnable() { // from class: r.o

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17964o;

                public /* synthetic */ RunnableC4400o(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18150h(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f17919b.execute(new Runnable() { // from class: r.q

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17968o;

                public /* synthetic */ RunnableC4404q(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18151i(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f17919b.execute(new Runnable() { // from class: r.p

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17966o;

                public /* synthetic */ RunnableC4402p(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18152j(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f17919b.execute(new Runnable() { // from class: r.s

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17976o;

                public /* synthetic */ RunnableC4407s(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18153k(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f17919b.execute(new Runnable() { // from class: r.r

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17974o;

                public /* synthetic */ RunnableC4406r(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18154l(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f17919b.execute(new Runnable() { // from class: r.t

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17978o;

                public /* synthetic */ RunnableC4408t(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18155m(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f17919b.execute(new Runnable() { // from class: r.u

                /* renamed from: o */
                public final /* synthetic */ CameraCaptureSession f17980o;

                /* renamed from: p */
                public final /* synthetic */ Surface f17981p;

                public /* synthetic */ RunnableC4409u(CameraCaptureSession cameraCaptureSession2, Surface surface2) {
                    r2 = cameraCaptureSession2;
                    r3 = surface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4384g.c.this.m18156n(r2, r3);
                }
            });
        }
    }

    private C4384g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17915a = new C4410v(cameraCaptureSession);
        } else {
            this.f17915a = C4411w.m18188d(cameraCaptureSession, handler);
        }
    }

    /* renamed from: d */
    public static C4384g m18122d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C4384g(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int m18123a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f17915a.mo18128c(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int m18124b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f17915a.mo18126a(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public CameraCaptureSession m18125c() {
        return this.f17915a.mo18127b();
    }
}
