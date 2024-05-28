package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0690v;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C2489l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p111i4.C3522d;
import p111i4.C3529k;
import p125j4.InterfaceC3610k;
import p310y4.C5888g;
import p310y4.C5889h;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0558b {

    /* renamed from: F */
    private static final int f9018F = C3529k.f14702l;

    /* renamed from: A */
    private int f9019A;

    /* renamed from: B */
    private int f9020B;

    /* renamed from: C */
    private int f9021C;

    /* renamed from: D */
    AnimatorListenerAdapter f9022D;

    /* renamed from: E */
    InterfaceC3610k<FloatingActionButton> f9023E;

    /* renamed from: n */
    private final int f9024n;

    /* renamed from: o */
    private final C5888g f9025o;

    /* renamed from: p */
    private Animator f9026p;

    /* renamed from: q */
    private Animator f9027q;

    /* renamed from: r */
    private int f9028r;

    /* renamed from: s */
    private int f9029s;

    /* renamed from: t */
    private boolean f9030t;

    /* renamed from: u */
    private int f9031u;

    /* renamed from: v */
    private ArrayList<InterfaceC2410g> f9032v;

    /* renamed from: w */
    private int f9033w;

    /* renamed from: x */
    private boolean f9034x;

    /* renamed from: y */
    private boolean f9035y;

    /* renamed from: z */
    private Behavior f9036z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2403a();

        /* renamed from: n */
        int f9042n;

        /* renamed from: o */
        boolean f9043o;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        /* loaded from: classes.dex */
        static class C2403a implements Parcelable.ClassLoaderCreator<SavedState> {
            C2403a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f9042n);
            parcel.writeInt(this.f9043o ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9042n = parcel.readInt();
            this.f9043o = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes.dex */
    public class C2404a extends AnimatorListenerAdapter {
        C2404a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m10622w();
            BottomAppBar.this.f9026p = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m10623x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes.dex */
    public class C2405b extends FloatingActionButton.AbstractC2469b {

        /* renamed from: a */
        final /* synthetic */ int f9045a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes.dex */
        class a extends FloatingActionButton.AbstractC2469b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC2469b
            /* renamed from: b */
            public void mo10640b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m10622w();
            }
        }

        C2405b(int i10) {
            this.f9045a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC2469b
        /* renamed from: a */
        public void mo10639a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m10593B(this.f9045a));
            floatingActionButton.m11185s(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes.dex */
    public class C2406c extends AnimatorListenerAdapter {
        C2406c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m10622w();
            BottomAppBar.this.f9034x = false;
            BottomAppBar.this.f9027q = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m10623x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes.dex */
    public class C2407d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f9049a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f9050b;

        /* renamed from: c */
        final /* synthetic */ int f9051c;

        /* renamed from: d */
        final /* synthetic */ boolean f9052d;

        C2407d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9050b = actionMenuView;
            this.f9051c = i10;
            this.f9052d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9049a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f9049a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f9033w != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m10627F(bottomAppBar.f9033w);
            BottomAppBar.this.m10600L(this.f9050b, this.f9051c, this.f9052d, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes.dex */
    public class RunnableC2408e implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ActionMenuView f9054n;

        /* renamed from: o */
        final /* synthetic */ int f9055o;

        /* renamed from: p */
        final /* synthetic */ boolean f9056p;

        RunnableC2408e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f9054n = actionMenuView;
            this.f9055o = i10;
            this.f9056p = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9054n.setTranslationX(BottomAppBar.this.m10626A(r0, this.f9055o, this.f9056p));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes.dex */
    public class C2409f extends AnimatorListenerAdapter {
        C2409f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f9022D.onAnimationStart(animator);
            FloatingActionButton m10624y = BottomAppBar.this.m10624y();
            if (m10624y != null) {
                m10624y.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2410g {
        /* renamed from: a */
        void m10641a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m10642b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public float m10593B(int i10) {
        boolean m11382d = C2489l.m11382d(this);
        if (i10 == 1) {
            return ((getMeasuredWidth() / 2) - (this.f9024n + (m11382d ? this.f9021C : this.f9020B))) * (m11382d ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: C */
    private boolean m10594C() {
        FloatingActionButton m10624y = m10624y();
        return m10624y != null && m10624y.m11184o();
    }

    /* renamed from: D */
    private void m10595D(int i10, boolean z10) {
        if (!C0690v.m3814U(this)) {
            this.f9034x = false;
            m10627F(this.f9033w);
            return;
        }
        Animator animator = this.f9027q;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m10594C()) {
            i10 = 0;
            z10 = false;
        }
        m10621v(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9027q = animatorSet;
        animatorSet.addListener(new C2406c());
        this.f9027q.start();
    }

    /* renamed from: E */
    private void m10596E(int i10) {
        if (this.f9028r == i10 || !C0690v.m3814U(this)) {
            return;
        }
        Animator animator = this.f9026p;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f9029s == 1) {
            m10620u(i10, arrayList);
        } else {
            m10630t(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f9026p = animatorSet;
        animatorSet.addListener(new C2404a());
        this.f9026p.start();
    }

    /* renamed from: G */
    private void m10597G() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f9027q != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!m10594C()) {
            m10599K(actionMenuView, 0, false);
        } else {
            m10599K(actionMenuView, this.f9028r, this.f9035y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m10598H() {
        getTopEdgeTreatment().m10654r(getFabTranslationX());
        View m10625z = m10625z();
        this.f9025o.m20836Y((this.f9035y && m10594C()) ? 1.0f : 0.0f);
        if (m10625z != null) {
            m10625z.setTranslationY(getFabTranslationY());
            m10625z.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: K */
    private void m10599K(ActionMenuView actionMenuView, int i10, boolean z10) {
        m10600L(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m10600L(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        RunnableC2408e runnableC2408e = new RunnableC2408e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(runnableC2408e);
        } else {
            runnableC2408e.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f9019A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m10593B(this.f9028r);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m10644f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f9021C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f9020B;
    }

    private C2411a getTopEdgeTreatment() {
        return (C2411a) this.f9025o.m20822C().m20877p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m10618r(FloatingActionButton floatingActionButton) {
        floatingActionButton.m11176e(this.f9022D);
        floatingActionButton.m11177f(new C2409f());
        floatingActionButton.m11178g(this.f9023E);
    }

    /* renamed from: s */
    private void m10619s() {
        Animator animator = this.f9027q;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f9026p;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: u */
    private void m10620u(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m10624y(), "translationX", m10593B(i10));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: v */
    private void m10621v(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m10626A(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C2407d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m10622w() {
        ArrayList<InterfaceC2410g> arrayList;
        int i10 = this.f9031u - 1;
        this.f9031u = i10;
        if (i10 != 0 || (arrayList = this.f9032v) == null) {
            return;
        }
        Iterator<InterfaceC2410g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m10641a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m10623x() {
        ArrayList<InterfaceC2410g> arrayList;
        int i10 = this.f9031u;
        this.f9031u = i10 + 1;
        if (i10 != 0 || (arrayList = this.f9032v) == null) {
            return;
        }
        Iterator<InterfaceC2410g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m10642b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public FloatingActionButton m10624y() {
        View m10625z = m10625z();
        if (m10625z instanceof FloatingActionButton) {
            return (FloatingActionButton) m10625z;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public View m10625z() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m2649m(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: A */
    protected int m10626A(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 != 1 || !z10) {
            return 0;
        }
        boolean m11382d = C2489l.m11382d(this);
        int measuredWidth = m11382d ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                if (m11382d) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((m11382d ? actionMenuView.getRight() : actionMenuView.getLeft()) + (m11382d ? this.f9020B : -this.f9021C));
    }

    /* renamed from: F */
    public void m10627F(int i10) {
        if (i10 != 0) {
            this.f9033w = 0;
            getMenu().clear();
            inflateMenu(i10);
        }
    }

    /* renamed from: I */
    public void m10628I(int i10, int i11) {
        this.f9033w = i11;
        this.f9034x = true;
        m10595D(i10, this.f9035y);
        m10596E(i10);
        this.f9028r = i10;
    }

    /* renamed from: J */
    boolean m10629J(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().m10648k()) {
            return false;
        }
        getTopEdgeTreatment().m10653q(f10);
        this.f9025o.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f9025o.m20823E();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m10644f();
    }

    public int getFabAlignmentMode() {
        return this.f9028r;
    }

    public int getFabAnimationMode() {
        return this.f9029s;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m10646h();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m10647j();
    }

    public boolean getHideOnScroll() {
        return this.f9030t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5889h.m20861f(this, this.f9025o);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m10619s();
            m10598H();
        }
        m10597G();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f9028r = savedState.f9042n;
        this.f9035y = savedState.f9043o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9042n = this.f9028r;
        savedState.f9043o = this.f9035y;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0609a.m3260o(this.f9025o, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m10649m(f10);
            this.f9025o.invalidateSelf();
            m10598H();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f9025o.m20834W(f10);
        getBehavior().m10570G(this, this.f9025o.m20821B() - this.f9025o.m20820A());
    }

    public void setFabAlignmentMode(int i10) {
        m10628I(i10, 0);
    }

    public void setFabAnimationMode(int i10) {
        this.f9029s = i10;
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().m10645g()) {
            getTopEdgeTreatment().m10650n(f10);
            this.f9025o.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().m10651o(f10);
            this.f9025o.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m10652p(f10);
            this.f9025o.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f9030t = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t */
    protected void m10630t(int i10, List<Animator> list) {
        FloatingActionButton m10624y = m10624y();
        if (m10624y == null || m10624y.m11183n()) {
            return;
        }
        m10623x();
        m10624y.m11181l(new C2405b(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0558b
    public Behavior getBehavior() {
        if (this.f9036z == null) {
            this.f9036z = new Behavior();
        }
        return this.f9036z;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f9037e;

        /* renamed from: f */
        private WeakReference<BottomAppBar> f9038f;

        /* renamed from: g */
        private int f9039g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f9040h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes.dex */
        class ViewOnLayoutChangeListenerC2402a implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC2402a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f9038f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m11180j(Behavior.this.f9037e);
                    int height = Behavior.this.f9037e.height();
                    bottomAppBar.m10629J(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m20879r().mo20790a(new RectF(Behavior.this.f9037e)));
                    CoordinatorLayout.C0562f c0562f = (CoordinatorLayout.C0562f) view.getLayoutParams();
                    if (Behavior.this.f9039g == 0) {
                        ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C3522d.f14552F) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) c0562f).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c0562f).rightMargin = bottomAppBar.getRightInset();
                        if (C2489l.m11382d(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) c0562f).leftMargin += bottomAppBar.f9024n;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0562f).rightMargin += bottomAppBar.f9024n;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f9040h = new ViewOnLayoutChangeListenerC2402a();
            this.f9037e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo2673l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f9038f = new WeakReference<>(bottomAppBar);
            View m10625z = bottomAppBar.m10625z();
            if (m10625z != null && !C0690v.m3814U(m10625z)) {
                CoordinatorLayout.C0562f c0562f = (CoordinatorLayout.C0562f) m10625z.getLayoutParams();
                c0562f.f3026d = 49;
                this.f9039g = ((ViewGroup.MarginLayoutParams) c0562f).bottomMargin;
                if (m10625z instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m10625z;
                    floatingActionButton.addOnLayoutChangeListener(this.f9040h);
                    bottomAppBar.m10618r(floatingActionButton);
                }
                bottomAppBar.m10598H();
            }
            coordinatorLayout.m2636C(bottomAppBar, i10);
            return super.mo2673l(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0559c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean mo2658A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.mo2658A(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9040h = new ViewOnLayoutChangeListenerC2402a();
            this.f9037e = new Rect();
        }
    }
}
