package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p243t0.AbstractC4604m;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends AbstractC3845j implements InterfaceC3030a<C4755l> {

    /* renamed from: $e */
    final /* synthetic */ AbstractC4604m f3741$e;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, AbstractC4604m abstractC4604m) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.f3741$e = abstractC4604m;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, AbstractC4604m e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "$e");
        this$0.getCallback().mo13660a(e10);
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$5$$ExternalSyntheticLambda0
            public final /* synthetic */ AbstractC4604m f$1;

            public /* synthetic */ RunnableC0751x3291b7c5(AbstractC4604m abstractC4604m) {
                r2 = abstractC4604m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, r2);
            }
        });
    }
}
