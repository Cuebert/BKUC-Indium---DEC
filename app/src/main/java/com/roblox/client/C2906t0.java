package com.roblox.client;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0587a;
import androidx.fragment.app.ActivityC0803d;
import androidx.swiperefreshlayout.widget.C0932c;
import com.roblox.client.C2906t0;
import com.roblox.client.app.C2741b;
import com.roblox.client.app.C2743d;
import com.roblox.client.hybrid.RBHybridWebView;
import la.C3905c;
import na.EnumC4091f;
import org.greenrobot.eventbus.ThreadMode;
import p023b9.C1079c;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p033c7.C1134c;
import p035c9.C1151k;
import p035c9.C1152l;
import p061e7.C3089j;
import p062e8.AbstractC3097h;
import p062e8.InterfaceC3096g;
import p075f8.C3205h;
import p100h7.C3417j;
import p100h7.InterfaceC3420m;
import p141k7.C3761a;
import p167m9.C3967a;
import p167m9.C3968b;
import p191o9.C4159g;
import p250t7.C4736a;
import p276v8.C4993c;
import p299x6.C5556b;
import p300x7.C5560b;
import p300x7.C5565g;
import p314y8.EnumC5912f;

/* renamed from: com.roblox.client.t0 */
/* loaded from: classes.dex */
public class C2906t0 extends C2871m0 implements C0932c.j {

    /* renamed from: X0 */
    private String f11667X0;

    /* renamed from: Y0 */
    private ProgressDialog f11668Y0;

    /* renamed from: Z0 */
    protected FrameLayout f11669Z0;

    /* renamed from: a1 */
    private boolean f11670a1;

    /* renamed from: b1 */
    private f f11671b1;

    /* renamed from: c1 */
    protected ValueCallback<Uri[]> f11672c1;

    /* renamed from: g1 */
    private C2741b f11676g1;

    /* renamed from: Q0 */
    private TextView f11660Q0 = null;

    /* renamed from: R0 */
    protected RBHybridWebView f11661R0 = null;

    /* renamed from: S0 */
    private C0932c f11662S0 = null;

    /* renamed from: T0 */
    protected String f11663T0 = null;

    /* renamed from: U0 */
    private int f11664U0 = 0;

    /* renamed from: V0 */
    private int f11665V0 = 0;

    /* renamed from: W0 */
    protected String f11666W0 = null;

    /* renamed from: d1 */
    private boolean f11673d1 = false;

    /* renamed from: e1 */
    private boolean f11674e1 = false;

    /* renamed from: f1 */
    protected boolean f11675f1 = true;

    /* renamed from: h1 */
    final InterfaceC3096g f11677h1 = new b();

    /* renamed from: i1 */
    final InterfaceC3096g f11678i1 = new c();

