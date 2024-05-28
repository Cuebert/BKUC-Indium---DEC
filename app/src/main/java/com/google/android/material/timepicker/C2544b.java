package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0549d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0690v;
import p111i4.C3524f;
import p111i4.C3526h;
import p111i4.C3530l;
import p310y4.C5888g;
import p310y4.C5890i;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
class C2544b extends ConstraintLayout {

    /* renamed from: K */
    private final Runnable f10036K;

    /* renamed from: L */
    private int f10037L;

    /* renamed from: M */
    private C5888g f10038M;

    /* renamed from: com.google.android.material.timepicker.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2544b.this.m11748y();
        }
    }

    public C2544b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: u */
    private Drawable m11744u() {
        C5888g c5888g = new C5888g();
        this.f10038M = c5888g;
        c5888g.m20833V(new C5890i(0.5f));
        this.f10038M.m20835X(ColorStateList.valueOf(-1));
        return this.f10038M;
    }

    /* renamed from: x */
    private static boolean m11745x(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: z */
    private void m11746z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f10036K);
            handler.post(this.f10036K);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(C0690v.m3844m());
        }
        m11746z();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m11748y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m11746z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f10038M.m20835X(ColorStateList.valueOf(i10));
    }

    /* renamed from: v */
    public int m11747v() {
        return this.f10037L;
    }

    /* renamed from: w */
    public void mo11715w(int i10) {
        this.f10037L = i10;
        m11748y();
    }

    /* renamed from: y */
    protected void m11748y() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (m11745x(getChildAt(i11))) {
                i10++;
            }
        }
        C0549d c0549d = new C0549d();
        c0549d.m2585g(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id = childAt.getId();
            int i13 = C3524f.f14624b;
            if (id != i13 && !m11745x(childAt)) {
                c0549d.m2587i(childAt.getId(), i13, this.f10037L, f10);
                f10 += 360.0f / (childCount - i10);
            }
        }
        c0549d.m2581c(this);
    }

    public C2544b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(C3526h.f14658h, this);
        C0690v.m3859t0(this, m11744u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f14758F3, i10, 0);
        this.f10037L = obtainStyledAttributes.getDimensionPixelSize(C3530l.f14766G3, 0);
        this.f10036K = new a();
        obtainStyledAttributes.recycle();
    }
}
