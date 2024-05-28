package androidx.camera.camera2.internal;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.C0298g0;
import androidx.camera.camera2.internal.C0361v2;
import androidx.camera.core.AbstractC0473t;
import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0477u;
import androidx.camera.core.C0499z1;
import androidx.camera.core.InterfaceC0465r;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p218r.C4372a;
import p218r.C4382f;
import p218r.C4397m0;
import p242t.C4577l;
import p279w.AbstractC5073r0;
import p279w.C5013c0;
import p279w.C5015c2;
import p279w.C5029g0;
import p279w.C5045k0;
import p279w.C5055m2;
import p279w.C5058n1;
import p279w.C5090x;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5019d2;
import p279w.InterfaceC5077s1;
import p279w.InterfaceC5078t;
import p279w.InterfaceC5093y;
import p292x.C5493a;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* renamed from: androidx.camera.camera2.internal.g0 */
/* loaded from: classes.dex */
public final class C0298g0 implements InterfaceC5017d0 {

    /* renamed from: A */
    final AtomicInteger f1303A;

    /* renamed from: B */
    C0541c.a<Void> f1304B;

    /* renamed from: C */
    final Map<InterfaceC0344r1, InterfaceFutureC2565m<Void>> f1305C;

    /* renamed from: D */
    private final d f1306D;

    /* renamed from: E */
    private final C5029g0 f1307E;

    /* renamed from: F */
    final Set<C0340q1> f1308F;

    /* renamed from: G */
    private C0280c2 f1309G;

    /* renamed from: H */
    private final C0352t1 f1310H;

    /* renamed from: I */
    private final C0361v2.a f1311I;

    /* renamed from: J */
    private final Set<String> f1312J;

    /* renamed from: K */
    private InterfaceC5078t f1313K;

    /* renamed from: L */
    final Object f1314L;

    /* renamed from: M */
    private InterfaceC5019d2 f1315M;

    /* renamed from: N */
    boolean f1316N;

    /* renamed from: O */
    private final C0360v1 f1317O;

    /* renamed from: n */
    private final C5055m2 f1318n;

    /* renamed from: o */
    private final C4397m0 f1319o;

    /* renamed from: p */
    private final Executor f1320p;

    /* renamed from: q */
    private final ScheduledExecutorService f1321q;

    /* renamed from: r */
    volatile f f1322r = f.INITIALIZED;

    /* renamed from: s */
    private final C5058n1<InterfaceC5017d0.a> f1323s;

    /* renamed from: t */
    private final C0308i1 f1324t;

    /* renamed from: u */
    private final C0350t f1325u;

    /* renamed from: v */
    private final g f1326v;

    /* renamed from: w */
    final C0311j0 f1327w;

    /* renamed from: x */
    CameraDevice f1328x;

    /* renamed from: y */
    int f1329y;

    /* renamed from: z */
    InterfaceC0344r1 f1330z;

    /* renamed from: androidx.camera.camera2.internal.g0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0344r1 f1331a;

        a(InterfaceC0344r1 interfaceC0344r1) {
            this.f1331a = interfaceC0344r1;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r22) {
            CameraDevice cameraDevice;
            C0298g0.this.f1305C.remove(this.f1331a);
            int i10 = c.f1334a[C0298g0.this.f1322r.ordinal()];
            if (i10 != 3) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        return;
                    }
                } else if (C0298g0.this.f1329y == 0) {
                    return;
                }
            }
            if (!C0298g0.this.m1447K() || (cameraDevice = C0298g0.this.f1328x) == null) {
                return;
            }
            C4372a.m18099a(cameraDevice);
            C0298g0.this.f1328x = null;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.g0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC5583c<Void> {
        b() {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            if (th instanceof AbstractC5073r0.a) {
                C5015c2 m1445F = C0298g0.this.m1445F(((AbstractC5073r0.a) th).m19685a());
                if (m1445F != null) {
                    C0298g0.this.m1451b0(m1445F);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                C0298g0.this.m1444D("Unable to configure camera cancelled");
                return;
            }
            f fVar = C0298g0.this.f1322r;
            f fVar2 = f.OPENED;
            if (fVar == fVar2) {
                C0298g0.this.m1462h0(fVar2, AbstractC0473t.a.m2233b(4, th));
            }
            if (th instanceof CameraAccessException) {
                C0298g0.this.m1444D("Unable to configure camera due to " + th.getMessage());
                return;
            }
            if (th instanceof TimeoutException) {
                C0463q1.m2204c("Camera2CameraImpl", "Unable to configure camera " + C0298g0.this.f1327w.mo1569c() + ", timeout!");
            }
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b */
        public void onSuccess(Void r12) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.g0$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1334a;

