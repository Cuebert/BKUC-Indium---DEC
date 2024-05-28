package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.util.C0654h;
import androidx.core.view.C0690v;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C2472a;
import com.google.android.material.internal.C2479b;
import com.google.android.material.internal.C2490m;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p111i4.C3522d;
import p111i4.C3529k;
import p111i4.C3530l;
import p125j4.C3607h;
import p125j4.InterfaceC3610k;
import p236s4.InterfaceC4527a;
import p297x4.InterfaceC5548b;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* loaded from: classes.dex */
public class FloatingActionButton extends C2490m implements InterfaceC4527a, InterfaceC5895n, CoordinatorLayout.InterfaceC0558b {

    /* renamed from: C */
    private static final int f9456C = C3529k.f14697g;

    /* renamed from: A */
    private final AppCompatImageHelper f9457A;

    /* renamed from: B */
    private C2472a f9458B;

    /* renamed from: o */
    private ColorStateList f9459o;

    /* renamed from: p */
    private PorterDuff.Mode f9460p;

    /* renamed from: q */
    private ColorStateList f9461q;

    /* renamed from: r */
    private PorterDuff.Mode f9462r;

    /* renamed from: s */
    private ColorStateList f9463s;

    /* renamed from: t */
    private int f9464t;

    /* renamed from: u */
    private int f9465u;

    /* renamed from: v */
    private int f9466v;

    /* renamed from: w */
    private int f9467w;

    /* renamed from: x */
    boolean f9468x;

    /* renamed from: y */
    final Rect f9469y;

