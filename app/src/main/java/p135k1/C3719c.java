package p135k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0690v;
import java.util.Map;

/* renamed from: k1.c */
/* loaded from: classes.dex */
public class C3719c extends AbstractC3734l {

    /* renamed from: Z */
    private static final String[] f15573Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: a0 */
    private static final Property<Drawable, PointF> f15574a0 = new b(PointF.class, "boundsOrigin");

    /* renamed from: b0 */
    private static final Property<k, PointF> f15575b0 = new c(PointF.class, "topLeft");

    /* renamed from: c0 */
    private static final Property<k, PointF> f15576c0 = new d(PointF.class, "bottomRight");

    /* renamed from: d0 */
    private static final Property<View, PointF> f15577d0 = new e(PointF.class, "bottomRight");

    /* renamed from: e0 */
    private static final Property<View, PointF> f15578e0 = new f(PointF.class, "topLeft");

    /* renamed from: f0 */
    private static final Property<View, PointF> f15579f0 = new g(PointF.class, "position");

    /* renamed from: g0 */
    private static C3732j f15580g0 = new C3732j();

    /* renamed from: W */
    private int[] f15581W = new int[2];

    /* renamed from: X */
    private boolean f15582X = false;

    /* renamed from: Y */
    private boolean f15583Y = false;

    /* renamed from: k1.c$a */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f15584a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f15585b;

        /* renamed from: c */
        final /* synthetic */ View f15586c;

