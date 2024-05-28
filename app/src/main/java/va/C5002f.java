package va;

import java.io.Serializable;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3045p;
import va.InterfaceC5001e;

/* renamed from: va.f */
/* loaded from: classes.dex */
public final class C5002f implements InterfaceC5001e, Serializable {

    /* renamed from: n */
    public static final C5002f f19102n = new C5002f();

    private C5002f() {
    }

    @Override // va.InterfaceC5001e
    /* renamed from: b */
    public <R> R mo16089b(R r10, InterfaceC3045p<? super R, ? super InterfaceC5001e.a, ? extends R> operation) {
        C3844i.m16253f(operation, "operation");
        return r10;
    }

    public int hashCode() {
        return 0;
    }

    @Override // va.InterfaceC5001e
    /* renamed from: i */
    public <E extends InterfaceC5001e.a> E mo16094i(InterfaceC5001e.b<E> key) {
        C3844i.m16253f(key, "key");
        return null;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
