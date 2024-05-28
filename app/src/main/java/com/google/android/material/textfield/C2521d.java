package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import com.google.android.material.internal.C2486i;
import com.google.android.material.textfield.TextInputLayout;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3522d;
import p111i4.C3523e;
import p111i4.C3528j;
import p125j4.C3600a;
import p186o4.C4133a;
import p310y4.C5888g;
import p310y4.C5892k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes.dex */
public class C2521d extends AbstractC2522e {

    /* renamed from: q */
    private static final boolean f9902q = true;

    /* renamed from: d */
    private final TextWatcher f9903d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f9904e;

    /* renamed from: f */
    private final TextInputLayout.C2515e f9905f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC2516f f9906g;

    /* renamed from: h */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.InterfaceC2517g f9907h;

    /* renamed from: i */
    private boolean f9908i;

    /* renamed from: j */
    private boolean f9909j;

    /* renamed from: k */
    private long f9910k;

    /* renamed from: l */
    private StateListDrawable f9911l;

    /* renamed from: m */
    private C5888g f9912m;

    /* renamed from: n */
    private AccessibilityManager f9913n;

    /* renamed from: o */
    private ValueAnimator f9914o;

    /* renamed from: p */
    private ValueAnimator f9915p;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* loaded from: classes.dex */
    class a extends C2486i {

        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC6045a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ AutoCompleteTextView f9917n;

