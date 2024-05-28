package p279w;

import java.util.HashMap;
import java.util.Map;

/* renamed from: w.x0 */
/* loaded from: classes.dex */
public final class C5091x0 {

    /* renamed from: a */
    private static final Object f19349a = new Object();

    /* renamed from: b */
    private static final Map<Object, InterfaceC5087w> f19350b = new HashMap();

    /* renamed from: a */
    public static InterfaceC5087w m19722a(Object obj) {
        InterfaceC5087w interfaceC5087w;
        synchronized (f19349a) {
            interfaceC5087w = f19350b.get(obj);
        }
        return interfaceC5087w == null ? InterfaceC5087w.f19339a : interfaceC5087w;
    }
}
