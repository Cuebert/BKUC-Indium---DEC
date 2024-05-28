package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p051db.InterfaceC3041l;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;
import p137k3.C3755a;
import p209q2.C4294b;
import p295x2.C5507b;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }
    }

    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        if ((beginSignInRequest != null ? C4294b.m17813b(this).mo17680f(beginSignInRequest).mo14499f(new InterfaceC3255h() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda4
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda4() {
            }

            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(InterfaceC3041l.this, obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda3
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda3() {
            }

            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(HiddenActivity.this, exc);
            }
        }) : null) == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    public static final void handleBeginSignIn$lambda$10$lambda$8(InterfaceC3041l tmp0, Object obj) {
        C3844i.m16253f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity this$0, Exception e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "e");
        String str = ((e10 instanceof C5507b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C5507b) e10).m20260b()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        C3844i.m16250c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During begin sign in, failure response from one tap: " + e10.getMessage());
    }

    private final void handleCreatePassword() {
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        if ((savePasswordRequest != null ? C4294b.m17812a(this).mo17671g(savePasswordRequest).mo14499f(new InterfaceC3255h() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda7
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda7() {
            }

            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                HiddenActivity.handleCreatePassword$lambda$14$lambda$12(InterfaceC3041l.this, obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda2
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda2() {
            }

            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                HiddenActivity.handleCreatePassword$lambda$14$lambda$13(HiddenActivity.this, exc);
            }
        }) : null) == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(InterfaceC3041l tmp0, Object obj) {
        C3844i.m16253f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity this$0, Exception e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "e");
        String str = ((e10 instanceof C5507b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C5507b) e10).m20260b()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        C3844i.m16250c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During save password, found password failure response from one tap " + e10.getMessage());
    }

    private final void handleCreatePublicKeyCredential() {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        if ((publicKeyCredentialCreationOptions != null ? C3755a.m15966a(this).m16473y(publicKeyCredentialCreationOptions).mo14499f(new InterfaceC3255h() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda5
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda5() {
            }

            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC3041l.this, obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda0
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda0() {
            }

            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity.this, exc);
            }
        }) : null) == null) {
            Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(InterfaceC3041l tmp0, Object obj) {
        C3844i.m16253f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity this$0, Exception e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "e");
        String str = ((e10 instanceof C5507b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C5507b) e10).m20260b()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        C3844i.m16250c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During create public key credential, fido registration failure: " + e10.getMessage());
    }

    private final void handleGetSignInIntent() {
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        if ((getSignInIntentRequest != null ? C4294b.m17813b(this).mo17676a(getSignInIntentRequest).mo14499f(new InterfaceC3255h() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda6
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda6() {
            }

            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(InterfaceC3041l.this, obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticLambda1
            public /* synthetic */ HiddenActivity$$ExternalSyntheticLambda1() {
            }

            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity.this, exc);
            }
        }) : null) == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(InterfaceC3041l tmp0, Object obj) {
        C3844i.m16253f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity this$0, Exception e10) {
        C3844i.m16253f(this$0, "this$0");
        C3844i.m16253f(e10, "e");
        String str = ((e10 instanceof C5507b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((C5507b) e10).m20260b()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = this$0.resultReceiver;
        C3844i.m16250c(resultReceiver);
        this$0.setupFailure(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e10.getMessage());
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    public final void setupFailure(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, str);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, i10);
        bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(i11, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        Log.w(TAG, "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        C3844i.m16253f(outState, "outState");
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
