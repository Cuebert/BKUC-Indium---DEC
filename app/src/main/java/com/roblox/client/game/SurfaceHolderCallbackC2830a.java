package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0803d;
import com.roblox.client.AbstractActivityC2837i0;
import com.roblox.client.AbstractActivityC2841k0;
import com.roblox.client.C2827g;
import com.roblox.client.C2834h;
import com.roblox.client.C2871m0;
import com.roblox.client.C2872n;
import com.roblox.client.C2877p0;
import com.roblox.client.C2911w;
import com.roblox.client.C2915y;
import com.roblox.client.InterfaceC2893s;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.components.C2808i;
import com.roblox.client.game.C2831b;
import com.roblox.client.game.C2832c;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import la.C3905c;
import p033c7.C1134c;
import p035c9.C1151k;
import p062e8.C3091b;
import p062e8.InterfaceC3090a;
import p074f7.AbstractC3171f;
import p074f7.C3168d0;
import p074f7.InterfaceC3176h0;
import p076f9.C3211e;
import p076f9.ViewOnTouchListenerC3208b;
import p077fa.C3214a;
import p090g9.AbstractC3318a;
import p090g9.C3319b;
import p288w8.C5476k;
import p300x7.C5565g;

/* renamed from: com.roblox.client.game.a */
/* loaded from: classes.dex */
public class SurfaceHolderCallbackC2830a extends C2871m0 implements SurfaceHolder.Callback, ViewOnTouchListenerC3208b.e, View.OnClickListener, InterfaceC3090a {

    /* renamed from: R0 */
    private g f11204R0;

    /* renamed from: S0 */
    private SurfaceView f11205S0;

    /* renamed from: T0 */
    private View f11206T0;

    /* renamed from: U0 */
    private View f11207U0;

    /* renamed from: W0 */
    private AbstractC3318a f11209W0;

    /* renamed from: X0 */
    private ViewTreeObserver.OnGlobalLayoutListener f11210X0;

    /* renamed from: Z0 */
    private InterfaceC3176h0 f11212Z0;

    /* renamed from: a1 */
    private boolean f11213a1;

    /* renamed from: b1 */
    private C2834h f11214b1;

    /* renamed from: c1 */
    private C3091b f11215c1;

    /* renamed from: d1 */
    private f f11216d1;

    /* renamed from: e1 */
    private d f11217e1;

    /* renamed from: Q0 */
    public final String f11203Q0 = "AppShellFragment";

    /* renamed from: V0 */
    private C3211e f11208V0 = new C3211e();

