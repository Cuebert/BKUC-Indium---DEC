package com.roblox.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.BuildConfig;
import com.google.common.util.concurrent.C2566n;
import com.roblox.client.C2836i;
import com.roblox.client.analytics.CrashpadHandler;
import com.roblox.client.components.EnumC2814o;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.model.NativeInitCrashpadParams;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ma.C3969a;
import org.json.JSONArray;
import org.json.JSONException;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1143c;
import p035c9.C1144d;
import p035c9.C1145e;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1156p;
import p035c9.C1157q;
import p179n9.C4083g;
import p191o9.C4161i;
import p262u6.C4867c;
import p300x7.C5565g;

/* renamed from: com.roblox.client.p0 */
/* loaded from: classes.dex */
public class C2877p0 {

    /* renamed from: a */
    private static C1144d f11430a = null;

    /* renamed from: b */
    private static String f11431b = "";

    /* renamed from: c */
    private static boolean f11432c;

    /* renamed from: d */
    private static String f11433d;

    /* renamed from: e */
    private static boolean f11434e;

    /* renamed from: f */
    private static String f11435f;

    /* renamed from: g */
    private static boolean f11436g;

    /* renamed from: h */
    private static boolean f11437h;

    /* renamed from: i */
    private static String f11438i;

    /* renamed from: j */
    private static String f11439j;

    /* renamed from: k */
    private static String f11440k;

    /* renamed from: l */
    private static boolean f11441l;

    /* renamed from: m */
    static Pattern f11442m;

    /* renamed from: n */
    private static boolean f11443n;

    /* renamed from: o */
    public static SharedPreferences f11444o;

    /* renamed from: p */
    public static String f11445p;

    /* renamed from: q */
    public static int f11446q;

    /* renamed from: r */
    static boolean f11447r;

    /* renamed from: com.roblox.client.p0$a */
    /* loaded from: classes.dex */
    public class a implements C2836i.c {

        /* renamed from: a */
        final /* synthetic */ ApplicationInfo f11448a;

        a(ApplicationInfo applicationInfo) {
            this.f11448a = applicationInfo;
        }

        @Override // com.roblox.client.C2836i.c
        /* renamed from: a */
        public void mo12637a(String str, EnumC2838j enumC2838j) {
            if (enumC2838j != null) {
                C1151k.m6707a("roblox.config", "crashpad init error " + enumC2838j);
                return;
            }
            if (NativeSettingsInterface.nativeInitCrashpad(NativeInitCrashpadParams.builder().mo13330c(C2877p0.m12921f1()).mo13331d(C2877p0.m12926i()).mo13333f(C2877p0.m12907b()).mo13338k(C1134c.m6537a().mo6581V()).mo13337j(C1134c.m6537a().mo6635o1()).mo13335h(CrashpadHandler.class.getCanonicalName()).mo13334g(Arrays.asList("ANDROID_DATA=" + System.getenv("ANDROID_DATA"), "ANDROID_ROOT=" + System.getenv("ANDROID_ROOT"), "ANDROID_STORAGE=" + System.getenv("ANDROID_STORAGE"), "LIBRARYPATH=" + str, "CLASSPATH=.:" + this.f11448a.sourceDir)).mo13336i(C2877p0.m12925h0()).mo13332e("googleProd" + C1157q.m6751a(BuildConfig.BUILD_TYPE)).m13329b())) {
                boolean unused = C2877p0.f11434e = true;
                C1151k.m6712f("roblox.config", "Crashpad monitoring is ON");
            }
        }
    }

    static {
        m12877M0("www.roblox.com");
        m12881O0(BuildConfig.FLAVOR);
        if (!f11431b.isEmpty()) {
            f11432c = true;
        }
        f11443n = false;
        f11444o = null;
        f11445p = BuildConfig.FLAVOR;
        f11446q = 0;
        f11447r = false;
    }

    /* renamed from: A */
    static String m12852A() {
        return "exception_reason.txt";
    }

    /* renamed from: A0 */
    public static String m12853A0() {
        return m12926i() + "Login/ResetPasswordRequest.aspx";
    }

    /* renamed from: B */
    public static String m12854B(String str) {
        return m12926i() + "games/?SortFilter=" + str;
    }

    /* renamed from: B0 */
    public static String m12855B0() {
        return m12926i() + "login/forgot-password-or-username";
    }

    /* renamed from: C */
    private static String m12856C(Context context) {
        SharedPreferences m12884Q = m12884Q(context);
        String string = m12884Q.getString(AppsFlyerProperties.CHANNEL, BuildConfig.FLAVOR);
        m12884Q.edit().remove(AppsFlyerProperties.CHANNEL).apply();
        return string;
    }

