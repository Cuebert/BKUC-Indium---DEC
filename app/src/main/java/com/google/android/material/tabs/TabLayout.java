package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.util.C0653g;
import androidx.core.util.InterfaceC0651e;
import androidx.core.view.C0676h;
import androidx.core.view.C0688t;
import androidx.core.view.C0690v;
import androidx.core.view.accessibility.C0660c;
import androidx.core.widget.C0707i;
import androidx.viewpager.widget.AbstractC0957a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C2396a;
import com.google.android.material.internal.C2489l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p066f.C3121a;
import p111i4.C3520b;
import p111i4.C3526h;
import p111i4.C3528j;
import p111i4.C3529k;
import p125j4.C3600a;
import p284w4.C5457b;
import p310y4.C5889h;

@ViewPager.InterfaceC0948e
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: g0 */
    private static final int f9694g0 = C3529k.f14698h;

    /* renamed from: h0 */
    private static final InterfaceC0651e<C2503g> f9695h0 = new C0653g(16);

    /* renamed from: A */
    PorterDuff.Mode f9696A;

    /* renamed from: B */
    float f9697B;

    /* renamed from: C */
    float f9698C;

    /* renamed from: D */
    final int f9699D;

    /* renamed from: E */
    int f9700E;

    /* renamed from: F */
    private final int f9701F;

    /* renamed from: G */
    private final int f9702G;

    /* renamed from: H */
    private final int f9703H;

    /* renamed from: I */
    private int f9704I;

    /* renamed from: J */
    int f9705J;

    /* renamed from: K */
    int f9706K;

    /* renamed from: L */
    int f9707L;

    /* renamed from: M */
    int f9708M;

    /* renamed from: N */
    boolean f9709N;

    /* renamed from: O */
    boolean f9710O;

    /* renamed from: P */
    int f9711P;

    /* renamed from: Q */
    boolean f9712Q;

    /* renamed from: R */
    private C2508b f9713R;

    /* renamed from: S */
    private InterfaceC2499c f9714S;

    /* renamed from: T */
    private final ArrayList<InterfaceC2499c> f9715T;

    /* renamed from: U */
    private InterfaceC2499c f9716U;

    /* renamed from: V */
    private ValueAnimator f9717V;

    /* renamed from: W */
    ViewPager f9718W;

    /* renamed from: a0 */
    private AbstractC0957a f9719a0;

    /* renamed from: b0 */
    private DataSetObserver f9720b0;

    /* renamed from: c0 */
    private C2504h f9721c0;

    /* renamed from: d0 */
    private C2498b f9722d0;

    /* renamed from: e0 */
    private boolean f9723e0;

    /* renamed from: f0 */
    private final InterfaceC0651e<C2505i> f9724f0;

    /* renamed from: n */
    private final ArrayList<C2503g> f9725n;

    /* renamed from: o */
    private C2503g f9726o;

    /* renamed from: p */
    final C2502f f9727p;

    /* renamed from: q */
    int f9728q;

    /* renamed from: r */
    int f9729r;

    /* renamed from: s */
    int f9730s;

    /* renamed from: t */
    int f9731t;

    /* renamed from: u */
    int f9732u;

    /* renamed from: v */
    ColorStateList f9733v;

    /* renamed from: w */
    ColorStateList f9734w;

    /* renamed from: x */
    ColorStateList f9735x;

    /* renamed from: y */
    Drawable f9736y;

    /* renamed from: z */
    private int f9737z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes.dex */
    public class C2497a implements ValueAnimator.AnimatorUpdateListener {
        C2497a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes.dex */
    public class C2498b implements ViewPager.InterfaceC0952i {

        /* renamed from: a */
        private boolean f9739a;

        C2498b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0952i
        /* renamed from: a */
        public void mo6123a(ViewPager viewPager, AbstractC0957a abstractC0957a, AbstractC0957a abstractC0957a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9718W == viewPager) {
                tabLayout.m11430G(abstractC0957a2, this.f9739a);
            }
        }

        /* renamed from: b */
        void m11444b(boolean z10) {
            this.f9739a = z10;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2499c<T extends C2503g> {
        /* renamed from: a */
        void mo11445a(T t10);

        /* renamed from: b */
        void mo11446b(T t10);

        /* renamed from: c */
        void mo11447c(T t10);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2500d extends InterfaceC2499c<C2503g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    /* loaded from: classes.dex */
    public class C2501e extends DataSetObserver {
        C2501e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m11443z();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m11443z();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    /* loaded from: classes.dex */
    public class C2502f extends LinearLayout {

        /* renamed from: n */
        ValueAnimator f9742n;

        /* renamed from: o */
        int f9743o;

        /* renamed from: p */
        float f9744p;

        /* renamed from: q */
        private int f9745q;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f9747a;

            /* renamed from: b */
            final /* synthetic */ View f9748b;

            a(View view, View view2) {
                this.f9747a = view;
                this.f9748b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2502f.this.m11450g(this.f9747a, this.f9748b, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        /* loaded from: classes.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f9750a;

            b(int i10) {
                this.f9750a = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2502f.this.f9743o = this.f9750a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C2502f.this.f9743o = this.f9750a;
            }
        }

        C2502f(Context context) {
            super(context);
            this.f9743o = -1;
            this.f9745q = -1;
            setWillNotDraw(false);
        }

        /* renamed from: d */
        private void m11449d() {
            View childAt = getChildAt(this.f9743o);
            C2508b c2508b = TabLayout.this.f9713R;
            TabLayout tabLayout = TabLayout.this;
            c2508b.m11504d(tabLayout, childAt, tabLayout.f9736y);
        }

        /* renamed from: g */
        public void m11450g(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                C2508b c2508b = TabLayout.this.f9713R;
                TabLayout tabLayout = TabLayout.this;
                c2508b.mo11501c(tabLayout, view, view2, f10, tabLayout.f9736y);
            } else {
                Drawable drawable = TabLayout.this.f9736y;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f9736y.getBounds().bottom);
            }
            C0690v.m3835h0(this);
        }

        /* renamed from: h */
        private void m11451h(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.f9743o);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                m11449d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f9742n = valueAnimator;
                valueAnimator.setInterpolator(C3600a.f15224b);
                valueAnimator.setDuration(i11);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i10));
                valueAnimator.start();
                return;
            }
            this.f9742n.removeAllUpdateListeners();
            this.f9742n.addUpdateListener(aVar);
        }

        /* renamed from: b */
        void m11452b(int i10, int i11) {
            ValueAnimator valueAnimator = this.f9742n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f9742n.cancel();
            }
            m11451h(true, i10, i11);
        }

        /* renamed from: c */
        boolean m11453c() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height = TabLayout.this.f9736y.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f9736y.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.f9707L;
            int i11 = 0;
            if (i10 == 0) {
                i11 = getHeight() - height;
                height = getHeight();
            } else if (i10 == 1) {
                i11 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i10 != 2) {
                height = i10 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f9736y.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f9736y.getBounds();
                TabLayout.this.f9736y.setBounds(bounds.left, i11, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f9736y;
                if (tabLayout.f9737z != 0) {
                    drawable = C0609a.m3263r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f9737z, PorterDuff.Mode.SRC_IN);
                    } else {
                        C0609a.m3259n(drawable, TabLayout.this.f9737z);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        void m11454e(int i10, float f10) {
            ValueAnimator valueAnimator = this.f9742n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f9742n.cancel();
            }
            this.f9743o = i10;
            this.f9744p = f10;
            m11450g(getChildAt(i10), getChildAt(this.f9743o + 1), this.f9744p);
        }

        /* renamed from: f */
        void m11455f(int i10) {
            Rect bounds = TabLayout.this.f9736y.getBounds();
            TabLayout.this.f9736y.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f9742n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m11451h(false, this.f9743o, -1);
            } else {
                m11449d();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f9705J == 1 || tabLayout.f9708M == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) C2489l.m11380b(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f9705J = 0;
                    tabLayout2.m11434N(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT >= 23 || this.f9745q == i10) {
                return;
            }
            requestLayout();
            this.f9745q = i10;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    /* loaded from: classes.dex */
    public static class C2503g {

        /* renamed from: a */
        private Object f9752a;

        /* renamed from: b */
        private Drawable f9753b;

        /* renamed from: c */
        private CharSequence f9754c;

        /* renamed from: d */
        private CharSequence f9755d;

        /* renamed from: f */
        private View f9757f;

        /* renamed from: h */
        public TabLayout f9759h;

        /* renamed from: i */
        public C2505i f9760i;

        /* renamed from: e */
        private int f9756e = -1;

        /* renamed from: g */
        private int f9758g = 1;

        /* renamed from: j */
        private int f9761j = -1;

        /* renamed from: e */
        public View m11460e() {
            return this.f9757f;
        }

        /* renamed from: f */
        public Drawable m11461f() {
            return this.f9753b;
        }

        /* renamed from: g */
        public int m11462g() {
            return this.f9756e;
        }

        /* renamed from: h */
        public int m11463h() {
            return this.f9758g;
        }

        /* renamed from: i */
        public CharSequence m11464i() {
            return this.f9754c;
        }

        /* renamed from: j */
        public boolean m11465j() {
            TabLayout tabLayout = this.f9759h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f9756e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        void m11466k() {
            this.f9759h = null;
            this.f9760i = null;
            this.f9752a = null;
            this.f9753b = null;
            this.f9761j = -1;
            this.f9754c = null;
            this.f9755d = null;
            this.f9756e = -1;
            this.f9757f = null;
        }

        /* renamed from: l */
        public void m11467l() {
            TabLayout tabLayout = this.f9759h;
            if (tabLayout != null) {
                tabLayout.m11428E(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C2503g m11468m(CharSequence charSequence) {
            this.f9755d = charSequence;
            m11474s();
            return this;
        }

        /* renamed from: n */
        public C2503g m11469n(int i10) {
            return m11470o(LayoutInflater.from(this.f9760i.getContext()).inflate(i10, (ViewGroup) this.f9760i, false));
        }

        /* renamed from: o */
        public C2503g m11470o(View view) {
            this.f9757f = view;
            m11474s();
            return this;
        }

        /* renamed from: p */
        public C2503g m11471p(Drawable drawable) {
            this.f9753b = drawable;
            TabLayout tabLayout = this.f9759h;
            if (tabLayout.f9705J == 1 || tabLayout.f9708M == 2) {
                tabLayout.m11434N(true);
            }
            m11474s();
            if (C2396a.f8995a && this.f9760i.m11487l() && this.f9760i.f9769r.isVisible()) {
                this.f9760i.invalidate();
            }
            return this;
        }

        /* renamed from: q */
        void m11472q(int i10) {
            this.f9756e = i10;
        }

        /* renamed from: r */
        public C2503g m11473r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f9755d) && !TextUtils.isEmpty(charSequence)) {
                this.f9760i.setContentDescription(charSequence);
            }
            this.f9754c = charSequence;
            m11474s();
            return this;
        }

        /* renamed from: s */
        void m11474s() {
            C2505i c2505i = this.f9760i;
            if (c2505i != null) {
                c2505i.m11497t();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    /* loaded from: classes.dex */
    public static class C2504h implements ViewPager.InterfaceC0953j {

        /* renamed from: a */
        private final WeakReference<TabLayout> f9762a;

        /* renamed from: b */
        private int f9763b;

        /* renamed from: c */
        private int f9764c;

        public C2504h(TabLayout tabLayout) {
            this.f9762a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0953j
        /* renamed from: a */
        public void mo6124a(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f9762a.get();
            if (tabLayout != null) {
                int i12 = this.f9764c;
                tabLayout.m11432I(i10, f10, i12 != 2 || this.f9763b == 1, (i12 == 2 && this.f9763b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0953j
        /* renamed from: b */
        public void mo6125b(int i10) {
            this.f9763b = this.f9764c;
            this.f9764c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0953j
        /* renamed from: c */
        public void mo6126c(int i10) {
            TabLayout tabLayout = this.f9762a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f9764c;
            tabLayout.m11429F(tabLayout.m11440w(i10), i11 == 0 || (i11 == 2 && this.f9763b == 0));
        }

        /* renamed from: d */
        void m11475d() {
            this.f9764c = 0;
            this.f9763b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    /* loaded from: classes.dex */
    public final class C2505i extends LinearLayout {

        /* renamed from: n */
        private C2503g f9765n;

        /* renamed from: o */
        private TextView f9766o;

        /* renamed from: p */
        private ImageView f9767p;

        /* renamed from: q */
        private View f9768q;

        /* renamed from: r */
        private BadgeDrawable f9769r;

        /* renamed from: s */
        private View f9770s;

        /* renamed from: t */
        private TextView f9771t;

        /* renamed from: u */
        private ImageView f9772u;

        /* renamed from: v */
        private Drawable f9773v;

        /* renamed from: w */
        private int f9774w;

        /* renamed from: com.google.android.material.tabs.TabLayout$i$a */
        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f9776a;

            a(View view) {
                this.f9776a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f9776a.getVisibility() == 0) {
                    C2505i.this.m11493s(this.f9776a);
                }
            }
        }

        public C2505i(Context context) {
            super(context);
            this.f9774w = 2;
            m11494u(context);
            C0690v.m3788C0(this, TabLayout.this.f9728q, TabLayout.this.f9729r, TabLayout.this.f9730s, TabLayout.this.f9731t);
            setGravity(17);
            setOrientation(!TabLayout.this.f9709N ? 1 : 0);
            setClickable(true);
            C0690v.m3790D0(this, C0688t.m3778b(getContext(), 1002));
        }

        /* renamed from: f */
        private void m11481f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        /* renamed from: g */
        private float m11482g(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private BadgeDrawable getBadge() {
            return this.f9769r;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f9769r == null) {
                this.f9769r = BadgeDrawable.m10518c(getContext());
            }
            m11492r();
            BadgeDrawable badgeDrawable = this.f9769r;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m11483h(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        /* renamed from: i */
        private FrameLayout m11484i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: j */
        public void m11485j(Canvas canvas) {
            Drawable drawable = this.f9773v;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f9773v.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m11486k(View view) {
            if ((view == this.f9767p || view == this.f9766o) && C2396a.f8995a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* renamed from: l */
        public boolean m11487l() {
            return this.f9769r != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: m */
        private void m11488m() {
            FrameLayout frameLayout;
            if (C2396a.f8995a) {
                frameLayout = m11484i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C3526h.f14651a, (ViewGroup) frameLayout, false);
            this.f9767p = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: n */
        private void m11489n() {
            FrameLayout frameLayout;
            if (C2396a.f8995a) {
                frameLayout = m11484i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C3526h.f14652b, (ViewGroup) frameLayout, false);
            this.f9766o = textView;
            frameLayout.addView(textView);
        }

        /* renamed from: p */
        private void m11490p(View view) {
            if (m11487l() && view != null) {
                m11483h(false);
                C2396a.m10564a(this.f9769r, view, m11486k(view));
                this.f9768q = view;
            }
        }

        /* renamed from: q */
        private void m11491q() {
            if (m11487l()) {
                m11483h(true);
                View view = this.f9768q;
                if (view != null) {
                    C2396a.m10565b(this.f9769r, view);
                    this.f9768q = null;
                }
            }
        }

        /* renamed from: r */
        private void m11492r() {
            C2503g c2503g;
            C2503g c2503g2;
            if (m11487l()) {
                if (this.f9770s != null) {
                    m11491q();
                    return;
                }
                if (this.f9767p != null && (c2503g2 = this.f9765n) != null && c2503g2.m11461f() != null) {
                    View view = this.f9768q;
                    ImageView imageView = this.f9767p;
                    if (view != imageView) {
                        m11491q();
                        m11490p(this.f9767p);
                        return;
                    } else {
                        m11493s(imageView);
                        return;
                    }
                }
                if (this.f9766o != null && (c2503g = this.f9765n) != null && c2503g.m11463h() == 1) {
                    View view2 = this.f9768q;
                    TextView textView = this.f9766o;
                    if (view2 != textView) {
                        m11491q();
                        m11490p(this.f9766o);
                        return;
                    } else {
                        m11493s(textView);
                        return;
                    }
                }
                m11491q();
            }
        }

        /* renamed from: s */
        public void m11493s(View view) {
            if (m11487l() && view == this.f9768q) {
                C2396a.m10566c(this.f9769r, view, m11486k(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* renamed from: u */
        public void m11494u(Context context) {
            int i10 = TabLayout.this.f9699D;
            if (i10 != 0) {
                Drawable m13770d = C3121a.m13770d(context, i10);
                this.f9773v = m13770d;
                if (m13770d != null && m13770d.isStateful()) {
                    this.f9773v.setState(getDrawableState());
                }
            } else {
                this.f9773v = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f9735x != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList m20044a = C5457b.m20044a(TabLayout.this.f9735x);
                boolean z10 = TabLayout.this.f9712Q;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(m20044a, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            C0690v.m3859t0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* renamed from: w */
        private void m11495w(TextView textView, ImageView imageView) {
            C2503g c2503g = this.f9765n;
            Drawable mutate = (c2503g == null || c2503g.m11461f() == null) ? null : C0609a.m3263r(this.f9765n.m11461f()).mutate();
            C2503g c2503g2 = this.f9765n;
            CharSequence m11464i = c2503g2 != null ? c2503g2.m11464i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(m11464i);
            if (textView != null) {
                if (z10) {
                    textView.setText(m11464i);
                    if (this.f9765n.f9758g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int m11380b = (z10 && imageView.getVisibility() == 0) ? (int) C2489l.m11380b(getContext(), 8) : 0;
                if (TabLayout.this.f9709N) {
                    if (m11380b != C0676h.m3719a(marginLayoutParams)) {
                        C0676h.m3721c(marginLayoutParams, m11380b);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (m11380b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = m11380b;
                    C0676h.m3721c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C2503g c2503g3 = this.f9765n;
            CharSequence charSequence = c2503g3 != null ? c2503g3.f9755d : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z10) {
                    m11464i = charSequence;
                }
                TooltipCompat.setTooltipText(this, m11464i);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f9773v;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f9773v.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f9766o, this.f9767p, this.f9770s};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f9766o, this.f9767p, this.f9770s};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public C2503g getTab() {
            return this.f9765n;
        }

        /* renamed from: o */
        void m11496o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f9769r;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f9769r.m10530g()));
            }
            C0660c m3511z0 = C0660c.m3511z0(accessibilityNodeInfo);
            m3511z0.m3538c0(C0660c.d.m3580a(0, 1, this.f9765n.m11462g(), 1, false, isSelected()));
            if (isSelected()) {
                m3511z0.m3534a0(false);
                m3511z0.m3525Q(C0660c.a.f3538i);
            }
            m3511z0.m3558p0(getResources().getString(C3528j.f14678h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f9700E, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f9766o != null) {
                float f10 = TabLayout.this.f9697B;
                int i12 = this.f9774w;
                ImageView imageView = this.f9767p;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f9766o;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f9698C;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f9766o.getTextSize();
                int lineCount = this.f9766o.getLineCount();
                int m4165d = C0707i.m4165d(this.f9766o);
                if (f10 != textSize || (m4165d >= 0 && i12 != m4165d)) {
                    if (TabLayout.this.f9708M == 1 && f10 > textSize && lineCount == 1 && ((layout = this.f9766o.getLayout()) == null || m11482g(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f9766o.setTextSize(0, f10);
                        this.f9766o.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f9765n == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f9765n.m11467l();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f9766o;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f9767p;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f9770s;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(C2503g c2503g) {
            if (c2503g != this.f9765n) {
                this.f9765n = c2503g;
                m11497t();
            }
        }

        /* renamed from: t */
        final void m11497t() {
            C2503g c2503g = this.f9765n;
            Drawable drawable = null;
            View m11460e = c2503g != null ? c2503g.m11460e() : null;
            if (m11460e != null) {
                ViewParent parent = m11460e.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m11460e);
                    }
                    addView(m11460e);
                }
                this.f9770s = m11460e;
                TextView textView = this.f9766o;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9767p;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9767p.setImageDrawable(null);
                }
                TextView textView2 = (TextView) m11460e.findViewById(R.id.text1);
                this.f9771t = textView2;
                if (textView2 != null) {
                    this.f9774w = C0707i.m4165d(textView2);
                }
                this.f9772u = (ImageView) m11460e.findViewById(R.id.icon);
            } else {
                View view = this.f9770s;
                if (view != null) {
                    removeView(view);
                    this.f9770s = null;
                }
                this.f9771t = null;
                this.f9772u = null;
            }
            if (this.f9770s == null) {
                if (this.f9767p == null) {
                    m11488m();
                }
                if (c2503g != null && c2503g.m11461f() != null) {
                    drawable = C0609a.m3263r(c2503g.m11461f()).mutate();
                }
                if (drawable != null) {
                    C0609a.m3260o(drawable, TabLayout.this.f9734w);
                    PorterDuff.Mode mode = TabLayout.this.f9696A;
                    if (mode != null) {
                        C0609a.m3261p(drawable, mode);
                    }
                }
                if (this.f9766o == null) {
                    m11489n();
                    this.f9774w = C0707i.m4165d(this.f9766o);
                }
                C0707i.m4177p(this.f9766o, TabLayout.this.f9732u);
                ColorStateList colorStateList = TabLayout.this.f9733v;
                if (colorStateList != null) {
                    this.f9766o.setTextColor(colorStateList);
                }
                m11495w(this.f9766o, this.f9767p);
                m11492r();
                m11481f(this.f9767p);
                m11481f(this.f9766o);
            } else {
                TextView textView3 = this.f9771t;
                if (textView3 != null || this.f9772u != null) {
                    m11495w(textView3, this.f9772u);
                }
            }
            if (c2503g != null && !TextUtils.isEmpty(c2503g.f9755d)) {
                setContentDescription(c2503g.f9755d);
            }
            setSelected(c2503g != null && c2503g.m11465j());
        }

        /* renamed from: v */
        final void m11498v() {
            setOrientation(!TabLayout.this.f9709N ? 1 : 0);
            TextView textView = this.f9771t;
            if (textView == null && this.f9772u == null) {
                m11495w(this.f9766o, this.f9767p);
            } else {
                m11495w(textView, this.f9772u);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    /* loaded from: classes.dex */
    public static class C2506j implements InterfaceC2500d {

        /* renamed from: a */
        private final ViewPager f9778a;

        public C2506j(ViewPager viewPager) {
            this.f9778a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2499c
        /* renamed from: a */
        public void mo11445a(C2503g c2503g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2499c
        /* renamed from: b */
        public void mo11446b(C2503g c2503g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC2499c
        /* renamed from: c */
        public void mo11447c(C2503g c2503g) {
            this.f9778a.setCurrentItem(c2503g.m11462g());
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3520b.f14510C);
    }

    /* renamed from: D */
    private void m11404D(int i10) {
        C2505i c2505i = (C2505i) this.f9727p.getChildAt(i10);
        this.f9727p.removeViewAt(i10);
        if (c2505i != null) {
            c2505i.m11496o();
            this.f9724f0.mo3459a(c2505i);
        }
        requestLayout();
    }

    /* renamed from: K */
    private void m11405K(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.f9718W;
        if (viewPager2 != null) {
            C2504h c2504h = this.f9721c0;
            if (c2504h != null) {
                viewPager2.m6100J(c2504h);
            }
            C2498b c2498b = this.f9722d0;
            if (c2498b != null) {
                this.f9718W.m6099I(c2498b);
            }
        }
        InterfaceC2499c interfaceC2499c = this.f9716U;
        if (interfaceC2499c != null) {
            m11427C(interfaceC2499c);
            this.f9716U = null;
        }
        if (viewPager != null) {
            this.f9718W = viewPager;
            if (this.f9721c0 == null) {
                this.f9721c0 = new C2504h(this);
            }
            this.f9721c0.m11475d();
            viewPager.m6107c(this.f9721c0);
            C2506j c2506j = new C2506j(viewPager);
            this.f9716U = c2506j;
            m11435c(c2506j);
            AbstractC0957a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m11430G(adapter, z10);
            }
            if (this.f9722d0 == null) {
                this.f9722d0 = new C2498b();
            }
            this.f9722d0.m11444b(z10);
            viewPager.m6106b(this.f9722d0);
            m11431H(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f9718W = null;
            m11430G(null, false);
        }
        this.f9723e0 = z11;
    }

    /* renamed from: L */
    private void m11406L() {
        int size = this.f9725n.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9725n.get(i10).m11474s();
        }
    }

    /* renamed from: M */
    private void m11407M(LinearLayout.LayoutParams layoutParams) {
        if (this.f9708M == 1 && this.f9705J == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* renamed from: g */
    private void m11410g(C2509c c2509c) {
        C2503g m11442y = m11442y();
        CharSequence charSequence = c2509c.f9779n;
        if (charSequence != null) {
            m11442y.m11473r(charSequence);
        }
        Drawable drawable = c2509c.f9780o;
        if (drawable != null) {
            m11442y.m11471p(drawable);
        }
        int i10 = c2509c.f9781p;
        if (i10 != 0) {
            m11442y.m11469n(i10);
        }
        if (!TextUtils.isEmpty(c2509c.getContentDescription())) {
            m11442y.m11468m(c2509c.getContentDescription());
        }
        m11436d(m11442y);
    }

    private int getDefaultHeight() {
        int size = this.f9725n.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                C2503g c2503g = this.f9725n.get(i10);
                if (c2503g != null && c2503g.m11461f() != null && !TextUtils.isEmpty(c2503g.m11464i())) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.f9709N) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f9701F;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f9708M;
        if (i11 == 0 || i11 == 2) {
            return this.f9703H;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9727p.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m11411h(C2503g c2503g) {
        C2505i c2505i = c2503g.f9760i;
        c2505i.setSelected(false);
        c2505i.setActivated(false);
        this.f9727p.addView(c2505i, c2503g.m11462g(), m11419p());
    }

    /* renamed from: i */
    private void m11412i(View view) {
        if (view instanceof C2509c) {
            m11410g((C2509c) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: j */
    private void m11413j(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && C0690v.m3814U(this) && !this.f9727p.m11453c()) {
            int scrollX = getScrollX();
            int m11416m = m11416m(i10, 0.0f);
            if (scrollX != m11416m) {
                m11424v();
                this.f9717V.setIntValues(scrollX, m11416m);
                this.f9717V.start();
            }
            this.f9727p.m11452b(i10, this.f9706K);
            return;
        }
        m11431H(i10, 0.0f, true);
    }

    /* renamed from: k */
    private void m11414k(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f9727p.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f9727p.setGravity(8388611);
    }

    /* renamed from: l */
    private void m11415l() {
        int i10 = this.f9708M;
        C0690v.m3788C0(this.f9727p, (i10 == 0 || i10 == 2) ? Math.max(0, this.f9704I - this.f9728q) : 0, 0, 0, 0);
        int i11 = this.f9708M;
        if (i11 == 0) {
            m11414k(this.f9705J);
        } else if (i11 == 1 || i11 == 2) {
            if (this.f9705J == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f9727p.setGravity(1);
        }
        m11434N(true);
    }

    /* renamed from: m */
    private int m11416m(int i10, float f10) {
        int i11 = this.f9708M;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        View childAt = this.f9727p.getChildAt(i10);
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f9727p.getChildCount() ? this.f9727p.getChildAt(i12) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return C0690v.m3791E(this) == 0 ? left + i13 : left - i13;
    }

    /* renamed from: n */
    private void m11417n(C2503g c2503g, int i10) {
        c2503g.m11472q(i10);
        this.f9725n.add(i10, c2503g);
        int size = this.f9725n.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            } else {
                this.f9725n.get(i10).m11472q(i10);
            }
        }
    }

    /* renamed from: o */
    private static ColorStateList m11418o(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    /* renamed from: p */
    private LinearLayout.LayoutParams m11419p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m11407M(layoutParams);
        return layoutParams;
    }

    /* renamed from: r */
    private C2505i m11420r(C2503g c2503g) {
        InterfaceC0651e<C2505i> interfaceC0651e = this.f9724f0;
        C2505i mo3460b = interfaceC0651e != null ? interfaceC0651e.mo3460b() : null;
        if (mo3460b == null) {
            mo3460b = new C2505i(getContext());
        }
        mo3460b.setTab(c2503g);
        mo3460b.setFocusable(true);
        mo3460b.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c2503g.f9755d)) {
            mo3460b.setContentDescription(c2503g.f9754c);
        } else {
            mo3460b.setContentDescription(c2503g.f9755d);
        }
        return mo3460b;
    }

    /* renamed from: s */
    private void m11421s(C2503g c2503g) {
        for (int size = this.f9715T.size() - 1; size >= 0; size--) {
            this.f9715T.get(size).mo11445a(c2503g);
        }
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f9727p.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f9727p.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    /* renamed from: t */
    private void m11422t(C2503g c2503g) {
        for (int size = this.f9715T.size() - 1; size >= 0; size--) {
            this.f9715T.get(size).mo11447c(c2503g);
        }
    }

    /* renamed from: u */
    private void m11423u(C2503g c2503g) {
        for (int size = this.f9715T.size() - 1; size >= 0; size--) {
            this.f9715T.get(size).mo11446b(c2503g);
        }
    }

    /* renamed from: v */
    private void m11424v() {
        if (this.f9717V == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9717V = valueAnimator;
            valueAnimator.setInterpolator(C3600a.f15224b);
            this.f9717V.setDuration(this.f9706K);
            this.f9717V.addUpdateListener(new C2497a());
        }
    }

    /* renamed from: A */
    protected boolean m11425A(C2503g c2503g) {
        return f9695h0.mo3459a(c2503g);
    }

    /* renamed from: B */
    public void m11426B() {
        for (int childCount = this.f9727p.getChildCount() - 1; childCount >= 0; childCount--) {
            m11404D(childCount);
        }
        Iterator<C2503g> it = this.f9725n.iterator();
        while (it.hasNext()) {
            C2503g next = it.next();
            it.remove();
            next.m11466k();
            m11425A(next);
        }
        this.f9726o = null;
    }

    @Deprecated
    /* renamed from: C */
    public void m11427C(InterfaceC2499c interfaceC2499c) {
        this.f9715T.remove(interfaceC2499c);
    }

    /* renamed from: E */
    public void m11428E(C2503g c2503g) {
        m11429F(c2503g, true);
    }

    /* renamed from: F */
    public void m11429F(C2503g c2503g, boolean z10) {
        C2503g c2503g2 = this.f9726o;
        if (c2503g2 == c2503g) {
            if (c2503g2 != null) {
                m11421s(c2503g);
                m11413j(c2503g.m11462g());
                return;
            }
            return;
        }
        int m11462g = c2503g != null ? c2503g.m11462g() : -1;
        if (z10) {
            if ((c2503g2 == null || c2503g2.m11462g() == -1) && m11462g != -1) {
                m11431H(m11462g, 0.0f, true);
            } else {
                m11413j(m11462g);
            }
            if (m11462g != -1) {
                setSelectedTabView(m11462g);
            }
        }
        this.f9726o = c2503g;
        if (c2503g2 != null) {
            m11423u(c2503g2);
        }
        if (c2503g != null) {
            m11422t(c2503g);
        }
    }

    /* renamed from: G */
    void m11430G(AbstractC0957a abstractC0957a, boolean z10) {
        DataSetObserver dataSetObserver;
        AbstractC0957a abstractC0957a2 = this.f9719a0;
        if (abstractC0957a2 != null && (dataSetObserver = this.f9720b0) != null) {
            abstractC0957a2.m6135o(dataSetObserver);
        }
        this.f9719a0 = abstractC0957a;
        if (z10 && abstractC0957a != null) {
            if (this.f9720b0 == null) {
                this.f9720b0 = new C2501e();
            }
            abstractC0957a.m6133i(this.f9720b0);
        }
        m11443z();
    }

    /* renamed from: H */
    public void m11431H(int i10, float f10, boolean z10) {
        m11432I(i10, f10, z10, true);
    }

    /* renamed from: I */
    public void m11432I(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f9727p.getChildCount()) {
            return;
        }
        if (z11) {
            this.f9727p.m11454e(i10, f10);
        }
        ValueAnimator valueAnimator = this.f9717V;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f9717V.cancel();
        }
        scrollTo(m11416m(i10, f10), 0);
        if (z10) {
            setSelectedTabView(round);
        }
    }

    /* renamed from: J */
    public void m11433J(ViewPager viewPager, boolean z10) {
        m11405K(viewPager, z10, false);
    }

    /* renamed from: N */
    void m11434N(boolean z10) {
        for (int i10 = 0; i10 < this.f9727p.getChildCount(); i10++) {
            View childAt = this.f9727p.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            m11407M((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m11412i(view);
    }

    @Deprecated
    /* renamed from: c */
    public void m11435c(InterfaceC2499c interfaceC2499c) {
        if (this.f9715T.contains(interfaceC2499c)) {
            return;
        }
        this.f9715T.add(interfaceC2499c);
    }

    /* renamed from: d */
    public void m11436d(C2503g c2503g) {
        m11438f(c2503g, this.f9725n.isEmpty());
    }

    /* renamed from: e */
    public void m11437e(C2503g c2503g, int i10, boolean z10) {
        if (c2503g.f9759h == this) {
            m11417n(c2503g, i10);
            m11411h(c2503g);
            if (z10) {
                c2503g.m11467l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: f */
    public void m11438f(C2503g c2503g, boolean z10) {
        m11437e(c2503g, this.f9725n.size(), z10);
    }

    public int getSelectedTabPosition() {
        C2503g c2503g = this.f9726o;
        if (c2503g != null) {
            return c2503g.m11462g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9725n.size();
    }

    public int getTabGravity() {
        return this.f9705J;
    }

    public ColorStateList getTabIconTint() {
        return this.f9734w;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f9711P;
    }

    public int getTabIndicatorGravity() {
        return this.f9707L;
    }

    int getTabMaxWidth() {
        return this.f9700E;
    }

    public int getTabMode() {
        return this.f9708M;
    }

    public ColorStateList getTabRippleColor() {
        return this.f9735x;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f9736y;
    }

    public ColorStateList getTabTextColors() {
        return this.f9733v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5889h.m20860e(this);
        if (this.f9718W == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m11405K((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9723e0) {
            setupWithViewPager(null);
            this.f9723e0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f9727p.getChildCount(); i10++) {
            View childAt = this.f9727p.getChildAt(i10);
            if (childAt instanceof C2505i) {
                ((C2505i) childAt).m11485j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0660c.m3511z0(accessibilityNodeInfo).m3536b0(C0660c.c.m3579a(1, getTabCount(), false, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r0 != 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L67;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C2489l.m11380b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f9702G
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C2489l.m11380b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f9700E = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f9708M
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = 1
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: q */
    protected C2503g m11439q() {
        C2503g mo3460b = f9695h0.mo3460b();
        return mo3460b == null ? new C2503g() : mo3460b;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C5889h.m20859d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f9709N != z10) {
            this.f9709N = z10;
            for (int i10 = 0; i10 < this.f9727p.getChildCount(); i10++) {
                View childAt = this.f9727p.getChildAt(i10);
                if (childAt instanceof C2505i) {
                    ((C2505i) childAt).m11498v();
                }
            }
            m11415l();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2500d interfaceC2500d) {
        setOnTabSelectedListener((InterfaceC2499c) interfaceC2500d);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m11424v();
        this.f9717V.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f9736y != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f9736y = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f9737z = i10;
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f9707L != i10) {
            this.f9707L = i10;
            C0690v.m3835h0(this.f9727p);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f9727p.m11455f(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f9705J != i10) {
            this.f9705J = i10;
            m11415l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f9734w != colorStateList) {
            this.f9734w = colorStateList;
            m11406L();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(C3121a.m13769c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.f9711P = i10;
        if (i10 == 0) {
            this.f9713R = new C2508b();
        } else {
            if (i10 == 1) {
                this.f9713R = new C2507a();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f9710O = z10;
        C0690v.m3835h0(this.f9727p);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f9708M) {
            this.f9708M = i10;
            m11415l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f9735x != colorStateList) {
            this.f9735x = colorStateList;
            for (int i10 = 0; i10 < this.f9727p.getChildCount(); i10++) {
                View childAt = this.f9727p.getChildAt(i10);
                if (childAt instanceof C2505i) {
                    ((C2505i) childAt).m11494u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(C3121a.m13769c(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f9733v != colorStateList) {
            this.f9733v = colorStateList;
            m11406L();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC0957a abstractC0957a) {
        m11430G(abstractC0957a, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f9712Q != z10) {
            this.f9712Q = z10;
            for (int i10 = 0; i10 < this.f9727p.getChildCount(); i10++) {
                View childAt = this.f9727p.getChildAt(i10);
                if (childAt instanceof C2505i) {
                    ((C2505i) childAt).m11494u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m11433J(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: w */
    public C2503g m11440w(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f9725n.get(i10);
    }

    /* renamed from: x */
    public boolean m11441x() {
        return this.f9710O;
    }

    /* renamed from: y */
    public C2503g m11442y() {
        C2503g m11439q = m11439q();
        m11439q.f9759h = this;
        m11439q.f9760i = m11420r(m11439q);
        if (m11439q.f9761j != -1) {
            m11439q.f9760i.setId(m11439q.f9761j);
        }
        return m11439q;
    }

    /* renamed from: z */
    void m11443z() {
        int currentItem;
        m11426B();
        AbstractC0957a abstractC0957a = this.f9719a0;
        if (abstractC0957a != null) {
            int mo6129c = abstractC0957a.mo6129c();
            for (int i10 = 0; i10 < mo6129c; i10++) {
                m11438f(m11442y().m11473r(this.f9719a0.m6131e(i10)), false);
            }
            ViewPager viewPager = this.f9718W;
            if (viewPager == null || mo6129c <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m11428E(m11440w(currentItem));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        m11412i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC2499c interfaceC2499c) {
        InterfaceC2499c interfaceC2499c2 = this.f9714S;
        if (interfaceC2499c2 != null) {
            m11427C(interfaceC2499c2);
        }
        this.f9714S = interfaceC2499c;
        if (interfaceC2499c != null) {
            m11435c(interfaceC2499c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m11412i(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(C3121a.m13770d(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m11412i(view);
    }
}
