package p246t3;

import java.util.Arrays;

/* renamed from: t3.l2 */
/* loaded from: classes.dex */
public final class C4674l2 extends AbstractC4702s2 {

    /* renamed from: n */
    private final AbstractC4626a2 f18474n;

    public C4674l2(AbstractC4626a2 abstractC4626a2) {
        this.f18474n = abstractC4626a2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4702s2 abstractC4702s2 = (AbstractC4702s2) obj;
        if (AbstractC4702s2.m18817d((byte) 64) != abstractC4702s2.zza()) {
            return AbstractC4702s2.m18817d((byte) 64) - abstractC4702s2.zza();
        }
        C4674l2 c4674l2 = (C4674l2) abstractC4702s2;
        AbstractC4626a2 abstractC4626a2 = this.f18474n;
        int mo18731i = abstractC4626a2.mo18731i();
        AbstractC4626a2 abstractC4626a22 = c4674l2.f18474n;
        if (mo18731i != abstractC4626a22.mo18731i()) {
            return abstractC4626a2.mo18731i() - abstractC4626a22.mo18731i();
        }
        return C4689p1.m18801a().compare(abstractC4626a2.m18738u(), c4674l2.f18474n.m18738u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4674l2.class == obj.getClass()) {
            return this.f18474n.equals(((C4674l2) obj).f18474n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4702s2.m18817d((byte) 64)), this.f18474n});
    }

    /* renamed from: l */
    public final AbstractC4626a2 m18790l() {
        return this.f18474n;
    }

    public final String toString() {
        AbstractC4661i1 mo18766c = AbstractC4661i1.m18777d().mo18766c();
        byte[] m18738u = this.f18474n.m18738u();
        return "h'" + mo18766c.m18778e(m18738u, 0, m18738u.length) + "'";
    }

    @Override // p246t3.AbstractC4702s2
    public final int zza() {
        return AbstractC4702s2.m18817d((byte) 64);
    }
}
