package androidx.credentials.playservices.controllers;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p232s0.InterfaceC4501l;
import p253ta.C4755l;

/* renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1 */
/* loaded from: classes.dex */
final class C0747xfa88d3af extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ InterfaceC4501l<R1, E1> $callback;
    final /* synthetic */ E1 $exception;
    final /* synthetic */ Executor $executor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0747xfa88d3af(Executor executor, InterfaceC4501l<R1, E1> interfaceC4501l, E1 e12) {
        super(0);
        this.$executor = executor;
        this.$callback = interfaceC4501l;
        this.$exception = e12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(InterfaceC4501l callback, Object exception) {
        C3844i.m16253f(callback, "$callback");
        C3844i.m16253f(exception, "$exception");
        callback.mo13660a(exception);
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Executor executor = this.$executor;
        final InterfaceC4501l<R1, E1> interfaceC4501l = this.$callback;
        final E1 e12 = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0747xfa88d3af.invoke$lambda$0(InterfaceC4501l.this, e12);
            }
        });
    }
}
