package p283w3;

import java.io.UnsupportedEncodingException;
import p175n5.C4065d;
import p321z2.C5984j;

/* renamed from: w3.sa */
/* loaded from: classes.dex */
public final class C5363sa {

    /* renamed from: a */
    private final C5192f8 f20147a;

    /* renamed from: b */
    private C5414w9 f20148b = new C5414w9();

    /* renamed from: c */
    private final int f20149c;

    private C5363sa(C5192f8 c5192f8, int i10) {
        this.f20147a = c5192f8;
        C5140bb.m19764a();
        this.f20149c = i10;
    }

    /* renamed from: d */
    public static C5363sa m19971d(C5192f8 c5192f8) {
        return new C5363sa(c5192f8, 0);
    }

    /* renamed from: e */
    public static C5363sa m19972e(C5192f8 c5192f8, int i10) {
        return new C5363sa(c5192f8, 1);
    }

    /* renamed from: a */
    public final int m19973a() {
        return this.f20149c;
    }

    /* renamed from: b */
    public final String m19974b() {
        C5427x9 m19833e = this.f20147a.m19819i().m19833e();
        return (m19833e == null || C5326q.m19911b(m19833e.m20037j())) ? "NA" : (String) C5984j.m21286j(m19833e.m20037j());
    }

    /* renamed from: c */
    public final byte[] m19975c(int i10, boolean z10) {
        this.f20148b.m20020f(Boolean.valueOf(i10 == 0));
        this.f20148b.m20019e(Boolean.FALSE);
        this.f20147a.m19818h(this.f20148b.m20026l());
        try {
            C5140bb.m19764a();
            if (i10 == 0) {
                return new C4065d().m16872j(C5359s6.f20137a).m16873k(true).m16871i().mo16475a(this.f20147a.m19819i()).getBytes("utf-8");
            }
            C5205g8 m19819i = this.f20147a.m19819i();
            C5186f2 c5186f2 = new C5186f2();
            C5359s6.f20137a.mo78a(c5186f2);
            return c5186f2.m19806b().m19828a(m19819i);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    /* renamed from: f */
    public final C5363sa m19976f(EnumC5165d8 enumC5165d8) {
        this.f20147a.m19814d(enumC5165d8);
        return this;
    }

    /* renamed from: g */
    public final C5363sa m19977g(C5414w9 c5414w9) {
        this.f20148b = c5414w9;
        return this;
    }
}
