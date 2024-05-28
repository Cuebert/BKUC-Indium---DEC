package p145kb;

import java.util.concurrent.CancellationException;
import p051db.InterfaceC3041l;
import p051db.InterfaceC3045p;
import p253ta.C4755l;
import va.InterfaceC5001e;

/* renamed from: kb.v0 */
/* loaded from: classes.dex */
public interface InterfaceC3827v0 extends InterfaceC5001e.a {

    /* renamed from: k */
    public static final b f15887k = b.f15888n;

    /* renamed from: kb.v0$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m16230a(InterfaceC3827v0 interfaceC3827v0, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC3827v0.mo16087X(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m16231b(InterfaceC3827v0 interfaceC3827v0, R r10, InterfaceC3045p<? super R, ? super InterfaceC5001e.a, ? extends R> interfaceC3045p) {
            return (R) InterfaceC5001e.a.C6060a.m19451a(interfaceC3827v0, r10, interfaceC3045p);
        }

        /* renamed from: c */
        public static <E extends InterfaceC5001e.a> E m16232c(InterfaceC3827v0 interfaceC3827v0, InterfaceC5001e.b<E> bVar) {
            return (E) InterfaceC5001e.a.C6060a.m19452b(interfaceC3827v0, bVar);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC3792h0 m16233d(InterfaceC3827v0 interfaceC3827v0, boolean z10, boolean z11, InterfaceC3041l interfaceC3041l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return interfaceC3827v0.mo16095l(z10, z11, interfaceC3041l);
        }
    }

    /* renamed from: kb.v0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC5001e.b<InterfaceC3827v0> {

        /* renamed from: n */
        static final /* synthetic */ b f15888n = new b();

        private b() {
        }
    }

    /* renamed from: T */
    CancellationException mo16086T();

    /* renamed from: X */
    void mo16087X(CancellationException cancellationException);

    /* renamed from: c */
    boolean mo16027c();

    /* renamed from: l */
    InterfaceC3792h0 mo16095l(boolean z10, boolean z11, InterfaceC3041l<? super Throwable, C4755l> interfaceC3041l);
}