    /* renamed from: Y0 */
    private Handler f11211Y0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.game.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3318a {
        a(Context context, AbstractC3318a.a aVar) {
            super(context, aVar);
        }

        @Override // p090g9.AbstractC3318a
        /* renamed from: c */
        public C3319b mo12555c() {
            ActivityC0803d m4363p = SurfaceHolderCallbackC2830a.this.m4363p();
            if (m4363p != null) {
                return C3319b.m14597a(SurfaceHolderCallbackC2830a.this.f11205S0.getRootView(), m4363p.getWindowManager(), SurfaceHolderCallbackC2830a.this.f11206T0, ((AbstractActivityC2837i0) SurfaceHolderCallbackC2830a.this.m4363p()).m12673Z0().m17187c());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.game.a$b */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!SurfaceHolderCallbackC2830a.this.m4342g0()) {
                C1151k.m6716j("AppShellFragment", "onGlobalLayout() fragment not attached");
                return;
            }
            SurfaceHolderCallbackC2830a.this.f11209W0.m14594e(false);
            if (SurfaceHolderCallbackC2830a.this.m4363p() != null) {
                View findViewById = SurfaceHolderCallbackC2830a.this.m4363p().findViewById(C2915y.f11858f);
                if (findViewById != null) {
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams.width == -1 && layoutParams.height == -1) {
                        return;
                    }
                    C1151k.m6712f("AppShellFragment", "Resetting surface container's layout.");
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    findViewById.setLayoutParams(layoutParams);
                    return;
                }
                C1151k.m6709c("AppShellFragment", "Surface view not found! Cannot reset its layout.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.game.a$c */
    /* loaded from: classes.dex */
    public class c implements C2832c.a {
        private c() {
        }

        @Override // com.roblox.client.game.C2832c.a
        /* renamed from: d */
        public void mo12556d(String str) {
            C1151k.m6707a("AppShellFragment", "onAppReady() " + str);
            if ("AvatarEditor".equals(str)) {
                C1151k.m6707a("AppShellFragment", "onAppReady() check catalog promo");
                SurfaceHolderCallbackC2830a.this.f11214b1.m12616b();
            }
            if (SurfaceHolderCallbackC2830a.this.f11204R0 != null) {
                SurfaceHolderCallbackC2830a.this.f11204R0.mo12156d(str);
            }
        }

        /* synthetic */ c(SurfaceHolderCallbackC2830a surfaceHolderCallbackC2830a, a aVar) {
            this();
        }
    }

    /* renamed from: com.roblox.client.game.a$d */
    /* loaded from: classes.dex */
    private class d extends AbstractC3171f {

        /* renamed from: a */
        private OnAppBridgeNotificationListener f11221a;

        private d() {
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: b */
        public void mo12557b(long j10) {
            if (SurfaceHolderCallbackC2830a.this.f11209W0 != null) {
                SurfaceHolderCallbackC2830a.this.f11209W0.m14594e(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: e */
        public void mo12558e(String str) {
            if (SurfaceHolderCallbackC2830a.this.f11216d1 != null) {
                SurfaceHolderCallbackC2830a.this.f11216d1.mo12155b(true);
            }
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: f */
        public void mo12559f(String str, String str2) {
            if (this.f11221a == null) {
                a aVar = null;
                this.f11221a = C2872n.m12830h().m12831a(new c(SurfaceHolderCallbackC2830a.this, aVar), new e(SurfaceHolderCallbackC2830a.this, aVar));
            }
            this.f11221a.mo12606a(str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: i */
        public void mo12560i(String str, String str2) {
            C2827g.m12523f(SurfaceHolderCallbackC2830a.this.m4363p(), str2, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: j */
        public void mo12561j(long j10, String str) {
            SurfaceHolderCallbackC2830a.this.f11215c1.m13605g(j10, str);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: k */
        public void mo12562k(long j10, String str, String str2) {
            SurfaceHolderCallbackC2830a.this.f11215c1.m13606h(j10, str, str2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallback2
        /* renamed from: l */
        public void mo12563l(long j10, String str, String str2) {
            SurfaceHolderCallbackC2830a.this.f11215c1.m13607i(j10, str, str2);
        }

        @Override // p074f7.AbstractC3171f
        /* renamed from: p */
        public InterfaceC3176h0 mo12564p() {
            return SurfaceHolderCallbackC2830a.this.f11212Z0;
        }

        /* renamed from: s */
        public void m12565s() {
            if (this.f11221a == null) {
                a aVar = null;
                this.f11221a = C2872n.m12830h().m12831a(new c(SurfaceHolderCallbackC2830a.this, aVar), new e(SurfaceHolderCallbackC2830a.this, aVar));
            }
            ((C2832c) this.f11221a).m12607d();
        }

        /* synthetic */ d(SurfaceHolderCallbackC2830a surfaceHolderCallbackC2830a, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.game.a$e */
    /* loaded from: classes.dex */
    public class e implements C2832c.b {
        private e() {
        }

        @Override // com.roblox.client.game.C2832c.b
        /* renamed from: a */
        public C2871m0 mo12566a() {
            return SurfaceHolderCallbackC2830a.this;
        }

        /* synthetic */ e(SurfaceHolderCallbackC2830a surfaceHolderCallbackC2830a, a aVar) {
            this();
        }
    }

    /* renamed from: com.roblox.client.game.a$f */
    /* loaded from: classes.dex */
    public interface f extends InterfaceC2893s {
    }

    /* renamed from: com.roblox.client.game.a$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: R */
        void mo12152R();

        /* renamed from: d */
        void mo12156d(String str);
    }

    public SurfaceHolderCallbackC2830a() {
        d dVar = new d(this, null);
        C2831b.m12572i().m12581D(new RunOnMainEngineJavaCallback(this.f11211Y0, dVar));
        this.f11214b1 = new C2834h(this);
        this.f11215c1 = new C3091b(this, true);
        this.f11217e1 = dVar;
    }

    /* renamed from: H2 */
    private AbstractC3318a.a m12545H2() {
        AbstractC3318a.a aVar = new AbstractC3318a.a();
        TypedValue typedValue = new TypedValue();
        m4307Q().getValue(C2911w.f11724d, typedValue, true);
        aVar.f13799a = (int) TypedValue.complexToFloat(typedValue.data);
        return aVar;
    }

    /* renamed from: J2 */
    private void m12546J2(View view) {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) m4363p().findViewById(C2915y.f11859f0);
        rbxKeyboard.setLayoutParams((FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams());
        rbxKeyboard.setBackgroundColor(0);
        C2808i.m12429d(rbxKeyboard, m4384w(), "SourceSansPro-Regular.ttf");
        this.f11212Z0 = new C3168d0(rbxKeyboard);
    }

    /* renamed from: K2 */
    private void m12547K2() {
        this.f11209W0 = new a(m4384w(), m12545H2());
        this.f11210X0 = new b();
        this.f11205S0.getViewTreeObserver().addOnGlobalLayoutListener(this.f11210X0);
    }

    /* renamed from: L2 */
    private void m12548L2(View view) {
        C1151k.m6707a("AppShellFragment", "initSurfaceView()");
        SurfaceView surfaceView = (SurfaceView) m4363p().findViewById(C2915y.f11875k1);
        this.f11205S0 = surfaceView;
        surfaceView.setFocusable(true);
        this.f11205S0.setFocusableInTouchMode(true);
        this.f11205S0.getHolder().addCallback(this);
    }

    /* renamed from: M2 */
    private void m12549M2() {
        C2831b.d m12608a;
        C1151k.m6707a("AppShellFragment", "loadSettings()");
        this.f11207U0.setVisibility(8);
        if (C2877p0.m12865G0()) {
            m12608a = C2833d.m12609b(m4384w(), m4363p());
        } else {
            m12608a = C2833d.m12608a(m4384w());
        }
        C2831b.m12572i().m12589j(m12608a);
        this.f11205S0.setVisibility(0);
    }

    /* renamed from: N2 */
    private void m12550N2() {
        C2831b.d m12588h;
        if (C2877p0.m12865G0() && (m12588h = C2831b.m12572i().m12588h()) != null) {
            m12588h.f11240a = m4363p();
        }
        C2831b.m12572i().m12583F(this.f11205S0.getHolder().getSurface());
        g gVar = this.f11204R0;
        if (gVar != null) {
            gVar.mo12152R();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1151k.m6712f("AppShellFragment", "onCreateView:");
        m12548L2(null);
        m12546J2(null);
        m12547K2();
        boolean mo12154a = this.f11216d1.mo12154a();
        this.f11213a1 = mo12154a;
        if (mo12154a) {
            m12550N2();
        }
        View findViewById = m4363p().findViewById(C2915y.f11860f1);
        this.f11207U0 = findViewById;
        findViewById.findViewById(C2915y.f11857e1).setOnClickListener(this);
        if (!C2831b.m12572i().m12591l()) {
            this.f11207U0.setVisibility(0);
        } else {
            this.f11205S0.setVisibility(0);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: E0 */
    public void mo4274E0() {
        if (C5476k.m20126A()) {
            C1151k.m6712f("AppShellFragment", "onDestroy: App was previously destroyed due to process death");
            super.mo4274E0();
        } else {
            super.mo4274E0();
            C1151k.m6712f("AppShellFragment", "onDestroy()");
            this.f11205S0.getHolder().removeCallback(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        super.mo4280G0();
        C1151k.m6707a("AppShellFragment", "onDestroyView()");
        this.f11205S0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f11210X0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        this.f11216d1 = null;
    }

    /* renamed from: I2 */
    public Surface m12552I2() {
        if (this.f11213a1) {
            return this.f11205S0.getHolder().getSurface();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: J0 */
    public void mo4287J0(boolean z10) {
        super.mo4287J0(z10);
        C1151k.m6707a("AppShellFragment", "onHiddenChanged() hidden:" + z10);
        if (z10) {
            C2831b.m12572i().m12596t();
        } else {
            if (!this.f11213a1) {
                C1151k.m6707a("AppShellFragment", "onHiddenChanged() surface not yet created - show surface");
                this.f11205S0.setVisibility(0);
                this.f11207U0.setVisibility(8);
                return;
            }
            C2831b.m12572i().m12583F(this.f11205S0.getHolder().getSurface());
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P0 */
    public void mo4305P0() {
        f fVar;
        super.mo4305P0();
        if (C1134c.m6537a().mo6615i() || (fVar = this.f11216d1) == null) {
            return;
        }
        fVar.mo12175z();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        super.mo4319U0();
        if (this.f11207U0.getVisibility() == 0) {
            m12549M2();
        }
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        if (C5565g.m20445e().m20457f()) {
            this.f11217e1.m12565s();
        }
        f fVar = this.f11216d1;
        if (fVar != null) {
            fVar.mo12146E();
        }
        C3905c.m16561r().m16570s(m4384w());
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
        C1151k.m6712f("AppShellFragment", "onStop()");
        C3214a.m14292a().m14294c();
        C3905c.m16561r().m16571t();
    }

    @Override // p076f9.ViewOnTouchListenerC3208b.e
    /* renamed from: a */
    public boolean mo12553a() {
        return this.f11213a1;
    }

    @Override // p076f9.ViewOnTouchListenerC3208b.e
    /* renamed from: d */
    public float mo12532d() {
        return this.f11208V0.m14259b(m4384w());
    }

    @Override // p062e8.InterfaceC3090a
    /* renamed from: m */
    public AbstractActivityC2841k0 mo12554m() {
        return (AbstractActivityC2841k0) m4363p();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != C2915y.f11857e1 || m12821q2()) {
            return;
        }
        m12549M2();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C1151k.m6712f("AppShellFragment", "surfaceChanged()");
        if (m4345h0()) {
            return;
        }
        C2831b.m12572i().m12585H(surfaceHolder.getSurface(), mo12532d());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1151k.m6712f("AppShellFragment", "surfaceCreated()");
        this.f11213a1 = true;
        if (m4345h0()) {
            return;
        }
        C1151k.m6712f("AppShellFragment", "Start the lua app");
        m12550N2();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1151k.m6712f("AppShellFragment", "surfaceDestroyed()");
        this.f11213a1 = false;
        C2831b.m12572i().m12584G();
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        this.f11206T0 = m4363p().findViewById(C2915y.f11876l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: v0 */
    public void mo4382v0(Activity activity) {
        super.mo4382v0(activity);
        if (activity instanceof f) {
            this.f11216d1 = (f) activity;
        } else {
            C1151k.m6709c("AppShellFragment", "Error: AppShellFragment cannot find the listener!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        if (context instanceof g) {
            this.f11204R0 = (g) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        C2831b.d m12608a;
        if (C5476k.m20126A()) {
            C1151k.m6712f("AppShellFragment", "onCreate: App was previously destroyed due to process death");
            super.mo270z0(bundle);
            return;
        }
        super.mo270z0(bundle);
        C1151k.m6712f("AppShellFragment", "onCreate:");
        C2831b.m12572i().m12582E(m4384w());
        if (C2877p0.m12865G0()) {
            m12608a = C2833d.m12609b(m4384w(), m4363p());
        } else {
            m12608a = C2833d.m12608a(m4384w());
        }
        C2831b.m12572i().m12589j(m12608a);
    }
}
