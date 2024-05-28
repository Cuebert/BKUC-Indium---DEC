package com.roblox.client;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.greenrobot.eventbus.ThreadMode;
import p008a7.C0050h;
import p008a7.C0051i;
import p024bc.C1100c;
import p024bc.InterfaceC1107j;

/* renamed from: com.roblox.client.r */
/* loaded from: classes.dex */
public class C2887r extends C2906t0 {
    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C2738a0.f10399C, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(C2915y.f11850c0);
        frameLayout.addView(super.mo264D0(layoutInflater, frameLayout, bundle));
        return viewGroup2;
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
        C1100c.m6458d().m6470n(this);
        Dialog m4598d2 = m4598d2();
        if (m4598d2 != null) {
            Window window = m4598d2.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        C1100c.m6458d().m6471p(this);
        super.mo4327X0();
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C0050h c0050h) {
        if (m4599e2()) {
            m4598d2().dismiss();
        }
    }

    @InterfaceC1107j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C0051i c0051i) {
        if (m4599e2()) {
            m4598d2().dismiss();
        }
    }
}
