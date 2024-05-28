package p217qb;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p193ob.C4174f;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4200y;
import p205pb.AbstractC4282a;
import sb.C4555d;
import sb.C4556e;

/* renamed from: qb.c */
/* loaded from: classes.dex */
public final class C4368c {

    /* renamed from: a */
    public final C4177g0 f17843a;

    /* renamed from: b */
    public final C4181i0 f17844b;

    /* renamed from: qb.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final long f17845a;

        /* renamed from: b */
        final C4177g0 f17846b;

        /* renamed from: c */
        final C4181i0 f17847c;

        /* renamed from: d */
        private Date f17848d;

        /* renamed from: e */
        private String f17849e;

        /* renamed from: f */
        private Date f17850f;

        /* renamed from: g */
        private String f17851g;

        /* renamed from: h */
        private Date f17852h;

        /* renamed from: i */
        private long f17853i;

        /* renamed from: j */
        private long f17854j;

        /* renamed from: k */
        private String f17855k;

        /* renamed from: l */
        private int f17856l;

        public a(long j10, C4177g0 c4177g0, C4181i0 c4181i0) {
            this.f17856l = -1;
            this.f17845a = j10;
            this.f17846b = c4177g0;
            this.f17847c = c4181i0;
            if (c4181i0 != null) {
                this.f17853i = c4181i0.m17438l0();
                this.f17854j = c4181i0.m17435j0();
                C4200y m17424O = c4181i0.m17424O();
                int m17558h = m17424O.m17558h();
                for (int i10 = 0; i10 < m17558h; i10++) {
                    String m17556e = m17424O.m17556e(i10);
                    String m17559i = m17424O.m17559i(i10);
                    if ("Date".equalsIgnoreCase(m17556e)) {
                        this.f17848d = C4555d.m18611b(m17559i);
                        this.f17849e = m17559i;
                    } else if ("Expires".equalsIgnoreCase(m17556e)) {
                        this.f17852h = C4555d.m18611b(m17559i);
                    } else if ("Last-Modified".equalsIgnoreCase(m17556e)) {
                        this.f17850f = C4555d.m18611b(m17559i);
                        this.f17851g = m17559i;
                    } else if ("ETag".equalsIgnoreCase(m17556e)) {
                        this.f17855k = m17559i;
                    } else if ("Age".equalsIgnoreCase(m17556e)) {
                        this.f17856l = C4556e.m18618f(m17559i, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m18063a() {
            Date date = this.f17848d;
            long max = date != null ? Math.max(0L, this.f17854j - date.getTime()) : 0L;
            int i10 = this.f17856l;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f17854j;
            return max + (j10 - this.f17853i) + (this.f17845a - j10);
        }

        /* renamed from: b */
        private long m18064b() {
            long j10;
            long j11;
            if (this.f17847c.m17431c().m17364d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m17364d());
            }
            if (this.f17852h != null) {
                Date date = this.f17848d;
                if (date != null) {
                    j11 = date.getTime();
                } else {
                    j11 = this.f17854j;
                }
                long time = this.f17852h.getTime() - j11;
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f17850f == null || this.f17847c.m17436k0().m17400j().m17599z() != null) {
                return 0L;
            }
            Date date2 = this.f17848d;
            if (date2 != null) {
                j10 = date2.getTime();
            } else {
                j10 = this.f17853i;
            }
            long time2 = j10 - this.f17850f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        /* renamed from: d */
        private C4368c m18065d() {
            if (this.f17847c == null) {
                return new C4368c(this.f17846b, null);
            }
            if (this.f17846b.m17396f() && this.f17847c.m17434i() == null) {
                return new C4368c(this.f17846b, null);
            }
            if (!C4368c.m18062a(this.f17847c, this.f17846b)) {
                return new C4368c(this.f17846b, null);
            }
            C4174f m17392b = this.f17846b.m17392b();
            if (!m17392b.m17368h() && !m18066e(this.f17846b)) {
                C4174f m17431c = this.f17847c.m17431c();
                long m18063a = m18063a();
                long m18064b = m18064b();
                if (m17392b.m17364d() != -1) {
                    m18064b = Math.min(m18064b, TimeUnit.SECONDS.toMillis(m17392b.m17364d()));
                }
                long j10 = 0;
                long millis = m17392b.m17366f() != -1 ? TimeUnit.SECONDS.toMillis(m17392b.m17366f()) : 0L;
                if (!m17431c.m17367g() && m17392b.m17365e() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(m17392b.m17365e());
                }
                if (!m17431c.m17368h()) {
                    long j11 = millis + m18063a;
                    if (j11 < j10 + m18064b) {
                        C4181i0.a m17428X = this.f17847c.m17428X();
                        if (j11 >= m18064b) {
                            m17428X.m17442a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m18063a > 86400000 && m18067f()) {
                            m17428X.m17442a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C4368c(null, m17428X.m17444c());
                    }
                }
                String str = this.f17855k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f17850f != null) {
                    str = this.f17851g;
                } else if (this.f17848d != null) {
                    str = this.f17849e;
                } else {
                    return new C4368c(this.f17846b, null);
                }
                C4200y.a m17557f = this.f17846b.m17395e().m17557f();
                AbstractC4282a.f17486a.mo17320b(m17557f, str2, str);
                return new C4368c(this.f17846b.m17398h().m17403c(m17557f.m17565e()).m17401a(), this.f17847c);
            }
            return new C4368c(this.f17846b, null);
        }

        /* renamed from: e */
        private static boolean m18066e(C4177g0 c4177g0) {
            return (c4177g0.m17393c("If-Modified-Since") == null && c4177g0.m17393c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m18067f() {
            return this.f17847c.m17431c().m17364d() == -1 && this.f17852h == null;
        }

        /* renamed from: c */
        public C4368c m18068c() {
            C4368c m18065d = m18065d();
            return (m18065d.f17843a == null || !this.f17846b.m17392b().m17370j()) ? m18065d : new C4368c(null, null);
        }
    }

    C4368c(C4177g0 c4177g0, C4181i0 c4181i0) {
        this.f17843a = c4177g0;
        this.f17844b = c4181i0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m17431c().m17362b() == false) goto L33;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m18062a(p193ob.C4181i0 r3, p193ob.C4177g0 r4) {
        /*
            int r0 = r3.m17432e()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.m17437l(r0)
            if (r0 != 0) goto L5a
            ob.f r0 = r3.m17431c()
            int r0 = r0.m17364d()
            r1 = -1
            if (r0 != r1) goto L5a
            ob.f r0 = r3.m17431c()
            boolean r0 = r0.m17363c()
            if (r0 != 0) goto L5a
            ob.f r0 = r3.m17431c()
            boolean r0 = r0.m17362b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            ob.f r3 = r3.m17431c()
            boolean r3 = r3.m17369i()
            if (r3 != 0) goto L6f
            ob.f r3 = r4.m17392b()
            boolean r3 = r3.m17369i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p217qb.C4368c.m18062a(ob.i0, ob.g0):boolean");
    }
}
