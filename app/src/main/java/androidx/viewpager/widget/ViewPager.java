package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0587a;
import androidx.core.view.C0656a;
import androidx.core.view.C0675g0;
import androidx.core.view.C0690v;
import androidx.core.view.InterfaceC0684p;
import androidx.core.view.accessibility.C0660c;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: u0 */
    static final int[] f5033u0 = {R.attr.layout_gravity};

    /* renamed from: v0 */
    private static final Comparator<C0949f> f5034v0 = new C0944a();

    /* renamed from: w0 */
    private static final Interpolator f5035w0 = new InterpolatorC0945b();

    /* renamed from: x0 */
    private static final C0956m f5036x0 = new C0956m();

    /* renamed from: A */
    private Drawable f5037A;

    /* renamed from: B */
    private int f5038B;

    /* renamed from: C */
    private int f5039C;

    /* renamed from: D */
    private float f5040D;

    /* renamed from: E */
    private float f5041E;

    /* renamed from: F */
    private int f5042F;

    /* renamed from: G */
    private int f5043G;

    /* renamed from: H */
    private boolean f5044H;

    /* renamed from: I */
    private boolean f5045I;

    /* renamed from: J */
    private boolean f5046J;

    /* renamed from: K */
    private int f5047K;

    /* renamed from: L */
    private boolean f5048L;

    /* renamed from: M */
    private boolean f5049M;

    /* renamed from: N */
    private int f5050N;

    /* renamed from: O */
    private int f5051O;

    /* renamed from: P */
    private int f5052P;

    /* renamed from: Q */
    private float f5053Q;

    /* renamed from: R */
    private float f5054R;

    /* renamed from: S */
    private float f5055S;

    /* renamed from: T */
    private float f5056T;

    /* renamed from: U */
    private int f5057U;

    /* renamed from: V */
    private VelocityTracker f5058V;

    /* renamed from: W */
    private int f5059W;

    /* renamed from: a0 */
    private int f5060a0;

    /* renamed from: b0 */
    private int f5061b0;

    /* renamed from: c0 */
    private int f5062c0;

    /* renamed from: d0 */
    private boolean f5063d0;

    /* renamed from: e0 */
    private EdgeEffect f5064e0;

    /* renamed from: f0 */
    private EdgeEffect f5065f0;

    /* renamed from: g0 */
    private boolean f5066g0;

    /* renamed from: h0 */
    private boolean f5067h0;

    /* renamed from: i0 */
    private boolean f5068i0;

    /* renamed from: j0 */
    private int f5069j0;

    /* renamed from: k0 */
    private List<InterfaceC0953j> f5070k0;

    /* renamed from: l0 */
    private InterfaceC0953j f5071l0;

    /* renamed from: m0 */
    private InterfaceC0953j f5072m0;

    /* renamed from: n */
    private int f5073n;

    /* renamed from: n0 */
    private List<InterfaceC0952i> f5074n0;

    /* renamed from: o */
    private final ArrayList<C0949f> f5075o;

    /* renamed from: o0 */
    private InterfaceC0954k f5076o0;

    /* renamed from: p */
    private final C0949f f5077p;

    /* renamed from: p0 */
    private int f5078p0;

    /* renamed from: q */
    private final Rect f5079q;

    /* renamed from: q0 */
    private int f5080q0;

    /* renamed from: r */
    AbstractC0957a f5081r;

    /* renamed from: r0 */
    private ArrayList<View> f5082r0;

    /* renamed from: s */
    int f5083s;

    /* renamed from: s0 */
    private final Runnable f5084s0;

    /* renamed from: t */
    private int f5085t;

    /* renamed from: t0 */
    private int f5086t0;

    /* renamed from: u */
    private Parcelable f5087u;

    /* renamed from: v */
    private ClassLoader f5088v;

    /* renamed from: w */
    private Scroller f5089w;

    /* renamed from: x */
    private boolean f5090x;

    /* renamed from: y */
    private C0955l f5091y;

    /* renamed from: z */
    private int f5092z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0943a();

        /* renamed from: n */
        int f5093n;

        /* renamed from: o */
        Parcelable f5094o;

        /* renamed from: p */
        ClassLoader f5095p;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes.dex */
        static class C0943a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0943a() {
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

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5093n + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5093n);
            parcel.writeParcelable(this.f5094o, i10);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5093n = parcel.readInt();
            this.f5094o = parcel.readParcelable(classLoader);
            this.f5095p = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    static class C0944a implements Comparator<C0949f> {
        C0944a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0949f c0949f, C0949f c0949f2) {
            return c0949f.f5100b - c0949f2.f5100b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    /* loaded from: classes.dex */
    static class InterpolatorC0945b implements Interpolator {
        InterpolatorC0945b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    class RunnableC0946c implements Runnable {
        RunnableC0946c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m6097E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public class C0947d implements InterfaceC0684p {

        /* renamed from: n */
        private final Rect f5097n = new Rect();

        C0947d() {
        }

        @Override // androidx.core.view.InterfaceC0684p
        /* renamed from: L */
        public C0675g0 mo823L(View view, C0675g0 c0675g0) {
            C0675g0 m3825c0 = C0690v.m3825c0(view, c0675g0);
            if (m3825c0.m3671o()) {
                return m3825c0;
            }
            Rect rect = this.f5097n;
            rect.left = m3825c0.m3667j();
            rect.top = m3825c0.m3669l();
            rect.right = m3825c0.m3668k();
            rect.bottom = m3825c0.m3666i();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C0675g0 m3836i = C0690v.m3836i(ViewPager.this.getChildAt(i10), m3825c0);
                rect.left = Math.min(m3836i.m3667j(), rect.left);
                rect.top = Math.min(m3836i.m3669l(), rect.top);
                rect.right = Math.min(m3836i.m3668k(), rect.right);
                rect.bottom = Math.min(m3836i.m3666i(), rect.bottom);
            }
            return m3825c0.m3672p(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public @interface InterfaceC0948e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public static class C0949f {

        /* renamed from: a */
        Object f5099a;

        /* renamed from: b */
        int f5100b;

        /* renamed from: c */
        boolean f5101c;

        /* renamed from: d */
        float f5102d;

        /* renamed from: e */
        float f5103e;

        C0949f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public class C0951h extends C0656a {
        C0951h() {
        }

        /* renamed from: n */
        private boolean m6122n() {
            AbstractC0957a abstractC0957a = ViewPager.this.f5081r;
            return abstractC0957a != null && abstractC0957a.mo6129c() > 1;
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: f */
        public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0957a abstractC0957a;
            super.mo3483f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m6122n());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0957a = ViewPager.this.f5081r) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0957a.mo6129c());
            accessibilityEvent.setFromIndex(ViewPager.this.f5083s);
            accessibilityEvent.setToIndex(ViewPager.this.f5083s);
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: g */
        public void mo3484g(View view, C0660c c0660c) {
            super.mo3484g(view, c0660c);
            c0660c.m3532Z(ViewPager.class.getName());
            c0660c.m3562r0(m6122n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c0660c.m3533a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c0660c.m3533a(8192);
            }
        }

        @Override // androidx.core.view.C0656a
        /* renamed from: j */
        public boolean mo3487j(View view, int i10, Bundle bundle) {
            if (super.mo3487j(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f5083s - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f5083s + 1);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public interface InterfaceC0952i {
        /* renamed from: a */
        void mo6123a(ViewPager viewPager, AbstractC0957a abstractC0957a, AbstractC0957a abstractC0957a2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes.dex */
    public interface InterfaceC0953j {
        /* renamed from: a */
        void mo6124a(int i10, float f10, int i11);

        /* renamed from: b */
        void mo6125b(int i10);

        /* renamed from: c */
        void mo6126c(int i10);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes.dex */
    public interface InterfaceC0954k {
        /* renamed from: a */
        void m6127a(View view, float f10);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes.dex */
    private class C0955l extends DataSetObserver {
        C0955l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m6110h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m6110h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    /* loaded from: classes.dex */
    public static class C0956m implements Comparator<View> {
        C0956m() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0950g c0950g = (C0950g) view.getLayoutParams();
            C0950g c0950g2 = (C0950g) view2.getLayoutParams();
            boolean z10 = c0950g.f5104a;
            if (z10 != c0950g2.f5104a) {
                return z10 ? 1 : -1;
            }
            return c0950g.f5108e - c0950g2.f5108e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5075o = new ArrayList<>();
        this.f5077p = new C0949f();
        this.f5079q = new Rect();
        this.f5085t = -1;
        this.f5087u = null;
        this.f5088v = null;
        this.f5040D = -3.4028235E38f;
        this.f5041E = Float.MAX_VALUE;
        this.f5047K = 1;
        this.f5057U = -1;
        this.f5066g0 = true;
        this.f5067h0 = false;
        this.f5084s0 = new RunnableC0946c();
        this.f5086t0 = 0;
        m6116v();
    }

    /* renamed from: C */
    private boolean m6074C(int i10) {
        if (this.f5075o.size() == 0) {
            if (this.f5066g0) {
                return false;
            }
            this.f5068i0 = false;
            m6117y(0, 0.0f, 0);
            if (this.f5068i0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0949f m6091t = m6091t();
        int clientWidth = getClientWidth();
        int i11 = this.f5092z;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = m6091t.f5100b;
        float f11 = ((i10 / f10) - m6091t.f5103e) / (m6091t.f5102d + (i11 / f10));
        this.f5068i0 = false;
        m6117y(i13, f11, (int) (i12 * f11));
        if (this.f5068i0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: D */
    private boolean m6075D(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f5053Q - f10;
        this.f5053Q = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f5040D * clientWidth;
        float f13 = this.f5041E * clientWidth;
        boolean z12 = false;
        C0949f c0949f = this.f5075o.get(0);
        ArrayList<C0949f> arrayList = this.f5075o;
        C0949f c0949f2 = arrayList.get(arrayList.size() - 1);
        if (c0949f.f5100b != 0) {
            f12 = c0949f.f5103e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (c0949f2.f5100b != this.f5081r.mo6129c() - 1) {
            f13 = c0949f2.f5103e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f5064e0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f5065f0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f5053Q += scrollX - i10;
        scrollTo(i10, getScrollY());
        m6074C(i10);
        return z12;
    }

    /* renamed from: G */
    private void m6076G(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f5075o.isEmpty()) {
            if (!this.f5089w.isFinished()) {
                this.f5089w.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        C0949f m6115u = m6115u(this.f5083s);
        int min = (int) ((m6115u != null ? Math.min(m6115u.f5103e, this.f5041E) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m6083g(false);
            scrollTo(min, getScrollY());
        }
    }

    /* renamed from: H */
    private void m6077H() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0950g) getChildAt(i10).getLayoutParams()).f5104a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    /* renamed from: K */
    private void m6078K(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* renamed from: L */
    private boolean m6079L() {
        this.f5057U = -1;
        m6089o();
        this.f5064e0.onRelease();
        this.f5065f0.onRelease();
        return this.f5064e0.isFinished() || this.f5065f0.isFinished();
    }

    /* renamed from: M */
    private void m6080M(int i10, boolean z10, int i11, boolean z11) {
        C0949f m6115u = m6115u(i10);
        int clientWidth = m6115u != null ? (int) (getClientWidth() * Math.max(this.f5040D, Math.min(m6115u.f5103e, this.f5041E))) : 0;
        if (z10) {
            m6104Q(clientWidth, 0, i11);
            if (z11) {
                m6086k(i10);
                return;
            }
            return;
        }
        if (z11) {
            m6086k(i10);
        }
        m6083g(false);
        scrollTo(clientWidth, 0);
        m6074C(clientWidth);
    }

    /* renamed from: R */
    private void m6081R() {
        if (this.f5080q0 != 0) {
            ArrayList<View> arrayList = this.f5082r0;
            if (arrayList == null) {
                this.f5082r0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f5082r0.add(getChildAt(i10));
            }
            Collections.sort(this.f5082r0, f5036x0);
        }
    }

    /* renamed from: e */
    private void m6082e(C0949f c0949f, int i10, C0949f c0949f2) {
        int i11;
        int i12;
        C0949f c0949f3;
        C0949f c0949f4;
        int mo6129c = this.f5081r.mo6129c();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f5092z / clientWidth : 0.0f;
        if (c0949f2 != null) {
            int i13 = c0949f2.f5100b;
            int i14 = c0949f.f5100b;
            if (i13 < i14) {
                float f11 = c0949f2.f5103e + c0949f2.f5102d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= c0949f.f5100b && i16 < this.f5075o.size()) {
                    C0949f c0949f5 = this.f5075o.get(i16);
                    while (true) {
                        c0949f4 = c0949f5;
                        if (i15 <= c0949f4.f5100b || i16 >= this.f5075o.size() - 1) {
                            break;
                        }
                        i16++;
                        c0949f5 = this.f5075o.get(i16);
                    }
                    while (i15 < c0949f4.f5100b) {
                        f11 += this.f5081r.m6132f(i15) + f10;
                        i15++;
                    }
                    c0949f4.f5103e = f11;
                    f11 += c0949f4.f5102d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f5075o.size() - 1;
                float f12 = c0949f2.f5103e;
                while (true) {
                    i13--;
                    if (i13 < c0949f.f5100b || size < 0) {
                        break;
                    }
                    C0949f c0949f6 = this.f5075o.get(size);
                    while (true) {
                        c0949f3 = c0949f6;
                        if (i13 >= c0949f3.f5100b || size <= 0) {
                            break;
                        }
                        size--;
                        c0949f6 = this.f5075o.get(size);
                    }
                    while (i13 > c0949f3.f5100b) {
                        f12 -= this.f5081r.m6132f(i13) + f10;
                        i13--;
                    }
                    f12 -= c0949f3.f5102d + f10;
                    c0949f3.f5103e = f12;
                }
            }
        }
        int size2 = this.f5075o.size();
        float f13 = c0949f.f5103e;
        int i17 = c0949f.f5100b;
        int i18 = i17 - 1;
        this.f5040D = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = mo6129c - 1;
        this.f5041E = i17 == i19 ? (c0949f.f5102d + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            C0949f c0949f7 = this.f5075o.get(i20);
            while (true) {
                i12 = c0949f7.f5100b;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.f5081r.m6132f(i18) + f10;
                i18--;
            }
            f13 -= c0949f7.f5102d + f10;
            c0949f7.f5103e = f13;
            if (i12 == 0) {
                this.f5040D = f13;
            }
            i20--;
            i18--;
        }
        float f14 = c0949f.f5103e + c0949f.f5102d + f10;
        int i21 = c0949f.f5100b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            C0949f c0949f8 = this.f5075o.get(i22);
            while (true) {
                i11 = c0949f8.f5100b;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.f5081r.m6132f(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f5041E = (c0949f8.f5102d + f14) - 1.0f;
            }
            c0949f8.f5103e = f14;
            f14 += c0949f8.f5102d + f10;
            i22++;
            i21++;
        }
        this.f5067h0 = false;
    }

    /* renamed from: g */
    private void m6083g(boolean z10) {
        boolean z11 = this.f5086t0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f5089w.isFinished()) {
                this.f5089w.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5089w.getCurrX();
                int currY = this.f5089w.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m6074C(currX);
                    }
                }
            }
        }
        this.f5046J = false;
        for (int i10 = 0; i10 < this.f5075o.size(); i10++) {
            C0949f c0949f = this.f5075o.get(i10);
            if (c0949f.f5101c) {
                c0949f.f5101c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                C0690v.m3837i0(this, this.f5084s0);
            } else {
                this.f5084s0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private int m6084i(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f5061b0 || Math.abs(i11) <= this.f5059W) {
            i10 += (int) (f10 + (i10 >= this.f5083s ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f5075o.size() <= 0) {
            return i10;
        }
        return Math.max(this.f5075o.get(0).f5100b, Math.min(i10, this.f5075o.get(r4.size() - 1).f5100b));
    }

    /* renamed from: j */
    private void m6085j(int i10, float f10, int i11) {
        InterfaceC0953j interfaceC0953j = this.f5071l0;
        if (interfaceC0953j != null) {
            interfaceC0953j.mo6124a(i10, f10, i11);
        }
        List<InterfaceC0953j> list = this.f5070k0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC0953j interfaceC0953j2 = this.f5070k0.get(i12);
                if (interfaceC0953j2 != null) {
                    interfaceC0953j2.mo6124a(i10, f10, i11);
                }
            }
        }
        InterfaceC0953j interfaceC0953j3 = this.f5072m0;
        if (interfaceC0953j3 != null) {
            interfaceC0953j3.mo6124a(i10, f10, i11);
        }
    }

    /* renamed from: k */
    private void m6086k(int i10) {
        InterfaceC0953j interfaceC0953j = this.f5071l0;
        if (interfaceC0953j != null) {
            interfaceC0953j.mo6126c(i10);
        }
        List<InterfaceC0953j> list = this.f5070k0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0953j interfaceC0953j2 = this.f5070k0.get(i11);
                if (interfaceC0953j2 != null) {
                    interfaceC0953j2.mo6126c(i10);
                }
            }
        }
        InterfaceC0953j interfaceC0953j3 = this.f5072m0;
        if (interfaceC0953j3 != null) {
            interfaceC0953j3.mo6126c(i10);
        }
    }

    /* renamed from: l */
    private void m6087l(int i10) {
        InterfaceC0953j interfaceC0953j = this.f5071l0;
        if (interfaceC0953j != null) {
            interfaceC0953j.mo6125b(i10);
        }
        List<InterfaceC0953j> list = this.f5070k0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC0953j interfaceC0953j2 = this.f5070k0.get(i11);
                if (interfaceC0953j2 != null) {
                    interfaceC0953j2.mo6125b(i10);
                }
            }
        }
        InterfaceC0953j interfaceC0953j3 = this.f5072m0;
        if (interfaceC0953j3 != null) {
            interfaceC0953j3.mo6125b(i10);
        }
    }

    /* renamed from: n */
    private void m6088n(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f5078p0 : 0, null);
        }
    }

    /* renamed from: o */
    private void m6089o() {
        this.f5048L = false;
        this.f5049M = false;
        VelocityTracker velocityTracker = this.f5058V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5058V = null;
        }
    }

    /* renamed from: q */
    private Rect m6090q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f5045I != z10) {
            this.f5045I = z10;
        }
    }

    /* renamed from: t */
    private C0949f m6091t() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f5092z / clientWidth : 0.0f;
        C0949f c0949f = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.f5075o.size()) {
            C0949f c0949f2 = this.f5075o.get(i12);
            if (!z10 && c0949f2.f5100b != (i10 = i11 + 1)) {
                c0949f2 = this.f5077p;
                c0949f2.f5103e = f10 + f12 + f11;
                c0949f2.f5100b = i10;
                c0949f2.f5102d = this.f5081r.m6132f(i10);
                i12--;
            }
            f10 = c0949f2.f5103e;
            float f13 = c0949f2.f5102d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return c0949f;
            }
            if (scrollX < f13 || i12 == this.f5075o.size() - 1) {
                return c0949f2;
            }
            i11 = c0949f2.f5100b;
            f12 = c0949f2.f5102d;
            i12++;
            c0949f = c0949f2;
            z10 = false;
        }
        return c0949f;
    }

    /* renamed from: w */
    private static boolean m6092w(View view) {
        return view.getClass().getAnnotation(InterfaceC0948e.class) != null;
    }

    /* renamed from: x */
    private boolean m6093x(float f10, float f11) {
        return (f10 < ((float) this.f5051O) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.f5051O)) && f11 < 0.0f);
    }

    /* renamed from: z */
    private void m6094z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5057U) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5053Q = motionEvent.getX(i10);
            this.f5057U = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f5058V;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: A */
    boolean m6095A() {
        int i10 = this.f5083s;
        if (i10 <= 0) {
            return false;
        }
        m6101N(i10 - 1, true);
        return true;
    }

    /* renamed from: B */
    boolean m6096B() {
        AbstractC0957a abstractC0957a = this.f5081r;
        if (abstractC0957a == null || this.f5083s >= abstractC0957a.mo6129c() - 1) {
            return false;
        }
        m6101N(this.f5083s + 1, true);
        return true;
    }

    /* renamed from: E */
    void m6097E() {
        m6098F(this.f5083s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m6098F(int r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m6098F(int):void");
    }

    /* renamed from: I */
    public void m6099I(InterfaceC0952i interfaceC0952i) {
        List<InterfaceC0952i> list = this.f5074n0;
        if (list != null) {
            list.remove(interfaceC0952i);
        }
    }

    /* renamed from: J */
    public void m6100J(InterfaceC0953j interfaceC0953j) {
        List<InterfaceC0953j> list = this.f5070k0;
        if (list != null) {
            list.remove(interfaceC0953j);
        }
    }

    /* renamed from: N */
    public void m6101N(int i10, boolean z10) {
        this.f5046J = false;
        m6102O(i10, z10, false);
    }

    /* renamed from: O */
    void m6102O(int i10, boolean z10, boolean z11) {
        m6103P(i10, z10, z11, 0);
    }

    /* renamed from: P */
    void m6103P(int i10, boolean z10, boolean z11, int i11) {
        AbstractC0957a abstractC0957a = this.f5081r;
        if (abstractC0957a != null && abstractC0957a.mo6129c() > 0) {
            if (!z11 && this.f5083s == i10 && this.f5075o.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f5081r.mo6129c()) {
                i10 = this.f5081r.mo6129c() - 1;
            }
            int i12 = this.f5047K;
            int i13 = this.f5083s;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f5075o.size(); i14++) {
                    this.f5075o.get(i14).f5101c = true;
                }
            }
            boolean z12 = this.f5083s != i10;
            if (this.f5066g0) {
                this.f5083s = i10;
                if (z12) {
                    m6086k(i10);
                }
                requestLayout();
                return;
            }
            m6098F(i10);
            m6080M(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* renamed from: Q */
    void m6104Q(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5089w;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f5090x ? this.f5089w.getCurrX() : this.f5089w.getStartX();
            this.f5089w.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            m6083g(false);
            m6097E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float m6111m = f11 + (m6111m(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m6111m / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((f10 * this.f5081r.m6132f(this.f5083s)) + this.f5092z)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f5090x = false;
        this.f5089w.startScroll(i13, scrollY, i14, i15, min);
        C0690v.m3835h0(this);
    }

    /* renamed from: a */
    C0949f m6105a(int i10, int i11) {
        C0949f c0949f = new C0949f();
        c0949f.f5100b = i10;
        c0949f.f5099a = this.f5081r.mo4715g(this, i10);
        c0949f.f5102d = this.f5081r.m6132f(i10);
        if (i11 >= 0 && i11 < this.f5075o.size()) {
            this.f5075o.add(i11, c0949f);
        } else {
            this.f5075o.add(c0949f);
        }
        return c0949f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        C0949f m6114s;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (m6114s = m6114s(childAt)) != null && m6114s.f5100b == this.f5083s) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0949f m6114s;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m6114s = m6114s(childAt)) != null && m6114s.f5100b == this.f5083s) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0950g c0950g = (C0950g) layoutParams;
        boolean m6092w = c0950g.f5104a | m6092w(view);
        c0950g.f5104a = m6092w;
        if (!this.f5044H) {
            super.addView(view, i10, layoutParams);
        } else {
            if (!m6092w) {
                c0950g.f5107d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void m6106b(InterfaceC0952i interfaceC0952i) {
        if (this.f5074n0 == null) {
            this.f5074n0 = new ArrayList();
        }
        this.f5074n0.add(interfaceC0952i);
    }

    /* renamed from: c */
    public void m6107c(InterfaceC0953j interfaceC0953j) {
        if (this.f5070k0 == null) {
            this.f5070k0 = new ArrayList();
        }
        this.f5070k0.add(interfaceC0953j);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f5081r == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5040D)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f5041E));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0950g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f5090x = true;
        if (!this.f5089w.isFinished() && this.f5089w.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f5089w.getCurrX();
            int currY = this.f5089w.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m6074C(currX)) {
                    this.f5089w.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C0690v.m3835h0(this);
            return;
        }
        m6083g(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6108d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = 1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = 0
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f5079q
            android.graphics.Rect r1 = r6.m6090q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5079q
            android.graphics.Rect r2 = r6.m6090q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.m6095A()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.f5079q
            android.graphics.Rect r1 = r6.m6090q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5079q
            android.graphics.Rect r2 = r6.m6090q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.m6096B()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.m6096B()
            goto Lcd
        Lc9:
            boolean r2 = r6.m6095A()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m6108d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m6112p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0949f m6114s;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m6114s = m6114s(childAt)) != null && m6114s.f5100b == this.f5083s && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0957a abstractC0957a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC0957a = this.f5081r) == null || abstractC0957a.mo6129c() <= 1)) {
            this.f5064e0.finish();
            this.f5065f0.finish();
        } else {
            if (!this.f5064e0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f5040D * width);
                this.f5064e0.setSize(height, width);
                z10 = false | this.f5064e0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5065f0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f5041E + 1.0f)) * width2);
                this.f5065f0.setSize(height2, width2);
                z10 |= this.f5065f0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            C0690v.m3835h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5037A;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: f */
    protected boolean m6109f(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && m6109f(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0950g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0957a getAdapter() {
        return this.f5081r;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.f5080q0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0950g) this.f5082r0.get(i11).getLayoutParams()).f5109f;
    }

    public int getCurrentItem() {
        return this.f5083s;
    }

    public int getOffscreenPageLimit() {
        return this.f5047K;
    }

    public int getPageMargin() {
        return this.f5092z;
    }

    /* renamed from: h */
    void m6110h() {
        int mo6129c = this.f5081r.mo6129c();
        this.f5073n = mo6129c;
        boolean z10 = this.f5075o.size() < (this.f5047K * 2) + 1 && this.f5075o.size() < mo6129c;
        int i10 = this.f5083s;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f5075o.size()) {
            C0949f c0949f = this.f5075o.get(i11);
            int m6130d = this.f5081r.m6130d(c0949f.f5099a);
            if (m6130d != -1) {
                if (m6130d == -2) {
                    this.f5075o.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f5081r.mo4720n(this);
                        z11 = true;
                    }
                    this.f5081r.mo4713a(this, c0949f.f5100b, c0949f.f5099a);
                    int i12 = this.f5083s;
                    if (i12 == c0949f.f5100b) {
                        i10 = Math.max(0, Math.min(i12, mo6129c - 1));
                    }
                } else {
                    int i13 = c0949f.f5100b;
                    if (i13 != m6130d) {
                        if (i13 == this.f5083s) {
                            i10 = m6130d;
                        }
                        c0949f.f5100b = m6130d;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f5081r.mo4714b(this);
        }
        Collections.sort(this.f5075o, f5034v0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                C0950g c0950g = (C0950g) getChildAt(i14).getLayoutParams();
                if (!c0950g.f5104a) {
                    c0950g.f5106c = 0.0f;
                }
            }
            m6102O(i10, false, true);
            requestLayout();
        }
    }

    /* renamed from: m */
    float m6111m(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5066g0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f5084s0);
        Scroller scroller = this.f5089w;
        if (scroller != null && !scroller.isFinished()) {
            this.f5089w.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.f5092z <= 0 || this.f5037A == null || this.f5075o.size() <= 0 || this.f5081r == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f12 = this.f5092z / width;
        int i11 = 0;
        C0949f c0949f = this.f5075o.get(0);
        float f13 = c0949f.f5103e;
        int size = this.f5075o.size();
        int i12 = c0949f.f5100b;
        int i13 = this.f5075o.get(size - 1).f5100b;
        while (i12 < i13) {
            while (true) {
                i10 = c0949f.f5100b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                c0949f = this.f5075o.get(i11);
            }
            if (i12 == i10) {
                float f14 = c0949f.f5103e;
                float f15 = c0949f.f5102d;
                f10 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                float m6132f = this.f5081r.m6132f(i12);
                f10 = (f13 + m6132f) * width;
                f13 += m6132f + f12;
            }
            if (this.f5092z + f10 > scrollX) {
                f11 = f12;
                this.f5037A.setBounds(Math.round(f10), this.f5038B, Math.round(this.f5092z + f10), this.f5039C);
                this.f5037A.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + r2) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f5048L) {
                    return true;
                }
                if (this.f5049M) {
                    return false;
                }
            }
            if (action == 0) {
                float x10 = motionEvent.getX();
                this.f5055S = x10;
                this.f5053Q = x10;
                float y10 = motionEvent.getY();
                this.f5056T = y10;
                this.f5054R = y10;
                this.f5057U = motionEvent.getPointerId(0);
                this.f5049M = false;
                this.f5090x = true;
                this.f5089w.computeScrollOffset();
                if (this.f5086t0 == 2 && Math.abs(this.f5089w.getFinalX() - this.f5089w.getCurrX()) > this.f5062c0) {
                    this.f5089w.abortAnimation();
                    this.f5046J = false;
                    m6097E();
                    this.f5048L = true;
                    m6078K(true);
                    setScrollState(1);
                } else {
                    m6083g(false);
                    this.f5048L = false;
                }
            } else if (action == 2) {
                int i10 = this.f5057U;
                if (i10 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float f10 = x11 - this.f5053Q;
                    float abs = Math.abs(f10);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y11 - this.f5056T);
                    if (f10 != 0.0f && !m6093x(this.f5053Q, f10) && m6109f(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.f5053Q = x11;
                        this.f5054R = y11;
                        this.f5049M = true;
                        return false;
                    }
                    int i11 = this.f5052P;
                    if (abs > i11 && abs * 0.5f > abs2) {
                        this.f5048L = true;
                        m6078K(true);
                        setScrollState(1);
                        float f11 = this.f5055S;
                        float f12 = this.f5052P;
                        this.f5053Q = f10 > 0.0f ? f11 + f12 : f11 - f12;
                        this.f5054R = y11;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i11) {
                        this.f5049M = true;
                    }
                    if (this.f5048L && m6075D(x11)) {
                        C0690v.m3835h0(this);
                    }
                }
            } else if (action == 6) {
                m6094z(motionEvent);
            }
            if (this.f5058V == null) {
                this.f5058V = VelocityTracker.obtain();
            }
            this.f5058V.addMovement(motionEvent);
            return this.f5048L;
        }
        m6079L();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        C0949f m6114s;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (m6114s = m6114s(childAt)) != null && m6114s.f5100b == this.f5083s && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        AbstractC0957a abstractC0957a = this.f5081r;
        if (abstractC0957a != null) {
            abstractC0957a.mo4717j(savedState.f5094o, savedState.f5095p);
            m6102O(savedState.f5093n, false, true);
        } else {
            this.f5085t = savedState.f5093n;
            this.f5087u = savedState.f5094o;
            this.f5088v = savedState.f5095p;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5093n = this.f5083s;
        AbstractC0957a abstractC0957a = this.f5081r;
        if (abstractC0957a != null) {
            savedState.f5094o = abstractC0957a.mo4718k();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f5092z;
            m6076G(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC0957a abstractC0957a;
        if (this.f5063d0) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC0957a = this.f5081r) == null || abstractC0957a.mo6129c() == 0) {
            return false;
        }
        if (this.f5058V == null) {
            this.f5058V = VelocityTracker.obtain();
        }
        this.f5058V.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f5089w.abortAnimation();
            this.f5046J = false;
            m6097E();
            float x10 = motionEvent.getX();
            this.f5055S = x10;
            this.f5053Q = x10;
            float y10 = motionEvent.getY();
            this.f5056T = y10;
            this.f5054R = y10;
            this.f5057U = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f5048L) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5057U);
                    if (findPointerIndex == -1) {
                        z10 = m6079L();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.f5053Q);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f5054R);
                        if (abs > this.f5052P && abs > abs2) {
                            this.f5048L = true;
                            m6078K(true);
                            float f10 = this.f5055S;
                            this.f5053Q = x11 - f10 > 0.0f ? f10 + this.f5052P : f10 - this.f5052P;
                            this.f5054R = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f5048L) {
                    z10 = false | m6075D(motionEvent.getX(motionEvent.findPointerIndex(this.f5057U)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f5053Q = motionEvent.getX(actionIndex);
                    this.f5057U = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m6094z(motionEvent);
                    this.f5053Q = motionEvent.getX(motionEvent.findPointerIndex(this.f5057U));
                }
            } else if (this.f5048L) {
                m6080M(this.f5083s, true, 0, false);
                z10 = m6079L();
            }
        } else if (this.f5048L) {
            VelocityTracker velocityTracker = this.f5058V;
            velocityTracker.computeCurrentVelocity(1000, this.f5060a0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f5057U);
            this.f5046J = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0949f m6091t = m6091t();
            float f11 = clientWidth;
            m6103P(m6084i(m6091t.f5100b, ((scrollX / f11) - m6091t.f5103e) / (m6091t.f5102d + (this.f5092z / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f5057U)) - this.f5055S)), true, true, xVelocity);
            z10 = m6079L();
        }
        if (z10) {
            C0690v.m3835h0(this);
        }
        return true;
    }

    /* renamed from: p */
    public boolean m6112p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return m6095A();
                }
                return m6108d(17);
            }
            if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return m6096B();
                }
                return m6108d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m6108d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m6108d(1);
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    C0949f m6113r(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return m6114s(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f5044H) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    C0949f m6114s(View view) {
        for (int i10 = 0; i10 < this.f5075o.size(); i10++) {
            C0949f c0949f = this.f5075o.get(i10);
            if (this.f5081r.mo4716h(view, c0949f.f5099a)) {
                return c0949f;
            }
        }
        return null;
    }

    public void setAdapter(AbstractC0957a abstractC0957a) {
        AbstractC0957a abstractC0957a2 = this.f5081r;
        if (abstractC0957a2 != null) {
            abstractC0957a2.m6134m(null);
            this.f5081r.mo4720n(this);
            for (int i10 = 0; i10 < this.f5075o.size(); i10++) {
                C0949f c0949f = this.f5075o.get(i10);
                this.f5081r.mo4713a(this, c0949f.f5100b, c0949f.f5099a);
            }
            this.f5081r.mo4714b(this);
            this.f5075o.clear();
            m6077H();
            this.f5083s = 0;
            scrollTo(0, 0);
        }
        AbstractC0957a abstractC0957a3 = this.f5081r;
        this.f5081r = abstractC0957a;
        this.f5073n = 0;
        if (abstractC0957a != null) {
            if (this.f5091y == null) {
                this.f5091y = new C0955l();
            }
            this.f5081r.m6134m(this.f5091y);
            this.f5046J = false;
            boolean z10 = this.f5066g0;
            this.f5066g0 = true;
            this.f5073n = this.f5081r.mo6129c();
            if (this.f5085t >= 0) {
                this.f5081r.mo4717j(this.f5087u, this.f5088v);
                m6102O(this.f5085t, false, true);
                this.f5085t = -1;
                this.f5087u = null;
                this.f5088v = null;
            } else if (!z10) {
                m6097E();
            } else {
                requestLayout();
            }
        }
        List<InterfaceC0952i> list = this.f5074n0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f5074n0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f5074n0.get(i11).mo6123a(this, abstractC0957a3, abstractC0957a);
        }
    }

    public void setCurrentItem(int i10) {
        this.f5046J = false;
        m6102O(i10, !this.f5066g0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f5047K) {
            this.f5047K = i10;
            m6097E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0953j interfaceC0953j) {
        this.f5071l0 = interfaceC0953j;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f5092z;
        this.f5092z = i10;
        int width = getWidth();
        m6076G(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5037A = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.f5086t0 == i10) {
            return;
        }
        this.f5086t0 = i10;
        if (this.f5076o0 != null) {
            m6088n(i10 != 0);
        }
        m6087l(i10);
    }

    /* renamed from: u */
    C0949f m6115u(int i10) {
        for (int i11 = 0; i11 < this.f5075o.size(); i11++) {
            C0949f c0949f = this.f5075o.get(i11);
            if (c0949f.f5100b == i10) {
                return c0949f;
            }
        }
        return null;
    }

    /* renamed from: v */
    void m6116v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f5089w = new Scroller(context, f5035w0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f5052P = viewConfiguration.getScaledPagingTouchSlop();
        this.f5059W = (int) (400.0f * f10);
        this.f5060a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5064e0 = new EdgeEffect(context);
        this.f5065f0 = new EdgeEffect(context);
        this.f5061b0 = (int) (25.0f * f10);
        this.f5062c0 = (int) (2.0f * f10);
        this.f5050N = (int) (f10 * 16.0f);
        C0690v.m3853q0(this, new C0951h());
        if (C0690v.m3787C(this) == 0) {
            C0690v.m3871z0(this, 1);
        }
        C0690v.m3786B0(this, new C0947d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5037A;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m6117y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f5069j0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0950g) r9
            boolean r10 = r9.f5104a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f5105b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.m6085j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f5076o0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0950g) r0
            boolean r0 = r0.f5104a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f5076o0
            r3.m6127a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f5068i0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m6117y(int, float, int):void");
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public static class C0950g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5104a;

        /* renamed from: b */
        public int f5105b;

        /* renamed from: c */
        float f5106c;

        /* renamed from: d */
        boolean f5107d;

        /* renamed from: e */
        int f5108e;

        /* renamed from: f */
        int f5109f;

        public C0950g() {
            super(-1, -1);
            this.f5106c = 0.0f;
        }

        public C0950g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5106c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f5033u0);
            this.f5105b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0950g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(C0587a.m3031e(getContext(), i10));
    }
}
