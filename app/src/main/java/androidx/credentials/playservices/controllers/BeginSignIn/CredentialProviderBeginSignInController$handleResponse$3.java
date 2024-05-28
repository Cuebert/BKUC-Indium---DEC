package androidx.credentials.playservices.controllers.BeginSignIn;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p232s0.C4510u;
import p253ta.C4755l;

/* loaded from: classes.dex */
final class CredentialProviderBeginSignInController$handleResponse$3 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ C4510u $response;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C4510u c4510u) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = c4510u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, C4510u response) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(response, "$response");
        this$0.getCallback().onResult(response);
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final C4510u c4510u = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(CredentialProviderBeginSignInController.this, c4510u);
            }
        });
    }
}
