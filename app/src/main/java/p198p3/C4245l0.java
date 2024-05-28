package p198p3;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Status;
import p197p2.InterfaceC4215b;
import p197p2.InterfaceC4217d;
import p295x2.AbstractC5511f;
import p295x2.AbstractC5513h;
import p321z2.C5984j;

/* renamed from: p3.l0 */
/* loaded from: classes.dex */
public final class C4245l0 implements InterfaceC4217d {
    @Override // p197p2.InterfaceC4217d
    /* renamed from: a */
    public final AbstractC5513h<Status> mo17642a(AbstractC5511f abstractC5511f, Credential credential) {
        C5984j.m21287k(abstractC5511f, "client must not be null");
        C5984j.m21287k(credential, "credential must not be null");
        return abstractC5511f.mo20283b(new C4239i0(this, abstractC5511f, credential));
    }

    @Override // p197p2.InterfaceC4217d
    /* renamed from: b */
    public final AbstractC5513h<Status> mo17643b(AbstractC5511f abstractC5511f, Credential credential) {
        C5984j.m21287k(abstractC5511f, "client must not be null");
        C5984j.m21287k(credential, "credential must not be null");
        return abstractC5511f.mo20283b(new C4241j0(this, abstractC5511f, credential));
    }

    @Override // p197p2.InterfaceC4217d
    /* renamed from: c */
    public final AbstractC5513h<InterfaceC4215b> mo17644c(AbstractC5511f abstractC5511f, CredentialRequest credentialRequest) {
        C5984j.m21287k(abstractC5511f, "client must not be null");
        C5984j.m21287k(credentialRequest, "request must not be null");
        return abstractC5511f.mo20282a(new C4237h0(this, abstractC5511f, credentialRequest));
    }
}
