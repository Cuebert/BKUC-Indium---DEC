package p095h2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p003a2.AbstractC0014i;
import p003a2.AbstractC0020o;
import p003a2.C0013h;
import p016b2.AbstractC0974f;
import p016b2.AbstractC0975g;
import p016b2.InterfaceC0973e;
import p016b2.InterfaceC0981m;
import p042d2.C2960a;
import p042d2.C2962c;
import p056e2.C3061a;
import p109i2.AbstractC3489k;
import p109i2.InterfaceC3473c;
import p109i2.InterfaceC3475d;
import p123j2.C3594a;
import p123j2.InterfaceC3595b;
import p136k2.InterfaceC3749a;
import p307y1.C5593b;

/* renamed from: h2.r */
/* loaded from: classes.dex */
public class C3384r {

    /* renamed from: a */
    private final Context f14170a;

    /* renamed from: b */
    private final InterfaceC0973e f14171b;

    /* renamed from: c */
    private final InterfaceC3475d f14172c;

    /* renamed from: d */
    private final InterfaceC3390x f14173d;

    /* renamed from: e */
    private final Executor f14174e;

    /* renamed from: f */
    private final InterfaceC3595b f14175f;

    /* renamed from: g */
    private final InterfaceC3749a f14176g;

    /* renamed from: h */
    private final InterfaceC3749a f14177h;

    /* renamed from: i */
    private final InterfaceC3473c f14178i;

