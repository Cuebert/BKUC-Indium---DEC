package p126j5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j5.p */
/* loaded from: classes.dex */
public class C3630p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j5.p$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final C3617d<?> f15296a;

        /* renamed from: b */
        private final Set<b> f15297b = new HashSet();

        /* renamed from: c */
        private final Set<b> f15298c = new HashSet();

        b(C3617d<?> c3617d) {
            this.f15296a = c3617d;
        }

        /* renamed from: a */
        void m15519a(b bVar) {
            this.f15297b.add(bVar);
        }

        /* renamed from: b */
        void m15520b(b bVar) {
            this.f15298c.add(bVar);
        }

        /* renamed from: c */
        C3617d<?> m15521c() {
            return this.f15296a;
        }

        /* renamed from: d */
        Set<b> m15522d() {
            return this.f15297b;
        }

        /* renamed from: e */
        boolean m15523e() {
            return this.f15297b.isEmpty();
        }

        /* renamed from: f */
        boolean m15524f() {
            return this.f15298c.isEmpty();
        }

        /* renamed from: g */
        void m15525g(b bVar) {
            this.f15298c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j5.p$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        private final Class<?> f15299a;

        /* renamed from: b */
        private final boolean f15300b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f15299a.equals(this.f15299a) && cVar.f15300b == this.f15300b;
        }

        public int hashCode() {
            return ((this.f15299a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f15300b).hashCode();
        }

        private c(Class<?> cls, boolean z10) {
            this.f15299a = cls;
            this.f15300b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15516a(List<C3617d<?>> list) {
        Set<b> m15518c = m15518c(list);
        Set<b> m15517b = m15517b(m15518c);
        int i10 = 0;
        while (!m15517b.isEmpty()) {
            b next = m15517b.iterator().next();
            m15517b.remove(next);
            i10++;
            for (b bVar : next.m15522d()) {
                bVar.m15525g(next);
                if (bVar.m15524f()) {
                    m15517b.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : m15518c) {
            if (!bVar2.m15524f() && !bVar2.m15523e()) {
                arrayList.add(bVar2.m15521c());
            }
        }
        throw new C3632r(arrayList);
    }

    /* renamed from: b */
    private static Set<b> m15517b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m15524f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<b> m15518c(List<C3617d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C3617d<?>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C3617d<?> next = it.next();
                b bVar = new b(next);
                for (Class<? super Object> cls : next.m15471g()) {
                    c cVar = new c(cls, !next.m15475m());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !cVar.f15300b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(bVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar2 : (Set) it2.next()) {
                        for (C3631q c3631q : bVar2.m15521c().m15469e()) {
                            if (c3631q.m15534d() && (set = (Set) hashMap.get(new c(c3631q.m15532b(), c3631q.m15536f()))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.m15519a(bVar3);
                                    bVar3.m15520b(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }
}
