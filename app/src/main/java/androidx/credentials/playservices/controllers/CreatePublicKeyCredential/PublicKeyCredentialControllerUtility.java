package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C3840e;
import kotlin.jvm.internal.C3844i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p232s0.C4496g;
import p232s0.C4513x;
import p243t0.C4607p;
import p253ta.C4753j;
import p256u0.AbstractC4786e;
import p256u0.C4778a;
import p256u0.C4780b;
import p256u0.C4781b0;
import p256u0.C4784d;
import p256u0.C4787f;
import p256u0.C4793l;
import p256u0.C4795n;
import p256u0.C4797p;
import p256u0.C4799r;
import p256u0.C4800s;
import p256u0.C4805x;
import p256u0.C4807z;
import p268v0.C4933a;
import ua.C4880d0;

/* loaded from: classes.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<ErrorCode, AbstractC4786e> orderedErrorCodeToExceptions;
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = AppsFlyerProperties.APP_ID;
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C3840e c3840e) {
            this();
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String challengeB64 = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            C3844i.m16252e(challengeB64, "challengeB64");
            if (!(challengeB64.length() == 0)) {
                return b64Decode(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        /* renamed from: addAuthenticatorAttestationResponse$credentials_play_services_auth_release */
        public final void m4222x55ac6fce(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) {
            C3844i.m16253f(clientDataJSON, "clientDataJSON");
            C3844i.m16253f(attestationObject, "attestationObject");
            C3844i.m16253f(transportArray, "transportArray");
            C3844i.m16253f(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(m4224x54c9ae06(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            C3844i.m16253f(str, "str");
            byte[] decode = Base64.decode(str, 11);
            C3844i.m16252e(decode, "decode(str, FLAGS)");
            return decode;
        }

        public final String b64Encode(byte[] data) {
            C3844i.m16253f(data, "data");
            String encodeToString = Base64.encodeToString(data, 11);
            C3844i.m16252e(encodeToString, "encodeToString(data, FLAGS)");
            return encodeToString;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        
            if (r2 == true) goto L32;
         */
        /* renamed from: beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p243t0.AbstractC4604m m4223x9b91fc47(com.google.android.gms.fido.fido2.api.common.ErrorCode r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "code"
                kotlin.jvm.internal.C3844i.m16253f(r6, r0)
                java.util.LinkedHashMap r0 = r5.m4235x717581f0()
                java.lang.Object r0 = r0.get(r6)
                u0.e r0 = (p256u0.AbstractC4786e) r0
                if (r0 != 0) goto L2d
                v0.d r6 = new v0.d
                u0.b0 r0 = new u0.b0
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown fido gms exception - "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r6.<init>(r0, r7)
                goto L50
            L2d:
                com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = com.google.android.gms.fido.fido2.api.common.ErrorCode.CONSTRAINT_ERR
                if (r6 != r1) goto L4b
                r6 = 1
                r1 = 0
                if (r7 == 0) goto L40
                r2 = 2
                r3 = 0
                java.lang.String r4 = "Unable to get sync account"
                boolean r2 = p132jb.C3686c.m15666g(r7, r4, r1, r2, r3)
                if (r2 != r6) goto L40
                goto L41
            L40:
                r6 = 0
            L41:
                if (r6 == 0) goto L4b
                t0.k r6 = new t0.k
                java.lang.String r7 = "Passkey retrieval was cancelled by the user."
                r6.<init>(r7)
                goto L50
            L4b:
                v0.d r6 = new v0.d
                r6.<init>(r0, r7)
            L50:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.Companion.m4223x9b91fc47(com.google.android.gms.fido.fido2.api.common.ErrorCode, java.lang.String):t0.m");
        }

        public final boolean checkAlgSupported(int i10) {
            try {
                COSEAlgorithmIdentifier.m7815a(i10);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(C4496g request) {
            C3844i.m16253f(request, "request");
            return convertJSON$credentials_play_services_auth_release(new JSONObject(request.m18479g()));
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject json) {
            C3844i.m16253f(json, "json");
            PublicKeyCredentialCreationOptions.C1450a c1450a = new PublicKeyCredentialCreationOptions.C1450a();
            m4238x2d055f1c(json, c1450a);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, c1450a);
            m4237x81bb96da(json, c1450a);
            parseOptionalTimeout$credentials_play_services_auth_release(json, c1450a);
            m4236x4e596641(json, c1450a);
            parseOptionalExtensions$credentials_play_services_auth_release(json, c1450a);
            PublicKeyCredentialCreationOptions m7840a = c1450a.m7840a();
            C3844i.m16252e(m7840a, "builder.build()");
            return m7840a;
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(C4513x option) {
            C3844i.m16253f(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions m7266a = new BeginSignInRequest.PasskeyJsonRequestOptions.C1316a().m7268c(true).m7267b(option.m18526g()).m7266a();
            C3844i.m16252e(m7266a, "Builder()\n        .setSu…estJson)\n        .build()");
            return m7266a;
        }

        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(C4513x option) {
            C3844i.m16253f(option, "option");
            JSONObject jSONObject = new JSONObject(option.m18526g());
            String rpId = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            C3844i.m16252e(rpId, "rpId");
            if (!(rpId.length() == 0)) {
                BeginSignInRequest.PasskeysRequestOptions m7273a = new BeginSignInRequest.PasskeysRequestOptions.C1317a().m7276d(true).m7275c(rpId).m7274b(getChallenge(jSONObject)).m7273a();
                C3844i.m16252e(m7273a, "Builder()\n        .setSu…allenge)\n        .build()");
                return m7273a;
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        /* renamed from: getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release */
        public final String m4224x54c9ae06() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        /* renamed from: getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release */
        public final String m4225x4cbca474() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        /* renamed from: getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release */
        public final String m4226xf055c137() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        /* renamed from: getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release */
        public final String m4227xa1a1c52a() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        /* renamed from: getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release */
        public final String m4228x174cd597() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        /* renamed from: getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m4229x1277f26e() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        /* renamed from: getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m4230x42bd95bb() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        /* renamed from: getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release */
        public final String m4231x11a7ad79() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        /* renamed from: getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release */
        public final String m4232xe9a27208() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        /* renamed from: getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release */
        public final String m4233x55d9bf39() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        /* renamed from: getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release */
        public final String m4234xd8020d7b() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        /* renamed from: getOrderedErrorCodeToExceptions$credentials_play_services_auth_release */
        public final LinkedHashMap<ErrorCode, AbstractC4786e> m4235x717581f0() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        /* renamed from: parseOptionalAuthenticatorSelection$credentials_play_services_auth_release */
        public final void m4236x4e596641(JSONObject json, PublicKeyCredentialCreationOptions.C1450a builder) {
            C3844i.m16253f(json, "json");
            C3844i.m16253f(builder, "builder");
            if (json.has(m4226xf055c137())) {
                JSONObject jSONObject = json.getJSONObject(m4226xf055c137());
                AuthenticatorSelectionCriteria.C1447a c1447a = new AuthenticatorSelectionCriteria.C1447a();
                boolean optBoolean = jSONObject.optBoolean(m4232xe9a27208(), false);
                String residentKey = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                C3844i.m16252e(residentKey, "residentKey");
                c1447a.m7813c(Boolean.valueOf(optBoolean)).m7814d(residentKey.length() > 0 ? ResidentKeyRequirement.m7863b(residentKey) : null);
                String authenticatorAttachmentString = jSONObject.optString(m4225x4cbca474(), BuildConfig.FLAVOR);
                C3844i.m16252e(authenticatorAttachmentString, "authenticatorAttachmentString");
                if (authenticatorAttachmentString.length() > 0) {
                    c1447a.m7812b(Attachment.m7779b(authenticatorAttachmentString));
                }
                builder.m7843d(c1447a.m7811a());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.C1450a builder) {
            C3844i.m16253f(json, "json");
            C3844i.m16253f(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                AuthenticationExtensions.C1446a c1446a = new AuthenticationExtensions.C1446a();
                String appIdExtension = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                C3844i.m16252e(appIdExtension, "appIdExtension");
                if (appIdExtension.length() > 0) {
                    c1446a.m7784b(new FidoAppIdExtension(appIdExtension));
                }
                if (jSONObject.optBoolean(m4233x55d9bf39(), false)) {
                    c1446a.m7785c(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    c1446a.m7786d(new UserVerificationMethodExtension(true));
                }
                builder.m7842c(c1446a.m7783a());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.C1450a builder) {
            C3844i.m16253f(json, "json");
            C3844i.m16253f(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.m7848i(Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000));
            }
        }

        /* renamed from: parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release */
        public final void m4237x81bb96da(JSONObject json, PublicKeyCredentialCreationOptions.C1450a builder) {
            C3844i.m16253f(json, "json");
            C3844i.m16253f(builder, "builder");
            ArrayList arrayList = new ArrayList();
            if (json.has(m4228x174cd597())) {
                JSONArray jSONArray = json.getJSONArray(m4228x174cd597());
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    C3844i.m16252e(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] b64Decode = b64Decode(string);
                    String descriptorType = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    C3844i.m16252e(descriptorType, "descriptorType");
                    if (!(descriptorType.length() == 0)) {
                        if (!(b64Decode.length == 0)) {
                            ArrayList arrayList2 = null;
                            if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                                arrayList2 = new ArrayList();
                                JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                                int length2 = jSONArray2.length();
                                for (int i11 = 0; i11 < length2; i11++) {
                                    try {
                                        Transport m7778b = Transport.m7778b(jSONArray2.getString(i11));
                                        C3844i.m16252e(m7778b, "fromString(descriptorTransports.getString(j))");
                                        arrayList2.add(m7778b);
                                    } catch (Transport.C1442a e10) {
                                        throw new C4933a(new C4787f(), e10.getMessage());
                                    }
                                }
                            }
                            arrayList.add(new PublicKeyCredentialDescriptor(descriptorType, b64Decode, arrayList2));
                        } else {
                            throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                        }
                    } else {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                }
            }
            builder.m7845f(arrayList);
            String attestationString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            C3844i.m16252e(attestationString, "attestationString");
            builder.m7841b(AttestationConveyancePreference.m7780b(attestationString.length() == 0 ? "none" : attestationString));
        }

        /* renamed from: parseRequiredChallengeAndUser$credentials_play_services_auth_release */
        public final void m4238x2d055f1c(JSONObject json, PublicKeyCredentialCreationOptions.C1450a builder) {
            C3844i.m16253f(json, "json");
            C3844i.m16253f(builder, "builder");
            builder.m7844e(getChallenge(json));
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            C3844i.m16252e(string, "user.getString(JSON_KEY_ID)");
            byte[] b64Decode = b64Decode(string);
            String userName = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String displayName = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String optString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            C3844i.m16252e(displayName, "displayName");
            if (!(displayName.length() == 0)) {
                if (!(b64Decode.length == 0)) {
                    C3844i.m16252e(userName, "userName");
                    if (!(userName.length() == 0)) {
                        builder.m7849j(new PublicKeyCredentialUserEntity(b64Decode, userName, optString, displayName));
                        return;
                    }
                    throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
                }
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.C1450a builder) {
            C3844i.m16253f(json, "json");
            C3844i.m16253f(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String rpId = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String rpName = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            String optString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            C3844i.m16250c(optString);
            if (optString.length() == 0) {
                optString = null;
            }
            C3844i.m16252e(rpName, "rpName");
            if (!(rpName.length() == 0)) {
                C3844i.m16252e(rpId, "rpId");
                if (!(rpId.length() == 0)) {
                    builder.m7847h(new PublicKeyCredentialRpEntity(rpId, rpName, optString));
                    JSONArray jSONArray = json.getJSONArray(m4231x11a7ad79());
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        int i11 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                        String typeParam = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                        C3844i.m16252e(typeParam, "typeParam");
                        if (!(typeParam.length() == 0)) {
                            if (checkAlgSupported(i11)) {
                                arrayList.add(new PublicKeyCredentialParameters(typeParam, i11));
                            }
                        } else {
                            throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                        }
                    }
                    builder.m7846g(arrayList);
                    return;
                }
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        
            if (r1 == true) goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p243t0.AbstractC4596e publicKeyCredentialResponseContainsError(com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r7) {
            /*
                r6 = this;
                java.lang.String r0 = "cred"
                kotlin.jvm.internal.C3844i.m16253f(r7, r0)
                com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse r7 = r7.m7824C()
                java.lang.String r0 = "cred.response"
                kotlin.jvm.internal.C3844i.m16252e(r7, r0)
                boolean r0 = r7 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse
                r1 = 0
                if (r0 == 0) goto L6d
                com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r7 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r7
                com.google.android.gms.fido.fido2.api.common.ErrorCode r0 = r7.m7804x()
                java.lang.String r2 = "authenticatorResponse.errorCode"
                kotlin.jvm.internal.C3844i.m16252e(r0, r2)
                java.util.LinkedHashMap r2 = r6.m4235x717581f0()
                java.lang.Object r2 = r2.get(r0)
                u0.e r2 = (p256u0.AbstractC4786e) r2
                java.lang.String r7 = r7.m7806z()
                if (r2 != 0) goto L4a
                v0.a r0 = new v0.a
                u0.b0 r1 = new u0.b0
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "unknown fido gms exception - "
                r2.append(r3)
                r2.append(r7)
                java.lang.String r7 = r2.toString()
                r0.<init>(r1, r7)
                goto L6c
            L4a:
                com.google.android.gms.fido.fido2.api.common.ErrorCode r3 = com.google.android.gms.fido.fido2.api.common.ErrorCode.CONSTRAINT_ERR
                if (r0 != r3) goto L67
                r0 = 1
                r3 = 0
                if (r7 == 0) goto L5c
                r4 = 2
                java.lang.String r5 = "Unable to get sync account"
                boolean r1 = p132jb.C3686c.m15666g(r7, r5, r3, r4, r1)
                if (r1 != r0) goto L5c
                goto L5d
            L5c:
                r0 = 0
            L5d:
                if (r0 == 0) goto L67
                t0.c r0 = new t0.c
                java.lang.String r7 = "Passkey registration was cancelled by the user."
                r0.<init>(r7)
                goto L6c
            L67:
                v0.a r0 = new v0.a
                r0.<init>(r2, r7)
            L6c:
                return r0
            L6d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(com.google.android.gms.fido.fido2.api.common.PublicKeyCredential):t0.e");
        }

        public final String toAssertPasskeyResponse(SignInCredential cred) {
            C3844i.m16253f(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential m7318F = cred.m7318F();
            AuthenticatorResponse m7824C = m7318F != null ? m7318F.m7824C() : null;
            C3844i.m16250c(m7824C);
            if (!(m7824C instanceof AuthenticatorErrorResponse)) {
                if (m7824C instanceof AuthenticatorAssertionResponse) {
                    try {
                        String m7826E = m7318F.m7826E();
                        C3844i.m16252e(m7826E, "publicKeyCred.toJson()");
                        return m7826E;
                    } catch (Throwable th) {
                        throw new C4607p("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                    }
                }
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: " + m7824C.getClass().getName());
                String jSONObject2 = jSONObject.toString();
                C3844i.m16252e(jSONObject2, "json.toString()");
                return jSONObject2;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) m7824C;
            ErrorCode m7804x = authenticatorErrorResponse.m7804x();
            C3844i.m16252e(m7804x, "authenticatorResponse.errorCode");
            throw m4223x9b91fc47(m7804x, authenticatorErrorResponse.m7806z());
        }
    }

    static {
        LinkedHashMap<ErrorCode, AbstractC4786e> m19105e;
        m19105e = C4880d0.m19105e(C4753j.m18910a(ErrorCode.UNKNOWN_ERR, new C4781b0()), C4753j.m18910a(ErrorCode.ABORT_ERR, new C4778a()), C4753j.m18910a(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C4799r()), C4753j.m18910a(ErrorCode.CONSTRAINT_ERR, new C4780b()), C4753j.m18910a(ErrorCode.DATA_ERR, new C4784d()), C4753j.m18910a(ErrorCode.INVALID_STATE_ERR, new C4793l()), C4753j.m18910a(ErrorCode.ENCODING_ERR, new C4787f()), C4753j.m18910a(ErrorCode.NETWORK_ERR, new C4795n()), C4753j.m18910a(ErrorCode.NOT_ALLOWED_ERR, new C4797p()), C4753j.m18910a(ErrorCode.NOT_SUPPORTED_ERR, new C4800s()), C4753j.m18910a(ErrorCode.SECURITY_ERR, new C4805x()), C4753j.m18910a(ErrorCode.TIMEOUT_ERR, new C4807z()));
        orderedErrorCodeToExceptions = m19105e;
    }

    public static final PublicKeyCredentialCreationOptions convert(C4496g c4496g) {
        return Companion.convert(c4496g);
    }
}
