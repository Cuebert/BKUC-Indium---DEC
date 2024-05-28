package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0690v;
import com.google.android.material.internal.C2488k;
import p111i4.C3520b;
import p111i4.C3529k;
import p310y4.C5888g;
import p310y4.C5889h;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: q */
    private static final int f8931q = C3529k.f14713w;

    /* renamed from: n */
    private Integer f8932n;

    /* renamed from: o */
    private boolean f8933o;

    /* renamed from: p */
    private boolean f8934p;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14514G);
    }

    /* renamed from: a */
    private Pair<Integer, Integer> m10494a(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: b */
    private void m10495b(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C5888g c5888g = new C5888g();
            c5888g.m20835X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c5888g.m20828M(context);
            c5888g.m20834W(C0690v.m3868y(this));
            C0690v.m3859t0(this, c5888g);
        }
    }

    /* renamed from: c */
    private void m10496c(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    /* renamed from: d */
    private void m10497d() {
        if (this.f8933o || this.f8934p) {
            TextView m11378c = C2488k.m11378c(this);
            TextView m11376a = C2488k.m11376a(this);
            if (m11378c == null && m11376a == null) {
                return;
            }
            Pair<Integer, Integer> m10494a = m10494a(m11378c, m11376a);
            if (this.f8933o && m11378c != null) {
                m10496c(m11378c, m10494a);
            }
            if (!this.f8934p || m11376a == null) {
                return;
            }
            m10496c(m11376a, m10494a);
        }
    }

    /* renamed from: e */
    private Drawable m10498e(Drawable drawable) {
        if (drawable == null || this.f8932n == null) {
            return drawable;
        }
        Drawable m3263r = C0609a.m3263r(drawable);
        C0609a.m3259n(m3263r, this.f8932n.intValue());
        return m3263r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5889h.m20860e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m10497d();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C5889h.m20859d(this, f10);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m10498e(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f8932n = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f8934p != z10) {
            this.f8934p = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f8933o != z10) {
            this.f8933o = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f8931q
            android.content.Context r8 = p323z4.C6011a.m21324c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p111i4.C3530l.f14989k3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C2487j.m11374h(r0, r1, r2, r3, r4, r5)
            int r10 = p111i4.C3530l.f14997l3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L29
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L29:
            int r10 = p111i4.C3530l.f15013n3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f8933o = r10
            int r10 = p111i4.C3530l.f15005m3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f8934p = r10
            r9.recycle()
            r7.m10495b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
