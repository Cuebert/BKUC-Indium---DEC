package p259u3;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: u3.n */
/* loaded from: classes.dex */
final class C4854n {

    /* renamed from: a */
    private final ConcurrentHashMap<C4857q, List<Throwable>> f18725a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f18726b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m19043a(Throwable th, boolean z10) {
        Reference<? extends Throwable> poll = this.f18726b.poll();
        while (poll != null) {
            this.f18725a.remove(poll);
            poll = this.f18726b.poll();
        }
        List<Throwable> list = this.f18725a.get(new C4857q(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f18725a.putIfAbsent(new C4857q(th, this.f18726b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
