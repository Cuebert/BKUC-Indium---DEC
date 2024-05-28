package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3030a;
import p051db.InterfaceC3041l;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;
import p097h4.C3395b;
import p209q2.C4294b;
import p232s0.AbstractC4490b;
import p232s0.AbstractC4492c;
import p232s0.AbstractC4503n;
import p232s0.C4488a;
import p232s0.C4494e;
import p232s0.C4496g;
import p232s0.C4504o;
import p232s0.C4509t;
import p232s0.C4510u;
import p232s0.C4515z;
import p232s0.InterfaceC4501l;
import p232s0.InterfaceC4505p;
import p243t0.AbstractC4592a;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;
import p253ta.C4755l;

/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements InterfaceC4505p {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private C1342a googleApiAvailability;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal != null) {
                if (!cancellationSignal.isCanceled()) {
                    return false;
                }
                Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
                return true;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
            return false;
        }

        /* renamed from: cancellationReviewerWithCallback$credentials_play_services_auth_release */
        public final void m4220xee23955a(CancellationSignal cancellationSignal, InterfaceC3030a<C4755l> callback) {
            C3844i.m16253f(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C4509t request) {
            C3844i.m16253f(request, "request");
            Iterator<AbstractC4503n> it = request.m18516a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C3395b) {
                    return true;
                }
            }
            return false;
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        C3844i.m16253f(context, "context");
        this.context = context;
        C1342a m7385o = C1342a.m7385o();
        C3844i.m16252e(m7385o, "getInstance()");
        this.googleApiAvailability = m7385o;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.mo7390g(context);
    }

    public static final void onClearCredential$lambda$0(InterfaceC3041l tmp0, Object obj) {
        C3844i.m16253f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l callback, Exception e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(executor, "$executor");
        C3844i.m16253f(callback, "$callback");
        C3844i.m16253f(e10, "e");
        Companion.m4220xee23955a(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(e10, executor, callback));
    }

    public final C1342a getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // p232s0.InterfaceC4505p
    public boolean isAvailableOnDevice() {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z10 = isGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(isGooglePlayServicesAvailable));
        }
        return z10;
    }

    public void onClearCredential(C4488a request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<Void, AbstractC4592a> callback) {
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        C4294b.m17814c(this.context).mo17678d().mo14499f(new InterfaceC3255h() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1() {
            }

            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(InterfaceC3041l.this, obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            public final /* synthetic */ CancellationSignal f$1;
            public final /* synthetic */ Executor f$2;
            public final /* synthetic */ InterfaceC4501l f$3;

            public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(CancellationSignal cancellationSignal2, Executor executor2, InterfaceC4501l callback2) {
                r2 = cancellationSignal2;
                r3 = executor2;
                r4 = callback2;
            }

            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(CredentialProviderPlayServicesImpl.this, r2, r3, r4, exc);
            }
        });
    }

    @Override // p232s0.InterfaceC4505p
    public void onCreateCredential(Context context, AbstractC4490b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<AbstractC4492c, AbstractC4596e> callback) {
        C3844i.m16253f(context, "context");
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof C4494e) {
            CredentialProviderCreatePasswordController.Companion.getInstance(context).invokePlayServices((C4494e) request, callback, executor, cancellationSignal);
        } else {
            if (request instanceof C4496g) {
                CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((C4496g) request, callback, executor, cancellationSignal);
                return;
            }
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    @Override // p232s0.InterfaceC4505p
    public void onGetCredential(Context context, C4509t request, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l<C4510u, AbstractC4604m> callback) {
        C3844i.m16253f(context, "context");
        C3844i.m16253f(request, "request");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public /* bridge */ /* synthetic */ void onGetCredential(Context context, C4515z c4515z, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l interfaceC4501l) {
        C4504o.m18498a(this, context, c4515z, cancellationSignal, executor, interfaceC4501l);
    }

    public /* bridge */ /* synthetic */ void onPrepareCredential(C4509t c4509t, CancellationSignal cancellationSignal, Executor executor, InterfaceC4501l interfaceC4501l) {
        C4504o.m18499b(this, c4509t, cancellationSignal, executor, interfaceC4501l);
    }

    public final void setGoogleApiAvailability(C1342a c1342a) {
        C3844i.m16253f(c1342a, "<set-?>");
        this.googleApiAvailability = c1342a;
    }
}
