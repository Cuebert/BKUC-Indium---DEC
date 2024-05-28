package p147l0;

import java.util.ArrayList;
import p134k0.C3707c;

/* renamed from: l0.l */
/* loaded from: classes.dex */
public class C3867l extends C3860e {

    /* renamed from: D0 */
    public ArrayList<C3860e> f16103D0 = new ArrayList<>();

    /* renamed from: a1 */
    public ArrayList<C3860e> m16467a1() {
        return this.f16103D0;
    }

    /* renamed from: b */
    public void m16468b(C3860e c3860e) {
        this.f16103D0.add(c3860e);
        if (c3860e.m16339I() != null) {
            ((C3867l) c3860e.m16339I()).m16469c1(c3860e);
        }
        c3860e.m16348M0(this);
    }

    /* renamed from: b1 */
    public void mo16429b1() {
        ArrayList<C3860e> arrayList = this.f16103D0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3860e c3860e = this.f16103D0.get(i10);
            if (c3860e instanceof C3867l) {
                ((C3867l) c3860e).mo16429b1();
            }
        }
    }

    /* renamed from: c1 */
    public void m16469c1(C3860e c3860e) {
        this.f16103D0.remove(c3860e);
        c3860e.mo16381h0();
    }

    /* renamed from: d1 */
    public void m16470d1() {
        this.f16103D0.clear();
    }

    @Override // p147l0.C3860e
    /* renamed from: h0 */
    public void mo16381h0() {
        this.f16103D0.clear();
        super.mo16381h0();
    }

    @Override // p147l0.C3860e
    /* renamed from: j0 */
    public void mo16384j0(C3707c c3707c) {
        super.mo16384j0(c3707c);
        int size = this.f16103D0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16103D0.get(i10).mo16384j0(c3707c);
        }
    }
}
