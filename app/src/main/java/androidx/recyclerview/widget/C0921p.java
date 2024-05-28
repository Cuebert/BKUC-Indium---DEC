package androidx.recyclerview.widget;

import androidx.core.util.C0652f;
import androidx.core.util.InterfaceC0651e;
import androidx.recyclerview.widget.RecyclerView;
import p093h0.C3359d;
import p093h0.C3362g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public class C0921p {

    /* renamed from: a */
    final C3362g<RecyclerView.AbstractC0877d0, a> f4816a = new C3362g<>();

    /* renamed from: b */
    final C3359d<RecyclerView.AbstractC0877d0> f4817b = new C3359d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        static InterfaceC0651e<a> f4818d = new C0652f(20);

        /* renamed from: a */
        int f4819a;

        /* renamed from: b */
        RecyclerView.AbstractC0886m.c f4820b;

        /* renamed from: c */
        RecyclerView.AbstractC0886m.c f4821c;

        private a() {
        }

        /* renamed from: a */
        static void m5887a() {
            do {
            } while (f4818d.mo3460b() != null);
        }

        /* renamed from: b */
        static a m5888b() {
            a mo3460b = f4818d.mo3460b();
            return mo3460b == null ? new a() : mo3460b;
        }

        /* renamed from: c */
        static void m5889c(a aVar) {
            aVar.f4819a = 0;
            aVar.f4820b = null;
            aVar.f4821c = null;
            f4818d.mo3459a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo5263a(RecyclerView.AbstractC0877d0 abstractC0877d0);

        /* renamed from: b */
        void mo5264b(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2);

        /* renamed from: c */
        void mo5265c(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2);

        /* renamed from: d */
        void mo5266d(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar, RecyclerView.AbstractC0886m.c cVar2);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC0886m.c m5870l(RecyclerView.AbstractC0877d0 abstractC0877d0, int i10) {
        a m14844m;
        RecyclerView.AbstractC0886m.c cVar;
        int m14837f = this.f4816a.m14837f(abstractC0877d0);
        if (m14837f >= 0 && (m14844m = this.f4816a.m14844m(m14837f)) != null) {
            int i11 = m14844m.f4819a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                m14844m.f4819a = i12;
                if (i10 == 4) {
                    cVar = m14844m.f4820b;
                } else if (i10 == 8) {
                    cVar = m14844m.f4821c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f4816a.m14842k(m14837f);
                    a.m5889c(m14844m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5871a(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar) {
        a aVar = this.f4816a.get(abstractC0877d0);
        if (aVar == null) {
            aVar = a.m5888b();
            this.f4816a.put(abstractC0877d0, aVar);
        }
        aVar.f4819a |= 2;
        aVar.f4820b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5872b(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        a aVar = this.f4816a.get(abstractC0877d0);
        if (aVar == null) {
            aVar = a.m5888b();
            this.f4816a.put(abstractC0877d0, aVar);
        }
        aVar.f4819a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5873c(long j10, RecyclerView.AbstractC0877d0 abstractC0877d0) {
        this.f4817b.m14809n(j10, abstractC0877d0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5874d(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar) {
        a aVar = this.f4816a.get(abstractC0877d0);
        if (aVar == null) {
            aVar = a.m5888b();
            this.f4816a.put(abstractC0877d0, aVar);
        }
        aVar.f4821c = cVar;
        aVar.f4819a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5875e(RecyclerView.AbstractC0877d0 abstractC0877d0, RecyclerView.AbstractC0886m.c cVar) {
        a aVar = this.f4816a.get(abstractC0877d0);
        if (aVar == null) {
            aVar = a.m5888b();
            this.f4816a.put(abstractC0877d0, aVar);
        }
        aVar.f4820b = cVar;
        aVar.f4819a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5876f() {
        this.f4816a.clear();
        this.f4817b.m14803d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC0877d0 m5877g(long j10) {
        return this.f4817b.m14805h(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m5878h(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        a aVar = this.f4816a.get(abstractC0877d0);
        return (aVar == null || (aVar.f4819a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m5879i(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        a aVar = this.f4816a.get(abstractC0877d0);
        return (aVar == null || (aVar.f4819a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m5880j() {
        a.m5887a();
    }

    /* renamed from: k */
    public void m5881k(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        m5885p(abstractC0877d0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC0886m.c m5882m(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        return m5870l(abstractC0877d0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC0886m.c m5883n(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        return m5870l(abstractC0877d0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m5884o(b bVar) {
        for (int size = this.f4816a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0877d0 m14840i = this.f4816a.m14840i(size);
            a m14842k = this.f4816a.m14842k(size);
            int i10 = m14842k.f4819a;
            if ((i10 & 3) == 3) {
                bVar.mo5263a(m14840i);
            } else if ((i10 & 1) != 0) {
                RecyclerView.AbstractC0886m.c cVar = m14842k.f4820b;
                if (cVar == null) {
                    bVar.mo5263a(m14840i);
                } else {
                    bVar.mo5265c(m14840i, cVar, m14842k.f4821c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.mo5264b(m14840i, m14842k.f4820b, m14842k.f4821c);
            } else if ((i10 & 12) == 12) {
                bVar.mo5266d(m14840i, m14842k.f4820b, m14842k.f4821c);
            } else if ((i10 & 4) != 0) {
                bVar.mo5265c(m14840i, m14842k.f4820b, null);
            } else if ((i10 & 8) != 0) {
                bVar.mo5264b(m14840i, m14842k.f4820b, m14842k.f4821c);
            }
            a.m5889c(m14842k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m5885p(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        a aVar = this.f4816a.get(abstractC0877d0);
        if (aVar == null) {
            return;
        }
        aVar.f4819a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m5886q(RecyclerView.AbstractC0877d0 abstractC0877d0) {
        int m14812q = this.f4817b.m14812q() - 1;
        while (true) {
            if (m14812q < 0) {
                break;
            }
            if (abstractC0877d0 == this.f4817b.m14813r(m14812q)) {
                this.f4817b.m14811p(m14812q);
                break;
            }
            m14812q--;
        }
        a remove = this.f4816a.remove(abstractC0877d0);
        if (remove != null) {
            a.m5889c(remove);
        }
    }
}
