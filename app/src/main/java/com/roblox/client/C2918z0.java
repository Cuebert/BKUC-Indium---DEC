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
import android.view.WindowManager;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0152b;
import androidx.core.content.C0587a;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.C0932c;
import com.roblox.client.C2918z0;
import com.roblox.client.app.C2741b;
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
import p049d9.C3025b;
import p049d9.C3026c;
import p061e7.C3089j;
import p062e8.AbstractC3097h;
import p062e8.InterfaceC3092c;
import p062e8.InterfaceC3096g;
import p075f8.C3205h;
import p100h7.C3417j;
import p100h7.InterfaceC3420m;
import p141k7.C3761a;
import p167m9.C3967a;
import p167m9.C3968b;
import p189o7.C4146b;
import p191o9.C4159g;
import p250t7.C4736a;
import p276v8.C4993c;
import p299x6.C5556b;
import p300x7.C5560b;
import p300x7.C5565g;
import p314y8.C5911e;
import p314y8.EnumC5912f;

/* renamed from: com.roblox.client.z0 */
/* loaded from: classes.dex */
public class C2918z0 extends Fragment implements C0932c.j, C5911e.b {

    /* renamed from: A0 */
    protected ValueCallback<Uri[]> f11926A0;

    /* renamed from: E0 */
    private C2741b f11930E0;

    /* renamed from: F0 */
    private C4146b f11931F0;

    /* renamed from: G0 */
    private C5911e f11932G0;

    /* renamed from: v0 */
    private String f11943v0;

    /* renamed from: w0 */
    private ProgressDialog f11944w0;

    /* renamed from: x0 */
    protected FrameLayout f11945x0;

    /* renamed from: y0 */
    private boolean f11946y0;

    /* renamed from: z0 */
    private g f11947z0;

    /* renamed from: o0 */
    private TextView f11936o0 = null;

    /* renamed from: p0 */
    protected RBHybridWebView f11937p0 = null;

    /* renamed from: q0 */
    private C0932c f11938q0 = null;

    /* renamed from: r0 */
    protected String f11939r0 = null;

    /* renamed from: s0 */
    private int f11940s0 = 0;

    /* renamed from: t0 */
    private int f11941t0 = 0;

    /* renamed from: u0 */
    protected String f11942u0 = null;

    /* renamed from: B0 */
    private boolean f11927B0 = false;

    /* renamed from: C0 */
    private boolean f11928C0 = false;

    /* renamed from: D0 */
    protected boolean f11929D0 = true;

    /* renamed from: H0 */
    final InterfaceC3096g f11933H0 = new b();

    /* renamed from: I0 */
    final InterfaceC3096g f11934I0 = new c();

    /* renamed from: J0 */
    private final InterfaceC3096g f11935J0 = new d();