        static {
            int[] iArr = new int[f.values().length];
            f1334a = iArr;
            try {
                iArr[f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1334a[f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1334a[f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1334a[f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1334a[f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1334a[f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1334a[f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1334a[f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.g0$d */
    /* loaded from: classes.dex */
    public final class d extends CameraManager.AvailabilityCallback implements C5029g0.b {

        /* renamed from: a */
        private final String f1335a;

        /* renamed from: b */
        private boolean f1336b = true;

        d(String str) {
            this.f1335a = str;
        }

        @Override // p279w.C5029g0.b
        /* renamed from: a */
        public void mo1475a() {
            if (C0298g0.this.f1322r == f.PENDING_OPEN) {
                C0298g0.this.m1470o0(false);
            }
        }

        /* renamed from: b */
        boolean m1476b() {
            return this.f1336b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f1335a.equals(str)) {
                this.f1336b = true;
                if (C0298g0.this.f1322r == f.PENDING_OPEN) {
                    C0298g0.this.m1470o0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f1335a.equals(str)) {
                this.f1336b = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.g0$e */
    /* loaded from: classes.dex */
    public final class e implements InterfaceC5093y.c {
        e() {
        }

        @Override // p279w.InterfaceC5093y.c
        /* renamed from: a */
        public void mo1477a() {
            C0298g0.this.m1471p0();
        }

        @Override // p279w.InterfaceC5093y.c
        /* renamed from: b */
        public void mo1478b(List<C5045k0> list) {
            C0298g0.this.m1466j0((List) C0654h.m3467f(list));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.g0$f */
    /* loaded from: classes.dex */
    public enum f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.internal.g0$g */
    /* loaded from: classes.dex */
    public final class g extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final Executor f1348a;

        /* renamed from: b */
        private final ScheduledExecutorService f1349b;

        /* renamed from: c */
        private b f1350c;

        /* renamed from: d */
        ScheduledFuture<?> f1351d;

        /* renamed from: e */
        private final a f1352e = new a();

        /* renamed from: androidx.camera.camera2.internal.g0$g$a */
        /* loaded from: classes.dex */
        public class a {

            /* renamed from: a */
            private long f1354a = -1;

            a() {
            }

            /* renamed from: a */
            boolean m1485a() {
                if (!(m1486b() >= ((long) m1488d()))) {
                    return true;
                }
                m1489e();
                return false;
            }

            /* renamed from: b */
            long m1486b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f1354a == -1) {
                    this.f1354a = uptimeMillis;
                }
                return uptimeMillis - this.f1354a;
            }

            /* renamed from: c */
            int m1487c() {
                if (!g.this.m1484f()) {
                    return 700;
                }
                long m1486b = m1486b();
                if (m1486b <= 120000) {
                    return 1000;
                }
                return m1486b <= 300000 ? 2000 : 4000;
            }

            /* renamed from: d */
            int m1488d() {
                return !g.this.m1484f() ? 10000 : 1800000;
            }

            /* renamed from: e */
            void m1489e() {
                this.f1354a = -1L;
            }
        }

        /* renamed from: androidx.camera.camera2.internal.g0$g$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: n */
            private Executor f1356n;

            /* renamed from: o */
            private boolean f1357o = false;

            b(Executor executor) {
                this.f1356n = executor;
            }

            /* renamed from: c */
            public /* synthetic */ void m1491c() {
                if (this.f1357o) {
                    return;
                }
                C0654h.m3469h(C0298g0.this.f1322r == f.REOPENING);
                if (g.this.m1484f()) {
                    C0298g0.this.m1469n0(true);
                } else {
                    C0298g0.this.m1470o0(true);
                }
            }

            /* renamed from: b */
            void m1492b() {
                this.f1357o = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1356n.execute(new Runnable() { // from class: androidx.camera.camera2.internal.h0
                    public /* synthetic */ RunnableC0303h0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0298g0.g.b.this.m1491c();
                    }
                });
            }
        }

        g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f1348a = executor;
            this.f1349b = scheduledExecutorService;
        }

        /* renamed from: b */
        private void m1479b(CameraDevice cameraDevice, int i10) {
            C0654h.m3470i(C0298g0.this.f1322r == f.OPENING || C0298g0.this.f1322r == f.OPENED || C0298g0.this.f1322r == f.REOPENING, "Attempt to handle open error from non open state: " + C0298g0.this.f1322r);
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                C0463q1.m2204c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C0298g0.m1409H(i10) + " closing camera.");
                C0298g0.this.m1462h0(f.CLOSING, AbstractC0473t.a.m2232a(i10 == 3 ? 5 : 6));
                C0298g0.this.m1472z(false);
                return;
            }
            C0463q1.m2202a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C0298g0.m1409H(i10)));
            m1480c(i10);
        }

        /* renamed from: c */
        private void m1480c(int i10) {
            int i11 = 1;
            C0654h.m3470i(C0298g0.this.f1329y != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            C0298g0.this.m1462h0(f.REOPENING, AbstractC0473t.a.m2232a(i11));
            C0298g0.this.m1472z(false);
        }

        /* renamed from: a */
        boolean m1481a() {
            if (this.f1351d == null) {
                return false;
            }
            C0298g0.this.m1444D("Cancelling scheduled re-open: " + this.f1350c);
            this.f1350c.m1492b();
            this.f1350c = null;
            this.f1351d.cancel(false);
            this.f1351d = null;
            return true;
        }

        /* renamed from: d */
        void m1482d() {
            this.f1352e.m1489e();
        }

        /* renamed from: e */
        void m1483e() {
            C0654h.m3469h(this.f1350c == null);
            C0654h.m3469h(this.f1351d == null);
            if (this.f1352e.m1485a()) {
                this.f1350c = new b(this.f1348a);
                C0298g0.this.m1444D("Attempting camera re-open in " + this.f1352e.m1487c() + "ms: " + this.f1350c + " activeResuming = " + C0298g0.this.f1316N);
                this.f1351d = this.f1349b.schedule(this.f1350c, (long) this.f1352e.m1487c(), TimeUnit.MILLISECONDS);
                return;
            }
            C0463q1.m2204c("Camera2CameraImpl", "Camera reopening attempted for " + this.f1352e.m1488d() + "ms without success.");
            C0298g0.this.m1464i0(f.PENDING_OPEN, null, false);
        }

        /* renamed from: f */
        boolean m1484f() {
            int i10;
            C0298g0 c0298g0 = C0298g0.this;
            return c0298g0.f1316N && ((i10 = c0298g0.f1329y) == 1 || i10 == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C0298g0.this.m1444D("CameraDevice.onClosed()");
            C0654h.m3470i(C0298g0.this.f1328x == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i10 = c.f1334a[C0298g0.this.f1322r.ordinal()];
            if (i10 != 3) {
                if (i10 == 6) {
                    C0298g0 c0298g0 = C0298g0.this;
                    if (c0298g0.f1329y != 0) {
                        c0298g0.m1444D("Camera closed due to error: " + C0298g0.m1409H(C0298g0.this.f1329y));
                        m1483e();
                        return;
                    }
                    c0298g0.m1470o0(false);
                    return;
                }
                if (i10 != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + C0298g0.this.f1322r);
                }
            }
            C0654h.m3469h(C0298g0.this.m1447K());
            C0298g0.this.m1446G();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C0298g0.this.m1444D("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            C0298g0 c0298g0 = C0298g0.this;
            c0298g0.f1328x = cameraDevice;
            c0298g0.f1329y = i10;
            int i11 = c.f1334a[c0298g0.f1322r.ordinal()];
            if (i11 != 3) {
                if (i11 == 4 || i11 == 5 || i11 == 6) {
                    C0463q1.m2202a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C0298g0.m1409H(i10), C0298g0.this.f1322r.name()));
                    m1479b(cameraDevice, i10);
                    return;
                } else if (i11 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + C0298g0.this.f1322r);
                }
            }
            C0463q1.m2204c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C0298g0.m1409H(i10), C0298g0.this.f1322r.name()));
            C0298g0.this.m1472z(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C0298g0.this.m1444D("CameraDevice.onOpened()");
            C0298g0 c0298g0 = C0298g0.this;
            c0298g0.f1328x = cameraDevice;
            c0298g0.f1329y = 0;
            m1482d();
            int i10 = c.f1334a[C0298g0.this.f1322r.ordinal()];
            if (i10 != 3) {
                if (i10 == 5 || i10 == 6) {
                    C0298g0.this.m1460g0(f.OPENED);
                    C0298g0.this.m1448Z();
                    return;
                } else if (i10 != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C0298g0.this.f1322r);
                }
            }
            C0654h.m3469h(C0298g0.this.m1447K());
            C0298g0.this.f1328x.close();
            C0298g0.this.f1328x = null;
        }
    }

    /* renamed from: androidx.camera.camera2.internal.g0$h */
    /* loaded from: classes.dex */
    public static abstract class h {
        /* renamed from: a */
        static h m1493a(String str, Class<?> cls, C5015c2 c5015c2, Size size) {
            return new C0272b(str, cls, c5015c2, size);
        }

        /* renamed from: b */
        static h m1494b(AbstractC0496y2 abstractC0496y2) {
            return m1493a(C0298g0.m1410I(abstractC0496y2), abstractC0496y2.getClass(), abstractC0496y2.m2309l(), abstractC0496y2.m2301c());
        }

        /* renamed from: c */
        public abstract C5015c2 mo1344c();

        /* renamed from: d */
        public abstract Size mo1345d();

        /* renamed from: e */
        public abstract String mo1346e();

        /* renamed from: f */
        public abstract Class<?> mo1347f();
    }

    public C0298g0(C4397m0 c4397m0, String str, C0311j0 c0311j0, C5029g0 c5029g0, Executor executor, Handler handler, C0360v1 c0360v1) throws C0477u {
        C5058n1<InterfaceC5017d0.a> c5058n1 = new C5058n1<>();
        this.f1323s = c5058n1;
        this.f1329y = 0;
        this.f1303A = new AtomicInteger(0);
        this.f1305C = new LinkedHashMap();
        this.f1308F = new HashSet();
        this.f1312J = new HashSet();
        this.f1314L = new Object();
        this.f1316N = false;
        this.f1319o = c4397m0;
        this.f1307E = c5029g0;
        ScheduledExecutorService m20223e = C5493a.m20223e(handler);
        this.f1321q = m20223e;
        Executor m20224f = C5493a.m20224f(executor);
        this.f1320p = m20224f;
        this.f1326v = new g(m20224f, m20223e);
        this.f1318n = new C5055m2(str);
        c5058n1.m19638g(InterfaceC5017d0.a.CLOSED);
        C0308i1 c0308i1 = new C0308i1(c5029g0);
        this.f1324t = c0308i1;
        C0352t1 c0352t1 = new C0352t1(m20224f);
        this.f1310H = c0352t1;
        this.f1317O = c0360v1;
        this.f1330z = m1422V();
        try {
            C0350t c0350t = new C0350t(c4397m0.m18165c(str), m20223e, m20224f, new e(), c0311j0.mo1573g());
            this.f1325u = c0350t;
            this.f1327w = c0311j0;
            c0311j0.m1577k(c0350t);
            c0311j0.m1578n(c0308i1.m1524a());
            this.f1311I = new C0361v2.a(m20224f, m20223e, handler, c0352t1, c0311j0.mo1573g(), C4577l.m18666b());
            d dVar = new d(str);
            this.f1306D = dVar;
            c5029g0.m19558e(this, m20224f, dVar);
            c4397m0.m18168f(m20224f, dVar);
        } catch (C4382f e10) {
            throw C0312j1.m1581a(e10);
        }
    }

    /* renamed from: A */
    private void m1405A() {
        m1444D("Closing camera.");
        int i10 = c.f1334a[this.f1322r.ordinal()];
        if (i10 == 2) {
            C0654h.m3469h(this.f1328x == null);
            m1460g0(f.INITIALIZED);
            return;
        }
        if (i10 == 4) {
            m1460g0(f.CLOSING);
            m1472z(false);
            return;
        }
        if (i10 != 5 && i10 != 6) {
            m1444D("close() ignored due to being in state: " + this.f1322r);
            return;
        }
        boolean m1481a = this.f1326v.m1481a();
        m1460g0(f.CLOSING);
        if (m1481a) {
            C0654h.m3469h(m1447K());
            m1446G();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.camera2.internal.w.<init>(android.view.Surface, android.graphics.SurfaceTexture):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: B */
    private void m1406B(boolean r6) {
        /*
            r5 = this;
            androidx.camera.camera2.internal.q1 r0 = new androidx.camera.camera2.internal.q1
            r0.<init>()
            java.util.Set<androidx.camera.camera2.internal.q1> r1 = r5.f1308F
            r1.add(r0)
            r5.m1458f0(r6)
            android.graphics.SurfaceTexture r6 = new android.graphics.SurfaceTexture
            r1 = 0
            r6.<init>(r1)
            r1 = 640(0x280, float:8.97E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r6.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r6)
            androidx.camera.camera2.internal.w r2 = new androidx.camera.camera2.internal.w
            r2.<init>()
            w.c2$b r6 = new w.c2$b
            r6.<init>()
            w.i1 r3 = new w.i1
            r3.<init>(r1)
            r6.m19509h(r3)
            r1 = 1
            r6.m19519s(r1)
            java.lang.String r1 = "Start configAndClose."
            r5.m1444D(r1)
            w.c2 r6 = r6.m19514m()
            android.hardware.camera2.CameraDevice r1 = r5.f1328x
            java.lang.Object r1 = androidx.core.util.C0654h.m3467f(r1)
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            androidx.camera.camera2.internal.v2$a r4 = r5.f1311I
            androidx.camera.camera2.internal.v2 r4 = r4.m1798a()
            com.google.common.util.concurrent.m r6 = r0.mo1518f(r6, r1, r4)
            androidx.camera.camera2.internal.x r1 = new androidx.camera.camera2.internal.x
            r1.<init>()
            java.util.concurrent.Executor r0 = r5.f1320p
            r6.mo2501b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0298g0.m1406B(boolean):void");
    }

    /* renamed from: C */
    private CameraDevice.StateCallback m1407C() {
        ArrayList arrayList = new ArrayList(this.f1318n.m19616e().m19522b().m19491b());
        arrayList.add(this.f1310H.m1757c());
        arrayList.add(this.f1326v);
        return C0299g1.m1495a(arrayList);
    }

    /* renamed from: E */
    private void m1408E(String str, Throwable th) {
        C0463q1.m2203b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    /* renamed from: H */
    static String m1409H(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: I */
    static String m1410I(AbstractC0496y2 abstractC0496y2) {
        return abstractC0496y2.m2307j() + abstractC0496y2.hashCode();
    }

    /* renamed from: J */
    private boolean m1411J() {
        return ((C0311j0) mo1461h()).m1576j() == 2;
    }

    /* renamed from: L */
    public /* synthetic */ void m1412L(List list) {
        try {
            m1429l0(list);
        } finally {
            this.f1325u.m1737u();
        }
    }

    /* renamed from: M */
    public static /* synthetic */ void m1413M(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: P */
    public /* synthetic */ void m1416P(String str, C5015c2 c5015c2) {
        m1444D("Use case " + str + " ACTIVE");
        this.f1318n.m19620m(str, c5015c2);
        this.f1318n.m19624q(str, c5015c2);
        m1471p0();
    }

    /* renamed from: Q */
    public /* synthetic */ void m1417Q(String str) {
        m1444D("Use case " + str + " INACTIVE");
        this.f1318n.m19623p(str);
        m1471p0();
    }

    /* renamed from: R */
    public /* synthetic */ void m1418R(String str, C5015c2 c5015c2) {
        m1444D("Use case " + str + " RESET");
        this.f1318n.m19624q(str, c5015c2);
        m1458f0(false);
        m1471p0();
        if (this.f1322r == f.OPENED) {
            m1448Z();
        }
    }

    /* renamed from: S */
    public /* synthetic */ void m1419S(String str, C5015c2 c5015c2) {
        m1444D("Use case " + str + " UPDATED");
        this.f1318n.m19624q(str, c5015c2);
        m1471p0();
    }

    /* renamed from: T */
    public static /* synthetic */ void m1420T(C5015c2.c cVar, C5015c2 c5015c2) {
        cVar.mo1878a(c5015c2, C5015c2.e.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* renamed from: U */
    public /* synthetic */ void m1421U(boolean z10) {
        this.f1316N = z10;
        if (z10 && this.f1322r == f.PENDING_OPEN) {
            m1469n0(false);
        }
    }

    /* renamed from: V */
    private InterfaceC0344r1 m1422V() {
        synchronized (this.f1314L) {
            if (this.f1315M == null) {
                return new C0340q1();
            }
            return new C0305h2(this.f1315M, this.f1327w, this.f1320p, this.f1321q);
        }
    }

    /* renamed from: W */
    private void m1423W(List<AbstractC0496y2> list) {
        for (AbstractC0496y2 abstractC0496y2 : list) {
            String m1410I = m1410I(abstractC0496y2);
            if (!this.f1312J.contains(m1410I)) {
                this.f1312J.add(m1410I);
                abstractC0496y2.m2297C();
            }
        }
    }

    /* renamed from: X */
    private void m1424X(List<AbstractC0496y2> list) {
        for (AbstractC0496y2 abstractC0496y2 : list) {
            String m1410I = m1410I(abstractC0496y2);
            if (this.f1312J.contains(m1410I)) {
                abstractC0496y2.mo1917D();
                this.f1312J.remove(m1410I);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: Y */
    private void m1425Y(boolean z10) {
        if (!z10) {
            this.f1326v.m1482d();
        }
        this.f1326v.m1481a();
        m1444D("Opening camera.");
        m1460g0(f.OPENING);
        try {
            this.f1319o.m18167e(this.f1327w.mo1569c(), this.f1320p, m1407C());
        } catch (SecurityException e10) {
            m1444D("Unable to open camera due to " + e10.getMessage());
            m1460g0(f.REOPENING);
            this.f1326v.m1483e();
        } catch (C4382f e11) {
            m1444D("Unable to open camera due to " + e11.getMessage());
            if (e11.m18120d() != 10001) {
                return;
            }
            m1462h0(f.INITIALIZED, AbstractC0473t.a.m2233b(7, e11));
        }
    }

    /* renamed from: a0 */
    private void m1426a0() {
        int i10 = c.f1334a[this.f1322r.ordinal()];
        if (i10 == 1 || i10 == 2) {
            m1469n0(false);
            return;
        }
        if (i10 != 3) {
            m1444D("open() ignored due to being in state: " + this.f1322r);
            return;
        }
        m1460g0(f.REOPENING);
        if (m1447K() || this.f1329y != 0) {
            return;
        }
        C0654h.m3470i(this.f1328x != null, "Camera Device should be open if session close is not complete");
        m1460g0(f.OPENED);
        m1448Z();
    }

    /* renamed from: e0 */
    private void m1427e0() {
        if (this.f1309G != null) {
            this.f1318n.m19622o(this.f1309G.m1359c() + this.f1309G.hashCode());
            this.f1318n.m19623p(this.f1309G.m1359c() + this.f1309G.hashCode());
            this.f1309G.m1358b();
            this.f1309G = null;
        }
    }

    /* renamed from: k0 */
    private Collection<h> m1428k0(Collection<AbstractC0496y2> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0496y2> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h.m1494b(it.next()));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private void m1429l0(Collection<h> collection) {
        Size mo1345d;
        boolean isEmpty = this.f1318n.m19617f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (h hVar : collection) {
            if (!this.f1318n.m19618i(hVar.mo1346e())) {
                this.f1318n.m19621n(hVar.mo1346e(), hVar.mo1344c());
                arrayList.add(hVar.mo1346e());
                if (hVar.mo1347f() == C0499z1.class && (mo1345d = hVar.mo1345d()) != null) {
                    rational = new Rational(mo1345d.getWidth(), mo1345d.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m1444D("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f1325u.m1720Z(true);
            this.f1325u.m1715H();
        }
        m1442x();
        m1471p0();
        m1458f0(false);
        if (this.f1322r == f.OPENED) {
            m1448Z();
        } else {
            m1426a0();
        }
        if (rational != null) {
            this.f1325u.m1722a0(rational);
        }
    }

    /* renamed from: m0 */
    public void m1415O(Collection<h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (h hVar : collection) {
            if (this.f1318n.m19618i(hVar.mo1346e())) {
                this.f1318n.m19619l(hVar.mo1346e());
                arrayList.add(hVar.mo1346e());
                if (hVar.mo1347f() == C0499z1.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m1444D("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f1325u.m1722a0(null);
        }
        m1442x();
        if (this.f1318n.m19617f().isEmpty()) {
            this.f1325u.m1737u();
            m1458f0(false);
            this.f1325u.m1720Z(false);
            this.f1330z = m1422V();
            m1405A();
            return;
        }
        m1471p0();
        m1458f0(false);
        if (this.f1322r == f.OPENED) {
            m1448Z();
        }
    }

    /* renamed from: w */
    private void m1441w() {
        if (this.f1309G != null) {
            this.f1318n.m19621n(this.f1309G.m1359c() + this.f1309G.hashCode(), this.f1309G.m1360e());
            this.f1318n.m19620m(this.f1309G.m1359c() + this.f1309G.hashCode(), this.f1309G.m1360e());
        }
    }

    /* renamed from: x */
    private void m1442x() {
        C5015c2 m19522b = this.f1318n.m19616e().m19522b();
        C5045k0 m19496g = m19522b.m19496g();
        int size = m19496g.m19584e().size();
        int size2 = m19522b.m19499j().size();
        if (m19522b.m19499j().isEmpty()) {
            return;
        }
        if (m19496g.m19584e().isEmpty()) {
            if (this.f1309G == null) {
                this.f1309G = new C0280c2(this.f1327w.m1574h(), this.f1317O);
            }
            m1441w();
        } else {
            if (size2 == 1 && size == 1) {
                m1427e0();
                return;
            }
            if (size >= 2) {
                m1427e0();
                return;
            }
            C0463q1.m2202a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    /* renamed from: y */
    private boolean m1443y(C5045k0.a aVar) {
        if (!aVar.m19599l().isEmpty()) {
            C0463q1.m2212k("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<C5015c2> it = this.f1318n.m19615d().iterator();
        while (it.hasNext()) {
            List<AbstractC5073r0> m19584e = it.next().m19496g().m19584e();
            if (!m19584e.isEmpty()) {
                Iterator<AbstractC5073r0> it2 = m19584e.iterator();
                while (it2.hasNext()) {
                    aVar.m19595f(it2.next());
                }
            }
        }
        if (!aVar.m19599l().isEmpty()) {
            return true;
        }
        C0463q1.m2212k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* renamed from: D */
    void m1444D(String str) {
        m1408E(str, null);
    }

    /* renamed from: F */
    C5015c2 m1445F(AbstractC5073r0 abstractC5073r0) {
        for (C5015c2 c5015c2 : this.f1318n.m19617f()) {
            if (c5015c2.m19499j().contains(abstractC5073r0)) {
                return c5015c2;
            }
        }
        return null;
    }

    /* renamed from: G */
    void m1446G() {
        C0654h.m3469h(this.f1322r == f.RELEASING || this.f1322r == f.CLOSING);
        C0654h.m3469h(this.f1305C.isEmpty());
        this.f1328x = null;
        if (this.f1322r == f.CLOSING) {
            m1460g0(f.INITIALIZED);
            return;
        }
        this.f1319o.m18169g(this.f1306D);
        m1460g0(f.RELEASED);
        C0541c.a<Void> aVar = this.f1304B;
        if (aVar != null) {
            aVar.m2519c(null);
            this.f1304B = null;
        }
    }

    /* renamed from: K */
    boolean m1447K() {
        return this.f1305C.isEmpty() && this.f1308F.isEmpty();
    }

    /* renamed from: Z */
    void m1448Z() {
        C0654h.m3469h(this.f1322r == f.OPENED);
        C5015c2.f m19616e = this.f1318n.m19616e();
        if (!m19616e.m19524d()) {
            m1444D("Unable to create capture session due to conflicting configurations");
        } else {
            C5586f.m20502b(this.f1330z.mo1518f(m19616e.m19522b(), (CameraDevice) C0654h.m3467f(this.f1328x), this.f1311I.m1798a()), new b(), this.f1320p);
        }
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: a */
    public void mo1449a(boolean z10) {
        this.f1320p.execute(new Runnable() { // from class: androidx.camera.camera2.internal.e0

            /* renamed from: o */
            public final /* synthetic */ boolean f1278o;

            public /* synthetic */ RunnableC0288e0(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0298g0.this.m1421U(r2);
            }
        });
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: b */
    public /* synthetic */ InterfaceC0465r mo1450b() {
        return C5013c0.m19488a(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.camera2.internal.f0.<init>(w.c2$c, w.c2):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: b0 */
    void m1451b0(p279w.C5015c2 r5) {
        /*
            r4 = this;
            java.util.concurrent.ScheduledExecutorService r0 = p292x.C5493a.m20222d()
            java.util.List r1 = r5.m19492c()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L27
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            w.c2$c r1 = (p279w.C5015c2.c) r1
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r3 = "Posting surface closed"
            r4.m1408E(r3, r2)
            androidx.camera.camera2.internal.f0 r2 = new androidx.camera.camera2.internal.f0
            r2.<init>()
            r0.execute(r2)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0298g0.m1451b0(w.c2):void");
    }

    @Override // androidx.camera.core.AbstractC0496y2.d
    /* renamed from: c */
    public void mo1452c(AbstractC0496y2 abstractC0496y2) {
        C0654h.m3467f(abstractC0496y2);
        this.f1320p.execute(new Runnable() { // from class: androidx.camera.camera2.internal.a0

            /* renamed from: o */
            public final /* synthetic */ String f1233o;

            /* renamed from: p */
            public final /* synthetic */ C5015c2 f1234p;

            public /* synthetic */ RunnableC0268a0(String str, C5015c2 c5015c2) {
                r2 = str;
                r3 = c5015c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0298g0.this.m1416P(r2, r3);
            }
        });
    }

    /* renamed from: c0 */
    public void m1414N(C0340q1 c0340q1, AbstractC5073r0 abstractC5073r0, Runnable runnable) {
        this.f1308F.remove(c0340q1);
        InterfaceFutureC2565m<Void> m1455d0 = m1455d0(c0340q1, false);
        abstractC5073r0.m19676c();
        C5586f.m20514n(Arrays.asList(m1455d0, abstractC5073r0.m19682i())).mo2501b(runnable, C5493a.m20219a());
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: d */
    public void mo1454d(Collection<AbstractC0496y2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f1325u.m1715H();
        m1423W(new ArrayList(arrayList));
        try {
            this.f1320p.execute(new Runnable() { // from class: androidx.camera.camera2.internal.c0

                /* renamed from: o */
                public final /* synthetic */ List f1256o;

                public /* synthetic */ RunnableC0278c0(List list) {
                    r2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0298g0.this.m1412L(r2);
                }
            });
        } catch (RejectedExecutionException e10) {
            m1408E("Unable to attach use cases.", e10);
            this.f1325u.m1737u();
        }
    }

    /* renamed from: d0 */
    InterfaceFutureC2565m<Void> m1455d0(InterfaceC0344r1 interfaceC0344r1, boolean z10) {
        interfaceC0344r1.close();
        InterfaceFutureC2565m<Void> mo1513a = interfaceC0344r1.mo1513a(z10);
        m1444D("Releasing session in state " + this.f1322r.name());
        this.f1305C.put(interfaceC0344r1, mo1513a);
        C5586f.m20502b(mo1513a, new a(interfaceC0344r1), C5493a.m20219a());
        return mo1513a;
    }

    @Override // androidx.camera.core.AbstractC0496y2.d
    /* renamed from: e */
    public void mo1456e(AbstractC0496y2 abstractC0496y2) {
        C0654h.m3467f(abstractC0496y2);
        this.f1320p.execute(new Runnable() { // from class: androidx.camera.camera2.internal.b0

            /* renamed from: o */
            public final /* synthetic */ String f1248o;

            /* renamed from: p */
            public final /* synthetic */ C5015c2 f1249p;

            public /* synthetic */ RunnableC0273b0(String str, C5015c2 c5015c2) {
                r2 = str;
                r3 = c5015c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0298g0.this.m1418R(r2, r3);
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.camera.camera2.internal.d0.<init>(androidx.camera.camera2.internal.g0, java.util.List):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // p279w.InterfaceC5017d0
    /* renamed from: f */
    public void mo1457f(java.util.Collection<androidx.camera.core.AbstractC0496y2> r3) {
        /*
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lc
            return
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Collection r1 = r2.m1428k0(r0)
            r3.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.m1424X(r1)
            java.util.concurrent.Executor r0 = r2.f1320p
            androidx.camera.camera2.internal.d0 r1 = new androidx.camera.camera2.internal.d0
            r1.<init>()
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0298g0.mo1457f(java.util.Collection):void");
    }

    /* renamed from: f0 */
    void m1458f0(boolean z10) {
        C0654h.m3469h(this.f1330z != null);
        m1444D("Resetting Capture Session");
        InterfaceC0344r1 interfaceC0344r1 = this.f1330z;
        C5015c2 mo1516d = interfaceC0344r1.mo1516d();
        List<C5045k0> mo1514b = interfaceC0344r1.mo1514b();
        InterfaceC0344r1 m1422V = m1422V();
        this.f1330z = m1422V;
        m1422V.mo1519g(mo1516d);
        this.f1330z.mo1515c(mo1514b);
        m1455d0(interfaceC0344r1, z10);
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: g */
    public void mo1459g(InterfaceC5078t interfaceC5078t) {
        if (interfaceC5078t == null) {
            interfaceC5078t = C5090x.m19721a();
        }
        InterfaceC5019d2 mo19697p = interfaceC5078t.mo19697p(null);
        this.f1313K = interfaceC5078t;
        synchronized (this.f1314L) {
            this.f1315M = mo19697p;
        }
        mo1468l().mo1723b(interfaceC5078t.mo19694C().booleanValue());
    }

    /* renamed from: g0 */
    void m1460g0(f fVar) {
        m1462h0(fVar, null);
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: h */
    public InterfaceC5009b0 mo1461h() {
        return this.f1327w;
    }

    /* renamed from: h0 */
    void m1462h0(f fVar, AbstractC0473t.a aVar) {
        m1464i0(fVar, aVar, true);
    }

    @Override // androidx.camera.core.AbstractC0496y2.d
    /* renamed from: i */
    public void mo1463i(AbstractC0496y2 abstractC0496y2) {
        C0654h.m3467f(abstractC0496y2);
        this.f1320p.execute(new Runnable() { // from class: androidx.camera.camera2.internal.y

            /* renamed from: o */
            public final /* synthetic */ String f1660o;

            public /* synthetic */ RunnableC0370y(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0298g0.this.m1417Q(r2);
            }
        });
    }

    /* renamed from: i0 */
    void m1464i0(f fVar, AbstractC0473t.a aVar, boolean z10) {
        InterfaceC5017d0.a aVar2;
        m1444D("Transitioning camera internal state: " + this.f1322r + " --> " + fVar);
        this.f1322r = fVar;
        switch (c.f1334a[fVar.ordinal()]) {
            case 1:
                aVar2 = InterfaceC5017d0.a.CLOSED;
                break;
            case 2:
                aVar2 = InterfaceC5017d0.a.PENDING_OPEN;
                break;
            case 3:
                aVar2 = InterfaceC5017d0.a.CLOSING;
                break;
            case 4:
                aVar2 = InterfaceC5017d0.a.OPEN;
                break;
            case 5:
            case 6:
                aVar2 = InterfaceC5017d0.a.OPENING;
                break;
            case 7:
                aVar2 = InterfaceC5017d0.a.RELEASING;
                break;
            case 8:
                aVar2 = InterfaceC5017d0.a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f1307E.m19557c(this, aVar2, z10);
        this.f1323s.m19638g(aVar2);
        this.f1324t.m1525c(aVar2, aVar);
    }

    @Override // androidx.camera.core.AbstractC0496y2.d
    /* renamed from: j */
    public void mo1465j(AbstractC0496y2 abstractC0496y2) {
        C0654h.m3467f(abstractC0496y2);
        this.f1320p.execute(new Runnable() { // from class: androidx.camera.camera2.internal.z

            /* renamed from: o */
            public final /* synthetic */ String f1673o;

            /* renamed from: p */
            public final /* synthetic */ C5015c2 f1674p;

            public /* synthetic */ RunnableC0374z(String str, C5015c2 c5015c2) {
                r2 = str;
                r3 = c5015c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0298g0.this.m1419S(r2, r3);
            }
        });
    }

    /* renamed from: j0 */
    void m1466j0(List<C5045k0> list) {
        ArrayList arrayList = new ArrayList();
        for (C5045k0 c5045k0 : list) {
            C5045k0.a m19589k = C5045k0.a.m19589k(c5045k0);
            if (c5045k0.m19586g() == 5 && c5045k0.m19582c() != null) {
                m19589k.m19601n(c5045k0.m19582c());
            }
            if (!c5045k0.m19584e().isEmpty() || !c5045k0.m19587h() || m1443y(m19589k)) {
                arrayList.add(m19589k.m19597h());
            }
        }
        m1444D("Issue capture request");
        this.f1330z.mo1515c(arrayList);
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: k */
    public InterfaceC5077s1<InterfaceC5017d0.a> mo1467k() {
        return this.f1323s;
    }

    @Override // p279w.InterfaceC5017d0
    /* renamed from: l */
    public InterfaceC5093y mo1468l() {
        return this.f1325u;
    }

    /* renamed from: n0 */
    void m1469n0(boolean z10) {
        m1444D("Attempting to force open the camera.");
        if (!this.f1307E.m19559f(this)) {
            m1444D("No cameras available. Waiting for available camera before opening camera.");
            m1460g0(f.PENDING_OPEN);
        } else {
            m1425Y(z10);
        }
    }

    /* renamed from: o0 */
    void m1470o0(boolean z10) {
        m1444D("Attempting to open the camera.");
        if (!(this.f1306D.m1476b() && this.f1307E.m19559f(this))) {
            m1444D("No cameras available. Waiting for available camera before opening camera.");
            m1460g0(f.PENDING_OPEN);
        } else {
            m1425Y(z10);
        }
    }

    /* renamed from: p0 */
    void m1471p0() {
        C5015c2.f m19614c = this.f1318n.m19614c();
        if (m19614c.m19524d()) {
            this.f1325u.m1724b0(m19614c.m19522b().m19500k());
            m19614c.m19521a(this.f1325u.m1741y());
            this.f1330z.mo1519g(m19614c.m19522b());
            return;
        }
        this.f1325u.m1719Y();
        this.f1330z.mo1519g(this.f1325u.m1741y());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f1327w.mo1569c());
    }

    /* renamed from: z */
    void m1472z(boolean z10) {
        C0654h.m3470i(this.f1322r == f.CLOSING || this.f1322r == f.RELEASING || (this.f1322r == f.REOPENING && this.f1329y != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f1322r + " (error: " + m1409H(this.f1329y) + ")");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 23 && i10 < 29 && m1411J() && this.f1329y == 0) {
            m1406B(z10);
        } else {
            m1458f0(z10);
        }
        this.f1330z.mo1517e();
    }
}
