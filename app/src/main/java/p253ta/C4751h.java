package p253ta;

import java.io.Serializable;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;

/* renamed from: ta.h */
/* loaded from: classes.dex */
public final class C4751h<T> implements Serializable {

    /* renamed from: n */
    public static final a f18580n = new a(null);

    /* renamed from: ta.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C3840e c3840e) {
            this();
        }
    }

    /* renamed from: ta.h$b */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: n */
        public final Throwable f18581n;

        public b(Throwable exception) {
            C3844i.m16253f(exception, "exception");
            this.f18581n = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && C3844i.m16248a(this.f18581n, ((b) obj).f18581n);
        }

        public int hashCode() {
            return this.f18581n.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f18581n + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m18904a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m18905b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f18581n;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m18906c(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: d */
    public static final boolean m18907d(Object obj) {
        return !(obj instanceof b);
    }
}
