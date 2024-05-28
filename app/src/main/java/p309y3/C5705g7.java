package p309y3;

import java.io.UnsupportedEncodingException;
import p175n5.C4065d;
import p321z2.C5984j;

/* renamed from: y3.g7 */
/* loaded from: classes.dex */
public final class C5705g7 {

    /* renamed from: a */
    private final C5643a5 f21042a;

    /* renamed from: b */
    private C5772n6 f21043b = new C5772n6();

    private C5705g7(C5643a5 c5643a5, int i10) {
        this.f21042a = c5643a5;
        C5827t7.m20771a();
    }

    /* renamed from: c */
    public static C5705g7 m20685c(C5643a5 c5643a5) {
        return new C5705g7(c5643a5, 0);
    }

    /* renamed from: a */
    public final String m20686a() {
        C5781o6 m20667c = this.f21042a.m20658f().m20667c();
        return (m20667c == null || C5703g5.m20684b(m20667c.m20739j())) ? "NA" : (String) C5984j.m21286j(m20667c.m20739j());
    }

    /* renamed from: b */
    public final byte[] m20687b(int i10, boolean z10) {
        this.f21043b.m20723f(Boolean.valueOf(i10 == 0));
        this.f21043b.m20722e(Boolean.FALSE);
        this.f21042a.m20657e(this.f21043b.m20729l());
        try {
            C5827t7.m20771a();
            if (i10 == 0) {
                return new C4065d().m16872j(C5796q3.f21287a).m16873k(true).m16871i().mo16475a(this.f21042a.m20658f()).getBytes("utf-8");
            }
            C5653b5 m20658f = this.f21042a.m20658f();
            C5657c c5657c = new C5657c();
            C5796q3.f21287a.mo78a(c5657c);
            return c5657c.m20668b().m20669a(m20658f);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    /* renamed from: d */
    public final C5705g7 m20688d(EnumC5869y4 enumC5869y4) {
        this.f21042a.m20655c(enumC5869y4);
        return this;
    }

    /* renamed from: e */
    public final C5705g7 m20689e(C5772n6 c5772n6) {
        this.f21043b = c5772n6;
        return this;
    }
}
