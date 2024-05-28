package p091gc;

import java.util.Objects;

/* renamed from: gc.j */
/* loaded from: classes.dex */
public class C3338j extends RuntimeException {

    /* renamed from: n */
    private final int f13864n;

    /* renamed from: o */
    private final String f13865o;

    /* renamed from: p */
    private final transient C3348t<?> f13866p;

    public C3338j(C3348t<?> c3348t) {
        super(m14656a(c3348t));
        this.f13864n = c3348t.m14732b();
        this.f13865o = c3348t.m14736g();
        this.f13866p = c3348t;
    }

    /* renamed from: a */
    private static String m14656a(C3348t<?> c3348t) {
        Objects.requireNonNull(c3348t, "response == null");
        return "HTTP " + c3348t.m14732b() + " " + c3348t.m14736g();
    }
}