    /* renamed from: C0 */
    public static String m12857C0(long j10) {
        return m12926i() + "my/messages/#!/inbox?conversationId=" + j10;
    }

    /* renamed from: D */
    public static String m12858D() {
        return "AppAndroidV";
    }

    /* renamed from: D0 */
    public static String m12859D0() {
        return m12905a0("profile");
    }

    /* renamed from: E */
    public static String m12860E() {
        return f11433d;
    }

    /* renamed from: E0 */
    public static void m12861E0(String str, String str2, long j10) {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        try {
            JSONArray jSONArray = new JSONArray(m12882P().getString(str, "[]"));
            jSONArray.put(str2 + "_" + j10);
            m12882P().edit().putString(str, jSONArray.toString()).apply();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: F */
    public static String m12862F() {
        return f11430a.m6689c();
    }

    /* renamed from: F0 */
    public static String m12863F0() {
        return "https://ecsv2." + m12874L() + "mobile/pbe";
    }

    /* renamed from: G */
    public static String m12864G() {
        return f11430a.m6690d();
    }

    /* renamed from: G0 */
    public static boolean m12865G0() {
        return false;
    }

    /* renamed from: H */
    public static String m12866H() {
        return "13484676";
    }

    /* renamed from: H0 */
    public static String m12867H0() {
        return m12926i() + "upgrades/robux";
    }

    /* renamed from: I */
    public static String m12868I() {
        return "GoogleAndroidApp";
    }

    /* renamed from: I0 */
    public static String m12869I0(String str) {
        return m12926i() + "catalog?Keyword=" + str;
    }

    /* renamed from: J */
    private static String m12870J() {
        return C1152l.m6736g() ? "Android-TENCENTPlayer-Crash" : m12935m0() ? "Quest-ROBLOXPlayer-Crash" : "Android-ROBLOXPlayer-Crash";
    }

    /* renamed from: J0 */
    public static String m12871J0(String str) {
        return m12926i() + "games/?Keyword=" + str;
    }

    /* renamed from: K */
    public static String m12872K() {
        return f11430a.m6687a();
    }

    /* renamed from: K0 */
    public static String m12873K0(String str) {
        return m12926i() + "search/groups?keyword=" + str;
    }

    /* renamed from: L */
    public static String m12874L() {
        return f11430a.m6688b();
    }

    /* renamed from: L0 */
    public static String m12875L0(String str) {
        return m12926i() + "users/search?keyword=" + str;
    }

    /* renamed from: M */
    public static String m12876M(Context context) {
        return "{\"searchParams\":{\"searchType\":\"Players\"},\"url\":\"" + m12878N() + "\",\"title\":\"" + context.getString(C2748c0.f10569Q2) + "\",\"animated\":true}";
    }

    /* renamed from: M0 */
    public static void m12877M0(String str) {
        C1151k.m6712f("roblox.config", "setBaseUrl() " + f11430a + " => " + str);
        f11430a = new C1144d(str);
        f11442m = Pattern.compile(m12949t0(), 2);
    }

    /* renamed from: N */
    public static String m12878N() {
        return m12926i() + "/users/friends#!/friend-requests";
    }

    /* renamed from: N0 */
    public static void m12879N0(String str) {
        if (str != null) {
            f11433d = new C1145e().m6694d(str);
        } else {
            f11433d = null;
        }
    }

    /* renamed from: O */
    public static String m12880O() {
        return "application/json;charset=UTF-8";
    }

    /* renamed from: O0 */
    public static void m12881O0(String str) {
        if (str != null) {
            C1151k.m6712f("roblox.config", "setChannel() " + f11431b + " => " + str);
            f11431b = str.trim();
        }
    }

    /* renamed from: P */
    public static SharedPreferences m12882P() {
        return f11444o;
    }

    /* renamed from: P0 */
    public static void m12883P0(boolean z10) {
        f11443n = z10;
    }

    /* renamed from: Q */
    public static SharedPreferences m12884Q(Context context) {
        return C1156p.m6743a(context, "prefs");
    }

    /* renamed from: Q0 */
    public static String m12885Q0() {
        return m12930k() + "v2/signup";
    }

    /* renamed from: R */
    public static String m12886R(String str) {
        Matcher matcher = f11442m.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: R0 */
    public static String m12887R0() {
        return m12930k() + "v1/twostepverification/verify";
    }

    /* renamed from: S */
    public static EnumC2814o m12888S() {
        return EnumC2814o.m12459b(C1134c.m6537a().mo6650u());
    }

    /* renamed from: S0 */
    public static String m12889S0() {
        return m12930k() + "v1/twostepverification/resend";
    }

    /* renamed from: T */
    public static String m12890T() {
        return f11431b;
    }

    /* renamed from: T0 */
    public static void m12891T0(Context context) {
        f11436g = context.getResources().getBoolean(C2907u.f11687a);
        f11437h = context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
    }

    /* renamed from: U */
    public static String m12892U() {
        return "my/account#!/notifications";
    }

    /* renamed from: U0 */
    public static void m12893U0() {
        String mo15046d = C4161i.m17249e().mo15046d(m12926i());
        if (mo15046d == null) {
            mo15046d = BuildConfig.FLAVOR;
        }
        if (C1134c.m6537a().mo6542B0()) {
            NativeSettingsInterface.nativeSetMultipleCookies(m12926i(), mo15046d);
        } else {
            NativeSettingsInterface.nativeSetCookiesForDomain(m12862F(), mo15046d);
        }
    }

    /* renamed from: V */
    public static String m12894V() {
        return "my/account#!/privacy";
    }

    /* renamed from: V0 */
    public static void m12895V0() {
        NativeSettingsInterface.nativeSetHttpClientProxy(System.getProperty("http.proxyHost", BuildConfig.FLAVOR), Long.getLong("http.proxyPort", 0L).longValue());
    }

    /* renamed from: W */
    public static String m12896W(long j10) {
        return C1157q.m6753c("%sv1/users/%d", m12934m(), Long.valueOf(j10));
    }

    /* renamed from: W0 */
    public static void m12897W0() {
        NativeSettingsInterface.nativeSetExceptionReasonFilename(m12852A());
        NativeSettingsInterface.nativeSetBaseUrl(m12926i(), m12928j());
        NativeSettingsInterface.nativeSetRobloxChannel(m12890T());
        String str = f11438i;
        Objects.requireNonNull(str, "Missing cacheDirectory");
        NativeSettingsInterface.nativeSetCacheDirectory(str);
        NativeSettingsInterface.nativeSetFilesDirectory(f11439j);
        NativeSettingsInterface.nativeInitFastLog();
        NativeSettingsInterface.nativeSetRobloxVersion(m12921f1());
        C1143c.f5488d.mo2501b(RunnableC2875o0.f11427n, C2566n.m11859a());
        m12920f0();
        m12893U0();
    }

    /* renamed from: X */
    public static String m12898X(long j10) {
        return m12926i() + "users/" + j10 + "/friends#!/friend-requests";
    }

    /* renamed from: X0 */
    public static void m12899X0() {
        NativeSettingsInterface.nativeSetPlatformHeadersWithIdfa(f11445p, "googleplay", C1143c.m6679d());
    }

    /* renamed from: Y */
    public static String m12900Y(long j10) {
        return m12926i() + "users/" + j10 + "/friends#!/friends";
    }

    /* renamed from: Y0 */
    public static String m12901Y0() {
        return m12916e() + "v1/mobile-client-version?appVersion=" + m12858D() + m12921f1();
    }

    /* renamed from: Z */
    public static String m12902Z(long j10) {
        return m12926i() + "users/" + j10 + "/profile";
    }

    /* renamed from: Z0 */
    public static String m12903Z0() {
        return f11435f;
    }

    /* renamed from: a0 */
    static String m12905a0(String str) {
        long m20458g = C5565g.m20445e().m20458g();
        if (m20458g != -1) {
            return m12926i() + "users/" + m20458g + "/" + str;
        }
        return m12926i() + "users/" + str;
    }

    /* renamed from: a1 */
    public static String m12906a1() {
        return m12934m() + "v1/users/authenticated";
    }

    /* renamed from: b */
    static /* synthetic */ String m12907b() {
        return m12870J();
    }

    /* renamed from: b0 */
    public static String m12908b0() {
        return m12926i() + "home";
    }

    /* renamed from: b1 */
    public static String m12909b1(String str, String str2) {
        return C1157q.m6753c("%sv2/passwords/validate?username=%s&password=%s", m12930k(), str, str2);
    }

    /* renamed from: c0 */
    public static boolean m12911c0() {
        return f11431b.isEmpty();
    }

    /* renamed from: c1 */
    public static String m12912c1() {
        return m12936n() + "v1/google/validate";
    }

    /* renamed from: d */
    public static String m12913d(Context context) {
        StringBuilder sb2;
        int i10;
        String str = C1079c.m6380c().m6390k() + " ";
        if (C1079c.m6380c().m6392m()) {
            sb2 = new StringBuilder();
            sb2.append(str);
            i10 = C2748c0.f10544L2;
        } else {
            sb2 = new StringBuilder();
            sb2.append(str);
            i10 = C2748c0.f10539K2;
        }
        sb2.append(context.getString(i10));
        return sb2.toString();
    }

    /* renamed from: d0 */
    public static String m12914d0(Context context) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        f11438i = absolutePath;
        return absolutePath;
    }

    /* renamed from: d1 */
    public static String m12915d1(String str, String str2, String str3) {
        return C1157q.m6753c("%sv2/usernames/validate?username=%s&birthday=%s&context=%s", m12930k(), str, str2, str3);
    }

    /* renamed from: e */
    static String m12916e() {
        return "https://clientsettings." + m12874L();
    }

    /* renamed from: e0 */
    public static void m12917e0(Context context) throws IOException {
        f11446q = context.getResources().getDisplayMetrics().densityDpi;
        if (!C2817d1.m12466e()) {
            f11440k = context.getString(C2748c0.f10710p3);
        } else if (C2817d1.m12468g(context).x < 180) {
            f11440k = BuildConfig.FLAVOR;
        } else if (Build.MODEL.equals("SM\u00ad-T210R")) {
            f11440k = "SM\u00ad-T210R";
        }
        f11439j = context.getFilesDir().getAbsolutePath();
        m12914d0(context);
        f11445p = Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: e1 */
    public static String m12918e1() {
        return m12936n() + "v1/google/purchase";
    }

    /* renamed from: f */
    public static String m12919f() {
        String str;
        String m12890T = m12890T();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://clientsettingscdn.");
        sb2.append(m12874L());
        sb2.append("v2/settings/application/");
        sb2.append(m12868I());
        if (m12890T.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "/bucket/" + m12890T;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: f0 */
    private static void m12920f0() {
        if (f11434e) {
            return;
        }
        C2836i.m12630h(new a(RobloxApplication.m12215a().getApplicationInfo()));
    }

    /* renamed from: f1 */
    public static String m12921f1() {
        return "2.622.471";
    }

    /* renamed from: g */
    public static String m12922g(long j10) {
        return "catalog/" + j10 + "/itempage";
    }

    /* renamed from: g0 */
    public static void m12923g0(Context context, C4867c c4867c) {
        if (c4867c != null) {
            if (!f11432c) {
                m12881O0(c4867c.m19054f());
            }
            String m19049a = c4867c.m19049a();
            if (!TextUtils.isEmpty(m19049a)) {
                C1151k.m6712f("roblox.config", "initConfig: Set base-URL from: " + f11430a + " => " + m19049a);
                m12877M0(m19049a);
            }
        }
        m12879N0(C1156p.m6744b(context, "configure_dev_roblox", true).getString("BaseApiUrl", null));
        f11444o = m12884Q(context);
        if (C1134c.m6537a().mo6588Y0()) {
            String m12856C = m12856C(context);
            if (!f11432c && !m12856C.isEmpty()) {
                C1151k.m6712f("roblox.config", "Found channel from preferences: " + m12856C);
                m12881O0(m12856C);
            }
        }
        m12891T0(context);
        if (c4867c != null && !TextUtils.isEmpty(c4867c.m19057i())) {
            f11435f = c4867c.m19057i();
            f11441l = true;
            C1151k.m6716j("roblox.config", "Using a custom user agent: " + f11435f);
            return;
        }
        f11435f = m12938o(context);
    }

    /* renamed from: h */
    public static String m12924h() {
        return m12932l() + "v1/user/currency";
    }

    /* renamed from: h0 */
    public static boolean m12925h0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: i */
    public static String m12926i() {
        return "https://" + f11430a.m6690d();
    }

    /* renamed from: i0 */
    public static boolean m12927i0() {
        return f11437h;
    }

    /* renamed from: j */
    public static String m12928j() {
        if (f11433d == null) {
            return "https://api." + m12874L();
        }
        return "https://" + f11433d;
    }

    /* renamed from: j0 */
    public static boolean m12929j0(String str) {
        String m12886R = m12886R(str);
        return (!m12931k0(str)) & ((m12886R == null || m12886R.isEmpty()) ? false : true);
    }

    /* renamed from: k */
    public static String m12930k() {
        return "https://auth." + m12874L();
    }

    /* renamed from: k0 */
    public static boolean m12931k0(String str) {
        return str.contains("Login/FulfillConstraint.aspx") || str.toLowerCase().contains("login/maintenance");
    }

    /* renamed from: l */
    public static String m12932l() {
        return "https://economy." + m12874L();
    }

    /* renamed from: l0 */
    public static boolean m12933l0() {
        return !f11436g;
    }

    /* renamed from: m */
    public static String m12934m() {
        return "https://users." + m12874L();
    }

    /* renamed from: m0 */
    public static boolean m12935m0() {
        return false;
    }

    /* renamed from: n */
    static String m12936n() {
        return m12926i().replace("www.", "billing.");
    }

    /* renamed from: n0 */
    public static boolean m12937n0() {
        return m12888S() == EnumC2814o.ALL && C5565g.m20445e().m20459i();
    }

    /* renamed from: o */
    public static String m12938o(Context context) {
        return m12940p(context, "google");
    }

    /* renamed from: o0 */
    public static boolean m12939o0() {
        return f11436g;
    }

    /* renamed from: p */
    public static String m12940p(Context context, String str) {
        return C4083g.m16976a(context, m12921f1(), "AppleWebKit/537.36", "GlobalDist", "GooglePlayStore", "questvr".equals(str), m12933l0(), m12927i0());
    }

    /* renamed from: p0 */
    public static boolean m12941p0() {
        return f11430a.m6689c().contains(".robloxlabs.com");
    }

    /* renamed from: q */
    public static String m12942q() {
        return m12926i() + "mobile-app-upgrades/native-ios/bc";
    }

    /* renamed from: q0 */
    public static boolean m12943q0(String str, String str2, long j10) {
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        try {
            JSONArray jSONArray = new JSONArray(m12882P().getString(str, "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).equals(str2 + "_" + j10)) {
                    return true;
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return false;
    }

    /* renamed from: r */
    public static String m12944r(String str, String str2) {
        return C1157q.m6753c("%scaptcha/app/login?credentialsType=%s&credentialsValue=%s&hybrid-return-token=1", m12926i(), str, str2);
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m12945r0() {
        m12899X0();
        C3969a.m16695e().m16697b("get_advertisingid_end");
    }

    /* renamed from: s */
    public static String m12946s() {
        return C1157q.m6753c("%scaptcha/app/signup?hybrid-return-token=1", m12926i());
    }

    /* renamed from: s0 */
    public static String m12947s0() {
        StringBuilder sb2;
        String str;
        if (C1134c.m6537a().mo6584W0()) {
            sb2 = new StringBuilder();
            sb2.append(m12930k());
            str = "v2/login";
        } else {
            sb2 = new StringBuilder();
            sb2.append(m12930k());
            str = "v1/login";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: t */
    public static boolean m12948t(Context context) {
        return m12884Q(context).getBoolean("under13", true);
    }

    /* renamed from: t0 */
    static String m12949t0() {
        return "^(https?://" + Pattern.quote(m12864G()) + "(?:login|newlogin))(?!/reset-password).*";
    }

    /* renamed from: u */
    public static String m12950u() {
        return "https://en.help.roblox.com/hc/en-us/articles/212459863";
    }

    /* renamed from: u0 */
    public static String m12951u0() {
        return m12930k() + "/v2/logout";
    }

    /* renamed from: v */
    public static String m12952v() {
        if (!f11441l) {
            return "GlobalDist";
        }
        Matcher matcher = Pattern.compile("\\b[A-Za-z]+Dist\\b").matcher(f11435f);
        if (matcher.find()) {
            return matcher.group();
        }
        C1151k.m6709c("roblox.config", "Unable to find correct distributor type inside customized user agent.");
        return "GlobalDist";
    }

    /* renamed from: v0 */
    public static String m12953v0(long j10) {
        return m12928j() + "marketplace/productinfo?assetId=" + j10;
    }

    /* renamed from: w */
    public static String m12954w(String str, int i10) {
        return "&counterName=" + str + "&amount=" + i10;
    }

    /* renamed from: w0 */
    public static String m12955w0() {
        return m12926i() + "my/messages/#!/inbox";
    }

    /* renamed from: x */
    public static String m12956x() {
        return "https://ephemeralcounters.api." + m12874L() + "v1.1/Counters/Increment/?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    /* renamed from: x0 */
    public static boolean m12957x0() {
        return f11443n;
    }

    /* renamed from: y */
    public static String m12958y(String str, long j10) {
        return "&sequenceName=" + str + "&value=" + j10;
    }

    /* renamed from: y0 */
    public static String m12959y0() {
        return m12926i() + C1134c.m6537a().mo6617i1();
    }

    /* renamed from: z */
    public static String m12960z() {
        return "https://ephemeralcounters.api." + m12874L() + "v1.0/SequenceStatistics/AddToSequence?apiKey=76E5A40C-3AE1-4028-9F10-7C62520BD94F";
    }

    /* renamed from: z0 */
    public static String m12961z0() {
        return m12926i() + "login/resetpasswordrequest/success";
    }
}
