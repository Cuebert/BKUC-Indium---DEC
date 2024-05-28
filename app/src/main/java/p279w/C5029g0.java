package p279w;

import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0437k;
import androidx.core.util.C0654h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p279w.C5029g0;
import p279w.InterfaceC5017d0;

/* renamed from: w.g0 */
/* loaded from: classes.dex */
public final class C5029g0 {

    /* renamed from: c */
    private final int f19177c;

    /* renamed from: e */
    private int f19179e;

    /* renamed from: a */
    private final StringBuilder f19175a = new StringBuilder();

    /* renamed from: b */
    private final Object f19176b = new Object();

    /* renamed from: d */
    private final Map<InterfaceC0437k, a> f19178d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.g0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC5017d0.a f19180a;

        /* renamed from: b */
        private final Executor f19181b;

        /* renamed from: c */
        private final b f19182c;

        a(InterfaceC5017d0.a aVar, Executor executor, b bVar) {
            this.f19180a = aVar;
            this.f19181b = executor;
            this.f19182c = bVar;
        }

        /* renamed from: a */
        InterfaceC5017d0.a m19560a() {
            return this.f19180a;
        }

        /* renamed from: b */
        void m19561b() {
            try {
                Executor executor = this.f19181b;
                final b bVar = this.f19182c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: w.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5029g0.b.this.mo1475a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                C0463q1.m2205d("CameraStateRegistry", "Unable to notify camera.", e10);
            }
        }

