package p288w8;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.system.OsConstants;
import ba.C1086g;
import ca.C1162c;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2749c1;
import com.roblox.client.C2822f0;
import com.roblox.client.C2827g;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.client.game.C2831b;
import com.roblox.client.game.C2833d;
import com.roblox.engine.jni.NativeAppBridgeInterface;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import com.roblox.engine.jni.model.ApplicationExitInfoCpp;
import com.roblox.universalapp.cookie.CookieProtocol;
import ga.C3321b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import la.C3905c;
import ma.C3969a;
import org.json.JSONException;
import org.json.JSONObject;
import p011aa.C0064c;
import p011aa.C0067f;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1143c;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1156p;
import p064ea.C3104d;
import p076f9.C3213g;
import p077fa.C3214a;
import p117ia.C3548a;
import p131ja.C3678e;
import p176n6.C4068b;
import p176n6.C4070d;
import p188o6.C4143a;
import p191o9.C4161i;
import p192oa.C4163a;
import p239s7.C4531b;
import p300x7.C5560b;
import p300x7.C5561c;
import p300x7.C5563e;
import p300x7.C5565g;
import p313y7.C5901c;
import p315y9.C5924i;
import p328z9.C6026c;

/* renamed from: w8.k */
/* loaded from: classes.dex */
public class C5476k {

    /* renamed from: j */
    private static boolean f20414j;

    /* renamed from: k */
    private static C5476k f20415k;

    /* renamed from: e */
    private WeakReference<InterfaceC5477l> f20420e;

    /* renamed from: f */
    private final Context f20421f;

    /* renamed from: g */
    private final C5563e f20422g;

    /* renamed from: a */
    private final String f20416a = "InitHelper";

    /* renamed from: b */
    private final AtomicBoolean f20417b = new AtomicBoolean(false);

    /* renamed from: c */
    private f f20418c = f.INIT_STATE_NONE;

    /* renamed from: d */
    private EnumC5480o f20419d = EnumC5480o.SYSTEM;

    /* renamed from: h */
    private final Set<InterfaceC5473h> f20423h = new HashSet();

    /* renamed from: i */
    private OnAppBridgeNotificationListener f20424i = new c();

    /* renamed from: w8.k$a */
    /* loaded from: classes.dex */
    public class a implements C2831b.h {
        a() {
        }

        @Override // com.roblox.client.game.C2831b.h
        /* renamed from: a */
        public void mo12601a(int i10) {
            C3969a.m16695e().m16697b("load_setting_end");
            C4068b.m16892c().m16894d(C5476k.this.f20421f);
            if (i10 == 0) {
                C1151k.m6712f("InitHelper", "getAllAppSettings: ... Settings loaded.");
                C5476k.this.f20418c = f.INIT_STATE_SETTINGS_LOADED_OK;
                C5476k.this.m20158x();
                if (C1134c.m6537a().mo6625l0() && C0067f.m293h().m295d()) {
                    C0067f.m293h().m296g(C5476k.this.f20421f);
                }
                C3905c.m16561r().m16567o();
                C5476k.this.m20173z();
                if (NativeSettingsInterface.nativeGetFFlag("SaveMicroProfileScreenshotsInExternalStorage") && Environment.getExternalStorageState().equals("mounted")) {
                    NativeSettingsInterface.nativeSetExternalDirectory(C5476k.this.f20421f.getExternalFilesDir(null).getAbsolutePath());
                }
                if (C1134c.m6537a().mo6588Y0()) {
                    NativeSettingsInterface.nativeSetPreferencesFile(C1156p.m6745e(C5476k.this.f20421f).m6749g());
                }
                C5476k.this.m20130F();
                return;
            }
            C5476k.this.m20129E();
        }
    }

    /* renamed from: w8.k$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f20426n;

        /* renamed from: o */
        final /* synthetic */ String f20427o;