    /* renamed from: z */
    private final Rect f9470z;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo2663b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo2663b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo2669h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo2669h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo2673l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.mo2673l(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo2668g(CoordinatorLayout.C0562f c0562f) {
            super.mo2668g(c0562f);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C2468a implements C2472a.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC2469b f9474a;

        C2468a(AbstractC2469b abstractC2469b) {
            this.f9474a = abstractC2469b;
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.j
        /* renamed from: a */
        public void mo11195a() {
            this.f9474a.mo10640b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.j
        /* renamed from: b */
        public void mo11196b() {
            this.f9474a.mo10639a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2469b {
        /* renamed from: a */
        public void mo10639a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo10640b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes.dex */
    public class C2470c implements InterfaceC5548b {
        C2470c() {
        }

        @Override // p297x4.InterfaceC5548b
        /* renamed from: a */
        public void mo11197a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f9469y.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f9466v, i11 + FloatingActionButton.this.f9466v, i12 + FloatingActionButton.this.f9466v, i13 + FloatingActionButton.this.f9466v);
        }

        @Override // p297x4.InterfaceC5548b
        /* renamed from: b */
        public boolean mo11198b() {
            return FloatingActionButton.this.f9468x;
        }

        @Override // p297x4.InterfaceC5548b
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes.dex */
    public class C2471d<T extends FloatingActionButton> implements C2472a.i {

        /* renamed from: a */
        private final InterfaceC3610k<T> f9477a;

        C2471d(InterfaceC3610k<T> interfaceC3610k) {
            this.f9477a = interfaceC3610k;
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.i
        /* renamed from: a */
        public void mo11199a() {
            this.f9477a.m15446a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.i
        /* renamed from: b */
        public void mo11200b() {
            this.f9477a.m15447b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2471d) && ((C2471d) obj).f9477a.equals(this.f9477a);
        }

        public int hashCode() {
            return this.f9477a.hashCode();
        }
    }

    private C2472a getImpl() {
        if (this.f9458B == null) {
            this.f9458B = m11169h();
        }
        return this.f9458B;
    }

    /* renamed from: h */
    private C2472a m11169h() {
        return new C2473b(this, new C2470c());
    }

    /* renamed from: k */
    private int m11170k(int i10) {
        int i11 = this.f9465u;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(C3522d.f14577d);
            }
            return resources.getDimensionPixelSize(C3522d.f14576c);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m11170k(1);
        }
        return m11170k(0);
    }

    /* renamed from: p */
    private void m11171p(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f9469y;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m11172q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f9461q;
        if (colorStateList == null) {
            C0609a.m3248c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f9462r;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    /* renamed from: r */
    private static int m11173r(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i10, size);
        }
        if (mode == 0) {
            return i10;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C2472a.j m11174u(AbstractC2469b abstractC2469b) {
        if (abstractC2469b == null) {
            return null;
        }
        return new C2468a(abstractC2469b);
    }

    @Override // p236s4.InterfaceC4527a
    /* renamed from: a */
    public boolean mo11175a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo11214C(getDrawableState());
    }

    /* renamed from: e */
    public void m11176e(Animator.AnimatorListener animatorListener) {
        getImpl().m11240d(animatorListener);
    }

    /* renamed from: f */
    public void m11177f(Animator.AnimatorListener animatorListener) {
        getImpl().m11241e(animatorListener);
    }

    /* renamed from: g */
    public void m11178g(InterfaceC3610k<? extends FloatingActionButton> interfaceC3610k) {
        getImpl().m11242f(new C2471d(interfaceC3610k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f9459o;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9460p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0558b
    public CoordinatorLayout.AbstractC0559c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo11244m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m11247p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m11249s();
    }

    public Drawable getContentBackground() {
        return getImpl().m11243j();
    }

    public int getCustomSize() {
        return this.f9465u;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C3607h getHideMotionSpec() {
        return getImpl().m11246o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f9463s;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9463s;
    }

    public C5892k getShapeAppearanceModel() {
        return (C5892k) C0654h.m3467f(getImpl().m11250t());
    }

    public C3607h getShowMotionSpec() {
        return getImpl().m11251u();
    }

    public int getSize() {
        return this.f9464t;
    }

    public int getSizeDimension() {
        return m11170k(this.f9464t);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f9461q;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9462r;
    }

    public boolean getUseCompatPadding() {
        return this.f9468x;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m11179i(Rect rect) {
        if (!C0690v.m3814U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m11171p(rect);
        return true;
    }

    /* renamed from: j */
    public void m11180j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m11171p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo11255y();
    }

    /* renamed from: l */
    public void m11181l(AbstractC2469b abstractC2469b) {
        m11182m(abstractC2469b, true);
    }

    /* renamed from: m */
    void m11182m(AbstractC2469b abstractC2469b, boolean z10) {
        getImpl().m11252v(m11174u(abstractC2469b), z10);
    }

    /* renamed from: n */
    public boolean m11183n() {
        return getImpl().m11253w();
    }

    /* renamed from: o */
    public boolean m11184o() {
        return getImpl().m11254x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m11256z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m11213B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f9466v = (sizeDimension - this.f9467w) / 2;
        getImpl().m11238b0();
        int min = Math.min(m11173r(sizeDimension, i10), m11173r(sizeDimension, i11));
        Rect rect = this.f9469y;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m11179i(this.f9470z) && !this.f9470z.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public void m11185s(AbstractC2469b abstractC2469b) {
        m11186t(abstractC2469b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9459o != colorStateList) {
            this.f9459o = colorStateList;
            getImpl().m11221J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9460p != mode) {
            this.f9460p = mode;
            getImpl().m11222K(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().m11223L(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().m11226O(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().m11228Q(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f9465u) {
                this.f9465u = i10;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().m11239c0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().m11245n()) {
            getImpl().m11224M(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(C3607h c3607h) {
        getImpl().m11225N(c3607h);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C3607h.m15431c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m11237a0();
            if (this.f9461q != null) {
                m11172q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f9457A.setImageResource(i10);
        m11172q();
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().m11218G();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().m11218G();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().m11230S(z10);
    }

    @Override // p310y4.InterfaceC5895n
    public void setShapeAppearanceModel(C5892k c5892k) {
        getImpl().m11231T(c5892k);
    }

    public void setShowMotionSpec(C3607h c3607h) {
        getImpl().m11232U(c3607h);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C3607h.m15431c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f9465u = 0;
        if (i10 != this.f9464t) {
            this.f9464t = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9461q != colorStateList) {
            this.f9461q = colorStateList;
            m11172q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9462r != mode) {
            this.f9462r = mode;
            m11172q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().m11219H();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().m11219H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().m11219H();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f9468x != z10) {
            this.f9468x = z10;
            getImpl().mo11212A();
        }
    }

    @Override // com.google.android.material.internal.C2490m, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* renamed from: t */
    void m11186t(AbstractC2469b abstractC2469b, boolean z10) {
        getImpl().m11235Y(m11174u(abstractC2469b), z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0559c<T> {

        /* renamed from: a */
        private Rect f9471a;

        /* renamed from: b */
        private AbstractC2469b f9472b;

        /* renamed from: c */
        private boolean f9473c;

        public BaseBehavior() {
            this.f9473c = true;
        }

        /* renamed from: F */
        private static boolean m11187F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0562f) {
                return ((CoordinatorLayout.C0562f) layoutParams).m2696f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m11188G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f9469y;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0562f c0562f = (CoordinatorLayout.C0562f) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0562f).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0562f).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0562f).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                C0690v.m3823b0(floatingActionButton, i11);
            }
            if (i10 != 0) {
                C0690v.m3821a0(floatingActionButton, i10);
            }
        }

        /* renamed from: J */
        private boolean m11189J(View view, FloatingActionButton floatingActionButton) {
            return this.f9473c && ((CoordinatorLayout.C0562f) floatingActionButton.getLayoutParams()).m2695e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m11190K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m11189J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f9471a == null) {
                this.f9471a = new Rect();
            }
            Rect rect = this.f9471a;
            C2479b.m11339a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m11182m(this.f9472b, false);
                return true;
            }
            floatingActionButton.m11186t(this.f9472b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m11191L(View view, FloatingActionButton floatingActionButton) {
            if (!m11189J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0562f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m11182m(this.f9472b, false);
                return true;
            }
            floatingActionButton.m11186t(this.f9472b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: E */
        public boolean mo2663b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f9469y;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: H */
        public boolean mo2669h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m11190K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m11187F(view)) {
                return false;
            }
            m11191L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: I */
        public boolean mo2673l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> m2648l = coordinatorLayout.m2648l(floatingActionButton);
            int size = m2648l.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = m2648l.get(i11);
                if (view instanceof AppBarLayout) {
                    if (m11190K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m11187F(view) && m11191L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m2636C(floatingActionButton, i10);
            m11188G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: g */
        public void mo2668g(CoordinatorLayout.C0562f c0562f) {
            if (c0562f.f3030h == 0) {
                c0562f.f3030h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3530l.f15083w1);
            this.f9473c = obtainStyledAttributes.getBoolean(C3530l.f15091x1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9463s != colorStateList) {
            this.f9463s = colorStateList;
            getImpl().mo11229R(this.f9463s);
        }
    }
}
