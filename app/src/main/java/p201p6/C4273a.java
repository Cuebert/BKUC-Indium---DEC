package p201p6;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2822f0;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.C3905c;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1156p;
import p299x6.C5556b;
import p300x7.C5561c;
import p300x7.C5563e;

/* renamed from: p6.a */
/* loaded from: classes.dex */
public class C4273a extends C5561c {

    /* renamed from: b */
    private Context f17461b;

    /* renamed from: c */
    private C1156p f17462c;

    /* renamed from: d */
    private SharedPreferences f17463d;

    /* renamed from: e */
    private boolean f17464e = false;

    /* renamed from: p6.a$a */
    /* loaded from: classes.dex */
    class a implements AppsFlyerConversionListener {
        a() {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAppOpenAttribution(Map<String, String> map) {
            String str = map.get("af_dp");
            if (str != null) {
                if (NativeSettingsInterface.nativeGetFFlag("ExpandedDeeplinkLogging")) {
                    String str2 = map.get("link");
                    if (str2 != null) {
                        C3905c.m16561r().m16563f(str, str2);
                        return;
                    } else {
                        C1151k.m6709c("AppsFlyerManager", "Received null attribution URL. This should never happen.");
                        C3905c.m16561r().m16562e(str);
                        return;
                    }
                }
                C3905c.m16561r().m16562e(str);
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAttributionFailure(String str) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            String str = (String) map.get("media_source");
            C1151k.m6712f("AppsFlyerManager", "media-source: " + str);
            if ("Facebook Ads".equals(str)) {
                C1151k.m6712f("AppsFlyerManager", "isUserAcquiredFromFacebookAd set to true");
                C4273a.this.f17464e = true;
                if (C4273a.this.f17463d != null) {
                    C4273a.this.f17463d.edit().putBoolean("IsUserAcquiredFromFacebook", true).apply();
                }
            }
            if (Boolean.TRUE.equals(map.get("is_first_launch")) && map.containsKey("af_dp")) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                onAppOpenAttribution(hashMap);
            }
        }
    }

    /* renamed from: p6.a$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        static final C4273a f17466a = new C4273a();
    }

    public C4273a() {
        C1151k.m6712f("AppsFlyerManager", "[AppsFlyerManager]: Constructor called.");
    }

    /* renamed from: A */
    private static void m17686A(Context context, String str, long j10) {
        SharedPreferences.Editor edit = m17696r(context).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    /* renamed from: k */
    private void m17689k(Context context) {
        AppsFlyerLib.getInstance().anonymizeUser(true);
        m17704z(context, "enableTracking", false);
    }

    /* renamed from: l */
    private String m17690l() {
        return (C1134c.m6537a().mo6580U0() && this.f17464e) ? "fbads_" : BuildConfig.FLAVOR;
    }

    /* renamed from: m */
    private void m17691m(Context context) {
        m17704z(context, "enableTracking", true);
        m17698t(true);
    }

    /* renamed from: n */
    private void m17692n() {
        if (!C1134c.m6537a().mo6659x0() || C1079c.m6380c().m6392m()) {
            return;
        }
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
    }

    /* renamed from: o */
    private boolean m17693o(Context context, String str, boolean z10) {
        return m17696r(context).getBoolean(str, z10);
    }

    /* renamed from: p */
    public static C4273a m17694p() {
        return b.f17466a;
    }

    /* renamed from: q */
    private static long m17695q(Context context, String str, long j10) {
        return m17696r(context).getLong(str, j10);
    }

    /* renamed from: r */
    private static SharedPreferences m17696r(Context context) {
        return context.getSharedPreferences("APPS_FLYER_SHARED_PREFS", 0);
    }

    /* renamed from: s */
    private static String m17697s(long j10) {
        return "signupReportedTimeInSeconds_" + j10;
    }

    /* renamed from: t */
    private void m17698t(boolean z10) {
        if (z10) {
            AppsFlyerLib.getInstance().anonymizeUser(false);
        }
    }

    /* renamed from: u */
    private boolean m17699u() {
        return (C1079c.m6380c().m6392m() || C5556b.m20348a()) ? false : true;
    }

    /* renamed from: v */
    private void m17700v(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("productId", str));
        arrayList.add(new NameValuePair("price", str2));
        arrayList.add(new NameValuePair(AppsFlyerProperties.CURRENCY_CODE, str3));
        m17703y("purchaseReported", arrayList);
        m17702x("Android-AppsFlyer-Purchase");
    }

