package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1390d;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p070f3.C3134h;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p093h0.C3357b;
import p222r3.HandlerC4427f;
import p295x2.AbstractC5510e;
import p295x2.C5506a;
import p295x2.InterfaceC5512g;
import p295x2.InterfaceC5518m;
import p308y2.C5602b;
import p308y2.C5611f0;
import p308y2.C5635y;
import p308y2.InterfaceC5623m;
import p321z2.C5984j;
import p321z2.C5986k;
import p321z2.C5990m;
import p321z2.C6007x;
import p321z2.InterfaceC5992n;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public class C1350c implements Handler.Callback {

    /* renamed from: r */
    public static final Status f6164r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: s */
    private static final Status f6165s = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: t */
    private static final Object f6166t = new Object();

    /* renamed from: u */
    private static C1350c f6167u;

    /* renamed from: e */
    private TelemetryData f6172e;

    /* renamed from: f */
    private InterfaceC5992n f6173f;

    /* renamed from: g */
    private final Context f6174g;

    /* renamed from: h */
    private final C1342a f6175h;

    /* renamed from: i */
    private final C6007x f6176i;

    /* renamed from: p */
    private final Handler f6183p;

    /* renamed from: q */
    private volatile boolean f6184q;

    /* renamed from: a */
    private long f6168a = 5000;

    /* renamed from: b */
    private long f6169b = 120000;

    /* renamed from: c */
    private long f6170c = 10000;

    /* renamed from: d */
    private boolean f6171d = false;

    /* renamed from: j */
    private final AtomicInteger f6177j = new AtomicInteger(1);

    /* renamed from: k */
    private final AtomicInteger f6178k = new AtomicInteger(0);

    /* renamed from: l */
    private final Map<C5602b<?>, C1367o<?>> f6179l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m */
    private C1360h f6180m = null;

    /* renamed from: n */
    private final Set<C5602b<?>> f6181n = new C3357b();

    /* renamed from: o */
    private final Set<C5602b<?>> f6182o = new C3357b();

    private C1350c(Context context, Looper looper, C1342a c1342a) {
        this.f6184q = true;
        this.f6174g = context;
        HandlerC4427f handlerC4427f = new HandlerC4427f(looper, this);
        this.f6183p = handlerC4427f;
        this.f6175h = c1342a;
        this.f6176i = new C6007x(c1342a);
        if (C3134h.m13787a(context)) {
            this.f6184q = false;
        }
        handlerC4427f.sendMessage(handlerC4427f.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m7465a() {
        synchronized (f6166t) {
            C1350c c1350c = f6167u;
            if (c1350c != null) {
                c1350c.f6178k.incrementAndGet();
                Handler handler = c1350c.f6183p;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: i */
    public static Status m7467i(C5602b<?> c5602b, ConnectionResult connectionResult) {
        String m20622b = c5602b.m20622b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m20622b).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(m20622b);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(connectionResult, sb2.toString());
    }

    /* renamed from: j */
    private final C1367o<?> m7468j(AbstractC5510e<?> abstractC5510e) {
        C5602b<?> mo20264h = abstractC5510e.mo20264h();
        C1367o<?> c1367o = this.f6179l.get(mo20264h);
        if (c1367o == null) {
            c1367o = new C1367o<>(this, abstractC5510e);
            this.f6179l.put(mo20264h, c1367o);
        }
        if (c1367o.m7564P()) {
            this.f6182o.add(mo20264h);
        }
        c1367o.m7554E();
        return c1367o;
    }

    /* renamed from: k */
    private final InterfaceC5992n m7469k() {
        if (this.f6173f == null) {
            this.f6173f = C5990m.m21297a(this.f6174g);
        }
        return this.f6173f;
    }

    /* renamed from: l */
    private final void m7470l() {
        TelemetryData telemetryData = this.f6172e;
        if (telemetryData != null) {
            if (telemetryData.m7626x() > 0 || m7492g()) {
                m7469k().mo6180c(telemetryData);
            }
            this.f6172e = null;
        }
    }

    /* renamed from: m */
    private final <T> void m7471m(C3265m<T> c3265m, int i10, AbstractC5510e abstractC5510e) {
        C1371s m7584b;
        if (i10 == 0 || (m7584b = C1371s.m7584b(this, i10, abstractC5510e.mo20264h())) == null) {
            return;
        }
        AbstractC3263l<T> m14512a = c3265m.m14512a();
        Handler handler = this.f6183p;
        handler.getClass();
        m14512a.mo14496c(new Executor() { // from class: y2.q

            /* renamed from: n */
            public final /* synthetic */ Handler f20822n;

            public /* synthetic */ ExecutorC5627q(Handler handler2) {
                r1 = handler2;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                r1.post(runnable);
            }
        }, m7584b);
    }

    /* renamed from: y */
    public static C1350c m7481y() {
        C1350c c1350c;
        synchronized (f6166t) {
            C5984j.m21287k(f6167u, "Must guarantee manager is non-null before using getInstance");
            c1350c = f6167u;
        }
        return c1350c;
    }

    /* renamed from: z */
    public static C1350c m7482z(Context context) {
        C1350c c1350c;
        synchronized (f6166t) {
            if (f6167u == null) {
                f6167u = new C1350c(context.getApplicationContext(), AbstractC1390d.m7690c().getLooper(), C1342a.m7385o());
            }
            c1350c = f6167u;
        }
        return c1350c;
    }

    /* renamed from: B */
    public final AbstractC3263l<Map<C5602b<?>, String>> m7483B(Iterable<? extends InterfaceC5512g<?>> iterable) {
        C5611f0 c5611f0 = new C5611f0(iterable);
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(2, c5611f0));
        return c5611f0.m20631a();
    }

    /* renamed from: G */
    public final <O extends C5506a.d> void m7484G(AbstractC5510e<O> abstractC5510e, int i10, AbstractC1348b<? extends InterfaceC5518m, C5506a.b> abstractC1348b) {
        C1376x c1376x = new C1376x(i10, abstractC1348b);
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(4, new C5635y(c1376x, this.f6178k.get(), abstractC5510e)));
    }

    /* renamed from: H */
    public final <O extends C5506a.d, ResultT> void m7485H(AbstractC5510e<O> abstractC5510e, int i10, AbstractC1352d<C5506a.b, ResultT> abstractC1352d, C3265m<ResultT> c3265m, InterfaceC5623m interfaceC5623m) {
        m7471m(c3265m, abstractC1352d.m7500d(), abstractC5510e);
        C1377y c1377y = new C1377y(i10, abstractC1352d, c3265m, interfaceC5623m);
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(4, new C5635y(c1377y, this.f6178k.get(), abstractC5510e)));
    }

    /* renamed from: I */
    public final void m7486I(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(18, new C1372t(methodInvocation, i10, j10, i11)));
    }

    /* renamed from: J */
    public final void m7487J(ConnectionResult connectionResult, int i10) {
        if (m7493h(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    /* renamed from: b */
    public final void m7488b() {
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m7489c(AbstractC5510e<?> abstractC5510e) {
        Handler handler = this.f6183p;
        handler.sendMessage(handler.obtainMessage(7, abstractC5510e));
    }

    /* renamed from: d */
    public final void m7490d(C1360h c1360h) {
        synchronized (f6166t) {
            if (this.f6180m != c1360h) {
                this.f6180m = c1360h;
                this.f6181n.clear();
            }
            this.f6181n.addAll(c1360h.m7528t());
        }
    }

    /* renamed from: e */
    public final void m7491e(C1360h c1360h) {
        synchronized (f6166t) {
            if (this.f6180m == c1360h) {
                this.f6180m = null;
                this.f6181n.clear();
            }
        }
    }

    /* renamed from: g */
    public final boolean m7492g() {
        if (this.f6171d) {
            return false;
        }
        RootTelemetryConfiguration m21294a = C5986k.m21293b().m21294a();
        if (m21294a != null && !m21294a.m7625z()) {
            return false;
        }
        int m21319a = this.f6176i.m21319a(this.f6174g, 203400000);
        return m21319a == -1 || m21319a == 0;
    }

    /* renamed from: h */
    public final boolean m7493h(ConnectionResult connectionResult, int i10) {
        return this.f6175h.m7405y(this.f6174g, connectionResult, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C5602b c5602b;
        boolean m7548q;
        C5602b c5602b2;
        C5602b c5602b3;
        C5602b c5602b4;
        C5602b c5602b5;
        int i10 = message.what;
        C1367o<?> c1367o = null;
        switch (i10) {
            case 1:
                this.f6170c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f6183p.removeMessages(12);
                for (C5602b<?> c5602b6 : this.f6179l.keySet()) {
                    Handler handler = this.f6183p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c5602b6), this.f6170c);
                }
                return true;
            case 2:
                C5611f0 c5611f0 = (C5611f0) message.obj;
                Iterator<C5602b<?>> it = c5611f0.m20632b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C5602b<?> next = it.next();
                        C1367o<?> c1367o2 = this.f6179l.get(next);
                        if (c1367o2 == null) {
                            c5611f0.m20633c(next, new ConnectionResult(13), null);
                        } else if (c1367o2.m7563O()) {
                            c5611f0.m20633c(next, ConnectionResult.f6108r, c1367o2.m7572v().mo20255k());
                        } else {
                            ConnectionResult m7571t = c1367o2.m7571t();
                            if (m7571t != null) {
                                c5611f0.m20633c(next, m7571t, null);
                            } else {
                                c1367o2.m7559J(c5611f0);
                                c1367o2.m7554E();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C1367o<?> c1367o3 : this.f6179l.values()) {
                    c1367o3.m7553D();
                    c1367o3.m7554E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C5635y c5635y = (C5635y) message.obj;
                C1367o<?> c1367o4 = this.f6179l.get(c5635y.f20831c.mo20264h());
                if (c1367o4 == null) {
                    c1367o4 = m7468j(c5635y.f20831c);
                }
                if (c1367o4.m7564P() && this.f6178k.get() != c5635y.f20830b) {
                    c5635y.f20829a.mo7448a(f6164r);
                    c1367o4.m7561L();
                } else {
                    c1367o4.m7555F(c5635y.f20829a);
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C1367o<?>> it2 = this.f6179l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1367o<?> next2 = it2.next();
                        if (next2.m7569r() == i11) {
                            c1367o = next2;
                        }
                    }
                }
                if (c1367o != null) {
                    if (connectionResult.m7380x() == 13) {
                        String mo7389e = this.f6175h.mo7389e(connectionResult.m7380x());
                        String m7381y = connectionResult.m7381y();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(mo7389e).length() + 69 + String.valueOf(m7381y).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(mo7389e);
                        sb2.append(": ");
                        sb2.append(m7381y);
                        c1367o.m7538d(new Status(17, sb2.toString()));
                    } else {
                        c5602b = ((C1367o) c1367o).f6219e;
                        c1367o.m7538d(m7467i(c5602b, connectionResult));
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i11);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                }
                return true;
            case 6:
                if (this.f6174g.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C1346a.m7441c((Application) this.f6174g.getApplicationContext());
                    ComponentCallbacks2C1346a.m7440b().m7443a(new C1362j(this));
                    if (!ComponentCallbacks2C1346a.m7440b().m7445e(true)) {
                        this.f6170c = 300000L;
                    }
                }
                return true;
            case 7:
                m7468j((AbstractC5510e) message.obj);
                return true;
            case 9:
                if (this.f6179l.containsKey(message.obj)) {
                    this.f6179l.get(message.obj).m7560K();
                }
                return true;
            case 10:
                Iterator<C5602b<?>> it3 = this.f6182o.iterator();
                while (it3.hasNext()) {
                    C1367o<?> remove = this.f6179l.remove(it3.next());
                    if (remove != null) {
                        remove.m7561L();
                    }
                }
                this.f6182o.clear();
                return true;
            case 11:
                if (this.f6179l.containsKey(message.obj)) {
                    this.f6179l.get(message.obj).m7562M();
                }
                return true;
            case 12:
                if (this.f6179l.containsKey(message.obj)) {
                    this.f6179l.get(message.obj).m7565a();
                }
                return true;
            case 14:
                C1361i c1361i = (C1361i) message.obj;
                C5602b<?> m7529a = c1361i.m7529a();
                if (!this.f6179l.containsKey(m7529a)) {
                    c1361i.m7530b().m14514c(Boolean.FALSE);
                } else {
                    m7548q = this.f6179l.get(m7529a).m7548q(false);
                    c1361i.m7530b().m14514c(Boolean.valueOf(m7548q));
                }
                return true;
            case 15:
                C1368p c1368p = (C1368p) message.obj;
                Map<C5602b<?>, C1367o<?>> map = this.f6179l;
                c5602b2 = c1368p.f6230a;
                if (map.containsKey(c5602b2)) {
                    Map<C5602b<?>, C1367o<?>> map2 = this.f6179l;
                    c5602b3 = c1368p.f6230a;
                    C1367o.m7533B(map2.get(c5602b3), c1368p);
                }
                return true;
            case 16:
                C1368p c1368p2 = (C1368p) message.obj;
                Map<C5602b<?>, C1367o<?>> map3 = this.f6179l;
                c5602b4 = c1368p2.f6230a;
                if (map3.containsKey(c5602b4)) {
                    Map<C5602b<?>, C1367o<?>> map4 = this.f6179l;
                    c5602b5 = c1368p2.f6230a;
                    C1367o.m7534C(map4.get(c5602b5), c1368p2);
                }
                return true;
            case 17:
                m7470l();
                return true;
            case 18:
                C1372t c1372t = (C1372t) message.obj;
                if (c1372t.f6247c == 0) {
                    m7469k().mo6180c(new TelemetryData(c1372t.f6246b, Arrays.asList(c1372t.f6245a)));
                } else {
                    TelemetryData telemetryData = this.f6172e;
                    if (telemetryData != null) {
                        List<MethodInvocation> m7627y = telemetryData.m7627y();
                        if (telemetryData.m7626x() == c1372t.f6246b && (m7627y == null || m7627y.size() < c1372t.f6248d)) {
                            this.f6172e.m7628z(c1372t.f6245a);
                        } else {
                            this.f6183p.removeMessages(17);
                            m7470l();
                        }
                    }
                    if (this.f6172e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c1372t.f6245a);
                        this.f6172e = new TelemetryData(c1372t.f6246b, arrayList);
                        Handler handler2 = this.f6183p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c1372t.f6247c);
                    }
                }
                return true;
            case 19:
                this.f6171d = false;
                return true;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i10);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
    }

    /* renamed from: n */
    public final int m7494n() {
        return this.f6177j.getAndIncrement();
    }

    /* renamed from: x */
    public final C1367o m7495x(C5602b<?> c5602b) {
        return this.f6179l.get(c5602b);
    }
}
