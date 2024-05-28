package p024bc;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bc.h */
/* loaded from: classes.dex */
public final class C1105h {

    /* renamed from: d */
    private static final List<C1105h> f5409d = new ArrayList();

    /* renamed from: a */
    Object f5410a;

    /* renamed from: b */
    C1111n f5411b;

    /* renamed from: c */
    C1105h f5412c;

    private C1105h(Object obj, C1111n c1111n) {
        this.f5410a = obj;
        this.f5411b = c1111n;
    }

    /* renamed from: a */
    public static C1105h m6475a(C1111n c1111n, Object obj) {
        List<C1105h> list = f5409d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                C1105h remove = list.remove(size - 1);
                remove.f5410a = obj;
                remove.f5411b = c1111n;
                remove.f5412c = null;
                return remove;
            }
            return new C1105h(obj, c1111n);
        }
    }

    /* renamed from: b */
    public static void m6476b(C1105h c1105h) {
        c1105h.f5410a = null;
        c1105h.f5411b = null;
        c1105h.f5412c = null;
        List<C1105h> list = f5409d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(c1105h);
            }
        }
    }
}
