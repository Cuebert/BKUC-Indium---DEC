package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C0660c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f4331I;

    /* renamed from: J */
    int f4332J;

    /* renamed from: K */
    int[] f4333K;

    /* renamed from: L */
    View[] f4334L;

    /* renamed from: M */
    final SparseIntArray f4335M;

    /* renamed from: N */
    final SparseIntArray f4336N;

    /* renamed from: O */
    AbstractC0864c f4337O;

    /* renamed from: P */
    final Rect f4338P;

    /* renamed from: Q */
    private boolean f4339Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: classes.dex */
    public static final class C0862a extends AbstractC0864c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0864c
        /* renamed from: e */
        public int mo5033e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0864c
        /* renamed from: f */
        public int mo5034f(int i10) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0864c {

        /* renamed from: a */
        final SparseIntArray f4342a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4343b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4344c = false;

        /* renamed from: d */
        private boolean f4345d = false;

        /* renamed from: a */
        static int m5037a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* renamed from: b */
        int m5038b(int i10, int i11) {
            if (!this.f4345d) {
                return m5040d(i10, i11);
            }
            int i12 = this.f4343b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int m5040d = m5040d(i10, i11);
            this.f4343b.put(i10, m5040d);
            return m5040d;
        }

        /* renamed from: c */
        int m5039c(int i10, int i11) {
            if (!this.f4344c) {
                return mo5033e(i10, i11);
            }
            int i12 = this.f4342a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int mo5033e = mo5033e(i10, i11);
            this.f4342a.put(i10, mo5033e);
            return mo5033e;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m5040d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f4345d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f4343b
                int r0 = m5037a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f4343b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m5039c(r0, r8)
                int r0 = r6.mo5034f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.mo5034f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.mo5034f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0864c.m5040d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo5033e(int i10, int i11);

        /* renamed from: f */
        public abstract int mo5034f(int i10);

        /* renamed from: g */
        public void m5041g() {
            this.f4343b.clear();
        }

        /* renamed from: h */
        public void m5042h() {
            this.f4342a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f4331I = false;
        this.f4332J = -1;
        this.f4335M = new SparseIntArray();
        this.f4336N = new SparseIntArray();
        this.f4337O = new C0862a();
        this.f4338P = new Rect();
        m5021a3(RecyclerView.AbstractC0889p.m5386i0(context, attributeSet, i10, i11).f4563b);
    }

    /* renamed from: J2 */
    private void m4986J2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i14 = i10;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = i10 - 1;
            i12 = -1;
        }
        while (i11 != i14) {
            View view = this.f4334L[i11];
            C0863b c0863b = (C0863b) view.getLayoutParams();
            int m4997W2 = m4997W2(c0896w, c0871a0, m5451h0(view));
            c0863b.f4341f = m4997W2;
            c0863b.f4340e = i13;
            i13 += m4997W2;
            i11 += i12;
        }
    }

    /* renamed from: K2 */
    private void m4987K2() {
        int m5411J = m5411J();
        for (int i10 = 0; i10 < m5411J; i10++) {
            C0863b c0863b = (C0863b) m5410I(i10).getLayoutParams();
            int m5491a = c0863b.m5491a();
            this.f4335M.put(m5491a, c0863b.m5036f());
            this.f4336N.put(m5491a, c0863b.m5035e());
        }
    }

    /* renamed from: L2 */
    private void m4988L2(int i10) {
        this.f4333K = m4989M2(this.f4333K, this.f4332J, i10);
    }

    /* renamed from: M2 */
    static int[] m4989M2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    /* renamed from: N2 */
    private void m4990N2() {
        this.f4335M.clear();
        this.f4336N.clear();
    }

    /* renamed from: O2 */
    private int m4991O2(RecyclerView.C0871a0 c0871a0) {
        int max;
        if (m5411J() != 0 && c0871a0.m5251b() != 0) {
            m5076T1();
            boolean m5093n2 = m5093n2();
            View m5079X1 = m5079X1(!m5093n2, true);
            View m5078W1 = m5078W1(!m5093n2, true);
            if (m5079X1 != null && m5078W1 != null) {
                int m5038b = this.f4337O.m5038b(m5451h0(m5079X1), this.f4332J);
                int m5038b2 = this.f4337O.m5038b(m5451h0(m5078W1), this.f4332J);
                int min = Math.min(m5038b, m5038b2);
                int max2 = Math.max(m5038b, m5038b2);
                int m5038b3 = this.f4337O.m5038b(c0871a0.m5251b() - 1, this.f4332J) + 1;
                if (this.f4359x) {
                    max = Math.max(0, (m5038b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!m5093n2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f4356u.mo5808d(m5078W1) - this.f4356u.mo5811g(m5079X1)) / ((this.f4337O.m5038b(m5451h0(m5078W1), this.f4332J) - this.f4337O.m5038b(m5451h0(m5079X1), this.f4332J)) + 1))) + (this.f4356u.mo5817m() - this.f4356u.mo5811g(m5079X1)));
            }
        }
        return 0;
    }

    /* renamed from: P2 */
    private int m4992P2(RecyclerView.C0871a0 c0871a0) {
        if (m5411J() != 0 && c0871a0.m5251b() != 0) {
            m5076T1();
            View m5079X1 = m5079X1(!m5093n2(), true);
            View m5078W1 = m5078W1(!m5093n2(), true);
            if (m5079X1 != null && m5078W1 != null) {
                if (!m5093n2()) {
                    return this.f4337O.m5038b(c0871a0.m5251b() - 1, this.f4332J) + 1;
                }
                int mo5808d = this.f4356u.mo5808d(m5078W1) - this.f4356u.mo5811g(m5079X1);
                int m5038b = this.f4337O.m5038b(m5451h0(m5079X1), this.f4332J);
                return (int) ((mo5808d / ((this.f4337O.m5038b(m5451h0(m5078W1), this.f4332J) - m5038b) + 1)) * (this.f4337O.m5038b(c0871a0.m5251b() - 1, this.f4332J) + 1));
            }
        }
        return 0;
    }

    /* renamed from: Q2 */
    private void m4993Q2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, LinearLayoutManager.C0866a c0866a, int i10) {
        boolean z10 = i10 == 1;
        int m4996V2 = m4996V2(c0896w, c0871a0, c0866a.f4366b);
        if (z10) {
            while (m4996V2 > 0) {
                int i11 = c0866a.f4366b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                c0866a.f4366b = i12;
                m4996V2 = m4996V2(c0896w, c0871a0, i12);
            }
            return;
        }
        int m5251b = c0871a0.m5251b() - 1;
        int i13 = c0866a.f4366b;
        while (i13 < m5251b) {
            int i14 = i13 + 1;
            int m4996V22 = m4996V2(c0896w, c0871a0, i14);
            if (m4996V22 <= m4996V2) {
                break;
            }
            i13 = i14;
            m4996V2 = m4996V22;
        }
        c0866a.f4366b = i13;
    }

    /* renamed from: R2 */
    private void m4994R2() {
        View[] viewArr = this.f4334L;
        if (viewArr == null || viewArr.length != this.f4332J) {
            this.f4334L = new View[this.f4332J];
        }
    }

    /* renamed from: U2 */
    private int m4995U2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, int i10) {
        if (!c0871a0.m5254e()) {
            return this.f4337O.m5038b(i10, this.f4332J);
        }
        int m5535f = c0896w.m5535f(i10);
        if (m5535f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.f4337O.m5038b(m5535f, this.f4332J);
    }

    /* renamed from: V2 */
    private int m4996V2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, int i10) {
        if (!c0871a0.m5254e()) {
            return this.f4337O.m5039c(i10, this.f4332J);
        }
        int i11 = this.f4336N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int m5535f = c0896w.m5535f(i10);
        if (m5535f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.f4337O.m5039c(m5535f, this.f4332J);
    }

    /* renamed from: W2 */
    private int m4997W2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, int i10) {
        if (!c0871a0.m5254e()) {
            return this.f4337O.mo5034f(i10);
        }
        int i11 = this.f4335M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int m5535f = c0896w.m5535f(i10);
        if (m5535f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.f4337O.mo5034f(m5535f);
    }

    /* renamed from: X2 */
    private void m4998X2(float f10, int i10) {
        m4988L2(Math.max(Math.round(f10 * this.f4332J), i10));
    }

    /* renamed from: Y2 */
    private void m4999Y2(View view, int i10, boolean z10) {
        int i11;
        int i12;
        C0863b c0863b = (C0863b) view.getLayoutParams();
        Rect rect = c0863b.f4567b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0863b).topMargin + ((ViewGroup.MarginLayoutParams) c0863b).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0863b).leftMargin + ((ViewGroup.MarginLayoutParams) c0863b).rightMargin;
        int m5014S2 = m5014S2(c0863b.f4340e, c0863b.f4341f);
        if (this.f4354s == 1) {
            i12 = RecyclerView.AbstractC0889p.m5383K(m5014S2, i10, i14, ((ViewGroup.MarginLayoutParams) c0863b).width, false);
            i11 = RecyclerView.AbstractC0889p.m5383K(this.f4356u.mo5818n(), m5430X(), i13, ((ViewGroup.MarginLayoutParams) c0863b).height, true);
        } else {
            int m5383K = RecyclerView.AbstractC0889p.m5383K(m5014S2, i10, i13, ((ViewGroup.MarginLayoutParams) c0863b).height, false);
            int m5383K2 = RecyclerView.AbstractC0889p.m5383K(this.f4356u.mo5818n(), m5467p0(), i14, ((ViewGroup.MarginLayoutParams) c0863b).width, true);
            i11 = m5383K;
            i12 = m5383K2;
        }
        m5000Z2(view, i12, i11, z10);
    }

    /* renamed from: Z2 */
    private void m5000Z2(View view, int i10, int i11, boolean z10) {
        boolean m5404F1;
        RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
        if (z10) {
            m5404F1 = m5409H1(view, i10, i11, c0890q);
        } else {
            m5404F1 = m5404F1(view, i10, i11, c0890q);
        }
        if (m5404F1) {
            view.measure(i10, i11);
        }
    }

    /* renamed from: b3 */
    private void m5001b3() {
        int m5429W;
        int m5448g0;
        if (m5091l2() == 1) {
            m5429W = m5465o0() - m5446f0();
            m5448g0 = m5444e0();
        } else {
            m5429W = m5429W() - m5442d0();
            m5448g0 = m5448g0();
        }
        m4988L2(m5429W - m5448g0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A2 */
    public void mo5002A2(boolean z10) {
        if (!z10) {
            super.mo5002A2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: C1 */
    public void mo5003C1(Rect rect, int i10, int i11) {
        int m5387n;
        int m5387n2;
        if (this.f4333K == null) {
            super.mo5003C1(rect, i10, i11);
        }
        int m5444e0 = m5444e0() + m5446f0();
        int m5448g0 = m5448g0() + m5442d0();
        if (this.f4354s == 1) {
            m5387n2 = RecyclerView.AbstractC0889p.m5387n(i11, rect.height() + m5448g0, m5437b0());
            int[] iArr = this.f4333K;
            m5387n = RecyclerView.AbstractC0889p.m5387n(i10, iArr[iArr.length - 1] + m5444e0, m5440c0());
        } else {
            m5387n = RecyclerView.AbstractC0889p.m5387n(i10, rect.width() + m5444e0, m5440c0());
            int[] iArr2 = this.f4333K;
            m5387n2 = RecyclerView.AbstractC0889p.m5387n(i11, iArr2[iArr2.length - 1] + m5448g0, m5437b0());
        }
        m5397B1(m5387n, m5387n2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: D */
    public RecyclerView.C0890q mo5004D() {
        if (this.f4354s == 0) {
            return new C0863b(-2, -1);
        }
        return new C0863b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: E */
    public RecyclerView.C0890q mo5005E(Context context, AttributeSet attributeSet) {
        return new C0863b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: F */
    public RecyclerView.C0890q mo5006F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0863b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0863b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo5007J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0896w r26, androidx.recyclerview.widget.RecyclerView.C0871a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5007J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: L1 */
    public boolean mo5008L1() {
        return this.f4349D == null && !this.f4331I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: N */
    public int mo5009N(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (this.f4354s == 1) {
            return this.f4332J;
        }
        if (c0871a0.m5251b() < 1) {
            return 0;
        }
        return m4995U2(c0896w, c0871a0, c0871a0.m5251b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N1 */
    void mo5010N1(RecyclerView.C0871a0 c0871a0, LinearLayoutManager.C0868c c0868c, RecyclerView.AbstractC0889p.c cVar) {
        int i10 = this.f4332J;
        for (int i11 = 0; i11 < this.f4332J && c0868c.m5117c(c0871a0) && i10 > 0; i11++) {
            int i12 = c0868c.f4377d;
            cVar.mo5490a(i12, Math.max(0, c0868c.f4380g));
            i10 -= this.f4337O.mo5034f(i12);
            c0868c.f4377d += c0868c.f4378e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: P0 */
    public void mo5011P0(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, View view, C0660c c0660c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0863b)) {
            super.m5419O0(view, c0660c);
            return;
        }
        C0863b c0863b = (C0863b) layoutParams;
        int m4995U2 = m4995U2(c0896w, c0871a0, c0863b.m5491a());
        if (this.f4354s == 0) {
            c0660c.m3538c0(C0660c.d.m3580a(c0863b.m5035e(), c0863b.m5036f(), m4995U2, 1, false, false));
        } else {
            c0660c.m3538c0(C0660c.d.m3580a(m4995U2, 1, c0863b.m5035e(), c0863b.m5036f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: R0 */
    public void mo5012R0(RecyclerView recyclerView, int i10, int i11) {
        this.f4337O.m5042h();
        this.f4337O.m5041g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: S0 */
    public void mo5013S0(RecyclerView recyclerView) {
        this.f4337O.m5042h();
        this.f4337O.m5041g();
    }

    /* renamed from: S2 */
    int m5014S2(int i10, int i11) {
        if (this.f4354s == 1 && m5092m2()) {
            int[] iArr = this.f4333K;
            int i12 = this.f4332J;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.f4333K;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: T0 */
    public void mo5015T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f4337O.m5042h();
        this.f4337O.m5041g();
    }

    /* renamed from: T2 */
    public int m5016T2() {
        return this.f4332J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: U0 */
    public void mo5017U0(RecyclerView recyclerView, int i10, int i11) {
        this.f4337O.m5042h();
        this.f4337O.m5041g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: W0 */
    public void mo5018W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f4337O.m5042h();
        this.f4337O.m5041g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: X0 */
    public void mo5019X0(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (c0871a0.m5254e()) {
            m4987K2();
        }
        super.mo5019X0(c0896w, c0871a0);
        m4990N2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: Y0 */
    public void mo5020Y0(RecyclerView.C0871a0 c0871a0) {
        super.mo5020Y0(c0871a0);
        this.f4331I = false;
    }

    /* renamed from: a3 */
    public void m5021a3(int i10) {
        if (i10 == this.f4332J) {
            return;
        }
        this.f4331I = true;
        if (i10 >= 1) {
            this.f4332J = i10;
            this.f4337O.m5042h();
            m5474t1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: f2 */
    View mo5022f2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, boolean z10, boolean z11) {
        int i10;
        int m5411J = m5411J();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = m5411J() - 1;
            i12 = -1;
        } else {
            i11 = m5411J;
            i10 = 0;
        }
        int m5251b = c0871a0.m5251b();
        m5076T1();
        int mo5817m = this.f4356u.mo5817m();
        int mo5813i = this.f4356u.mo5813i();
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View m5410I = m5410I(i10);
            int m5451h0 = m5451h0(m5410I);
            if (m5451h0 >= 0 && m5451h0 < m5251b && m4996V2(c0896w, c0871a0, m5451h0) == 0) {
                if (((RecyclerView.C0890q) m5410I.getLayoutParams()).m5493c()) {
                    if (view2 == null) {
                        view2 = m5410I;
                    }
                } else {
                    if (this.f4356u.mo5811g(m5410I) < mo5813i && this.f4356u.mo5808d(m5410I) >= mo5817m) {
                        return m5410I;
                    }
                    if (view == null) {
                        view = m5410I;
                    }
                }
            }
            i10 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: k0 */
    public int mo5023k0(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        if (this.f4354s == 0) {
            return this.f4332J;
        }
        if (c0871a0.m5251b() < 1) {
            return 0;
        }
        return m4995U2(c0896w, c0871a0, c0871a0.m5251b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: m */
    public boolean mo5024m(RecyclerView.C0890q c0890q) {
        return c0890q instanceof C0863b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f4371b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: o2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo5025o2(androidx.recyclerview.widget.RecyclerView.C0896w r18, androidx.recyclerview.widget.RecyclerView.C0871a0 r19, androidx.recyclerview.widget.LinearLayoutManager.C0868c r20, androidx.recyclerview.widget.LinearLayoutManager.C0867b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5025o2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: q2 */
    public void mo5026q2(RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0, LinearLayoutManager.C0866a c0866a, int i10) {
        super.mo5026q2(c0896w, c0871a0, c0866a, i10);
        m5001b3();
        if (c0871a0.m5251b() > 0 && !c0871a0.m5254e()) {
            m4993Q2(c0896w, c0871a0, c0866a, i10);
        }
        m4994R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: r */
    public int mo5027r(RecyclerView.C0871a0 c0871a0) {
        if (this.f4339Q) {
            return m4991O2(c0871a0);
        }
        return super.mo5027r(c0871a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: s */
    public int mo5028s(RecyclerView.C0871a0 c0871a0) {
        if (this.f4339Q) {
            return m4992P2(c0871a0);
        }
        return super.mo5028s(c0871a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: u */
    public int mo5029u(RecyclerView.C0871a0 c0871a0) {
        if (this.f4339Q) {
            return m4991O2(c0871a0);
        }
        return super.mo5029u(c0871a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: v */
    public int mo5030v(RecyclerView.C0871a0 c0871a0) {
        if (this.f4339Q) {
            return m4992P2(c0871a0);
        }
        return super.mo5030v(c0871a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: w1 */
    public int mo5031w1(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        m5001b3();
        m4994R2();
        return super.mo5031w1(i10, c0896w, c0871a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0889p
    /* renamed from: y1 */
    public int mo5032y1(int i10, RecyclerView.C0896w c0896w, RecyclerView.C0871a0 c0871a0) {
        m5001b3();
        m4994R2();
        return super.mo5032y1(i10, c0896w, c0871a0);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C0863b extends RecyclerView.C0890q {

        /* renamed from: e */
        int f4340e;

        /* renamed from: f */
        int f4341f;

        public C0863b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4340e = -1;
            this.f4341f = 0;
        }

        /* renamed from: e */
        public int m5035e() {
            return this.f4340e;
        }

        /* renamed from: f */
        public int m5036f() {
            return this.f4341f;
        }

        public C0863b(int i10, int i11) {
            super(i10, i11);
            this.f4340e = -1;
            this.f4341f = 0;
        }

        public C0863b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4340e = -1;
            this.f4341f = 0;
        }

        public C0863b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4340e = -1;
            this.f4341f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f4331I = false;
        this.f4332J = -1;
        this.f4335M = new SparseIntArray();
        this.f4336N = new SparseIntArray();
        this.f4337O = new C0862a();
        this.f4338P = new Rect();
        m5021a3(i10);
    }
}
