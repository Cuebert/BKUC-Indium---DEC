package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0445m;
import androidx.camera.core.C0463q1;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p206q.C4288a;
import p218r.C4414z;
import p255u.C4757a;
import p255u.C4758b;
import p267v.C4929g;
import p267v.C4932j;
import p279w.AbstractC5032h;
import p279w.C5015c2;
import p279w.C5040j;
import p279w.C5043j2;
import p279w.C5045k0;
import p279w.C5095y1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5068q;
import p279w.InterfaceC5093y;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;

/* renamed from: androidx.camera.camera2.internal.t */
/* loaded from: classes.dex */
public class C0350t implements InterfaceC5093y {

    /* renamed from: b */
    final b f1566b;

    /* renamed from: c */
    final Executor f1567c;

    /* renamed from: d */
    private final Object f1568d = new Object();

    /* renamed from: e */
    private final C4414z f1569e;

    /* renamed from: f */
    private final InterfaceC5093y.c f1570f;

    /* renamed from: g */
    private final C5015c2.b f1571g;

    /* renamed from: h */
    private final C0376z1 f1572h;

    /* renamed from: i */
    private final C0377z2 f1573i;

    /* renamed from: j */
    private final C0373y2 f1574j;

    /* renamed from: k */
    private final C0364w1 f1575k;

    /* renamed from: l */
    InterfaceC0276b3 f1576l;

    /* renamed from: m */
    private final C4929g f1577m;

    /* renamed from: n */
    private final C0331o0 f1578n;

    /* renamed from: o */
    private int f1579o;

    /* renamed from: p */
    private volatile boolean f1580p;

    /* renamed from: q */
    private volatile int f1581q;

    /* renamed from: r */
    private final C4757a f1582r;

    /* renamed from: s */
    private final C4758b f1583s;

    /* renamed from: t */
    private final AtomicLong f1584t;

    /* renamed from: u */
    private volatile InterfaceFutureC2565m<Void> f1585u;

    /* renamed from: v */
    private int f1586v;

    /* renamed from: w */
    private long f1587w;

    /* renamed from: x */
    private final a f1588x;

    /* renamed from: androidx.camera.camera2.internal.t$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5032h {

        /* renamed from: a */
        Set<AbstractC5032h> f1589a = new HashSet();

        /* renamed from: b */
        Map<AbstractC5032h, Executor> f1590b = new ArrayMap();

