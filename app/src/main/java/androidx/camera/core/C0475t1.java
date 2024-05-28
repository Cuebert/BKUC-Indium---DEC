package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.AbstractC0418i0;
import androidx.core.util.C0654h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p279w.AbstractC5032h;
import p279w.InterfaceC5034h1;
import p279w.InterfaceC5068q;
import p318z.C5934b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.t1 */
/* loaded from: classes.dex */
public class C0475t1 implements InterfaceC5034h1, AbstractC0418i0.a {

    /* renamed from: a */
    private final Object f2101a;

    /* renamed from: b */
    private AbstractC5032h f2102b;

    /* renamed from: c */
    private InterfaceC5034h1.a f2103c;

    /* renamed from: d */
    private boolean f2104d;

    /* renamed from: e */
    private final InterfaceC5034h1 f2105e;

    /* renamed from: f */
    InterfaceC5034h1.a f2106f;

    /* renamed from: g */
    private Executor f2107g;

    /* renamed from: h */
    private final LongSparseArray<InterfaceC0419i1> f2108h;

    /* renamed from: i */
    private final LongSparseArray<InterfaceC0443l1> f2109i;

    /* renamed from: j */
    private int f2110j;

    /* renamed from: k */
    private final List<InterfaceC0443l1> f2111k;

    /* renamed from: l */
    private final List<InterfaceC0443l1> f2112l;

