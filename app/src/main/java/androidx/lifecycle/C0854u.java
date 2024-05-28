package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.FragmentC0855v;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public class C0854u implements InterfaceC0845l {

    /* renamed from: v */
    private static final C0854u f4290v = new C0854u();

    /* renamed from: r */
    private Handler f4295r;

    /* renamed from: n */
    private int f4291n = 0;

    /* renamed from: o */
    private int f4292o = 0;

    /* renamed from: p */
    private boolean f4293p = true;

    /* renamed from: q */
    private boolean f4294q = true;

    /* renamed from: s */
    private final C0846m f4296s = new C0846m(this);

    /* renamed from: t */
    private Runnable f4297t = new a();

    /* renamed from: u */
    FragmentC0855v.a f4298u = new b();

    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0854u.this.m4931g();
            C0854u.this.m4932h();
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    /* loaded from: classes.dex */
    class b implements FragmentC0855v.a {
        b() {
        }

        @Override // androidx.lifecycle.FragmentC0855v.a
        /* renamed from: a */
        public void mo4933a() {
        }

        @Override // androidx.lifecycle.FragmentC0855v.a
        /* renamed from: b */
        public void mo4934b() {
            C0854u.this.m4927b();
        }

        @Override // androidx.lifecycle.FragmentC0855v.a
        /* renamed from: c */
        public void mo4935c() {
            C0854u.this.m4928c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.u$c */
    /* loaded from: classes.dex */
    public class c extends C0836c {

        /* renamed from: androidx.lifecycle.u$c$a */
        /* loaded from: classes.dex */
        class a extends C0836c {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C0854u.this.m4927b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C0854u.this.m4928c();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.C0836c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC0855v.m4941f(activity).m4943h(C0854u.this.f4298u);
            }
        }

        @Override // androidx.lifecycle.C0836c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C0854u.this.m4926a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.C0836c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C0854u.this.m4929d();
        }
    }

    private C0854u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m4925i(Context context) {
        f4290v.m4930e(context);
    }

    /* renamed from: a */
    void m4926a() {
        int i10 = this.f4292o - 1;
        this.f4292o = i10;
        if (i10 == 0) {
            this.f4295r.postDelayed(this.f4297t, 700L);
        }
    }

    /* renamed from: b */
    void m4927b() {
        int i10 = this.f4292o + 1;
        this.f4292o = i10;
        if (i10 == 1) {
            if (this.f4293p) {
                this.f4296s.m4909h(AbstractC0839f.b.ON_RESUME);
                this.f4293p = false;
            } else {
                this.f4295r.removeCallbacks(this.f4297t);
            }
        }
    }

    /* renamed from: c */
    void m4928c() {
        int i10 = this.f4291n + 1;
        this.f4291n = i10;
        if (i10 == 1 && this.f4294q) {
            this.f4296s.m4909h(AbstractC0839f.b.ON_START);
            this.f4294q = false;
        }
    }

    /* renamed from: d */
    void m4929d() {
        this.f4291n--;
        m4932h();
    }

    /* renamed from: e */
    void m4930e(Context context) {
        this.f4295r = new Handler();
        this.f4296s.m4909h(AbstractC0839f.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    @Override // androidx.lifecycle.InterfaceC0845l
    /* renamed from: f */
    public AbstractC0839f mo583f() {
        return this.f4296s;
    }

    /* renamed from: g */
    void m4931g() {
        if (this.f4292o == 0) {
            this.f4293p = true;
            this.f4296s.m4909h(AbstractC0839f.b.ON_PAUSE);
        }
    }

    /* renamed from: h */
    void m4932h() {
        if (this.f4291n == 0 && this.f4293p) {
            this.f4296s.m4909h(AbstractC0839f.b.ON_STOP);
            this.f4294q = true;
        }
    }
}
