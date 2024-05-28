package p074f7;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.C0587a;
import androidx.fragment.app.ActivityC0803d;
import ba.C1086g;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.AbstractActivityC2841k0;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.C2748c0;
import com.roblox.client.C2827g;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import com.roblox.client.InterfaceC2893s;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.RobloxApplication;
import com.roblox.client.components.C2808i;
import com.roblox.client.pushnotification.p038v2.RealtimeNotificationForegroundService;
import com.roblox.engine.jni.EngineExitJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import ga.C3320a;
import ga.C3321b;
import ga.C3322c;
import p023b9.C1079c;
import p033c7.C1134c;
import p035c9.C1151k;
import p062e8.C3091b;
import p062e8.InterfaceC3090a;
import p074f7.C3195x;
import p076f9.C3211e;
import p090g9.C3319b;
import p117ia.C3548a;
import p215q8.C4330a;
import p239s7.C4531b;
import p300x7.C5563e;
import pa.C4281a;

/* renamed from: f7.n */
/* loaded from: classes.dex */
public class C3185n implements InterfaceC3174g0, InterfaceC3090a, C3195x.a, C1086g.a {

    /* renamed from: N */
    private static boolean f13256N;

    /* renamed from: A */
    private C3091b f13257A;

    /* renamed from: B */
    private C2872n f13258B;

    /* renamed from: C */
    private int f13259C;

    /* renamed from: D */
    private long f13260D;

    /* renamed from: E */
    private AbstractC3180j0 f13261E;

    /* renamed from: G */
    private C3182k0 f13263G;

    /* renamed from: H */
    private C3169e f13264H;

    /* renamed from: I */
    private ViewGroup f13265I;

    /* renamed from: J */
    private ViewTreeObserver.OnGlobalLayoutListener f13266J;

    /* renamed from: K */
    private long f13267K;

    /* renamed from: n */
    protected C3178i0 f13270n;

    /* renamed from: q */
    private boolean f13273q;

    /* renamed from: r */
    private CountDownTimer f13274r;

    /* renamed from: s */
    private d f13275s;

    /* renamed from: t */
    private final Bundle f13276t;

    /* renamed from: x */
    private SurfaceHolderCallbackC3194w f13280x;

    /* renamed from: z */
    private Handler f13282z;

    /* renamed from: o */
    private final String f13271o = "ExperienceSession";

    /* renamed from: p */
    private boolean f13272p = false;

    /* renamed from: u */
    private final long f13277u = 30000;

    /* renamed from: v */
    private final f f13278v = new f();

    /* renamed from: w */
    private final C3211e f13279w = new C3211e();

    /* renamed from: y */
    private ViewTreeObserverOnGlobalLayoutListenerC3196y f13281y = null;

    /* renamed from: F */
    private ServiceConnection f13262F = null;

    /* renamed from: L */
    private boolean f13268L = false;

    /* renamed from: M */
    private boolean f13269M = false;

    /* renamed from: f7.n$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3185n.this.m13954U();
        }
    }

    /* renamed from: f7.n$b */
    /* loaded from: classes.dex */
    public class b extends EngineExitJavaCallback2 {
        b() {
        }

        @Override // com.roblox.engine.jni.EngineExitJavaCallback2
        /* renamed from: a */
        public void mo13257a() {
            C1151k.m6712f("ExperienceSession", "... (onCreate) gameDidLeave callback invoked.");
            C3185n.this.m13918B();
            C3185n.this.m13951Q(true);
        }
    }

