package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p066f.C3121a;
import p111i4.C3523e;
import p111i4.C3528j;
import p125j4.C3600a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public class C2518a extends AbstractC2522e {

    /* renamed from: d */
    private final TextWatcher f9882d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f9883e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC2516f f9884f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC2517g f9885g;

    /* renamed from: h */
    private AnimatorSet f9886h;

    /* renamed from: i */
    private ValueAnimator f9887i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C2518a.this.f9931a.getSuffixText() != null) {
                return;
            }
            C2518a c2518a = C2518a.this;
            c2518a.m11599i(c2518a.f9931a.hasFocus() && C2518a.m11602l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            C2518a.this.m11599i((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z10);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes.dex */
    class c implements TextInputLayout.InterfaceC2516f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2516f
        /* renamed from: a */
        public void mo11593a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C2518a.m11602l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C2518a.this.f9883e);
            editText.removeTextChangedListener(C2518a.this.f9882d);
            editText.addTextChangedListener(C2518a.this.f9882d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes.dex */
    class d implements TextInputLayout.InterfaceC2517g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ EditText f9892n;

            a(EditText editText) {
                this.f9892n = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9892n.removeTextChangedListener(C2518a.this.f9882d);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2517g
        /* renamed from: a */
        public void mo11594a(TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i10 != 2) {
                return;
            }
            editText.post(new a(editText));
            if (editText.getOnFocusChangeListener() == C2518a.this.f9883e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C2518a.this.f9931a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C2518a.this.f9931a.m11580V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2518a.this.f9931a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2518a.this.f9931a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: classes.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2518a.this.f9933c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2518a.this.f9933c.setScaleX(floatValue);
            C2518a.this.f9933c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2518a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f9882d = new a();
        this.f9883e = new b();
        this.f9884f = new c();
        this.f9885g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m11599i(boolean z10) {
        boolean z11 = this.f9931a.m11575K() == z10;
        if (z10 && !this.f9886h.isRunning()) {
            this.f9887i.cancel();
            this.f9886h.start();
            if (z11) {
                this.f9886h.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f9886h.cancel();
        this.f9887i.start();
        if (z11) {
            this.f9887i.end();
        }
    }

    /* renamed from: j */
    private ValueAnimator m11600j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C3600a.f15223a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m11601k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C3600a.f15226d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m11602l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m11603m() {
        ValueAnimator m11601k = m11601k();
        ValueAnimator m11600j = m11600j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9886h = animatorSet;
        animatorSet.playTogether(m11601k, m11600j);
        this.f9886h.addListener(new f());
        ValueAnimator m11600j2 = m11600j(1.0f, 0.0f);
        this.f9887i = m11600j2;
        m11600j2.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2522e
    /* renamed from: a */
    public void mo11604a() {
        this.f9931a.setEndIconDrawable(C3121a.m13770d(this.f9932b, C3523e.f14605f));
        TextInputLayout textInputLayout = this.f9931a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C3528j.f14675e));
        this.f9931a.setEndIconOnClickListener(new e());
        this.f9931a.m11583e(this.f9884f);
        this.f9931a.m11585f(this.f9885g);
        m11603m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC2522e
    /* renamed from: c */
    public void mo11605c(boolean z10) {
        if (this.f9931a.getSuffixText() == null) {
            return;
        }
        m11599i(z10);
    }
}
