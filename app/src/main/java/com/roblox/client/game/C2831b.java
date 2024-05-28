package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.Surface;
import com.appsflyer.oaid.BuildConfig;
import com.google.common.util.concurrent.C2562j;
import com.google.common.util.concurrent.C2566n;
import com.google.common.util.concurrent.C2569q;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.client.RobloxApplication;
import com.roblox.client.game.C2831b;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.EngineJavaCallbackWrapper;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.autovalue.StartAppParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import la.C3905c;
import ma.C3969a;
import org.fmod.FMOD;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1157q;
import p076f9.C3213g;
import p077fa.C3214a;
import p102h9.C3447a;
import p102h9.C3448b;
import p102h9.C3449c;
import p191o9.C4159g;
import p227r8.C4453a;
import p227r8.C4455c;
import p288w8.C5469d;
import p288w8.C5476k;
import p299x6.C5556b;
import p325z6.AsyncTaskC6013a;

/* renamed from: com.roblox.client.game.b */
/* loaded from: classes.dex */
public class C2831b implements C4159g.c {

    /* renamed from: g */
    private d f11230g;

    /* renamed from: h */
    private f f11231h;

    /* renamed from: j */
    private e f11233j;

    /* renamed from: a */
    public final String f11224a = "rbx.appshell";

    /* renamed from: b */
    private boolean f11225b = false;

    /* renamed from: c */
    private boolean f11226c = false;

    /* renamed from: d */
    private boolean f11227d = false;

    /* renamed from: e */
    private boolean f11228e = false;

    /* renamed from: f */
    private boolean f11229f = false;

    /* renamed from: i */
    private Vector<C3448b> f11232i = new Vector<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.game.b$a */
    /* loaded from: classes.dex */
    public class a implements h {

        /* renamed from: a */
        final /* synthetic */ h f11234a;

        a(h hVar) {
            this.f11234a = hVar;
        }