    /* renamed from: com.roblox.client.z0$a */
    /* loaded from: classes.dex */
    class a extends WebChromeClient {
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
                    if (C0587a.m3027a(C2918z0.this.m4363p(), C2872n.m12830h().m12841l().mo17022g(EnumC4091f.CAMERA)) != 0) {
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
            C2918z0.this.m13244C2(webView, i10);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            C2918z0.this.f11926A0 = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            C2918z0.this.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 20123);
            return true;
        }
    }

    /* renamed from: com.roblox.client.z0$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC3096g {
        b() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: b */
        public void mo13209b() {
            C2918z0.this.m13218E2();
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: c */
        public void mo13210c(AbstractC3097h abstractC3097h) {
            C2918z0.this.mo13245k2(abstractC3097h);
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: d */
        public void mo13211d() {
            C2918z0.this.m13236s2();
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: e */
        public void mo13212e() {
            C2918z0.this.m13218E2();
        }
    }

    /* renamed from: com.roblox.client.z0$c */
    /* loaded from: classes.dex */
    class c implements InterfaceC3096g {
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
            C2918z0.this.mo13245k2(abstractC3097h);
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

    /* renamed from: com.roblox.client.z0$d */
    /* loaded from: classes.dex */
    class d implements InterfaceC3096g {
        d() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: b */
        public void mo13209b() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: c */
        public void mo13210c(AbstractC3097h abstractC3097h) {
            C2918z0.this.mo13245k2(abstractC3097h);
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: d */
        public void mo13211d() {
        }

        @Override // p062e8.InterfaceC3096g
        /* renamed from: e */
        public void mo13212e() {
            C2918z0.this.m13218E2();
        }
    }

    /* renamed from: com.roblox.client.z0$e */
    /* loaded from: classes.dex */
    static /* synthetic */ class e {

        /* renamed from: a */
        static final /* synthetic */ int[] f11952a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f11952a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11952a[EnumC5912f.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11952a[EnumC5912f.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.roblox.client.z0$f */
    /* loaded from: classes.dex */
    public class f {
        public f() {
        }
    }

    /* renamed from: com.roblox.client.z0$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void m13252a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.roblox.client.z0$h */
    /* loaded from: classes.dex */
    public class h extends WebViewClient {

        /* renamed from: com.roblox.client.z0$h$a */
        /* loaded from: classes.dex */
        class a implements InterfaceC3420m {
            a() {
            }

            @Override // p100h7.InterfaceC3420m
            /* renamed from: a */
            public void mo12177a(C3417j c3417j) {
            }
        }

        protected h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m13255c(ActivityC0803d activityC0803d, String str, WebView webView) {
            if (activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
                return;
            }
            C2918z0.this.f11936o0.setText(str);
            webView.loadUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m13256d(final String str, final ActivityC0803d activityC0803d, final WebView webView, boolean z10) {
            if (z10) {
                C1100c.m6458d().m6469j(new f());
                C3905c.m16561r().m16562e(str);
            } else {
                activityC0803d.runOnUiThread(new Runnable() { // from class: com.roblox.client.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2918z0.h.this.m13255c(activityC0803d, str, webView);
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
            C2918z0.this.f11938q0.setRefreshing(false);
            C1151k.m6712f("rbx.web", "onPageFinished. url=" + str);
            C2918z0.this.m13243B2(str);
            if (C3089j.m13595b().m13596a(str)) {
                C2918z0.this.f11937p0.reload();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C1151k.m6712f("rbx.web", "-> " + str);
            C2918z0.this.m13242A2(str);
            C2918z0.this.f11938q0.setRefreshing(true);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(final WebView webView, final String str) {
            C1151k.m6712f("rbx.web", "-> " + str);
            if (str == null) {
                C1151k.m6709c("rbx.web", "RWF.shouldOverrideUrlLoading() urlString is null!");
                return false;
            }
            final ActivityC0803d m4363p = C2918z0.this.m4363p();
            if (m4363p != null && !m4363p.isFinishing()) {
                try {
                    if (C2918z0.this.m13247o2().m12648g1()) {
                        return true;
                    }
                } catch (C2839j0 unused) {
                    C2918z0.m13240y2();
                }
                if (C2918z0.this.m13235r2(str)) {
                    return true;
                }
                if (C2918z0.this.m13241z2(str)) {
                    C1151k.m6712f("rbx.web", "Navigating social media Link...");
                    return true;
                }
                if (str.equalsIgnoreCase(C2877p0.m12961z0())) {
                    if (C2918z0.this.f11947z0 != null) {
                        C2918z0.this.f11947z0.m13252a();
                    }
                    return true;
                }
                if (C2877p0.m12929j0(str) && !C2918z0.this.f11946y0) {
                    C1151k.m6712f("rbx.web", "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!");
                    try {
                        C2918z0.this.m13247o2().m12676e1(C4736a.m18881c(C2918z0.this.m4384w(), C2748c0.f10596W, new Object[0]), 1);
                    } catch (C2839j0 unused2) {
                        C2918z0.m13240y2();
                    }
                    C5560b.m20357e().m20364h(m4363p, C5560b.f.LOGOUT_BY_401_ERROR_IN_WEB);
                    C2877p0.m12886R(str);
                    C5565g.m20445e().m20456d(new a());
                    return true;
                }
                String str2 = null;
                C2918z0.this.f11937p0.setOnTouchListener(null);
                C2918z0.this.m13217D2(str, true);
                if (str.contains("mobile-app-upgrades/buy?")) {
                    AbstractActivityC2837i0 abstractActivityC2837i0 = (AbstractActivityC2837i0) m4363p;
                    String m6390k = C1079c.m6380c().m6390k();
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("id");
                    C3205h m14141f0 = C3205h.m14141f0(abstractActivityC2837i0);
                    if (m14141f0 == null) {
                        try {
                            C2918z0.this.m13247o2().m12670W0(C2748c0.f10741u4);
                        } catch (C2839j0 unused3) {
                            C2918z0.m13240y2();
                        }
                    } else {
                        C2822f0.m12481c(C2918z0.this.mo13248p2(), "purchaseStart" + queryParameter);
                        try {
                            str2 = parse.getQueryParameter("recurring");
                        } catch (NullPointerException unused4) {
                            C1151k.m6712f("rbx.purchaseflow", "NullPointerException thrown while parsing recurring parameter for purchase url");
                        } catch (UnsupportedOperationException unused5) {
                            C1151k.m6712f("rbx.purchaseflow", "UnsupportedOperationException thrown while parsing recurring parameter for purchase url");
                        }
                        if (!m14141f0.mo13612c(m6390k, queryParameter, abstractActivityC2837i0, C2918z0.this.f11933H0, Boolean.valueOf(str2).booleanValue())) {
                            try {
                                C2918z0.this.m13247o2().m12670W0(C2748c0.f10717q4);
                            } catch (C2839j0 unused6) {
                                C2918z0.m13240y2();
                            }
                        }
                    }
                    return true;
                }
                C3905c.m16561r().m16564h(str, new C3905c.d() { // from class: com.roblox.client.b1
                    @Override // la.C3905c.d
                    /* renamed from: a */
                    public final void mo12241a(boolean z10) {
                        C2918z0.h.this.m13256d(str, m4363p, webView, z10);
                    }
                });
                return true;
            }
            C1151k.m6712f("rbx.web", "RWF.shouldOverrideUrlLoading() activity is null or finishing");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D2 */
    public void m13217D2(String str, boolean z10) {
        if (str.contains("sponsored")) {
            this.f11937p0.getSettings().setBuiltInZoomControls(z10);
        } else {
            this.f11937p0.getSettings().setBuiltInZoomControls(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E2 */
    public void m13218E2() {
        final ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: com.roblox.client.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C2918z0.this.m13239w2(m4363p);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F2 */
    private void m13219F2(AbstractC3097h abstractC3097h) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p == null) {
            return;
        }
        boolean z10 = false;
        if (C1134c.m6537a().mo6645s0()) {
            z10 = C1134c.m6537a().mo6627m().contains(((InterfaceC3092c) abstractC3097h).mo13609a());
        }
        C1151k.m6707a("rbx.web", "isBonusItemEnabled = " + z10);
        CharSequence mo13618b = abstractC3097h.mo13618b(m4363p);
        if (abstractC3097h.mo13620e()) {
            m13233l2(mo13618b);
            return;
        }
        try {
            if (z10) {
                m13247o2().m12669V0(m4328Y(C2748c0.f10729s4), m4328Y(C2748c0.f10735t4));
            } else {
                m13247o2().m12668U0(mo13618b.toString());
            }
        } catch (C2839j0 unused) {
            m13240y2();
        }
    }

    /* renamed from: l2 */
    private synchronized void m13233l2(CharSequence charSequence) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p == null) {
            return;
        }
        DialogC0152b m695a = new DialogC0152b.a(m4363p).m695a();
        TextView textView = new TextView(m4363p);
        String string = m4363p.getString(C2748c0.f10722r3);
        int indexOf = charSequence.toString().indexOf(string);
        C3025b.m13495e(textView, charSequence.toString(), new C3026c(m4363p, null, string, indexOf, indexOf + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        m695a.m694i(textView, 150, 100, 150, 100);
        m695a.setCanceledOnTouchOutside(true);
        try {
            m695a.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* renamed from: m2 */
    private ProgressDialog m13234m2(Context context, String str, String str2) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(str);
        progressDialog.setMessage(str2);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public boolean m13235r2(String str) {
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
        try {
            m13247o2().m12675d1(C2748c0.f10704o3, 1);
        } catch (C2839j0 unused) {
            m13240y2();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public void m13236s2() {
        final ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: com.roblox.client.x0
                @Override // java.lang.Runnable
                public final void run() {
                    C2918z0.this.m13238v2(m4363p);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void m13237u2(ActivityC0803d activityC0803d, AbstractC3097h abstractC3097h) {
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
            return;
        }
        m13236s2();
        m13219F2(abstractC3097h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void m13238v2(ActivityC0803d activityC0803d) {
        ProgressDialog progressDialog;
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed() || (progressDialog = this.f11944w0) == null || !progressDialog.isShowing()) {
            return;
        }
        this.f11944w0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void m13239w2(ActivityC0803d activityC0803d) {
        if (activityC0803d == null || activityC0803d.isFinishing() || activityC0803d.isDestroyed()) {
            return;
        }
        if (this.f11944w0 == null) {
            this.f11944w0 = m13234m2(activityC0803d, null, m4328Y(C2748c0.f10668i3));
        }
        this.f11944w0.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y2 */
    public static void m13240y2() {
        C1151k.m6716j("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z2 */
    public boolean m13241z2(String str) {
        C4993c c4993c = new C4993c("rbx.web");
        if (!c4993c.m19444d(str)) {
            return false;
        }
        c4993c.m19439b(m4363p(), str, str);
        return true;
    }

    /* renamed from: A2 */
    public void m13242A2(String str) {
    }

    /* renamed from: B2 */
    public void m13243B2(String str) {
    }

    /* renamed from: C2 */
    public void m13244C2(WebView webView, int i10) {
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2738a0.f10433x, viewGroup, false);
        if (C1134c.m6537a().mo6602d1()) {
            this.f11931F0 = new C4146b();
            ((ViewGroup.MarginLayoutParams) inflate.getLayoutParams()).topMargin = 0;
            View m17194e = this.f11931F0.m17194e(layoutInflater, this);
            this.f11931F0.m17193c().addView(inflate);
            inflate = m17194e;
        }
        int i10 = C2915y.f11878l1;
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(i10);
        this.f11936o0 = (TextView) inflate.findViewById(C2915y.f11812K1);
        h hVar = new h();
        RBHybridWebView m13246n2 = m13246n2();
        this.f11937p0 = m13246n2;
        viewGroup2.addView(m13246n2, new ViewGroup.LayoutParams(-1, -1));
        this.f11937p0.setTag(this.f11943v0);
        this.f11937p0.setWebViewClient(hVar);
        this.f11937p0.getSettings().setSupportMultipleWindows(true);
        this.f11937p0.setWebChromeClient(new a());
        this.f11937p0.getSettings().setJavaScriptEnabled(true);
        this.f11937p0.getSettings().setUserAgentString(C2877p0.m12903Z0());
        this.f11937p0.getSettings().setCacheMode(-1);
        this.f11937p0.setHorizontalScrollBarEnabled(false);
        this.f11937p0.setVerticalScrollBarEnabled(false);
        String userAgentString = this.f11937p0.getSettings().getUserAgentString();
        this.f11937p0.getSettings().setUserAgentString(null);
        String userAgentString2 = this.f11937p0.getSettings().getUserAgentString();
        this.f11937p0.getSettings().setUserAgentString(userAgentString);
        userAgentString2.contains("Chrome/");
        if (C5556b.m20348a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        String str = this.f11939r0;
        if (str != null) {
            this.f11937p0.loadUrl(str);
            this.f11939r0 = null;
        }
        C0932c c0932c = (C0932c) inflate.findViewById(i10);
        this.f11938q0 = c0932c;
        c0932c.setOnRefreshListener(this);
        C0932c c0932c2 = this.f11938q0;
        int i11 = C2909v.f11699h;
        int i12 = C2909v.f11716y;
        c0932c2.setColorSchemeResources(i11, i11, i12, i12);
        this.f11945x0 = (FrameLayout) inflate.findViewById(C2915y.f11899s1);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            this.f11940s0 = m4378u.getInt("dialogHeight", 0);
            this.f11941t0 = m4378u.getInt("dialogWidth", 0);
            if (!m4378u.getBoolean("enablePullToRefresh", true)) {
                this.f11938q0.setEnabled(false);
            }
            this.f11946y0 = m4378u.getBoolean("USING_LOGIN_WEB_URL", false);
            this.f11929D0 = m4378u.getBoolean("VISIBLE", true);
            this.f11928C0 = m4378u.getBoolean("BACK_NAVIGATION_DISABLED", false);
        }
        try {
            m13247o2().m12648g1();
        } catch (C2839j0 unused) {
            m13240y2();
        }
        this.f11937p0.mo12621g();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: E0 */
    public void mo4274E0() {
        C3968b.m16694a().m6471p(this);
        super.mo4274E0();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        super.mo4280G0();
        this.f11937p0.mo12622h();
        this.f11931F0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: J0 */
    public void mo4287J0(boolean z10) {
        super.mo4287J0(z10);
        if (z10 || !C3089j.m13595b().m13596a(this.f11937p0.getUrl())) {
            return;
        }
        this.f11937p0.reload();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P0 */
    public void mo4305P0() {
        super.mo4305P0();
        RBHybridWebView rBHybridWebView = this.f11937p0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onPause();
        }
    }

    @Override // p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        int color;
        C1151k.m6707a("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + enumC5912f);
        if (this.f11931F0 != null) {
            int i10 = e.f11952a[enumC5912f.ordinal()];
            if (i10 == 1) {
                color = m4307Q().getColor(C2909v.f11714w);
            } else if (i10 != 2) {
                color = m4307Q().getColor(C2909v.f11707p);
            } else {
                color = m4307Q().getColor(C2909v.f11693b);
            }
            this.f11931F0.m17196g(color);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        super.mo4319U0();
        RBHybridWebView rBHybridWebView = this.f11937p0;
        if (rBHybridWebView != null) {
            rBHybridWebView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
    }

    @Override // androidx.swiperefreshlayout.widget.C0932c.j
    /* renamed from: c */
    public void mo5966c() {
        if (m4363p() != null) {
            if (!((AbstractActivityC2837i0) m4363p()).m12648g1()) {
                this.f11937p0.reload();
            } else {
                this.f11938q0.setRefreshing(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k2 */
    public void mo13245k2(final AbstractC3097h abstractC3097h) {
        final ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            m4363p.runOnUiThread(new Runnable() { // from class: com.roblox.client.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C2918z0.this.m13237u2(m4363p, abstractC3097h);
                }
            });
        }
    }

    /* renamed from: n2 */
    public RBHybridWebView m13246n2() {
        if (this.f11927B0) {
            return new C3761a(m4384w());
        }
        return new RBHybridWebView(m4384w());
    }

    /* renamed from: o2 */
    protected AbstractActivityC2837i0 m13247o2() throws C2839j0 {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2837i0) {
            return (AbstractActivityC2837i0) m4363p;
        }
        throw new C2839j0();
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onEmitRbHybridEvent(C3967a c3967a) {
        if (this.f11937p0 instanceof RBHybridWebView) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p2 */
    public String mo13248p2() {
        return "undefinedWebContext";
    }

    /* renamed from: q2 */
    public boolean m13249q2() {
        RBHybridWebView rBHybridWebView = this.f11937p0;
        if (rBHybridWebView == null || !rBHybridWebView.canGoBack()) {
            return false;
        }
        m13217D2(this.f11937p0.getUrl(), false);
        this.f11937p0.goBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        if (C1134c.m6537a().mo6602d1()) {
            C5911e c5911e = new C5911e(this);
            this.f11932G0 = c5911e;
            c5911e.m21041b(this);
        }
    }

    /* renamed from: t2 */
    public boolean m13250t2() {
        return this.f11928C0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u0 */
    public void mo4379u0(int i10, int i11, Intent intent) {
        if (i10 == 20123) {
            if (i11 == -1) {
                this.f11926A0.onReceiveValue(new Uri[]{intent.getData()});
            } else {
                C1151k.m6712f("rbx.web", "Result of file chooser invalid.");
                this.f11926A0.onReceiveValue(null);
            }
        }
    }

    /* renamed from: x2 */
    public void m13251x2(String str) {
        RBHybridWebView rBHybridWebView = this.f11937p0;
        if (rBHybridWebView == null) {
            this.f11939r0 = str;
        } else {
            rBHybridWebView.loadUrl(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        C3968b.m16694a().m6470n(this);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            String string = m4378u.getString("DEFAULT_URL", null);
            C1151k.m6707a("rbx.web", "onCreate: default-URL = " + string + ".");
            if (string != null) {
                this.f11942u0 = string;
                if (this.f11939r0 == null) {
                    this.f11939r0 = string;
                }
            }
            this.f11943v0 = m4378u.getString("WEB_VIEW_TAG", null);
            this.f11927B0 = m4378u.getBoolean("USE_APP_HYBRID");
        }
        this.f11930E0 = new C2741b(m4384w());
    }
}
