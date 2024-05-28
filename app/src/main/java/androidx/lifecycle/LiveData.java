package androidx.lifecycle;

import androidx.lifecycle.AbstractC0839f;
import p146l.C3853a;
import p157m.C3912b;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f4231k = new Object();

    /* renamed from: a */
    final Object f4232a;

    /* renamed from: b */
    private C3912b<InterfaceC0852s<? super T>, LiveData<T>.AbstractC0829c> f4233b;

    /* renamed from: c */
    int f4234c;

    /* renamed from: d */
    private boolean f4235d;

    /* renamed from: e */
    private volatile Object f4236e;

    /* renamed from: f */
    volatile Object f4237f;

    /* renamed from: g */
    private int f4238g;

    /* renamed from: h */
    private boolean f4239h;

    /* renamed from: i */
    private boolean f4240i;

    /* renamed from: j */
    private final Runnable f4241j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0829c implements InterfaceC0843j {

        /* renamed from: r */
        final InterfaceC0845l f4242r;

        LifecycleBoundObserver(InterfaceC0845l interfaceC0845l, InterfaceC0852s<? super T> interfaceC0852s) {
            super(interfaceC0852s);
            this.f4242r = interfaceC0845l;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0829c
        /* renamed from: b */
        void mo4868b() {
            this.f4242r.mo583f().mo4891c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0829c
        /* renamed from: d */
        boolean mo4869d(InterfaceC0845l interfaceC0845l) {
            return this.f4242r == interfaceC0845l;
        }

        @Override // androidx.lifecycle.InterfaceC0843j
        /* renamed from: e */
        public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
            AbstractC0839f.c mo4890b = this.f4242r.mo583f().mo4890b();
            if (mo4890b == AbstractC0839f.c.DESTROYED) {
                LiveData.this.mo4866n(this.f4246n);
                return;
            }
            AbstractC0839f.c cVar = null;
            while (cVar != mo4890b) {
                m4871a(mo4870f());
                cVar = mo4890b;
                mo4890b = this.f4242r.mo583f().mo4890b();
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0829c
        /* renamed from: f */
        boolean mo4870f() {
            return this.f4242r.mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public class RunnableC0827a implements Runnable {
        RunnableC0827a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4232a) {
                obj = LiveData.this.f4237f;
                LiveData.this.f4237f = LiveData.f4231k;
            }
            LiveData.this.mo4867o(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes.dex */
    public class C0828b extends LiveData<T>.AbstractC0829c {
        C0828b(InterfaceC0852s<? super T> interfaceC0852s) {
            super(interfaceC0852s);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0829c
        /* renamed from: f */
        boolean mo4870f() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes.dex */
    public abstract class AbstractC0829c {

        /* renamed from: n */
        final InterfaceC0852s<? super T> f4246n;

        /* renamed from: o */
        boolean f4247o;

        /* renamed from: p */
        int f4248p = -1;

        AbstractC0829c(InterfaceC0852s<? super T> interfaceC0852s) {
            this.f4246n = interfaceC0852s;
        }

        /* renamed from: a */
        void m4871a(boolean z10) {
            if (z10 == this.f4247o) {
                return;
            }
            this.f4247o = z10;
            LiveData.this.m4857c(z10 ? 1 : -1);
            if (this.f4247o) {
                LiveData.this.m4858e(this);
            }
        }

        /* renamed from: b */
        void mo4868b() {
        }

        /* renamed from: d */
        boolean mo4869d(InterfaceC0845l interfaceC0845l) {
            return false;
        }

        /* renamed from: f */
        abstract boolean mo4870f();
    }

    public LiveData(T t10) {
        this.f4232a = new Object();
        this.f4233b = new C3912b<>();
        this.f4234c = 0;
        this.f4237f = f4231k;
        this.f4241j = new RunnableC0827a();
        this.f4236e = t10;
        this.f4238g = 0;
    }

    /* renamed from: b */
    static void m4855b(String str) {
        if (C3853a.m16278d().mo16280b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: d */
    private void m4856d(LiveData<T>.AbstractC0829c abstractC0829c) {
        if (abstractC0829c.f4247o) {
            if (!abstractC0829c.mo4870f()) {
                abstractC0829c.m4871a(false);
                return;
            }
            int i10 = abstractC0829c.f4248p;
            int i11 = this.f4238g;
            if (i10 >= i11) {
                return;
            }
            abstractC0829c.f4248p = i11;
            abstractC0829c.f4246n.mo1522a((Object) this.f4236e);
        }
    }

    /* renamed from: c */
    void m4857c(int i10) {
        int i11 = this.f4234c;
        this.f4234c = i10 + i11;
        if (this.f4235d) {
            return;
        }
        this.f4235d = true;
        while (true) {
            try {
                int i12 = this.f4234c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    mo4863k();
                } else if (z11) {
                    mo4864l();
                }
                i11 = i12;
            } finally {
                this.f4235d = false;
            }
        }
    }

    /* renamed from: e */
    void m4858e(LiveData<T>.AbstractC0829c abstractC0829c) {
        if (this.f4239h) {
            this.f4240i = true;
            return;
        }
        this.f4239h = true;
        do {
            this.f4240i = false;
            if (abstractC0829c != null) {
                m4856d(abstractC0829c);
                abstractC0829c = null;
            } else {
                C3912b<InterfaceC0852s<? super T>, LiveData<T>.AbstractC0829c>.d m16584i = this.f4233b.m16584i();
                while (m16584i.hasNext()) {
                    m4856d((AbstractC0829c) m16584i.next().getValue());
                    if (this.f4240i) {
                        break;
                    }
                }
            }
        } while (this.f4240i);
        this.f4239h = false;
    }

    /* renamed from: f */
    public T mo1579f() {
        T t10 = (T) this.f4236e;
        if (t10 != f4231k) {
            return t10;
        }
        return null;
    }

    /* renamed from: g */
    public int m4859g() {
        return this.f4238g;
    }

    /* renamed from: h */
    public boolean m4860h() {
        return this.f4234c > 0;
    }

    /* renamed from: i */
    public void m4861i(InterfaceC0845l interfaceC0845l, InterfaceC0852s<? super T> interfaceC0852s) {
        m4855b("observe");
        if (interfaceC0845l.mo583f().mo4890b() == AbstractC0839f.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0845l, interfaceC0852s);
        LiveData<T>.AbstractC0829c mo16580m = this.f4233b.mo16580m(interfaceC0852s, lifecycleBoundObserver);
        if (mo16580m != null && !mo16580m.mo4869d(interfaceC0845l)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo16580m != null) {
            return;
        }
        interfaceC0845l.mo583f().mo4889a(lifecycleBoundObserver);
    }

    /* renamed from: j */
    public void m4862j(InterfaceC0852s<? super T> interfaceC0852s) {
        m4855b("observeForever");
        C0828b c0828b = new C0828b(interfaceC0852s);
        LiveData<T>.AbstractC0829c mo16580m = this.f4233b.mo16580m(interfaceC0852s, c0828b);
        if (mo16580m instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo16580m != null) {
            return;
        }
        c0828b.m4871a(true);
    }

    /* renamed from: k */
    protected void mo4863k() {
    }

    /* renamed from: l */
    protected void mo4864l() {
    }

    /* renamed from: m */
    public void mo4865m(T t10) {
        boolean z10;
        synchronized (this.f4232a) {
            z10 = this.f4237f == f4231k;
            this.f4237f = t10;
        }
        if (z10) {
            C3853a.m16278d().mo16281c(this.f4241j);
        }
    }

    /* renamed from: n */
    public void mo4866n(InterfaceC0852s<? super T> interfaceC0852s) {
        m4855b("removeObserver");
        LiveData<T>.AbstractC0829c mo16581o = this.f4233b.mo16581o(interfaceC0852s);
        if (mo16581o == null) {
            return;
        }
        mo16581o.mo4868b();
        mo16581o.m4871a(false);
    }

    /* renamed from: o */
    public void mo4867o(T t10) {
        m4855b("setValue");
        this.f4238g++;
        this.f4236e = t10;
        m4858e(null);
    }

    public LiveData() {
        this.f4232a = new Object();
        this.f4233b = new C3912b<>();
        this.f4234c = 0;
        Object obj = f4231k;
        this.f4237f = obj;
        this.f4241j = new RunnableC0827a();
        this.f4236e = obj;
        this.f4238g = -1;
    }
}
