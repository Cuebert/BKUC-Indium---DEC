package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0690v;
import androidx.core.widget.C0707i;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3529k;
import p310y4.C5889h;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC5895n {

    /* renamed from: A */
    private static final int[] f9137A = {R.attr.state_checkable};

    /* renamed from: B */
    private static final int[] f9138B = {R.attr.state_checked};

    /* renamed from: C */
    private static final int f9139C = C3529k.f14703m;

    /* renamed from: n */
    private final C2430a f9140n;

    /* renamed from: o */
    private final LinkedHashSet<InterfaceC2422a> f9141o;

    /* renamed from: p */
    private InterfaceC2423b f9142p;

    /* renamed from: q */
    private PorterDuff.Mode f9143q;

    /* renamed from: r */
    private ColorStateList f9144r;

    /* renamed from: s */
    private Drawable f9145s;

    /* renamed from: t */
    private int f9146t;

    /* renamed from: u */
    private int f9147u;

    /* renamed from: v */
    private int f9148v;

    /* renamed from: w */
    private int f9149w;

    /* renamed from: x */
    private boolean f9150x;

    /* renamed from: y */
    private boolean f9151y;

    /* renamed from: z */
    private int f9152z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2421a();

        /* renamed from: n */
        boolean f9153n;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        /* loaded from: classes.dex */
        static class C2421a implements Parcelable.ClassLoaderCreator<SavedState> {
            C2421a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m10727a(Parcel parcel) {
            this.f9153n = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9153n ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m10727a(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2422a {
        /* renamed from: a */
        void mo10731a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2423b {
        /* renamed from: a */
        void mo10732a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14531q);
    }

    /* renamed from: c */
    private boolean m10716c() {
        int i10 = this.f9152z;
        return i10 == 3 || i10 == 4;
    }

    /* renamed from: d */
    private boolean m10717d() {
        int i10 = this.f9152z;
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: e */
    private boolean m10718e() {
        int i10 = this.f9152z;
        return i10 == 16 || i10 == 32;
    }

    /* renamed from: f */
    private boolean m10719f() {
        return C0690v.m3791E(this) == 1;
    }

    /* renamed from: g */
    private boolean m10720g() {
        C2430a c2430a = this.f9140n;
        return (c2430a == null || c2430a.m10788o()) ? false : true;
    }

    private String getA11yClassName() {
        return (m10725b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: i */
    private void m10721i() {
        if (m10717d()) {
            C0707i.m4172k(this, this.f9145s, null, null, null);
        } else if (m10716c()) {
            C0707i.m4172k(this, null, null, this.f9145s, null);
        } else if (m10718e()) {
            C0707i.m4172k(this, null, this.f9145s, null, null);
        }
    }

    /* renamed from: j */
    private void m10722j(boolean z10) {
        Drawable drawable = this.f9145s;
        if (drawable != null) {
            Drawable mutate = C0609a.m3263r(drawable).mutate();
            this.f9145s = mutate;
            C0609a.m3260o(mutate, this.f9144r);
            PorterDuff.Mode mode = this.f9143q;
            if (mode != null) {
                C0609a.m3261p(this.f9145s, mode);
            }
            int i10 = this.f9146t;
            if (i10 == 0) {
                i10 = this.f9145s.getIntrinsicWidth();
            }
            int i11 = this.f9146t;
            if (i11 == 0) {
                i11 = this.f9145s.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9145s;
            int i12 = this.f9147u;
            int i13 = this.f9148v;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
        }
        if (z10) {
            m10721i();
            return;
        }
        Drawable[] m4162a = C0707i.m4162a(this);
        boolean z11 = false;
        Drawable drawable3 = m4162a[0];
        Drawable drawable4 = m4162a[1];
        Drawable drawable5 = m4162a[2];
        if ((m10717d() && drawable3 != this.f9145s) || ((m10716c() && drawable5 != this.f9145s) || (m10718e() && drawable4 != this.f9145s))) {
            z11 = true;
        }
        if (z11) {
            m10721i();
        }
    }

    /* renamed from: k */
    private void m10723k(int i10, int i11) {
        if (this.f9145s == null || getLayout() == null) {
            return;
        }
        if (!m10717d() && !m10716c()) {
            if (m10718e()) {
                this.f9147u = 0;
                if (this.f9152z == 16) {
                    this.f9148v = 0;
                    m10722j(false);
                    return;
                }
                int i12 = this.f9146t;
                if (i12 == 0) {
                    i12 = this.f9145s.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i12) - this.f9149w) - getPaddingBottom()) / 2;
                if (this.f9148v != textHeight) {
                    this.f9148v = textHeight;
                    m10722j(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f9148v = 0;
        int i13 = this.f9152z;
        if (i13 != 1 && i13 != 3) {
            int i14 = this.f9146t;
            if (i14 == 0) {
                i14 = this.f9145s.getIntrinsicWidth();
            }
            int textWidth = (((((i10 - getTextWidth()) - C0690v.m3799I(this)) - i14) - this.f9149w) - C0690v.m3801J(this)) / 2;
            if (m10719f() != (this.f9152z == 4)) {
                textWidth = -textWidth;
            }
            if (this.f9147u != textWidth) {
                this.f9147u = textWidth;
                m10722j(false);
                return;
            }
            return;
        }
        this.f9147u = 0;
        m10722j(false);
    }

    /* renamed from: a */
    public void m10724a(InterfaceC2422a interfaceC2422a) {
        this.f9141o.add(interfaceC2422a);
    }

    /* renamed from: b */
    public boolean m10725b() {
        C2430a c2430a = this.f9140n;
        return c2430a != null && c2430a.m10789p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m10720g()) {
            return this.f9140n.m10777b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9145s;
    }

    public int getIconGravity() {
        return this.f9152z;
    }

    public int getIconPadding() {
        return this.f9149w;
    }

    public int getIconSize() {
        return this.f9146t;
    }

    public ColorStateList getIconTint() {
        return this.f9144r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9143q;
    }

    public int getInsetBottom() {
        return this.f9140n.m10778c();
    }

    public int getInsetTop() {
        return this.f9140n.m10779d();
    }

    public ColorStateList getRippleColor() {
        if (m10720g()) {
            return this.f9140n.m10782h();
        }
        return null;
    }

    public C5892k getShapeAppearanceModel() {
        if (m10720g()) {
            return this.f9140n.m10783i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m10720g()) {
            return this.f9140n.m10784j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m10720g()) {
            return this.f9140n.m10785k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        if (m10720g()) {
            return this.f9140n.m10786l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m10720g()) {
            return this.f9140n.m10787m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void m10726h(InterfaceC2422a interfaceC2422a) {
        this.f9141o.remove(interfaceC2422a);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9150x;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m10720g()) {
            C5889h.m20861f(this, this.f9140n.m10781f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (m10725b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f9137A);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f9138B);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m10725b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C2430a c2430a;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT != 21 || (c2430a = this.f9140n) == null) {
            return;
        }
        c2430a.m10776H(i13 - i11, i12 - i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f9153n);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9153n = this.f9150x;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m10723k(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m10723k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m10720g()) {
            this.f9140n.m10791r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m10720g()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f9140n.m10792s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C3121a.m13770d(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m10720g()) {
            this.f9140n.m10793t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (m10725b() && isEnabled() && this.f9150x != z10) {
            this.f9150x = z10;
            refreshDrawableState();
            if (this.f9151y) {
                return;
            }
            this.f9151y = true;
            Iterator<InterfaceC2422a> it = this.f9141o.iterator();
            while (it.hasNext()) {
                it.next().mo10731a(this, this.f9150x);
            }
            this.f9151y = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (m10720g()) {
            this.f9140n.m10794u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m10720g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m10720g()) {
            this.f9140n.m10781f().m20834W(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9145s != drawable) {
            this.f9145s = drawable;
            m10722j(true);
            m10723k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f9152z != i10) {
            this.f9152z = i10;
            m10723k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f9149w != i10) {
            this.f9149w = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C3121a.m13770d(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f9146t != i10) {
                this.f9146t = i10;
                m10722j(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9144r != colorStateList) {
            this.f9144r = colorStateList;
            m10722j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9143q != mode) {
            this.f9143q = mode;
            m10722j(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C3121a.m13769c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f9140n.m10795v(i10);
    }

    public void setInsetTop(int i10) {
        this.f9140n.m10796w(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC2423b interfaceC2423b) {
        this.f9142p = interfaceC2423b;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        InterfaceC2423b interfaceC2423b = this.f9142p;
        if (interfaceC2423b != null) {
            interfaceC2423b.mo10732a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m10720g()) {
            this.f9140n.m10797x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m10720g()) {
            setRippleColor(C3121a.m13769c(getContext(), i10));
        }
    }

    @Override // p310y4.InterfaceC5895n
    public void setShapeAppearanceModel(C5892k c5892k) {
        if (m10720g()) {
            this.f9140n.m10798y(c5892k);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m10720g()) {
            this.f9140n.m10799z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m10720g()) {
            this.f9140n.m10772A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m10720g()) {
            setStrokeColor(C3121a.m13769c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m10720g()) {
            this.f9140n.m10773B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m10720g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m10720g()) {
            this.f9140n.m10774C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m10720g()) {
            this.f9140n.m10775D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f9150x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f9139C
            android.content.Context r9 = p323z4.C6011a.m21324c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f9141o = r9
            r9 = 0
            r8.f9150x = r9
            r8.f9151y = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p111i4.C3530l.f14900Z1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C2487j.m11374h(r0, r1, r2, r3, r4, r5)
            int r1 = p111i4.C3530l.f15004m2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9149w = r1
            int r1 = p111i4.C3530l.f15028p2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C2489l.m11383e(r1, r2)
            r8.f9143q = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p111i4.C3530l.f15020o2
            android.content.res.ColorStateList r1 = p272v4.C4981c.m19404a(r1, r0, r2)
            r8.f9144r = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p111i4.C3530l.f14988k2
            android.graphics.drawable.Drawable r1 = p272v4.C4981c.m19407d(r1, r0, r2)
            r8.f9145s = r1
            int r1 = p111i4.C3530l.f14996l2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f9152z = r1
            int r1 = p111i4.C3530l.f15012n2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f9146t = r1
            y4.k$b r10 = p310y4.C5892k.m20866e(r7, r10, r11, r6)
            y4.k r10 = r10.m20906m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f9140n = r11
            r11.m10790q(r0)
            r0.recycle()
            int r10 = r8.f9149w
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f9145s
            if (r10 == 0) goto L84
            r9 = 1
        L84:
            r8.m10722j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
