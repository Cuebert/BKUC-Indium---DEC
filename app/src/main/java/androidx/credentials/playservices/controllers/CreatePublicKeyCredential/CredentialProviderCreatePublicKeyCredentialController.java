package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import org.json.JSONException;
import p232s0.AbstractC4492c;
import p232s0.C4496g;
import p232s0.C4497h;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4596e;
import p243t0.C4600i;
import p256u0.C4781b0;
import p256u0.C4787f;
import p268v0.C4933a;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<C4496g, PublicKeyCredentialCreationOptions, PublicKeyCredential, AbstractC4492c, AbstractC4596e> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private static CredentialProviderCreatePublicKeyCredentialController controller;
    private InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final ResultReceiverC0742x1c337a18 resultReceiver;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            C3844i.m16253f(context, "context");
            if (CredentialProviderCreatePublicKeyCredentialController.controller == null) {
                CredentialProviderCreatePublicKeyCredentialController.controller = new CredentialProviderCreatePublicKeyCredentialController(context);
            }
            CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.controller;
            C3844i.m16250c(credentialProviderCreatePublicKeyCredentialController);
            return credentialProviderCreatePublicKeyCredentialController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        C3844i.m16253f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                Executor executor;
                Executor executor2;
                InterfaceC4501l interfaceC4501l;
                InterfaceC4501l interfaceC4501l2;
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                C3844i.m16253f(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                C0743xdfe2be02 c0743xdfe2be02 = new C0743xdfe2be02(CredentialProviderBaseController.Companion);
                executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
                if (executor == null) {
                    C3844i.m16265r("executor");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                interfaceC4501l = CredentialProviderCreatePublicKeyCredentialController.this.callback;
                if (interfaceC4501l == null) {
                    C3844i.m16265r("callback");
                    interfaceC4501l2 = null;
                } else {
                    interfaceC4501l2 = interfaceC4501l;
                }
                cancellationSignal = CredentialProviderCreatePublicKeyCredentialController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, c0743xdfe2be02, executor2, interfaceC4501l2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4933a JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message != null && message.length() > 0) {
            return new C4933a(new C4787f(), message);
        }
        return new C4933a(new C4787f(), "Unknown error");
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        C3844i.m16253f(this$0, "this$0");
        InterfaceC4501l<AbstractC4492c, AbstractC4596e> interfaceC4501l = this$0.callback;
        if (interfaceC4501l == null) {
            C3844i.m16265r("callback");
            interfaceC4501l = null;
        }
        interfaceC4501l.mo13660a(new C4933a(new C4781b0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    public final void handleResponse$credentials_play_services_auth_release(int i10, int i11, Intent intent) {
        if (i10 != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, C0733xb96e2c35.INSTANCE, new C0734xb96e2c36(this), this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 == null) {
                C3844i.m16265r("executor");
            } else {
                executor = executor2;
            }
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this);
                }
            });
            return;
        }
        PublicKeyCredential m7821x = PublicKeyCredential.m7821x(byteArrayExtra);
        C3844i.m16252e(m7821x, "deserializeFromBytes(bytes)");
        AbstractC4596e publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(m7821x);
        if (publicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0735xb96e2c38(this, publicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0736xb96e2c39(this, convertResponseToCredentialManager(m7821x)));
        } catch (JSONException e10) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0737xb96e2c3a(this, e10));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0738xb96e2c3b(this, th));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(C4496g request) {
        C3844i.m16253f(request, "request");
        return PublicKeyCredentialControllerUtility.Companion.convert(request);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC4492c convertResponseToCredentialManager(PublicKeyCredential response) {
        C3844i.m16253f(response, "response");
        try {
            String m7826E = response.m7826E();
            C3844i.m16252e(m7826E, "response.toJson()");
            return new C4497h(m7826E);
        } catch (Throwable th) {
            throw new C4600i("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C4496g request, InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback, Executor executor, CancellationSignal cancellationSignal) {
        C3844i.m16253f(request, "request");
        C3844i.m16253f(callback, "callback");
        C3844i.m16253f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C0741xee02ea38(this));
            }
        } catch (JSONException e10) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C0739xee02ea36(this, e10));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C0740xee02ea37(this, th));
        }
    }
}
