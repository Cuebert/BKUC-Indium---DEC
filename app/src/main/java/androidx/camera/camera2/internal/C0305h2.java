package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.camera.core.C0401e1;
import androidx.camera.core.C0450n0;
import androidx.camera.core.C0463q1;
import androidx.camera.core.C0499z1;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p169n.InterfaceC4005a;
import p206q.C4288a;
import p267v.C4932j;
import p279w.AbstractC5032h;
import p279w.AbstractC5073r0;
import p279w.AbstractC5086v1;
import p279w.C5015c2;
import p279w.C5023e2;
import p279w.C5045k0;
import p279w.C5088w0;
import p279w.InterfaceC5019d2;
import p279w.InterfaceC5061o0;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.h2 */
/* loaded from: classes.dex */
public final class C0305h2 implements InterfaceC0344r1 {

    /* renamed from: r */
    private static List<AbstractC5073r0> f1366r = new ArrayList();

    /* renamed from: s */
    private static int f1367s = 0;

    /* renamed from: a */
    private final InterfaceC5019d2 f1368a;

    /* renamed from: b */
    private final C0311j0 f1369b;

    /* renamed from: c */
    final Executor f1370c;

    /* renamed from: d */
    private final ScheduledExecutorService f1371d;

    /* renamed from: g */
    private C5015c2 f1374g;

    /* renamed from: h */
    private C0274b1 f1375h;

    /* renamed from: i */
    private C5015c2 f1376i;

    /* renamed from: n */
    private final e f1381n;

    /* renamed from: q */
    private int f1384q;

    /* renamed from: f */
    private List<AbstractC5073r0> f1373f = new ArrayList();

    /* renamed from: j */
    private boolean f1377j = false;

    /* renamed from: l */
    private volatile C5045k0 f1379l = null;

    /* renamed from: m */
    volatile boolean f1380m = false;

    /* renamed from: o */
    private C4932j f1382o = new C4932j.a().m19352d();

    /* renamed from: p */
    private C4932j f1383p = new C4932j.a().m19352d();

    /* renamed from: e */
    private final C0340q1 f1372e = new C0340q1();