    /* renamed from: androidx.camera.core.t1$a */
    /* loaded from: classes.dex */
    class a extends AbstractC5032h {
        a() {
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            super.mo1399b(interfaceC5068q);
            C0475t1.this.m2245u(interfaceC5068q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0475t1(int i10, int i11, int i12, int i13) {
        this(m2236l(i10, i11, i12, i13));
    }

    /* renamed from: l */
    private static InterfaceC5034h1 m2236l(int i10, int i11, int i12, int i13) {
        return new C0394d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    /* renamed from: m */
    private void m2237m(InterfaceC0443l1 interfaceC0443l1) {
        synchronized (this.f2101a) {
            int indexOf = this.f2111k.indexOf(interfaceC0443l1);
            if (indexOf >= 0) {
                this.f2111k.remove(indexOf);
                int i10 = this.f2110j;
                if (indexOf <= i10) {
                    this.f2110j = i10 - 1;
                }
            }
            this.f2112l.remove(interfaceC0443l1);
        }
    }

    /* renamed from: n */
    private void m2238n(C0448m2 c0448m2) {
        final InterfaceC5034h1.a aVar;
        Executor executor;
        synchronized (this.f2101a) {
            aVar = null;
            if (this.f2111k.size() < mo1876h()) {
                c0448m2.m2035b(this);
                this.f2111k.add(c0448m2);
                aVar = this.f2106f;
                executor = this.f2107g;
            } else {
                C0463q1.m2202a("TAG", "Maximum image number reached.");
                c0448m2.close();
                executor = null;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0475t1.this.m2239q(aVar);
                    }
                });
            } else {
                aVar.mo1382a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m2239q(InterfaceC5034h1.a aVar) {
        aVar.mo1382a(this);
    }

    /* renamed from: s */
    private void m2241s() {
        synchronized (this.f2101a) {
            for (int size = this.f2108h.size() - 1; size >= 0; size--) {
                InterfaceC0419i1 valueAt = this.f2108h.valueAt(size);
                long mo2029c = valueAt.mo2029c();
                InterfaceC0443l1 interfaceC0443l1 = this.f2109i.get(mo2029c);
                if (interfaceC0443l1 != null) {
                    this.f2109i.remove(mo2029c);
                    this.f2108h.removeAt(size);
                    m2238n(new C0448m2(interfaceC0443l1, valueAt));
                }
            }
            m2242t();
        }
    }

    /* renamed from: t */
    private void m2242t() {
        synchronized (this.f2101a) {
            if (this.f2109i.size() != 0 && this.f2108h.size() != 0) {
                Long valueOf = Long.valueOf(this.f2109i.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f2108h.keyAt(0));
                C0654h.m3462a(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f2109i.size() - 1; size >= 0; size--) {
                        if (this.f2109i.keyAt(size) < valueOf2.longValue()) {
                            this.f2109i.valueAt(size).close();
                            this.f2109i.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f2108h.size() - 1; size2 >= 0; size2--) {
                        if (this.f2108h.keyAt(size2) < valueOf.longValue()) {
                            this.f2108h.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: a */
    public Surface mo1870a() {
        Surface mo1870a;
        synchronized (this.f2101a) {
            mo1870a = this.f2105e.mo1870a();
        }
        return mo1870a;
    }

    @Override // androidx.camera.core.AbstractC0418i0.a
    /* renamed from: b */
    public void mo1997b(InterfaceC0443l1 interfaceC0443l1) {
        synchronized (this.f2101a) {
            m2237m(interfaceC0443l1);
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: c */
    public InterfaceC0443l1 mo1871c() {
        synchronized (this.f2101a) {
            if (this.f2111k.isEmpty()) {
                return null;
            }
            if (this.f2110j < this.f2111k.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f2111k.size() - 1; i10++) {
                    if (!this.f2112l.contains(this.f2111k.get(i10))) {
                        arrayList.add(this.f2111k.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0443l1) it.next()).close();
                }
                int size = this.f2111k.size() - 1;
                List<InterfaceC0443l1> list = this.f2111k;
                this.f2110j = size + 1;
                InterfaceC0443l1 interfaceC0443l1 = list.get(size);
                this.f2112l.add(interfaceC0443l1);
                return interfaceC0443l1;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // p279w.InterfaceC5034h1
    public void close() {
        synchronized (this.f2101a) {
            if (this.f2104d) {
                return;
            }
            Iterator it = new ArrayList(this.f2111k).iterator();
            while (it.hasNext()) {
                ((InterfaceC0443l1) it.next()).close();
            }
            this.f2111k.clear();
            this.f2105e.close();
            this.f2104d = true;
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: d */
    public int mo1872d() {
        int mo1872d;
        synchronized (this.f2101a) {
            mo1872d = this.f2105e.mo1872d();
        }
        return mo1872d;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: e */
    public void mo1873e(InterfaceC5034h1.a aVar, Executor executor) {
        synchronized (this.f2101a) {
            this.f2106f = (InterfaceC5034h1.a) C0654h.m3467f(aVar);
            this.f2107g = (Executor) C0654h.m3467f(executor);
            this.f2105e.mo1873e(this.f2103c, executor);
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: f */
    public void mo1874f() {
        synchronized (this.f2101a) {
            this.f2106f = null;
            this.f2107g = null;
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: g */
    public int mo1875g() {
        int mo1875g;
        synchronized (this.f2101a) {
            mo1875g = this.f2105e.mo1875g();
        }
        return mo1875g;
    }

    @Override // p279w.InterfaceC5034h1
    public int getHeight() {
        int height;
        synchronized (this.f2101a) {
            height = this.f2105e.getHeight();
        }
        return height;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: h */
    public int mo1876h() {
        int mo1876h;
        synchronized (this.f2101a) {
            mo1876h = this.f2105e.mo1876h();
        }
        return mo1876h;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: i */
    public InterfaceC0443l1 mo1877i() {
        synchronized (this.f2101a) {
            if (this.f2111k.isEmpty()) {
                return null;
            }
            if (this.f2110j < this.f2111k.size()) {
                List<InterfaceC0443l1> list = this.f2111k;
                int i10 = this.f2110j;
                this.f2110j = i10 + 1;
                InterfaceC0443l1 interfaceC0443l1 = list.get(i10);
                this.f2112l.add(interfaceC0443l1);
                return interfaceC0443l1;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public AbstractC5032h m2243o() {
        return this.f2102b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m2240r(InterfaceC5034h1 interfaceC5034h1) {
        synchronized (this.f2101a) {
            if (this.f2104d) {
                return;
            }
            int i10 = 0;
            do {
                InterfaceC0443l1 interfaceC0443l1 = null;
                try {
                    interfaceC0443l1 = interfaceC5034h1.mo1877i();
                    if (interfaceC0443l1 != null) {
                        i10++;
                        this.f2109i.put(interfaceC0443l1.mo1857q().mo2029c(), interfaceC0443l1);
                        m2241s();
                    }
                } catch (IllegalStateException e10) {
                    C0463q1.m2203b("MetadataImageReader", "Failed to acquire next image.", e10);
                }
                if (interfaceC0443l1 == null) {
                    break;
                }
            } while (i10 < interfaceC5034h1.mo1876h());
        }
    }

    /* renamed from: u */
    void m2245u(InterfaceC5068q interfaceC5068q) {
        synchronized (this.f2101a) {
            if (this.f2104d) {
                return;
            }
            this.f2108h.put(interfaceC5068q.mo1385c(), new C5934b(interfaceC5068q));
            m2241s();
        }
    }

    C0475t1(InterfaceC5034h1 interfaceC5034h1) {
        this.f2101a = new Object();
        this.f2102b = new a();
        this.f2103c = new InterfaceC5034h1.a() { // from class: androidx.camera.core.s1
            @Override // p279w.InterfaceC5034h1.a
            /* renamed from: a */
            public final void mo1382a(InterfaceC5034h1 interfaceC5034h12) {
                C0475t1.this.m2240r(interfaceC5034h12);
            }
        };
        this.f2104d = false;
        this.f2108h = new LongSparseArray<>();
        this.f2109i = new LongSparseArray<>();
        this.f2112l = new ArrayList();
        this.f2105e = interfaceC5034h1;
        this.f2110j = 0;
        this.f2111k = new ArrayList(mo1876h());
    }
}
