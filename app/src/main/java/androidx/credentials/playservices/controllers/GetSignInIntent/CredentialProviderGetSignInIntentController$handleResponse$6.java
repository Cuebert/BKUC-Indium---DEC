package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p243t0.C4607p;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$6 extends AbstractC3845j implements InterfaceC3030a<C4755l> {

    /* renamed from: $e */
    final /* synthetic */ C4607p f3742$e;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$6(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C4607p c4607p) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.f3742$e = c4607p;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, C4607p e10) {
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
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$6$$ExternalSyntheticLambda0
            public final /* synthetic */ C4607p f$1;

            public /* synthetic */ RunnableC0752x6be2c886(C4607p c4607p) {
                r2 = c4607p;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, r2);
            }
        });
    }
}
