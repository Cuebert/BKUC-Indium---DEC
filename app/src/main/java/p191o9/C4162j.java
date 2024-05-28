package p191o9;

/* renamed from: o9.j */
/* loaded from: classes.dex */
public class C4162j {

    /* renamed from: a */
    private static final Object f16945a = new Object();

    /* renamed from: b */
    private static InterfaceC4153a f16946b;

    /* renamed from: a */
    public static InterfaceC4153a m17253a() {
        synchronized (f16945a) {
            InterfaceC4153a interfaceC4153a = f16946b;
            if (interfaceC4153a != null) {
                return interfaceC4153a;
            }
            C4154b c4154b = new C4154b();
            f16946b = c4154b;
            return c4154b;
        }
    }

    /* renamed from: b */
    public static void m17254b(InterfaceC4153a interfaceC4153a) {
        synchronized (f16945a) {
            f16946b = interfaceC4153a;
        }
    }
}
