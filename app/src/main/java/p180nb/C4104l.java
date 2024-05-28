package p180nb;

import gb.C3328f;
import java.util.concurrent.TimeUnit;
import p168mb.C3973b0;
import p168mb.C3977d0;

/* renamed from: nb.l */
/* loaded from: classes.dex */
public final class C4104l {

    /* renamed from: a */
    public static final String f16659a = C3973b0.m16707e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f16660b;

    /* renamed from: c */
    public static final int f16661c;

    /* renamed from: d */
    public static final int f16662d;

    /* renamed from: e */
    public static final long f16663e;

    /* renamed from: f */
    public static AbstractC4099g f16664f;

    /* renamed from: g */
    public static final InterfaceC4101i f16665g;

    /* renamed from: h */
    public static final InterfaceC4101i f16666h;

    static {
        long m16720f;
        int m14622a;
        int m16719e;
        int m16719e2;
        long m16720f2;
        m16720f = C3977d0.m16720f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f16660b = m16720f;
        m14622a = C3328f.m14622a(C3973b0.m16703a(), 2);
        m16719e = C3977d0.m16719e("kotlinx.coroutines.scheduler.core.pool.size", m14622a, 1, 0, 8, null);
        f16661c = m16719e;
        m16719e2 = C3977d0.m16719e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f16662d = m16719e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m16720f2 = C3977d0.m16720f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f16663e = timeUnit.toNanos(m16720f2);
        f16664f = C4097e.f16649a;
        f16665g = new C4102j(0);
        f16666h = new C4102j(1);
    }
}
