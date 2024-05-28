package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import p097h4.C3394a;
import p232s0.AbstractC4503n;
import p232s0.C4509t;
import p232s0.C4512w;
import p232s0.C4513x;

/* loaded from: classes.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C3394a c3394a) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.C1315a m7262g = BeginSignInRequest.GoogleIdTokenRequestOptions.m7248x().m7258c(c3394a.m14955h()).m7259d(c3394a.m14958k()).m7260e(c3394a.m14959l()).m7261f(c3394a.m14960m()).m7262g(true);
            C3844i.m16252e(m7262g, "builder()\n              …      .setSupported(true)");
            if (c3394a.m14957j() != null) {
                String m14957j = c3394a.m14957j();
                C3844i.m16250c(m14957j);
                m7262g.m7256a(m14957j, c3394a.m14956i());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions m7257b = m7262g.m7257b();
            C3844i.m16252e(m7257b, "idTokenOption.build()");
            return m7257b;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            C3844i.m16252e(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j10) {
            return j10 < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        /* renamed from: constructBeginSignInRequest$credentials_play_services_auth_release */
        public final BeginSignInRequest m4221x545fe152(C4509t request, Context context) {
            C3844i.m16253f(request, "request");
            C3844i.m16253f(context, "context");
            BeginSignInRequest.C1319a c1319a = new BeginSignInRequest.C1319a();
            boolean z10 = false;
            boolean z11 = false;
            for (AbstractC4503n abstractC4503n : request.m18516a()) {
                if (abstractC4503n instanceof C4512w) {
                    c1319a.m7286f(new BeginSignInRequest.PasswordRequestOptions.C1318a().m7280b(true).m7279a());
                    if (!z10 && !abstractC4503n.m18496e()) {
                        z10 = false;
                    }
                    z10 = true;
                } else if ((abstractC4503n instanceof C4513x) && !z11) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context))) {
                        c1319a.m7285e(PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((C4513x) abstractC4503n));
                    } else {
                        c1319a.m7284d(PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((C4513x) abstractC4503n));
                    }
                    z11 = true;
                } else if (abstractC4503n instanceof C3394a) {
                    C3394a c3394a = (C3394a) abstractC4503n;
                    c1319a.m7283c(convertToGoogleIdTokenOption(c3394a));
                    if (!z10 && !c3394a.m14954g()) {
                        z10 = false;
                    }
                    z10 = true;
                }
            }
            BeginSignInRequest m7281a = c1319a.m7282b(z10).m7281a();
            C3844i.m16252e(m7281a, "requestBuilder\n         …\n                .build()");
            return m7281a;
        }
    }
}
