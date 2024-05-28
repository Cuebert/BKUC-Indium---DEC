package p266ub;

import ac.C0073c;
import ac.C0076f;
import ac.InterfaceC0074d;
import ac.InterfaceC0075e;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p205pb.AbstractRunnableC4283b;
import p205pb.C4286e;
import p266ub.C4916h;
import p291wb.C5492f;

/* renamed from: ub.f */
/* loaded from: classes.dex */
public final class C4914f implements Closeable {

    /* renamed from: M */
    private static final ExecutorService f18827M = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4286e.m17732I("OkHttp Http2Connection", true));

    /* renamed from: F */
    long f18833F;

    /* renamed from: H */
    final C4921m f18835H;

    /* renamed from: I */
    final Socket f18836I;

    /* renamed from: J */
    final C4918j f18837J;

    /* renamed from: K */
    final l f18838K;

    /* renamed from: L */
    final Set<Integer> f18839L;

    /* renamed from: n */
    final boolean f18840n;

    /* renamed from: o */
    final j f18841o;

    /* renamed from: q */
    final String f18843q;

    /* renamed from: r */
    int f18844r;

    /* renamed from: s */
    int f18845s;

    /* renamed from: t */
    private boolean f18846t;

    /* renamed from: u */
    private final ScheduledExecutorService f18847u;

    /* renamed from: v */
    private final ExecutorService f18848v;

    /* renamed from: w */
    final InterfaceC4920l f18849w;

    /* renamed from: p */
    final Map<Integer, C4917i> f18842p = new LinkedHashMap();

    /* renamed from: x */
    private long f18850x = 0;

    /* renamed from: y */
    private long f18851y = 0;

    /* renamed from: z */
    private long f18852z = 0;

    /* renamed from: A */
    private long f18828A = 0;

    /* renamed from: B */
    private long f18829B = 0;

    /* renamed from: C */
    private long f18830C = 0;

    /* renamed from: D */
    private long f18831D = 0;

    /* renamed from: E */
    long f18832E = 0;

    /* renamed from: G */
    C4921m f18834G = new C4921m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$a */
    /* loaded from: classes.dex */
    public class a extends AbstractRunnableC4283b {

        /* renamed from: o */
        final /* synthetic */ int f18853o;

        /* renamed from: p */
        final /* synthetic */ EnumC4910b f18854p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i10, EnumC4910b enumC4910b) {
            super(str, objArr);
            this.f18853o = i10;
            this.f18854p = enumC4910b;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            try {
                C4914f.this.m19216D0(this.f18853o, this.f18854p);
            } catch (IOException e10) {
                C4914f.this.m19207e0(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC4283b {

        /* renamed from: o */
        final /* synthetic */ int f18856o;

        /* renamed from: p */
        final /* synthetic */ long f18857p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f18856o = i10;
            this.f18857p = j10;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            try {
                C4914f.this.f18837J.m19302e0(this.f18856o, this.f18857p);
            } catch (IOException e10) {
                C4914f.this.m19207e0(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$c */
    /* loaded from: classes.dex */
    public class c extends AbstractRunnableC4283b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            C4914f.this.m19215C0(false, 2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$d */
    /* loaded from: classes.dex */
    public class d extends AbstractRunnableC4283b {

        /* renamed from: o */
        final /* synthetic */ int f18860o;

        /* renamed from: p */
        final /* synthetic */ List f18861p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f18860o = i10;
            this.f18861p = list;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            if (C4914f.this.f18849w.mo19312a(this.f18860o, this.f18861p)) {
                try {
                    C4914f.this.f18837J.m19297X(this.f18860o, EnumC4910b.CANCEL);
                    synchronized (C4914f.this) {
                        C4914f.this.f18839L.remove(Integer.valueOf(this.f18860o));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$e */
    /* loaded from: classes.dex */
    public class e extends AbstractRunnableC4283b {

        /* renamed from: o */
        final /* synthetic */ int f18863o;

        /* renamed from: p */
        final /* synthetic */ List f18864p;

        /* renamed from: q */
        final /* synthetic */ boolean f18865q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f18863o = i10;
            this.f18864p = list;
            this.f18865q = z10;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            boolean mo19313b = C4914f.this.f18849w.mo19313b(this.f18863o, this.f18864p, this.f18865q);
            if (mo19313b) {
                try {
                    C4914f.this.f18837J.m19297X(this.f18863o, EnumC4910b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (mo19313b || this.f18865q) {
                synchronized (C4914f.this) {
                    C4914f.this.f18839L.remove(Integer.valueOf(this.f18863o));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$f */
    /* loaded from: classes.dex */
    public class f extends AbstractRunnableC4283b {

        /* renamed from: o */
        final /* synthetic */ int f18867o;

        /* renamed from: p */
        final /* synthetic */ C0073c f18868p;

        /* renamed from: q */
        final /* synthetic */ int f18869q;

        /* renamed from: r */
        final /* synthetic */ boolean f18870r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i10, C0073c c0073c, int i11, boolean z10) {
            super(str, objArr);
            this.f18867o = i10;
            this.f18868p = c0073c;
            this.f18869q = i11;
            this.f18870r = z10;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            try {
                boolean mo19315d = C4914f.this.f18849w.mo19315d(this.f18867o, this.f18868p, this.f18869q, this.f18870r);
                if (mo19315d) {
                    C4914f.this.f18837J.m19297X(this.f18867o, EnumC4910b.CANCEL);
                }
                if (mo19315d || this.f18870r) {
                    synchronized (C4914f.this) {
                        C4914f.this.f18839L.remove(Integer.valueOf(this.f18867o));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$g */
    /* loaded from: classes.dex */
    public class g extends AbstractRunnableC4283b {

        /* renamed from: o */
        final /* synthetic */ int f18872o;

        /* renamed from: p */
        final /* synthetic */ EnumC4910b f18873p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i10, EnumC4910b enumC4910b) {
            super(str, objArr);
            this.f18872o = i10;
            this.f18873p = enumC4910b;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            C4914f.this.f18849w.mo19314c(this.f18872o, this.f18873p);
            synchronized (C4914f.this) {
                C4914f.this.f18839L.remove(Integer.valueOf(this.f18872o));
            }
        }
    }

    /* renamed from: ub.f$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        Socket f18875a;

        /* renamed from: b */
        String f18876b;

        /* renamed from: c */
        InterfaceC0075e f18877c;

        /* renamed from: d */
        InterfaceC0074d f18878d;

        /* renamed from: e */
        j f18879e = j.f18884a;

        /* renamed from: f */
        InterfaceC4920l f18880f = InterfaceC4920l.f18955a;

        /* renamed from: g */
        boolean f18881g;

        /* renamed from: h */
        int f18882h;

        public h(boolean z10) {
            this.f18881g = z10;
        }

        /* renamed from: a */
        public C4914f m19235a() {
            return new C4914f(this);
        }

        /* renamed from: b */
        public h m19236b(j jVar) {
            this.f18879e = jVar;
            return this;
        }

        /* renamed from: c */
        public h m19237c(int i10) {
            this.f18882h = i10;
            return this;
        }

        /* renamed from: d */
        public h m19238d(Socket socket, String str, InterfaceC0075e interfaceC0075e, InterfaceC0074d interfaceC0074d) {
            this.f18875a = socket;
            this.f18876b = str;
            this.f18877c = interfaceC0075e;
            this.f18878d = interfaceC0074d;
            return this;
        }
    }

    /* renamed from: ub.f$i */
    /* loaded from: classes.dex */
    final class i extends AbstractRunnableC4283b {
        i() {
            super("OkHttp %s ping", C4914f.this.f18843q);
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            boolean z10;
            synchronized (C4914f.this) {
                if (C4914f.this.f18851y < C4914f.this.f18850x) {
                    z10 = true;
                } else {
                    C4914f.m19209l(C4914f.this);
                    z10 = false;
                }
            }
            if (z10) {
                C4914f.this.m19207e0(null);
            } else {
                C4914f.this.m19215C0(false, 1, 0);
            }
        }
    }

    /* renamed from: ub.f$j */
    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        public static final j f18884a = new a();

        /* renamed from: ub.f$j$a */
        /* loaded from: classes.dex */
        class a extends j {
            a() {
            }

            @Override // p266ub.C4914f.j
            /* renamed from: c */
            public void mo18375c(C4917i c4917i) throws IOException {
                c4917i.m19272d(EnumC4910b.REFUSED_STREAM, null);
            }
        }

        /* renamed from: b */
        public void mo18374b(C4914f c4914f) {
        }

        /* renamed from: c */
        public abstract void mo18375c(C4917i c4917i) throws IOException;
    }

    /* renamed from: ub.f$k */
    /* loaded from: classes.dex */
    final class k extends AbstractRunnableC4283b {

        /* renamed from: o */
        final boolean f18885o;

        /* renamed from: p */
        final int f18886p;

        /* renamed from: q */
        final int f18887q;

        k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", C4914f.this.f18843q, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f18885o = z10;
            this.f18886p = i10;
            this.f18887q = i11;
        }

        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        public void mo17385k() {
            C4914f.this.m19215C0(this.f18885o, this.f18886p, this.f18887q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.f$l */
    /* loaded from: classes.dex */
    public class l extends AbstractRunnableC4283b implements C4916h.b {

        /* renamed from: o */
        final C4916h f18889o;

        /* renamed from: ub.f$l$a */
        /* loaded from: classes.dex */
        class a extends AbstractRunnableC4283b {

            /* renamed from: o */
            final /* synthetic */ C4917i f18891o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, C4917i c4917i) {
                super(str, objArr);
                this.f18891o = c4917i;
            }

            @Override // p205pb.AbstractRunnableC4283b
            /* renamed from: k */
            public void mo17385k() {
                try {
                    C4914f.this.f18841o.mo18375c(this.f18891o);
                } catch (IOException e10) {
                    C5492f.m20215l().mo20197t(4, "Http2Connection.Listener failure for " + C4914f.this.f18843q, e10);
                    try {
                        this.f18891o.m19272d(EnumC4910b.PROTOCOL_ERROR, e10);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: ub.f$l$b */
        /* loaded from: classes.dex */
        class b extends AbstractRunnableC4283b {

            /* renamed from: o */
            final /* synthetic */ boolean f18893o;

            /* renamed from: p */
            final /* synthetic */ C4921m f18894p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z10, C4921m c4921m) {
                super(str, objArr);
                this.f18893o = z10;
                this.f18894p = c4921m;
            }

            @Override // p205pb.AbstractRunnableC4283b
            /* renamed from: k */
            public void mo17385k() {
                l.this.m19249l(this.f18893o, this.f18894p);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ub.f$l$c */
        /* loaded from: classes.dex */
        public class c extends AbstractRunnableC4283b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // p205pb.AbstractRunnableC4283b
            /* renamed from: k */
            public void mo17385k() {
                C4914f c4914f = C4914f.this;
                c4914f.f18841o.mo18374b(c4914f);
            }
        }

        l(C4916h c4916h) {
            super("OkHttp %s", C4914f.this.f18843q);
            this.f18889o = c4916h;
        }

        @Override // p266ub.C4916h.b
        /* renamed from: a */
        public void mo19239a() {
        }

        @Override // p266ub.C4916h.b
        /* renamed from: b */
        public void mo19240b(boolean z10, int i10, int i11) {
            if (z10) {
                synchronized (C4914f.this) {
                    try {
                        if (i10 == 1) {
                            C4914f.m19206e(C4914f.this);
                        } else if (i10 == 2) {
                            C4914f.m19202W(C4914f.this);
                        } else if (i10 == 3) {
                            C4914f.m19203X(C4914f.this);
                            C4914f.this.notifyAll();
                        }
                    } finally {
                    }
                }
                return;
            }
            try {
                C4914f.this.f18847u.execute(new k(true, i10, i11));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p266ub.C4916h.b
        /* renamed from: c */
        public void mo19241c(int i10, int i11, int i12, boolean z10) {
        }

        @Override // p266ub.C4916h.b
        /* renamed from: d */
        public void mo19242d(boolean z10, C4921m c4921m) {
            try {
                C4914f.this.f18847u.execute(new b("OkHttp %s ACK Settings", new Object[]{C4914f.this.f18843q}, z10, c4921m));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p266ub.C4916h.b
        /* renamed from: e */
        public void mo19243e(boolean z10, int i10, int i11, List<C4911c> list) {
            if (C4914f.this.m19228t0(i10)) {
                C4914f.this.m19225q0(i10, list, z10);
                return;
            }
            synchronized (C4914f.this) {
                C4917i m19220j0 = C4914f.this.m19220j0(i10);
                if (m19220j0 == null) {
                    if (C4914f.this.f18846t) {
                        return;
                    }
                    C4914f c4914f = C4914f.this;
                    if (i10 <= c4914f.f18844r) {
                        return;
                    }
                    if (i10 % 2 == c4914f.f18845s % 2) {
                        return;
                    }
                    C4917i c4917i = new C4917i(i10, C4914f.this, false, z10, C4286e.m17734K(list));
                    C4914f c4914f2 = C4914f.this;
                    c4914f2.f18844r = i10;
                    c4914f2.f18842p.put(Integer.valueOf(i10), c4917i);
                    C4914f.f18827M.execute(new a("OkHttp %s stream %d", new Object[]{C4914f.this.f18843q, Integer.valueOf(i10)}, c4917i));
                    return;
                }
                m19220j0.m19281n(C4286e.m17734K(list), z10);
            }
        }

        @Override // p266ub.C4916h.b
        /* renamed from: f */
        public void mo19244f(int i10, EnumC4910b enumC4910b, C0076f c0076f) {
            C4917i[] c4917iArr;
            c0076f.mo399r();
            synchronized (C4914f.this) {
                c4917iArr = (C4917i[]) C4914f.this.f18842p.values().toArray(new C4917i[C4914f.this.f18842p.size()]);
                C4914f.this.f18846t = true;
            }
            for (C4917i c4917i : c4917iArr) {
                if (c4917i.m19274g() > i10 && c4917i.m19277j()) {
                    c4917i.m19282o(EnumC4910b.REFUSED_STREAM);
                    C4914f.this.m19229u0(c4917i.m19274g());
                }
            }
        }

        @Override // p266ub.C4916h.b
        /* renamed from: g */
        public void mo19245g(int i10, EnumC4910b enumC4910b) {
            if (C4914f.this.m19228t0(i10)) {
                C4914f.this.m19227s0(i10, enumC4910b);
                return;
            }
            C4917i m19229u0 = C4914f.this.m19229u0(i10);
            if (m19229u0 != null) {
                m19229u0.m19282o(enumC4910b);
            }
        }

        @Override // p266ub.C4916h.b
        /* renamed from: h */
        public void mo19246h(int i10, long j10) {
            if (i10 == 0) {
                synchronized (C4914f.this) {
                    C4914f c4914f = C4914f.this;
                    c4914f.f18833F += j10;
                    c4914f.notifyAll();
                }
                return;
            }
            C4917i m19220j0 = C4914f.this.m19220j0(i10);
            if (m19220j0 != null) {
                synchronized (m19220j0) {
                    m19220j0.m19269a(j10);
                }
            }
        }

        @Override // p266ub.C4916h.b
        /* renamed from: i */
        public void mo19247i(int i10, int i11, List<C4911c> list) {
            C4914f.this.m19226r0(i11, list);
        }

        @Override // p266ub.C4916h.b
        /* renamed from: j */
        public void mo19248j(boolean z10, int i10, InterfaceC0075e interfaceC0075e, int i11) throws IOException {
            if (C4914f.this.m19228t0(i10)) {
                C4914f.this.m19224o0(i10, interfaceC0075e, i11, z10);
                return;
            }
            C4917i m19220j0 = C4914f.this.m19220j0(i10);
            if (m19220j0 == null) {
                C4914f.this.m19217E0(i10, EnumC4910b.PROTOCOL_ERROR);
                long j10 = i11;
                C4914f.this.m19234z0(j10);
                interfaceC0075e.mo369r(j10);
                return;
            }
            m19220j0.m19280m(interfaceC0075e, i11);
            if (z10) {
                m19220j0.m19281n(C4286e.f17493c, true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [ub.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [ub.h, java.io.Closeable] */
        @Override // p205pb.AbstractRunnableC4283b
        /* renamed from: k */
        protected void mo17385k() {
            EnumC4910b enumC4910b;
            EnumC4910b enumC4910b2;
            EnumC4910b enumC4910b3 = EnumC4910b.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f18889o.m19266e(this);
                    do {
                    } while (this.f18889o.m19265c(false, this));
                    enumC4910b2 = EnumC4910b.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    enumC4910b = enumC4910b3;
                    C4914f.this.m19219Y(enumC4910b, enumC4910b3, e10);
                    C4286e.m17743g(this.f18889o);
                    throw th;
                }
                try {
                    C4914f.this.m19219Y(enumC4910b2, EnumC4910b.CANCEL, null);
                    enumC4910b = enumC4910b2;
                } catch (IOException e12) {
                    e10 = e12;
                    EnumC4910b enumC4910b4 = EnumC4910b.PROTOCOL_ERROR;
                    C4914f c4914f = C4914f.this;
                    c4914f.m19219Y(enumC4910b4, enumC4910b4, e10);
                    enumC4910b = c4914f;
                    enumC4910b3 = this.f18889o;
                    C4286e.m17743g(enumC4910b3);
                }
                enumC4910b3 = this.f18889o;
                C4286e.m17743g(enumC4910b3);
            } catch (Throwable th2) {
                th = th2;
                C4914f.this.m19219Y(enumC4910b, enumC4910b3, e10);
                C4286e.m17743g(this.f18889o);
                throw th;
            }
        }

        /* renamed from: l */
        void m19249l(boolean z10, C4921m c4921m) {
            C4917i[] c4917iArr;
            long j10;
            synchronized (C4914f.this.f18837J) {
                synchronized (C4914f.this) {
                    int m19319d = C4914f.this.f18835H.m19319d();
                    if (z10) {
                        C4914f.this.f18835H.m19316a();
                    }
                    C4914f.this.f18835H.m19323h(c4921m);
                    int m19319d2 = C4914f.this.f18835H.m19319d();
                    c4917iArr = null;
                    if (m19319d2 == -1 || m19319d2 == m19319d) {
                        j10 = 0;
                    } else {
                        j10 = m19319d2 - m19319d;
                        if (!C4914f.this.f18842p.isEmpty()) {
                            c4917iArr = (C4917i[]) C4914f.this.f18842p.values().toArray(new C4917i[C4914f.this.f18842p.size()]);
                        }
                    }
                }
                try {
                    C4914f c4914f = C4914f.this;
                    c4914f.f18837J.m19299b(c4914f.f18835H);
                } catch (IOException e10) {
                    C4914f.this.m19207e0(e10);
                }
            }
            if (c4917iArr != null) {
                for (C4917i c4917i : c4917iArr) {
                    synchronized (c4917i) {
                        c4917i.m19269a(j10);
                    }
                }
            }
            C4914f.f18827M.execute(new c("OkHttp %s settings", C4914f.this.f18843q));
        }
    }

    C4914f(h hVar) {
        C4921m c4921m = new C4921m();
        this.f18835H = c4921m;
        this.f18839L = new LinkedHashSet();
        this.f18849w = hVar.f18880f;
        boolean z10 = hVar.f18881g;
        this.f18840n = z10;
        this.f18841o = hVar.f18879e;
        int i10 = z10 ? 1 : 2;
        this.f18845s = i10;
        if (z10) {
            this.f18845s = i10 + 2;
        }
        if (z10) {
            this.f18834G.m19324i(7, 16777216);
        }
        String str = hVar.f18876b;
        this.f18843q = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C4286e.m17732I(C4286e.m17753q("OkHttp %s Writer", str), false));
        this.f18847u = scheduledThreadPoolExecutor;
        if (hVar.f18882h != 0) {
            i iVar = new i();
            int i11 = hVar.f18882h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i11, i11, TimeUnit.MILLISECONDS);
        }
        this.f18848v = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4286e.m17732I(C4286e.m17753q("OkHttp %s Push Observer", str), true));
        c4921m.m19324i(7, 65535);
        c4921m.m19324i(5, 16384);
        this.f18833F = c4921m.m19319d();
        this.f18836I = hVar.f18875a;
        this.f18837J = new C4918j(hVar.f18878d, z10);
        this.f18838K = new l(new C4916h(hVar.f18877c, z10));
    }

    /* renamed from: W */
    static /* synthetic */ long m19202W(C4914f c4914f) {
        long j10 = c4914f.f18828A;
        c4914f.f18828A = 1 + j10;
        return j10;
    }

    /* renamed from: X */
    static /* synthetic */ long m19203X(C4914f c4914f) {
        long j10 = c4914f.f18830C;
        c4914f.f18830C = 1 + j10;
        return j10;
    }

    /* renamed from: e */
    static /* synthetic */ long m19206e(C4914f c4914f) {
        long j10 = c4914f.f18851y;
        c4914f.f18851y = 1 + j10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m19207e0(IOException iOException) {
        EnumC4910b enumC4910b = EnumC4910b.PROTOCOL_ERROR;
        m19219Y(enumC4910b, enumC4910b, iOException);
    }

    /* renamed from: l */
    static /* synthetic */ long m19209l(C4914f c4914f) {
        long j10 = c4914f.f18850x;
        c4914f.f18850x = 1 + j10;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x0029, B:15:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x004a, B:36:0x006d, B:37:0x0072), top: B:5:0x0007, outer: #1 }] */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p266ub.C4917i m19210m0(int r11, java.util.List<p266ub.C4911c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            ub.j r7 = r10.f18837J
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L76
            int r0 = r10.f18845s     // Catch: java.lang.Throwable -> L73
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            ub.b r0 = p266ub.EnumC4910b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L73
            r10.m19231w0(r0)     // Catch: java.lang.Throwable -> L73
        L13:
            boolean r0 = r10.f18846t     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6d
            int r8 = r10.f18845s     // Catch: java.lang.Throwable -> L73
            int r0 = r8 + 2
            r10.f18845s = r0     // Catch: java.lang.Throwable -> L73
            ub.i r9 = new ub.i     // Catch: java.lang.Throwable -> L73
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L3a
            long r0 = r10.f18833F     // Catch: java.lang.Throwable -> L73
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3a
            long r0 = r9.f18917b     // Catch: java.lang.Throwable -> L73
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L38
            goto L3a
        L38:
            r13 = 0
            goto L3b
        L3a:
            r13 = 1
        L3b:
            boolean r0 = r9.m19278k()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L4a
            java.util.Map<java.lang.Integer, ub.i> r0 = r10.f18842p     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L73
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L73
        L4a:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L53
            ub.j r11 = r10.f18837J     // Catch: java.lang.Throwable -> L76
            r11.m19293O(r6, r8, r12)     // Catch: java.lang.Throwable -> L76
            goto L5c
        L53:
            boolean r0 = r10.f18840n     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L65
            ub.j r0 = r10.f18837J     // Catch: java.lang.Throwable -> L76
            r0.m19296W(r11, r8, r12)     // Catch: java.lang.Throwable -> L76
        L5c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            if (r13 == 0) goto L64
            ub.j r11 = r10.f18837J
            r11.flush()
        L64:
            return r9
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L76
        L6d:
            ub.a r11 = new ub.a     // Catch: java.lang.Throwable -> L73
            r11.<init>()     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L73
        L73:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L73
            throw r11     // Catch: java.lang.Throwable -> L76
        L76:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p266ub.C4914f.m19210m0(int, java.util.List, boolean):ub.i");
    }

    /* renamed from: p0 */
    private synchronized void m19211p0(AbstractRunnableC4283b abstractRunnableC4283b) {
        if (!this.f18846t) {
            this.f18848v.execute(abstractRunnableC4283b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f18837J.m19294Q());
        r6 = r3;
        r8.f18833F -= r6;
     */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19213A0(int r9, boolean r10, ac.C0073c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            ub.j r12 = r8.f18837J
            r12.m19301e(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r3 = r8.f18833F     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, ub.i> r3 = r8.f18842p     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            ub.j r3 = r8.f18837J     // Catch: java.lang.Throwable -> L56
            int r3 = r3.m19294Q()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f18833F     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f18833F = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            ub.j r4 = r8.f18837J
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.m19301e(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p266ub.C4914f.m19213A0(int, boolean, ac.c, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void m19214B0(int i10, boolean z10, List<C4911c> list) throws IOException {
        this.f18837J.m19293O(z10, i10, list);
    }

    /* renamed from: C0 */
    void m19215C0(boolean z10, int i10, int i11) {
        try {
            this.f18837J.m19295T(z10, i10, i11);
        } catch (IOException e10) {
            m19207e0(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void m19216D0(int i10, EnumC4910b enumC4910b) throws IOException {
        this.f18837J.m19297X(i10, enumC4910b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m19217E0(int i10, EnumC4910b enumC4910b) {
        try {
            this.f18847u.execute(new a("OkHttp %s stream %d", new Object[]{this.f18843q, Integer.valueOf(i10)}, i10, enumC4910b));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m19218F0(int i10, long j10) {
        try {
            this.f18847u.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f18843q, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: Y */
    void m19219Y(EnumC4910b enumC4910b, EnumC4910b enumC4910b2, IOException iOException) {
        try {
            m19231w0(enumC4910b);
        } catch (IOException unused) {
        }
        C4917i[] c4917iArr = null;
        synchronized (this) {
            if (!this.f18842p.isEmpty()) {
                c4917iArr = (C4917i[]) this.f18842p.values().toArray(new C4917i[this.f18842p.size()]);
                this.f18842p.clear();
            }
        }
        if (c4917iArr != null) {
            for (C4917i c4917i : c4917iArr) {
                try {
                    c4917i.m19272d(enumC4910b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f18837J.close();
        } catch (IOException unused3) {
        }
        try {
            this.f18836I.close();
        } catch (IOException unused4) {
        }
        this.f18847u.shutdown();
        this.f18848v.shutdown();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m19219Y(EnumC4910b.NO_ERROR, EnumC4910b.CANCEL, null);
    }

    public void flush() throws IOException {
        this.f18837J.flush();
    }

    /* renamed from: j0 */
    synchronized C4917i m19220j0(int i10) {
        return this.f18842p.get(Integer.valueOf(i10));
    }

    /* renamed from: k0 */
    public synchronized boolean m19221k0(long j10) {
        if (this.f18846t) {
            return false;
        }
        if (this.f18828A < this.f18852z) {
            if (j10 >= this.f18831D) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l0 */
    public synchronized int m19222l0() {
        return this.f18835H.m19320e(Integer.MAX_VALUE);
    }

    /* renamed from: n0 */
    public C4917i m19223n0(List<C4911c> list, boolean z10) throws IOException {
        return m19210m0(0, list, z10);
    }

    /* renamed from: o0 */
    void m19224o0(int i10, InterfaceC0075e interfaceC0075e, int i11, boolean z10) throws IOException {
        C0073c c0073c = new C0073c();
        long j10 = i11;
        interfaceC0075e.mo349a0(j10);
        interfaceC0075e.mo315V(c0073c, j10);
        if (c0073c.m381y0() == j10) {
            m19211p0(new f("OkHttp %s Push Data[%s]", new Object[]{this.f18843q, Integer.valueOf(i10)}, i10, c0073c, i11, z10));
            return;
        }
        throw new IOException(c0073c.m381y0() + " != " + i11);
    }

    /* renamed from: q0 */
    void m19225q0(int i10, List<C4911c> list, boolean z10) {
        try {
            m19211p0(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f18843q, Integer.valueOf(i10)}, i10, list, z10));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: r0 */
    void m19226r0(int i10, List<C4911c> list) {
        synchronized (this) {
            if (this.f18839L.contains(Integer.valueOf(i10))) {
                m19217E0(i10, EnumC4910b.PROTOCOL_ERROR);
                return;
            }
            this.f18839L.add(Integer.valueOf(i10));
            try {
                m19211p0(new d("OkHttp %s Push Request[%s]", new Object[]{this.f18843q, Integer.valueOf(i10)}, i10, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: s0 */
    void m19227s0(int i10, EnumC4910b enumC4910b) {
        m19211p0(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f18843q, Integer.valueOf(i10)}, i10, enumC4910b));
    }

    /* renamed from: t0 */
    boolean m19228t0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public synchronized C4917i m19229u0(int i10) {
        C4917i remove;
        remove = this.f18842p.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void m19230v0() {
        synchronized (this) {
            long j10 = this.f18828A;
            long j11 = this.f18852z;
            if (j10 < j11) {
                return;
            }
            this.f18852z = j11 + 1;
            this.f18831D = System.nanoTime() + 1000000000;
            try {
                this.f18847u.execute(new c("OkHttp %s ping", this.f18843q));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: w0 */
    public void m19231w0(EnumC4910b enumC4910b) throws IOException {
        synchronized (this.f18837J) {
            synchronized (this) {
                if (this.f18846t) {
                    return;
                }
                this.f18846t = true;
                this.f18837J.m19305z(this.f18844r, enumC4910b, C4286e.f17491a);
            }
        }
    }

    /* renamed from: x0 */
    public void m19232x0() throws IOException {
        m19233y0(true);
    }

    /* renamed from: y0 */
    void m19233y0(boolean z10) throws IOException {
        if (z10) {
            this.f18837J.m19300c();
            this.f18837J.m19298Y(this.f18834G);
            if (this.f18834G.m19319d() != 65535) {
                this.f18837J.m19302e0(0, r6 - 65535);
            }
        }
        new Thread(this.f18838K).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public synchronized void m19234z0(long j10) {
        long j11 = this.f18832E + j10;
        this.f18832E = j11;
        if (j11 >= this.f18834G.m19319d() / 2) {
            m19218F0(0, this.f18832E);
            this.f18832E = 0L;
        }
    }
}
