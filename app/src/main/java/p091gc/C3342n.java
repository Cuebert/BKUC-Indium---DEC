package p091gc;

import ac.AbstractC0078h;
import ac.C0073c;
import ac.C0082l;
import ac.InterfaceC0075e;
import ac.InterfaceC0090t;
import java.io.IOException;
import java.util.Objects;
import p193ob.AbstractC4183j0;
import p193ob.C4167b0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.InterfaceC4176g;
import p193ob.InterfaceC4178h;

/* renamed from: gc.n */
/* loaded from: classes.dex */
public final class C3342n<T> implements InterfaceC3330b<T> {

    /* renamed from: n */
    private final C3347s f13887n;

    /* renamed from: o */
    private final Object[] f13888o;

    /* renamed from: p */
    private final InterfaceC4176g.a f13889p;

    /* renamed from: q */
    private final InterfaceC3334f<AbstractC4183j0, T> f13890q;

    /* renamed from: r */
    private volatile boolean f13891r;

    /* renamed from: s */
    private InterfaceC4176g f13892s;

    /* renamed from: t */
    private Throwable f13893t;

    /* renamed from: u */
    private boolean f13894u;

    /* renamed from: gc.n$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC4178h {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3332d f13895a;

        a(InterfaceC3332d interfaceC3332d) {
            this.f13895a = interfaceC3332d;
        }

        /* renamed from: c */
        private void m14675c(Throwable th) {
            try {
                this.f13895a.mo12981b(C3342n.this, th);
            } catch (Throwable th2) {
                C3353y.m14774s(th2);
                th2.printStackTrace();
            }
        }

        @Override // p193ob.InterfaceC4178h
        /* renamed from: a */
        public void mo14676a(InterfaceC4176g interfaceC4176g, C4181i0 c4181i0) {
            try {
                try {
                    this.f13895a.mo12980a(C3342n.this, C3342n.this.m14674g(c4181i0));
                } catch (Throwable th) {
                    C3353y.m14774s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C3353y.m14774s(th2);
                m14675c(th2);
            }
        }

        @Override // p193ob.InterfaceC4178h
        /* renamed from: b */
        public void mo14677b(InterfaceC4176g interfaceC4176g, IOException iOException) {
            m14675c(iOException);
        }
    }

    /* renamed from: gc.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4183j0 {

        /* renamed from: o */
        private final AbstractC4183j0 f13897o;

        /* renamed from: p */
        private final InterfaceC0075e f13898p;

        /* renamed from: q */
        IOException f13899q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gc.n$b$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC0078h {
            a(InterfaceC0090t interfaceC0090t) {
                super(interfaceC0090t);
            }

            @Override // ac.AbstractC0078h, ac.InterfaceC0090t
            /* renamed from: V */
            public long mo315V(C0073c c0073c, long j10) throws IOException {
                try {
                    return super.mo315V(c0073c, j10);
                } catch (IOException e10) {
                    b.this.f13899q = e10;
                    throw e10;
                }
            }
        }

