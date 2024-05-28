package com.roblox.client.captcha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.C2822f0;
import com.roblox.client.C2873n0;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p008a7.C0051i;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;
import p035c9.C1151k;

/* renamed from: com.roblox.client.captcha.a */
/* loaded from: classes.dex */
public class C2754a extends C2873n0 {

    /* renamed from: l1 */
    private a f10797l1;

    /* renamed from: m1 */
    private boolean f10798m1;

    /* renamed from: n1 */
    private boolean f10799n1;

    /* renamed from: o1 */
    private CaptchaConfig f10800o1;

    /* renamed from: com.roblox.client.captcha.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: M */
        void mo12259M();

        void dismiss();

        /* renamed from: l0 */
        void mo12261l0(String str, String str2);
    }

    /* renamed from: k3 */
    public static C2754a m12268k3(CaptchaConfig captchaConfig) {
        C2754a c2754a = new C2754a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfig", captchaConfig);
        c2754a.m4282H1(bundle);
        return c2754a;
    }

    /* renamed from: l3 */
    private void m12269l3() {
        if (m4334b0() == null) {
            return;
        }
        this.f10797l1.mo12259M();
        mo12850e3(true);
    }

    @Override // com.roblox.client.C2873n0, com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.mo264D0(layoutInflater, viewGroup, bundle);
    }

    @Override // com.roblox.client.C2873n0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        C1151k.m6707a("FragmentFunCaptcha", "onDetach.");
        if (!this.f10799n1) {
            this.f10797l1.dismiss();
            C2822f0.m12481c("captcha", "close");
        }
        this.f10797l1 = null;
    }

    @Override // com.roblox.client.C2873n0, com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: P0 */
    public void mo4305P0() {
        super.mo4305P0();
        C1151k.m6707a("FragmentFunCaptcha", "onPause.");
        C1100c.m6458d().m6471p(this);
        mo12850e3(false);
    }

    @Override // com.roblox.client.C2873n0, com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        super.mo4319U0();
        C1151k.m6707a("FragmentFunCaptcha", "onResume.");
        C1100c.m6458d().m6470n(this);
        if (this.f10798m1) {
            m12269l3();
        }
    }

    @Override // com.roblox.client.C2873n0, com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        C2822f0.m12498t("captcha");
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C0051i c0051i) {
        String str;
        JSONObject optJSONObject;
        C1151k.m6707a("FragmentFunCaptcha", "NavigateToFeature: " + c0051i.f201a);
        if ("CAPTCHA_SUCCESS_TAG".equals(c0051i.f201a)) {
            this.f10799n1 = true;
            JSONObject m251e = c0051i.m251e();
            String str2 = null;
            if (m251e == null || (optJSONObject = m251e.optJSONObject("captchaData")) == null) {
                str = null;
            } else {
                String optString = optJSONObject.optString("captchaToken", null);
                str = optJSONObject.optString("captchaProvider", null);
                str2 = optString;
            }
            this.f10797l1.mo12261l0(str2, str);
            return;
        }
        if ("CAPTCHA_SHOWN_TAG".equals(c0051i.f201a)) {
            C1151k.m6712f("FragmentFunCaptcha", "isCaptchaShown: " + this.f10798m1);
            if (this.f10798m1) {
                return;
            }
            this.f10798m1 = true;
            m12269l3();
        }
    }

    @Override // com.roblox.client.C2873n0, com.roblox.client.C2871m0, androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        C1151k.m6707a("FragmentFunCaptcha", "onActivityCreated.");
        this.f11663T0 = this.f10800o1.mo12262s();
        C1151k.m6707a("FragmentFunCaptcha", "Load captcha url: " + this.f11663T0);
        m13203X2(this.f11663T0);
    }

    @Override // com.roblox.client.C2873n0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        C1151k.m6707a("FragmentFunCaptcha", "onAttach.");
        if (m4363p() instanceof a) {
            this.f10797l1 = (a) m4363p();
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // com.roblox.client.C2873n0, com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        C1151k.m6707a("FragmentFunCaptcha", "onCreate.");
        if (m4378u() != null) {
            this.f10800o1 = (CaptchaConfig) m4378u().getParcelable("captchaConfig");
        }
    }
}
