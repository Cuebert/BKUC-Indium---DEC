package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0690v;
import java.util.List;
import p236s4.InterfaceC4527a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0559c<View> {

    /* renamed from: a */
    private int f10040a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes.dex */
    class ViewTreeObserverOnPreDrawListenerC2545a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: n */
        final /* synthetic */ View f10041n;

        /* renamed from: o */
        final /* synthetic */ int f10042o;

        /* renamed from: p */
        final /* synthetic */ InterfaceC4527a f10043p;

        ViewTreeObserverOnPreDrawListenerC2545a(View view, int i10, InterfaceC4527a interfaceC4527a) {
            this.f10041n = view;
            this.f10042o = i10;
            this.f10043p = interfaceC4527a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f10041n.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f10040a == this.f10042o) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC4527a interfaceC4527a = this.f10043p;
                expandableBehavior.mo11752H((View) interfaceC4527a, this.f10041n, interfaceC4527a.mo11175a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f10040a = 0;
    }

    /* renamed from: F */
    private boolean m11750F(boolean z10) {
        if (!z10) {
            return this.f10040a == 1;
        }
        int i10 = this.f10040a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    protected InterfaceC4527a m11751G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m2648l = coordinatorLayout.m2648l(view);
        int size = m2648l.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = m2648l.get(i10);
            if (mo2666e(coordinatorLayout, view, view2)) {
                return (InterfaceC4527a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo11752H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: e */
    public abstract boolean mo2666e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: h */
    public boolean mo2669h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC4527a interfaceC4527a = (InterfaceC4527a) view2;
        if (!m11750F(interfaceC4527a.mo11175a())) {
            return false;
        }
        this.f10040a = interfaceC4527a.mo11175a() ? 1 : 2;
        return mo11752H((View) interfaceC4527a, view, interfaceC4527a.mo11175a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: l */
    public boolean mo2673l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        InterfaceC4527a m11751G;
        if (C0690v.m3814U(view) || (m11751G = m11751G(coordinatorLayout, view)) == null || !m11750F(m11751G.mo11175a())) {
            return false;
        }
        int i11 = m11751G.mo11175a() ? 1 : 2;
        this.f10040a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2545a(view, i11, m11751G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10040a = 0;
    }
}
