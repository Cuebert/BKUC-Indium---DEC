package p074f7;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.components.AbstractRunnableC2801b;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import p033c7.C1134c;
import p035c9.C1151k;
import p074f7.C3185n;
import p088g7.AbstractC3316a;
import p090g9.C3319b;

/* renamed from: f7.y */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC3196y extends AbstractC3316a implements ViewTreeObserver.OnGlobalLayoutListener, ComponentCallbacks {

    /* renamed from: q */
    private final boolean f13315q;

    /* renamed from: r */
    private final int f13316r;

    /* renamed from: s */
    private final int f13317s;

    /* renamed from: t */
    private C3319b f13318t;

    /* renamed from: u */
    private SurfaceHolderCallbackC3194w f13319u;

    /* renamed from: v */
    private C3185n.f f13320v;

    /* renamed from: w */
    protected NativeTextBoxInfo f13321w;

    /* renamed from: x */
    private a f13322x;

    /* renamed from: y */
    private Handler f13323y;

    /* renamed from: z */
    private long f13324z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f7.y$a */
    /* loaded from: classes.dex */
    public class a extends AbstractRunnableC2801b<NativeTextBoxInfo> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f7.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC6047a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ NativeTextBoxInfo f13326n;

            RunnableC6047a(NativeTextBoxInfo nativeTextBoxInfo) {
                this.f13326n = nativeTextBoxInfo;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserverOnGlobalLayoutListenerC3196y.this.m14015t("(" + this.f13326n.f12087x + ", " + this.f13326n.f12088y + ") align: (" + this.f13326n.xAlignment + ", " + this.f13326n.yAlignment + ")");
                ViewTreeObserverOnGlobalLayoutListenerC3196y viewTreeObserverOnGlobalLayoutListenerC3196y = ViewTreeObserverOnGlobalLayoutListenerC3196y.this;
                viewTreeObserverOnGlobalLayoutListenerC3196y.m14018x(viewTreeObserverOnGlobalLayoutListenerC3196y.f13318t, ViewTreeObserverOnGlobalLayoutListenerC3196y.this.m14585g());
                ViewTreeObserverOnGlobalLayoutListenerC3196y.this.m14006F(this.f13326n);
                ViewTreeObserverOnGlobalLayoutListenerC3196y.this.m14005E(this.f13326n);
                ((AbstractC3316a) ViewTreeObserverOnGlobalLayoutListenerC3196y.this).f13794p.requestFocus();
            }
        }

        public a(String str) {
            super(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.roblox.client.components.AbstractRunnableC2801b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo12413a(NativeTextBoxInfo nativeTextBoxInfo) {
            ViewTreeObserverOnGlobalLayoutListenerC3196y.this.f13323y.post(new RunnableC6047a(nativeTextBoxInfo));
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC3196y(RbxKeyboard rbxKeyboard, SurfaceHolderCallbackC3194w surfaceHolderCallbackC3194w, C3185n.f fVar) {
        super(rbxKeyboard);
        this.f13315q = false;
        this.f13316r = 12;
        this.f13317s = 10;
        this.f13322x = new a("rbx.glview.text");
        this.f13319u = surfaceHolderCallbackC3194w;
        this.f13320v = fVar;
        this.f13323y = new Handler(Looper.getMainLooper());
    }

    /* renamed from: B */
    private void m14003B(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f13322x.m12414e(nativeTextBoxInfo, C1134c.m6537a().mo6562L0());
        }
    }

    /* renamed from: D */
    private void m14004D(float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13794p.getLayoutParams();
        float m14585g = m14585g();
        float m14016u = m14016u(f10, m14585g);
        float m14016u2 = m14016u(f11, m14585g);
        float m14016u3 = m14016u(f12, m14585g);
        float m14016u4 = m14016u(f13, m14585g);
        layoutParams.topMargin = (int) m14016u2;
        layoutParams.width = (int) m14016u3;
        layoutParams.height = (int) m14016u4;
        layoutParams.leftMargin = (int) m14016u;
        this.f13794p.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m14005E(NativeTextBoxInfo nativeTextBoxInfo) {
        m14004D(nativeTextBoxInfo.f12087x, nativeTextBoxInfo.f12088y, nativeTextBoxInfo.width, nativeTextBoxInfo.height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m14006F(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f13794p.m12213l(nativeTextBoxInfo);
            this.f13794p.m12214m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, m14585g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m14015t(String str) {
    }

    /* renamed from: u */
    private float m14016u(float f10, float f11) {
        return f10 * f11;
    }

    /* renamed from: w */
    private void m14017w(View view, int i10, int i11) {
        boolean z10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z11 = true;
        if (layoutParams.width != i10) {
            layoutParams.width = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (layoutParams.height != i11) {
            layoutParams.height = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m14018x(C3319b c3319b, float f10) {
        float f11;
        if (c3319b.f13805e > 10) {
            NativeTextBoxInfo nativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
            float f12 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.f12087x : 0.0f;
            float f13 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.f12088y : 0.0f;
            float f14 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.width : 0.0f;
            float f15 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.height : 0.0f;
            float f16 = nativeGetTextBoxInfo != null ? nativeGetTextBoxInfo.fontSize : 0.0f;
            m14015t("(" + f12 + ", " + f13 + ", " + f14 + ", " + f15 + ", " + f16 + ")");
            float m14016u = m14016u(f15 + f13, f10);
            if (m14016u >= c3319b.f13802b) {
                f11 = c3319b.f13806f;
                m14016u = m14016u(f13 + f16, f10);
            } else {
                f11 = c3319b.f13806f;
            }
            float f17 = f11 - m14016u;
            float m14016u2 = m14016u(12.0f, f10);
            int i10 = (int) (f17 - m14016u2);
            m14015t("margin:" + m14016u2 + " delta:" + f17 + " adjustment:" + i10);
            if (i10 < 0) {
                m14022s(i10);
            }
        }
    }

    /* renamed from: z */
    private float m14019z(int i10, float f10) {
        return (i10 / f10) + 0.5f;
    }

    /* renamed from: A */
    public void m14020A() {
        m14017w(this.f13319u.m13997l(), -1, -1);
    }

    /* renamed from: C */
    public void m14021C(long j10) {
        this.f13324z = j10;
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: a */
    public void mo13877a() {
        NativeGLInterface.nativeReleaseFocus(m14586h());
        m14022s(0);
        this.f13794p.m12207d();
        this.f13321w = null;
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: b */
    public void mo13878b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        this.f13321w = nativeTextBoxInfo;
        m14023v();
        C1151k.m6707a("rbx.glview.text", "showKeyboard() " + str);
        this.f13794p.setCurrentTextBox(j10);
        this.f13794p.setText(str);
        if (z10) {
            NativeTextBoxInfo nativeTextBoxInfo2 = this.f13321w;
            if (nativeTextBoxInfo2 != null) {
                m14004D(0.0f, -150.0f, nativeTextBoxInfo2.width, nativeTextBoxInfo2.height);
            } else {
                m14004D(0.0f, -150.0f, -1.0f, 10.0f);
            }
            m14003B(this.f13321w);
        }
        this.f13794p.setVisibility(0);
        this.f13794p.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) m14584f().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f13794p, 2);
        }
        this.f13794p.setSelection(str.length());
        m14588j();
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: c */
    public void mo13879c(String str) {
        m14587i(str);
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: d */
    public void mo13880d() {
        RbxKeyboard rbxKeyboard = this.f13794p;
        if (rbxKeyboard != null) {
            rbxKeyboard.m12210i();
        }
    }

    @Override // p074f7.InterfaceC3176h0
    /* renamed from: e */
    public void mo13881e() {
        NativeTextBoxInfo nativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeGetTextBoxInfo != null) {
            C1151k.m6707a("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeGetTextBoxInfo.f12087x + " y:" + nativeGetTextBoxInfo.f12088y + " width:" + nativeGetTextBoxInfo.width + " height:" + nativeGetTextBoxInfo.height + " fontSize:" + nativeGetTextBoxInfo.fontSize);
            m14003B(nativeGetTextBoxInfo);
        }
        this.f13321w = nativeGetTextBoxInfo;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        C1151k.m6712f("rbx.glview.text", "Configuration change detected");
        m14020A();
        mo13877a();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C3319b m13968a = this.f13320v.m13968a();
        if (m13968a == null) {
            return;
        }
        C3319b c3319b = this.f13318t;
        if (c3319b == null || !c3319b.equals(m13968a)) {
            this.f13318t = m13968a;
            float m14585g = m14585g();
            m14018x(m13968a, m14585g);
            m14024y(m13968a, m14585g);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* renamed from: s */
    public void m14022s(int i10) {
        FrameLayout m13997l = this.f13319u.m13997l();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m13997l.getLayoutParams();
        if (layoutParams.topMargin != i10) {
            layoutParams.topMargin = i10;
            m13997l.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: v */
    public void m14023v() {
        FrameLayout m13997l = this.f13319u.m13997l();
        int width = m13997l.getWidth();
        int height = m13997l.getHeight();
        m14015t("Lock screen: (" + width + ", " + height + ")");
        m14017w(m13997l, width, height);
    }

    /* renamed from: y */
    protected void m14024y(C3319b c3319b, float f10) {
        boolean z10 = c3319b.f13805e > 10;
        int m14019z = (int) m14019z(c3319b.f13806f, f10);
        int m14019z2 = (int) m14019z(c3319b.f13801a.right, f10);
        int m14019z3 = (int) m14019z(c3319b.f13805e, f10);
        C1151k.m6714h("rbx.glview.text", "onUpdateKeyboardSize() v:" + z10 + " x:0 y:" + m14019z + " w:" + m14019z2 + " h:" + m14019z3);
        if (c3319b.f13805e > 10) {
            NativeGLInterface.updateKeyboardSize(true, 0, m14019z, m14019z2, m14019z3);
        } else {
            NativeGLInterface.updateKeyboardSize(false, 0, m14019z, m14019z2, 0);
        }
    }
}
