package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import p017b3.C0986e;
import p070f3.C3128b;
import p085g4.C3265m;
import p093h0.C3356a;
import p295x2.AbstractC5510e;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p295x2.C5506a.d;
import p295x2.C5520o;
import p308y2.AbstractC5632v;
import p308y2.BinderC5607d0;
import p308y2.C5602b;
import p308y2.C5611f0;
import p308y2.C5614h;
import p308y2.C5636z;
import p321z2.C5980h;
import p321z2.C5984j;
import p321z2.C6007x;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* loaded from: classes.dex */
public final class C1367o<O extends C5506a.d> implements AbstractC5511f.a, AbstractC5511f.b {

    /* renamed from: d */
    private final C5506a.f f6218d;

    /* renamed from: e */
    private final C5602b<O> f6219e;

    /* renamed from: f */
    private final C1358g f6220f;

    /* renamed from: i */
    private final int f6223i;

    /* renamed from: j */
    private final BinderC5607d0 f6224j;

    /* renamed from: k */
    private boolean f6225k;

    /* renamed from: o */
    final /* synthetic */ C1350c f6229o;

    /* renamed from: c */
    private final Queue<AbstractC1347a0> f6217c = new LinkedList();

    /* renamed from: g */
    private final Set<C5611f0> f6221g = new HashSet();

    /* renamed from: h */
    private final Map<C5614h<?>, C5636z> f6222h = new HashMap();

    /* renamed from: l */
    private final List<C1368p> f6226l = new ArrayList();

    /* renamed from: m */
    private ConnectionResult f6227m = null;

    /* renamed from: n */
    private int f6228n = 0;

