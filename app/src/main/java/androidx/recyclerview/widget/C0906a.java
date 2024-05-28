package androidx.recyclerview.widget;

import androidx.core.util.C0652f;
import androidx.core.util.InterfaceC0651e;
import androidx.recyclerview.widget.C0913h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C0906a implements C0913h.a {

    /* renamed from: a */
    private InterfaceC0651e<b> f4656a;

    /* renamed from: b */
    final ArrayList<b> f4657b;

    /* renamed from: c */
    final ArrayList<b> f4658c;

    /* renamed from: d */
    final a f4659d;

    /* renamed from: e */
    Runnable f4660e;

    /* renamed from: f */
    final boolean f4661f;

    /* renamed from: g */
    final C0913h f4662g;

    /* renamed from: h */
    private int f4663h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo5316a(int i10, int i11);

        /* renamed from: b */
        void mo5317b(b bVar);

        /* renamed from: c */
        RecyclerView.AbstractC0877d0 mo5318c(int i10);

        /* renamed from: d */
        void mo5319d(int i10, int i11);

        /* renamed from: e */
        void mo5320e(int i10, int i11);

        /* renamed from: f */
        void mo5321f(int i10, int i11);

        /* renamed from: g */
        void mo5322g(b bVar);

        /* renamed from: h */
        void mo5323h(int i10, int i11, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        int f4664a;

        /* renamed from: b */
        int f4665b;

        /* renamed from: c */
        Object f4666c;

        /* renamed from: d */
        int f4667d;

        b(int i10, int i11, int i12, Object obj) {
            this.f4664a = i10;
            this.f4665b = i11;
            this.f4667d = i12;
            this.f4666c = obj;
        }

        /* renamed from: a */
        String m5707a() {
            int i10 = this.f4664a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4664a;
            if (i10 != bVar.f4664a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4667d - this.f4665b) == 1 && this.f4667d == bVar.f4665b && this.f4665b == bVar.f4667d) {
                return true;
            }
            if (this.f4667d != bVar.f4667d || this.f4665b != bVar.f4665b) {
                return false;
            }
            Object obj2 = this.f4666c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4666c)) {
                    return false;
                }
            } else if (bVar.f4666c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4664a * 31) + this.f4665b) * 31) + this.f4667d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m5707a() + ",s:" + this.f4665b + "c:" + this.f4667d + ",p:" + this.f4666c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0906a(a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m5685c(b bVar) {
        m5691r(bVar);
    }

    /* renamed from: d */
    private void m5686d(b bVar) {
        m5691r(bVar);
    }

    /* renamed from: f */
    private void m5687f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f4665b;
        int i11 = bVar.f4667d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f4659d.mo5318c(i12) != null || m5689h(i12)) {
                if (c11 == 0) {
                    m5690k(mo5694b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    m5691r(mo5694b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f4667d) {
            mo5693a(bVar);
            bVar = mo5694b(2, i10, i13, null);
        }
        if (c11 == 0) {
            m5690k(bVar);
        } else {
            m5691r(bVar);
        }
    }

    /* renamed from: g */
    private void m5688g(b bVar) {
        int i10 = bVar.f4665b;
        int i11 = bVar.f4667d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f4659d.mo5318c(i10) != null || m5689h(i10)) {
                if (c10 == 0) {
                    m5690k(mo5694b(4, i12, i13, bVar.f4666c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            } else {
                if (c10 == 1) {
                    m5691r(mo5694b(4, i12, i13, bVar.f4666c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f4667d) {
            Object obj = bVar.f4666c;
            mo5693a(bVar);
            bVar = mo5694b(4, i12, i13, obj);
        }
        if (c10 == 0) {
            m5690k(bVar);
        } else {
            m5691r(bVar);
        }
    }

    /* renamed from: h */
    private boolean m5689h(int i10) {
        int size = this.f4658c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4658c.get(i11);
            int i12 = bVar.f4664a;
            if (i12 == 8) {
                if (m5700n(bVar.f4667d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4665b;
                int i14 = bVar.f4667d + i13;
                while (i13 < i14) {
                    if (m5700n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m5690k(b bVar) {
        int i10;
        int i11 = bVar.f4664a;
        if (i11 != 1 && i11 != 8) {
            int m5692v = m5692v(bVar.f4665b, i11);
            int i12 = bVar.f4665b;
            int i13 = bVar.f4664a;
            if (i13 == 2) {
                i10 = 0;
            } else {
                if (i13 != 4) {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
                i10 = 1;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f4667d; i15++) {
                int m5692v2 = m5692v(bVar.f4665b + (i10 * i15), bVar.f4664a);
                int i16 = bVar.f4664a;
                if (i16 == 2 ? m5692v2 == m5692v : i16 == 4 && m5692v2 == m5692v + 1) {
                    i14++;
                } else {
                    b mo5694b = mo5694b(i16, m5692v, i14, bVar.f4666c);
                    m5698l(mo5694b, i12);
                    mo5693a(mo5694b);
                    if (bVar.f4664a == 4) {
                        i12 += i14;
                    }
                    m5692v = m5692v2;
                    i14 = 1;
                }
            }
            Object obj = bVar.f4666c;
            mo5693a(bVar);
            if (i14 > 0) {
                b mo5694b2 = mo5694b(bVar.f4664a, m5692v, i14, obj);
                m5698l(mo5694b2, i12);
                mo5693a(mo5694b2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: r */
    private void m5691r(b bVar) {
        this.f4658c.add(bVar);
        int i10 = bVar.f4664a;
        if (i10 == 1) {
            this.f4659d.mo5320e(bVar.f4665b, bVar.f4667d);
            return;
        }
        if (i10 == 2) {
            this.f4659d.mo5319d(bVar.f4665b, bVar.f4667d);
            return;
        }
        if (i10 == 4) {
            this.f4659d.mo5323h(bVar.f4665b, bVar.f4667d, bVar.f4666c);
        } else {
            if (i10 == 8) {
                this.f4659d.mo5316a(bVar.f4665b, bVar.f4667d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: v */
    private int m5692v(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f4658c.size() - 1; size >= 0; size--) {
            b bVar = this.f4658c.get(size);
            int i14 = bVar.f4664a;
            if (i14 == 8) {
                int i15 = bVar.f4665b;
                int i16 = bVar.f4667d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f4665b = i15 + 1;
                            bVar.f4667d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f4665b = i15 - 1;
                            bVar.f4667d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f4667d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f4667d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f4665b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f4665b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f4665b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f4667d;
                    } else if (i14 == 2) {
                        i10 += bVar.f4667d;
                    }
                } else if (i11 == 1) {
                    bVar.f4665b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f4665b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f4658c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4658c.get(size2);
            if (bVar2.f4664a == 8) {
                int i18 = bVar2.f4667d;
                if (i18 == bVar2.f4665b || i18 < 0) {
                    this.f4658c.remove(size2);
                    mo5693a(bVar2);
                }
            } else if (bVar2.f4667d <= 0) {
                this.f4658c.remove(size2);
                mo5693a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.C0913h.a
    /* renamed from: a */
    public void mo5693a(b bVar) {
        if (this.f4661f) {
            return;
        }
        bVar.f4666c = null;
        this.f4656a.mo3459a(bVar);
    }

    @Override // androidx.recyclerview.widget.C0913h.a
    /* renamed from: b */
    public b mo5694b(int i10, int i11, int i12, Object obj) {
        b mo3460b = this.f4656a.mo3460b();
        if (mo3460b == null) {
            return new b(i10, i11, i12, obj);
        }
        mo3460b.f4664a = i10;
        mo3460b.f4665b = i11;
        mo3460b.f4667d = i12;
        mo3460b.f4666c = obj;
        return mo3460b;
    }

    /* renamed from: e */
    public int m5695e(int i10) {
        int size = this.f4657b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4657b.get(i11);
            int i12 = bVar.f4664a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f4665b;
                    if (i13 <= i10) {
                        int i14 = bVar.f4667d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f4665b;
                    if (i15 == i10) {
                        i10 = bVar.f4667d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f4667d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f4665b <= i10) {
                i10 += bVar.f4667d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m5696i() {
        int size = this.f4658c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4659d.mo5317b(this.f4658c.get(i10));
        }
        m5705t(this.f4658c);
        this.f4663h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m5697j() {
        m5696i();
        int size = this.f4657b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4657b.get(i10);
            int i11 = bVar.f4664a;
            if (i11 == 1) {
                this.f4659d.mo5317b(bVar);
                this.f4659d.mo5320e(bVar.f4665b, bVar.f4667d);
            } else if (i11 == 2) {
                this.f4659d.mo5317b(bVar);
                this.f4659d.mo5321f(bVar.f4665b, bVar.f4667d);
            } else if (i11 == 4) {
                this.f4659d.mo5317b(bVar);
                this.f4659d.mo5323h(bVar.f4665b, bVar.f4667d, bVar.f4666c);
            } else if (i11 == 8) {
                this.f4659d.mo5317b(bVar);
                this.f4659d.mo5316a(bVar.f4665b, bVar.f4667d);
            }
            Runnable runnable = this.f4660e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m5705t(this.f4657b);
        this.f4663h = 0;
    }

    /* renamed from: l */
    void m5698l(b bVar, int i10) {
        this.f4659d.mo5322g(bVar);
        int i11 = bVar.f4664a;
        if (i11 == 2) {
            this.f4659d.mo5321f(i10, bVar.f4667d);
        } else {
            if (i11 == 4) {
                this.f4659d.mo5323h(i10, bVar.f4667d, bVar.f4666c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m5699m(int i10) {
        return m5700n(i10, 0);
    }

    /* renamed from: n */
    int m5700n(int i10, int i11) {
        int size = this.f4658c.size();
        while (i11 < size) {
            b bVar = this.f4658c.get(i11);
            int i12 = bVar.f4664a;
            if (i12 == 8) {
                int i13 = bVar.f4665b;
                if (i13 == i10) {
                    i10 = bVar.f4667d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4667d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4665b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4667d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4667d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m5701o(int i10) {
        return (i10 & this.f4663h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m5702p() {
        return this.f4657b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m5703q() {
        return (this.f4658c.isEmpty() || this.f4657b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m5704s() {
        this.f4662g.m5802b(this.f4657b);
        int size = this.f4657b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4657b.get(i10);
            int i11 = bVar.f4664a;
            if (i11 == 1) {
                m5685c(bVar);
            } else if (i11 == 2) {
                m5687f(bVar);
            } else if (i11 == 4) {
                m5688g(bVar);
            } else if (i11 == 8) {
                m5686d(bVar);
            }
            Runnable runnable = this.f4660e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4657b.clear();
    }

    /* renamed from: t */
    void m5705t(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mo5693a(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m5706u() {
        m5705t(this.f4657b);
        m5705t(this.f4658c);
        this.f4663h = 0;
    }

    C0906a(a aVar, boolean z10) {
        this.f4656a = new C0652f(30);
        this.f4657b = new ArrayList<>();
        this.f4658c = new ArrayList<>();
        this.f4663h = 0;
        this.f4659d = aVar;
        this.f4661f = z10;
        this.f4662g = new C0913h(this);
    }
}
