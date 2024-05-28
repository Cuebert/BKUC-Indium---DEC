package p074f7;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2877p0;
import com.roblox.client.C2915y;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.C2940a;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p023b9.C1079c;
import p035c9.C1151k;
import p062e8.InterfaceC3093d;
import p075f8.C3205h;
import p076f9.C3213g;
import p215q8.C4330a;
import p288w8.C5469d;
import p325z6.AsyncTaskC6013a;

/* renamed from: f7.w */
/* loaded from: classes.dex */
public class SurfaceHolderCallbackC3194w implements SurfaceHolder.Callback {

    /* renamed from: n */
    private C3166c0 f13296n;

    /* renamed from: p */
    private FrameLayout f13298p;

    /* renamed from: t */
    private SurfaceView f13302t;

    /* renamed from: u */
    private FrameLayout f13303u;

    /* renamed from: w */
    public InterfaceC3093d f13305w;

    /* renamed from: x */
    private ExecutorService f13306x;

    /* renamed from: y */
    private InterfaceC3174g0 f13307y;

    /* renamed from: z */
    private C3185n f13308z;

    /* renamed from: o */
    private final String f13297o = "rbx.game";

    /* renamed from: q */
    private long f13299q = 0;

    /* renamed from: r */
    private String f13300r = BuildConfig.FLAVOR;

    /* renamed from: s */
    private boolean f13301s = false;

    /* renamed from: v */
    private int f13304v = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f7.w$a */
    /* loaded from: classes.dex */
    public class a implements AsyncTaskC6013a.a {

        /* renamed from: a */
        private final long f13309a;

        public a(long j10) {
            this.f13309a = j10;
        }

        @Override // p325z6.AsyncTaskC6013a.a
        /* renamed from: a */
        public void mo12478a(int i10) {
            C4330a.m17860b("SessionReporterState_GameLoadStart", this.f13309a);
            SurfaceHolderCallbackC3194w.this.f13302t.setVisibility(0);
        }
    }

    public SurfaceHolderCallbackC3194w(C3185n c3185n, C3166c0 c3166c0) {
        this.f13308z = c3185n;
        this.f13307y = c3185n;
        this.f13296n = c3166c0;
    }