        @Override // com.roblox.client.game.C2831b.h
        /* renamed from: a */
        public void mo12601a(int i10) {
            C3969a.m16695e().m16697b("update_setting_to_app_bridge_end");
            if (i10 == 0) {
                C4455c.m18285d();
                this.f11234a.mo12601a(0);
            } else {
                this.f11234a.mo12601a(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.game.b$b */
    /* loaded from: classes.dex */
    public class b implements h {

        /* renamed from: a */
        final /* synthetic */ h f11236a;

        b(h hVar) {
            this.f11236a = hVar;
        }

        @Override // com.roblox.client.game.C2831b.h
        /* renamed from: a */
        public void mo12601a(int i10) {
            if (i10 == 0) {
                C2831b.this.f11226c = true;
            }
            h hVar = this.f11236a;
            if (hVar != null) {
                hVar.mo12601a(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.game.b$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: n */
        final /* synthetic */ d f11238n;

        c(d dVar) {
            this.f11238n = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f11238n.f11240a);
        }
    }

    /* renamed from: com.roblox.client.game.b$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        Activity f11240a;

        /* renamed from: b */
        PlatformParams f11241b;

        /* renamed from: c */
        DeviceParams f11242c;

        /* renamed from: d */
        String f11243d;

        /* renamed from: e */
        String f11244e;

        /* renamed from: f */
        long f11245f;

        /* renamed from: g */
        boolean f11246g;

        /* renamed from: h */
        String f11247h;

        /* renamed from: i */
        int f11248i;

        /* renamed from: j */
        String f11249j;
    }

    /* renamed from: com.roblox.client.game.b$e */
    /* loaded from: classes.dex */
    public class e extends EngineJavaCallbackWrapper {
        public e(EngineJavaCallback2 engineJavaCallback2) {
            super(engineJavaCallback2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: f */
        public void mo12559f(String str, String str2) {
            if (str.equals("APP_READY")) {
                C2831b.this.m12594q(str2);
            }
            super.mo12559f(str, str2);
        }
    }

    /* renamed from: com.roblox.client.game.b$f */
    /* loaded from: classes.dex */
    public static class f extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private h f11251a;

        /* renamed from: b */
        public final String f11252b = "rbx.appshell";

        public f(h hVar) {
            this.f11251a = hVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            String m20110n = C5469d.m20110n();
            if (m20110n != null && !m20110n.isEmpty()) {
                String str = null;
                if (C5556b.m20348a()) {
                    str = new C4453a(RobloxApplication.m12215a()).m18279e();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("overridePayload = ");
                    sb2.append(str);
                    C1151k.m6707a("rbx.appshell", sb2.toString() != null ? str : "no overrides");
                }
                return Integer.valueOf(NativeGLInterface.nativeInitClientSettings(m20110n, str, C2877p0.m12868I()));
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                NativeGLInterface.nativePostClientSettingsLoadedInitialization3(C5476k.m20155t(RobloxApplication.m12215a()).m20171r());
                C1151k.m6712f("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f11251a;
            if (hVar != null) {
                hVar.mo12601a(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.game.b$g */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a */
        static final C2831b f11253a = new C2831b();
    }

    /* renamed from: com.roblox.client.game.b$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        void mo12601a(int i10);
    }

    /* renamed from: f */
    private void m12570f() {
        if (this.f11227d) {
            C1151k.m6712f("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        m12597v();
    }

    /* renamed from: g */
    private void m12571g() {
        e eVar = this.f11233j;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    /* renamed from: i */
    public static C2831b m12572i() {
        return g.f11253a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m12573m(C2569q c2569q, int i10) {
        C3969a.m16695e().m16697b("asset_unpack_end");
        c2569q.mo11801B("asset finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ String m12574n(Context context, h hVar) throws Exception {
        m12575s(context, hVar, true);
        return "load setting finish";
    }

    /* renamed from: s */
    private void m12575s(Context context, h hVar, boolean z10) {
        if (z10) {
            m12582E(context);
            C3969a.m16695e().m16697b("update_setting_to_app_bridge_start");
            m12593p(new a(hVar));
            return;
        }
        hVar.mo12601a(1);
    }

    /* renamed from: u */
    private void m12576u(Vector<C3448b> vector) {
        while (!vector.isEmpty()) {
            C3448b remove = vector.remove(0);
            C1151k.m6707a("rbx.appshell", "publishPendingReadyEvents() " + remove.f14340a + ", " + remove.f14341b + ", " + remove.f14342c + ", " + remove.f14339d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(remove.f14340a, remove.f14341b, remove.f14342c, remove.f14339d);
        }
    }

    /* renamed from: w */
    private void m12577w() {
        f fVar = this.f11231h;
        if (fVar != null && !fVar.isCancelled()) {
            C1151k.m6712f("rbx.appshell", "ASMA.resetTask: Cancel the current (running) task...");
            fVar.cancel(true);
        }
        this.f11231h = null;
    }

    /* renamed from: A */
    public void m12578A(C3449c c3449c) {
        if (!this.f11225b) {
            C1151k.m6716j("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        } else {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(c3449c.f14340a, c3449c.f14341b, c3449c.f14342c);
        }
    }

    /* renamed from: B */
    public void m12579B(boolean z10) {
        m12578A(new C3447a(z10));
    }

    /* renamed from: C */
    public void m12580C(C3448b c3448b) {
        if (c3448b == null) {
            return;
        }
        this.f11232i.add(c3448b);
        if (m12590k()) {
            m12576u(this.f11232i);
        }
    }

    /* renamed from: D */
    public void m12581D(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f11233j = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    /* renamed from: E */
    public void m12582E(Context context) {
        C1151k.m6707a("rbx.appshell", "ASMA.setup() " + this.f11225b);
        if (!this.f11225b) {
            this.f11225b = true;
            C2877p0.m12897W0();
            FMOD.init(context);
            NativeGLInterface.nativeGameGlobalInit();
            C2877p0.m12895V0();
            if (C1134c.m6537a().mo6588Y0()) {
                NativeGLInterface.nativeUpdateAdapterInit();
                return;
            }
            return;
        }
        C2877p0.m12893U0();
    }

    /* renamed from: F */
    public void m12583F(Surface surface) {
        if (this.f11227d) {
            this.f11229f = true;
            m12600z();
            d m12588h = m12588h();
            StartAppParams.Builder mo13297h = StartAppParams.builder().mo13298i(surface).mo13296g(m12588h.f11241b).mo13291b(m12588h.f11243d).mo13292c(m12588h.f11244e).mo13293d(m12588h.f11245f).mo13294e(m12588h.f11246g).mo13299j(m12588h.f11247h).mo13295f(m12588h.f11248i).mo13297h(m12588h.f11249j);
            if (C2877p0.m12865G0()) {
                mo13297h.mo13300k(m12588h.f11240a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(mo13297h.mo13290a());
            if (C2877p0.m12865G0()) {
                Executors.newSingleThreadExecutor().execute(new c(m12588h));
            }
        }
    }

    /* renamed from: G */
    public void m12584G() {
        C1151k.m6707a("rbx.appshell", "ASMA.stop");
        if (this.f11227d && this.f11229f) {
            this.f11229f = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (C2872n.m12830h().m12836f().m13868i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.stop");
        }
    }

    /* renamed from: H */
    public void m12585H(Surface surface, float f10) {
        C1151k.m6707a("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f11227d) {
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceApp(surface, f10);
        }
    }

    @Override // p191o9.C4159g.c
    /* renamed from: a */
    public void mo12586a() {
        C1151k.m6712f("rbx.appshell", "onCookieChanged.");
        C2877p0.m12893U0();
    }

    /* renamed from: e */
    public void m12587e() {
        synchronized (this) {
            m12570f();
        }
    }

    /* renamed from: h */
    public d m12588h() {
        return this.f11230g;
    }

    /* renamed from: j */
    public void m12589j(d dVar) {
        C1151k.m6712f("rbx.appshell", "ASMA.initializeDataModel: mHasSettings:" + this.f11226c + ", mIsInitialized:" + this.f11227d);
        if (!this.f11226c || this.f11227d) {
            return;
        }
        m12571g();
        C1151k.m6707a("rbx.appshell", "ASMA.initializeDataModel()");
        this.f11230g = dVar;
        this.f11227d = true;
        String m12926i = C2877p0.m12926i();
        InitParams.Builder mo13286e = InitParams.builder().mo13288g(dVar.f11241b).mo13285d(dVar.f11242c).mo13283b(m12926i).mo13289h(C2877p0.m12903Z0()).mo13286e(C2877p0.m12939o0());
        if (C1134c.m6537a().mo6571Q()) {
            mo13286e.mo13284c("googleProd" + C1157q.m6751a(BuildConfig.BUILD_TYPE));
        }
        mo13286e.mo13287f(C2877p0.m12935m0());
        NativeGLInterface.nativeAppBridgeV2InitWithParams(mo13286e.mo13282a());
    }

    /* renamed from: k */
    public boolean m12590k() {
        return this.f11228e;
    }

    /* renamed from: l */
    public boolean m12591l() {
        return this.f11227d;
    }

    /* renamed from: o */
    public void m12592o(final Context context, final h hVar) {
        C1151k.m6712f("rbx.appshell", "ASMA.loadAllAppSettings()");
        final C2569q m11863E = C2569q.m11863E();
        if (!C3213g.m14270j()) {
            AsyncTaskC6013a.m21329b(new AsyncTaskC6013a.a() { // from class: f7.b
                @Override // p325z6.AsyncTaskC6013a.a
                /* renamed from: a */
                public final void mo12478a(int i10) {
                    C2831b.m12573m(C2569q.this, i10);
                }
            }).mo12448a();
        } else {
            m11863E.mo11801B("asset finish");
            C3969a.m16695e().m16697b("asset_unpack_end");
        }
        C2562j.m11853b(C5469d.m20101e(context), m11863E).m11854a(new Callable() { // from class: f7.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m12574n;
                m12574n = C2831b.this.m12574n(context, hVar);
                return m12574n;
            }
        }, C2566n.m11859a());
    }

    /* renamed from: p */
    public void m12593p(h hVar) {
        C1151k.m6707a("rbx.appshell", "ASMA.loadSettings() " + this.f11226c);
        if (this.f11226c) {
            C1151k.m6707a("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.mo12601a(0);
                return;
            }
            return;
        }
        m12577w();
        f fVar = new f(new b(hVar));
        this.f11231h = fVar;
        fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: q */
    public void m12594q(String str) {
        C1151k.m6707a("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f11228e = true;
        m12576u(this.f11232i);
    }

    /* renamed from: r */
    public void m12595r() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    /* renamed from: t */
    public void m12596t() {
        C1151k.m6707a("rbx.appshell", "ASMA.pause");
        if (this.f11227d) {
            C1151k.m6712f("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (C2872n.m12830h().m12836f().m13868i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    /* renamed from: v */
    public void m12597v() {
        C1151k.m6707a("rbx.appshell", "ASMA.reset()");
        this.f11225b = false;
        this.f11227d = false;
        this.f11228e = false;
        this.f11230g = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        m12577w();
        C3214a.m14292a().m14294c();
        if (C1134c.m6537a().mo6608f1()) {
            return;
        }
        C3905c.m16561r().m16571t();
    }

    /* renamed from: x */
    public void m12598x(Context context, Surface surface) {
        m12599y(context, surface, null);
    }

    /* renamed from: y */
    public void m12599y(Context context, Surface surface, Activity activity) {
        d m12608a;
        C1151k.m6712f("rbx.appshell", "ASMA.restart");
        m12587e();
        if (C2877p0.m12865G0()) {
            m12608a = C2833d.m12609b(context, activity);
        } else {
            m12608a = C2833d.m12608a(context);
        }
        m12589j(m12608a);
        m12583F(surface);
    }

    /* renamed from: z */
    public void m12600z() {
        m12571g();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }
}
