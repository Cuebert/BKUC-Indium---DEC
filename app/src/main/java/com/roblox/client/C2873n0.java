package com.roblox.client;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0803d;
import com.roblox.client.app.C2743d;
import p033c7.C1134c;
import p035c9.C1151k;

/* renamed from: com.roblox.client.n0 */
/* loaded from: classes.dex */
public class C2873n0 extends C2906t0 {

    /* renamed from: k1 */
    private View f11423k1;

    /* renamed from: com.roblox.client.n0$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityC0803d m4363p = C2873n0.this.m4363p();
            if (m4363p != null) {
                m4363p.m4617y0().m4476W0();
            }
        }
    }

    /* renamed from: j3 */
    private Point m12849j3(float f10, float f11, int i10, int i11, int i12, int i13) {
        if (f10 < i12 || f11 < i13) {
            return null;
        }
        int i14 = (int) (0.9f * f10);
        if (i14 > i12) {
            i12 = i14;
        }
        int i15 = (int) (0.8f * f11);
        if (i15 > i13) {
            i13 = i15;
        }
        if (i11 > f11) {
            i11 = i13;
        }
        if (i10 > f10) {
            i10 = i12;
        }
        return new Point(i10, i11);
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo264D0 = super.mo264D0(layoutInflater, viewGroup, bundle);
        C1151k.m6707a("RobloxModalWebFragment", "onCreate.");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        this.f11423k1 = mo264D0;
        ((LinearLayout) mo264D0).setLayoutTransition(layoutTransition);
        LinearLayout linearLayout = (LinearLayout) mo264D0.findViewById(C2915y.f11809J1);
        linearLayout.setVisibility(0);
        linearLayout.findViewById(C2915y.f11806I1).setOnClickListener(new a());
        float f10 = m4307Q().getDisplayMetrics().widthPixels;
        float f11 = m4307Q().getDisplayMetrics().heightPixels;
        C1151k.m6707a("RobloxModalWebFragment", "widthInPixels: " + f10 + ". heightInPixels: " + f11 + ".");
        int mo6568O0 = C1134c.m6537a().mo6568O0() + linearLayout.getHeight();
        int mo6559K = C1134c.m6537a().mo6559K();
        int applyDimension = (int) TypedValue.applyDimension(1, (float) mo6568O0, m4307Q().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, (float) mo6559K, m4307Q().getDisplayMetrics());
        C1151k.m6707a("RobloxModalWebFragment", "minWidthInDip: " + applyDimension2 + ". minHeightInDip: " + applyDimension + ".");
        Point m12849j3 = m12849j3(f10, f11, applyDimension2, applyDimension, mo6559K, mo6568O0);
        if (m12849j3 != null) {
            C1151k.m6707a("RobloxModalWebFragment", "width: " + m12849j3.x + ". height: " + m12849j3.y + ".");
            mo264D0.setLayoutParams(new FrameLayout.LayoutParams(m12849j3.x, m12849j3.y, 17));
        }
        mo12850e3(this.f11675f1);
        return mo264D0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public void mo267H0() {
        super.mo267H0();
        C1151k.m6707a("RobloxModalWebFragment", "onDetach.");
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: P0 */
    public void mo4305P0() {
        super.mo4305P0();
        C1151k.m6707a("RobloxModalWebFragment", "onPause.");
    }

    @Override // com.roblox.client.C2906t0, androidx.fragment.app.Fragment
    /* renamed from: U0 */
    public void mo4319U0() {
        super.mo4319U0();
        C1151k.m6707a("RobloxModalWebFragment", "onResume.");
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: e3 */
    public void mo12850e3(boolean z10) {
        super.mo12850e3(z10);
        View view = this.f11423k1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.C2906t0
    /* renamed from: i3 */
    public void mo12851i3(C2743d c2743d) {
        super.mo12851i3(c2743d);
        C1151k.m6707a("RobloxModalWebFragment", "updateWebView.");
    }

    @Override // com.roblox.client.C2871m0, androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        C1151k.m6707a("RobloxModalWebFragment", "onActivityCreated.");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: w0 */
    public void mo269w0(Context context) {
        super.mo269w0(context);
        C1151k.m6707a("RobloxModalWebFragment", "onAttach.");
    }

    @Override // com.roblox.client.C2906t0, com.roblox.client.C2871m0, androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
    }
}
