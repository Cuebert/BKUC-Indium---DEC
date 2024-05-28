package p197p2;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import p085g4.AbstractC3263l;
import p184o2.C4122a;
import p295x2.AbstractC5510e;
import p308y2.C5600a;
import p321z2.C5982i;

@Deprecated
/* renamed from: p2.e */
/* loaded from: classes.dex */
public class C4218e extends AbstractC5510e<C4122a.a> {
    public C4218e(Activity activity, C4122a.a aVar) {
        super(activity, C4122a.f16817b, aVar, new C5600a());
    }

    @Deprecated
    /* renamed from: A */
    public AbstractC3263l<Void> m17645A(Credential credential) {
        return C5982i.m21276c(C4122a.f16820e.mo17642a(m20265j(), credential));
    }

    @Deprecated
    /* renamed from: y */
    public AbstractC3263l<Void> m17646y(Credential credential) {
        return C5982i.m21276c(C4122a.f16820e.mo17643b(m20265j(), credential));
    }

    @Deprecated
    /* renamed from: z */
    public AbstractC3263l<C4214a> m17647z(CredentialRequest credentialRequest) {
        return C5982i.m21274a(C4122a.f16820e.mo17644c(m20265j(), credentialRequest), new C4214a());
    }
}
