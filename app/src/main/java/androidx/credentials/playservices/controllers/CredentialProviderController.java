package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import kotlin.jvm.internal.C3850o;
import p051db.InterfaceC3030a;
import p051db.InterfaceC3041l;
import p051db.InterfaceC3045p;
import p232s0.InterfaceC4501l;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;
import p243t0.C4594c;
import p243t0.C4600i;
import p243t0.C4602k;
import p243t0.C4607p;
import p253ta.C4755l;

/* loaded from: classes.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        protected final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC3030a<C4755l> onResultOrException) {
            C3844i.m16253f(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        /* renamed from: generateErrorStringCanceled$credentials_play_services_auth_release */
        public final String m4241x576fb150() {
            return "activity is cancelled by the user.";
        }

        /* renamed from: generateErrorStringUnknown$credentials_play_services_auth_release */
        public final String m4242x14b42947(int i10) {
            return "activity with result code: " + i10 + " indicating not RESULT_OK";
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [t0.i, T] */
        /* JADX WARN: Type inference failed for: r4v4, types: [t0.c, T] */
        protected final boolean maybeReportErrorResultCodeCreate(int i10, InterfaceC3045p<? super CancellationSignal, ? super InterfaceC3030a<C4755l>, C4755l> cancelOnError, InterfaceC3041l<? super AbstractC4596e, C4755l> onError, CancellationSignal cancellationSignal) {
            C3844i.m16253f(cancelOnError, "cancelOnError");
            C3844i.m16253f(onError, "onError");
            if (i10 == -1) {
                return false;
            }
            C3850o c3850o = new C3850o();
            c3850o.f15904n = new C4600i(m4242x14b42947(i10));
            if (i10 == 0) {
                c3850o.f15904n = new C4594c(m4241x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C0745x7cfe4d37(onError, c3850o));
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, t0.p] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, t0.k] */
        protected final boolean maybeReportErrorResultCodeGet(int i10, InterfaceC3045p<? super CancellationSignal, ? super InterfaceC3030a<C4755l>, C4755l> cancelOnError, InterfaceC3041l<? super AbstractC4604m, C4755l> onError, CancellationSignal cancellationSignal) {
            C3844i.m16253f(cancelOnError, "cancelOnError");
            C3844i.m16253f(onError, "onError");
            if (i10 == -1) {
                return false;
            }
            C3850o c3850o = new C3850o();
            c3850o.f15904n = new C4607p(m4242x14b42947(i10));
            if (i10 == 0) {
                c3850o.f15904n = new C4602k(m4241x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C0746x6edb4e75(onError, c3850o));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        C3844i.m16253f(context, "context");
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC3030a<C4755l> interfaceC3030a) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC3030a);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i10, InterfaceC3045p<? super CancellationSignal, ? super InterfaceC3030a<C4755l>, C4755l> interfaceC3045p, InterfaceC3041l<? super AbstractC4596e, C4755l> interfaceC3041l, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i10, interfaceC3045p, interfaceC3041l, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i10, InterfaceC3045p<? super CancellationSignal, ? super InterfaceC3030a<C4755l>, C4755l> interfaceC3045p, InterfaceC3041l<? super AbstractC4604m, C4755l> interfaceC3041l, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i10, interfaceC3045p, interfaceC3041l, cancellationSignal);
    }

    protected abstract T2 convertRequestToPlayServices(T1 t12);

    protected abstract R1 convertResponseToCredentialManager(R2 r22);

    public abstract void invokePlayServices(T1 t12, InterfaceC4501l<R1, E1> interfaceC4501l, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, InterfaceC3045p<? super String, ? super String, ? extends E1> conversionFn, Executor executor, InterfaceC4501l<R1, E1> callback, CancellationSignal cancellationSignal) {
        C3844i.m16253f(resultData, "resultData");
        C3844i.m16253f(conversionFn, "conversionFn");
        C3844i.m16253f(executor, "executor");
        C3844i.m16253f(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new C0747xfa88d3af(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
