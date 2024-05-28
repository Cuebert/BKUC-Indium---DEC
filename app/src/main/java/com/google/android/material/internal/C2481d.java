package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p111i4.C3530l;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public class C2481d extends LinearLayoutCompat {

    /* renamed from: n */
    private Drawable f9624n;

    /* renamed from: o */
    private final Rect f9625o;

    /* renamed from: p */
    private final Rect f9626p;

    /* renamed from: q */
    private int f9627q;

    /* renamed from: r */
    protected boolean f9628r;

    /* renamed from: s */
    boolean f9629s;

    public C2481d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f9624n;
        if (drawable != null) {
            if (this.f9629s) {
                this.f9629s = false;
                Rect rect = this.f9625o;
                Rect rect2 = this.f9626p;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f9628r) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f9627q, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f9624n;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9624n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f9624n.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f9624n;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f9627q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9624n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f9629s = z10 | this.f9629s;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9629s = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f9624n;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f9624n);
            }
            this.f9624n = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f9627q == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f9627q != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f9627q = i10;
            if (i10 == 119 && this.f9624n != null) {
                this.f9624n.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9624n;
    }

    public C2481d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9625o = new Rect();
        this.f9626p = new Rect();
        this.f9627q = 119;
        this.f9628r = true;
        this.f9629s = false;
        TypedArray m11374h = C2487j.m11374h(context, attributeSet, C3530l.f14740D1, i10, 0, new int[0]);
        this.f9627q = m11374h.getInt(C3530l.f14756F1, this.f9627q);
        Drawable drawable = m11374h.getDrawable(C3530l.f14748E1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f9628r = m11374h.getBoolean(C3530l.f14764G1, true);
        m11374h.recycle();
    }
}