    /* renamed from: f7.n$c */
    /* loaded from: classes.dex */
    public class c extends CountDownTimer {
        c(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C1151k.m6712f("ExperienceSession", "CountDownTimer::onFinish -> onGameTimeoutInBackground()");
            C3185n.this.m13945x();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    /* renamed from: f7.n$d */
    /* loaded from: classes.dex */
    public interface d extends InterfaceC2893s {
        /* renamed from: F */
        void mo12147F(Bundle bundle);

        /* renamed from: f0 */
        ActivityC0803d mo12157f0();

        /* renamed from: o */
        void mo12167o();
    }

    /* renamed from: f7.n$e */
    /* loaded from: classes.dex */
    private class e extends AbstractC3180j0 {
        private e() {
        }

        @Override // p074f7.AbstractC3180j0
        /* renamed from: h */
        public void mo13913h(int i10) {
            C1151k.m6712f("rbx.game.orientation", "setting orientation: " + i10);
            C3185n.this.m13947C().setRequestedOrientation(i10);
        }

        /* synthetic */ e(C3185n c3185n, a aVar) {
            this();
        }
    }

    /* renamed from: f7.n$f */
    /* loaded from: classes.dex */
    public class f {
        public f() {
        }

        /* renamed from: a */
        public C3319b m13968a() {
            if (C3185n.this.m13947C() == null) {
                return null;
            }
            return C3319b.m14597a(C3185n.this.f13265I.getRootView(), C3185n.this.m13947C().getWindowManager(), null, ((AbstractActivityC2837i0) C3185n.this.m13947C()).m12673Z0().m17187c());
        }
    }

    public C3185n(Bundle bundle) {
        this.f13276t = bundle;
    }

    /* renamed from: A */
    private void m13917A() {
        C1151k.m6712f("ExperienceSession", "Exiting immersive mode");
        ((AbstractActivityC2837i0) m13947C()).m12652o1().m17197i(EnumC3172f0.APP);
        m13947C().getWindow().getDecorView().setSystemUiVisibility(this.f13259C);
    }

    /* renamed from: B */
    public void m13918B() {
        C1151k.m6712f("ExperienceSession", "finishGame:");
        if (((ActivityC0803d) m13947C()) != null) {
            m13928X();
            m13967y(false);
        }
    }

    /* renamed from: F */
    private void m13919F() {
        m13918B();
        m13951Q(false);
    }

    /* renamed from: G */
    private void m13920G() {
        View findViewById = m13947C().findViewById(C2915y.f11781A0);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return;
        }
        findViewById.post(new Runnable() { // from class: f7.k

            /* renamed from: n */
            public final /* synthetic */ View f13249n;

            public /* synthetic */ RunnableC3181k(View findViewById2) {
                r1 = findViewById2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r1.setVisibility(8);
            }
        });
    }

    /* renamed from: H */
    private void m13921H(View view) {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(C2915y.f11859f0);
        rbxKeyboard.setBackgroundColor(0);
        C2808i.m12429d(rbxKeyboard, m13948D(), "SourceSansPro-Regular.ttf");
        this.f13281y = new ViewTreeObserverOnGlobalLayoutListenerC3196y(rbxKeyboard, this.f13280x, this.f13278v);
        RobloxApplication.m12215a().registerComponentCallbacks(this.f13281y);
    }

    /* renamed from: J */
    public /* synthetic */ void m13922J() {
        m13947C().getWindow().clearFlags(128);
        m13928X();
        m13947C().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        m13917A();
    }

    /* renamed from: M */
    public /* synthetic */ void m13924M(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        m13919F();
    }

    /* renamed from: N */
    public /* synthetic */ void m13925N(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        m13919F();
    }

    /* renamed from: O */
    public /* synthetic */ void m13926O(int i10) {
        C4531b.m18550f().m18570u(m13948D());
        new AlertDialog.Builder(m13948D()).setMessage(i10).setNegativeButton(m13947C().getString(C2748c0.f10638d3), new DialogInterface.OnClickListener() { // from class: f7.i
            public /* synthetic */ DialogInterfaceOnClickListenerC3177i() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C3185n.this.m13924M(dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: f7.h
            public /* synthetic */ DialogInterfaceOnCancelListenerC3175h() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C3185n.this.m13925N(dialogInterface);
            }
        }).create().show();
    }

