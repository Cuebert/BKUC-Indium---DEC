package p300x7;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2840k;
import com.roblox.client.C2842l;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.user.NativeUserJavaInterface;
import java.io.IOException;
import java.util.Locale;
import org.webrtc.ContextUtils;
import p033c7.C1134c;
import p035c9.C1143c;
import p035c9.C1151k;
import p035c9.C1156p;
import p035c9.C1157q;
import p076f9.C3207a;
import p076f9.C3213g;
import p101h8.C3438l;
import p179n9.C4083g;
import p188o6.C4143a;
import p202p7.C4276c;
import p227r8.C4454b;
import p239s7.C4531b;
import p239s7.C4537h;
import p288w8.C5476k;
import p288w8.C5478m;
import p299x6.C5558d;
import p313y7.C5901c;

/* renamed from: x7.b */
/* loaded from: classes.dex */
public class C5560b {

    /* renamed from: e */
    private static boolean f20613e;

    /* renamed from: f */
    private static boolean f20614f;

    /* renamed from: g */
    public static boolean f20615g;

    /* renamed from: a */
    private d f20616a;

    /* renamed from: b */
    private c f20617b;

    /* renamed from: c */
    private boolean f20618c;

    /* renamed from: d */
    private boolean f20619d;

    /* renamed from: x7.b$a */
    /* loaded from: classes.dex */
    public class a implements C5901c.b {

        /* renamed from: a */
        final /* synthetic */ Activity f20620a;

        /* renamed from: b */
        final /* synthetic */ AbstractActivityC2837i0 f20621b;

        /* renamed from: c */
        final /* synthetic */ Bundle f20622c;

        /* renamed from: x7.b$a$a */
        /* loaded from: classes.dex */
        class C6063a implements C4537h.c {
            C6063a() {
            }

            @Override // p239s7.C4537h.c
            /* renamed from: a */
            public void mo13578a(boolean z10) {
                C1151k.m6707a("rbx.AppManager", "handleLogout: ... Get-Locale API finished.");
                AbstractActivityC2837i0 abstractActivityC2837i0 = a.this.f20621b;
                if (abstractActivityC2837i0 != null && !abstractActivityC2837i0.isFinishing()) {
                    a.this.f20621b.m12651m1();
                }
                C5562d.m20371c().m20375f(2, a.this.f20622c);
                boolean unused = C5560b.f20613e = false;
            }
        }

        a(Activity activity, AbstractActivityC2837i0 abstractActivityC2837i0, Bundle bundle) {
            this.f20620a = activity;
            this.f20621b = abstractActivityC2837i0;
            this.f20622c = bundle;
        }

        @Override // p313y7.C5901c.b
        /* renamed from: a */
        public void mo20368a() {
            C1151k.m6707a("rbx.AppManager", "handleLogout: ... Logout API finished.");
            new C4537h().m18588a(this.f20620a, new C6063a());
        }
    }

    /* renamed from: x7.b$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f20625a;

        static {
            int[] iArr = new int[f.values().length];
            f20625a = iArr;
            try {
                iArr[f.LOGOUT_BY_USER_IN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20625a[f.LOGOUT_BY_USER_IN_LUA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20625a[f.LOGOUT_BY_401_ERROR_IN_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20625a[f.LOGOUT_BY_401_ERROR_IN_WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20625a[f.LOGOUT_BY_401_ERROR_IN_LUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: x7.b$c */
    /* loaded from: classes.dex */
    public enum c {
        APP_INIT_STATUS_NONE,
        APP_INIT_STATUS_STARTED,
        APP_INIT_STATUS_OK,
        APP_INIT_STATUS_ERROR
    }

    /* renamed from: x7.b$d */
    /* loaded from: classes.dex */
    public enum d {
        APP_INIT_TYPE_UNKNOWN,
        APP_INIT_TYPE_SHELL,
        APP_INIT_TYPE_GAME
    }

    /* renamed from: x7.b$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        static final C5560b f20635a = new C5560b(null);
    }

    /* renamed from: x7.b$f */
    /* loaded from: classes.dex */
    public enum f {
        LOGOUT_BY_USER_IN_NATIVE,
        LOGOUT_BY_USER_IN_LUA,
        LOGOUT_BY_401_ERROR_IN_NATIVE,
        LOGOUT_BY_401_ERROR_IN_WEB,
        LOGOUT_BY_401_ERROR_IN_LUA
    }

    /* renamed from: x7.b$g */
    /* loaded from: classes.dex */
    public static class g implements C3213g.c {

        /* renamed from: x7.b$g$a */
        /* loaded from: classes.dex */
        class a extends C3213g {
            a() {
            }

            @Override // p076f9.C3213g
            /* renamed from: e */
            protected void mo14280e(Context context, String str) {
                C2840k.m12662c(context);
                String m12952v = C2877p0.m12952v();
                NativeSettingsInterface.nativeSetDefaultAppPolicyFile(context.getDir("assets", 0).getPath() + "/content/guac/defaultConfigs/GuacDefaultPolicy-" + m12952v + ".json");
            }
        }

