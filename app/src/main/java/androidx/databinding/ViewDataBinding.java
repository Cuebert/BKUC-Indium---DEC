package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0853t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p319z0.C5949a;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends C0764a {

    /* renamed from: j */
    static int f3747j = Build.VERSION.SDK_INT;

    /* renamed from: k */
    private static final boolean f3748k = true;

    /* renamed from: l */
    private static final InterfaceC0766c f3749l = new C0758a();

    /* renamed from: m */
    private static final InterfaceC0766c f3750m = new C0759b();

    /* renamed from: n */
    private static final InterfaceC0766c f3751n = new C0760c();

    /* renamed from: o */
    private static final InterfaceC0766c f3752o = new C0761d();

    /* renamed from: p */
    private static final AbstractC0765b<Object, ViewDataBinding, Void> f3753p = new C0762e();

    /* renamed from: q */
    private static final ReferenceQueue<ViewDataBinding> f3754q = new ReferenceQueue<>();

    /* renamed from: r */
    private static final View.OnAttachStateChangeListener f3755r = new ViewOnAttachStateChangeListenerC0763f();

    /* renamed from: a */
    private final Runnable f3756a;

    /* renamed from: b */
    private boolean f3757b;

    /* renamed from: c */
    private boolean f3758c;

    /* renamed from: d */
    private boolean f3759d;

    /* renamed from: e */
    private Choreographer f3760e;

    /* renamed from: f */
    private final Choreographer.FrameCallback f3761f;

    /* renamed from: g */
    private Handler f3762g;

    /* renamed from: h */
    private ViewDataBinding f3763h;

    /* renamed from: i */
    private InterfaceC0845l f3764i;

    /* loaded from: classes.dex */
    static class OnStartListener implements InterfaceC0844k {

        /* renamed from: n */
        final WeakReference<ViewDataBinding> f3765n;

        @InterfaceC0853t(AbstractC0839f.b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f3765n.get();
            if (viewDataBinding != null) {
                viewDataBinding.m4251d();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    /* loaded from: classes.dex */
    class C0758a implements InterfaceC0766c {
        C0758a() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    /* loaded from: classes.dex */
    class C0759b implements InterfaceC0766c {
        C0759b() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    /* loaded from: classes.dex */
    class C0760c implements InterfaceC0766c {
        C0760c() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    /* loaded from: classes.dex */
    class C0761d implements InterfaceC0766c {
        C0761d() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    /* loaded from: classes.dex */
    class C0762e extends AbstractC0765b<Object, ViewDataBinding, Void> {
        C0762e() {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    /* loaded from: classes.dex */
    class ViewOnAttachStateChangeListenerC0763f implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0763f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m4249e(view).f3756a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: c */
    private void m4248c() {
        if (this.f3759d) {
            m4253g();
        } else if (m4252f()) {
            this.f3759d = true;
            this.f3758c = false;
            m4250b();
            this.f3759d = false;
        }
    }

    /* renamed from: e */
    static ViewDataBinding m4249e(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C5949a.f21861a);
        }
        return null;
    }

    /* renamed from: b */
    protected abstract void m4250b();

    /* renamed from: d */
    public void m4251d() {
        ViewDataBinding viewDataBinding = this.f3763h;
        if (viewDataBinding == null) {
            m4248c();
        } else {
            viewDataBinding.m4251d();
        }
    }

    /* renamed from: f */
    public abstract boolean m4252f();

    /* renamed from: g */
    protected void m4253g() {
        ViewDataBinding viewDataBinding = this.f3763h;
        if (viewDataBinding != null) {
            viewDataBinding.m4253g();
            return;
        }
        InterfaceC0845l interfaceC0845l = this.f3764i;
        if (interfaceC0845l == null || interfaceC0845l.mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
            synchronized (this) {
                if (this.f3757b) {
                    return;
                }
                this.f3757b = true;
                if (f3748k) {
                    this.f3760e.postFrameCallback(this.f3761f);
                } else {
                    this.f3762g.post(this.f3756a);
                }
            }
        }
    }
}
