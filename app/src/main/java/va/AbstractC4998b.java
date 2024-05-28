package va;

import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import va.InterfaceC5001e;
import va.InterfaceC5001e.a;

/* renamed from: va.b */
/* loaded from: classes.dex */
public abstract class AbstractC4998b<B extends InterfaceC5001e.a, E extends B> implements InterfaceC5001e.b<E> {

    /* renamed from: n */
    private final InterfaceC3041l<InterfaceC5001e.a, E> f19098n;

    /* renamed from: o */
    private final InterfaceC5001e.b<?> f19099o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [va.e$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [db.l<va.e$a, E extends B>, java.lang.Object, db.l<? super va.e$a, ? extends E extends B>] */
    public AbstractC4998b(InterfaceC5001e.b<B> baseKey, InterfaceC3041l<? super InterfaceC5001e.a, ? extends E> safeCast) {
        C3844i.m16253f(baseKey, "baseKey");
        C3844i.m16253f(safeCast, "safeCast");
        this.f19098n = safeCast;
        this.f19099o = baseKey instanceof AbstractC4998b ? (InterfaceC5001e.b<B>) ((AbstractC4998b) baseKey).f19099o : baseKey;
    }

    /* renamed from: a */
    public final boolean m19448a(InterfaceC5001e.b<?> key) {
        C3844i.m16253f(key, "key");
        return key == this || this.f19099o == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lva/e$a;)TE; */
    /* renamed from: b */
    public final InterfaceC5001e.a m19449b(InterfaceC5001e.a element) {
        C3844i.m16253f(element, "element");
        return (InterfaceC5001e.a) this.f19098n.invoke(element);
    }
}
