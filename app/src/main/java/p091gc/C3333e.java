package p091gc;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p091gc.InterfaceC3331c;

/* JADX INFO: Access modifiers changed from: package-private */
@IgnoreJRERequirement
/* renamed from: gc.e */
/* loaded from: classes.dex */
public final class C3333e extends InterfaceC3331c.a {

    /* renamed from: a */
    static final InterfaceC3331c.a f13842a = new C3333e();

    @IgnoreJRERequirement
    /* renamed from: gc.e$a */
    /* loaded from: classes.dex */
    private static final class a<R> implements InterfaceC3331c<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f13843a;

        /* JADX INFO: Access modifiers changed from: private */
        @IgnoreJRERequirement
        /* renamed from: gc.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6049a implements InterfaceC3332d<R> {

            /* renamed from: a */
            private final CompletableFuture<R> f13844a;

            public C6049a(CompletableFuture<R> completableFuture) {
                this.f13844a = completableFuture;
            }

            @Override // p091gc.InterfaceC3332d
            /* renamed from: a */
            public void mo12980a(InterfaceC3330b<R> interfaceC3330b, C3348t<R> c3348t) {
                if (c3348t.m14735f()) {
                    this.f13844a.complete(c3348t.m14731a());
                } else {
                    this.f13844a.completeExceptionally(new C3338j(c3348t));
                }
            }

            @Override // p091gc.InterfaceC3332d
            /* renamed from: b */
            public void mo12981b(InterfaceC3330b<R> interfaceC3330b, Throwable th) {
                this.f13844a.completeExceptionally(th);
            }
        }

        a(Type type) {
            this.f13843a = type;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: a */
        public Type mo14641a() {
            return this.f13843a;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> mo14642b(InterfaceC3330b<R> interfaceC3330b) {
            b bVar = new b(interfaceC3330b);
            interfaceC3330b.mo14636W(new C6049a(bVar));
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @IgnoreJRERequirement
    /* renamed from: gc.e$b */
    /* loaded from: classes.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: n */
        private final InterfaceC3330b<?> f13846n;

        b(InterfaceC3330b<?> interfaceC3330b) {
            this.f13846n = interfaceC3330b;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f13846n.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: gc.e$c */
    /* loaded from: classes.dex */
    private static final class c<R> implements InterfaceC3331c<R, CompletableFuture<C3348t<R>>> {

        /* renamed from: a */
        private final Type f13847a;

        /* JADX INFO: Access modifiers changed from: private */
        @IgnoreJRERequirement
        /* renamed from: gc.e$c$a */
        /* loaded from: classes.dex */
        public class a implements InterfaceC3332d<R> {

            /* renamed from: a */
            private final CompletableFuture<C3348t<R>> f13848a;

            public a(CompletableFuture<C3348t<R>> completableFuture) {
                this.f13848a = completableFuture;
            }

            @Override // p091gc.InterfaceC3332d
            /* renamed from: a */
            public void mo12980a(InterfaceC3330b<R> interfaceC3330b, C3348t<R> c3348t) {
                this.f13848a.complete(c3348t);
            }

            @Override // p091gc.InterfaceC3332d
            /* renamed from: b */
            public void mo12981b(InterfaceC3330b<R> interfaceC3330b, Throwable th) {
                this.f13848a.completeExceptionally(th);
            }
        }

        c(Type type) {
            this.f13847a = type;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: a */
        public Type mo14641a() {
            return this.f13847a;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<C3348t<R>> mo14642b(InterfaceC3330b<R> interfaceC3330b) {
            b bVar = new b(interfaceC3330b);
            interfaceC3330b.mo14636W(new a(bVar));
            return bVar;
        }
    }

    C3333e() {
    }

    @Override // p091gc.InterfaceC3331c.a
    /* renamed from: a */
    public InterfaceC3331c<?, ?> mo14645a(Type type, Annotation[] annotationArr, C3349u c3349u) {
        if (InterfaceC3331c.a.m14644c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m14643b = InterfaceC3331c.a.m14643b(0, (ParameterizedType) type);
            if (InterfaceC3331c.a.m14644c(m14643b) != C3348t.class) {
                return new a(m14643b);
            }
            if (m14643b instanceof ParameterizedType) {
                return new c(InterfaceC3331c.a.m14643b(0, (ParameterizedType) m14643b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
