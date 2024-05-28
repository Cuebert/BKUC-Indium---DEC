package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p066f.C3121a;
import p081g0.C3221a;
import p111i4.C3520b;
import p111i4.C3529k;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* renamed from: com.google.android.material.card.a */
/* loaded from: classes.dex */
public class C2431a extends C3221a implements Checkable, InterfaceC5895n {

    /* renamed from: v */
    private boolean f9199v;

    /* renamed from: w */
    private boolean f9200w;

    /* renamed from: x */
    private boolean f9201x;

    /* renamed from: y */
    private a f9202y;

    /* renamed from: z */
    private static final int[] f9198z = {R.attr.state_checkable};

    /* renamed from: A */
    private static final int[] f9195A = {R.attr.state_checked};

    /* renamed from: B */
    private static final int[] f9196B = {C3520b.f14540z};

    /* renamed from: C */
    private static final int f9197C = C3529k.f14704n;

    /* renamed from: com.google.android.material.card.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m10804a(C2431a c2431a, boolean z10);
    }

    /* renamed from: d */
    private void m10801d() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    /* renamed from: e */
    public boolean m10802e() {
        return false;
    }

    /* renamed from: f */
    public boolean m10803f() {
        return this.f9201x;
    }

    @Override // p081g0.C3221a
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // p081g0.C3221a
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // p081g0.C3221a
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // p081g0.C3221a
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // p081g0.C3221a
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // p081g0.C3221a
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C5892k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9200w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (m10802e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9198z);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9195A);
        }
        if (m10803f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9196B);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m10802e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p081g0.C3221a, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9199v) {
            throw null;
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p081g0.C3221a
    public void setCardBackgroundColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    @Override // p081g0.C3221a
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z10) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f9200w != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i10) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setCheckedIconResource(int i10) {
        C3121a.m13770d(getContext(), i10);
        throw null;
    }

    public void setCheckedIconSize(int i10) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i10);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
    }

    public void setDragged(boolean z10) {
        if (this.f9201x != z10) {
            this.f9201x = z10;
            refreshDrawableState();
            m10801d();
            invalidate();
        }
    }

    @Override // p081g0.C3221a
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        throw null;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f9202y = aVar;
    }

    @Override // p081g0.C3221a
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        throw null;
    }

    public void setProgress(float f10) {
        throw null;
    }

    @Override // p081g0.C3221a
    public void setRadius(float f10) {
        super.setRadius(f10);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i10) {
        C3121a.m13769c(getContext(), i10);
        throw null;
    }

    @Override // p310y4.InterfaceC5895n
    public void setShapeAppearanceModel(C5892k c5892k) {
        setClipToOutline(c5892k.m20882u(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i10) {
        ColorStateList.valueOf(i10);
        throw null;
    }

    public void setStrokeWidth(int i10) {
        throw null;
    }

    @Override // p081g0.C3221a
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m10802e() && isEnabled()) {
            this.f9200w = !this.f9200w;
            refreshDrawableState();
            m10801d();
            a aVar = this.f9202y;
            if (aVar != null) {
                aVar.m10804a(this, this.f9200w);
            }
        }
    }

    @Override // p081g0.C3221a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
