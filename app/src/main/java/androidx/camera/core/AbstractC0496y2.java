package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.core.util.C0654h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p279w.AbstractC5073r0;
import p279w.C5015c2;
import p279w.C5070q1;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5026f1;
import p279w.InterfaceC5061o0;
import p279w.InterfaceC5063o2;
import p279w.InterfaceC5067p2;
import p279w.InterfaceC5093y;
import p318z.InterfaceC5941i;

/* renamed from: androidx.camera.core.y2 */
/* loaded from: classes.dex */
public abstract class AbstractC0496y2 {

    /* renamed from: d */
    private InterfaceC5063o2<?> f2199d;

    /* renamed from: e */
    private InterfaceC5063o2<?> f2200e;

    /* renamed from: f */
    private InterfaceC5063o2<?> f2201f;

    /* renamed from: g */
    private Size f2202g;

    /* renamed from: h */
    private InterfaceC5063o2<?> f2203h;

    /* renamed from: i */
    private Rect f2204i;

    /* renamed from: j */
    private InterfaceC5017d0 f2205j;

    /* renamed from: a */
    private final Set<d> f2196a = new HashSet();

    /* renamed from: b */
    private final Object f2197b = new Object();

    /* renamed from: c */
    private c f2198c = c.INACTIVE;

    /* renamed from: k */
    private C5015c2 f2206k = C5015c2.m19490a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.y2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2207a;

