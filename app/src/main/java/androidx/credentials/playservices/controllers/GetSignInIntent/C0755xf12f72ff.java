package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.internal.C3843h;
import p051db.InterfaceC3045p;
import p243t0.AbstractC4604m;

/* renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 */
/* loaded from: classes.dex */
/* synthetic */ class C0755xf12f72ff extends C3843h implements InterfaceC3045p<String, String, AbstractC4604m> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0755xf12f72ff(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // p051db.InterfaceC3045p
    public final AbstractC4604m invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).m4240xd975db95(str, str2);
    }
}