        /* renamed from: d */
        final /* synthetic */ float f15587d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f15584a = viewGroup;
            this.f15585b = bitmapDrawable;
            this.f15586c = view;
            this.f15587d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3747y.m15942b(this.f15584a).mo15937d(this.f15585b);
            C3747y.m15947g(this.f15586c, this.f15587d);
        }
    }

    /* renamed from: k1.c$b */
    /* loaded from: classes.dex */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f15589a;

        b(Class cls, String str) {
            super(cls, str);
            this.f15589a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f15589a);
            Rect rect = this.f15589a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f15589a);
            this.f15589a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f15589a);
        }
    }

    /* renamed from: k1.c$c */
    /* loaded from: classes.dex */
    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m15837c(pointF);
        }
    }

    /* renamed from: k1.c$d */
    /* loaded from: classes.dex */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m15836a(pointF);
        }
    }

    /* renamed from: k1.c$e */
    /* loaded from: classes.dex */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C3747y.m15946f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: k1.c$f */
    /* loaded from: classes.dex */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C3747y.m15946f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: k1.c$g */
    /* loaded from: classes.dex */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C3747y.m15946f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: k1.c$h */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ k f15590a;
        private k mViewBounds;

        h(k kVar) {
            this.f15590a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: k1.c$i */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f15592a;

        /* renamed from: b */
        final /* synthetic */ View f15593b;

        /* renamed from: c */
        final /* synthetic */ Rect f15594c;

        /* renamed from: d */
        final /* synthetic */ int f15595d;

        /* renamed from: e */
        final /* synthetic */ int f15596e;

        /* renamed from: f */
        final /* synthetic */ int f15597f;

        /* renamed from: g */
        final /* synthetic */ int f15598g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f15593b = view;
            this.f15594c = rect;
            this.f15595d = i10;
            this.f15596e = i11;
            this.f15597f = i12;
            this.f15598g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15592a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f15592a) {
                return;
            }
            C0690v.m3865w0(this.f15593b, this.f15594c);
            C3747y.m15946f(this.f15593b, this.f15595d, this.f15596e, this.f15597f, this.f15598g);
        }
    }

    /* renamed from: k1.c$j */
    /* loaded from: classes.dex */
    class j extends C3735m {

        /* renamed from: a */
        boolean f15600a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f15601b;

        j(ViewGroup viewGroup) {
            this.f15601b = viewGroup;
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: a */
        public void mo15831a(AbstractC3734l abstractC3734l) {
            C3744v.m15940c(this.f15601b, false);
            this.f15600a = true;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            if (!this.f15600a) {
                C3744v.m15940c(this.f15601b, false);
            }
            abstractC3734l.mo15887Z(this);
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: d */
        public void mo15833d(AbstractC3734l abstractC3734l) {
            C3744v.m15940c(this.f15601b, true);
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: e */
        public void mo15834e(AbstractC3734l abstractC3734l) {
            C3744v.m15940c(this.f15601b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.c$k */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a */
        private int f15603a;

        /* renamed from: b */
        private int f15604b;

        /* renamed from: c */
        private int f15605c;

        /* renamed from: d */
        private int f15606d;

        /* renamed from: e */
        private View f15607e;

        /* renamed from: f */
        private int f15608f;

        /* renamed from: g */
        private int f15609g;

        k(View view) {
            this.f15607e = view;
        }

        /* renamed from: b */
        private void m15835b() {
            C3747y.m15946f(this.f15607e, this.f15603a, this.f15604b, this.f15605c, this.f15606d);
            this.f15608f = 0;
            this.f15609g = 0;
        }

        /* renamed from: a */
        void m15836a(PointF pointF) {
            this.f15605c = Math.round(pointF.x);
            this.f15606d = Math.round(pointF.y);
            int i10 = this.f15609g + 1;
            this.f15609g = i10;
            if (this.f15608f == i10) {
                m15835b();
            }
        }

        /* renamed from: c */
        void m15837c(PointF pointF) {
            this.f15603a = Math.round(pointF.x);
            this.f15604b = Math.round(pointF.y);
            int i10 = this.f15608f + 1;
            this.f15608f = i10;
            if (i10 == this.f15609g) {
                m15835b();
            }
        }
    }

    /* renamed from: m0 */
    private void m15813m0(C3740r c3740r) {
        View view = c3740r.f15719b;
        if (!C0690v.m3814U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c3740r.f15718a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c3740r.f15718a.put("android:changeBounds:parent", c3740r.f15719b.getParent());
        if (this.f15583Y) {
            c3740r.f15719b.getLocationInWindow(this.f15581W);
            c3740r.f15718a.put("android:changeBounds:windowX", Integer.valueOf(this.f15581W[0]));
            c3740r.f15718a.put("android:changeBounds:windowY", Integer.valueOf(this.f15581W[1]));
        }
        if (this.f15582X) {
            c3740r.f15718a.put("android:changeBounds:clip", C0690v.m3864w(view));
        }
    }

    /* renamed from: n0 */
    private boolean m15814n0(View view, View view2) {
        if (!this.f15583Y) {
            return true;
        }
        C3740r m15911x = m15911x(view, true);
        if (m15911x == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m15911x.f15719b) {
            return true;
        }
        return false;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: I */
    public String[] mo15815I() {
        return f15573Z;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: j */
    public void mo15816j(C3740r c3740r) {
        m15813m0(c3740r);
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: n */
    public void mo15817n(C3740r c3740r) {
        m15813m0(c3740r);
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: r */
    public Animator mo15818r(ViewGroup viewGroup, C3740r c3740r, C3740r c3740r2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m15933c;
        if (c3740r == null || c3740r2 == null) {
            return null;
        }
        Map<String, Object> map = c3740r.f15718a;
        Map<String, Object> map2 = c3740r2.f15718a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c3740r2.f15719b;
        if (m15814n0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) c3740r.f15718a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) c3740r2.f15718a.get("android:changeBounds:bounds");
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            Rect rect4 = (Rect) c3740r.f15718a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) c3740r2.f15718a.get("android:changeBounds:clip");
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (i16 != i17 || i18 != i19) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            if (!this.f15582X) {
                view = view2;
                C3747y.m15946f(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        m15933c = C3725f.m15850a(view, f15579f0, m15876A().mo15859a(i12, i14, i13, i15));
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator m15850a = C3725f.m15850a(kVar, f15575b0, m15876A().mo15859a(i12, i14, i13, i15));
                        ObjectAnimator m15850a2 = C3725f.m15850a(kVar, f15576c0, m15876A().mo15859a(i16, i18, i17, i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(m15850a, m15850a2);
                        animatorSet.addListener(new h(kVar));
                        m15933c = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    m15933c = C3725f.m15850a(view, f15577d0, m15876A().mo15859a(i16, i18, i17, i19));
                } else {
                    m15933c = C3725f.m15850a(view, f15578e0, m15876A().mo15859a(i12, i14, i13, i15));
                }
            } else {
                view = view2;
                C3747y.m15946f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                ObjectAnimator m15850a3 = (i12 == i13 && i14 == i15) ? null : C3725f.m15850a(view, f15579f0, m15876A().mo15859a(i12, i14, i13, i15));
                if (rect4 == null) {
                    i11 = 0;
                    rect = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
                if (rect.equals(rect6)) {
                    objectAnimator = null;
                } else {
                    C0690v.m3865w0(view, rect);
                    C3732j c3732j = f15580g0;
                    Object[] objArr = new Object[2];
                    objArr[i11] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c3732j, objArr);
                    ofObject.addListener(new i(view, rect5, i13, i15, i17, i19));
                    objectAnimator = ofObject;
                }
                m15933c = C3739q.m15933c(m15850a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C3744v.m15940c(viewGroup4, true);
                mo15888a(new j(viewGroup4));
            }
            return m15933c;
        }
        int intValue = ((Integer) c3740r.f15718a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) c3740r.f15718a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) c3740r2.f15718a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) c3740r2.f15718a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f15581W);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float m15943c = C3747y.m15943c(view2);
        C3747y.m15947g(view2, 0.0f);
        C3747y.m15942b(viewGroup).mo15935b(bitmapDrawable);
        AbstractC3727g m15876A = m15876A();
        int[] iArr = this.f15581W;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C3729h.m15860a(f15574a0, m15876A.mo15859a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, m15943c));
        return ofPropertyValuesHolder;
    }
}
