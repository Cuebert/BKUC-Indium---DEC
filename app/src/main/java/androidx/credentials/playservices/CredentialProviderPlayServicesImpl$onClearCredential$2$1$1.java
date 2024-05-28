package androidx.credentials.playservices;

import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4592a;
import p243t0.C4593b;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ InterfaceC4501l<Void, AbstractC4592a> $callback;

    /* renamed from: $e */
    final /* synthetic */ Exception f3734$e;
    final /* synthetic */ Executor $executor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, InterfaceC4501l<Void, AbstractC4592a> interfaceC4501l) {
        super(0);
        this.f3734$e = exc;
        this.$executor = executor;
        this.$callback = interfaceC4501l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(InterfaceC4501l callback, Exception e10) {
        C3844i.m16253f(callback, "$callback");
        C3844i.m16253f(e10, "$e");
        callback.mo13660a(new C4593b(e10.getMessage()));
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.f3734$e);
        Executor executor = this.$executor;
        final InterfaceC4501l<Void, AbstractC4592a> interfaceC4501l = this.$callback;
        final Exception exc = this.f3734$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(InterfaceC4501l.this, exc);
            }
        });
    }
}