    /* renamed from: w */
    private void m17701w(Context context) {
        boolean m17699u = m17699u();
        C1151k.m6712f("AppsFlyerManager", "Login retention: enabled=" + m17699u);
        if (m17699u) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long convert = timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            long m6389j = C1079c.m6380c().m6389j();
            long m17695q = m17695q(context, m17697s(m6389j), 0L);
            if (m17695q > 0) {
                long convert2 = TimeUnit.DAYS.convert(convert - m17695q, timeUnit);
                if (convert2 < 1 || convert2 > 3) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m17690l());
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "af_retention_d%d", Long.valueOf(convert2)));
                String sb3 = sb2.toString();
                String format = String.format(locale, "Android-AppsFlyer-AppRetention-D%d", Long.valueOf(convert2));
                String format2 = String.format(locale, "appRetentionReportedD%d", Long.valueOf(convert2));
                String str = format2 + "_" + m6389j;
                if (m17693o(context, str, false)) {
                    return;
                }
                m17704z(context, str, true);
                C1151k.m6712f("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + C1134c.m6537a().mo6580U0() + ", isUserAcquiredFromFacebookAd: " + this.f17464e + ", eventName: " + sb3);
                AppsFlyerLib.getInstance().logEvent(this.f17461b, sb3, null);
                m17703y(format2, null);
                m17702x(format);
            }
        }
    }

    /* renamed from: x */
    private void m17702x(String str) {
        C5563e.m20379h().m20388A(str);
    }

    /* renamed from: y */
    private void m17703y(String str, List<NameValuePair> list) {
        C2822f0.m12486h(str, "appsFlyer", list);
    }

    /* renamed from: z */
    private void m17704z(Context context, String str, boolean z10) {
        SharedPreferences.Editor edit = m17696r(context).edit();
        edit.putBoolean(str, z10);
        edit.apply();
    }

    @Override // p300x7.C5561c
    /* renamed from: a */
    public void mo17705a(Context context) {
        boolean z10 = !C5556b.m20348a();
        C1151k.m6712f("AppsFlyerManager", "init: initEnabled=" + z10);
        if (z10) {
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.setMinTimeBetweenSessions(90);
            C1156p m6745e = C1156p.m6745e(context);
            this.f17462c = m6745e;
            SharedPreferences m6746c = m6745e.m6746c("AppsFlyerPreferences");
            this.f17463d = m6746c;
            if (m6746c != null) {
                this.f17464e = m6746c.getBoolean("IsUserAcquiredFromFacebook", false);
            }
            appsFlyerLib.setOneLinkCustomDomain("roblox.onelink.me", "ro.blox.com", "go.roblox.com");
            m17698t(m17693o(context, "enableTracking", true));
            a aVar = new a();
            appsFlyerLib.setCollectIMEI(false);
            appsFlyerLib.setCollectAndroidID(false);
            if (C1134c.m6537a().mo6659x0()) {
                appsFlyerLib.setDisableAdvertisingIdentifiers(true);
            }
            appsFlyerLib.init("Quwp4RGsFwE6rVnyTFm6jQ", aVar, context);
            if (!C1134c.m6537a().mo6565N() || !m17693o(context, "disableDeeplinkTracking", false)) {
                appsFlyerLib.start((Application) context, "Quwp4RGsFwE6rVnyTFm6jQ");
            }
            this.f17461b = context;
            Intent intent = this.f20643a;
            if (intent != null) {
                appsFlyerLib.performOnDeepLinking(intent, context);
            }
        }
    }

    @Override // p300x7.C5561c
    /* renamed from: b */
    public void mo17706b() {
        AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
    }

    @Override // p300x7.C5561c
    /* renamed from: c */
    public void mo17707c(Context context) {
        boolean m17699u = m17699u();
        C1151k.m6712f("AppsFlyerManager", "first play: enabled=" + m17699u);
        if (m17699u) {
            String str = "firstPlayReported_" + C1079c.m6380c().m6389j();
            if (m17693o(context, str, false)) {
                return;
            }
            m17704z(context, str, true);
            String str2 = (C1134c.m6537a().mo6580U0() && this.f17464e) ? "fbads_af_level_achieved" : AFInAppEventType.LEVEL_ACHIEVED;
            C1151k.m6712f("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + C1134c.m6537a().mo6580U0() + ", isUserAcquiredFromFacebookAd: " + this.f17464e + ", eventName: " + str2);
            AppsFlyerLib.getInstance().logEvent(this.f17461b, str2, null);
            m17703y("firstPlayReported", null);
            m17702x("Android-AppsFlyer-FirstPlay");
        }
    }

    @Override // p300x7.C5561c
    /* renamed from: d */
    public void mo17708d(Context context) {
        boolean m17699u = m17699u();
        C1151k.m6712f("AppsFlyerManager", "login: enabled=" + m17699u);
        if (m17699u) {
            m17692n();
            String str = (C1134c.m6537a().mo6580U0() && this.f17464e) ? "fbads_login" : AFInAppEventType.LOGIN;
            C1151k.m6712f("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + C1134c.m6537a().mo6580U0() + ", isUserAcquiredFromFacebookAd: " + this.f17464e + ", eventName: " + str);
            AppsFlyerLib.getInstance().logEvent(this.f17461b, str, null);
            m17703y("loginReported", null);
            m17702x("Android-AppsFlyer-Login");
            m17701w(context);
            m17691m(context);
            return;
        }
        m17689k(context);
    }

    @Override // p300x7.C5561c
    /* renamed from: e */
    public void mo17709e(Context context, long j10) {
        boolean m17699u = m17699u();
        C1151k.m6712f("AppsFlyerManager", "playtime: enabled=" + m17699u);
        if (m17699u) {
            String str = "experiencePlaytimeReported_" + C1079c.m6380c().m6389j();
            if (m17693o(context, str, false) || j10 < TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES)) {
                return;
            }
            String str2 = m17690l() + String.format(Locale.ENGLISH, "af_experience_playtime_%dmin", 15);
            C1151k.m6712f("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + C1134c.m6537a().mo6580U0() + ", isUserAcquiredFromFacebookAd: " + this.f17464e + ", eventName: " + str2);
            AppsFlyerLib.getInstance().logEvent(this.f17461b, str2, null);
            m17703y("experiencePlaytimeReported", null);
            m17702x("Android-AppsFlyer-ExperiencePlaytime");
            m17704z(context, str, true);
        }
    }

    @Override // p300x7.C5561c
    /* renamed from: f */
    public void mo17710f(String str, String str2, String str3, long j10, boolean z10) {
        boolean m17699u = m17699u();
        C1151k.m6712f("AppsFlyerManager", "Purchase. enabled=" + m17699u + ". Price: " + str2 + ".");
        if (m17699u) {
            HashMap hashMap = new HashMap();
            hashMap.put(AFInAppEventParameterName.REVENUE, Double.valueOf(j10 / 1000000.0d));
            hashMap.put(AFInAppEventParameterName.CURRENCY, str3 != null ? str3 : BuildConfig.FLAVOR);
            hashMap.put(AFInAppEventParameterName.CONTENT_ID, str);
            hashMap.put(AFInAppEventParameterName.PARAM_1, z10 ? "Amazon" : "Android");
            String str4 = (C1134c.m6537a().mo6580U0() && this.f17464e) ? "fbads_purchase" : AFInAppEventType.PURCHASE;
            C1151k.m6712f("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + C1134c.m6537a().mo6580U0() + ", isUserAcquiredFromFacebookAd: " + this.f17464e + ", eventName: " + str4);
            AppsFlyerLib.getInstance().logEvent(this.f17461b, str4, hashMap);
            m17700v(str, str2, str3);
        }
    }

    @Override // p300x7.C5561c
    /* renamed from: g */
    public void mo17711g(Context context) {
        boolean m17699u = m17699u();
        C1151k.m6712f("AppsFlyerManager", "signup: enabled=" + m17699u);
        if (m17699u) {
            m17692n();
            String str = (C1134c.m6537a().mo6580U0() && this.f17464e) ? "fbads_complete_registration" : AFInAppEventType.COMPLETE_REGISTRATION;
            C1151k.m6712f("AppsFlyerManager", "EnableAppsFlyerFacebookTracking: " + C1134c.m6537a().mo6580U0() + ", isUserAcquiredFromFacebookAd: " + this.f17464e + ", eventName: " + str);
            AppsFlyerLib.getInstance().logEvent(this.f17461b, str, null);
            m17703y("signUpReported", null);
            m17702x("Android-AppsFlyer-Registration");
            m17686A(context, m17697s(C1079c.m6380c().m6389j()), TimeUnit.SECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
            m17691m(context);
            return;
        }
        m17689k(context);
    }
}
