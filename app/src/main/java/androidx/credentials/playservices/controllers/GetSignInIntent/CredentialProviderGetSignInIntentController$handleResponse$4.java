package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3850o;
import p051db.InterfaceC3030a;
import p243t0.AbstractC4604m;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$4 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ C3850o<AbstractC4604m> $exception;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$4(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C3850o<AbstractC4604m> c3850o) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$exception = c3850o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, C3850o exception) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(exception, "$exception");
        this$0.getCallback().mo13660a(exception.f15904n);
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$4$$ExternalSyntheticLambda0
            public final /* synthetic */ C3850o f$1;

            public /* synthetic */ RunnableC0750xf940a704(C3850o c3850o) {
                r2 = c3850o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, r2);
            }
        });
    }
}
