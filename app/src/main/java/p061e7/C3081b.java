package p061e7;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0803d;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2906t0;
import com.roblox.client.C2915y;
import com.roblox.client.app.C2743d;
import com.roblox.client.components.C2812m;
import com.roblox.client.components.RobloxToolbar;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p008a7.C0043a;
import p008a7.C0055m;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p035c9.C1151k;
import p239s7.C4537h;
import p313y7.C5902d;
import p313y7.C5903e;
import p313y7.C5904f;
import p313y7.C5905g;
import p313y7.C5906h;
import p314y8.EnumC5912f;

/* renamed from: e7.b */
/* loaded from: classes.dex */
public class C3081b extends C2906t0 {

    /* renamed from: A1 */
    private C5906h f12916A1;

    /* renamed from: B1 */
    private ProgressDialog f12917B1;

    /* renamed from: n1 */
    private String f12921n1;

    /* renamed from: p1 */
    private JSONObject f12923p1;

    /* renamed from: q1 */
    private boolean f12924q1;

    /* renamed from: r1 */
    protected RobloxToolbar f12925r1;

    /* renamed from: s1 */
    protected RobloxToolbar f12926s1;

    /* renamed from: t1 */
    protected C5902d f12927t1;

    /* renamed from: u1 */
    protected Menu f12928u1;

    /* renamed from: y1 */
    private View.OnClickListener f12932y1;

    /* renamed from: z1 */
    protected C5904f f12933z1;

    /* renamed from: k1 */
    protected String f12918k1 = null;

    /* renamed from: l1 */
    protected boolean f12919l1 = false;

    /* renamed from: m1 */
    private int f12920m1 = -1;

    /* renamed from: o1 */
    protected boolean f12922o1 = false;

    /* renamed from: v1 */
    private boolean f12929v1 = false;

    /* renamed from: w1 */
    private boolean f12930w1 = false;

    /* renamed from: x1 */
    private View f12931x1 = null;

