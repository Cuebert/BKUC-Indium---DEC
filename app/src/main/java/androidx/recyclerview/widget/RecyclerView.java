package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.os.C0632k;
import androidx.core.util.C0654h;
import androidx.core.view.C0656a;
import androidx.core.view.C0678j;
import androidx.core.view.C0680l;
import androidx.core.view.C0690v;
import androidx.core.view.C0692x;
import androidx.core.view.InterfaceC0679k;
import androidx.core.view.accessibility.C0659b;
import androidx.core.view.accessibility.C0660c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C0906a;
import androidx.recyclerview.widget.C0907b;
import androidx.recyclerview.widget.C0916k;
import androidx.recyclerview.widget.C0920o;
import androidx.recyclerview.widget.C0921p;
import androidx.recyclerview.widget.RunnableC0910e;
import com.appsflyer.oaid.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p108i1.C3466a;
import p108i1.C3467b;
import p108i1.C3468c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0679k {

    /* renamed from: P0 */
    private static final int[] f4387P0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: Q0 */
    static final boolean f4388Q0;

    /* renamed from: R0 */
    static final boolean f4389R0;

    /* renamed from: S0 */
    static final boolean f4390S0;

    /* renamed from: T0 */
    static final boolean f4391T0;

    /* renamed from: U0 */
    private static final boolean f4392U0;

    /* renamed from: V0 */
    private static final boolean f4393V0;

    /* renamed from: W0 */
    private static final Class<?>[] f4394W0;

    /* renamed from: X0 */
    static final Interpolator f4395X0;

    /* renamed from: A */
    InterfaceC0897x f4396A;

    /* renamed from: A0 */
    private AbstractC0886m.b f4397A0;

    /* renamed from: B */
    final List<InterfaceC0897x> f4398B;

    /* renamed from: B0 */
    boolean f4399B0;

    /* renamed from: C */
    final ArrayList<AbstractC0888o> f4400C;

    /* renamed from: C0 */
    C0916k f4401C0;

    /* renamed from: D */
    private final ArrayList<InterfaceC0893t> f4402D;

    /* renamed from: D0 */
    private InterfaceC0884k f4403D0;

    /* renamed from: E */
    private InterfaceC0893t f4404E;

    /* renamed from: E0 */
    private final int[] f4405E0;

    /* renamed from: F */
    boolean f4406F;

    /* renamed from: F0 */
    private C0680l f4407F0;

    /* renamed from: G */
    boolean f4408G;

    /* renamed from: G0 */
    private final int[] f4409G0;

    /* renamed from: H */
    boolean f4410H;

    /* renamed from: H0 */
    private final int[] f4411H0;

    /* renamed from: I */
    boolean f4412I;

    /* renamed from: I0 */
    final int[] f4413I0;

    /* renamed from: J */
    private int f4414J;

    /* renamed from: J0 */
    final List<AbstractC0877d0> f4415J0;

    /* renamed from: K */
    boolean f4416K;

    /* renamed from: K0 */
    private Runnable f4417K0;

    /* renamed from: L */
    boolean f4418L;

    /* renamed from: L0 */
    private boolean f4419L0;

    /* renamed from: M */
    private boolean f4420M;

    /* renamed from: M0 */
    private int f4421M0;

    /* renamed from: N */
    private int f4422N;

    /* renamed from: N0 */
    private int f4423N0;

    /* renamed from: O */
    boolean f4424O;

    /* renamed from: O0 */
    private final C0921p.b f4425O0;

    /* renamed from: P */
    private final AccessibilityManager f4426P;

    /* renamed from: Q */
    private List<InterfaceC0891r> f4427Q;

    /* renamed from: R */
    boolean f4428R;

    /* renamed from: S */
    boolean f4429S;

    /* renamed from: T */
    private int f4430T;

    /* renamed from: U */
    private int f4431U;

    /* renamed from: V */
    private C0885l f4432V;

    /* renamed from: W */
    private EdgeEffect f4433W;

    /* renamed from: a0 */
    private EdgeEffect f4434a0;

    /* renamed from: b0 */
    private EdgeEffect f4435b0;

    /* renamed from: c0 */
    private EdgeEffect f4436c0;

    /* renamed from: d0 */
    AbstractC0886m f4437d0;

    /* renamed from: e0 */
    private int f4438e0;

    /* renamed from: f0 */
    private int f4439f0;

    /* renamed from: g0 */
    private VelocityTracker f4440g0;

    /* renamed from: h0 */
    private int f4441h0;

    /* renamed from: i0 */
    private int f4442i0;

    /* renamed from: j0 */
    private int f4443j0;

    /* renamed from: k0 */
    private int f4444k0;

    /* renamed from: l0 */
    private int f4445l0;

    /* renamed from: m0 */
    private AbstractC0892s f4446m0;

    /* renamed from: n */
    private final C0898y f4447n;

    /* renamed from: n0 */
    private final int f4448n0;

    /* renamed from: o */
    final C0896w f4449o;

    /* renamed from: o0 */
    private final int f4450o0;

    /* renamed from: p */
    SavedState f4451p;

    /* renamed from: p0 */
    private float f4452p0;

    /* renamed from: q */
    C0906a f4453q;

    /* renamed from: q0 */
    private float f4454q0;

    /* renamed from: r */
    C0907b f4455r;

    /* renamed from: r0 */
    private boolean f4456r0;

    /* renamed from: s */
    final C0921p f4457s;

    /* renamed from: s0 */
    final RunnableC0875c0 f4458s0;

    /* renamed from: t */
    boolean f4459t;

    /* renamed from: t0 */
    RunnableC0910e f4460t0;

    /* renamed from: u */
    final Runnable f4461u;

    /* renamed from: u0 */
    RunnableC0910e.b f4462u0;

    /* renamed from: v */
    final Rect f4463v;

    /* renamed from: v0 */
    final C0871a0 f4464v0;

    /* renamed from: w */
    private final Rect f4465w;

    /* renamed from: w0 */
    private AbstractC0894u f4466w0;

    /* renamed from: x */
    final RectF f4467x;

    /* renamed from: x0 */
    private List<AbstractC0894u> f4468x0;

    /* renamed from: y */
    AbstractC0881h f4469y;

    /* renamed from: y0 */
    boolean f4470y0;

    /* renamed from: z */
    AbstractC0889p f4471z;

    /* renamed from: z0 */
    boolean f4472z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    public class RunnableC0870a implements Runnable {
        RunnableC0870a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4412I || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4406F) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4418L) {
                recyclerView2.f4416K = true;
            } else {
                recyclerView2.m5235t();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes.dex */
    public static class C0871a0 {

        /* renamed from: b */
        private SparseArray<Object> f4476b;

        /* renamed from: m */
        int f4487m;

        /* renamed from: n */
        long f4488n;

        /* renamed from: o */
        int f4489o;

        /* renamed from: p */
        int f4490p;

        /* renamed from: q */
        int f4491q;

        /* renamed from: a */
        int f4475a = -1;

        /* renamed from: c */
        int f4477c = 0;

        /* renamed from: d */
        int f4478d = 0;

        /* renamed from: e */
        int f4479e = 1;

        /* renamed from: f */
        int f4480f = 0;

        /* renamed from: g */
        boolean f4481g = false;

        /* renamed from: h */
        boolean f4482h = false;

        /* renamed from: i */
        boolean f4483i = false;

        /* renamed from: j */
        boolean f4484j = false;

        /* renamed from: k */
        boolean f4485k = false;

        /* renamed from: l */
        boolean f4486l = false;

        /* renamed from: a */
        void m5250a(int i10) {
            if ((this.f4479e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f4479e));
        }

        /* renamed from: b */
        public int m5251b() {
            if (this.f4482h) {
                return this.f4477c - this.f4478d;
            }
            return this.f4480f;
        }

        /* renamed from: c */
        public int m5252c() {
            return this.f4475a;
        }

        /* renamed from: d */
        public boolean m5253d() {
            return this.f4475a != -1;
        }

        /* renamed from: e */
        public boolean m5254e() {
            return this.f4482h;
        }

        /* renamed from: f */
        public void m5255f(AbstractC0881h abstractC0881h) {
            this.f4479e = 1;
            this.f4480f = abstractC0881h.mo5328d();
            this.f4482h = false;
            this.f4483i = false;
            this.f4484j = false;
        }

        /* renamed from: g */
        public boolean m5256g() {
            return this.f4486l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4475a + ", mData=" + this.f4476b + ", mItemCount=" + this.f4480f + ", mIsMeasuring=" + this.f4484j + ", mPreviousLayoutItemCount=" + this.f4477c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4478d + ", mStructureChanged=" + this.f4481g + ", mInPreLayout=" + this.f4482h + ", mRunSimpleAnimations=" + this.f4485k + ", mRunPredictiveAnimations=" + this.f4486l + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    public class RunnableC0872b implements Runnable {
        RunnableC0872b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0886m abstractC0886m = RecyclerView.this.f4437d0;
            if (abstractC0886m != null) {
                abstractC0886m.mo5371u();
            }
            RecyclerView.this.f4399B0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0873b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* loaded from: classes.dex */
    class InterpolatorC0874c implements Interpolator {
        InterpolatorC0874c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes.dex */
    public class RunnableC0875c0 implements Runnable {

        /* renamed from: n */
        private int f4493n;

        /* renamed from: o */
        private int f4494o;

        /* renamed from: p */
        OverScroller f4495p;

        /* renamed from: q */
        Interpolator f4496q;

        /* renamed from: r */
        private boolean f4497r;

        /* renamed from: s */
        private boolean f4498s;

        RunnableC0875c0() {
            Interpolator interpolator = RecyclerView.f4395X0;
            this.f4496q = interpolator;
            this.f4497r = false;
            this.f4498s = false;
            this.f4495p = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m5257a(int i10, int i11) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            boolean z10 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: c */
        private void m5258c() {
            RecyclerView.this.removeCallbacks(this);
            C0690v.m3837i0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void m5259b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f4494o = 0;
            this.f4493n = 0;
            Interpolator interpolator = this.f4496q;
            Interpolator interpolator2 = RecyclerView.f4395X0;
            if (interpolator != interpolator2) {
                this.f4496q = interpolator2;
                this.f4495p = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4495p.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m5260d();
        }

        /* renamed from: d */
        void m5260d() {
            if (this.f4497r) {
                this.f4498s = true;
            } else {
                m5258c();
            }
        }

        /* renamed from: e */
        public void m5261e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = m5257a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.f4395X0;
            }
            if (this.f4496q != interpolator) {
                this.f4496q = interpolator;
                this.f4495p = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4494o = 0;
            this.f4493n = 0;
            RecyclerView.this.setScrollState(2);
            this.f4495p.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4495p.computeScrollOffset();
            }
            m5260d();
        }

        /* renamed from: f */
        public void m5262f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4495p.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4471z == null) {
                m5262f();
                return;
            }
            this.f4498s = false;
            this.f4497r = true;
            recyclerView.m5235t();
            OverScroller overScroller = this.f4495p;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f4493n;
                int i13 = currY - this.f4494o;
                this.f4493n = currX;
                this.f4494o = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4413I0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m5166E(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4413I0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m5232s(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4469y != null) {
                    int[] iArr3 = recyclerView3.f4413I0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m5205f1(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4413I0;
                    i11 = iArr4[0];
                    i10 = iArr4[1];
                    i12 -= i11;
                    i13 -= i10;
                    AbstractC0899z abstractC0899z = recyclerView4.f4471z.f4548g;
                    if (abstractC0899z != null && !abstractC0899z.m5561g() && abstractC0899z.m5562h()) {
                        int m5251b = RecyclerView.this.f4464v0.m5251b();
                        if (m5251b == 0) {
                            abstractC0899z.m5572r();
                        } else if (abstractC0899z.m5560f() >= m5251b) {
                            abstractC0899z.m5570p(m5251b - 1);
                            abstractC0899z.m5564j(i11, i10);
                        } else {
                            abstractC0899z.m5564j(i11, i10);
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.f4400C.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4413I0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m5168F(i11, i10, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4413I0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i11 != 0 || i10 != 0) {
                    recyclerView6.m5172H(i11, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                AbstractC0899z abstractC0899z2 = RecyclerView.this.f4471z.f4548g;
                if (!(abstractC0899z2 != null && abstractC0899z2.m5561g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m5198a(i16, currVelocity);
                    }
                    if (RecyclerView.f4391T0) {
                        RecyclerView.this.f4462u0.m5781b();
                    }
                } else {
                    m5260d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0910e runnableC0910e = recyclerView7.f4460t0;
                    if (runnableC0910e != null) {
                        runnableC0910e.m5777f(recyclerView7, i11, i10);
                    }
                }
            }
            AbstractC0899z abstractC0899z3 = RecyclerView.this.f4471z.f4548g;
            if (abstractC0899z3 != null && abstractC0899z3.m5561g()) {
                abstractC0899z3.m5564j(0, 0);
            }
            this.f4497r = false;
            if (this.f4498s) {
                m5258c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m5234s1(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    public class C0876d implements C0921p.b {
        C0876d() {
        }

        @Override // androidx.recyclerview.widget.C0921p.b
        /* renamed from: a */
        public void mo5263a(AbstractC0877d0 abstractC0877d0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4471z.m5462m1(abstractC0877d0.f4502a, recyclerView.f4449o);
        }

        @Override // androidx.recyclerview.widget.C0921p.b
        /* renamed from: b */
        public void mo5264b(AbstractC0877d0 abstractC0877d0, AbstractC0886m.c cVar, AbstractC0886m.c cVar2) {
            RecyclerView.this.m5214k(abstractC0877d0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0921p.b
        /* renamed from: c */
        public void mo5265c(AbstractC0877d0 abstractC0877d0, AbstractC0886m.c cVar, AbstractC0886m.c cVar2) {
            RecyclerView.this.f4449o.m5527J(abstractC0877d0);
            RecyclerView.this.m5218m(abstractC0877d0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0921p.b
        /* renamed from: d */
        public void mo5266d(AbstractC0877d0 abstractC0877d0, AbstractC0886m.c cVar, AbstractC0886m.c cVar2) {
            abstractC0877d0.m5274G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4428R) {
                if (recyclerView.f4437d0.mo5353b(abstractC0877d0, abstractC0877d0, cVar, cVar2)) {
                    RecyclerView.this.m5179L0();
                }
            } else if (recyclerView.f4437d0.mo5355d(abstractC0877d0, cVar, cVar2)) {
                RecyclerView.this.m5179L0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0877d0 {

        /* renamed from: t */
        private static final List<Object> f4501t = Collections.emptyList();

        /* renamed from: a */
        public final View f4502a;

        /* renamed from: b */
        WeakReference<RecyclerView> f4503b;

        /* renamed from: j */
        int f4511j;

        /* renamed from: r */
        RecyclerView f4519r;

        /* renamed from: s */
        AbstractC0881h<? extends AbstractC0877d0> f4520s;

        /* renamed from: c */
        int f4504c = -1;

        /* renamed from: d */
        int f4505d = -1;

        /* renamed from: e */
        long f4506e = -1;

        /* renamed from: f */
        int f4507f = -1;

        /* renamed from: g */
        int f4508g = -1;

        /* renamed from: h */
        AbstractC0877d0 f4509h = null;

        /* renamed from: i */
        AbstractC0877d0 f4510i = null;

        /* renamed from: k */
        List<Object> f4512k = null;

        /* renamed from: l */
        List<Object> f4513l = null;

        /* renamed from: m */
        private int f4514m = 0;

        /* renamed from: n */
        C0896w f4515n = null;

        /* renamed from: o */
        boolean f4516o = false;

        /* renamed from: p */
        private int f4517p = 0;

        /* renamed from: q */
        int f4518q = -1;

        public AbstractC0877d0(View view) {
            if (view != null) {
                this.f4502a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m5267g() {
            if (this.f4512k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4512k = arrayList;
                this.f4513l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: A */
        void m5268A(int i10, boolean z10) {
            if (this.f4505d == -1) {
                this.f4505d = this.f4504c;
            }
            if (this.f4508g == -1) {
                this.f4508g = this.f4504c;
            }
            if (z10) {
                this.f4508g += i10;
            }
            this.f4504c += i10;
            if (this.f4502a.getLayoutParams() != null) {
                ((C0890q) this.f4502a.getLayoutParams()).f4568c = true;
            }
        }

        /* renamed from: B */
        void m5269B(RecyclerView recyclerView) {
            int i10 = this.f4518q;
            if (i10 != -1) {
                this.f4517p = i10;
            } else {
                this.f4517p = C0690v.m3787C(this.f4502a);
            }
            recyclerView.m5211i1(this, 4);
        }

        /* renamed from: C */
        void m5270C(RecyclerView recyclerView) {
            recyclerView.m5211i1(this, this.f4517p);
            this.f4517p = 0;
        }

        /* renamed from: D */
        void m5271D() {
            this.f4511j = 0;
            this.f4504c = -1;
            this.f4505d = -1;
            this.f4506e = -1L;
            this.f4508g = -1;
            this.f4514m = 0;
            this.f4509h = null;
            this.f4510i = null;
            m5283d();
            this.f4517p = 0;
            this.f4518q = -1;
            RecyclerView.m5154q(this);
        }

        /* renamed from: E */
        void m5272E() {
            if (this.f4505d == -1) {
                this.f4505d = this.f4504c;
            }
        }

        /* renamed from: F */
        void m5273F(int i10, int i11) {
            this.f4511j = (i10 & i11) | (this.f4511j & (~i11));
        }

        /* renamed from: G */
        public final void m5274G(boolean z10) {
            int i10 = this.f4514m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f4514m = i11;
            if (i11 < 0) {
                this.f4514m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i11 == 1) {
                this.f4511j |= 16;
            } else if (z10 && i11 == 0) {
                this.f4511j &= -17;
            }
        }

        /* renamed from: H */
        void m5275H(C0896w c0896w, boolean z10) {
            this.f4515n = c0896w;
            this.f4516o = z10;
        }

        /* renamed from: I */
        boolean m5276I() {
            return (this.f4511j & 16) != 0;
        }

        /* renamed from: J */
        public boolean m5277J() {
            return (this.f4511j & 128) != 0;
        }

        /* renamed from: K */
        void m5278K() {
            this.f4515n.m5527J(this);
        }

        /* renamed from: L */
        boolean m5279L() {
            return (this.f4511j & 32) != 0;
        }

        /* renamed from: a */
        void m5280a(Object obj) {
            if (obj == null) {
                m5281b(1024);
            } else if ((1024 & this.f4511j) == 0) {
                m5267g();
                this.f4512k.add(obj);
            }
        }

        /* renamed from: b */
        void m5281b(int i10) {
            this.f4511j = i10 | this.f4511j;
        }

        /* renamed from: c */
        void m5282c() {
            this.f4505d = -1;
            this.f4508g = -1;
        }

        /* renamed from: d */
        void m5283d() {
            List<Object> list = this.f4512k;
            if (list != null) {
                list.clear();
            }
            this.f4511j &= -1025;
        }

        /* renamed from: e */
        void m5284e() {
            this.f4511j &= -33;
        }

        /* renamed from: f */
        void m5285f() {
            this.f4511j &= -257;
        }

        /* renamed from: h */
        boolean m5286h() {
            return (this.f4511j & 16) == 0 && C0690v.m3811R(this.f4502a);
        }

        /* renamed from: i */
        void m5287i(int i10, int i11, boolean z10) {
            m5281b(8);
            m5268A(i11, z10);
            this.f4504c = i10;
        }

        /* renamed from: j */
        public final int m5288j() {
            RecyclerView recyclerView = this.f4519r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m5199a0(this);
        }

        /* renamed from: k */
        public final long m5289k() {
            return this.f4506e;
        }

        /* renamed from: l */
        public final int m5290l() {
            return this.f4507f;
        }

        /* renamed from: m */
        public final int m5291m() {
            int i10 = this.f4508g;
            return i10 == -1 ? this.f4504c : i10;
        }

        /* renamed from: n */
        public final int m5292n() {
            return this.f4505d;
        }

        /* renamed from: o */
        List<Object> m5293o() {
            if ((this.f4511j & 1024) == 0) {
                List<Object> list = this.f4512k;
                if (list != null && list.size() != 0) {
                    return this.f4513l;
                }
                return f4501t;
            }
            return f4501t;
        }

        /* renamed from: p */
        boolean m5294p(int i10) {
            return (i10 & this.f4511j) != 0;
        }

        /* renamed from: q */
        boolean m5295q() {
            return (this.f4511j & 512) != 0 || m5298t();
        }

        /* renamed from: r */
        boolean m5296r() {
            return (this.f4502a.getParent() == null || this.f4502a.getParent() == this.f4519r) ? false : true;
        }

        /* renamed from: s */
        public boolean m5297s() {
            return (this.f4511j & 1) != 0;
        }

        /* renamed from: t */
        public boolean m5298t() {
            return (this.f4511j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4504c + " id=" + this.f4506e + ", oldPos=" + this.f4505d + ", pLpos:" + this.f4508g);
            if (m5301w()) {
                sb2.append(" scrap ");
                sb2.append(this.f4516o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m5298t()) {
                sb2.append(" invalid");
            }
            if (!m5297s()) {
                sb2.append(" unbound");
            }
            if (m5304z()) {
                sb2.append(" update");
            }
            if (m5300v()) {
                sb2.append(" removed");
            }
            if (m5277J()) {
                sb2.append(" ignored");
            }
            if (m5302x()) {
                sb2.append(" tmpDetached");
            }
            if (!m5299u()) {
                sb2.append(" not recyclable(" + this.f4514m + ")");
            }
            if (m5295q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f4502a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* renamed from: u */
        public final boolean m5299u() {
            return (this.f4511j & 16) == 0 && !C0690v.m3811R(this.f4502a);
        }

        /* renamed from: v */
        public boolean m5300v() {
            return (this.f4511j & 8) != 0;
        }

        /* renamed from: w */
        boolean m5301w() {
            return this.f4515n != null;
        }

        /* renamed from: x */
        boolean m5302x() {
            return (this.f4511j & 256) != 0;
        }

        /* renamed from: y */
        boolean m5303y() {
            return (this.f4511j & 2) != 0;
        }

        /* renamed from: z */
        boolean m5304z() {
            return (this.f4511j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C0878e implements C0907b.b {
        C0878e() {
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: a */
        public View mo5305a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: b */
        public void mo5306b(View view) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0 != null) {
                m5142e0.m5269B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: c */
        public AbstractC0877d0 mo5307c(View view) {
            return RecyclerView.m5142e0(view);
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: d */
        public void mo5308d(int i10) {
            AbstractC0877d0 m5142e0;
            View mo5305a = mo5305a(i10);
            if (mo5305a != null && (m5142e0 = RecyclerView.m5142e0(mo5305a)) != null) {
                if (m5142e0.m5302x() && !m5142e0.m5277J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m5142e0 + RecyclerView.this.m5182O());
                }
                m5142e0.m5281b(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: e */
        public void mo5309e(View view) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0 != null) {
                m5142e0.m5270C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: f */
        public void mo5310f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.m5242x(view);
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: g */
        public int mo5311g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: h */
        public void mo5312h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.m5243y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: i */
        public void mo5313i() {
            int mo5311g = mo5311g();
            for (int i10 = 0; i10 < mo5311g; i10++) {
                View mo5305a = mo5305a(i10);
                RecyclerView.this.m5243y(mo5305a);
                mo5305a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: j */
        public void mo5314j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0 != null) {
                if (!m5142e0.m5302x() && !m5142e0.m5277J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m5142e0 + RecyclerView.this.m5182O());
                }
                m5142e0.m5285f();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C0907b.b
        /* renamed from: k */
        public int mo5315k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C0879f implements C0906a.a {
        C0879f() {
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: a */
        public void mo5316a(int i10, int i11) {
            RecyclerView.this.m5163B0(i10, i11);
            RecyclerView.this.f4470y0 = true;
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: b */
        public void mo5317b(C0906a.b bVar) {
            m5324i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: c */
        public AbstractC0877d0 mo5318c(int i10) {
            AbstractC0877d0 m5195Y = RecyclerView.this.m5195Y(i10, true);
            if (m5195Y == null || RecyclerView.this.f4455r.m5722n(m5195Y.f4502a)) {
                return null;
            }
            return m5195Y;
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: d */
        public void mo5319d(int i10, int i11) {
            RecyclerView.this.m5164C0(i10, i11, false);
            RecyclerView.this.f4470y0 = true;
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: e */
        public void mo5320e(int i10, int i11) {
            RecyclerView.this.m5162A0(i10, i11);
            RecyclerView.this.f4470y0 = true;
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: f */
        public void mo5321f(int i10, int i11) {
            RecyclerView.this.m5164C0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4470y0 = true;
            recyclerView.f4464v0.f4478d += i11;
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: g */
        public void mo5322g(C0906a.b bVar) {
            m5324i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0906a.a
        /* renamed from: h */
        public void mo5323h(int i10, int i11, Object obj) {
            RecyclerView.this.m5240v1(i10, i11, obj);
            RecyclerView.this.f4472z0 = true;
        }

        /* renamed from: i */
        void m5324i(C0906a.b bVar) {
            int i10 = bVar.f4664a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4471z.mo5012R0(recyclerView, bVar.f4665b, bVar.f4667d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4471z.mo5017U0(recyclerView2, bVar.f4665b, bVar.f4667d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4471z.mo5018W0(recyclerView3, bVar.f4665b, bVar.f4667d, bVar.f4666c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4471z.mo5015T0(recyclerView4, bVar.f4665b, bVar.f4667d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0880g {

        /* renamed from: a */
        static final /* synthetic */ int[] f4523a;

        static {
            int[] iArr = new int[AbstractC0881h.a.values().length];
            f4523a = iArr;
            try {
                iArr[AbstractC0881h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4523a[AbstractC0881h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0881h<VH extends AbstractC0877d0> {

        /* renamed from: a */
        private final C0882i f4524a = new C0882i();

        /* renamed from: b */
        private boolean f4525b = false;

        /* renamed from: c */
        private a f4526c = a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m5325a(VH vh, int i10) {
            boolean z10 = vh.f4520s == null;
            if (z10) {
                vh.f4504c = i10;
                if (m5332h()) {
                    vh.f4506e = mo5329e(i10);
                }
                vh.m5273F(1, 519);
                C0632k.m3360a("RV OnBindView");
            }
            vh.f4520s = this;
            m5336l(vh, i10, vh.m5293o());
            if (z10) {
                vh.m5283d();
                ViewGroup.LayoutParams layoutParams = vh.f4502a.getLayoutParams();
                if (layoutParams instanceof C0890q) {
                    ((C0890q) layoutParams).f4568c = true;
                }
                C0632k.m3361b();
            }
        }

        /* renamed from: b */
        boolean m5326b() {
            int i10 = C0880g.f4523a[this.f4526c.ordinal()];
            if (i10 != 1) {
                return i10 != 2 || mo5328d() > 0;
            }
            return false;
        }

        /* renamed from: c */
        public final VH m5327c(ViewGroup viewGroup, int i10) {
            try {
                C0632k.m3360a("RV CreateView");
                VH mo5337m = mo5337m(viewGroup, i10);
                if (mo5337m.f4502a.getParent() == null) {
                    mo5337m.f4507f = i10;
                    return mo5337m;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0632k.m3361b();
            }
        }

        /* renamed from: d */
        public abstract int mo5328d();

        /* renamed from: e */
        public long mo5329e(int i10) {
            return -1L;
        }

        /* renamed from: f */
        public int m5330f(int i10) {
            return 0;
        }

        /* renamed from: g */
        public final boolean m5331g() {
            return this.f4524a.m5346a();
        }

        /* renamed from: h */
        public final boolean m5332h() {
            return this.f4525b;
        }

        /* renamed from: i */
        public final void m5333i() {
            this.f4524a.m5347b();
        }

        /* renamed from: j */
        public void m5334j(RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public abstract void mo5335k(VH vh, int i10);

        /* renamed from: l */
        public void m5336l(VH vh, int i10, List<Object> list) {
            mo5335k(vh, i10);
        }

        /* renamed from: m */
        public abstract VH mo5337m(ViewGroup viewGroup, int i10);

        /* renamed from: n */
        public void m5338n(RecyclerView recyclerView) {
        }

        /* renamed from: o */
        public boolean m5339o(VH vh) {
            return false;
        }

        /* renamed from: p */
        public void m5340p(VH vh) {
        }

        /* renamed from: q */
        public void m5341q(VH vh) {
        }

        /* renamed from: r */
        public void m5342r(VH vh) {
        }

        /* renamed from: s */
        public void m5343s(AbstractC0883j abstractC0883j) {
            this.f4524a.registerObserver(abstractC0883j);
        }

        /* renamed from: t */
        public void m5344t(boolean z10) {
            if (!m5331g()) {
                this.f4525b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: u */
        public void m5345u(AbstractC0883j abstractC0883j) {
            this.f4524a.unregisterObserver(abstractC0883j);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static class C0882i extends Observable<AbstractC0883j> {
        C0882i() {
        }

        /* renamed from: a */
        public boolean m5346a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m5347b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0883j) ((Observable) this).mObservers.get(size)).mo5348a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0883j {
        /* renamed from: a */
        public void mo5348a() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0884k {
        /* renamed from: a */
        int m5349a(int i10, int i11);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static class C0885l {
        /* renamed from: a */
        protected EdgeEffect m5350a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0886m {

        /* renamed from: a */
        private b f4531a = null;

        /* renamed from: b */
        private ArrayList<a> f4532b = new ArrayList<>();

        /* renamed from: c */
        private long f4533c = 120;

        /* renamed from: d */
        private long f4534d = 120;

        /* renamed from: e */
        private long f4535e = 250;

        /* renamed from: f */
        private long f4536f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            void m5373a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        /* loaded from: classes.dex */
        public interface b {
            /* renamed from: a */
            void mo5374a(AbstractC0877d0 abstractC0877d0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f4537a;

            /* renamed from: b */
            public int f4538b;

            /* renamed from: c */
            public int f4539c;

            /* renamed from: d */
            public int f4540d;

            /* renamed from: a */
            public c m5375a(AbstractC0877d0 abstractC0877d0) {
                return m5376b(abstractC0877d0, 0);
            }

            /* renamed from: b */
            public c m5376b(AbstractC0877d0 abstractC0877d0, int i10) {
                View view = abstractC0877d0.f4502a;
                this.f4537a = view.getLeft();
                this.f4538b = view.getTop();
                this.f4539c = view.getRight();
                this.f4540d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m5351e(AbstractC0877d0 abstractC0877d0) {
            int i10 = abstractC0877d0.f4511j & 14;
            if (abstractC0877d0.m5298t()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int m5292n = abstractC0877d0.m5292n();
            int m5288j = abstractC0877d0.m5288j();
            return (m5292n == -1 || m5288j == -1 || m5292n == m5288j) ? i10 : i10 | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo5352a(AbstractC0877d0 abstractC0877d0, c cVar, c cVar2);

        /* renamed from: b */
        public abstract boolean mo5353b(AbstractC0877d0 abstractC0877d0, AbstractC0877d0 abstractC0877d02, c cVar, c cVar2);

        /* renamed from: c */
        public abstract boolean mo5354c(AbstractC0877d0 abstractC0877d0, c cVar, c cVar2);

        /* renamed from: d */
        public abstract boolean mo5355d(AbstractC0877d0 abstractC0877d0, c cVar, c cVar2);

        /* renamed from: f */
        public abstract boolean mo5356f(AbstractC0877d0 abstractC0877d0);

        /* renamed from: g */
        public boolean mo5357g(AbstractC0877d0 abstractC0877d0, List<Object> list) {
            return mo5356f(abstractC0877d0);
        }

        /* renamed from: h */
        public final void m5358h(AbstractC0877d0 abstractC0877d0) {
            m5368r(abstractC0877d0);
            b bVar = this.f4531a;
            if (bVar != null) {
                bVar.mo5374a(abstractC0877d0);
            }
        }

        /* renamed from: i */
        public final void m5359i() {
            int size = this.f4532b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4532b.get(i10).m5373a();
            }
            this.f4532b.clear();
        }

        /* renamed from: j */
        public abstract void mo5360j(AbstractC0877d0 abstractC0877d0);

        /* renamed from: k */
        public abstract void mo5361k();

        /* renamed from: l */
        public long m5362l() {
            return this.f4533c;
        }

        /* renamed from: m */
        public long m5363m() {
            return this.f4536f;
        }

        /* renamed from: n */
        public long m5364n() {
            return this.f4535e;
        }

        /* renamed from: o */
        public long m5365o() {
            return this.f4534d;
        }

        /* renamed from: p */
        public abstract boolean mo5366p();

        /* renamed from: q */
        public c m5367q() {
            return new c();
        }

        /* renamed from: r */
        public void m5368r(AbstractC0877d0 abstractC0877d0) {
        }

        /* renamed from: s */
        public c m5369s(C0871a0 c0871a0, AbstractC0877d0 abstractC0877d0) {
            return m5367q().m5375a(abstractC0877d0);
        }

        /* renamed from: t */
        public c m5370t(C0871a0 c0871a0, AbstractC0877d0 abstractC0877d0, int i10, List<Object> list) {
            return m5367q().m5375a(abstractC0877d0);
        }

        /* renamed from: u */
        public abstract void mo5371u();

        /* renamed from: v */
        void m5372v(b bVar) {
            this.f4531a = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public class C0887n implements AbstractC0886m.b {
        C0887n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m.b
        /* renamed from: a */
        public void mo5374a(AbstractC0877d0 abstractC0877d0) {
            abstractC0877d0.m5274G(true);
            if (abstractC0877d0.f4509h != null && abstractC0877d0.f4510i == null) {
                abstractC0877d0.f4509h = null;
            }
            abstractC0877d0.f4510i = null;
            if (abstractC0877d0.m5276I() || RecyclerView.this.m5189U0(abstractC0877d0.f4502a) || !abstractC0877d0.m5302x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0877d0.f4502a, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0888o {
        @Deprecated
        /* renamed from: d */
        public void m5377d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: e */
        public void m5378e(Rect rect, View view, RecyclerView recyclerView, C0871a0 c0871a0) {
            m5377d(rect, ((C0890q) view.getLayoutParams()).m5491a(), recyclerView);
        }

        @Deprecated
        /* renamed from: f */
        public void m5379f(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo5380g(Canvas canvas, RecyclerView recyclerView, C0871a0 c0871a0) {
            m5379f(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void m5381h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo5382i(Canvas canvas, RecyclerView recyclerView, C0871a0 c0871a0) {
            m5381h(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0889p {

        /* renamed from: a */
        C0907b f4542a;

        /* renamed from: b */
        RecyclerView f4543b;

        /* renamed from: c */
        private final C0920o.b f4544c;

        /* renamed from: d */
        private final C0920o.b f4545d;

        /* renamed from: e */
        C0920o f4546e;

        /* renamed from: f */
        C0920o f4547f;

        /* renamed from: g */
        AbstractC0899z f4548g;

        /* renamed from: h */
        boolean f4549h;

        /* renamed from: i */
        boolean f4550i;

        /* renamed from: j */
        boolean f4551j;

        /* renamed from: k */
        private boolean f4552k;

        /* renamed from: l */
        private boolean f4553l;

        /* renamed from: m */
        int f4554m;

        /* renamed from: n */
        boolean f4555n;

        /* renamed from: o */
        private int f4556o;

        /* renamed from: p */
        private int f4557p;

        /* renamed from: q */
        private int f4558q;

        /* renamed from: r */
        private int f4559r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        /* loaded from: classes.dex */
        public class a implements C0920o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: a */
            public View mo5485a(int i10) {
                return AbstractC0889p.this.m5410I(i10);
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: b */
            public int mo5486b() {
                return AbstractC0889p.this.m5465o0() - AbstractC0889p.this.m5446f0();
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: c */
            public int mo5487c(View view) {
                return AbstractC0889p.this.m5421Q(view) - ((ViewGroup.MarginLayoutParams) ((C0890q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: d */
            public int mo5488d() {
                return AbstractC0889p.this.m5444e0();
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: e */
            public int mo5489e(View view) {
                return AbstractC0889p.this.m5425T(view) + ((ViewGroup.MarginLayoutParams) ((C0890q) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        /* loaded from: classes.dex */
        public class b implements C0920o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: a */
            public View mo5485a(int i10) {
                return AbstractC0889p.this.m5410I(i10);
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: b */
            public int mo5486b() {
                return AbstractC0889p.this.m5429W() - AbstractC0889p.this.m5442d0();
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: c */
            public int mo5487c(View view) {
                return AbstractC0889p.this.m5426U(view) - ((ViewGroup.MarginLayoutParams) ((C0890q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: d */
            public int mo5488d() {
                return AbstractC0889p.this.m5448g0();
            }

            @Override // androidx.recyclerview.widget.C0920o.b
            /* renamed from: e */
            public int mo5489e(View view) {
                return AbstractC0889p.this.m5418O(view) + ((ViewGroup.MarginLayoutParams) ((C0890q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        /* loaded from: classes.dex */
        public interface c {
            /* renamed from: a */
            void mo5490a(int i10, int i11);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f4562a;

            /* renamed from: b */
            public int f4563b;

            /* renamed from: c */
            public boolean f4564c;

            /* renamed from: d */
            public boolean f4565d;
        }

        public AbstractC0889p() {
            a aVar = new a();
            this.f4544c = aVar;
            b bVar = new b();
            this.f4545d = bVar;
            this.f4546e = new C0920o(aVar);
            this.f4547f = new C0920o(bVar);
            this.f4549h = false;
            this.f4550i = false;
            this.f4551j = false;
            this.f4552k = true;
            this.f4553l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L38;
         */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m5383K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0889p.m5383K(int, int, int, int, boolean):int");
        }

        /* renamed from: L */
        private int[] m5384L(View view, Rect rect) {
            int[] iArr = new int[2];
            int m5444e0 = m5444e0();
            int m5448g0 = m5448g0();
            int m5465o0 = m5465o0() - m5446f0();
            int m5429W = m5429W() - m5442d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i10 = left - m5444e0;
            int min = Math.min(0, i10);
            int i11 = top - m5448g0;
            int min2 = Math.min(0, i11);
            int i12 = width - m5465o0;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, height - m5429W);
            if (m5432Z() != 1) {
                if (min == 0) {
                    min = Math.min(i10, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i12);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: f */
        private void m5385f(View view, int i10, boolean z10) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (!z10 && !m5142e0.m5300v()) {
                this.f4543b.f4457s.m5885p(m5142e0);
            } else {
                this.f4543b.f4457s.m5872b(m5142e0);
            }
            C0890q c0890q = (C0890q) view.getLayoutParams();
            if (!m5142e0.m5279L() && !m5142e0.m5301w()) {
                if (view.getParent() == this.f4543b) {
                    int m5721m = this.f4542a.m5721m(view);
                    if (i10 == -1) {
                        i10 = this.f4542a.m5717g();
                    }
                    if (m5721m == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4543b.indexOfChild(view) + this.f4543b.m5182O());
                    }
                    if (m5721m != i10) {
                        this.f4543b.f4471z.m5396B0(m5721m, i10);
                    }
                } else {
                    this.f4542a.m5711a(view, i10, false);
                    c0890q.f4568c = true;
                    AbstractC0899z abstractC0899z = this.f4548g;
                    if (abstractC0899z != null && abstractC0899z.m5562h()) {
                        this.f4548g.m5565k(view);
                    }
                }
            } else {
                if (m5142e0.m5301w()) {
                    m5142e0.m5278K();
                } else {
                    m5142e0.m5284e();
                }
                this.f4542a.m5713c(view, i10, view.getLayoutParams(), false);
            }
            if (c0890q.f4569d) {
                m5142e0.f4502a.invalidate();
                c0890q.f4569d = false;
            }
        }

        /* renamed from: i0 */
        public static d m5386i0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3468c.f14397f, i10, i11);
            dVar.f4562a = obtainStyledAttributes.getInt(C3468c.f14398g, 1);
            dVar.f4563b = obtainStyledAttributes.getInt(C3468c.f14408q, 1);
            dVar.f4564c = obtainStyledAttributes.getBoolean(C3468c.f14407p, false);
            dVar.f4565d = obtainStyledAttributes.getBoolean(C3468c.f14409r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: n */
        public static int m5387n(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        /* renamed from: t0 */
        private boolean m5388t0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m5444e0 = m5444e0();
            int m5448g0 = m5448g0();
            int m5465o0 = m5465o0() - m5446f0();
            int m5429W = m5429W() - m5442d0();
            Rect rect = this.f4543b.f4463v;
            m5420P(focusedChild, rect);
            return rect.left - i10 < m5465o0 && rect.right - i10 > m5444e0 && rect.top - i11 < m5429W && rect.bottom - i11 > m5448g0;
        }

        /* renamed from: v1 */
        private void m5389v1(C0896w c0896w, int i10, View view) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0.m5277J()) {
                return;
            }
            if (m5142e0.m5298t() && !m5142e0.m5300v() && !this.f4543b.f4469y.m5332h()) {
                m5470q1(i10);
                c0896w.m5521C(m5142e0);
            } else {
                m5479x(i10);
                c0896w.m5522D(view);
                this.f4543b.f4457s.m5881k(m5142e0);
            }
        }

        /* renamed from: w0 */
        private static boolean m5390w0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        /* renamed from: y */
        private void m5391y(int i10, View view) {
            this.f4542a.m5714d(i10);
        }

        /* renamed from: A */
        void m5392A(RecyclerView recyclerView, C0896w c0896w) {
            this.f4550i = false;
            mo5070I0(recyclerView, c0896w);
        }

        /* renamed from: A0 */
        public void m5393A0(View view, int i10, int i11) {
            C0890q c0890q = (C0890q) view.getLayoutParams();
            Rect m5210i0 = this.f4543b.m5210i0(view);
            int i12 = i10 + m5210i0.left + m5210i0.right;
            int i13 = i11 + m5210i0.top + m5210i0.bottom;
            int m5383K = m5383K(m5465o0(), m5467p0(), m5444e0() + m5446f0() + ((ViewGroup.MarginLayoutParams) c0890q).leftMargin + ((ViewGroup.MarginLayoutParams) c0890q).rightMargin + i12, ((ViewGroup.MarginLayoutParams) c0890q).width, mo5088k());
            int m5383K2 = m5383K(m5429W(), m5430X(), m5448g0() + m5442d0() + ((ViewGroup.MarginLayoutParams) c0890q).topMargin + ((ViewGroup.MarginLayoutParams) c0890q).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) c0890q).height, mo5090l());
            if (m5404F1(view, m5383K, m5383K2, c0890q)) {
                view.measure(m5383K, m5383K2);
            }
        }

        /* renamed from: A1 */
        void m5394A1(int i10, int i11) {
            this.f4558q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f4556o = mode;
            if (mode == 0 && !RecyclerView.f4389R0) {
                this.f4558q = 0;
            }
            this.f4559r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4557p = mode2;
            if (mode2 != 0 || RecyclerView.f4389R0) {
                return;
            }
            this.f4559r = 0;
        }

        /* renamed from: B */
        public View m5395B(View view) {
            View m5185Q;
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView == null || (m5185Q = recyclerView.m5185Q(view)) == null || this.f4542a.m5722n(m5185Q)) {
                return null;
            }
            return m5185Q;
        }

        /* renamed from: B0 */
        public void m5396B0(int i10, int i11) {
            View m5410I = m5410I(i10);
            if (m5410I != null) {
                m5479x(i10);
                m5450h(m5410I, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f4543b.toString());
            }
        }

        /* renamed from: B1 */
        public void m5397B1(int i10, int i11) {
            this.f4543b.setMeasuredDimension(i10, i11);
        }

        /* renamed from: C */
        public View mo5068C(int i10) {
            int m5411J = m5411J();
            for (int i11 = 0; i11 < m5411J; i11++) {
                View m5410I = m5410I(i11);
                AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(m5410I);
                if (m5142e0 != null && m5142e0.m5291m() == i10 && !m5142e0.m5277J() && (this.f4543b.f4464v0.m5254e() || !m5142e0.m5300v())) {
                    return m5410I;
                }
            }
            return null;
        }

        /* renamed from: C0 */
        public void mo5398C0(int i10) {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                recyclerView.m5244y0(i10);
            }
        }

        /* renamed from: C1 */
        public void mo5003C1(Rect rect, int i10, int i11) {
            m5397B1(m5387n(i10, rect.width() + m5444e0() + m5446f0(), m5440c0()), m5387n(i11, rect.height() + m5448g0() + m5442d0(), m5437b0()));
        }

        /* renamed from: D */
        public abstract C0890q mo5004D();

        /* renamed from: D0 */
        public void mo5399D0(int i10) {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                recyclerView.m5245z0(i10);
            }
        }

        /* renamed from: D1 */
        void m5400D1(int i10, int i11) {
            int m5411J = m5411J();
            if (m5411J == 0) {
                this.f4543b.m5238v(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < m5411J; i16++) {
                View m5410I = m5410I(i16);
                Rect rect = this.f4543b.f4463v;
                m5420P(m5410I, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f4543b.f4463v.set(i14, i15, i12, i13);
            mo5003C1(this.f4543b.f4463v, i10, i11);
        }

        /* renamed from: E */
        public C0890q mo5005E(Context context, AttributeSet attributeSet) {
            return new C0890q(context, attributeSet);
        }

        /* renamed from: E0 */
        public void mo5401E0(AbstractC0881h abstractC0881h, AbstractC0881h abstractC0881h2) {
        }

        /* renamed from: E1 */
        void m5402E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4543b = null;
                this.f4542a = null;
                this.f4558q = 0;
                this.f4559r = 0;
            } else {
                this.f4543b = recyclerView;
                this.f4542a = recyclerView.f4455r;
                this.f4558q = recyclerView.getWidth();
                this.f4559r = recyclerView.getHeight();
            }
            this.f4556o = 1073741824;
            this.f4557p = 1073741824;
        }

        /* renamed from: F */
        public C0890q mo5006F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C0890q) {
                return new C0890q((C0890q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C0890q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C0890q(layoutParams);
        }

        /* renamed from: F0 */
        public boolean m5403F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        /* renamed from: F1 */
        public boolean m5404F1(View view, int i10, int i11, C0890q c0890q) {
            return (!view.isLayoutRequested() && this.f4552k && m5390w0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c0890q).width) && m5390w0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c0890q).height)) ? false : true;
        }

        /* renamed from: G */
        public int m5405G() {
            return -1;
        }

        /* renamed from: G0 */
        public void m5406G0(RecyclerView recyclerView) {
        }

        /* renamed from: G1 */
        boolean mo5069G1() {
            return false;
        }

        /* renamed from: H */
        public int m5407H(View view) {
            return ((C0890q) view.getLayoutParams()).f4567b.bottom;
        }

        @Deprecated
        /* renamed from: H0 */
        public void m5408H0(RecyclerView recyclerView) {
        }

        /* renamed from: H1 */
        public boolean m5409H1(View view, int i10, int i11, C0890q c0890q) {
            return (this.f4552k && m5390w0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c0890q).width) && m5390w0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c0890q).height)) ? false : true;
        }

        /* renamed from: I */
        public View m5410I(int i10) {
            C0907b c0907b = this.f4542a;
            if (c0907b != null) {
                return c0907b.m5716f(i10);
            }
            return null;
        }

        /* renamed from: I0 */
        public void mo5070I0(RecyclerView recyclerView, C0896w c0896w) {
            m5408H0(recyclerView);
        }

        /* renamed from: I1 */
        public void mo5071I1(RecyclerView recyclerView, C0871a0 c0871a0, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: J */
        public int m5411J() {
            C0907b c0907b = this.f4542a;
            if (c0907b != null) {
                return c0907b.m5717g();
            }
            return 0;
        }

        /* renamed from: J0 */
        public View mo5007J0(View view, int i10, C0896w c0896w, C0871a0 c0871a0) {
            return null;
        }

        /* renamed from: J1 */
        public void m5412J1(AbstractC0899z abstractC0899z) {
            AbstractC0899z abstractC0899z2 = this.f4548g;
            if (abstractC0899z2 != null && abstractC0899z != abstractC0899z2 && abstractC0899z2.m5562h()) {
                this.f4548g.m5572r();
            }
            this.f4548g = abstractC0899z;
            abstractC0899z.m5571q(this.f4543b, this);
        }

        /* renamed from: K0 */
        public void mo5072K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4543b;
            m5414L0(recyclerView.f4449o, recyclerView.f4464v0, accessibilityEvent);
        }

        /* renamed from: K1 */
        void m5413K1() {
            AbstractC0899z abstractC0899z = this.f4548g;
            if (abstractC0899z != null) {
                abstractC0899z.m5572r();
            }
        }

        /* renamed from: L0 */
        public void m5414L0(C0896w c0896w, C0871a0 c0871a0, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4543b.canScrollVertically(-1) && !this.f4543b.canScrollHorizontally(-1) && !this.f4543b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            AbstractC0881h abstractC0881h = this.f4543b.f4469y;
            if (abstractC0881h != null) {
                accessibilityEvent.setItemCount(abstractC0881h.mo5328d());
            }
        }

        /* renamed from: L1 */
        public boolean mo5008L1() {
            return false;
        }

        /* renamed from: M */
        public boolean m5415M() {
            RecyclerView recyclerView = this.f4543b;
            return recyclerView != null && recyclerView.f4459t;
        }

        /* renamed from: M0 */
        public void m5416M0(C0660c c0660c) {
            RecyclerView recyclerView = this.f4543b;
            m5417N0(recyclerView.f4449o, recyclerView.f4464v0, c0660c);
        }

        /* renamed from: N */
        public int mo5009N(C0896w c0896w, C0871a0 c0871a0) {
            return -1;
        }

        /* renamed from: N0 */
        public void m5417N0(C0896w c0896w, C0871a0 c0871a0, C0660c c0660c) {
            if (this.f4543b.canScrollVertically(-1) || this.f4543b.canScrollHorizontally(-1)) {
                c0660c.m3533a(8192);
                c0660c.m3562r0(true);
            }
            if (this.f4543b.canScrollVertically(1) || this.f4543b.canScrollHorizontally(1)) {
                c0660c.m3533a(4096);
                c0660c.m3562r0(true);
            }
            c0660c.m3536b0(C0660c.c.m3579a(mo5023k0(c0896w, c0871a0), mo5009N(c0896w, c0871a0), m5477v0(c0896w, c0871a0), m5459l0(c0896w, c0871a0)));
        }

        /* renamed from: O */
        public int m5418O(View view) {
            return view.getBottom() + m5407H(view);
        }

        /* renamed from: O0 */
        public void m5419O0(View view, C0660c c0660c) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0 == null || m5142e0.m5300v() || this.f4542a.m5722n(m5142e0.f4502a)) {
                return;
            }
            RecyclerView recyclerView = this.f4543b;
            mo5011P0(recyclerView.f4449o, recyclerView.f4464v0, view, c0660c);
        }

        /* renamed from: P */
        public void m5420P(View view, Rect rect) {
            RecyclerView.m5144f0(view, rect);
        }

        /* renamed from: P0 */
        public void mo5011P0(C0896w c0896w, C0871a0 c0871a0, View view, C0660c c0660c) {
        }

        /* renamed from: Q */
        public int m5421Q(View view) {
            return view.getLeft() - m5434a0(view);
        }

        /* renamed from: Q0 */
        public View m5422Q0(View view, int i10) {
            return null;
        }

        /* renamed from: R */
        public int m5423R(View view) {
            Rect rect = ((C0890q) view.getLayoutParams()).f4567b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: R0 */
        public void mo5012R0(RecyclerView recyclerView, int i10, int i11) {
        }

        /* renamed from: S */
        public int m5424S(View view) {
            Rect rect = ((C0890q) view.getLayoutParams()).f4567b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: S0 */
        public void mo5013S0(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public int m5425T(View view) {
            return view.getRight() + m5456j0(view);
        }

        /* renamed from: T0 */
        public void mo5015T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        /* renamed from: U */
        public int m5426U(View view) {
            return view.getTop() - m5461m0(view);
        }

        /* renamed from: U0 */
        public void mo5017U0(RecyclerView recyclerView, int i10, int i11) {
        }

        /* renamed from: V */
        public View m5427V() {
            View focusedChild;
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4542a.m5722n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V0 */
        public void m5428V0(RecyclerView recyclerView, int i10, int i11) {
        }

        /* renamed from: W */
        public int m5429W() {
            return this.f4559r;
        }

        /* renamed from: W0 */
        public void mo5018W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            m5428V0(recyclerView, i10, i11);
        }

        /* renamed from: X */
        public int m5430X() {
            return this.f4557p;
        }

        /* renamed from: X0 */
        public void mo5019X0(C0896w c0896w, C0871a0 c0871a0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Y */
        public int m5431Y() {
            RecyclerView recyclerView = this.f4543b;
            AbstractC0881h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo5328d();
            }
            return 0;
        }

        /* renamed from: Y0 */
        public void mo5020Y0(C0871a0 c0871a0) {
        }

        /* renamed from: Z */
        public int m5432Z() {
            return C0690v.m3791E(this.f4543b);
        }

        /* renamed from: Z0 */
        public void m5433Z0(C0896w c0896w, C0871a0 c0871a0, int i10, int i11) {
            this.f4543b.m5238v(i10, i11);
        }

        /* renamed from: a0 */
        public int m5434a0(View view) {
            return ((C0890q) view.getLayoutParams()).f4567b.left;
        }

        @Deprecated
        /* renamed from: a1 */
        public boolean m5435a1(RecyclerView recyclerView, View view, View view2) {
            return m5480x0() || recyclerView.m5233s0();
        }

        /* renamed from: b */
        public void m5436b(View view) {
            m5439c(view, -1);
        }

        /* renamed from: b0 */
        public int m5437b0() {
            return C0690v.m3793F(this.f4543b);
        }

        /* renamed from: b1 */
        public boolean m5438b1(RecyclerView recyclerView, C0871a0 c0871a0, View view, View view2) {
            return m5435a1(recyclerView, view, view2);
        }

        /* renamed from: c */
        public void m5439c(View view, int i10) {
            m5385f(view, i10, true);
        }

        /* renamed from: c0 */
        public int m5440c0() {
            return C0690v.m3795G(this.f4543b);
        }

        /* renamed from: c1 */
        public void mo5084c1(Parcelable parcelable) {
        }

        /* renamed from: d */
        public void m5441d(View view) {
            m5443e(view, -1);
        }

        /* renamed from: d0 */
        public int m5442d0() {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: d1 */
        public Parcelable mo5086d1() {
            return null;
        }

        /* renamed from: e */
        public void m5443e(View view, int i10) {
            m5385f(view, i10, false);
        }

        /* renamed from: e0 */
        public int m5444e0() {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: e1 */
        public void mo5445e1(int i10) {
        }

        /* renamed from: f0 */
        public int m5446f0() {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: f1 */
        void m5447f1(AbstractC0899z abstractC0899z) {
            if (this.f4548g == abstractC0899z) {
                this.f4548g = null;
            }
        }

        /* renamed from: g */
        public void mo5087g(String str) {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                recyclerView.m5221n(str);
            }
        }

        /* renamed from: g0 */
        public int m5448g0() {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: g1 */
        public boolean m5449g1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4543b;
            return m5452h1(recyclerView.f4449o, recyclerView.f4464v0, i10, bundle);
        }

        /* renamed from: h */
        public void m5450h(View view, int i10) {
            m5453i(view, i10, (C0890q) view.getLayoutParams());
        }

        /* renamed from: h0 */
        public int m5451h0(View view) {
            return ((C0890q) view.getLayoutParams()).m5491a();
        }

        /* renamed from: h1 */
        public boolean m5452h1(C0896w c0896w, C0871a0 c0871a0, int i10, Bundle bundle) {
            int m5429W;
            int m5465o0;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                m5429W = recyclerView.canScrollVertically(1) ? (m5429W() - m5448g0()) - m5442d0() : 0;
                if (this.f4543b.canScrollHorizontally(1)) {
                    m5465o0 = (m5465o0() - m5444e0()) - m5446f0();
                    i11 = m5429W;
                    i12 = m5465o0;
                }
                i11 = m5429W;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                m5429W = recyclerView.canScrollVertically(-1) ? -((m5429W() - m5448g0()) - m5442d0()) : 0;
                if (this.f4543b.canScrollHorizontally(-1)) {
                    m5465o0 = -((m5465o0() - m5444e0()) - m5446f0());
                    i11 = m5429W;
                    i12 = m5465o0;
                }
                i11 = m5429W;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f4543b.m5222n1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: i */
        public void m5453i(View view, int i10, C0890q c0890q) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0.m5300v()) {
                this.f4543b.f4457s.m5872b(m5142e0);
            } else {
                this.f4543b.f4457s.m5885p(m5142e0);
            }
            this.f4542a.m5713c(view, i10, c0890q, m5142e0.m5300v());
        }

        /* renamed from: i1 */
        public boolean m5454i1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4543b;
            return m5457j1(recyclerView.f4449o, recyclerView.f4464v0, view, i10, bundle);
        }

        /* renamed from: j */
        public void m5455j(View view, Rect rect) {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m5210i0(view));
            }
        }

        /* renamed from: j0 */
        public int m5456j0(View view) {
            return ((C0890q) view.getLayoutParams()).f4567b.right;
        }

        /* renamed from: j1 */
        public boolean m5457j1(C0896w c0896w, C0871a0 c0871a0, View view, int i10, Bundle bundle) {
            return false;
        }

        /* renamed from: k */
        public boolean mo5088k() {
            return false;
        }

        /* renamed from: k0 */
        public int mo5023k0(C0896w c0896w, C0871a0 c0871a0) {
            return -1;
        }

        /* renamed from: k1 */
        public void m5458k1(C0896w c0896w) {
            for (int m5411J = m5411J() - 1; m5411J >= 0; m5411J--) {
                if (!RecyclerView.m5142e0(m5410I(m5411J)).m5277J()) {
                    m5464n1(m5411J, c0896w);
                }
            }
        }

        /* renamed from: l */
        public boolean mo5090l() {
            return false;
        }

        /* renamed from: l0 */
        public int m5459l0(C0896w c0896w, C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: l1 */
        void m5460l1(C0896w c0896w) {
            int m5539j = c0896w.m5539j();
            for (int i10 = m5539j - 1; i10 >= 0; i10--) {
                View m5543n = c0896w.m5543n(i10);
                AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(m5543n);
                if (!m5142e0.m5277J()) {
                    m5142e0.m5274G(false);
                    if (m5142e0.m5302x()) {
                        this.f4543b.removeDetachedView(m5543n, false);
                    }
                    AbstractC0886m abstractC0886m = this.f4543b.f4437d0;
                    if (abstractC0886m != null) {
                        abstractC0886m.mo5360j(m5142e0);
                    }
                    m5142e0.m5274G(true);
                    c0896w.m5552y(m5543n);
                }
            }
            c0896w.m5534e();
            if (m5539j > 0) {
                this.f4543b.invalidate();
            }
        }

        /* renamed from: m */
        public boolean mo5024m(C0890q c0890q) {
            return c0890q != null;
        }

        /* renamed from: m0 */
        public int m5461m0(View view) {
            return ((C0890q) view.getLayoutParams()).f4567b.top;
        }

        /* renamed from: m1 */
        public void m5462m1(View view, C0896w c0896w) {
            m5468p1(view);
            c0896w.m5520B(view);
        }

        /* renamed from: n0 */
        public void m5463n0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((C0890q) view.getLayoutParams()).f4567b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4543b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4543b.f4467x;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: n1 */
        public void m5464n1(int i10, C0896w c0896w) {
            View m5410I = m5410I(i10);
            m5470q1(i10);
            c0896w.m5520B(m5410I);
        }

        /* renamed from: o */
        public void mo5094o(int i10, int i11, C0871a0 c0871a0, c cVar) {
        }

        /* renamed from: o0 */
        public int m5465o0() {
            return this.f4558q;
        }

        /* renamed from: o1 */
        public boolean m5466o1(Runnable runnable) {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: p */
        public void mo5095p(int i10, c cVar) {
        }

        /* renamed from: p0 */
        public int m5467p0() {
            return this.f4556o;
        }

        /* renamed from: p1 */
        public void m5468p1(View view) {
            this.f4542a.m5724p(view);
        }

        /* renamed from: q */
        public int mo5096q(C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: q0 */
        public boolean m5469q0() {
            int m5411J = m5411J();
            for (int i10 = 0; i10 < m5411J; i10++) {
                ViewGroup.LayoutParams layoutParams = m5410I(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q1 */
        public void m5470q1(int i10) {
            if (m5410I(i10) != null) {
                this.f4542a.m5725q(i10);
            }
        }

        /* renamed from: r */
        public int mo5027r(C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: r0 */
        public boolean m5471r0() {
            return this.f4550i;
        }

        /* renamed from: r1 */
        public boolean m5472r1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return m5473s1(recyclerView, view, rect, z10, false);
        }

        /* renamed from: s */
        public int mo5028s(C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo5097s0() {
            return this.f4551j;
        }

        /* renamed from: s1 */
        public boolean m5473s1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] m5384L = m5384L(view, rect);
            int i10 = m5384L[0];
            int i11 = m5384L[1];
            if ((z11 && !m5388t0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.m5216k1(i10, i11);
            }
            return true;
        }

        /* renamed from: t */
        public int mo5098t(C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: t1 */
        public void m5474t1() {
            RecyclerView recyclerView = this.f4543b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: u */
        public int mo5029u(C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: u0 */
        public final boolean m5475u0() {
            return this.f4553l;
        }

        /* renamed from: u1 */
        public void m5476u1() {
            this.f4549h = true;
        }

        /* renamed from: v */
        public int mo5030v(C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: v0 */
        public boolean m5477v0(C0896w c0896w, C0871a0 c0871a0) {
            return false;
        }

        /* renamed from: w */
        public void m5478w(C0896w c0896w) {
            for (int m5411J = m5411J() - 1; m5411J >= 0; m5411J--) {
                m5389v1(c0896w, m5411J, m5410I(m5411J));
            }
        }

        /* renamed from: w1 */
        public int mo5031w1(int i10, C0896w c0896w, C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: x */
        public void m5479x(int i10) {
            m5391y(i10, m5410I(i10));
        }

        /* renamed from: x0 */
        public boolean m5480x0() {
            AbstractC0899z abstractC0899z = this.f4548g;
            return abstractC0899z != null && abstractC0899z.m5562h();
        }

        /* renamed from: x1 */
        public void mo5100x1(int i10) {
        }

        /* renamed from: y0 */
        public boolean m5481y0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f4546e.m5864b(view, 24579) && this.f4547f.m5864b(view, 24579);
            return z10 ? z12 : !z12;
        }

        /* renamed from: y1 */
        public int mo5032y1(int i10, C0896w c0896w, C0871a0 c0871a0) {
            return 0;
        }

        /* renamed from: z */
        void m5482z(RecyclerView recyclerView) {
            this.f4550i = true;
            m5406G0(recyclerView);
        }

        /* renamed from: z0 */
        public void m5483z0(View view, int i10, int i11, int i12, int i13) {
            C0890q c0890q = (C0890q) view.getLayoutParams();
            Rect rect = c0890q.f4567b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c0890q).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c0890q).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c0890q).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0890q).bottomMargin);
        }

        /* renamed from: z1 */
        void m5484z1(RecyclerView recyclerView) {
            m5394A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public interface InterfaceC0891r {
        /* renamed from: a */
        void m5495a(View view);

        /* renamed from: b */
        void m5496b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0892s {
        /* renamed from: a */
        public abstract boolean mo5497a(int i10, int i11);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public interface InterfaceC0893t {
        /* renamed from: a */
        boolean mo5498a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo5499b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo5500c(boolean z10);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0894u {
        /* renamed from: a */
        public void mo5501a(RecyclerView recyclerView, int i10) {
        }

        /* renamed from: b */
        public void mo5502b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public static class C0895v {

        /* renamed from: a */
        SparseArray<a> f4570a = new SparseArray<>();

        /* renamed from: b */
        private int f4571b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList<AbstractC0877d0> f4572a = new ArrayList<>();

            /* renamed from: b */
            int f4573b = 5;

            /* renamed from: c */
            long f4574c = 0;

            /* renamed from: d */
            long f4575d = 0;

            a() {
            }
        }

        /* renamed from: g */
        private a m5503g(int i10) {
            a aVar = this.f4570a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4570a.put(i10, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        void m5504a() {
            this.f4571b++;
        }

        /* renamed from: b */
        public void m5505b() {
            for (int i10 = 0; i10 < this.f4570a.size(); i10++) {
                this.f4570a.valueAt(i10).f4572a.clear();
            }
        }

        /* renamed from: c */
        void m5506c() {
            this.f4571b--;
        }

        /* renamed from: d */
        void m5507d(int i10, long j10) {
            a m5503g = m5503g(i10);
            m5503g.f4575d = m5512j(m5503g.f4575d, j10);
        }

        /* renamed from: e */
        void m5508e(int i10, long j10) {
            a m5503g = m5503g(i10);
            m5503g.f4574c = m5512j(m5503g.f4574c, j10);
        }

        /* renamed from: f */
        public AbstractC0877d0 m5509f(int i10) {
            a aVar = this.f4570a.get(i10);
            if (aVar == null || aVar.f4572a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0877d0> arrayList = aVar.f4572a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m5296r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m5510h(AbstractC0881h abstractC0881h, AbstractC0881h abstractC0881h2, boolean z10) {
            if (abstractC0881h != null) {
                m5506c();
            }
            if (!z10 && this.f4571b == 0) {
                m5505b();
            }
            if (abstractC0881h2 != null) {
                m5504a();
            }
        }

        /* renamed from: i */
        public void m5511i(AbstractC0877d0 abstractC0877d0) {
            int m5290l = abstractC0877d0.m5290l();
            ArrayList<AbstractC0877d0> arrayList = m5503g(m5290l).f4572a;
            if (this.f4570a.get(m5290l).f4573b <= arrayList.size()) {
                return;
            }
            abstractC0877d0.m5271D();
            arrayList.add(abstractC0877d0);
        }

        /* renamed from: j */
        long m5512j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        /* renamed from: k */
        boolean m5513k(int i10, long j10, long j11) {
            long j12 = m5503g(i10).f4575d;
            return j12 == 0 || j10 + j12 < j11;
        }

        /* renamed from: l */
        boolean m5514l(int i10, long j10, long j11) {
            long j12 = m5503g(i10).f4574c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public final class C0896w {

        /* renamed from: a */
        final ArrayList<AbstractC0877d0> f4576a;

        /* renamed from: b */
        ArrayList<AbstractC0877d0> f4577b;

        /* renamed from: c */
        final ArrayList<AbstractC0877d0> f4578c;

        /* renamed from: d */
        private final List<AbstractC0877d0> f4579d;

        /* renamed from: e */
        private int f4580e;

        /* renamed from: f */
        int f4581f;

        /* renamed from: g */
        C0895v f4582g;

        public C0896w() {
            ArrayList<AbstractC0877d0> arrayList = new ArrayList<>();
            this.f4576a = arrayList;
            this.f4577b = null;
            this.f4578c = new ArrayList<>();
            this.f4579d = Collections.unmodifiableList(arrayList);
            this.f4580e = 2;
            this.f4581f = 2;
        }

        /* renamed from: H */
        private boolean m5515H(AbstractC0877d0 abstractC0877d0, int i10, int i11, long j10) {
            abstractC0877d0.f4520s = null;
            abstractC0877d0.f4519r = RecyclerView.this;
            int m5290l = abstractC0877d0.m5290l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f4582g.m5513k(m5290l, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.f4469y.m5325a(abstractC0877d0, i10);
            this.f4582g.m5507d(abstractC0877d0.m5290l(), RecyclerView.this.getNanoTime() - nanoTime);
            m5516b(abstractC0877d0);
            if (!RecyclerView.this.f4464v0.m5254e()) {
                return true;
            }
            abstractC0877d0.f4508g = i11;
            return true;
        }

        /* renamed from: b */
        private void m5516b(AbstractC0877d0 abstractC0877d0) {
            if (RecyclerView.this.m5230r0()) {
                View view = abstractC0877d0.f4502a;
                if (C0690v.m3787C(view) == 0) {
                    C0690v.m3871z0(view, 1);
                }
                C0916k c0916k = RecyclerView.this.f4401C0;
                if (c0916k == null) {
                    return;
                }
                C0656a m5835n = c0916k.m5835n();
                if (m5835n instanceof C0916k.a) {
                    ((C0916k.a) m5835n).m5838o(view);
                }
                C0690v.m3853q0(view, m5835n);
            }
        }

        /* renamed from: q */
        private void m5517q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5517q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: r */
        private void m5518r(AbstractC0877d0 abstractC0877d0) {
            View view = abstractC0877d0.f4502a;
            if (view instanceof ViewGroup) {
                m5517q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m5519A(int i10) {
            m5531a(this.f4578c.get(i10), true);
            this.f4578c.remove(i10);
        }

        /* renamed from: B */
        public void m5520B(View view) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (m5142e0.m5302x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m5142e0.m5301w()) {
                m5142e0.m5278K();
            } else if (m5142e0.m5279L()) {
                m5142e0.m5284e();
            }
            m5521C(m5142e0);
            if (RecyclerView.this.f4437d0 == null || m5142e0.m5299u()) {
                return;
            }
            RecyclerView.this.f4437d0.mo5360j(m5142e0);
        }

        /* renamed from: C */
        void m5521C(AbstractC0877d0 abstractC0877d0) {
            boolean z10;
            boolean z11 = true;
            if (!abstractC0877d0.m5301w() && abstractC0877d0.f4502a.getParent() == null) {
                if (!abstractC0877d0.m5302x()) {
                    if (!abstractC0877d0.m5277J()) {
                        boolean m5286h = abstractC0877d0.m5286h();
                        AbstractC0881h abstractC0881h = RecyclerView.this.f4469y;
                        if ((abstractC0881h != null && m5286h && abstractC0881h.m5339o(abstractC0877d0)) || abstractC0877d0.m5299u()) {
                            if (this.f4581f <= 0 || abstractC0877d0.m5294p(526)) {
                                z10 = false;
                            } else {
                                int size = this.f4578c.size();
                                if (size >= this.f4581f && size > 0) {
                                    m5519A(0);
                                    size--;
                                }
                                if (RecyclerView.f4391T0 && size > 0 && !RecyclerView.this.f4462u0.m5783d(abstractC0877d0.f4504c)) {
                                    int i10 = size - 1;
                                    while (i10 >= 0) {
                                        if (!RecyclerView.this.f4462u0.m5783d(this.f4578c.get(i10).f4504c)) {
                                            break;
                                        } else {
                                            i10--;
                                        }
                                    }
                                    size = i10 + 1;
                                }
                                this.f4578c.add(size, abstractC0877d0);
                                z10 = true;
                            }
                            if (!z10) {
                                m5531a(abstractC0877d0, true);
                                r1 = z10;
                                RecyclerView.this.f4457s.m5886q(abstractC0877d0);
                                if (r1 && !z11 && m5286h) {
                                    abstractC0877d0.f4520s = null;
                                    abstractC0877d0.f4519r = null;
                                    return;
                                }
                                return;
                            }
                            r1 = z10;
                        }
                        z11 = false;
                        RecyclerView.this.f4457s.m5886q(abstractC0877d0);
                        if (r1) {
                            return;
                        } else {
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m5182O());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0877d0 + RecyclerView.this.m5182O());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(abstractC0877d0.m5301w());
            sb2.append(" isAttached:");
            sb2.append(abstractC0877d0.f4502a.getParent() != null);
            sb2.append(RecyclerView.this.m5182O());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* renamed from: D */
        void m5522D(View view) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            if (!m5142e0.m5294p(12) && m5142e0.m5303y() && !RecyclerView.this.m5223o(m5142e0)) {
                if (this.f4577b == null) {
                    this.f4577b = new ArrayList<>();
                }
                m5142e0.m5275H(this, true);
                this.f4577b.add(m5142e0);
                return;
            }
            if (m5142e0.m5298t() && !m5142e0.m5300v() && !RecyclerView.this.f4469y.m5332h()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m5182O());
            }
            m5142e0.m5275H(this, false);
            this.f4576a.add(m5142e0);
        }

        /* renamed from: E */
        void m5523E(C0895v c0895v) {
            C0895v c0895v2 = this.f4582g;
            if (c0895v2 != null) {
                c0895v2.m5506c();
            }
            this.f4582g = c0895v;
            if (c0895v == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4582g.m5504a();
        }

        /* renamed from: F */
        void m5524F(AbstractC0873b0 abstractC0873b0) {
        }

        /* renamed from: G */
        public void m5525G(int i10) {
            this.f4580e = i10;
            m5528K();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0877d0 m5526I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0896w.m5526I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* renamed from: J */
        void m5527J(AbstractC0877d0 abstractC0877d0) {
            if (abstractC0877d0.f4516o) {
                this.f4577b.remove(abstractC0877d0);
            } else {
                this.f4576a.remove(abstractC0877d0);
            }
            abstractC0877d0.f4515n = null;
            abstractC0877d0.f4516o = false;
            abstractC0877d0.m5284e();
        }

        /* renamed from: K */
        public void m5528K() {
            AbstractC0889p abstractC0889p = RecyclerView.this.f4471z;
            this.f4581f = this.f4580e + (abstractC0889p != null ? abstractC0889p.f4554m : 0);
            for (int size = this.f4578c.size() - 1; size >= 0 && this.f4578c.size() > this.f4581f; size--) {
                m5519A(size);
            }
        }

        /* renamed from: L */
        boolean m5529L(AbstractC0877d0 abstractC0877d0) {
            if (abstractC0877d0.m5300v()) {
                return RecyclerView.this.f4464v0.m5254e();
            }
            int i10 = abstractC0877d0.f4504c;
            if (i10 >= 0 && i10 < RecyclerView.this.f4469y.mo5328d()) {
                if (RecyclerView.this.f4464v0.m5254e() || RecyclerView.this.f4469y.m5330f(abstractC0877d0.f4504c) == abstractC0877d0.m5290l()) {
                    return !RecyclerView.this.f4469y.m5332h() || abstractC0877d0.m5289k() == RecyclerView.this.f4469y.mo5329e(abstractC0877d0.f4504c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0877d0 + RecyclerView.this.m5182O());
        }

        /* renamed from: M */
        void m5530M(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f4578c.size() - 1; size >= 0; size--) {
                AbstractC0877d0 abstractC0877d0 = this.f4578c.get(size);
                if (abstractC0877d0 != null && (i12 = abstractC0877d0.f4504c) >= i10 && i12 < i13) {
                    abstractC0877d0.m5281b(2);
                    m5519A(size);
                }
            }
        }

        /* renamed from: a */
        public void m5531a(AbstractC0877d0 abstractC0877d0, boolean z10) {
            RecyclerView.m5154q(abstractC0877d0);
            View view = abstractC0877d0.f4502a;
            C0916k c0916k = RecyclerView.this.f4401C0;
            if (c0916k != null) {
                C0656a m5835n = c0916k.m5835n();
                C0690v.m3853q0(view, m5835n instanceof C0916k.a ? ((C0916k.a) m5835n).m5837n(view) : null);
            }
            if (z10) {
                m5536g(abstractC0877d0);
            }
            abstractC0877d0.f4520s = null;
            abstractC0877d0.f4519r = null;
            m5538i().m5511i(abstractC0877d0);
        }

        /* renamed from: c */
        public void m5532c() {
            this.f4576a.clear();
            m5553z();
        }

        /* renamed from: d */
        void m5533d() {
            int size = this.f4578c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4578c.get(i10).m5282c();
            }
            int size2 = this.f4576a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f4576a.get(i11).m5282c();
            }
            ArrayList<AbstractC0877d0> arrayList = this.f4577b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f4577b.get(i12).m5282c();
                }
            }
        }

        /* renamed from: e */
        void m5534e() {
            this.f4576a.clear();
            ArrayList<AbstractC0877d0> arrayList = this.f4577b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m5535f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f4464v0.m5251b()) {
                return !RecyclerView.this.f4464v0.m5254e() ? i10 : RecyclerView.this.f4453q.m5699m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f4464v0.m5251b() + RecyclerView.this.m5182O());
        }

        /* renamed from: g */
        void m5536g(AbstractC0877d0 abstractC0877d0) {
            InterfaceC0897x interfaceC0897x = RecyclerView.this.f4396A;
            if (interfaceC0897x != null) {
                interfaceC0897x.m5554a(abstractC0877d0);
            }
            int size = RecyclerView.this.f4398B.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f4398B.get(i10).m5554a(abstractC0877d0);
            }
            AbstractC0881h abstractC0881h = RecyclerView.this.f4469y;
            if (abstractC0881h != null) {
                abstractC0881h.m5342r(abstractC0877d0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4464v0 != null) {
                recyclerView.f4457s.m5886q(abstractC0877d0);
            }
        }

        /* renamed from: h */
        AbstractC0877d0 m5537h(int i10) {
            int size;
            int m5699m;
            ArrayList<AbstractC0877d0> arrayList = this.f4577b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC0877d0 abstractC0877d0 = this.f4577b.get(i11);
                    if (!abstractC0877d0.m5279L() && abstractC0877d0.m5291m() == i10) {
                        abstractC0877d0.m5281b(32);
                        return abstractC0877d0;
                    }
                }
                if (RecyclerView.this.f4469y.m5332h() && (m5699m = RecyclerView.this.f4453q.m5699m(i10)) > 0 && m5699m < RecyclerView.this.f4469y.mo5328d()) {
                    long mo5329e = RecyclerView.this.f4469y.mo5329e(m5699m);
                    for (int i12 = 0; i12 < size; i12++) {
                        AbstractC0877d0 abstractC0877d02 = this.f4577b.get(i12);
                        if (!abstractC0877d02.m5279L() && abstractC0877d02.m5289k() == mo5329e) {
                            abstractC0877d02.m5281b(32);
                            return abstractC0877d02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C0895v m5538i() {
            if (this.f4582g == null) {
                this.f4582g = new C0895v();
            }
            return this.f4582g;
        }

        /* renamed from: j */
        int m5539j() {
            return this.f4576a.size();
        }

        /* renamed from: k */
        public List<AbstractC0877d0> m5540k() {
            return this.f4579d;
        }

        /* renamed from: l */
        AbstractC0877d0 m5541l(long j10, int i10, boolean z10) {
            for (int size = this.f4576a.size() - 1; size >= 0; size--) {
                AbstractC0877d0 abstractC0877d0 = this.f4576a.get(size);
                if (abstractC0877d0.m5289k() == j10 && !abstractC0877d0.m5279L()) {
                    if (i10 == abstractC0877d0.m5290l()) {
                        abstractC0877d0.m5281b(32);
                        if (abstractC0877d0.m5300v() && !RecyclerView.this.f4464v0.m5254e()) {
                            abstractC0877d0.m5273F(2, 14);
                        }
                        return abstractC0877d0;
                    }
                    if (!z10) {
                        this.f4576a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0877d0.f4502a, false);
                        m5552y(abstractC0877d0.f4502a);
                    }
                }
            }
            int size2 = this.f4578c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0877d0 abstractC0877d02 = this.f4578c.get(size2);
                if (abstractC0877d02.m5289k() == j10 && !abstractC0877d02.m5296r()) {
                    if (i10 == abstractC0877d02.m5290l()) {
                        if (!z10) {
                            this.f4578c.remove(size2);
                        }
                        return abstractC0877d02;
                    }
                    if (!z10) {
                        m5519A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC0877d0 m5542m(int i10, boolean z10) {
            View m5715e;
            int size = this.f4576a.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0877d0 abstractC0877d0 = this.f4576a.get(i11);
                if (!abstractC0877d0.m5279L() && abstractC0877d0.m5291m() == i10 && !abstractC0877d0.m5298t() && (RecyclerView.this.f4464v0.f4482h || !abstractC0877d0.m5300v())) {
                    abstractC0877d0.m5281b(32);
                    return abstractC0877d0;
                }
            }
            if (!z10 && (m5715e = RecyclerView.this.f4455r.m5715e(i10)) != null) {
                AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(m5715e);
                RecyclerView.this.f4455r.m5727s(m5715e);
                int m5721m = RecyclerView.this.f4455r.m5721m(m5715e);
                if (m5721m != -1) {
                    RecyclerView.this.f4455r.m5714d(m5721m);
                    m5522D(m5715e);
                    m5142e0.m5281b(8224);
                    return m5142e0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m5142e0 + RecyclerView.this.m5182O());
            }
            int size2 = this.f4578c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC0877d0 abstractC0877d02 = this.f4578c.get(i12);
                if (!abstractC0877d02.m5298t() && abstractC0877d02.m5291m() == i10 && !abstractC0877d02.m5296r()) {
                    if (!z10) {
                        this.f4578c.remove(i12);
                    }
                    return abstractC0877d02;
                }
            }
            return null;
        }

        /* renamed from: n */
        View m5543n(int i10) {
            return this.f4576a.get(i10).f4502a;
        }

        /* renamed from: o */
        public View m5544o(int i10) {
            return m5545p(i10, false);
        }

        /* renamed from: p */
        View m5545p(int i10, boolean z10) {
            return m5526I(i10, z10, Long.MAX_VALUE).f4502a;
        }

        /* renamed from: s */
        void m5546s() {
            int size = this.f4578c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0890q c0890q = (C0890q) this.f4578c.get(i10).f4502a.getLayoutParams();
                if (c0890q != null) {
                    c0890q.f4568c = true;
                }
            }
        }

        /* renamed from: t */
        void m5547t() {
            int size = this.f4578c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0877d0 abstractC0877d0 = this.f4578c.get(i10);
                if (abstractC0877d0 != null) {
                    abstractC0877d0.m5281b(6);
                    abstractC0877d0.m5280a(null);
                }
            }
            AbstractC0881h abstractC0881h = RecyclerView.this.f4469y;
            if (abstractC0881h == null || !abstractC0881h.m5332h()) {
                m5553z();
            }
        }

        /* renamed from: u */
        void m5548u(int i10, int i11) {
            int size = this.f4578c.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC0877d0 abstractC0877d0 = this.f4578c.get(i12);
                if (abstractC0877d0 != null && abstractC0877d0.f4504c >= i10) {
                    abstractC0877d0.m5268A(i11, false);
                }
            }
        }

        /* renamed from: v */
        void m5549v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f4578c.size();
            for (int i16 = 0; i16 < size; i16++) {
                AbstractC0877d0 abstractC0877d0 = this.f4578c.get(i16);
                if (abstractC0877d0 != null && (i15 = abstractC0877d0.f4504c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        abstractC0877d0.m5268A(i11 - i10, false);
                    } else {
                        abstractC0877d0.m5268A(i12, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m5550w(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f4578c.size() - 1; size >= 0; size--) {
                AbstractC0877d0 abstractC0877d0 = this.f4578c.get(size);
                if (abstractC0877d0 != null) {
                    int i13 = abstractC0877d0.f4504c;
                    if (i13 >= i12) {
                        abstractC0877d0.m5268A(-i11, z10);
                    } else if (i13 >= i10) {
                        abstractC0877d0.m5281b(8);
                        m5519A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m5551x(AbstractC0881h abstractC0881h, AbstractC0881h abstractC0881h2, boolean z10) {
            m5532c();
            m5538i().m5510h(abstractC0881h, abstractC0881h2, z10);
        }

        /* renamed from: y */
        void m5552y(View view) {
            AbstractC0877d0 m5142e0 = RecyclerView.m5142e0(view);
            m5142e0.f4515n = null;
            m5142e0.f4516o = false;
            m5142e0.m5284e();
            m5521C(m5142e0);
        }

        /* renamed from: z */
        void m5553z() {
            for (int size = this.f4578c.size() - 1; size >= 0; size--) {
                m5519A(size);
            }
            this.f4578c.clear();
            if (RecyclerView.f4391T0) {
                RecyclerView.this.f4462u0.m5781b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public interface InterfaceC0897x {
        /* renamed from: a */
        void m5554a(AbstractC0877d0 abstractC0877d0);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public class C0898y extends AbstractC0883j {
        C0898y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0883j
        /* renamed from: a */
        public void mo5348a() {
            RecyclerView.this.m5221n(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4464v0.f4481g = true;
            recyclerView.m5183O0(true);
            if (RecyclerView.this.f4453q.m5702p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0899z {

        /* renamed from: b */
        private RecyclerView f4586b;

        /* renamed from: c */
        private AbstractC0889p f4587c;

        /* renamed from: d */
        private boolean f4588d;

        /* renamed from: e */
        private boolean f4589e;

        /* renamed from: f */
        private View f4590f;

        /* renamed from: h */
        private boolean f4592h;

        /* renamed from: a */
        private int f4585a = -1;

        /* renamed from: g */
        private final a f4591g = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private int f4593a;

            /* renamed from: b */
            private int f4594b;

            /* renamed from: c */
            private int f4595c;

            /* renamed from: d */
            private int f4596d;

            /* renamed from: e */
            private Interpolator f4597e;

            /* renamed from: f */
            private boolean f4598f;

            /* renamed from: g */
            private int f4599g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m5573e() {
                if (this.f4597e != null && this.f4595c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4595c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m5574a() {
                return this.f4596d >= 0;
            }

            /* renamed from: b */
            public void m5575b(int i10) {
                this.f4596d = i10;
            }

            /* renamed from: c */
            void m5576c(RecyclerView recyclerView) {
                int i10 = this.f4596d;
                if (i10 >= 0) {
                    this.f4596d = -1;
                    recyclerView.m5237u0(i10);
                    this.f4598f = false;
                } else {
                    if (this.f4598f) {
                        m5573e();
                        recyclerView.f4458s0.m5261e(this.f4593a, this.f4594b, this.f4595c, this.f4597e);
                        int i11 = this.f4599g + 1;
                        this.f4599g = i11;
                        if (i11 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f4598f = false;
                        return;
                    }
                    this.f4599g = 0;
                }
            }

            /* renamed from: d */
            public void m5577d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4593a = i10;
                this.f4594b = i11;
                this.f4595c = i12;
                this.f4597e = interpolator;
                this.f4598f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4596d = -1;
                this.f4598f = false;
                this.f4599g = 0;
                this.f4593a = i10;
                this.f4594b = i11;
                this.f4595c = i12;
                this.f4597e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        /* loaded from: classes.dex */
        public interface b {
            /* renamed from: a */
            PointF mo5081a(int i10);
        }

        /* renamed from: a */
        public PointF m5555a(int i10) {
            Object m5559e = m5559e();
            if (m5559e instanceof b) {
                return ((b) m5559e).mo5081a(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m5556b(int i10) {
            return this.f4586b.f4471z.mo5068C(i10);
        }

        /* renamed from: c */
        public int m5557c() {
            return this.f4586b.f4471z.m5411J();
        }

        /* renamed from: d */
        public int m5558d(View view) {
            return this.f4586b.m5201c0(view);
        }

        /* renamed from: e */
        public AbstractC0889p m5559e() {
            return this.f4587c;
        }

        /* renamed from: f */
        public int m5560f() {
            return this.f4585a;
        }

        /* renamed from: g */
        public boolean m5561g() {
            return this.f4588d;
        }

        /* renamed from: h */
        public boolean m5562h() {
            return this.f4589e;
        }

        /* renamed from: i */
        public void m5563i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        void m5564j(int i10, int i11) {
            PointF m5555a;
            RecyclerView recyclerView = this.f4586b;
            if (this.f4585a == -1 || recyclerView == null) {
                m5572r();
            }
            if (this.f4588d && this.f4590f == null && this.f4587c != null && (m5555a = m5555a(this.f4585a)) != null) {
                float f10 = m5555a.x;
                if (f10 != 0.0f || m5555a.y != 0.0f) {
                    recyclerView.m5205f1((int) Math.signum(f10), (int) Math.signum(m5555a.y), null);
                }
            }
            this.f4588d = false;
            View view = this.f4590f;
            if (view != null) {
                if (m5558d(view) == this.f4585a) {
                    mo5569o(this.f4590f, recyclerView.f4464v0, this.f4591g);
                    this.f4591g.m5576c(recyclerView);
                    m5572r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4590f = null;
                }
            }
            if (this.f4589e) {
                mo5566l(i10, i11, recyclerView.f4464v0, this.f4591g);
                boolean m5574a = this.f4591g.m5574a();
                this.f4591g.m5576c(recyclerView);
                if (m5574a && this.f4589e) {
                    this.f4588d = true;
                    recyclerView.f4458s0.m5260d();
                }
            }
        }

        /* renamed from: k */
        protected void m5565k(View view) {
            if (m5558d(view) == m5560f()) {
                this.f4590f = view;
            }
        }

        /* renamed from: l */
        protected abstract void mo5566l(int i10, int i11, C0871a0 c0871a0, a aVar);

        /* renamed from: m */
        protected abstract void mo5567m();

        /* renamed from: n */
        protected abstract void mo5568n();

        /* renamed from: o */
        protected abstract void mo5569o(View view, C0871a0 c0871a0, a aVar);

        /* renamed from: p */
        public void m5570p(int i10) {
            this.f4585a = i10;
        }

        /* renamed from: q */
        void m5571q(RecyclerView recyclerView, AbstractC0889p abstractC0889p) {
            recyclerView.f4458s0.m5262f();
            if (this.f4592h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4586b = recyclerView;
            this.f4587c = abstractC0889p;
            int i10 = this.f4585a;
            if (i10 != -1) {
                recyclerView.f4464v0.f4475a = i10;
                this.f4589e = true;
                this.f4588d = true;
                this.f4590f = m5556b(m5560f());
                mo5567m();
                this.f4586b.f4458s0.m5260d();
                this.f4592h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: r */
        public final void m5572r() {
            if (this.f4589e) {
                this.f4589e = false;
                mo5568n();
                this.f4586b.f4464v0.f4475a = -1;
                this.f4590f = null;
                this.f4585a = -1;
                this.f4588d = false;
                this.f4587c.m5447f1(this);
                this.f4587c = null;
                this.f4586b = null;
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f4388Q0 = false;
        f4389R0 = i10 >= 23;
        f4390S0 = true;
        f4391T0 = true;
        f4392U0 = false;
        f4393V0 = false;
        Class<?> cls = Integer.TYPE;
        f4394W0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4395X0 = new InterpolatorC0874c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3466a.f14388a);
    }

    /* renamed from: B */
    private void m5120B() {
        this.f4464v0.m5250a(1);
        m5184P(this.f4464v0);
        this.f4464v0.f4484j = false;
        m5226p1();
        this.f4457s.m5876f();
        m5169F0();
        m5126N0();
        m5139c1();
        C0871a0 c0871a0 = this.f4464v0;
        c0871a0.f4483i = c0871a0.f4485k && this.f4472z0;
        this.f4472z0 = false;
        this.f4470y0 = false;
        c0871a0.f4482h = c0871a0.f4486l;
        c0871a0.f4480f = this.f4469y.mo5328d();
        m5131T(this.f4405E0);
        if (this.f4464v0.f4485k) {
            int m5717g = this.f4455r.m5717g();
            for (int i10 = 0; i10 < m5717g; i10++) {
                AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5716f(i10));
                if (!m5142e0.m5277J() && (!m5142e0.m5298t() || this.f4469y.m5332h())) {
                    this.f4457s.m5875e(m5142e0, this.f4437d0.m5370t(this.f4464v0, m5142e0, AbstractC0886m.m5351e(m5142e0), m5142e0.m5293o()));
                    if (this.f4464v0.f4483i && m5142e0.m5303y() && !m5142e0.m5300v() && !m5142e0.m5277J() && !m5142e0.m5298t()) {
                        this.f4457s.m5873c(m5200b0(m5142e0), m5142e0);
                    }
                }
            }
        }
        if (this.f4464v0.f4486l) {
            m5203d1();
            C0871a0 c0871a02 = this.f4464v0;
            boolean z10 = c0871a02.f4481g;
            c0871a02.f4481g = false;
            this.f4471z.mo5019X0(this.f4449o, c0871a02);
            this.f4464v0.f4481g = z10;
            for (int i11 = 0; i11 < this.f4455r.m5717g(); i11++) {
                AbstractC0877d0 m5142e02 = m5142e0(this.f4455r.m5716f(i11));
                if (!m5142e02.m5277J() && !this.f4457s.m5879i(m5142e02)) {
                    int m5351e = AbstractC0886m.m5351e(m5142e02);
                    boolean m5294p = m5142e02.m5294p(8192);
                    if (!m5294p) {
                        m5351e |= 4096;
                    }
                    AbstractC0886m.c m5370t = this.f4437d0.m5370t(this.f4464v0, m5142e02, m5351e, m5142e02.m5293o());
                    if (m5294p) {
                        m5186Q0(m5142e02, m5370t);
                    } else {
                        this.f4457s.m5871a(m5142e02, m5370t);
                    }
                }
            }
            m5229r();
        } else {
            m5229r();
        }
        m5171G0();
        m5231r1(false);
        this.f4464v0.f4479e = 2;
    }

    /* renamed from: C */
    private void m5121C() {
        m5226p1();
        m5169F0();
        this.f4464v0.m5250a(6);
        this.f4453q.m5697j();
        this.f4464v0.f4480f = this.f4469y.mo5328d();
        this.f4464v0.f4478d = 0;
        if (this.f4451p != null && this.f4469y.m5326b()) {
            Parcelable parcelable = this.f4451p.f4473n;
            if (parcelable != null) {
                this.f4471z.mo5084c1(parcelable);
            }
            this.f4451p = null;
        }
        C0871a0 c0871a0 = this.f4464v0;
        c0871a0.f4482h = false;
        this.f4471z.mo5019X0(this.f4449o, c0871a0);
        C0871a0 c0871a02 = this.f4464v0;
        c0871a02.f4481g = false;
        c0871a02.f4485k = c0871a02.f4485k && this.f4437d0 != null;
        c0871a02.f4479e = 4;
        m5171G0();
        m5231r1(false);
    }

    /* renamed from: D */
    private void m5122D() {
        this.f4464v0.m5250a(4);
        m5226p1();
        m5169F0();
        C0871a0 c0871a0 = this.f4464v0;
        c0871a0.f4479e = 1;
        if (c0871a0.f4485k) {
            for (int m5717g = this.f4455r.m5717g() - 1; m5717g >= 0; m5717g--) {
                AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5716f(m5717g));
                if (!m5142e0.m5277J()) {
                    long m5200b0 = m5200b0(m5142e0);
                    AbstractC0886m.c m5369s = this.f4437d0.m5369s(this.f4464v0, m5142e0);
                    AbstractC0877d0 m5877g = this.f4457s.m5877g(m5200b0);
                    if (m5877g != null && !m5877g.m5277J()) {
                        boolean m5878h = this.f4457s.m5878h(m5877g);
                        boolean m5878h2 = this.f4457s.m5878h(m5142e0);
                        if (m5878h && m5877g == m5142e0) {
                            this.f4457s.m5874d(m5142e0, m5369s);
                        } else {
                            AbstractC0886m.c m5883n = this.f4457s.m5883n(m5877g);
                            this.f4457s.m5874d(m5142e0, m5369s);
                            AbstractC0886m.c m5882m = this.f4457s.m5882m(m5142e0);
                            if (m5883n == null) {
                                m5148j0(m5200b0, m5142e0, m5877g);
                            } else {
                                m5149l(m5877g, m5142e0, m5883n, m5882m, m5878h, m5878h2);
                            }
                        }
                    } else {
                        this.f4457s.m5874d(m5142e0, m5369s);
                    }
                }
            }
            this.f4457s.m5884o(this.f4425O0);
        }
        this.f4471z.m5460l1(this.f4449o);
        C0871a0 c0871a02 = this.f4464v0;
        c0871a02.f4477c = c0871a02.f4480f;
        this.f4428R = false;
        this.f4429S = false;
        c0871a02.f4485k = false;
        c0871a02.f4486l = false;
        this.f4471z.f4549h = false;
        ArrayList<AbstractC0877d0> arrayList = this.f4449o.f4577b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p.f4555n) {
            abstractC0889p.f4554m = 0;
            abstractC0889p.f4555n = false;
            this.f4449o.m5528K();
        }
        this.f4471z.mo5020Y0(this.f4464v0);
        m5171G0();
        m5231r1(false);
        this.f4457s.m5876f();
        int[] iArr = this.f4405E0;
        if (m5158w(iArr[0], iArr[1])) {
            m5172H(0, 0);
        }
        m5128R0();
        m5135a1();
    }

    /* renamed from: I0 */
    private void m5123I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4439f0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f4439f0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f4443j0 = x10;
            this.f4441h0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f4444k0 = y10;
            this.f4442i0 = y10;
        }
    }

    /* renamed from: J */
    private boolean m5124J(MotionEvent motionEvent) {
        InterfaceC0893t interfaceC0893t = this.f4404E;
        if (interfaceC0893t == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m5129S(motionEvent);
        }
        interfaceC0893t.mo5499b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f4404E = null;
        }
        return true;
    }

    /* renamed from: M0 */
    private boolean m5125M0() {
        return this.f4437d0 != null && this.f4471z.mo5008L1();
    }

    /* renamed from: N0 */
    private void m5126N0() {
        boolean z10;
        if (this.f4428R) {
            this.f4453q.m5706u();
            if (this.f4429S) {
                this.f4471z.mo5013S0(this);
            }
        }
        if (m5125M0()) {
            this.f4453q.m5704s();
        } else {
            this.f4453q.m5697j();
        }
        boolean z11 = false;
        boolean z12 = this.f4470y0 || this.f4472z0;
        this.f4464v0.f4485k = this.f4412I && this.f4437d0 != null && ((z10 = this.f4428R) || z12 || this.f4471z.f4549h) && (!z10 || this.f4469y.m5332h());
        C0871a0 c0871a0 = this.f4464v0;
        if (c0871a0.f4485k && z12 && !this.f4428R && m5125M0()) {
            z11 = true;
        }
        c0871a0.f4486l = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5127P0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.m5178L()
            android.widget.EdgeEffect r3 = r6.f4433W
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0702d.m4136c(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.m5180M()
            android.widget.EdgeEffect r3 = r6.f4435b0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0702d.m4136c(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.m5181N()
            android.widget.EdgeEffect r9 = r6.f4434a0
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0702d.m4136c(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.m5176K()
            android.widget.EdgeEffect r9 = r6.f4436c0
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0702d.m4136c(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.C0690v.m3835h0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m5127P0(float, float, float, float):void");
    }

    /* renamed from: R0 */
    private void m5128R0() {
        View findViewById;
        if (!this.f4456r0 || this.f4469y == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (f4393V0 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.f4455r.m5717g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.f4455r.m5722n(focusedChild)) {
                return;
            }
        }
        View view = null;
        AbstractC0877d0 m5193X = (this.f4464v0.f4488n == -1 || !this.f4469y.m5332h()) ? null : m5193X(this.f4464v0.f4488n);
        if (m5193X != null && !this.f4455r.m5722n(m5193X.f4502a) && m5193X.f4502a.hasFocusable()) {
            view = m5193X.f4502a;
        } else if (this.f4455r.m5717g() > 0) {
            view = m5133V();
        }
        if (view != null) {
            int i10 = this.f4464v0.f4489o;
            if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    /* renamed from: S */
    private boolean m5129S(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4402D.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC0893t interfaceC0893t = this.f4402D.get(i10);
            if (interfaceC0893t.mo5498a(this, motionEvent) && action != 3) {
                this.f4404E = interfaceC0893t;
                return true;
            }
        }
        return false;
    }

    /* renamed from: S0 */
    private void m5130S0() {
        boolean z10;
        EdgeEffect edgeEffect = this.f4433W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f4433W.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f4434a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f4434a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4435b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f4435b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4436c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f4436c0.isFinished();
        }
        if (z10) {
            C0690v.m3835h0(this);
        }
    }

    /* renamed from: T */
    private void m5131T(int[] iArr) {
        int m5717g = this.f4455r.m5717g();
        if (m5717g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < m5717g; i12++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5716f(i12));
            if (!m5142e0.m5277J()) {
                int m5291m = m5142e0.m5291m();
                if (m5291m < i10) {
                    i10 = m5291m;
                }
                if (m5291m > i11) {
                    i11 = m5291m;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* renamed from: U */
    static RecyclerView m5132U(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView m5132U = m5132U(viewGroup.getChildAt(i10));
            if (m5132U != null) {
                return m5132U;
            }
        }
        return null;
    }

    /* renamed from: V */
    private View m5133V() {
        AbstractC0877d0 m5191W;
        C0871a0 c0871a0 = this.f4464v0;
        int i10 = c0871a0.f4487m;
        if (i10 == -1) {
            i10 = 0;
        }
        int m5251b = c0871a0.m5251b();
        for (int i11 = i10; i11 < m5251b; i11++) {
            AbstractC0877d0 m5191W2 = m5191W(i11);
            if (m5191W2 == null) {
                break;
            }
            if (m5191W2.f4502a.hasFocusable()) {
                return m5191W2.f4502a;
            }
        }
        int min = Math.min(m5251b, i10);
        do {
            min--;
            if (min < 0 || (m5191W = m5191W(min)) == null) {
                return null;
            }
        } while (!m5191W.f4502a.hasFocusable());
        return m5191W.f4502a;
    }

    /* renamed from: Z0 */
    private void m5134Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4463v.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0890q) {
            C0890q c0890q = (C0890q) layoutParams;
            if (!c0890q.f4568c) {
                Rect rect = c0890q.f4567b;
                Rect rect2 = this.f4463v;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4463v);
            offsetRectIntoDescendantCoords(view, this.f4463v);
        }
        this.f4471z.m5473s1(this, view, this.f4463v, !this.f4412I, view2 == null);
    }

    /* renamed from: a1 */
    private void m5135a1() {
        C0871a0 c0871a0 = this.f4464v0;
        c0871a0.f4488n = -1L;
        c0871a0.f4487m = -1;
        c0871a0.f4489o = -1;
    }

    /* renamed from: b1 */
    private void m5137b1() {
        VelocityTracker velocityTracker = this.f4440g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m5234s1(0);
        m5130S0();
    }

    /* renamed from: c1 */
    private void m5139c1() {
        int m5288j;
        View focusedChild = (this.f4456r0 && hasFocus() && this.f4469y != null) ? getFocusedChild() : null;
        AbstractC0877d0 m5187R = focusedChild != null ? m5187R(focusedChild) : null;
        if (m5187R == null) {
            m5135a1();
            return;
        }
        this.f4464v0.f4488n = this.f4469y.m5332h() ? m5187R.m5289k() : -1L;
        C0871a0 c0871a0 = this.f4464v0;
        if (this.f4428R) {
            m5288j = -1;
        } else {
            m5288j = m5187R.m5300v() ? m5187R.f4505d : m5187R.m5288j();
        }
        c0871a0.f4487m = m5288j;
        this.f4464v0.f4489o = m5145g0(m5187R.f4502a);
    }

    /* renamed from: e0 */
    public static AbstractC0877d0 m5142e0(View view) {
        if (view == null) {
            return null;
        }
        return ((C0890q) view.getLayoutParams()).f4566a;
    }

    /* renamed from: f */
    private void m5143f(AbstractC0877d0 abstractC0877d0) {
        View view = abstractC0877d0.f4502a;
        boolean z10 = view.getParent() == this;
        this.f4449o.m5527J(m5202d0(view));
        if (abstractC0877d0.m5302x()) {
            this.f4455r.m5713c(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f4455r.m5712b(view, true);
        } else {
            this.f4455r.m5720k(view);
        }
    }

    /* renamed from: f0 */
    static void m5144f0(View view, Rect rect) {
        C0890q c0890q = (C0890q) view.getLayoutParams();
        Rect rect2 = c0890q.f4567b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0890q).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0890q).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0890q).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0890q).bottomMargin);
    }

    /* renamed from: g0 */
    private int m5145g0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private C0680l getScrollingChildHelper() {
        if (this.f4407F0 == null) {
            this.f4407F0 = new C0680l(this);
        }
        return this.f4407F0;
    }

    /* renamed from: h0 */
    private String m5146h0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* renamed from: h1 */
    private void m5147h1(AbstractC0881h abstractC0881h, boolean z10, boolean z11) {
        AbstractC0881h abstractC0881h2 = this.f4469y;
        if (abstractC0881h2 != null) {
            abstractC0881h2.m5345u(this.f4447n);
            this.f4469y.m5338n(this);
        }
        if (!z10 || z11) {
            m5188T0();
        }
        this.f4453q.m5706u();
        AbstractC0881h abstractC0881h3 = this.f4469y;
        this.f4469y = abstractC0881h;
        if (abstractC0881h != null) {
            abstractC0881h.m5343s(this.f4447n);
            abstractC0881h.m5334j(this);
        }
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.mo5401E0(abstractC0881h3, this.f4469y);
        }
        this.f4449o.m5551x(abstractC0881h3, this.f4469y, z10);
        this.f4464v0.f4481g = true;
    }

    /* renamed from: j0 */
    private void m5148j0(long j10, AbstractC0877d0 abstractC0877d0, AbstractC0877d0 abstractC0877d02) {
        int m5717g = this.f4455r.m5717g();
        for (int i10 = 0; i10 < m5717g; i10++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5716f(i10));
            if (m5142e0 != abstractC0877d0 && m5200b0(m5142e0) == j10) {
                AbstractC0881h abstractC0881h = this.f4469y;
                if (abstractC0881h != null && abstractC0881h.m5332h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m5142e0 + " \n View Holder 2:" + abstractC0877d0 + m5182O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m5142e0 + " \n View Holder 2:" + abstractC0877d0 + m5182O());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0877d02 + " cannot be found but it is necessary for " + abstractC0877d0 + m5182O());
    }

    /* renamed from: l */
    private void m5149l(AbstractC0877d0 abstractC0877d0, AbstractC0877d0 abstractC0877d02, AbstractC0886m.c cVar, AbstractC0886m.c cVar2, boolean z10, boolean z11) {
        abstractC0877d0.m5274G(false);
        if (z10) {
            m5143f(abstractC0877d0);
        }
        if (abstractC0877d0 != abstractC0877d02) {
            if (z11) {
                m5143f(abstractC0877d02);
            }
            abstractC0877d0.f4509h = abstractC0877d02;
            m5143f(abstractC0877d0);
            this.f4449o.m5527J(abstractC0877d0);
            abstractC0877d02.m5274G(false);
            abstractC0877d02.f4510i = abstractC0877d0;
        }
        if (this.f4437d0.mo5353b(abstractC0877d0, abstractC0877d02, cVar, cVar2)) {
            m5179L0();
        }
    }

    /* renamed from: l0 */
    private boolean m5150l0() {
        int m5717g = this.f4455r.m5717g();
        for (int i10 = 0; i10 < m5717g; i10++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5716f(i10));
            if (m5142e0 != null && !m5142e0.m5277J() && m5142e0.m5303y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: n0 */
    private void m5151n0() {
        if (C0690v.m3789D(this) == 0) {
            C0690v.m3784A0(this, 8);
        }
    }

    /* renamed from: o0 */
    private void m5152o0() {
        this.f4455r = new C0907b(new C0878e());
    }

    /* renamed from: p */
    private void m5153p() {
        m5137b1();
        setScrollState(0);
    }

    /* renamed from: q */
    static void m5154q(AbstractC0877d0 abstractC0877d0) {
        WeakReference<RecyclerView> weakReference = abstractC0877d0.f4503b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0877d0.f4502a) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC0877d0.f4503b = null;
        }
    }

    /* renamed from: t0 */
    private boolean m5155t0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || m5185Q(view2) == null) {
            return false;
        }
        if (view == null || m5185Q(view) == null) {
            return true;
        }
        this.f4463v.set(0, 0, view.getWidth(), view.getHeight());
        this.f4465w.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4463v);
        offsetDescendantRectToMyCoords(view2, this.f4465w);
        char c10 = 65535;
        int i12 = this.f4471z.m5432Z() == 1 ? -1 : 1;
        Rect rect = this.f4463v;
        int i13 = rect.left;
        Rect rect2 = this.f4465w;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + m5182O());
    }

    /* renamed from: u */
    private void m5156u(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m5146h0 = m5146h0(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(m5146h0, false, classLoader).asSubclass(AbstractC0889p.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f4394W0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m5146h0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0889p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m5146h0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m5146h0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m5146h0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m5146h0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m5146h0, e16);
            }
        }
    }

    /* renamed from: u1 */
    private void m5157u1() {
        this.f4458s0.m5262f();
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.m5413K1();
        }
    }

    /* renamed from: w */
    private boolean m5158w(int i10, int i11) {
        m5131T(this.f4405E0);
        int[] iArr = this.f4405E0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    /* renamed from: x0 */
    private void m5159x0(int i10, int i11, MotionEvent motionEvent, int i12) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4418L) {
            return;
        }
        int[] iArr = this.f4413I0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean mo5088k = abstractC0889p.mo5088k();
        boolean mo5090l = this.f4471z.mo5090l();
        m5228q1(mo5090l ? (mo5088k ? 1 : 0) | 2 : mo5088k ? 1 : 0, i12);
        if (m5166E(mo5088k ? i10 : 0, mo5090l ? i11 : 0, this.f4413I0, this.f4409G0, i12)) {
            int[] iArr2 = this.f4413I0;
            i10 -= iArr2[0];
            i11 -= iArr2[1];
        }
        m5204e1(mo5088k ? i10 : 0, mo5090l ? i11 : 0, motionEvent, i12);
        RunnableC0910e runnableC0910e = this.f4460t0;
        if (runnableC0910e != null && (i10 != 0 || i11 != 0)) {
            runnableC0910e.m5777f(this, i10, i11);
        }
        m5234s1(i12);
    }

    /* renamed from: z */
    private void m5160z() {
        int i10 = this.f4422N;
        this.f4422N = 0;
        if (i10 == 0 || !m5230r0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C0659b.m3493b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* renamed from: A */
    void m5161A() {
        if (this.f4469y == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f4471z == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f4464v0.f4484j = false;
        boolean z10 = this.f4419L0 && !(this.f4421M0 == getWidth() && this.f4423N0 == getHeight());
        this.f4421M0 = 0;
        this.f4423N0 = 0;
        this.f4419L0 = false;
        if (this.f4464v0.f4479e == 1) {
            m5120B();
            this.f4471z.m5484z1(this);
            m5121C();
        } else if (!this.f4453q.m5703q() && !z10 && this.f4471z.m5465o0() == getWidth() && this.f4471z.m5429W() == getHeight()) {
            this.f4471z.m5484z1(this);
        } else {
            this.f4471z.m5484z1(this);
            m5121C();
        }
        m5122D();
    }

    /* renamed from: A0 */
    void m5162A0(int i10, int i11) {
        int m5719j = this.f4455r.m5719j();
        for (int i12 = 0; i12 < m5719j; i12++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i12));
            if (m5142e0 != null && !m5142e0.m5277J() && m5142e0.f4504c >= i10) {
                m5142e0.m5268A(i11, false);
                this.f4464v0.f4481g = true;
            }
        }
        this.f4449o.m5548u(i10, i11);
        requestLayout();
    }

    /* renamed from: B0 */
    void m5163B0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m5719j = this.f4455r.m5719j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < m5719j; i16++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i16));
            if (m5142e0 != null && (i15 = m5142e0.f4504c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    m5142e0.m5268A(i11 - i10, false);
                } else {
                    m5142e0.m5268A(i14, false);
                }
                this.f4464v0.f4481g = true;
            }
        }
        this.f4449o.m5549v(i10, i11);
        requestLayout();
    }

    /* renamed from: C0 */
    void m5164C0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int m5719j = this.f4455r.m5719j();
        for (int i13 = 0; i13 < m5719j; i13++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i13));
            if (m5142e0 != null && !m5142e0.m5277J()) {
                int i14 = m5142e0.f4504c;
                if (i14 >= i12) {
                    m5142e0.m5268A(-i11, z10);
                    this.f4464v0.f4481g = true;
                } else if (i14 >= i10) {
                    m5142e0.m5287i(i10 - 1, -i11, z10);
                    this.f4464v0.f4481g = true;
                }
            }
        }
        this.f4449o.m5550w(i10, i11, z10);
        requestLayout();
    }

    /* renamed from: D0 */
    public void m5165D0(View view) {
    }

    /* renamed from: E */
    public boolean m5166E(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().m3759d(i10, i11, iArr, iArr2, i12);
    }

    /* renamed from: E0 */
    public void m5167E0(View view) {
    }

    /* renamed from: F */
    public final void m5168F(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().m3760e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: F0 */
    public void m5169F0() {
        this.f4430T++;
    }

    /* renamed from: G */
    void m5170G(int i10) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.mo5445e1(i10);
        }
        m5175J0(i10);
        AbstractC0894u abstractC0894u = this.f4466w0;
        if (abstractC0894u != null) {
            abstractC0894u.mo5501a(this, i10);
        }
        List<AbstractC0894u> list = this.f4468x0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4468x0.get(size).mo5501a(this, i10);
            }
        }
    }

    /* renamed from: G0 */
    void m5171G0() {
        m5173H0(true);
    }

    /* renamed from: H */
    void m5172H(int i10, int i11) {
        this.f4431U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        m5177K0(i10, i11);
        AbstractC0894u abstractC0894u = this.f4466w0;
        if (abstractC0894u != null) {
            abstractC0894u.mo5502b(this, i10, i11);
        }
        List<AbstractC0894u> list = this.f4468x0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4468x0.get(size).mo5502b(this, i10, i11);
            }
        }
        this.f4431U--;
    }

    /* renamed from: H0 */
    public void m5173H0(boolean z10) {
        int i10 = this.f4430T - 1;
        this.f4430T = i10;
        if (i10 < 1) {
            this.f4430T = 0;
            if (z10) {
                m5160z();
                m5174I();
            }
        }
    }

    /* renamed from: I */
    void m5174I() {
        int i10;
        for (int size = this.f4415J0.size() - 1; size >= 0; size--) {
            AbstractC0877d0 abstractC0877d0 = this.f4415J0.get(size);
            if (abstractC0877d0.f4502a.getParent() == this && !abstractC0877d0.m5277J() && (i10 = abstractC0877d0.f4518q) != -1) {
                C0690v.m3871z0(abstractC0877d0.f4502a, i10);
                abstractC0877d0.f4518q = -1;
            }
        }
        this.f4415J0.clear();
    }

    /* renamed from: J0 */
    public void m5175J0(int i10) {
    }

    /* renamed from: K */
    void m5176K() {
        if (this.f4436c0 != null) {
            return;
        }
        EdgeEffect m5350a = this.f4432V.m5350a(this, 3);
        this.f4436c0 = m5350a;
        if (this.f4459t) {
            m5350a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m5350a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: K0 */
    public void m5177K0(int i10, int i11) {
    }

    /* renamed from: L */
    void m5178L() {
        if (this.f4433W != null) {
            return;
        }
        EdgeEffect m5350a = this.f4432V.m5350a(this, 0);
        this.f4433W = m5350a;
        if (this.f4459t) {
            m5350a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m5350a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: L0 */
    void m5179L0() {
        if (this.f4399B0 || !this.f4406F) {
            return;
        }
        C0690v.m3837i0(this, this.f4417K0);
        this.f4399B0 = true;
    }

    /* renamed from: M */
    void m5180M() {
        if (this.f4435b0 != null) {
            return;
        }
        EdgeEffect m5350a = this.f4432V.m5350a(this, 2);
        this.f4435b0 = m5350a;
        if (this.f4459t) {
            m5350a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m5350a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: N */
    void m5181N() {
        if (this.f4434a0 != null) {
            return;
        }
        EdgeEffect m5350a = this.f4432V.m5350a(this, 1);
        this.f4434a0 = m5350a;
        if (this.f4459t) {
            m5350a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m5350a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: O */
    String m5182O() {
        return " " + super.toString() + ", adapter:" + this.f4469y + ", layout:" + this.f4471z + ", context:" + getContext();
    }

    /* renamed from: O0 */
    void m5183O0(boolean z10) {
        this.f4429S = z10 | this.f4429S;
        this.f4428R = true;
        m5241w0();
    }

    /* renamed from: P */
    final void m5184P(C0871a0 c0871a0) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4458s0.f4495p;
            c0871a0.f4490p = overScroller.getFinalX() - overScroller.getCurrX();
            c0871a0.f4491q = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c0871a0.f4490p = 0;
            c0871a0.f4491q = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m5185Q(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m5185Q(android.view.View):android.view.View");
    }

    /* renamed from: Q0 */
    void m5186Q0(AbstractC0877d0 abstractC0877d0, AbstractC0886m.c cVar) {
        abstractC0877d0.m5273F(0, 8192);
        if (this.f4464v0.f4483i && abstractC0877d0.m5303y() && !abstractC0877d0.m5300v() && !abstractC0877d0.m5277J()) {
            this.f4457s.m5873c(m5200b0(abstractC0877d0), abstractC0877d0);
        }
        this.f4457s.m5875e(abstractC0877d0, cVar);
    }

    /* renamed from: R */
    public AbstractC0877d0 m5187R(View view) {
        View m5185Q = m5185Q(view);
        if (m5185Q == null) {
            return null;
        }
        return m5202d0(m5185Q);
    }

    /* renamed from: T0 */
    public void m5188T0() {
        AbstractC0886m abstractC0886m = this.f4437d0;
        if (abstractC0886m != null) {
            abstractC0886m.mo5361k();
        }
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.m5458k1(this.f4449o);
            this.f4471z.m5460l1(this.f4449o);
        }
        this.f4449o.m5532c();
    }

    /* renamed from: U0 */
    boolean m5189U0(View view) {
        m5226p1();
        boolean m5726r = this.f4455r.m5726r(view);
        if (m5726r) {
            AbstractC0877d0 m5142e0 = m5142e0(view);
            this.f4449o.m5527J(m5142e0);
            this.f4449o.m5521C(m5142e0);
        }
        m5231r1(!m5726r);
        return m5726r;
    }

    /* renamed from: V0 */
    public void m5190V0(AbstractC0888o abstractC0888o) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.mo5087g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4400C.remove(abstractC0888o);
        if (this.f4400C.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m5239v0();
        requestLayout();
    }

    /* renamed from: W */
    public AbstractC0877d0 m5191W(int i10) {
        AbstractC0877d0 abstractC0877d0 = null;
        if (this.f4428R) {
            return null;
        }
        int m5719j = this.f4455r.m5719j();
        for (int i11 = 0; i11 < m5719j; i11++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i11));
            if (m5142e0 != null && !m5142e0.m5300v() && m5199a0(m5142e0) == i10) {
                if (!this.f4455r.m5722n(m5142e0.f4502a)) {
                    return m5142e0;
                }
                abstractC0877d0 = m5142e0;
            }
        }
        return abstractC0877d0;
    }

    /* renamed from: W0 */
    public void m5192W0(InterfaceC0893t interfaceC0893t) {
        this.f4402D.remove(interfaceC0893t);
        if (this.f4404E == interfaceC0893t) {
            this.f4404E = null;
        }
    }

    /* renamed from: X */
    public AbstractC0877d0 m5193X(long j10) {
        AbstractC0881h abstractC0881h = this.f4469y;
        AbstractC0877d0 abstractC0877d0 = null;
        if (abstractC0881h != null && abstractC0881h.m5332h()) {
            int m5719j = this.f4455r.m5719j();
            for (int i10 = 0; i10 < m5719j; i10++) {
                AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i10));
                if (m5142e0 != null && !m5142e0.m5300v() && m5142e0.m5289k() == j10) {
                    if (!this.f4455r.m5722n(m5142e0.f4502a)) {
                        return m5142e0;
                    }
                    abstractC0877d0 = m5142e0;
                }
            }
        }
        return abstractC0877d0;
    }

    /* renamed from: X0 */
    public void m5194X0(AbstractC0894u abstractC0894u) {
        List<AbstractC0894u> list = this.f4468x0;
        if (list != null) {
            list.remove(abstractC0894u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC0877d0 m5195Y(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f4455r
            int r0 = r0.m5719j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f4455r
            android.view.View r3 = r3.m5718i(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = m5142e0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.m5300v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4504c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m5291m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f4455r
            android.view.View r4 = r3.f4502a
            boolean r1 = r1.m5722n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m5195Y(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    /* renamed from: Y0 */
    void m5196Y0() {
        AbstractC0877d0 abstractC0877d0;
        int m5717g = this.f4455r.m5717g();
        for (int i10 = 0; i10 < m5717g; i10++) {
            View m5716f = this.f4455r.m5716f(i10);
            AbstractC0877d0 m5202d0 = m5202d0(m5716f);
            if (m5202d0 != null && (abstractC0877d0 = m5202d0.f4510i) != null) {
                View view = abstractC0877d0.f4502a;
                int left = m5716f.getLeft();
                int top = m5716f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: Z */
    public boolean m5197Z(int i10, int i11) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f4418L) {
            return false;
        }
        int mo5088k = abstractC0889p.mo5088k();
        boolean mo5090l = this.f4471z.mo5090l();
        if (mo5088k == 0 || Math.abs(i10) < this.f4448n0) {
            i10 = 0;
        }
        if (!mo5090l || Math.abs(i11) < this.f4448n0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = mo5088k != 0 || mo5090l;
            dispatchNestedFling(f10, f11, z10);
            AbstractC0892s abstractC0892s = this.f4446m0;
            if (abstractC0892s != null && abstractC0892s.mo5497a(i10, i11)) {
                return true;
            }
            if (z10) {
                if (mo5090l) {
                    mo5088k = (mo5088k == true ? 1 : 0) | 2;
                }
                m5228q1(mo5088k, 1);
                int i12 = this.f4450o0;
                int max = Math.max(-i12, Math.min(i10, i12));
                int i13 = this.f4450o0;
                this.f4458s0.m5259b(max, Math.max(-i13, Math.min(i11, i13)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m5198a(int i10, int i11) {
        if (i10 < 0) {
            m5178L();
            if (this.f4433W.isFinished()) {
                this.f4433W.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            m5180M();
            if (this.f4435b0.isFinished()) {
                this.f4435b0.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            m5181N();
            if (this.f4434a0.isFinished()) {
                this.f4434a0.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            m5176K();
            if (this.f4436c0.isFinished()) {
                this.f4436c0.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        C0690v.m3835h0(this);
    }

    /* renamed from: a0 */
    int m5199a0(AbstractC0877d0 abstractC0877d0) {
        if (abstractC0877d0.m5294p(524) || !abstractC0877d0.m5297s()) {
            return -1;
        }
        return this.f4453q.m5695e(abstractC0877d0.f4504c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null || !abstractC0889p.m5403F0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* renamed from: b0 */
    long m5200b0(AbstractC0877d0 abstractC0877d0) {
        return this.f4469y.m5332h() ? abstractC0877d0.m5289k() : abstractC0877d0.f4504c;
    }

    /* renamed from: c0 */
    public int m5201c0(View view) {
        AbstractC0877d0 m5142e0 = m5142e0(view);
        if (m5142e0 != null) {
            return m5142e0.m5291m();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0890q) && this.f4471z.mo5024m((C0890q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null && abstractC0889p.mo5088k()) {
            return this.f4471z.mo5096q(this.f4464v0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null && abstractC0889p.mo5088k()) {
            return this.f4471z.mo5027r(this.f4464v0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null && abstractC0889p.mo5088k()) {
            return this.f4471z.mo5028s(this.f4464v0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null && abstractC0889p.mo5090l()) {
            return this.f4471z.mo5098t(this.f4464v0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null && abstractC0889p.mo5090l()) {
            return this.f4471z.mo5029u(this.f4464v0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null && abstractC0889p.mo5090l()) {
            return this.f4471z.mo5030v(this.f4464v0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public AbstractC0877d0 m5202d0(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m5142e0(view);
    }

    /* renamed from: d1 */
    void m5203d1() {
        int m5719j = this.f4455r.m5719j();
        for (int i10 = 0; i10 < m5719j; i10++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i10));
            if (!m5142e0.m5277J()) {
                m5142e0.m5272E();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().m3756a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().m3757b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m3758c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m3761f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f4400C.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f4400C.get(i10).mo5382i(canvas, this, this.f4464v0);
        }
        EdgeEffect edgeEffect = this.f4433W;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4459t ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4433W;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4434a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4459t) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4434a0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4435b0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4459t ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4435b0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4436c0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4459t) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4436c0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if ((z10 || this.f4437d0 == null || this.f4400C.size() <= 0 || !this.f4437d0.mo5366p()) ? z10 : true) {
            C0690v.m3835h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* renamed from: e1 */
    boolean m5204e1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        m5235t();
        if (this.f4469y != null) {
            int[] iArr = this.f4413I0;
            iArr[0] = 0;
            iArr[1] = 0;
            m5205f1(i10, i11, iArr);
            int[] iArr2 = this.f4413I0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f4400C.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4413I0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m5168F(i14, i13, i15, i16, this.f4409G0, i12, iArr3);
        int[] iArr4 = this.f4413I0;
        int i19 = i15 - iArr4[0];
        int i20 = i16 - iArr4[1];
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i21 = this.f4443j0;
        int[] iArr5 = this.f4409G0;
        this.f4443j0 = i21 - iArr5[0];
        this.f4444k0 -= iArr5[1];
        int[] iArr6 = this.f4411H0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0678j.m3751a(motionEvent, 8194)) {
                m5127P0(motionEvent.getX(), i19, motionEvent.getY(), i20);
            }
            m5232s(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            m5172H(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i14 == 0 && i13 == 0) ? false : true;
    }

    /* renamed from: f1 */
    void m5205f1(int i10, int i11, int[] iArr) {
        m5226p1();
        m5169F0();
        C0632k.m3360a("RV Scroll");
        m5184P(this.f4464v0);
        int mo5031w1 = i10 != 0 ? this.f4471z.mo5031w1(i10, this.f4449o, this.f4464v0) : 0;
        int mo5032y1 = i11 != 0 ? this.f4471z.mo5032y1(i11, this.f4449o, this.f4464v0) : 0;
        C0632k.m3361b();
        m5196Y0();
        m5171G0();
        m5231r1(false);
        if (iArr != null) {
            iArr[0] = mo5031w1;
            iArr[1] = mo5032y1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View view2;
        boolean z10;
        View m5422Q0 = this.f4471z.m5422Q0(view, i10);
        if (m5422Q0 != null) {
            return m5422Q0;
        }
        boolean z11 = (this.f4469y == null || this.f4471z == null || m5233s0() || this.f4418L) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f4471z.mo5090l()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f4392U0) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f4471z.mo5088k()) {
                int i12 = (this.f4471z.m5432Z() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f4392U0) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                m5235t();
                if (m5185Q(view) == null) {
                    return null;
                }
                m5226p1();
                this.f4471z.mo5007J0(view, i10, this.f4449o, this.f4464v0);
                m5231r1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                m5235t();
                if (m5185Q(view) == null) {
                    return null;
                }
                m5226p1();
                view2 = this.f4471z.mo5007J0(view, i10, this.f4449o, this.f4464v0);
                m5231r1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return m5155t0(view, view2, i10) ? view2 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        m5134Z0(view2, null);
        return view;
    }

    /* renamed from: g */
    public void m5206g(AbstractC0888o abstractC0888o) {
        m5208h(abstractC0888o, -1);
    }

    /* renamed from: g1 */
    public void m5207g1(int i10) {
        if (this.f4418L) {
            return;
        }
        m5236t1();
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0889p.mo5100x1(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            return abstractC0889p.mo5004D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5182O());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            return abstractC0889p.mo5005E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5182O());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0881h getAdapter() {
        return this.f4469y;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            return abstractC0889p.m5405G();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        InterfaceC0884k interfaceC0884k = this.f4403D0;
        if (interfaceC0884k == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return interfaceC0884k.m5349a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4459t;
    }

    public C0916k getCompatAccessibilityDelegate() {
        return this.f4401C0;
    }

    public C0885l getEdgeEffectFactory() {
        return this.f4432V;
    }

    public AbstractC0886m getItemAnimator() {
        return this.f4437d0;
    }

    public int getItemDecorationCount() {
        return this.f4400C.size();
    }

    public AbstractC0889p getLayoutManager() {
        return this.f4471z;
    }

    public int getMaxFlingVelocity() {
        return this.f4450o0;
    }

    public int getMinFlingVelocity() {
        return this.f4448n0;
    }

    public long getNanoTime() {
        if (f4391T0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0892s getOnFlingListener() {
        return this.f4446m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4456r0;
    }

    public C0895v getRecycledViewPool() {
        return this.f4449o.m5538i();
    }

    public int getScrollState() {
        return this.f4438e0;
    }

    /* renamed from: h */
    public void m5208h(AbstractC0888o abstractC0888o, int i10) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.mo5087g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4400C.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f4400C.add(abstractC0888o);
        } else {
            this.f4400C.add(i10, abstractC0888o);
        }
        m5239v0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m3762j();
    }

    /* renamed from: i */
    public void m5209i(InterfaceC0893t interfaceC0893t) {
        this.f4402D.add(interfaceC0893t);
    }

    /* renamed from: i0 */
    Rect m5210i0(View view) {
        C0890q c0890q = (C0890q) view.getLayoutParams();
        if (!c0890q.f4568c) {
            return c0890q.f4567b;
        }
        if (this.f4464v0.m5254e() && (c0890q.m5492b() || c0890q.m5494d())) {
            return c0890q.f4567b;
        }
        Rect rect = c0890q.f4567b;
        rect.set(0, 0, 0, 0);
        int size = this.f4400C.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4463v.set(0, 0, 0, 0);
            this.f4400C.get(i10).m5378e(this.f4463v, view, this, this.f4464v0);
            int i11 = rect.left;
            Rect rect2 = this.f4463v;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0890q.f4568c = false;
        return rect;
    }

    /* renamed from: i1 */
    boolean m5211i1(AbstractC0877d0 abstractC0877d0, int i10) {
        if (m5233s0()) {
            abstractC0877d0.f4518q = i10;
            this.f4415J0.add(abstractC0877d0);
            return false;
        }
        C0690v.m3871z0(abstractC0877d0.f4502a, i10);
        return true;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4406F;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4418L;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m3764l();
    }

    /* renamed from: j */
    public void m5212j(AbstractC0894u abstractC0894u) {
        if (this.f4468x0 == null) {
            this.f4468x0 = new ArrayList();
        }
        this.f4468x0.add(abstractC0894u);
    }

    /* renamed from: j1 */
    boolean m5213j1(AccessibilityEvent accessibilityEvent) {
        if (!m5233s0()) {
            return false;
        }
        int m3492a = accessibilityEvent != null ? C0659b.m3492a(accessibilityEvent) : 0;
        this.f4422N |= m3492a != 0 ? m3492a : 0;
        return true;
    }

    /* renamed from: k */
    void m5214k(AbstractC0877d0 abstractC0877d0, AbstractC0886m.c cVar, AbstractC0886m.c cVar2) {
        abstractC0877d0.m5274G(false);
        if (this.f4437d0.mo5352a(abstractC0877d0, cVar, cVar2)) {
            m5179L0();
        }
    }

    /* renamed from: k0 */
    public boolean m5215k0() {
        return !this.f4412I || this.f4428R || this.f4453q.m5702p();
    }

    /* renamed from: k1 */
    public void m5216k1(int i10, int i11) {
        m5217l1(i10, i11, null);
    }

    /* renamed from: l1 */
    public void m5217l1(int i10, int i11, Interpolator interpolator) {
        m5220m1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: m */
    void m5218m(AbstractC0877d0 abstractC0877d0, AbstractC0886m.c cVar, AbstractC0886m.c cVar2) {
        m5143f(abstractC0877d0);
        abstractC0877d0.m5274G(false);
        if (this.f4437d0.mo5354c(abstractC0877d0, cVar, cVar2)) {
            m5179L0();
        }
    }

    /* renamed from: m0 */
    void m5219m0() {
        this.f4453q = new C0906a(new C0879f());
    }

    /* renamed from: m1 */
    public void m5220m1(int i10, int i11, Interpolator interpolator, int i12) {
        m5222n1(i10, i11, interpolator, i12, false);
    }

    /* renamed from: n */
    void m5221n(String str) {
        if (m5233s0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m5182O());
            }
            throw new IllegalStateException(str);
        }
        if (this.f4431U > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + m5182O()));
        }
    }

    /* renamed from: n1 */
    void m5222n1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4418L) {
            return;
        }
        if (!abstractC0889p.mo5088k()) {
            i10 = 0;
        }
        if (!this.f4471z.mo5090l()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 == Integer.MIN_VALUE || i12 > 0) {
            if (z10) {
                int i13 = i10 != 0 ? 1 : 0;
                if (i11 != 0) {
                    i13 |= 2;
                }
                m5228q1(i13, 1);
            }
            this.f4458s0.m5261e(i10, i11, i12, interpolator);
            return;
        }
        scrollBy(i10, i11);
    }

    /* renamed from: o */
    boolean m5223o(AbstractC0877d0 abstractC0877d0) {
        AbstractC0886m abstractC0886m = this.f4437d0;
        return abstractC0886m == null || abstractC0886m.mo5357g(abstractC0877d0, abstractC0877d0.m5293o());
    }

    /* renamed from: o1 */
    public void m5224o1(int i10) {
        if (this.f4418L) {
            return;
        }
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0889p.mo5071I1(this, this.f4464v0, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4430T = 0;
        this.f4406F = true;
        this.f4412I = this.f4412I && !isLayoutRequested();
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.m5482z(this);
        }
        this.f4399B0 = false;
        if (f4391T0) {
            ThreadLocal<RunnableC0910e> threadLocal = RunnableC0910e.f4760r;
            RunnableC0910e runnableC0910e = threadLocal.get();
            this.f4460t0 = runnableC0910e;
            if (runnableC0910e == null) {
                this.f4460t0 = new RunnableC0910e();
                Display m3866x = C0690v.m3866x(this);
                float f10 = 60.0f;
                if (!isInEditMode() && m3866x != null) {
                    float refreshRate = m3866x.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                RunnableC0910e runnableC0910e2 = this.f4460t0;
                runnableC0910e2.f4764p = 1.0E9f / f10;
                threadLocal.set(runnableC0910e2);
            }
            this.f4460t0.m5776a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC0910e runnableC0910e;
        super.onDetachedFromWindow();
        AbstractC0886m abstractC0886m = this.f4437d0;
        if (abstractC0886m != null) {
            abstractC0886m.mo5361k();
        }
        m5236t1();
        this.f4406F = false;
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            abstractC0889p.m5392A(this, this.f4449o);
        }
        this.f4415J0.clear();
        removeCallbacks(this.f4417K0);
        this.f4457s.m5880j();
        if (!f4391T0 || (runnableC0910e = this.f4460t0) == null) {
            return;
        }
        runnableC0910e.m5779j(this);
        this.f4460t0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4400C.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4400C.get(i10).mo5380g(canvas, this, this.f4464v0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f4471z
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4418L
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.f4471z
            boolean r0 = r0.mo5090l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f4471z
            boolean r3 = r3.mo5088k()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f4471z
            boolean r3 = r3.mo5090l()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.f4471z
            boolean r3 = r3.mo5088k()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6a:
            float r2 = r5.f4452p0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4454q0
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.m5159x0(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f4418L) {
            return false;
        }
        this.f4404E = null;
        if (m5129S(motionEvent)) {
            m5153p();
            return true;
        }
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            return false;
        }
        boolean mo5088k = abstractC0889p.mo5088k();
        boolean mo5090l = this.f4471z.mo5090l();
        if (this.f4440g0 == null) {
            this.f4440g0 = VelocityTracker.obtain();
        }
        this.f4440g0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4420M) {
                this.f4420M = false;
            }
            this.f4439f0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f4443j0 = x10;
            this.f4441h0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f4444k0 = y10;
            this.f4442i0 = y10;
            if (this.f4438e0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m5234s1(1);
            }
            int[] iArr = this.f4411H0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = mo5088k;
            if (mo5090l) {
                i10 = (mo5088k ? 1 : 0) | 2;
            }
            m5228q1(i10, 0);
        } else if (actionMasked == 1) {
            this.f4440g0.clear();
            m5234s1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4439f0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4439f0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4438e0 != 1) {
                int i11 = x11 - this.f4441h0;
                int i12 = y11 - this.f4442i0;
                if (mo5088k == 0 || Math.abs(i11) <= this.f4445l0) {
                    z10 = false;
                } else {
                    this.f4443j0 = x11;
                    z10 = true;
                }
                if (mo5090l && Math.abs(i12) > this.f4445l0) {
                    this.f4444k0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m5153p();
        } else if (actionMasked == 5) {
            this.f4439f0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4443j0 = x12;
            this.f4441h0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4444k0 = y12;
            this.f4442i0 = y12;
        } else if (actionMasked == 6) {
            m5123I0(motionEvent);
        }
        return this.f4438e0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C0632k.m3360a("RV OnLayout");
        m5161A();
        C0632k.m3361b();
        this.f4412I = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            m5238v(i10, i11);
            return;
        }
        boolean z10 = false;
        if (abstractC0889p.mo5097s0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4471z.m5433Z0(this.f4449o, this.f4464v0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f4419L0 = z10;
            if (z10 || this.f4469y == null) {
                return;
            }
            if (this.f4464v0.f4479e == 1) {
                m5120B();
            }
            this.f4471z.m5394A1(i10, i11);
            this.f4464v0.f4484j = true;
            m5121C();
            this.f4471z.m5400D1(i10, i11);
            if (this.f4471z.mo5069G1()) {
                this.f4471z.m5394A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f4464v0.f4484j = true;
                m5121C();
                this.f4471z.m5400D1(i10, i11);
            }
            this.f4421M0 = getMeasuredWidth();
            this.f4423N0 = getMeasuredHeight();
            return;
        }
        if (this.f4408G) {
            this.f4471z.m5433Z0(this.f4449o, this.f4464v0, i10, i11);
            return;
        }
        if (this.f4424O) {
            m5226p1();
            m5169F0();
            m5126N0();
            m5171G0();
            C0871a0 c0871a0 = this.f4464v0;
            if (c0871a0.f4486l) {
                c0871a0.f4482h = true;
            } else {
                this.f4453q.m5697j();
                this.f4464v0.f4482h = false;
            }
            this.f4424O = false;
            m5231r1(false);
        } else if (this.f4464v0.f4486l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0881h abstractC0881h = this.f4469y;
        if (abstractC0881h != null) {
            this.f4464v0.f4480f = abstractC0881h.mo5328d();
        } else {
            this.f4464v0.f4480f = 0;
        }
        m5226p1();
        this.f4471z.m5433Z0(this.f4449o, this.f4464v0, i10, i11);
        m5231r1(false);
        this.f4464v0.f4482h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (m5233s0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f4451p = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f4451p;
        if (savedState2 != null) {
            savedState.m5246a(savedState2);
        } else {
            AbstractC0889p abstractC0889p = this.f4471z;
            if (abstractC0889p != null) {
                savedState.f4473n = abstractC0889p.mo5086d1();
            } else {
                savedState.f4473n = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        m5227q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p0 */
    void m5225p0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0909d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C3467b.f14389a), resources.getDimensionPixelSize(C3467b.f14391c), resources.getDimensionPixelOffset(C3467b.f14390b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m5182O());
        }
    }

    /* renamed from: p1 */
    void m5226p1() {
        int i10 = this.f4414J + 1;
        this.f4414J = i10;
        if (i10 != 1 || this.f4418L) {
            return;
        }
        this.f4416K = false;
    }

    /* renamed from: q0 */
    void m5227q0() {
        this.f4436c0 = null;
        this.f4434a0 = null;
        this.f4435b0 = null;
        this.f4433W = null;
    }

    /* renamed from: q1 */
    public boolean m5228q1(int i10, int i11) {
        return getScrollingChildHelper().m3767p(i10, i11);
    }

    /* renamed from: r */
    void m5229r() {
        int m5719j = this.f4455r.m5719j();
        for (int i10 = 0; i10 < m5719j; i10++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i10));
            if (!m5142e0.m5277J()) {
                m5142e0.m5282c();
            }
        }
        this.f4449o.m5533d();
    }

    /* renamed from: r0 */
    boolean m5230r0() {
        AccessibilityManager accessibilityManager = this.f4426P;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: r1 */
    void m5231r1(boolean z10) {
        if (this.f4414J < 1) {
            this.f4414J = 1;
        }
        if (!z10 && !this.f4418L) {
            this.f4416K = false;
        }
        if (this.f4414J == 1) {
            if (z10 && this.f4416K && !this.f4418L && this.f4471z != null && this.f4469y != null) {
                m5161A();
            }
            if (!this.f4418L) {
                this.f4416K = false;
            }
        }
        this.f4414J--;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        AbstractC0877d0 m5142e0 = m5142e0(view);
        if (m5142e0 != null) {
            if (m5142e0.m5302x()) {
                m5142e0.m5285f();
            } else if (!m5142e0.m5277J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m5142e0 + m5182O());
            }
        }
        view.clearAnimation();
        m5243y(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4471z.m5438b1(this, this.f4464v0, view, view2) && view2 != null) {
            m5134Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f4471z.m5472r1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f4402D.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4402D.get(i10).mo5500c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4414J == 0 && !this.f4418L) {
            super.requestLayout();
        } else {
            this.f4416K = true;
        }
    }

    /* renamed from: s */
    void m5232s(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f4433W;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f4433W.onRelease();
            z10 = this.f4433W.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4435b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f4435b0.onRelease();
            z10 |= this.f4435b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4434a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f4434a0.onRelease();
            z10 |= this.f4434a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4436c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f4436c0.onRelease();
            z10 |= this.f4436c0.isFinished();
        }
        if (z10) {
            C0690v.m3835h0(this);
        }
    }

    /* renamed from: s0 */
    public boolean m5233s0() {
        return this.f4430T > 0;
    }

    /* renamed from: s1 */
    public void m5234s1(int i10) {
        getScrollingChildHelper().m3769r(i10);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4418L) {
            return;
        }
        boolean mo5088k = abstractC0889p.mo5088k();
        boolean mo5090l = this.f4471z.mo5090l();
        if (mo5088k || mo5090l) {
            if (!mo5088k) {
                i10 = 0;
            }
            if (!mo5090l) {
                i11 = 0;
            }
            m5204e1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m5213j1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0916k c0916k) {
        this.f4401C0 = c0916k;
        C0690v.m3853q0(this, c0916k);
    }

    public void setAdapter(AbstractC0881h abstractC0881h) {
        setLayoutFrozen(false);
        m5147h1(abstractC0881h, false, true);
        m5183O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0884k interfaceC0884k) {
        if (interfaceC0884k == this.f4403D0) {
            return;
        }
        this.f4403D0 = interfaceC0884k;
        setChildrenDrawingOrderEnabled(interfaceC0884k != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f4459t) {
            m5227q0();
        }
        this.f4459t = z10;
        super.setClipToPadding(z10);
        if (this.f4412I) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0885l c0885l) {
        C0654h.m3467f(c0885l);
        this.f4432V = c0885l;
        m5227q0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f4408G = z10;
    }

    public void setItemAnimator(AbstractC0886m abstractC0886m) {
        AbstractC0886m abstractC0886m2 = this.f4437d0;
        if (abstractC0886m2 != null) {
            abstractC0886m2.mo5361k();
            this.f4437d0.m5372v(null);
        }
        this.f4437d0 = abstractC0886m;
        if (abstractC0886m != null) {
            abstractC0886m.m5372v(this.f4397A0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f4449o.m5525G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(AbstractC0889p abstractC0889p) {
        if (abstractC0889p == this.f4471z) {
            return;
        }
        m5236t1();
        if (this.f4471z != null) {
            AbstractC0886m abstractC0886m = this.f4437d0;
            if (abstractC0886m != null) {
                abstractC0886m.mo5361k();
            }
            this.f4471z.m5458k1(this.f4449o);
            this.f4471z.m5460l1(this.f4449o);
            this.f4449o.m5532c();
            if (this.f4406F) {
                this.f4471z.m5392A(this, this.f4449o);
            }
            this.f4471z.m5402E1(null);
            this.f4471z = null;
        } else {
            this.f4449o.m5532c();
        }
        this.f4455r.m5723o();
        this.f4471z = abstractC0889p;
        if (abstractC0889p != null) {
            if (abstractC0889p.f4543b == null) {
                abstractC0889p.m5402E1(this);
                if (this.f4406F) {
                    this.f4471z.m5482z(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC0889p + " is already attached to a RecyclerView:" + abstractC0889p.f4543b.m5182O());
            }
        }
        this.f4449o.m5528K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m3765m(z10);
    }

    public void setOnFlingListener(AbstractC0892s abstractC0892s) {
        this.f4446m0 = abstractC0892s;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0894u abstractC0894u) {
        this.f4466w0 = abstractC0894u;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f4456r0 = z10;
    }

    public void setRecycledViewPool(C0895v c0895v) {
        this.f4449o.m5523E(c0895v);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0897x interfaceC0897x) {
        this.f4396A = interfaceC0897x;
    }

    void setScrollState(int i10) {
        if (i10 == this.f4438e0) {
            return;
        }
        this.f4438e0 = i10;
        if (i10 != 2) {
            m5157u1();
        }
        m5170G(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f4445l0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f4445l0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0873b0 abstractC0873b0) {
        this.f4449o.m5524F(abstractC0873b0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m3766o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m3768q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f4418L) {
            m5221n("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f4418L = false;
                if (this.f4416K && this.f4471z != null && this.f4469y != null) {
                    requestLayout();
                }
                this.f4416K = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4418L = true;
            this.f4420M = true;
            m5236t1();
        }
    }

    /* renamed from: t */
    void m5235t() {
        if (this.f4412I && !this.f4428R) {
            if (this.f4453q.m5702p()) {
                if (this.f4453q.m5701o(4) && !this.f4453q.m5701o(11)) {
                    C0632k.m3360a("RV PartialInvalidate");
                    m5226p1();
                    m5169F0();
                    this.f4453q.m5704s();
                    if (!this.f4416K) {
                        if (m5150l0()) {
                            m5161A();
                        } else {
                            this.f4453q.m5696i();
                        }
                    }
                    m5231r1(true);
                    m5171G0();
                    C0632k.m3361b();
                    return;
                }
                if (this.f4453q.m5702p()) {
                    C0632k.m3360a("RV FullInvalidate");
                    m5161A();
                    C0632k.m3361b();
                    return;
                }
                return;
            }
            return;
        }
        C0632k.m3360a("RV FullInvalidate");
        m5161A();
        C0632k.m3361b();
    }

    /* renamed from: t1 */
    public void m5236t1() {
        setScrollState(0);
        m5157u1();
    }

    /* renamed from: u0 */
    void m5237u0(int i10) {
        if (this.f4471z == null) {
            return;
        }
        setScrollState(2);
        this.f4471z.mo5100x1(i10);
        awakenScrollBars();
    }

    /* renamed from: v */
    void m5238v(int i10, int i11) {
        setMeasuredDimension(AbstractC0889p.m5387n(i10, getPaddingLeft() + getPaddingRight(), C0690v.m3795G(this)), AbstractC0889p.m5387n(i11, getPaddingTop() + getPaddingBottom(), C0690v.m3793F(this)));
    }

    /* renamed from: v0 */
    void m5239v0() {
        int m5719j = this.f4455r.m5719j();
        for (int i10 = 0; i10 < m5719j; i10++) {
            ((C0890q) this.f4455r.m5718i(i10).getLayoutParams()).f4568c = true;
        }
        this.f4449o.m5546s();
    }

    /* renamed from: v1 */
    void m5240v1(int i10, int i11, Object obj) {
        int i12;
        int m5719j = this.f4455r.m5719j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < m5719j; i14++) {
            View m5718i = this.f4455r.m5718i(i14);
            AbstractC0877d0 m5142e0 = m5142e0(m5718i);
            if (m5142e0 != null && !m5142e0.m5277J() && (i12 = m5142e0.f4504c) >= i10 && i12 < i13) {
                m5142e0.m5281b(2);
                m5142e0.m5280a(obj);
                ((C0890q) m5718i.getLayoutParams()).f4568c = true;
            }
        }
        this.f4449o.m5530M(i10, i11);
    }

    /* renamed from: w0 */
    void m5241w0() {
        int m5719j = this.f4455r.m5719j();
        for (int i10 = 0; i10 < m5719j; i10++) {
            AbstractC0877d0 m5142e0 = m5142e0(this.f4455r.m5718i(i10));
            if (m5142e0 != null && !m5142e0.m5277J()) {
                m5142e0.m5281b(6);
            }
        }
        m5239v0();
        this.f4449o.m5547t();
    }

    /* renamed from: x */
    void m5242x(View view) {
        AbstractC0877d0 m5142e0 = m5142e0(view);
        m5165D0(view);
        AbstractC0881h abstractC0881h = this.f4469y;
        if (abstractC0881h != null && m5142e0 != null) {
            abstractC0881h.m5340p(m5142e0);
        }
        List<InterfaceC0891r> list = this.f4427Q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4427Q.get(size).m5495a(view);
            }
        }
    }

    /* renamed from: y */
    void m5243y(View view) {
        AbstractC0877d0 m5142e0 = m5142e0(view);
        m5167E0(view);
        AbstractC0881h abstractC0881h = this.f4469y;
        if (abstractC0881h != null && m5142e0 != null) {
            abstractC0881h.m5341q(m5142e0);
        }
        List<InterfaceC0891r> list = this.f4427Q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4427Q.get(size).m5496b(view);
            }
        }
    }

    /* renamed from: y0 */
    public void m5244y0(int i10) {
        int m5717g = this.f4455r.m5717g();
        for (int i11 = 0; i11 < m5717g; i11++) {
            this.f4455r.m5716f(i11).offsetLeftAndRight(i10);
        }
    }

    /* renamed from: z0 */
    public void m5245z0(int i10) {
        int m5717g = this.f4455r.m5717g();
        for (int i11 = 0; i11 < m5717g; i11++) {
            this.f4455r.m5716f(i11).offsetTopAndBottom(i10);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4447n = new C0898y();
        this.f4449o = new C0896w();
        this.f4457s = new C0921p();
        this.f4461u = new RunnableC0870a();
        this.f4463v = new Rect();
        this.f4465w = new Rect();
        this.f4467x = new RectF();
        this.f4398B = new ArrayList();
        this.f4400C = new ArrayList<>();
        this.f4402D = new ArrayList<>();
        this.f4414J = 0;
        this.f4428R = false;
        this.f4429S = false;
        this.f4430T = 0;
        this.f4431U = 0;
        this.f4432V = new C0885l();
        this.f4437d0 = new C0908c();
        this.f4438e0 = 0;
        this.f4439f0 = -1;
        this.f4452p0 = Float.MIN_VALUE;
        this.f4454q0 = Float.MIN_VALUE;
        this.f4456r0 = true;
        this.f4458s0 = new RunnableC0875c0();
        this.f4462u0 = f4391T0 ? new RunnableC0910e.b() : null;
        this.f4464v0 = new C0871a0();
        this.f4470y0 = false;
        this.f4472z0 = false;
        this.f4397A0 = new C0887n();
        this.f4399B0 = false;
        this.f4405E0 = new int[2];
        this.f4409G0 = new int[2];
        this.f4411H0 = new int[2];
        this.f4413I0 = new int[2];
        this.f4415J0 = new ArrayList();
        this.f4417K0 = new RunnableC0872b();
        this.f4421M0 = 0;
        this.f4423N0 = 0;
        this.f4425O0 = new C0876d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4445l0 = viewConfiguration.getScaledTouchSlop();
        this.f4452p0 = C0692x.m4015b(viewConfiguration, context);
        this.f4454q0 = C0692x.m4017d(viewConfiguration, context);
        this.f4448n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4450o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4437d0.m5372v(this.f4397A0);
        m5219m0();
        m5152o0();
        m5151n0();
        if (C0690v.m3787C(this) == 0) {
            C0690v.m3871z0(this, 1);
        }
        this.f4426P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0916k(this));
        int[] iArr = C3468c.f14397f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C0690v.m3849o0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(C3468c.f14406o);
        if (obtainStyledAttributes.getInt(C3468c.f14400i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4459t = obtainStyledAttributes.getBoolean(C3468c.f14399h, true);
        boolean z10 = obtainStyledAttributes.getBoolean(C3468c.f14401j, false);
        this.f4410H = z10;
        if (z10) {
            m5225p0((StateListDrawable) obtainStyledAttributes.getDrawable(C3468c.f14404m), obtainStyledAttributes.getDrawable(C3468c.f14405n), (StateListDrawable) obtainStyledAttributes.getDrawable(C3468c.f14402k), obtainStyledAttributes.getDrawable(C3468c.f14403l));
        }
        obtainStyledAttributes.recycle();
        m5156u(context, string, attributeSet, i10, 0);
        int[] iArr2 = f4387P0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        C0690v.m3849o0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0869a();

        /* renamed from: n */
        Parcelable f4473n;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes.dex */
        class C0869a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0869a() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4473n = parcel.readParcelable(classLoader == null ? AbstractC0889p.class.getClassLoader() : classLoader);
        }

        /* renamed from: a */
        void m5246a(SavedState savedState) {
            this.f4473n = savedState.f4473n;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f4473n, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public static class C0890q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0877d0 f4566a;

        /* renamed from: b */
        final Rect f4567b;

        /* renamed from: c */
        boolean f4568c;

        /* renamed from: d */
        boolean f4569d;

        public C0890q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4567b = new Rect();
            this.f4568c = true;
            this.f4569d = false;
        }

        /* renamed from: a */
        public int m5491a() {
            return this.f4566a.m5291m();
        }

        /* renamed from: b */
        public boolean m5492b() {
            return this.f4566a.m5303y();
        }

        /* renamed from: c */
        public boolean m5493c() {
            return this.f4566a.m5300v();
        }

        /* renamed from: d */
        public boolean m5494d() {
            return this.f4566a.m5298t();
        }

        public C0890q(int i10, int i11) {
            super(i10, i11);
            this.f4567b = new Rect();
            this.f4568c = true;
            this.f4569d = false;
        }

        public C0890q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4567b = new Rect();
            this.f4568c = true;
            this.f4569d = false;
        }

        public C0890q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4567b = new Rect();
            this.f4568c = true;
            this.f4569d = false;
        }

        public C0890q(C0890q c0890q) {
            super((ViewGroup.LayoutParams) c0890q);
            this.f4567b = new Rect();
            this.f4568c = true;
            this.f4569d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0889p abstractC0889p = this.f4471z;
        if (abstractC0889p != null) {
            return abstractC0889p.mo5006F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m5182O());
    }
}
