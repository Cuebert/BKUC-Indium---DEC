package p158m0;

import java.util.ArrayList;
import p147l0.C3861f;

/* renamed from: m0.m */
/* loaded from: classes.dex */
public class C3925m {

    /* renamed from: h */
    public static int f16272h;

    /* renamed from: c */
    AbstractC3928p f16275c;

    /* renamed from: d */
    AbstractC3928p f16276d;

    /* renamed from: f */
    int f16278f;

    /* renamed from: g */
    int f16279g;

    /* renamed from: a */
    public int f16273a = 0;

    /* renamed from: b */
    public boolean f16274b = false;

    /* renamed from: e */
    ArrayList<AbstractC3928p> f16277e = new ArrayList<>();

    public C3925m(AbstractC3928p abstractC3928p, int i10) {
        this.f16275c = null;
        this.f16276d = null;
        int i11 = f16272h;
        this.f16278f = i11;
        f16272h = i11 + 1;
        this.f16275c = abstractC3928p;
        this.f16276d = abstractC3928p;
        this.f16279g = i10;
    }

    /* renamed from: c */
    private long m16641c(C3918f c3918f, long j10) {
        AbstractC3928p abstractC3928p = c3918f.f16250d;
        if (abstractC3928p instanceof C3923k) {
            return j10;
        }
        int size = c3918f.f16257k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3916d interfaceC3916d = c3918f.f16257k.get(i10);
            if (interfaceC3916d instanceof C3918f) {
                C3918f c3918f2 = (C3918f) interfaceC3916d;
                if (c3918f2.f16250d != abstractC3928p) {
                    j11 = Math.min(j11, m16641c(c3918f2, c3918f2.f16252f + j10));
                }
            }
        }
        if (c3918f != abstractC3928p.f16306i) {
            return j11;
        }
        long mo16605j = j10 - abstractC3928p.mo16605j();
        return Math.min(Math.min(j11, m16641c(abstractC3928p.f16305h, mo16605j)), mo16605j - abstractC3928p.f16305h.f16252f);
    }

    /* renamed from: d */
    private long m16642d(C3918f c3918f, long j10) {
        AbstractC3928p abstractC3928p = c3918f.f16250d;
        if (abstractC3928p instanceof C3923k) {
            return j10;
        }
        int size = c3918f.f16257k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3916d interfaceC3916d = c3918f.f16257k.get(i10);
            if (interfaceC3916d instanceof C3918f) {
                C3918f c3918f2 = (C3918f) interfaceC3916d;
                if (c3918f2.f16250d != abstractC3928p) {
                    j11 = Math.max(j11, m16642d(c3918f2, c3918f2.f16252f + j10));
                }
            }
        }
        if (c3918f != abstractC3928p.f16305h) {
            return j11;
        }
        long mo16605j = j10 + abstractC3928p.mo16605j();
        return Math.max(Math.max(j11, m16642d(abstractC3928p.f16306i, mo16605j)), mo16605j - abstractC3928p.f16306i.f16252f);
    }

    /* renamed from: a */
    public void m16643a(AbstractC3928p abstractC3928p) {
        this.f16277e.add(abstractC3928p);
        this.f16276d = abstractC3928p;
    }

    /* renamed from: b */
    public long m16644b(C3861f c3861f, int i10) {
        long mo16605j;
        int i11;
        AbstractC3928p abstractC3928p = this.f16275c;
        if (abstractC3928p instanceof C3915c) {
            if (((C3915c) abstractC3928p).f16303f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(abstractC3928p instanceof C3924l)) {
                return 0L;
            }
        } else if (!(abstractC3928p instanceof C3926n)) {
            return 0L;
        }
        C3918f c3918f = (i10 == 0 ? c3861f.f16000e : c3861f.f16002f).f16305h;
        C3918f c3918f2 = (i10 == 0 ? c3861f.f16000e : c3861f.f16002f).f16306i;
        boolean contains = abstractC3928p.f16305h.f16258l.contains(c3918f);
        boolean contains2 = this.f16275c.f16306i.f16258l.contains(c3918f2);
        long mo16605j2 = this.f16275c.mo16605j();
        if (contains && contains2) {
            long m16642d = m16642d(this.f16275c.f16305h, 0L);
            long m16641c = m16641c(this.f16275c.f16306i, 0L);
            long j10 = m16642d - mo16605j2;
            AbstractC3928p abstractC3928p2 = this.f16275c;
            int i12 = abstractC3928p2.f16306i.f16252f;
            if (j10 >= (-i12)) {
                j10 += i12;
            }
            int i13 = abstractC3928p2.f16305h.f16252f;
            long j11 = ((-m16641c) - mo16605j2) - i13;
            if (j11 >= i13) {
                j11 -= i13;
            }
            float f10 = (float) (abstractC3928p2.f16299b.m16393o(i10) > 0.0f ? (((float) j11) / r13) + (((float) j10) / (1.0f - r13)) : 0L);
            long j12 = (f10 * r13) + 0.5f + mo16605j2 + (f10 * (1.0f - r13)) + 0.5f;
            mo16605j = r13.f16305h.f16252f + j12;
            i11 = this.f16275c.f16306i.f16252f;
        } else {
            if (contains) {
                return Math.max(m16642d(this.f16275c.f16305h, r13.f16252f), this.f16275c.f16305h.f16252f + mo16605j2);
            }
            if (contains2) {
                return Math.max(-m16641c(this.f16275c.f16306i, r13.f16252f), (-this.f16275c.f16306i.f16252f) + mo16605j2);
            }
            mo16605j = r13.f16305h.f16252f + this.f16275c.mo16605j();
            i11 = this.f16275c.f16306i.f16252f;
        }
        return mo16605j - i11;
    }
}
