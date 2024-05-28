package androidx.credentials.playservices;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p051db.InterfaceC3041l;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4592a;
import p253ta.C4755l;

/* loaded from: classes.dex */
final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends AbstractC3845j implements InterfaceC3041l<Void, C4755l> {
    final /* synthetic */ InterfaceC4501l<Void, AbstractC4592a> $callback;
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ Executor $executor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1 */
    /* loaded from: classes.dex */
    public static final class C07121 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
        final /* synthetic */ InterfaceC4501l<Void, AbstractC4592a> $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07121(Executor executor, InterfaceC4501l<Void, AbstractC4592a> interfaceC4501l) {
            super(0);
            this.$executor = executor;
            this.$callback = interfaceC4501l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(InterfaceC4501l callback) {
            C3844i.m16253f(callback, "$callback");
            callback.onResult(null);
        }

        @Override // p051db.InterfaceC3030a
        public /* bridge */ /* synthetic */ C4755l invoke() {
            invoke2();
            return C4755l.f18582a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
            Executor executor = this.$executor;
            final InterfaceC4501l<Void, AbstractC4592a> interfaceC4501l = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl$onClearCredential$1.C07121.invoke$lambda$0(InterfaceC4501l.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<Void, AbstractC4592a> interfaceC4501l) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = interfaceC4501l;
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(Void r12) {
        invoke2(r12);
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Void r52) {
        CredentialProviderPlayServicesImpl.Companion.m4220xee23955a(this.$cancellationSignal, new C07121(this.$executor, this.$callback));
    }
}
