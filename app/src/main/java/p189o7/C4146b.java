package p189o7;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0852s;
import com.roblox.client.AbstractActivityC2841k0;
import com.roblox.client.C2738a0;
import com.roblox.client.C2915y;
import p035c9.C1151k;
import p074f7.EnumC3172f0;

/* renamed from: o7.b */
/* loaded from: classes.dex */
public class C4146b {

    /* renamed from: a */
    private ViewGroup f16886a;

    /* renamed from: b */
    private View f16887b;

    /* renamed from: c */
    private View f16888c;

    /* renamed from: d */
    private View f16889d;

    /* renamed from: e */
    private EnumC3172f0 f16890e = EnumC3172f0.APP;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o7.b$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0852s<Rect> {
        a() {
        }

        @Override // androidx.lifecycle.InterfaceC0852s
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1522a(Rect rect) {
            if (rect != null) {
                if (C4146b.this.f16890e == EnumC3172f0.EXPERIENCE) {
                    C4146b.this.mo17192b(0, 0, 0, 0);
                } else {
                    C4146b.this.mo17192b(rect.top, rect.left, rect.right, rect.bottom);
                }
            }
        }
    }

    /* renamed from: d */
    private View m17190d(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C2738a0.f10397A, (ViewGroup) null);
        this.f16886a = (ViewGroup) inflate.findViewById(C2915y.f11886o0);
        this.f16887b = inflate.findViewById(C2915y.f11892q0);
        this.f16888c = inflate.findViewById(C2915y.f11889p0);
        this.f16889d = inflate.findViewById(C2915y.f11883n0);
        return inflate;
    }

    /* renamed from: h */
    private void m17191h(AbstractActivityC2841k0 abstractActivityC2841k0) {
        if (abstractActivityC2841k0 != null) {
            abstractActivityC2841k0.m12673Z0().m17186b().m4861i(abstractActivityC2841k0, new a());
        }
    }

    /* renamed from: b */
    public void mo17192b(int i10, int i11, int i12, int i13) {
        if (this.f16886a == null) {
            return;
        }
        C1151k.m6707a("rbx.screen", "Setting insets: " + i10 + ", " + i11 + ", " + i12 + ", " + i13);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f16886a.getLayoutParams();
        boolean z10 = layoutParams.topMargin != i10;
        boolean z11 = layoutParams.rightMargin != i12;
        boolean z12 = layoutParams.bottomMargin != i13;
        if (z10 || z11 || z12) {
            layoutParams.topMargin = i10;
            layoutParams.rightMargin = i12;
            layoutParams.bottomMargin = i13;
            this.f16886a.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f16887b.getLayoutParams();
        if (z10) {
            layoutParams2.height = i10;
            this.f16887b.setLayoutParams(layoutParams2);
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f16888c.getLayoutParams();
        if (z11) {
            layoutParams3.width = i12;
            this.f16888c.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f16889d.getLayoutParams();
        if (z12) {
            layoutParams4.height = i13;
            this.f16889d.setLayoutParams(layoutParams4);
        }
    }

    /* renamed from: c */
    public ViewGroup m17193c() {
        return this.f16886a;
    }

    /* renamed from: e */
    public View m17194e(LayoutInflater layoutInflater, Fragment fragment) {
        ActivityC0803d m4363p;
        View m17190d = m17190d(layoutInflater);
        if (fragment != null && (m4363p = fragment.m4363p()) != null && (m4363p instanceof AbstractActivityC2841k0)) {
            m17191h((AbstractActivityC2841k0) m4363p);
        }
        return m17190d;
    }

    /* renamed from: f */
    public View m17195f(LayoutInflater layoutInflater, AbstractActivityC2841k0 abstractActivityC2841k0) {
        View m17190d = m17190d(layoutInflater);
        if (abstractActivityC2841k0 != null) {
            m17191h(abstractActivityC2841k0);
        }
        return m17190d;
    }

    /* renamed from: g */
    public void m17196g(int i10) {
        View view = this.f16887b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    /* renamed from: i */
    public void m17197i(EnumC3172f0 enumC3172f0) {
        this.f16890e = enumC3172f0;
    }
}
