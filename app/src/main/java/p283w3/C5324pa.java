package p283w3;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.C0624c;
import androidx.core.os.C0627f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p085g4.AbstractC3263l;
import p087g6.C3288c;
import p087g6.C3296g;
import p087g6.C3303n;
import p127j6.C3645e;
import p321z2.C5978g;

/* renamed from: w3.pa */
/* loaded from: classes.dex */
public final class C5324pa {

    /* renamed from: j */
    private static AbstractC5144c1<String> f20012j;

    /* renamed from: a */
    private final String f20013a;

    /* renamed from: b */
    private final String f20014b;

    /* renamed from: c */
    private final InterfaceC5311oa f20015c;

    /* renamed from: d */
    private final C3303n f20016d;

    /* renamed from: e */
    private final AbstractC3263l<String> f20017e;

    /* renamed from: f */
    private final AbstractC3263l<String> f20018f;

    /* renamed from: g */
    private final String f20019g;

    /* renamed from: h */
    private final Map<EnumC5165d8, Long> f20020h = new HashMap();

    /* renamed from: i */
    private final Map<EnumC5165d8, InterfaceC5172e1<Object, Long>> f20021i = new HashMap();

    public C5324pa(Context context, C3303n c3303n, InterfaceC5311oa interfaceC5311oa, String str) {
        this.f20013a = context.getPackageName();
        this.f20014b = C3288c.m14547a(context);
        this.f20016d = c3303n;
        this.f20015c = interfaceC5311oa;
        this.f20019g = str;
        this.f20017e = C3296g.m14553a().m14556b(new Callable() { // from class: w3.ma

            /* renamed from: a */
            public final /* synthetic */ String f19911a;

            public /* synthetic */ CallableC5285ma(String str2) {
                r1 = str2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5978g.m21262a().m21263b(r1);
            }
        });
        C3296g m14553a = C3296g.m14553a();
        c3303n.getClass();
        this.f20018f = m14553a.m14556b(new Callable() { // from class: w3.la
            public /* synthetic */ CallableC5272la() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3303n.this.m14578a();
            }
        });
    }

    /* renamed from: a */
    static long m19901a(List<Long> list, double d10) {
        return list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0)).longValue();
    }

    /* renamed from: g */
    private static synchronized AbstractC5144c1<String> m19902g() {
        synchronized (C5324pa.class) {
            AbstractC5144c1<String> abstractC5144c1 = f20012j;
            if (abstractC5144c1 != null) {
                return abstractC5144c1;
            }
            C0627f m3343a = C0624c.m3343a(Resources.getSystem().getConfiguration());
            C5431y0 c5431y0 = new C5431y0();
            for (int i10 = 0; i10 < m3343a.m3354d(); i10++) {
                c5431y0.m20039e(C3288c.m14548b(m3343a.m3353c(i10)));
            }
            AbstractC5144c1<String> m20041g = c5431y0.m20041g();
            f20012j = m20041g;
            return m20041g;
        }
    }

    /* renamed from: h */
    private final String m19903h() {
        if (this.f20017e.mo14508o()) {
            return this.f20017e.mo14504k();
        }
        return C5978g.m21262a().m21263b(this.f20019g);
    }

    /* renamed from: i */
    private final boolean m19904i(EnumC5165d8 enumC5165d8, long j10, long j11) {
        return this.f20020h.get(enumC5165d8) == null || j10 - this.f20020h.get(enumC5165d8).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    /* renamed from: b */
    public final void m19905b(InterfaceC5298na interfaceC5298na, EnumC5165d8 enumC5165d8) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m19904i(enumC5165d8, elapsedRealtime, 30L)) {
            this.f20020h.put(enumC5165d8, Long.valueOf(elapsedRealtime));
            m19908e(interfaceC5298na.zza(), enumC5165d8, m19903h());
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m19906c(C5363sa c5363sa, EnumC5165d8 enumC5165d8, String str) {
        String m14578a;
        c5363sa.m19976f(enumC5165d8);
        String m19974b = c5363sa.m19974b();
        C5414w9 c5414w9 = new C5414w9();
        c5414w9.m20016b(this.f20013a);
        c5414w9.m20017c(this.f20014b);
        c5414w9.m20022h(m19902g());
        c5414w9.m20021g(Boolean.TRUE);
        c5414w9.m20025k(m19974b);
        c5414w9.m20024j(str);
        if (this.f20018f.mo14508o()) {
            m14578a = this.f20018f.mo14504k();
        } else {
            m14578a = this.f20016d.m14578a();
        }
        c5414w9.m20023i(m14578a);
        c5414w9.m20018d(10);
        c5363sa.m19977g(c5414w9);
        this.f20015c.mo19845a(c5363sa);
    }

    /* renamed from: d */
    public final void m19907d(C5363sa c5363sa, EnumC5165d8 enumC5165d8) {
        m19908e(c5363sa, enumC5165d8, m19903h());
    }

    /* renamed from: e */
    public final void m19908e(C5363sa c5363sa, EnumC5165d8 enumC5165d8, String str) {
        C3296g.m14554d().execute(new Runnable(c5363sa, enumC5165d8, str, null) { // from class: w3.ka

            /* renamed from: o */
            public final /* synthetic */ EnumC5165d8 f19860o;

            /* renamed from: p */
            public final /* synthetic */ String f19861p;

            /* renamed from: q */
            public final /* synthetic */ C5363sa f19862q;

            public /* synthetic */ RunnableC5259ka(C5363sa c5363sa2, EnumC5165d8 enumC5165d82, String str2, byte[] bArr) {
                this.f19862q = c5363sa2;
                this.f19860o = enumC5165d82;
                this.f19861p = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5324pa.this.m19906c(this.f19862q, this.f19860o, this.f19861p);
            }
        });
    }

    /* renamed from: f */
    public final <K> void m19909f(K k10, long j10, EnumC5165d8 enumC5165d8, C3645e c3645e) {
        if (!this.f20021i.containsKey(enumC5165d8)) {
            this.f20021i.put(enumC5165d8, C5210h0.m19839r());
        }
        InterfaceC5172e1<Object, Long> interfaceC5172e1 = this.f20021i.get(enumC5165d8);
        interfaceC5172e1.mo19793a(k10, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m19904i(enumC5165d8, elapsedRealtime, 30L)) {
            this.f20020h.put(enumC5165d8, Long.valueOf(elapsedRealtime));
            for (Object obj : interfaceC5172e1.mo19826j()) {
                List<Long> mo19801b = interfaceC5172e1.mo19801b(obj);
                Collections.sort(mo19801b);
                C5269l7 c5269l7 = new C5269l7();
                Iterator<Long> it = mo19801b.iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += it.next().longValue();
                }
                c5269l7.m19855a(Long.valueOf(j11 / mo19801b.size()));
                c5269l7.m19857c(Long.valueOf(m19901a(mo19801b, 100.0d)));
                c5269l7.m19860f(Long.valueOf(m19901a(mo19801b, 75.0d)));
                c5269l7.m19858d(Long.valueOf(m19901a(mo19801b, 50.0d)));
                c5269l7.m19856b(Long.valueOf(m19901a(mo19801b, 25.0d)));
                c5269l7.m19859e(Long.valueOf(m19901a(mo19801b, 0.0d)));
                m19908e(c3645e.f15323a.m15557k((C5329q2) obj, interfaceC5172e1.mo19801b(obj).size(), c5269l7.m19861g()), enumC5165d8, m19903h());
            }
            this.f20021i.remove(enumC5165d8);
        }
    }
}
