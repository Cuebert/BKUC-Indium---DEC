package androidx.credentials.playservices.controllers;

import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3850o;
import p051db.InterfaceC3030a;
import p051db.InterfaceC3041l;
import p243t0.AbstractC4596e;
import p253ta.C4755l;

/* renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 */
/* loaded from: classes.dex */
final class C0745x7cfe4d37 extends AbstractC3845j implements InterfaceC3030a<C4755l> {
    final /* synthetic */ C3850o<AbstractC4596e> $exception;
    final /* synthetic */ InterfaceC3041l<AbstractC4596e, C4755l> $onError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0745x7cfe4d37(InterfaceC3041l<? super AbstractC4596e, C4755l> interfaceC3041l, C3850o<AbstractC4596e> c3850o) {
        super(0);
        this.$onError = interfaceC3041l;
        this.$exception = c3850o;
    }

    @Override // p051db.InterfaceC3030a
    public /* bridge */ /* synthetic */ C4755l invoke() {
        invoke2();
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onError.invoke(this.$exception.f15904n);
    }
}
