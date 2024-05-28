package p206q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p279w.AbstractC5062o1;
import p279w.C5045k0;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C4290c extends AbstractC5062o1<AbstractC4289b> {

    /* renamed from: q.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<AbstractC4289b> f17511a = new ArrayList();

        a(List<AbstractC4289b> list) {
            Iterator<AbstractC4289b> it = list.iterator();
            while (it.hasNext()) {
                this.f17511a.add(it.next());
            }
        }

        /* renamed from: a */
        public List<C5045k0> m17783a() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC4289b> it = this.f17511a.iterator();
            while (it.hasNext()) {
                C5045k0 m17776a = it.next().m17776a();
                if (m17776a != null) {
                    arrayList.add(m17776a);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public List<C5045k0> m17784b() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC4289b> it = this.f17511a.iterator();
            while (it.hasNext()) {
                C5045k0 m17777b = it.next().m17777b();
                if (m17777b != null) {
                    arrayList.add(m17777b);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public List<C5045k0> m17785c() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC4289b> it = this.f17511a.iterator();
            while (it.hasNext()) {
                C5045k0 m17778c = it.next().m17778c();
                if (m17778c != null) {
                    arrayList.add(m17778c);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public List<C5045k0> m17786d() {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC4289b> it = this.f17511a.iterator();
            while (it.hasNext()) {
                C5045k0 m17779d = it.next().m17779d();
                if (m17779d != null) {
                    arrayList.add(m17779d);
                }
            }
            return arrayList;
        }
    }

    public C4290c(AbstractC4289b... abstractC4289bArr) {
        m19655a(Arrays.asList(abstractC4289bArr));
    }

    /* renamed from: e */
    public static C4290c m17780e() {
        return new C4290c(new AbstractC4289b[0]);
    }

    @Override // p279w.AbstractC5062o1
    /* renamed from: b */
    public AbstractC5062o1<AbstractC4289b> clone() {
        C4290c m17780e = m17780e();
        m17780e.m19655a(m19656c());
        return m17780e;
    }

    /* renamed from: d */
    public a m17782d() {
        return new a(m19656c());
    }
}
