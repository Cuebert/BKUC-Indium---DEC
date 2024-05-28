package p147l0;

import p134k0.C3708d;
import p147l0.C3860e;

/* renamed from: l0.j */
/* loaded from: classes.dex */
public class C3865j {

    /* renamed from: a */
    static boolean[] f16089a = new boolean[3];

    /* renamed from: a */
    public static void m16463a(C3861f c3861f, C3708d c3708d, C3860e c3860e) {
        c3860e.f16018n = -1;
        c3860e.f16020o = -1;
        C3860e.b bVar = c3861f.f15984S[0];
        C3860e.b bVar2 = C3860e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c3860e.f15984S[0] == C3860e.b.MATCH_PARENT) {
            int i10 = c3860e.f15973H.f15949g;
            int m16357R = c3861f.m16357R() - c3860e.f15975J.f15949g;
            C3859d c3859d = c3860e.f15973H;
            c3859d.f15951i = c3708d.m15774q(c3859d);
            C3859d c3859d2 = c3860e.f15975J;
            c3859d2.f15951i = c3708d.m15774q(c3859d2);
            c3708d.m15765f(c3860e.f15973H.f15951i, i10);
            c3708d.m15765f(c3860e.f15975J.f15951i, m16357R);
            c3860e.f16018n = 2;
            c3860e.m16414y0(i10, m16357R);
        }
        if (c3861f.f15984S[1] == bVar2 || c3860e.f15984S[1] != C3860e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c3860e.f15974I.f15949g;
        int m16407v = c3861f.m16407v() - c3860e.f15976K.f15949g;
        C3859d c3859d3 = c3860e.f15974I;
        c3859d3.f15951i = c3708d.m15774q(c3859d3);
        C3859d c3859d4 = c3860e.f15976K;
        c3859d4.f15951i = c3708d.m15774q(c3859d4);
        c3708d.m15765f(c3860e.f15974I.f15951i, i11);
        c3708d.m15765f(c3860e.f15976K.f15951i, m16407v);
        if (c3860e.f16001e0 > 0 || c3860e.m16355Q() == 8) {
            C3859d c3859d5 = c3860e.f15977L;
            c3859d5.f15951i = c3708d.m15774q(c3859d5);
            c3708d.m15765f(c3860e.f15977L.f15951i, c3860e.f16001e0 + i11);
        }
        c3860e.f16020o = 2;
        c3860e.m16354P0(i11, m16407v);
    }

    /* renamed from: b */
    public static final boolean m16464b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
