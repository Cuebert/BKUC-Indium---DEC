package p168mb;

import androidx.concurrent.futures.C0540b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: mb.b */
/* loaded from: classes.dex */
public abstract class AbstractC3972b<T> extends AbstractC4000v {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16358a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3972b.class, Object.class, "_consensus");
    private volatile Object _consensus = C3970a.f16356a;

    /* renamed from: c */
    private final Object m16700c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16358a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C3970a.f16356a;
        return obj2 != obj3 ? obj2 : C0540b.m2514a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p168mb.AbstractC4000v
    /* renamed from: a */
    public final Object mo16701a(Object obj) {
        Object obj2 = f16358a.get(this);
        if (obj2 == C3970a.f16356a) {
            obj2 = m16700c(mo16112d(obj));
        }
        mo16702b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo16702b(T t10, Object obj);

    /* renamed from: d */
    public abstract Object mo16112d(T t10);
}
