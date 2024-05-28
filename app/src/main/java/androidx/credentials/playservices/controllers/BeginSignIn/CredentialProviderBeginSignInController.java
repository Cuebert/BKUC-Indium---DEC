package androidx.credentials.playservices.controllers.BeginSignIn;

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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3850o;
import p097h4.C3396c;
import p209q2.C4294b;
import p232s0.AbstractC4498i;
import p232s0.C4489a0;
import p232s0.C4509t;
import p232s0.C4510u;
import p232s0.C4514y;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4604m;
import p243t0.C4602k;
import p243t0.C4605n;
import p243t0.C4607p;
import p295x2.C5507b;

/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController<C4509t, BeginSignInRequest, SignInCredential, C4510u, AbstractC4604m> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignIn";
    private static CredentialProviderBeginSignInController controller;
    public InterfaceC4501l<C4510u, AbstractC4604m> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            C3844i.m16253f(context, "context");
            if (CredentialProviderBeginSignInController.controller == null) {
                CredentialProviderBeginSignInController.controller = new CredentialProviderBeginSignInController(context);
            }
            CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.controller;
            C3844i.m16250c(credentialProviderBeginSignInController);
            return credentialProviderBeginSignInController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        C3844i.m16253f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                C3844i.m16253f(resultData, "resultData");
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
                C0719x4b514208 c0719x4b514208 = new C0719x4b514208(CredentialProviderBaseController.Companion);
                Executor executor = CredentialProviderBeginSignInController.this.getExecutor();
                InterfaceC4501l<C4510u, AbstractC4604m> callback = CredentialProviderBeginSignInController.this.getCallback();
                cancellationSignal = CredentialProviderBeginSignInController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderBeginSignInController.maybeReportErrorFromResultReceiver(resultData, c0719x4b514208, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderBeginSignInController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final C3396c createGoogleIdCredential(SignInCredential signInCredential) {
        C3396c.a aVar = new C3396c.a();
        String m7314B = signInCredential.m7314B();
        C3844i.m16252e(m7314B, "response.id");
        C3396c.a m14968e = aVar.m14968e(m7314B);
        String m7313A = signInCredential.m7313A();
        C3844i.m16250c(m7313A);
        C3396c.a m14969f = m14968e.m14969f(m7313A);
        if (signInCredential.m7319x() != null) {
            m14969f.m14965b(signInCredential.m7319x());
        }
        if (signInCredential.m7321z() != null) {
            m14969f.m14967d(signInCredential.m7321z());
        }
        if (signInCredential.m7320y() != null) {
            m14969f.m14966c(signInCredential.m7320y());
        }
        if (signInCredential.m7316D() != null) {
            m14969f.m14970g(signInCredential.m7316D());
        }
        if (signInCredential.m7317E() != null) {
            m14969f.m14971h(signInCredential.m7317E());
        }
        return m14969f.m14964a();
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final InterfaceC4501l<C4510u, AbstractC4604m> getCallback() {
        InterfaceC4501l<C4510u, AbstractC4604m> interfaceC4501l = this.callback;
        if (interfaceC4501l != null) {
            return interfaceC4501l;
        }
        C3844i.m16265r("callback");
        return null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        C3844i.m16265r("executor");
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, t0.p] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, t0.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, t0.k] */
    public final void handleResponse$credentials_play_services_auth_release(int i10, int i11, Intent intent) {
        if (i10 != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which  does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(i11, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential mo17679e = C4294b.m17814c(this.context).mo17679e(intent);
            C3844i.m16252e(mo17679e, "getSignInClient(context)…redentialFromIntent(data)");
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(mo17679e)));
        } catch (AbstractC4604m e10) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$5(this, e10));
        } catch (C5507b e11) {
            C3850o c3850o = new C3850o();
            c3850o.f15904n = new C4607p(e11.getMessage());
            if (e11.m20260b() == 16) {
                c3850o.f15904n = new C4602k(e11.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e11.m20260b()))) {
                c3850o.f15904n = new C4605n(e11.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, c3850o));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$6(this, new C4607p(th.getMessage())));
        }
    }

    public final void setCallback(InterfaceC4501l<C4510u, AbstractC4604m> interfaceC4501l) {
        C3844i.m16253f(interfaceC4501l, "<set-?>");
        this.callback = interfaceC4501l;
    }

    public final void setExecutor(Executor executor) {
        C3844i.m16253f(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public BeginSignInRequest convertRequestToPlayServices(C4509t request) {
        C3844i.m16253f(request, "request");
        return BeginSignInControllerUtility.Companion.m4221x545fe152(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C4510u convertResponseToCredentialManager(SignInCredential response) {
        AbstractC4498i abstractC4498i;
        C3844i.m16253f(response, "response");
        if (response.m7315C() != null) {
            String m7314B = response.m7314B();
            C3844i.m16252e(m7314B, "response.id");
            String m7315C = response.m7315C();
            C3844i.m16250c(m7315C);
            abstractC4498i = new C4514y(m7314B, m7315C);
        } else if (response.m7313A() != null) {
            abstractC4498i = createGoogleIdCredential(response);
        } else if (response.m7318F() != null) {
            abstractC4498i = new C4489a0(PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(response));
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            abstractC4498i = null;
        }
        if (abstractC4498i != null) {
            return new C4510u(abstractC4498i);
        }
        throw new C4607p("When attempting to convert get response, null credential found");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C4509t request, InterfaceC4501l<C4510u, AbstractC4604m> callback, Executor executor, CancellationSignal cancellationSignal) {
        C3844i.m16253f(request, "request");
        C3844i.m16253f(callback, "callback");
        C3844i.m16253f(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        BeginSignInRequest convertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderBeginSignInController$invokePlayServices$1(this));
        }
    }
}
