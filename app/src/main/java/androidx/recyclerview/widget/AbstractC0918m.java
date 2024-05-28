package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public abstract class AbstractC0918m extends RecyclerView.AbstractC0886m {

    /* renamed from: g */
    boolean f4803g = true;

    /* renamed from: A */
    public final void m5842A(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5850I(abstractC0877d0);
        m5358h(abstractC0877d0);
    }

    /* renamed from: B */
    public final void m5843B(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5851J(abstractC0877d0);
    }

    /* renamed from: C */
    public final void m5844C(RecyclerView.AbstractC0877d0 abstractC0877d0, boolean z10) {
        m5852K(abstractC0877d0, z10);
        m5358h(abstractC0877d0);
    }

    /* renamed from: D */
    public final void m5845D(RecyclerView.AbstractC0877d0 abstractC0877d0, boolean z10) {
        m5853L(abstractC0877d0, z10);
    }

    /* renamed from: E */
    public final void m5846E(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5854M(abstractC0877d0);
        m5358h(abstractC0877d0);
    }

    /* renamed from: F */
    public final void m5847F(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5855N(abstractC0877d0);
    }

    /* renamed from: G */
    public final void m5848G(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5856O(abstractC0877d0);
        m5358h(abstractC0877d0);
    }

    /* renamed from: H */
    public final void m5849H(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5857P(abstractC0877d0);
    }

    /* renamed from: I */
    public void m5850I(RecyclerView.AbstractC0877d0 abstractC0877d0) {
    }

    /* renamed from: J */
    public void m5851J(RecyclerView.AbstractC0877d0 abstractC0877d0) {
    }

    /* renamed from: K */
    public void m5852K(RecyclerView.AbstractC0877d0 abstractC0877d0, boolean z10) {
    }

    /* renamed from: L */
    public void m5853L(RecyclerView.AbstractC0877d0 abstractC0877d0, boolean z10) {
    }

    /* renamed from: M */
    public void m5854M(RecyclerView.AbstractC0877d0 abstractC0877d0) {
    }

    /* renamed from: N */
    public void m5855N(RecyclerView.AbstractC0877d0 abstractC0877d0) {
    }

    /* renamed from: O */
    public void m5856O(RecyclerView.AbstractC0877d0 abstractC0877d0) {
    }

    /* renamed from: P */
    public void m5857P(RecyclerView.AbstractC0877d0 abstractC0877d0) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: a */
    public boolean mo5352a(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2) {
        int i10;
        int i11;
        if (cVar != null && ((i10 = cVar.f4537a) != (i11 = cVar2.f4537a) || cVar.f4538b != cVar2.f4538b)) {
            return mo5748y(abstractC0877d0, i10, cVar.f4538b, i11, cVar2.f4538b);
        }
        return mo5746w(abstractC0877d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: b */
    public boolean mo5353b(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0877d0 abstractC0877d02, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f4537a;
        int i13 = cVar.f4538b;
        if (abstractC0877d02.m5277J()) {
            int i14 = cVar.f4537a;
            i11 = cVar.f4538b;
            i10 = i14;
        } else {
            i10 = cVar2.f4537a;
            i11 = cVar2.f4538b;
        }
        return mo5747x(abstractC0877d0, abstractC0877d02, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: c */
    public boolean mo5354c(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2) {
        int i10 = cVar.f4537a;
        int i11 = cVar.f4538b;
        View view = abstractC0877d0.f4502a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4537a;
        int top = cVar2 == null ? view.getTop() : cVar2.f4538b;
        if (!abstractC0877d0.m5300v() && (i10 != left || i11 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return mo5748y(abstractC0877d0, i10, i11, left, top);
        }
        return mo5749z(abstractC0877d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: d */
    public boolean mo5355d(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2) {
        int i10 = cVar.f4537a;
        int i11 = cVar2.f4537a;
        if (i10 == i11 && cVar.f4538b == cVar2.f4538b) {
            m5846E(abstractC0877d0);
            return false;
        }
        return mo5748y(abstractC0877d0, i10, cVar.f4538b, i11, cVar2.f4538b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0886m
    /* renamed from: f */
    public boolean mo5356f(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        return !this.f4803g || abstractC0877d0.m5298t();
    }

    /* renamed from: w */
    public abstract boolean mo5746w(RecyclerView.AbstractC0877d0 abstractC0877d0);

    /* renamed from: x */
    public abstract boolean mo5747x(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0877d0 abstractC0877d02, int i10, int i11, int i12, int i13);

    /* renamed from: y */
    public abstract boolean mo5748y(RecyclerView.AbstractC0877d0 abstractC0877d0, int i10, int i11, int i12, int i13);

    /* renamed from: z */
    public abstract boolean mo5749z(RecyclerView.AbstractC0877d0 abstractC0877d0);
}
