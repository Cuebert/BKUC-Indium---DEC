package p158m0;

import java.util.Iterator;
import p147l0.C3856a;
import p147l0.C3860e;
import p158m0.C3918f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m0.k */
/* loaded from: classes.dex */
public class C3923k extends AbstractC3928p {
    public C3923k(C3860e c3860e) {
        super(c3860e);
    }

    /* renamed from: q */
    private void m16638q(C3918f c3918f) {
        this.f16305h.f16257k.add(c3918f);
        c3918f.f16258l.add(this.f16305h);
    }

    @Override // p158m0.AbstractC3928p, p158m0.InterfaceC3916d
    /* renamed from: a */
    public void mo16601a(InterfaceC3916d interfaceC3916d) {
        C3856a c3856a = (C3856a) this.f16299b;
        int m16286e1 = c3856a.m16286e1();
        Iterator<C3918f> it = this.f16305h.f16258l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f16253g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (m16286e1 != 0 && m16286e1 != 2) {
            this.f16305h.mo16623d(i10 + c3856a.m16288f1());
        } else {
            this.f16305h.mo16623d(i11 + c3856a.m16288f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: d */
    public void mo16602d() {
        C3860e c3860e = this.f16299b;
        if (c3860e instanceof C3856a) {
            this.f16305h.f16248b = true;
            C3856a c3856a = (C3856a) c3860e;
            int m16286e1 = c3856a.m16286e1();
            boolean m16284d1 = c3856a.m16284d1();
            int i10 = 0;
            if (m16286e1 == 0) {
                this.f16305h.f16251e = C3918f.a.LEFT;
                while (i10 < c3856a.f16088E0) {
                    C3860e c3860e2 = c3856a.f16087D0[i10];
                    if (m16284d1 || c3860e2.m16355Q() != 8) {
                        C3918f c3918f = c3860e2.f16000e.f16305h;
                        c3918f.f16257k.add(this.f16305h);
                        this.f16305h.f16258l.add(c3918f);
                    }
                    i10++;
                }
                m16638q(this.f16299b.f16000e.f16305h);
                m16638q(this.f16299b.f16000e.f16306i);
                return;
            }
            if (m16286e1 == 1) {
                this.f16305h.f16251e = C3918f.a.RIGHT;
                while (i10 < c3856a.f16088E0) {
                    C3860e c3860e3 = c3856a.f16087D0[i10];
                    if (m16284d1 || c3860e3.m16355Q() != 8) {
                        C3918f c3918f2 = c3860e3.f16000e.f16306i;
                        c3918f2.f16257k.add(this.f16305h);
                        this.f16305h.f16258l.add(c3918f2);
                    }
                    i10++;
                }
                m16638q(this.f16299b.f16000e.f16305h);
                m16638q(this.f16299b.f16000e.f16306i);
                return;
            }
            if (m16286e1 == 2) {
                this.f16305h.f16251e = C3918f.a.TOP;
                while (i10 < c3856a.f16088E0) {
                    C3860e c3860e4 = c3856a.f16087D0[i10];
                    if (m16284d1 || c3860e4.m16355Q() != 8) {
                        C3918f c3918f3 = c3860e4.f16002f.f16305h;
                        c3918f3.f16257k.add(this.f16305h);
                        this.f16305h.f16258l.add(c3918f3);
                    }
                    i10++;
                }
                m16638q(this.f16299b.f16002f.f16305h);
                m16638q(this.f16299b.f16002f.f16306i);
                return;
            }
            if (m16286e1 != 3) {
                return;
            }
            this.f16305h.f16251e = C3918f.a.BOTTOM;
            while (i10 < c3856a.f16088E0) {
                C3860e c3860e5 = c3856a.f16087D0[i10];
                if (m16284d1 || c3860e5.m16355Q() != 8) {
                    C3918f c3918f4 = c3860e5.f16002f.f16306i;
                    c3918f4.f16257k.add(this.f16305h);
                    this.f16305h.f16258l.add(c3918f4);
                }
                i10++;
            }
            m16638q(this.f16299b.f16002f.f16305h);
            m16638q(this.f16299b.f16002f.f16306i);
        }
    }

    @Override // p158m0.AbstractC3928p
    /* renamed from: e */
    public void mo16603e() {
        C3860e c3860e = this.f16299b;
        if (c3860e instanceof C3856a) {
            int m16286e1 = ((C3856a) c3860e).m16286e1();
            if (m16286e1 != 0 && m16286e1 != 1) {
                this.f16299b.m16368W0(this.f16305h.f16253g);
            } else {
                this.f16299b.m16366V0(this.f16305h.f16253g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: f */
    public void mo16604f() {
        this.f16300c = null;
        this.f16305h.m16622c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p158m0.AbstractC3928p
    /* renamed from: m */
    public boolean mo16606m() {
        return false;
    }
}
