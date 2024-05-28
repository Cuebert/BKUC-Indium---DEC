package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
class C0911f {

    /* renamed from: b */
    int f4776b;

    /* renamed from: c */
    int f4777c;

    /* renamed from: d */
    int f4778d;

    /* renamed from: e */
    int f4779e;

    /* renamed from: h */
    boolean f4782h;

    /* renamed from: i */
    boolean f4783i;

    /* renamed from: a */
    boolean f4775a = true;

    /* renamed from: f */
    int f4780f = 0;

    /* renamed from: g */
    int f4781g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m5786a(RecyclerView.C0871a0 c0871a0) {
        int i10 = this.f4777c;
        return i10 >= 0 && i10 < c0871a0.m5251b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public View m5787b(RecyclerView.C0896w c0896w) {
        View m5544o = c0896w.m5544o(this.f4777c);
        this.f4777c += this.f4778d;
        return m5544o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4776b + ", mCurrentPosition=" + this.f4777c + ", mItemDirection=" + this.f4778d + ", mLayoutDirection=" + this.f4779e + ", mStartLine=" + this.f4780f + ", mEndLine=" + this.f4781g + '}';
    }
}
