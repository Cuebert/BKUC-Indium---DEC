package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC0803d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p258u2.C4832n;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends ActivityC0803d {

    /* renamed from: H */
    private static boolean f6101H;

    /* renamed from: C */
    private boolean f6102C = false;

    /* renamed from: D */
    private SignInConfiguration f6103D;

    /* renamed from: E */
    private boolean f6104E;

    /* renamed from: F */
    private int f6105F;

    /* renamed from: G */
    private Intent f6106G;

    /* renamed from: J0 */
    private final void m7374J0() {
        m4618z0().mo4957c(0, null, new C1341b(this, null));
        f6101H = false;
    }

    /* renamed from: K0 */
    private final void m7375K0(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f6101H = false;
    }

    /* renamed from: L0 */
    private final void m7376L0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f6103D);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f6102C = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m7375K0(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f6102C) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m7364x() != null) {
                GoogleSignInAccount m7364x = signInAccount.m7364x();
                C4832n m19022a = C4832n.m19022a(this);
                GoogleSignInOptions m7371x = this.f6103D.m7371x();
                Objects.requireNonNull(m7364x);
                m19022a.m19025c(m7371x, m7364x);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", m7364x);
                this.f6104E = true;
                this.f6105F = i11;
                this.f6106G = intent;
                m7374J0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m7375K0(intExtra);
                return;
            }
        }
        m7375K0(8);
    }

    @Override // androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m7375K0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        Objects.requireNonNull(bundleExtra);
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f6103D = signInConfiguration;
        if (bundle == null) {
            if (f6101H) {
                setResult(0);
                m7375K0(12502);
                return;
            } else {
                f6101H = true;
                m7376L0(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f6104E = z10;
        if (z10) {
            this.f6105F = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            Objects.requireNonNull(intent2);
            this.f6106G = intent2;
            m7374J0();
        }
    }

    @Override // androidx.fragment.app.ActivityC0803d, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f6101H = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f6104E);
        if (this.f6104E) {
            bundle.putInt("signInResultCode", this.f6105F);
            bundle.putParcelable("signInResultData", this.f6106G);
        }
    }
}
