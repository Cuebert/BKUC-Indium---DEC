package p218r;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import p218r.C4373a0;
import p231s.C4487g;

/* renamed from: r.a0 */
/* loaded from: classes.dex */
public final class C4373a0 {

    /* renamed from: a */
    private final a f17899a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r.a0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo18102a(C4487g c4487g) throws C4382f;
    }

    /* renamed from: r.a0$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f17900a;

        /* renamed from: b */
        private final Executor f17901b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f17901b = executor;
            this.f17900a = stateCallback;
        }

        /* renamed from: e */
        public /* synthetic */ void m18107e(CameraDevice cameraDevice) {
            this.f17900a.onClosed(cameraDevice);
        }

        /* renamed from: f */
        public /* synthetic */ void m18108f(CameraDevice cameraDevice) {
            this.f17900a.onDisconnected(cameraDevice);
        }

        /* renamed from: g */
        public /* synthetic */ void m18109g(CameraDevice cameraDevice, int i10) {
            this.f17900a.onError(cameraDevice, i10);
        }

        /* renamed from: h */
        public /* synthetic */ void m18110h(CameraDevice cameraDevice) {
            this.f17900a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            this.f17901b.execute(new Runnable() { // from class: r.d0

                /* renamed from: o */
                public final /* synthetic */ CameraDevice f17907o;

                public /* synthetic */ RunnableC4379d0(CameraDevice cameraDevice2) {
                    r2 = cameraDevice2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4373a0.b.this.m18107e(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            this.f17901b.execute(new Runnable() { // from class: r.b0

                /* renamed from: o */
                public final /* synthetic */ CameraDevice f17903o;

                public /* synthetic */ RunnableC4375b0(CameraDevice cameraDevice2) {
                    r2 = cameraDevice2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4373a0.b.this.m18108f(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            this.f17901b.execute(new Runnable() { // from class: r.e0

                /* renamed from: o */
                public final /* synthetic */ CameraDevice f17909o;

                /* renamed from: p */
                public final /* synthetic */ int f17910p;

                public /* synthetic */ RunnableC4381e0(CameraDevice cameraDevice2, int i102) {
                    r2 = cameraDevice2;
                    r3 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4373a0.b.this.m18109g(r2, r3);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            this.f17901b.execute(new Runnable() { // from class: r.c0

                /* renamed from: o */
                public final /* synthetic */ CameraDevice f17905o;

                public /* synthetic */ RunnableC4377c0(CameraDevice cameraDevice2) {
                    r2 = cameraDevice2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4373a0.b.this.m18110h(r2);
                }
            });
        }
    }

    private C4373a0(CameraDevice cameraDevice, Handler handler) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f17899a = new C4387h0(cameraDevice);
            return;
        }
        if (i10 >= 24) {
            this.f17899a = C4385g0.m18157h(cameraDevice, handler);
        } else if (i10 >= 23) {
            this.f17899a = C4383f0.m18121g(cameraDevice, handler);
        } else {
            this.f17899a = C4389i0.m18160d(cameraDevice, handler);
        }
    }

    /* renamed from: b */
    public static C4373a0 m18100b(CameraDevice cameraDevice, Handler handler) {
        return new C4373a0(cameraDevice, handler);
    }

    /* renamed from: a */
    public void m18101a(C4487g c4487g) throws C4382f {
        this.f17899a.mo18102a(c4487g);
    }
}
