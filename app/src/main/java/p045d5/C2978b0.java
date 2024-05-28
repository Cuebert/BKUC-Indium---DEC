package p045d5;

import java.util.concurrent.atomic.AtomicInteger;
import p085g4.C3265m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d5.b0 */
/* loaded from: classes.dex */
public final class C2978b0 extends AbstractRunnableC3006y {

    /* renamed from: o */
    final /* synthetic */ C3265m f12662o;

    /* renamed from: p */
    final /* synthetic */ AbstractRunnableC3006y f12663p;

    /* renamed from: q */
    final /* synthetic */ C2981d f12664q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978b0(C2981d c2981d, C3265m c3265m, C3265m c3265m2, AbstractRunnableC3006y abstractRunnableC3006y) {
        super(c3265m);
        this.f12664q = c2981d;
        this.f12662o = c3265m2;
        this.f12663p = abstractRunnableC3006y;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: b */
    public final void mo6274b() {
        Object obj;
        AtomicInteger atomicInteger;
        C3005x c3005x;
        obj = this.f12664q.f12673f;
        synchronized (obj) {
            C2981d.m13445o(this.f12664q, this.f12662o);
            atomicInteger = this.f12664q.f12679l;
            if (atomicInteger.getAndIncrement() > 0) {
                c3005x = this.f12664q.f12669b;
                c3005x.m13478b("Already connected to the service.", new Object[0]);
            }
            C2981d.m13447q(this.f12664q, this.f12663p);
        }
    }
}
