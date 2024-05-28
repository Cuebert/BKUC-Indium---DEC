package p193ob;

import ac.AbstractC0077g;
import ac.AbstractC0078h;
import ac.C0073c;
import ac.C0076f;
import ac.C0082l;
import ac.InterfaceC0074d;
import ac.InterfaceC0075e;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4200y;
import p205pb.C4286e;
import p217qb.C4368c;
import p217qb.C4369d;
import p217qb.InterfaceC4367b;
import p217qb.InterfaceC4371f;
import p278vb.InterfaceC5003a;
import p291wb.C5492f;
import sb.C4556e;
import sb.C4557f;
import sb.C4562k;

/* renamed from: ob.e */
/* loaded from: classes.dex */
public final class C4172e implements Closeable, Flushable {

    /* renamed from: n */
    final InterfaceC4371f f17048n;

    /* renamed from: o */
    final C4369d f17049o;

    /* renamed from: p */
    int f17050p;

    /* renamed from: q */
    int f17051q;

    /* renamed from: r */
    private int f17052r;

    /* renamed from: s */
    private int f17053s;

    /* renamed from: t */
    private int f17054t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ob.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC4371f {
        a() {
        }

        @Override // p217qb.InterfaceC4371f
        /* renamed from: a */
        public void mo17345a() {
            C4172e.this.m17339O();
        }

        @Override // p217qb.InterfaceC4371f
        /* renamed from: b */
        public C4181i0 mo17346b(C4177g0 c4177g0) throws IOException {
            return C4172e.this.m17342c(c4177g0);
        }

        @Override // p217qb.InterfaceC4371f
        /* renamed from: c */
        public void mo17347c(C4181i0 c4181i0, C4181i0 c4181i02) {
            C4172e.this.m17341T(c4181i0, c4181i02);
        }

        @Override // p217qb.InterfaceC4371f
        /* renamed from: d */
        public void mo17348d(C4368c c4368c) {
            C4172e.this.m17340Q(c4368c);
        }

        @Override // p217qb.InterfaceC4371f
        /* renamed from: e */
        public void mo17349e(C4177g0 c4177g0) throws IOException {
            C4172e.this.m17344z(c4177g0);
        }

        @Override // p217qb.InterfaceC4371f
        /* renamed from: f */
        public InterfaceC4367b mo17350f(C4181i0 c4181i0) throws IOException {
            return C4172e.this.m17343i(c4181i0);
        }
    }

    /* renamed from: ob.e$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC4367b {

        /* renamed from: a */
        private final C4369d.c f17056a;

        /* renamed from: b */
        private InterfaceC0089s f17057b;

        /* renamed from: c */
        private InterfaceC0089s f17058c;

        /* renamed from: d */
        boolean f17059d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ob.e$b$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC0077g {

            /* renamed from: o */
            final /* synthetic */ C4172e f17061o;

            /* renamed from: p */
            final /* synthetic */ C4369d.c f17062p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC0089s interfaceC0089s, C4172e c4172e, C4369d.c cVar) {
                super(interfaceC0089s);
                this.f17061o = c4172e;
                this.f17062p = cVar;
            }

