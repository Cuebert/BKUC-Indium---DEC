package p135k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p135k1.AbstractC3734l;

/* renamed from: k1.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC3726f0 extends AbstractC3734l {

    /* renamed from: X */
    private static final String[] f15633X = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: W */
    private int f15634W = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.f0$a */
    /* loaded from: classes.dex */
    public class a extends C3735m {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f15635a;

        /* renamed from: b */
        final /* synthetic */ View f15636b;

        /* renamed from: c */
        final /* synthetic */ View f15637c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f15635a = viewGroup;
            this.f15636b = view;
            this.f15637c = view2;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            this.f15637c.setTag(C3731i.f15652a, null);
            C3744v.m15938a(this.f15635a).mo15936c(this.f15636b);
            abstractC3734l.mo15887Z(this);
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: d */
        public void mo15833d(AbstractC3734l abstractC3734l) {
            if (this.f15636b.getParent() == null) {
                C3744v.m15938a(this.f15635a).mo15934a(this.f15636b);
            } else {
                AbstractC3726f0.this.cancel();
            }
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: e */
        public void mo15834e(AbstractC3734l abstractC3734l) {
            C3744v.m15938a(this.f15635a).mo15936c(this.f15636b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.f0$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements AbstractC3734l.f {

        /* renamed from: a */
        private final View f15639a;

        /* renamed from: b */
        private final int f15640b;

        /* renamed from: c */
        private final ViewGroup f15641c;

        /* renamed from: d */
        private final boolean f15642d;

        /* renamed from: e */
        private boolean f15643e;

        /* renamed from: f */
        boolean f15644f = false;

        b(View view, int i10, boolean z10) {
            this.f15639a = view;
            this.f15640b = i10;
            this.f15641c = (ViewGroup) view.getParent();
            this.f15642d = z10;
            m15858g(true);
        }

        /* renamed from: f */
        private void m15857f() {
            if (!this.f15644f) {
                C3747y.m15948h(this.f15639a, this.f15640b);
                ViewGroup viewGroup = this.f15641c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m15858g(false);
        }

        /* renamed from: g */
        private void m15858g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f15642d || this.f15643e == z10 || (viewGroup = this.f15641c) == null) {
                return;
            }
            this.f15643e = z10;
            C3744v.m15940c(viewGroup, z10);
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: a */
        public void mo15831a(AbstractC3734l abstractC3734l) {
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            m15857f();
            abstractC3734l.mo15887Z(this);
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: c */
        public void mo15846c(AbstractC3734l abstractC3734l) {
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: d */
        public void mo15833d(AbstractC3734l abstractC3734l) {
            m15858g(true);
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: e */
        public void mo15834e(AbstractC3734l abstractC3734l) {
            m15858g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15644f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m15857f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f15644f) {
                return;
            }
            C3747y.m15948h(this.f15639a, this.f15640b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f15644f) {
                return;
            }
            C3747y.m15948h(this.f15639a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1.f0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        boolean f15645a;

        /* renamed from: b */
        boolean f15646b;

        /* renamed from: c */
        int f15647c;

        /* renamed from: d */
        int f15648d;

        /* renamed from: e */
        ViewGroup f15649e;

        /* renamed from: f */
        ViewGroup f15650f;

        c() {
        }
    }

    /* renamed from: m0 */
    private void m15851m0(C3740r c3740r) {
        c3740r.f15718a.put("android:visibility:visibility", Integer.valueOf(c3740r.f15719b.getVisibility()));
        c3740r.f15718a.put("android:visibility:parent", c3740r.f15719b.getParent());
        int[] iArr = new int[2];
        c3740r.f15719b.getLocationOnScreen(iArr);
        c3740r.f15718a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: n0 */
    private c m15852n0(C3740r c3740r, C3740r c3740r2) {
        c cVar = new c();
        cVar.f15645a = false;
        cVar.f15646b = false;
        if (c3740r != null && c3740r.f15718a.containsKey("android:visibility:visibility")) {
            cVar.f15647c = ((Integer) c3740r.f15718a.get("android:visibility:visibility")).intValue();
            cVar.f15649e = (ViewGroup) c3740r.f15718a.get("android:visibility:parent");
        } else {
            cVar.f15647c = -1;
            cVar.f15649e = null;
        }
        if (c3740r2 != null && c3740r2.f15718a.containsKey("android:visibility:visibility")) {
            cVar.f15648d = ((Integer) c3740r2.f15718a.get("android:visibility:visibility")).intValue();
            cVar.f15650f = (ViewGroup) c3740r2.f15718a.get("android:visibility:parent");
        } else {
            cVar.f15648d = -1;
            cVar.f15650f = null;
        }
        if (c3740r != null && c3740r2 != null) {
            int i10 = cVar.f15647c;
            int i11 = cVar.f15648d;
            if (i10 == i11 && cVar.f15649e == cVar.f15650f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f15646b = false;
                    cVar.f15645a = true;
                } else if (i11 == 0) {
                    cVar.f15646b = true;
                    cVar.f15645a = true;
                }
            } else if (cVar.f15650f == null) {
                cVar.f15646b = false;
                cVar.f15645a = true;
            } else if (cVar.f15649e == null) {
                cVar.f15646b = true;
                cVar.f15645a = true;
            }
        } else if (c3740r == null && cVar.f15648d == 0) {
            cVar.f15646b = true;
            cVar.f15645a = true;
        } else if (c3740r2 == null && cVar.f15647c == 0) {
            cVar.f15646b = false;
            cVar.f15645a = true;
        }
        return cVar;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: I */
    public String[] mo15815I() {
        return f15633X;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: K */
    public boolean mo15853K(C3740r c3740r, C3740r c3740r2) {
        if (c3740r == null && c3740r2 == null) {
            return false;
        }
        if (c3740r != null && c3740r2 != null && c3740r2.f15718a.containsKey("android:visibility:visibility") != c3740r.f15718a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m15852n0 = m15852n0(c3740r, c3740r2);
        if (m15852n0.f15645a) {
            return m15852n0.f15647c == 0 || m15852n0.f15648d == 0;
        }
        return false;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: j */
    public void mo15816j(C3740r c3740r) {
        m15851m0(c3740r);
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: n */
    public void mo15817n(C3740r c3740r) {
        m15851m0(c3740r);
    }

    /* renamed from: o0 */
    public abstract Animator mo15841o0(ViewGroup viewGroup, View view, C3740r c3740r, C3740r c3740r2);

    /* renamed from: p0 */
    public Animator m15854p0(ViewGroup viewGroup, C3740r c3740r, int i10, C3740r c3740r2, int i11) {
        if ((this.f15634W & 1) != 1 || c3740r2 == null) {
            return null;
        }
        if (c3740r == null) {
            View view = (View) c3740r2.f15719b.getParent();
            if (m15852n0(m15911x(view, false), m15883J(view, false)).f15645a) {
                return null;
            }
        }
        return mo15841o0(viewGroup, c3740r2.f15719b, c3740r, c3740r2);
    }

    /* renamed from: q0 */
    public abstract Animator mo15842q0(ViewGroup viewGroup, View view, C3740r c3740r, C3740r c3740r2);

    @Override // p135k1.AbstractC3734l
    /* renamed from: r */
    public Animator mo15818r(ViewGroup viewGroup, C3740r c3740r, C3740r c3740r2) {
        c m15852n0 = m15852n0(c3740r, c3740r2);
        if (!m15852n0.f15645a) {
            return null;
        }
        if (m15852n0.f15649e == null && m15852n0.f15650f == null) {
            return null;
        }
        if (m15852n0.f15646b) {
            return m15854p0(viewGroup, c3740r, m15852n0.f15647c, c3740r2, m15852n0.f15648d);
        }
        return m15855r0(viewGroup, c3740r, m15852n0.f15647c, c3740r2, m15852n0.f15648d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.f15669J != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m15855r0(android.view.ViewGroup r18, p135k1.C3740r r19, int r20, p135k1.C3740r r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135k1.AbstractC3726f0.m15855r0(android.view.ViewGroup, k1.r, int, k1.r, int):android.animation.Animator");
    }

    /* renamed from: s0 */
    public void m15856s0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.f15634W = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
