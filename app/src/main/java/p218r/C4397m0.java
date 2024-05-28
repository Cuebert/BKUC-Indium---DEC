package p218r;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.core.impl.utils.C0431k;
import java.util.Map;
import java.util.concurrent.Executor;
import p218r.C4397m0;

/* renamed from: r.m0 */
/* loaded from: classes.dex */
public final class C4397m0 {

    /* renamed from: a */
    private final b f17952a;

    /* renamed from: b */
    private final Map<String, C4414z> f17953b = new ArrayMap(4);

    /* renamed from: r.m0$a */
    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f17954a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f17955b;

        /* renamed from: c */
        private final Object f17956c = new Object();

        /* renamed from: d */
        private boolean f17957d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f17954a = executor;
            this.f17955b = availabilityCallback;
        }

        /* renamed from: d */
        public /* synthetic */ void m18173d() {
            C4380e.m18115a(this.f17955b);
        }

        /* renamed from: e */
        public /* synthetic */ void m18174e(String str) {
            this.f17955b.onCameraAvailable(str);
        }

        /* renamed from: f */
        public /* synthetic */ void m18175f(String str) {
            this.f17955b.onCameraUnavailable(str);
        }

        /* renamed from: g */
        public void m18176g() {
            synchronized (this.f17956c) {
                this.f17957d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f17956c) {
                if (!this.f17957d) {
                    this.f17954a.execute(new Runnable() { // from class: r.j0
                        public /* synthetic */ RunnableC4391j0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C4397m0.a.this.m18173d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            synchronized (this.f17956c) {
                if (!this.f17957d) {
                    this.f17954a.execute(new Runnable() { // from class: r.k0

                        /* renamed from: o */
                        public final /* synthetic */ String f17941o;

                        public /* synthetic */ RunnableC4393k0(String str2) {
                            r2 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C4397m0.a.this.m18174e(r2);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            synchronized (this.f17956c) {
                if (!this.f17957d) {
                    this.f17954a.execute(new Runnable() { // from class: r.l0

                        /* renamed from: o */
                        public final /* synthetic */ String f17947o;

                        public /* synthetic */ RunnableC4395l0(String str2) {
                            r2 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C4397m0.a.this.m18175f(r2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: r.m0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo18177a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: b */
        void mo18178b(CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: c */
        CameraCharacteristics mo18179c(String str) throws C4382f;

        /* renamed from: d */
        void mo18180d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C4382f;

        /* renamed from: e */
        String[] mo18181e() throws C4382f;
    }

    private C4397m0(b bVar) {
        this.f17952a = bVar;
    }

    /* renamed from: a */
    public static C4397m0 m18163a(Context context) {
        return m18164b(context, C0431k.m2118a());
    }

    /* renamed from: b */
    public static C4397m0 m18164b(Context context, Handler handler) {
        return new C4397m0(C4399n0.m18182a(context, handler));
    }

    /* renamed from: c */
    public C4414z m18165c(String str) throws C4382f {
        C4414z c4414z;
        synchronized (this.f17953b) {
            c4414z = this.f17953b.get(str);
            if (c4414z == null) {
                try {
                    c4414z = C4414z.m18191c(this.f17952a.mo18179c(str));
                    this.f17953b.put(str, c4414z);
                } catch (AssertionError e10) {
                    throw new C4382f(10002, e10.getMessage(), e10);
                }
            }
        }
        return c4414z;
    }

    /* renamed from: d */
    public String[] m18166d() throws C4382f {
        return this.f17952a.mo18181e();
    }

    /* renamed from: e */
    public void m18167e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C4382f {
        this.f17952a.mo18180d(str, executor, stateCallback);
    }

    /* renamed from: f */
    public void m18168f(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f17952a.mo18177a(executor, availabilityCallback);
    }

    /* renamed from: g */
    public void m18169g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f17952a.mo18178b(availabilityCallback);
    }
}
