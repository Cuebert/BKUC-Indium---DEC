package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p232s0.InterfaceC4501l;
import p243t0.C4600i;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 */
/* loaded from: classes.dex */
public final class C0741xee02ea38 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0741xee02ea38(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        InterfaceC4501l interfaceC4501l;
        C3844i.m16253f(this$0, "this$0");
        interfaceC4501l = this$0.callback;
        if (interfaceC4501l == null) {
            C3844i.m16265r("callback");
            interfaceC4501l = null;
        }
        interfaceC4501l.mo13660a(new C4600i(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor;
        executor = this.this$0.executor;
        if (executor == null) {
            C3844i.m16265r("executor");
            executor = null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0741xee02ea38.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
            }
        });
    }
}