        @Override // p076f9.C3213g.c
        /* renamed from: a */
        public C3213g mo14288a() {
            return new a();
        }
    }

    /* synthetic */ C5560b(a aVar) {
        this();
    }

    /* renamed from: c */
    private void m20355c(f fVar) {
        int i10 = b.f20625a[fVar.ordinal()];
        if (i10 == 1) {
            C2822f0.m12490l("manual", "manual");
            return;
        }
        if (i10 == 2) {
            C2822f0.m12490l("manual", "luaapp");
            return;
        }
        if (i10 == 3) {
            C2822f0.m12490l("failedSessionCheck", "native");
            return;
        }
        if (i10 == 4) {
            C2822f0.m12490l("failedSessionCheck", "webview");
            return;
        }
        if (i10 != 5) {
            C1151k.m6716j("rbx.AppManager", "fireLogoutEvent: Unknown logoutType:" + fVar);
            return;
        }
        C2822f0.m12490l("failedSessionCheck", "luaapp");
    }

    /* renamed from: d */
    public static boolean m20356d() {
        if (!f20614f) {
            return false;
        }
        f20614f = false;
        return true;
    }

    /* renamed from: e */
    public static C5560b m20357e() {
        return e.f20635a;
    }

    /* renamed from: f */
    public static f m20358f(Bundle bundle) {
        f fVar;
        if (bundle != null && (fVar = (f) bundle.getSerializable("logout_type")) != null) {
            return fVar;
        }
        C1151k.m6709c("rbx.AppManager", "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!");
        return f.LOGOUT_BY_USER_IN_NATIVE;
    }