            RunnableC6045a(AutoCompleteTextView autoCompleteTextView) {
                this.f9917n = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f9917n.isPopupShowing();
                C2521d.this.m11619E(isPopupShowing);
                C2521d.this.f9908i = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.C2486i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView m11643y = C2521d.m11643y(C2521d.this.f9931a.getEditText());
            if (C2521d.this.f9913n.isTouchExplorationEnabled() && C2521d.m11618D(m11643y) && !C2521d.this.f9933c.hasFocus()) {
                m11643y.dismissDropDown();
            }
            m11643y.post(new RunnableC6045a(m11643y));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$b */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2521d.this.f9933c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* loaded from: classes.dex */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2521d.this.f9931a.setEndIconActivated(z10);
            if (z10) {
                return;
            }
            C2521d.this.m11619E(false);
            C2521d.this.f9908i = false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes.dex */
    class d extends TextInputLayout.C2515e {
        d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C2515e, androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            if (!C2521d.m11618D(C2521d.this.f9931a.getEditText())) {
                c0660c.m3532Z(Spinner.class.getName());
            }
            if (c0660c.m3522K()) {
                c0660c.m3548j0(null);
            }
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: h */
        public void mo3485h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3485h(view, accessibilityEvent);
            AutoCompleteTextView m11643y = C2521d.m11643y(C2521d.this.f9931a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C2521d.this.f9913n.isTouchExplorationEnabled() && !C2521d.m11618D(C2521d.this.f9931a.getEditText())) {
                C2521d.this.m11622H(m11643y);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* loaded from: classes.dex */
    class e implements TextInputLayout.InterfaceC2516f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2516f
        /* renamed from: a */
        public void mo11593a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m11643y = C2521d.m11643y(textInputLayout.getEditText());
            C2521d.this.m11620F(m11643y);
            C2521d.this.m11640v(m11643y);
            C2521d.this.m11621G(m11643y);
            m11643y.setThreshold(0);
            m11643y.removeTextChangedListener(C2521d.this.f9903d);
            m11643y.addTextChangedListener(C2521d.this.f9903d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C2521d.m11618D(m11643y)) {
                C0690v.m3871z0(C2521d.this.f9933c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C2521d.this.f9905f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* loaded from: classes.dex */
    class f implements TextInputLayout.InterfaceC2517g {

        /* renamed from: com.google.android.material.textfield.d$f$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ AutoCompleteTextView f9924n;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f9924n = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9924n.removeTextChangedListener(C2521d.this.f9903d);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2517g
        /* renamed from: a */
        public void mo11594a(TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i10 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == C2521d.this.f9904e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (C2521d.f9902q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* loaded from: classes.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2521d.this.m11622H((AutoCompleteTextView) C2521d.this.f9931a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$h */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: n */
        final /* synthetic */ AutoCompleteTextView f9927n;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f9927n = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C2521d.this.m11617C()) {
                    C2521d.this.f9908i = false;
                }
                C2521d.this.m11622H(this.f9927n);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$i */
    /* loaded from: classes.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C2521d.this.f9908i = true;
            C2521d.this.f9910k = System.currentTimeMillis();
            C2521d.this.m11619E(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$j */
    /* loaded from: classes.dex */
    public class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2521d c2521d = C2521d.this;
            c2521d.f9933c.setChecked(c2521d.f9909j);
            C2521d.this.f9915p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2521d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9903d = new a();
        this.f9904e = new c();
        this.f9905f = new d(this.f9931a);
        this.f9906g = new e();
        this.f9907h = new f();
        this.f9908i = false;
        this.f9909j = false;
        this.f9910k = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private C5888g m11615A(float f10, float f11, float f12, int i10) {
        C5892k m20906m = C5892k.m20862a().m20900A(f10).m20904E(f10).m20911s(f11).m20915w(f11).m20906m();
        C5888g m20814m = C5888g.m20814m(this.f9932b, f12);
        m20814m.setShapeAppearanceModel(m20906m);
        m20814m.m20837Z(0, i10, 0, i10);
        return m20814m;
    }

    /* renamed from: B */
    private void m11616B() {
        this.f9915p = m11644z(67, 0.0f, 1.0f);
        ValueAnimator m11644z = m11644z(50, 1.0f, 0.0f);
        this.f9914o = m11644z;
        m11644z.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public boolean m11617C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f9910k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m11618D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m11619E(boolean z10) {
        if (this.f9909j != z10) {
            this.f9909j = z10;
            this.f9915p.cancel();
            this.f9914o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m11620F(AutoCompleteTextView autoCompleteTextView) {
        if (f9902q) {
            int boxBackgroundMode = this.f9931a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f9912m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f9911l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public void m11621G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f9904e);
        if (f9902q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m11622H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m11617C()) {
            this.f9908i = false;
        }
        if (!this.f9908i) {
            if (f9902q) {
                m11619E(!this.f9909j);
            } else {
                this.f9909j = !this.f9909j;
                this.f9933c.toggle();
            }
            if (this.f9909j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f9908i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m11640v(AutoCompleteTextView autoCompleteTextView) {
        if (m11618D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f9931a.getBoxBackgroundMode();
        C5888g boxBackground = this.f9931a.getBoxBackground();
        int m17130c = C4133a.m17130c(autoCompleteTextView, C3520b.f14522h);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            m11642x(autoCompleteTextView, m17130c, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m11641w(autoCompleteTextView, m17130c, iArr, boxBackground);
        }
    }

    /* renamed from: w */
    private void m11641w(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, C5888g c5888g) {
        int boxBackgroundColor = this.f9931a.getBoxBackgroundColor();
        int[] iArr2 = {C4133a.m17133f(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f9902q) {
            C0690v.m3859t0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c5888g, c5888g));
            return;
        }
        C5888g c5888g2 = new C5888g(c5888g.m20822C());
        c5888g2.m20835X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c5888g, c5888g2});
        int m3801J = C0690v.m3801J(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m3799I = C0690v.m3799I(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0690v.m3859t0(autoCompleteTextView, layerDrawable);
        C0690v.m3788C0(autoCompleteTextView, m3801J, paddingTop, m3799I, paddingBottom);
    }

    /* renamed from: x */
    private void m11642x(AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, C5888g c5888g) {
        LayerDrawable layerDrawable;
        int m17130c = C4133a.m17130c(autoCompleteTextView, C3520b.f14526l);
        C5888g c5888g2 = new C5888g(c5888g.m20822C());
        int m17133f = C4133a.m17133f(i10, m17130c, 0.1f);
        c5888g2.m20835X(new ColorStateList(iArr, new int[]{m17133f, 0}));
        if (f9902q) {
            c5888g2.setTint(m17130c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m17133f, m17130c});
            C5888g c5888g3 = new C5888g(c5888g.m20822C());
            c5888g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c5888g2, c5888g3), c5888g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c5888g2, c5888g});
        }
        C0690v.m3859t0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m11643y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m11644z(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C3600a.f15223a);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2522e
    /* renamed from: a */
    public void mo11604a() {
        float dimensionPixelOffset = this.f9932b.getResources().getDimensionPixelOffset(C3522d.f14568V);
        float dimensionPixelOffset2 = this.f9932b.getResources().getDimensionPixelOffset(C3522d.f14565S);
        int dimensionPixelOffset3 = this.f9932b.getResources().getDimensionPixelOffset(C3522d.f14566T);
        C5888g m11615A = m11615A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C5888g m11615A2 = m11615A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f9912m = m11615A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f9911l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, m11615A);
        this.f9911l.addState(new int[0], m11615A2);
        this.f9931a.setEndIconDrawable(C3121a.m13770d(this.f9932b, f9902q ? C3523e.f14603d : C3523e.f14604e));
        TextInputLayout textInputLayout = this.f9931a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C3528j.f14677g));
        this.f9931a.setEndIconOnClickListener(new g());
        this.f9931a.m11583e(this.f9906g);
        this.f9931a.m11585f(this.f9907h);
        m11616B();
        this.f9913n = (AccessibilityManager) this.f9932b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2522e
    /* renamed from: b */
    public boolean mo11645b(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2522e
    /* renamed from: d */
    public boolean mo11646d() {
        return true;
    }
}