    /* renamed from: k */
    private d f1378k = d.UNINITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.h2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {
        a() {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            C0463q1.m2205d("ProcessingCaptureSession", "open session failed ", th);
            C0305h2.this.close();
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.h2$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC5019d2.a {

        /* renamed from: a */
        final /* synthetic */ C5045k0 f1386a;

        b(C5045k0 c5045k0) {
            this.f1386a = c5045k0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.h2$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1388a;

        static {
            int[] iArr = new int[d.values().length];
            f1388a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1388a[d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1388a[d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1388a[d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1388a[d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.camera2.internal.h2$d */
    /* loaded from: classes.dex */
    public enum d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.camera2.internal.h2$e */
    /* loaded from: classes.dex */
    public static class e implements InterfaceC5019d2.a {

        /* renamed from: a */
        private List<AbstractC5032h> f1395a = Collections.emptyList();

        /* renamed from: b */
        private final Executor f1396b;

        e(Executor executor) {
            this.f1396b = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0305h2(InterfaceC5019d2 interfaceC5019d2, C0311j0 c0311j0, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f1384q = 0;
        this.f1368a = interfaceC5019d2;
        this.f1369b = c0311j0;
        this.f1370c = executor;
        this.f1371d = scheduledExecutorService;
        this.f1381n = new e(executor);
        int i10 = f1367s;
        f1367s = i10 + 1;
        this.f1384q = i10;
        C0463q1.m2202a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f1384q + ")");
    }

    /* renamed from: l */
    private static void m1505l(List<C5045k0> list) {
        Iterator<C5045k0> it = list.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC5032h> it2 = it.next().m19581b().iterator();
            while (it2.hasNext()) {
                it2.next().mo1638a();
            }
        }
    }

    /* renamed from: m */
    private static List<C5023e2> m1506m(List<AbstractC5073r0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5073r0 abstractC5073r0 : list) {
            C0654h.m3463b(abstractC5073r0 instanceof C5023e2, "Surface must be SessionProcessorSurface");
            arrayList.add((C5023e2) abstractC5073r0);
        }
        return arrayList;
    }

    /* renamed from: n */
    private boolean m1507n(List<C5045k0> list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator<C5045k0> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m19586g() != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m1508o() {
        C5088w0.m19710e(this.f1373f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ void m1509p(AbstractC5073r0 abstractC5073r0) {
        f1366r.remove(abstractC5073r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ InterfaceFutureC2565m m1510q(C5015c2 c5015c2, CameraDevice cameraDevice, C0361v2 c0361v2, List list) throws Exception {
        C0463q1.m2202a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f1384q + ")");
        if (this.f1378k == d.CLOSED) {
            return C5586f.m20506f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC5086v1 abstractC5086v1 = null;
        if (list.contains(null)) {
            return C5586f.m20506f(new AbstractC5073r0.a("Surface closed", c5015c2.m19499j().get(list.indexOf(null))));
        }
        try {
            C5088w0.m19711f(this.f1373f);
            AbstractC5086v1 abstractC5086v12 = null;
            AbstractC5086v1 abstractC5086v13 = null;
            for (int i10 = 0; i10 < c5015c2.m19499j().size(); i10++) {
                AbstractC5073r0 abstractC5073r0 = c5015c2.m19499j().get(i10);
                if (Objects.equals(abstractC5073r0.m19678e(), C0499z1.class)) {
                    abstractC5086v1 = AbstractC5086v1.m19705a(abstractC5073r0.m19681h().get(), new Size(abstractC5073r0.m19679f().getWidth(), abstractC5073r0.m19679f().getHeight()), abstractC5073r0.m19680g());
                } else if (Objects.equals(abstractC5073r0.m19678e(), C0401e1.class)) {
                    abstractC5086v12 = AbstractC5086v1.m19705a(abstractC5073r0.m19681h().get(), new Size(abstractC5073r0.m19679f().getWidth(), abstractC5073r0.m19679f().getHeight()), abstractC5073r0.m19680g());
                } else if (Objects.equals(abstractC5073r0.m19678e(), C0450n0.class)) {
                    abstractC5086v13 = AbstractC5086v1.m19705a(abstractC5073r0.m19681h().get(), new Size(abstractC5073r0.m19679f().getWidth(), abstractC5073r0.m19679f().getHeight()), abstractC5073r0.m19680g());
                }
            }
            this.f1378k = d.SESSION_INITIALIZED;
            C0463q1.m2212k("ProcessingCaptureSession", "== initSession (id=" + this.f1384q + ")");
            C5015c2 m19529a = this.f1368a.m19529a(this.f1369b, abstractC5086v1, abstractC5086v12, abstractC5086v13);
            this.f1376i = m19529a;
            m19529a.m19499j().get(0).m19682i().mo2501b(new Runnable() { // from class: androidx.camera.camera2.internal.d2
                @Override // java.lang.Runnable
                public final void run() {
                    C0305h2.this.m1508o();
                }
            }, C5493a.m20219a());
            for (final AbstractC5073r0 abstractC5073r02 : this.f1376i.m19499j()) {
                f1366r.add(abstractC5073r02);
                abstractC5073r02.m19682i().mo2501b(new Runnable() { // from class: androidx.camera.camera2.internal.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0305h2.m1509p(AbstractC5073r0.this);
                    }
                }, this.f1370c);
            }
            C5015c2.f fVar = new C5015c2.f();
            fVar.m19521a(c5015c2);
            fVar.m19523c();
            fVar.m19521a(this.f1376i);
            C0654h.m3463b(fVar.m19524d(), "Cannot transform the SessionConfig");
            InterfaceFutureC2565m<Void> mo1518f = this.f1372e.mo1518f(fVar.m19522b(), (CameraDevice) C0654h.m3467f(cameraDevice), c0361v2);
            C5586f.m20502b(mo1518f, new a(), this.f1370c);
            return mo1518f;
        } catch (AbstractC5073r0.a e10) {
            return C5586f.m20506f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Void m1511r(Void r12) {
        m1520s(this.f1372e);
        return null;
    }

    /* renamed from: t */
    private void m1512t(C4932j c4932j, C4932j c4932j2) {
        C4288a.a aVar = new C4288a.a();
        aVar.m17774d(c4932j);
        aVar.m17774d(c4932j2);
        this.f1368a.m19532d(aVar.m17773c());
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: a */
    public InterfaceFutureC2565m<Void> mo1513a(boolean z10) {
        C0654h.m3470i(this.f1378k == d.CLOSED, "release() can only be called in CLOSED state");
        C0463q1.m2202a("ProcessingCaptureSession", "release (id=" + this.f1384q + ")");
        return this.f1372e.mo1513a(z10);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: b */
    public List<C5045k0> mo1514b() {
        return this.f1379l != null ? Arrays.asList(this.f1379l) : Collections.emptyList();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: c */
    public void mo1515c(List<C5045k0> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() <= 1 && m1507n(list)) {
            if (this.f1379l == null && !this.f1380m) {
                C5045k0 c5045k0 = list.get(0);
                C0463q1.m2202a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f1384q + ") + state =" + this.f1378k);
                int i10 = c.f1388a[this.f1378k.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    this.f1379l = c5045k0;
                    return;
                }
                if (i10 != 3) {
                    if (i10 == 4 || i10 == 5) {
                        C0463q1.m2202a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f1378k);
                        m1505l(list);
                        return;
                    }
                    return;
                }
                this.f1380m = true;
                C4932j.a m19350e = C4932j.a.m19350e(c5045k0.m19583d());
                InterfaceC5061o0 m19583d = c5045k0.m19583d();
                InterfaceC5061o0.a<Integer> aVar = C5045k0.f19211h;
                if (m19583d.mo1369e(aVar)) {
                    m19350e.m19353g(CaptureRequest.JPEG_ORIENTATION, (Integer) c5045k0.m19583d().mo1366b(aVar));
                }
                InterfaceC5061o0 m19583d2 = c5045k0.m19583d();
                InterfaceC5061o0.a<Integer> aVar2 = C5045k0.f19212i;
                if (m19583d2.mo1369e(aVar2)) {
                    m19350e.m19353g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c5045k0.m19583d().mo1366b(aVar2)).byteValue()));
                }
                C4932j m19352d = m19350e.m19352d();
                this.f1383p = m19352d;
                m1512t(this.f1382o, m19352d);
                this.f1368a.m19533e(new b(c5045k0));
                return;
            }
            m1505l(list);
            return;
        }
        m1505l(list);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    public void close() {
        C0463q1.m2202a("ProcessingCaptureSession", "close (id=" + this.f1384q + ") state=" + this.f1378k);
        int i10 = c.f1388a[this.f1378k.ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                this.f1368a.m19534f();
                C0274b1 c0274b1 = this.f1375h;
                if (c0274b1 != null) {
                    c0274b1.m1348a();
                }
                this.f1378k = d.ON_CAPTURE_SESSION_ENDED;
            } else if (i10 != 4) {
                if (i10 == 5) {
                    return;
                }
                this.f1378k = d.CLOSED;
                this.f1372e.close();
            }
        }
        this.f1368a.m19535g();
        this.f1378k = d.CLOSED;
        this.f1372e.close();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: d */
    public C5015c2 mo1516d() {
        return this.f1374g;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: e */
    public void mo1517e() {
        C0463q1.m2202a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f1384q + ")");
        if (this.f1379l != null) {
            Iterator<AbstractC5032h> it = this.f1379l.m19581b().iterator();
            while (it.hasNext()) {
                it.next().mo1638a();
            }
            this.f1379l = null;
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: f */
    public InterfaceFutureC2565m<Void> mo1518f(final C5015c2 c5015c2, final CameraDevice cameraDevice, final C0361v2 c0361v2) {
        C0654h.m3463b(this.f1378k == d.UNINITIALIZED, "Invalid state state:" + this.f1378k);
        C0654h.m3463b(c5015c2.m19499j().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C0463q1.m2202a("ProcessingCaptureSession", "open (id=" + this.f1384q + ")");
        List<AbstractC5073r0> m19499j = c5015c2.m19499j();
        this.f1373f = m19499j;
        return C5584d.m20496a(C5088w0.m19716k(m19499j, false, 5000L, this.f1370c, this.f1371d)).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.g2
            @Override // p305y.InterfaceC5581a
            /* renamed from: a */
            public final InterfaceFutureC2565m mo1404a(Object obj) {
                InterfaceFutureC2565m m1510q;
                m1510q = C0305h2.this.m1510q(c5015c2, cameraDevice, c0361v2, (List) obj);
                return m1510q;
            }
        }, this.f1370c).m20499e(new InterfaceC4005a() { // from class: androidx.camera.camera2.internal.f2
            @Override // p169n.InterfaceC4005a
            /* renamed from: a */
            public final Object mo1403a(Object obj) {
                Void m1511r;
                m1511r = C0305h2.this.m1511r((Void) obj);
                return m1511r;
            }
        }, this.f1370c);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: g */
    public void mo1519g(C5015c2 c5015c2) {
        C0463q1.m2202a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f1384q + ")");
        this.f1374g = c5015c2;
        if (c5015c2 == null) {
            return;
        }
        C0274b1 c0274b1 = this.f1375h;
        if (c0274b1 != null) {
            c0274b1.m1349b(c5015c2);
        }
        if (this.f1378k == d.ON_CAPTURE_SESSION_STARTED) {
            C4932j m19352d = C4932j.a.m19350e(c5015c2.m19493d()).m19352d();
            this.f1382o = m19352d;
            m1512t(m19352d, this.f1383p);
            if (this.f1377j) {
                return;
            }
            this.f1368a.m19530b(this.f1381n);
            this.f1377j = true;
        }
    }

    /* renamed from: s */
    void m1520s(C0340q1 c0340q1) {
        C0654h.m3463b(this.f1378k == d.SESSION_INITIALIZED, "Invalid state state:" + this.f1378k);
        C0274b1 c0274b1 = new C0274b1(c0340q1, m1506m(this.f1376i.m19499j()));
        this.f1375h = c0274b1;
        this.f1368a.m19531c(c0274b1);
        this.f1378k = d.ON_CAPTURE_SESSION_STARTED;
        C5015c2 c5015c2 = this.f1374g;
        if (c5015c2 != null) {
            mo1519g(c5015c2);
        }
        if (this.f1379l != null) {
            List<C5045k0> asList = Arrays.asList(this.f1379l);
            this.f1379l = null;
            mo1515c(asList);
        }
    }
}
