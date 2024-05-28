package p279w;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p279w.InterfaceC5061o0;

/* renamed from: w.u1 */
/* loaded from: classes.dex */
public class C5083u1 implements InterfaceC5061o0 {

    /* renamed from: A */
    protected static final Comparator<InterfaceC5061o0.a<?>> f19332A;

    /* renamed from: B */
    private static final C5083u1 f19333B;

    /* renamed from: z */
    protected final TreeMap<InterfaceC5061o0.a<?>, Map<InterfaceC5061o0.c, Object>> f19334z;

    static {
        C5080t1 c5080t1 = new Comparator() { // from class: w.t1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m19703K;
                m19703K = C5083u1.m19703K((InterfaceC5061o0.a) obj, (InterfaceC5061o0.a) obj2);
                return m19703K;
            }
        };
        f19332A = c5080t1;
        f19333B = new C5083u1(new TreeMap(c5080t1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5083u1(TreeMap<InterfaceC5061o0.a<?>, Map<InterfaceC5061o0.c, Object>> treeMap) {
        this.f19334z = treeMap;
    }

    /* renamed from: I */
    public static C5083u1 m19701I() {
        return f19333B;
    }

    /* renamed from: J */
    public static C5083u1 m19702J(InterfaceC5061o0 interfaceC5061o0) {
        if (C5083u1.class.equals(interfaceC5061o0.getClass())) {
            return (C5083u1) interfaceC5061o0;
        }
        TreeMap treeMap = new TreeMap(f19332A);
        for (InterfaceC5061o0.a<?> aVar : interfaceC5061o0.mo1367c()) {
            Set<InterfaceC5061o0.c> mo1379x = interfaceC5061o0.mo1379x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC5061o0.c cVar : mo1379x) {
                arrayMap.put(cVar, interfaceC5061o0.mo1376t(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C5083u1(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ int m19703K(InterfaceC5061o0.a aVar, InterfaceC5061o0.a aVar2) {
        return aVar.mo19483c().compareTo(aVar2.mo19483c());
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: a */
    public <ValueT> ValueT mo1365a(InterfaceC5061o0.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) mo1366b(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: b */
    public <ValueT> ValueT mo1366b(InterfaceC5061o0.a<ValueT> aVar) {
        Map<InterfaceC5061o0.c, Object> map = this.f19334z.get(aVar);
        if (map != null) {
            return (ValueT) map.get((InterfaceC5061o0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: c */
    public Set<InterfaceC5061o0.a<?>> mo1367c() {
        return Collections.unmodifiableSet(this.f19334z.keySet());
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: d */
    public InterfaceC5061o0.c mo1368d(InterfaceC5061o0.a<?> aVar) {
        Map<InterfaceC5061o0.c, Object> map = this.f19334z.get(aVar);
        if (map != null) {
            return (InterfaceC5061o0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: e */
    public boolean mo1369e(InterfaceC5061o0.a<?> aVar) {
        return this.f19334z.containsKey(aVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: t */
    public <ValueT> ValueT mo1376t(InterfaceC5061o0.a<ValueT> aVar, InterfaceC5061o0.c cVar) {
        Map<InterfaceC5061o0.c, Object> map = this.f19334z.get(aVar);
        if (map != null) {
            if (map.containsKey(cVar)) {
                return (ValueT) map.get(cVar);
            }
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: v */
    public void mo1377v(String str, InterfaceC5061o0.b bVar) {
        for (Map.Entry<InterfaceC5061o0.a<?>, Map<InterfaceC5061o0.c, Object>> entry : this.f19334z.tailMap(InterfaceC5061o0.a.m19653a(str, Void.class)).entrySet()) {
            if (!entry.getKey().mo19483c().startsWith(str) || !bVar.mo19348a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // p279w.InterfaceC5061o0
    /* renamed from: x */
    public Set<InterfaceC5061o0.c> mo1379x(InterfaceC5061o0.a<?> aVar) {
        Map<InterfaceC5061o0.c, Object> map = this.f19334z.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }
}
