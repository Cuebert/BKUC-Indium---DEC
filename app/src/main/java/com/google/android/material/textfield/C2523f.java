package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C0690v;
import androidx.core.widget.C0707i;
import java.util.ArrayList;
import java.util.List;
import p111i4.C3522d;
import p111i4.C3524f;
import p125j4.C3600a;
import p125j4.C3601b;
import p272v4.C4981c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes.dex */
public final class C2523f {

    /* renamed from: a */
    private final Context f9934a;

    /* renamed from: b */
    private final TextInputLayout f9935b;

    /* renamed from: c */
    private LinearLayout f9936c;

    /* renamed from: d */
    private int f9937d;

    /* renamed from: e */
    private FrameLayout f9938e;

    /* renamed from: f */
    private Animator f9939f;

    /* renamed from: g */
    private final float f9940g;

    /* renamed from: h */
    private int f9941h;

    /* renamed from: i */
    private int f9942i;

    /* renamed from: j */
    private CharSequence f9943j;

    /* renamed from: k */
    private boolean f9944k;

    /* renamed from: l */
    private TextView f9945l;

    /* renamed from: m */
    private CharSequence f9946m;

    /* renamed from: n */
    private int f9947n;

    /* renamed from: o */
    private ColorStateList f9948o;

    /* renamed from: p */
    private CharSequence f9949p;

    /* renamed from: q */
    private boolean f9950q;

    /* renamed from: r */
    private TextView f9951r;

    /* renamed from: s */
    private int f9952s;

    /* renamed from: t */
    private ColorStateList f9953t;

    /* renamed from: u */
    private Typeface f9954u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.f$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f9955a;

        /* renamed from: b */
        final /* synthetic */ TextView f9956b;

        /* renamed from: c */
        final /* synthetic */ int f9957c;

