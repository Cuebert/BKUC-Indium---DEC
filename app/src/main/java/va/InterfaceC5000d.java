package va;

import kotlin.jvm.internal.C3844i;
import va.InterfaceC5001e;

/* renamed from: va.d */
/* loaded from: classes.dex */
public interface InterfaceC5000d extends InterfaceC5001e.a {

    /* renamed from: l */
    public static final b f19100l = b.f19101n;

    /* renamed from: va.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static <E extends InterfaceC5001e.a> E m19450a(InterfaceC5000d interfaceC5000d, InterfaceC5001e.b<E> key) {
            C3844i.m16253f(key, "key");
            if (key instanceof AbstractC4998b) {
                AbstractC4998b abstractC4998b = (AbstractC4998b) key;
                if (!abstractC4998b.m19448a(interfaceC5000d.getKey())) {
                    return null;
                }
                E e10 = (E) abstractC4998b.m19449b(interfaceC5000d);
                if (e10 instanceof InterfaceC5001e.a) {
                    return e10;
                }
                return null;
            }
            if (InterfaceC5000d.f19100l != key) {
                return null;
            }
            C3844i.m16251d(interfaceC5000d, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return interfaceC5000d;
        }
    }

    /* renamed from: va.d$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC5001e.b<InterfaceC5000d> {

        /* renamed from: n */
        static final /* synthetic */ b f19101n = new b();

        private b() {
        }
    }

    /* renamed from: Q */
    <T> InterfaceC4999c<T> mo16226Q(InterfaceC4999c<? super T> interfaceC4999c);

    /* renamed from: W */
    void mo16227W(InterfaceC4999c<?> interfaceC4999c);
}