        b(AbstractC4183j0 abstractC4183j0) {
            this.f13897o = abstractC4183j0;
            this.f13898p = C0082l.m425d(new a(abstractC4183j0.mo14678Q()));
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: Q */
        public InterfaceC0075e mo14678Q() {
            return this.f13898p;
        }

        /* renamed from: W */
        void m14679W() throws IOException {
            IOException iOException = this.f13899q;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p193ob.AbstractC4183j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f13897o.close();
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: i */
        public long mo14680i() {
            return this.f13897o.mo14680i();
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: l */
        public C4167b0 mo14681l() {
            return this.f13897o.mo14681l();
        }
    }

    /* renamed from: gc.n$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4183j0 {

        /* renamed from: o */
        private final C4167b0 f13901o;

        /* renamed from: p */
        private final long f13902p;

        c(C4167b0 c4167b0, long j10) {
            this.f13901o = c4167b0;
            this.f13902p = j10;
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: Q */
        public InterfaceC0075e mo14678Q() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: i */
        public long mo14680i() {
            return this.f13902p;
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: l */
        public C4167b0 mo14681l() {
            return this.f13901o;
        }
    }

    public C3342n(C3347s c3347s, Object[] objArr, InterfaceC4176g.a aVar, InterfaceC3334f<AbstractC4183j0, T> interfaceC3334f) {
        this.f13887n = c3347s;
        this.f13888o = objArr;
        this.f13889p = aVar;
        this.f13890q = interfaceC3334f;
    }

    /* renamed from: d */
    private InterfaceC4176g m14671d() throws IOException {
        InterfaceC4176g mo17300a = this.f13889p.mo17300a(this.f13887n.m14718a(this.f13888o));
        Objects.requireNonNull(mo17300a, "Call.Factory returned null.");
        return mo17300a;
    }

    /* renamed from: f */
    private InterfaceC4176g m14672f() throws IOException {
        InterfaceC4176g interfaceC4176g = this.f13892s;
        if (interfaceC4176g != null) {
            return interfaceC4176g;
        }
        Throwable th = this.f13893t;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            InterfaceC4176g m14671d = m14671d();
            this.f13892s = m14671d;
            return m14671d;
        } catch (IOException | Error | RuntimeException e10) {
            C3353y.m14774s(e10);
            this.f13893t = e10;
            throw e10;
        }
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: W */
    public void mo14636W(InterfaceC3332d<T> interfaceC3332d) {
        InterfaceC4176g interfaceC4176g;
        Throwable th;
        Objects.requireNonNull(interfaceC3332d, "callback == null");
        synchronized (this) {
            if (!this.f13894u) {
                this.f13894u = true;
                interfaceC4176g = this.f13892s;
                th = this.f13893t;
                if (interfaceC4176g == null && th == null) {
                    try {
                        InterfaceC4176g m14671d = m14671d();
                        this.f13892s = m14671d;
                        interfaceC4176g = m14671d;
                    } catch (Throwable th2) {
                        th = th2;
                        C3353y.m14774s(th);
                        this.f13893t = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            interfaceC3332d.mo12981b(this, th);
            return;
        }
        if (this.f13891r) {
            interfaceC4176g.cancel();
        }
        interfaceC4176g.mo17384z(new a(interfaceC3332d));
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: a */
    public C3342n<T> clone() {
        return new C3342n<>(this.f13887n, this.f13888o, this.f13889p, this.f13890q);
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: c */
    public C3348t<T> mo14637c() throws IOException {
        InterfaceC4176g m14672f;
        synchronized (this) {
            if (!this.f13894u) {
                this.f13894u = true;
                m14672f = m14672f();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f13891r) {
            m14672f.cancel();
        }
        return m14674g(m14672f.mo17377c());
    }

    @Override // p091gc.InterfaceC3330b
    public void cancel() {
        InterfaceC4176g interfaceC4176g;
        this.f13891r = true;
        synchronized (this) {
            interfaceC4176g = this.f13892s;
        }
        if (interfaceC4176g != null) {
            interfaceC4176g.cancel();
        }
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: e */
    public synchronized C4177g0 mo14638e() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m14672f().mo17379e();
    }

    /* renamed from: g */
    C3348t<T> m14674g(C4181i0 c4181i0) throws IOException {
        AbstractC4183j0 m17430b = c4181i0.m17430b();
        C4181i0 m17444c = c4181i0.m17428X().m17443b(new c(m17430b.mo14681l(), m17430b.mo14680i())).m17444c();
        int m17432e = m17444c.m17432e();
        if (m17432e < 200 || m17432e >= 300) {
            try {
                return C3348t.m14729c(C3353y.m14756a(m17430b), m17444c);
            } finally {
                m17430b.close();
            }
        }
        if (m17432e != 204 && m17432e != 205) {
            b bVar = new b(m17430b);
            try {
                return C3348t.m14730h(this.f13890q.mo14629a(bVar), m17444c);
            } catch (RuntimeException e10) {
                bVar.m14679W();
                throw e10;
            }
        }
        m17430b.close();
        return C3348t.m14730h(null, m17444c);
    }

    @Override // p091gc.InterfaceC3330b
    /* renamed from: i */
    public boolean mo14639i() {
        boolean z10 = true;
        if (this.f13891r) {
            return true;
        }
        synchronized (this) {
            InterfaceC4176g interfaceC4176g = this.f13892s;
            if (interfaceC4176g == null || !interfaceC4176g.mo17382i()) {
                z10 = false;
            }
        }
        return z10;
    }
}
