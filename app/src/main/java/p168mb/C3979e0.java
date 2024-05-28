package p168mb;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3045p;
import p145kb.InterfaceC3796i1;
import va.InterfaceC5001e;

/* renamed from: mb.e0 */
/* loaded from: classes.dex */
public final class C3979e0 {

    /* renamed from: a */
    public static final C3971a0 f16363a = new C3971a0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final InterfaceC3045p<Object, InterfaceC5001e.a, Object> f16364b = a.f16367n;

    /* renamed from: c */
    private static final InterfaceC3045p<InterfaceC3796i1<?>, InterfaceC5001e.a, InterfaceC3796i1<?>> f16365c = b.f16368n;

    /* renamed from: d */
    private static final InterfaceC3045p<C3987i0, InterfaceC5001e.a, C3987i0> f16366d = c.f16369n;

    /* renamed from: mb.e0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC3845j implements InterfaceC3045p<Object, InterfaceC5001e.a, Object> {

        /* renamed from: n */
        public static final a f16367n = new a();

        a() {
            super(2);
        }

        @Override // p051db.InterfaceC3045p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC5001e.a aVar) {
            if (!(aVar instanceof InterfaceC3796i1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: mb.e0$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC3845j implements InterfaceC3045p<InterfaceC3796i1<?>, InterfaceC5001e.a, InterfaceC3796i1<?>> {

        /* renamed from: n */
        public static final b f16368n = new b();

        b() {
            super(2);
        }

        @Override // p051db.InterfaceC3045p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3796i1<?> invoke(InterfaceC3796i1<?> interfaceC3796i1, InterfaceC5001e.a aVar) {
            if (interfaceC3796i1 != null) {
                return interfaceC3796i1;
            }
            if (aVar instanceof InterfaceC3796i1) {
                return (InterfaceC3796i1) aVar;
            }
            return null;
        }
    }

    /* renamed from: mb.e0$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC3845j implements InterfaceC3045p<C3987i0, InterfaceC5001e.a, C3987i0> {

        /* renamed from: n */
        public static final c f16369n = new c();

        c() {
            super(2);
        }

        @Override // p051db.InterfaceC3045p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3987i0 invoke(C3987i0 c3987i0, InterfaceC5001e.a aVar) {
            if (aVar instanceof InterfaceC3796i1) {
                InterfaceC3796i1<?> interfaceC3796i1 = (InterfaceC3796i1) aVar;
                c3987i0.m16757a(interfaceC3796i1, interfaceC3796i1.m16170z(c3987i0.f16381a));
            }
            return c3987i0;
        }
    }

    /* renamed from: a */
    public static final void m16722a(InterfaceC5001e interfaceC5001e, Object obj) {
        if (obj == f16363a) {
            return;
        }
        if (obj instanceof C3987i0) {
            ((C3987i0) obj).m16758b(interfaceC5001e);
            return;
        }
        Object mo16089b = interfaceC5001e.mo16089b(null, f16365c);
        C3844i.m16251d(mo16089b, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC3796i1) mo16089b).m16169e0(interfaceC5001e, obj);
    }

    /* renamed from: b */
    public static final Object m16723b(InterfaceC5001e interfaceC5001e) {
        Object mo16089b = interfaceC5001e.mo16089b(0, f16364b);
        C3844i.m16250c(mo16089b);
        return mo16089b;
    }

    /* renamed from: c */
    public static final Object m16724c(InterfaceC5001e interfaceC5001e, Object obj) {
        if (obj == null) {
            obj = m16723b(interfaceC5001e);
        }
        if (obj == 0) {
            return f16363a;
        }
        if (obj instanceof Integer) {
            return interfaceC5001e.mo16089b(new C3987i0(interfaceC5001e, ((Number) obj).intValue()), f16366d);
        }
        C3844i.m16251d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC3796i1) obj).m16170z(interfaceC5001e);
    }
}