    public C1367o(C1350c c1350c, AbstractC5510e<O> abstractC5510e) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f6229o = c1350c;
        handler = c1350c.f6183p;
        C5506a.f m20276u = abstractC5510e.m20276u(handler.getLooper(), this);
        this.f6218d = m20276u;
        this.f6219e = abstractC5510e.mo20264h();
        this.f6220f = new C1358g();
        this.f6223i = abstractC5510e.m20275t();
        if (!m20276u.mo7672o()) {
            this.f6224j = null;
            return;
        }
        context = c1350c.f6174g;
        handler2 = c1350c.f6183p;
        this.f6224j = abstractC5510e.m20277v(context, handler2);
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m7533B(C1367o c1367o, C1368p c1368p) {
        if (c1367o.f6226l.contains(c1368p) && !c1367o.f6225k) {
            if (c1367o.f6218d.mo20249b()) {
                c1367o.m7540f();
            } else {
                c1367o.m7554E();
            }
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m7534C(C1367o c1367o, C1368p c1368p) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] mo7588g;
        if (c1367o.f6226l.remove(c1368p)) {
            handler = c1367o.f6229o.f6183p;
            handler.removeMessages(15, c1368p);
            handler2 = c1367o.f6229o.f6183p;
            handler2.removeMessages(16, c1368p);
            feature = c1368p.f6231b;
            ArrayList arrayList = new ArrayList(c1367o.f6217c.size());
            for (AbstractC1347a0 abstractC1347a0 : c1367o.f6217c) {
                if ((abstractC1347a0 instanceof AbstractC5632v) && (mo7588g = ((AbstractC5632v) abstractC1347a0).mo7588g(c1367o)) != null && C3128b.m13779c(mo7588g, feature)) {
                    arrayList.add(abstractC1347a0);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1347a0 abstractC1347a02 = (AbstractC1347a0) arrayList.get(i10);
                c1367o.f6217c.remove(abstractC1347a02);
                abstractC1347a02.mo7449b(new C5520o(feature));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final Feature m7536b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] mo20254j = this.f6218d.mo20254j();
            if (mo20254j == null) {
                mo20254j = new Feature[0];
            }
            C3356a c3356a = new C3356a(mo20254j.length);
            for (Feature feature : mo20254j) {
                c3356a.put(feature.m7383x(), Long.valueOf(feature.m7384y()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) c3356a.get(feature2.m7383x());
                if (l10 == null || l10.longValue() < feature2.m7384y()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m7537c(ConnectionResult connectionResult) {
        Iterator<C5611f0> it = this.f6221g.iterator();
        while (it.hasNext()) {
            it.next().m20633c(this.f6219e, connectionResult, C5980h.m21269b(connectionResult, ConnectionResult.f6108r) ? this.f6218d.mo20255k() : null);
        }
        this.f6221g.clear();
    }

    /* renamed from: d */
    public final void m7538d(Status status) {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        m7539e(status, null, false);
    }

    /* renamed from: e */
    private final void m7539e(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        if ((status == null) != (exc == null)) {
            Iterator<AbstractC1347a0> it = this.f6217c.iterator();
            while (it.hasNext()) {
                AbstractC1347a0 next = it.next();
                if (!z10 || next.f6159a == 2) {
                    if (status != null) {
                        next.mo7448a(status);
                    } else {
                        next.mo7449b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m7540f() {
        ArrayList arrayList = new ArrayList(this.f6217c);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1347a0 abstractC1347a0 = (AbstractC1347a0) arrayList.get(i10);
            if (!this.f6218d.mo20249b()) {
                return;
            }
            if (m7546o(abstractC1347a0)) {
                this.f6217c.remove(abstractC1347a0);
            }
        }
    }

    /* renamed from: g */
    public final void m7541g() {
        m7553D();
        m7537c(ConnectionResult.f6108r);
        m7545m();
        Iterator<C5636z> it = this.f6222h.values().iterator();
        if (!it.hasNext()) {
            m7540f();
            m7543j();
        } else {
            Objects.requireNonNull(it.next());
            throw null;
        }
    }

    /* renamed from: h */
    public final void m7542h(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        C6007x c6007x;
        m7553D();
        this.f6225k = true;
        this.f6220f.m7523e(i10, this.f6218d.mo20256l());
        C1350c c1350c = this.f6229o;
        handler = c1350c.f6183p;
        handler2 = c1350c.f6183p;
        Message obtain = Message.obtain(handler2, 9, this.f6219e);
        j10 = this.f6229o.f6168a;
        handler.sendMessageDelayed(obtain, j10);
        C1350c c1350c2 = this.f6229o;
        handler3 = c1350c2.f6183p;
        handler4 = c1350c2.f6183p;
        Message obtain2 = Message.obtain(handler4, 11, this.f6219e);
        j11 = this.f6229o.f6169b;
        handler3.sendMessageDelayed(obtain2, j11);
        c6007x = this.f6229o.f6176i;
        c6007x.m21321c();
        Iterator<C5636z> it = this.f6222h.values().iterator();
        while (it.hasNext()) {
            it.next().f20832a.run();
        }
    }

    /* renamed from: j */
    private final void m7543j() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f6229o.f6183p;
        handler.removeMessages(12, this.f6219e);
        C1350c c1350c = this.f6229o;
        handler2 = c1350c.f6183p;
        handler3 = c1350c.f6183p;
        Message obtainMessage = handler3.obtainMessage(12, this.f6219e);
        j10 = this.f6229o.f6170c;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    /* renamed from: k */
    private final void m7544k(AbstractC1347a0 abstractC1347a0) {
        abstractC1347a0.mo7451d(this.f6220f, m7564P());
        try {
            abstractC1347a0.mo7450c(this);
        } catch (DeadObjectException unused) {
            mo7566i(1);
            this.f6218d.mo20251f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: m */
    private final void m7545m() {
        Handler handler;
        Handler handler2;
        if (this.f6225k) {
            handler = this.f6229o.f6183p;
            handler.removeMessages(11, this.f6219e);
            handler2 = this.f6229o.f6183p;
            handler2.removeMessages(9, this.f6219e);
            this.f6225k = false;
        }
    }

    /* renamed from: o */
    private final boolean m7546o(AbstractC1347a0 abstractC1347a0) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(abstractC1347a0 instanceof AbstractC5632v)) {
            m7544k(abstractC1347a0);
            return true;
        }
        AbstractC5632v abstractC5632v = (AbstractC5632v) abstractC1347a0;
        Feature m7536b = m7536b(abstractC5632v.mo7588g(this));
        if (m7536b == null) {
            m7544k(abstractC1347a0);
            return true;
        }
        String name = this.f6218d.getClass().getName();
        String m7383x = m7536b.m7383x();
        long m7384y = m7536b.m7384y();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(m7383x).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(m7383x);
        sb2.append(", ");
        sb2.append(m7384y);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z10 = this.f6229o.f6184q;
        if (z10 && abstractC5632v.mo7587f(this)) {
            C1368p c1368p = new C1368p(this.f6219e, m7536b, null);
            int indexOf = this.f6226l.indexOf(c1368p);
            if (indexOf >= 0) {
                C1368p c1368p2 = this.f6226l.get(indexOf);
                handler5 = this.f6229o.f6183p;
                handler5.removeMessages(15, c1368p2);
                C1350c c1350c = this.f6229o;
                handler6 = c1350c.f6183p;
                handler7 = c1350c.f6183p;
                Message obtain = Message.obtain(handler7, 15, c1368p2);
                j12 = this.f6229o.f6168a;
                handler6.sendMessageDelayed(obtain, j12);
                return false;
            }
            this.f6226l.add(c1368p);
            C1350c c1350c2 = this.f6229o;
            handler = c1350c2.f6183p;
            handler2 = c1350c2.f6183p;
            Message obtain2 = Message.obtain(handler2, 15, c1368p);
            j10 = this.f6229o.f6168a;
            handler.sendMessageDelayed(obtain2, j10);
            C1350c c1350c3 = this.f6229o;
            handler3 = c1350c3.f6183p;
            handler4 = c1350c3.f6183p;
            Message obtain3 = Message.obtain(handler4, 16, c1368p);
            j11 = this.f6229o.f6169b;
            handler3.sendMessageDelayed(obtain3, j11);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (m7547p(connectionResult)) {
                return false;
            }
            this.f6229o.m7493h(connectionResult, this.f6223i);
            return false;
        }
        abstractC5632v.mo7449b(new C5520o(m7536b));
        return true;
    }

    /* renamed from: p */
    private final boolean m7547p(ConnectionResult connectionResult) {
        Object obj;
        C1360h c1360h;
        Set set;
        C1360h c1360h2;
        obj = C1350c.f6166t;
        synchronized (obj) {
            C1350c c1350c = this.f6229o;
            c1360h = c1350c.f6180m;
            if (c1360h != null) {
                set = c1350c.f6181n;
                if (set.contains(this.f6219e)) {
                    c1360h2 = this.f6229o.f6180m;
                    c1360h2.m7516s(connectionResult, this.f6223i);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m7548q(boolean z10) {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        if (!this.f6218d.mo20249b() || this.f6222h.size() != 0) {
            return false;
        }
        if (!this.f6220f.m7525g()) {
            this.f6218d.mo20251f("Timing out service connection.");
            return true;
        }
        if (z10) {
            m7543j();
        }
        return false;
    }

    /* renamed from: D */
    public final void m7553D() {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        this.f6227m = null;
    }

    /* renamed from: E */
    public final void m7554E() {
        Handler handler;
        C6007x c6007x;
        Context context;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        if (this.f6218d.mo20249b() || this.f6218d.mo20253i()) {
            return;
        }
        try {
            C1350c c1350c = this.f6229o;
            c6007x = c1350c.f6176i;
            context = c1350c.f6174g;
            int m21320b = c6007x.m21320b(context, this.f6218d);
            if (m21320b != 0) {
                ConnectionResult connectionResult = new ConnectionResult(m21320b, null);
                String name = this.f6218d.getClass().getName();
                String obj = connectionResult.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(obj);
                Log.w("GoogleApiManager", sb2.toString());
                m7557H(connectionResult, null);
                return;
            }
            C1350c c1350c2 = this.f6229o;
            C5506a.f fVar = this.f6218d;
            C1370r c1370r = new C1370r(c1350c2, fVar, this.f6219e);
            if (fVar.mo7672o()) {
                ((BinderC5607d0) C5984j.m21286j(this.f6224j)).m20625M0(c1370r);
            }
            try {
                this.f6218d.mo20257m(c1370r);
            } catch (SecurityException e10) {
                m7557H(new ConnectionResult(10), e10);
            }
        } catch (IllegalStateException e11) {
            m7557H(new ConnectionResult(10), e11);
        }
    }

    /* renamed from: F */
    public final void m7555F(AbstractC1347a0 abstractC1347a0) {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        if (this.f6218d.mo20249b()) {
            if (m7546o(abstractC1347a0)) {
                m7543j();
                return;
            } else {
                this.f6217c.add(abstractC1347a0);
                return;
            }
        }
        this.f6217c.add(abstractC1347a0);
        ConnectionResult connectionResult = this.f6227m;
        if (connectionResult != null && connectionResult.m7378A()) {
            m7557H(this.f6227m, null);
        } else {
            m7554E();
        }
    }

    /* renamed from: G */
    public final void m7556G() {
        this.f6228n++;
    }

    /* renamed from: H */
    public final void m7557H(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        C6007x c6007x;
        boolean z10;
        Status m7467i;
        Status m7467i2;
        Status m7467i3;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        BinderC5607d0 binderC5607d0 = this.f6224j;
        if (binderC5607d0 != null) {
            binderC5607d0.m20626N0();
        }
        m7553D();
        c6007x = this.f6229o.f6176i;
        c6007x.m21321c();
        m7537c(connectionResult);
        if ((this.f6218d instanceof C0986e) && connectionResult.m7380x() != 24) {
            this.f6229o.f6171d = true;
            C1350c c1350c = this.f6229o;
            handler5 = c1350c.f6183p;
            handler6 = c1350c.f6183p;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.m7380x() == 4) {
            status = C1350c.f6165s;
            m7538d(status);
            return;
        }
        if (this.f6217c.isEmpty()) {
            this.f6227m = connectionResult;
            return;
        }
        if (exc != null) {
            handler4 = this.f6229o.f6183p;
            C5984j.m21280d(handler4);
            m7539e(null, exc, false);
            return;
        }
        z10 = this.f6229o.f6184q;
        if (z10) {
            m7467i2 = C1350c.m7467i(this.f6219e, connectionResult);
            m7539e(m7467i2, null, true);
            if (this.f6217c.isEmpty() || m7547p(connectionResult) || this.f6229o.m7493h(connectionResult, this.f6223i)) {
                return;
            }
            if (connectionResult.m7380x() == 18) {
                this.f6225k = true;
            }
            if (this.f6225k) {
                C1350c c1350c2 = this.f6229o;
                handler2 = c1350c2.f6183p;
                handler3 = c1350c2.f6183p;
                Message obtain = Message.obtain(handler3, 9, this.f6219e);
                j10 = this.f6229o.f6168a;
                handler2.sendMessageDelayed(obtain, j10);
                return;
            }
            m7467i3 = C1350c.m7467i(this.f6219e, connectionResult);
            m7538d(m7467i3);
            return;
        }
        m7467i = C1350c.m7467i(this.f6219e, connectionResult);
        m7538d(m7467i);
    }

    /* renamed from: I */
    public final void m7558I(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        C5506a.f fVar = this.f6218d;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        fVar.mo20251f(sb2.toString());
        m7557H(connectionResult, null);
    }

    /* renamed from: J */
    public final void m7559J(C5611f0 c5611f0) {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        this.f6221g.add(c5611f0);
    }

    /* renamed from: K */
    public final void m7560K() {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        if (this.f6225k) {
            m7554E();
        }
    }

    /* renamed from: L */
    public final void m7561L() {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        m7538d(C1350c.f6164r);
        this.f6220f.m7524f();
        for (C5614h c5614h : (C5614h[]) this.f6222h.keySet().toArray(new C5614h[0])) {
            m7555F(new C1378z(c5614h, new C3265m()));
        }
        m7537c(new ConnectionResult(4));
        if (this.f6218d.mo20249b()) {
            this.f6218d.mo20248a(new C1366n(this));
        }
    }

    /* renamed from: M */
    public final void m7562M() {
        Handler handler;
        C1342a c1342a;
        Context context;
        Status status;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        if (this.f6225k) {
            m7545m();
            C1350c c1350c = this.f6229o;
            c1342a = c1350c.f6175h;
            context = c1350c.f6174g;
            if (c1342a.mo7390g(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m7538d(status);
            this.f6218d.mo20251f("Timing out connection while resuming.");
        }
    }

    /* renamed from: O */
    public final boolean m7563O() {
        return this.f6218d.mo20249b();
    }

    /* renamed from: P */
    public final boolean m7564P() {
        return this.f6218d.mo7672o();
    }

    /* renamed from: a */
    public final boolean m7565a() {
        return m7548q(true);
    }

    @Override // p308y2.InterfaceC5606d
    /* renamed from: i */
    public final void mo7566i(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f6229o.f6183p;
        if (myLooper == handler.getLooper()) {
            m7542h(i10);
        } else {
            handler2 = this.f6229o.f6183p;
            handler2.post(new RunnableC1364l(this, i10));
        }
    }

    @Override // p308y2.InterfaceC5618j
    /* renamed from: l */
    public final void mo7567l(ConnectionResult connectionResult) {
        m7557H(connectionResult, null);
    }

    @Override // p308y2.InterfaceC5606d
    /* renamed from: n */
    public final void mo7568n(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f6229o.f6183p;
        if (myLooper == handler.getLooper()) {
            m7541g();
        } else {
            handler2 = this.f6229o.f6183p;
            handler2.post(new RunnableC1363k(this));
        }
    }

    /* renamed from: r */
    public final int m7569r() {
        return this.f6223i;
    }

    /* renamed from: s */
    public final int m7570s() {
        return this.f6228n;
    }

    /* renamed from: t */
    public final ConnectionResult m7571t() {
        Handler handler;
        handler = this.f6229o.f6183p;
        C5984j.m21280d(handler);
        return this.f6227m;
    }

    /* renamed from: v */
    public final C5506a.f m7572v() {
        return this.f6218d;
    }

    /* renamed from: x */
    public final Map<C5614h<?>, C5636z> m7573x() {
        return this.f6222h;
    }
}
