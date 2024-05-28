package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1581g3;
import com.google.android.gms.internal.measurement.C1832vc;
import com.google.android.gms.internal.measurement.C1856x4;
import com.google.android.gms.internal.measurement.C1886z2;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* loaded from: classes.dex */
public final class C2290s9 extends AbstractC2279r9 {

    /* renamed from: g */
    private final C1581g3 f8554g;

    /* renamed from: h */
    final /* synthetic */ C2301t9 f8555h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2290s9(C2301t9 c2301t9, String str, int i10, C1581g3 c1581g3) {
        super(str, i10);
        this.f8555h = c2301t9;
        this.f8554g = c1581g3;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2279r9
    /* renamed from: a */
    public final int mo10221a() {
        return this.f8554g.m8184w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2279r9
    /* renamed from: b */
    public final boolean mo10222b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2279r9
    /* renamed from: c */
    public final boolean mo10223c() {
        return true;
    }

    /* renamed from: k */
    public final boolean m10303k(Long l10, Long l11, C1856x4 c1856x4, boolean z10) {
        C1832vc.m8924b();
        boolean m9861B = this.f8555h.f8118a.m10134z().m9861B(this.f8518a, C2335x2.f8694Y);
        boolean m8179C = this.f8554g.m8179C();
        boolean m8180D = this.f8554g.m8180D();
        boolean m8181E = this.f8554g.m8181E();
        boolean z11 = m8179C || m8180D || m8181E;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z10 && !z11) {
            this.f8555h.f8118a.mo9765d().m10052v().m9895c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f8519b), this.f8554g.m8182F() ? Integer.valueOf(this.f8554g.m8184w()) : null);
            return true;
        }
        C1886z2 m8185x = this.f8554g.m8185x();
        boolean m9121C = m8185x.m9121C();
        if (c1856x4.m8984M()) {
            if (!m8185x.m9123E()) {
                this.f8555h.f8118a.mo9765d().m10053w().m9894b("No number filter for long property. property", this.f8555h.f8118a.m10105D().m9811f(c1856x4.m8981B()));
            } else {
                bool = AbstractC2279r9.m10297j(AbstractC2279r9.m10295h(c1856x4.m8988x(), m8185x.m9126y()), m9121C);
            }
        } else if (c1856x4.m8983L()) {
            if (!m8185x.m9123E()) {
                this.f8555h.f8118a.mo9765d().m10053w().m9894b("No number filter for double property. property", this.f8555h.f8118a.m10105D().m9811f(c1856x4.m8981B()));
            } else {
                bool = AbstractC2279r9.m10297j(AbstractC2279r9.m10294g(c1856x4.m8987w(), m8185x.m9126y()), m9121C);
            }
        } else if (c1856x4.m8986P()) {
            if (!m8185x.m9125G()) {
                if (!m8185x.m9123E()) {
                    this.f8555h.f8118a.mo9765d().m10053w().m9894b("No string or number filter defined. property", this.f8555h.f8118a.m10105D().m9811f(c1856x4.m8981B()));
                } else if (C2125d9.m9828P(c1856x4.m8982C())) {
                    bool = AbstractC2279r9.m10297j(AbstractC2279r9.m10296i(c1856x4.m8982C(), m8185x.m9126y()), m9121C);
                } else {
                    this.f8555h.f8118a.mo9765d().m10053w().m9895c("Invalid user property value for Numeric number filter. property, value", this.f8555h.f8118a.m10105D().m9811f(c1856x4.m8981B()), c1856x4.m8982C());
                }
            } else {
                bool = AbstractC2279r9.m10297j(AbstractC2279r9.m10293f(c1856x4.m8982C(), m8185x.m9127z(), this.f8555h.f8118a.mo9765d()), m9121C);
            }
        } else {
            this.f8555h.f8118a.mo9765d().m10053w().m9894b("User property has no value, property", this.f8555h.f8118a.m10105D().m9811f(c1856x4.m8981B()));
        }
        this.f8555h.f8118a.mo9765d().m10052v().m9894b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f8520c = Boolean.TRUE;
        if (m8181E && !bool.booleanValue()) {
            return true;
        }
        if (!z10 || this.f8554g.m8179C()) {
            this.f8521d = bool;
        }
        if (bool.booleanValue() && z11 && c1856x4.m8985N()) {
            long m8989y = c1856x4.m8989y();
            if (l10 != null) {
                m8989y = l10.longValue();
            }
            if (m9861B && this.f8554g.m8179C() && !this.f8554g.m8180D() && l11 != null) {
                m8989y = l11.longValue();
            }
            if (this.f8554g.m8180D()) {
                this.f8523f = Long.valueOf(m8989y);
            } else {
                this.f8522e = Long.valueOf(m8989y);
            }
        }
        return true;
    }
}
