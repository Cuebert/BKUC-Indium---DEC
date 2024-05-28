package p300x7;

import android.content.Context;
import androidx.appcompat.widget.ListPopupWindow;
import com.roblox.client.C2822f0;
import com.roblox.client.C2842l;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.engine.jni.NativeGLInterface;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1157q;
import p035c9.C1159s;
import p035c9.InterfaceC1158r;
import p062e8.C3095f;
import p100h7.AsyncTaskC3424q;
import p100h7.C3417j;
import p177n7.C4073a;

/* renamed from: x7.e */
/* loaded from: classes.dex */
public class C5563e {

    /* renamed from: e */
    private static C5563e f20655e;

    /* renamed from: a */
    private final boolean f20656a;

    /* renamed from: b */
    private final InterfaceC1158r f20657b;

    /* renamed from: c */
    private long f20658c;

    /* renamed from: d */
    private C3095f f20659d;

    C5563e(boolean z10, InterfaceC1158r interfaceC1158r) {
        this.f20656a = z10;
        this.f20657b = interfaceC1158r;
    }

    /* renamed from: e */
    public static void m20377e(String str) {
        C2822f0.m12485g(str, "sessionCheck");
    }

    /* renamed from: g */
    public static void m20378g(int i10) {
        m20385p("Android-AppSignup-Success", 1);
    }

    /* renamed from: h */
    public static C5563e m20379h() {
        C5563e c5563e = f20655e;
        if (c5563e != null) {
            return c5563e;
        }
        synchronized (C5563e.class) {
            if (f20655e == null) {
                f20655e = new C5563e();
            }
        }
        return f20655e;
    }

    /* renamed from: i */
    private static String m20380i(boolean z10) {
        return C2877p0.m12935m0() ? z10 ? "Quest-ROBLOXPlayer-Session-Inferred-Crash" : "Quest-ROBLOXPlayer-Session-Inferred-Success" : z10 ? "Android-ROBLOXPlayer-Session-Inferred-Crash" : "Android-ROBLOXPlayer-Session-Inferred-Success";
    }

    /* renamed from: j */
    static String m20381j(String str) {
        String str2;
        String[] split = str.split("\\.");
        String str3 = split.length >= 2 ? split[1] : "Unknown";
        if (C2877p0.m12935m0()) {
            str2 = "Quest-AppStartup-Version-";
        } else {
            str2 = C1152l.m6733d() ? "Amazon-AppStartup-Version-" : "Android-AppStartup-Version-";
        }
        return str2 + str3;
    }

    /* renamed from: k */
    static String m20382k(String str, boolean z10) {
        String[] split = str.split("\\.");
        String str2 = split.length >= 2 ? split[1] : "Unknown";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "Amazon-AppStartup-Version-" : "Android-AppStartup-Version-");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: l */
    static String m20383l() {
        return C2877p0.m12935m0() ? "Quest-AppStartup-Version-Total" : C1152l.m6733d() ? "Amazon-AppStartup-Version-Total" : "Android-AppStartup-Version-Total";
    }

    /* renamed from: o */
    private static void m20384o(String str) {
        m20385p(str, 1);
    }

    /* renamed from: p */
    private static void m20385p(String str, int i10) {
        new AsyncTaskC3424q(C2877p0.m12956x() + C2877p0.m12954w(str, i10)).mo15006c();
    }

    /* renamed from: r */
    private void m20386r(String str, int i10, String str2, String str3, String str4, long j10, long j11) {
        C4073a m16947d = new C4073a("Android2StepVerificationFailure").m16948e("Status", str).m16948e("requestUrl", str2).m16946c("httpResponseCode", i10).m16948e("responseBody", str3).m16948e("username", str4).m16947d("responseTimeMs", j10);
        if (j11 >= 0) {
            m16947d.m16947d("timeSinceLastLoginMs", j11);
        }
        m16947d.m16951h();
    }

    /* renamed from: s */
    private void m20387s(String str, String str2, int i10, String str3, String str4, String str5, long j10, String str6) {
        new C4073a(str).m16948e("Status", str2).m16948e("requestUrl", str3).m16948e("responseBody", str4).m16948e("username", str5).m16947d("responseTimeMs", j10).m16946c("httpResponseCode", i10).m16948e("signupType", str6).m16951h();
    }

