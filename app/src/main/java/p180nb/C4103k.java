package p180nb;

import p145kb.C3834z;

/* renamed from: nb.k */
/* loaded from: classes.dex */
public final class C4103k extends AbstractRunnableC4100h {

    /* renamed from: p */
    public final Runnable f16658p;

    public C4103k(Runnable runnable, long j10, InterfaceC4101i interfaceC4101i) {
        super(j10, interfaceC4101i);
        this.f16658p = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16658p.run();
        } finally {
            this.f16656o.mo17080a();
        }
    }

    public String toString() {
        return "Task[" + C3834z.m16239a(this.f16658p) + '@' + C3834z.m16240b(this.f16658p) + ", " + this.f16655n + ", " + this.f16656o + ']';
    }
}
