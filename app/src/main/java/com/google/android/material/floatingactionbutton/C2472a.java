package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.util.C0654h;
import androidx.core.view.C0690v;
import com.google.android.material.internal.C2483f;
import java.util.ArrayList;
import java.util.Iterator;
import p111i4.C3519a;
import p125j4.C3600a;
import p125j4.C3601b;
import p125j4.C3605f;
import p125j4.C3606g;
import p125j4.C3607h;
import p284w4.C5457b;
import p297x4.InterfaceC5548b;
import p310y4.C5888g;
import p310y4.C5889h;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
public class C2472a {

    /* renamed from: E */
    static final TimeInterpolator f9479E = C3600a.f15225c;

    /* renamed from: F */
    static final int[] f9480F = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: G */
    static final int[] f9481G = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: H */
    static final int[] f9482H = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: I */
    static final int[] f9483I = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: J */
    static final int[] f9484J = {R.attr.state_enabled};

    /* renamed from: K */
    static final int[] f9485K = new int[0];

    /* renamed from: D */
    private ViewTreeObserver.OnPreDrawListener f9489D;

    /* renamed from: a */
    C5892k f9490a;

    /* renamed from: b */
    C5888g f9491b;

    /* renamed from: c */
    Drawable f9492c;

    /* renamed from: d */
    Drawable f9493d;

    /* renamed from: e */
    boolean f9494e;

    /* renamed from: g */
    float f9496g;

    /* renamed from: h */
    float f9497h;

    /* renamed from: i */
    float f9498i;

    /* renamed from: j */
    int f9499j;

    /* renamed from: k */
    private final C2483f f9500k;

    /* renamed from: l */
    private C3607h f9501l;

    /* renamed from: m */
    private C3607h f9502m;

    /* renamed from: n */
    private Animator f9503n;

    /* renamed from: o */
    private C3607h f9504o;

    /* renamed from: p */
    private C3607h f9505p;

    /* renamed from: q */
    private float f9506q;

    /* renamed from: s */
    private int f9508s;

    /* renamed from: u */
    private ArrayList<Animator.AnimatorListener> f9510u;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f9511v;

    /* renamed from: w */
    private ArrayList<i> f9512w;

    /* renamed from: x */
    final FloatingActionButton f9513x;

    /* renamed from: y */
    final InterfaceC5548b f9514y;

    /* renamed from: f */
    boolean f9495f = true;

    /* renamed from: r */
    private float f9507r = 1.0f;

    /* renamed from: t */
    private int f9509t = 0;

    /* renamed from: z */
    private final Rect f9515z = new Rect();

    /* renamed from: A */
    private final RectF f9486A = new RectF();

    /* renamed from: B */
    private final RectF f9487B = new RectF();

    /* renamed from: C */
    private final Matrix f9488C = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f9516a;

        /* renamed from: b */
        final /* synthetic */ boolean f9517b;

        /* renamed from: c */
        final /* synthetic */ j f9518c;

