package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.InterfaceC1613i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p018b4.InterfaceC0990d;
import p057e3.C3062a;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes.dex */
public final class C2350y7 extends AbstractC2316v3 {

    /* renamed from: c */
    private final ServiceConnectionC2340x7 f8786c;

    /* renamed from: d */
    private InterfaceC0990d f8787d;

    /* renamed from: e */
    private volatile Boolean f8788e;

    /* renamed from: f */
    private final AbstractC2203l f8789f;

    /* renamed from: g */
    private final C2245o8 f8790g;

    /* renamed from: h */
    private final List<Runnable> f8791h;

    /* renamed from: i */
    private final AbstractC2203l f8792i;

    public C2350y7(C2219m4 c2219m4) {
        super(c2219m4);
        this.f8791h = new ArrayList();
        this.f8790g = new C2245o8(c2219m4.mo9767e());
        this.f8786c = new ServiceConnectionC2340x7(this);
        this.f8789f = new C2167h7(this, c2219m4);
        this.f8792i = new C2200k7(this, c2219m4);
    }

    /* renamed from: C */
    private final zzp m10356C(boolean z10) {
        Pair<String, Long> m10306a;
        this.f8118a.mo9768f();
        C2086a3 m10103B = this.f8118a.m10103B();
        String str = null;
        if (z10) {
            C2174i3 mo9765d = this.f8118a.mo9765d();
            if (mo9765d.f8118a.m10107F().f8631d != null && (m10306a = mo9765d.f8118a.m10107F().f8631d.m10306a()) != null && m10306a != C2326w3.f8629x) {
                String valueOf = String.valueOf(m10306a.second);
                String str2 = (String) m10306a.first;
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb2.append(valueOf);
                sb2.append(":");
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return m10103B.m9721q(str);
    }

    /* renamed from: D */
    public final void m10357D() {
        mo9917h();
        this.f8118a.mo9765d().m10052v().m9894b("Processing queued up service tasks", Integer.valueOf(this.f8791h.size()));
        Iterator<Runnable> it = this.f8791h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e10) {
                this.f8118a.mo9765d().m10048r().m9894b("Task exception while flushing queue", e10);
            }
        }
        this.f8791h.clear();
        this.f8792i.m10084b();
    }

    /* renamed from: E */
    public final void m10358E() {
        mo9917h();
        this.f8790g.m10202b();
        AbstractC2203l abstractC2203l = this.f8789f;
        this.f8118a.m10134z();
        abstractC2203l.m10085d(C2335x2.f8680K.m10317a(null).longValue());
    }

