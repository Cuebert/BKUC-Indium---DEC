package androidx.credentials.playservices;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.jvm.internal.AbstractC3845j;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p253ta.C4755l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class HiddenActivity$handleCreatePublicKeyCredential$1$1 extends AbstractC3845j implements InterfaceC3041l<PendingIntent, C4755l> {
    final /* synthetic */ int $requestCode;
    final /* synthetic */ HiddenActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleCreatePublicKeyCredential$1$1(HiddenActivity hiddenActivity, int i10) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i10;
    }

    @Override // p051db.InterfaceC3041l
    public /* bridge */ /* synthetic */ C4755l invoke(PendingIntent pendingIntent) {
        invoke2(pendingIntent);
        return C4755l.f18582a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PendingIntent result) {
        ResultReceiver resultReceiver;
        C3844i.m16253f(result, "result");
        try {
            this.this$0.mWaitingForActivityResult = true;
            this.this$0.startIntentSenderForResult(result.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            HiddenActivity hiddenActivity = this.this$0;
            resultReceiver = hiddenActivity.resultReceiver;
            C3844i.m16250c(resultReceiver);
            hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
        }
    }
}
