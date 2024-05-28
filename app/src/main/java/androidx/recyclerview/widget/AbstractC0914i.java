package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public abstract class AbstractC0914i {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0889p f4793a;

    /* renamed from: b */
    private int f4794b;

    /* renamed from: c */
    final Rect f4795c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0914i {
        a(RecyclerView.AbstractC0889p abstractC0889p) {
            super(abstractC0889p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: d */
        public int mo5808d(View view) {
            return this.f4793a.m5425T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0890q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: e */
        public int mo5809e(View view) {
            RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
            return this.f4793a.m5424S(view) + ((ViewGroup.MarginLayoutParams) c0890q).leftMargin + ((ViewGroup.MarginLayoutParams) c0890q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: f */
        public int mo5810f(View view) {
            RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
            return this.f4793a.m5423R(view) + ((ViewGroup.MarginLayoutParams) c0890q).topMargin + ((ViewGroup.MarginLayoutParams) c0890q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: g */
        public int mo5811g(View view) {
            return this.f4793a.m5421Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0890q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: h */
        public int mo5812h() {
            return this.f4793a.m5465o0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: i */
        public int mo5813i() {
            return this.f4793a.m5465o0() - this.f4793a.m5446f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: j */
        public int mo5814j() {
            return this.f4793a.m5446f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: k */
        public int mo5815k() {
            return this.f4793a.m5467p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: l */
        public int mo5816l() {
            return this.f4793a.m5430X();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: m */
        public int mo5817m() {
            return this.f4793a.m5444e0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: n */
        public int mo5818n() {
            return (this.f4793a.m5465o0() - this.f4793a.m5444e0()) - this.f4793a.m5446f0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: p */
        public int mo5820p(View view) {
            this.f4793a.m5463n0(view, true, this.f4795c);
            return this.f4795c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: q */
        public int mo5821q(View view) {
            this.f4793a.m5463n0(view, true, this.f4795c);
            return this.f4795c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: r */
        public void mo5822r(int i10) {
            this.f4793a.mo5398C0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC0914i {
        b(RecyclerView.AbstractC0889p abstractC0889p) {
            super(abstractC0889p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: d */
        public int mo5808d(View view) {
            return this.f4793a.m5418O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0890q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: e */
        public int mo5809e(View view) {
            RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
            return this.f4793a.m5423R(view) + ((ViewGroup.MarginLayoutParams) c0890q).topMargin + ((ViewGroup.MarginLayoutParams) c0890q).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: f */
        public int mo5810f(View view) {
            RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
            return this.f4793a.m5424S(view) + ((ViewGroup.MarginLayoutParams) c0890q).leftMargin + ((ViewGroup.MarginLayoutParams) c0890q).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: g */
        public int mo5811g(View view) {
            return this.f4793a.m5426U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0890q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: h */
        public int mo5812h() {
            return this.f4793a.m5429W();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: i */
        public int mo5813i() {
            return this.f4793a.m5429W() - this.f4793a.m5442d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: j */
        public int mo5814j() {
            return this.f4793a.m5442d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: k */
        public int mo5815k() {
            return this.f4793a.m5430X();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: l */
        public int mo5816l() {
            return this.f4793a.m5467p0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: m */
        public int mo5817m() {
            return this.f4793a.m5448g0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: n */
        public int mo5818n() {
            return (this.f4793a.m5429W() - this.f4793a.m5448g0()) - this.f4793a.m5442d0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: p */
        public int mo5820p(View view) {
            this.f4793a.m5463n0(view, true, this.f4795c);
            return this.f4795c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: q */
        public int mo5821q(View view) {
            this.f4793a.m5463n0(view, true, this.f4795c);
            return this.f4795c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0914i
        /* renamed from: r */
        public void mo5822r(int i10) {
            this.f4793a.mo5399D0(i10);
        }
    }

    /* synthetic */ AbstractC0914i(RecyclerView.AbstractC0889p abstractC0889p, a aVar) {
        this(abstractC0889p);
    }

    /* renamed from: a */
    public static AbstractC0914i m5805a(RecyclerView.AbstractC0889p abstractC0889p) {
        return new a(abstractC0889p);
    }

    /* renamed from: b */
    public static AbstractC0914i m5806b(RecyclerView.AbstractC0889p abstractC0889p, int i10) {
        if (i10 == 0) {
            return m5805a(abstractC0889p);
        }
        if (i10 == 1) {
            return m5807c(abstractC0889p);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC0914i m5807c(RecyclerView.AbstractC0889p abstractC0889p) {
        return new b(abstractC0889p);
    }

    /* renamed from: d */
    public abstract int mo5808d(View view);

    /* renamed from: e */
    public abstract int mo5809e(View view);

    /* renamed from: f */
    public abstract int mo5810f(View view);

    /* renamed from: g */
    public abstract int mo5811g(View view);

    /* renamed from: h */
    public abstract int mo5812h();

    /* renamed from: i */
    public abstract int mo5813i();

    /* renamed from: j */
    public abstract int mo5814j();

    /* renamed from: k */
    public abstract int mo5815k();

    /* renamed from: l */
    public abstract int mo5816l();

    /* renamed from: m */
    public abstract int mo5817m();

    /* renamed from: n */
    public abstract int mo5818n();

    /* renamed from: o */
    public int m5819o() {
        if (Integer.MIN_VALUE == this.f4794b) {
            return 0;
        }
        return mo5818n() - this.f4794b;
    }

    /* renamed from: p */
    public abstract int mo5820p(View view);

    /* renamed from: q */
    public abstract int mo5821q(View view);

    /* renamed from: r */
    public abstract void mo5822r(int i10);

    /* renamed from: s */
    public void m5823s() {
        this.f4794b = mo5818n();
    }

    private AbstractC0914i(RecyclerView.AbstractC0889p abstractC0889p) {
        this.f4794b = Integer.MIN_VALUE;
        this.f4795c = new Rect();
        this.f4793a = abstractC0889p;
    }
}
