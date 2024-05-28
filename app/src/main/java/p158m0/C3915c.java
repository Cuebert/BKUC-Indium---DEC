package p158m0;

import java.util.ArrayList;
import java.util.Iterator;
import p147l0.C3859d;
import p147l0.C3860e;
import p147l0.C3861f;

/* renamed from: m0.c */
/* loaded from: classes.dex */
public class C3915c extends AbstractC3928p {

    /* renamed from: k */
    ArrayList<AbstractC3928p> f16236k;

    /* renamed from: l */
    private int f16237l;

    public C3915c(C3860e c3860e, int i10) {
        super(c3860e);
        this.f16236k = new ArrayList<>();
        this.f16303f = i10;
        m16598q();
    }

    /* renamed from: q */
    private void m16598q() {
        C3860e c3860e;
        C3860e c3860e2 = this.f16299b;
        C3860e m16341J = c3860e2.m16341J(this.f16303f);
        while (true) {
            C3860e c3860e3 = m16341J;
            c3860e = c3860e2;
            c3860e2 = c3860e3;
            if (c3860e2 == null) {
                break;
            } else {
                m16341J = c3860e2.m16341J(this.f16303f);
            }
        }
        this.f16299b = c3860e;
        this.f16236k.add(c3860e.m16345L(this.f16303f));
        C3860e m16337H = c3860e.m16337H(this.f16303f);
        while (m16337H != null) {
            this.f16236k.add(m16337H.m16345L(this.f16303f));
            m16337H = m16337H.m16337H(this.f16303f);
        }
        Iterator<AbstractC3928p> it = this.f16236k.iterator();
        while (it.hasNext()) {
            AbstractC3928p next = it.next();
            int i10 = this.f16303f;
            if (i10 == 0) {
                next.f16299b.f15996c = this;
            } else if (i10 == 1) {
                next.f16299b.f15998d = this;
            }
        }
        if ((this.f16303f == 0 && ((C3861f) this.f16299b.m16339I()).m16445x1()) && this.f16236k.size() > 1) {
            ArrayList<AbstractC3928p> arrayList = this.f16236k;
            this.f16299b = arrayList.get(arrayList.size() - 1).f16299b;
        }
        this.f16237l = this.f16303f == 0 ? this.f16299b.m16411x() : this.f16299b.m16349N();
    }

    /* renamed from: r */
    private C3860e m16599r() {
        for (int i10 = 0; i10 < this.f16236k.size(); i10++) {
            AbstractC3928p abstractC3928p = this.f16236k.get(i10);
            if (abstractC3928p.f16299b.m16355Q() != 8) {
                return abstractC3928p.f16299b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C3860e m16600s() {
        for (int size = this.f16236k.size() - 1; size >= 0; size--) {
            AbstractC3928p abstractC3928p = this.f16236k.get(size);
            if (abstractC3928p.f16299b.m16355Q() != 8) {
                return abstractC3928p.f16299b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a6, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d1, code lost:
    
        r9.f16302e.mo16623d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ce, code lost:
    
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cc, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x041a, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // p158m0.AbstractC3928p, p158m0.InterfaceC3916d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16601a(p158m0.InterfaceC3916d r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p158m0.C3915c.mo16601a(m0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: d */
    public void mo16602d() {
        Iterator<AbstractC3928p> it = this.f16236k.iterator();
        while (it.hasNext()) {
            it.next().mo16602d();
        }
        int size = this.f16236k.size();
        if (size < 1) {
            return;
        }
        C3860e c3860e = this.f16236k.get(0).f16299b;
        C3860e c3860e2 = this.f16236k.get(size - 1).f16299b;
        if (this.f16303f == 0) {
            C3859d c3859d = c3860e.f15973H;
            C3859d c3859d2 = c3860e2.f15975J;
            C3918f m16661i = m16661i(c3859d, 0);
            int m16305e = c3859d.m16305e();
            C3860e m16599r = m16599r();
            if (m16599r != null) {
                m16305e = m16599r.f15973H.m16305e();
            }
            if (m16661i != null) {
                m16657b(this.f16305h, m16661i, m16305e);
            }
            C3918f m16661i2 = m16661i(c3859d2, 0);
            int m16305e2 = c3859d2.m16305e();
            C3860e m16600s = m16600s();
            if (m16600s != null) {
                m16305e2 = m16600s.f15975J.m16305e();
            }
            if (m16661i2 != null) {
                m16657b(this.f16306i, m16661i2, -m16305e2);
            }
        } else {
            C3859d c3859d3 = c3860e.f15974I;
            C3859d c3859d4 = c3860e2.f15976K;
            C3918f m16661i3 = m16661i(c3859d3, 1);
            int m16305e3 = c3859d3.m16305e();
            C3860e m16599r2 = m16599r();
            if (m16599r2 != null) {
                m16305e3 = m16599r2.f15974I.m16305e();
            }
            if (m16661i3 != null) {
                m16657b(this.f16305h, m16661i3, m16305e3);
            }
            C3918f m16661i4 = m16661i(c3859d4, 1);
            int m16305e4 = c3859d4.m16305e();
            C3860e m16600s2 = m16600s();
            if (m16600s2 != null) {
                m16305e4 = m16600s2.f15976K.m16305e();
            }
            if (m16661i4 != null) {
                m16657b(this.f16306i, m16661i4, -m16305e4);
            }
        }
        this.f16305h.f16247a = this;
        this.f16306i.f16247a = this;
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: e */
    public void mo16603e() {
        for (int i10 = 0; i10 < this.f16236k.size(); i10++) {
            this.f16236k.get(i10).mo16603e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: f */
    public void mo16604f() {
        this.f16300c = null;
        Iterator<AbstractC3928p> it = this.f16236k.iterator();
        while (it.hasNext()) {
            it.next().mo16604f();
        }
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: j */
    public long mo16605j() {
        int size = this.f16236k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f16305h.f16252f + this.f16236k.get(i10).mo16605j() + r4.f16306i.f16252f;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: m */
    public boolean mo16606m() {
        int size = this.f16236k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f16236k.get(i10).mo16606m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f16303f == 0 ? "horizontal : " : "vertical : ");
        String sb3 = sb2.toString();
        Iterator<AbstractC3928p> it = this.f16236k.iterator();
        while (it.hasNext()) {
            String str = sb3 + "<";
            sb3 = (str + it.next()) + "> ";
        }
        return sb3;
    }
}
