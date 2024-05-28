package p329zb;

import ac.C0073c;
import ac.InterfaceC0075e;
import com.appsflyer.oaid.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p193ob.AbstractC4179h0;
import p193ob.AbstractC4183j0;
import p193ob.C4167b0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4200y;
import p193ob.EnumC4173e0;
import p193ob.InterfaceC4165a0;
import p193ob.InterfaceC4186l;
import sb.C4556e;

/* renamed from: zb.a */
/* loaded from: classes.dex */
public final class C6029a implements InterfaceC4165a0 {

    /* renamed from: c */
    private static final Charset f22116c = Charset.forName("UTF-8");

    /* renamed from: a */
    private final b f22117a;

    /* renamed from: b */
    private volatile a f22118b = a.NONE;

    /* renamed from: zb.a$a */
    /* loaded from: classes.dex */
    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: zb.a$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo17231a(String str);
    }

    public C6029a(b bVar) {
        this.f22117a = bVar;
    }

    /* renamed from: b */
    private boolean m21354b(C4200y c4200y) {
        String m17555c = c4200y.m17555c("Content-Encoding");
        return (m17555c == null || m17555c.equalsIgnoreCase("identity")) ? false : true;
    }

    /* renamed from: c */
    static boolean m21355c(C0073c c0073c) {
        try {
            C0073c c0073c2 = new C0073c();
            c0073c.m360k0(c0073c2, 0L, c0073c.m381y0() < 64 ? c0073c.m381y0() : 64L);
            for (int i10 = 0; i10 < 16; i10++) {
                if (c0073c2.mo328F()) {
                    return true;
                }
                int m377v0 = c0073c2.m377v0();
                if (Character.isISOControl(m377v0) && !Character.isWhitespace(m377v0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        boolean z10;
        boolean z11;
        a aVar2 = this.f22118b;
        C4177g0 mo17275e = aVar.mo17275e();
        if (aVar2 == a.NONE) {
            return aVar.mo17272b(mo17275e);
        }
        boolean z12 = aVar2 == a.BODY;
        boolean z13 = z12 || aVar2 == a.HEADERS;
        AbstractC4179h0 m17391a = mo17275e.m17391a();
        boolean z14 = m17391a != null;
        InterfaceC4186l mo17271a = aVar.mo17271a();
        String str = "--> " + mo17275e.m17397g() + ' ' + mo17275e.m17400j() + ' ' + (mo17271a != null ? mo17271a.mo17475a() : EnumC4173e0.HTTP_1_1);
        if (!z13 && z14) {
            str = str + " (" + m17391a.mo14714a() + "-byte body)";
        }
        this.f22117a.mo17231a(str);
        if (z13) {
            if (z14) {
                if (m17391a.mo14715b() != null) {
                    this.f22117a.mo17231a("Content-Type: " + m17391a.mo14715b());
                }
                if (m17391a.mo14714a() != -1) {
                    this.f22117a.mo17231a("Content-Length: " + m17391a.mo14714a());
                }
            }
            C4200y m17395e = mo17275e.m17395e();
            int m17558h = m17395e.m17558h();
            int i10 = 0;
            while (i10 < m17558h) {
                String m17556e = m17395e.m17556e(i10);
                int i11 = m17558h;
                if ("Content-Type".equalsIgnoreCase(m17556e) || "Content-Length".equalsIgnoreCase(m17556e)) {
                    z11 = z13;
                } else {
                    z11 = z13;
                    this.f22117a.mo17231a(m17556e + ": " + m17395e.m17559i(i10));
                }
                i10++;
                m17558h = i11;
                z13 = z11;
            }
            z10 = z13;
            if (z12 && z14) {
                if (m21354b(mo17275e.m17395e())) {
                    this.f22117a.mo17231a("--> END " + mo17275e.m17397g() + " (encoded body omitted)");
                } else {
                    C0073c c0073c = new C0073c();
                    m17391a.mo14716i(c0073c);
                    Charset charset = f22116c;
                    C4167b0 mo14715b = m17391a.mo14715b();
                    if (mo14715b != null) {
                        charset = mo14715b.m17281b(charset);
                    }
                    this.f22117a.mo17231a(BuildConfig.FLAVOR);
                    if (m21355c(c0073c)) {
                        this.f22117a.mo17231a(c0073c.mo356g0(charset));
                        this.f22117a.mo17231a("--> END " + mo17275e.m17397g() + " (" + m17391a.mo14714a() + "-byte body)");
                    } else {
                        this.f22117a.mo17231a("--> END " + mo17275e.m17397g() + " (binary " + m17391a.mo14714a() + "-byte body omitted)");
                    }
                }
            } else {
                this.f22117a.mo17231a("--> END " + mo17275e.m17397g());
            }
        } else {
            z10 = z13;
        }
        long nanoTime = System.nanoTime();
        try {
            C4181i0 mo17272b = aVar.mo17272b(mo17275e);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            AbstractC4183j0 m17430b = mo17272b.m17430b();
            long mo14680i = m17430b.mo14680i();
            String str2 = mo14680i != -1 ? mo14680i + "-byte" : "unknown-length";
            b bVar = this.f22117a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(mo17272b.m17432e());
            sb2.append(' ');
            sb2.append(mo17272b.m17426T());
            sb2.append(' ');
            sb2.append(mo17272b.m17436k0().m17400j());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z10 ? BuildConfig.FLAVOR : ", " + str2 + " body");
            sb2.append(')');
            bVar.mo17231a(sb2.toString());
            if (z10) {
                C4200y m17424O = mo17272b.m17424O();
                int m17558h2 = m17424O.m17558h();
                for (int i12 = 0; i12 < m17558h2; i12++) {
                    this.f22117a.mo17231a(m17424O.m17556e(i12) + ": " + m17424O.m17559i(i12));
                }
                if (z12 && C4556e.m18615c(mo17272b)) {
                    if (m21354b(mo17272b.m17424O())) {
                        this.f22117a.mo17231a("<-- END HTTP (encoded body omitted)");
                    } else {
                        InterfaceC0075e mo14678Q = m17430b.mo14678Q();
                        mo14678Q.mo375u(Long.MAX_VALUE);
                        C0073c mo348a = mo14678Q.mo348a();
                        Charset charset2 = f22116c;
                        C4167b0 mo14681l = m17430b.mo14681l();
                        if (mo14681l != null) {
                            try {
                                charset2 = mo14681l.m17281b(charset2);
                            } catch (UnsupportedCharsetException unused) {
                                this.f22117a.mo17231a(BuildConfig.FLAVOR);
                                this.f22117a.mo17231a("Couldn't decode the response body; charset is likely malformed.");
                                this.f22117a.mo17231a("<-- END HTTP");
                                return mo17272b;
                            }
                        }
                        if (!m21355c(mo348a)) {
                            this.f22117a.mo17231a(BuildConfig.FLAVOR);
                            this.f22117a.mo17231a("<-- END HTTP (binary " + mo348a.m381y0() + "-byte body omitted)");
                            return mo17272b;
                        }
                        if (mo14680i != 0) {
                            this.f22117a.mo17231a(BuildConfig.FLAVOR);
                            this.f22117a.mo17231a(mo348a.clone().mo356g0(charset2));
                        }
                        this.f22117a.mo17231a("<-- END HTTP (" + mo348a.m381y0() + "-byte body)");
                    }
                } else {
                    this.f22117a.mo17231a("<-- END HTTP");
                }
            }
            return mo17272b;
        } catch (Exception e10) {
            this.f22117a.mo17231a("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    /* renamed from: d */
    public C6029a m21356d(a aVar) {
        Objects.requireNonNull(aVar, "level == null. Use Level.NONE instead.");
        this.f22118b = aVar;
        return this;
    }
}
