package p309y3;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.C0624c;
import androidx.core.os.C0627f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p085g4.AbstractC3263l;
import p087g6.C3288c;
import p087g6.C3296g;
import p087g6.C3303n;
import p321z2.C5978g;

/* renamed from: y3.f7 */
/* loaded from: classes.dex */
public final class C5695f7 {

    /* renamed from: j */
    private static AbstractC5881z7<String> f21007j;

    /* renamed from: a */
    private final String f21008a;

    /* renamed from: b */
    private final String f21009b;

    /* renamed from: c */
    private final InterfaceC5685e7 f21010c;

    /* renamed from: d */
    private final C3303n f21011d;

    /* renamed from: e */
    private final AbstractC3263l<String> f21012e;

    /* renamed from: f */
    private final AbstractC3263l<String> f21013f;

    /* renamed from: g */
    private final String f21014g;

    /* renamed from: h */
    private final Map<EnumC5869y4, Long> f21015h = new HashMap();

    /* renamed from: i */
    private final Map<EnumC5869y4, Object> f21016i = new HashMap();

    public C5695f7(Context context, C3303n c3303n, InterfaceC5685e7 interfaceC5685e7, String str) {
        this.f21008a = context.getPackageName();
        this.f21009b = C3288c.m14547a(context);
        this.f21011d = c3303n;
        this.f21010c = interfaceC5685e7;
        this.f21014g = str;
        this.f21012e = C3296g.m14553a().m14556b(new Callable() { // from class: y3.d7

            /* renamed from: a */
            public final /* synthetic */ String f20909a;

            public /* synthetic */ CallableC5675d7(String str2) {
                r1 = str2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5978g.m21262a().m21263b(r1);
            }
        });
        C3296g m14553a = C3296g.m14553a();
        c3303n.getClass();
        this.f21013f = m14553a.m14556b(new Callable() { // from class: y3.c7
            public /* synthetic */ CallableC5665c7() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3303n.this.m14578a();
            }
        });
    }

    /* renamed from: c */
    private static synchronized AbstractC5881z7<String> m20679c() {
        synchronized (C5695f7.class) {
            AbstractC5881z7<String> abstractC5881z7 = f21007j;
            if (abstractC5881z7 != null) {
                return abstractC5881z7;
            }
            C0627f m3343a = C0624c.m3343a(Resources.getSystem().getConfiguration());
            C5854w7 c5854w7 = new C5854w7();
            for (int i10 = 0; i10 < m3343a.m3354d(); i10++) {
                c5854w7.m20780c(C3288c.m14548b(m3343a.m3353c(i10)));
            }
            AbstractC5881z7<String> m20781d = c5854w7.m20781d();
            f21007j = m20781d;
            return m20781d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m20680a(C5705g7 c5705g7, EnumC5869y4 enumC5869y4, String str) {
        String m14578a;
        c5705g7.m20688d(enumC5869y4);
        String m20686a = c5705g7.m20686a();
        C5772n6 c5772n6 = new C5772n6();
        c5772n6.m20719b(this.f21008a);
        c5772n6.m20720c(this.f21009b);
        c5772n6.m20725h(m20679c());
        c5772n6.m20724g(Boolean.TRUE);
        c5772n6.m20728k(m20686a);
        c5772n6.m20727j(str);
        if (this.f21013f.mo14508o()) {
            m14578a = this.f21013f.mo14504k();
        } else {
            m14578a = this.f21011d.m14578a();
        }
        c5772n6.m20726i(m14578a);
        c5772n6.m20721d(10);
        c5705g7.m20689e(c5772n6);
        this.f21010c.mo20659a(c5705g7);
    }

    /* renamed from: b */
    public final void m20681b(C5800q7 c5800q7, EnumC5869y4 enumC5869y4) {
        EnumC5761m4 enumC5761m4;
        EnumC5815s4 enumC5815s4;
        String m21263b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f21015h.get(enumC5869y4) != null && elapsedRealtime - this.f21015h.get(enumC5869y4).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f21015h.put(enumC5869y4, Long.valueOf(elapsedRealtime));
        int i10 = c5800q7.f21288a;
        int i11 = c5800q7.f21289b;
        int i12 = c5800q7.f21290c;
        int i13 = c5800q7.f21291d;
        int i14 = c5800q7.f21292e;
        long j10 = c5800q7.f21293f;
        int i15 = c5800q7.f21294g;
        C5806r4 c5806r4 = new C5806r4();
        if (i10 == -1) {
            enumC5761m4 = EnumC5761m4.BITMAP;
        } else if (i10 == 35) {
            enumC5761m4 = EnumC5761m4.YUV_420_888;
        } else if (i10 == 842094169) {
            enumC5761m4 = EnumC5761m4.YV12;
        } else if (i10 == 16) {
            enumC5761m4 = EnumC5761m4.NV16;
        } else if (i10 != 17) {
            enumC5761m4 = EnumC5761m4.UNKNOWN_FORMAT;
        } else {
            enumC5761m4 = EnumC5761m4.NV21;
        }
        c5806r4.m20751d(enumC5761m4);
        if (i11 == 1) {
            enumC5815s4 = EnumC5815s4.BITMAP;
        } else if (i11 == 2) {
            enumC5815s4 = EnumC5815s4.BYTEARRAY;
        } else if (i11 == 3) {
            enumC5815s4 = EnumC5815s4.BYTEBUFFER;
        } else if (i11 != 4) {
            enumC5815s4 = EnumC5815s4.ANDROID_MEDIA_IMAGE;
        } else {
            enumC5815s4 = EnumC5815s4.FILEPATH;
        }
        c5806r4.m20753f(enumC5815s4);
        c5806r4.m20750c(Integer.valueOf(i12));
        c5806r4.m20752e(Integer.valueOf(i13));
        c5806r4.m20754g(Integer.valueOf(i14));
        c5806r4.m20749b(Long.valueOf(j10));
        c5806r4.m20755h(Integer.valueOf(i15));
        C5824t4 m20756j = c5806r4.m20756j();
        C5643a5 c5643a5 = new C5643a5();
        c5643a5.m20656d(m20756j);
        C5705g7 m20685c = C5705g7.m20685c(c5643a5);
        if (this.f21012e.mo14508o()) {
            m21263b = this.f21012e.mo14504k();
        } else {
            m21263b = C5978g.m21262a().m21263b(this.f21014g);
        }
        C3296g.m14554d().execute(new Runnable(m20685c, enumC5869y4, m21263b, null) { // from class: y3.b7

            /* renamed from: o */
            public final /* synthetic */ EnumC5869y4 f20871o;

            /* renamed from: p */
            public final /* synthetic */ String f20872p;

            /* renamed from: q */
            public final /* synthetic */ C5705g7 f20873q;

            public /* synthetic */ RunnableC5655b7(C5705g7 m20685c2, EnumC5869y4 enumC5869y42, String m21263b2, byte[] bArr) {
                this.f20873q = m20685c2;
                this.f20871o = enumC5869y42;
                this.f20872p = m21263b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5695f7.this.m20680a(this.f20873q, this.f20871o, this.f20872p);
            }
        });
    }
}
