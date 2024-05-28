package com.roblox.client;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.AbstractC0141b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0140a;
import androidx.fragment.app.AbstractC0819t;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.C2749c1;
import com.roblox.client.app.AppInputFocusLifecycleObserver;
import com.roblox.client.app.AppWebViewLifecycleObserver;
import com.roblox.client.app.C2740a;
import com.roblox.client.app.C2742c;
import com.roblox.client.app.C2743d;
import com.roblox.client.captcha.ActivityFunCaptcha;
import com.roblox.client.captcha.CaptchaConfig;
import com.roblox.client.captcha.LoginCaptchaConfig;
import com.roblox.client.captcha.SignUpCaptchaConfig;
import com.roblox.client.feature.FeatureState;
import com.roblox.client.game.C2831b;
import com.roblox.client.game.C2833d;
import com.roblox.client.game.MainActivityController;
import com.roblox.client.game.SurfaceHolderCallbackC2830a;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C2904a;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import la.C3905c;
import ma.C3969a;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.C0045c;
import p008a7.C0050h;
import p008a7.C0051i;
import p008a7.C0057o;
import p021b7.C1073a;
import p021b7.C1074b;
import p021b7.InterfaceC1075c;
import p023b9.C1079c;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p025c.C1115d;
import p033c7.C1134c;
import p035c9.C1145e;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1154n;
import p061e7.C3088i;
import p074f7.C3185n;
import p074f7.C3197z;
import p074f7.EnumC3172f0;
import p075f8.C3205h;
import p077fa.C3214a;
import p100h7.C3417j;
import p100h7.InterfaceC3420m;
import p101h8.C3439m;
import p102h9.C3447a;
import p103ha.C3451a;
import p117ia.C3548a;
import p144ka.C3769a;
import p166m8.C3966g;
import p188o6.C4143a;
import p189o7.C4146b;
import p189o7.C4147c;
import p190o8.C4149a;
import p191o9.C4159g;
import p192oa.C4163a;
import p227r8.C4455c;
import p239s7.C4531b;
import p239s7.C4535f;
import p249t6.C4735b;
import p276v8.C4991a;
import p276v8.C4992b;
import p276v8.InterfaceC4994d;
import p288w8.C5469d;
import p288w8.C5472g;
import p288w8.C5476k;
import p288w8.EnumC5480o;
import p288w8.InterfaceC5477l;
import p300x7.C5560b;
import p300x7.C5562d;
import p300x7.C5565g;
import p314y8.C5915i;

/* loaded from: classes.dex */
public class ActivityNativeMain extends AbstractActivityC2837i0 implements C5562d.e, InterfaceC1075c, InterfaceC5477l, C2740a.d, SurfaceHolderCallbackC2830a.g, C2904a.b, NativeGLJavaInterface.OnAppShellReloadNeededListener, InterfaceC4994d, SurfaceHolderCallbackC2830a.f, C3185n.d {

    /* renamed from: S */
    private boolean f10325S;

    /* renamed from: T */
    private C1073a f10326T;

    /* renamed from: U */
    private View f10327U;

    /* renamed from: V */
    private View f10328V;

    /* renamed from: W */
    private boolean f10329W;

    /* renamed from: X */
    private int f10330X;

    /* renamed from: Y */
    private C4535f f10331Y;

    /* renamed from: a0 */
    private C2742c f10333a0;

    /* renamed from: b0 */
    private ScheduledThreadPoolExecutor f10334b0;

    /* renamed from: c0 */
    private MainActivityController f10335c0;

    /* renamed from: d0 */
    private AbstractC0141b<IntentSenderRequest> f10336d0;

    /* renamed from: f0 */
    private C5915i f10338f0;

    /* renamed from: Z */
    private C2740a f10332Z = null;

    /* renamed from: e0 */
    private boolean f10337e0 = false;

    /* renamed from: g0 */
    private final InterfaceC3420m f10339g0 = new C2720f();

    /* renamed from: com.roblox.client.ActivityNativeMain$a */
    /* loaded from: classes.dex */
    public class RunnableC2715a implements Runnable {
        RunnableC2715a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain activityNativeMain = ActivityNativeMain.this;
            C2817d1.m12471j(activityNativeMain, activityNativeMain.f10327U);
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$b */
    /* loaded from: classes.dex */
    class RunnableC2716b implements Runnable {
        RunnableC2716b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain.this.f10328V.setVisibility(8);
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$c */
    /* loaded from: classes.dex */
    class C2717c extends C2749c1.b {
        C2717c() {
        }

