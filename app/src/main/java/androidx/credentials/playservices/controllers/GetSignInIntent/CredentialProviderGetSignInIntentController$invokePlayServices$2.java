package androidx.credentials.playservices.controllers.GetSignInIntent;

import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p243t0.C4607p;
import p253ta.C4755l;

/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$invokePlayServices$2 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0) {
        C3844i.m16253f(this$0, "this$0");
        this$0.getCallback().mo13660a(new C4607p(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0
            public /* synthetic */ RunnableC0754x7a548dc3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$invokePlayServices$2.invoke$lambda$0(CredentialProviderGetSignInIntentController.this);
            }
        });
    }
}
