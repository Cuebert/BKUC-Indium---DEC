package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public class C0912g extends RecyclerView.AbstractC0899z {

    /* renamed from: k */
    protected PointF f4786k;

    /* renamed from: l */
    private final DisplayMetrics f4787l;

    /* renamed from: n */
    private float f4789n;

    /* renamed from: i */
    protected final LinearInterpolator f4784i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4785j = new DecelerateInterpolator();

    /* renamed from: m */
    private boolean f4788m = false;

    /* renamed from: o */
    protected int f4790o = 0;

    /* renamed from: p */
    protected int f4791p = 0;

    public C0912g(Context context) {
        this.f4787l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m5788A() {
        if (!this.f4788m) {
            this.f4789n = mo5795v(this.f4787l);
            this.f4788m = true;
        }
        return this.f4789n;
    }

    /* renamed from: y */
    private int m5789y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    /* renamed from: B */
    protected int m5790B() {
        PointF pointF = this.f4786k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    protected void m5791C(RecyclerView.AbstractC0899z.a aVar) {
        PointF m5555a = m5555a(m5560f());
        if (m5555a != null && (m5555a.x != 0.0f || m5555a.y != 0.0f)) {
            m5563i(m5555a);
            this.f4786k = m5555a;
            this.f4790o = (int) (m5555a.x * 10000.0f);
            this.f4791p = (int) (m5555a.y * 10000.0f);
            aVar.m5577d((int) (this.f4790o * 1.2f), (int) (this.f4791p * 1.2f), (int) (mo5797x(10000) * 1.2f), this.f4784i);
            return;
        }
        aVar.m5575b(m5560f());
        m5572r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0899z
    /* renamed from: l */
    protected void mo5566l(int i10, int i11, RecyclerView.C0871a0 c0871a0, RecyclerView.AbstractC0899z.a aVar) {
        if (m5557c() == 0) {
            m5572r();
            return;
        }
        this.f4790o = m5789y(this.f4790o, i10);
        int m5789y = m5789y(this.f4791p, i11);
        this.f4791p = m5789y;
        if (this.f4790o == 0 && m5789y == 0) {
            m5791C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0899z
    /* renamed from: m */
    protected void mo5567m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0899z
    /* renamed from: n */
    protected void mo5568n() {
        this.f4791p = 0;
        this.f4790o = 0;
        this.f4786k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0899z
    /* renamed from: o */
    protected void mo5569o(View view, RecyclerView.C0871a0 c0871a0, RecyclerView.AbstractC0899z.a aVar) {
        int m5793t = m5793t(view, m5798z());
        int m5794u = m5794u(view, m5790B());
        int m5796w = m5796w((int) Math.sqrt((m5793t * m5793t) + (m5794u * m5794u)));
        if (m5796w > 0) {
            aVar.m5577d(-m5793t, -m5794u, m5796w, this.f4785j);
        }
    }

    /* renamed from: s */
    public int m5792s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    /* renamed from: t */
    public int m5793t(View view, int i10) {
        RecyclerView.AbstractC0889p m5559e = m5559e();
        if (m5559e == null || !m5559e.mo5088k()) {
            return 0;
        }
        RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
        return m5792s(m5559e.m5421Q(view) - ((ViewGroup.MarginLayoutParams) c0890q).leftMargin, m5559e.m5425T(view) + ((ViewGroup.MarginLayoutParams) c0890q).rightMargin, m5559e.m5444e0(), m5559e.m5465o0() - m5559e.m5446f0(), i10);
    }

    /* renamed from: u */
    public int m5794u(View view, int i10) {
        RecyclerView.AbstractC0889p m5559e = m5559e();
        if (m5559e == null || !m5559e.mo5090l()) {
            return 0;
        }
        RecyclerView.C0890q c0890q = (RecyclerView.C0890q) view.getLayoutParams();
        return m5792s(m5559e.m5426U(view) - ((ViewGroup.MarginLayoutParams) c0890q).topMargin, m5559e.m5418O(view) + ((ViewGroup.MarginLayoutParams) c0890q).bottomMargin, m5559e.m5448g0(), m5559e.m5429W() - m5559e.m5442d0(), i10);
    }

    /* renamed from: v */
    protected float mo5795v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public int m5796w(int i10) {
        return (int) Math.ceil(mo5797x(i10) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public int mo5797x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * m5788A());
    }

    /* renamed from: z */
    protected int m5798z() {
        PointF pointF = this.f4786k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