    /* renamed from: j */
    private void m20359j(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("channel_general", context.getString(C2748c0.f10663h4), 3);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.createNotificationChannel(notificationChannel);
            notificationManager.deleteNotificationChannel("channel_games");
            if (!C2877p0.m12935m0() && C1134c.m6537a().mo6567O()) {
                NotificationChannel notificationChannel2 = new NotificationChannel("channel_calls", context.getString(C2748c0.f10651f4), 4);
                notificationChannel2.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
                notificationChannel2.setVibrationPattern(C3438l.f14321a);
                notificationManager.createNotificationChannel(notificationChannel2);
            } else {
                notificationManager.deleteNotificationChannel("channel_calls");
            }
            NotificationChannel notificationChannel3 = new NotificationChannel("channel_urgent", context.getString(C2748c0.f10681k4), 4);
            NotificationChannel notificationChannel4 = new NotificationChannel("channel_default", context.getString(C2748c0.f10657g4), 3);
            NotificationChannel notificationChannel5 = new NotificationChannel("channel_medium", context.getString(C2748c0.f10669i4), 2);
            NotificationChannel notificationChannel6 = new NotificationChannel("channel_minimum", context.getString(C2748c0.f10675j4), 1);
            notificationManager.createNotificationChannel(notificationChannel3);
            notificationManager.createNotificationChannel(notificationChannel4);
            notificationManager.createNotificationChannel(notificationChannel5);
            notificationManager.createNotificationChannel(notificationChannel6);
        }
    }

    /* renamed from: l */
    public static boolean m20360l() {
        return f20615g;
    }

    /* renamed from: m */
    public static void m20361m() {
        f20614f = true;
    }

    /* renamed from: b */
    public void m20362b(Context context) {
        SharedPreferences m6743a = C1156p.m6743a(context, "DeviceInstallPreferences");
        boolean z10 = m6743a.getBoolean("AppFirstLaunch", true);
        this.f20618c = z10;
        if (z10) {
            C1151k.m6712f("rbx.AppManager", "First App launch!");
            C5563e.m20379h().m20431m();
            SharedPreferences.Editor edit = m6743a.edit();
            edit.putBoolean("AppFirstLaunch", false);
            edit.putLong("AppFirstLaunchTime", System.currentTimeMillis());
            edit.apply();
        }
    }

    /* renamed from: g */
    public void m20363g() {
        f20615g = true;
    }

    /* renamed from: h */
    public void m20364h(Activity activity, f fVar) {
        C1151k.m6712f("rbx.AppManager", "handleLogout: logoutType = " + fVar + ", activity = " + activity.getLocalClassName());
        f20613e = true;
        m20355c(fVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", fVar);
        if (C1134c.m6537a().mo6659x0()) {
            C1143c.m6680g().m6682c();
            C2877p0.m12899X0();
            C2872n.m12830h().m12834d().mo17706b();
        }
        if (fVar == f.LOGOUT_BY_USER_IN_NATIVE) {
            AbstractActivityC2837i0 abstractActivityC2837i0 = activity instanceof AbstractActivityC2837i0 ? (AbstractActivityC2837i0) activity : null;
            if (abstractActivityC2837i0 != null) {
                abstractActivityC2837i0.m12655v1(abstractActivityC2837i0);
            }
            C5476k.m20155t(activity).m20160D(activity, true, new a(activity, abstractActivityC2837i0, bundle));
        } else {
            C5476k.m20155t(activity).m20160D(activity, false, null);
            C5562d.m20371c().m20375f(2, bundle);
            f20613e = false;
        }
        if (C1134c.m6537a().mo6632n1()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        f20615g = false;
    }

    /* renamed from: i */
    public void m20365i(Activity activity) {
        C1151k.m6712f("rbx.AppManager", "handleSwitchAccount activity = " + activity.getLocalClassName());
        f20613e = true;
        C2822f0.m12502x();
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", f.LOGOUT_BY_USER_IN_LUA);
        if (C1134c.m6537a().mo6659x0()) {
            C1143c.m6680g().m6682c();
            C2877p0.m12899X0();
            C2872n.m12830h().m12834d().mo17706b();
        }
        C5476k.m20155t(activity).m20160D(activity, false, null);
        C5562d.m20371c().m20375f(2, bundle);
        f20613e = false;
        f20615g = false;
    }

    /* renamed from: k */
    public void m20366k(Context context, d dVar) {
        if (dVar != d.APP_INIT_TYPE_SHELL && dVar != d.APP_INIT_TYPE_GAME) {
            throw new IllegalArgumentException("Invalid AppInitType: " + dVar);
        }
        c cVar = this.f20617b;
        c cVar2 = c.APP_INIT_STATUS_NONE;
        if (cVar != cVar2) {
            return;
        }
        synchronized (C5560b.class) {
            if (this.f20617b != cVar2) {
                return;
            }
            this.f20617b = c.APP_INIT_STATUS_STARTED;
            this.f20616a = dVar;
            C1151k.m6712f("rbx.AppManager", "initialize: [" + this.f20616a + "] Start...");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1156p.m6745e(context.getApplicationContext());
            try {
                C2877p0.m12917e0(context);
                NativeSettingsInterface.nativeSetBaseUrl(C2877p0.m12926i(), C2877p0.m12928j());
                NativeSettingsInterface.nativeSetRobloxChannel(C2877p0.m12890T());
                NativeUserJavaInterface.setImplementation(new C4276c());
                C1151k.m6712f("rbx.AppManager", "ROBLOX | User-Agent = " + C2877p0.m12903Z0());
                C1151k.m6712f("rbx.AppManager", "ROBLOX | Build = googleProd" + C1157q.m6751a(BuildConfig.BUILD_TYPE) + ", ID = " + C2877p0.m12866H());
                C1151k.m6712f("rbx.AppManager", "ROBLOX | Version = 2.622.471, Code = 1606");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ROBLOX | BaseUrl = ");
                sb2.append(C2877p0.m12864G());
                C1151k.m6712f("rbx.AppManager", sb2.toString());
                C1151k.m6712f("rbx.AppManager", "ROBLOX | OS Ver. = " + Build.VERSION.RELEASE + ", Lvl = " + Build.VERSION.SDK_INT);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ROBLOX | Arch = ");
                sb3.append(C2842l.m12682g().m12685i().toString());
                C1151k.m6712f("rbx.AppManager", sb3.toString());
                C5478m.m20176b(context);
                C4083g.m16984i(C2872n.m12830h().m12842m());
                C5564f.m20441a(context, null);
                C2872n.m12830h().m12846q();
                C5565g.m20445e();
                C2842l.m12682g().m12683d(null);
                C4143a.m17168e().m17176g(context);
                C5558d.m20352b();
                C4531b.m18550f().m18566q(Locale.getDefault());
                m20359j(context);
                C3207a.m14202f(new C4454b());
                C3213g.m14274q(new g());
                C3213g.m14269i().m14283p(context.getApplicationContext());
                ContextUtils.initialize(context.getApplicationContext());
                C3213g.m14269i().m14287x(context);
                f20615g = false;
                this.f20617b = c.APP_INIT_STATUS_OK;
                C1151k.m6712f("rbx.AppManager", "initialize: Completed OK. elapsedTime(ms) = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (IOException e10) {
                C1151k.m6709c("rbx.AppManager", "*** Exception caught in initConfig: " + e10.getMessage());
                this.f20617b = c.APP_INIT_STATUS_ERROR;
                throw new RuntimeException("IOException in RobloxSettings.initConfig()");
            }
        }
    }

    /* renamed from: n */
    public void m20367n(boolean z10) {
        this.f20619d = z10;
    }

    private C5560b() {
        this.f20616a = d.APP_INIT_TYPE_UNKNOWN;
        this.f20617b = c.APP_INIT_STATUS_NONE;
        C1151k.m6712f("rbx.AppManager", "[AppManager]: Constructor called.");
    }
}
