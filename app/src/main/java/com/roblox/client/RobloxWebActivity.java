package com.roblox.client;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0819t;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0853t;
import com.roblox.client.C2906t0;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.engine.jni.NativeGLInterface;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0046d;
import p008a7.C0050h;
import p008a7.C0051i;
import p008a7.C0053k;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p035c9.C1151k;
import p102h9.C3447a;
import p227r8.C4455c;
import p300x7.C5560b;
import p300x7.C5562d;
import p314y8.EnumC5912f;

/* loaded from: classes.dex */
public class RobloxWebActivity extends AbstractActivityC2837i0 implements C5562d.e {

    /* renamed from: S */
    protected int f10389S;

    /* renamed from: T */
    protected int f10390T;

    /* renamed from: U */
    protected Toolbar f10391U;

    /* renamed from: V */
    private DataModelFocusLifecycleObserver f10392V = new DataModelFocusLifecycleObserver();

    /* loaded from: classes.dex */
    public class DataModelFocusLifecycleObserver implements InterfaceC0844k {
        public DataModelFocusLifecycleObserver() {
        }

        @InterfaceC0853t(AbstractC0839f.b.ON_CREATE)
        public void onFragmentCreated() {
            C1151k.m6707a("RobloxActivity", "onFragmentCreated");
            C3447a c3447a = new C3447a(false);
            NativeGLInterface.nativeBroadcastEventWithNamespace(c3447a.f14340a, c3447a.f14341b, c3447a.f14342c);
        }

        @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
        public void onFragmentDestroyed() {
            C1151k.m6707a("RobloxActivity", "onFragmentDestroyed");
            C3447a c3447a = new C3447a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(c3447a.f14340a, c3447a.f14341b, c3447a.f14342c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.RobloxWebActivity$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC2735a implements View.OnClickListener {
        ViewOnClickListenerC2735a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RobloxWebActivity.this.finish();
            RobloxWebActivity robloxWebActivity = RobloxWebActivity.this;
            robloxWebActivity.overridePendingTransition(robloxWebActivity.f10389S, robloxWebActivity.f10390T);
        }
    }

    /* renamed from: A1 */
    private void m12217A1(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", str);
        intent.putExtra("PATH_EXTRA", str2);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: B1 */
    private void m12218B1(String str) {
        Fragment m4498j0 = m4617y0().m4498j0(C2906t0.class.getName());
        if (m4498j0 instanceof C2906t0) {
            ((C2906t0) m4498j0).m13203X2(str);
        }
    }

    /* renamed from: D1 */
    private void m12219D1() {
        Fragment m4498j0 = m4617y0().m4498j0(C2906t0.class.getName());
        if (m4498j0 instanceof C2906t0) {
            ((C2906t0) m4498j0).mo5966c();
        }
    }

    /* renamed from: C1 */
    public void m12220C1(long j10, long j11) {
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "CHAT_TAG");
        if (j10 != -1) {
            intent.putExtra("CONVERSATION_ID_EXTRA", j10);
        }
        if (j11 != -1) {
            intent.putExtra("USER_ID_EXTRA", j11);
        }
        if (j11 != -1 || j10 != -1) {
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        ((RobloxToolbar) this.f10391U).mo12200U(enumC5912f);
        super.mo12200U(enumC5912f);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C2906t0 c2906t0 = (C2906t0) m4617y0().m4498j0(C2906t0.class.getName());
        if (c2906t0 == null || !c2906t0.mo13201Q2()) {
            super.onBackPressed();
            overridePendingTransition(this.f10389S, this.f10390T);
        }
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onCloseOverlayEvent(C0046d c0046d) {
        finish();
    }

    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        boolean z10;
        boolean z11;
        Fragment c2906t0;
        super.onCreate(bundle);
        setContentView(C2738a0.f10418i);
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            str2 = intent.getStringExtra("URL_EXTRA");
            str = intent.getStringExtra("TITLE_EXTRA");
            z10 = intent.getBooleanExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", false);
            z11 = intent.getBooleanExtra("USE_GENERIC_WEB_FRAG_EXTRA", false);
        } else {
            str = null;
            z10 = false;
            z11 = false;
        }
        if (str2 == null) {
            finish();
            return;
        }
        this.f10391U = (Toolbar) findViewById(C2915y.f11902t1);
        Bundle bundle2 = new Bundle();
        if (z11) {
            c2906t0 = C2872n.m12830h().m12832b();
            bundle2.putString("TITLE_STRING", str);
            bundle2.putBoolean("HAS_PARENT", true);
            bundle2.putBoolean("HIDE_ACCESSORY_BUTTONS", intent.getBooleanExtra("HIDE_ACCESSORY_BUTTONS_EXTRA", false));
            bundle2.putString("SEARCH_PARAMS", intent.getStringExtra("SEARCH_PARAMS"));
            this.f10391U.setVisibility(8);
            this.f10389S = 0;
            this.f10390T = 0;
        } else {
            c2906t0 = new C2906t0();
            Toolbar toolbar = this.f10391U;
            if (str == null) {
                str = getString(C2748c0.f10534J2);
            }
            toolbar.setTitle(str);
            if (C2877p0.m12937n0()) {
                this.f10391U.setSubtitle(C2877p0.m12913d(this));
            }
            Toolbar toolbar2 = this.f10391U;
            if (toolbar2 instanceof RobloxToolbar) {
                ((RobloxToolbar) toolbar2).setIconDelegate(new RobloxToolbar.C2792c());
            } else {
                toolbar2.setNavigationIcon(C2913x.f11764m);
            }
            this.f10391U.setNavigationOnClickListener(new ViewOnClickListenerC2735a());
            if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
                this.f10389S = 0;
                this.f10390T = 0;
            } else {
                this.f10389S = R.anim.fade_in;
                this.f10390T = C2905t.f11657a;
            }
        }
        if (z10) {
            c2906t0.mo583f().mo4889a(this.f10392V);
        }
        AbstractC0819t m4504m = m4617y0().m4504m();
        bundle2.putString("DEFAULT_URL", str2);
        bundle2.putBoolean("USING_LOGIN_WEB_URL", intent.getBooleanExtra("USING_LOGIN_WEB_URL", false));
        c2906t0.m4282H1(bundle2);
        m4504m.m4747c(C2915y.f11803H1, c2906t0, C2906t0.class.getName());
        m4504m.mo4559h();
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C0050h c0050h) {
        C1151k.m6707a("RobloxActivity", "RWF.onNavigateToConversationEvent() " + c0050h.f199a + " " + c0050h.f200b);
        m12220C1(c0050h.f199a, c0050h.f200b);
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C0051i c0051i) {
        if ("ABUSE_REPORT_TAG".equals(c0051i.f201a)) {
            C2827g.m12521d(this, c0051i.f202b, false);
        } else if (!"FRIEND_FINDER_TAG".equals(c0051i.f201a) && !"UNIVERSAL_FRIENDS_TAG".equals(c0051i.f201a)) {
            m12217A1(c0051i.f201a, c0051i.f202b);
        } else {
            C2827g.m12524g(this, C2877p0.m12878N(), getString(C2748c0.f10569Q2), "{\"searchType\":\"Players\"}");
        }
    }

