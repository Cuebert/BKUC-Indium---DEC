package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.internal.C0289e1;
import androidx.camera.camera2.internal.C0365w2;
import androidx.camera.camera2.internal.InterfaceC0313j2;
import androidx.camera.core.C0463q1;
import androidx.concurrent.futures.C0541c;
import androidx.core.util.C0654h;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p206q.C4288a;
import p206q.C4290c;
import p231s.C4482b;
import p231s.C4487g;
import p255u.C4771o;
import p279w.AbstractC5032h;
import p279w.AbstractC5073r0;
import p279w.C5015c2;
import p279w.C5045k0;
import p279w.C5070q1;
import p279w.C5083u1;
import p279w.InterfaceC5061o0;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.q1 */
/* loaded from: classes.dex */
public final class C0340q1 implements InterfaceC0344r1 {

    /* renamed from: e */
    C0361v2 f1532e;

    /* renamed from: f */
    InterfaceC0313j2 f1533f;

    /* renamed from: g */
    C5015c2 f1534g;

    /* renamed from: l */
    d f1539l;

    /* renamed from: m */
    InterfaceFutureC2565m<Void> f1540m;

    /* renamed from: n */
    C0541c.a<Void> f1541n;

    /* renamed from: a */
    final Object f1528a = new Object();

    /* renamed from: b */
    private final List<C5045k0> f1529b = new ArrayList();

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f1530c = new a();

    /* renamed from: h */
    InterfaceC5061o0 f1535h = C5083u1.m19701I();

    /* renamed from: i */
    C4290c f1536i = C4290c.m17780e();

    /* renamed from: j */
    private final Map<AbstractC5073r0, Surface> f1537j = new HashMap();

    /* renamed from: k */
    List<AbstractC5073r0> f1538k = Collections.emptyList();

    /* renamed from: o */
    final C4771o f1542o = new C4771o();

    /* renamed from: d */
    private final e f1531d = new e();

