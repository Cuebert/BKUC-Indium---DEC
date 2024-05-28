package p279w;

import java.util.Set;

/* renamed from: w.o0 */
/* loaded from: classes.dex */
public interface InterfaceC5061o0 {

    /* renamed from: w.o0$a */
    /* loaded from: classes.dex */
    public static abstract class a<T> {
        /* renamed from: a */
        public static <T> a<T> m19653a(String str, Class<?> cls) {
            return m19654b(str, cls, null);
        }

        /* renamed from: b */
        public static <T> a<T> m19654b(String str, Class<?> cls, Object obj) {
            return new C5008b(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo19483c();

        /* renamed from: d */
        public abstract Object mo19484d();

        /* renamed from: e */
        public abstract Class<T> mo19485e();
    }

    /* renamed from: w.o0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo19348a(a<?> aVar);
    }

    /* renamed from: w.o0$c */
    /* loaded from: classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: a */
    <ValueT> ValueT mo1365a(a<ValueT> aVar, ValueT valuet);

    /* renamed from: b */
    <ValueT> ValueT mo1366b(a<ValueT> aVar);

    /* renamed from: c */
    Set<a<?>> mo1367c();

    /* renamed from: d */
    c mo1368d(a<?> aVar);

    /* renamed from: e */
    boolean mo1369e(a<?> aVar);

    /* renamed from: t */
    <ValueT> ValueT mo1376t(a<ValueT> aVar, c cVar);

    /* renamed from: v */
    void mo1377v(String str, b bVar);

    /* renamed from: x */
    Set<c> mo1379x(a<?> aVar);
}