    @InterfaceC1107j
    public void onNavigateToLuaEvent(C2906t0.e eVar) {
        finish();
    }

    @InterfaceC1107j
    public void onPushNotificationRegistrationFailedEvent(C0053k c0053k) {
        if (c0053k.m257a().equals("PushNotificationRegistrationFailed")) {
            Toast.makeText(this, getString(C2748c0.f10645e4), 0).show();
            m12219D1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStart() {
        super.onStart();
        C5562d.m20371c().m20373b(this);
        C1100c.m6458d().m6470n(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.appcompat.app.ActivityC0153c, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onStop() {
        C5562d.m20371c().m20376g(this);
        C1100c.m6458d().m6471p(this);
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @p024bc.InterfaceC1107j(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWebSearchEvent(p008a7.C0058p r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RWA.onWebSearchEvent() "
            r0.append(r1)
            java.lang.String r1 = r3.f212b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RobloxActivity"
            p035c9.C1151k.m6712f(r1, r0)
            int r0 = r3.f211a
            r1 = 1
            if (r0 == r1) goto L40
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L40
            r1 = 5
            if (r0 == r1) goto L2b
            r3 = 0
            goto L46
        L2b:
            java.lang.String r3 = r3.f212b
            java.lang.String r3 = com.roblox.client.C2877p0.m12873K0(r3)
            goto L46
        L32:
            java.lang.String r3 = r3.f212b
            java.lang.String r3 = com.roblox.client.C2877p0.m12869I0(r3)
            goto L46
        L39:
            java.lang.String r3 = r3.f212b
            java.lang.String r3 = com.roblox.client.C2877p0.m12871J0(r3)
            goto L46
        L40:
            java.lang.String r3 = r3.f212b
            java.lang.String r3 = com.roblox.client.C2877p0.m12875L0(r3)
        L46:
            if (r3 == 0) goto L4e
            com.roblox.client.C2817d1.m12470i(r2)
            r2.m12218B1(r3)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.RobloxWebActivity.onWebSearchEvent(a7.p):void");
    }

    @Override // p300x7.C5562d.e
    /* renamed from: q */
    public void mo12170q(int i10, Bundle bundle) {
        if (i10 == 2) {
            C1151k.m6712f("RobloxActivity", "(RobloxWebActivity) handleNotification() Logout event...");
            Toast.makeText(this, C2748c0.f10700o, 0).show();
            if (C4455c.m18283b()) {
                C5560b.m20361m();
            }
            m12653p1(C5560b.m20358f(bundle));
            return;
        }
        if (i10 != 101) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("FEATURE_EXTRA", "LAUNCH_GAME");
        intent.putExtra("game_init_params", bundle.getBundle("game_init_params"));
        setResult(-1, intent);
        finish();
    }
}
