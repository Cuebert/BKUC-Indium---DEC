package p306y0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0656a;
import androidx.core.view.C0690v;
import androidx.core.view.C0694z;
import androidx.core.view.accessibility.C0660c;
import androidx.core.view.accessibility.C0661d;
import androidx.core.view.accessibility.C0662e;
import java.util.ArrayList;
import java.util.List;
import p093h0.C3363h;
import p306y0.C5590b;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5589a extends C0656a {

    /* renamed from: n */
    private static final Rect f20722n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C5590b.a<C0660c> f20723o = new a();

    /* renamed from: p */
    private static final C5590b.b<C3363h<C0660c>, C0660c> f20724p = new b();

    /* renamed from: h */
    private final AccessibilityManager f20729h;

    /* renamed from: i */
    private final View f20730i;

    /* renamed from: j */
    private c f20731j;

    /* renamed from: d */
    private final Rect f20725d = new Rect();

    /* renamed from: e */
    private final Rect f20726e = new Rect();

    /* renamed from: f */
    private final Rect f20727f = new Rect();

    /* renamed from: g */
    private final int[] f20728g = new int[2];

    /* renamed from: k */
    int f20732k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f20733l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f20734m = Integer.MIN_VALUE;

    /* renamed from: y0.a$a */
    /* loaded from: classes.dex */
    static class a implements C5590b.a<C0660c> {
        a() {
        }

        @Override // p306y0.C5590b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo20553a(C0660c c0660c, Rect rect) {
            c0660c.m3550l(rect);
        }
    }

    /* renamed from: y0.a$b */
    /* loaded from: classes.dex */
    static class b implements C5590b.b<C3363h<C0660c>, C0660c> {
        b() {
        }

        @Override // p306y0.C5590b.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0660c mo20555a(C3363h<C0660c> c3363h, int i10) {
            return c3363h.m14855p(i10);
        }

        @Override // p306y0.C5590b.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo20556b(C3363h<C0660c> c3363h) {
            return c3363h.m14854o();
        }
    }

    /* renamed from: y0.a$c */
    /* loaded from: classes.dex */
    private class c extends C0661d {
        c() {
        }

        @Override // androidx.core.view.accessibility.C0661d
        /* renamed from: b */
        public C0660c mo3582b(int i10) {
            return C0660c.m3498N(AbstractC5589a.this.m20542H(i10));
        }

        @Override // androidx.core.view.accessibility.C0661d
        /* renamed from: d */
        public C0660c mo3584d(int i10) {
            int i11 = i10 == 2 ? AbstractC5589a.this.f20732k : AbstractC5589a.this.f20733l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return mo3582b(i11);
        }

        @Override // androidx.core.view.accessibility.C0661d
        /* renamed from: f */
        public boolean mo3586f(int i10, int i11, Bundle bundle) {
            return AbstractC5589a.this.m20546P(i10, i11, bundle);
        }
    }

    public AbstractC5589a(View view) {
        if (view != null) {
            this.f20730i = view;
            this.f20729h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0690v.m3787C(view) == 0) {
                C0690v.m3871z0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m20524D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m20525E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f20730i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f20730i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: F */
    private static int m20526F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m20527G(int i10, Rect rect) {
        C0660c c0660c;
        C3363h<C0660c> m20539y = m20539y();
        int i11 = this.f20733l;
        C0660c m14849h = i11 == Integer.MIN_VALUE ? null : m20539y.m14849h(i11);
        if (i10 == 1 || i10 == 2) {
            c0660c = (C0660c) C5590b.m20562d(m20539y, f20724p, f20723o, m14849h, i10, C0690v.m3791E(this.f20730i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f20733l;
            if (i12 != Integer.MIN_VALUE) {
                m20540z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m20524D(this.f20730i, i10, rect2);
            }
            c0660c = (C0660c) C5590b.m20561c(m20539y, f20724p, f20723o, m14849h, rect2, i10);
        }
        return m20547T(c0660c != null ? m20539y.m14852m(m20539y.m14851k(c0660c)) : Integer.MIN_VALUE);
    }

    /* renamed from: Q */
    private boolean m20528Q(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return m20547T(i10);
        }
        if (i11 == 2) {
            return m20549o(i10);
        }
        if (i11 == 64) {
            return m20530S(i10);
        }
        if (i11 != 128) {
            return mo10838J(i10, i11, bundle);
        }
        return m20532n(i10);
    }

    /* renamed from: R */
    private boolean m20529R(int i10, Bundle bundle) {
        return C0690v.m3831f0(this.f20730i, i10, bundle);
    }

    /* renamed from: S */
    private boolean m20530S(int i10) {
        int i11;
        if (!this.f20729h.isEnabled() || !this.f20729h.isTouchExplorationEnabled() || (i11 = this.f20732k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m20532n(i11);
        }
        this.f20732k = i10;
        this.f20730i.invalidate();
        m20548U(i10, 32768);
        return true;
    }

    /* renamed from: V */
    private void m20531V(int i10) {
        int i11 = this.f20734m;
        if (i11 == i10) {
            return;
        }
        this.f20734m = i10;
        m20548U(i10, 128);
        m20548U(i11, 256);
    }

    /* renamed from: n */
    private boolean m20532n(int i10) {
        if (this.f20732k != i10) {
            return false;
        }
        this.f20732k = Integer.MIN_VALUE;
        this.f20730i.invalidate();
        m20548U(i10, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m20533p() {
        int i10 = this.f20733l;
        return i10 != Integer.MIN_VALUE && mo10838J(i10, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m20534q(int i10, int i11) {
        if (i10 != -1) {
            return m20535r(i10, i11);
        }
        return m20536s(i11);
    }

    /* renamed from: r */
    private AccessibilityEvent m20535r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        C0660c m20542H = m20542H(i10);
        obtain.getText().add(m20542H.m3567v());
        obtain.setContentDescription(m20542H.m3559q());
        obtain.setScrollable(m20542H.m3520I());
        obtain.setPassword(m20542H.m3519H());
        obtain.setEnabled(m20542H.m3515D());
        obtain.setChecked(m20542H.m3513B());
        m20545L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m20542H.m3556o());
        C0662e.m3589c(obtain, this.f20730i, i10);
        obtain.setPackageName(this.f20730i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m20536s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f20730i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C0660c m20537t(int i10) {
        C0660c m3496L = C0660c.m3496L();
        m3496L.m3541e0(true);
        m3496L.m3543g0(true);
        m3496L.m3532Z("android.view.View");
        Rect rect = f20722n;
        m3496L.m3527U(rect);
        m3496L.m3528V(rect);
        m3496L.m3555n0(this.f20730i);
        mo10840N(i10, m3496L);
        if (m3496L.m3567v() == null && m3496L.m3559q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m3496L.m3550l(this.f20726e);
        if (!this.f20726e.equals(rect)) {
            int m3547j = m3496L.m3547j();
            if ((m3547j & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            if ((m3547j & 128) == 0) {
                m3496L.m3551l0(this.f20730i.getContext().getPackageName());
                m3496L.m3565t0(this.f20730i, i10);
                if (this.f20732k == i10) {
                    m3496L.m3526S(true);
                    m3496L.m3533a(128);
                } else {
                    m3496L.m3526S(false);
                    m3496L.m3533a(64);
                }
                boolean z10 = this.f20733l == i10;
                if (z10) {
                    m3496L.m3533a(2);
                } else if (m3496L.m3516E()) {
                    m3496L.m3533a(1);
                }
                m3496L.m3545h0(z10);
                this.f20730i.getLocationOnScreen(this.f20728g);
                m3496L.m3552m(this.f20725d);
                if (this.f20725d.equals(rect)) {
                    m3496L.m3550l(this.f20725d);
                    if (m3496L.f3511b != -1) {
                        C0660c m3496L2 = C0660c.m3496L();
                        for (int i11 = m3496L.f3511b; i11 != -1; i11 = m3496L2.f3511b) {
                            m3496L2.m3557o0(this.f20730i, -1);
                            m3496L2.m3527U(f20722n);
                            mo10840N(i11, m3496L2);
                            m3496L2.m3550l(this.f20726e);
                            Rect rect2 = this.f20725d;
                            Rect rect3 = this.f20726e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        m3496L2.m3524P();
                    }
                    this.f20725d.offset(this.f20728g[0] - this.f20730i.getScrollX(), this.f20728g[1] - this.f20730i.getScrollY());
                }
                if (this.f20730i.getLocalVisibleRect(this.f20727f)) {
                    this.f20727f.offset(this.f20728g[0] - this.f20730i.getScrollX(), this.f20728g[1] - this.f20730i.getScrollY());
                    if (this.f20725d.intersect(this.f20727f)) {
                        m3496L.m3528V(this.f20725d);
                        if (m20525E(this.f20725d)) {
                            m3496L.m3572x0(true);
                        }
                    }
                }
                return m3496L;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    private C0660c m20538u() {
        C0660c m3497M = C0660c.m3497M(this.f20730i);
        C0690v.m3827d0(this.f20730i, m3497M);
        ArrayList arrayList = new ArrayList();
        mo10837C(arrayList);
        if (m3497M.m3554n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m3497M.m3537c(this.f20730i, ((Integer) arrayList.get(i10)).intValue());
        }
        return m3497M;
    }

    /* renamed from: y */
    private C3363h<C0660c> m20539y() {
        ArrayList arrayList = new ArrayList();
        mo10837C(arrayList);
        C3363h<C0660c> c3363h = new C3363h<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c3363h.m14853n(i10, m20537t(i10));
        }
        return c3363h;
    }

    /* renamed from: z */
    private void m20540z(int i10, Rect rect) {
        m20542H(i10).m3550l(rect);
    }

    /* renamed from: A */
    public final int m20541A() {
        return this.f20733l;
    }

    /* renamed from: B */
    protected abstract int mo10836B(float f10, float f11);

    /* renamed from: C */
    protected abstract void mo10837C(List<Integer> list);

    /* renamed from: H */
    C0660c m20542H(int i10) {
        if (i10 == -1) {
            return m20538u();
        }
        return m20537t(i10);
    }

    /* renamed from: I */
    public final void m20543I(boolean z10, int i10, Rect rect) {
        int i11 = this.f20733l;
        if (i11 != Integer.MIN_VALUE) {
            m20549o(i11);
        }
        if (z10) {
            m20527G(i10, rect);
        }
    }

    /* renamed from: J */
    protected abstract boolean mo10838J(int i10, int i11, Bundle bundle);

    /* renamed from: K */
    protected void m20544K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    protected void m20545L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    protected void mo10839M(C0660c c0660c) {
    }

    /* renamed from: N */
    protected abstract void mo10840N(int i10, C0660c c0660c);

    /* renamed from: O */
    protected void mo10841O(int i10, boolean z10) {
    }

    /* renamed from: P */
    boolean m20546P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return m20528Q(i10, i11, bundle);
        }
        return m20529R(i11, bundle);
    }

    /* renamed from: T */
    public final boolean m20547T(int i10) {
        int i11;
        if ((!this.f20730i.isFocused() && !this.f20730i.requestFocus()) || (i11 = this.f20733l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m20549o(i11);
        }
        this.f20733l = i10;
        mo10841O(i10, true);
        m20548U(i10, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean m20548U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f20729h.isEnabled() || (parent = this.f20730i.getParent()) == null) {
            return false;
        }
        return C0694z.m4034h(parent, this.f20730i, m20534q(i10, i11));
    }

    @Override // androidx.core.view.C0656a
    /* renamed from: b */
    public C0661d mo3481b(View view) {
        if (this.f20731j == null) {
            this.f20731j = new c();
        }
        return this.f20731j;
    }

    @Override // androidx.core.view.C0656a
    /* renamed from: f */
    public void mo3483f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3483f(view, accessibilityEvent);
        m20544K(accessibilityEvent);
    }

    @Override // androidx.core.view.C0656a
    /* renamed from: g */
    public void mo3484g(View view, C0660c c0660c) {
        super.mo3484g(view, c0660c);
        mo10839M(c0660c);
    }

    /* renamed from: o */
    public final boolean m20549o(int i10) {
        if (this.f20733l != i10) {
            return false;
        }
        this.f20733l = Integer.MIN_VALUE;
        mo10841O(i10, false);
        m20548U(i10, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m20550v(MotionEvent motionEvent) {
        if (!this.f20729h.isEnabled() || !this.f20729h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f20734m == Integer.MIN_VALUE) {
                return false;
            }
            m20531V(Integer.MIN_VALUE);
            return true;
        }
        int mo10836B = mo10836B(motionEvent.getX(), motionEvent.getY());
        m20531V(mo10836B);
        return mo10836B != Integer.MIN_VALUE;
    }

    /* renamed from: w */
    public final boolean m20551w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int m20526F = m20526F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && m20527G(m20526F, null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m20533p();
            return true;
        }
        if (keyEvent.hasNoModifiers()) {
            return m20527G(2, null);
        }
        if (keyEvent.hasModifiers(1)) {
            return m20527G(1, null);
        }
        return false;
    }

    /* renamed from: x */
    public final int m20552x() {
        return this.f20732k;
    }
}