    /* renamed from: A */
    public void m20388A(String str) {
        m20385p(str, 1);
    }

    /* renamed from: B */
    public void m20389B(String str, long j10) {
        new AsyncTaskC3424q(C2877p0.m12960z() + C2877p0.m12958y(str, j10)).mo15006c();
        if (this.f20656a) {
            m20390C(str, j10);
        }
    }

    /* renamed from: C */
    public void m20390C(String str, long j10) {
        NativeGLInterface.nativeReportToDiagByCountryCode("Mobile", str, j10);
    }

    /* renamed from: D */
    public void m20391D() {
        m20388A("Android-Payments-Incorrect-User-Purchase");
    }

    /* renamed from: E */
    public void m20392E() {
        m20388A("Android-Payments-Api-V1-Precheck-Request");
    }

    /* renamed from: F */
    public void m20393F() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-200");
    }

    /* renamed from: G */
    public void m20394G() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-400");
    }

    /* renamed from: H */
    public void m20395H() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-401");
    }

    /* renamed from: I */
    public void m20396I() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-403");
    }

    /* renamed from: J */
    public void m20397J() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-404");
    }

    /* renamed from: K */
    public void m20398K() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-429");
    }

    /* renamed from: L */
    public void m20399L() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-500");
    }

    /* renamed from: M */
    public void m20400M() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-503");
    }

    /* renamed from: N */
    public void m20401N() {
        m20388A("Android-Payments-Api-V1-Precheck-Response-Unknown");
    }

    /* renamed from: O */
    public void m20402O() {
        m20388A("Android-Payments-Api-V1-Verify-Request");
    }

    /* renamed from: P */
    public void m20403P() {
        m20388A("Android-Payments-Api-V1-Verify-Response-200");
    }

    /* renamed from: Q */
    public void m20404Q() {
        m20388A("Android-Payments-Api-V1-Verify-Response-400");
    }

    /* renamed from: R */
    public void m20405R() {
        m20388A("Android-Payments-Api-V1-Verify-Response-401");
    }

    /* renamed from: S */
    public void m20406S() {
        m20388A("Android-Payments-Api-V1-Verify-Response-500");
    }

    /* renamed from: T */
    public void m20407T() {
        m20388A("Android-Payments-Api-V1-Verify-Response-Unknown");
    }

    /* renamed from: U */
    public void m20408U() {
        m20388A("Android-Payments-Pending-Purchase");
    }

    /* renamed from: V */
    public void m20409V(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PrecheckBalanceError-InApp" : "Android-Payments-PrecheckBalanceError-InApp" : z11 ? "Amazon-Payments-PrecheckBalanceError-InGame" : "Android-Payments-PrecheckBalanceError-InGame");
    }

    /* renamed from: W */
    public void m20410W(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PrecheckError-InApp" : "Android-Payments-PrecheckError-InApp" : z11 ? "Amazon-Payments-PrecheckError-InGame" : "Android-Payments-PrecheckError-InGame");
    }

    /* renamed from: X */
    public void m20411X(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InApp" : "Android-Payments-PrecheckProductDetailsNotSupported-InApp" : z11 ? "Amazon-Payments-PrecheckProductDetailsNotSupported-InGame" : "Android-Payments-PrecheckProductDetailsNotSupported-InGame");
    }

    /* renamed from: Y */
    public void m20412Y(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PrecheckRetry-InApp" : "Android-Payments-PrecheckRetry-InApp" : z11 ? "Amazon-Payments-PrecheckRetry-InGame" : "Android-Payments-PrecheckRetry-InGame");
    }

    /* renamed from: Z */
    public void m20413Z(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PrecheckUnknownError-InApp" : "Android-Payments-PrecheckUnknownError-InApp" : z11 ? "Amazon-Payments-PrecheckUnknownError-InGame" : "Android-Payments-PrecheckUnknownError-InGame");
    }

    /* renamed from: a */
    public void m20414a(String str, String str2, C3417j c3417j) {
        int m15027b = c3417j.m15027b();
        m20384o("Android-App2SV-Failure");
        m20386r(str, m15027b, c3417j.m15031f(), c3417j.m15026a(), str2, c3417j.m15028c(), -1L);
    }

    /* renamed from: a0 */
    public void m20415a0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PurchaseAlreadyAcknowledged-InApp" : "Android-Payments-PurchaseAlreadyAcknowledged-InApp" : z11 ? "Amazon-Payments-PurchaseAlreadyAcknowledged-InGame" : "Android-Payments-PurchaseAlreadyAcknowledged-InGame");
    }

    /* renamed from: b */
    public void m20416b(int i10) {
        m20384o("Android-App2SV-Success");
    }

    /* renamed from: b0 */
    public void m20417b0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PurchaseCancelled-InApp" : "Android-Payments-PurchaseCancelled-InApp" : z11 ? "Amazon-Payments-PurchaseCancelled-InGame" : "Android-Payments-PurchaseCancelled-InGame");
    }

    /* renamed from: c */
    public void m20418c(String str, String str2, int i10) {
        m20384o("Android-AppLogin-Failure");
        m20384o(str2);
    }

    /* renamed from: c0 */
    public void m20419c0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PurchaseFailed-InApp" : "Android-Payments-PurchaseFailed-InApp" : z11 ? "Amazon-Payments-PurchaseFailed-InGame" : "Android-Payments-PurchaseFailed-InGame");
    }

    /* renamed from: d */
    public void m20420d() {
        m20384o("Android-AppLogin-Success");
    }

    /* renamed from: d0 */
    public void m20421d0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PurchaseFlooded-InApp" : "Android-Payments-PurchaseFlooded-InApp" : z11 ? "Amazon-Payments-PurchaseFlooded-InGame" : "Android-Payments-PurchaseFlooded-InGame");
    }

    /* renamed from: e0 */
    public void m20422e0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-PurchaseSuccess-InApp" : "Android-Payments-PurchaseSuccess-InApp" : z11 ? "Amazon-Payments-PurchaseSuccess-InGame" : "Android-Payments-PurchaseSuccess-InGame");
    }

    /* renamed from: f */
    public void m20423f(String str, String str2, int i10, String str3, String str4, String str5, long j10) {
        m20384o(str);
        m20384o("Android-AppSignup-Failure");
        m20387s("SignupFailureAndroid", str2, i10, str3, str4, str5, j10, "regular");
    }

    /* renamed from: f0 */
    public void m20424f0() {
        m20388A("Android-Payments-Unacknowledged-Purchase-Failure");
    }

    /* renamed from: g0 */
    public void m20425g0() {
        m20388A("Android-Payments-Unknown-State-Purchase");
    }

    /* renamed from: h0 */
    public void m20426h0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-VerificationEmptyError-InApp" : "Android-Payments-VerificationEmptyError-InApp" : z11 ? "Amazon-Payments-VerificationEmptyError-InGame" : "Android-Payments-VerificationEmptyError-InGame");
    }

    /* renamed from: i0 */
    public void m20427i0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-VerificationError-InApp" : "Android-Payments-VerificationError-InApp" : z11 ? "Amazon-Payments-VerificationError-InGame" : "Android-Payments-VerificationError-InGame");
    }

    /* renamed from: j0 */
    public void m20428j0(boolean z10, boolean z11) {
        m20388A(z10 ? z11 ? "Amazon-Payments-VerificationUnknownError-InApp" : "Android-Payments-VerificationUnknownError-InApp" : z11 ? "Amazon-Payments-VerificationUnknownError-InGame" : "Android-Payments-VerificationUnknownError-InGame");
    }

    /* renamed from: k0 */
    public void m20429k0(C3095f c3095f) {
        this.f20659d = c3095f;
    }

    /* renamed from: l0 */
    public void m20430l0() {
        long mo6756b = this.f20657b.mo6756b();
        long j10 = this.f20658c;
        long j11 = mo6756b - j10;
        if (j10 == 0 || j11 >= 3600000) {
            m20432n();
            this.f20658c = mo6756b;
        }
    }

    /* renamed from: m */
    public void m20431m() {
        m20379h().m20388A(C1152l.m6733d() ? "Mobile-DownloadCount-Amazon" : "Mobile-DownloadCount-Android");
    }

    /* renamed from: n */
    void m20432n() {
        boolean m6733d = C1152l.m6733d();
        String m20382k = m20382k(C2877p0.m12921f1(), m6733d);
        if (C1134c.m6537a().mo6585X()) {
            m20388A(m20383l());
            m20388A(m20381j(C2877p0.m12921f1()));
        } else {
            m20388A(m6733d ? "Amazon-AppStartup-Version-Total" : "Android-AppStartup-Version-Total");
            m20388A(m20382k);
        }
    }

    /* renamed from: q */
    public void m20433q(boolean z10) {
        new C4073a("Android-RobloxPlayer-SessionReport-Inferred").m16948e("Session", z10 ? "Crash" : "Success").m16951h();
        m20388A(m20380i(z10));
    }

    /* renamed from: t */
    public void m20434t(Context context) {
        if (context != null) {
            C2872n.m12830h().m12834d().mo17707c(context);
        }
    }

    /* renamed from: u */
    public void m20435u(Context context, long j10) {
        if (context != null) {
            C2872n.m12830h().m12834d().mo17709e(context, j10);
        }
    }

    /* renamed from: v */
    public void m20436v(String str) {
        C1151k.m6712f("rbx.purchaseflow", str);
        C3095f c3095f = this.f20659d;
        if (c3095f != null) {
            c3095f.f13013d++;
            new C4073a("Android-PurchaseFlow").m16953n(true).m16948e("Username", this.f20659d.f13010a).m16949f("InAppPurchase", this.f20659d.f13012c).m16948e("ProductId", this.f20659d.f13011b).m16948e("Message", this.f20659d.f13013d + "- " + str).m16950g("Rooted", Boolean.valueOf(C2842l.m12682g().m12684h())).m16951h();
        }
    }

    /* renamed from: w */
    public void m20437w(String str, String str2, String str3, long j10) {
        C2872n.m12830h().m12834d().mo17710f(str, str2, str3, j10, C1152l.m6733d());
    }

    /* renamed from: x */
    public void m20438x(boolean z10) {
        m20388A(z10 ? "Android-Payments-AcknowledgeError-InApp" : "Android-Payments-AcknowledgeError-InGame");
    }

    /* renamed from: y */
    public void m20439y(String str, int i10, boolean z10) {
        String str2;
        if (i10 != 12) {
            switch (i10) {
                case -3:
                    str2 = "ServiceTimeout";
                    break;
                case ListPopupWindow.WRAP_CONTENT /* -2 */:
                    str2 = "FeatureNotSupported";
                    break;
                case -1:
                    str2 = "ServiceDisconnected";
                    break;
                case 0:
                    str2 = "Ok";
                    break;
                case 1:
                    str2 = "UserCancelled";
                    break;
                case 2:
                    str2 = "ServiceUnavailable";
                    break;
                case 3:
                    str2 = "BillingUnavailable";
                    break;
                case 4:
                    str2 = "ItemUnavailable";
                    break;
                case 5:
                    str2 = "DeveloperError";
                    break;
                case 6:
                    str2 = "Error";
                    break;
                case 7:
                    str2 = "ItemAlreadyOwned";
                    break;
                case 8:
                    str2 = "ItemNotOwned";
                    break;
                default:
                    str2 = "UnknownBillingResponseCode";
                    break;
            }
        } else {
            str2 = "NetworkError";
        }
        String[] strArr = new String[4];
        strArr[0] = "Android-Payments";
        strArr[1] = str;
        strArr[2] = str2;
        strArr[3] = z10 ? "InApp" : "InGame";
        m20388A(C1157q.m6754d("-", strArr));
    }

    /* renamed from: z */
    public void m20440z(boolean z10) {
        m20388A(z10 ? "Android-Payments-ConsumeError-InApp" : "Android-Payments-ConsumeError-InGame");
    }

    private C5563e() {
        this(Math.random() * 100.0d < ((double) C1134c.m6537a().mo6541B()), new C1159s());
    }
}