            @Override // ac.AbstractC0077g, ac.InterfaceC0089s, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (C4172e.this) {
                    b bVar = b.this;
                    if (bVar.f17059d) {
                        return;
                    }
                    bVar.f17059d = true;
                    C4172e.this.f17050p++;
                    super.close();
                    this.f17062p.m18090b();
                }
            }
        }

        b(C4369d.c cVar) {
            this.f17056a = cVar;
            InterfaceC0089s m18092d = cVar.m18092d(1);
            this.f17057b = m18092d;
            this.f17058c = new a(m18092d, C4172e.this, cVar);
        }

        @Override // p217qb.InterfaceC4367b
        /* renamed from: a */
        public InterfaceC0089s mo17351a() {
            return this.f17058c;
        }

        @Override // p217qb.InterfaceC4367b
        /* renamed from: b */
        public void mo17352b() {
            synchronized (C4172e.this) {
                if (this.f17059d) {
                    return;
                }
                this.f17059d = true;
                C4172e.this.f17051q++;
                C4286e.m17743g(this.f17057b);
                try {
                    this.f17056a.m18089a();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: ob.e$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC4183j0 {

        /* renamed from: o */
        final C4369d.e f17064o;

        /* renamed from: p */
        private final InterfaceC0075e f17065p;

        /* renamed from: q */
        private final String f17066q;

        /* renamed from: r */
        private final String f17067r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ob.e$c$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC0078h {

            /* renamed from: o */
            final /* synthetic */ C4369d.e f17068o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC0090t interfaceC0090t, C4369d.e eVar) {
                super(interfaceC0090t);
                this.f17068o = eVar;
            }

            @Override // ac.AbstractC0078h, ac.InterfaceC0090t, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f17068o.close();
                super.close();
            }
        }

        c(C4369d.e eVar, String str, String str2) {
            this.f17064o = eVar;
            this.f17066q = str;
            this.f17067r = str2;
            this.f17065p = C0082l.m425d(new a(eVar.m18098c(1), eVar));
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: Q */
        public InterfaceC0075e mo14678Q() {
            return this.f17065p;
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: i */
        public long mo14680i() {
            try {
                String str = this.f17067r;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // p193ob.AbstractC4183j0
        /* renamed from: l */
        public C4167b0 mo14681l() {
            String str = this.f17066q;
            if (str != null) {
                return C4167b0.m17279d(str);
            }
            return null;
        }
    }

    public C4172e(File file, long j10) {
        this(file, j10, InterfaceC5003a.f19103a);
    }

    /* renamed from: b */
    private void m17336b(C4369d.c cVar) {
        if (cVar != null) {
            try {
                cVar.m18089a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public static String m17337e(C4201z c4201z) {
        return C0076f.m388i(c4201z.toString()).mo394l().mo393k();
    }

    /* renamed from: l */
    static int m17338l(InterfaceC0075e interfaceC0075e) throws IOException {
        try {
            long mo345S = interfaceC0075e.mo345S();
            String mo321B = interfaceC0075e.mo321B();
            if (mo345S >= 0 && mo345S <= 2147483647L && mo321B.isEmpty()) {
                return (int) mo345S;
            }
            throw new IOException("expected an int but was \"" + mo345S + mo321B + "\"");
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    /* renamed from: O */
    synchronized void m17339O() {
        this.f17053s++;
    }

    /* renamed from: Q */
    synchronized void m17340Q(C4368c c4368c) {
        this.f17054t++;
        if (c4368c.f17843a != null) {
            this.f17052r++;
        } else if (c4368c.f17844b != null) {
            this.f17053s++;
        }
    }

    /* renamed from: T */
    void m17341T(C4181i0 c4181i0, C4181i0 c4181i02) {
        C4369d.c cVar;
        d dVar = new d(c4181i02);
        try {
            cVar = ((c) c4181i0.m17430b()).f17064o.m18097b();
            if (cVar != null) {
                try {
                    dVar.m17358f(cVar);
                    cVar.m18090b();
                } catch (IOException unused) {
                    m17336b(cVar);
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        }
    }

    /* renamed from: c */
    C4181i0 m17342c(C4177g0 c4177g0) {
        try {
            C4369d.e m18078Q = this.f17049o.m18078Q(m17337e(c4177g0.m17400j()));
            if (m18078Q == null) {
                return null;
            }
            try {
                d dVar = new d(m18078Q.m18098c(0));
                C4181i0 m17357d = dVar.m17357d(m18078Q);
                if (dVar.m17356b(c4177g0, m17357d)) {
                    return m17357d;
                }
                C4286e.m17743g(m17357d.m17430b());
                return null;
            } catch (IOException unused) {
                C4286e.m17743g(m18078Q);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17049o.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f17049o.flush();
    }

    /* renamed from: i */
    InterfaceC4367b m17343i(C4181i0 c4181i0) {
        C4369d.c cVar;
        String m17397g = c4181i0.m17436k0().m17397g();
        if (C4557f.m18628a(c4181i0.m17436k0().m17397g())) {
            try {
                m17344z(c4181i0.m17436k0());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!m17397g.equals("GET") || C4556e.m18617e(c4181i0)) {
            return null;
        }
        d dVar = new d(c4181i0);
        try {
            cVar = this.f17049o.m18087z(m17337e(c4181i0.m17436k0().m17400j()));
            if (cVar == null) {
                return null;
            }
            try {
                dVar.m17358f(cVar);
                return new b(cVar);
            } catch (IOException unused2) {
                m17336b(cVar);
                return null;
            }
        } catch (IOException unused3) {
            cVar = null;
        }
    }

    /* renamed from: z */
    void m17344z(C4177g0 c4177g0) throws IOException {
        this.f17049o.m18084l0(m17337e(c4177g0.m17400j()));
    }

    C4172e(File file, long j10, InterfaceC5003a interfaceC5003a) {
        this.f17048n = new a();
        this.f17049o = C4369d.m18074i(interfaceC5003a, file, 201105, 2, j10);
    }

    /* renamed from: ob.e$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: k */
        private static final String f17070k = C5492f.m20215l().m20218m() + "-Sent-Millis";

        /* renamed from: l */
        private static final String f17071l = C5492f.m20215l().m20218m() + "-Received-Millis";

        /* renamed from: a */
        private final String f17072a;

        /* renamed from: b */
        private final C4200y f17073b;

        /* renamed from: c */
        private final String f17074c;

        /* renamed from: d */
        private final EnumC4173e0 f17075d;

        /* renamed from: e */
        private final int f17076e;

        /* renamed from: f */
        private final String f17077f;

        /* renamed from: g */
        private final C4200y f17078g;

        /* renamed from: h */
        private final C4199x f17079h;

        /* renamed from: i */
        private final long f17080i;

        /* renamed from: j */
        private final long f17081j;

        d(InterfaceC0090t interfaceC0090t) throws IOException {
            EnumC4187l0 enumC4187l0;
            try {
                InterfaceC0075e m425d = C0082l.m425d(interfaceC0090t);
                this.f17072a = m425d.mo321B();
                this.f17074c = m425d.mo321B();
                C4200y.a aVar = new C4200y.a();
                int m17338l = C4172e.m17338l(m425d);
                for (int i10 = 0; i10 < m17338l; i10++) {
                    aVar.m17563c(m425d.mo321B());
                }
                this.f17073b = aVar.m17565e();
                C4562k m18644a = C4562k.m18644a(m425d.mo321B());
                this.f17075d = m18644a.f18329a;
                this.f17076e = m18644a.f18330b;
                this.f17077f = m18644a.f18331c;
                C4200y.a aVar2 = new C4200y.a();
                int m17338l2 = C4172e.m17338l(m425d);
                for (int i11 = 0; i11 < m17338l2; i11++) {
                    aVar2.m17563c(m425d.mo321B());
                }
                String str = f17070k;
                String m17566f = aVar2.m17566f(str);
                String str2 = f17071l;
                String m17566f2 = aVar2.m17566f(str2);
                aVar2.m17567g(str);
                aVar2.m17567g(str2);
                this.f17080i = m17566f != null ? Long.parseLong(m17566f) : 0L;
                this.f17081j = m17566f2 != null ? Long.parseLong(m17566f2) : 0L;
                this.f17078g = aVar2.m17565e();
                if (m17353a()) {
                    String mo321B = m425d.mo321B();
                    if (mo321B.length() <= 0) {
                        C4184k m17465b = C4184k.m17465b(m425d.mo321B());
                        List<Certificate> m17354c = m17354c(m425d);
                        List<Certificate> m17354c2 = m17354c(m425d);
                        if (!m425d.mo328F()) {
                            enumC4187l0 = EnumC4187l0.m17476b(m425d.mo321B());
                        } else {
                            enumC4187l0 = EnumC4187l0.SSL_3_0;
                        }
                        this.f17079h = C4199x.m17545c(enumC4187l0, m17465b, m17354c, m17354c2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + mo321B + "\"");
                    }
                } else {
                    this.f17079h = null;
                }
            } finally {
                interfaceC0090t.close();
            }
        }

        /* renamed from: a */
        private boolean m17353a() {
            return this.f17072a.startsWith("https://");
        }

        /* renamed from: c */
        private List<Certificate> m17354c(InterfaceC0075e interfaceC0075e) throws IOException {
            int m17338l = C4172e.m17338l(interfaceC0075e);
            if (m17338l == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(m17338l);
                for (int i10 = 0; i10 < m17338l; i10++) {
                    String mo321B = interfaceC0075e.mo321B();
                    C0073c c0073c = new C0073c();
                    c0073c.mo326E(C0076f.m384e(mo321B));
                    arrayList.add(certificateFactory.generateCertificate(c0073c.mo358i0()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* renamed from: e */
        private void m17355e(InterfaceC0074d interfaceC0074d, List<Certificate> list) throws IOException {
            try {
                interfaceC0074d.mo351c0(list.size()).mo330G(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC0074d.mo350b0(C0076f.m389m(list.get(i10).getEncoded()).mo390b()).mo330G(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        /* renamed from: b */
        public boolean m17356b(C4177g0 c4177g0, C4181i0 c4181i0) {
            return this.f17072a.equals(c4177g0.m17400j().toString()) && this.f17074c.equals(c4177g0.m17397g()) && C4556e.m18627o(c4181i0, this.f17073b, c4177g0);
        }

        /* renamed from: d */
        public C4181i0 m17357d(C4369d.e eVar) {
            String m17555c = this.f17078g.m17555c("Content-Type");
            String m17555c2 = this.f17078g.m17555c("Content-Length");
            return new C4181i0.a().m17456q(new C4177g0.a().m17408h(this.f17072a).m17404d(this.f17074c, null).m17403c(this.f17073b).m17401a()).m17454o(this.f17075d).m17446g(this.f17076e).m17451l(this.f17077f).m17449j(this.f17078g).m17443b(new c(eVar, m17555c, m17555c2)).m17447h(this.f17079h).m17457r(this.f17080i).m17455p(this.f17081j).m17444c();
        }

        /* renamed from: f */
        public void m17358f(C4369d.c cVar) throws IOException {
            InterfaceC0074d m424c = C0082l.m424c(cVar.m18092d(0));
            m424c.mo350b0(this.f17072a).mo330G(10);
            m424c.mo350b0(this.f17074c).mo330G(10);
            m424c.mo351c0(this.f17073b.m17558h()).mo330G(10);
            int m17558h = this.f17073b.m17558h();
            for (int i10 = 0; i10 < m17558h; i10++) {
                m424c.mo350b0(this.f17073b.m17556e(i10)).mo350b0(": ").mo350b0(this.f17073b.m17559i(i10)).mo330G(10);
            }
            m424c.mo350b0(new C4562k(this.f17075d, this.f17076e, this.f17077f).toString()).mo330G(10);
            m424c.mo351c0(this.f17078g.m17558h() + 2).mo330G(10);
            int m17558h2 = this.f17078g.m17558h();
            for (int i11 = 0; i11 < m17558h2; i11++) {
                m424c.mo350b0(this.f17078g.m17556e(i11)).mo350b0(": ").mo350b0(this.f17078g.m17559i(i11)).mo330G(10);
            }
            m424c.mo350b0(f17070k).mo350b0(": ").mo351c0(this.f17080i).mo330G(10);
            m424c.mo350b0(f17071l).mo350b0(": ").mo351c0(this.f17081j).mo330G(10);
            if (m17353a()) {
                m424c.mo330G(10);
                m424c.mo350b0(this.f17079h.m17547a().m17470e()).mo330G(10);
                m17355e(m424c, this.f17079h.m17549f());
                m17355e(m424c, this.f17079h.m17548d());
                m424c.mo350b0(this.f17079h.m17550g().m17478d()).mo330G(10);
            }
            m424c.close();
        }

        d(C4181i0 c4181i0) {
            this.f17072a = c4181i0.m17436k0().m17400j().toString();
            this.f17073b = C4556e.m18626n(c4181i0);
            this.f17074c = c4181i0.m17436k0().m17397g();
            this.f17075d = c4181i0.m17433e0();
            this.f17076e = c4181i0.m17432e();
            this.f17077f = c4181i0.m17426T();
            this.f17078g = c4181i0.m17424O();
            this.f17079h = c4181i0.m17434i();
            this.f17080i = c4181i0.m17438l0();
            this.f17081j = c4181i0.m17435j0();
        }
    }
}
