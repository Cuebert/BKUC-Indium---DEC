package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p243t0.AbstractC4596e;
import p243t0.AbstractC4604m;
import p243t0.C4594c;
import p243t0.C4597f;
import p243t0.C4600i;
import p243t0.C4602k;
import p243t0.C4605n;
import p243t0.C4607p;
import p243t0.C4609r;
import ua.C4890i0;

/* loaded from: classes.dex */
public class CredentialProviderBaseController {
    public static final String ACTIVITY_REQUEST_CODE_TAG = "ACTIVITY_REQUEST_CODE";
    public static final String BEGIN_SIGN_IN_TAG = "BEGIN_SIGN_IN";
    private static final int CONTROLLER_REQUEST_CODE;
    public static final String CREATE_CANCELED = "CREATE_CANCELED";
    public static final String CREATE_INTERRUPTED = "CREATE_INTERRUPTED";
    public static final String CREATE_PASSWORD_TAG = "CREATE_PASSWORD";
    public static final String CREATE_PUBLIC_KEY_CREDENTIAL_TAG = "CREATE_PUBLIC_KEY_CREDENTIAL";
    public static final String CREATE_UNKNOWN = "CREATE_UNKNOWN";
    public static final Companion Companion = new Companion(null);
    public static final String EXCEPTION_MESSAGE_TAG = "EXCEPTION_MESSAGE";
    public static final String EXCEPTION_TYPE_TAG = "EXCEPTION_TYPE";
    public static final String FAILURE_RESPONSE_TAG = "FAILURE_RESPONSE";
    public static final String GET_CANCELED = "GET_CANCELED_TAG";
    public static final String GET_INTERRUPTED = "GET_INTERRUPTED";
    public static final String GET_NO_CREDENTIALS = "GET_NO_CREDENTIALS";
    public static final String GET_UNKNOWN = "GET_UNKNOWN";
    public static final String REQUEST_TAG = "REQUEST_TYPE";
    public static final String RESULT_DATA_TAG = "RESULT_DATA";
    public static final String RESULT_RECEIVER_TAG = "RESULT_RECEIVER";
    public static final String SIGN_IN_INTENT_TAG = "SIGN_IN_INTENT";
    public static final String TYPE_TAG = "TYPE";
    private static final Set<Integer> retryables;
    private final Context context;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        protected static /* synthetic */ void getCONTROLLER_REQUEST_CODE$annotations() {
        }

        /* renamed from: createCredentialExceptionTypeToException$credentials_play_services_auth_release */
        public final AbstractC4596e m4239x5e74af(String str, String str2) {
            if (C3844i.m16248a(str, CredentialProviderBaseController.CREATE_CANCELED)) {
                return new C4594c(str2);
            }
            if (C3844i.m16248a(str, CredentialProviderBaseController.CREATE_INTERRUPTED)) {
                return new C4597f(str2);
            }
            return new C4600i(str2);
        }

        protected final int getCONTROLLER_REQUEST_CODE() {
            return CredentialProviderBaseController.CONTROLLER_REQUEST_CODE;
        }

        /* renamed from: getCredentialExceptionTypeToException$credentials_play_services_auth_release */
        public final AbstractC4604m m4240xd975db95(String str, String str2) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals(CredentialProviderBaseController.GET_NO_CREDENTIALS)) {
                            return new C4609r(str2);
                        }
                    } else if (str.equals(CredentialProviderBaseController.GET_INTERRUPTED)) {
                        return new C4605n(str2);
                    }
                } else if (str.equals(CredentialProviderBaseController.GET_CANCELED)) {
                    return new C4602k(str2);
                }
            }
            return new C4607p(str2);
        }

        public final Set<Integer> getRetryables() {
            return CredentialProviderBaseController.retryables;
        }
    }

    static {
        Set<Integer> m19129d;
        m19129d = C4890i0.m19129d(7, 20);
        retryables = m19129d;
        CONTROLLER_REQUEST_CODE = 1;
    }

    public CredentialProviderBaseController(Context context) {
        C3844i.m16253f(context, "context");
        this.context = context;
    }

    public static final int getCONTROLLER_REQUEST_CODE() {
        return Companion.getCONTROLLER_REQUEST_CODE();
    }

    public final void generateHiddenActivityIntent(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        C3844i.m16253f(resultReceiver, "resultReceiver");
        C3844i.m16253f(hiddenIntent, "hiddenIntent");
        C3844i.m16253f(typeTag, "typeTag");
        hiddenIntent.putExtra(TYPE_TAG, typeTag);
        hiddenIntent.putExtra(ACTIVITY_REQUEST_CODE_TAG, CONTROLLER_REQUEST_CODE);
        hiddenIntent.putExtra(RESULT_RECEIVER_TAG, toIpcFriendlyResultReceiver(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    public final <T extends ResultReceiver> ResultReceiver toIpcFriendlyResultReceiver(T t10) {
        Parcel obtain = Parcel.obtain();
        C3844i.m16252e(obtain, "obtain()");
        C3844i.m16250c(t10);
        t10.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver;
    }
}