    /* renamed from: F */
    private final void m10359F(Runnable runnable) throws IllegalStateException {
        mo9917h();
        if (m10390z()) {
            runnable.run();
            return;
        }
        int size = this.f8791h.size();
        this.f8118a.m10134z();
        if (size >= 1000) {
            this.f8118a.mo9765d().m10048r().m9893a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f8791h.add(runnable);
        this.f8792i.m10085d(60000L);
        m10371P();
    }

    /* renamed from: G */
    private final boolean m10360G() {
        this.f8118a.mo9768f();
        return true;
    }

    /* renamed from: K */
    public static /* bridge */ /* synthetic */ void m10363K(C2350y7 c2350y7, InterfaceC0990d interfaceC0990d) {
        c2350y7.f8787d = null;
    }

    /* renamed from: L */
    public static /* bridge */ /* synthetic */ void m10364L(C2350y7 c2350y7) {
        c2350y7.m10357D();
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m10365M(C2350y7 c2350y7, ComponentName componentName) {
        c2350y7.mo9917h();
        if (c2350y7.f8787d != null) {
            c2350y7.f8787d = null;
            c2350y7.f8118a.mo9765d().m10052v().m9894b("Disconnected from device MeasurementService", componentName);
            c2350y7.mo9917h();
            c2350y7.m10371P();
        }
    }

    /* renamed from: A */
    public final boolean m10367A() {
        mo9917h();
        m10313i();
        return !m10368B() || this.f8118a.m10114N().m9971o0() >= C2335x2.f8727p0.m10317a(null).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m10368B() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2350y7.m10368B():boolean");
    }

    /* renamed from: J */
    public final Boolean m10369J() {
        return this.f8788e;
    }

    /* renamed from: O */
    public final void m10370O() {
        mo9917h();
        m10313i();
        zzp m10356C = m10356C(true);
        this.f8118a.m10104C().m9798r();
        m10359F(new RunnableC2134e7(this, m10356C));
    }

    /* renamed from: P */
    public final void m10371P() {
        mo9917h();
        m10313i();
        if (m10390z()) {
            return;
        }
        if (!m10368B()) {
            if (this.f8118a.m10134z().m9866G()) {
                return;
            }
            this.f8118a.mo9768f();
            List<ResolveInfo> queryIntentServices = this.f8118a.mo9763c().getPackageManager().queryIntentServices(new Intent().setClassName(this.f8118a.mo9763c(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context mo9763c = this.f8118a.mo9763c();
                this.f8118a.mo9768f();
                intent.setComponent(new ComponentName(mo9763c, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f8786c.m10332b(intent);
                return;
            }
            this.f8118a.mo9765d().m10048r().m9893a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.f8786c.m10333c();
    }

    /* renamed from: Q */
    public final void m10372Q() {
        mo9917h();
        m10313i();
        this.f8786c.m10334d();
        try {
            C3062a.m13522b().m13528c(this.f8118a.mo9763c(), this.f8786c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8787d = null;
    }

    /* renamed from: R */
    public final void m10373R(InterfaceC1613i1 interfaceC1613i1) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2123d7(this, m10356C(false), interfaceC1613i1));
    }

    /* renamed from: S */
    public final void m10374S(AtomicReference<String> atomicReference) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2112c7(this, atomicReference, m10356C(false)));
    }

    /* renamed from: T */
    public final void m10375T(InterfaceC1613i1 interfaceC1613i1, String str, String str2) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2266q7(this, str, str2, m10356C(false), interfaceC1613i1));
    }

    /* renamed from: U */
    public final void m10376U(AtomicReference<List<zzab>> atomicReference, String str, String str2, String str3) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2255p7(this, atomicReference, null, str2, str3, m10356C(false)));
    }

    /* renamed from: V */
    public final void m10377V(InterfaceC1613i1 interfaceC1613i1, String str, String str2, boolean z10) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2359z6(this, str, str2, m10356C(false), z10, interfaceC1613i1));
    }

    /* renamed from: W */
    public final void m10378W(AtomicReference<List<zzkv>> atomicReference, String str, String str2, String str3, boolean z10) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2277r7(this, atomicReference, null, str2, str3, m10356C(false), z10));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2316v3
    /* renamed from: n */
    protected final boolean mo9718n() {
        return false;
    }

    /* renamed from: o */
    public final void m10379o(zzat zzatVar, String str) {
        C5984j.m21286j(zzatVar);
        mo9917h();
        m10313i();
        m10360G();
        m10359F(new RunnableC2233n7(this, true, m10356C(true), this.f8118a.m10104C().m9802v(zzatVar), zzatVar, str));
    }

    /* renamed from: p */
    public final void m10380p(InterfaceC1613i1 interfaceC1613i1, zzat zzatVar, String str) {
        mo9917h();
        m10313i();
        if (this.f8118a.m10114N().m9973p0(C1381d.f6259a) != 0) {
            this.f8118a.mo9765d().m10053w().m9893a("Not bundling data. Service unavailable or out of date");
            this.f8118a.m10114N().m9947F(interfaceC1613i1, new byte[0]);
        } else {
            m10359F(new RunnableC2178i7(this, zzatVar, str, interfaceC1613i1));
        }
    }

    /* renamed from: q */
    public final void m10381q() {
        mo9917h();
        m10313i();
        zzp m10356C = m10356C(false);
        m10360G();
        this.f8118a.m10104C().m9797q();
        m10359F(new RunnableC2101b7(this, m10356C));
    }

    /* renamed from: r */
    public final void m10382r(InterfaceC0990d interfaceC0990d, AbstractSafeParcelable abstractSafeParcelable, zzp zzpVar) {
        int i10;
        mo9917h();
        m10313i();
        m10360G();
        this.f8118a.m10134z();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> m9796p = this.f8118a.m10104C().m9796p(100);
            if (m9796p != null) {
                arrayList.addAll(m9796p);
                i10 = m9796p.size();
            } else {
                i10 = 0;
            }
            if (abstractSafeParcelable != null && i10 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i13);
                if (abstractSafeParcelable2 instanceof zzat) {
                    try {
                        interfaceC0990d.mo6208H0((zzat) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e10) {
                        this.f8118a.mo9765d().m10048r().m9894b("Failed to send event to the service", e10);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkv) {
                    try {
                        interfaceC0990d.mo6215g0((zzkv) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e11) {
                        this.f8118a.mo9765d().m10048r().m9894b("Failed to send user property to the service", e11);
                    }
                } else if (abstractSafeParcelable2 instanceof zzab) {
                    try {
                        interfaceC0990d.mo6206A((zzab) abstractSafeParcelable2, zzpVar);
                    } catch (RemoteException e12) {
                        this.f8118a.mo9765d().m10048r().m9894b("Failed to send conditional user property to the service", e12);
                    }
                } else {
                    this.f8118a.mo9765d().m10048r().m9893a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
    }

    /* renamed from: s */
    public final void m10383s(zzab zzabVar) {
        C5984j.m21286j(zzabVar);
        mo9917h();
        m10313i();
        this.f8118a.mo9768f();
        m10359F(new RunnableC2244o7(this, true, m10356C(true), this.f8118a.m10104C().m9801u(zzabVar), new zzab(zzabVar), zzabVar));
    }

    /* renamed from: t */
    public final void m10384t(boolean z10) {
        mo9917h();
        m10313i();
        if (z10) {
            m10360G();
            this.f8118a.m10104C().m9797q();
        }
        if (m10367A()) {
            m10359F(new RunnableC2222m7(this, m10356C(false)));
        }
    }

    /* renamed from: u */
    public final void m10385u(C2276r6 c2276r6) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2145f7(this, c2276r6));
    }

    /* renamed from: v */
    public final void m10386v(Bundle bundle) {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2156g7(this, m10356C(false), bundle));
    }

    /* renamed from: w */
    public final void m10387w() {
        mo9917h();
        m10313i();
        m10359F(new RunnableC2211l7(this, m10356C(true)));
    }

    /* renamed from: x */
    public final void m10388x(InterfaceC0990d interfaceC0990d) {
        mo9917h();
        C5984j.m21286j(interfaceC0990d);
        this.f8787d = interfaceC0990d;
        m10358E();
        m10357D();
    }

    /* renamed from: y */
    public final void m10389y(zzkv zzkvVar) {
        mo9917h();
        m10313i();
        m10360G();
        m10359F(new RunnableC2090a7(this, m10356C(true), this.f8118a.m10104C().m9803w(zzkvVar), zzkvVar));
    }

    /* renamed from: z */
    public final boolean m10390z() {
        mo9917h();
        m10313i();
        return this.f8787d != null;
    }
}