        /* renamed from: d */
        final /* synthetic */ TextView f9958d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f9955a = i10;
            this.f9956b = textView;
            this.f9957c = i11;
            this.f9958d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2523f.this.f9941h = this.f9955a;
            C2523f.this.f9939f = null;
            TextView textView = this.f9956b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f9957c == 1 && C2523f.this.f9945l != null) {
                    C2523f.this.f9945l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f9958d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f9958d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f9958d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2523f(TextInputLayout textInputLayout) {
        this.f9934a = textInputLayout.getContext();
        this.f9935b = textInputLayout;
        this.f9940g = r0.getResources().getDimensionPixelSize(C3522d.f14583j);
    }

    /* renamed from: A */
    private void m11647A(int i10, int i11) {
        TextView m11659l;
        TextView m11659l2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m11659l2 = m11659l(i11)) != null) {
            m11659l2.setVisibility(0);
            m11659l2.setAlpha(1.0f);
        }
        if (i10 != 0 && (m11659l = m11659l(i10)) != null) {
            m11659l.setVisibility(4);
            if (i10 == 1) {
                m11659l.setText((CharSequence) null);
            }
        }
        this.f9941h = i11;
    }

    /* renamed from: I */
    private void m11648I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m11649K(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m11650L(TextView textView, CharSequence charSequence) {
        return C0690v.m3814U(this.f9935b) && this.f9935b.isEnabled() && !(this.f9942i == this.f9941h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: O */
    private void m11651O(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f9939f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m11656h(arrayList, this.f9950q, this.f9951r, 2, i10, i11);
            m11656h(arrayList, this.f9944k, this.f9945l, 1, i10, i11);
            C3601b.m15420a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m11659l(i10), i10, m11659l(i11)));
            animatorSet.start();
        } else {
            m11647A(i10, i11);
        }
        this.f9935b.m11588s0();
        this.f9935b.m11589v0(z10);
        this.f9935b.m11574F0();
    }

    /* renamed from: f */
    private boolean m11655f() {
        return (this.f9936c == null || this.f9935b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m11656h(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            list.add(m11657i(textView, i12 == i10));
            if (i12 == i10) {
                list.add(m11658j(textView));
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m11657i(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C3600a.f15223a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m11658j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f9940g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C3600a.f15226d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m11659l(int i10) {
        if (i10 == 1) {
            return this.f9945l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f9951r;
    }

    /* renamed from: s */
    private int m11660s(boolean z10, int i10, int i11) {
        return z10 ? this.f9934a.getResources().getDimensionPixelSize(i10) : i11;
    }

    /* renamed from: v */
    private boolean m11661v(int i10) {
        return (i10 != 1 || this.f9945l == null || TextUtils.isEmpty(this.f9943j)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m11662B(CharSequence charSequence) {
        this.f9946m = charSequence;
        TextView textView = this.f9945l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m11663C(boolean z10) {
        if (this.f9944k == z10) {
            return;
        }
        m11674g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f9934a);
            this.f9945l = appCompatTextView;
            appCompatTextView.setId(C3524f.f14618L);
            this.f9945l.setTextAlignment(5);
            Typeface typeface = this.f9954u;
            if (typeface != null) {
                this.f9945l.setTypeface(typeface);
            }
            m11664D(this.f9947n);
            m11665E(this.f9948o);
            m11662B(this.f9946m);
            this.f9945l.setVisibility(4);
            C0690v.m3857s0(this.f9945l, 1);
            m11672d(this.f9945l, 0);
        } else {
            m11682t();
            m11687z(this.f9945l, 0);
            this.f9945l = null;
            this.f9935b.m11588s0();
            this.f9935b.m11574F0();
        }
        this.f9944k = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m11664D(int i10) {
        this.f9947n = i10;
        TextView textView = this.f9945l;
        if (textView != null) {
            this.f9935b.m11584e0(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m11665E(ColorStateList colorStateList) {
        this.f9948o = colorStateList;
        TextView textView = this.f9945l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public void m11666F(int i10) {
        this.f9952s = i10;
        TextView textView = this.f9951r;
        if (textView != null) {
            C0707i.m4177p(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m11667G(boolean z10) {
        if (this.f9950q == z10) {
            return;
        }
        m11674g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f9934a);
            this.f9951r = appCompatTextView;
            appCompatTextView.setId(C3524f.f14619M);
            this.f9951r.setTextAlignment(5);
            Typeface typeface = this.f9954u;
            if (typeface != null) {
                this.f9951r.setTypeface(typeface);
            }
            this.f9951r.setVisibility(4);
            C0690v.m3857s0(this.f9951r, 1);
            m11666F(this.f9952s);
            m11668H(this.f9953t);
            m11672d(this.f9951r, 1);
        } else {
            m11683u();
            m11687z(this.f9951r, 1);
            this.f9951r = null;
            this.f9935b.m11588s0();
            this.f9935b.m11574F0();
        }
        this.f9950q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m11668H(ColorStateList colorStateList) {
        this.f9953t = colorStateList;
        TextView textView = this.f9951r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m11669J(Typeface typeface) {
        if (typeface != this.f9954u) {
            this.f9954u = typeface;
            m11648I(this.f9945l, typeface);
            m11648I(this.f9951r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m11670M(CharSequence charSequence) {
        m11674g();
        this.f9943j = charSequence;
        this.f9945l.setText(charSequence);
        int i10 = this.f9941h;
        if (i10 != 1) {
            this.f9942i = 1;
        }
        m11651O(i10, this.f9942i, m11650L(this.f9945l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m11671N(CharSequence charSequence) {
        m11674g();
        this.f9949p = charSequence;
        this.f9951r.setText(charSequence);
        int i10 = this.f9941h;
        if (i10 != 2) {
            this.f9942i = 2;
        }
        m11651O(i10, this.f9942i, m11650L(this.f9951r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m11672d(TextView textView, int i10) {
        if (this.f9936c == null && this.f9938e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f9934a);
            this.f9936c = linearLayout;
            linearLayout.setOrientation(0);
            this.f9935b.addView(this.f9936c, -1, -2);
            this.f9938e = new FrameLayout(this.f9934a);
            this.f9936c.addView(this.f9938e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f9935b.getEditText() != null) {
                m11673e();
            }
        }
        if (m11684w(i10)) {
            this.f9938e.setVisibility(0);
            this.f9938e.addView(textView);
        } else {
            this.f9936c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f9936c.setVisibility(0);
        this.f9937d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m11673e() {
        if (m11655f()) {
            EditText editText = this.f9935b.getEditText();
            boolean m19410g = C4981c.m19410g(this.f9934a);
            LinearLayout linearLayout = this.f9936c;
            int i10 = C3522d.f14595v;
            C0690v.m3788C0(linearLayout, m11660s(m19410g, i10, C0690v.m3801J(editText)), m11660s(m19410g, C3522d.f14596w, this.f9934a.getResources().getDimensionPixelSize(C3522d.f14594u)), m11660s(m19410g, i10, C0690v.m3799I(editText)), 0);
        }
    }

    /* renamed from: g */
    void m11674g() {
        Animator animator = this.f9939f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m11675k() {
        return m11661v(this.f9942i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence m11676m() {
        return this.f9946m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence m11677n() {
        return this.f9943j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m11678o() {
        TextView textView = this.f9945l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList m11679p() {
        TextView textView = this.f9945l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence m11680q() {
        return this.f9949p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public int m11681r() {
        TextView textView = this.f9951r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m11682t() {
        this.f9943j = null;
        m11674g();
        if (this.f9941h == 1) {
            if (this.f9950q && !TextUtils.isEmpty(this.f9949p)) {
                this.f9942i = 2;
            } else {
                this.f9942i = 0;
            }
        }
        m11651O(this.f9941h, this.f9942i, m11650L(this.f9945l, null));
    }

    /* renamed from: u */
    void m11683u() {
        m11674g();
        int i10 = this.f9941h;
        if (i10 == 2) {
            this.f9942i = 0;
        }
        m11651O(i10, this.f9942i, m11650L(this.f9951r, null));
    }

    /* renamed from: w */
    boolean m11684w(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m11685x() {
        return this.f9944k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean m11686y() {
        return this.f9950q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m11687z(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f9936c == null) {
            return;
        }
        if (m11684w(i10) && (frameLayout = this.f9938e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f9936c.removeView(textView);
        }
        int i11 = this.f9937d - 1;
        this.f9937d = i11;
        m11649K(this.f9936c, i11);
    }
}