        @Override // com.roblox.client.C2749c1.c
        /* renamed from: a */
        public void mo12176a(C2749c1.d dVar) {
            if (dVar.m12252b()) {
                ActivityNativeMain.this.m12656x1(false);
            } else if (dVar.m12253c()) {
                ActivityNativeMain.this.m12656x1(true);
            }
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$d */
    /* loaded from: classes.dex */
    class RunnableC2718d implements Runnable {

        /* renamed from: n */
        final /* synthetic */ ActivityNativeMain f10343n;

        RunnableC2718d(ActivityNativeMain activityNativeMain) {
            this.f10343n = activityNativeMain;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActivityNativeMain.this.isFinishing()) {
                return;
            }
            C5560b.m20361m();
            new AsyncTaskC2728n(this.f10343n).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$e */
    /* loaded from: classes.dex */
    class RunnableC2719e implements Runnable {
        RunnableC2719e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1151k.m6707a("rbx.main", "[GrantPendingPurchase] Executor::run: ");
            ActivityNativeMain.this.m12111J1(false);
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$f */
    /* loaded from: classes.dex */
    class C2720f implements InterfaceC3420m {
        C2720f() {
        }

        @Override // p100h7.InterfaceC3420m
        /* renamed from: a */
        public void mo12177a(C3417j c3417j) {
            if (c3417j.m15027b() == 401) {
                C1151k.m6716j("rbx.main", "sessionCheckHandler: Got 401 error code from the server. Logout now...");
                C5560b.m20357e().m20364h(ActivityNativeMain.this, C5560b.f.LOGOUT_BY_401_ERROR_IN_NATIVE);
            }
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$g */
    /* loaded from: classes.dex */
    public class C2721g extends C2749c1.b {
        C2721g() {
        }

        @Override // com.roblox.client.C2749c1.c
        /* renamed from: a */
        public void mo12176a(C2749c1.d dVar) {
            if (dVar.m12252b()) {
                ActivityNativeMain.this.m12656x1(false);
                return;
            }
            if (dVar.m12253c()) {
                ActivityNativeMain.this.m12656x1(true);
            } else if (C1152l.m6736g() && dVar.m12251a()) {
                C5560b.m20357e().m20364h(ActivityNativeMain.this, C5560b.f.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.C2749c1.b, com.roblox.client.C2749c1.c
        /* renamed from: b */
        public void mo12178b(C2749c1.d dVar) {
            if (C2877p0.m12935m0() && dVar.m12253c()) {
                ActivityNativeMain.this.m12656x1(true);
            }
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$h */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnCancelListenerC2722h implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC2722h() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$i */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2723i implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2723i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$j */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2724j implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2724j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            ActivityNativeMain.this.finish();
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$k */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2725k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2725k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$l */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2726l implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2726l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$m */
    /* loaded from: classes.dex */
    public class DialogInterfaceOnClickListenerC2727m implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2727m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            ActivityNativeMain.this.finish();
        }
    }

    /* renamed from: com.roblox.client.ActivityNativeMain$n */
    /* loaded from: classes.dex */
    private static class AsyncTaskC2728n extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private WeakReference<ActivityNativeMain> f10354a;

        AsyncTaskC2728n(ActivityNativeMain activityNativeMain) {
            C1151k.m6712f("rbx.main", "Reloading lua app.");
            this.f10354a = new WeakReference<>(activityNativeMain);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            SurfaceHolderCallbackC2830a m6361d;
            Surface m12552I2;
            ActivityNativeMain activityNativeMain = this.f10354a.get();
            if (activityNativeMain != null && (m6361d = activityNativeMain.m12115N1().m6361d()) != null && (m12552I2 = m6361d.m12552I2()) != null) {
                C5560b.m20356d();
                if (C2877p0.m12865G0()) {
                    C2831b.m12572i().m12599y(activityNativeMain, m12552I2, activityNativeMain);
                } else {
                    C2831b.m12572i().m12598x(activityNativeMain, m12552I2);
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            ActivityNativeMain activityNativeMain;
            if (bool.booleanValue() || (activityNativeMain = this.f10354a.get()) == null || activityNativeMain.f10328V == null) {
                return;
            }
            activityNativeMain.f10328V.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            ActivityNativeMain activityNativeMain = this.f10354a.get();
            if (activityNativeMain == null || activityNativeMain.f10328V == null) {
                return;
            }
            activityNativeMain.f10328V.setVisibility(0);
        }
    }

    /* renamed from: J1 */
    public void m12111J1(boolean z10) {
        if (C1152l.m6734e()) {
            String m6390k = C1079c.m6380c().m6390k();
            long m6389j = C1079c.m6380c().m6389j();
            if (TextUtils.isEmpty(m6390k)) {
                return;
            }
            if (m6389j > 0) {
                C3205h.m14141f0(this).m14179a0(m6389j, m6390k, z10);
            } else {
                C3205h.m14141f0(this).m14180b0(m6390k, z10);
            }
        }
    }

    /* renamed from: K1 */
    private void m12112K1() {
        this.f10327U.post(new RunnableC2715a());
    }

    /* renamed from: L1 */
    private void m12113L1() {
        ViewGroup viewGroup = (ViewGroup) this.f10327U.getRootView();
        int i10 = C2915y.f11856e0;
        this.f10330X = i10;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(i10);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getLayoutInflater().inflate(C2738a0.f10429t, (ViewGroup) frameLayout, true);
        this.f10335c0 = new MainActivityController(this, (SurfaceView) frameLayout.findViewById(C2915y.f11875k1));
        mo583f().mo4889a(this.f10335c0);
        C1151k.m6712f("rbx.main", "createGlAppsFrame() apps frame created");
        viewGroup.addView(frameLayout, 0);
    }

    /* renamed from: M1 */
    private void m12114M1() {
        C2904a.m13171q2(this);
    }

    /* renamed from: N1 */
    public C1073a m12115N1() {
        if (this.f10326T == null) {
            this.f10326T = new C1073a(this, this.f10330X);
        }
        return this.f10326T;
    }

    /* renamed from: O1 */
    private C0051i m12116O1() {
        C0051i m248b = C0051i.m248b("CUSTOM_WEBVIEW_TAG");
        m248b.m253g(C2877p0.m12876M(this));
        m248b.m256j(true);
        return m248b;
    }

    /* renamed from: P1 */
    private void m12117P1() {
        C1151k.m6712f("rbx.main", "internalOnResume:");
        m12111J1(true);
        C2749c1.m12245e().m12246b(new C2721g());
        if (C5472g.m20125q2()) {
            C5472g.m20124p2(this);
        }
        if ((C1152l.m6736g() || C5565g.m20445e().m20459i()) && C2817d1.m12473l(this)) {
            C5565g.m20445e().m20456d(this.f10339g0);
        }
        C5562d.m20371c().m20373b(this);
        if (C3439m.m15122c().m15131k() && C2817d1.m12473l(this)) {
            if (this.f10329W) {
                this.f10329W = false;
            }
            m12135i2();
        }
        if (this.f10329W) {
            C1151k.m6712f("rbx.main", "Back from game. Resuming Lua App.");
            m12133f2();
        }
        C1073a m12115N1 = m12115N1();
        m4617y0().m4489f0();
        if (m12115N1.m6361d() == null) {
            m12115N1.m6363g(new FeatureState("CUSTOM_LUAVIEW_TAG"));
        }
    }

    /* renamed from: Q1 */
    public /* synthetic */ void m12118Q1(JSONObject jSONObject) {
        C2827g.m12519b(jSONObject, this);
    }

    /* renamed from: R1 */
    public /* synthetic */ void m12119R1() {
        this.f10328V.setVisibility(8);
    }

    /* renamed from: S1 */
    public /* synthetic */ void m12120S1() {
        this.f10329W = true;
        mo12153S();
    }

    /* renamed from: T1 */
    public /* synthetic */ void m12121T1(ActivityResult activityResult) {
        C2872n.m12830h().m12837g().m15636o(this, activityResult.m607a());
    }

    /* renamed from: U1 */
    public /* synthetic */ void m12122U1(ActivityResult activityResult) {
        C2872n.m12830h().m12840k().m21075C(this, activityResult.m607a());
    }

    /* renamed from: V1 */
    private void m12123V1(FeatureState featureState) {
        C1151k.m6712f("rbx.appshell", "loadDataModel()");
        C2831b.m12572i().m12582E(this);
        C2831b.m12572i().m12589j(C2833d.m12608a(this));
        if (NativeGLInterface.isColdStartDeeplinkToGame() && C5565g.m20446h()) {
            C3214a.m14292a().m14293b(new C3214a.b() { // from class: com.roblox.client.c
                public /* synthetic */ C2747c() {
                }

                @Override // p077fa.C3214a.b
                /* renamed from: a */
                public final void mo12242a(JSONObject jSONObject) {
                    ActivityNativeMain.this.m12118Q1(jSONObject);
                }
            });
            C5476k.m20132H(this, C5565g.m20448m().toString());
        }
        if (C2872n.m12830h().m12836f().m13868i()) {
            return;
        }
        m12171r2(featureState);
        NativeGLInterface.nativeAppBridgeStartLuaAppDM();
    }

    /* renamed from: W1 */
    private void m12124W1(Bundle bundle) {
        String m12902Z;
        long j10 = bundle.getLong("EXTRA_NOTIFICATION_USER_ID", -1L);
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE");
        boolean z10 = bundle.getBoolean("EXTRA_STACKED_NOTIFICATION", false);
        String str = null;
        if (string == null) {
            finish();
        } else if (!z10) {
            if (string.equals("FriendRequestAccepted")) {
                if (j10 == -1) {
                    m12902Z = C2877p0.m12900Y(C5565g.m20445e().m20458g());
                } else {
                    m12902Z = C2877p0.m12902Z(j10);
                }
            } else if (string.equals("FriendRequestReceived")) {
                if (j10 == -1) {
                    m12902Z = C2877p0.m12898X(C5565g.m20445e().m20458g());
                } else {
                    m12902Z = C2877p0.m12902Z(j10);
                }
            }
            str = m12902Z;
        } else if (string.equals("FriendRequestAccepted")) {
            str = C2877p0.m12900Y(C5565g.m20445e().m20458g());
        } else if (string.equals("FriendRequestReceived")) {
            str = C2877p0.m12898X(C5565g.m20445e().m20458g());
        }
        m12143v2(str);
    }

    /* renamed from: X1 */
    private void m12125X1(Bundle bundle) {
        String m12857C0;
        long j10 = bundle.getLong("EXTRA_CONVERSATION_ID", -1L);
        if (j10 == -1) {
            m12857C0 = C2877p0.m12955w0();
        } else {
            m12857C0 = C2877p0.m12857C0(j10);
        }
        m12143v2(m12857C0);
    }

    /* renamed from: Y1 */
    private boolean m12126Y1() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("loginAfterSignup", false);
        }
        return false;
    }

    /* renamed from: Z1 */
    private void m12127Z1(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("FEATURE_EXTRA")) == null) {
            return;
        }
        if ("CHAT_TAG".equals(stringExtra)) {
            long longExtra = intent.getLongExtra("USER_ID_EXTRA", -1L);
            if (longExtra != -1) {
                m12132e2(longExtra);
                return;
            } else {
                m12129b2(intent.getLongExtra("CONVERSATION_ID_EXTRA", -1L));
                return;
            }
        }
        if ("PROFILE_TAG".equals(stringExtra)) {
            C2827g.m12523f(this, intent.getStringExtra("PATH_EXTRA"), getString(C2748c0.f10604X2));
        } else if ("SETTINGS_TAG".equals(stringExtra)) {
            C2827g.m12523f(this, intent.getStringExtra("PATH_EXTRA"), getString(C2748c0.f10620a3));
        } else {
            C2827g.m12523f(this, intent.getStringExtra("PATH_EXTRA"), C1074b.m6367a(this, stringExtra));
        }
    }

    /* renamed from: a2 */
    private String m12128a2() {
        return "OVERLAY_" + m4617y0().m4506n0();
    }

    /* renamed from: b2 */
    private void m12129b2(long j10) {
        C1151k.m6707a("rbx.main", "navigateToConversation() conversation:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.m12515d("CHAT_CONVERSATION_ID", j10);
        m12130c2(featureState);
    }

    /* renamed from: c2 */
    private void m12130c2(FeatureState featureState) {
        C1151k.m6714h("rbx.main", "navigateToFeature:" + featureState.m12514c() + " bundle:" + featureState.m12512a());
        m12171r2(featureState);
    }

    /* renamed from: d2 */
    private void m12131d2(String str, String str2) {
        C2827g.m12523f(this, C1145e.m6691c(str2), str);
    }

    /* renamed from: e2 */
    private void m12132e2(long j10) {
        C1151k.m6707a("rbx.main", "navigateToUserConversation() user:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.m12515d("USER_ID_EXTRA", j10);
        m12130c2(featureState);
    }

    /* renamed from: f2 */
    private void m12133f2() {
        m12141t2();
        this.f10329W = false;
    }

    /* renamed from: h2 */
    private void m12134h2(String str) {
        JSONObject jSONObject;
        CaptchaConfig signUpCaptchaConfig;
        LoginCaptchaConfig.EnumC2752c enumC2752c;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            C1151k.m6716j("rbx.main", "openFunCaptchaActivity: Exception parsing json data.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.optString("captchaType").equals("login")) {
                String optString = jSONObject.optString("cvalueType");
                String optString2 = jSONObject.optString("cvalue");
                optString.hashCode();
                char c10 = 65535;
                switch (optString.hashCode()) {
                    case -612351174:
                        if (optString.equals("phone_number")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -265713450:
                        if (optString.equals("username")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 96619420:
                        if (optString.equals("email")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        enumC2752c = LoginCaptchaConfig.EnumC2752c.PHONE_NUMBER;
                        break;
                    case 1:
                        enumC2752c = LoginCaptchaConfig.EnumC2752c.USERNAME;
                        break;
                    case 2:
                        enumC2752c = LoginCaptchaConfig.EnumC2752c.EMAIL;
                        break;
                    default:
                        throw new RuntimeException("Unsupported credential Type: " + optString + ".");
                }
                signUpCaptchaConfig = new LoginCaptchaConfig(enumC2752c, optString2);
            } else {
                signUpCaptchaConfig = new SignUpCaptchaConfig();
            }
            C1151k.m6712f("rbx.main", "openFunCaptchaActivity: config = " + signUpCaptchaConfig);
            startActivityForResult(ActivityFunCaptcha.m12257A1(this, signUpCaptchaConfig), 20115);
        }
    }

    /* renamed from: i2 */
    private void m12135i2() {
        C1151k.m6712f("rbx.main", "processPushNotification.");
        Bundle m15125b = C3439m.m15122c().m15125b();
        if (m15125b == null) {
            return;
        }
        String string = m15125b.getString("EXTRA_NOTIFICATION_TYPE", BuildConfig.FLAVOR);
        String string2 = m15125b.getString("EXTRA_NOTIFICATION_VERSION", BuildConfig.FLAVOR);
        String string3 = m15125b.getString("EXTRA_NOTIFICATION_ID", BuildConfig.FLAVOR);
        if (!string2.isEmpty()) {
            String string4 = m15125b.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", BuildConfig.FLAVOR);
            C3905c.m16561r().m16562e(string4);
            C2822f0.m12493o(string, string3, string2, string4);
            return;
        }
        try {
            String string5 = m15125b.getString("EXTRA_NOTIFICATION_TYPE", BuildConfig.FLAVOR);
            char c10 = 65535;
            switch (string5.hashCode()) {
                case 624927928:
                    if (string5.equals("FriendRequestAccepted")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 929482719:
                    if (string5.equals("ChatNewMessage")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1050705701:
                    if (string5.equals("PrivateMessageReceived")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1715544492:
                    if (string5.equals("DefaultNotification")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1962733298:
                    if (string5.equals("FriendRequestReceived")) {
                        c10 = 1;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                C4149a.m17199a().m17200b(m15125b.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
                return;
            }
            if (c10 == 1 || c10 == 2) {
                m12124W1(m15125b);
                return;
            }
            if (c10 != 3) {
                if (c10 != 4) {
                    return;
                }
                m12125X1(m15125b);
            } else {
                long j10 = m15125b.getLong("EXTRA_CONVERSATION_ID", -1L);
                if (j10 != -1) {
                    m12129b2(j10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: m2 */
    public static void m12136m2(ActivityNativeMain activityNativeMain, boolean z10) {
        SurfaceHolderCallbackC2830a m6361d = activityNativeMain.m12115N1().m6361d();
        if (m6361d != null && z10) {
            activityNativeMain.m4617y0().m4504m().mo4564n(m6361d).mo4560i();
        }
        C1151k.m6707a("rbx.appshell", "removeGlApp() clearing app shell");
        C2831b.m12572i().m12587e();
    }

    /* renamed from: n2 */
    private boolean m12137n2() {
        if (m4617y0().m4459M0() || m4617y0().m4506n0() <= 0) {
            return false;
        }
        m4617y0().m4476W0();
        return true;
    }

    /* renamed from: p2 */
    private void m12138p2() {
        FeatureState featureState;
        C1151k.m6707a("rbx.main", "setupMainTabs: tabs-loaded = " + this.f10325S);
        if (this.f10325S) {
            return;
        }
        this.f10325S = true;
        if (m12126Y1() && !C1152l.m6736g()) {
            featureState = new FeatureState("GAMES_TAG");
        } else {
            featureState = new FeatureState("CUSTOM_LUAVIEW_TAG");
        }
        m12123V1(featureState);
        if (this.f10332Z == null) {
            C2740a c2740a = new C2740a(this, new Handler(Looper.getMainLooper()));
            this.f10332Z = c2740a;
            c2740a.m12226c();
        }
        if (this.f10333a0 != null || C1134c.m6537a().mo6593a1()) {
            return;
        }
        C2742c c2742c = new C2742c(this);
        this.f10333a0 = c2742c;
        c2742c.m12233c();
    }

    /* renamed from: q2 */
    private void m12139q2() {
        if (C1134c.m6537a().mo6561L() == 1) {
            String string = mo12157f0().getString(C2748c0.f10634d);
            String string2 = getString(C2748c0.f10670j);
            String string3 = getString(C2748c0.f10664i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<body>");
            sb2.append(String.format(string, " <a href='" + string3 + "'>" + string2 + "</a>"));
            sb2.append("</body>");
            String sb3 = sb2.toString();
            TextView textView = new TextView(this);
            textView.setPadding(5, 5, 5, 5);
            textView.setGravity(17);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(Html.fromHtml(sb3));
            new AlertDialog.Builder(this).setCancelable(false).setTitle(C2748c0.f10658h).setView(textView).setPositiveButton(C2748c0.f10742v, new DialogInterfaceOnClickListenerC2725k()).create().show();
            return;
        }
        if (C1134c.m6537a().mo6561L() == 2) {
            String string4 = mo12157f0().getString(C2748c0.f10622b);
            String string5 = getString(C2748c0.f10670j);
            String string6 = getString(C2748c0.f10664i);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<body>");
            sb4.append(String.format(string4, getString(C2748c0.f10640e), " <a href='" + string6 + "'>" + string5 + "</a>"));
            sb4.append("</body>");
            String sb5 = sb4.toString();
            TextView textView2 = new TextView(this);
            textView2.setPadding(5, 5, 5, 5);
            textView2.setGravity(17);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(Html.fromHtml(sb5));
            new AlertDialog.Builder(this).setCancelable(false).setTitle(C2748c0.f10646f).setView(textView2).setPositiveButton(C2748c0.f10742v, new DialogInterfaceOnClickListenerC2726l()).create().show();
            return;
        }
        if (C1134c.m6537a().mo6561L() == 3) {
            String string7 = mo12157f0().getString(C2748c0.f10628c);
            String string8 = getString(C2748c0.f10670j);
            String string9 = getString(C2748c0.f10664i);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<body>");
            sb6.append(String.format(string7, " <a href='" + string9 + "'>" + string8 + "</a>"));
            sb6.append("</body>");
            String sb7 = sb6.toString();
            TextView textView3 = new TextView(this);
            textView3.setPadding(5, 5, 5, 5);
            textView3.setGravity(17);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setText(Html.fromHtml(sb7));
            new AlertDialog.Builder(this).setCancelable(false).setTitle(C2748c0.f10652g).setView(textView3).setPositiveButton(C2748c0.f10676k, new DialogInterfaceOnClickListenerC2727m()).create().show();
        }
    }

    /* renamed from: s2 */
    private void m12140s2() {
        new AlertDialog.Builder(this).setMessage(C2748c0.f10682l).setPositiveButton(C2748c0.f10676k, new DialogInterfaceOnClickListenerC2724j()).setNegativeButton(C2748c0.f10509E2, new DialogInterfaceOnClickListenerC2723i()).setOnCancelListener(new DialogInterfaceOnCancelListenerC2722h()).create().show();
    }

    /* renamed from: t2 */
    private void m12141t2() {
        if (!C1134c.m6537a().mo6647t() || C4735b.m18874b().m18876c() < C1134c.m6537a().mo6660y()) {
            return;
        }
        C4143a.m17168e().m17177i(this);
    }

    /* renamed from: u2 */
    private void m12142u2(int i10) {
        C3969a.m16695e().m16697b("retry_during_main");
        C2904a.m13173t2(this, i10);
    }

    /* renamed from: v2 */
    private void m12143v2(String str) {
        Intent intent = new Intent(this, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        startActivity(intent);
        overridePendingTransition(C2905t.f11658b, C2905t.f11659c);
    }

    /* renamed from: w2 */
    private void m12144w2() {
        C1151k.m6712f("rbx.main", "startup:");
        if (((C5476k.m20155t(this).m20172w() || C5565g.m20445e().m20457f() || C5469d.m20104h()) ? false : true) && C1152l.m6733d()) {
            C1151k.m6709c("rbx.main", "Incomplete initialization, restarting app");
            startActivity(ActivitySplash.m13160C1(this, EnumC5480o.SHELL_PROCESS_RESTART));
            finish();
            return;
        }
        C5476k.m20155t(this).m20168S();
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: B */
    public void mo12145B() {
        C1151k.m6712f("rbx.main", "updateViewAppSettingsLoaded:");
        m12138p2();
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: E */
    public void mo12146E() {
        mo12260S0();
    }

    @Override // p074f7.C3185n.d
    /* renamed from: F */
    public void mo12147F(Bundle bundle) {
        C1151k.m6712f("rbx.main", "Request to end the game. Performing app restoration.");
        C2872n.m12830h().m12836f().m13869l(null);
        m12174x2(EnumC3172f0.APP);
        FragmentManager m4617y0 = m4617y0();
        if (m12674c1() && !m4617y0.m4459M0()) {
            C2877p0.m12884Q(this).edit().putBoolean("ROBLOXCrash", true).apply();
            C2831b.m12572i().m12600z();
            C2831b.m12572i().m12579B(true);
            runOnUiThread(new Runnable() { // from class: com.roblox.client.f
                public /* synthetic */ RunnableC2821f() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityNativeMain.this.m12120S1();
                }
            });
            return;
        }
        C1151k.m6712f("rbx.main", "Experience has been ended in the background.");
        this.f10337e0 = true;
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: G */
    public void mo12148G() {
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: H */
    public void mo12149H() {
        C1151k.m6712f("rbx.main", "showRetryUI:");
        if (C2877p0.m12935m0()) {
            C1154n.m6741a(this, C2748c0.f10692m3);
            finish();
        } else if (m12674c1()) {
            m12142u2(C2748c0.f10692m3);
        }
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.OnAppShellReloadNeededListener
    /* renamed from: J */
    public void mo12150J() {
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new RunnableC2718d(this));
    }

    @Override // com.roblox.client.app.C2740a.d
    /* renamed from: Q */
    public void mo12151Q() {
        m12137n2();
    }

    @Override // com.roblox.client.game.SurfaceHolderCallbackC2830a.g
    /* renamed from: R */
    public void mo12152R() {
        C1151k.m6712f("rbx.main", "onAppStarted: ");
        if (m12674c1() && C5560b.m20356d()) {
            new AsyncTaskC2728n(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: S */
    public void mo12153S() {
        C1151k.m6712f("rbx.main", "navigateToMainScreen: IsLoggedIn = " + C5565g.m20445e().m20457f());
        m12138p2();
        if (!C2872n.m12830h().m12836f().m13868i() && m12674c1() && C5565g.m20445e().m20457f()) {
            m12117P1();
        }
    }

    @Override // p021b7.InterfaceC1075c
    /* renamed from: Z */
    public Fragment mo6368Z(String str) {
        return m4617y0().m4498j0(str);
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: a */
    public boolean mo12154a() {
        return this.f10335c0.mo12154a();
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: b */
    public void mo12155b(boolean z10) {
        this.f10335c0.mo12155b(z10);
    }

    @Override // com.roblox.client.game.SurfaceHolderCallbackC2830a.g
    /* renamed from: d */
    public void mo12156d(String str) {
        C1151k.m6712f("rbx.main", "onAppReady: " + str);
        View view = this.f10328V;
        if (view != null && view.getVisibility() != 8) {
            this.f10328V.post(new RunnableC2716b());
        }
        if (!"Landing".equals(str) && !"Home".equals(str)) {
            if (this.f10333a0 != null && "Login".equals(str)) {
                this.f10333a0.m12235e();
                return;
            } else {
                if (C1134c.m6537a().mo6646s1() && "Push".equals(str)) {
                    C2872n.m12830h().m12841l().m17028y(getApplicationContext());
                    return;
                }
                return;
            }
        }
        C2749c1.m12245e().m12246b(new C2717c());
        if (NativeGLInterface.shouldDisplayOpenGLUnsupportedMessage()) {
            m12139q2();
        }
    }

    @Override // p074f7.C3185n.d
    /* renamed from: f0 */
    public ActivityC0803d mo12157f0() {
        return this;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (C1134c.m6537a().mo6587Y() && C2877p0.m12935m0()) {
            Process.killProcess(Process.myPid());
        }
    }

    /* renamed from: g2 */
    public void m12158g2(String str, String str2) {
        C4992b.m19443c(str, str2);
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: h */
    public void mo12159h() {
        C1151k.m6712f("rbx.main", "navigateToLandingScreen:");
        Intent m12845p = C2872n.m12830h().m12845p(this);
        m12845p.putExtra("send_app_input_focus_to_lua", true);
        startActivity(m12845p);
        finish();
    }

    @Override // com.roblox.client.AbstractActivityC2837i0
    /* renamed from: i1 */
    protected boolean mo12160i1() {
        return true;
    }

    @Override // com.roblox.client.AbstractActivityC2837i0
    /* renamed from: j1 */
    protected C4146b mo12161j1() {
        return new C4147c();
    }

    /* renamed from: j2 */
    public void m12162j2() {
        m12140s2();
    }

    /* renamed from: k2 */
    public void m12163k2() {
        C1151k.m6712f("rbx.main", "Registering activity result for IdentityProtocol.");
        this.f10336d0 = m590v0(new C1115d(), new InterfaceC0140a() { // from class: com.roblox.client.b
            public /* synthetic */ C2744b() {
            }

            @Override // androidx.activity.result.InterfaceC0140a
            /* renamed from: a */
            public final void mo635a(Object obj) {
                ActivityNativeMain.this.m12121T1((ActivityResult) obj);
            }
        });
    }

    /* renamed from: l2 */
    public void m12164l2() {
        C1151k.m6712f("rbx.main", "Registering activity result for NativeUtilProtocol.");
        this.f10336d0 = m590v0(new C1115d(), new InterfaceC0140a() { // from class: com.roblox.client.a
            public /* synthetic */ C2737a() {
            }

            @Override // androidx.activity.result.InterfaceC0140a
            /* renamed from: a */
            public final void mo635a(Object obj) {
                ActivityNativeMain.this.m12122U1((ActivityResult) obj);
            }
        });
    }

    @Override // com.roblox.client.startup.C2904a.b
    /* renamed from: n */
    public void mo12165n() {
        m12114M1();
        m12144w2();
    }

    @Override // com.roblox.client.startup.C2904a.b
    /* renamed from: n0 */
    public void mo12166n0() {
        m12114M1();
        m12144w2();
    }

    @Override // p074f7.C3185n.d
    /* renamed from: o */
    public void mo12167o() {
        this.f10335c0.m12536l();
    }

    @Override // com.roblox.client.app.C2740a.d
    /* renamed from: o0 */
    public void mo12168o0(C2743d c2743d) {
        m12112K1();
        Boolean bool = c2743d.f10471d;
        Fragment c2873n0 = bool != null && bool.booleanValue() ? new C2873n0() : new C3088i();
        c2873n0.mo583f().mo4889a(new AppWebViewLifecycleObserver());
        c2873n0.mo583f().mo4889a(new AppInputFocusLifecycleObserver());
        Bundle bundle = new Bundle();
        bundle.putString("DEFAULT_URL", c2743d.f10468a);
        bundle.putBoolean("USE_APP_HYBRID", true);
        bundle.putBoolean("VISIBLE", c2743d.f10470c.booleanValue());
        bundle.putBoolean("BACK_NAVIGATION_DISABLED", c2743d.f10472e.booleanValue());
        bundle.putString("TITLE_STRING", c2743d.f10469b);
        bundle.putBoolean("HAS_PARENT", true);
        bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
        c2873n0.m4282H1(bundle);
        AbstractC0819t m4504m = m4617y0().m4504m();
        m4504m.m4747c(C2915y.f11879m, c2873n0, m12128a2());
        m4504m.m4751g(null);
        m4504m.mo4560i();
    }

    /* renamed from: o2 */
    protected void m12169o2(boolean z10) {
        C3447a c3447a = new C3447a(z10);
        NativeGLInterface.nativeBroadcastEventWithNamespace(c3447a.f14340a, c3447a.f14341b, c3447a.f14342c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        C1151k.m6707a("rbx.main", "onActivityResult: requestCode = " + i10 + " resultCode = " + i11 + " Intent data = " + intent);
        if (i10 != -1) {
            if (i10 == 20104) {
                this.f10329W = true;
                return;
            }
            if (i10 == 20110) {
                if (i11 == -1) {
                    m12127Z1(intent);
                    return;
                }
                return;
            }
            if (i10 == 20115) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onActivityResult from FunCaptcha: code:");
                sb2.append(i11);
                sb2.append(", result:");
                sb2.append(i11 == 101 ? "success" : "dismiss");
                C1151k.m6712f("rbx.main", sb2.toString());
                C2831b.m12572i().m12578A(new C3447a(true));
                m12171r2(new FeatureState("HOME_TAG"));
                return;
            }
            if (i10 == 20121) {
                C2742c c2742c = this.f10333a0;
                if (c2742c != null) {
                    c2742c.m12234d(i11, intent);
                    return;
                }
                return;
            }
            if (i10 == 20124) {
                if (Build.VERSION.SDK_INT >= 22) {
                    C4992b.m19441a();
                }
                m12169o2(true);
            } else if (i10 != 20125) {
                super.onActivityResult(i10, i11, intent);
            } else {
                C3966g.m16691b(intent);
            }
        }
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onBackButtonNotConsumedEvent(C0045c c0045c) {
        m12162j2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (m4617y0().m4506n0() > 0) {
            Fragment m4495i0 = m4617y0().m4495i0(C2915y.f11879m);
            if (m4495i0 instanceof C2906t0) {
                C2906t0 c2906t0 = (C2906t0) m4495i0;
                if (c2906t0.m13202T2() || c2906t0.mo13201Q2()) {
                    return;
                }
                m4617y0().m4476W0();
                return;
            }
            if (m4495i0 instanceof C2918z0) {
                C2918z0 c2918z0 = (C2918z0) m4495i0;
                if (c2918z0.m13250t2() || c2918z0.m13249q2()) {
                    return;
                }
                m4617y0().m4476W0();
                return;
            }
            m4617y0().m4476W0();
            return;
        }
        if (m12115N1().m6362f()) {
            return;
        }
        m12162j2();
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onCodeParsedFromSMS(C0057o c0057o) {
        C1151k.m6712f("rbx.main", "SMS code received.");
        if (C1134c.m6537a().mo6549F()) {
            C1151k.m6712f("rbx.main", "Calling IdentityProtocol to parse OTP.");
            C2872n.m12830h().m12837g().m15633l(c0057o.f210a);
        } else if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidGetSMSOTPTemp")) {
            C1151k.m6712f("rbx.main", "Calling NativeUtilProtocol to parse OTP.");
            C2872n.m12830h().m12840k().m21086z(c0057o.f210a);
        }
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!ActivitySplash.m13163F1() && !C5469d.m20104h() && bundle != null) {
            C5476k.m20159y(bundle.getBoolean("RESTART_AFTER_PROCESS_DEATH", false));
            if (C5476k.m20126A()) {
                C1151k.m6712f("rbx.main", "onCreate: App was previously destroyed due to process death");
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        C3969a.m16695e().m16697b("main_activity_oncreate");
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate NativeMain. savedInstanceState is null: ");
        sb2.append(bundle == null);
        C1151k.m6712f("rbx.main", sb2.toString());
        this.f10331Y = C4531b.m18550f().m18560j();
        C5476k.m20155t(this).m20166P(this);
        setContentView(C2738a0.f10414e);
        if (bundle != null) {
            this.f10329W = bundle.getBoolean("BACK_FROM_GAME");
        }
        C3769a.m16020c(this);
        if (!this.f10329W) {
            C3769a.m16021d().m16022a(C3769a.a.MAIN, bundle);
        }
        this.f10327U = findViewById(C2915y.f11876l);
        m12113L1();
        this.f10328V = findViewById(C2915y.f11781A0);
        if (C2872n.m12830h().m12836f().m13867h()) {
            this.f10328V.post(new Runnable() { // from class: com.roblox.client.e
                public /* synthetic */ RunnableC2818e() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityNativeMain.this.m12119R1();
                }
            });
        } else {
            this.f10328V.setVisibility(0);
        }
        NativeGLJavaInterface.setAppShellReloadNeededListener(this);
        if (this.f10334b0 == null && C1134c.m6537a().mo6566N0()) {
            long mo6574R0 = C1134c.m6537a().mo6574R0();
            C1151k.m6707a("rbx.main", "Setup mPendingPurchaseExecutor to run every " + mo6574R0 + " seconds");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.f10334b0 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC2719e(), mo6574R0, mo6574R0, TimeUnit.SECONDS);
        }
        if (C1134c.m6537a().mo6637p0()) {
            m12163k2();
        } else {
            C1151k.m6712f("rbx.main", "Autofill phone number not enabled!");
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidNativeUtilProtocol") && NativeSettingsInterface.nativeGetFFlag("EnableAndroidGetPhoneNumberTemp") && !C1134c.m6537a().mo6637p0()) {
            m12164l2();
        }
        if (C1134c.m6537a().mo6614h1() && this.f10338f0 == null) {
            C5915i c5915i = new C5915i(new Handler(Looper.getMainLooper()));
            this.f10338f0 = c5915i;
            c5915i.m21044a();
        }
        if (C3439m.m15122c().m15131k()) {
            m12135i2();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        C5915i c5915i;
        if (C5476k.m20126A()) {
            C1151k.m6712f("rbx.main", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            return;
        }
        C1151k.m6712f("rbx.main", "onDestroy. isFinishing = " + isFinishing());
        NativeGLJavaInterface.setAppShellReloadNeededListener(null);
        if (this.f10335c0.f11194n == EnumC3172f0.EXPERIENCE) {
            C2872n.m12830h().m12836f().m13866g(true);
        } else {
            m12136m2(this, isFinishing());
        }
        this.f10325S = false;
        C5476k.m20155t(this).m20170U(this);
        C2740a c2740a = this.f10332Z;
        if (c2740a != null) {
            c2740a.m12227e();
            this.f10332Z = null;
        }
        C2742c c2742c = this.f10333a0;
        if (c2742c != null) {
            c2742c.m12236h();
            this.f10333a0 = null;
        }
        if (C1134c.m6537a().mo6614h1() && (c5915i = this.f10338f0) != null) {
            c5915i.m21045b();
            this.f10338f0 = null;
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.ActivityC0153c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f10335c0.m12533i(keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f10335c0.m12534j(keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C0050h c0050h) {
        long j10 = c0050h.f200b;
        if (j10 != -1) {
            m12132e2(j10);
        } else {
            m12129b2(c0050h.f199a);
        }
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C0051i c0051i) {
        JSONObject jSONObject;
        String str;
        C1151k.m6707a("rbx.main", "NavigateToFeature: " + c0051i.f201a);
        if ("FRIEND_FINDER_TAG".equals(c0051i.f201a) || "UNIVERSAL_FRIENDS_TAG".equals(c0051i.f201a)) {
            c0051i = m12116O1();
        }
        if ("PROFILE_TAG".equals(c0051i.f201a)) {
            C2827g.m12522e(this, c0051i.f202b, C2748c0.f10604X2, c0051i.f205e, c0051i.m252f());
            return;
        }
        if ("GAME_DETAILS_TAG".equals(c0051i.f201a)) {
            C2827g.m12522e(this, C2877p0.m12926i() + "games/" + c0051i.f202b, C2748c0.f10524H2, c0051i.f205e, c0051i.m252f());
            return;
        }
        if (!"CUSTOM_WEBVIEW_TAG".equals(c0051i.f201a) && !"YOUTUBE_TAG".equals(c0051i.f201a)) {
            if ("SOCIAL_MEDIA_TAG".equals(c0051i.f201a)) {
                new C4991a("rbx.main").m19438a(this, c0051i.m250d());
                return;
            }
            if ("MY_FEED_TAG".equals(c0051i.f201a)) {
                C2827g.m12522e(this, C2877p0.m12926i() + "feeds/inapp", C2748c0.f10589U2, c0051i.f205e, c0051i.m252f());
                return;
            }
            if ("SEARCH_GAMES_TAG".equals(c0051i.f201a)) {
                C2827g.m12522e(this, C2877p0.m12871J0(c0051i.f202b), C2748c0.f10609Y2, c0051i.f205e, c0051i.m252f());
                return;
            }
            if ("GAMES_SEE_ALL_TAG".equals(c0051i.f201a)) {
                C2827g.m12522e(this, C2877p0.m12854B(c0051i.f202b), C2748c0.f10574R2, c0051i.f205e, c0051i.m252f());
                return;
            }
            if ("ABUSE_REPORT_TAG".equals(c0051i.f201a)) {
                C2827g.m12521d(this, c0051i.f202b, c0051i.m252f());
                return;
            }
            if ("ANIMATED_ASSET_DETAILS_TAG".equals(c0051i.f201a)) {
                if (c0051i.f202b != null) {
                    str = C2877p0.m12926i() + "catalog/" + c0051i.f202b;
                } else {
                    str = C2877p0.m12926i() + "games/";
                }
                C2827g.m12526i(this, str, getString(C2748c0.f10632c3), c0051i.f205e, true, false);
                return;
            }
            if ("CAPTCHA_SUCCESS_TAG".equals(c0051i.f201a)) {
                C1151k.m6712f("rbx.main", "NavigateToFeature: Received 'CAPTCHA_SUCCESS' tag. Do nothing for now.");
                return;
            }
            if ("CAPTCHA_TAG".equals(c0051i.f201a)) {
                m12134h2(c0051i.m250d());
                return;
            } else if ("SCAN_QR_CODE".equals(c0051i.f201a)) {
                C3966g.m16693d(this, 20125);
                return;
            } else {
                m12131d2(C1074b.m6367a(this, c0051i.f201a), c0051i.f202b);
                return;
            }
        }
        try {
            jSONObject = new JSONObject(c0051i.m250d());
        } catch (JSONException unused) {
            C1151k.m6716j("rbx.main", "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("url");
            if (!optString2.isEmpty()) {
                if (C1134c.m6537a().mo6618j() && "YOUTUBE_TAG".equals(c0051i.f201a) && C2877p0.m12935m0()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(optString2));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                        return;
                    } else {
                        C1151k.m6716j("rbx.main", "Unable to handle youtube links on Maquettes device.");
                        return;
                    }
                }
                if (!c0051i.f205e) {
                    C2827g.m12525h(this, optString2, optString, false, true);
                    return;
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("searchParams");
                    C2827g.m12524g(this, optString2, optString, optJSONObject != null ? optJSONObject.toString() : null);
                    return;
                }
            }
            C1151k.m6716j("rbx.main", "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPause() {
        super.onPause();
        C1151k.m6712f("rbx.main", "onPause");
        C3451a.m15177g().m15179i();
        C3769a.m16021d().m16023b(C3769a.a.MAIN);
        C5562d.m20371c().m20376g(this);
    }

    @Override // androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        C2872n.m12830h().m12841l().m17025t(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onResume() {
        super.onResume();
        C1151k.m6712f("rbx.main", "onResume: IsLoggedIn = " + C5565g.m20445e().m20457f());
        C4535f m18560j = C4531b.m18550f().m18560j();
        if (this.f10331Y != m18560j) {
            this.f10331Y = m18560j;
            C1151k.m6712f("rbx.main", "onResume: Recreating activity due to Locale change.");
            recreate();
            return;
        }
        C5476k.m20155t(this).m20166P(this);
        if (!C2872n.m12830h().m12836f().m13868i()) {
            m12144w2();
        } else if (this.f10335c0.f11194n == EnumC3172f0.EXPERIENCE && C3439m.m15122c().m15131k()) {
            C2872n.m12830h().m12836f().m13866g(false);
        }
        if (this.f10337e0) {
            C2831b.m12572i().m12579B(true);
            this.f10337e0 = false;
        }
        C2872n.m12830h().m12841l().m17020A(this);
        if (C1134c.m6537a().mo6634o0()) {
            C2872n.m12830h().m12841l().m17029z();
        }
        C3451a.m15177g().m15178h(this, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 20124, new C3451a.e() { // from class: com.roblox.client.d
            public /* synthetic */ C2815d() {
            }

            @Override // p103ha.C3451a.e
            /* renamed from: a */
            public final void mo12461a(String str, String str2) {
                ActivityNativeMain.this.m12158g2(str, str2);
            }
        });
        if (C1134c.m6537a().mo6637p0()) {
            C1151k.m6712f("rbx.main", "Setting result launcher for IdentityProtocol");
            C2872n.m12830h().m12837g().m15641v(this.f10336d0);
        }
        if (NativeSettingsInterface.nativeGetFFlag("EnableAndroidNativeUtilProtocol") && NativeSettingsInterface.nativeGetFFlag("EnableAndroidGetPhoneNumberTemp") && !C1134c.m6537a().mo6637p0()) {
            C1151k.m6712f("rbx.main", "Setting result launcher for NativeUtilProtocol");
            C2872n.m12830h().m12840k().m21084N(this.f10336d0);
        }
        if (C1152l.m6734e()) {
            C2872n.m12830h().m12835e().m13646t(this);
        }
    }

    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BACK_FROM_GAME", this.f10329W);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        C2817d1.f11010a = getResources().getDisplayMetrics();
        if (AbstractActivityC2837i0.f11276R == 1 && this.f10335c0.f11194n == EnumC3172f0.APP) {
            NativeReportingInterface.applicationForegrounded();
        }
        C1100c.m6458d().m6470n(this);
        C4159g.m17244h().m17245i(C2831b.m12572i());
        C2822f0.m12498t("main");
        C3548a.m15354f().m15356d();
        if (this.f10335c0.f11194n == EnumC3172f0.EXPERIENCE) {
            C2872n.m12830h().m12836f().m13873p();
        }
        C4163a.m17255c().m17256a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        C1100c.m6458d().m6471p(this);
        if (AbstractActivityC2837i0.f11276R == 1 && this.f10335c0.f11194n == EnumC3172f0.APP) {
            NativeReportingInterface.applicationBackgrounded();
        }
        C4159g.m17244h().m17246j(C2831b.m12572i());
        C3548a.m15354f().m15357e();
        if (this.f10335c0.f11194n == EnumC3172f0.EXPERIENCE) {
            C2872n.m12830h().m12836f().m13871n();
        }
        C4163a.m17255c().m17257b();
        super.onStop();
        C1151k.m6712f("rbx.main", "onStop");
    }

    @Override // com.roblox.client.AbstractActivityC2841k0, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        this.f10335c0.m12535k(i10);
    }

    @Override // p300x7.C5562d.e
    /* renamed from: q */
    public void mo12170q(int i10, Bundle bundle) {
        if (i10 != 2) {
            if (i10 != 101) {
                return;
            }
            C2827g.m12527j(C3197z.m14030c(bundle.getBundle("game_init_params")), this);
        } else {
            C1151k.m6712f("rbx.main", "ANM.handleNotification() Logout event...");
            NativeGLInterface.nativeAppBridgeV2UserDidLogout();
            if (C4455c.m18283b()) {
                new AsyncTaskC2728n(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                m12653p1(C5560b.m20358f(bundle));
            }
        }
    }

    /* renamed from: r2 */
    public void m12171r2(FeatureState featureState) {
        C1151k.m6712f("rbx.main", "ANM.showFeature: " + featureState.m12514c());
        m12115N1().m6363g(featureState);
    }

    @Override // p276v8.InterfaceC4994d
    /* renamed from: s */
    public void mo12172s(String str) {
        if (TextUtils.isEmpty(str)) {
            C1151k.m6707a("rbx.main", "Share data is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("context");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            C4992b.m19443c(string2, string);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 167772160);
            m12169o2(false);
            if (Build.VERSION.SDK_INT >= 22) {
                startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), 20124);
            } else {
                startActivityForResult(Intent.createChooser(intent, null), 20124);
            }
        } catch (JSONException unused) {
            C1151k.m6707a("rbx.main", "Error parsing share data.");
        }
    }

    @Override // com.roblox.client.app.C2740a.d
    /* renamed from: x */
    public void mo12173x(C2743d c2743d) {
        if (m4617y0().m4506n0() > 0) {
            Fragment m4495i0 = m4617y0().m4495i0(C2915y.f11879m);
            if (m4495i0 instanceof C2906t0) {
                ((C2906t0) m4495i0).mo12851i3(c2743d);
            }
        }
    }

    /* renamed from: x2 */
    public void m12174x2(EnumC3172f0 enumC3172f0) {
        this.f10335c0.m12537m(enumC3172f0);
    }

    @Override // p021b7.InterfaceC1075c
    /* renamed from: y */
    public void mo6369y(int i10, Fragment fragment, String str) {
        if (fragment != null) {
            AbstractC0819t m4504m = m4617y0().m4504m();
            if (!fragment.m4342g0()) {
                m4504m.m4747c(i10, fragment, str);
            } else {
                m4504m.mo4566t(fragment);
            }
            m4504m.mo4560i();
        }
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: z */
    public void mo12175z() {
        this.f10335c0.mo12175z();
    }
}
