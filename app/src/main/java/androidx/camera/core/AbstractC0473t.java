package androidx.camera.core;

/* renamed from: androidx.camera.core.t */
/* loaded from: classes.dex */
public abstract class AbstractC0473t {

    /* renamed from: androidx.camera.core.t$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public static a m2232a(int i10) {
            return m2233b(i10, null);
        }

        /* renamed from: b */
        public static a m2233b(int i10, Throwable th) {
            return new C0409g(i10, th);
        }

        /* renamed from: c */
        public abstract Throwable mo2010c();

        /* renamed from: d */
        public abstract int mo2011d();
    }

    /* renamed from: androidx.camera.core.t$b */
    /* loaded from: classes.dex */
    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: a */
    public static AbstractC0473t m2230a(b bVar) {
        return m2231b(bVar, null);
    }

    /* renamed from: b */
    public static AbstractC0473t m2231b(b bVar, a aVar) {
        return new C0404f(bVar, aVar);
    }

    /* renamed from: c */
    public abstract a mo2008c();

    /* renamed from: d */
    public abstract b mo2009d();
}
