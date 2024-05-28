package p204p9;

import android.os.Handler;
import android.os.Looper;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p091gc.C3349u;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3331c;

/* renamed from: p9.c */
/* loaded from: classes.dex */
public class C4280c extends InterfaceC3331c.a {

    /* renamed from: a */
    private Executor f17478a;

    /* renamed from: p9.c$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3331c<Object, InterfaceC3330b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f17479a;

        a(Type type) {
            this.f17479a = type;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: a */
        public Type mo14641a() {
            return this.f17479a;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3330b<Object> mo14642b(InterfaceC3330b<Object> interfaceC3330b) {
            return new C4279b(C4280c.this.f17478a, interfaceC3330b);
        }
    }

    private C4280c(Executor executor) {
        this.f17478a = executor;
    }

    /* renamed from: e */
    public static C4280c m17720e() {
        return new C4280c(new b(null));
    }

    @Override // p091gc.InterfaceC3331c.a
    /* renamed from: a */
    public InterfaceC3331c<?, ?> mo14645a(Type type, Annotation[] annotationArr, C3349u c3349u) {
        if (InterfaceC3331c.a.m14644c(type) != InterfaceC3330b.class) {
            return null;
        }
        return new a(InterfaceC3331c.a.m14643b(0, (ParameterizedType) type));
    }

    /* renamed from: p9.c$b */
    /* loaded from: classes.dex */
    private static class b implements Executor {

        /* renamed from: n */
        private final Handler f17481n;

        private b() {
            this.f17481n = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f17481n.post(runnable);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }
}
