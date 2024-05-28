package p135k1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p135k1.AbstractC3734l;

/* renamed from: k1.p */
/* loaded from: classes.dex */
public class C3738p extends AbstractC3734l {

    /* renamed from: Y */
    int f15709Y;

    /* renamed from: W */
    private ArrayList<AbstractC3734l> f15707W = new ArrayList<>();

    /* renamed from: X */
    private boolean f15708X = true;

    /* renamed from: Z */
    boolean f15710Z = false;

    /* renamed from: a0 */
    private int f15711a0 = 0;

    /* renamed from: k1.p$a */
    /* loaded from: classes.dex */
    class a extends C3735m {

        /* renamed from: a */
        final /* synthetic */ AbstractC3734l f15712a;

        a(AbstractC3734l abstractC3734l) {
            this.f15712a = abstractC3734l;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            this.f15712a.mo15892d0();
            abstractC3734l.mo15887Z(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.p$b */
    /* loaded from: classes.dex */
    public static class b extends C3735m {

        /* renamed from: a */
        C3738p f15714a;

        b(C3738p c3738p) {
            this.f15714a = c3738p;
        }

        @Override // p135k1.AbstractC3734l.f
        /* renamed from: b */
        public void mo15832b(AbstractC3734l abstractC3734l) {
            C3738p c3738p = this.f15714a;
            int i10 = c3738p.f15709Y - 1;
            c3738p.f15709Y = i10;
            if (i10 == 0) {
                c3738p.f15710Z = false;
                c3738p.m15907t();
            }
            abstractC3734l.mo15887Z(this);
        }

        @Override // p135k1.C3735m, p135k1.AbstractC3734l.f
        /* renamed from: c */
        public void mo15846c(AbstractC3734l abstractC3734l) {
            C3738p c3738p = this.f15714a;
            if (c3738p.f15710Z) {
                return;
            }
            c3738p.m15900k0();
            this.f15714a.f15710Z = true;
        }
    }

    /* renamed from: p0 */
    private void m15918p0(AbstractC3734l abstractC3734l) {
        this.f15707W.add(abstractC3734l);
        abstractC3734l.f15664E = this;
    }

    /* renamed from: y0 */
    private void m15919y0() {
        b bVar = new b(this);
        Iterator<AbstractC3734l> it = this.f15707W.iterator();
        while (it.hasNext()) {
            it.next().mo15888a(bVar);
        }
        this.f15709Y = this.f15707W.size();
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: V */
    public void mo15885V(View view) {
        super.mo15885V(view);
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15707W.get(i10).mo15885V(view);
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: b0 */
    public void mo15890b0(View view) {
        super.mo15890b0(view);
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15707W.get(i10).mo15890b0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p135k1.AbstractC3734l
    /* renamed from: d0 */
    public void mo15892d0() {
        if (this.f15707W.isEmpty()) {
            m15900k0();
            m15907t();
            return;
        }
        m15919y0();
        if (!this.f15708X) {
            for (int i10 = 1; i10 < this.f15707W.size(); i10++) {
                this.f15707W.get(i10 - 1).mo15888a(new a(this.f15707W.get(i10)));
            }
            AbstractC3734l abstractC3734l = this.f15707W.get(0);
            if (abstractC3734l != null) {
                abstractC3734l.mo15892d0();
                return;
            }
            return;
        }
        Iterator<AbstractC3734l> it = this.f15707W.iterator();
        while (it.hasNext()) {
            it.next().mo15892d0();
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: f0 */
    public void mo15894f0(AbstractC3734l.e eVar) {
        super.mo15894f0(eVar);
        this.f15711a0 |= 8;
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15707W.get(i10).mo15894f0(eVar);
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: h0 */
    public void mo15897h0(AbstractC3727g abstractC3727g) {
        super.mo15897h0(abstractC3727g);
        this.f15711a0 |= 4;
        if (this.f15707W != null) {
            for (int i10 = 0; i10 < this.f15707W.size(); i10++) {
                this.f15707W.get(i10).mo15897h0(abstractC3727g);
            }
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: i0 */
    public void mo15898i0(AbstractC3737o abstractC3737o) {
        super.mo15898i0(abstractC3737o);
        this.f15711a0 |= 2;
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15707W.get(i10).mo15898i0(abstractC3737o);
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: j */
    public void mo15816j(C3740r c3740r) {
        if (m15884L(c3740r.f15719b)) {
            Iterator<AbstractC3734l> it = this.f15707W.iterator();
            while (it.hasNext()) {
                AbstractC3734l next = it.next();
                if (next.m15884L(c3740r.f15719b)) {
                    next.mo15816j(c3740r);
                    c3740r.f15720c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p135k1.AbstractC3734l
    /* renamed from: l0 */
    public String mo15901l0(String str) {
        String mo15901l0 = super.mo15901l0(str);
        for (int i10 = 0; i10 < this.f15707W.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo15901l0);
            sb2.append("\n");
            sb2.append(this.f15707W.get(i10).mo15901l0(str + "  "));
            mo15901l0 = sb2.toString();
        }
        return mo15901l0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p135k1.AbstractC3734l
    /* renamed from: m */
    public void mo15902m(C3740r c3740r) {
        super.mo15902m(c3740r);
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15707W.get(i10).mo15902m(c3740r);
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15888a(AbstractC3734l.f fVar) {
        return (C3738p) super.mo15888a(fVar);
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: n */
    public void mo15817n(C3740r c3740r) {
        if (m15884L(c3740r.f15719b)) {
            Iterator<AbstractC3734l> it = this.f15707W.iterator();
            while (it.hasNext()) {
                AbstractC3734l next = it.next();
                if (next.m15884L(c3740r.f15719b)) {
                    next.mo15817n(c3740r);
                    c3740r.f15720c.add(next);
                }
            }
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15891d(View view) {
        for (int i10 = 0; i10 < this.f15707W.size(); i10++) {
            this.f15707W.get(i10).mo15891d(view);
        }
        return (C3738p) super.mo15891d(view);
    }

    /* renamed from: o0 */
    public C3738p m15922o0(AbstractC3734l abstractC3734l) {
        m15918p0(abstractC3734l);
        long j10 = this.f15681p;
        if (j10 >= 0) {
            abstractC3734l.mo15893e0(j10);
        }
        if ((this.f15711a0 & 1) != 0) {
            abstractC3734l.mo15895g0(m15910w());
        }
        if ((this.f15711a0 & 2) != 0) {
            m15877B();
            abstractC3734l.mo15898i0(null);
        }
        if ((this.f15711a0 & 4) != 0) {
            abstractC3734l.mo15897h0(m15876A());
        }
        if ((this.f15711a0 & 8) != 0) {
            abstractC3734l.mo15894f0(m15909v());
        }
        return this;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: q */
    public AbstractC3734l clone() {
        C3738p c3738p = (C3738p) super.clone();
        c3738p.f15707W = new ArrayList<>();
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            c3738p.m15918p0(this.f15707W.get(i10).clone());
        }
        return c3738p;
    }

    /* renamed from: q0 */
    public AbstractC3734l m15923q0(int i10) {
        if (i10 < 0 || i10 >= this.f15707W.size()) {
            return null;
        }
        return this.f15707W.get(i10);
    }

    /* renamed from: r0 */
    public int m15924r0() {
        return this.f15707W.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p135k1.AbstractC3734l
    /* renamed from: s */
    public void mo15906s(ViewGroup viewGroup, C3741s c3741s, C3741s c3741s2, ArrayList<C3740r> arrayList, ArrayList<C3740r> arrayList2) {
        long m15878D = m15878D();
        int size = this.f15707W.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3734l abstractC3734l = this.f15707W.get(i10);
            if (m15878D > 0 && (this.f15708X || i10 == 0)) {
                long m15878D2 = abstractC3734l.m15878D();
                if (m15878D2 > 0) {
                    abstractC3734l.mo15899j0(m15878D2 + m15878D);
                } else {
                    abstractC3734l.mo15899j0(m15878D);
                }
            }
            abstractC3734l.mo15906s(viewGroup, c3741s, c3741s2, arrayList, arrayList2);
        }
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15887Z(AbstractC3734l.f fVar) {
        return (C3738p) super.mo15887Z(fVar);
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15889a0(View view) {
        for (int i10 = 0; i10 < this.f15707W.size(); i10++) {
            this.f15707W.get(i10).mo15889a0(view);
        }
        return (C3738p) super.mo15889a0(view);
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15893e0(long j10) {
        ArrayList<AbstractC3734l> arrayList;
        super.mo15893e0(j10);
        if (this.f15681p >= 0 && (arrayList = this.f15707W) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15707W.get(i10).mo15893e0(j10);
            }
        }
        return this;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15895g0(TimeInterpolator timeInterpolator) {
        this.f15711a0 |= 1;
        ArrayList<AbstractC3734l> arrayList = this.f15707W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15707W.get(i10).mo15895g0(timeInterpolator);
            }
        }
        return (C3738p) super.mo15895g0(timeInterpolator);
    }

    /* renamed from: w0 */
    public C3738p m15929w0(int i10) {
        if (i10 == 0) {
            this.f15708X = true;
        } else if (i10 == 1) {
            this.f15708X = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    @Override // p135k1.AbstractC3734l
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C3738p mo15899j0(long j10) {
        return (C3738p) super.mo15899j0(j10);
    }
}