        a(boolean z10, j jVar) {
            this.f9517b = z10;
            this.f9518c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9516a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2472a.this.f9509t = 0;
            C2472a.this.f9503n = null;
            if (this.f9516a) {
                return;
            }
            FloatingActionButton floatingActionButton = C2472a.this.f9513x;
            boolean z10 = this.f9517b;
            floatingActionButton.m11385b(z10 ? 8 : 4, z10);
            j jVar = this.f9518c;
            if (jVar != null) {
                jVar.mo11196b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2472a.this.f9513x.m11385b(0, this.f9517b);
            C2472a.this.f9509t = 1;
            C2472a.this.f9503n = animator;
            this.f9516a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f9520a;

        /* renamed from: b */
        final /* synthetic */ j f9521b;

        b(boolean z10, j jVar) {
            this.f9520a = z10;
            this.f9521b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2472a.this.f9509t = 0;
            C2472a.this.f9503n = null;
            j jVar = this.f9521b;
            if (jVar != null) {
                jVar.mo11195a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C2472a.this.f9513x.m11385b(0, this.f9520a);
            C2472a.this.f9509t = 2;
            C2472a.this.f9503n = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: classes.dex */
    public class c extends C3606g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            C2472a.this.f9507r = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: classes.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f9524a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f9524a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: classes.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C2472a.this.m11217F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: classes.dex */
    private class f extends l {
        f() {
            super(C2472a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.l
        /* renamed from: a */
        protected float mo11259a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: classes.dex */
    private class g extends l {
        g() {
            super(C2472a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.l
        /* renamed from: a */
        protected float mo11259a() {
            C2472a c2472a = C2472a.this;
            return c2472a.f9496g + c2472a.f9497h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: classes.dex */
    private class h extends l {
        h() {
            super(C2472a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.l
        /* renamed from: a */
        protected float mo11259a() {
            C2472a c2472a = C2472a.this;
            return c2472a.f9496g + c2472a.f9498i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: classes.dex */
    public interface i {
        /* renamed from: a */
        void mo11199a();

        /* renamed from: b */
        void mo11200b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* loaded from: classes.dex */
    public interface j {
        /* renamed from: a */
        void mo11195a();

        /* renamed from: b */
        void mo11196b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* loaded from: classes.dex */
    private class k extends l {
        k() {
            super(C2472a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C2472a.l
        /* renamed from: a */
        protected float mo11259a() {
            return C2472a.this.f9496g;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* loaded from: classes.dex */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f9531a;

        /* renamed from: b */
        private float f9532b;

        /* renamed from: c */
        private float f9533c;

        private l() {
        }

        /* renamed from: a */
        protected abstract float mo11259a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2472a.this.m11239c0((int) this.f9533c);
            this.f9531a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f9531a) {
                C5888g c5888g = C2472a.this.f9491b;
                this.f9532b = c5888g == null ? 0.0f : c5888g.m20849w();
                this.f9533c = mo11259a();
                this.f9531a = true;
            }
            C2472a c2472a = C2472a.this;
            float f10 = this.f9532b;
            c2472a.m11239c0((int) (f10 + ((this.f9533c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(C2472a c2472a, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2472a(FloatingActionButton floatingActionButton, InterfaceC5548b interfaceC5548b) {
        this.f9513x = floatingActionButton;
        this.f9514y = interfaceC5548b;
        C2483f c2483f = new C2483f();
        this.f9500k = c2483f;
        c2483f.m11346a(f9480F, m11208i(new h()));
        c2483f.m11346a(f9481G, m11208i(new g()));
        c2483f.m11346a(f9482H, m11208i(new g()));
        c2483f.m11346a(f9483I, m11208i(new g()));
        c2483f.m11346a(f9484J, m11208i(new k()));
        c2483f.m11346a(f9485K, m11208i(new f()));
        this.f9506q = floatingActionButton.getRotation();
    }

    /* renamed from: W */
    private boolean m11201W() {
        return C0690v.m3814U(this.f9513x) && !this.f9513x.isInEditMode();
    }

    /* renamed from: d0 */
    private void m11205d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    /* renamed from: g */
    private void m11206g(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f9513x.getDrawable() == null || this.f9508s == 0) {
            return;
        }
        RectF rectF = this.f9486A;
        RectF rectF2 = this.f9487B;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f9508s;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f9508s;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    /* renamed from: h */
    private AnimatorSet m11207h(C3607h c3607h, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f9513x, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        c3607h.m15433e("opacity").m15440a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f9513x, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c3607h.m15433e("scale").m15440a(ofFloat2);
        m11205d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f9513x, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c3607h.m15433e("scale").m15440a(ofFloat3);
        m11205d0(ofFloat3);
        arrayList.add(ofFloat3);
        m11206g(f12, this.f9488C);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f9513x, new C3605f(), new c(), new Matrix(this.f9488C));
        c3607h.m15433e("iconScale").m15440a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C3601b.m15420a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m11208i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f9479E);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: k */
    private C3607h m11209k() {
        if (this.f9502m == null) {
            this.f9502m = C3607h.m15431c(this.f9513x.getContext(), C3519a.f14504a);
        }
        return (C3607h) C0654h.m3467f(this.f9502m);
    }

    /* renamed from: l */
    private C3607h m11210l() {
        if (this.f9501l == null) {
            this.f9501l = C3607h.m15431c(this.f9513x.getContext(), C3519a.f14505b);
        }
        return (C3607h) C0654h.m3467f(this.f9501l);
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m11211q() {
        if (this.f9489D == null) {
            this.f9489D = new e();
        }
        return this.f9489D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo11212A() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m11213B() {
        ViewTreeObserver viewTreeObserver = this.f9513x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f9489D;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f9489D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo11214C(int[] iArr) {
        throw null;
    }

    /* renamed from: D */
    void mo11215D(float f10, float f11, float f12) {
        throw null;
    }

    /* renamed from: E */
    void m11216E(Rect rect) {
        C0654h.m3468g(this.f9493d, "Didn't initialize content background");
        if (mo11233V()) {
            this.f9514y.setBackgroundDrawable(new InsetDrawable(this.f9493d, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f9514y.setBackgroundDrawable(this.f9493d);
        }
    }

    /* renamed from: F */
    void m11217F() {
        float rotation = this.f9513x.getRotation();
        if (this.f9506q != rotation) {
            this.f9506q = rotation;
            mo11236Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m11218G() {
        ArrayList<i> arrayList = this.f9512w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo11200b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m11219H() {
        ArrayList<i> arrayList = this.f9512w;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo11199a();
            }
        }
    }

    /* renamed from: I */
    boolean mo11220I() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m11221J(ColorStateList colorStateList) {
        C5888g c5888g = this.f9491b;
        if (c5888g != null) {
            c5888g.setTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m11222K(PorterDuff.Mode mode) {
        C5888g c5888g = this.f9491b;
        if (c5888g != null) {
            c5888g.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final void m11223L(float f10) {
        if (this.f9496g != f10) {
            this.f9496g = f10;
            mo11215D(f10, this.f9497h, this.f9498i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m11224M(boolean z10) {
        this.f9494e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m11225N(C3607h c3607h) {
        this.f9505p = c3607h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final void m11226O(float f10) {
        if (this.f9497h != f10) {
            this.f9497h = f10;
            mo11215D(this.f9496g, f10, this.f9498i);
        }
    }

    /* renamed from: P */
    final void m11227P(float f10) {
        this.f9507r = f10;
        Matrix matrix = this.f9488C;
        m11206g(f10, matrix);
        this.f9513x.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m11228Q(float f10) {
        if (this.f9498i != f10) {
            this.f9498i = f10;
            mo11215D(this.f9496g, this.f9497h, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo11229R(ColorStateList colorStateList) {
        Drawable drawable = this.f9492c;
        if (drawable != null) {
            C0609a.m3260o(drawable, C5457b.m20047d(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m11230S(boolean z10) {
        this.f9495f = z10;
        m11238b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public final void m11231T(C5892k c5892k) {
        this.f9490a = c5892k;
        C5888g c5888g = this.f9491b;
        if (c5888g != null) {
            c5888g.setShapeAppearanceModel(c5892k);
        }
        Object obj = this.f9492c;
        if (obj instanceof InterfaceC5895n) {
            ((InterfaceC5895n) obj).setShapeAppearanceModel(c5892k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final void m11232U(C3607h c3607h) {
        this.f9504o = c3607h;
    }

    /* renamed from: V */
    boolean mo11233V() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean m11234X() {
        return !this.f9494e || this.f9513x.getSizeDimension() >= this.f9499j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m11235Y(j jVar, boolean z10) {
        if (m11254x()) {
            return;
        }
        Animator animator = this.f9503n;
        if (animator != null) {
            animator.cancel();
        }
        if (m11201W()) {
            if (this.f9513x.getVisibility() != 0) {
                this.f9513x.setAlpha(0.0f);
                this.f9513x.setScaleY(0.0f);
                this.f9513x.setScaleX(0.0f);
                m11227P(0.0f);
            }
            C3607h c3607h = this.f9504o;
            if (c3607h == null) {
                c3607h = m11210l();
            }
            AnimatorSet m11207h = m11207h(c3607h, 1.0f, 1.0f, 1.0f);
            m11207h.addListener(new b(z10, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f9510u;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m11207h.addListener(it.next());
                }
            }
            m11207h.start();
            return;
        }
        this.f9513x.m11385b(0, z10);
        this.f9513x.setAlpha(1.0f);
        this.f9513x.setScaleY(1.0f);
        this.f9513x.setScaleX(1.0f);
        m11227P(1.0f);
        if (jVar != null) {
            jVar.mo11195a();
        }
    }

    /* renamed from: Z */
    void mo11236Z() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final void m11237a0() {
        m11227P(this.f9507r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void m11238b0() {
        Rect rect = this.f9515z;
        mo11248r(rect);
        m11216E(rect);
        this.f9514y.mo11197a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m11239c0(float f10) {
        C5888g c5888g = this.f9491b;
        if (c5888g != null) {
            c5888g.m20834W(f10);
        }
    }

    /* renamed from: d */
    public void m11240d(Animator.AnimatorListener animatorListener) {
        if (this.f9511v == null) {
            this.f9511v = new ArrayList<>();
        }
        this.f9511v.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m11241e(Animator.AnimatorListener animatorListener) {
        if (this.f9510u == null) {
            this.f9510u = new ArrayList<>();
        }
        this.f9510u.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m11242f(i iVar) {
        if (this.f9512w == null) {
            this.f9512w = new ArrayList<>();
        }
        this.f9512w.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final Drawable m11243j() {
        return this.f9493d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo11244m() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m11245n() {
        return this.f9494e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final C3607h m11246o() {
        return this.f9505p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public float m11247p() {
        return this.f9497h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo11248r(Rect rect) {
        int sizeDimension = this.f9494e ? (this.f9499j - this.f9513x.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f9495f ? mo11244m() + this.f9498i : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public float m11249s() {
        return this.f9498i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C5892k m11250t() {
        return this.f9490a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final C3607h m11251u() {
        return this.f9504o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m11252v(j jVar, boolean z10) {
        if (m11253w()) {
            return;
        }
        Animator animator = this.f9503n;
        if (animator != null) {
            animator.cancel();
        }
        if (m11201W()) {
            C3607h c3607h = this.f9505p;
            if (c3607h == null) {
                c3607h = m11209k();
            }
            AnimatorSet m11207h = m11207h(c3607h, 0.0f, 0.0f, 0.0f);
            m11207h.addListener(new a(z10, jVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f9511v;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m11207h.addListener(it.next());
                }
            }
            m11207h.start();
            return;
        }
        this.f9513x.m11385b(z10 ? 8 : 4, z10);
        if (jVar != null) {
            jVar.mo11196b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m11253w() {
        return this.f9513x.getVisibility() == 0 ? this.f9509t == 1 : this.f9509t != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m11254x() {
        return this.f9513x.getVisibility() != 0 ? this.f9509t == 2 : this.f9509t != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo11255y() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m11256z() {
        C5888g c5888g = this.f9491b;
        if (c5888g != null) {
            C5889h.m20861f(this.f9513x, c5888g);
        }
        if (mo11220I()) {
            this.f9513x.getViewTreeObserver().addOnPreDrawListener(m11211q());
        }
    }
}
