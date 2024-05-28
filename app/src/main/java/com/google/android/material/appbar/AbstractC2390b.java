package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0670e;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import java.util.List;
import p207q0.C4291a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
public abstract class AbstractC2390b extends C2391c<View> {

    /* renamed from: d */
    final Rect f8945d;

    /* renamed from: e */
    final Rect f8946e;

    /* renamed from: f */
    private int f8947f;

    /* renamed from: g */
    private int f8948g;

    public AbstractC2390b() {
        this.f8945d = new Rect();
        this.f8946e = new Rect();
        this.f8947f = 0;
    }

    /* renamed from: N */
    private static int m10503N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C2391c
    /* renamed from: F */
    public void mo10504F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View mo10486H = mo10486H(coordinatorLayout.m2648l(view));
        if (mo10486H != null) {
            CoordinatorLayout.C0562f c0562f = (CoordinatorLayout.C0562f) view.getLayoutParams();
            Rect rect = this.f8945d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0562f).leftMargin, mo10486H.getBottom() + ((ViewGroup.MarginLayoutParams) c0562f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0562f).rightMargin, ((coordinatorLayout.getHeight() + mo10486H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin);
            C0675g0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0690v.m3785B(coordinatorLayout) && !C0690v.m3785B(view)) {
                rect.left += lastWindowInsets.m3667j();
                rect.right -= lastWindowInsets.m3668k();
            }
            Rect rect2 = this.f8946e;
            C0670e.m3640a(m10503N(c0562f.f3025c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int m10505I = m10505I(mo10486H);
            view.layout(rect2.left, rect2.top - m10505I, rect2.right, rect2.bottom - m10505I);
            this.f8947f = rect2.top - mo10486H.getBottom();
            return;
        }
        super.mo10504F(coordinatorLayout, view, i10);
        this.f8947f = 0;
    }

    /* renamed from: H */
    abstract View mo10486H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final int m10505I(View view) {
        if (this.f8948g == 0) {
            return 0;
        }
        float mo10487J = mo10487J(view);
        int i10 = this.f8948g;
        return C4291a.m17788b((int) (mo10487J * i10), 0, i10);
    }

    /* renamed from: J */
    float mo10487J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int m10506K() {
        return this.f8948g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo10488L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m10507M() {
        return this.f8947f;
    }

    /* renamed from: O */
    public final void m10508O(int i10) {
        this.f8948g = i10;
    }

    /* renamed from: P */
    protected boolean m10509P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
    /* renamed from: m */
    public boolean mo2674m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View mo10486H;
        C0675g0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (mo10486H = mo10486H(coordinatorLayout.m2648l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            if (C0690v.m3785B(mo10486H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m3669l() + lastWindowInsets.m3666i();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int mo10488L = size + mo10488L(mo10486H);
        int measuredHeight = mo10486H.getMeasuredHeight();
        if (m10509P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            mo10488L -= measuredHeight;
        }
        coordinatorLayout.m2637D(view, i10, i11, View.MeasureSpec.makeMeasureSpec(mo10488L, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public AbstractC2390b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8945d = new Rect();
        this.f8946e = new Rect();
        this.f8947f = 0;
    }
}
