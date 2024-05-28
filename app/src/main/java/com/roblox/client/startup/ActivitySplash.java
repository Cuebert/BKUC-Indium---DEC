package com.roblox.client.startup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.Indium.IndiumMain;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2822f0;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import com.roblox.client.components.LoadingBar;
import com.roblox.client.pushnotification.notificationreceivers.AbstractC2881a;
import com.roblox.client.startup.C2904a;
import com.roblox.engine.jni.NativeReportingInterface;
import ma.C3969a;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1153m;
import p035c9.C1154n;
import p061e7.C3089j;
import p101h8.C3439m;
import p101h8.C3442p;
import p101h8.C3444r;
import p144ka.C3769a;
import p176n6.C4070d;
import p176n6.C4072f;
import p177n7.C4073a;
import p189o7.C4146b;
import p189o7.C4147c;
import p288w8.C5476k;
import p288w8.EnumC5480o;
import p288w8.InterfaceC5477l;
import p299x6.C5556b;
import p300x7.C5560b;
import p300x7.C5563e;

/* loaded from: classes.dex */
public class ActivitySplash extends AbstractActivityC2837i0 implements InterfaceC5477l, C2904a.b {

    /* renamed from: c0 */
    private static boolean f11642c0 = true;

    /* renamed from: d0 */
    private static boolean f11643d0;

    /* renamed from: S */
    private LoadingBar f11644S;

    /* renamed from: T */
    private Runnable f11645T;

    /* renamed from: U */
    private long f11646U;

    /* renamed from: V */
    private Handler f11647V = new Handler();

    /* renamed from: W */
    private boolean f11648W = false;

    /* renamed from: X */
    private Intent f11649X;

    /* renamed from: Y */
    private boolean f11650Y;

    /* renamed from: Z */
    private boolean f11651Z;

    /* renamed from: a0 */
    private EnumC5480o f11652a0;

    /* renamed from: b0 */
    private boolean f11653b0;

