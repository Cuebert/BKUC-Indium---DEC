package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.i */
/* loaded from: classes.dex */
class C0842i {

    /* renamed from: a */
    private static AtomicBoolean f4272a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.i$a */
    /* loaded from: classes.dex */
    static class a extends C0836c {
        a() {
        }

        @Override // androidx.lifecycle.C0836c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC0855v.m4942g(activity);
        }

        @Override // androidx.lifecycle.C0836c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C0836c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4898a(Context context) {
        if (f4272a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}
