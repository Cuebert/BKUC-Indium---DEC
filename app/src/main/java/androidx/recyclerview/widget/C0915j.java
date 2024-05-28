package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0915j extends AbstractC0919n {

    /* renamed from: d */
    private AbstractC0914i f4796d;

    /* renamed from: e */
    private AbstractC0914i f4797e;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    class a extends C0912g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0912g, androidx.recyclerview.widget.RecyclerView.AbstractC0899z
        /* renamed from: o */
        protected void mo5569o(View view, RecyclerView.C0871a0 c0871a0, RecyclerView.AbstractC0899z.a aVar) {
            C0915j c0915j = C0915j.this;
            int[] mo5831c = c0915j.mo5831c(c0915j.f4804a.getLayoutManager(), view);
            int i10 = mo5831c[0];
            int i11 = mo5831c[1];
            int m5796w = m5796w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m5796w > 0) {
                aVar.m5577d(i10, i11, m5796w, this.f4785j);
            }
        }

        @Override // androidx.recyclerview.widget.C0912g
        /* renamed from: v */
        protected float mo5795v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0912g
        /* renamed from: x */
        public int mo5797x(int i10) {
            return Math.min(100, super.mo5797x(i10));
        }
    }

    /* renamed from: k */
    private int m5824k(View view, AbstractC0914i abstractC0914i) {
        return (abstractC0914i.mo5811g(view) + (abstractC0914i.mo5809e(view) / 2)) - (abstractC0914i.mo5817m() + (abstractC0914i.mo5818n() / 2));
    }

    /* renamed from: l */
    private View m5825l(RecyclerView.AbstractC0889p abstractC0889p, AbstractC0914i abstractC0914i) {
        int m5411J = abstractC0889p.m5411J();
        View view = null;
        if (m5411J == 0) {
            return null;
        }
        int mo5817m = abstractC0914i.mo5817m() + (abstractC0914i.mo5818n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < m5411J; i11++) {
            View m5410I = abstractC0889p.m5410I(i11);
            int abs = Math.abs((abstractC0914i.mo5811g(m5410I) + (abstractC0914i.mo5809e(m5410I) / 2)) - mo5817m);
            if (abs < i10) {
                view = m5410I;
                i10 = abs;
            }
        }
        return view;
    }

    /* renamed from: m */
    private AbstractC0914i m5826m(RecyclerView.AbstractC0889p abstractC0889p) {
        AbstractC0914i abstractC0914i = this.f4797e;
        if (abstractC0914i == null || abstractC0914i.f4793a != abstractC0889p) {
            this.f4797e = AbstractC0914i.m5805a(abstractC0889p);
        }
        return this.f4797e;
    }

    /* renamed from: n */
    private AbstractC0914i m5827n(RecyclerView.AbstractC0889p abstractC0889p) {
        if (abstractC0889p.mo5090l()) {
            return m5828o(abstractC0889p);
        }
        if (abstractC0889p.mo5088k()) {
            return m5826m(abstractC0889p);
        }
        return null;
    }

    /* renamed from: o */
    private AbstractC0914i m5828o(RecyclerView.AbstractC0889p abstractC0889p) {
        AbstractC0914i abstractC0914i = this.f4796d;
        if (abstractC0914i == null || abstractC0914i.f4793a != abstractC0889p) {
            this.f4796d = AbstractC0914i.m5807c(abstractC0889p);
        }
        return this.f4796d;
    }

    /* renamed from: p */
    private boolean m5829p(RecyclerView.AbstractC0889p abstractC0889p, int i10, int i11) {
        return abstractC0889p.mo5088k() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    private boolean m5830q(RecyclerView.AbstractC0889p abstractC0889p) {
        PointF mo5081a;
        int m5431Y = abstractC0889p.m5431Y();
        if (!(abstractC0889p instanceof RecyclerView.AbstractC0899z.b) || (mo5081a = ((RecyclerView.AbstractC0899z.b) abstractC0889p).mo5081a(m5431Y - 1)) == null) {
            return false;
        }
        return mo5081a.x < 0.0f || mo5081a.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC0919n
    /* renamed from: c */
    public int[] mo5831c(RecyclerView.AbstractC0889p abstractC0889p, View view) {
        int[] iArr = new int[2];
        if (abstractC0889p.mo5088k()) {
            iArr[0] = m5824k(view, m5826m(abstractC0889p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0889p.mo5090l()) {
            iArr[1] = m5824k(view, m5828o(abstractC0889p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0919n
    /* renamed from: d */
    protected RecyclerView.AbstractC0899z mo5832d(RecyclerView.AbstractC0889p abstractC0889p) {
        if (abstractC0889p instanceof RecyclerView.AbstractC0899z.b) {
            return new a(this.f4804a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0919n
    /* renamed from: f */
    public View mo5833f(RecyclerView.AbstractC0889p abstractC0889p) {
        if (abstractC0889p.mo5090l()) {
            return m5825l(abstractC0889p, m5828o(abstractC0889p));
        }
        if (abstractC0889p.mo5088k()) {
            return m5825l(abstractC0889p, m5826m(abstractC0889p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0919n
    /* renamed from: g */
    public int mo5834g(RecyclerView.AbstractC0889p abstractC0889p, int i10, int i11) {
        AbstractC0914i m5827n;
        int m5431Y = abstractC0889p.m5431Y();
        if (m5431Y == 0 || (m5827n = m5827n(abstractC0889p)) == null) {
            return -1;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int m5411J = abstractC0889p.m5411J();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < m5411J; i14++) {
            View m5410I = abstractC0889p.m5410I(i14);
            if (m5410I != null) {
                int m5824k = m5824k(m5410I, m5827n);
                if (m5824k <= 0 && m5824k > i12) {
                    view2 = m5410I;
                    i12 = m5824k;
                }
                if (m5824k >= 0 && m5824k < i13) {
                    view = m5410I;
                    i13 = m5824k;
                }
            }
        }
        boolean m5829p = m5829p(abstractC0889p, i10, i11);
        if (m5829p && view != null) {
            return abstractC0889p.m5451h0(view);
        }
        if (!m5829p && view2 != null) {
            return abstractC0889p.m5451h0(view2);
        }
        if (m5829p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m5451h0 = abstractC0889p.m5451h0(view) + (m5830q(abstractC0889p) == m5829p ? -1 : 1);
        if (m5451h0 < 0 || m5451h0 >= m5431Y) {
            return -1;
        }
        return m5451h0;
    }
}
