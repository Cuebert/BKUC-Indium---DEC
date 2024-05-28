package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p243t0.AbstractC4604m;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends AbstractC3845j implements InterfaceC3041l<AbstractC4604m, C4755l> {
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, AbstractC4604m e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "$e");
        this$0.getCallback().mo13660a(e10);
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(AbstractC4604m abstractC4604m) {
        invoke2(abstractC4604m);
        return C4755l.f18582a;
    }

    /* renamed from: invoke */
    public final void invoke2(AbstractC4604m e10) {
        C3844i.m16253f(e10, "e");
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$2$$ExternalSyntheticLambda0
            public final /* synthetic */ AbstractC4604m f$1;

            public /* synthetic */ RunnableC0748x869e8582(AbstractC4604m e102) {
                r2 = e102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, r2);
            }
        });
    }
}
