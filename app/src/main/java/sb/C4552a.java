package sb;

import ac.C0080j;
import ac.C0082l;
import java.io.IOException;
import java.util.List;
import p193ob.AbstractC4179h0;
import p193ob.C4167b0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4190o;
import p193ob.InterfaceC4165a0;
import p193ob.InterfaceC4191p;
import p205pb.C4286e;
import p205pb.C4287f;

/* renamed from: sb.a */
/* loaded from: classes.dex */
public final class C4552a implements InterfaceC4165a0 {

    /* renamed from: a */
    private final InterfaceC4191p f18308a;

    public C4552a(InterfaceC4191p interfaceC4191p) {
        this.f18308a = interfaceC4191p;
    }

    /* renamed from: b */
    private String m18601b(List<C4190o> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            C4190o c4190o = list.get(i10);
            sb2.append(c4190o.m17500c());
            sb2.append('=');
            sb2.append(c4190o.m17502k());
        }
        return sb2.toString();
    }

    @Override // p193ob.InterfaceC4165a0
    /* renamed from: a */
    public C4181i0 mo17270a(InterfaceC4165a0.a aVar) throws IOException {
        C4177g0 mo17275e = aVar.mo17275e();
        C4177g0.a m17398h = mo17275e.m17398h();
        AbstractC4179h0 m17391a = mo17275e.m17391a();
        if (m17391a != null) {
            C4167b0 mo14715b = m17391a.mo14715b();
            if (mo14715b != null) {
                m17398h.m17402b("Content-Type", mo14715b.toString());
            }
            long mo14714a = m17391a.mo14714a();
            if (mo14714a != -1) {
                m17398h.m17402b("Content-Length", Long.toString(mo14714a));
                m17398h.m17406f("Transfer-Encoding");
            } else {
                m17398h.m17402b("Transfer-Encoding", "chunked");
                m17398h.m17406f("Content-Length");
            }
        }
        boolean z10 = false;
        if (mo17275e.m17393c("Host") == null) {
            m17398h.m17402b("Host", C4286e.m17755s(mo17275e.m17400j(), false));
        }
        if (mo17275e.m17393c("Connection") == null) {
            m17398h.m17402b("Connection", "Keep-Alive");
        }
        if (mo17275e.m17393c("Accept-Encoding") == null && mo17275e.m17393c("Range") == null) {
            z10 = true;
            m17398h.m17402b("Accept-Encoding", "gzip");
        }
        List<C4190o> mo17251b = this.f18308a.mo17251b(mo17275e.m17400j());
        if (!mo17251b.isEmpty()) {
            m17398h.m17402b("Cookie", m18601b(mo17251b));
        }
        if (mo17275e.m17393c("User-Agent") == null) {
            m17398h.m17402b("User-Agent", C4287f.m17763a());
        }
        C4181i0 mo17272b = aVar.mo17272b(m17398h.m17401a());
        C4556e.m18619g(this.f18308a, mo17275e.m17400j(), mo17272b.m17424O());
        C4181i0.a m17456q = mo17272b.m17428X().m17456q(mo17275e);
        if (z10 && "gzip".equalsIgnoreCase(mo17272b.m17437l("Content-Encoding")) && C4556e.m18615c(mo17272b)) {
            C0080j c0080j = new C0080j(mo17272b.m17430b().mo14678Q());
            m17456q.m17449j(mo17272b.m17424O().m17557f().m17567g("Content-Encoding").m17567g("Content-Length").m17565e());
            m17456q.m17443b(new C4559h(mo17272b.m17437l("Content-Type"), -1L, C0082l.m425d(c0080j)));
        }
        return m17456q.m17444c();
    }
}
