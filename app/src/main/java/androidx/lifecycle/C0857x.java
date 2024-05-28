package androidx.lifecycle;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class C0857x {

    /* renamed from: a */
    private final a f4304a;

    /* renamed from: b */
    private final C0858y f4305b;

    /* renamed from: androidx.lifecycle.x$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        <T extends AbstractC0856w> T mo4688a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.x$b */
    /* loaded from: classes.dex */
    public static abstract class b extends c implements a {
        b() {
        }

        @Override // androidx.lifecycle.C0857x.a
        /* renamed from: a */
        public <T extends AbstractC0856w> T mo4688a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends AbstractC0856w> T m4949c(String str, Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.x$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: b */
        void m4950b(AbstractC0856w abstractC0856w) {
        }
    }

    public C0857x(C0858y c0858y, a aVar) {
        this.f4304a = aVar;
        this.f4305b = c0858y;
    }

    /* renamed from: a */
    public <T extends AbstractC0856w> T m4947a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m4948b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC0856w> T m4948b(String str, Class<T> cls) {
        T t10;
        T t11 = (T) this.f4305b.m4952b(str);
        if (cls.isInstance(t11)) {
            Object obj = this.f4304a;
            if (obj instanceof c) {
                ((c) obj).m4950b(t11);
            }
            return t11;
        }
        a aVar = this.f4304a;
        if (aVar instanceof b) {
            t10 = (T) ((b) aVar).m4949c(str, cls);
        } else {
            t10 = (T) aVar.mo4688a(cls);
        }
        this.f4305b.m4954d(str, t10);
        return t10;
    }
}
