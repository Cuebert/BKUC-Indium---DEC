package com.roblox.client.landing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0817r;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.roblox.client.C2738a0;
import com.roblox.client.C2748c0;
import com.roblox.client.C2817d1;
import com.roblox.client.C2913x;
import com.roblox.client.C2915y;
import com.roblox.client.game.C2831b;
import com.roblox.client.startup.ActivitySplash;
import p035c9.C1151k;
import p049d9.C3025b;
import p102h9.C3447a;
import p226r7.EnumC4452c;
import p226r7.InterfaceC4451b;
import p239s7.C4531b;
import p250t7.C4736a;
import p288w8.C5469d;
import p288w8.EnumC5480o;
import p326z7.ActivityC6019f;
import p326z7.InterfaceC6014a;
import p326z7.InterfaceC6021h;

/* loaded from: classes.dex */
public class ActivityStartMVP extends ActivityC6019f implements View.OnClickListener {

    /* renamed from: a0 */
    private static final C2848a[] f11324a0 = {new C2848a(C2748c0.f10522H0, C2748c0.f10517G0, C2913x.f11772u), new C2848a(C2748c0.f10512F0, C2748c0.f10507E0, C2913x.f11771t), new C2848a(C2748c0.f10502D0, C2748c0.f10496C0, C2913x.f11770s)};

    /* renamed from: U */
    private InterfaceC4451b f11325U;

    /* renamed from: V */
    private InterfaceC6014a f11326V;

    /* renamed from: W */
    private Button f11327W;

    /* renamed from: X */
    private Button f11328X;

    /* renamed from: Y */
    private View f11329Y;

    /* renamed from: Z */
    private boolean f11330Z = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.roblox.client.landing.ActivityStartMVP$b */
    /* loaded from: classes.dex */
    public class C2847b extends AbstractC0817r {

        /* renamed from: j */
        final C2848a[] f11331j;

        @Override // androidx.viewpager.widget.AbstractC0957a
        /* renamed from: c */
        public int mo6129c() {
            return this.f11331j.length;
        }

        @Override // androidx.fragment.app.AbstractC0817r
        /* renamed from: p */
        public Fragment mo4721p(int i10) {
            return C2849b.m12699X1(this.f11331j[i10]);
        }

        private C2847b(FragmentManager fragmentManager, C2848a[] c2848aArr) {
            super(fragmentManager);
            this.f11331j = c2848aArr;
        }
    }

    /* renamed from: B1 */
    private void m12692B1() {
        this.f11328X.setOnClickListener(this);
        this.f11327W.setOnClickListener(this);
        this.f11329Y.setOnClickListener(this);
    }

    /* renamed from: C1 */
    private void m12693C1() {
        View findViewById = findViewById(C2915y.f11913x0);
        if (findViewById != null) {
            ViewPager viewPager = (ViewPager) findViewById;
            viewPager.setAdapter(new C2847b(m4617y0(), f11324a0));
            ((TabLayout) findViewById(C2915y.f11910w0)).m11433J(viewPager, true);
        }
        View findViewById2 = findViewById(C2915y.f11917y1);
        if (findViewById2 != null) {
            C3025b.m13492b(this, (TextView) findViewById2);
        }
        if (getIntent().getBooleanExtra("ANIMATE_BUTTONS_EXTRA", false)) {
            View findViewById3 = findViewById(C2915y.f11895r0);
            if (findViewById3 != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                findViewById3.startAnimation(alphaAnimation);
            }
            View findViewById4 = findViewById(C2915y.f11907v0);
            if (findViewById4 != null) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(500L);
                findViewById4.startAnimation(alphaAnimation2);
            }
        }
        this.f11327W = (Button) findViewById(C2915y.f11872j1);
        this.f11329Y = findViewById(C2915y.f11843a);
        Button button = (Button) findViewById(C2915y.f11784B0);
        this.f11328X = button;
        button.setText(C4736a.m18881c(this, C2748c0.f10766z, new Object[0]));
        this.f11327W.setText(C4736a.m18881c(this, C2748c0.f10689m0, new Object[0]));
    }

    /* renamed from: D1 */
    private void m12694D1(EnumC5480o enumC5480o) {
        startActivity(ActivitySplash.m13160C1(this, enumC5480o));
        finish();
    }

    /* renamed from: E1 */
    private void m12695E1(InterfaceC6021h interfaceC6021h) {
        InterfaceC6014a interfaceC6014a = this.f11326V;
        if (interfaceC6014a != null) {
            interfaceC6014a.mo12753k(interfaceC6021h, null);
        } else {
            C1151k.m6715i("Warning: Touch event is received before listener is received.");
        }
    }

    @Override // com.roblox.client.AbstractActivityC2837i0
    /* renamed from: i1 */
    protected boolean mo12160i1() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.roblox.client.AbstractActivityC2837i0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 20109) {
            if (i11 == 102) {
                this.f11325U.m18271a();
                return;
            } else {
                if (i11 != 103) {
                    return;
                }
                m12695E1(EnumC4452c.SWITCH_TO_LOGIN);
                return;
            }
        }
        if (i10 == 20111) {
            if (i11 == 104) {
                this.f11325U.m18272b();
            } else {
                if (i11 != 105) {
                    return;
                }
                m12695E1(EnumC4452c.SIGN_UP);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C2915y.f11784B0) {
            m12695E1(EnumC4452c.LOGIN);
        } else if (view.getId() == C2915y.f11872j1) {
            m12695E1(EnumC4452c.SIGN_UP);
        } else if (view.getId() == C2915y.f11843a) {
            m12695E1(EnumC4452c.ABOUT);
        }
    }

    @Override // p326z7.ActivityC6019f, com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0574g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C5469d.m20104h()) {
            C1151k.m6712f("ActivityStartMVP", "onCreate: no AppSettings - Start Splash...");
            m12694D1(EnumC5480o.SHELL_PROCESS_RESTART);
            return;
        }
        setContentView(C2738a0.f10417h);
        C2817d1.f11010a = getResources().getDisplayMetrics();
        m12693C1();
        m12692B1();
        this.f11330Z = getIntent().hasExtra("send_app_input_focus_to_lua");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326z7.ActivityC6019f, com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onPause() {
        super.onPause();
        C1151k.m6712f("ActivityStartMVP", "onPause()");
        if (this.f11330Z) {
            C2831b.m12572i().m12578A(new C3447a(true));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326z7.ActivityC6019f, com.roblox.client.AbstractActivityC2837i0, com.roblox.client.AbstractActivityC2841k0, androidx.fragment.app.ActivityC0803d, android.app.Activity
    public void onResume() {
        super.onResume();
        C1151k.m6712f("ActivityStartMVP", "onResume()");
        C4531b m18550f = C4531b.m18550f();
        if (m18550f.m18558g() == C4531b.b.LOCALE_MODE_GENERAL_EXPERIENCE) {
            if (m18550f.m18563n(m18550f.m18556d(this), this)) {
                recreate();
            }
            m18550f.m18568s(C4531b.b.LOCALE_MODE_LOGIN_SIGN_UP);
        }
        if (this.f11330Z) {
            C2831b.m12572i().m12578A(new C3447a(false));
        }
    }
}