    /* renamed from: e7.b$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C3081b.this.mo13201Q2()) {
                return;
            }
            C3081b c3081b = C3081b.this;
            if (c3081b.f12919l1) {
                c3081b.m4363p().onBackPressed();
            }
        }
    }

    /* renamed from: e7.b$b */
    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3081b.this.f12930w1 = true;
            ActivityC0803d m4363p = C3081b.this.m4363p();
            if (m4363p != null) {
                m4363p.onBackPressed();
            }
        }
    }

    /* renamed from: e7.b$c */
    /* loaded from: classes.dex */
    class c implements C4537h.c {

        /* renamed from: a */
        final /* synthetic */ Activity f12936a;

        c(Activity activity) {
            this.f12936a = activity;
        }

        @Override // p239s7.C4537h.c
        /* renamed from: a */
        public void mo13578a(boolean z10) {
            C1151k.m6714h("rbx.locale", "onAppLanguageChangeEvent(), Api call to get locale values");
            Activity activity = this.f12936a;
            if (activity == null || !activity.isFinishing()) {
                C3081b.this.m13570m3();
                if (z10) {
                    this.f12936a.recreate();
                    Activity activity2 = this.f12936a;
                    if (activity2 instanceof ActivityNativeMain) {
                        return;
                    }
                    activity2.finish();
                }
            }
        }
    }

    /* renamed from: l3 */
    private ProgressDialog m13569l3(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(str);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m3 */
    public void m13570m3() {
        ProgressDialog progressDialog = this.f12917B1;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f12917B1.dismiss();
    }

    /* renamed from: r3 */
    private void m13571r3() {
        C5902d c5902d = this.f12927t1;
        if (c5902d != null) {
            c5902d.m21005j();
        }
    }

    /* renamed from: s3 */
    private void m13572s3(String str) {
        C5906h c5906h;
        if (this.f12933z1 == null || (c5906h = this.f12916A1) == null) {
            return;
        }
        c5906h.m21035f(str);
        this.f12933z1.m21028r();
    }

    /* renamed from: t3 */
    private void m13573t3(boolean z10) {
        if (this.f12929v1 != z10) {
            C1151k.m6707a("rbx.web", "updateToolbar() canGoBack:" + z10);
            this.f12929v1 = z10;
            C2812m.m12455e(this.f12926s1, (z10 || this.f12919l1) ? this.f12932y1 : null);
        }
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C2738a0.f10408L, viewGroup, false);
        this.f12925r1 = (RobloxToolbar) linearLayout.findViewById(C2915y.f11905u1);
        RobloxToolbar robloxToolbar = (RobloxToolbar) linearLayout.findViewById(C2915y.f11908v1);
        this.f12926s1 = robloxToolbar;
        if (this.f12924q1) {
            this.f12925r1.setVisibility(8);
        } else {
            robloxToolbar.setThemeColorDelegate(new RobloxToolbar.C2795f());
            this.f12925r1.setIconDelegate(new RobloxToolbar.C2792c());
            this.f12925r1.setThemeColorDelegate(new RobloxToolbar.C2793d());
            this.f12925r1.setNavigationOnClickListener(new b());
        }
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(C2915y.f11873k);
        frameLayout.addView(super.mo264D0(layoutInflater, frameLayout, bundle));
        m13576p3(this.f12926s1.getMenu(), m4363p().getMenuInflater());
        this.f12931x1 = linearLayout;
        if (!this.f11675f1) {
            mo12850e3(false);
        }
        return linearLayout;
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: G0 */
    public void mo4280G0() {
        m13570m3();
        super.mo4280G0();
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: J0 */
    public void mo4287J0(boolean z10) {
        super.mo4287J0(z10);
        if (z10) {
            return;
        }
        m13571r3();
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: Q2 */
    public boolean mo13201Q2() {
        if (this.f12930w1) {
            return false;
        }
        return super.mo13201Q2();
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        this.f12926s1.mo12200U(enumC5912f);
        this.f12925r1.mo12200U(enumC5912f);
        ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            Menu menu = this.f12926s1.getMenu();
            menu.clear();
            m13576p3(menu, m4363p.getMenuInflater());
        }
        super.mo12200U(enumC5912f);
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        super.mo4319U0();
        m13571r3();
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        C1100c.m6458d().m6470n(this);
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        C1100c.m6458d().m6471p(this);
        super.mo4327X0();
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: Z2 */
    public void mo13204Z2(String str) {
        m13572s3(str);
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: b3 */
    public void mo13206b3(WebView webView, int i10) {
        super.mo13206b3(webView, i10);
        m13573t3(webView.canGoBack());
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: e3 */
    public void mo12850e3(boolean z10) {
        super.mo12850e3(z10);
        View view = this.f12931x1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: i3 */
    public void mo12851i3(C2743d c2743d) {
        super.mo12851i3(c2743d);
        String str = c2743d.f10469b;
        if (str != null) {
            this.f12926s1.setTitle(str);
        }
    }

    /* renamed from: n3 */
    protected void m13574n3(Menu menu, MenuInflater menuInflater) {
        C5902d c5902d = new C5902d(this);
        this.f12927t1 = c5902d;
        c5902d.m21002d(menu, menuInflater);
    }

    /* renamed from: o3 */
    void m13575o3(Activity activity, C4537h c4537h, C4537h.c cVar) {
        c4537h.m18589b(activity, true, cVar);
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onAppLocaleChangeEvent(C0043a c0043a) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p != null) {
            ProgressDialog m13569l3 = m13569l3(m4363p, m4328Y(C2748c0.f10614Z2));
            this.f12917B1 = m13569l3;
            m13569l3.show();
            m13575o3(m4363p, new C4537h(), new c(m4363p));
        }
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onUnreadNotificationCountEvent(C0055m c0055m) {
        C1151k.m6713g("GWF.onUnreadNotificationCountEvent() " + c0055m.m258a());
        C5902d c5902d = this.f12927t1;
        if (c5902d != null) {
            c5902d.m21005j();
        }
    }

    /* renamed from: p3 */
    protected void m13576p3(Menu menu, MenuInflater menuInflater) {
        this.f12928u1 = menu;
        if (!this.f12922o1) {
            m13577q3(menu, menuInflater, 34);
            new C5903e(this, this.f12918k1).m21008e(menu, menuInflater);
            m13574n3(menu, menuInflater);
        } else if (this.f12923p1.length() > 0) {
            m13577q3(menu, menuInflater, 54);
        }
    }

    /* renamed from: q3 */
    protected void m13577q3(Menu menu, MenuInflater menuInflater, int i10) {
        String optString = this.f12923p1.optString("searchType", null);
        if (optString != null) {
            this.f12916A1 = new C5905g(this, optString);
        }
        if (this.f12916A1 == null) {
            this.f12916A1 = new C5906h(this);
        }
        C5904f c5904f = new C5904f(this);
        this.f12933z1 = c5904f;
        c5904f.m21025n(menu);
        this.f12933z1.m21027p(this.f12926s1);
        this.f12933z1.m21026o(this.f12916A1);
        this.f12933z1.m21024k(menu, menuInflater);
        C2812m.m12451a(this.f12926s1, m4384w(), C2915y.f11852d, i10);
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        String str = this.f12921n1;
        if (str != null) {
            this.f12926s1.setTitle(str);
        } else {
            int i10 = this.f12920m1;
            if (i10 == -1) {
                this.f12926s1.setTitle(C2748c0.f10534J2);
            } else {
                this.f12926s1.setTitle(i10);
            }
        }
        C2812m.m12455e(this.f12926s1, this.f12919l1 ? this.f12932y1 : null);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        if (context instanceof ActivityNativeMain) {
            this.f12924q1 = true;
        }
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            this.f12920m1 = m4378u.getInt("TITLE_ID", -1);
            this.f12921n1 = m4378u.getString("TITLE_STRING");
            this.f12918k1 = m4378u.getString("REPORTING_TAB_NAME");
            this.f12919l1 = m4378u.getBoolean("HAS_PARENT");
            this.f12922o1 = m4378u.getBoolean("HIDE_ACCESSORY_BUTTONS");
            try {
                this.f12923p1 = new JSONObject(m4378u.getString("SEARCH_PARAMS", null));
            } catch (NullPointerException | JSONException unused) {
            }
        }
        if (this.f12923p1 == null) {
            this.f12923p1 = new JSONObject();
        }
        this.f12932y1 = new a();
    }
}
