package com.roblox.client.landing;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.roblox.client.C2738a0;
import com.roblox.client.C2915y;
import com.roblox.client.components.RbxTextView;
import p250t7.C4736a;

/* renamed from: com.roblox.client.landing.b */
/* loaded from: classes.dex */
public class C2849b extends Fragment {

    /* renamed from: o0 */
    private C2848a f11336o0;

    /* renamed from: X1 */
    public static C2849b m12699X1(C2848a c2848a) {
        C2849b c2849b = new C2849b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("itemId", c2848a);
        c2849b.m4282H1(bundle);
        return c2849b;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public View mo264D0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C2738a0.f10423n, viewGroup, false);
        ImageView imageView = (ImageView) viewGroup2.findViewById(C2915y.f11901t0);
        RbxTextView rbxTextView = (RbxTextView) viewGroup2.findViewById(C2915y.f11904u0);
        RbxTextView rbxTextView2 = (RbxTextView) viewGroup2.findViewById(C2915y.f11898s0);
        imageView.setImageResource(this.f11336o0.m12697b());
        Context m4384w = m4384w();
        rbxTextView.setText(C4736a.m18881c(m4384w, this.f11336o0.m12698c(), new Object[0]));
        rbxTextView2.setText(C4736a.m18881c(m4384w, this.f11336o0.m12696a(), new Object[0]));
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        this.f11336o0 = (C2848a) m4378u().getSerializable("itemId");
    }
}
