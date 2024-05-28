package androidx.credentials.playservices.controllers.BeginSignIn;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p243t0.AbstractC4604m;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$5 extends AbstractC3845j implements InterfaceC3030a<C4755l> {

    /* renamed from: $e */
    final /* synthetic */ AbstractC4604m f3735$e;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AbstractC4604m abstractC4604m) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.f3735$e = abstractC4604m;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, AbstractC4604m e10) {
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
        this.this$0.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0
            public final /* synthetic */ AbstractC4604m f$1;

            public /* synthetic */ RunnableC0716x67dc6dce(AbstractC4604m abstractC4604m) {
                r2 = abstractC4604m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(CredentialProviderBeginSignInController.this, r2);
            }
        });
    }
}
