package androidx.credentials.playservices.controllers.GetSignInIntent;

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
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3850o;
import p097h4.C3395b;
import p097h4.C3396c;
import p209q2.C4294b;
import p232s0.AbstractC4503n;
import p232s0.C4509t;
import p232s0.C4510u;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4604m;
import p243t0.C4602k;
import p243t0.C4605n;
import p243t0.C4607p;
import p243t0.C4608q;
import p295x2.C5507b;

/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<C4509t, GetSignInIntentRequest, SignInCredential, C4510u, AbstractC4604m> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetSignInIntent";
    private static CredentialProviderGetSignInIntentController controller;
    public InterfaceC4501l<C4510u, AbstractC4604m> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            C3844i.m16253f(context, "context");
            if (CredentialProviderGetSignInIntentController.controller == null) {
                CredentialProviderGetSignInIntentController.controller = new CredentialProviderGetSignInIntentController(context);
            }
            CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.controller;
            C3844i.m16250c(credentialProviderGetSignInIntentController);
            return credentialProviderGetSignInIntentController;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        C3844i.m16253f(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                C3844i.m16253f(resultData, "resultData");
                CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
                C0755xf12f72ff c0755xf12f72ff = new C0755xf12f72ff(CredentialProviderBaseController.Companion);
                Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
                InterfaceC4501l<C4510u, AbstractC4604m> callback = CredentialProviderGetSignInIntentController.this.getCallback();
                cancellationSignal = CredentialProviderGetSignInIntentController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(resultData, c0755xf12f72ff, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderGetSignInIntentController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final C3396c createGoogleIdCredential(SignInCredential response) {
        C3844i.m16253f(response, "response");
        C3396c.a aVar = new C3396c.a();
        String m7314B = response.m7314B();
        C3844i.m16252e(m7314B, "response.id");
        C3396c.a m14968e = aVar.m14968e(m7314B);
        try {
            String m7313A = response.m7313A();
            C3844i.m16250c(m7313A);
            m14968e.m14969f(m7313A);
            if (response.m7319x() != null) {
                m14968e.m14965b(response.m7319x());
            }
            if (response.m7321z() != null) {
                m14968e.m14967d(response.m7321z());
            }
            if (response.m7320y() != null) {
                m14968e.m14966c(response.m7320y());
            }
            if (response.m7316D() != null) {
                m14968e.m14970g(response.m7316D());
            }
            if (response.m7317E() != null) {
                m14968e.m14971h(response.m7317E());
            }
            return m14968e.m14964a();
        } catch (Exception unused) {
            throw new C4607p("When attempting to convert get response, null Google ID Token found");
        }
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
        if (CredentialProviderController.maybeReportErrorResultCodeGet(i11, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential mo17679e = C4294b.m17814c(this.context).mo17679e(intent);
            C3844i.m16252e(mo17679e, "getSignInClient(context)…redentialFromIntent(data)");
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(mo17679e)));
        } catch (AbstractC4604m e10) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$5(this, e10));
        } catch (C5507b e11) {
            C3850o c3850o = new C3850o();
            c3850o.f15904n = new C4607p(e11.getMessage());
            if (e11.m20260b() == 16) {
                c3850o.f15904n = new C4602k(e11.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e11.m20260b()))) {
                c3850o.f15904n = new C4605n(e11.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, c3850o));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$6(this, new C4607p(th.getMessage())));
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
    public GetSignInIntentRequest convertRequestToPlayServices(C4509t request) {
        C3844i.m16253f(request, "request");
        if (request.m18516a().size() == 1) {
            AbstractC4503n abstractC4503n = request.m18516a().get(0);
            C3844i.m16251d(abstractC4503n, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
            C3395b c3395b = (C3395b) abstractC4503n;
            GetSignInIntentRequest m7298a = GetSignInIntentRequest.m7293x().m7302e(c3395b.m14963i()).m7299b(c3395b.m14961g()).m7300c(c3395b.m14962h()).m7298a();
            C3844i.m16252e(m7298a, "builder()\n            .s…nce)\n            .build()");
            return m7298a;
        }
        throw new C4608q("GetSignInWithGoogleOption cannot be combined with other options.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C4510u convertResponseToCredentialManager(SignInCredential response) {
        C3396c c3396c;
        C3844i.m16253f(response, "response");
        if (response.m7313A() != null) {
            c3396c = createGoogleIdCredential(response);
        } else {
            Log.w(TAG, "Credential returned but no google Id found");
            c3396c = null;
        }
        if (c3396c != null) {
            return new C4510u(c3396c);
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
        try {
            GetSignInIntentRequest convertRequestToPlayServices = convertRequestToPlayServices(request);
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, convertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
            this.context.startActivity(intent);
        } catch (Exception e10) {
            if (e10 instanceof C4608q) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetSignInIntentController$invokePlayServices$1(this, e10));
            } else {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetSignInIntentController$invokePlayServices$2(this));
            }
        }
    }
}
