package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes.dex */
public abstract class AbstractC0919n extends RecyclerView.AbstractC0892s {

    /* renamed from: a */
    RecyclerView f4804a;

    /* renamed from: b */
    private Scroller f4805b;

    /* renamed from: c */
    private final RecyclerView.AbstractC0894u f4806c = new a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: classes.dex */
    class a extends RecyclerView.AbstractC0894u {

        /* renamed from: a */
        boolean f4807a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0894u
        /* renamed from: a */
        public void mo5501a(RecyclerView recyclerView, int i10) {
            super.mo5501a(recyclerView, i10);
            if (i10 == 0 && this.f4807a) {
                this.f4807a = false;
                AbstractC0919n.this.m5862j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0894u
        /* renamed from: b */
        public void mo5502b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f4807a = true;
        }
    }

    /* renamed from: e */
    private void m5858e() {
        this.f4804a.m5194X0(this.f4806c);
        this.f4804a.setOnFlingListener(null);
    }

    /* renamed from: h */
    private void m5859h() throws IllegalStateException {
        if (this.f4804a.getOnFlingListener() == null) {
            this.f4804a.m5212j(this.f4806c);
            this.f4804a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: i */
    private boolean m5860i(RecyclerView.AbstractC0889p abstractC0889p, int i10, int i11) {
        RecyclerView.AbstractC0899z mo5832d;
        int mo5834g;
        if (!(abstractC0889p instanceof RecyclerView.AbstractC0899z.b) || (mo5832d = mo5832d(abstractC0889p)) == null || (mo5834g = mo5834g(abstractC0889p, i10, i11)) == -1) {
            return false;
        }
        mo5832d.m5570p(mo5834g);
        abstractC0889p.m5412J1(mo5832d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0892s
    /* renamed from: a */
    public boolean mo5497a(int i10, int i11) {
        RecyclerView.AbstractC0889p layoutManager = this.f4804a.getLayoutManager();
        if (layoutManager == null || this.f4804a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4804a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && m5860i(layoutManager, i10, i11);
    }

    /* renamed from: b */
    public void m5861b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4804a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5858e();
        }
        this.f4804a = recyclerView;
        if (recyclerView != null) {
            m5859h();
            this.f4805b = new Scroller(this.f4804a.getContext(), new DecelerateInterpolator());
            m5862j();
        }
    }

    /* renamed from: c */
    public abstract int[] mo5831c(RecyclerView.AbstractC0889p abstractC0889p, View view);

    /* renamed from: d */
    protected abstract RecyclerView.AbstractC0899z mo5832d(RecyclerView.AbstractC0889p abstractC0889p);

    /* renamed from: f */
    public abstract View mo5833f(RecyclerView.AbstractC0889p abstractC0889p);

    /* renamed from: g */
    public abstract int mo5834g(RecyclerView.AbstractC0889p abstractC0889p, int i10, int i11);

    /* renamed from: j */
    void m5862j() {
        RecyclerView.AbstractC0889p layoutManager;
        View mo5833f;
        RecyclerView recyclerView = this.f4804a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo5833f = mo5833f(layoutManager)) == null) {
            return;
        }
        int[] mo5831c = mo5831c(layoutManager, mo5833f);
        if (mo5831c[0] == 0 && mo5831c[1] == 0) {
            return;
        }
        this.f4804a.m5216k1(mo5831c[0], mo5831c[1]);
    }
}