    /* renamed from: com.roblox.client.startup.ActivitySplash$a */
    /* loaded from: classes.dex */
    public class RunnableC2903a implements Runnable {
        RunnableC2903a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivitySplash.this.f11645T = null;
            ActivitySplash.this.f11644S.setVisibility(0);
        }
    }

    /* renamed from: C1 */
    public static Intent m13160C1(Context context, EnumC5480o enumC5480o) {
        Intent intent = new Intent(context, (Class<?>) ActivitySplash.class);
        C1151k.m6712f("rbx.splash", "buildIntent for: " + enumC5480o);
        intent.putExtra("STARTED_FOR_INTENT_KEY", enumC5480o);
        return intent;
    }

    /* renamed from: D1 */
    private void m13161D1() {
        Runnable runnable = this.f11645T;
        if (runnable != null) {
            this.f11647V.removeCallbacks(runnable);
            this.f11645T = null;
        }
    }

    /* renamed from: E1 */
    private void m13162E1() {
        C2904a.m13171q2(this);
    }

    /* renamed from: F1 */
    public static boolean m13163F1() {
        return f11643d0;
    }

    /* renamed from: G1 */
    private void m13164G1(boolean z10) {
        m13165H1();
        C4072f.m16936a("LaunchActivityNativeMain");
        C4070d.m16926b().m16928d();
        if (isFinishing()) {
            C1151k.m6712f("rbx.splash", "isFinishing");
            return;
        }
        C1151k.m6712f("rbx.splash", "launchMainActivity");
        Intent m12838i = C2872n.m12830h().m12838i(this);
        if (z10) {
            C2822f0.m12480b("protocolLaunch");
        }
        if (this.f11651Z) {
            m12838i.putExtra("loginAfterSignup", true);
        }
        if (this.f11649X.getExtras() != null) {
            m12838i.putExtras(this.f11649X.getExtras());
        }
        startActivity(m12838i);
        overridePendingTransition(0, 0);
        finish();
    }

    /* renamed from: H1 */
    private void m13165H1() {
        if (this.f11652a0 != EnumC5480o.LOADED_FROM_PUSH_NOTIFICATION) {
            return;
        }
        Bundle extras = this.f11649X.getExtras();
        if (extras != null) {
            C3439m.m15122c().m15138r(extras);
        }
        String string = extras.getString("EXTRA_NOTIFICATION_TYPE", BuildConfig.FLAVOR);
        String string2 = extras.getString("EXTRA_NOTIFICATION_VERSION", BuildConfig.FLAVOR);
        String string3 = extras.getString("EXTRA_NOTIFICATION_ID", BuildConfig.FLAVOR);
        if (string2.isEmpty()) {
            if (string == "ChatNewMessage") {
                C3442p.m15144c().m15152i(extras.getString("EXTRA_CATEGORY", BuildConfig.FLAVOR));
            } else {
                C3442p.m15144c().m15147d(string).clear();
                AbstractC2881a.m12987j(this.f11649X, this);
            }
        }
        C2822f0.m12495q("clicked", new C3444r().m15156a(this, "GcmPlatform"), string, string3, C1153m.m6738a(this), true, string2);
    }

    /* renamed from: I1 */
    private void m13166I1() {
        C3089j m13595b = C3089j.m13595b();
        m13595b.m13598d(C1134c.m6537a().mo6626l1());
        m13595b.m13597c(C2877p0.m12908b0());
    }

    /* renamed from: J1 */
    private void m13167J1(int i10) {
        C3969a.m16695e().m16697b("retry_during_splash");
        C2904a.m13173t2(this, i10);
    }

    /* renamed from: K1 */
    private void m13168K1() {
        C1151k.m6712f("rbx.splash", "startup:");
        m13169L1(true);
        C5476k.m20155t(this).m20167Q();
    }

    /* renamed from: L1 */
    private void m13169L1(boolean z10) {
        if (C2877p0.m12935m0()) {
            C1151k.m6707a("rbx.splash", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        if (z10) {
            if (f11642c0) {
                f11642c0 = false;
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11646U;
                if (elapsedRealtime >= 5000) {
                    this.f11644S.setVisibility(0);
                    return;
                }
                this.f11647V = new Handler();
                RunnableC2903a runnableC2903a = new RunnableC2903a();
                this.f11645T = runnableC2903a;
                this.f11647V.postDelayed(runnableC2903a, 5000 - elapsedRealtime);
                return;
            }
            this.f11644S.setVisibility(0);
            return;
        }
        m13161D1();
        this.f11644S.setVisibility(8);
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: B */
    public void mo12145B() {
        C5563e.m20379h().m20433q(this.f11648W);
        m13166I1();
        if (m12674c1()) {
            C1151k.m6712f("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now...");
            this.f11653b0 = true;
            C5476k.m20155t(this).m20170U(this);
            m13164G1(this.f11652a0 == EnumC5480o.PROTOCOL_LAUNCH);
            finish();
        }
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: G */
    public void mo12148G() {
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: H */
    public void mo12149H() {
        if (C2877p0.m12935m0()) {
            C1154n.m6741a(this, C2748c0.f10692m3);
            finish();
        } else {
            m13169L1(false);
            if (m12674c1()) {
                m13167J1(C2748c0.f10692m3);
            }
        }
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: S */
    public void mo12153S() {
        C4072f.m16936a("NavigateToLandingScreen");
        if (m12674c1()) {
            m13164G1(false);
        }
    }

    @Override // p288w8.InterfaceC5477l
    /* renamed from: h */
    public void mo12159h() {
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

    @Override // com.roblox.client.startup.C2904a.b
    /* renamed from: n */
    public void mo12165n() {
        m13162E1();
        m13168K1();
    }

    @Override // com.roblox.client.startup.C2904a.b
    /* renamed from: n0 */
    public void mo12166n0() {
        m13162E1();
        m13168K1();
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        IndiumMain.Start(this);
        C3969a.m16695e().m16697b("splash_activity_oncreate");
        super.onCreate(bundle);
        C3769a.m16020c(this);
        C3769a.m16021d().m16022a(C3769a.a.SPLASH, bundle);
        this.f11646U = SystemClock.elapsedRealtime();
        this.f11649X = getIntent();
        C4072f.m16937b();
        C4072f.m16936a("LaunchApp");
        if (C1134c.m6537a().mo6638p1()) {
            C2872n.m12830h().m12847r(this);
        }
        NativeReportingInterface.initAppShellReporter();
        EnumC5480o enumC5480o = (EnumC5480o) this.f11649X.getSerializableExtra("STARTED_FOR_INTENT_KEY");
        this.f11652a0 = enumC5480o;
        if (enumC5480o == null) {
            this.f11652a0 = EnumC5480o.SYSTEM;
        }
        C1151k.m6707a("rbx.splash", "Started for: " + this.f11652a0);
        EnumC5480o enumC5480o2 = this.f11652a0;
        this.f11650Y = enumC5480o2 == EnumC5480o.SHELL_PROCESS_RESTART_FOR_RESULT || enumC5480o2 == EnumC5480o.AFTER_LOGIN_FOR_RESULT;
        this.f11651Z = enumC5480o2 == EnumC5480o.AFTER_SIGN_UP;
        C1151k.m6712f("rbx.splash", "onCreate: startedForResult=" + this.f11650Y + ", appRestarted=" + (enumC5480o2 == EnumC5480o.APP_RESTART));
        setContentView(C2738a0.f10416g);
        this.f11644S = (LoadingBar) findViewById(C2915y.f11919z0);
        if (C5556b.m20348a()) {
            String m12862F = C2877p0.m12862F();
            if (!TextUtils.isEmpty(m12862F)) {
                Toast.makeText(this, "Using " + m12862F, 1).show();
            }
        }
        C4073a.m16940i();
        this.f11648W = m12650k1();
        if (bundle == null) {
            C5560b.m20357e().m20362b(this);
        }
        if (C5556b.m20348a() && C2877p0.m12957x0()) {
            C1151k.m6716j("rbx.splash", "Alert: needs restart");
            m12649h1();
        } else {
            C5476k.m20155t(this).m20165O(this.f11652a0);
            C5476k.m20155t(this).m20166P(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1151k.m6712f("rbx.splash", "onDestroy: unset the activity from InitHelper.");
        C5476k.m20155t(this).m20170U(this);
    }

    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C1151k.m6712f("rbx.splash", "onNewIntent: intent=" + intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPause() {
        super.onPause();
        C3969a.m16695e().m16697b("splash_activity_onpause");
        C1151k.m6707a("rbx.splash", "onPause: isFinishing = " + isFinishing());
        m13161D1();
        if (this.f11653b0) {
            return;
        }
        C4070d.m16926b().m16934j();
        C3769a.m16021d().m16023b(C3769a.a.SPLASH);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onResume() {
        super.onResume();
        C1151k.m6707a("rbx.splash", "onResume:");
        m13162E1();
        m13168K1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        f11643d0 = true;
        C2822f0.m12498t("splash");
    }
}
