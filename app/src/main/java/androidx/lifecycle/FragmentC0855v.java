package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0839f;

/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public class FragmentC0855v extends Fragment {

    /* renamed from: n */
    private a f4301n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo4933a();

        /* renamed from: b */
        void mo4934b();

        /* renamed from: c */
        void mo4935c();
    }

    /* renamed from: androidx.lifecycle.v$b */
    /* loaded from: classes.dex */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC0855v.m4936a(activity, AbstractC0839f.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC0855v.m4936a(activity, AbstractC0839f.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC0855v.m4936a(activity, AbstractC0839f.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC0855v.m4936a(activity, AbstractC0839f.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC0855v.m4936a(activity, AbstractC0839f.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC0855v.m4936a(activity, AbstractC0839f.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static void m4936a(Activity activity, AbstractC0839f.b bVar) {
        if (activity instanceof InterfaceC0847n) {
            ((InterfaceC0847n) activity).mo583f().m4909h(bVar);
        } else if (activity instanceof InterfaceC0845l) {
            AbstractC0839f mo583f = ((InterfaceC0845l) activity).mo583f();
            if (mo583f instanceof C0846m) {
                ((C0846m) mo583f).m4909h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m4937b(AbstractC0839f.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4936a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m4938c(a aVar) {
        if (aVar != null) {
            aVar.mo4933a();
        }
    }

    /* renamed from: d */
    private void m4939d(a aVar) {
        if (aVar != null) {
            aVar.mo4934b();
        }
    }

    /* renamed from: e */
    private void m4940e(a aVar) {
        if (aVar != null) {
            aVar.mo4935c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static FragmentC0855v m4941f(Activity activity) {
        return (FragmentC0855v) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m4942g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0855v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m4943h(a aVar) {
        this.f4301n = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4938c(this.f4301n);
        m4937b(AbstractC0839f.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m4937b(AbstractC0839f.b.ON_DESTROY);
        this.f4301n = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m4937b(AbstractC0839f.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m4939d(this.f4301n);
        m4937b(AbstractC0839f.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m4940e(this.f4301n);
        m4937b(AbstractC0839f.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m4937b(AbstractC0839f.b.ON_STOP);
    }
}
