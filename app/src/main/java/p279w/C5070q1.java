package p279w;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p279w.InterfaceC5061o0;

/* renamed from: w.q1 */
/* loaded from: classes.dex */
public final class C5070q1 extends C5083u1 implements InterfaceC5066p1 {

    /* renamed from: C */
    private static final InterfaceC5061o0.c f19294C = InterfaceC5061o0.c.OPTIONAL;

    private C5070q1(TreeMap<InterfaceC5061o0.a<?>, Map<InterfaceC5061o0.c, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: L */
    public static C5070q1 m19660L() {
        return new C5070q1(new TreeMap(C5083u1.f19332A));
    }

    /* renamed from: M */
    public static C5070q1 m19661M(InterfaceC5061o0 interfaceC5061o0) {
        TreeMap treeMap = new TreeMap(C5083u1.f19332A);
        for (InterfaceC5061o0.a<?> aVar : interfaceC5061o0.mo1367c()) {
            Set<InterfaceC5061o0.c> mo1379x = interfaceC5061o0.mo1379x(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC5061o0.c cVar : mo1379x) {
                arrayMap.put(cVar, interfaceC5061o0.mo1376t(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C5070q1(treeMap);
    }

    @Override // p279w.InterfaceC5066p1
    /* renamed from: G */
    public <ValueT> void mo19658G(InterfaceC5061o0.a<ValueT> aVar, InterfaceC5061o0.c cVar, ValueT valuet) {
        Map<InterfaceC5061o0.c, Object> map = this.f19334z.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f19334z.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        InterfaceC5061o0.c cVar2 = (InterfaceC5061o0.c) Collections.min(map.keySet());
        if (!Objects.equals(map.get(cVar2), valuet) && C5057n0.m19630a(cVar2, cVar)) {
            throw new IllegalArgumentException("Option values conflicts: " + aVar.mo19483c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
        }
        map.put(cVar, valuet);
    }

    /* renamed from: N */
    public <ValueT> ValueT m19662N(InterfaceC5061o0.a<ValueT> aVar) {
        return (ValueT) this.f19334z.remove(aVar);
    }

    @Override // p279w.InterfaceC5066p1
    /* renamed from: g */
    public <ValueT> void mo19659g(InterfaceC5061o0.a<ValueT> aVar, ValueT valuet) {
        mo19658G(aVar, f19294C, valuet);
    }
}
