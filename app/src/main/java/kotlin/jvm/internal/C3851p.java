package kotlin.jvm.internal;

import com.appsflyer.oaid.BuildConfig;
import p104hb.InterfaceC3454c;
import p104hb.InterfaceC3455d;
import p104hb.InterfaceC3456e;
import p104hb.InterfaceC3457f;

/* renamed from: kotlin.jvm.internal.p */
/* loaded from: classes.dex */
public class C3851p {

    /* renamed from: a */
    private static final C3852q f15905a;

    /* renamed from: b */
    private static final InterfaceC3454c[] f15906b;

    static {
        C3852q c3852q = null;
        try {
            c3852q = (C3852q) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c3852q == null) {
            c3852q = new C3852q();
        }
        f15905a = c3852q;
        f15906b = new InterfaceC3454c[0];
    }

    /* renamed from: a */
    public static InterfaceC3456e m16267a(C3842g c3842g) {
        return f15905a.m16272a(c3842g);
    }

    /* renamed from: b */
    public static InterfaceC3454c m16268b(Class cls) {
        return f15905a.m16273b(cls);
    }

    /* renamed from: c */
    public static InterfaceC3455d m16269c(Class cls) {
        return f15905a.m16274c(cls, BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public static InterfaceC3457f m16270d(AbstractC3847l abstractC3847l) {
        return f15905a.m16275d(abstractC3847l);
    }

    /* renamed from: e */
    public static String m16271e(AbstractC3845j abstractC3845j) {
        return f15905a.m16277f(abstractC3845j);
    }
}
