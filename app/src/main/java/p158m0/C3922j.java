package p158m0;

import p147l0.C3860e;
import p147l0.C3862g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m0.j */
/* loaded from: classes.dex */
public class C3922j extends AbstractC3928p {
    public C3922j(C3860e c3860e) {
        super(c3860e);
        c3860e.f16000e.mo16604f();
        c3860e.f16002f.mo16604f();
        this.f16303f = ((C3862g) c3860e).m16449b1();
    }

    /* renamed from: q */
    private void m16637q(C3918f c3918f) {
        this.f16305h.f16257k.add(c3918f);
        c3918f.f16258l.add(this.f16305h);
    }

    @Override // p158m0.AbstractC3928p, p158m0.InterfaceC3916d
    /* renamed from: a */
    public void mo16601a(InterfaceC3916d interfaceC3916d) {
        C3918f c3918f = this.f16305h;
        if (c3918f.f16249c && !c3918f.f16256j) {
            this.f16305h.mo16623d((int) ((c3918f.f16258l.get(0).f16253g * ((C3862g) this.f16299b).m16452e1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: d */
    public void mo16602d() {
        C3862g c3862g = (C3862g) this.f16299b;
        int m16450c1 = c3862g.m16450c1();
        int m16451d1 = c3862g.m16451d1();
        c3862g.m16452e1();
        if (c3862g.m16449b1() == 1) {
            if (m16450c1 != -1) {
                this.f16305h.f16258l.add(this.f16299b.f15985T.f16000e.f16305h);
                this.f16299b.f15985T.f16000e.f16305h.f16257k.add(this.f16305h);
                this.f16305h.f16252f = m16450c1;
            } else if (m16451d1 != -1) {
                this.f16305h.f16258l.add(this.f16299b.f15985T.f16000e.f16306i);
                this.f16299b.f15985T.f16000e.f16306i.f16257k.add(this.f16305h);
                this.f16305h.f16252f = -m16451d1;
            } else {
                C3918f c3918f = this.f16305h;
                c3918f.f16248b = true;
                c3918f.f16258l.add(this.f16299b.f15985T.f16000e.f16306i);
                this.f16299b.f15985T.f16000e.f16306i.f16257k.add(this.f16305h);
            }
            m16637q(this.f16299b.f16000e.f16305h);
            m16637q(this.f16299b.f16000e.f16306i);
            return;
        }
        if (m16450c1 != -1) {
            this.f16305h.f16258l.add(this.f16299b.f15985T.f16002f.f16305h);
            this.f16299b.f15985T.f16002f.f16305h.f16257k.add(this.f16305h);
            this.f16305h.f16252f = m16450c1;
        } else if (m16451d1 != -1) {
            this.f16305h.f16258l.add(this.f16299b.f15985T.f16002f.f16306i);
            this.f16299b.f15985T.f16002f.f16306i.f16257k.add(this.f16305h);
            this.f16305h.f16252f = -m16451d1;
        } else {
            C3918f c3918f2 = this.f16305h;
            c3918f2.f16248b = true;
            c3918f2.f16258l.add(this.f16299b.f15985T.f16002f.f16306i);
            this.f16299b.f15985T.f16002f.f16306i.f16257k.add(this.f16305h);
        }
        m16637q(this.f16299b.f16002f.f16305h);
        m16637q(this.f16299b.f16002f.f16306i);
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: e */
    public void mo16603e() {
        if (((C3862g) this.f16299b).m16449b1() == 1) {
            this.f16299b.m16366V0(this.f16305h.f16253g);
        } else {
            this.f16299b.m16368W0(this.f16305h.f16253g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: f */
    public void mo16604f() {
        this.f16305h.m16622c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: m */
    public boolean mo16606m() {
        return false;
    }
}
