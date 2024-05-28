package androidx.credentials.playservices.controllers.CreatePassword;

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
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p232s0.AbstractC4492c;
import p232s0.C4494e;
import p232s0.C4495f;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4596e;
import p253ta.C4755l;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<C4494e, SavePasswordRequest, C4755l, AbstractC4492c, AbstractC4596e> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePassword";
    private static CredentialProviderCreatePasswordController controller;
    private InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            C3844i.m16253f(context, "context");
            if (CredentialProviderCreatePasswordController.controller == null) {
                CredentialProviderCreatePasswordController.controller = new CredentialProviderCreatePasswordController(context);
            }
            CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.controller;
            C3844i.m16250c(credentialProviderCreatePasswordController);
            return credentialProviderCreatePasswordController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        C3844i.m16253f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                Executor executor;
                Executor executor2;
                InterfaceC4501l interfaceC4501l;
                InterfaceC4501l interfaceC4501l2;
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                C3844i.m16253f(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
                C0723x4c19f34c c0723x4c19f34c = new C0723x4c19f34c(CredentialProviderBaseController.Companion);
                executor = CredentialProviderCreatePasswordController.this.executor;
                if (executor == null) {
                    C3844i.m16265r("executor");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                interfaceC4501l = CredentialProviderCreatePasswordController.this.callback;
                if (interfaceC4501l == null) {
                    C3844i.m16265r("callback");
                    interfaceC4501l2 = null;
                } else {
                    interfaceC4501l2 = interfaceC4501l;
                }
                cancellationSignal = CredentialProviderCreatePasswordController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, c0723x4c19f34c, executor2, interfaceC4501l2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderCreatePasswordController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10);
            }
        };
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final void handleResponse$credentials_play_services_auth_release(int i10, int i11) {
        if (i10 != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, convertResponseToCredentialManager(C4755l.f18582a)));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public SavePasswordRequest convertRequestToPlayServices(C4494e request) {
        C3844i.m16253f(request, "request");
        SavePasswordRequest m7308a = SavePasswordRequest.m7305x().m7309b(new SignInPassword(request.m18474g(), request.m18475h())).m7308a();
        C3844i.m16252e(m7308a, "builder().setSignInPassw…ssword)\n        ).build()");
        return m7308a;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC4492c convertResponseToCredentialManager(C4755l response) {
        C3844i.m16253f(response, "response");
        return new C4495f();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C4494e request, InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback, Executor executor, CancellationSignal cancellationSignal) {
        C3844i.m16253f(request, "request");
        C3844i.m16253f(callback, "callback");
        C3844i.m16253f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        SavePasswordRequest convertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreatePasswordController$invokePlayServices$1(this));
        }
    }
}
