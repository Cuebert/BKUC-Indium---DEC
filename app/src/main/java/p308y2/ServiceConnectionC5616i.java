package p308y2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1388b;
import com.google.android.gms.common.internal.AbstractC1390d;
import com.google.android.gms.common.internal.InterfaceC1391e;
import java.util.Collections;
import java.util.Set;
import p295x2.C5506a;
import p321z2.C5984j;

/* renamed from: y2.i */
/* loaded from: classes.dex */
public final class ServiceConnectionC5616i implements C5506a.f, ServiceConnection {

    /* renamed from: l */
    private static final String f20798l = ServiceConnectionC5616i.class.getSimpleName();

    /* renamed from: a */
    private final String f20799a;

    /* renamed from: b */
    private final String f20800b;

    /* renamed from: c */
    private final ComponentName f20801c;

    /* renamed from: d */
    private final Context f20802d;

    /* renamed from: e */
    private final InterfaceC5606d f20803e;

    /* renamed from: f */
    private final Handler f20804f;

    /* renamed from: g */
    private final InterfaceC5618j f20805g;

    /* renamed from: h */
    private IBinder f20806h;

    /* renamed from: i */
    private boolean f20807i;

    /* renamed from: j */
    private String f20808j;

    /* renamed from: k */
    private String f20809k;

    /* renamed from: s */
    private final void m20637s() {
        if (Thread.currentThread() != this.f20804f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: t */
    private final void m20638t(String str) {
        String.valueOf(this.f20806h);
    }

    @Override // p295x2.C5506a.f
    /* renamed from: a */
    public final void mo20248a(AbstractC1388b.e eVar) {
    }

    @Override // p295x2.C5506a.f
    /* renamed from: b */
    public final boolean mo20249b() {
        m20637s();
        return this.f20806h != null;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: d */
    public final Set<Scope> mo7685d() {
        return Collections.emptySet();
    }

    @Override // p295x2.C5506a.f
    /* renamed from: e */
    public final void mo20250e(InterfaceC1391e interfaceC1391e, Set<Scope> set) {
    }

    @Override // p295x2.C5506a.f
    /* renamed from: f */
    public final void mo20251f(String str) {
        m20637s();
        this.f20808j = str;
        mo20258n();
    }

    @Override // p295x2.C5506a.f
    /* renamed from: g */
    public final boolean mo20252g() {
        return false;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return 0;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: i */
    public final boolean mo20253i() {
        m20637s();
        return this.f20807i;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: j */
    public final Feature[] mo20254j() {
        return new Feature[0];
    }

    @Override // p295x2.C5506a.f
    /* renamed from: k */
    public final String mo20255k() {
        String str = this.f20799a;
        if (str != null) {
            return str;
        }
        C5984j.m21286j(this.f20801c);
        return this.f20801c.getPackageName();
    }

    @Override // p295x2.C5506a.f
    /* renamed from: l */
    public final String mo20256l() {
        return this.f20808j;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: m */
    public final void mo20257m(AbstractC1388b.c cVar) {
        m20637s();
        m20638t("Connect started.");
        if (mo20249b()) {
            try {
                mo20251f("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f20801c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f20799a).setAction(this.f20800b);
            }
            boolean bindService = this.f20802d.bindService(intent, this, AbstractC1390d.m7688a());
            this.f20807i = bindService;
            if (!bindService) {
                this.f20806h = null;
                this.f20805g.mo7567l(new ConnectionResult(16));
            }
            m20638t("Finished connect.");
        } catch (SecurityException e10) {
            this.f20807i = false;
            this.f20806h = null;
            throw e10;
        }
    }

    @Override // p295x2.C5506a.f
    /* renamed from: n */
    public final void mo20258n() {
        m20637s();
        m20638t("Disconnect called.");
        try {
            this.f20802d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f20807i = false;
        this.f20806h = null;
    }

    @Override // p295x2.C5506a.f
    /* renamed from: o */
    public final boolean mo7672o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f20804f.post(new Runnable() { // from class: y2.x
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5616i.this.m20640q(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20804f.post(new Runnable() { // from class: y2.w
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC5616i.this.m20639p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void m20639p() {
        this.f20807i = false;
        this.f20806h = null;
        m20638t("Disconnected.");
        this.f20803e.mo7566i(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m20640q(IBinder iBinder) {
        this.f20807i = false;
        this.f20806h = iBinder;
        m20638t("Connected.");
        this.f20803e.mo7568n(new Bundle());
    }

    /* renamed from: r */
    public final void m20641r(String str) {
        this.f20809k = str;
    }
}
