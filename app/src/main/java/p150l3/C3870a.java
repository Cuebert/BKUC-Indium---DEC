package p150l3;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.AbstractC1352d;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p246t3.C4637c3;
import p246t3.C4726y2;
import p246t3.C4730z2;
import p295x2.AbstractC5510e;
import p295x2.C5506a;
import p308y2.C5600a;
import p308y2.InterfaceC5620k;

/* renamed from: l3.a */
/* loaded from: classes.dex */
public class C3870a extends AbstractC5510e<C5506a.d.c> {

    /* renamed from: k */
    private static final C5506a.g f16106k;

    /* renamed from: l */
    private static final C5506a f16107l;

    static {
        C5506a.g gVar = new C5506a.g();
        f16106k = gVar;
        f16107l = new C5506a("Fido.FIDO2_API", new C4726y2(), gVar);
    }

    @Deprecated
    public C3870a(Activity activity) {
        super(activity, (C5506a<C5506a.d.c>) f16107l, C5506a.d.f20537m, new C5600a());
    }

    /* renamed from: y */
    public AbstractC3263l<PendingIntent> m16473y(final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        return m20269n(AbstractC1352d.m7497a().m7504b(new InterfaceC5620k() { // from class: l3.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                C3870a c3870a = C3870a.this;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions2 = publicKeyCredentialCreationOptions;
                ((C4637c3) ((C4730z2) obj).m7646D()).m18745n(new BinderC3872c(c3870a, (C3265m) obj2), publicKeyCredentialCreationOptions2);
            }
        }).m7507e(5407).m7503a());
    }
}
