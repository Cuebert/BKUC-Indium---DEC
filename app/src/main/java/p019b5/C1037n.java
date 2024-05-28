package p019b5;

import android.os.RemoteException;
import p045d5.C3005x;
import p045d5.InterfaceC3002u;
import p085g4.C3265m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b5.n */
/* loaded from: classes.dex */
public final class C1037n extends AbstractC1042s {

    /* renamed from: p */
    final /* synthetic */ long f5215p;

    /* renamed from: q */
    final /* synthetic */ C3265m f5216q;

    /* renamed from: r */
    final /* synthetic */ C1043t f5217r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1037n(C1043t c1043t, C3265m c3265m, long j10, C3265m c3265m2) {
        super(c1043t, c3265m);
        this.f5217r = c1043t;
        this.f5215p = j10;
        this.f5216q = c3265m2;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: b */
    protected final void mo6274b() {
        C3005x c3005x;
        if (C1043t.m6284g(this.f5217r)) {
            super.mo6279a(new C1014b(-2, null));
            return;
        }
        try {
            C1043t c1043t = this.f5217r;
            ((InterfaceC3002u) c1043t.f5231d.m13453e()).mo13473I(C1043t.m6281b(c1043t, this.f5215p), new BinderC1041r(this.f5217r, this.f5216q));
        } catch (RemoteException e10) {
            c3005x = this.f5217r.f5228a;
            c3005x.m13477a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f5215p));
            this.f5216q.m14515d(new C1014b(-100, e10));
        }
    }
}