        b(String str, String str2) {
            this.f20426n = str;
            this.f20427o = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1151k.m6712f("InitHelper", "handleAppBridgeNotification: type = " + this.f20426n + ", data = " + this.f20427o + ".");
            C2749c1.d dVar = new C2749c1.d();
            try {
                JSONObject jSONObject = new JSONObject(this.f20427o);
                if (jSONObject.getInt("result") != 0) {
                    C5476k.this.f20422g.m20388A("Android-AppLogin-BrowserTracker-JsonFailed");
                    C5476k.this.m20131G("AppBridgeNotification: JSON Result failure");
                    return;
                }
                jSONObject.getLong("btid");
                int i10 = jSONObject.getInt("upgradeStatus");
                if (i10 == 1) {
                    dVar.m12254d();
                } else if (i10 != 2) {
                    dVar.m12256f();
                } else {
                    dVar.m12255e();
                }
                dVar.f10782b = jSONObject.optString("upgradeSource", BuildConfig.FLAVOR);
                dVar.f10783c = jSONObject.optString("MD5Sum", BuildConfig.FLAVOR);
                C5476k.this.f20422g.m20388A("Android-AppLogin-BrowserTracker-Success");
                C5476k.this.m20136V();
                if (dVar.m12252b() || dVar.m12253c()) {
                    C2749c1.m12245e().m12249g(dVar);
                }
                C1151k.m6712f("InitHelper", "doAfterFetchBrowserTrackerId:...");
                C2822f0.m12480b("appLaunch");
                if (C1134c.m6537a().mo6659x0()) {
                    return;
                }
                C5476k.this.m20152p();
            } catch (JSONException unused) {
                C5476k.this.f20422g.m20388A("Android-AppLogin-BrowserTracker-JsonFailed");
                C5476k.this.m20131G("AppBridgeNotification: JSON Result failure");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w8.k$c */
    /* loaded from: classes.dex */
    public class c extends OnAppBridgeNotificationListener {
        c() {
        }

        @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
        /* renamed from: a */
        public void mo12606a(String str, String str2) {
            C5476k.this.m20157v(str, str2);
        }
    }

    /* renamed from: w8.k$d */
    /* loaded from: classes.dex */
    public class d implements C5565g.f {
        d() {
        }

        @Override // p300x7.C5565g.f
        /* renamed from: a */
        public void mo20174a() {
            C1151k.m6712f("InitHelper", "onDidLoginEventFromLua: ... onPostLoginCompleted.");
            C4070d.m16926b().m16932h();
            C4070d.m16926b().m16928d();
            C5476k.this.m20156u().mo12153S();
            C5476k.this.m20151o();
        }
    }

    /* renamed from: w8.k$e */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a */
        static final /* synthetic */ int[] f20431a;

        static {
            int[] iArr = new int[EnumC5480o.values().length];
            f20431a = iArr;
            try {
                iArr[EnumC5480o.AFTER_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20431a[EnumC5480o.AFTER_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20431a[EnumC5480o.AFTER_LOGIN_FOR_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20431a[EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20431a[EnumC5480o.REMINDER_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20431a[EnumC5480o.PROTOCOL_LAUNCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20431a[EnumC5480o.SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: w8.k$f */
    /* loaded from: classes.dex */
    public enum f {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SETTINGS_LOADED_OK,
        INIT_STATE_DONE_OK,
        INIT_STATE_NO_USER_ID,
        INIT_STATE_UNAUTHORIZED,
        INIT_STATE_FAILED_APP_SETTINGS
    }

    /* renamed from: w8.k$g */
    /* loaded from: classes.dex */
    public static class g implements InterfaceC5477l {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // p288w8.InterfaceC5477l
        /* renamed from: B */
        public void mo12145B() {
        }

        @Override // p288w8.InterfaceC5477l
        /* renamed from: G */
        public void mo12148G() {
        }

        @Override // p288w8.InterfaceC5477l
        /* renamed from: H */
        public void mo12149H() {
        }

        @Override // p288w8.InterfaceC5477l
        /* renamed from: S */
        public void mo12153S() {
        }

        @Override // p288w8.InterfaceC5477l
        /* renamed from: h */
        public void mo12159h() {
        }
    }

    C5476k(Context context, C5563e c5563e) {
        C1151k.m6712f("InitHelper", "InitHelper created.");
        this.f20421f = context.getApplicationContext();
        this.f20422g = c5563e;
        C4070d.m16926b().m16930f();
    }

    /* renamed from: A */
    public static boolean m20126A() {
        return f20414j;
    }

    /* renamed from: E */
    public void m20129E() {
        C1151k.m6712f("InitHelper", "AppSettings FAILURE");
        this.f20418c = f.INIT_STATE_FAILED_APP_SETTINGS;
        C4070d.m16926b().m16929e(false);
        if (C1134c.m6537a().mo6633o()) {
            C3969a.m16695e().m16697b("init_failure");
        }
        m20156u().mo12149H();
        if (C1134c.m6537a().mo6612h()) {
            synchronized (this) {
                Iterator it = new HashSet(this.f20423h).iterator();
                while (it.hasNext()) {
                    ((InterfaceC5473h) it.next()).mo16009b();
                }
            }
        }
    }

    /* renamed from: F */
    public void m20130F() {
        C1151k.m6712f("InitHelper", "AppSettings loaded.");
        C5469d.m20115s();
        if (C1134c.m6537a().mo6612h()) {
            synchronized (this) {
                Iterator it = new HashSet(this.f20423h).iterator();
                while (it.hasNext()) {
                    ((InterfaceC5473h) it.next()).mo16008a();
                }
            }
        }
        C4143a.m17168e().m17178j(C1134c.m6537a().mo6656w(), C1134c.m6537a().mo6630n(), C1134c.m6537a().mo6654v0(), C1134c.m6537a().mo6570P0(), TimeUnit.MINUTES.toMillis(C1134c.m6537a().mo6596b1()), C1134c.m6537a().mo6583W());
        m20156u().mo12145B();
    }

    /* renamed from: G */
    public void m20131G(String str) {
        if (this.f20417b.compareAndSet(true, false)) {
            C1151k.m6712f("InitHelper", "Init FAILURE: (" + str + ")");
            C4070d.m16926b().m16929e(false);
            C3969a.m16695e().m16697b("init_failure");
            m20156u().mo12149H();
        }
    }

    /* renamed from: H */
    public static void m20132H(Activity activity, String str) {
        m20155t(activity).m20161I(str);
        if (C1134c.m6537a().mo6632n1()) {
            C5560b.m20357e().m20363g();
            activity.getWindow().clearFlags(8192);
        }
        C3214a.m14292a().m14293b(new C3214a.b() { // from class: w8.j

            /* renamed from: a */
            public final /* synthetic */ Activity f20413a;

            public /* synthetic */ C5475j(Activity activity2) {
                r1 = activity2;
            }

            @Override // p077fa.C3214a.b
            /* renamed from: a */
            public final void mo12242a(JSONObject jSONObject) {
                C2827g.m12519b(jSONObject, r1);
            }
        });
        if (C1134c.m6537a().mo6558J0()) {
            NativeGLInterface.screenTimeStartByGuac();
        }
    }

    /* renamed from: L */
    static String m20133L(String str, String str2) {
        String substring;
        int indexOf;
        if (!str2.equals("reason") && !str2.equals("subreason")) {
            return "INVALID USE OF FUNCTION";
        }
        int indexOf2 = str.indexOf(str2 + "=");
        if (indexOf2 == -1 || (indexOf = (substring = str.substring(indexOf2)).indexOf(") ")) == -1) {
            return "APPLICATION EXIT INFO FORMAT CHANGED";
        }
        String substring2 = substring.substring(0, indexOf);
        return substring2.indexOf(40) != -1 ? substring2.substring(substring2.indexOf(40) + 1) : "APPLICATION EXIT INFO FORMAT CHANGED";
    }

    /* renamed from: N */
    private void m20134N() {
        NativeSettingsInterface.nativeSetDeviceInfo(C2833d.m12610c(this.f20421f));
    }

    /* renamed from: R */
    private void m20135R() {
        C3969a.m16695e().m16697b("start_app_bridge_begin");
        C1151k.m6712f("InitHelper", "startAppBridge:...");
        m20134N();
        NativeGLJavaInterface.setAppBridgeNotificationListener(this.f20424i);
        NativeAppBridgeInterface.nativeAppBridgeAppStart(C2877p0.m12926i(), C2877p0.m12903Z0(), C2877p0.m12939o0(), C2877p0.f11445p, C2877p0.m12858D());
        C3969a.m16695e().m16697b("start_app_bridge_end");
    }

    /* renamed from: V */
    public void m20136V() {
        String nativeGetCookiesForDomain;
        if (C1134c.m6537a().mo6542B0()) {
            nativeGetCookiesForDomain = NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(C2877p0.m12926i());
            C1151k.m6707a("InitHelper", "updateCookiesFromEngine: nativeGetCookiesInNetscapeFormat Got Cookies = " + nativeGetCookiesForDomain);
        } else {
            nativeGetCookiesForDomain = NativeSettingsInterface.nativeGetCookiesForDomain(C2877p0.m12862F());
            C1151k.m6707a("InitHelper", "updateCookiesFromEngine: nativeGetCookiesForDomain Got Cookies = " + nativeGetCookiesForDomain);
        }
        for (String str : nativeGetCookiesForDomain.split(";")) {
            String trim = str.trim();
            String[] split = trim.split("\t");
            if (split.length != 7 && split.length != 6) {
                C1151k.m6709c("InitHelper", "updateCookiesFromEngine: Invalid cookie format: [" + trim + "]");
            } else if (split[0].endsWith(C2877p0.m12872K())) {
                String str2 = split[5] + "=" + (split.length == 7 ? split[6] : BuildConfig.FLAVOR) + "; Domain=" + C2877p0.m12872K();
                C4161i.m17249e().mo15047h(C2877p0.m12872K(), str2);
                C1151k.m6707a("InitHelper", "updateCookiesFromEngine: Set Cookies : " + str2);
            }
        }
    }

    /* renamed from: o */
    public void m20151o() {
        C1151k.m6712f("InitHelper", "After post login. StartedFor: " + this.f20419d);
        if (C1134c.m6537a().mo6659x0() && !C1079c.m6380c().m6392m()) {
            C1143c.m6680g().m6684f(this.f20421f, C5474i.f20412a);
        }
        switch (e.f20431a[this.f20419d.ordinal()]) {
            case 1:
                m20154s().mo17711g(this.f20421f);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m20154s().mo17708d(this.f20421f);
                return;
            default:
                return;
        }
    }

    /* renamed from: p */
    public void m20152p() {
        C1143c.m6680g().m6683e(this.f20421f);
    }

    /* renamed from: q */
    private void m20153q() {
        C1151k.m6712f("InitHelper", "getAllAppSettings:...");
        C3969a.m16695e().m16697b("load_setting_begin");
        C2831b.m12572i().m12592o(this.f20421f, new a());
    }

    /* renamed from: s */
    private C5561c m20154s() {
        return C2872n.m12830h().m12834d();
    }

    /* renamed from: t */
    public static C5476k m20155t(Context context) {
        if (f20415k == null) {
            synchronized (C5476k.class) {
                if (f20415k == null) {
                    f20415k = new C5476k(context, C5563e.m20379h());
                }
            }
        }
        return f20415k;
    }

    /* renamed from: u */
    public InterfaceC5477l m20156u() {
        WeakReference<InterfaceC5477l> weakReference = this.f20420e;
        if (weakReference == null || weakReference.get() == null) {
            this.f20420e = new WeakReference<>(new g(null));
        }
        return this.f20420e.get();
    }

    /* renamed from: v */
    public void m20157v(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new b(str, str2));
    }

    /* renamed from: x */
    public void m20158x() {
        if (NativeSettingsInterface.nativeGetFFlag("CookieProtocolEnabled")) {
            CookieProtocol.m13354a();
        }
        C1162c.m6763j().m6766i(this.f20421f);
        if (C1134c.m6537a().mo6637p0() || C1134c.m6537a().mo6549F()) {
            C3678e.m15631w().m15639t(this.f20421f);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidNativeUtilProtocol")) {
            C5924i.m21048O().m21082L(this.f20421f);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidSMSProtocol")) {
            C6026c.m21346i().m21349h(this.f20421f);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidLinkingProtocolSwitchToSettingsApp2")) {
            C3905c.m16561r().m16568p(this.f20421f);
        }
        C3548a.m15354f().m15359h(this.f20421f);
        C1086g.m6420y();
        C4163a.m17255c();
        C3321b.m14606i().m14608g();
        if (C1134c.m6537a().mo6591a() && C1152l.m6734e()) {
            C0064c.m287e();
        }
        if (C1152l.m6734e()) {
            C3104d.m13639u();
        }
    }

    /* renamed from: y */
    public static void m20159y(boolean z10) {
        f20414j = z10;
    }

    /* renamed from: D */
    public void m20160D(Context context, boolean z10, C5901c.b bVar) {
        C1151k.m6712f("InitHelper", "logout: callServer = " + z10 + ", initState = " + this.f20418c);
        this.f20418c = f.INIT_STATE_NO_USER_ID;
        C5565g.m20445e().m20455c(context, z10, bVar);
    }

    /* renamed from: I */
    public void m20161I(String str) {
        C1151k.m6712f("InitHelper", "onDidLoginEventFromLua: initState = " + this.f20418c + ", data = " + str);
        this.f20418c = f.INIT_STATE_DONE_OK;
        m20136V();
        C4070d.m16926b().m16933i(true);
        C5565g.m20445e().m20460j(this.f20421f, str, new d());
    }

    /* renamed from: J */
    public void m20162J(String str) {
        C1151k.m6712f("InitHelper", "onDidSignUpEventFromLua: initState = " + this.f20418c + ", data = " + str);
        m20165O(EnumC5480o.AFTER_SIGN_UP);
    }

    /* renamed from: K */
    public void m20163K() {
        C1151k.m6712f("InitHelper", "onLoginRequestFromLua: initState = " + this.f20418c);
        this.f20418c = f.INIT_STATE_UNAUTHORIZED;
        C4070d.m16926b().m16933i(false);
        m20156u().mo12159h();
    }

    /* renamed from: M */
    public synchronized void m20164M(InterfaceC5473h interfaceC5473h) {
        this.f20423h.add(interfaceC5473h);
    }

    /* renamed from: O */
    public void m20165O(EnumC5480o enumC5480o) {
        this.f20419d = enumC5480o;
    }

    /* renamed from: P */
    public void m20166P(InterfaceC5477l interfaceC5477l) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: setView = [");
        sb2.append(interfaceC5477l == null ? "null" : interfaceC5477l.getClass().getSimpleName());
        sb2.append("]");
        C1151k.m6712f("InitHelper", sb2.toString());
        this.f20420e = new WeakReference<>(interfaceC5477l);
    }

    /* renamed from: Q */
    public void m20167Q() {
        C1151k.m6712f("InitHelper", "start: initState = " + this.f20418c + ", StartedFor: " + this.f20419d);
        f fVar = this.f20418c;
        f fVar2 = f.INIT_STATE_NONE;
        if (fVar == fVar2 && !C3213g.m14270j()) {
            C3213g.m14269i().m14285s(this.f20421f);
        }
        if (this.f20418c == f.INIT_STATE_DONE_OK) {
            this.f20418c = fVar2;
        }
        f fVar3 = this.f20418c;
        if (fVar3 != fVar2 && fVar3 != f.INIT_STATE_FAILED_APP_SETTINGS) {
            f fVar4 = f.INIT_STATE_SETTINGS_LOADED_OK;
            if (fVar3 == fVar4) {
                m20130F();
                return;
            } else if (fVar3 != f.INIT_STATE_NO_USER_ID && fVar3 != f.INIT_STATE_UNAUTHORIZED) {
                C1151k.m6712f("InitHelper", "The initialization must be in progress. Do nothing.");
                return;
            } else {
                this.f20418c = fVar4;
                m20130F();
                return;
            }
        }
        this.f20418c = f.INIT_STATE_IN_PROGRESS;
        m20153q();
    }

    /* renamed from: S */
    public void m20168S() {
        C1151k.m6712f("InitHelper", "startV2: initState = " + this.f20418c + ", StartedFor: " + this.f20419d);
        if (this.f20417b.compareAndSet(false, true)) {
            m20135R();
        }
        f fVar = this.f20418c;
        f fVar2 = f.INIT_STATE_DONE_OK;
        if (fVar != fVar2 && fVar != f.INIT_STATE_UNAUTHORIZED && fVar != f.INIT_STATE_NO_USER_ID) {
            if (fVar == f.INIT_STATE_SETTINGS_LOADED_OK) {
                C1151k.m6712f("rbx.locale", " mContext: " + this.f20421f);
                C4531b.m18550f().m18562m(this.f20421f);
                C4070d.m16926b().m16929e(true);
                m20156u().mo12148G();
                C1151k.m6712f("InitHelper", "SessionCheck... New startup flow. Go directly to the Main screen.");
                this.f20418c = fVar2;
                m20156u().mo12153S();
            } else {
                C1151k.m6712f("InitHelper", "The initialization must be in progress. Do nothing.");
            }
        } else {
            C1151k.m6712f("InitHelper", "The initialization is done or unauthorized. Go to Main screen.");
            m20156u().mo12153S();
        }
        C1162c.m6763j().m6766i(this.f20421f);
        if (C1134c.m6537a().mo6637p0() || C1134c.m6537a().mo6549F()) {
            C3678e.m15631w().m15639t(this.f20421f);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidNativeUtilProtocol")) {
            C5924i.m21048O().m21082L(this.f20421f);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidSMSProtocol")) {
            C6026c.m21346i().m21349h(this.f20421f);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidLinkingProtocolSwitchToSettingsApp2")) {
            C3905c.m16561r().m16568p(this.f20421f);
        }
    }

    /* renamed from: T */
    public synchronized void m20169T(InterfaceC5473h interfaceC5473h) {
        this.f20423h.remove(interfaceC5473h);
    }

    /* renamed from: U */
    public void m20170U(InterfaceC5477l interfaceC5477l) {
        InterfaceC5477l interfaceC5477l2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: unsetView = [");
        sb2.append(interfaceC5477l == null ? "null" : interfaceC5477l.getClass().getSimpleName());
        sb2.append("]");
        C1151k.m6712f("InitHelper", sb2.toString());
        WeakReference<InterfaceC5477l> weakReference = this.f20420e;
        if (weakReference == null || (interfaceC5477l2 = weakReference.get()) == null || interfaceC5477l2 != interfaceC5477l) {
            return;
        }
        this.f20420e = null;
    }

    /* renamed from: r */
    public List<ApplicationExitInfoCpp> m20171r() {
        if (Build.VERSION.SDK_INT >= 30) {
            ActivityManager activityManager = (ActivityManager) this.f20421f.getSystemService("activity");
            if (activityManager == null) {
                return Collections.emptyList();
            }
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, C1134c.m6537a().mo6597c());
            if (!historicalProcessExitReasons.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                    int reason = applicationExitInfo.getReason();
                    int status = applicationExitInfo.getStatus();
                    String applicationExitInfo2 = applicationExitInfo.toString();
                    String m20133L = m20133L(applicationExitInfo2, "reason");
                    arrayList.add(new ApplicationExitInfoCpp(applicationExitInfo.getPid(), status, applicationExitInfo.getTimestamp(), m20133L, (m20133L.equals("APPLICATION EXIT INFO FORMAT CHANGED") || ActivityManager.isLowMemoryKillReportSupported() || reason != 2 || status != OsConstants.SIGKILL) ? m20133L(applicationExitInfo2, "subreason") : "LOW_MEMORY", applicationExitInfo.getDescription(), applicationExitInfo.getPss(), applicationExitInfo.getRss(), applicationExitInfo.getImportance()));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: w */
    public boolean m20172w() {
        return this.f20418c != f.INIT_STATE_NONE;
    }

    /* renamed from: z */
    public void m20173z() {
        m20154s().mo17705a(this.f20421f);
    }
}
