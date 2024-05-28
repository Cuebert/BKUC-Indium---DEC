package p091gc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import p091gc.C3335g;
import p091gc.InterfaceC3331c;
import p193ob.C4177g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.g */
/* loaded from: classes.dex */
public final class C3335g extends InterfaceC3331c.a {

    /* renamed from: a */
    private final Executor f13850a;

    /* renamed from: gc.g$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3331c<Object, InterfaceC3330b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f13851a;

        /* renamed from: b */
        final /* synthetic */ Executor f13852b;

        a(Type type, Executor executor) {
            this.f13851a = type;
            this.f13852b = executor;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: a */
        public Type mo14641a() {
            return this.f13851a;
        }

        @Override // p091gc.InterfaceC3331c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3330b<Object> mo14642b(InterfaceC3330b<Object> interfaceC3330b) {
            Executor executor = this.f13852b;
            return executor == null ? interfaceC3330b : new b(executor, interfaceC3330b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gc.g$b */
    /* loaded from: classes.dex */
    public static final class b<T> implements InterfaceC3330b<T> {

        /* renamed from: n */
        final Executor f13854n;

        /* renamed from: o */
        final InterfaceC3330b<T> f13855o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gc.g$b$a */
        /* loaded from: classes.dex */
        public class a implements InterfaceC3332d<T> {

            /* renamed from: a */
            final /* synthetic */ InterfaceC3332d f13856a;

            a(InterfaceC3332d interfaceC3332d) {
                this.f13856a = interfaceC3332d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m14654e(InterfaceC3332d interfaceC3332d, Throwable th) {
                interfaceC3332d.mo12981b(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m14655f(InterfaceC3332d interfaceC3332d, C3348t c3348t) {
                if (b.this.f13855o.mo14639i()) {
                    interfaceC3332d.mo12981b(b.this, new IOException("Canceled"));
                } else {
                    interfaceC3332d.mo12980a(b.this, c3348t);
                }
            }

            @Override // p091gc.InterfaceC3332d
            /* renamed from: a */
            public void mo12980a(InterfaceC3330b<T> interfaceC3330b, final C3348t<T> c3348t) {
                Executor executor = b.this.f13854n;
                final InterfaceC3332d interfaceC3332d = this.f13856a;
                executor.execute(new Runnable() { // from class: gc.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3335g.b.a.this.m14655f(interfaceC3332d, c3348t);
                    }
                });
            }

            @Override // p091gc.InterfaceC3332d
            /* renamed from: b */
            public void mo12981b(InterfaceC3330b<T> interfaceC3330b, final Throwable th) {
                Executor executor = b.this.f13854n;
                final InterfaceC3332d interfaceC3332d = this.f13856a;
                executor.execute(new Runnable() { // from class: gc.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3335g.b.a.this.m14654e(interfaceC3332d, th);
                    }
                });
            }
        }

        b(Executor executor, InterfaceC3330b<T> interfaceC3330b) {
            this.f13854n = executor;
            this.f13855o = interfaceC3330b;
        }

        @Override // p091gc.InterfaceC3330b
        /* renamed from: W */
        public void mo14636W(InterfaceC3332d<T> interfaceC3332d) {
            Objects.requireNonNull(interfaceC3332d, "callback == null");
            this.f13855o.mo14636W(new a(interfaceC3332d));
        }

        @Override // p091gc.InterfaceC3330b
        /* renamed from: c */
        public C3348t<T> mo14637c() throws IOException {
            return this.f13855o.mo14637c();
        }

        @Override // p091gc.InterfaceC3330b
        public void cancel() {
            this.f13855o.cancel();
        }

        @Override // p091gc.InterfaceC3330b
        /* renamed from: e */
        public C4177g0 mo14638e() {
            return this.f13855o.mo14638e();
        }

        @Override // p091gc.InterfaceC3330b
        /* renamed from: i */
        public boolean mo14639i() {
            return this.f13855o.mo14639i();
        }

        @Override // p091gc.InterfaceC3330b
        /* renamed from: l */
        public InterfaceC3330b<T> clone() {
            return new b(this.f13854n, this.f13855o.clone());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3335g(Executor executor) {
        this.f13850a = executor;
    }

    @Override // p091gc.InterfaceC3331c.a
    /* renamed from: a */
    public InterfaceC3331c<?, ?> mo14645a(Type type, Annotation[] annotationArr, C3349u c3349u) {
        if (InterfaceC3331c.a.m14644c(type) != InterfaceC3330b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(C3353y.m14762g(0, (ParameterizedType) type), C3353y.m14767l(annotationArr, InterfaceC3351w.class) ? null : this.f13850a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
