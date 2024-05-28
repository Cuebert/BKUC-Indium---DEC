package androidx.camera.view;

import androidx.camera.core.C0463q1;
import androidx.camera.core.InterfaceC0465r;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.C0541c;
import androidx.lifecycle.C0851r;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p169n.InterfaceC4005a;
import p279w.AbstractC5032h;
import p279w.InterfaceC5009b0;
import p279w.InterfaceC5017d0;
import p279w.InterfaceC5068q;
import p279w.InterfaceC5077s1;
import p292x.C5493a;
import p305y.C5584d;
import p305y.C5586f;
import p305y.InterfaceC5581a;
import p305y.InterfaceC5583c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.view.e */
/* loaded from: classes.dex */
public final class C0518e implements InterfaceC5077s1.a<InterfaceC5017d0.a> {

    /* renamed from: a */
    private final InterfaceC5009b0 f2302a;

    /* renamed from: b */
    private final C0851r<PreviewView.EnumC0513g> f2303b;

    /* renamed from: c */
    private PreviewView.EnumC0513g f2304c;

    /* renamed from: d */
    private final AbstractC0524k f2305d;

    /* renamed from: e */
    InterfaceFutureC2565m<Void> f2306e;

    /* renamed from: f */
    private boolean f2307f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<Void> {

        /* renamed from: a */
        final /* synthetic */ List f2308a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC0465r f2309b;

        a(List list, InterfaceC0465r interfaceC0465r) {
            this.f2308a = list;
            this.f2309b = interfaceC0465r;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            C0518e.this.f2306e = null;
            if (this.f2308a.isEmpty()) {
                return;
            }
            Iterator it = this.f2308a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5009b0) this.f2309b).mo1568b((AbstractC5032h) it.next());
            }
            this.f2308a.clear();
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            C0518e.this.f2306e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.view.e$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC5032h {

        /* renamed from: a */
        final /* synthetic */ C0541c.a f2311a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC0465r f2312b;

        b(C0541c.a aVar, InterfaceC0465r interfaceC0465r) {
            this.f2311a = aVar;
            this.f2312b = interfaceC0465r;
        }

        @Override // p279w.AbstractC5032h
        /* renamed from: b */
        public void mo1399b(InterfaceC5068q interfaceC5068q) {
            this.f2311a.m2519c(null);
            ((InterfaceC5009b0) this.f2312b).mo1568b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0518e(InterfaceC5009b0 interfaceC5009b0, C0851r<PreviewView.EnumC0513g> c0851r, AbstractC0524k abstractC0524k) {
        this.f2302a = interfaceC5009b0;
        this.f2303b = c0851r;
        this.f2305d = abstractC0524k;
        synchronized (this) {
            this.f2304c = c0851r.mo1579f();
        }
    }

    /* renamed from: e */
    private void m2416e() {
        InterfaceFutureC2565m<Void> interfaceFutureC2565m = this.f2306e;
        if (interfaceFutureC2565m != null) {
            interfaceFutureC2565m.cancel(false);
            this.f2306e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ InterfaceFutureC2565m m2417g(Void r12) throws Exception {
        return this.f2305d.mo2453i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void m2418h(Void r12) {
        m2425l(PreviewView.EnumC0513g.STREAMING);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m2419i(InterfaceC0465r interfaceC0465r, List list, C0541c.a aVar) throws Exception {
        b bVar = new b(aVar, interfaceC0465r);
        list.add(bVar);
        ((InterfaceC5009b0) interfaceC0465r).mo1572f(C5493a.m20219a(), bVar);
        return "waitForCaptureResult";
    }

    /* renamed from: k */
    private void m2420k(InterfaceC0465r interfaceC0465r) {
        m2425l(PreviewView.EnumC0513g.IDLE);
        ArrayList arrayList = new ArrayList();
        C5584d m20499e = C5584d.m20496a(m2421m(interfaceC0465r, arrayList)).m20500f(new InterfaceC5581a() { // from class: androidx.camera.view.d
            @Override // p305y.InterfaceC5581a
            /* renamed from: a */
            public final InterfaceFutureC2565m mo1404a(Object obj) {
                InterfaceFutureC2565m m2417g;
                m2417g = C0518e.this.m2417g((Void) obj);
                return m2417g;
            }
        }, C5493a.m20219a()).m20499e(new InterfaceC4005a() { // from class: androidx.camera.view.c
            @Override // p169n.InterfaceC4005a
            /* renamed from: a */
            public final Object mo1403a(Object obj) {
                Void m2418h;
                m2418h = C0518e.this.m2418h((Void) obj);
                return m2418h;
            }
        }, C5493a.m20219a());
        this.f2306e = m20499e;
        C5586f.m20502b(m20499e, new a(arrayList, interfaceC0465r), C5493a.m20219a());
    }

    /* renamed from: m */
    private InterfaceFutureC2565m<Void> m2421m(final InterfaceC0465r interfaceC0465r, final List<AbstractC5032h> list) {
        return C0541c.m2515a(new C0541c.c() { // from class: androidx.camera.view.b
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m2419i;
                m2419i = C0518e.this.m2419i(interfaceC0465r, list, aVar);
                return m2419i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2423f() {
        m2416e();
    }

    @Override // p279w.InterfaceC5077s1.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo2422a(InterfaceC5017d0.a aVar) {
        if (aVar != InterfaceC5017d0.a.CLOSING && aVar != InterfaceC5017d0.a.CLOSED && aVar != InterfaceC5017d0.a.RELEASING && aVar != InterfaceC5017d0.a.RELEASED) {
            if ((aVar == InterfaceC5017d0.a.OPENING || aVar == InterfaceC5017d0.a.OPEN || aVar == InterfaceC5017d0.a.PENDING_OPEN) && !this.f2307f) {
                m2420k(this.f2302a);
                this.f2307f = true;
                return;
            }
            return;
        }
        m2425l(PreviewView.EnumC0513g.IDLE);
        if (this.f2307f) {
            this.f2307f = false;
            m2416e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m2425l(PreviewView.EnumC0513g enumC0513g) {
        synchronized (this) {
            if (this.f2304c.equals(enumC0513g)) {
                return;
            }
            this.f2304c = enumC0513g;
            C0463q1.m2202a("StreamStateObserver", "Update Preview stream state to " + enumC0513g);
            this.f2303b.mo4865m(enumC0513g);
        }
    }

    @Override // p279w.InterfaceC5077s1.a
    public void onError(Throwable th) {
        m2423f();
        m2425l(PreviewView.EnumC0513g.IDLE);
    }
}