        /* renamed from: c */
        InterfaceC5017d0.a m19562c(InterfaceC5017d0.a aVar) {
            InterfaceC5017d0.a aVar2 = this.f19180a;
            this.f19180a = aVar;
            return aVar2;
        }
    }

    /* renamed from: w.g0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo1475a();
    }

    public C5029g0(int i10) {
        this.f19177c = i10;
        synchronized ("mLock") {
            this.f19179e = i10;
        }
    }

    /* renamed from: b */
    private static boolean m19552b(InterfaceC5017d0.a aVar) {
        return aVar != null && aVar.m19528b();
    }

    /* renamed from: d */
    private void m19553d() {
        if (C0463q1.m2207f("CameraStateRegistry")) {
            this.f19175a.setLength(0);
            this.f19175a.append("Recalculating open cameras:\n");
            this.f19175a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f19175a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<InterfaceC0437k, a> entry : this.f19178d.entrySet()) {
            if (C0463q1.m2207f("CameraStateRegistry")) {
                this.f19175a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().m19560a() != null ? entry.getValue().m19560a().toString() : "UNKNOWN"));
            }
            if (m19552b(entry.getValue().m19560a())) {
                i10++;
            }
        }
        if (C0463q1.m2207f("CameraStateRegistry")) {
            this.f19175a.append("-------------------------------------------------------------------\n");
            this.f19175a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f19177c)));
            C0463q1.m2202a("CameraStateRegistry", this.f19175a.toString());
        }
        this.f19179e = Math.max(this.f19177c - i10, 0);
    }

    /* renamed from: g */
    private InterfaceC5017d0.a m19554g(InterfaceC0437k interfaceC0437k) {
        a remove = this.f19178d.remove(interfaceC0437k);
        if (remove == null) {
            return null;
        }
        m19553d();
        return remove.m19560a();
    }

    /* renamed from: h */
    private InterfaceC5017d0.a m19555h(InterfaceC0437k interfaceC0437k, InterfaceC5017d0.a aVar) {
        InterfaceC5017d0.a m19562c = ((a) C0654h.m3468g(this.f19178d.get(interfaceC0437k), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m19562c(aVar);
        InterfaceC5017d0.a aVar2 = InterfaceC5017d0.a.OPENING;
        if (aVar == aVar2) {
            C0654h.m3470i(m19552b(aVar) || m19562c == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (m19562c != aVar) {
            m19553d();
        }
        return m19562c;
    }

    /* renamed from: a */
    public boolean m19556a() {
        synchronized (this.f19176b) {
            Iterator<Map.Entry<InterfaceC0437k, a>> it = this.f19178d.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m19560a() == InterfaceC5017d0.a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public void m19557c(InterfaceC0437k interfaceC0437k, InterfaceC5017d0.a aVar, boolean z10) {
        InterfaceC5017d0.a m19555h;
        HashMap hashMap;
        synchronized (this.f19176b) {
            int i10 = this.f19179e;
            if (aVar == InterfaceC5017d0.a.RELEASED) {
                m19555h = m19554g(interfaceC0437k);
            } else {
                m19555h = m19555h(interfaceC0437k, aVar);
            }
            if (m19555h == aVar) {
                return;
            }
            if (i10 < 1 && this.f19179e > 0) {
                hashMap = new HashMap();
                for (Map.Entry<InterfaceC0437k, a> entry : this.f19178d.entrySet()) {
                    if (entry.getValue().m19560a() == InterfaceC5017d0.a.PENDING_OPEN) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else if (aVar != InterfaceC5017d0.a.PENDING_OPEN || this.f19179e <= 0) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                hashMap.put(interfaceC0437k, this.f19178d.get(interfaceC0437k));
            }
            if (hashMap != null && !z10) {
                hashMap.remove(interfaceC0437k);
            }
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m19561b();
                }
            }
        }
    }

    /* renamed from: e */
    public void m19558e(InterfaceC0437k interfaceC0437k, Executor executor, b bVar) {
        synchronized (this.f19176b) {
            C0654h.m3470i(!this.f19178d.containsKey(interfaceC0437k), "Camera is already registered: " + interfaceC0437k);
            this.f19178d.put(interfaceC0437k, new a(null, executor, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001d, B:7:0x0052, B:9:0x0056, B:13:0x0069, B:15:0x0071, B:18:0x0080, B:21:0x0096, B:22:0x0099, B:26:0x0063), top: B:3:0x0003 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m19559f(androidx.camera.core.InterfaceC0437k r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f19176b
            monitor-enter(r0)
            java.util.Map<androidx.camera.core.k, w.g0$a> r1 = r9.f19178d     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L9b
            w.g0$a r1 = (p279w.C5029g0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            java.lang.Object r1 = androidx.core.util.C0654h.m3468g(r1, r2)     // Catch: java.lang.Throwable -> L9b
            w.g0$a r1 = (p279w.C5029g0.a) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = androidx.camera.core.C0463q1.m2207f(r2)     // Catch: java.lang.Throwable -> L9b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L52
            java.lang.StringBuilder r2 = r9.f19175a     // Catch: java.lang.Throwable -> L9b
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r2 = r9.f19175a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L9b
            r7[r4] = r10     // Catch: java.lang.Throwable -> L9b
            int r10 = r9.f19179e     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L9b
            r7[r3] = r10     // Catch: java.lang.Throwable -> L9b
            r10 = 2
            w.d0$a r8 = r1.m19560a()     // Catch: java.lang.Throwable -> L9b
            boolean r8 = m19552b(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            r10 = 3
            w.d0$a r8 = r1.m19560a()     // Catch: java.lang.Throwable -> L9b
            r7[r10] = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L9b
            r2.append(r10)     // Catch: java.lang.Throwable -> L9b
        L52:
            int r10 = r9.f19179e     // Catch: java.lang.Throwable -> L9b
            if (r10 > 0) goto L63
            w.d0$a r10 = r1.m19560a()     // Catch: java.lang.Throwable -> L9b
            boolean r10 = m19552b(r10)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L61
            goto L63
        L61:
            r10 = 0
            goto L69
        L63:
            w.d0$a r10 = p279w.InterfaceC5017d0.a.OPENING     // Catch: java.lang.Throwable -> L9b
            r1.m19562c(r10)     // Catch: java.lang.Throwable -> L9b
            r10 = 1
        L69:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = androidx.camera.core.C0463q1.m2207f(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L94
            java.lang.StringBuilder r1 = r9.f19175a     // Catch: java.lang.Throwable -> L9b
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L7e
            java.lang.String r6 = "SUCCESS"
            goto L80
        L7e:
            java.lang.String r6 = "FAIL"
        L80:
            r3[r4] = r6     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L9b
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f19175a     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L9b
            androidx.camera.core.C0463q1.m2202a(r1, r2)     // Catch: java.lang.Throwable -> L9b
        L94:
            if (r10 == 0) goto L99
            r9.m19553d()     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            return r10
        L9b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p279w.C5029g0.m19559f(androidx.camera.core.k):boolean");
    }
}
