package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0331o0;
import androidx.camera.camera2.internal.C0350t;
import androidx.camera.core.C0415h1;
import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0443l1;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p169n.InterfaceC4005a;
import p206q.C4288a;
import p218r.C4414z;
import p255u.C4768l;
import p255u.C4774r;
import p279w.AbstractC5032h;
import p279w.C5040j;
import p279w.C5045k0;
import p279w.C5072r;
import p279w.C5095y1;
import p279w.EnumC5044k;
import p279w.EnumC5048l;
import p279w.EnumC5052m;
import p279w.EnumC5056n;
import p279w.InterfaceC5068q;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.o0 */
/* loaded from: classes.dex */
public class C0331o0 {

    /* renamed from: a */
    private final C0350t f1468a;

    /* renamed from: b */
    private final C4774r f1469b;

    /* renamed from: c */
    private final C5095y1 f1470c;

    /* renamed from: d */
    private final Executor f1471d;

    /* renamed from: e */
    private final boolean f1472e;

    /* renamed from: f */
    private int f1473f = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.o0$a */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a */
        private final C0350t f1474a;

        /* renamed from: b */
        private final C4768l f1475b;

        /* renamed from: c */
        private final int f1476c;

        /* renamed from: d */
        private boolean f1477d = false;

        a(C0350t c0350t, int i10, C4768l c4768l) {
            this.f1474a = c0350t;
            this.f1476c = i10;
            this.f1475b = c4768l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m1612f(C0541c.a aVar) throws Exception {
            this.f1474a.m1740x().m1831p(aVar);
            this.f1475b.m18949b();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ Boolean m1613g(Void r02) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: a */
        public boolean mo1614a() {
            return this.f1476c == 0;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: b */
        public InterfaceFutureC2565m<Boolean> mo1615b(TotalCaptureResult totalCaptureResult) {
            if (C0331o0.m1606a(this.f1476c, totalCaptureResult)) {
                C0463q1.m2202a("Camera2CapturePipeline", "Trigger AE");
                this.f1477d = true;
                return C5584d.m20496a(C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.m0
                    @Override // androidx.concurrent.futures.C0541c.c
                    /* renamed from: a */
                    public final Object mo1498a(C0541c.a aVar) {
                        Object m1612f;
                        m1612f = C0331o0.a.this.m1612f(aVar);
                        return m1612f;
                    }
                })).m20499e(new InterfaceC4005a() { // from class: androidx.camera.camera2.internal.n0
                    @Override // p169n.InterfaceC4005a
                    /* renamed from: a */
                    public final Object mo1403a(Object obj) {
                        Boolean m1613g;
                        m1613g = C0331o0.a.m1613g((Void) obj);
                        return m1613g;
                    }
                }, C5493a.m20219a());
            }
            return C5586f.m20508h(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: c */
        public void mo1616c() {
            if (this.f1477d) {
                C0463q1.m2202a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f1474a.m1740x().m1824c(false, true);
                this.f1475b.m18948a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.o0$b */
    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: a */
        private final C0350t f1478a;

        /* renamed from: b */
        private boolean f1479b = false;

        b(C0350t c0350t) {
            this.f1478a = c0350t;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: a */
        public boolean mo1614a() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: b */
        public InterfaceFutureC2565m<Boolean> mo1615b(TotalCaptureResult totalCaptureResult) {
            Integer num;
            InterfaceFutureC2565m<Boolean> m20508h = C5586f.m20508h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return m20508h;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C0463q1.m2202a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C0463q1.m2202a("Camera2CapturePipeline", "Trigger AF");
                    this.f1479b = true;
                    this.f1478a.m1740x().m1832q(null, false);
                }
            }
            return m20508h;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: c */
        public void mo1616c() {
            if (this.f1479b) {
                C0463q1.m2202a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f1478a.m1740x().m1824c(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.o0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: i */
        private static final long f1480i;

        /* renamed from: j */
        private static final long f1481j;

        /* renamed from: a */
        private final int f1482a;

        /* renamed from: b */
        private final Executor f1483b;

        /* renamed from: c */
        private final C0350t f1484c;

        /* renamed from: d */
        private final C4768l f1485d;

        /* renamed from: e */
        private final boolean f1486e;

        /* renamed from: f */
        private long f1487f = f1480i;

        /* renamed from: g */
        final List<d> f1488g = new ArrayList();

        /* renamed from: h */
        private final d f1489h = new a();

        /* renamed from: androidx.camera.camera2.internal.o0$c$a */
        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static /* synthetic */ Boolean m1637e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.C0331o0.d
            /* renamed from: a */
            public boolean mo1614a() {
                Iterator<d> it = c.this.f1488g.iterator();
                while (it.hasNext()) {
                    if (it.next().mo1614a()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.C0331o0.d
            /* renamed from: b */
            public InterfaceFutureC2565m<Boolean> mo1615b(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<d> it = c.this.f1488g.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo1615b(totalCaptureResult));
                }
                return C5586f.m20515o(C5586f.m20503c(arrayList), new InterfaceC4005a() { // from class: androidx.camera.camera2.internal.v0
                    @Override // p169n.InterfaceC4005a
                    /* renamed from: a */
                    public final Object mo1403a(Object obj) {
                        Boolean m1637e;
                        m1637e = C0331o0.c.a.m1637e((List) obj);
                        return m1637e;
                    }
                }, C5493a.m20219a());
            }

            @Override // androidx.camera.camera2.internal.C0331o0.d
            /* renamed from: c */
            public void mo1616c() {
                Iterator<d> it = c.this.f1488g.iterator();
                while (it.hasNext()) {
                    it.next().mo1616c();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.camera2.internal.o0$c$b */
        /* loaded from: classes.dex */
        public class b extends AbstractC5032h {

            /* renamed from: a */
            final /* synthetic */ C0541c.a f1491a;

            b(C0541c.a aVar) {
                this.f1491a = aVar;
            }

            @Override // p279w.AbstractC5032h
            /* renamed from: a */
            public void mo1638a() {
                this.f1491a.m2521f(new C0415h1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // p279w.AbstractC5032h
            /* renamed from: b */
            public void mo1399b(InterfaceC5068q interfaceC5068q) {
                this.f1491a.m2519c(null);
            }

            @Override // p279w.AbstractC5032h
            /* renamed from: c */
            public void mo1639c(C5040j c5040j) {
                this.f1491a.m2521f(new C0415h1(2, "Capture request failed with reason " + c5040j.m19574a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f1480i = timeUnit.toNanos(1L);
            f1481j = timeUnit.toNanos(5L);
        }

        c(int i10, Executor executor, C0350t c0350t, boolean z10, C4768l c4768l) {
            this.f1482a = i10;
            this.f1483b = executor;
            this.f1484c = c0350t;
            this.f1486e = z10;
            this.f1485d = c4768l;
        }

        /* renamed from: h */
        private void m1623h(C5045k0.a aVar) {
            C4288a.a aVar2 = new C4288a.a();
            aVar2.m17775e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.m19594e(aVar2.m17773c());
        }

        /* renamed from: i */
        private void m1624i(C5045k0.a aVar, C5045k0 c5045k0) {
            int i10;
            if (this.f1482a != 3 || this.f1486e) {
                i10 = (c5045k0.m19586g() == -1 || c5045k0.m19586g() == 5) ? 2 : -1;
            } else {
                i10 = 4;
            }
            if (i10 != -1) {
                aVar.m19603p(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public boolean m1625k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            C0287e c0287e = new C0287e(totalCaptureResult);
            boolean z10 = c0287e.m1389g() == EnumC5048l.OFF || c0287e.m1389g() == EnumC5048l.UNKNOWN || c0287e.m1390h() == EnumC5052m.PASSIVE_FOCUSED || c0287e.m1390h() == EnumC5052m.PASSIVE_NOT_FOCUSED || c0287e.m1390h() == EnumC5052m.LOCKED_FOCUSED || c0287e.m1390h() == EnumC5052m.LOCKED_NOT_FOCUSED;
            boolean z11 = c0287e.m1388f() == EnumC5044k.CONVERGED || c0287e.m1388f() == EnumC5044k.FLASH_REQUIRED || c0287e.m1388f() == EnumC5044k.UNKNOWN;
            boolean z12 = c0287e.m1391i() == EnumC5056n.CONVERGED || c0287e.m1391i() == EnumC5056n.UNKNOWN;
            C0463q1.m2202a("Camera2CapturePipeline", "checkCaptureResult, AE=" + c0287e.m1388f() + " AF =" + c0287e.m1390h() + " AWB=" + c0287e.m1391i());
            return z10 && z11 && z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ InterfaceFutureC2565m m1626l(int i10, TotalCaptureResult totalCaptureResult) throws Exception {
            if (C0331o0.m1606a(i10, totalCaptureResult)) {
                m1631q(f1481j);
            }
            return this.f1489h.mo1615b(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ InterfaceFutureC2565m m1627m(Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                return m1632s(this.f1487f, new e.a() { // from class: androidx.camera.camera2.internal.p0
                    @Override // androidx.camera.camera2.internal.C0331o0.e.a
                    /* renamed from: a */
                    public final boolean mo1643a(TotalCaptureResult totalCaptureResult) {
                        boolean m1625k;
                        m1625k = C0331o0.c.this.m1625k(totalCaptureResult);
                        return m1625k;
                    }
                });
            }
            return C5586f.m20508h(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ InterfaceFutureC2565m m1628n(List list, int i10, TotalCaptureResult totalCaptureResult) throws Exception {
            return m1635r(list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m1629o() {
            this.f1489h.mo1616c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ Object m1630p(C5045k0.a aVar, C0541c.a aVar2) throws Exception {
            aVar.m19592c(new b(aVar2));
            return "submitStillCapture";
        }

        /* renamed from: q */
        private void m1631q(long j10) {
            this.f1487f = j10;
        }

        /* renamed from: s */
        private InterfaceFutureC2565m<TotalCaptureResult> m1632s(long j10, e.a aVar) {
            e eVar = new e(j10, aVar);
            this.f1484c.m1735s(eVar);
            return eVar.m1642c();
        }

        /* renamed from: g */
        void m1633g(d dVar) {
            this.f1488g.add(dVar);
        }

        /* renamed from: j */
        InterfaceFutureC2565m<List<Void>> m1634j(final List<C5045k0> list, final int i10) {
            InterfaceFutureC2565m m20508h = C5586f.m20508h(null);
            if (!this.f1488g.isEmpty()) {
                m20508h = C5584d.m20496a(this.f1489h.mo1614a() ? m1632s(0L, null) : C5586f.m20508h(null)).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.t0
                    @Override // p305y.InterfaceC5581a
                    /* renamed from: a */
                    public final InterfaceFutureC2565m mo1404a(Object obj) {
                        InterfaceFutureC2565m m1626l;
                        m1626l = C0331o0.c.this.m1626l(i10, (TotalCaptureResult) obj);
                        return m1626l;
                    }
                }, this.f1483b).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.s0
                    @Override // p305y.InterfaceC5581a
                    /* renamed from: a */
                    public final InterfaceFutureC2565m mo1404a(Object obj) {
                        InterfaceFutureC2565m m1627m;
                        m1627m = C0331o0.c.this.m1627m((Boolean) obj);
                        return m1627m;
                    }
                }, this.f1483b);
            }
            C5584d m20500f = C5584d.m20496a(m20508h).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.u0
                @Override // p305y.InterfaceC5581a
                /* renamed from: a */
                public final InterfaceFutureC2565m mo1404a(Object obj) {
                    InterfaceFutureC2565m m1628n;
                    m1628n = C0331o0.c.this.m1628n(list, i10, (TotalCaptureResult) obj);
                    return m1628n;
                }
            }, this.f1483b);
            m20500f.mo2501b(new Runnable() { // from class: androidx.camera.camera2.internal.r0
                @Override // java.lang.Runnable
                public final void run() {
                    C0331o0.c.this.m1629o();
                }
            }, this.f1483b);
            return m20500f;
        }

        /* renamed from: r */
        InterfaceFutureC2565m<List<Void>> m1635r(List<C5045k0> list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C5045k0 c5045k0 : list) {
                final C5045k0.a m19589k = C5045k0.a.m19589k(c5045k0);
                InterfaceC5068q interfaceC5068q = null;
                if (c5045k0.m19586g() == 5) {
                    InterfaceC0443l1 mo1353d = this.f1484c.m1714G().mo1353d();
                    if (mo1353d != null && this.f1484c.m1714G().mo1352c(mo1353d)) {
                        interfaceC5068q = C5072r.m19670a(mo1353d.mo1857q());
                    }
                }
                if (interfaceC5068q != null) {
                    m19589k.m19601n(interfaceC5068q);
                } else {
                    m1624i(m19589k, c5045k0);
                }
                if (this.f1485d.m18950c(i10)) {
                    m1623h(m19589k);
                }
                arrayList.add(C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.q0
                    @Override // androidx.concurrent.futures.C0541c.c
                    /* renamed from: a */
                    public final Object mo1498a(C0541c.a aVar) {
                        Object m1630p;
                        m1630p = C0331o0.c.this.m1630p(m19589k, aVar);
                        return m1630p;
                    }
                }));
                arrayList2.add(m19589k.m19597h());
            }
            this.f1484c.m1726c0(arrayList2);
            return C5586f.m20503c(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.o0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        boolean mo1614a();

        /* renamed from: b */
        InterfaceFutureC2565m<Boolean> mo1615b(TotalCaptureResult totalCaptureResult);

        /* renamed from: c */
        void mo1616c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.o0$e */
    /* loaded from: classes.dex */
    public static class e implements C0350t.c {

        /* renamed from: a */
        private C0541c.a<TotalCaptureResult> f1493a;

        /* renamed from: c */
        private final long f1495c;

        /* renamed from: d */
        private final a f1496d;

        /* renamed from: b */
        private final InterfaceFutureC2565m<TotalCaptureResult> f1494b = C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.w0
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m1641d;
                m1641d = C0331o0.e.this.m1641d(aVar);
                return m1641d;
            }
        });

        /* renamed from: e */
        private volatile Long f1497e = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.camera2.internal.o0$e$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            boolean mo1643a(TotalCaptureResult totalCaptureResult);
        }

        e(long j10, a aVar) {
            this.f1495c = j10;
            this.f1496d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object m1641d(C0541c.a aVar) throws Exception {
            this.f1493a = aVar;
            return "waitFor3AResult";
        }

        @Override // androidx.camera.camera2.internal.C0350t.c
        /* renamed from: a */
        public boolean mo1400a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f1497e == null) {
                this.f1497e = l10;
            }
            Long l11 = this.f1497e;
            if (0 != this.f1495c && l11 != null && l10 != null && l10.longValue() - l11.longValue() > this.f1495c) {
                this.f1493a.m2519c(null);
                C0463q1.m2202a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
                return true;
            }
            a aVar = this.f1496d;
            if (aVar != null && !aVar.mo1643a(totalCaptureResult)) {
                return false;
            }
            this.f1493a.m2519c(totalCaptureResult);
            return true;
        }

        /* renamed from: c */
        public InterfaceFutureC2565m<TotalCaptureResult> m1642c() {
            return this.f1494b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.o0$f */
    /* loaded from: classes.dex */
    public static class f implements d {

        /* renamed from: a */
        private final C0350t f1498a;

        /* renamed from: b */
        private final int f1499b;

        /* renamed from: c */
        private boolean f1500c = false;

        f(C0350t c0350t, int i10) {
            this.f1498a = c0350t;
            this.f1499b = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m1646f(C0541c.a aVar) throws Exception {
            this.f1498a.m1711D().m1808b(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ Boolean m1647g(Void r02) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: a */
        public boolean mo1614a() {
            return this.f1499b == 0;
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: b */
        public InterfaceFutureC2565m<Boolean> mo1615b(TotalCaptureResult totalCaptureResult) {
            if (C0331o0.m1606a(this.f1499b, totalCaptureResult)) {
                if (this.f1498a.m1716L()) {
                    C0463q1.m2202a("Camera2CapturePipeline", "Torch already on, not turn on");
                } else {
                    C0463q1.m2202a("Camera2CapturePipeline", "Turn on torch");
                    this.f1500c = true;
                    return C5584d.m20496a(C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.camera2.internal.x0
                        @Override // androidx.concurrent.futures.C0541c.c
                        /* renamed from: a */
                        public final Object mo1498a(C0541c.a aVar) {
                            Object m1646f;
                            m1646f = C0331o0.f.this.m1646f(aVar);
                            return m1646f;
                        }
                    })).m20499e(new InterfaceC4005a() { // from class: androidx.camera.camera2.internal.y0
                        @Override // p169n.InterfaceC4005a
                        /* renamed from: a */
                        public final Object mo1403a(Object obj) {
                            Boolean m1647g;
                            m1647g = C0331o0.f.m1647g((Void) obj);
                            return m1647g;
                        }
                    }, C5493a.m20219a());
                }
            }
            return C5586f.m20508h(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.C0331o0.d
        /* renamed from: c */
        public void mo1616c() {
            if (this.f1500c) {
                this.f1498a.m1711D().m1808b(null, false);
                C0463q1.m2202a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0331o0(C0350t c0350t, C4414z c4414z, C5095y1 c5095y1, Executor executor) {
        this.f1468a = c0350t;
        Integer num = (Integer) c4414z.m18192a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f1472e = num != null && num.intValue() == 2;
        this.f1471d = executor;
        this.f1470c = c5095y1;
        this.f1469b = new C4774r(c5095y1);
    }

    /* renamed from: a */
    static boolean m1606a(int i10, TotalCaptureResult totalCaptureResult) {
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new AssertionError(i10);
    }

    /* renamed from: b */
    private boolean m1607b(int i10) {
        return this.f1469b.m18956a() || this.f1473f == 3 || i10 == 1;
    }

    /* renamed from: c */
    public void m1608c(int i10) {
        this.f1473f = i10;
    }

    /* renamed from: d */
    public InterfaceFutureC2565m<List<Void>> m1609d(List<C5045k0> list, int i10, int i11, int i12) {
        C4768l c4768l = new C4768l(this.f1470c);
        c cVar = new c(this.f1473f, this.f1471d, this.f1468a, this.f1472e, c4768l);
        if (i10 == 0) {
            cVar.m1633g(new b(this.f1468a));
        }
        if (m1607b(i12)) {
            cVar.m1633g(new f(this.f1468a, i11));
        } else {
            cVar.m1633g(new a(this.f1468a, i11, c4768l));
        }
        return C5586f.m20510j(cVar.m1634j(list, i11));
    }
}
