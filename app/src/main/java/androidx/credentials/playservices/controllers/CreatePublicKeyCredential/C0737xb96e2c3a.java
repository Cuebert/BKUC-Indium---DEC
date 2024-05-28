package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import org.json.JSONException;
import p051db.InterfaceC3030a;
import p232s0.InterfaceC4501l;
import p253ta.C4755l;
import p256u0.C4787f;
import p268v0.C4933a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$6 */
/* loaded from: classes.dex */
public final class C0737xb96e2c3a extends AbstractC3845j implements InterfaceC3030a<C4755l> {

    /* renamed from: $e */
    final /* synthetic */ JSONException f3737$e;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737xb96e2c3a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.f3737$e = jSONException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e10) {
        InterfaceC4501l interfaceC4501l;
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "$e");
        interfaceC4501l = this$0.callback;
        if (interfaceC4501l == null) {
            C3844i.m16265r("callback");
            interfaceC4501l = null;
        }
        interfaceC4501l.mo13660a(new C4933a(new C4787f(), e10.getMessage()));
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
        final JSONException jSONException = this.f3737$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0737xb96e2c3a.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
    }
}
