package p279w;

import androidx.core.util.C0654h;
import androidx.lifecycle.C0851r;
import androidx.lifecycle.InterfaceC0852s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p279w.C5058n1;
import p279w.InterfaceC5077s1;
import p292x.C5493a;

/* renamed from: w.n1 */
/* loaded from: classes.dex */
public final class C5058n1<T> implements InterfaceC5077s1<T> {

    /* renamed from: a */
    final C0851r<b<T>> f19261a = new C0851r<>();

    /* renamed from: b */
    private final Map<InterfaceC5077s1.a<? super T>, a<T>> f19262b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.n1$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements InterfaceC0852s<b<T>> {

        /* renamed from: a */
        final AtomicBoolean f19263a = new AtomicBoolean(true);

        /* renamed from: b */
        final InterfaceC5077s1.a<? super T> f19264b;

        /* renamed from: c */
        final Executor f19265c;

        a(Executor executor, InterfaceC5077s1.a<? super T> aVar) {
            this.f19265c = executor;
            this.f19264b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m19640d(b bVar) {
            if (this.f19263a.get()) {
                if (bVar.m19644a()) {
                    this.f19264b.mo2422a((Object) bVar.m19646d());
                } else {
                    C0654h.m3467f(bVar.m19645c());
                    this.f19264b.onError(bVar.m19645c());
                }
            }
        }

        /* renamed from: c */
        void m19641c() {
            this.f19263a.set(false);
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo1522a(final b<T> bVar) {
            this.f19265c.execute(new Runnable() { // from class: w.m1
                @Override // java.lang.Runnable
                public final void run() {
                    C5058n1.a.this.m19640d(bVar);
                }
            });
        }
    }

    /* renamed from: w.n1$b */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        private final T f19266a;

        /* renamed from: b */
        private final Throwable f19267b;

        private b(T t10, Throwable th) {
            this.f19266a = t10;
            this.f19267b = th;
        }

        /* renamed from: b */
        static <T> b<T> m19643b(T t10) {
            return new b<>(t10, null);
        }

        /* renamed from: a */
        public boolean m19644a() {
            return this.f19267b == null;
        }

        /* renamed from: c */
        public Throwable m19645c() {
            return this.f19267b;
        }

        /* renamed from: d */
        public T m19646d() {
            if (m19644a()) {
                return this.f19266a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (m19644a()) {
                str = "Value: " + this.f19266a;
            } else {
                str = "Error: " + this.f19267b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m19634e(a aVar, a aVar2) {
        if (aVar != null) {
            this.f19261a.mo4866n(aVar);
        }
        this.f19261a.m4862j(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m19635f(a aVar) {
        this.f19261a.mo4866n(aVar);
    }

    @Override // p279w.InterfaceC5077s1
    /* renamed from: a */
    public void mo19636a(Executor executor, InterfaceC5077s1.a<? super T> aVar) {
        synchronized (this.f19262b) {
            final a<T> aVar2 = this.f19262b.get(aVar);
            if (aVar2 != null) {
                aVar2.m19641c();
            }
            final a<T> aVar3 = new a<>(executor, aVar);
            this.f19262b.put(aVar, aVar3);
            C5493a.m20222d().execute(new Runnable() { // from class: w.l1
                @Override // java.lang.Runnable
                public final void run() {
                    C5058n1.this.m19634e(aVar2, aVar3);
                }
            });
        }
    }

    @Override // p279w.InterfaceC5077s1
    /* renamed from: b */
    public void mo19637b(InterfaceC5077s1.a<? super T> aVar) {
        synchronized (this.f19262b) {
            final a<T> remove = this.f19262b.remove(aVar);
            if (remove != null) {
                remove.m19641c();
                C5493a.m20222d().execute(new Runnable() { // from class: w.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5058n1.this.m19635f(remove);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public void m19638g(T t10) {
        this.f19261a.mo4865m(b.m19643b(t10));
    }
}
