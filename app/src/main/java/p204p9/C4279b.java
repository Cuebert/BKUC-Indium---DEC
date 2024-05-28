package p204p9;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import p091gc.C3348t;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3332d;
import p193ob.C4177g0;

/* renamed from: p9.b */
/* loaded from: classes.dex */
public class C4279b<T> implements InterfaceC3330b<T> {

    /* renamed from: n */
    final Executor f17469n;

    /* renamed from: o */
    final InterfaceC3330b<T> f17470o;

    /* renamed from: p9.b$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC3332d<T> {

        /* renamed from: a */
        private InterfaceC3332d<T> f17471a;

        /* renamed from: b */
        private boolean f17472b;

        /* renamed from: p9.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC6057a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ C3348t f17474n;

            RunnableC6057a(C3348t c3348t) {
                this.f17474n = c3348t;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C4279b.this.f17470o.mo14639i()) {
                    a.this.f17471a.mo12981b(C4279b.this, new IOException("Canceled"));
                } else {
                    a.this.f17471a.mo12980a(C4279b.this, this.f17474n);
                }
            }
        }

        /* renamed from: p9.b$a$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: n */
            final /* synthetic */ Throwable f17476n;

            b(Throwable th) {
                this.f17476n = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f17471a.mo12981b(C4279b.this, this.f17476n);
            }
        }

        public a(C4279b c4279b, InterfaceC3332d<T> interfaceC3332d) {
            this(interfaceC3332d, false);
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<T> interfaceC3330b, C3348t<T> c3348t) {
            if (c3348t.m14732b() == 403 && c3348t.m14734e().m17555c("X-CSRF-TOKEN") != null && !this.f17472b) {
                C4279b.this.f17470o.clone().mo14636W(new a(this.f17471a, true));
            } else {
                C4279b.this.f17469n.execute(new RunnableC6057a(c3348t));
            }
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<T> interfaceC3330b, Throwable th) {
            C4279b.this.f17469n.execute(new b(th));
        }

        public a(InterfaceC3332d<T> interfaceC3332d, boolean z10) {
            this.f17471a = interfaceC3332d;
            this.f17472b = z10;
        }
    }

    public C4279b(Executor executor, InterfaceC3330b<T> interfaceC3330b) {
        this.f17469n = executor;
        this.f17470o = interfaceC3330b;
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: W */
    public void mo14636W(InterfaceC3332d<T> interfaceC3332d) {
        Objects.requireNonNull(interfaceC3332d, "callback == null");
        this.f17470o.mo14636W(new a(this, interfaceC3332d));
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: c */
    public C3348t<T> mo14637c() throws IOException {
        C3348t<T> mo14637c = this.f17470o.mo14637c();
        return (mo14637c.m14732b() != 403 || mo14637c.m14734e().m17555c("X-CSRF-TOKEN") == null) ? mo14637c : this.f17470o.clone().mo14637c();
    }

    @Override // p091gc.InterfaceC3330b
    public void cancel() {
        this.f17470o.cancel();
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: e */
    public C4177g0 mo14638e() {
        return this.f17470o.mo14638e();
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: i */
    public boolean mo14639i() {
        return this.f17470o.mo14639i();
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public InterfaceC3330b<T> clone() {
        return new C4279b(this.f17469n, this.f17470o.clone());
    }
}
