package com.roblox.client.game;

import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.appcompat.app.ActivityC0153c;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0843j;
import androidx.lifecycle.InterfaceC0845l;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.C2872n;
import com.roblox.client.game.SurfaceHolderCallbackC2830a;
import com.roblox.engine.jni.NativeGLInterface;
import java.lang.ref.WeakReference;
import p033c7.C1134c;
import p035c9.C1151k;
import p074f7.EnumC3172f0;
import p076f9.C3211e;
import p076f9.ViewOnTouchListenerC3208b;
import p213q6.InterfaceC4321a;
import p300x7.C5560b;

/* loaded from: classes.dex */
public class MainActivityController implements InterfaceC0843j, SurfaceHolderCallbackC2830a.f, ViewOnTouchListenerC3208b.e, SurfaceHolder.Callback {

    /* renamed from: p */
    private InterfaceC4321a f11196p;

    /* renamed from: r */
    private final WeakReference<AbstractActivityC2837i0> f11198r;

    /* renamed from: s */
    private final ViewOnTouchListenerC3208b f11199s;

    /* renamed from: t */
    private final SurfaceView f11200t;

    /* renamed from: n */
    public EnumC3172f0 f11194n = EnumC3172f0.APP;

    /* renamed from: o */
    private final String f11195o = "MainScreenController";

    /* renamed from: q */
    private Boolean f11197q = Boolean.FALSE;

    /* renamed from: u */
    private final C3211e f11201u = new C3211e();

    /* renamed from: com.roblox.client.game.MainActivityController$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2829a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11202a;

        static {
            int[] iArr = new int[AbstractC0839f.b.values().length];
            f11202a = iArr;
            try {
                iArr[AbstractC0839f.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11202a[AbstractC0839f.b.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11202a[AbstractC0839f.b.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11202a[AbstractC0839f.b.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MainActivityController(AbstractActivityC2837i0 abstractActivityC2837i0, SurfaceView surfaceView) {
        this.f11198r = new WeakReference<>(abstractActivityC2837i0);
        this.f11200t = surfaceView;
        ViewOnTouchListenerC3208b viewOnTouchListenerC3208b = new ViewOnTouchListenerC3208b(abstractActivityC2837i0, surfaceView, this);
        this.f11199s = viewOnTouchListenerC3208b;
        surfaceView.setOnTouchListener(viewOnTouchListenerC3208b);
        surfaceView.getHolder().addCallback(this);
    }

    /* renamed from: f */
    private boolean m12529f(int i10) {
        return (i10 == 4 || i10 == 25 || i10 == 24) ? false : true;
    }

    /* renamed from: g */
    private void m12530g() {
        C1151k.m6712f("MainScreenController", "Disposing RTC audio manager.");
        InterfaceC4321a interfaceC4321a = this.f11196p;
        if (interfaceC4321a != null) {
            interfaceC4321a.mo17838b();
            this.f11196p = null;
        }
    }

    /* renamed from: h */
    private void m12531h(ActivityC0153c activityC0153c) {
        C1151k.m6712f("MainScreenController", "Initializing RTC audio manager.");
        InterfaceC4321a m12833c = C2872n.m12830h().m12833c(activityC0153c.getApplicationContext());
        this.f11196p = m12833c;
        if (m12833c != null) {
            m12833c.mo17837a(activityC0153c);
        }
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: E */
    public void mo12146E() {
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: a */
    public boolean mo12154a() {
        return this.f11197q.booleanValue();
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: b */
    public void mo12155b(boolean z10) {
        this.f11199s.m14228t(z10);
    }

    @Override // p076f9.ViewOnTouchListenerC3208b.e
    /* renamed from: d */
    public float mo12532d() {
        return this.f11201u.m14259b(this.f11198r.get());
    }

    @Override // androidx.lifecycle.InterfaceC0843j
    /* renamed from: e */
    public void mo592e(InterfaceC0845l interfaceC0845l, AbstractC0839f.b bVar) {
        C1151k.m6707a("MainScreenController", "onStateChanged: event: " + bVar);
        int i10 = C2829a.f11202a[bVar.ordinal()];
        if (i10 == 1) {
            m12531h((ActivityC0153c) interfaceC0845l);
            if (!C1134c.m6537a().mo6632n1() || C5560b.m20360l()) {
                return;
            }
            this.f11198r.get().getWindow().setFlags(8192, 8192);
            return;
        }
        if (i10 == 2) {
            this.f11199s.m14228t(false);
        } else if (i10 == 3) {
            this.f11199s.m14229u();
        } else {
            if (i10 != 4) {
                return;
            }
            m12530g();
        }
    }

    /* renamed from: i */
    public boolean m12533i(KeyEvent keyEvent) {
        if (!m12529f(keyEvent.getKeyCode())) {
            return false;
        }
        NativeGLInterface.nativePassKeyEvent(true, keyEvent.getScanCode(), keyEvent.getKeyCode(), keyEvent.getRepeatCount() > 0);
        return true;
    }

    /* renamed from: j */
    public boolean m12534j(KeyEvent keyEvent) {
        if (!m12529f(keyEvent.getKeyCode())) {
            return false;
        }
        NativeGLInterface.nativePassKeyEvent(false, keyEvent.getScanCode(), keyEvent.getKeyCode(), keyEvent.getRepeatCount() > 0);
        return true;
    }

    /* renamed from: k */
    public void m12535k(int i10) {
        if (this.f11194n == EnumC3172f0.EXPERIENCE) {
            C1151k.m6712f("MainScreenController", "Handling onTrimMemory level: " + i10);
            if (i10 == 15) {
                C1151k.m6716j("MainScreenController", "TRIM_MEMORY_RUNNING_CRITICAL: notify the engine...");
                NativeGLInterface.nativeAppBridgeV2OnLowMemory();
            }
        }
    }

    /* renamed from: l */
    public void m12536l() {
        this.f11199s.m14227q();
    }

    /* renamed from: m */
    public void m12537m(EnumC3172f0 enumC3172f0) {
        C1151k.m6712f("MainScreenController", "Roblox has entered " + enumC3172f0.name() + " mode.");
        this.f11194n = enumC3172f0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C1151k.m6712f("MainScreenController", "surfaceChanged");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1151k.m6712f("MainScreenController", "surfaceCreated");
        this.f11197q = Boolean.TRUE;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1151k.m6712f("MainScreenController", "surfaceDestroyed");
        this.f11197q = Boolean.FALSE;
    }

    @Override // com.roblox.client.InterfaceC2893s
    /* renamed from: z */
    public void mo12175z() {
        this.f11199s.m14229u();
    }
}
