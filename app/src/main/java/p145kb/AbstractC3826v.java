package p145kb;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p168mb.C3982g;
import p168mb.C3989k;
import p168mb.C3990l;
import va.AbstractC4997a;
import va.AbstractC4998b;
import va.InterfaceC4999c;
import va.InterfaceC5000d;
import va.InterfaceC5001e;

/* renamed from: kb.v */
/* loaded from: classes.dex */
public abstract class AbstractC3826v extends AbstractC4997a implements InterfaceC5000d {

    /* renamed from: o */
    public static final a f15885o = new a(null);

    /* renamed from: kb.v$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4998b<InterfaceC5000d, AbstractC3826v> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kb.v$a$a */
        /* loaded from: classes.dex */
        public static final class C6054a extends AbstractC3845j implements InterfaceC3041l<InterfaceC5001e.a, AbstractC3826v> {

            /* renamed from: n */
            public static final C6054a f15886n = new C6054a();

            C6054a() {
                super(1);
            }

            @Override // p051db.InterfaceC3041l
            /* renamed from: a */
            public final AbstractC3826v invoke(InterfaceC5001e.a aVar) {
                if (aVar instanceof AbstractC3826v) {
                    return (AbstractC3826v) aVar;
                }
                return null;
            }
        }

        private a() {
            super(InterfaceC5000d.f19100l, C6054a.f15886n);
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    public AbstractC3826v() {
        super(InterfaceC5000d.f19100l);
    }

    @Override // va.InterfaceC5000d
    /* renamed from: Q */
    public final <T> InterfaceC4999c<T> mo16226Q(InterfaceC4999c<? super T> interfaceC4999c) {
        return new C3982g(this, interfaceC4999c);
    }

    @Override // va.InterfaceC5000d
    /* renamed from: W */
    public final void mo16227W(InterfaceC4999c<?> interfaceC4999c) {
        C3844i.m16251d(interfaceC4999c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3982g) interfaceC4999c).m16733n();
    }

    @Override // va.AbstractC4997a, va.InterfaceC5001e
    /* renamed from: i */
    public <E extends InterfaceC5001e.a> E mo16094i(InterfaceC5001e.b<E> bVar) {
        return (E) InterfaceC5000d.a.m19450a(this, bVar);
    }

    /* renamed from: j0 */
    public abstract void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable);

    /* renamed from: k0 */
    public boolean mo16205k0(InterfaceC5001e interfaceC5001e) {
        return true;
    }

    /* renamed from: l0 */
    public AbstractC3826v mo16228l0(int i10) {
        C3990l.m16764a(i10);
        return new C3989k(this, i10);
    }

    public String toString() {
        return C3834z.m16239a(this) + '@' + C3834z.m16240b(this);
    }
}