    public C3384r(Context context, InterfaceC0973e interfaceC0973e, InterfaceC3475d interfaceC3475d, InterfaceC3390x interfaceC3390x, Executor executor, InterfaceC3595b interfaceC3595b, InterfaceC3749a interfaceC3749a, InterfaceC3749a interfaceC3749a2, InterfaceC3473c interfaceC3473c) {
        this.f14170a = context;
        this.f14171b = interfaceC0973e;
        this.f14172c = interfaceC3475d;
        this.f14173d = interfaceC3390x;
        this.f14174e = executor;
        this.f14175f = interfaceC3595b;
        this.f14176g = interfaceC3749a;
        this.f14177h = interfaceC3749a2;
        this.f14178i = interfaceC3473c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m14921l(AbstractC0020o abstractC0020o) {
        return Boolean.valueOf(this.f14172c.mo15211w(abstractC0020o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m14922m(AbstractC0020o abstractC0020o) {
        return this.f14172c.mo15210v(abstractC0020o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m14923n(Iterable iterable, AbstractC0020o abstractC0020o, long j10) {
        this.f14172c.mo15207Z(iterable);
        this.f14172c.mo15212y(abstractC0020o, this.f14176g.mo15955a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m14924o(Iterable iterable) {
        this.f14172c.mo15209m(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m14925p() {
        this.f14178i.mo15202i();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m14926q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f14178i.mo15201c(((Integer) r0.getValue()).intValue(), C2962c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m14927r(AbstractC0020o abstractC0020o, long j10) {
        this.f14172c.mo15212y(abstractC0020o, this.f14176g.mo15955a() + j10);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m14928s(AbstractC0020o abstractC0020o, int i10) {
        this.f14173d.mo14897a(abstractC0020o, i10 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m14929t(final AbstractC0020o abstractC0020o, final int i10, Runnable runnable) {
        try {
            try {
                InterfaceC3595b interfaceC3595b = this.f14175f;
                final InterfaceC3475d interfaceC3475d = this.f14172c;
                Objects.requireNonNull(interfaceC3475d);
                interfaceC3595b.mo15306e(new InterfaceC3595b.a() { // from class: h2.q
                    @Override // p123j2.InterfaceC3595b.a
                    /* renamed from: c */
                    public final Object mo14460c() {
                        return Integer.valueOf(InterfaceC3475d.this.mo15208j());
                    }
                });
                if (!m14931k()) {
                    this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.k
                        @Override // p123j2.InterfaceC3595b.a
                        /* renamed from: c */
                        public final Object mo14460c() {
                            Object m14928s;
                            m14928s = C3384r.this.m14928s(abstractC0020o, i10);
                            return m14928s;
                        }
                    });
                } else {
                    m14932u(abstractC0020o, i10);
                }
            } catch (C3594a unused) {
                this.f14173d.mo14897a(abstractC0020o, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC0014i m14930j(InterfaceC0981m interfaceC0981m) {
        InterfaceC3595b interfaceC3595b = this.f14175f;
        final InterfaceC3473c interfaceC3473c = this.f14178i;
        Objects.requireNonNull(interfaceC3473c);
        return interfaceC0981m.mo6175a(AbstractC0014i.m130a().mo98i(this.f14176g.mo15955a()).mo100k(this.f14177h.mo15955a()).mo99j("GDT_CLIENT_METRICS").mo97h(new C0013h(C5593b.m20616b("proto"), ((C2960a) interfaceC3595b.mo15306e(new InterfaceC3595b.a() { // from class: h2.p
            @Override // p123j2.InterfaceC3595b.a
            /* renamed from: c */
            public final Object mo14460c() {
                return InterfaceC3473c.this.mo15200b();
            }
        })).m13393f())).mo93d());
    }

    /* renamed from: k */
    boolean m14931k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f14170a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: u */
    public AbstractC0975g m14932u(final AbstractC0020o abstractC0020o, int i10) {
        AbstractC0975g mo6176b;
        InterfaceC0981m mo6157a = this.f14171b.mo6157a(abstractC0020o.mo112b());
        long j10 = 0;
        AbstractC0975g m6161e = AbstractC0975g.m6161e(0L);
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.i
                @Override // p123j2.InterfaceC3595b.a
                /* renamed from: c */
                public final Object mo14460c() {
                    Boolean m14921l;
                    m14921l = C3384r.this.m14921l(abstractC0020o);
                    return m14921l;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.j
                    @Override // p123j2.InterfaceC3595b.a
                    /* renamed from: c */
                    public final Object mo14460c() {
                        Iterable m14922m;
                        m14922m = C3384r.this.m14922m(abstractC0020o);
                        return m14922m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m6161e;
                }
                if (mo6157a == null) {
                    C3061a.m13516b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC0020o);
                    mo6176b = AbstractC0975g.m6159a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC3489k) it.next()).mo15197b());
                    }
                    if (abstractC0020o.m149e()) {
                        arrayList.add(m14930j(mo6157a));
                    }
                    mo6176b = mo6157a.mo6176b(AbstractC0974f.m6158a().mo6149b(arrayList).mo6150c(abstractC0020o.mo113c()).mo6148a());
                }
                m6161e = mo6176b;
                if (m6161e.mo6152c() == AbstractC0975g.a.TRANSIENT_ERROR) {
                    this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.n
                        @Override // p123j2.InterfaceC3595b.a
                        /* renamed from: c */
                        public final Object mo14460c() {
                            Object m14923n;
                            m14923n = C3384r.this.m14923n(iterable, abstractC0020o, j11);
                            return m14923n;
                        }
                    });
                    this.f14173d.mo14898b(abstractC0020o, i10 + 1, true);
                    return m6161e;
                }
                this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.m
                    @Override // p123j2.InterfaceC3595b.a
                    /* renamed from: c */
                    public final Object mo14460c() {
                        Object m14924o;
                        m14924o = C3384r.this.m14924o(iterable);
                        return m14924o;
                    }
                });
                if (m6161e.mo6152c() == AbstractC0975g.a.OK) {
                    j10 = Math.max(j11, m6161e.mo6151b());
                    if (abstractC0020o.m149e()) {
                        this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.g
                            @Override // p123j2.InterfaceC3595b.a
                            /* renamed from: c */
                            public final Object mo14460c() {
                                Object m14925p;
                                m14925p = C3384r.this.m14925p();
                                return m14925p;
                            }
                        });
                    }
                } else if (m6161e.mo6152c() == AbstractC0975g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String mo91j = ((AbstractC3489k) it2.next()).mo15197b().mo91j();
                        if (!hashMap.containsKey(mo91j)) {
                            hashMap.put(mo91j, 1);
                        } else {
                            hashMap.put(mo91j, Integer.valueOf(((Integer) hashMap.get(mo91j)).intValue() + 1));
                        }
                    }
                    this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.o
                        @Override // p123j2.InterfaceC3595b.a
                        /* renamed from: c */
                        public final Object mo14460c() {
                            Object m14926q;
                            m14926q = C3384r.this.m14926q(hashMap);
                            return m14926q;
                        }
                    });
                }
            }
            this.f14175f.mo15306e(new InterfaceC3595b.a() { // from class: h2.l
                @Override // p123j2.InterfaceC3595b.a
                /* renamed from: c */
                public final Object mo14460c() {
                    Object m14927r;
                    m14927r = C3384r.this.m14927r(abstractC0020o, j11);
                    return m14927r;
                }
            });
            return m6161e;
        }
    }

    /* renamed from: v */
    public void m14933v(final AbstractC0020o abstractC0020o, final int i10, final Runnable runnable) {
        this.f14174e.execute(new Runnable() { // from class: h2.h
            @Override // java.lang.Runnable
            public final void run() {
                C3384r.this.m14929t(abstractC0020o, i10, runnable);
            }
        });
    }
}
