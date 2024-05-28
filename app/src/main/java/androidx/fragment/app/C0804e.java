package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.C0623b;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0687s;
import androidx.fragment.app.C0820u;
import p015b1.C0966a;
import p015b1.C0967b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class C0804e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes.dex */
    public class a implements C0623b.b {

        /* renamed from: a */
        final /* synthetic */ Fragment f4029a;

        a(Fragment fragment) {
            this.f4029a = fragment;
        }

        @Override // androidx.core.os.C0623b.b
        /* renamed from: a */
        public void mo3342a() {
            if (this.f4029a.m4372s() != null) {
                View m4372s = this.f4029a.m4372s();
                this.f4029a.m4275E1(null);
                m4372s.clearAnimation();
            }
            this.f4029a.m4281G1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$b */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4030a;

        /* renamed from: b */
        final /* synthetic */ Fragment f4031b;

        /* renamed from: c */
        final /* synthetic */ C0820u.g f4032c;

        /* renamed from: d */
        final /* synthetic */ C0623b f4033d;

        /* renamed from: androidx.fragment.app.e$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f4031b.m4372s() != null) {
                    b.this.f4031b.m4275E1(null);
                    b bVar = b.this;
                    bVar.f4032c.mo4531a(bVar.f4031b, bVar.f4033d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, C0820u.g gVar, C0623b c0623b) {
            this.f4030a = viewGroup;
            this.f4031b = fragment;
            this.f4032c = gVar;
            this.f4033d = c0623b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4030a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4035a;

        /* renamed from: b */
        final /* synthetic */ View f4036b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4037c;

        /* renamed from: d */
        final /* synthetic */ C0820u.g f4038d;

        /* renamed from: e */
        final /* synthetic */ C0623b f4039e;

        c(ViewGroup viewGroup, View view, Fragment fragment, C0820u.g gVar, C0623b c0623b) {
            this.f4035a = viewGroup;
            this.f4036b = view;
            this.f4037c = fragment;
            this.f4038d = gVar;
            this.f4039e = c0623b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4035a.endViewTransition(this.f4036b);
            Animator m4375t = this.f4037c.m4375t();
            this.f4037c.m4281G1(null);
            if (m4375t == null || this.f4035a.indexOfChild(this.f4036b) >= 0) {
                return;
            }
            this.f4038d.mo4531a(this.f4037c, this.f4039e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4625a(Fragment fragment, d dVar, C0820u.g gVar) {
        View view = fragment.f3802U;
        ViewGroup viewGroup = fragment.f3801T;
        viewGroup.startViewTransition(view);
        C0623b c0623b = new C0623b();
        c0623b.m3339c(new a(fragment));
        gVar.mo4532b(fragment, c0623b);
        if (dVar.f4040a != null) {
            e eVar = new e(dVar.f4040a, viewGroup, view);
            fragment.m4275E1(fragment.f3802U);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, c0623b));
            fragment.f3802U.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f4041b;
        fragment.m4281G1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, c0623b));
        animator.setTarget(fragment.f3802U);
        animator.start();
    }

    /* renamed from: b */
    private static int m4626b(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.m4295M();
            }
            return fragment.m4298N();
        }
        if (z10) {
            return fragment.m4386x();
        }
        return fragment.m4263A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static d m4627c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int m4283I = fragment.m4283I();
        int m4626b = m4626b(fragment, z10, z11);
        boolean z12 = false;
        fragment.m4278F1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f3801T;
        if (viewGroup != null) {
            int i10 = C0967b.f5127c;
            if (viewGroup.getTag(i10) != null) {
                fragment.f3801T.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f3801T;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation m4264A0 = fragment.m4264A0(m4283I, z10, m4626b);
        if (m4264A0 != null) {
            return new d(m4264A0);
        }
        Animator m4267B0 = fragment.m4267B0(m4283I, z10, m4626b);
        if (m4267B0 != null) {
            return new d(m4267B0);
        }
        if (m4626b == 0 && m4283I != 0) {
            m4626b = m4628d(m4283I, z10);
        }
        if (m4626b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m4626b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m4626b);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m4626b);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m4626b);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m4628d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? C0966a.f5123e : C0966a.f5124f;
        }
        if (i10 == 4099) {
            return z10 ? C0966a.f5121c : C0966a.f5122d;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? C0966a.f5119a : C0966a.f5120b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final Animation f4040a;

        /* renamed from: b */
        public final Animator f4041b;

        d(Animation animation) {
            this.f4040a = animation;
            this.f4041b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f4040a = null;
            this.f4041b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$e */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: n */
        private final ViewGroup f4042n;

        /* renamed from: o */
        private final View f4043o;

        /* renamed from: p */
        private boolean f4044p;

        /* renamed from: q */
        private boolean f4045q;

        /* renamed from: r */
        private boolean f4046r;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4046r = true;
            this.f4042n = viewGroup;
            this.f4043o = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f4046r = true;
            if (this.f4044p) {
                return !this.f4045q;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f4044p = true;
                ViewTreeObserverOnPreDrawListenerC0687s.m3776a(this.f4042n, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f4044p && this.f4046r) {
                this.f4046r = false;
                this.f4042n.post(this);
            } else {
                this.f4042n.endViewTransition(this.f4043o);
                this.f4045q = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f4046r = true;
            if (this.f4044p) {
                return !this.f4045q;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f4044p = true;
                ViewTreeObserverOnPreDrawListenerC0687s.m3776a(this.f4042n, this);
            }
            return true;
        }
    }
}