    /* renamed from: B */
    private void m13969B(final Runnable runnable) {
        m13984p().execute(new Runnable() { // from class: f7.v
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    /* renamed from: C */
    private void m13970C(C3166c0 c3166c0) {
        C1151k.m6712f("rbx.game", "startGame");
        Surface surface = this.f13302t.getHolder().getSurface();
        C2940a c2940a = new C2940a(m13985q());
        c2940a.isTablet = C2877p0.m12939o0();
        this.f13307y.mo13904i(c3166c0.f13217c);
        StartGameParams.Builder mo13309i = StartGameParams.builder().mo13319s(surface).mo13316p(c2940a).mo13306f(null).mo13315o(c3166c0.f13217c).mo13320t(c3166c0.f13216b).mo13303c(c3166c0.f13218d).mo13314n(c3166c0.f13219e).mo13307g(c3166c0.f13220f).mo13308h(C1079c.m6380c().m6392m()).mo13321u(C1079c.m6380c().m6390k()).mo13305e(c3166c0.f13221g).mo13318r(c3166c0.f13222h).mo13304d(c3166c0.f13223i).mo13312l(c3166c0.f13215a).mo13317q(c3166c0.f13224j).mo13313m(c3166c0.f13225k).mo13310j(c3166c0.f13226l).mo13311k(c3166c0.f13227m).mo13309i(c3166c0.f13228n);
        if (C2877p0.m12865G0()) {
            mo13309i.mo13322v(m14001r());
        }
        m14001r().runOnUiThread(new Runnable() { // from class: f7.q
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolderCallbackC3194w.this.m13989v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(mo13309i.m13302b());
        m14001r().runOnUiThread(new Runnable() { // from class: f7.r
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolderCallbackC3194w.this.m13990w();
            }
        });
        this.f13307y.mo13902e(c3166c0.f13217c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m13991x() {
        C1151k.m6712f("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f13304v + ", graphicsStarted = " + this.f13301s);
        this.f13302t.getHolder().removeCallback(this);
        this.f13304v = -1;
    }

    /* renamed from: F */
    private void m13972F() {
        C1151k.m6712f("rbx.game", "surfaceDestroyed: surfaceState = " + this.f13304v + ", graphicsStarted = " + this.f13301s);
        if (this.f13304v != 2) {
            return;
        }
        if (this.f13301s) {
            this.f13301s = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        AbstractActivityC2837i0 m14001r = m14001r();
        if (m14001r == null || m14001r.isFinishing()) {
            return;
        }
        C1151k.m6712f("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f13308z.m13953S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m13973G() {
        C1151k.m6712f("rbx.game", "updateSurface() surfaceState = " + this.f13304v);
        AbstractActivityC2837i0 m14001r = m14001r();
        if (m14001r != null && !m14001r.isFinishing() && !m14001r.isDestroyed()) {
            int i10 = this.f13304v;
            if (i10 == 0) {
                this.f13304v = 2;
                this.f13301s = true;
                m13970C(this.f13296n);
                return;
            } else {
                if (i10 == 2) {
                    Surface surface = this.f13302t.getHolder().getSurface();
                    if (this.f13301s) {
                        C1151k.m6712f("rbx.game", "updateSurface: nativeUpdateGraphics");
                        NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameNew(surface, m13999n(), C2877p0.m12935m0() ? m14001r() : null);
                        return;
                    } else {
                        C1151k.m6712f("rbx.game", "updateSurface: nativeStartUpGraphics");
                        this.f13301s = true;
                        NativeGLInterface.nativeAppBridgeV2ResumeGameNew(surface, m13999n(), C2877p0.m12935m0() ? m14001r() : null);
                        return;
                    }
                }
                return;
            }
        }
        C1151k.m6712f("rbx.game", "updateSurface() activity finishing ignore update");
    }

    @Deprecated
    /* renamed from: j */
    private void m13983j() {
        if (Build.MODEL.equals("SM-T230NU")) {
            ViewGroup.LayoutParams layoutParams = this.f13302t.getLayoutParams();
            layoutParams.width = 1280;
            layoutParams.height = 800;
            this.f13302t.setLayoutParams(layoutParams);
            this.f13302t.getHolder().setFixedSize(960, 600);
        }
    }

    /* renamed from: p */
    private ExecutorService m13984p() {
        if (this.f13306x == null) {
            this.f13306x = Executors.newSingleThreadExecutor();
        }
        return this.f13306x;
    }

    /* renamed from: q */
    private PlatformParams m13985q() {
        String m14267g = C3213g.m14267g();
        if (TextUtils.isEmpty(m14267g)) {
            m14267g = C3213g.m14269i().m14284r(m13998m());
        }
        C1151k.m6707a("rbx.game", "getPlatformParams: assetFolderPath = " + m14267g);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = m14267g;
        platformParams.isTouchDevice = m14001r().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = m14001r().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = m14001r().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m13999n();
        return platformParams;
    }

    /* renamed from: s */
    private void m13986s(View view) {
        C1151k.m6707a("rbx.game", "initSurfaceView: ...");
        SurfaceView surfaceView = (SurfaceView) m14001r().findViewById(C2915y.f11875k1);
        this.f13302t = surfaceView;
        surfaceView.setFocusable(true);
        this.f13302t.setFocusableInTouchMode(true);
        this.f13302t.getHolder().addCallback(this);
        if (m14000o().m13950I()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m13987t() {
        m13991x();
        NativeGLInterface.nativeAppBridgeV2LeaveGame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m13989v() {
        this.f13298p.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m13990w() {
        if (m14001r().isDestroyed()) {
            return;
        }
        this.f13298p.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m13992y() {
        this.f13308z.m13952R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m13993z() {
        if (m14001r() == null) {
            return;
        }
        m13972F();
    }

    /* renamed from: A */
    public View m13994A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1151k.m6707a("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f13304v);
        if (!C5469d.m20104h() && bundle != null) {
            C1151k.m6716j("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f13307y.mo13903g();
            return null;
        }
        this.f13305w = C3205h.m14141f0(m13998m());
        this.f13303u = (FrameLayout) m14001r().findViewById(C2915y.f11858f);
        if (C2877p0.m12927i0() && bundle != null && this.f13304v == 2) {
            C1151k.m6712f("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f13304v = 0;
        }
        this.f13298p = (FrameLayout) this.f13303u.findViewById(C2915y.f11916y0);
        m13986s(null);
        AsyncTaskC6013a.m21329b(new a(this.f13296n.f13217c)).mo12448a();
        return null;
    }

    /* renamed from: D */
    public void m13995D() {
        m13969B(new Runnable() { // from class: f7.o
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolderCallbackC3194w.this.m13991x();
            }
        });
    }

    /* renamed from: k */
    public void m13996k() {
        m13969B(new Runnable() { // from class: f7.s
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolderCallbackC3194w.this.m13987t();
            }
        });
    }

    /* renamed from: l */
    public FrameLayout m13997l() {
        return this.f13303u;
    }

    /* renamed from: m */
    public Context m13998m() {
        return m14000o().m13948D();
    }

    /* renamed from: n */
    public float m13999n() {
        return m14000o().m13949E();
    }

    /* renamed from: o */
    public C3185n m14000o() {
        return this.f13308z;
    }

    /* renamed from: r */
    public AbstractActivityC2837i0 m14001r() {
        return (AbstractActivityC2837i0) this.f13308z.m13947C();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C1151k.m6712f("rbx.game", "surfaceChanged: ...");
        m13983j();
        m13969B(new Runnable() { // from class: f7.t
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolderCallbackC3194w.this.m13973G();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1151k.m6712f("rbx.game", "surfaceCreated: ...");
        m13969B(new Runnable() { // from class: f7.u
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolderCallbackC3194w.this.m13992y();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f13306x.submit(new Runnable() { // from class: f7.p
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceHolderCallbackC3194w.this.m13993z();
                }
            }).get();
        } catch (Exception unused) {
            C1151k.m6712f("rbx.game", "game thread times out");
        }
    }
}
