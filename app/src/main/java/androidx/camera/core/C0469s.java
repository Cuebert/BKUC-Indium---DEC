package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p279w.C5042j1;
import p279w.InterfaceC5017d0;

/* renamed from: androidx.camera.core.s */
/* loaded from: classes.dex */
public final class C0469s {

    /* renamed from: b */
    public static final C0469s f2080b = new a().m2223d(0).m2222b();

    /* renamed from: c */
    public static final C0469s f2081c = new a().m2223d(1).m2222b();

    /* renamed from: a */
    private LinkedHashSet<InterfaceC0461q> f2082a;

    C0469s(LinkedHashSet<InterfaceC0461q> linkedHashSet) {
        this.f2082a = linkedHashSet;
    }

    /* renamed from: a */
    public LinkedHashSet<InterfaceC5017d0> m2215a(LinkedHashSet<InterfaceC5017d0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC5017d0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo1450b());
        }
        List<InterfaceC0465r> m2216b = m2216b(arrayList);
        LinkedHashSet<InterfaceC5017d0> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC5017d0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC5017d0 next = it2.next();
            if (m2216b.contains(next.mo1450b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public List<InterfaceC0465r> m2216b(List<InterfaceC0465r> list) {
        List<InterfaceC0465r> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC0461q> it = this.f2082a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().mo2176b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public LinkedHashSet<InterfaceC0461q> m2217c() {
        return this.f2082a;
    }

    /* renamed from: d */
    public Integer m2218d() {
        Iterator<InterfaceC0461q> it = this.f2082a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0461q next = it.next();
            if (next instanceof C5042j1) {
                Integer valueOf = Integer.valueOf(((C5042j1) next).m19575c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: e */
    public InterfaceC5017d0 m2219e(LinkedHashSet<InterfaceC5017d0> linkedHashSet) {
        Iterator<InterfaceC5017d0> it = m2215a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: androidx.camera.core.s$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final LinkedHashSet<InterfaceC0461q> f2083a;

        public a() {
            this.f2083a = new LinkedHashSet<>();
        }

        /* renamed from: c */
        public static a m2220c(C0469s c0469s) {
            return new a(c0469s.m2217c());
        }

        /* renamed from: a */
        public a m2221a(InterfaceC0461q interfaceC0461q) {
            this.f2083a.add(interfaceC0461q);
            return this;
        }

        /* renamed from: b */
        public C0469s m2222b() {
            return new C0469s(this.f2083a);
        }

        /* renamed from: d */
        public a m2223d(int i10) {
            this.f2083a.add(new C5042j1(i10));
            return this;
        }

        private a(LinkedHashSet<InterfaceC0461q> linkedHashSet) {
            this.f2083a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
