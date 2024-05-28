package va;

import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3045p;

/* renamed from: va.e */
/* loaded from: classes.dex */
public interface InterfaceC5001e {

    /* renamed from: va.e$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC5001e {

        /* renamed from: va.e$a$a */
        /* loaded from: classes.dex */
        public static final class C6060a {
            /* renamed from: a */
            public static <R> R m19451a(a aVar, R r10, InterfaceC3045p<? super R, ? super a, ? extends R> operation) {
                C3844i.m16253f(operation, "operation");
                return operation.invoke(r10, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends a> E m19452b(a aVar, b<E> key) {
                C3844i.m16253f(key, "key");
                if (!C3844i.m16248a(aVar.getKey(), key)) {
                    return null;
                }
                C3844i.m16251d(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }
        }

        b<?> getKey();
    }

    /* renamed from: va.e$b */
    /* loaded from: classes.dex */
    public interface b<E extends a> {
    }

    /* renamed from: b */
    <R> R mo16089b(R r10, InterfaceC3045p<? super R, ? super a, ? extends R> interfaceC3045p);

    /* renamed from: i */
    <E extends a> E mo16094i(b<E> bVar);
}
