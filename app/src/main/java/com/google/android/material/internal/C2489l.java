package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0684p;

/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes.dex */
public class C2489l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.l$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC0684p {

        /* renamed from: n */
        final /* synthetic */ c f9663n;

        /* renamed from: o */
        final /* synthetic */ d f9664o;

        a(c cVar, d dVar) {
            this.f9663n = cVar;
            this.f9664o = dVar;
        }

        @Override // androidx.core.view.InterfaceC0684p
        /* renamed from: L */
        public C0675g0 mo823L(View view, C0675g0 c0675g0) {
            return this.f9663n.mo10709a(view, c0675g0, new d(this.f9664o));
        }
    }

    /* renamed from: com.google.android.material.internal.l$b */
    /* loaded from: classes.dex */
    public static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C0690v.m3847n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        C0675g0 mo10709a(View view, C0675g0 c0675g0, d dVar);
    }

    /* renamed from: a */
    public static void m11379a(View view, c cVar) {
        C0690v.m3786B0(view, new a(cVar, new d(C0690v.m3801J(view), view.getPaddingTop(), C0690v.m3799I(view), view.getPaddingBottom())));
        m11384f(view);
    }

    /* renamed from: b */
    public static float m11380b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m11381c(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += C0690v.m3868y((View) parent);
        }
        return f10;
    }

    /* renamed from: d */
    public static boolean m11382d(View view) {
        return C0690v.m3791E(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m11383e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 != 9) {
            switch (i10) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_ATOP;
    }

    /* renamed from: f */
    public static void m11384f(View view) {
        if (C0690v.m3813T(view)) {
            C0690v.m3847n0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* renamed from: com.google.android.material.internal.l$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public int f9665a;

        /* renamed from: b */
        public int f9666b;

        /* renamed from: c */
        public int f9667c;

        /* renamed from: d */
        public int f9668d;

        public d(int i10, int i11, int i12, int i13) {
            this.f9665a = i10;
            this.f9666b = i11;
            this.f9667c = i12;
            this.f9668d = i13;
        }

        public d(d dVar) {
            this.f9665a = dVar.f9665a;
            this.f9666b = dVar.f9666b;
            this.f9667c = dVar.f9667c;
            this.f9668d = dVar.f9668d;
        }
    }
}
