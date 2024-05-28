package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0690v;
import com.google.android.material.internal.C2489l;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3530l;
import p186o4.C4133a;
import p272v4.C4981c;
import p323z4.C6011a;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public class C2494d extends FrameLayout {

    /* renamed from: u */
    private static final View.OnTouchListener f9676u = new a();

    /* renamed from: n */
    private InterfaceC2493c f9677n;

    /* renamed from: o */
    private InterfaceC2492b f9678o;

    /* renamed from: p */
    private int f9679p;

    /* renamed from: q */
    private final float f9680q;

    /* renamed from: r */
    private final float f9681r;

    /* renamed from: s */
    private ColorStateList f9682s;

    /* renamed from: t */
    private PorterDuff.Mode f9683t;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* loaded from: classes.dex */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2494d(Context context, AttributeSet attributeSet) {
        super(C6011a.m21324c(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C3530l.f14926c4);
        if (obtainStyledAttributes.hasValue(C3530l.f14982j4)) {
            C0690v.m3867x0(this, obtainStyledAttributes.getDimensionPixelSize(r1, 0));
        }
        this.f9679p = obtainStyledAttributes.getInt(C3530l.f14950f4, 0);
        this.f9680q = obtainStyledAttributes.getFloat(C3530l.f14958g4, 1.0f);
        setBackgroundTintList(C4981c.m19404a(context2, obtainStyledAttributes, C3530l.f14966h4));
        setBackgroundTintMode(C2489l.m11383e(obtainStyledAttributes.getInt(C3530l.f14974i4, -1), PorterDuff.Mode.SRC_IN));
        this.f9681r = obtainStyledAttributes.getFloat(C3530l.f14942e4, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f9676u);
        setFocusable(true);
        if (getBackground() == null) {
            C0690v.m3859t0(this, m11391a());
        }
    }

    /* renamed from: a */
    private Drawable m11391a() {
        float dimension = getResources().getDimension(C3522d.f14569W);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(C4133a.m17134g(this, C3520b.f14526l, C3520b.f14523i, getBackgroundOverlayColorAlpha()));
        if (this.f9682s != null) {
            Drawable m3263r = C0609a.m3263r(gradientDrawable);
            C0609a.m3260o(m3263r, this.f9682s);
            return m3263r;
        }
        return C0609a.m3263r(gradientDrawable);
    }

    float getActionTextColorAlpha() {
        return this.f9681r;
    }

    int getAnimationMode() {
        return this.f9679p;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.f9680q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2492b interfaceC2492b = this.f9678o;
        if (interfaceC2492b != null) {
            interfaceC2492b.onViewAttachedToWindow(this);
        }
        C0690v.m3847n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2492b interfaceC2492b = this.f9678o;
        if (interfaceC2492b != null) {
            interfaceC2492b.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        InterfaceC2493c interfaceC2493c = this.f9677n;
        if (interfaceC2493c != null) {
            interfaceC2493c.m11390a(this, i10, i11, i12, i13);
        }
    }

    void setAnimationMode(int i10) {
        this.f9679p = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f9682s != null) {
            drawable = C0609a.m3263r(drawable.mutate());
            C0609a.m3260o(drawable, this.f9682s);
            C0609a.m3261p(drawable, this.f9683t);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f9682s = colorStateList;
        if (getBackground() != null) {
            Drawable m3263r = C0609a.m3263r(getBackground().mutate());
            C0609a.m3260o(m3263r, colorStateList);
            C0609a.m3261p(m3263r, this.f9683t);
            if (m3263r != getBackground()) {
                super.setBackgroundDrawable(m3263r);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f9683t = mode;
        if (getBackground() != null) {
            Drawable m3263r = C0609a.m3263r(getBackground().mutate());
            C0609a.m3261p(m3263r, mode);
            if (m3263r != getBackground()) {
                super.setBackgroundDrawable(m3263r);
            }
        }
    }

    void setOnAttachStateChangeListener(InterfaceC2492b interfaceC2492b) {
        this.f9678o = interfaceC2492b;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f9676u);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(InterfaceC2493c interfaceC2493c) {
        this.f9677n = interfaceC2493c;
    }
}
