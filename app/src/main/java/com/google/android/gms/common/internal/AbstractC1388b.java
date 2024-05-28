package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1379b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p321z2.C5984j;
import p321z2.C5986k;
import p321z2.C5993n0;
import p321z2.InterfaceC5976f;

/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC1388b<T extends IInterface> {

    /* renamed from: A */
    private boolean f6312A;

    /* renamed from: B */
    private volatile zzk f6313B;

    /* renamed from: C */
    protected AtomicInteger f6314C;

    /* renamed from: a */
    private int f6315a;

    /* renamed from: b */
    private long f6316b;

    /* renamed from: c */
    private long f6317c;

    /* renamed from: d */
    private int f6318d;

    /* renamed from: e */
    private long f6319e;

    /* renamed from: f */
    private volatile String f6320f;

    /* renamed from: g */
    C1409w f6321g;

    /* renamed from: h */
    private final Context f6322h;

    /* renamed from: i */
    private final Looper f6323i;

    /* renamed from: j */
    private final AbstractC1390d f6324j;

    /* renamed from: k */
    private final C1379b f6325k;

    /* renamed from: l */
    final Handler f6326l;

    /* renamed from: m */
    private final Object f6327m;

    /* renamed from: n */
    private final Object f6328n;

    /* renamed from: o */
    private InterfaceC5976f f6329o;

    /* renamed from: p */
    protected c f6330p;

    /* renamed from: q */
    private IInterface f6331q;

    /* renamed from: r */
    private final ArrayList f6332r;

    /* renamed from: s */
    private ServiceConnectionC1401o f6333s;

    /* renamed from: t */
    private int f6334t;

    /* renamed from: u */
    private final a f6335u;

    /* renamed from: v */
    private final b f6336v;

    /* renamed from: w */
    private final int f6337w;

    /* renamed from: x */
    private final String f6338x;

    /* renamed from: y */
    private volatile String f6339y;

    /* renamed from: z */
    private ConnectionResult f6340z;

    /* renamed from: E */
    private static final Feature[] f6311E = new Feature[0];

    /* renamed from: D */
    public static final String[] f6310D = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: i */
        void mo7681i(int i10);

        /* renamed from: n */
        void mo7682n(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: l */
        void mo7683l(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.b$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo7581a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.b$d */
    /* loaded from: classes.dex */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC1388b.c
        /* renamed from: a */
        public final void mo7581a(ConnectionResult connectionResult) {
            if (connectionResult.m7379B()) {
                AbstractC1388b abstractC1388b = AbstractC1388b.this;
                abstractC1388b.m7662e(null, abstractC1388b.mo7645C());
            } else if (AbstractC1388b.this.f6336v != null) {
                AbstractC1388b.this.f6336v.mo7683l(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.b$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo7531a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1388b(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC1388b.a r13, com.google.android.gms.common.internal.AbstractC1388b.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.d r3 = com.google.android.gms.common.internal.AbstractC1390d.m7689b(r10)
            com.google.android.gms.common.b r4 = com.google.android.gms.common.C1379b.m7589f()
            p321z2.C5984j.m21286j(r13)
            p321z2.C5984j.m21286j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1388b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* bridge */ /* synthetic */ void m7638c0(AbstractC1388b abstractC1388b, zzk zzkVar) {
        abstractC1388b.f6313B = zzkVar;
        if (abstractC1388b.mo7658S()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f6398q;
            C5986k.m21293b().m21295c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.m7616C());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* bridge */ /* synthetic */ void m7639d0(AbstractC1388b abstractC1388b, int i10) {
        int i11;
        int i12;
        synchronized (abstractC1388b.f6327m) {
            i11 = abstractC1388b.f6334t;
        }
        if (i11 == 3) {
            abstractC1388b.f6312A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC1388b.f6326l;
        handler.sendMessage(handler.obtainMessage(i12, abstractC1388b.f6314C.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* bridge */ /* synthetic */ boolean m7641g0(AbstractC1388b abstractC1388b, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC1388b.f6327m) {
            if (abstractC1388b.f6334t != i10) {
                return false;
            }
            abstractC1388b.m7643i0(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ boolean m7642h0(com.google.android.gms.common.internal.AbstractC1388b r2) {
        /*
            boolean r0 = r2.f6312A
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo6182E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m7644B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo6182E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1388b.m7642h0(com.google.android.gms.common.internal.b):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i0 */
    public final void m7643i0(int i10, IInterface iInterface) {
        C1409w c1409w;
        C1409w c1409w2;
        C5984j.m21277a((i10 == 4) == (iInterface != 0));
        synchronized (this.f6327m) {
            this.f6334t = i10;
            this.f6331q = iInterface;
            if (i10 == 1) {
                ServiceConnectionC1401o serviceConnectionC1401o = this.f6333s;
                if (serviceConnectionC1401o != null) {
                    AbstractC1390d abstractC1390d = this.f6324j;
                    String m7725b = this.f6321g.m7725b();
                    C5984j.m21286j(m7725b);
                    abstractC1390d.m7692e(m7725b, this.f6321g.m7724a(), 4225, serviceConnectionC1401o, m7659X(), this.f6321g.m7726c());
                    this.f6333s = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                ServiceConnectionC1401o serviceConnectionC1401o2 = this.f6333s;
                if (serviceConnectionC1401o2 != null && (c1409w2 = this.f6321g) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c1409w2.m7725b() + " on " + c1409w2.m7724a());
                    AbstractC1390d abstractC1390d2 = this.f6324j;
                    String m7725b2 = this.f6321g.m7725b();
                    C5984j.m21286j(m7725b2);
                    abstractC1390d2.m7692e(m7725b2, this.f6321g.m7724a(), 4225, serviceConnectionC1401o2, m7659X(), this.f6321g.m7726c());
                    this.f6314C.incrementAndGet();
                }
                ServiceConnectionC1401o serviceConnectionC1401o3 = new ServiceConnectionC1401o(this, this.f6314C.get());
                this.f6333s = serviceConnectionC1401o3;
                if (this.f6334t == 3 && m7644B() != null) {
                    c1409w = new C1409w(m7679y().getPackageName(), m7644B(), true, 4225, false);
                } else {
                    c1409w = new C1409w(m7647G(), mo6183F(), false, 4225, mo6184I());
                }
                this.f6321g = c1409w;
                if (c1409w.m7726c() && mo6185h() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f6321g.m7725b())));
                }
                AbstractC1390d abstractC1390d3 = this.f6324j;
                String m7725b3 = this.f6321g.m7725b();
                C5984j.m21286j(m7725b3);
                if (!abstractC1390d3.mo7693f(new C5993n0(m7725b3, this.f6321g.m7724a(), 4225, this.f6321g.m7726c()), serviceConnectionC1401o3, m7659X(), mo7677w())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f6321g.m7725b() + " on " + this.f6321g.m7724a());
                    m7663e0(16, null, this.f6314C.get());
                }
            } else if (i10 == 4) {
                C5984j.m21286j(iInterface);
                m7650K(iInterface);
            }
        }
    }

    /* renamed from: A */
    protected Bundle mo6181A() {
        return new Bundle();
    }

    /* renamed from: B */
    protected String m7644B() {
        return null;
    }

    /* renamed from: C */
    protected Set<Scope> mo7645C() {
        return Collections.emptySet();
    }

    /* renamed from: D */
    public final T m7646D() throws DeadObjectException {
        T t10;
        synchronized (this.f6327m) {
            if (this.f6334t != 5) {
                m7674r();
                t10 = (T) this.f6331q;
                C5984j.m21287k(t10, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public abstract String mo6182E();

    /* renamed from: F */
    protected abstract String mo6183F();

    /* renamed from: G */
    protected String m7647G() {
        return "com.google.android.gms";
    }

    /* renamed from: H */
    public ConnectionTelemetryConfiguration m7648H() {
        zzk zzkVar = this.f6313B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f6398q;
    }

    /* renamed from: I */
    protected boolean mo6184I() {
        return mo6185h() >= 211700000;
    }

    /* renamed from: J */
    public boolean m7649J() {
        return this.f6313B != null;
    }

    /* renamed from: K */
    protected void m7650K(T t10) {
        this.f6317c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m7651L(ConnectionResult connectionResult) {
        this.f6318d = connectionResult.m7380x();
        this.f6319e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void m7652M(int i10) {
        this.f6315a = i10;
        this.f6316b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public void m7653N(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.f6326l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new C1402p(this, i10, iBinder, bundle)));
    }

    /* renamed from: O */
    public boolean m7654O() {
        return false;
    }

    /* renamed from: P */
    public void m7655P(String str) {
        this.f6339y = str;
    }

    /* renamed from: Q */
    public void m7656Q(int i10) {
        Handler handler = this.f6326l;
        handler.sendMessage(handler.obtainMessage(6, this.f6314C.get(), i10));
    }

    /* renamed from: R */
    protected void m7657R(c cVar, int i10, PendingIntent pendingIntent) {
        C5984j.m21287k(cVar, "Connection progress callbacks cannot be null.");
        this.f6330p = cVar;
        Handler handler = this.f6326l;
        handler.sendMessage(handler.obtainMessage(3, this.f6314C.get(), i10, pendingIntent));
    }

    /* renamed from: S */
    public boolean mo7658S() {
        return false;
    }

    /* renamed from: X */
    protected final String m7659X() {
        String str = this.f6338x;
        return str == null ? this.f6322h.getClass().getName() : str;
    }

    /* renamed from: a */
    public void m7660a(e eVar) {
        eVar.mo7531a();
    }

    /* renamed from: b */
    public boolean m7661b() {
        boolean z10;
        synchronized (this.f6327m) {
            z10 = this.f6334t == 4;
        }
        return z10;
    }

    /* renamed from: e */
    public void m7662e(InterfaceC1391e interfaceC1391e, Set<Scope> set) {
        Bundle mo6181A = mo6181A();
        int i10 = this.f6337w;
        String str = this.f6339y;
        int i11 = C1379b.f6256a;
        Scope[] scopeArr = GetServiceRequest.f6278B;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f6279C;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f6284q = this.f6322h.getPackageName();
        getServiceRequest.f6287t = mo6181A;
        if (set != null) {
            getServiceRequest.f6286s = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo7672o()) {
            Account mo7676u = mo7676u();
            if (mo7676u == null) {
                mo7676u = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f6288u = mo7676u;
            if (interfaceC1391e != null) {
                getServiceRequest.f6285r = interfaceC1391e.asBinder();
            }
        } else if (m7654O()) {
            getServiceRequest.f6288u = mo7676u();
        }
        getServiceRequest.f6289v = f6311E;
        getServiceRequest.f6290w = mo6187v();
        if (mo7658S()) {
            getServiceRequest.f6293z = true;
        }
        try {
            synchronized (this.f6328n) {
                InterfaceC5976f interfaceC5976f = this.f6329o;
                if (interfaceC5976f != null) {
                    interfaceC5976f.mo7699V(new BinderC1400n(this, this.f6314C.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            m7656Q(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m7653N(8, null, null, this.f6314C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m7653N(8, null, null, this.f6314C.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public final void m7663e0(int i10, Bundle bundle, int i11) {
        Handler handler = this.f6326l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new C1403q(this, i10, null)));
    }

    /* renamed from: f */
    public void m7664f(String str) {
        this.f6320f = str;
        m7671n();
    }

    /* renamed from: g */
    public boolean m7665g() {
        return true;
    }

    /* renamed from: h */
    public int mo6185h() {
        return C1379b.f6256a;
    }

    /* renamed from: i */
    public boolean m7666i() {
        boolean z10;
        synchronized (this.f6327m) {
            int i10 = this.f6334t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final Feature[] m7667j() {
        zzk zzkVar = this.f6313B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f6396o;
    }

    /* renamed from: k */
    public String m7668k() {
        C1409w c1409w;
        if (m7661b() && (c1409w = this.f6321g) != null) {
            return c1409w.m7724a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: l */
    public String m7669l() {
        return this.f6320f;
    }

    /* renamed from: m */
    public void m7670m(c cVar) {
        C5984j.m21287k(cVar, "Connection progress callbacks cannot be null.");
        this.f6330p = cVar;
        m7643i0(2, null);
    }

    /* renamed from: n */
    public void m7671n() {
        this.f6314C.incrementAndGet();
        synchronized (this.f6332r) {
            int size = this.f6332r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC1399m) this.f6332r.get(i10)).m7703d();
            }
            this.f6332r.clear();
        }
        synchronized (this.f6328n) {
            this.f6329o = null;
        }
        m7643i0(1, null);
    }

    /* renamed from: o */
    public boolean mo7672o() {
        return false;
    }

    /* renamed from: q */
    public void m7673q() {
        int mo7391h = this.f6325k.mo7391h(this.f6322h, mo6185h());
        if (mo7391h != 0) {
            m7643i0(1, null);
            m7657R(new d(), mo7391h, null);
        } else {
            m7670m(new d());
        }
    }

    /* renamed from: r */
    protected final void m7674r() {
        if (!m7661b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public abstract T mo6186s(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean m7675t() {
        return false;
    }

    /* renamed from: u */
    public Account mo7676u() {
        return null;
    }

    /* renamed from: v */
    public Feature[] mo6187v() {
        return f6311E;
    }

    /* renamed from: w */
    protected Executor mo7677w() {
        return null;
    }

    /* renamed from: x */
    public Bundle m7678x() {
        return null;
    }

    /* renamed from: y */
    public final Context m7679y() {
        return this.f6322h;
    }

    /* renamed from: z */
    public int m7680z() {
        return this.f6337w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1388b(Context context, Looper looper, AbstractC1390d abstractC1390d, C1379b c1379b, int i10, a aVar, b bVar, String str) {
        this.f6320f = null;
        this.f6327m = new Object();
        this.f6328n = new Object();
        this.f6332r = new ArrayList();
        this.f6334t = 1;
        this.f6340z = null;
        this.f6312A = false;
        this.f6313B = null;
        this.f6314C = new AtomicInteger(0);
        C5984j.m21287k(context, "Context must not be null");
        this.f6322h = context;
        C5984j.m21287k(looper, "Looper must not be null");
        this.f6323i = looper;
        C5984j.m21287k(abstractC1390d, "Supervisor must not be null");
        this.f6324j = abstractC1390d;
        C5984j.m21287k(c1379b, "API availability must not be null");
        this.f6325k = c1379b;
        this.f6326l = new HandlerC1398l(this, looper);
        this.f6337w = i10;
        this.f6335u = aVar;
        this.f6336v = bVar;
        this.f6338x = str;
    }
}
