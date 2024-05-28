package p266ub;

import ac.C0091u;
import ac.InterfaceC0089s;
import ac.InterfaceC0090t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p193ob.C4171d0;
import p193ob.C4177g0;
import p193ob.C4181i0;
import p193ob.C4200y;
import p193ob.EnumC4173e0;
import p193ob.InterfaceC4165a0;
import p205pb.AbstractC4282a;
import p205pb.C4286e;
import p230rb.C4474e;
import sb.C4556e;
import sb.C4560i;
import sb.C4562k;
import sb.InterfaceC4554c;

/* renamed from: ub.g */
/* loaded from: classes.dex */
public final class C4915g implements InterfaceC4554c {

    /* renamed from: g */
    private static final List<String> f18897g = C4286e.m17757u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    private static final List<String> f18898h = C4286e.m17757u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final InterfaceC4165a0.a f18899a;

    /* renamed from: b */
    private final C4474e f18900b;

    /* renamed from: c */
    private final C4914f f18901c;

    /* renamed from: d */
    private volatile C4917i f18902d;

    /* renamed from: e */
    private final EnumC4173e0 f18903e;

    /* renamed from: f */
    private volatile boolean f18904f;

    public C4915g(C4171d0 c4171d0, C4474e c4474e, InterfaceC4165a0.a aVar, C4914f c4914f) {
        this.f18900b = c4474e;
        this.f18899a = aVar;
        this.f18901c = c4914f;
        List<EnumC4173e0> m17291A = c4171d0.m17291A();
        EnumC4173e0 enumC4173e0 = EnumC4173e0.H2_PRIOR_KNOWLEDGE;
        this.f18903e = m17291A.contains(enumC4173e0) ? enumC4173e0 : EnumC4173e0.HTTP_2;
    }

    /* renamed from: i */
    public static List<C4911c> m19250i(C4177g0 c4177g0) {
        C4200y m17395e = c4177g0.m17395e();
        ArrayList arrayList = new ArrayList(m17395e.m17558h() + 4);
        arrayList.add(new C4911c(C4911c.f18796f, c4177g0.m17397g()));
        arrayList.add(new C4911c(C4911c.f18797g, C4560i.m18638c(c4177g0.m17400j())));
        String m17393c = c4177g0.m17393c("Host");
        if (m17393c != null) {
            arrayList.add(new C4911c(C4911c.f18799i, m17393c));
        }
        arrayList.add(new C4911c(C4911c.f18798h, c4177g0.m17400j().m17585D()));
        int m17558h = m17395e.m17558h();
        for (int i10 = 0; i10 < m17558h; i10++) {
            String lowerCase = m17395e.m17556e(i10).toLowerCase(Locale.US);
            if (!f18897g.contains(lowerCase) || (lowerCase.equals("te") && m17395e.m17559i(i10).equals("trailers"))) {
                arrayList.add(new C4911c(lowerCase, m17395e.m17559i(i10)));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C4181i0.a m19251j(C4200y c4200y, EnumC4173e0 enumC4173e0) throws IOException {
        C4200y.a aVar = new C4200y.a();
        int m17558h = c4200y.m17558h();
        C4562k c4562k = null;
        for (int i10 = 0; i10 < m17558h; i10++) {
            String m17556e = c4200y.m17556e(i10);
            String m17559i = c4200y.m17559i(i10);
            if (m17556e.equals(":status")) {
                c4562k = C4562k.m18644a("HTTP/1.1 " + m17559i);
            } else if (!f18898h.contains(m17556e)) {
                AbstractC4282a.f17486a.mo17320b(aVar, m17556e, m17559i);
            }
        }
        if (c4562k != null) {
            return new C4181i0.a().m17454o(enumC4173e0).m17446g(c4562k.f18330b).m17451l(c4562k.f18331c).m17449j(aVar.m17565e());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: a */
    public C4474e mo18602a() {
        return this.f18900b;
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: b */
    public void mo18603b(C4177g0 c4177g0) throws IOException {
        if (this.f18902d != null) {
            return;
        }
        this.f18902d = this.f18901c.m19223n0(m19250i(c4177g0), c4177g0.m17391a() != null);
        if (!this.f18904f) {
            C0091u m19279l = this.f18902d.m19279l();
            long mo17274d = this.f18899a.mo17274d();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            m19279l.mo413g(mo17274d, timeUnit);
            this.f18902d.m19285r().mo413g(this.f18899a.mo17276f(), timeUnit);
            return;
        }
        this.f18902d.m19273f(EnumC4910b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: c */
    public void mo18604c() throws IOException {
        this.f18902d.m19275h().close();
    }

    @Override // sb.InterfaceC4554c
    public void cancel() {
        this.f18904f = true;
        if (this.f18902d != null) {
            this.f18902d.m19273f(EnumC4910b.CANCEL);
        }
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: d */
    public void mo18605d() throws IOException {
        this.f18901c.flush();
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: e */
    public long mo18606e(C4181i0 c4181i0) {
        return C4556e.m18614b(c4181i0);
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: f */
    public InterfaceC0089s mo18607f(C4177g0 c4177g0, long j10) {
        return this.f18902d.m19275h();
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: g */
    public InterfaceC0090t mo18608g(C4181i0 c4181i0) {
        return this.f18902d.m19276i();
    }

    @Override // sb.InterfaceC4554c
    /* renamed from: h */
    public C4181i0.a mo18609h(boolean z10) throws IOException {
        C4181i0.a m19251j = m19251j(this.f18902d.m19283p(), this.f18903e);
        if (z10 && AbstractC4282a.f17486a.mo17322d(m19251j) == 100) {
            return null;
        }
        return m19251j;
    }
}
