package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.C3861f;
import p147l0.C3862g;
import p147l0.C3865j;
import p147l0.C3866k;
import p158m0.C3914b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: A */
    private int f2413A;

    /* renamed from: B */
    private int f2414B;

    /* renamed from: C */
    int f2415C;

    /* renamed from: D */
    int f2416D;

    /* renamed from: E */
    int f2417E;

    /* renamed from: F */
    int f2418F;

    /* renamed from: G */
    private SparseArray<C3860e> f2419G;

    /* renamed from: H */
    C0545c f2420H;

    /* renamed from: I */
    private int f2421I;

    /* renamed from: J */
    private int f2422J;

    /* renamed from: n */
    SparseArray<View> f2423n;

    /* renamed from: o */
    private ArrayList<AbstractC0547b> f2424o;

    /* renamed from: p */
    protected C3861f f2425p;

    /* renamed from: q */
    private int f2426q;

    /* renamed from: r */
    private int f2427r;

    /* renamed from: s */
    private int f2428s;

    /* renamed from: t */
    private int f2429t;

    /* renamed from: u */
    protected boolean f2430u;

    /* renamed from: v */
    private int f2431v;

    /* renamed from: w */
    private C0549d f2432w;

    /* renamed from: x */
    protected C0548c f2433x;

    /* renamed from: y */
    private int f2434y;

    /* renamed from: z */
    private HashMap<String, Integer> f2435z;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0543a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2436a;

        static {
            int[] iArr = new int[C3860e.b.values().length];
            f2436a = iArr;
            try {
                iArr[C3860e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2436a[C3860e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2436a[C3860e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2436a[C3860e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    /* loaded from: classes.dex */
    public class C0545c implements C3914b.b {

        /* renamed from: a */
        ConstraintLayout f2505a;

        /* renamed from: b */
        int f2506b;

        /* renamed from: c */
        int f2507c;

        /* renamed from: d */
        int f2508d;

        /* renamed from: e */
        int f2509e;

        /* renamed from: f */
        int f2510f;

        /* renamed from: g */
        int f2511g;

        public C0545c(ConstraintLayout constraintLayout) {
            this.f2505a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m2550d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // p158m0.C3914b.b
        /* renamed from: a */
        public final void mo2551a() {
            int childCount = this.f2505a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f2505a.getChildAt(i10);
                if (childAt instanceof C0552g) {
                    ((C0552g) childAt).m2608a(this.f2505a);
                }
            }
            int size = this.f2505a.f2424o.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0547b) this.f2505a.f2424o.get(i11)).m2566k(this.f2505a);
                }
            }
        }

        @Override // p158m0.C3914b.b
        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        public final void mo2552b(C3860e c3860e, C3914b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i10;
            int i11;
            int i12;
            if (c3860e == null) {
                return;
            }
            if (c3860e.m16355Q() == 8 && !c3860e.m16374a0()) {
                aVar.f16230e = 0;
                aVar.f16231f = 0;
                aVar.f16232g = 0;
                return;
            }
            if (c3860e.m16339I() == null) {
                return;
            }
            C3860e.b bVar = aVar.f16226a;
            C3860e.b bVar2 = aVar.f16227b;
            int i13 = aVar.f16228c;
            int i14 = aVar.f16229d;
            int i15 = this.f2506b + this.f2507c;
            int i16 = this.f2508d;
            View view = (View) c3860e.m16397q();
            int[] iArr = C0543a.f2436a;
            int i17 = iArr[bVar.ordinal()];
            if (i17 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (i17 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2510f, i16, -2);
            } else if (i17 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2510f, i16 + c3860e.m16415z(), -1);
            } else if (i17 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f2510f, i16, -2);
                boolean z10 = c3860e.f16022p == 1;
                int i18 = aVar.f16235j;
                if (i18 == C3914b.a.f16224l || i18 == C3914b.a.f16225m) {
                    if (aVar.f16235j == C3914b.a.f16225m || !z10 || (z10 && (view.getMeasuredHeight() == c3860e.m16407v())) || (view instanceof C0552g) || c3860e.mo16285e0()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c3860e.m16357R(), 1073741824);
                    }
                }
            }
            int i19 = iArr[bVar2.ordinal()];
            if (i19 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else if (i19 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2511g, i15, -2);
            } else if (i19 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2511g, i15 + c3860e.m16353P(), -1);
            } else if (i19 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f2511g, i15, -2);
                boolean z11 = c3860e.f16024q == 1;
                int i20 = aVar.f16235j;
                if (i20 == C3914b.a.f16224l || i20 == C3914b.a.f16225m) {
                    if (aVar.f16235j == C3914b.a.f16225m || !z11 || (z11 && (view.getMeasuredWidth() == c3860e.m16357R())) || (view instanceof C0552g) || c3860e.mo16287f0()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c3860e.m16407v(), 1073741824);
                    }
                }
            }
            C3861f c3861f = (C3861f) c3860e.m16339I();
            if (c3861f != null && C3865j.m16464b(ConstraintLayout.this.f2431v, 256) && view.getMeasuredWidth() == c3860e.m16357R() && view.getMeasuredWidth() < c3861f.m16357R() && view.getMeasuredHeight() == c3860e.m16407v() && view.getMeasuredHeight() < c3861f.m16407v() && view.getBaseline() == c3860e.m16391n() && !c3860e.m16377d0()) {
                if (m2550d(c3860e.m16323A(), makeMeasureSpec, c3860e.m16357R()) && m2550d(c3860e.m16325B(), makeMeasureSpec2, c3860e.m16407v())) {
                    aVar.f16230e = c3860e.m16357R();
                    aVar.f16231f = c3860e.m16407v();
                    aVar.f16232g = c3860e.m16391n();
                    return;
                }
            }
            C3860e.b bVar3 = C3860e.b.MATCH_CONSTRAINT;
            boolean z12 = bVar == bVar3;
            boolean z13 = bVar2 == bVar3;
            C3860e.b bVar4 = C3860e.b.MATCH_PARENT;
            boolean z14 = bVar2 == bVar4 || bVar2 == C3860e.b.FIXED;
            boolean z15 = bVar == bVar4 || bVar == C3860e.b.FIXED;
            boolean z16 = z12 && c3860e.f15988W > 0.0f;
            boolean z17 = z13 && c3860e.f15988W > 0.0f;
            if (view == null) {
                return;
            }
            C0544b c0544b = (C0544b) view.getLayoutParams();
            int i21 = aVar.f16235j;
            if (i21 != C3914b.a.f16224l && i21 != C3914b.a.f16225m && z12 && c3860e.f16022p == 0 && z13 && c3860e.f16024q == 0) {
                i12 = -1;
                i11 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof AbstractC0555j) && (c3860e instanceof C3866k)) {
                    ((AbstractC0555j) view).m2610o((C3866k) c3860e, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                c3860e.m16334F0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i22 = c3860e.f16028s;
                max = i22 > 0 ? Math.max(i22, measuredWidth) : measuredWidth;
                int i23 = c3860e.f16030t;
                if (i23 > 0) {
                    max = Math.min(i23, max);
                }
                int i24 = c3860e.f16034v;
                if (i24 > 0) {
                    i11 = Math.max(i24, measuredHeight);
                    i10 = makeMeasureSpec;
                } else {
                    i10 = makeMeasureSpec;
                    i11 = measuredHeight;
                }
                int i25 = c3860e.f16036w;
                if (i25 > 0) {
                    i11 = Math.min(i25, i11);
                }
                if (!C3865j.m16464b(ConstraintLayout.this.f2431v, 1)) {
                    if (z16 && z14) {
                        max = (int) ((i11 * c3860e.f15988W) + 0.5f);
                    } else if (z17 && z15) {
                        i11 = (int) ((max / c3860e.f15988W) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i11) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i10;
                    if (measuredHeight != i11) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    }
                    view.measure(makeMeasureSpec3, makeMeasureSpec2);
                    c3860e.m16334F0(makeMeasureSpec3, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    i11 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i12 = -1;
            }
            boolean z18 = baseline != i12;
            aVar.f16234i = (max == aVar.f16228c && i11 == aVar.f16229d) ? false : true;
            if (c0544b.f2461Y) {
                z18 = true;
            }
            if (z18 && baseline != -1 && c3860e.m16391n() != baseline) {
                aVar.f16234i = true;
            }
            aVar.f16230e = max;
            aVar.f16231f = i11;
            aVar.f16233h = z18;
            aVar.f16232g = baseline;
        }

        /* renamed from: c */
        public void m2553c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f2506b = i12;
            this.f2507c = i13;
            this.f2508d = i14;
            this.f2509e = i15;
            this.f2510f = i10;
            this.f2511g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2423n = new SparseArray<>();
        this.f2424o = new ArrayList<>(4);
        this.f2425p = new C3861f();
        this.f2426q = 0;
        this.f2427r = 0;
        this.f2428s = Integer.MAX_VALUE;
        this.f2429t = Integer.MAX_VALUE;
        this.f2430u = true;
        this.f2431v = 257;
        this.f2432w = null;
        this.f2433x = null;
        this.f2434y = -1;
        this.f2435z = new HashMap<>();
        this.f2413A = -1;
        this.f2414B = -1;
        this.f2415C = -1;
        this.f2416D = -1;
        this.f2417E = 0;
        this.f2418F = 0;
        this.f2419G = new SparseArray<>();
        this.f2420H = new C0545c(this);
        this.f2421I = 0;
        this.f2422J = 0;
        m2533k(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    /* renamed from: h */
    private final C3860e m2532h(int i10) {
        if (i10 == 0) {
            return this.f2425p;
        }
        View view = this.f2423n.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2425p;
        }
        if (view == null) {
            return null;
        }
        return ((C0544b) view.getLayoutParams()).f2490n0;
    }

    /* renamed from: k */
    private void m2533k(AttributeSet attributeSet, int i10, int i11) {
        this.f2425p.m16388l0(this);
        this.f2425p.m16424D1(this.f2420H);
        this.f2423n.put(getId(), this);
        this.f2432w = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0554i.f2829a1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == C0554i.f2864f1) {
                    this.f2426q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2426q);
                } else if (index == C0554i.f2871g1) {
                    this.f2427r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2427r);
                } else if (index == C0554i.f2850d1) {
                    this.f2428s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2428s);
                } else if (index == C0554i.f2857e1) {
                    this.f2429t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2429t);
                } else if (index == C0554i.f2918n2) {
                    this.f2431v = obtainStyledAttributes.getInt(index, this.f2431v);
                } else if (index == C0554i.f2923o1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m2544n(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2433x = null;
                        }
                    }
                } else if (index == C0554i.f2905l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0549d c0549d = new C0549d();
                        this.f2432w = c0549d;
                        c0549d.m2588m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2432w = null;
                    }
                    this.f2434y = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2425p.m16425E1(this.f2431v);
    }

    /* renamed from: m */
    private void m2534m() {
        this.f2430u = true;
        this.f2413A = -1;
        this.f2414B = -1;
        this.f2415C = -1;
        this.f2416D = -1;
        this.f2417E = 0;
        this.f2418F = 0;
    }

    /* renamed from: q */
    private void m2535q() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C3860e m2542j = m2542j(getChildAt(i10));
            if (m2542j != null) {
                m2542j.mo16381h0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m2547r(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m2532h(childAt.getId()).m16390m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2434y != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f2434y && (childAt2 instanceof C0550e)) {
                    this.f2432w = ((C0550e) childAt2).getConstraintSet();
                }
            }
        }
        C0549d c0549d = this.f2432w;
        if (c0549d != null) {
            c0549d.m2582d(this, true);
        }
        this.f2425p.m16470d1();
        int size = this.f2424o.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f2424o.get(i13).m2568m(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof C0552g) {
                ((C0552g) childAt3).m2609b(this);
            }
        }
        this.f2419G.clear();
        this.f2419G.put(0, this.f2425p);
        this.f2419G.put(getId(), this.f2425p);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f2419G.put(childAt4.getId(), m2542j(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            C3860e m2542j2 = m2542j(childAt5);
            if (m2542j2 != null) {
                C0544b c0544b = (C0544b) childAt5.getLayoutParams();
                this.f2425p.m16468b(m2542j2);
                m2537d(isInEditMode, childAt5, m2542j2, c0544b, this.f2419G);
            }
        }
    }

    /* renamed from: t */
    private boolean m2536t() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            m2535q();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0544b;
    }

    /* renamed from: d */
    protected void m2537d(boolean z10, View view, C3860e c3860e, C0544b c0544b, SparseArray<C3860e> sparseArray) {
        float f10;
        C3860e c3860e2;
        C3860e c3860e3;
        C3860e c3860e4;
        C3860e c3860e5;
        int i10;
        c0544b.m2549a();
        c0544b.f2492o0 = false;
        c3860e.m16362T0(view.getVisibility());
        if (c0544b.f2466b0) {
            c3860e.m16330D0(true);
            c3860e.m16362T0(8);
        }
        c3860e.m16388l0(view);
        if (view instanceof AbstractC0547b) {
            ((AbstractC0547b) view).mo2528i(c3860e, this.f2425p.m16445x1());
        }
        if (c0544b.f2462Z) {
            C3862g c3862g = (C3862g) c3860e;
            int i11 = c0544b.f2484k0;
            int i12 = c0544b.f2486l0;
            float f11 = c0544b.f2488m0;
            if (f11 != -1.0f) {
                c3862g.m16456i1(f11);
                return;
            } else if (i11 != -1) {
                c3862g.m16454g1(i11);
                return;
            } else {
                if (i12 != -1) {
                    c3862g.m16455h1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = c0544b.f2470d0;
        int i14 = c0544b.f2472e0;
        int i15 = c0544b.f2474f0;
        int i16 = c0544b.f2476g0;
        int i17 = c0544b.f2478h0;
        int i18 = c0544b.f2480i0;
        float f12 = c0544b.f2482j0;
        int i19 = c0544b.f2487m;
        if (i19 != -1) {
            C3860e c3860e6 = sparseArray.get(i19);
            if (c3860e6 != null) {
                c3860e.m16383j(c3860e6, c0544b.f2491o, c0544b.f2489n);
            }
        } else {
            if (i13 != -1) {
                C3860e c3860e7 = sparseArray.get(i13);
                if (c3860e7 != null) {
                    C3859d.b bVar = C3859d.b.LEFT;
                    f10 = f12;
                    c3860e.m16369X(bVar, c3860e7, bVar, ((ViewGroup.MarginLayoutParams) c0544b).leftMargin, i17);
                } else {
                    f10 = f12;
                }
            } else {
                f10 = f12;
                if (i14 != -1 && (c3860e2 = sparseArray.get(i14)) != null) {
                    c3860e.m16369X(C3859d.b.LEFT, c3860e2, C3859d.b.RIGHT, ((ViewGroup.MarginLayoutParams) c0544b).leftMargin, i17);
                }
            }
            if (i15 != -1) {
                C3860e c3860e8 = sparseArray.get(i15);
                if (c3860e8 != null) {
                    c3860e.m16369X(C3859d.b.RIGHT, c3860e8, C3859d.b.LEFT, ((ViewGroup.MarginLayoutParams) c0544b).rightMargin, i18);
                }
            } else if (i16 != -1 && (c3860e3 = sparseArray.get(i16)) != null) {
                C3859d.b bVar2 = C3859d.b.RIGHT;
                c3860e.m16369X(bVar2, c3860e3, bVar2, ((ViewGroup.MarginLayoutParams) c0544b).rightMargin, i18);
            }
            int i20 = c0544b.f2477h;
            if (i20 != -1) {
                C3860e c3860e9 = sparseArray.get(i20);
                if (c3860e9 != null) {
                    C3859d.b bVar3 = C3859d.b.TOP;
                    c3860e.m16369X(bVar3, c3860e9, bVar3, ((ViewGroup.MarginLayoutParams) c0544b).topMargin, c0544b.f2498u);
                }
            } else {
                int i21 = c0544b.f2479i;
                if (i21 != -1 && (c3860e4 = sparseArray.get(i21)) != null) {
                    c3860e.m16369X(C3859d.b.TOP, c3860e4, C3859d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) c0544b).topMargin, c0544b.f2498u);
                }
            }
            int i22 = c0544b.f2481j;
            if (i22 != -1) {
                C3860e c3860e10 = sparseArray.get(i22);
                if (c3860e10 != null) {
                    c3860e.m16369X(C3859d.b.BOTTOM, c3860e10, C3859d.b.TOP, ((ViewGroup.MarginLayoutParams) c0544b).bottomMargin, c0544b.f2500w);
                }
            } else {
                int i23 = c0544b.f2483k;
                if (i23 != -1 && (c3860e5 = sparseArray.get(i23)) != null) {
                    C3859d.b bVar4 = C3859d.b.BOTTOM;
                    c3860e.m16369X(bVar4, c3860e5, bVar4, ((ViewGroup.MarginLayoutParams) c0544b).bottomMargin, c0544b.f2500w);
                }
            }
            int i24 = c0544b.f2485l;
            if (i24 != -1) {
                View view2 = this.f2423n.get(i24);
                C3860e c3860e11 = sparseArray.get(c0544b.f2485l);
                if (c3860e11 != null && view2 != null && (view2.getLayoutParams() instanceof C0544b)) {
                    C0544b c0544b2 = (C0544b) view2.getLayoutParams();
                    c0544b.f2461Y = true;
                    c0544b2.f2461Y = true;
                    C3859d.b bVar5 = C3859d.b.BASELINE;
                    c3860e.mo16389m(bVar5).m16301a(c3860e11.mo16389m(bVar5), 0, -1, true);
                    c3860e.m16406u0(true);
                    c0544b2.f2490n0.m16406u0(true);
                    c3860e.mo16389m(C3859d.b.TOP).m16316p();
                    c3860e.mo16389m(C3859d.b.BOTTOM).m16316p();
                }
            }
            float f13 = f10;
            if (f13 >= 0.0f) {
                c3860e.m16410w0(f13);
            }
            float f14 = c0544b.f2437A;
            if (f14 >= 0.0f) {
                c3860e.m16350N0(f14);
            }
        }
        if (z10 && ((i10 = c0544b.f2453Q) != -1 || c0544b.f2454R != -1)) {
            c3860e.m16346L0(i10, c0544b.f2454R);
        }
        if (!c0544b.f2459W) {
            if (((ViewGroup.MarginLayoutParams) c0544b).width == -1) {
                if (c0544b.f2456T) {
                    c3860e.m16416z0(C3860e.b.MATCH_CONSTRAINT);
                } else {
                    c3860e.m16416z0(C3860e.b.MATCH_PARENT);
                }
                c3860e.mo16389m(C3859d.b.LEFT).f15949g = ((ViewGroup.MarginLayoutParams) c0544b).leftMargin;
                c3860e.mo16389m(C3859d.b.RIGHT).f15949g = ((ViewGroup.MarginLayoutParams) c0544b).rightMargin;
            } else {
                c3860e.m16416z0(C3860e.b.MATCH_CONSTRAINT);
                c3860e.m16364U0(0);
            }
        } else {
            c3860e.m16416z0(C3860e.b.FIXED);
            c3860e.m16364U0(((ViewGroup.MarginLayoutParams) c0544b).width);
            if (((ViewGroup.MarginLayoutParams) c0544b).width == -2) {
                c3860e.m16416z0(C3860e.b.WRAP_CONTENT);
            }
        }
        if (!c0544b.f2460X) {
            if (((ViewGroup.MarginLayoutParams) c0544b).height == -1) {
                if (c0544b.f2457U) {
                    c3860e.m16356Q0(C3860e.b.MATCH_CONSTRAINT);
                } else {
                    c3860e.m16356Q0(C3860e.b.MATCH_PARENT);
                }
                c3860e.mo16389m(C3859d.b.TOP).f15949g = ((ViewGroup.MarginLayoutParams) c0544b).topMargin;
                c3860e.mo16389m(C3859d.b.BOTTOM).f15949g = ((ViewGroup.MarginLayoutParams) c0544b).bottomMargin;
            } else {
                c3860e.m16356Q0(C3860e.b.MATCH_CONSTRAINT);
                c3860e.m16408v0(0);
            }
        } else {
            c3860e.m16356Q0(C3860e.b.FIXED);
            c3860e.m16408v0(((ViewGroup.MarginLayoutParams) c0544b).height);
            if (((ViewGroup.MarginLayoutParams) c0544b).height == -2) {
                c3860e.m16356Q0(C3860e.b.WRAP_CONTENT);
            }
        }
        c3860e.m16392n0(c0544b.f2438B);
        c3860e.m16326B0(c0544b.f2441E);
        c3860e.m16360S0(c0544b.f2442F);
        c3860e.m16412x0(c0544b.f2443G);
        c3860e.m16352O0(c0544b.f2444H);
        c3860e.m16324A0(c0544b.f2445I, c0544b.f2447K, c0544b.f2449M, c0544b.f2451O);
        c3860e.m16358R0(c0544b.f2446J, c0544b.f2448L, c0544b.f2450N, c0544b.f2452P);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0547b> arrayList = this.f2424o;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f2424o.get(i10).m2567l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0544b generateDefaultLayoutParams() {
        return new C0544b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0544b generateLayoutParams(AttributeSet attributeSet) {
        return new C0544b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        m2534m();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object m2540g(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2435z;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2435z.get(str);
    }

    public int getMaxHeight() {
        return this.f2429t;
    }

    public int getMaxWidth() {
        return this.f2428s;
    }

    public int getMinHeight() {
        return this.f2427r;
    }

    public int getMinWidth() {
        return this.f2426q;
    }

    public int getOptimizationLevel() {
        return this.f2425p.m16440s1();
    }

    /* renamed from: i */
    public View m2541i(int i10) {
        return this.f2423n.get(i10);
    }

    /* renamed from: j */
    public final C3860e m2542j(View view) {
        if (view == this) {
            return this.f2425p;
        }
        if (view == null) {
            return null;
        }
        return ((C0544b) view.getLayoutParams()).f2490n0;
    }

    /* renamed from: l */
    protected boolean m2543l() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: n */
    protected void m2544n(int i10) {
        this.f2433x = new C0548c(getContext(), this, i10);
    }

    /* renamed from: o */
    protected void m2545o(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        C0545c c0545c = this.f2420H;
        int i14 = c0545c.f2509e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + c0545c.f2508d, i10, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int min = Math.min(this.f2428s, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f2429t, resolveSizeAndState2);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f2413A = min;
        this.f2414B = min2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C0544b c0544b = (C0544b) childAt.getLayoutParams();
            C3860e c3860e = c0544b.f2490n0;
            if ((childAt.getVisibility() != 8 || c0544b.f2462Z || c0544b.f2464a0 || c0544b.f2468c0 || isInEditMode) && !c0544b.f2466b0) {
                int m16359S = c3860e.m16359S();
                int m16361T = c3860e.m16361T();
                int m16357R = c3860e.m16357R() + m16359S;
                int m16407v = c3860e.m16407v() + m16361T;
                childAt.layout(m16359S, m16361T, m16357R, m16407v);
                if ((childAt instanceof C0552g) && (content = ((C0552g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m16359S, m16361T, m16357R, m16407v);
                }
            }
        }
        int size = this.f2424o.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f2424o.get(i15).m2565j(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f2430u) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f2430u = true;
                    break;
                }
                i12++;
            }
        }
        if (!this.f2430u) {
            int i13 = this.f2421I;
            if (i13 == i10 && this.f2422J == i11) {
                m2545o(i10, i11, this.f2425p.m16357R(), this.f2425p.m16407v(), this.f2425p.m16446y1(), this.f2425p.m16444w1());
                return;
            }
            if (i13 == i10 && View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f2422J) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i11) >= this.f2425p.m16407v()) {
                this.f2421I = i10;
                this.f2422J = i11;
                m2545o(i10, i11, this.f2425p.m16357R(), this.f2425p.m16407v(), this.f2425p.m16446y1(), this.f2425p.m16444w1());
                return;
            }
        }
        this.f2421I = i10;
        this.f2422J = i11;
        this.f2425p.m16426F1(m2543l());
        if (this.f2430u) {
            this.f2430u = false;
            if (m2536t()) {
                this.f2425p.m16428H1();
            }
        }
        m2546p(this.f2425p, this.f2431v, i10, i11);
        m2545o(i10, i11, this.f2425p.m16357R(), this.f2425p.m16407v(), this.f2425p.m16446y1(), this.f2425p.m16444w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C3860e m2542j = m2542j(view);
        if ((view instanceof Guideline) && !(m2542j instanceof C3862g)) {
            C0544b c0544b = (C0544b) view.getLayoutParams();
            C3862g c3862g = new C3862g();
            c0544b.f2490n0 = c3862g;
            c0544b.f2462Z = true;
            c3862g.m16457j1(c0544b.f2455S);
        }
        if (view instanceof AbstractC0547b) {
            AbstractC0547b abstractC0547b = (AbstractC0547b) view;
            abstractC0547b.m2569n();
            ((C0544b) view.getLayoutParams()).f2464a0 = true;
            if (!this.f2424o.contains(abstractC0547b)) {
                this.f2424o.add(abstractC0547b);
            }
        }
        this.f2423n.put(view.getId(), view);
        this.f2430u = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2423n.remove(view.getId());
        this.f2425p.m16469c1(m2542j(view));
        this.f2424o.remove(view);
        this.f2430u = true;
    }

    /* renamed from: p */
    protected void m2546p(C3861f c3861f, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2420H.m2553c(i11, i12, max, max2, paddingWidth, i14);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i13 = Math.max(0, getPaddingLeft());
        } else {
            i13 = m2543l() ? max4 : max3;
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        m2548s(c3861f, mode, i15, mode2, i16);
        c3861f.m16447z1(i10, mode, i15, mode2, i16, this.f2413A, this.f2414B, i13, max);
    }

    /* renamed from: r */
    public void m2547r(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2435z == null) {
                this.f2435z = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2435z.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m2534m();
        super.requestLayout();
    }

    /* renamed from: s */
    protected void m2548s(C3861f c3861f, int i10, int i11, int i12, int i13) {
        C3860e.b bVar;
        C0545c c0545c = this.f2420H;
        int i14 = c0545c.f2509e;
        int i15 = c0545c.f2508d;
        C3860e.b bVar2 = C3860e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = C3860e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f2426q);
            }
        } else if (i10 == 0) {
            bVar = C3860e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f2426q);
            }
            i11 = 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
            i11 = 0;
        } else {
            i11 = Math.min(this.f2428s - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = C3860e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2427r);
            }
        } else if (i12 != 0) {
            if (i12 == 1073741824) {
                i13 = Math.min(this.f2429t - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = C3860e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f2427r);
            }
            i13 = 0;
        }
        if (i11 != c3861f.m16357R() || i13 != c3861f.m16407v()) {
            c3861f.m16443v1();
        }
        c3861f.m16366V0(0);
        c3861f.m16368W0(0);
        c3861f.m16338H0(this.f2428s - i15);
        c3861f.m16336G0(this.f2429t - i14);
        c3861f.m16344K0(0);
        c3861f.m16342J0(0);
        c3861f.m16416z0(bVar);
        c3861f.m16364U0(i11);
        c3861f.m16356Q0(bVar2);
        c3861f.m16408v0(i13);
        c3861f.m16344K0(this.f2426q - i15);
        c3861f.m16342J0(this.f2427r - i14);
    }

    public void setConstraintSet(C0549d c0549d) {
        this.f2432w = c0549d;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f2423n.remove(getId());
        super.setId(i10);
        this.f2423n.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f2429t) {
            return;
        }
        this.f2429t = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f2428s) {
            return;
        }
        this.f2428s = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f2427r) {
            return;
        }
        this.f2427r = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f2426q) {
            return;
        }
        this.f2426q = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0551f abstractC0551f) {
        C0548c c0548c = this.f2433x;
        if (c0548c != null) {
            c0548c.m2572c(abstractC0551f);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f2431v = i10;
        this.f2425p.m16425E1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0544b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2423n = new SparseArray<>();
        this.f2424o = new ArrayList<>(4);
        this.f2425p = new C3861f();
        this.f2426q = 0;
        this.f2427r = 0;
        this.f2428s = Integer.MAX_VALUE;
        this.f2429t = Integer.MAX_VALUE;
        this.f2430u = true;
        this.f2431v = 257;
        this.f2432w = null;
        this.f2433x = null;
        this.f2434y = -1;
        this.f2435z = new HashMap<>();
        this.f2413A = -1;
        this.f2414B = -1;
        this.f2415C = -1;
        this.f2416D = -1;
        this.f2417E = 0;
        this.f2418F = 0;
        this.f2419G = new SparseArray<>();
        this.f2420H = new C0545c(this);
        this.f2421I = 0;
        this.f2422J = 0;
        m2533k(attributeSet, i10, 0);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    /* loaded from: classes.dex */
    public static class C0544b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2437A;

        /* renamed from: B */
        public String f2438B;

        /* renamed from: C */
        float f2439C;

        /* renamed from: D */
        int f2440D;

        /* renamed from: E */
        public float f2441E;

        /* renamed from: F */
        public float f2442F;

        /* renamed from: G */
        public int f2443G;

        /* renamed from: H */
        public int f2444H;

        /* renamed from: I */
        public int f2445I;

        /* renamed from: J */
        public int f2446J;

        /* renamed from: K */
        public int f2447K;

        /* renamed from: L */
        public int f2448L;

        /* renamed from: M */
        public int f2449M;

        /* renamed from: N */
        public int f2450N;

        /* renamed from: O */
        public float f2451O;

        /* renamed from: P */
        public float f2452P;

        /* renamed from: Q */
        public int f2453Q;

        /* renamed from: R */
        public int f2454R;

        /* renamed from: S */
        public int f2455S;

        /* renamed from: T */
        public boolean f2456T;

        /* renamed from: U */
        public boolean f2457U;

        /* renamed from: V */
        public String f2458V;

        /* renamed from: W */
        boolean f2459W;

        /* renamed from: X */
        boolean f2460X;

        /* renamed from: Y */
        boolean f2461Y;

        /* renamed from: Z */
        boolean f2462Z;

        /* renamed from: a */
        public int f2463a;

        /* renamed from: a0 */
        boolean f2464a0;

        /* renamed from: b */
        public int f2465b;

        /* renamed from: b0 */
        boolean f2466b0;

        /* renamed from: c */
        public float f2467c;

        /* renamed from: c0 */
        boolean f2468c0;

        /* renamed from: d */
        public int f2469d;

        /* renamed from: d0 */
        int f2470d0;

        /* renamed from: e */
        public int f2471e;

        /* renamed from: e0 */
        int f2472e0;

        /* renamed from: f */
        public int f2473f;

        /* renamed from: f0 */
        int f2474f0;

        /* renamed from: g */
        public int f2475g;

        /* renamed from: g0 */
        int f2476g0;

        /* renamed from: h */
        public int f2477h;

        /* renamed from: h0 */
        int f2478h0;

        /* renamed from: i */
        public int f2479i;

        /* renamed from: i0 */
        int f2480i0;

        /* renamed from: j */
        public int f2481j;

        /* renamed from: j0 */
        float f2482j0;

        /* renamed from: k */
        public int f2483k;

        /* renamed from: k0 */
        int f2484k0;

        /* renamed from: l */
        public int f2485l;

        /* renamed from: l0 */
        int f2486l0;

        /* renamed from: m */
        public int f2487m;

        /* renamed from: m0 */
        float f2488m0;

        /* renamed from: n */
        public int f2489n;

        /* renamed from: n0 */
        C3860e f2490n0;

        /* renamed from: o */
        public float f2491o;

        /* renamed from: o0 */
        public boolean f2492o0;

        /* renamed from: p */
        public int f2493p;

        /* renamed from: q */
        public int f2494q;

        /* renamed from: r */
        public int f2495r;

        /* renamed from: s */
        public int f2496s;

        /* renamed from: t */
        public int f2497t;

        /* renamed from: u */
        public int f2498u;

        /* renamed from: v */
        public int f2499v;

        /* renamed from: w */
        public int f2500w;

        /* renamed from: x */
        public int f2501x;

        /* renamed from: y */
        public int f2502y;

        /* renamed from: z */
        public float f2503z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        /* loaded from: classes.dex */
        private static class a {

            /* renamed from: a */
            public static final SparseIntArray f2504a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2504a = sparseIntArray;
                sparseIntArray.append(C0554i.f2751N1, 8);
                sparseIntArray.append(C0554i.f2757O1, 9);
                sparseIntArray.append(C0554i.f2769Q1, 10);
                sparseIntArray.append(C0554i.f2775R1, 11);
                sparseIntArray.append(C0554i.f2811X1, 12);
                sparseIntArray.append(C0554i.f2805W1, 13);
                sparseIntArray.append(C0554i.f2965v1, 14);
                sparseIntArray.append(C0554i.f2959u1, 15);
                sparseIntArray.append(C0554i.f2947s1, 16);
                sparseIntArray.append(C0554i.f2971w1, 2);
                sparseIntArray.append(C0554i.f2983y1, 3);
                sparseIntArray.append(C0554i.f2977x1, 4);
                sparseIntArray.append(C0554i.f2865f2, 49);
                sparseIntArray.append(C0554i.f2872g2, 50);
                sparseIntArray.append(C0554i.f2685C1, 5);
                sparseIntArray.append(C0554i.f2691D1, 6);
                sparseIntArray.append(C0554i.f2697E1, 7);
                sparseIntArray.append(C0554i.f2836b1, 1);
                sparseIntArray.append(C0554i.f2781S1, 17);
                sparseIntArray.append(C0554i.f2787T1, 18);
                sparseIntArray.append(C0554i.f2679B1, 19);
                sparseIntArray.append(C0554i.f2673A1, 20);
                sparseIntArray.append(C0554i.f2893j2, 21);
                sparseIntArray.append(C0554i.f2912m2, 22);
                sparseIntArray.append(C0554i.f2900k2, 23);
                sparseIntArray.append(C0554i.f2879h2, 24);
                sparseIntArray.append(C0554i.f2906l2, 25);
                sparseIntArray.append(C0554i.f2886i2, 26);
                sparseIntArray.append(C0554i.f2727J1, 29);
                sparseIntArray.append(C0554i.f2817Y1, 30);
                sparseIntArray.append(C0554i.f2989z1, 44);
                sparseIntArray.append(C0554i.f2739L1, 45);
                sparseIntArray.append(C0554i.f2830a2, 46);
                sparseIntArray.append(C0554i.f2733K1, 47);
                sparseIntArray.append(C0554i.f2823Z1, 48);
                sparseIntArray.append(C0554i.f2935q1, 27);
                sparseIntArray.append(C0554i.f2929p1, 28);
                sparseIntArray.append(C0554i.f2837b2, 31);
                sparseIntArray.append(C0554i.f2703F1, 32);
                sparseIntArray.append(C0554i.f2851d2, 33);
                sparseIntArray.append(C0554i.f2844c2, 34);
                sparseIntArray.append(C0554i.f2858e2, 35);
                sparseIntArray.append(C0554i.f2715H1, 36);
                sparseIntArray.append(C0554i.f2709G1, 37);
                sparseIntArray.append(C0554i.f2721I1, 38);
                sparseIntArray.append(C0554i.f2745M1, 39);
                sparseIntArray.append(C0554i.f2799V1, 40);
                sparseIntArray.append(C0554i.f2763P1, 41);
                sparseIntArray.append(C0554i.f2953t1, 42);
                sparseIntArray.append(C0554i.f2941r1, 43);
                sparseIntArray.append(C0554i.f2793U1, 51);
            }
        }

        public C0544b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i10;
            this.f2463a = -1;
            this.f2465b = -1;
            this.f2467c = -1.0f;
            this.f2469d = -1;
            this.f2471e = -1;
            this.f2473f = -1;
            this.f2475g = -1;
            this.f2477h = -1;
            this.f2479i = -1;
            this.f2481j = -1;
            this.f2483k = -1;
            this.f2485l = -1;
            this.f2487m = -1;
            this.f2489n = 0;
            this.f2491o = 0.0f;
            this.f2493p = -1;
            this.f2494q = -1;
            this.f2495r = -1;
            this.f2496s = -1;
            this.f2497t = -1;
            this.f2498u = -1;
            this.f2499v = -1;
            this.f2500w = -1;
            this.f2501x = -1;
            this.f2502y = -1;
            this.f2503z = 0.5f;
            this.f2437A = 0.5f;
            this.f2438B = null;
            this.f2439C = 0.0f;
            this.f2440D = 1;
            this.f2441E = -1.0f;
            this.f2442F = -1.0f;
            this.f2443G = 0;
            this.f2444H = 0;
            this.f2445I = 0;
            this.f2446J = 0;
            this.f2447K = 0;
            this.f2448L = 0;
            this.f2449M = 0;
            this.f2450N = 0;
            this.f2451O = 1.0f;
            this.f2452P = 1.0f;
            this.f2453Q = -1;
            this.f2454R = -1;
            this.f2455S = -1;
            this.f2456T = false;
            this.f2457U = false;
            this.f2458V = null;
            this.f2459W = true;
            this.f2460X = true;
            this.f2461Y = false;
            this.f2462Z = false;
            this.f2464a0 = false;
            this.f2466b0 = false;
            this.f2468c0 = false;
            this.f2470d0 = -1;
            this.f2472e0 = -1;
            this.f2474f0 = -1;
            this.f2476g0 = -1;
            this.f2478h0 = -1;
            this.f2480i0 = -1;
            this.f2482j0 = 0.5f;
            this.f2490n0 = new C3860e();
            this.f2492o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0554i.f2829a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f2504a.get(index);
                switch (i12) {
                    case 1:
                        this.f2455S = obtainStyledAttributes.getInt(index, this.f2455S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2487m);
                        this.f2487m = resourceId;
                        if (resourceId == -1) {
                            this.f2487m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2489n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2489n);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f2491o) % 360.0f;
                        this.f2491o = f10;
                        if (f10 < 0.0f) {
                            this.f2491o = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2463a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2463a);
                        break;
                    case 6:
                        this.f2465b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2465b);
                        break;
                    case 7:
                        this.f2467c = obtainStyledAttributes.getFloat(index, this.f2467c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2469d);
                        this.f2469d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2469d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2471e);
                        this.f2471e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2471e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2473f);
                        this.f2473f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2473f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2475g);
                        this.f2475g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2475g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2477h);
                        this.f2477h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2477h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2479i);
                        this.f2479i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2479i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2481j);
                        this.f2481j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2481j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2483k);
                        this.f2483k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2483k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2485l);
                        this.f2485l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2485l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2493p);
                        this.f2493p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2493p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2494q);
                        this.f2494q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2494q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2495r);
                        this.f2495r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2495r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2496s);
                        this.f2496s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2496s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2497t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2497t);
                        break;
                    case 22:
                        this.f2498u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2498u);
                        break;
                    case 23:
                        this.f2499v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2499v);
                        break;
                    case 24:
                        this.f2500w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2500w);
                        break;
                    case 25:
                        this.f2501x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2501x);
                        break;
                    case 26:
                        this.f2502y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2502y);
                        break;
                    case 27:
                        this.f2456T = obtainStyledAttributes.getBoolean(index, this.f2456T);
                        break;
                    case 28:
                        this.f2457U = obtainStyledAttributes.getBoolean(index, this.f2457U);
                        break;
                    case 29:
                        this.f2503z = obtainStyledAttributes.getFloat(index, this.f2503z);
                        break;
                    case 30:
                        this.f2437A = obtainStyledAttributes.getFloat(index, this.f2437A);
                        break;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f2445I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.f2446J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f2447K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2447K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2447K) == -2) {
                                this.f2447K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2449M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2449M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2449M) == -2) {
                                this.f2449M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2451O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2451O));
                        this.f2445I = 2;
                        break;
                    case 36:
                        try {
                            this.f2448L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2448L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2448L) == -2) {
                                this.f2448L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2450N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2450N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2450N) == -2) {
                                this.f2450N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f2452P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2452P));
                        this.f2446J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2438B = string;
                                this.f2439C = Float.NaN;
                                this.f2440D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2438B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String substring = this.f2438B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2440D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2440D = 1;
                                        }
                                        i10 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2438B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f2438B.substring(i10, indexOf2);
                                        String substring3 = this.f2438B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f2440D == 1) {
                                                        this.f2439C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f2439C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f2438B.substring(i10);
                                        if (substring4.length() > 0) {
                                            this.f2439C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f2441E = obtainStyledAttributes.getFloat(index, this.f2441E);
                                break;
                            case 46:
                                this.f2442F = obtainStyledAttributes.getFloat(index, this.f2442F);
                                break;
                            case 47:
                                this.f2443G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f2444H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f2453Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2453Q);
                                break;
                            case 50:
                                this.f2454R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2454R);
                                break;
                            case 51:
                                this.f2458V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m2549a();
        }

        /* renamed from: a */
        public void m2549a() {
            this.f2462Z = false;
            this.f2459W = true;
            this.f2460X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f2456T) {
                this.f2459W = false;
                if (this.f2445I == 0) {
                    this.f2445I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f2457U) {
                this.f2460X = false;
                if (this.f2446J == 0) {
                    this.f2446J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f2459W = false;
                if (i10 == 0 && this.f2445I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2456T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f2460X = false;
                if (i11 == 0 && this.f2446J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2457U = true;
                }
            }
            if (this.f2467c == -1.0f && this.f2463a == -1 && this.f2465b == -1) {
                return;
            }
            this.f2462Z = true;
            this.f2459W = true;
            this.f2460X = true;
            if (!(this.f2490n0 instanceof C3862g)) {
                this.f2490n0 = new C3862g();
            }
            ((C3862g) this.f2490n0).m16457j1(this.f2455S);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0544b.resolveLayoutDirection(int):void");
        }

        public C0544b(int i10, int i11) {
            super(i10, i11);
            this.f2463a = -1;
            this.f2465b = -1;
            this.f2467c = -1.0f;
            this.f2469d = -1;
            this.f2471e = -1;
            this.f2473f = -1;
            this.f2475g = -1;
            this.f2477h = -1;
            this.f2479i = -1;
            this.f2481j = -1;
            this.f2483k = -1;
            this.f2485l = -1;
            this.f2487m = -1;
            this.f2489n = 0;
            this.f2491o = 0.0f;
            this.f2493p = -1;
            this.f2494q = -1;
            this.f2495r = -1;
            this.f2496s = -1;
            this.f2497t = -1;
            this.f2498u = -1;
            this.f2499v = -1;
            this.f2500w = -1;
            this.f2501x = -1;
            this.f2502y = -1;
            this.f2503z = 0.5f;
            this.f2437A = 0.5f;
            this.f2438B = null;
            this.f2439C = 0.0f;
            this.f2440D = 1;
            this.f2441E = -1.0f;
            this.f2442F = -1.0f;
            this.f2443G = 0;
            this.f2444H = 0;
            this.f2445I = 0;
            this.f2446J = 0;
            this.f2447K = 0;
            this.f2448L = 0;
            this.f2449M = 0;
            this.f2450N = 0;
            this.f2451O = 1.0f;
            this.f2452P = 1.0f;
            this.f2453Q = -1;
            this.f2454R = -1;
            this.f2455S = -1;
            this.f2456T = false;
            this.f2457U = false;
            this.f2458V = null;
            this.f2459W = true;
            this.f2460X = true;
            this.f2461Y = false;
            this.f2462Z = false;
            this.f2464a0 = false;
            this.f2466b0 = false;
            this.f2468c0 = false;
            this.f2470d0 = -1;
            this.f2472e0 = -1;
            this.f2474f0 = -1;
            this.f2476g0 = -1;
            this.f2478h0 = -1;
            this.f2480i0 = -1;
            this.f2482j0 = 0.5f;
            this.f2490n0 = new C3860e();
            this.f2492o0 = false;
        }

        public C0544b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2463a = -1;
            this.f2465b = -1;
            this.f2467c = -1.0f;
            this.f2469d = -1;
            this.f2471e = -1;
            this.f2473f = -1;
            this.f2475g = -1;
            this.f2477h = -1;
            this.f2479i = -1;
            this.f2481j = -1;
            this.f2483k = -1;
            this.f2485l = -1;
            this.f2487m = -1;
            this.f2489n = 0;
            this.f2491o = 0.0f;
            this.f2493p = -1;
            this.f2494q = -1;
            this.f2495r = -1;
            this.f2496s = -1;
            this.f2497t = -1;
            this.f2498u = -1;
            this.f2499v = -1;
            this.f2500w = -1;
            this.f2501x = -1;
            this.f2502y = -1;
            this.f2503z = 0.5f;
            this.f2437A = 0.5f;
            this.f2438B = null;
            this.f2439C = 0.0f;
            this.f2440D = 1;
            this.f2441E = -1.0f;
            this.f2442F = -1.0f;
            this.f2443G = 0;
            this.f2444H = 0;
            this.f2445I = 0;
            this.f2446J = 0;
            this.f2447K = 0;
            this.f2448L = 0;
            this.f2449M = 0;
            this.f2450N = 0;
            this.f2451O = 1.0f;
            this.f2452P = 1.0f;
            this.f2453Q = -1;
            this.f2454R = -1;
            this.f2455S = -1;
            this.f2456T = false;
            this.f2457U = false;
            this.f2458V = null;
            this.f2459W = true;
            this.f2460X = true;
            this.f2461Y = false;
            this.f2462Z = false;
            this.f2464a0 = false;
            this.f2466b0 = false;
            this.f2468c0 = false;
            this.f2470d0 = -1;
            this.f2472e0 = -1;
            this.f2474f0 = -1;
            this.f2476g0 = -1;
            this.f2478h0 = -1;
            this.f2480i0 = -1;
            this.f2482j0 = 0.5f;
            this.f2490n0 = new C3860e();
            this.f2492o0 = false;
        }
    }
}
