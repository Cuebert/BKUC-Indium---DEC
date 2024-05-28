package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* loaded from: classes.dex */
public final class C1758r2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n */
    final /* synthetic */ C1774s2 f7193n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1758r2(C1774s2 c1774s2) {
        this.f7193n = c1774s2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f7193n.m8780k(new C1630j2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f7193n.m8780k(new C1742q2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f7193n.m8780k(new C1678m2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f7193n.m8780k(new C1662l2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC1494b1 binderC1494b1 = new BinderC1494b1();
        this.f7193n.m8780k(new C1726p2(this, activity, binderC1494b1));
        Bundle m7940l = binderC1494b1.m7940l(50L);
        if (m7940l != null) {
            bundle.putAll(m7940l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f7193n.m8780k(new C1646k2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f7193n.m8780k(new C1710o2(this, activity));
    }
}
