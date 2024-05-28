package androidx.credentials.playservices.controllers.BeginSignIn;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p051db.InterfaceC3045p;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$handleResponse$1 extends AbstractC3845j implements InterfaceC3045p<CancellationSignal, InterfaceC3030a<? extends C4755l>, C4755l> {
    public static final CredentialProviderBeginSignInController$handleResponse$1 INSTANCE = new CredentialProviderBeginSignInController$handleResponse$1();

    CredentialProviderBeginSignInController$handleResponse$1() {
        super(2);
    }

    @Override // p051db.InterfaceC3045p
    public /* bridge */ /* synthetic */ C4755l invoke(CancellationSignal cancellationSignal, InterfaceC3030a<? extends C4755l> interfaceC3030a) {
        invoke2(cancellationSignal, (InterfaceC3030a<C4755l>) interfaceC3030a);
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CancellationSignal cancellationSignal, InterfaceC3030a<C4755l> f10) {
        C3844i.m16253f(f10, "f");
        CredentialProviderController.Companion companion = CredentialProviderController.Companion;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f10);
    }
}
