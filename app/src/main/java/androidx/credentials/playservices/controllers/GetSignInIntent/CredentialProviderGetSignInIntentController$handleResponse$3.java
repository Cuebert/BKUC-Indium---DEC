package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p232s0.C4510u;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ C4510u $response;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C4510u c4510u) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = c4510u;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, C4510u response) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(response, "$response");
        this$0.getCallback().onResult(response);
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0
            public final /* synthetic */ C4510u f$1;

            public /* synthetic */ RunnableC0749xbfef9643(C4510u c4510u) {
                r2 = c4510u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, r2);
            }
        });
    }
}