        a() {
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: a */
        public void mo1638a() {
            for (AbstractC5032h abstractC5032h : this.f1589a) {
                try {
                    this.f1590b.get(abstractC5032h).execute(new Runnable() { // from class: androidx.camera.camera2.internal.q
                        public /* synthetic */ RunnableC0338q() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5032h.this.mo1638a();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C0463q1.m2205d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            for (AbstractC5032h abstractC5032h : this.f1589a) {
                try {
                    this.f1590b.get(abstractC5032h).execute(new Runnable() { // from class: androidx.camera.camera2.internal.s

                        /* renamed from: o */
                        public final /* synthetic */ InterfaceC5068q f1562o;

                        public /* synthetic */ RunnableC0346s(InterfaceC5068q interfaceC5068q2) {
                            r2 = interfaceC5068q2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5032h.this.mo1399b(r2);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C0463q1.m2205d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: c */
        public void mo1639c(C5040j c5040j) {
            for (AbstractC5032h abstractC5032h : this.f1589a) {
                try {
                    this.f1590b.get(abstractC5032h).execute(new Runnable() { // from class: androidx.camera.camera2.internal.r

                        /* renamed from: o */
                        public final /* synthetic */ C5040j f1558o;

                        public /* synthetic */ RunnableC0342r(C5040j c5040j2) {
                            r2 = c5040j2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5032h.this.mo1639c(r2);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C0463q1.m2205d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* renamed from: g */
        void m1749g(Executor executor, AbstractC5032h abstractC5032h) {
            this.f1589a.add(abstractC5032h);
            this.f1590b.put(abstractC5032h, executor);
        }

        /* renamed from: k */
        void m1750k(AbstractC5032h abstractC5032h) {
            this.f1589a.remove(abstractC5032h);
            this.f1590b.remove(abstractC5032h);
        }
    }

    /* renamed from: androidx.camera.camera2.internal.t$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<c> f1591a = new HashSet();

        /* renamed from: b */
        private final Executor f1592b;

        b(Executor executor) {
            this.f1592b = executor;
        }

        /* renamed from: c */
        public /* synthetic */ void m1752c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f1591a) {
                if (cVar.mo1400a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f1591a.removeAll(hashSet);
        }

        /* renamed from: b */
        void m1753b(c cVar) {
            this.f1591a.add(cVar);
        }

        /* renamed from: d */
        void m1754d(c cVar) {
            this.f1591a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1592b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u

                /* renamed from: o */
                public final /* synthetic */ TotalCaptureResult f1604o;

                public /* synthetic */ RunnableC0354u(TotalCaptureResult totalCaptureResult2) {
                    r2 = totalCaptureResult2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0350t.b.this.m1752c(r2);
                }
            });
        }
    }

    /* renamed from: androidx.camera.camera2.internal.t$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        boolean mo1400a(TotalCaptureResult totalCaptureResult);
    }

    public C0350t(C4414z c4414z, ScheduledExecutorService scheduledExecutorService, Executor executor, InterfaceC5093y.c cVar, C5095y1 c5095y1) {
        C5015c2.b bVar = new C5015c2.b();
        this.f1571g = bVar;
        this.f1579o = 0;
        this.f1580p = false;
        this.f1581q = 2;
        this.f1583s = new C4758b();
        this.f1584t = new AtomicLong(0L);
        this.f1585u = C5586f.m20508h(null);
        this.f1586v = 1;
        this.f1587w = 0L;
        a aVar = new a();
        this.f1588x = aVar;
        this.f1569e = c4414z;
        this.f1570f = cVar;
        this.f1567c = executor;
        b bVar2 = new b(executor);
        this.f1566b = bVar2;
        bVar.m19519s(this.f1586v);
        bVar.m19510i(C0320l1.m1602d(bVar2));
        bVar.m19510i(aVar);
        this.f1575k = new C0364w1(this, c4414z, executor);
        this.f1572h = new C0376z1(this, scheduledExecutorService, executor, c5095y1);
        this.f1573i = new C0377z2(this, c4414z, executor);
        this.f1574j = new C0373y2(this, c4414z, executor);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1576l = new C0291e3(c4414z);
        } else {
            this.f1576l = new C0296f3();
        }
        this.f1582r = new C4757a(c5095y1);
        this.f1577m = new C4929g(this, executor);
        this.f1578n = new C0331o0(this, c4414z, c5095y1, executor);
        executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k
            public /* synthetic */ RunnableC0314k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0350t.this.m1691P();
            }
        });
    }

    /* renamed from: C */
    private int m1684C(int i10) {
        int[] iArr = (int[]) this.f1569e.m18192a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m1686J(i10, iArr) ? i10 : m1686J(1, iArr) ? 1 : 0;
    }

    /* renamed from: I */
    private boolean m1685I() {
        return m1712E() > 0;
    }

    /* renamed from: J */
    private boolean m1686J(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m1687K(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C5043j2) && (l10 = (Long) ((C5043j2) tag).m19578c("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    /* renamed from: M */
    public static /* synthetic */ void m1688M() {
    }

    /* renamed from: N */
    public /* synthetic */ void m1689N(Executor executor, AbstractC5032h abstractC5032h) {
        this.f1588x.m1749g(executor, abstractC5032h);
    }

    /* renamed from: O */
    public static /* synthetic */ void m1690O() {
    }

    /* renamed from: P */
    public /* synthetic */ void m1691P() {
        m1735s(this.f1577m.m19346l());
    }

    /* renamed from: Q */
    public /* synthetic */ void m1692Q(AbstractC5032h abstractC5032h) {
        this.f1588x.m1750k(abstractC5032h);
    }

    /* renamed from: R */
    public /* synthetic */ InterfaceFutureC2565m m1693R(List list, int i10, int i11, int i12, Void r52) throws Exception {
        return this.f1578n.m1609d(list, i10, i11, i12);
    }

    /* renamed from: S */
    public /* synthetic */ void m1694S(C0541c.a aVar) {
        C5586f.m20511k(m1698g0(m1732f0()), aVar);
    }

    /* renamed from: T */
    public /* synthetic */ Object m1695T(C0541c.a aVar) throws Exception {
        this.f1567c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.l

            /* renamed from: o */
            public final /* synthetic */ C0541c.a f1451o;

            public /* synthetic */ RunnableC0318l(C0541c.a aVar2) {
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0350t.this.m1694S(r2);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* renamed from: U */
    public static /* synthetic */ boolean m1696U(long j10, C0541c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m1687K(totalCaptureResult, j10)) {
            return false;
        }
        aVar.m2519c(null);
        return true;
    }

    /* renamed from: V */
    public /* synthetic */ Object m1697V(long j10, C0541c.a aVar) throws Exception {
        m1735s(new c() { // from class: androidx.camera.camera2.internal.f

            /* renamed from: a */
            public final /* synthetic */ long f1292a;

            /* renamed from: b */
            public final /* synthetic */ C0541c.a f1293b;

            public /* synthetic */ C0292f(long j102, C0541c.a aVar2) {
                r1 = j102;
                r3 = aVar2;
            }

            @Override // androidx.camera.camera2.internal.C0350t.c
            /* renamed from: a */
            public final boolean mo1400a(TotalCaptureResult totalCaptureResult) {
                boolean m1696U;
                m1696U = C0350t.m1696U(r1, r3, totalCaptureResult);
                return m1696U;
            }
        });
        return "waitForSessionUpdateId:" + j102;
    }

    /* renamed from: g0 */
    private InterfaceFutureC2565m<Void> m1698g0(long j10) {
        return C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.i

            /* renamed from: b */
            public final /* synthetic */ long f1398b;

            public /* synthetic */ C0306i(long j102) {
                r2 = j102;
            }

            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m1697V;
                m1697V = C0350t.this.m1697V(r2, aVar);
                return m1697V;
            }
        });
    }

    /* renamed from: A */
    public int m1709A(int i10) {
        int[] iArr = (int[]) this.f1569e.m18192a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m1686J(i10, iArr) ? i10 : m1686J(1, iArr) ? 1 : 0;
    }

    /* renamed from: B */
    public int m1710B(int i10) {
        int[] iArr = (int[]) this.f1569e.m18192a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m1686J(i10, iArr)) {
            return i10;
        }
        if (m1686J(4, iArr)) {
            return 4;
        }
        return m1686J(1, iArr) ? 1 : 0;
    }

    /* renamed from: D */
    public C0373y2 m1711D() {
        return this.f1574j;
    }

    /* renamed from: E */
    int m1712E() {
        int i10;
        synchronized (this.f1568d) {
            i10 = this.f1579o;
        }
        return i10;
    }

    /* renamed from: F */
    public C0377z2 m1713F() {
        return this.f1573i;
    }

    /* renamed from: G */
    public InterfaceC0276b3 m1714G() {
        return this.f1576l;
    }

    /* renamed from: H */
    public void m1715H() {
        synchronized (this.f1568d) {
            this.f1579o++;
        }
    }

    /* renamed from: L */
    public boolean m1716L() {
        return this.f1580p;
    }

    /* renamed from: W */
    public void m1717W(c cVar) {
        this.f1566b.m1754d(cVar);
    }

    /* renamed from: X */
    public void m1718X(AbstractC5032h abstractC5032h) {
        this.f1567c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.n

            /* renamed from: o */
            public final /* synthetic */ AbstractC5032h f1462o;

            public /* synthetic */ RunnableC0326n(AbstractC5032h abstractC5032h2) {
                r2 = abstractC5032h2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0350t.this.m1692Q(r2);
            }
        });
    }

    /* renamed from: Y */
    public void m1719Y() {
        m1724b0(1);
    }

    /* renamed from: Z */
    public void m1720Z(boolean z10) {
        this.f1572h.m1828l(z10);
        this.f1573i.m1839f(z10);
        this.f1574j.m1810e(z10);
        this.f1575k.m1800b(z10);
        this.f1577m.m19347s(z10);
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: a */
    public void mo1721a(Size size, C5015c2.b bVar) {
        this.f1576l.mo1350a(size, bVar);
    }

    /* renamed from: a0 */
    public void m1722a0(Rational rational) {
        this.f1572h.m1829m(rational);
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: b */
    public void mo1723b(boolean z10) {
        this.f1576l.mo1351b(z10);
    }

    /* renamed from: b0 */
    public void m1724b0(int i10) {
        this.f1586v = i10;
        this.f1572h.m1830n(i10);
        this.f1578n.m1608c(this.f1586v);
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: c */
    public InterfaceC5061o0 mo1725c() {
        return this.f1577m.m19345k();
    }

    /* renamed from: c0 */
    public void m1726c0(List<C5045k0> list) {
        this.f1570f.mo1478b(list);
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: d */
    public InterfaceFutureC2565m<List<Void>> mo1727d(List<C5045k0> list, int i10, int i11) {
        if (!m1685I()) {
            C0463q1.m2212k("Camera2CameraControlImp", "Camera is not active.");
            return C5586f.m20506f(new C0445m("Camera is not active."));
        }
        return C5584d.m20496a(this.f1585u).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.g

            /* renamed from: b */
            public final /* synthetic */ List f1299b;

            /* renamed from: c */
            public final /* synthetic */ int f1300c;

            /* renamed from: d */
            public final /* synthetic */ int f1301d;

            /* renamed from: e */
            public final /* synthetic */ int f1302e;

            public /* synthetic */ C0297g(List list2, int i102, int i12, int i112) {
                r2 = list2;
                r3 = i102;
                r4 = i12;
                r5 = i112;
            }

            @Override // p305y.InterfaceC5581a
            /* renamed from: a */
            public final InterfaceFutureC2565m mo1404a(Object obj) {
                InterfaceFutureC2565m m1693R;
                m1693R = C0350t.this.m1693R(r2, r3, r4, r5, (Void) obj);
                return m1693R;
            }
        }, this.f1567c);
    }

    /* renamed from: d0 */
    public void m1728d0() {
        this.f1567c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.j
            public /* synthetic */ RunnableC0310j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0350t.this.m1732f0();
            }
        });
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: e */
    public void mo1729e() {
        this.f1577m.m19344i().mo2501b(RunnableC0330o.f1467n, C5493a.m20219a());
    }

    /* renamed from: e0 */
    InterfaceFutureC2565m<Void> m1730e0() {
        return C5586f.m20510j(C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.h
            public /* synthetic */ C0302h() {
            }

            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m1695T;
                m1695T = C0350t.this.m1695T(aVar);
                return m1695T;
            }
        }));
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: f */
    public void mo1731f(InterfaceC5061o0 interfaceC5061o0) {
        this.f1577m.m19343g(C4932j.a.m19350e(interfaceC5061o0).m19352d()).mo2501b(RunnableC0334p.f1504n, C5493a.m20219a());
    }

    /* renamed from: f0 */
    public long m1732f0() {
        this.f1587w = this.f1584t.getAndIncrement();
        this.f1570f.mo1477a();
        return this.f1587w;
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: g */
    public Rect mo1733g() {
        return (Rect) C0654h.m3467f((Rect) this.f1569e.m18192a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // p279w.InterfaceC5093y
    /* renamed from: h */
    public void mo1734h(int i10) {
        if (!m1685I()) {
            C0463q1.m2212k("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.f1581q = i10;
            this.f1585u = m1730e0();
        }
    }

    /* renamed from: s */
    public void m1735s(c cVar) {
        this.f1566b.m1753b(cVar);
    }

    /* renamed from: t */
    public void m1736t(Executor executor, AbstractC5032h abstractC5032h) {
        this.f1567c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m

            /* renamed from: o */
            public final /* synthetic */ Executor f1456o;

            /* renamed from: p */
            public final /* synthetic */ AbstractC5032h f1457p;

            public /* synthetic */ RunnableC0322m(Executor executor2, AbstractC5032h abstractC5032h2) {
                r2 = executor2;
                r3 = abstractC5032h2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0350t.this.m1689N(r2, r3);
            }
        });
    }

    /* renamed from: u */
    public void m1737u() {
        synchronized (this.f1568d) {
            int i10 = this.f1579o;
            if (i10 != 0) {
                this.f1579o = i10 - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* renamed from: v */
    public void m1738v(boolean z10) {
        this.f1580p = z10;
        if (!z10) {
            C5045k0.a aVar = new C5045k0.a();
            aVar.m19603p(this.f1586v);
            aVar.m19604q(true);
            C4288a.a aVar2 = new C4288a.a();
            aVar2.m17775e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m1709A(1)));
            aVar2.m17775e(CaptureRequest.FLASH_MODE, 0);
            aVar.m19594e(aVar2.m17773c());
            m1726c0(Collections.singletonList(aVar.m19597h()));
        }
        m1732f0();
    }

    /* renamed from: w */
    public int m1739w() {
        return this.f1581q;
    }

    /* renamed from: x */
    public C0376z1 m1740x() {
        return this.f1572h;
    }

    /* renamed from: y */
    public C5015c2 m1741y() {
        this.f1571g.m19519s(this.f1586v);
        this.f1571g.m19517q(m1742z());
        Object m17767K = this.f1577m.m19345k().m17767K(null);
        if (m17767K != null && (m17767K instanceof Integer)) {
            this.f1571g.m19513l("Camera2CameraControl", m17767K);
        }
        this.f1571g.m19513l("CameraControlSessionUpdateId", Long.valueOf(this.f1587w));
        return this.f1571g.m19514m();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0070 A[LOOP:0: B:6:0x006a->B:8:0x0070, LOOP_END] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p279w.InterfaceC5061o0 m1742z() {
        /*
            r7 = this;
            q.a$a r0 = new q.a$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.m17775e(r1, r3)
            androidx.camera.camera2.internal.z1 r1 = r7.f1572h
            r1.m1823b(r0)
            u.a r1 = r7.f1582r
            r1.m18933a(r0)
            androidx.camera.camera2.internal.z2 r1 = r7.f1573i
            r1.m1837a(r0)
            boolean r1 = r7.f1580p
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.m17775e(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f1581q
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = 1
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            u.b r1 = r7.f1583s
            int r1 = r1.m18934a(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.m1709A(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.m17775e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.m1684C(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.m17775e(r1, r2)
            androidx.camera.camera2.internal.w1 r1 = r7.f1575k
            r1.m1801c(r0)
            v.g r1 = r7.f1577m
            q.a r1 = r1.m19345k()
            java.util.Set r2 = r1.mo1367c()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            w.o0$a r3 = (p279w.InterfaceC5061o0.a) r3
            w.p1 r4 = r0.mo1926a()
            w.o0$c r5 = p279w.InterfaceC5061o0.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.mo1366b(r3)
            r4.mo19658G(r3, r5, r6)
            goto L6a
        L84:
            q.a r0 = r0.m17773c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0350t.m1742z():w.o0");
    }
}
