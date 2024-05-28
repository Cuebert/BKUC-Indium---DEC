package p019b5;

import android.os.RemoteException;
import p045d5.C3005x;
import p045d5.InterfaceC3002u;
import p085g4.C3265m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b5.o */
/* loaded from: classes.dex */
public final class C1038o extends AbstractC1042s {

    /* renamed from: p */
    final /* synthetic */ String f5218p;

    /* renamed from: q */
    final /* synthetic */ long f5219q;

    /* renamed from: r */
    final /* synthetic */ long f5220r;

    /* renamed from: s */
    final /* synthetic */ C3265m f5221s;

    /* renamed from: t */
    final /* synthetic */ C1043t f5222t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038o(C1043t c1043t, C3265m c3265m, String str, long j10, long j11, C3265m c3265m2) {
        super(c1043t, c3265m);
        this.f5222t = c1043t;
        this.f5218p = str;
        this.f5219q = j10;
        this.f5220r = j11;
        this.f5221s = c3265m2;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: b */
    protected final void mo6274b() {
        C3005x c3005x;
        if (C1043t.m6284g(this.f5222t)) {
            super.mo6279a(new C1014b(-2, null));
            return;
        }
        try {
            C1043t c1043t = this.f5222t;
            ((InterfaceC3002u) c1043t.f5231d.m13453e()).mo13474X(C1043t.m6280a(c1043t, this.f5218p, this.f5219q, this.f5220r), new BinderC1040q(this.f5222t, this.f5221s));
        } catch (RemoteException e10) {
            c3005x = this.f5222t.f5228a;
            c3005x.m13477a(e10, "requestExpressIntegrityToken(%s, %s)", this.f5218p, Long.valueOf(this.f5219q));
            this.f5221s.m14515d(new C1014b(-100, e10));
        }
    }
}
