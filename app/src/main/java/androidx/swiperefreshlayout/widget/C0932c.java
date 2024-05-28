package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.C0587a;
import androidx.core.view.C0680l;
import androidx.core.view.C0683o;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0679k;
import androidx.core.widget.C0705g;

/* renamed from: androidx.swiperefreshlayout.widget.c */
/* loaded from: classes.dex */
public class C0932c extends ViewGroup implements InterfaceC0679k {

    /* renamed from: e0 */
    private static final String f4872e0 = C0932c.class.getSimpleName();

    /* renamed from: f0 */
    private static final int[] f4873f0 = {R.attr.enabled};

    /* renamed from: A */
    private float f4874A;

    /* renamed from: B */
    private float f4875B;

    /* renamed from: C */
    private boolean f4876C;

    /* renamed from: D */
    private int f4877D;

    /* renamed from: E */
    boolean f4878E;

    /* renamed from: F */
    private boolean f4879F;

    /* renamed from: G */
    private final DecelerateInterpolator f4880G;

    /* renamed from: H */
    C0930a f4881H;

    /* renamed from: I */
    private int f4882I;

    /* renamed from: J */
    protected int f4883J;

    /* renamed from: K */
    float f4884K;

    /* renamed from: L */
    protected int f4885L;

    /* renamed from: M */
    int f4886M;

    /* renamed from: N */
    int f4887N;

    /* renamed from: O */
    C0931b f4888O;

    /* renamed from: P */
    private Animation f4889P;

    /* renamed from: Q */
    private Animation f4890Q;

    /* renamed from: R */
    private Animation f4891R;

    /* renamed from: S */
    private Animation f4892S;

    /* renamed from: T */
    private Animation f4893T;

    /* renamed from: U */
    boolean f4894U;

    /* renamed from: V */
    private int f4895V;

    /* renamed from: W */
    boolean f4896W;

    /* renamed from: a0 */
    private i f4897a0;

    /* renamed from: b0 */
    private Animation.AnimationListener f4898b0;

    /* renamed from: c0 */
    private final Animation f4899c0;

    /* renamed from: d0 */
    private final Animation f4900d0;

    /* renamed from: n */
    private View f4901n;

    /* renamed from: o */
    j f4902o;

    /* renamed from: p */
    boolean f4903p;

    /* renamed from: q */
    private int f4904q;

    /* renamed from: r */
    private float f4905r;

    /* renamed from: s */
    private float f4906s;

    /* renamed from: t */
    private final C0683o f4907t;

    /* renamed from: u */
    private final C0680l f4908u;

    /* renamed from: v */
    private final int[] f4909v;

    /* renamed from: w */
    private final int[] f4910w;

    /* renamed from: x */
    private boolean f4911x;

    /* renamed from: y */
    private int f4912y;

    /* renamed from: z */
    int f4913z;

    /* renamed from: androidx.swiperefreshlayout.widget.c$a */
    /* loaded from: classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            C0932c c0932c = C0932c.this;
            if (c0932c.f4903p) {
                c0932c.f4888O.setAlpha(255);
                C0932c.this.f4888O.start();
                C0932c c0932c2 = C0932c.this;
                if (c0932c2.f4894U && (jVar = c0932c2.f4902o) != null) {
                    jVar.mo5966c();
                }
                C0932c c0932c3 = C0932c.this;
                c0932c3.f4913z = c0932c3.f4881H.getTop();
                return;
            }
            c0932c.m5963k();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$b */
    /* loaded from: classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            C0932c.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$c */
    /* loaded from: classes.dex */
    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            C0932c.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: n */
        final /* synthetic */ int f4917n;

        /* renamed from: o */
        final /* synthetic */ int f4918o;

