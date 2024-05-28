package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.chip.C2440a;
import com.google.android.material.internal.C2487j;
import com.google.android.material.internal.C2489l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p111i4.C3520b;
import p111i4.C3528j;
import p111i4.C3529k;
import p111i4.C3530l;
import p125j4.C3607h;
import p272v4.AbstractC4984f;
import p272v4.C4982d;
import p284w4.C5457b;
import p306y0.AbstractC5589a;
import p310y4.C5889h;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements C2440a.a, InterfaceC5895n {

    /* renamed from: D */
    private static final int f9203D = C3529k.f14706p;

    /* renamed from: E */
    private static final Rect f9204E = new Rect();

    /* renamed from: F */
    private static final int[] f9205F = {R.attr.state_selected};

    /* renamed from: G */
    private static final int[] f9206G = {R.attr.state_checkable};

    /* renamed from: A */
    private final Rect f9207A;

    /* renamed from: B */
    private final RectF f9208B;

    /* renamed from: C */
    private final AbstractC4984f f9209C;

    /* renamed from: n */
    private C2440a f9210n;

    /* renamed from: o */
    private InsetDrawable f9211o;

    /* renamed from: p */
    private RippleDrawable f9212p;

    /* renamed from: q */
    private View.OnClickListener f9213q;

    /* renamed from: r */
    private CompoundButton.OnCheckedChangeListener f9214r;

    /* renamed from: s */
    private boolean f9215s;

    /* renamed from: t */
    private boolean f9216t;

    /* renamed from: u */
    private boolean f9217u;

    /* renamed from: v */
    private boolean f9218v;

    /* renamed from: w */
    private boolean f9219w;

    /* renamed from: x */
    private int f9220x;

    /* renamed from: y */
    private int f9221y;

    /* renamed from: z */
    private final C2434c f9222z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes.dex */
    class C2432a extends AbstractC4984f {
        C2432a() {
        }

        @Override // p272v4.AbstractC4984f
        /* renamed from: a */
        public void mo10834a(int i10) {
        }

        @Override // p272v4.AbstractC4984f
        /* renamed from: b */
        public void mo10835b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f9210n.m10919J2() ? Chip.this.f9210n.m10959f1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes.dex */
    public class C2433b extends ViewOutlineProvider {
        C2433b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f9210n != null) {
                Chip.this.f9210n.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes.dex */
    public class C2434c extends AbstractC5589a {
        C2434c(Chip chip) {
            super(chip);
        }

        @Override // p306y0.AbstractC5589a
        /* renamed from: B */
        protected int mo10836B(float f10, float f11) {
            return (Chip.this.m10819n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // p306y0.AbstractC5589a
        /* renamed from: C */
        protected void mo10837C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m10819n() && Chip.this.m10831s() && Chip.this.f9213q != null) {
                list.add(1);
            }
        }

        @Override // p306y0.AbstractC5589a
        /* renamed from: J */
        protected boolean mo10838J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.m10832t();
            }
            return false;
        }

        @Override // p306y0.AbstractC5589a
        /* renamed from: M */
        protected void mo10839M(C0660c c0660c) {
            c0660c.m3530X(Chip.this.m10830r());
            c0660c.m3534a0(Chip.this.isClickable());
            if (!Chip.this.m10830r() && !Chip.this.isClickable()) {
                c0660c.m3532Z("android.view.View");
            } else {
                c0660c.m3532Z(Chip.this.m10830r() ? "android.widget.CompoundButton" : "android.widget.Button");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c0660c.m3568v0(text);
            } else {
                c0660c.m3539d0(text);
            }
        }

        @Override // p306y0.AbstractC5589a
        /* renamed from: N */
        protected void mo10840N(int i10, C0660c c0660c) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c0660c.m3539d0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = C3528j.f14680j;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    c0660c.m3539d0(context.getString(i11, objArr).trim());
                }
                c0660c.m3527U(Chip.this.getCloseIconTouchBoundsInt());
                c0660c.m3535b(C0660c.a.f3538i);
                c0660c.m3541e0(Chip.this.isEnabled());
                return;
            }
            c0660c.m3539d0(BuildConfig.FLAVOR);
            c0660c.m3527U(Chip.f9204E);
        }

        @Override // p306y0.AbstractC5589a
        /* renamed from: O */
        protected void mo10841O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f9218v = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14520f);
    }

    /* renamed from: A */
    private void m10805A() {
        C2440a c2440a;
        if (TextUtils.isEmpty(getText()) || (c2440a = this.f9210n) == null) {
            return;
        }
        int m10911H0 = (int) (c2440a.m10911H0() + this.f9210n.m10963h1() + this.f9210n.m10976o0());
        int m10924M0 = (int) (this.f9210n.m10924M0() + this.f9210n.m10965i1() + this.f9210n.m10968k0());
        if (this.f9211o != null) {
            Rect rect = new Rect();
            this.f9211o.getPadding(rect);
            m10924M0 += rect.left;
            m10911H0 += rect.right;
        }
        C0690v.m3788C0(this, m10924M0, getPaddingTop(), m10911H0, getPaddingBottom());
    }

    /* renamed from: B */
    private void m10806B() {
        TextPaint paint = getPaint();
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            paint.drawableState = c2440a.getState();
        }
        C4982d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m19421j(getContext(), paint, this.f9209C);
        }
    }

    /* renamed from: C */
    private void m10807C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f9208B.setEmpty();
        if (m10819n() && this.f9213q != null) {
            this.f9210n.m10944W0(this.f9208B);
        }
        return this.f9208B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f9207A.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f9207A;
    }

    private C4982d getTextAppearance() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10961g1();
        }
        return null;
    }

    /* renamed from: i */
    private void m10815i(C2440a c2440a) {
        c2440a.m10975n2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: j */
    private int[] m10816j() {
        ?? isEnabled = isEnabled();
        int i10 = isEnabled;
        if (this.f9218v) {
            i10 = isEnabled + 1;
        }
        int i11 = i10;
        if (this.f9217u) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f9216t) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f9218v) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f9217u) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f9216t) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m10817l() {
        if (getBackgroundDrawable() == this.f9211o && this.f9210n.getCallback() == null) {
            this.f9210n.setCallback(this.f9211o);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    private boolean m10818m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC5589a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f9222z)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC5589a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f9222z, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException e10) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e10);
            } catch (NoSuchFieldException e11) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e11);
            } catch (NoSuchMethodException e12) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e12);
            } catch (InvocationTargetException e13) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e13);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m10819n() {
        C2440a c2440a = this.f9210n;
        return (c2440a == null || c2440a.m10930P0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m10820o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray m11374h = C2487j.m11374h(context, attributeSet, C3530l.f14898Z, i10, f9203D, new int[0]);
        this.f9219w = m11374h.getBoolean(C3530l.f14763G0, false);
        this.f9221y = (int) Math.ceil(m11374h.getDimension(C3530l.f15066u0, (float) Math.ceil(C2489l.m11380b(getContext(), 48))));
        m11374h.recycle();
    }

    /* renamed from: p */
    private void m10821p() {
        setOutlineProvider(new C2433b());
    }

    /* renamed from: q */
    private void m10822q(int i10, int i11, int i12, int i13) {
        this.f9211o = new InsetDrawable((Drawable) this.f9210n, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f9217u != z10) {
            this.f9217u = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f9216t != z10) {
            this.f9216t = z10;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m10823u() {
        if (this.f9211o != null) {
            this.f9211o = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m10826y();
        }
    }

    /* renamed from: w */
    private void m10824w(C2440a c2440a) {
        if (c2440a != null) {
            c2440a.m10975n2(null);
        }
    }

    /* renamed from: x */
    private void m10825x() {
        if (m10819n() && m10831s() && this.f9213q != null) {
            C0690v.m3853q0(this, this.f9222z);
        } else {
            C0690v.m3853q0(this, null);
        }
    }

    /* renamed from: y */
    private void m10826y() {
        if (C5457b.f20338a) {
            m10827z();
            return;
        }
        this.f9210n.m10916I2(true);
        C0690v.m3859t0(this, getBackgroundDrawable());
        m10805A();
        m10817l();
    }

    /* renamed from: z */
    private void m10827z() {
        this.f9212p = new RippleDrawable(C5457b.m20047d(this.f9210n.m10955d1()), getBackgroundDrawable(), null);
        this.f9210n.m10916I2(false);
        C0690v.m3859t0(this, this.f9212p);
        m10805A();
    }

    @Override // com.google.android.material.chip.C2440a.a
    /* renamed from: a */
    public void mo10828a() {
        m10829k(this.f9221y);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m10818m(motionEvent) || this.f9222z.m20550v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f9222z.m20551w(keyEvent) || this.f9222z.m20541A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2440a c2440a = this.f9210n;
        if ((c2440a == null || !c2440a.m10974n1()) ? false : this.f9210n.m10967j2(m10816j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9211o;
        return insetDrawable == null ? this.f9210n : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10899D0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10902E0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10905F0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return Math.max(0.0f, c2440a.m10908G0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9210n;
    }

    public float getChipEndPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10911H0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10914I0();
        }
        return null;
    }

    public float getChipIconSize() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10917J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10920K0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10922L0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10924M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10926N0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10928O0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10930P0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10932Q0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10934R0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10936S0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10938T0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10942V0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10948Z0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f9222z.m20541A() != 1 && this.f9222z.m20552x() != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public C3607h getHideMotionSpec() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10949a1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10951b1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10953c1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10955d1();
        }
        return null;
    }

    public C5892k getShapeAppearanceModel() {
        return this.f9210n.m20822C();
    }

    public C3607h getShowMotionSpec() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10957e1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10963h1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            return c2440a.m10965i1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean m10829k(int i10) {
        this.f9221y = i10;
        if (!m10833v()) {
            if (this.f9211o != null) {
                m10823u();
            } else {
                m10826y();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f9210n.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f9210n.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f9211o != null) {
                m10823u();
            } else {
                m10826y();
            }
            return false;
        }
        int i11 = max2 > 0 ? max2 / 2 : 0;
        int i12 = max > 0 ? max / 2 : 0;
        if (this.f9211o != null) {
            Rect rect = new Rect();
            this.f9211o.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                m10826y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        m10822q(i11, i12, i11, i12);
        m10826y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5889h.m20861f(this, this.f9210n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f9205F);
        }
        if (m10830r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f9206G);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f9222z.m20543I(z10, i10, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!m10830r() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            accessibilityNodeInfo.setClassName(m10830r() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        accessibilityNodeInfo.setCheckable(m10830r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C0660c.m3511z0(accessibilityNodeInfo).m3538c0(C0660c.d.m3580a(chipGroup.m11344b(this), 1, chipGroup.mo10852c() ? chipGroup.m10855o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f9220x != i10) {
            this.f9220x = i10;
            m10805A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f9216t
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f9216t
            if (r0 == 0) goto L34
            r5.m10832t()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean m10830r() {
        C2440a c2440a = this.f9210n;
        return c2440a != null && c2440a.m10972m1();
    }

    /* renamed from: s */
    public boolean m10831s() {
        C2440a c2440a = this.f9210n;
        return c2440a != null && c2440a.m10977o1();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9212p) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9212p) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10987v1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10989w1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C2440a c2440a = this.f9210n;
        if (c2440a == null) {
            this.f9215s = z10;
            return;
        }
        if (c2440a.m10972m1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked == z10 || (onCheckedChangeListener = this.f9214r) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10991x1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10993y1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10995z1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10893A1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10895B1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10900D1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10903E1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10906F1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10909G1(i10);
        }
    }

    public void setChipDrawable(C2440a c2440a) {
        C2440a c2440a2 = this.f9210n;
        if (c2440a2 != c2440a) {
            m10824w(c2440a2);
            this.f9210n = c2440a;
            c2440a.m10994y2(false);
            m10815i(this.f9210n);
            m10829k(this.f9221y);
        }
    }

    public void setChipEndPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10912H1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10915I1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10918J1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10921K1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10923L1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10925M1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10927N1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10929O1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10931P1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10935R1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10937S1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10939T1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10941U1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10943V1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10945W1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10946X1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10947Y1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10950a2(drawable);
        }
        m10825x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10952b2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10954c2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10956d2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10958e2(i10);
        }
        m10825x();
    }

    public void setCloseIconSize(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10960f2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10962g2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10964h2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10966i2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10970k2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10971l2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m20834W(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9210n == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C2440a c2440a = this.f9210n;
            if (c2440a != null) {
                c2440a.m10978o2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f9219w = z10;
        m10829k(this.f9221y);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C3607h c3607h) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10979p2(c3607h);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10980q2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10982r2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10983s2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10985t2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10986u2(i10);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f9210n == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10988v2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9214r = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9213q = onClickListener;
        m10825x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10990w2(colorStateList);
        }
        if (this.f9210n.m10969k1()) {
            return;
        }
        m10827z();
    }

    public void setRippleColorResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10992x2(i10);
            if (this.f9210n.m10969k1()) {
                return;
            }
            m10827z();
        }
    }

    @Override // p310y4.InterfaceC5895n
    public void setShapeAppearanceModel(C5892k c5892k) {
        this.f9210n.setShapeAppearanceModel(c5892k);
    }

    public void setShowMotionSpec(C3607h c3607h) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10996z2(c3607h);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10894A2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2440a c2440a = this.f9210n;
        if (c2440a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        super.setText(c2440a.m10919J2() ? null : charSequence, bufferType);
        C2440a c2440a2 = this.f9210n;
        if (c2440a2 != null) {
            c2440a2.m10896B2(charSequence);
        }
    }

    public void setTextAppearance(C4982d c4982d) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10898C2(c4982d);
        }
        m10806B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10904E2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10907F2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10910G2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10913H2(i10);
        }
    }

    /* renamed from: t */
    public boolean m10832t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f9213q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        this.f9222z.m20548U(1, 1);
        return z10;
    }

    /* renamed from: v */
    public boolean m10833v() {
        return this.f9219w;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.f9203D
            android.content.Context r8 = p323z4.C6011a.m21324c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f9207A = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f9208B = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f9209C = r8
            android.content.Context r8 = r7.getContext()
            r7.m10807C(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.C2440a.m10885t0(r8, r9, r10, r4)
            r7.m10820o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.C0690v.m3868y(r7)
            r6.m20834W(r0)
            int[] r2 = p111i4.C3530l.f14898Z
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C2487j.m11374h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = p111i4.C3530l.f14922c0
            android.content.res.ColorStateList r8 = p272v4.C4981c.m19404a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = p111i4.C3530l.f14801L0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f9222z = r9
            r7.m10825x()
            if (r8 != 0) goto L69
            r7.m10821p()
        L69:
            boolean r8 = r7.f9215s
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.m10959f1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.m10948Z0()
            r7.setEllipsize(r8)
            r7.m10806B()
            com.google.android.material.chip.a r8 = r7.f9210n
            boolean r8 = r8.m10919J2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.m10805A()
            boolean r8 = r7.m10833v()
            if (r8 == 0) goto La2
            int r8 = r7.f9221y
            r7.setMinHeight(r8)
        La2:
            int r8 = androidx.core.view.C0690v.m3791E(r7)
            r7.f9220x = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10973m2(z10);
        }
        m10825x();
    }

    public void setCheckedIconVisible(boolean z10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10897C1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10933Q1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10901D2(i10);
        }
        m10806B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        C2440a c2440a = this.f9210n;
        if (c2440a != null) {
            c2440a.m10901D2(i10);
        }
        m10806B();
    }
}
