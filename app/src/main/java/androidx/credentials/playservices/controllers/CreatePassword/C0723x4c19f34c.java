package androidx.credentials.playservices.controllers.CreatePassword;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.internal.C3843h;
import p051db.InterfaceC3045p;
import p243t0.AbstractC4596e;

/* renamed from: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 */
/* loaded from: classes.dex */
/* synthetic */ class C0723x4c19f34c extends C3843h implements InterfaceC3045p<String, String, AbstractC4596e> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0723x4c19f34c(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // p051db.InterfaceC3045p
    public final AbstractC4596e invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m4239x5e74af(str, str2);
    }
}