    /* renamed from: j1 */
    private final InterfaceC3096g f11679j1 = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.t0$a */
    /* loaded from: classes.dex */
    public class a extends WebChromeClient {
        a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            if (z11) {
                ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
                message.sendToTarget();
                return true;
            }
            return super.onCreateWindow(webView, z10, z11, message);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            for (String str : permissionRequest.getResources()) {
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (C0587a.m3027a(C2906t0.this.m4363p(), C2872n.m12830h().m12841l().mo17022g(EnumC4091f.CAMERA)) != 0) {
                        C1151k.m6712f("rbx.web", "No permission granted for camera");
                        permissionRequest.deny();
                    } else {
                        C1151k.m6712f("rbx.web", "Permission granted for camera");
                        permissionRequest.grant(new String[]{str});
                    }
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            C2906t0.this.mo13206b3(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            C2906t0.this.f11672c1 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            C2906t0.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.t0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC3096g {
        b() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: b */
        public void mo13209b() {
            C2906t0.this.m13194g3();
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: c */
        public void mo13210c(AbstractC3097h abstractC3097h) {
            C2906t0.this.mo13197L2(abstractC3097h);
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: d */
        public void mo13211d() {
            C2906t0.this.m13188S2();
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: e */
        public void mo13212e() {
            C2906t0.this.m13194g3();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.t0$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC3096g {
        c() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: b */
        public void mo13209b() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: c */
        public void mo13210c(AbstractC3097h abstractC3097h) {
            C1151k.m6712f("rbx.amazon.purchaseflow", "onPurchaseFinishedListener: Result=" + abstractC3097h + ".");
            C2906t0.this.mo13197L2(abstractC3097h);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.t0$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC3096g {
        d() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: b */
        public void mo13209b() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: c */
        public void mo13210c(AbstractC3097h abstractC3097h) {
            C2906t0.this.mo13197L2(abstractC3097h);
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: d */
        public void mo13211d() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: e */
        public void mo13212e() {
            C2906t0.this.m13194g3();
        }
    }

    /* renamed from: com.roblox.client.t0$e */
    /* loaded from: classes.dex */
    public class e {
        public e() {
        }
    }

    /* renamed from: com.roblox.client.t0$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo12734a();
    }

    /* renamed from: com.roblox.client.t0$g */
    /* loaded from: classes.dex */
    public class g extends WebViewClient {

        /* renamed from: com.roblox.client.t0$g$a */
        /* loaded from: classes.dex */
        class a implements InterfaceC3420m {
            a() {
            }

            @Override // p100h7.InterfaceC3420m
            /* renamed from: a */
            public void mo12177a(C3417j c3417j) {
            }
        }

        protected g() {
        }

        /* renamed from: c */
        public /* synthetic */ void m13215c(ActivityC0803d activityC0803d, String str, WebView webView) {
            if (activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
                return;
            }
            C2906t0.this.f11660Q0.setText(str);
            webView.loadUrl(str);
        }

        /* renamed from: d */
        public /* synthetic */ void m13216d(String str, ActivityC0803d activityC0803d, WebView webView, boolean z10) {
            if (z10) {
                C1100c.m6458d().m6469j(new e());
                C3905c.m16561r().m16562e(str);
            } else {
                activityC0803d.runOnUiThread(new Runnable() { // from class: com.roblox.client.u0

                    /* renamed from: o */
                    public final /* synthetic */ ActivityC0803d f11689o;

                    /* renamed from: p */
                    public final /* synthetic */ String f11690p;

                    /* renamed from: q */
                    public final /* synthetic */ WebView f11691q;

                    public /* synthetic */ RunnableC2908u0(ActivityC0803d activityC0803d2, String str2, WebView webView2) {
                        r2 = activityC0803d2;
                        r3 = str2;
                        r4 = webView2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2906t0.g.this.m13215c(r2, r3, r4);
                    }
                });
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            C4159g.m17244h().m17247k(C2877p0.m12926i());
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C2906t0.this.f11662S0.setRefreshing(false);
            C1151k.m6712f("rbx.web", "onPageFinished. url=" + str);
            C2906t0.this.m13205a3(str);
            if (C3089j.m13595b().m13596a(str)) {
                C2906t0.this.f11661R0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C1151k.m6712f("rbx.web", "-> " + str);
            C2906t0.this.mo13204Z2(str);
            C2906t0.this.f11662S0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C1151k.m6712f("rbx.web", "-> " + str);
            if (str == null) {
                C1151k.m6709c("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                return false;
            }
            ActivityC0803d m4363p = C2906t0.this.m4363p();
            if (m4363p != null && !m4363p.isFinishing()) {
                if (C2906t0.this.m12821q2() || C2906t0.this.m13187R2(str)) {
                    return true;
                }
                if (C2906t0.this.m13192Y2(str)) {
                    C1151k.m6712f("rbx.web", "Navigating social media Link...");
                    return true;
                }
                if (str.equalsIgnoreCase(C2877p0.m12961z0())) {
                    if (C2906t0.this.f11671b1 != null) {
                        C2906t0.this.f11671b1.mo12734a();
                    }
                    return true;
                }
                if (C2877p0.m12929j0(str) && !C2906t0.this.f11670a1) {
                    C1151k.m6712f("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                    C2906t0 c2906t0 = C2906t0.this;
                    c2906t0.m12829y2(C4736a.m18881c(c2906t0.m4384w(), C2748c0.f10596W, new Object[0]), 1);
                    C5560b.m20357e().m20364h(m4363p, C5560b.f.LOGOUT_BY_401_ERROR_IN_WEB);
                    C2877p0.m12886R(str);
                    C5565g.m20445e().m20456d(new a());
                    return true;
                }
                String str2 = null;
                C2906t0.this.f11661R0.setOnTouchListener(null);
                C2906t0.this.m13193f3(str, true);
                if (str.contains("mobile-app-upgrades/buy?")) {
                    AbstractActivityC2837i0 abstractActivityC2837i0 = (AbstractActivityC2837i0) m4363p;
                    String m6390k = C1079c.m6380c().m6390k();
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("id");
                    C3205h m14141f0 = C3205h.m14141f0(abstractActivityC2837i0);
                    if (m14141f0 == null) {
                        C2906t0.this.m12823s2(C2748c0.f10741u4);
                    } else {
                        C2822f0.m12481c(C2906t0.this.mo13199O2(), "purchaseStart" + queryParameter);
                        try {
                            str2 = parse.getQueryParameter("recurring");
                        } catch (NullPointerException unused) {
                            C1151k.m6712f("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                        } catch (UnsupportedOperationException unused2) {
                            C1151k.m6712f("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                        }
                        if (!m14141f0.mo13612c(m6390k, queryParameter, abstractActivityC2837i0, C2906t0.this.f11677h1, Boolean.valueOf(str2).booleanValue())) {
                            C2906t0.this.m12823s2(C2748c0.f10717q4);
                        }
                    }
                    return true;
                }
                C3905c.m16561r().m16564h(str, new C3905c.d() { // from class: com.roblox.client.v0

                    /* renamed from: b */
                    public final /* synthetic */ String f11718b;

                    /* renamed from: c */
                    public final /* synthetic */ ActivityC0803d f11719c;

                    /* renamed from: d */
                    public final /* synthetic */ WebView f11720d;

                    public /* synthetic */ C2910v0(String str3, ActivityC0803d m4363p2, WebView webView2) {
                        r2 = str3;
                        r3 = m4363p2;
                        r4 = webView2;
                    }

                    @Override // la.C3905c.d
                    /* renamed from: a */
                    public final void mo12241a(boolean z10) {
                        C2906t0.g.this.m13216d(r2, r3, r4, z10);
                    }
                });
                return true;
            }
            C1151k.m6712f("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
            return true;
        }
    }

    /* renamed from: M2 */
    private ProgressDialog m13186M2(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    /* renamed from: R2 */
    public boolean m13187R2(String str) {
        Intent intent;
        if (str.startsWith("mailto:")) {
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else {
            intent = str.startsWith("tel:") ? new Intent("android.intent.action.DIAL", Uri.parse(str)) : null;
        }
        if (intent == null) {
            return false;
        }
        if (C1152l.m6730a(m4384w(), intent)) {
            m4318T1(intent);
            return true;
        }
        m12828x2(C2748c0.f10704o3, 1);
        return true;
    }

    /* renamed from: S2 */
    public void m13188S2() {
        ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: com.roblox.client.q0

                /* renamed from: o */
                public final /* synthetic */ ActivityC0803d f11486o;

                public /* synthetic */ RunnableC2886q0(ActivityC0803d m4363p2) {
                    r2 = m4363p2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2906t0.this.m13190V2(r2);
                }
            });
        }
    }

    /* renamed from: U2 */
    public /* synthetic */ void m13189U2(ActivityC0803d activityC0803d, AbstractC3097h abstractC3097h) {
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
            return;
        }
        m13188S2();
        m13195h3(abstractC3097h);
    }

    /* renamed from: V2 */
    public /* synthetic */ void m13190V2(ActivityC0803d activityC0803d) {
        ProgressDialog progressDialog;
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed() || (progressDialog = this.f11668Y0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f11668Y0.dismiss();
    }

    /* renamed from: W2 */
    public /* synthetic */ void m13191W2(ActivityC0803d activityC0803d) {
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
            return;
        }
        if (this.f11668Y0 == null) {
            this.f11668Y0 = m13186M2(activityC0803d, null, m4328Y(C2748c0.f10668i3));
        }
        this.f11668Y0.show();
    }

    /* renamed from: Y2 */
    public boolean m13192Y2(String str) {
        C4993c c4993c = new C4993c("rbx.web");
        if (!c4993c.m19444d(str)) {
            return false;
        }
        c4993c.m19439b(m4363p(), str, str);
        return true;
    }

    /* renamed from: f3 */
    public void m13193f3(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f11661R0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f11661R0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    /* renamed from: g3 */
    public void m13194g3() {
        ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: com.roblox.client.r0

                /* renamed from: o */
                public final /* synthetic */ ActivityC0803d f11497o;

                public /* synthetic */ RunnableC2888r0(ActivityC0803d m4363p2) {
                    r2 = m4363p2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2906t0.this.m13191W2(r2);
                }
            });
        }
    }

    /* renamed from: h3 */
    private void m13195h3(AbstractC3097h abstractC3097h) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p == null) {
            return;
        }
        CharSequence mo13618b = abstractC3097h.mo13618b(m4363p);
        if (abstractC3097h.mo13620e()) {
            m12825u2(mo13618b);
        } else {
            m12822r2(mo13618b.toString());
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2738a0.f10424o, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C2915y.f11878l1);
        this.f11660Q0 = (TextView) inflate.findViewById(C2915y.f11812K1);
        g gVar = new g();
        RBHybridWebView m13198N2 = m13198N2();
        this.f11661R0 = m13198N2;
        viewGroup2.addView(m13198N2, new ViewGroup.LayoutParams(-1, -1));
        this.f11661R0.setTag(this.f11667X0);
        this.f11661R0.setWebViewClient(gVar);
        this.f11661R0.getSettings().setSupportMultipleWindows(true);
        this.f11661R0.setWebChromeClient(new a());
        try {
            this.f11661R0.getSettings().setJavaScriptEnabled(true);
            if (C1134c.m6537a().mo6548E0()) {
                this.f11661R0.getSettings().setDomStorageEnabled(true);
            }
            this.f11661R0.getSettings().setUserAgentString(C2877p0.m12903Z0());
            this.f11661R0.getSettings().setCacheMode(-1);
            this.f11661R0.setHorizontalScrollBarEnabled(false);
            this.f11661R0.setVerticalScrollBarEnabled(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String userAgentString = this.f11661R0.getSettings().getUserAgentString();
        this.f11661R0.getSettings().setUserAgentString(null);
        String userAgentString2 = this.f11661R0.getSettings().getUserAgentString();
        this.f11661R0.getSettings().setUserAgentString(userAgentString);
        userAgentString2.contains("Chrome/");
        if (C5556b.m20348a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        String str = this.f11663T0;
        if (str != null) {
            this.f11661R0.loadUrl(str);
            this.f11663T0 = null;
        }
        C0932c c0932c = (C0932c) inflate.findViewById(C2915y.f11878l1);
        this.f11662S0 = c0932c;
        c0932c.setOnRefreshListener(this);
        C0932c c0932c2 = this.f11662S0;
        int i10 = C2909v.f11699h;
        int i11 = C2909v.f11716y;
        c0932c2.setColorSchemeResources(i10, i10, i11, i11);
        this.f11669Z0 = (FrameLayout) inflate.findViewById(C2915y.f11899s1);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            this.f11664U0 = m4378u.getInt("dialogHeight", 0);
            this.f11665V0 = m4378u.getInt("dialogWidth", 0);
            if (!m4378u.getBoolean("enablePullToRefresh", true)) {
                this.f11662S0.setEnabled(false);
            }
            this.f11670a1 = m4378u.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f11675f1 = m4378u.getBoolean("VISIBLE", true);
            this.f11674e1 = m4378u.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        m12821q2();
        this.f11661R0.mo12621g();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: E0 */
    public void mo4274E0() {
        C3968b.m16694a().m6471p(this);
        super.mo4274E0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        super.mo4280G0();
        this.f11661R0.mo12622h();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: J0 */
    public void mo4287J0(boolean z10) {
        super.mo4287J0(z10);
        if (z10 || !C3089j.m13595b().m13596a(this.f11661R0.getUrl())) {
            return;
        }
        this.f11661R0.reload();
    }

    /* renamed from: L2 */
    public void mo13197L2(AbstractC3097h abstractC3097h) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: com.roblox.client.s0

                /* renamed from: o */
                public final /* synthetic */ ActivityC0803d f11512o;

                /* renamed from: p */
                public final /* synthetic */ AbstractC3097h f11513p;

                public /* synthetic */ RunnableC2894s0(ActivityC0803d m4363p2, AbstractC3097h abstractC3097h2) {
                    r2 = m4363p2;
                    r3 = abstractC3097h2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2906t0.this.m13189U2(r2, r3);
                }
            });
        }
    }

    /* renamed from: N2 */
    public RBHybridWebView m13198N2() {
        if (this.f11673d1) {
            return new C3761a(m4384w());
        }
        return new RBHybridWebView(m4384w());
    }

    /* renamed from: O2 */
    public String mo13199O2() {
        return "undefinedWebContext";
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P0 */
    public void mo4305P0() {
        super.mo4305P0();
        RBHybridWebView rBHybridWebView = this.f11661R0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    /* renamed from: P2 */
    public String m13200P2() {
        RBHybridWebView rBHybridWebView = this.f11661R0;
        if (rBHybridWebView == null) {
            return this.f11663T0;
        }
        return rBHybridWebView.getUrl();
    }

    /* renamed from: Q2 */
    public boolean mo13201Q2() {
        RBHybridWebView rBHybridWebView = this.f11661R0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        m13193f3(this.f11661R0.getUrl(), false);
        this.f11661R0.goBack();
        return true;
    }

    /* renamed from: T2 */
    public boolean m13202T2() {
        return this.f11674e1;
    }

    @Override // com.roblox.client.C2871m0, p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        super.mo12200U(enumC5912f);
        this.f11661R0.setBackgroundColor(this.f11676g1.mo12228a(C1079c.m6380c().m6386g()));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        Window window;
        super.mo4319U0();
        if (m4598d2() != null && this.f11664U0 != 0 && (window = m4598d2().getWindow()) != null) {
            int i10 = this.f11665V0;
            if (i10 == 0) {
                window.setLayout(-2, this.f11664U0);
            } else {
                window.setLayout(i10, this.f11664U0);
            }
        }
        RBHybridWebView rBHybridWebView = this.f11661R0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
    }

    /* renamed from: X2 */
    public void m13203X2(String str) {
        RBHybridWebView rBHybridWebView = this.f11661R0;
        if (rBHybridWebView == null) {
            this.f11663T0 = str;
        } else {
            rBHybridWebView.loadUrl(str);
        }
    }

    /* renamed from: Z2 */
    public void mo13204Z2(String str) {
    }

    /* renamed from: a3 */
    public void m13205a3(String str) {
    }

    /* renamed from: b3 */
    public void mo13206b3(WebView webView, int i10) {
    }

    @Override // androidx.swiperefreshlayout.widget.C0932c.j
    /* renamed from: c */
    public void mo5966c() {
        if (m4363p() != null) {
            if (!((AbstractActivityC2837i0) m4363p()).m12648g1()) {
                this.f11661R0.reload();
            } else {
                this.f11662S0.setRefreshing(false);
            }
        }
    }

    /* renamed from: c3 */
    public void m13207c3(boolean z10) {
        this.f11674e1 = z10;
    }

    /* renamed from: d3 */
    public void m13208d3(f fVar) {
        this.f11671b1 = fVar;
    }

    /* renamed from: e3 */
    public void mo12850e3(boolean z10) {
        this.f11675f1 = z10;
    }

    /* renamed from: i3 */
    public void mo12851i3(C2743d c2743d) {
        Boolean bool = c2743d.f10470c;
        if (bool != null) {
            mo12850e3(bool.booleanValue());
        }
        Boolean bool2 = c2743d.f10472e;
        if (bool2 != null) {
            m13207c3(bool2.booleanValue());
        }
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(C3967a c3967a) {
        if (this.f11661R0 instanceof RBHybridWebView) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u0 */
    public void mo4379u0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f11672c1.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                C1151k.m6712f("rbx.web", "Result of file chooser invalid.");
                this.f11672c1.onReceiveValue(null);
            }
        }
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        C3968b.m16694a().m6470n(this);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            String string = m4378u.getString("DEFAULT_URL", null);
            C1151k.m6707a("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f11666W0 = string;
                if (this.f11663T0 == null) {
                    this.f11663T0 = string;
                }
            }
            this.f11667X0 = m4378u.getString("WEB_VIEW_TAG", null);
            this.f11673d1 = m4378u.getBoolean("USE_APP_HYBRID");
        }
        this.f11676g1 = new C2741b(m4384w());
    }
}
