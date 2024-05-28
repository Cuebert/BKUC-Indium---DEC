package p198p3;

import android.app.Activity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.internal.AbstractC1352d;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p209q2.C4297e;
import p209q2.InterfaceC4293a;
import p295x2.AbstractC5510e;
import p295x2.C5506a;
import p308y2.InterfaceC5620k;
import p321z2.C5984j;

/* renamed from: p3.o */
/* loaded from: classes.dex */
public final class C4250o extends AbstractC5510e implements InterfaceC4293a {

    /* renamed from: l */
    private static final C5506a.g f17435l;

    /* renamed from: m */
    private static final C5506a.a f17436m;

    /* renamed from: n */
    private static final C5506a f17437n;

    /* renamed from: k */
    private final String f17438k;

    static {
        C5506a.g gVar = new C5506a.g();
        f17435l = gVar;
        C4246m c4246m = new C4246m();
        f17436m = c4246m;
        f17437n = new C5506a("Auth.Api.Identity.CredentialSaving.API", c4246m, gVar);
    }

    public C4250o(Activity activity, C4297e c4297e) {
        super(activity, (C5506a<C4297e>) f17437n, c4297e, AbstractC5510e.a.f20550c);
        this.f17438k = C4227c0.m17654a();
    }

    @Override // p209q2.InterfaceC4293a
    /* renamed from: g */
    public final AbstractC3263l<SavePasswordResult> mo17671g(SavePasswordRequest savePasswordRequest) {
        C5984j.m21286j(savePasswordRequest);
        SavePasswordRequest.C1322a m7306z = SavePasswordRequest.m7306z(savePasswordRequest);
        m7306z.m7310c(this.f17438k);
        final SavePasswordRequest m7308a = m7306z.m7308a();
        return m20269n(AbstractC1352d.m7497a().m7506d(C4225b0.f17417e).m7504b(new InterfaceC5620k() { // from class: p3.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                C4250o c4250o = C4250o.this;
                SavePasswordRequest savePasswordRequest2 = m7308a;
                ((C4228d) ((C4261t0) obj).m7646D()).m17655n(new BinderC4248n(c4250o, (C3265m) obj2), (SavePasswordRequest) C5984j.m21286j(savePasswordRequest2));
            }
        }).m7505c(false).m7507e(1536).m7503a());
    }
}
