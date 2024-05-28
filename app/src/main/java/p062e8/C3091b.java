package p062e8;

import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0152b;
import com.appsflyer.oaid.BuildConfig;
import com.roblox.client.AbstractActivityC2841k0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2872n;
import com.roblox.engine.jni.NativeGLInterface;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1152l;
import p049d9.C3025b;
import p049d9.C3026c;
import p074f7.InterfaceC3170e0;
import p075f8.C3205h;

/* renamed from: e8.b */
/* loaded from: classes.dex */
public class C3091b {

    /* renamed from: c */
    private boolean f12981c;

    /* renamed from: d */
    private InterfaceC3090a f12982d;

    /* renamed from: a */
    private long f12979a = 0;

    /* renamed from: b */
    private String f12980b = BuildConfig.FLAVOR;

    /* renamed from: f */
    private InterfaceC3170e0 f12984f = new d();

    /* renamed from: e */
    private Handler f12983e = new Handler(Looper.getMainLooper());

    /* renamed from: e8.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3091b.this.f12982d.mo12554m().m12670W0(C2748c0.f10717q4);
        }
    }

    /* renamed from: e8.b$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3091b.this.f12982d.mo12554m().m12670W0(C2748c0.f10717q4);
        }
    }

    /* renamed from: e8.b$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3091b.this.f12982d.mo12554m().m12670W0(C2748c0.f10717q4);
        }
    }

    /* renamed from: e8.b$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC3170e0 {

        /* renamed from: e8.b$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ AbstractC3097h f12989n;

            /* renamed from: o */
            final /* synthetic */ CharSequence f12990o;

            a(AbstractC3097h abstractC3097h, CharSequence charSequence) {
                this.f12989n = abstractC3097h;
                this.f12990o = charSequence;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f12989n.mo13620e()) {
                    C3091b.this.m13602c(this.f12990o);
                } else {
                    C3091b.this.f12982d.mo12554m().m12668U0(this.f12990o.toString());
                }
            }
        }

        public d() {
        }

        @Override // p074f7.InterfaceC3170e0
        /* renamed from: a */
        public void mo13608a(boolean z10, long j10, String str) {
            C3091b.this.m13601e(z10, j10, str);
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: b */
        public void mo13209b() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: c */
        public void mo13210c(AbstractC3097h abstractC3097h) {
            CharSequence mo13618b;
            AbstractActivityC2841k0 mo12554m = C3091b.this.f12982d.mo12554m();
            if (mo12554m == null) {
                return;
            }
            if (abstractC3097h.mo13619c()) {
                mo13618b = C3091b.this.m13603d(C2748c0.f10723r4);
            } else {
                mo13618b = abstractC3097h.mo13618b(mo12554m);
            }
            C3091b.this.m13604f(new a(abstractC3097h, mo13618b));
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: d */
        public void mo13211d() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: e */
        public void mo13212e() {
        }
    }

    public C3091b(InterfaceC3090a interfaceC3090a, boolean z10) {
        this.f12982d = interfaceC3090a;
        this.f12981c = z10;
    }

    /* renamed from: e */
    public void m13601e(boolean z10, long j10, String str) {
        C1151k.m6712f("rbx.purchaseflow", "In-App purchase finished: success = " + z10 + ", player=" + j10 + ", productId=" + str);
        if (this.f12979a == 0) {
            C1151k.m6712f("rbx.purchaseflow", "AppShellFragment.inAppPurchaseFinished: userId == 0.");
            return;
        }
        C1151k.m6712f("rbx.purchaseflow", "Native call. Success=" + z10 + ", player=" + j10 + ", productId=" + str);
        NativeGLInterface.nativeInGamePurchaseFinished(z10, j10, str);
        this.f12980b = BuildConfig.FLAVOR;
        this.f12979a = 0L;
    }

    /* renamed from: c */
    public void m13602c(CharSequence charSequence) {
        if (this.f12982d.mo12554m() == null) {
            return;
        }
        DialogC0152b m695a = new DialogC0152b.a(this.f12982d.mo12554m()).m695a();
        TextView textView = new TextView(this.f12982d.mo12554m());
        String string = this.f12982d.mo12554m().getString(C2748c0.f10722r3);
        int indexOf = charSequence.toString().indexOf(string);
        C3025b.m13495e(textView, charSequence.toString(), new C3026c(this.f12982d.mo12554m(), null, string, indexOf, indexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        m695a.m694i(textView, 150, 100, 150, 100);
        m695a.setCanceledOnTouchOutside(true);
        try {
            m695a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* renamed from: d */
    public String m13603d(int i10) {
        return this.f12982d.mo12554m().getString(i10);
    }

    /* renamed from: f */
    public void m13604f(Runnable runnable) {
        this.f12983e.post(runnable);
    }

    /* renamed from: g */
    public void m13605g(long j10, String str) {
        this.f12979a = j10;
        this.f12980b = str;
        if (C1152l.m6736g()) {
            AbstractActivityC2841k0 mo12554m = this.f12982d.mo12554m();
            if (mo12554m == null || mo12554m.isFinishing()) {
                return;
            }
            C2872n.m12830h().m12839j(mo12554m).m14589a(mo12554m, str, j10, this.f12984f);
            return;
        }
        AbstractActivityC2841k0 mo12554m2 = this.f12982d.mo12554m();
        if (C3205h.m14141f0(mo12554m2).mo13610a(Long.toString(j10), str, mo12554m2, j10, this.f12984f)) {
            return;
        }
        m13604f(new b());
        m13601e(false, j10, str);
    }

    /* renamed from: h */
    public void m13606h(long j10, String str, String str2) {
        this.f12979a = j10;
        this.f12980b = str;
        if (C1152l.m6736g()) {
            AbstractActivityC2841k0 mo12554m = this.f12982d.mo12554m();
            if (mo12554m == null || mo12554m.isFinishing()) {
                return;
            }
            C2872n.m12830h().m12839j(mo12554m).m14589a(mo12554m, str, j10, this.f12984f);
            return;
        }
        AbstractActivityC2841k0 mo12554m2 = this.f12982d.mo12554m();
        if (C3205h.m14141f0(mo12554m2).mo13610a(str2, str, mo12554m2, j10, this.f12984f)) {
            return;
        }
        m13604f(new a());
        m13601e(false, j10, str);
    }

    /* renamed from: i */
    public void m13607i(long j10, String str, String str2) {
        this.f12979a = j10;
        if (!C1134c.m6537a().mo6649t1()) {
            m13601e(false, j10, str);
            return;
        }
        if (C1152l.m6736g()) {
            C1151k.m6709c("rbx.purchaseflow", "Luobu purchasing not enabled");
            m13601e(false, j10, str);
            return;
        }
        AbstractActivityC2841k0 mo12554m = this.f12982d.mo12554m();
        if (C3205h.m14141f0(mo12554m).mo13611b(j10, str, str2, mo12554m, true, this.f12984f)) {
            return;
        }
        m13604f(new c());
        m13601e(false, j10, str);
    }
}
