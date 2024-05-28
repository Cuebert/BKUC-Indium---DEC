package p091gc;

import java.util.Objects;
import p193ob.AbstractC4183j0;
import p193ob.C4181i0;
import p193ob.C4200y;

/* renamed from: gc.t */
/* loaded from: classes.dex */
public final class C3348t<T> {

    /* renamed from: a */
    private final C4181i0 f14005a;

    /* renamed from: b */
    private final T f14006b;

    /* renamed from: c */
    private final AbstractC4183j0 f14007c;

    private C3348t(C4181i0 c4181i0, T t10, AbstractC4183j0 abstractC4183j0) {
        this.f14005a = c4181i0;
        this.f14006b = t10;
        this.f14007c = abstractC4183j0;
    }

    /* renamed from: c */
    public static <T> C3348t<T> m14729c(AbstractC4183j0 abstractC4183j0, C4181i0 c4181i0) {
        Objects.requireNonNull(abstractC4183j0, "body == null");
        Objects.requireNonNull(c4181i0, "rawResponse == null");
        if (!c4181i0.m17425Q()) {
            return new C3348t<>(c4181i0, null, abstractC4183j0);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: h */
    public static <T> C3348t<T> m14730h(T t10, C4181i0 c4181i0) {
        Objects.requireNonNull(c4181i0, "rawResponse == null");
        if (c4181i0.m17425Q()) {
            return new C3348t<>(c4181i0, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T m14731a() {
        return this.f14006b;
    }

    /* renamed from: b */
    public int m14732b() {
        return this.f14005a.m17432e();
    }

    /* renamed from: d */
    public AbstractC4183j0 m14733d() {
        return this.f14007c;
    }

    /* renamed from: e */
    public C4200y m14734e() {
        return this.f14005a.m17424O();
    }

    /* renamed from: f */
    public boolean m14735f() {
        return this.f14005a.m17425Q();
    }

    /* renamed from: g */
    public String m14736g() {
        return this.f14005a.m17426T();
    }

    public String toString() {
        return this.f14005a.toString();
    }
}