        static {
            int[] iArr = new int[c.values().length];
            f2207a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2207a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.camera.core.y2$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m2321a();

        /* renamed from: b */
        void m2322b(InterfaceC0465r interfaceC0465r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.y2$c */
    /* loaded from: classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.y2$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: c */
        void mo1452c(AbstractC0496y2 abstractC0496y2);

        /* renamed from: e */
        void mo1456e(AbstractC0496y2 abstractC0496y2);

        /* renamed from: i */
        void mo1463i(AbstractC0496y2 abstractC0496y2);

        /* renamed from: j */
        void mo1465j(AbstractC0496y2 abstractC0496y2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0496y2(InterfaceC5063o2<?> interfaceC5063o2) {
        this.f2200e = interfaceC5063o2;
        this.f2201f = interfaceC5063o2;
    }

    /* renamed from: F */
    private void m2295F(d dVar) {
        this.f2196a.remove(dVar);
    }

    /* renamed from: a */
    private void m2296a(d dVar) {
        this.f2196a.add(dVar);
    }

    /* renamed from: A */
    public void mo1916A() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w.o2<?>, w.o2] */
    /* renamed from: B */
    protected InterfaceC5063o2<?> mo1970B(InterfaceC5009b0 interfaceC5009b0, InterfaceC5063o2.a<?, ?, ?> aVar) {
        return aVar.mo1927b();
    }

    /* renamed from: C */
    public void m2297C() {
        mo1979y();
    }

    /* renamed from: D */
    public void mo1917D() {
    }

    /* renamed from: E */
    protected abstract Size mo1918E(Size size);

    /* renamed from: G */
    public void mo1971G(Matrix matrix) {
    }

    /* renamed from: H */
    public void mo2142H(Rect rect) {
        this.f2204i = rect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public void m2298I(C5015c2 c5015c2) {
        this.f2206k = c5015c2;
        for (AbstractC5073r0 abstractC5073r0 : c5015c2.m19499j()) {
            if (abstractC5073r0.m19678e() == null) {
                abstractC5073r0.m19684o(getClass());
            }
        }
    }

    /* renamed from: J */
    public void m2299J(Size size) {
        this.f2202g = mo1918E(size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public int m2300b() {
        return ((InterfaceC5026f1) this.f2201f).mo19463A(-1);
    }

    /* renamed from: c */
    public Size m2301c() {
        return this.f2202g;
    }

    /* renamed from: d */
    public InterfaceC5017d0 m2302d() {
        InterfaceC5017d0 interfaceC5017d0;
        synchronized (this.f2197b) {
            interfaceC5017d0 = this.f2205j;
        }
        return interfaceC5017d0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public InterfaceC5093y m2303e() {
        synchronized (this.f2197b) {
            InterfaceC5017d0 interfaceC5017d0 = this.f2205j;
            if (interfaceC5017d0 == null) {
                return InterfaceC5093y.f19351a;
            }
            return interfaceC5017d0.mo1468l();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public String m2304f() {
        return ((InterfaceC5017d0) C0654h.m3468g(m2302d(), "No camera attached to use case: " + this)).mo1461h().mo1569c();
    }

    /* renamed from: g */
    public InterfaceC5063o2<?> m2305g() {
        return this.f2201f;
    }

    /* renamed from: h */
    public abstract InterfaceC5063o2<?> mo1921h(boolean z10, InterfaceC5067p2 interfaceC5067p2);

    /* renamed from: i */
    public int m2306i() {
        return this.f2201f.mo1374q();
    }

    /* renamed from: j */
    public String m2307j() {
        return this.f2201f.mo1363B("<UnknownUseCase-" + hashCode() + ">");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public int m2308k(InterfaceC5017d0 interfaceC5017d0) {
        return interfaceC5017d0.mo1461h().mo1571e(m2310m());
    }

    /* renamed from: l */
    public C5015c2 m2309l() {
        return this.f2206k;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: m */
    protected int m2310m() {
        return ((InterfaceC5026f1) this.f2201f).mo19464E(0);
    }

    /* renamed from: n */
    public abstract InterfaceC5063o2.a<?, ?, ?> mo1922n(InterfaceC5061o0 interfaceC5061o0);

    /* renamed from: o */
    public Rect m2311o() {
        return this.f2204i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public boolean m2312p(String str) {
        if (m2302d() == null) {
            return false;
        }
        return Objects.equals(str, m2304f());
    }

    /* renamed from: q */
    public InterfaceC5063o2<?> m2313q(InterfaceC5009b0 interfaceC5009b0, InterfaceC5063o2<?> interfaceC5063o2, InterfaceC5063o2<?> interfaceC5063o22) {
        C5070q1 m19660L;
        if (interfaceC5063o22 != null) {
            m19660L = C5070q1.m19661M(interfaceC5063o22);
            m19660L.m19662N(InterfaceC5941i.f21844v);
        } else {
            m19660L = C5070q1.m19660L();
        }
        for (InterfaceC5061o0.a<?> aVar : this.f2200e.mo1367c()) {
            m19660L.mo19658G(aVar, this.f2200e.mo1368d(aVar), this.f2200e.mo1366b(aVar));
        }
        if (interfaceC5063o2 != null) {
            for (InterfaceC5061o0.a<?> aVar2 : interfaceC5063o2.mo1367c()) {
                if (!aVar2.mo19483c().equals(InterfaceC5941i.f21844v.mo19483c())) {
                    m19660L.mo19658G(aVar2, interfaceC5063o2.mo1368d(aVar2), interfaceC5063o2.mo1366b(aVar2));
                }
            }
        }
        if (m19660L.mo1369e(InterfaceC5026f1.f19169j)) {
            InterfaceC5061o0.a<Integer> aVar3 = InterfaceC5026f1.f19166g;
            if (m19660L.mo1369e(aVar3)) {
                m19660L.m19662N(aVar3);
            }
        }
        return mo1970B(interfaceC5009b0, mo1922n(m19660L));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m2314r() {
        this.f2198c = c.ACTIVE;
        m2317u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m2315s() {
        this.f2198c = c.INACTIVE;
        m2317u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m2316t() {
        Iterator<d> it = this.f2196a.iterator();
        while (it.hasNext()) {
            it.next().mo1456e(this);
        }
    }

    /* renamed from: u */
    public final void m2317u() {
        int i10 = a.f2207a[this.f2198c.ordinal()];
        if (i10 == 1) {
            Iterator<d> it = this.f2196a.iterator();
            while (it.hasNext()) {
                it.next().mo1463i(this);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            Iterator<d> it2 = this.f2196a.iterator();
            while (it2.hasNext()) {
                it2.next().mo1452c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final void m2318v() {
        Iterator<d> it = this.f2196a.iterator();
        while (it.hasNext()) {
            it.next().mo1465j(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: w */
    public void m2319w(InterfaceC5017d0 interfaceC5017d0, InterfaceC5063o2<?> interfaceC5063o2, InterfaceC5063o2<?> interfaceC5063o22) {
        synchronized (this.f2197b) {
            this.f2205j = interfaceC5017d0;
            m2296a(interfaceC5017d0);
        }
        this.f2199d = interfaceC5063o2;
        this.f2203h = interfaceC5063o22;
        InterfaceC5063o2<?> m2313q = m2313q(interfaceC5017d0.mo1461h(), this.f2199d, this.f2203h);
        this.f2201f = m2313q;
        b mo1364D = m2313q.mo1364D(null);
        if (mo1364D != null) {
            mo1364D.m2322b(interfaceC5017d0.mo1461h());
        }
        mo1923x();
    }

    /* renamed from: x */
    public void mo1923x() {
    }

    /* renamed from: y */
    protected void mo1979y() {
    }

    /* renamed from: z */
    public void m2320z(InterfaceC5017d0 interfaceC5017d0) {
        mo1916A();
        b mo1364D = this.f2201f.mo1364D(null);
        if (mo1364D != null) {
            mo1364D.m2321a();
        }
        synchronized (this.f2197b) {
            C0654h.m3462a(interfaceC5017d0 == this.f2205j);
            m2295F(this.f2205j);
            this.f2205j = null;
        }
        this.f2202g = null;
        this.f2204i = null;
        this.f2201f = this.f2200e;
        this.f2199d = null;
        this.f2203h = null;
    }
}
