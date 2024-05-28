package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.C0587a;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.text.C0642a;
import androidx.core.view.C0656a;
import androidx.core.view.C0676h;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.widget.C0707i;
import androidx.customview.view.AbsSavedState;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.internal.C2478a;
import com.google.android.material.internal.C2479b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3524f;
import p111i4.C3528j;
import p111i4.C3529k;
import p125j4.C3600a;
import p186o4.C4133a;
import p272v4.C4981c;
import p310y4.C5888g;
import p310y4.C5892k;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: Z0 */
    private static final int f9784Z0 = C3529k.f14700j;

    /* renamed from: A */
    private int f9785A;

    /* renamed from: A0 */
    private Drawable f9786A0;

    /* renamed from: B */
    private int f9787B;

    /* renamed from: B0 */
    private int f9788B0;

    /* renamed from: C */
    private CharSequence f9789C;

    /* renamed from: C0 */
    private Drawable f9790C0;

    /* renamed from: D */
    private boolean f9791D;

    /* renamed from: D0 */
    private View.OnLongClickListener f9792D0;

    /* renamed from: E */
    private TextView f9793E;

    /* renamed from: E0 */
    private View.OnLongClickListener f9794E0;

    /* renamed from: F */
    private ColorStateList f9795F;

    /* renamed from: F0 */
    private final CheckableImageButton f9796F0;

    /* renamed from: G */
    private int f9797G;

    /* renamed from: G0 */
    private ColorStateList f9798G0;

    /* renamed from: H */
    private ColorStateList f9799H;

    /* renamed from: H0 */
    private ColorStateList f9800H0;

    /* renamed from: I */
    private ColorStateList f9801I;

    /* renamed from: I0 */
    private ColorStateList f9802I0;

    /* renamed from: J */
    private CharSequence f9803J;

    /* renamed from: J0 */
    private int f9804J0;

    /* renamed from: K */
    private final TextView f9805K;

    /* renamed from: K0 */
    private int f9806K0;

    /* renamed from: L */
    private CharSequence f9807L;

    /* renamed from: L0 */
    private int f9808L0;

    /* renamed from: M */
    private final TextView f9809M;

    /* renamed from: M0 */
    private ColorStateList f9810M0;

    /* renamed from: N */
    private boolean f9811N;

    /* renamed from: N0 */
    private int f9812N0;

    /* renamed from: O */
    private CharSequence f9813O;

    /* renamed from: O0 */
    private int f9814O0;

    /* renamed from: P */
    private boolean f9815P;

    /* renamed from: P0 */
    private int f9816P0;

    /* renamed from: Q */
    private C5888g f9817Q;

    /* renamed from: Q0 */
    private int f9818Q0;

    /* renamed from: R */
    private C5888g f9819R;

    /* renamed from: R0 */
    private int f9820R0;

    /* renamed from: S */
    private C5892k f9821S;

    /* renamed from: S0 */
    private boolean f9822S0;

    /* renamed from: T */
    private final int f9823T;

    /* renamed from: T0 */
    final C2478a f9824T0;

    /* renamed from: U */
    private int f9825U;

    /* renamed from: U0 */
    private boolean f9826U0;

    /* renamed from: V */
    private int f9827V;

    /* renamed from: V0 */
    private boolean f9828V0;

    /* renamed from: W */
    private int f9829W;

    /* renamed from: W0 */
    private ValueAnimator f9830W0;

    /* renamed from: X0 */
    private boolean f9831X0;

    /* renamed from: Y0 */
    private boolean f9832Y0;

    /* renamed from: a0 */
    private int f9833a0;

    /* renamed from: b0 */
    private int f9834b0;

    /* renamed from: c0 */
    private int f9835c0;

    /* renamed from: d0 */
    private int f9836d0;

    /* renamed from: e0 */
    private int f9837e0;

    /* renamed from: f0 */
    private final Rect f9838f0;

    /* renamed from: g0 */
    private final Rect f9839g0;

    /* renamed from: h0 */
    private final RectF f9840h0;

    /* renamed from: i0 */
    private Typeface f9841i0;

    /* renamed from: j0 */
    private final CheckableImageButton f9842j0;

    /* renamed from: k0 */
    private ColorStateList f9843k0;

    /* renamed from: l0 */
    private boolean f9844l0;

    /* renamed from: m0 */
    private PorterDuff.Mode f9845m0;

    /* renamed from: n */
    private final FrameLayout f9846n;

    /* renamed from: n0 */
    private boolean f9847n0;

    /* renamed from: o */
    private final LinearLayout f9848o;

    /* renamed from: o0 */
    private Drawable f9849o0;

    /* renamed from: p */
    private final LinearLayout f9850p;

    /* renamed from: p0 */
    private int f9851p0;

    /* renamed from: q */
    private final FrameLayout f9852q;

    /* renamed from: q0 */
    private View.OnLongClickListener f9853q0;

    /* renamed from: r */
    EditText f9854r;

    /* renamed from: r0 */
    private final LinkedHashSet<InterfaceC2516f> f9855r0;

    /* renamed from: s */
    private CharSequence f9856s;

    /* renamed from: s0 */
    private int f9857s0;

    /* renamed from: t */
    private int f9858t;

    /* renamed from: t0 */
    private final SparseArray<AbstractC2522e> f9859t0;

    /* renamed from: u */
    private int f9860u;

    /* renamed from: u0 */
    private final CheckableImageButton f9861u0;

    /* renamed from: v */
    private final C2523f f9862v;

    /* renamed from: v0 */
    private final LinkedHashSet<InterfaceC2517g> f9863v0;

    /* renamed from: w */
    boolean f9864w;

    /* renamed from: w0 */
    private ColorStateList f9865w0;

    /* renamed from: x */
    private int f9866x;

    /* renamed from: x0 */
    private boolean f9867x0;

    /* renamed from: y */
    private boolean f9868y;

    /* renamed from: y0 */
    private PorterDuff.Mode f9869y0;

    /* renamed from: z */
    private TextView f9870z;

    /* renamed from: z0 */
    private boolean f9871z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2510a();

        /* renamed from: n */
        CharSequence f9872n;

        /* renamed from: o */
        boolean f9873o;

        /* renamed from: p */
        CharSequence f9874p;

        /* renamed from: q */
        CharSequence f9875q;

        /* renamed from: r */
        CharSequence f9876r;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        /* loaded from: classes.dex */
        static class C2510a implements Parcelable.ClassLoaderCreator<SavedState> {
            C2510a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9872n) + " hint=" + ((Object) this.f9874p) + " helperText=" + ((Object) this.f9875q) + " placeholderText=" + ((Object) this.f9876r) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f9872n, parcel, i10);
            parcel.writeInt(this.f9873o ? 1 : 0);
            TextUtils.writeToParcel(this.f9874p, parcel, i10);
            TextUtils.writeToParcel(this.f9875q, parcel, i10);
            TextUtils.writeToParcel(this.f9876r, parcel, i10);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9872n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9873o = parcel.readInt() == 1;
            this.f9874p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9875q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9876r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes.dex */
    public class C2511a implements TextWatcher {
        C2511a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.m11589v0(!r0.f9832Y0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f9864w) {
                textInputLayout.m11587n0(editable.length());
            }
            if (TextInputLayout.this.f9791D) {
                TextInputLayout.this.m11573z0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes.dex */
    class RunnableC2512b implements Runnable {
        RunnableC2512b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f9861u0.performClick();
            TextInputLayout.this.f9861u0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes.dex */
    class RunnableC2513c implements Runnable {
        RunnableC2513c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f9854r.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes.dex */
    public class C2514d implements ValueAnimator.AnimatorUpdateListener {
        C2514d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f9824T0.m11324a0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes.dex */
    public static class C2515e extends C0656a {

        /* renamed from: d */
        private final TextInputLayout f9881d;

        public C2515e(TextInputLayout textInputLayout) {
            this.f9881d = textInputLayout;
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            EditText editText = this.f9881d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f9881d.getHint();
            CharSequence error = this.f9881d.getError();
            CharSequence placeholderText = this.f9881d.getPlaceholderText();
            int counterMaxLength = this.f9881d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f9881d.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.f9881d.m11577N();
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z11 ? hint.toString() : BuildConfig.FLAVOR;
            if (z10) {
                c0660c.m3568v0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                c0660c.m3568v0(charSequence);
                if (z12 && placeholderText != null) {
                    c0660c.m3568v0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c0660c.m3568v0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c0660c.m3548j0(charSequence);
                } else {
                    if (z10) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    c0660c.m3568v0(charSequence);
                }
                c0660c.m3563s0(!z10);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c0660c.m3549k0(counterMaxLength);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                c0660c.m3542f0(error);
            }
            if (editText != null) {
                editText.setLabelFor(C3524f.f14619M);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2516f {
        /* renamed from: a */
        void mo11593a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2517g {
        /* renamed from: a */
        void mo11594a(TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14512E);
    }

    /* renamed from: A */
    private boolean m11506A() {
        return this.f9811N && !TextUtils.isEmpty(this.f9813O) && (this.f9817Q instanceof C2520c);
    }

    /* renamed from: A0 */
    private void m11507A0() {
        if (this.f9854r == null) {
            return;
        }
        C0690v.m3788C0(this.f9805K, m11579Q() ? 0 : C0690v.m3801J(this.f9854r), this.f9854r.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C3522d.f14597x), this.f9854r.getCompoundPaddingBottom());
    }

    /* renamed from: B */
    private void m11508B() {
        Iterator<InterfaceC2516f> it = this.f9855r0.iterator();
        while (it.hasNext()) {
            it.next().mo11593a(this);
        }
    }

    /* renamed from: B0 */
    private void m11509B0() {
        this.f9805K.setVisibility((this.f9803J == null || m11577N()) ? 8 : 0);
        m11559r0();
    }

    /* renamed from: C */
    private void m11510C(int i10) {
        Iterator<InterfaceC2517g> it = this.f9863v0.iterator();
        while (it.hasNext()) {
            it.next().mo11594a(this, i10);
        }
    }

    /* renamed from: C0 */
    private void m11511C0(boolean z10, boolean z11) {
        int defaultColor = this.f9810M0.getDefaultColor();
        int colorForState = this.f9810M0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f9810M0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f9836d0 = colorForState2;
        } else if (z11) {
            this.f9836d0 = colorForState;
        } else {
            this.f9836d0 = defaultColor;
        }
    }

    /* renamed from: D */
    private void m11512D(Canvas canvas) {
        C5888g c5888g = this.f9819R;
        if (c5888g != null) {
            Rect bounds = c5888g.getBounds();
            bounds.top = bounds.bottom - this.f9833a0;
            this.f9819R.draw(canvas);
        }
    }

    /* renamed from: D0 */
    private void m11513D0() {
        if (this.f9854r == null) {
            return;
        }
        C0690v.m3788C0(this.f9809M, getContext().getResources().getDimensionPixelSize(C3522d.f14597x), this.f9854r.getPaddingTop(), (m11575K() || m11521L()) ? 0 : C0690v.m3799I(this.f9854r), this.f9854r.getPaddingBottom());
    }

    /* renamed from: E */
    private void m11514E(Canvas canvas) {
        if (this.f9811N) {
            this.f9824T0.m11331m(canvas);
        }
    }

    /* renamed from: E0 */
    private void m11515E0() {
        int visibility = this.f9809M.getVisibility();
        boolean z10 = (this.f9807L == null || m11577N()) ? false : true;
        this.f9809M.setVisibility(z10 ? 0 : 8);
        if (visibility != this.f9809M.getVisibility()) {
            getEndIconDelegate().mo11605c(z10);
        }
        m11559r0();
    }

    /* renamed from: F */
    private void m11516F(boolean z10) {
        ValueAnimator valueAnimator = this.f9830W0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f9830W0.cancel();
        }
        if (z10 && this.f9828V0) {
            m11586i(0.0f);
        } else {
            this.f9824T0.m11324a0(0.0f);
        }
        if (m11506A() && ((C2520c) this.f9817Q).m11611i0()) {
            m11570y();
        }
        this.f9822S0 = true;
        m11520J();
        m11509B0();
        m11515E0();
    }

    /* renamed from: G */
    private int m11517G(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.f9854r.getCompoundPaddingLeft();
        return (this.f9803J == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - this.f9805K.getMeasuredWidth()) + this.f9805K.getPaddingLeft();
    }

    /* renamed from: H */
    private int m11518H(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f9854r.getCompoundPaddingRight();
        return (this.f9803J == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (this.f9805K.getMeasuredWidth() - this.f9805K.getPaddingRight());
    }

    /* renamed from: I */
    private boolean m11519I() {
        return this.f9857s0 != 0;
    }

    /* renamed from: J */
    private void m11520J() {
        TextView textView = this.f9793E;
        if (textView == null || !this.f9791D) {
            return;
        }
        textView.setText((CharSequence) null);
        this.f9793E.setVisibility(4);
    }

    /* renamed from: L */
    private boolean m11521L() {
        return this.f9796F0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m11522P() {
        return this.f9827V == 1 && this.f9854r.getMinLines() <= 1;
    }

    /* renamed from: R */
    private int[] m11523R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    private void m11524S() {
        m11554p();
        m11530a0();
        m11574F0();
        m11546k0();
        m11540h();
        if (this.f9827V != 0) {
            m11564u0();
        }
    }

    /* renamed from: T */
    private void m11525T() {
        if (m11506A()) {
            RectF rectF = this.f9840h0;
            this.f9824T0.m11332p(rectF, this.f9854r.getWidth(), this.f9854r.getGravity());
            m11547l(rectF);
            int i10 = this.f9833a0;
            this.f9825U = i10;
            rectF.top = 0.0f;
            rectF.bottom = i10;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((C2520c) this.f9817Q).m11614o0(rectF);
        }
    }

    /* renamed from: U */
    private static void m11526U(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m11526U((ViewGroup) childAt, z10);
            }
        }
    }

    /* renamed from: X */
    private void m11527X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m11523R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = C0609a.m3263r(drawable).mutate();
        C0609a.m3260o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: Z */
    private void m11528Z() {
        TextView textView = this.f9793E;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    private void m11530a0() {
        if (m11541h0()) {
            C0690v.m3859t0(this.f9854r, this.f9817Q);
        }
    }

    /* renamed from: b0 */
    private static void m11532b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m3809P = C0690v.m3809P(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = m3809P || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(m3809P);
        checkableImageButton.setPressable(m3809P);
        checkableImageButton.setLongClickable(z10);
        C0690v.m3871z0(checkableImageButton, z11 ? 1 : 2);
    }

    /* renamed from: c0 */
    private static void m11534c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m11532b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    private static void m11536d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m11532b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private boolean m11537f0() {
        return (this.f9796F0.getVisibility() == 0 || ((m11519I() && m11575K()) || this.f9807L != null)) && this.f9850p.getMeasuredWidth() > 0;
    }

    /* renamed from: g */
    private void m11538g() {
        TextView textView = this.f9793E;
        if (textView != null) {
            this.f9846n.addView(textView);
            this.f9793E.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    private boolean m11539g0() {
        return !(getStartIconDrawable() == null && this.f9803J == null) && this.f9848o.getMeasuredWidth() > 0;
    }

    private AbstractC2522e getEndIconDelegate() {
        AbstractC2522e abstractC2522e = this.f9859t0.get(this.f9857s0);
        return abstractC2522e != null ? abstractC2522e : this.f9859t0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f9796F0.getVisibility() == 0) {
            return this.f9796F0;
        }
        if (m11519I() && m11575K()) {
            return this.f9861u0;
        }
        return null;
    }

    /* renamed from: h */
    private void m11540h() {
        if (this.f9854r == null || this.f9827V != 1) {
            return;
        }
        if (C4981c.m19411h(getContext())) {
            EditText editText = this.f9854r;
            C0690v.m3788C0(editText, C0690v.m3801J(editText), getResources().getDimensionPixelSize(C3522d.f14591r), C0690v.m3799I(this.f9854r), getResources().getDimensionPixelSize(C3522d.f14590q));
        } else if (C4981c.m19410g(getContext())) {
            EditText editText2 = this.f9854r;
            C0690v.m3788C0(editText2, C0690v.m3801J(editText2), getResources().getDimensionPixelSize(C3522d.f14589p), C0690v.m3799I(this.f9854r), getResources().getDimensionPixelSize(C3522d.f14588o));
        }
    }

    /* renamed from: h0 */
    private boolean m11541h0() {
        EditText editText = this.f9854r;
        return (editText == null || this.f9817Q == null || editText.getBackground() != null || this.f9827V == 0) ? false : true;
    }

    /* renamed from: i0 */
    private void m11542i0() {
        TextView textView = this.f9793E;
        if (textView == null || !this.f9791D) {
            return;
        }
        textView.setText(this.f9789C);
        this.f9793E.setVisibility(0);
        this.f9793E.bringToFront();
    }

    /* renamed from: j */
    private void m11543j() {
        C5888g c5888g = this.f9817Q;
        if (c5888g == null) {
            return;
        }
        c5888g.setShapeAppearanceModel(this.f9821S);
        if (m11566w()) {
            this.f9817Q.m20839b0(this.f9833a0, this.f9836d0);
        }
        int m11556q = m11556q();
        this.f9837e0 = m11556q;
        this.f9817Q.m20835X(ColorStateList.valueOf(m11556q));
        if (this.f9857s0 == 3) {
            this.f9854r.getBackground().invalidateSelf();
        }
        m11545k();
        invalidate();
    }

    /* renamed from: j0 */
    private void m11544j0(boolean z10) {
        if (z10 && getEndIconDrawable() != null) {
            Drawable mutate = C0609a.m3263r(getEndIconDrawable()).mutate();
            C0609a.m3259n(mutate, this.f9862v.m11678o());
            this.f9861u0.setImageDrawable(mutate);
            return;
        }
        m11549m();
    }

    /* renamed from: k */
    private void m11545k() {
        if (this.f9819R == null) {
            return;
        }
        if (m11568x()) {
            this.f9819R.m20835X(ColorStateList.valueOf(this.f9836d0));
        }
        invalidate();
    }

    /* renamed from: k0 */
    private void m11546k0() {
        if (this.f9827V == 1) {
            if (C4981c.m19411h(getContext())) {
                this.f9829W = getResources().getDimensionPixelSize(C3522d.f14593t);
            } else if (C4981c.m19410g(getContext())) {
                this.f9829W = getResources().getDimensionPixelSize(C3522d.f14592s);
            }
        }
    }

    /* renamed from: l */
    private void m11547l(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f9823T;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    /* renamed from: l0 */
    private void m11548l0(Rect rect) {
        C5888g c5888g = this.f9819R;
        if (c5888g != null) {
            int i10 = rect.bottom;
            c5888g.setBounds(rect.left, i10 - this.f9835c0, rect.right, i10);
        }
    }

    /* renamed from: m */
    private void m11549m() {
        m11551n(this.f9861u0, this.f9867x0, this.f9865w0, this.f9871z0, this.f9869y0);
    }

    /* renamed from: m0 */
    private void m11550m0() {
        if (this.f9870z != null) {
            EditText editText = this.f9854r;
            m11587n0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: n */
    private void m11551n(CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = C0609a.m3263r(drawable).mutate();
            if (z10) {
                C0609a.m3260o(drawable, colorStateList);
            }
            if (z11) {
                C0609a.m3261p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    private void m11552o() {
        m11551n(this.f9842j0, this.f9844l0, this.f9843k0, this.f9847n0, this.f9845m0);
    }

    /* renamed from: o0 */
    private static void m11553o0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? C3528j.f14673c : C3528j.f14672b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* renamed from: p */
    private void m11554p() {
        int i10 = this.f9827V;
        if (i10 == 0) {
            this.f9817Q = null;
            this.f9819R = null;
            return;
        }
        if (i10 == 1) {
            this.f9817Q = new C5888g(this.f9821S);
            this.f9819R = new C5888g();
        } else {
            if (i10 == 2) {
                if (this.f9811N && !(this.f9817Q instanceof C2520c)) {
                    this.f9817Q = new C2520c(this.f9821S);
                } else {
                    this.f9817Q = new C5888g(this.f9821S);
                }
                this.f9819R = null;
                return;
            }
            throw new IllegalArgumentException(this.f9827V + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: p0 */
    private void m11555p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f9870z;
        if (textView != null) {
            m11584e0(textView, this.f9868y ? this.f9785A : this.f9787B);
            if (!this.f9868y && (colorStateList2 = this.f9799H) != null) {
                this.f9870z.setTextColor(colorStateList2);
            }
            if (!this.f9868y || (colorStateList = this.f9801I) == null) {
                return;
            }
            this.f9870z.setTextColor(colorStateList);
        }
    }

    /* renamed from: q */
    private int m11556q() {
        return this.f9827V == 1 ? C4133a.m17132e(C4133a.m17131d(this, C3520b.f14526l, 0), this.f9837e0) : this.f9837e0;
    }

    /* renamed from: q0 */
    private void m11557q0() {
        if (!m11506A() || this.f9822S0 || this.f9825U == this.f9833a0) {
            return;
        }
        m11570y();
        m11525T();
    }

    /* renamed from: r */
    private Rect m11558r(Rect rect) {
        if (this.f9854r != null) {
            Rect rect2 = this.f9839g0;
            boolean z10 = C0690v.m3791E(this) == 1;
            rect2.bottom = rect.bottom;
            int i10 = this.f9827V;
            if (i10 == 1) {
                rect2.left = m11517G(rect.left, z10);
                rect2.top = rect.top + this.f9829W;
                rect2.right = m11518H(rect.right, z10);
                return rect2;
            }
            if (i10 != 2) {
                rect2.left = m11517G(rect.left, z10);
                rect2.top = getPaddingTop();
                rect2.right = m11518H(rect.right, z10);
                return rect2;
            }
            rect2.left = rect.left + this.f9854r.getPaddingLeft();
            rect2.top = rect.top - m11565v();
            rect2.right = rect.right - this.f9854r.getPaddingRight();
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r0 */
    private boolean m11559r0() {
        boolean z10;
        if (this.f9854r == null) {
            return false;
        }
        boolean z11 = true;
        if (m11539g0()) {
            int measuredWidth = this.f9848o.getMeasuredWidth() - this.f9854r.getPaddingLeft();
            if (this.f9849o0 == null || this.f9851p0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f9849o0 = colorDrawable;
                this.f9851p0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m4162a = C0707i.m4162a(this.f9854r);
            Drawable drawable = m4162a[0];
            Drawable drawable2 = this.f9849o0;
            if (drawable != drawable2) {
                C0707i.m4172k(this.f9854r, drawable2, m4162a[1], m4162a[2], m4162a[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f9849o0 != null) {
                Drawable[] m4162a2 = C0707i.m4162a(this.f9854r);
                C0707i.m4172k(this.f9854r, null, m4162a2[1], m4162a2[2], m4162a2[3]);
                this.f9849o0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (m11537f0()) {
            int measuredWidth2 = this.f9809M.getMeasuredWidth() - this.f9854r.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C0676h.m3720b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m4162a3 = C0707i.m4162a(this.f9854r);
            Drawable drawable3 = this.f9786A0;
            if (drawable3 != null && this.f9788B0 != measuredWidth2) {
                this.f9788B0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C0707i.m4172k(this.f9854r, m4162a3[0], m4162a3[1], this.f9786A0, m4162a3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f9786A0 = colorDrawable2;
                    this.f9788B0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m4162a3[2];
                Drawable drawable5 = this.f9786A0;
                if (drawable4 != drawable5) {
                    this.f9790C0 = m4162a3[2];
                    C0707i.m4172k(this.f9854r, m4162a3[0], m4162a3[1], drawable5, m4162a3[3]);
                } else {
                    z11 = z10;
                }
            }
        } else {
            if (this.f9786A0 == null) {
                return z10;
            }
            Drawable[] m4162a4 = C0707i.m4162a(this.f9854r);
            if (m4162a4[2] == this.f9786A0) {
                C0707i.m4172k(this.f9854r, m4162a4[0], m4162a4[1], this.f9790C0, m4162a4[3]);
            } else {
                z11 = z10;
            }
            this.f9786A0 = null;
        }
        return z11;
    }

    /* renamed from: s */
    private int m11560s(Rect rect, Rect rect2, float f10) {
        if (m11522P()) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f9854r.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f9854r == null) {
            if (this.f9857s0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f9854r = editText;
            setMinWidth(this.f9858t);
            setMaxWidth(this.f9860u);
            m11524S();
            setTextInputAccessibilityDelegate(new C2515e(this));
            this.f9824T0.m11330g0(this.f9854r.getTypeface());
            this.f9824T0.m11323Y(this.f9854r.getTextSize());
            int gravity = this.f9854r.getGravity();
            this.f9824T0.m11317Q((gravity & (-113)) | 48);
            this.f9824T0.m11322X(gravity);
            this.f9854r.addTextChangedListener(new C2511a());
            if (this.f9800H0 == null) {
                this.f9800H0 = this.f9854r.getHintTextColors();
            }
            if (this.f9811N) {
                if (TextUtils.isEmpty(this.f9813O)) {
                    CharSequence hint = this.f9854r.getHint();
                    this.f9856s = hint;
                    setHint(hint);
                    this.f9854r.setHint((CharSequence) null);
                }
                this.f9815P = true;
            }
            if (this.f9870z != null) {
                m11587n0(this.f9854r.getText().length());
            }
            m11588s0();
            this.f9862v.m11673e();
            this.f9848o.bringToFront();
            this.f9850p.bringToFront();
            this.f9852q.bringToFront();
            this.f9796F0.bringToFront();
            m11508B();
            m11507A0();
            m11513D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m11567w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        this.f9796F0.setVisibility(z10 ? 0 : 8);
        this.f9852q.setVisibility(z10 ? 8 : 0);
        m11513D0();
        if (m11519I()) {
            return;
        }
        m11559r0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f9813O)) {
            return;
        }
        this.f9813O = charSequence;
        this.f9824T0.m11328e0(charSequence);
        if (this.f9822S0) {
            return;
        }
        m11525T();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f9791D == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f9793E = appCompatTextView;
            appCompatTextView.setId(C3524f.f14620N);
            C0690v.m3857s0(this.f9793E, 1);
            setPlaceholderTextAppearance(this.f9797G);
            setPlaceholderTextColor(this.f9795F);
            m11538g();
        } else {
            m11528Z();
            this.f9793E = null;
        }
        this.f9791D = z10;
    }

    /* renamed from: t */
    private int m11561t(Rect rect, float f10) {
        if (m11522P()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f9854r.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    private boolean m11562t0() {
        int max;
        if (this.f9854r == null || this.f9854r.getMeasuredHeight() >= (max = Math.max(this.f9850p.getMeasuredHeight(), this.f9848o.getMeasuredHeight()))) {
            return false;
        }
        this.f9854r.setMinimumHeight(max);
        return true;
    }

    /* renamed from: u */
    private Rect m11563u(Rect rect) {
        if (this.f9854r != null) {
            Rect rect2 = this.f9839g0;
            float m11336x = this.f9824T0.m11336x();
            rect2.left = rect.left + this.f9854r.getCompoundPaddingLeft();
            rect2.top = m11561t(rect, m11336x);
            rect2.right = rect.right - this.f9854r.getCompoundPaddingRight();
            rect2.bottom = m11560s(rect, rect2, m11336x);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: u0 */
    private void m11564u0() {
        if (this.f9827V != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9846n.getLayoutParams();
            int m11565v = m11565v();
            if (m11565v != layoutParams.topMargin) {
                layoutParams.topMargin = m11565v;
                this.f9846n.requestLayout();
            }
        }
    }

    /* renamed from: v */
    private int m11565v() {
        float m11334r;
        if (!this.f9811N) {
            return 0;
        }
        int i10 = this.f9827V;
        if (i10 == 0 || i10 == 1) {
            m11334r = this.f9824T0.m11334r();
        } else {
            if (i10 != 2) {
                return 0;
            }
            m11334r = this.f9824T0.m11334r() / 2.0f;
        }
        return (int) m11334r;
    }

    /* renamed from: w */
    private boolean m11566w() {
        return this.f9827V == 2 && m11568x();
    }

    /* renamed from: w0 */
    private void m11567w0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f9854r;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f9854r;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean m11675k = this.f9862v.m11675k();
        ColorStateList colorStateList2 = this.f9800H0;
        if (colorStateList2 != null) {
            this.f9824T0.m11316P(colorStateList2);
            this.f9824T0.m11321W(this.f9800H0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f9800H0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f9820R0) : this.f9820R0;
            this.f9824T0.m11316P(ColorStateList.valueOf(colorForState));
            this.f9824T0.m11321W(ColorStateList.valueOf(colorForState));
        } else if (m11675k) {
            this.f9824T0.m11316P(this.f9862v.m11679p());
        } else if (this.f9868y && (textView = this.f9870z) != null) {
            this.f9824T0.m11316P(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f9802I0) != null) {
            this.f9824T0.m11316P(colorStateList);
        }
        if (!z12 && this.f9826U0 && (!isEnabled() || !z13)) {
            if (z11 || !this.f9822S0) {
                m11516F(z10);
                return;
            }
            return;
        }
        if (z11 || this.f9822S0) {
            m11572z(z10);
        }
    }

    /* renamed from: x */
    private boolean m11568x() {
        return this.f9833a0 > -1 && this.f9836d0 != 0;
    }

    /* renamed from: x0 */
    private void m11569x0() {
        EditText editText;
        if (this.f9793E == null || (editText = this.f9854r) == null) {
            return;
        }
        this.f9793E.setGravity(editText.getGravity());
        this.f9793E.setPadding(this.f9854r.getCompoundPaddingLeft(), this.f9854r.getCompoundPaddingTop(), this.f9854r.getCompoundPaddingRight(), this.f9854r.getCompoundPaddingBottom());
    }

    /* renamed from: y */
    private void m11570y() {
        if (m11506A()) {
            ((C2520c) this.f9817Q).m11612l0();
        }
    }

    /* renamed from: y0 */
    private void m11571y0() {
        EditText editText = this.f9854r;
        m11573z0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: z */
    private void m11572z(boolean z10) {
        ValueAnimator valueAnimator = this.f9830W0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f9830W0.cancel();
        }
        if (z10 && this.f9828V0) {
            m11586i(1.0f);
        } else {
            this.f9824T0.m11324a0(1.0f);
        }
        this.f9822S0 = false;
        if (m11506A()) {
            m11525T();
        }
        m11571y0();
        m11509B0();
        m11515E0();
    }

    /* renamed from: z0 */
    public void m11573z0(int i10) {
        if (i10 == 0 && !this.f9822S0) {
            m11542i0();
        } else {
            m11520J();
        }
    }

    /* renamed from: F0 */
    public void m11574F0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f9817Q == null || this.f9827V == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f9854r) != null && editText2.hasFocus());
        boolean z12 = isHovered() || ((editText = this.f9854r) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f9836d0 = this.f9820R0;
        } else if (this.f9862v.m11675k()) {
            if (this.f9810M0 != null) {
                m11511C0(z11, z12);
            } else {
                this.f9836d0 = this.f9862v.m11678o();
            }
        } else if (!this.f9868y || (textView = this.f9870z) == null) {
            if (z11) {
                this.f9836d0 = this.f9808L0;
            } else if (z12) {
                this.f9836d0 = this.f9806K0;
            } else {
                this.f9836d0 = this.f9804J0;
            }
        } else if (this.f9810M0 != null) {
            m11511C0(z11, z12);
        } else {
            this.f9836d0 = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.f9862v.m11685x() && this.f9862v.m11675k()) {
            z10 = true;
        }
        setErrorIconVisible(z10);
        m11581W();
        m11582Y();
        m11580V();
        if (getEndIconDelegate().mo11646d()) {
            m11544j0(this.f9862v.m11675k());
        }
        if (z11 && isEnabled()) {
            this.f9833a0 = this.f9835c0;
        } else {
            this.f9833a0 = this.f9834b0;
        }
        if (this.f9827V == 2) {
            m11557q0();
        }
        if (this.f9827V == 1) {
            if (!isEnabled()) {
                this.f9837e0 = this.f9814O0;
            } else if (z12 && !z11) {
                this.f9837e0 = this.f9818Q0;
            } else if (z11) {
                this.f9837e0 = this.f9816P0;
            } else {
                this.f9837e0 = this.f9812N0;
            }
        }
        m11543j();
    }

    /* renamed from: K */
    public boolean m11575K() {
        return this.f9852q.getVisibility() == 0 && this.f9861u0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean m11576M() {
        return this.f9862v.m11686y();
    }

    /* renamed from: N */
    final boolean m11577N() {
        return this.f9822S0;
    }

    /* renamed from: O */
    public boolean m11578O() {
        return this.f9815P;
    }

    /* renamed from: Q */
    public boolean m11579Q() {
        return this.f9842j0.getVisibility() == 0;
    }

    /* renamed from: V */
    public void m11580V() {
        m11527X(this.f9861u0, this.f9865w0);
    }

    /* renamed from: W */
    public void m11581W() {
        m11527X(this.f9796F0, this.f9798G0);
    }

    /* renamed from: Y */
    public void m11582Y() {
        m11527X(this.f9842j0, this.f9843k0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f9846n.addView(view, layoutParams2);
            this.f9846n.setLayoutParams(layoutParams);
            m11564u0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f9854r;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f9856s != null) {
            boolean z10 = this.f9815P;
            this.f9815P = false;
            CharSequence hint = editText.getHint();
            this.f9854r.setHint(this.f9856s);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f9854r.setHint(hint);
                this.f9815P = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f9846n.getChildCount());
        for (int i11 = 0; i11 < this.f9846n.getChildCount(); i11++) {
            View childAt = this.f9846n.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f9854r) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f9832Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f9832Y0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m11514E(canvas);
        m11512D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f9831X0) {
            return;
        }
        this.f9831X0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C2478a c2478a = this.f9824T0;
        boolean m11327d0 = c2478a != null ? c2478a.m11327d0(drawableState) | false : false;
        if (this.f9854r != null) {
            m11589v0(C0690v.m3814U(this) && isEnabled());
        }
        m11588s0();
        m11574F0();
        if (m11327d0) {
            invalidate();
        }
        this.f9831X0 = false;
    }

    /* renamed from: e */
    public void m11583e(InterfaceC2516f interfaceC2516f) {
        this.f9855r0.add(interfaceC2516f);
        if (this.f9854r != null) {
            interfaceC2516f.mo11593a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L28;
     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11584e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C0707i.m4177p(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = p111i4.C3529k.f14691a
            androidx.core.widget.C0707i.m4177p(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = p111i4.C3521c.f14541a
            int r4 = androidx.core.content.C0587a.m3029c(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m11584e0(android.widget.TextView, int):void");
    }

    /* renamed from: f */
    public void m11585f(InterfaceC2517g interfaceC2517g) {
        this.f9863v0.add(interfaceC2517g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f9854r;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m11565v();
        }
        return super.getBaseline();
    }

    public C5888g getBoxBackground() {
        int i10 = this.f9827V;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.f9817Q;
    }

    public int getBoxBackgroundColor() {
        return this.f9837e0;
    }

    public int getBoxBackgroundMode() {
        return this.f9827V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f9817Q.m20846s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f9817Q.m20847t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f9817Q.m20825G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f9817Q.m20824F();
    }

    public int getBoxStrokeColor() {
        return this.f9808L0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f9810M0;
    }

    public int getBoxStrokeWidth() {
        return this.f9834b0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f9835c0;
    }

    public int getCounterMaxLength() {
        return this.f9866x;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f9864w && this.f9868y && (textView = this.f9870z) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f9799H;
    }

    public ColorStateList getCounterTextColor() {
        return this.f9799H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f9800H0;
    }

    public EditText getEditText() {
        return this.f9854r;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9861u0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9861u0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f9857s0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f9861u0;
    }

    public CharSequence getError() {
        if (this.f9862v.m11685x()) {
            return this.f9862v.m11677n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f9862v.m11676m();
    }

    public int getErrorCurrentTextColors() {
        return this.f9862v.m11678o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f9796F0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f9862v.m11678o();
    }

    public CharSequence getHelperText() {
        if (this.f9862v.m11686y()) {
            return this.f9862v.m11680q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f9862v.m11681r();
    }

    public CharSequence getHint() {
        if (this.f9811N) {
            return this.f9813O;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f9824T0.m11334r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f9824T0.m11335u();
    }

    public ColorStateList getHintTextColor() {
        return this.f9802I0;
    }

    public int getMaxWidth() {
        return this.f9860u;
    }

    public int getMinWidth() {
        return this.f9858t;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9861u0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9861u0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f9791D) {
            return this.f9789C;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f9797G;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f9795F;
    }

    public CharSequence getPrefixText() {
        return this.f9803J;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f9805K.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f9805K;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f9842j0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f9842j0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f9807L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f9809M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f9809M;
    }

    public Typeface getTypeface() {
        return this.f9841i0;
    }

    /* renamed from: i */
    void m11586i(float f10) {
        if (this.f9824T0.m11337y() == f10) {
            return;
        }
        if (this.f9830W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9830W0 = valueAnimator;
            valueAnimator.setInterpolator(C3600a.f15224b);
            this.f9830W0.setDuration(167L);
            this.f9830W0.addUpdateListener(new C2514d());
        }
        this.f9830W0.setFloatValues(this.f9824T0.m11337y(), f10);
        this.f9830W0.start();
    }

    /* renamed from: n0 */
    void m11587n0(int i10) {
        boolean z10 = this.f9868y;
        int i11 = this.f9866x;
        if (i11 == -1) {
            this.f9870z.setText(String.valueOf(i10));
            this.f9870z.setContentDescription(null);
            this.f9868y = false;
        } else {
            this.f9868y = i10 > i11;
            m11553o0(getContext(), this.f9870z, i10, this.f9866x, this.f9868y);
            if (z10 != this.f9868y) {
                m11555p0();
            }
            this.f9870z.setText(C0642a.m3411c().m3418j(getContext().getString(C3528j.f14674d, Integer.valueOf(i10), Integer.valueOf(this.f9866x))));
        }
        if (this.f9854r == null || z10 == this.f9868y) {
            return;
        }
        m11589v0(false);
        m11574F0();
        m11588s0();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f9854r;
        if (editText != null) {
            Rect rect = this.f9838f0;
            C2479b.m11339a(this, editText, rect);
            m11548l0(rect);
            if (this.f9811N) {
                this.f9824T0.m11323Y(this.f9854r.getTextSize());
                int gravity = this.f9854r.getGravity();
                this.f9824T0.m11317Q((gravity & (-113)) | 48);
                this.f9824T0.m11322X(gravity);
                this.f9824T0.m11314M(m11558r(rect));
                this.f9824T0.m11320U(m11563u(rect));
                this.f9824T0.m11311I();
                if (!m11506A() || this.f9822S0) {
                    return;
                }
                m11525T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean m11562t0 = m11562t0();
        boolean m11559r0 = m11559r0();
        if (m11562t0 || m11559r0) {
            this.f9854r.post(new RunnableC2513c());
        }
        m11569x0();
        m11507A0();
        m11513D0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f9872n);
        if (savedState.f9873o) {
            this.f9861u0.post(new RunnableC2512b());
        }
        setHint(savedState.f9874p);
        setHelperText(savedState.f9875q);
        setPlaceholderText(savedState.f9876r);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f9862v.m11675k()) {
            savedState.f9872n = getError();
        }
        savedState.f9873o = m11519I() && this.f9861u0.isChecked();
        savedState.f9874p = getHint();
        savedState.f9875q = getHelperText();
        savedState.f9876r = getPlaceholderText();
        return savedState;
    }

    /* renamed from: s0 */
    public void m11588s0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f9854r;
        if (editText == null || this.f9827V != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (this.f9862v.m11675k()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f9862v.m11678o(), PorterDuff.Mode.SRC_IN));
        } else if (this.f9868y && (textView = this.f9870z) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C0609a.m3248c(background);
            this.f9854r.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f9837e0 != i10) {
            this.f9837e0 = i10;
            this.f9812N0 = i10;
            this.f9816P0 = i10;
            this.f9818Q0 = i10;
            m11543j();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(C0587a.m3029c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f9812N0 = defaultColor;
        this.f9837e0 = defaultColor;
        this.f9814O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f9816P0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f9818Q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m11543j();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f9827V) {
            return;
        }
        this.f9827V = i10;
        if (this.f9854r != null) {
            m11524S();
        }
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f9808L0 != i10) {
            this.f9808L0 = i10;
            m11574F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f9804J0 = colorStateList.getDefaultColor();
            this.f9820R0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f9806K0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f9808L0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f9808L0 != colorStateList.getDefaultColor()) {
            this.f9808L0 = colorStateList.getDefaultColor();
        }
        m11574F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f9810M0 != colorStateList) {
            this.f9810M0 = colorStateList;
            m11574F0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f9834b0 = i10;
        m11574F0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f9835c0 = i10;
        m11574F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f9864w != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f9870z = appCompatTextView;
                appCompatTextView.setId(C3524f.f14617K);
                Typeface typeface = this.f9841i0;
                if (typeface != null) {
                    this.f9870z.setTypeface(typeface);
                }
                this.f9870z.setMaxLines(1);
                this.f9862v.m11672d(this.f9870z, 2);
                C0676h.m3722d((ViewGroup.MarginLayoutParams) this.f9870z.getLayoutParams(), getResources().getDimensionPixelOffset(C3522d.f14574a0));
                m11555p0();
                m11550m0();
            } else {
                this.f9862v.m11687z(this.f9870z, 2);
                this.f9870z = null;
            }
            this.f9864w = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f9866x != i10) {
            if (i10 > 0) {
                this.f9866x = i10;
            } else {
                this.f9866x = -1;
            }
            if (this.f9864w) {
                m11550m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f9785A != i10) {
            this.f9785A = i10;
            m11555p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f9801I != colorStateList) {
            this.f9801I = colorStateList;
            m11555p0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f9787B != i10) {
            this.f9787B = i10;
            m11555p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f9799H != colorStateList) {
            this.f9799H = colorStateList;
            m11555p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f9800H0 = colorStateList;
        this.f9802I0 = colorStateList;
        if (this.f9854r != null) {
            m11589v0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m11526U(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f9861u0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f9861u0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? C3121a.m13770d(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) {
        int i11 = this.f9857s0;
        this.f9857s0 = i10;
        m11510C(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().mo11645b(this.f9827V)) {
            getEndIconDelegate().mo11604a();
            m11549m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f9827V + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m11534c0(this.f9861u0, onClickListener, this.f9792D0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9792D0 = onLongClickListener;
        m11536d0(this.f9861u0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f9865w0 != colorStateList) {
            this.f9865w0 = colorStateList;
            this.f9867x0 = true;
            m11549m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f9869y0 != mode) {
            this.f9869y0 = mode;
            this.f9871z0 = true;
            m11549m();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (m11575K() != z10) {
            this.f9861u0.setVisibility(z10 ? 0 : 8);
            m11513D0();
            m11559r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f9862v.m11685x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f9862v.m11670M(charSequence);
        } else {
            this.f9862v.m11682t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f9862v.m11662B(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f9862v.m11663C(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? C3121a.m13770d(getContext(), i10) : null);
        m11581W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m11534c0(this.f9796F0, onClickListener, this.f9794E0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9794E0 = onLongClickListener;
        m11536d0(this.f9796F0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f9798G0 = colorStateList;
        Drawable drawable = this.f9796F0.getDrawable();
        if (drawable != null) {
            drawable = C0609a.m3263r(drawable).mutate();
            C0609a.m3260o(drawable, colorStateList);
        }
        if (this.f9796F0.getDrawable() != drawable) {
            this.f9796F0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9796F0.getDrawable();
        if (drawable != null) {
            drawable = C0609a.m3263r(drawable).mutate();
            C0609a.m3261p(drawable, mode);
        }
        if (this.f9796F0.getDrawable() != drawable) {
            this.f9796F0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.f9862v.m11664D(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f9862v.m11665E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f9826U0 != z10) {
            this.f9826U0 = z10;
            m11589v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m11576M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m11576M()) {
                setHelperTextEnabled(true);
            }
            this.f9862v.m11671N(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f9862v.m11668H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f9862v.m11667G(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f9862v.m11666F(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f9811N) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f9828V0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f9811N) {
            this.f9811N = z10;
            if (!z10) {
                this.f9815P = false;
                if (!TextUtils.isEmpty(this.f9813O) && TextUtils.isEmpty(this.f9854r.getHint())) {
                    this.f9854r.setHint(this.f9813O);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f9854r.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f9813O)) {
                        setHint(hint);
                    }
                    this.f9854r.setHint((CharSequence) null);
                }
                this.f9815P = true;
            }
            if (this.f9854r != null) {
                m11564u0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f9824T0.m11315N(i10);
        this.f9802I0 = this.f9824T0.m11333q();
        if (this.f9854r != null) {
            m11589v0(false);
            m11564u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f9802I0 != colorStateList) {
            if (this.f9800H0 == null) {
                this.f9824T0.m11316P(colorStateList);
            }
            this.f9802I0 = colorStateList;
            if (this.f9854r != null) {
                m11589v0(false);
            }
        }
    }

    public void setMaxWidth(int i10) {
        this.f9860u = i10;
        EditText editText = this.f9854r;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinWidth(int i10) {
        this.f9858t = i10;
        EditText editText = this.f9854r;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? C3121a.m13770d(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.f9857s0 != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f9865w0 = colorStateList;
        this.f9867x0 = true;
        m11549m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f9869y0 = mode;
        this.f9871z0 = true;
        m11549m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f9791D && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f9791D) {
                setPlaceholderTextEnabled(true);
            }
            this.f9789C = charSequence;
        }
        m11571y0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f9797G = i10;
        TextView textView = this.f9793E;
        if (textView != null) {
            C0707i.m4177p(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f9795F != colorStateList) {
            this.f9795F = colorStateList;
            TextView textView = this.f9793E;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f9803J = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f9805K.setText(charSequence);
        m11509B0();
    }

    public void setPrefixTextAppearance(int i10) {
        C0707i.m4177p(this.f9805K, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f9805K.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.f9842j0.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C3121a.m13770d(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m11534c0(this.f9842j0, onClickListener, this.f9853q0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9853q0 = onLongClickListener;
        m11536d0(this.f9842j0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f9843k0 != colorStateList) {
            this.f9843k0 = colorStateList;
            this.f9844l0 = true;
            m11552o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f9845m0 != mode) {
            this.f9845m0 = mode;
            this.f9847n0 = true;
            m11552o();
        }
    }

    public void setStartIconVisible(boolean z10) {
        if (m11579Q() != z10) {
            this.f9842j0.setVisibility(z10 ? 0 : 8);
            m11507A0();
            m11559r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f9807L = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f9809M.setText(charSequence);
        m11515E0();
    }

    public void setSuffixTextAppearance(int i10) {
        C0707i.m4177p(this.f9809M, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f9809M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2515e c2515e) {
        EditText editText = this.f9854r;
        if (editText != null) {
            C0690v.m3853q0(editText, c2515e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f9841i0) {
            this.f9841i0 = typeface;
            this.f9824T0.m11330g0(typeface);
            this.f9862v.m11669J(typeface);
            TextView textView = this.f9870z;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: v0 */
    public void m11589v0(boolean z10) {
        m11567w0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f9861u0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f9861u0.setImageDrawable(drawable);
        m11580V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f9842j0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f9842j0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m11582Y();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f9796F0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f9862v.m11685x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9861u0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9861u0.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
