package com.roblox.client;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogC0152b;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.C2749c1;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.memstorage.MemStorage;
import p024bc.C1100c;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1154n;
import p101h8.C3439m;
import p176n6.C4069c;
import p189o7.C4146b;
import p225r6.C4448a;
import p239s7.C4531b;
import p239s7.C4537h;
import p288w8.C5469d;
import p288w8.C5476k;
import p299x6.C5556b;
import p300x7.C5559a;
import p300x7.C5560b;
import p300x7.C5562d;
import p300x7.C5563e;
import p314y8.C5911e;
import p314y8.EnumC5912f;

/* renamed from: com.roblox.client.i0 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2837i0 extends AbstractActivityC2841k0 implements C5911e.b {

    /* renamed from: R */
    public static int f11276R;

    /* renamed from: I */
    private DialogC0152b f11277I;

    /* renamed from: J */
    private DialogC0152b f11278J;

    /* renamed from: K */
    private DialogC0152b f11279K;

    /* renamed from: L */
    private ProgressDialog f11280L;

    /* renamed from: M */
    private boolean f11281M = false;

    /* renamed from: N */
    private C4146b f11282N = mo12161j1();

    /* renamed from: O */
    private C4448a f11283O = new C4448a();

    /* renamed from: P */
    protected Toolbar f11284P;

    /* renamed from: Q */
    protected C5911e f11285Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.i0$a */
    /* loaded from: classes.dex */
    public class a implements C4537h.d {
        a() {
        }

        @Override // p239s7.C4537h.d
        /* renamed from: a */
        public void mo12658a(boolean z10) {
            if (z10) {
                C1151k.m6712f("rbx.locale", "(OnAppResume) Recreating activity due to Locale change.");
                AbstractActivityC2837i0.this.recreate();
            } else {
                C1151k.m6712f("rbx.locale", "Retrieved locale same as current locale");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.i0$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnDismissListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            AbstractActivityC2837i0.this.f11277I = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.i0$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ C2749c1.d f11288n;

        /* renamed from: o */
        final /* synthetic */ Activity f11289o;

        /* renamed from: p */
        final /* synthetic */ String f11290p;

        /* renamed from: q */
        final /* synthetic */ g f11291q;

        /* renamed from: r */
        final /* synthetic */ boolean f11292r;

        c(C2749c1.d dVar, Activity activity, String str, g gVar, boolean z10) {
            this.f11288n = dVar;
            this.f11289o = activity;
            this.f11290p = str;
            this.f11291q = gVar;
            this.f11292r = z10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C1152l.m6737h(this.f11289o, this.f11290p);
            g gVar = this.f11291q;
            if (gVar != null) {
                gVar.m12659a(true, false);
            }
            if (C1134c.m6537a().mo6648t0() && this.f11292r) {
                AbstractActivityC2837i0.this.m12657y1(true, this.f11291q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.i0$d */
    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ g f11294n;

        d(g gVar) {
            this.f11294n = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            g gVar = this.f11294n;
            if (gVar != null) {
                gVar.m12659a(false, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.i0$e */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnClickListener {

        /* renamed from: n */
        final /* synthetic */ C2749c1.d f11296n;

        /* renamed from: o */
        final /* synthetic */ Activity f11297o;

        /* renamed from: p */
        final /* synthetic */ String f11298p;

        /* renamed from: q */
        final /* synthetic */ g f11299q;

        e(C2749c1.d dVar, Activity activity, String str, g gVar) {
            this.f11296n = dVar;
            this.f11297o = activity;
            this.f11298p = str;
            this.f11299q = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C1152l.m6737h(this.f11297o, this.f11298p);
            g gVar = this.f11299q;
            if (gVar != null) {
                gVar.m12659a(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.i0$f */
    /* loaded from: classes.dex */
    public static /* synthetic */ class f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11301a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f11301a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11301a[EnumC5912f.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11301a[EnumC5912f.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.roblox.client.i0$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void m12659a(boolean z10, boolean z11);
    }

    /* renamed from: l1 */
    private void m12640l1(DialogC0152b dialogC0152b) {
        if (dialogC0152b == null || !dialogC0152b.isShowing()) {
            return;
        }
        dialogC0152b.dismiss();
    }

    /* renamed from: n1 */
    private void m12641n1() {
        m12640l1(this.f11277I);
        this.f11277I = null;
    }

    /* renamed from: q1 */
    private void m12642q1() {
        super.setContentView(this.f11282N.m17195f(LayoutInflater.from(this), this));
    }

    /* renamed from: r1 */
    private void m12643r1(int i10) {
        m12642q1();
        LayoutInflater.from(this).inflate(i10, this.f11282N.m17193c());
    }

    /* renamed from: s1 */
    private void m12644s1(View view, ViewGroup.LayoutParams layoutParams) {
        m12642q1();
        this.f11282N.m17193c().addView(view, layoutParams);
    }

    /* renamed from: t1 */
    private void m12645t1(EnumC5912f enumC5912f) {
        int color;
        boolean z10 = enumC5912f != EnumC5912f.LIGHT;
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            getWindow().getDecorView().setSystemUiVisibility(z10 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        }
        if (C2877p0.m12927i0()) {
            if (f.f11301a[enumC5912f.ordinal()] != 1) {
                color = getResources().getColor(C2909v.f11707p);
            } else {
                color = getResources().getColor(C2909v.f11714w);
            }
            getWindow().setStatusBarColor(color);
        }
        getWindow().setNavigationBarColor(getResources().getColor(C2909v.f11704m));
    }

    /* renamed from: w1 */
    private void m12646w1() {
        DialogC0152b dialogC0152b = this.f11277I;
        if (dialogC0152b == null) {
            DialogC0152b m12463b = C2817d1.m12463b(this, getResources().getString(C2748c0.f10692m3));
            this.f11277I = m12463b;
            m12463b.setOnDismissListener(new b());
        } else if (!dialogC0152b.isShowing()) {
            this.f11277I.show();
        } else {
            C1151k.m6707a("RobloxActivity", "A network-disconnected alert already exists. Do nothing.");
        }
    }

    /* renamed from: z1 */
    private void m12647z1() {
        C1151k.m6712f("rbx.locale", "using new api on app resume. mIsAppResumedFromColdStart: " + this.f11281M);
        new C4537h().m18590c(this, new a());
    }

    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        int color;
        C1151k.m6707a("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + enumC5912f);
        Toolbar toolbar = this.f11284P;
        if (toolbar instanceof RobloxToolbar) {
            ((RobloxToolbar) toolbar).mo12200U(enumC5912f);
        }
        if (this.f11282N != null) {
            int i10 = f.f11301a[enumC5912f.ordinal()];
            if (i10 == 1) {
                color = getResources().getColor(C2909v.f11714w);
            } else if (i10 != 2) {
                color = getResources().getColor(C2909v.f11707p);
            } else {
                color = getResources().getColor(C2909v.f11693b);
            }
            this.f11282N.m17196g(color);
        }
        m12645t1(enumC5912f);
    }

    /* renamed from: g1 */
    public boolean m12648g1() {
        boolean z10 = !C2817d1.m12473l(this);
        if (z10) {
            m12646w1();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h1 */
    public void m12649h1() {
        m12641n1();
        if (this.f11278J == null) {
            this.f11278J = new DialogC0152b.a(this).m713s(C2748c0.f10716q3).m701g(C2748c0.f10686l3).m698d(false).m695a();
        }
        if (this.f11278J.isShowing()) {
            return;
        }
        this.f11278J.show();
    }

    /* renamed from: i1 */
    protected boolean mo12160i1() {
        return false;
    }

    /* renamed from: j1 */
    protected C4146b mo12161j1() {
        return new C4146b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public boolean m12650k1() {
        return C2877p0.m12884Q(this).getBoolean("ROBLOXCrash", false);
    }

    /* renamed from: m1 */
    public void m12651m1() {
        ProgressDialog progressDialog = this.f11280L;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f11280L.dismiss();
        this.f11280L = null;
    }

    /* renamed from: o1 */
    public C4146b m12652o1() {
        return this.f11282N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        C1151k.m6707a("RobloxActivity", "onActivityResult: requestCode = " + i10);
        if (i10 != 20103) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 == -1) {
            String packageName = intent.getComponent().getPackageName();
            C1151k.m6712f("RobloxActivity", "Sharing with=" + packageName + ".");
            startActivity(intent);
            C2822f0.m12501w(packageName);
            C5563e.m20379h().m20388A("Android-AppMain-GameShare-AppSelected");
            return;
        }
        C1151k.m6712f("RobloxActivity", "Sharing dialog dismissed.");
        C5563e.m20379h().m20388A("Android-AppMain-GameShare-ChooserDismissed");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C5476k.m20126A()) {
            C1151k.m6712f("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
            return;
        }
        C5560b.m20357e().m20366k(this, C5560b.d.APP_INIT_TYPE_SHELL);
        boolean z10 = this instanceof ActivitySplash;
        boolean m20104h = C5469d.m20104h();
        if (!m20104h && !z10) {
            C1151k.m6712f("RobloxActivity", "onCreate ... settingsLoaded = false. Load from preferences!!!");
            C5469d.m20108l(this);
        }
        C4531b.m18550f().m18570u(this);
        C5562d.m20371c().m20374d(this);
        super.onCreate(bundle);
        C1151k.m6707a("RobloxActivity", "activity onCreate, name = " + getClass().getSimpleName());
        mo12260S0();
        m12654u1();
        if (!m20104h && !mo12160i1()) {
            C1151k.m6712f("RobloxActivity", "onCreate: no AppSettings in activity:" + getClass().getSimpleName() + ". Finish self!");
            finish();
        }
        this.f11281M = true;
        C5911e c5911e = new C5911e(this);
        this.f11285Q = c5911e;
        c5911e.m21041b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onDestroy() {
        if (C5476k.m20126A()) {
            C1151k.m6712f("RobloxActivity", "onCreate: App was previously destroyed due to process death");
            super.onDestroy();
        } else {
            super.onDestroy();
            m12641n1();
            m12640l1(this.f11278J);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onResume() {
        super.onResume();
        C3439m.m15122c().m15130j(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        if (C5556b.m20348a() && C2877p0.m12957x0()) {
            C1151k.m6716j("RobloxActivity", "Alert: needs restart");
            m12649h1();
        }
        int i10 = f11276R;
        f11276R = i10 + 1;
        if (i10 == 0) {
            C1100c.m6458d().m6470n(C5559a.m20353a());
            C5560b.m20357e().m20367n(true);
            C2877p0.m12884Q(this).edit().putBoolean("ROBLOXCrash", true).apply();
            if (!this.f11281M) {
                m12647z1();
            }
        }
        C5563e.m20379h().m20430l0();
        this.f11281M = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        int i10 = f11276R - 1;
        f11276R = i10;
        if (i10 == 0) {
            C1100c.m6458d().m6471p(C5559a.m20353a());
            C5560b.m20357e().m20367n(false);
            if (C1134c.m6537a().mo6610g0()) {
                NativeReportingInterface.stopPushNotificationSession();
            }
            C2877p0.m12884Q(this).edit().remove("ROBLOXCrash").apply();
            C1151k.m6712f("RobloxActivity", "The Shell is in background.");
            C4069c.m16904s().m16923u();
            C4069c.m16904s().m16922t();
        }
        super.onStop();
    }

    /* renamed from: p1 */
    public void m12653p1(C5560b.f fVar) {
        C1151k.m6712f("RobloxActivity", "navigateToPostLogoutUI: logoutType = " + fVar + ", foreground = " + m12674c1());
        C1151k.m6712f("RobloxActivity", "navigateToPostLogoutUI: [New Startup] Launch Main activity...");
        startActivity(C2872n.m12830h().m12838i(this));
        if (fVar != C5560b.f.LOGOUT_BY_USER_IN_LUA) {
            C1151k.m6712f("RobloxActivity", "navigateToPostLogoutUI: notify Lua about this 401 logout condition");
            MemStorage.fire("NativeShellEvent", "NETWORK_ERROR_401");
        }
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        m12643r1(i10);
    }

    /* renamed from: u1 */
    protected void m12654u1() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(1280);
        this.f11311E.m17188d(decorView);
    }

    /* renamed from: v1 */
    public void m12655v1(Context context) {
        String string = getString(C2748c0.f10647f0);
        String string2 = getString(C2748c0.f10653g0);
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(string);
        progressDialog.setMessage(string2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        this.f11280L = progressDialog;
        progressDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x1 */
    public void m12656x1(boolean z10) {
        m12657y1(z10, null);
    }

    /* renamed from: y1 */
    protected void m12657y1(boolean z10, g gVar) {
        String string;
        if (C2877p0.m12935m0()) {
            C1154n.m6741a(this, C2748c0.f10746v3);
            if (z10) {
                finish();
                return;
            }
            return;
        }
        m12640l1(this.f11277I);
        m12640l1(this.f11279K);
        String packageName = getPackageName();
        C2749c1.d m12247d = C2749c1.m12245e().m12247d();
        String string2 = getString(C1152l.m6733d() ? C2748c0.f10549M2 : C2748c0.f10579S2);
        if (C1152l.m6736g()) {
            string = getString(C2748c0.f10718r);
        } else {
            string = getString(C2748c0.f10730t, new Object[]{string2});
        }
        if (z10) {
            m12640l1(this.f11278J);
            if (C4448a.m18266a(getIntent())) {
                C4448a.m18267b(this, true, m12247d);
                return;
            }
            this.f11279K = new DialogC0152b.a(this).m713s(C2748c0.f10724s).m702h(string).m710p(C2748c0.f10712q, new c(m12247d, this, packageName, gVar, z10)).m695a();
        } else {
            this.f11279K = new DialogC0152b.a(this).m713s(C2748c0.f10724s).m702h(string).m710p(C2748c0.f10712q, new e(m12247d, this, packageName, gVar)).m703i(C2748c0.f10706p, new d(gVar)).m695a();
        }
        this.f11279K.setCancelable(false);
        this.f11279K.show();
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m12644s1(view, null);
    }

    @Override // androidx.appcompat.app.ActivityC0153c, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m12644s1(view, layoutParams);
    }
}