        d(int i10, int i11) {
            this.f4917n = i10;
            this.f4918o = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            C0932c.this.f4888O.setAlpha((int) (this.f4917n + ((this.f4918o - r0) * f10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0932c c0932c = C0932c.this;
            if (c0932c.f4878E) {
                return;
            }
            c0932c.m5964q(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$f */
    /* loaded from: classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            C0932c c0932c = C0932c.this;
            if (!c0932c.f4896W) {
                i10 = c0932c.f4886M - Math.abs(c0932c.f4885L);
            } else {
                i10 = c0932c.f4886M;
            }
            C0932c c0932c2 = C0932c.this;
            C0932c.this.setTargetOffsetTopAndBottom((c0932c2.f4883J + ((int) ((i10 - r1) * f10))) - c0932c2.f4881H.getTop());
            C0932c.this.f4888O.m5912e(1.0f - f10);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$g */
    /* loaded from: classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            C0932c.this.m5962i(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$h */
    /* loaded from: classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            C0932c c0932c = C0932c.this;
            float f11 = c0932c.f4884K;
            c0932c.setAnimationProgress(f11 + ((-f11) * f10));
            C0932c.this.m5962i(f10);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$i */
    /* loaded from: classes.dex */
    public interface i {
        /* renamed from: a */
        boolean m5965a(C0932c c0932c, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.c$j */
    /* loaded from: classes.dex */
    public interface j {
        /* renamed from: c */
        void mo5966c();
    }

    public C0932c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4903p = false;
        this.f4905r = -1.0f;
        this.f4909v = new int[2];
        this.f4910w = new int[2];
        this.f4877D = -1;
        this.f4882I = -1;
        this.f4898b0 = new a();
        this.f4899c0 = new f();
        this.f4900d0 = new g();
        this.f4904q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4912y = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4880G = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4895V = (int) (displayMetrics.density * 40.0f);
        m5948d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f4886M = i10;
        this.f4905r = i10;
        this.f4907t = new C0683o(this);
        this.f4908u = new C0680l(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f4895V;
        this.f4913z = i11;
        this.f4885L = i11;
        m5962i(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4873f0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m5946a(int i10, Animation.AnimationListener animationListener) {
        this.f4883J = i10;
        this.f4899c0.reset();
        this.f4899c0.setDuration(200L);
        this.f4899c0.setInterpolator(this.f4880G);
        if (animationListener != null) {
            this.f4881H.m5903b(animationListener);
        }
        this.f4881H.clearAnimation();
        this.f4881H.startAnimation(this.f4899c0);
    }

    /* renamed from: b */
    private void m5947b(int i10, Animation.AnimationListener animationListener) {
        if (this.f4878E) {
            m5959r(i10, animationListener);
            return;
        }
        this.f4883J = i10;
        this.f4900d0.reset();
        this.f4900d0.setDuration(200L);
        this.f4900d0.setInterpolator(this.f4880G);
        if (animationListener != null) {
            this.f4881H.m5903b(animationListener);
        }
        this.f4881H.clearAnimation();
        this.f4881H.startAnimation(this.f4900d0);
    }

    /* renamed from: d */
    private void m5948d() {
        this.f4881H = new C0930a(getContext(), -328966);
        C0931b c0931b = new C0931b(getContext());
        this.f4888O = c0931b;
        c0931b.m5917l(1);
        this.f4881H.setImageDrawable(this.f4888O);
        this.f4881H.setVisibility(8);
        addView(this.f4881H);
    }

    /* renamed from: e */
    private void m5949e() {
        if (this.f4901n == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f4881H)) {
                    this.f4901n = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m5950f(float f10) {
        if (f10 > this.f4905r) {
            m5954l(true, true);
            return;
        }
        this.f4903p = false;
        this.f4888O.m5915j(0.0f, 0.0f);
        m5947b(this.f4913z, this.f4878E ? null : new e());
        this.f4888O.m5911d(false);
    }

    /* renamed from: g */
    private boolean m5951g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: h */
    private void m5952h(float f10) {
        this.f4888O.m5911d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f4905r));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f4905r;
        int i10 = this.f4887N;
        if (i10 <= 0) {
            i10 = this.f4896W ? this.f4886M - this.f4885L : this.f4886M;
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f4885L + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f4881H.getVisibility() != 0) {
            this.f4881H.setVisibility(0);
        }
        if (!this.f4878E) {
            this.f4881H.setScaleX(1.0f);
            this.f4881H.setScaleY(1.0f);
        }
        if (this.f4878E) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f4905r));
        }
        if (f10 < this.f4905r) {
            if (this.f4888O.getAlpha() > 76 && !m5951g(this.f4891R)) {
                m5958p();
            }
        } else if (this.f4888O.getAlpha() < 255 && !m5951g(this.f4892S)) {
            m5957o();
        }
        this.f4888O.m5915j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f4888O.m5912e(Math.min(1.0f, max));
        this.f4888O.m5914g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f4913z);
    }

    /* renamed from: j */
    private void m5953j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4877D) {
            this.f4877D = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: l */
    private void m5954l(boolean z10, boolean z11) {
        if (this.f4903p != z10) {
            this.f4894U = z11;
            m5949e();
            this.f4903p = z10;
            if (z10) {
                m5946a(this.f4913z, this.f4898b0);
            } else {
                m5964q(this.f4898b0);
            }
        }
    }

    /* renamed from: m */
    private Animation m5955m(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f4881H.m5903b(null);
        this.f4881H.clearAnimation();
        this.f4881H.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: n */
    private void m5956n(float f10) {
        float f11 = this.f4875B;
        float f12 = f10 - f11;
        int i10 = this.f4904q;
        if (f12 <= i10 || this.f4876C) {
            return;
        }
        this.f4874A = f11 + i10;
        this.f4876C = true;
        this.f4888O.setAlpha(76);
    }

    /* renamed from: o */
    private void m5957o() {
        this.f4892S = m5955m(this.f4888O.getAlpha(), 255);
    }

    /* renamed from: p */
    private void m5958p() {
        this.f4891R = m5955m(this.f4888O.getAlpha(), 76);
    }

    /* renamed from: r */
    private void m5959r(int i10, Animation.AnimationListener animationListener) {
        this.f4883J = i10;
        this.f4884K = this.f4881H.getScaleX();
        h hVar = new h();
        this.f4893T = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f4881H.m5903b(animationListener);
        }
        this.f4881H.clearAnimation();
        this.f4881H.startAnimation(this.f4893T);
    }

    /* renamed from: s */
    private void m5960s(Animation.AnimationListener animationListener) {
        this.f4881H.setVisibility(0);
        this.f4888O.setAlpha(255);
        b bVar = new b();
        this.f4889P = bVar;
        bVar.setDuration(this.f4912y);
        if (animationListener != null) {
            this.f4881H.m5903b(animationListener);
        }
        this.f4881H.clearAnimation();
        this.f4881H.startAnimation(this.f4889P);
    }

    private void setColorViewAlpha(int i10) {
        this.f4881H.getBackground().setAlpha(i10);
        this.f4888O.setAlpha(i10);
    }

    /* renamed from: c */
    public boolean m5961c() {
        i iVar = this.f4897a0;
        if (iVar != null) {
            return iVar.m5965a(this, this.f4901n);
        }
        View view = this.f4901n;
        if (view instanceof ListView) {
            return C0705g.m4150a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f4908u.m3756a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f4908u.m3757b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f4908u.m3758c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f4908u.m3761f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f4882I;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4907t.m3770a();
    }

    public int getProgressCircleDiameter() {
        return this.f4895V;
    }

    public int getProgressViewEndOffset() {
        return this.f4886M;
    }

    public int getProgressViewStartOffset() {
        return this.f4885L;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4908u.m3762j();
    }

    /* renamed from: i */
    void m5962i(float f10) {
        setTargetOffsetTopAndBottom((this.f4883J + ((int) ((this.f4885L - r0) * f10))) - this.f4881H.getTop());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f4908u.m3764l();
    }

    /* renamed from: k */
    void m5963k() {
        this.f4881H.clearAnimation();
        this.f4888O.stop();
        this.f4881H.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4878E) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4885L - this.f4913z);
        }
        this.f4913z = this.f4881H.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m5963k();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m5949e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4879F && actionMasked == 0) {
            this.f4879F = false;
        }
        if (!isEnabled() || this.f4879F || m5961c() || this.f4903p || this.f4911x) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f4877D;
                    if (i10 == -1) {
                        Log.e(f4872e0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m5956n(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m5953j(motionEvent);
                    }
                }
            }
            this.f4876C = false;
            this.f4877D = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4885L - this.f4881H.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4877D = pointerId;
            this.f4876C = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4875B = motionEvent.getY(findPointerIndex2);
        }
        return this.f4876C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4901n == null) {
            m5949e();
        }
        View view = this.f4901n;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4881H.getMeasuredWidth();
        int measuredHeight2 = this.f4881H.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f4913z;
        this.f4881H.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4901n == null) {
            m5949e();
        }
        View view = this.f4901n;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4881H.measure(View.MeasureSpec.makeMeasureSpec(this.f4895V, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4895V, 1073741824));
        this.f4882I = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f4881H) {
                this.f4882I = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f4906s;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f4906s = 0.0f;
                } else {
                    this.f4906s = f10 - f11;
                    iArr[1] = i11;
                }
                m5952h(this.f4906s);
            }
        }
        if (this.f4896W && i11 > 0 && this.f4906s == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f4881H.setVisibility(8);
        }
        int[] iArr2 = this.f4909v;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f4910w);
        if (i13 + this.f4910w[1] >= 0 || m5961c()) {
            return;
        }
        float abs = this.f4906s + Math.abs(r11);
        this.f4906s = abs;
        m5952h(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f4907t.m3771b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f4906s = 0.0f;
        this.f4911x = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f4879F || this.f4903p || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f4907t.m3773d(view);
        this.f4911x = false;
        float f10 = this.f4906s;
        if (f10 > 0.0f) {
            m5950f(f10);
            this.f4906s = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4879F && actionMasked == 0) {
            this.f4879F = false;
        }
        if (!isEnabled() || this.f4879F || m5961c() || this.f4903p || this.f4911x) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4877D = motionEvent.getPointerId(0);
            this.f4876C = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f4877D);
                if (findPointerIndex < 0) {
                    Log.e(f4872e0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4876C) {
                    float y10 = (motionEvent.getY(findPointerIndex) - this.f4874A) * 0.5f;
                    this.f4876C = false;
                    m5950f(y10);
                }
                this.f4877D = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f4877D);
                if (findPointerIndex2 < 0) {
                    Log.e(f4872e0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(findPointerIndex2);
                m5956n(y11);
                if (this.f4876C) {
                    float f10 = (y11 - this.f4874A) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    m5952h(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f4872e0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f4877D = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m5953j(motionEvent);
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    void m5964q(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f4890Q = cVar;
        cVar.setDuration(150L);
        this.f4881H.m5903b(animationListener);
        this.f4881H.clearAnimation();
        this.f4881H.startAnimation(this.f4890Q);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f4901n;
        if (view == null || C0690v.m3815V(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f10) {
        this.f4881H.setScaleX(f10);
        this.f4881H.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m5949e();
        this.f4888O.m5913f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = C0587a.m3029c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f4905r = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        m5963k();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f4908u.m3765m(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.f4897a0 = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f4902o = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f4881H.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(C0587a.m3029c(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (z10 && this.f4903p != z10) {
            this.f4903p = z10;
            if (!this.f4896W) {
                i10 = this.f4886M + this.f4885L;
            } else {
                i10 = this.f4886M;
            }
            setTargetOffsetTopAndBottom(i10 - this.f4913z);
            this.f4894U = false;
            m5960s(this.f4898b0);
            return;
        }
        m5954l(z10, false);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f4895V = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4895V = (int) (displayMetrics.density * 40.0f);
            }
            this.f4881H.setImageDrawable(null);
            this.f4888O.m5917l(i10);
            this.f4881H.setImageDrawable(this.f4888O);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f4887N = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f4881H.bringToFront();
        C0690v.m3823b0(this.f4881H, i10);
        this.f4913z = this.f4881H.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f4908u.m3766o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f4908u.m3768q();
    }
}
