package androidx.credentials.playservices.controllers.CreatePassword;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4596e;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$2 extends AbstractC3845j implements InterfaceC3041l<AbstractC4596e, C4755l> {
    final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController this$0, AbstractC4596e e10) {
        InterfaceC4501l interfaceC4501l;
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "$e");
        interfaceC4501l = this$0.callback;
        if (interfaceC4501l == null) {
            C3844i.m16265r("callback");
            interfaceC4501l = null;
        }
        interfaceC4501l.mo13660a(e10);
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(AbstractC4596e abstractC4596e) {
        invoke2(abstractC4596e);
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AbstractC4596e e10) {
        Executor executor;
        C3844i.m16253f(e10, "e");
        executor = this.this$0.executor;
        if (executor == null) {
            C3844i.m16265r("executor");
            executor = null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(CredentialProviderCreatePasswordController.this, e10);
            }
        });
    }
}