    /* renamed from: P */
    public /* synthetic */ void m13927P(int i10) {
        if (this.f13272p || (i10 & 4) != 0) {
            return;
        }
        m13946z();
    }

    /* renamed from: X */
    private void m13928X() {
        if (this.f13266J != null) {
            C1151k.m6707a("rbx.screen", "removing GlobalLayoutListener");
            this.f13265I.getViewTreeObserver().removeOnGlobalLayoutListener(this.f13266J);
            this.f13266J = null;
        }
    }

    /* renamed from: Y */
    private void m13929Y() {
        if (this.f13260D > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13260D;
            C1151k.m6712f("ExperienceSession", "Game duration: " + elapsedRealtime + "ms.");
            C5563e.m20379h().m20435u(m13948D(), elapsedRealtime);
        }
    }

    /* renamed from: b0 */
    private void m13930b0() {
        long m14599a = C1134c.m6537a().mo6639q() ? new C3320a(C3321b.m14606i().m14607d("Backgrounding.General"), 30000L).m14599a() : 30000L;
        C1151k.m6712f("ExperienceSession", "CountDownTimer constructed with delay:" + m14599a);
        this.f13274r = new c(m14599a, 1000L).start();
    }

    /* renamed from: c0 */
    private synchronized void m13931c0(boolean z10) {
        if (this.f13268L) {
            return;
        }
        this.f13268L = true;
        NativeReportingInterface.gameForegrounded();
        if (z10) {
            NativeGLInterface.nativeOnExperienceSessionResume();
        } else {
            NativeGLInterface.nativeOnFragmentStart();
        }
        C3548a.m15354f().m15356d();
        if (this.f13263G == null) {
            C3182k0 c3182k0 = new C3182k0(m13948D());
            this.f13263G = c3182k0;
            c3182k0.m13915a();
        }
        if (this.f13264H == null) {
            C3169e c3169e = new C3169e(m13948D());
            this.f13264H = c3169e;
            c3169e.m13897p();
        }
    }

    /* renamed from: d0 */
    private synchronized void m13932d0(boolean z10) {
        if (this.f13268L) {
            this.f13268L = false;
            NativeReportingInterface.gameBackgrounded();
            if (z10) {
                NativeGLInterface.nativeOnExperienceSessionPause();
            } else {
                NativeGLInterface.nativeOnFragmentStop();
            }
            C3548a.m15354f().m15357e();
            C3182k0 c3182k0 = this.f13263G;
            if (c3182k0 != null) {
                c3182k0.m13916b();
                this.f13263G = null;
            }
            C3169e c3169e = this.f13264H;
            if (c3169e != null) {
                c3169e.m13899r();
                this.f13264H = null;
            }
        }
    }