    /* renamed from: androidx.camera.camera2.internal.q1$a */
    /* loaded from: classes.dex */
    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.q1$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC5583c<Void> {
        b() {
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            synchronized (C0340q1.this.f1528a) {
                C0340q1.this.f1532e.m1797e();
                int i10 = c.f1545a[C0340q1.this.f1539l.ordinal()];
                if ((i10 == 4 || i10 == 6 || i10 == 7) && !(th instanceof CancellationException)) {
                    C0463q1.m2213l("CaptureSession", "Opening session with fail " + C0340q1.this.f1539l, th);
                    C0340q1.this.m1676l();
                }
            }
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.q1$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1545a;

        static {
            int[] iArr = new int[d.values().length];
            f1545a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1545a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1545a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1545a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1545a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1545a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1545a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1545a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.q1$d */
    /* loaded from: classes.dex */
    public enum d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.q1$e */
    /* loaded from: classes.dex */
    public final class e extends InterfaceC0313j2.a {
        e() {
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: q */
        public void mo1594q(InterfaceC0313j2 interfaceC0313j2) {
            synchronized (C0340q1.this.f1528a) {
                switch (c.f1545a[C0340q1.this.f1539l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C0340q1.this.f1539l);
                    case 4:
                    case 6:
                    case 7:
                        C0340q1.this.m1676l();
                        break;
                    case 8:
                        C0463q1.m2202a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C0463q1.m2204c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C0340q1.this.f1539l);
            }
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: r */
        public void mo1595r(InterfaceC0313j2 interfaceC0313j2) {
            synchronized (C0340q1.this.f1528a) {
                switch (c.f1545a[C0340q1.this.f1539l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C0340q1.this.f1539l);
                    case 4:
                        C0340q1 c0340q1 = C0340q1.this;
                        c0340q1.f1539l = d.OPENED;
                        c0340q1.f1533f = interfaceC0313j2;
                        if (c0340q1.f1534g != null) {
                            List<C5045k0> m17784b = c0340q1.f1536i.m17782d().m17784b();
                            if (!m17784b.isEmpty()) {
                                C0340q1 c0340q12 = C0340q1.this;
                                c0340q12.m1677m(c0340q12.m1680u(m17784b));
                            }
                        }
                        C0463q1.m2202a("CaptureSession", "Attempting to send capture request onConfigured");
                        C0340q1 c0340q13 = C0340q1.this;
                        c0340q13.m1679o(c0340q13.f1534g);
                        C0340q1.this.m1678n();
                        break;
                    case 6:
                        C0340q1.this.f1533f = interfaceC0313j2;
                        break;
                    case 7:
                        interfaceC0313j2.close();
                        break;
                }
                C0463q1.m2202a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C0340q1.this.f1539l);
            }
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: s */
        public void mo1596s(InterfaceC0313j2 interfaceC0313j2) {
            synchronized (C0340q1.this.f1528a) {
                if (c.f1545a[C0340q1.this.f1539l.ordinal()] != 1) {
                    C0463q1.m2202a("CaptureSession", "CameraCaptureSession.onReady() " + C0340q1.this.f1539l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + C0340q1.this.f1539l);
                }
            }
        }

        @Override // androidx.camera.camera2.internal.InterfaceC0313j2.a
        /* renamed from: t */
        public void mo1597t(InterfaceC0313j2 interfaceC0313j2) {
            synchronized (C0340q1.this.f1528a) {
                if (C0340q1.this.f1539l != d.UNINITIALIZED) {
                    C0463q1.m2202a("CaptureSession", "onSessionFinished()");
                    C0340q1.this.m1676l();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C0340q1.this.f1539l);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0340q1() {
        this.f1539l = d.UNINITIALIZED;
        this.f1539l = d.INITIALIZED;
    }

    /* renamed from: k */
    private CameraCaptureSession.CaptureCallback m1670k(List<AbstractC5032h> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<AbstractC5032h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0324m1.m1604a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C0315k0.m1599a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m1671p(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (this.f1528a) {
            if (this.f1539l == d.OPENED) {
                m1679o(this.f1534g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m1673r(C0541c.a aVar) throws Exception {
        String str;
        synchronized (this.f1528a) {
            C0654h.m3470i(this.f1541n == null, "Release completer expected to be null");
            this.f1541n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: s */
    private static InterfaceC5061o0 m1674s(List<C5045k0> list) {
        C5070q1 m19660L = C5070q1.m19660L();
        Iterator<C5045k0> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5061o0 m19583d = it.next().m19583d();
            for (InterfaceC5061o0.a<?> aVar : m19583d.mo1367c()) {
                Object mo1365a = m19583d.mo1365a(aVar, null);
                if (m19660L.mo1369e(aVar)) {
                    Object mo1365a2 = m19660L.mo1365a(aVar, null);
                    if (!Objects.equals(mo1365a2, mo1365a)) {
                        C0463q1.m2202a("CaptureSession", "Detect conflicting option " + aVar.mo19483c() + " : " + mo1365a + " != " + mo1365a2);
                    }
                } else {
                    m19660L.mo19659g(aVar, mo1365a);
                }
            }
        }
        return m19660L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterfaceFutureC2565m<Void> m1672q(List<Surface> list, C5015c2 c5015c2, CameraDevice cameraDevice) {
        synchronized (this.f1528a) {
            int i10 = c.f1545a[this.f1539l.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    this.f1537j.clear();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        this.f1537j.put(this.f1538k.get(i11), list.get(i11));
                    }
                    ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
                    this.f1539l = d.OPENING;
                    C0463q1.m2202a("CaptureSession", "Opening capture session.");
                    InterfaceC0313j2.a m1802v = C0365w2.m1802v(this.f1531d, new C0365w2.a(c5015c2.m19497h()));
                    C4288a c4288a = new C4288a(c5015c2.m19493d());
                    C4290c m17765I = c4288a.m17765I(C4290c.m17780e());
                    this.f1536i = m17765I;
                    List<C5045k0> m17785c = m17765I.m17782d().m17785c();
                    C5045k0.a m19589k = C5045k0.a.m19589k(c5015c2.m19496g());
                    Iterator<C5045k0> it = m17785c.iterator();
                    while (it.hasNext()) {
                        m19589k.m19594e(it.next().m19583d());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C4482b c4482b = new C4482b((Surface) it2.next());
                        c4482b.m18435c(c4288a.m17770N(null));
                        arrayList2.add(c4482b);
                    }
                    C4487g m1793a = this.f1532e.m1793a(0, arrayList2, m1802v);
                    try {
                        CaptureRequest m1813c = C0375z0.m1813c(m19589k.m19597h(), cameraDevice);
                        if (m1813c != null) {
                            m1793a.m18454f(m1813c);
                        }
                        return this.f1532e.m1795c(cameraDevice, m1793a, this.f1538k);
                    } catch (CameraAccessException e10) {
                        return C5586f.m20506f(e10);
                    }
                }
                if (i10 != 5) {
                    return C5586f.m20506f(new CancellationException("openCaptureSession() not execute in state: " + this.f1539l));
                }
            }
            return C5586f.m20506f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f1539l));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x009f, B:11:0x0012, B:16:0x0018, B:14:0x0024, B:19:0x001d, B:20:0x0029, B:22:0x004d, B:23:0x0051, B:25:0x0055, B:26:0x0060, B:27:0x0062, B:29:0x0064, B:30:0x0081, B:31:0x0086, B:32:0x009e), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x00a6, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:7:0x009f, B:11:0x0012, B:16:0x0018, B:14:0x0024, B:19:0x001d, B:20:0x0029, B:22:0x004d, B:23:0x0051, B:25:0x0055, B:26:0x0060, B:27:0x0062, B:29:0x0064, B:30:0x0081, B:31:0x0086, B:32:0x009e), top: B:3:0x0003, inners: #0 }] */
    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.InterfaceFutureC2565m<java.lang.Void> mo1513a(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1528a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.C0340q1.c.f1545a     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1539l     // Catch: java.lang.Throwable -> La6
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> La6
            r1 = r1[r2]     // Catch: java.lang.Throwable -> La6
            switch(r1) {
                case 1: goto L86;
                case 2: goto L81;
                case 3: goto L64;
                case 4: goto L29;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L51;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> La6
        L10:
            goto L9f
        L12:
            androidx.camera.camera2.internal.j2 r1 = r3.f1533f     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L29
            if (r4 == 0) goto L24
            r1.mo1588j()     // Catch: android.hardware.camera2.CameraAccessException -> L1c java.lang.Throwable -> La6
            goto L24
        L1c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.C0463q1.m2205d(r1, r2, r4)     // Catch: java.lang.Throwable -> La6
        L24:
            androidx.camera.camera2.internal.j2 r4 = r3.f1533f     // Catch: java.lang.Throwable -> La6
            r4.close()     // Catch: java.lang.Throwable -> La6
        L29:
            androidx.camera.camera2.internal.q1$d r4 = androidx.camera.camera2.internal.C0340q1.d.RELEASING     // Catch: java.lang.Throwable -> La6
            r3.f1539l = r4     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.v2 r4 = r3.f1532e     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1539l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            androidx.core.util.C0654h.m3468g(r4, r1)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.v2 r4 = r3.f1532e     // Catch: java.lang.Throwable -> La6
            boolean r4 = r4.m1797e()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L51
            r3.m1676l()     // Catch: java.lang.Throwable -> La6
            goto L9f
        L51:
            com.google.common.util.concurrent.m<java.lang.Void> r4 = r3.f1540m     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L60
            androidx.camera.camera2.internal.o1 r4 = new androidx.camera.camera2.internal.o1     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            com.google.common.util.concurrent.m r4 = androidx.concurrent.futures.C0541c.m2515a(r4)     // Catch: java.lang.Throwable -> La6
            r3.f1540m = r4     // Catch: java.lang.Throwable -> La6
        L60:
            com.google.common.util.concurrent.m<java.lang.Void> r4 = r3.f1540m     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return r4
        L64:
            androidx.camera.camera2.internal.v2 r4 = r3.f1532e     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1539l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            androidx.core.util.C0654h.m3468g(r4, r1)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.v2 r4 = r3.f1532e     // Catch: java.lang.Throwable -> La6
            r4.m1797e()     // Catch: java.lang.Throwable -> La6
        L81:
            androidx.camera.camera2.internal.q1$d r4 = androidx.camera.camera2.internal.C0340q1.d.RELEASED     // Catch: java.lang.Throwable -> La6
            r3.f1539l = r4     // Catch: java.lang.Throwable -> La6
            goto L9f
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            androidx.camera.camera2.internal.q1$d r2 = r3.f1539l     // Catch: java.lang.Throwable -> La6
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            r4.<init>(r1)     // Catch: java.lang.Throwable -> La6
            throw r4     // Catch: java.lang.Throwable -> La6
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            r4 = 0
            com.google.common.util.concurrent.m r4 = p305y.C5586f.m20508h(r4)
            return r4
        La6:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0340q1.mo1513a(boolean):com.google.common.util.concurrent.m");
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: b */
    public List<C5045k0> mo1514b() {
        List<C5045k0> unmodifiableList;
        synchronized (this.f1528a) {
            unmodifiableList = Collections.unmodifiableList(this.f1529b);
        }
        return unmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: c */
    public void mo1515c(List<C5045k0> list) {
        synchronized (this.f1528a) {
            switch (c.f1545a[this.f1539l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f1539l);
                case 2:
                case 3:
                case 4:
                    this.f1529b.addAll(list);
                    break;
                case 5:
                    this.f1529b.addAll(list);
                    m1678n();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    public void close() {
        synchronized (this.f1528a) {
            int i10 = c.f1545a[this.f1539l.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                if (this.f1534g != null) {
                                    List<C5045k0> m17783a = this.f1536i.m17782d().m17783a();
                                    if (!m17783a.isEmpty()) {
                                        try {
                                            mo1515c(m1680u(m17783a));
                                        } catch (IllegalStateException e10) {
                                            C0463q1.m2205d("CaptureSession", "Unable to issue the request before close the capture session", e10);
                                        }
                                    }
                                }
                            }
                        }
                        C0654h.m3468g(this.f1532e, "The Opener shouldn't null in state:" + this.f1539l);
                        this.f1532e.m1797e();
                        this.f1539l = d.CLOSED;
                        this.f1534g = null;
                    } else {
                        C0654h.m3468g(this.f1532e, "The Opener shouldn't null in state:" + this.f1539l);
                        this.f1532e.m1797e();
                    }
                }
                this.f1539l = d.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f1539l);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: d */
    public C5015c2 mo1516d() {
        C5015c2 c5015c2;
        synchronized (this.f1528a) {
            c5015c2 = this.f1534g;
        }
        return c5015c2;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: e */
    public void mo1517e() {
        ArrayList arrayList;
        synchronized (this.f1528a) {
            if (this.f1529b.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f1529b);
                this.f1529b.clear();
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<AbstractC5032h> it2 = ((C5045k0) it.next()).m19581b().iterator();
                while (it2.hasNext()) {
                    it2.next().mo1638a();
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: f */
    public InterfaceFutureC2565m<Void> mo1518f(final C5015c2 c5015c2, final CameraDevice cameraDevice, C0361v2 c0361v2) {
        synchronized (this.f1528a) {
            if (c.f1545a[this.f1539l.ordinal()] != 2) {
                C0463q1.m2204c("CaptureSession", "Open not allowed in state: " + this.f1539l);
                return C5586f.m20506f(new IllegalStateException("open() should not allow the state: " + this.f1539l));
            }
            this.f1539l = d.GET_SURFACE;
            ArrayList arrayList = new ArrayList(c5015c2.m19499j());
            this.f1538k = arrayList;
            this.f1532e = c0361v2;
            C5584d m20500f = C5584d.m20496a(c0361v2.m1796d(arrayList, 5000L)).m20500f(new InterfaceC5581a() { // from class: androidx.camera.camera2.internal.p1
                @Override // p305y.InterfaceC5581a
                /* renamed from: a */
                public final InterfaceFutureC2565m mo1404a(Object obj) {
                    InterfaceFutureC2565m m1672q;
                    m1672q = C0340q1.this.m1672q(c5015c2, cameraDevice, (List) obj);
                    return m1672q;
                }
            }, this.f1532e.m1794b());
            C5586f.m20502b(m20500f, new b(), this.f1532e.m1794b());
            return C5586f.m20510j(m20500f);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0344r1
    /* renamed from: g */
    public void mo1519g(C5015c2 c5015c2) {
        synchronized (this.f1528a) {
            switch (c.f1545a[this.f1539l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f1539l);
                case 2:
                case 3:
                case 4:
                    this.f1534g = c5015c2;
                    break;
                case 5:
                    this.f1534g = c5015c2;
                    if (c5015c2 != null) {
                        if (!this.f1537j.keySet().containsAll(c5015c2.m19499j())) {
                            C0463q1.m2204c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            C0463q1.m2202a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            m1679o(this.f1534g);
                            break;
                        }
                    } else {
                        return;
                    }
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    /* renamed from: l */
    void m1676l() {
        d dVar = this.f1539l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            C0463q1.m2202a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f1539l = dVar2;
        this.f1533f = null;
        C0541c.a<Void> aVar = this.f1541n;
        if (aVar != null) {
            aVar.m2519c(null);
            this.f1541n = null;
        }
    }

    /* renamed from: m */
    int m1677m(List<C5045k0> list) {
        C0289e1 c0289e1;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        synchronized (this.f1528a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                c0289e1 = new C0289e1();
                arrayList = new ArrayList();
                C0463q1.m2202a("CaptureSession", "Issuing capture request.");
                z10 = false;
                for (C5045k0 c5045k0 : list) {
                    if (c5045k0.m19584e().isEmpty()) {
                        C0463q1.m2202a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<AbstractC5073r0> it = c5045k0.m19584e().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = true;
                                break;
                            }
                            AbstractC5073r0 next = it.next();
                            if (!this.f1537j.containsKey(next)) {
                                C0463q1.m2202a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z11 = false;
                                break;
                            }
                        }
                        if (z11) {
                            if (c5045k0.m19586g() == 2) {
                                z10 = true;
                            }
                            C5045k0.a m19589k = C5045k0.a.m19589k(c5045k0);
                            if (c5045k0.m19586g() == 5 && c5045k0.m19582c() != null) {
                                m19589k.m19601n(c5045k0.m19582c());
                            }
                            C5015c2 c5015c2 = this.f1534g;
                            if (c5015c2 != null) {
                                m19589k.m19594e(c5015c2.m19496g().m19583d());
                            }
                            m19589k.m19594e(this.f1535h);
                            m19589k.m19594e(c5045k0.m19583d());
                            CaptureRequest m1812b = C0375z0.m1812b(m19589k.m19597h(), this.f1533f.mo1589k(), this.f1537j);
                            if (m1812b == null) {
                                C0463q1.m2202a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<AbstractC5032h> it2 = c5045k0.m19581b().iterator();
                            while (it2.hasNext()) {
                                C0324m1.m1605b(it2.next(), arrayList2);
                            }
                            c0289e1.m1393a(m1812b, arrayList2);
                            arrayList.add(m1812b);
                        }
                    }
                }
            } catch (CameraAccessException e10) {
                C0463q1.m2204c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.f1542o.m18953a(arrayList, z10)) {
                    this.f1533f.mo1584e();
                    c0289e1.m1394c(new C0289e1.a() { // from class: androidx.camera.camera2.internal.n1
                        @Override // androidx.camera.camera2.internal.C0289e1.a
                        /* renamed from: a */
                        public final void mo1395a(CameraCaptureSession cameraCaptureSession, int i10, boolean z12) {
                            C0340q1.this.m1671p(cameraCaptureSession, i10, z12);
                        }
                    });
                }
                return this.f1533f.mo1585g(arrayList, c0289e1);
            }
            C0463q1.m2202a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    /* renamed from: n */
    void m1678n() {
        if (this.f1529b.isEmpty()) {
            return;
        }
        try {
            m1677m(this.f1529b);
        } finally {
            this.f1529b.clear();
        }
    }

    /* renamed from: o */
    int m1679o(C5015c2 c5015c2) {
        synchronized (this.f1528a) {
            if (c5015c2 == null) {
                C0463q1.m2202a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            C5045k0 m19496g = c5015c2.m19496g();
            if (m19496g.m19584e().isEmpty()) {
                C0463q1.m2202a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f1533f.mo1584e();
                } catch (CameraAccessException e10) {
                    C0463q1.m2204c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C0463q1.m2202a("CaptureSession", "Issuing request for session.");
                C5045k0.a m19589k = C5045k0.a.m19589k(m19496g);
                InterfaceC5061o0 m1674s = m1674s(this.f1536i.m17782d().m17786d());
                this.f1535h = m1674s;
                m19589k.m19594e(m1674s);
                CaptureRequest m1812b = C0375z0.m1812b(m19589k.m19597h(), this.f1533f.mo1589k(), this.f1537j);
                if (m1812b == null) {
                    C0463q1.m2202a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f1533f.mo1590m(m1812b, m1670k(m19496g.m19581b(), this.f1530c));
            } catch (CameraAccessException e11) {
                C0463q1.m2204c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    /* renamed from: u */
    List<C5045k0> m1680u(List<C5045k0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<C5045k0> it = list.iterator();
        while (it.hasNext()) {
            C5045k0.a m19589k = C5045k0.a.m19589k(it.next());
            m19589k.m19603p(1);
            Iterator<AbstractC5073r0> it2 = this.f1534g.m19496g().m19584e().iterator();
            while (it2.hasNext()) {
                m19589k.m19595f(it2.next());
            }
            arrayList.add(m19589k.m19597h());
        }
        return arrayList;
    }
}
