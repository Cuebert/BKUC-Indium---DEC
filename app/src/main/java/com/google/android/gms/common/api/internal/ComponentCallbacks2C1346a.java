package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p070f3.C3137k;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1346a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: r */
    private static final ComponentCallbacks2C1346a f6154r = new ComponentCallbacks2C1346a();

    /* renamed from: n */
    private final AtomicBoolean f6155n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f6156o = new AtomicBoolean();

    /* renamed from: p */
    private final ArrayList f6157p = new ArrayList();

    /* renamed from: q */
    private boolean f6158q = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7446a(boolean z10);
    }

    private ComponentCallbacks2C1346a() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C1346a m7440b() {
        return f6154r;
    }

    /* renamed from: c */
    public static void m7441c(Application application) {
        ComponentCallbacks2C1346a componentCallbacks2C1346a = f6154r;
        synchronized (componentCallbacks2C1346a) {
            if (!componentCallbacks2C1346a.f6158q) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C1346a);
                application.registerComponentCallbacks(componentCallbacks2C1346a);
                componentCallbacks2C1346a.f6158q = true;
            }
        }
    }

    /* renamed from: f */
    private final void m7442f(boolean z10) {
        synchronized (f6154r) {
            Iterator it = this.f6157p.iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo7446a(z10);
            }
        }
    }

    /* renamed from: a */
    public void m7443a(a aVar) {
        synchronized (f6154r) {
            this.f6157p.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m7444d() {
        return this.f6155n.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m7445e(boolean z10) {
        if (!this.f6156o.get()) {
            if (!C3137k.m13798b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f6156o.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f6155n.set(true);
            }
        }
        return m7444d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6155n.compareAndSet(true, false);
        this.f6156o.set(true);
        if (compareAndSet) {
            m7442f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f6155n.compareAndSet(true, false);
        this.f6156o.set(true);
        if (compareAndSet) {
            m7442f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f6155n.compareAndSet(false, true)) {
            this.f6156o.set(true);
            m7442f(true);
        }
    }
}
