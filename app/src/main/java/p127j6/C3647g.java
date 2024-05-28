package p127j6;

import android.os.SystemClock;
import java.util.List;
import p032c6.C1131a;
import p087g6.AbstractC3294f;
import p087g6.C3298i;
import p113i6.C3535a;
import p113i6.C3537c;
import p140k6.C3759a;
import p153l6.C3881a;
import p153l6.C3884d;
import p283w3.C5192f8;
import p283w3.C5282m7;
import p283w3.C5303o2;
import p283w3.C5316p2;
import p283w3.C5324pa;
import p283w3.C5329q2;
import p283w3.C5334q7;
import p283w3.C5348r8;
import p283w3.C5350ra;
import p283w3.C5363sa;
import p283w3.C5399v7;
import p283w3.C5431y0;
import p283w3.EnumC5151c8;
import p283w3.EnumC5165d8;
import p283w3.EnumC5347r7;
import p283w3.InterfaceC5298na;
import p321z2.C5984j;

/* renamed from: j6.g */
/* loaded from: classes.dex */
public final class C3647g extends AbstractC3294f<List<C3535a>, C3759a> {

    /* renamed from: j */
    private static final C3884d f15330j = C3884d.m16498b();

    /* renamed from: k */
    static boolean f15331k = true;

    /* renamed from: d */
    private final C3537c f15332d;

    /* renamed from: e */
    private final InterfaceC3648h f15333e;

    /* renamed from: f */
    private final C5324pa f15334f;

    /* renamed from: g */
    private final C5350ra f15335g;

    /* renamed from: h */
    private final C3881a f15336h = new C3881a();

    /* renamed from: i */
    private boolean f15337i;

    public C3647g(C3298i c3298i, C3537c c3537c, InterfaceC3648h interfaceC3648h, C5324pa c5324pa) {
        C5984j.m21287k(c3298i, "MlKitContext can not be null");
        C5984j.m21287k(c3537c, "BarcodeScannerOptions can not be null");
        this.f15332d = c3537c;
        this.f15333e = interfaceC3648h;
        this.f15334f = c5324pa;
        this.f15335g = C5350ra.m19956a(c3298i.m14562b());
    }

