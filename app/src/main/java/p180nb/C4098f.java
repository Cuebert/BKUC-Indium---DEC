package p180nb;

import p145kb.AbstractC3813o0;
import va.InterfaceC5001e;

/* renamed from: nb.f */
/* loaded from: classes.dex */
public class C4098f extends AbstractC3813o0 {

    /* renamed from: q */
    private final int f16650q;

    /* renamed from: r */
    private final int f16651r;

    /* renamed from: s */
    private final long f16652s;

    /* renamed from: t */
    private final String f16653t;

    /* renamed from: u */
    private ExecutorC4093a f16654u = m17078m0();

    public C4098f(int i10, int i11, long j10, String str) {
        this.f16650q = i10;
        this.f16651r = i11;
        this.f16652s = j10;
        this.f16653t = str;
    }

    /* renamed from: m0 */
    private final ExecutorC4093a m17078m0() {
        return new ExecutorC4093a(this.f16650q, this.f16651r, this.f16652s, this.f16653t);
    }

    @Override // p145kb.AbstractC3826v
    /* renamed from: j0 */
    public void mo16197j0(InterfaceC5001e interfaceC5001e, Runnable runnable) {
        ExecutorC4093a.m17034O(this.f16654u, runnable, null, false, 6, null);
    }

    /* renamed from: n0 */
    public final void m17079n0(Runnable runnable, InterfaceC4101i interfaceC4101i, boolean z10) {
        this.f16654u.m17052z(runnable, interfaceC4101i, z10);
    }
}
