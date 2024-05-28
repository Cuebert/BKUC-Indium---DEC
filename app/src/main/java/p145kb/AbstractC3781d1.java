package p145kb;

/* renamed from: kb.d1 */
/* loaded from: classes.dex */
public abstract class AbstractC3781d1 extends AbstractC3826v {
    /* renamed from: m0 */
    public abstract AbstractC3781d1 mo16122m0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n0 */
    public final String m16123n0() {
        AbstractC3781d1 abstractC3781d1;
        AbstractC3781d1 m16139c = C3789g0.m16139c();
        if (this == m16139c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC3781d1 = m16139c.mo16122m0();
        } catch (UnsupportedOperationException unused) {
            abstractC3781d1 = null;
        }
        if (this == abstractC3781d1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p145kb.AbstractC3826v
    public String toString() {
        String m16123n0 = m16123n0();
        if (m16123n0 != null) {
            return m16123n0;
        }
        return C3834z.m16239a(this) + '@' + C3834z.m16240b(this);
    }
}