    /* renamed from: f0 */
    private void m13933f0(long j10) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f13282z, new C3195x(this, this.f13281y, j10)));
        NativeGLJavaInterface.setExitImplementation(new b());
    }

    /* renamed from: h0 */
    private void m13934h0(long j10) {
        Window window;
        if (Build.VERSION.SDK_INT >= 28) {
            boolean m14609a = C1134c.m6537a().mo6569P() ? new C3322c(C3321b.m14606i().m14607d("Engine.Interactivity.UICreation.NotchScreenSupport"), j10).m14609a() : false;
            if (!C1134c.m6537a().mo6616i0()) {
                if (m14609a) {
                    m13947C().getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                    mo12554m().m12673Z0().m17188d(m13947C().getWindow().getDecorView());
                    C3178i0 c3178i0 = new C3178i0(m13948D());
                    this.f13270n = c3178i0;
                    c3178i0.m13910f(mo12554m(), mo12554m().m12673Z0().m17185a());
                    return;
                }
                C4281a.m17722b().m17723a(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            if (this.f13275s == null || (window = m13947C().getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (m14609a) {
                attributes.layoutInDisplayCutoutMode = 1;
                mo12554m().m12673Z0().m17188d(window.getDecorView());
                if (this.f13270n == null) {
                    this.f13270n = new C3178i0(m13948D());
                }
                this.f13270n.m13910f(mo12554m(), mo12554m().m12673Z0().m17185a());
                return;
            }
            attributes.layoutInDisplayCutoutMode = 0;
            C4281a.m17722b().m17723a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: w */
    private void m13944w() {
        C1151k.m6712f("ExperienceSession", "GameSession cancelScheduledGameExit");
        CountDownTimer countDownTimer = this.f13274r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f13274r = null;
        }
    }

    /* renamed from: x */
    public void m13945x() {
        if (m13947C() != null) {
            C1151k.m6712f("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            m13967y(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        m13951Q(true);
    }

    /* renamed from: z */
    private void m13946z() {
        C1151k.m6712f("ExperienceSession", "Entering immersive mode");
        C1151k.m6712f("ExperienceSession", "System visibility " + this.f13259C);
        if (this.f13259C == 0) {
            this.f13259C = m13947C().getWindow().getDecorView().getSystemUiVisibility();
        }
        m13947C().getWindow().getDecorView().setSystemUiVisibility(5894);
        ((ActivityNativeMain) m13947C()).m12652o1().m17197i(EnumC3172f0.EXPERIENCE);
        ((ActivityNativeMain) m13947C()).m12652o1().mo17192b(0, 0, 0, 0);
    }

    /* renamed from: C */
    public Activity m13947C() {
        return this.f13275s.mo12157f0();
    }

    /* renamed from: D */
    public Context m13948D() {
        return this.f13275s.mo12157f0();
    }

    /* renamed from: E */
    public float m13949E() {
        return this.f13279w.m14259b(m13948D());
    }

    /* renamed from: I */
    public boolean m13950I() {
        d dVar = this.f13275s;
        if (dVar != null) {
            return dVar.mo12154a();
        }
        return false;
    }

    @Override // ba.C1086g.a
    /* renamed from: K */
    public void mo6428K(String str) {
    }

    /* renamed from: Q */
    public void m13951Q(boolean z10) {
        C1151k.m6712f("ExperienceSession", "onGameEnded: success = " + z10 + ", hasGameStarted = " + this.f13273q);
        this.f13273q = false;
    }

    /* renamed from: R */
    public void m13952R() {
        C1151k.m6707a("ExperienceSession", "onSurfaceCreated: finished = " + this.f13272p);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    /* renamed from: S */
    public void m13953S() {
        C1151k.m6707a("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f13272p);
    }

    @Override // ba.C1086g.a
    /* renamed from: T */
    public void mo6429T(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f13268L) {
            C1151k.m6712f("ExperienceSession", "Call init, starting foreground service " + str2);
            if (Long.toString(C1079c.m6380c().m6389j()).equals(str3)) {
                str5 = str6;
            } else if (!Long.toString(C1079c.m6380c().m6389j()).equals(str4)) {
                C1151k.m6712f("ExperienceSession", "Init call does not represent current user");
                return;
            }
            C0587a.m3037k(m13948D(), RealtimeNotificationForegroundService.m12997b(m13948D(), str2, str5, str));
        }
    }

    /* renamed from: U */
    public void m13954U() {
        if (C1134c.m6537a().mo6663z0() && C1086g.m6420y().m6423i()) {
            C1151k.m6712f("ExperienceSession", "Not pausing game session, user is in a call");
            this.f13269M = true;
            return;
        }
        C1151k.m6712f("ExperienceSession", "Pause game session");
        this.f13258B.m12846q().m17716d();
        m13932d0(true);
        m13930b0();
        m13928X();
    }

    /* renamed from: V */
    public void m13955V(Runnable runnable) {
        this.f13282z.post(runnable);
    }

    @Override // ba.C1086g.a
    /* renamed from: W */
    public void mo6430W(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f13268L) {
            C1151k.m6712f("ExperienceSession", "Call active, starting foreground service " + str2);
            if (Long.toString(C1079c.m6380c().m6389j()).equals(str3)) {
                str5 = str6;
            } else if (!Long.toString(C1079c.m6380c().m6389j()).equals(str4)) {
                C1151k.m6712f("ExperienceSession", "Active call does not represent current user");
                return;
            }
            C0587a.m3037k(m13948D(), RealtimeNotificationForegroundService.m12997b(m13948D(), str2, str5, str));
        }
    }

    /* renamed from: Z */
    public void m13956Z() {
        C1151k.m6712f("ExperienceSession", "Resume game session");
        this.f13269M = false;
        m13931c0(true);
        m13944w();
        this.f13258B.m12846q().m17717e();
    }

    @Override // p074f7.C3195x.a
    /* renamed from: a */
    public void mo13957a(int i10) {
        if (this.f13261E == null) {
            this.f13261E = new e(this, null);
        }
        this.f13261E.m12407e(Integer.valueOf(i10));
    }

    @Override // ba.C1086g.a
    /* renamed from: a0 */
    public void mo6431a0(String str) {
    }

    @Override // p074f7.C3195x.a
    /* renamed from: b */
    public void mo13958b(boolean z10) {
        this.f13275s.mo12155b(z10);
    }

    @Override // p074f7.C3195x.a
    /* renamed from: c */
    public void mo13959c(long j10, String str, String str2) {
        this.f13257A.m13607i(j10, str, str2);
    }

    @Override // p074f7.C3195x.a
    /* renamed from: d */
    public void mo13960d(int i10) {
        m13955V(new Runnable() { // from class: f7.m

            /* renamed from: o */
            public final /* synthetic */ int f13255o;

            public /* synthetic */ RunnableC3184m(int i102) {
                r2 = i102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3185n.this.m13926O(r2);
            }
        });
    }

    @Override // p074f7.InterfaceC3174g0
    /* renamed from: e */
    public void mo13902e(long j10) {
        d dVar;
        C1151k.m6712f("ExperienceSession", "onGameStarted: placeId = " + j10);
        this.f13273q = true;
        this.f13258B.m12846q().m17713a();
        if (!C1134c.m6537a().mo6615i() || (dVar = this.f13275s) == null) {
            return;
        }
        dVar.mo12167o();
    }

    /* renamed from: e0 */
    public void m13961e0(d dVar) {
        this.f13275s = dVar;
    }

    @Override // p074f7.C3195x.a
    /* renamed from: f */
    public void mo13962f(String str, String str2, String str3) {
        C2827g.m12524g(this.f13275s.mo12157f0(), str, str2, str3);
    }

    @Override // p074f7.InterfaceC3174g0
    /* renamed from: g */
    public void mo13903g() {
        C1151k.m6712f("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (m13947C().isFinishing()) {
            return;
        }
        m13947C().setResult(103);
        m13967y(false);
    }

    @Override // ba.C1086g.a
    /* renamed from: g0 */
    public void mo6432g0(String str, String str2) {
        if (this.f13269M) {
            this.f13282z.post(new a());
            this.f13269M = false;
        }
    }

    @Override // p074f7.C3195x.a
    /* renamed from: h */
    public void mo13963h(long j10) {
        C1151k.m6712f("ExperienceSession", "onGameLoaded: placeId = " + j10);
        ViewTreeObserverOnGlobalLayoutListenerC3196y viewTreeObserverOnGlobalLayoutListenerC3196y = this.f13281y;
        if (viewTreeObserverOnGlobalLayoutListenerC3196y != null) {
            viewTreeObserverOnGlobalLayoutListenerC3196y.m14021C(j10);
        }
        this.f13260D = SystemClock.elapsedRealtime();
    }

    @Override // p074f7.InterfaceC3174g0
    /* renamed from: i */
    public void mo13904i(long j10) {
        C1151k.m6712f("ExperienceSession", "onGameStarting: placeId = " + j10);
        this.f13258B.m12846q().m17714b();
    }

    /* renamed from: i0 */
    public void m13964i0() {
        C1151k.m6712f("ExperienceSession", "Start game session");
        this.f13282z = new Handler(Looper.getMainLooper());
        this.f13257A = new C3091b(this, true);
        m13946z();
        m13947C().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: f7.j
            public /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC3179j() {
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i10) {
                C3185n.this.m13927P(i10);
            }
        });
        m13920G();
        Bundle bundle = this.f13276t;
        this.f13265I = (ViewGroup) m13947C().findViewById(C2915y.f11858f);
        if (!C1134c.m6537a().mo6628m0()) {
            m13934h0(0L);
            if (!AbstractC3180j0.m13912j()) {
                this.f13275s.mo12146E();
            }
        }
        this.f13258B = C2872n.m12830h();
        C3166c0 c3166c0 = new C3166c0(bundle);
        this.f13267K = bundle.getLong("roblox_placeId", 0L);
        if (C1134c.m6537a().mo6628m0()) {
            m13934h0(this.f13267K);
            if (!AbstractC3180j0.m13912j()) {
                this.f13275s.mo12146E();
            }
        }
        C2877p0.m12897W0();
        if (!f13256N) {
            f13256N = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        C2877p0.m12895V0();
        SurfaceHolderCallbackC3194w surfaceHolderCallbackC3194w = new SurfaceHolderCallbackC3194w(this, c3166c0);
        this.f13280x = surfaceHolderCallbackC3194w;
        surfaceHolderCallbackC3194w.m13994A(null, null, null);
        m13921H(this.f13265I);
        m13933f0(this.f13267K);
        this.f13266J = this.f13281y;
        this.f13265I.getViewTreeObserver().addOnGlobalLayoutListener(this.f13266J);
        m13931c0(false);
        NativeReportingInterface.applicationBackgrounded();
        m13947C().getWindow().addFlags(128);
        C1086g.m6420y().m6421g(this);
    }

    @Override // p074f7.C3195x.a
    /* renamed from: j */
    public void mo13965j(long j10, String str) {
        this.f13257A.m13605g(j10, str);
    }

    @Override // p074f7.C3195x.a
    /* renamed from: k */
    public void mo13966k(long j10, String str, String str2) {
        this.f13257A.m13606h(j10, str, str2);
    }

    @Override // p062e8.InterfaceC3090a
    /* renamed from: m */
    public AbstractActivityC2841k0 mo12554m() {
        return (AbstractActivityC2837i0) m13947C();
    }

    @Override // ba.C1086g.a
    /* renamed from: p */
    public void mo6433p(String str, boolean z10) {
    }

    /* renamed from: y */
    public void m13967y(boolean z10) {
        C1151k.m6712f("ExperienceSession", "Ending game session with place ID " + this.f13267K);
        this.f13269M = false;
        C1086g.m6420y().m6426x(this);
        if (!z10) {
            NativeReportingInterface.applicationForegrounded();
        }
        m13932d0(false);
        if (this.f13272p) {
            C1151k.m6716j("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f13272p = true;
        m13929Y();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", 102);
        boolean isChangingConfigurations = true ^ m13947C().isChangingConfigurations();
        C1151k.m6712f("ExperienceSession", "onDestroy: shutdown = " + isChangingConfigurations + ", hasGameStarted = " + this.f13273q);
        if (isChangingConfigurations && this.f13273q) {
            C1151k.m6712f("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z10) {
                this.f13280x.m13996k();
            } else {
                this.f13280x.m13995D();
            }
        }
        m13947C().runOnUiThread(new Runnable() { // from class: f7.l
            public /* synthetic */ RunnableC3183l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3185n.this.m13922J();
            }
        });
        NativeGLJavaInterface.setExitImplementation(null);
        this.f13275s.mo12147F(bundle);
        RobloxApplication.m12215a().unregisterComponentCallbacks(this.f13281y);
        C4330a.m17860b("SessionReporterState_GameExit", this.f13267K);
    }
}
