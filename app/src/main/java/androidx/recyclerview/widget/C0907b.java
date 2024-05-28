package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C0907b {

    /* renamed from: a */
    final b f4668a;

    /* renamed from: b */
    final a f4669b = new a();

    /* renamed from: c */
    final List<View> f4670c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f4671a = 0;

        /* renamed from: b */
        a f4672b;

        a() {
        }

        /* renamed from: c */
        private void m5728c() {
            if (this.f4672b == null) {
                this.f4672b = new a();
            }
        }

        /* renamed from: a */
        void m5729a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f4672b;
                if (aVar != null) {
                    aVar.m5729a(i10 - 64);
                    return;
                }
                return;
            }
            this.f4671a &= ~(1 << i10);
        }

        /* renamed from: b */
        int m5730b(int i10) {
            a aVar = this.f4672b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f4671a);
                }
                return Long.bitCount(this.f4671a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f4671a & ((1 << i10) - 1));
            }
            return aVar.m5730b(i10 - 64) + Long.bitCount(this.f4671a);
        }

        /* renamed from: d */
        boolean m5731d(int i10) {
            if (i10 < 64) {
                return (this.f4671a & (1 << i10)) != 0;
            }
            m5728c();
            return this.f4672b.m5731d(i10 - 64);
        }

        /* renamed from: e */
        void m5732e(int i10, boolean z10) {
            if (i10 >= 64) {
                m5728c();
                this.f4672b.m5732e(i10 - 64, z10);
                return;
            }
            long j10 = this.f4671a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f4671a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                m5735h(i10);
            } else {
                m5729a(i10);
            }
            if (z11 || this.f4672b != null) {
                m5728c();
                this.f4672b.m5732e(0, z11);
            }
        }

        /* renamed from: f */
        boolean m5733f(int i10) {
            if (i10 >= 64) {
                m5728c();
                return this.f4672b.m5733f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4671a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f4671a = j12;
            long j13 = j10 - 1;
            this.f4671a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4672b;
            if (aVar != null) {
                if (aVar.m5731d(0)) {
                    m5735h(63);
                }
                this.f4672b.m5733f(0);
            }
            return z10;
        }

        /* renamed from: g */
        void m5734g() {
            this.f4671a = 0L;
            a aVar = this.f4672b;
            if (aVar != null) {
                aVar.m5734g();
            }
        }

        /* renamed from: h */
        void m5735h(int i10) {
            if (i10 >= 64) {
                m5728c();
                this.f4672b.m5735h(i10 - 64);
            } else {
                this.f4671a |= 1 << i10;
            }
        }

        public String toString() {
            if (this.f4672b == null) {
                return Long.toBinaryString(this.f4671a);
            }
            return this.f4672b.toString() + "xx" + Long.toBinaryString(this.f4671a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        View mo5305a(int i10);

        /* renamed from: b */
        void mo5306b(View view);

        /* renamed from: c */
        RecyclerView.AbstractC0877d0 mo5307c(View view);

        /* renamed from: d */
        void mo5308d(int i10);

        /* renamed from: e */
        void mo5309e(View view);

        /* renamed from: f */
        void mo5310f(View view, int i10);

        /* renamed from: g */
        int mo5311g();

        /* renamed from: h */
        void mo5312h(int i10);

        /* renamed from: i */
        void mo5313i();

        /* renamed from: j */
        void mo5314j(View view, int i10, ViewGroup.LayoutParams layoutParams);

        /* renamed from: k */
        int mo5315k(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0907b(b bVar) {
        this.f4668a = bVar;
    }

    /* renamed from: h */
    private int m5708h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int mo5311g = this.f4668a.mo5311g();
        int i11 = i10;
        while (i11 < mo5311g) {
            int m5730b = i10 - (i11 - this.f4669b.m5730b(i11));
            if (m5730b == 0) {
                while (this.f4669b.m5731d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += m5730b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m5709l(View view) {
        this.f4670c.add(view);
        this.f4668a.mo5306b(view);
    }

    /* renamed from: t */
    private boolean m5710t(View view) {
        if (!this.f4670c.remove(view)) {
            return false;
        }
        this.f4668a.mo5309e(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5711a(View view, int i10, boolean z10) {
        int m5708h;
        if (i10 < 0) {
            m5708h = this.f4668a.mo5311g();
        } else {
            m5708h = m5708h(i10);
        }
        this.f4669b.m5732e(m5708h, z10);
        if (z10) {
            m5709l(view);
        }
        this.f4668a.mo5310f(view, m5708h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5712b(View view, boolean z10) {
        m5711a(view, -1, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5713c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int m5708h;
        if (i10 < 0) {
            m5708h = this.f4668a.mo5311g();
        } else {
            m5708h = m5708h(i10);
        }
        this.f4669b.m5732e(m5708h, z10);
        if (z10) {
            m5709l(view);
        }
        this.f4668a.mo5314j(view, m5708h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5714d(int i10) {
        int m5708h = m5708h(i10);
        this.f4669b.m5733f(m5708h);
        this.f4668a.mo5308d(m5708h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m5715e(int i10) {
        int size = this.f4670c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4670c.get(i11);
            RecyclerView.AbstractC0877d0 mo5307c = this.f4668a.mo5307c(view);
            if (mo5307c.m5291m() == i10 && !mo5307c.m5298t() && !mo5307c.m5300v()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m5716f(int i10) {
        return this.f4668a.mo5305a(m5708h(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m5717g() {
        return this.f4668a.mo5311g() - this.f4670c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m5718i(int i10) {
        return this.f4668a.mo5305a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m5719j() {
        return this.f4668a.mo5311g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m5720k(View view) {
        int mo5315k = this.f4668a.mo5315k(view);
        if (mo5315k >= 0) {
            this.f4669b.m5735h(mo5315k);
            m5709l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m5721m(View view) {
        int mo5315k = this.f4668a.mo5315k(view);
        if (mo5315k == -1 || this.f4669b.m5731d(mo5315k)) {
            return -1;
        }
        return mo5315k - this.f4669b.m5730b(mo5315k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m5722n(View view) {
        return this.f4670c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m5723o() {
        this.f4669b.m5734g();
        for (int size = this.f4670c.size() - 1; size >= 0; size--) {
            this.f4668a.mo5309e(this.f4670c.get(size));
            this.f4670c.remove(size);
        }
        this.f4668a.mo5313i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m5724p(View view) {
        int mo5315k = this.f4668a.mo5315k(view);
        if (mo5315k < 0) {
            return;
        }
        if (this.f4669b.m5733f(mo5315k)) {
            m5710t(view);
        }
        this.f4668a.mo5312h(mo5315k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m5725q(int i10) {
        int m5708h = m5708h(i10);
        View mo5305a = this.f4668a.mo5305a(m5708h);
        if (mo5305a == null) {
            return;
        }
        if (this.f4669b.m5733f(m5708h)) {
            m5710t(mo5305a);
        }
        this.f4668a.mo5312h(m5708h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m5726r(View view) {
        int mo5315k = this.f4668a.mo5315k(view);
        if (mo5315k == -1) {
            m5710t(view);
            return true;
        }
        if (!this.f4669b.m5731d(mo5315k)) {
            return false;
        }
        this.f4669b.m5733f(mo5315k);
        m5710t(view);
        this.f4668a.mo5312h(mo5315k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m5727s(View view) {
        int mo5315k = this.f4668a.mo5315k(view);
        if (mo5315k >= 0) {
            if (this.f4669b.m5731d(mo5315k)) {
                this.f4669b.m5729a(mo5315k);
                m5710t(view);
                return;
            } else {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f4669b.toString() + ", hidden list:" + this.f4670c.size();
    }
}