    /* renamed from: l */
    private final void m15554l(EnumC5151c8 enumC5151c8, long j10, C3759a c3759a, List<C3535a> list) {
        C5431y0 c5431y0 = new C5431y0();
        C5431y0 c5431y02 = new C5431y0();
        if (list != null) {
            for (C3535a c3535a : list) {
                c5431y0.m20039e(C3642b.m15549a(c3535a.m15334a()));
                c5431y02.m20039e(C3642b.m15550b(c3535a.m15336c()));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        this.f15334f.m19905b(new InterfaceC5298na() { // from class: j6.f

            /* renamed from: b */
            public final /* synthetic */ long f15325b;

            /* renamed from: c */
            public final /* synthetic */ EnumC5151c8 f15326c;

            /* renamed from: d */
            public final /* synthetic */ C5431y0 f15327d;

            /* renamed from: e */
            public final /* synthetic */ C5431y0 f15328e;

            /* renamed from: f */
            public final /* synthetic */ C3759a f15329f;

            public /* synthetic */ C3646f(long elapsedRealtime2, EnumC5151c8 enumC5151c82, C5431y0 c5431y03, C5431y0 c5431y022, C3759a c3759a2) {
                r2 = elapsedRealtime2;
                r4 = enumC5151c82;
                r5 = c5431y03;
                r6 = c5431y022;
                r7 = c3759a2;
            }

            @Override // p283w3.InterfaceC5298na
            public final C5363sa zza() {
                return C3647g.this.m15556j(r2, r4, r5, r6, r7);
            }
        }, EnumC5165d8.ON_DEVICE_BARCODE_DETECT);
        C5316p2 c5316p2 = new C5316p2();
        c5316p2.m19897e(enumC5151c82);
        c5316p2.m19898f(Boolean.valueOf(f15331k));
        c5316p2.m19899g(C3642b.m15551c(this.f15332d));
        c5316p2.m19895c(c5431y03.m20041g());
        c5316p2.m19896d(c5431y022.m20041g());
        this.f15334f.m19909f(c5316p2.m19900h(), elapsedRealtime2, EnumC5165d8.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, new C3645e(this));
        long currentTimeMillis = System.currentTimeMillis();
        this.f15335g.m19958c(true != this.f15337i ? 24301 : 24302, enumC5151c82.zza(), currentTimeMillis - elapsedRealtime2, currentTimeMillis);
    }

    @Override // p087g6.AbstractC3300k
    /* renamed from: b */
    public final synchronized void mo14569b() throws C1131a {
        this.f15337i = this.f15333e.mo15558a();
    }

    @Override // p087g6.AbstractC3300k
    /* renamed from: d */
    public final synchronized void mo14571d() {
        this.f15333e.zzb();
        f15331k = true;
    }

    @Override // p087g6.AbstractC3294f
    /* renamed from: i */
    public final synchronized List<C3535a> mo14552h(C3759a c3759a) throws C1131a {
        EnumC5151c8 enumC5151c8;
        List<C3535a> mo15559b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f15336h.m16488a(c3759a);
        try {
            mo15559b = this.f15333e.mo15559b(c3759a);
            m15554l(EnumC5151c8.NO_ERROR, elapsedRealtime, c3759a, mo15559b);
            f15331k = false;
        } catch (C1131a e10) {
            if (e10.m6525a() == 14) {
                enumC5151c8 = EnumC5151c8.MODEL_NOT_DOWNLOADED;
            } else {
                enumC5151c8 = EnumC5151c8.UNKNOWN_ERROR;
            }
            m15554l(enumC5151c8, elapsedRealtime, c3759a, null);
            throw e10;
        }
        return mo15559b;
    }

    /* renamed from: j */
    public final /* synthetic */ C5363sa m15556j(long j10, EnumC5151c8 enumC5151c8, C5431y0 c5431y0, C5431y0 c5431y02, C3759a c3759a) {
        EnumC5347r7 enumC5347r7;
        C5348r8 c5348r8 = new C5348r8();
        C5399v7 c5399v7 = new C5399v7();
        c5399v7.m19994c(Long.valueOf(j10));
        c5399v7.m19995d(enumC5151c8);
        c5399v7.m19996e(Boolean.valueOf(f15331k));
        Boolean bool = Boolean.TRUE;
        c5399v7.m19992a(bool);
        c5399v7.m19993b(bool);
        c5348r8.m19953h(c5399v7.m19997f());
        c5348r8.m19954i(C3642b.m15551c(this.f15332d));
        c5348r8.m19950e(c5431y0.m20041g());
        c5348r8.m19951f(c5431y02.m20041g());
        int m15972d = c3759a.m15972d();
        int m16500c = f15330j.m16500c(c3759a);
        C5334q7 c5334q7 = new C5334q7();
        if (m15972d == -1) {
            enumC5347r7 = EnumC5347r7.BITMAP;
        } else if (m15972d == 35) {
            enumC5347r7 = EnumC5347r7.YUV_420_888;
        } else if (m15972d == 842094169) {
            enumC5347r7 = EnumC5347r7.YV12;
        } else if (m15972d == 16) {
            enumC5347r7 = EnumC5347r7.NV16;
        } else if (m15972d != 17) {
            enumC5347r7 = EnumC5347r7.UNKNOWN_FORMAT;
        } else {
            enumC5347r7 = EnumC5347r7.NV21;
        }
        c5334q7.m19919a(enumC5347r7);
        c5334q7.m19920b(Integer.valueOf(m16500c));
        c5348r8.m19952g(c5334q7.m19921d());
        C5192f8 c5192f8 = new C5192f8();
        c5192f8.m19815e(Boolean.valueOf(this.f15337i));
        c5192f8.m19816f(c5348r8.m19955j());
        return C5363sa.m19971d(c5192f8);
    }

    /* renamed from: k */
    public final /* synthetic */ C5363sa m15557k(C5329q2 c5329q2, int i10, C5282m7 c5282m7) {
        C5192f8 c5192f8 = new C5192f8();
        c5192f8.m19815e(Boolean.valueOf(this.f15337i));
        C5303o2 c5303o2 = new C5303o2();
        c5303o2.m19878a(Integer.valueOf(i10));
        c5303o2.m19880c(c5329q2);
        c5303o2.m19879b(c5282m7);
        c5192f8.m19813c(c5303o2.m19881e());
        return C5363sa.m19971d(c5192f8);
    }
}
