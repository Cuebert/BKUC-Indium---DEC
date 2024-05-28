package com.roblox.client;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0152b;
import androidx.fragment.app.ActivityC0803d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c;
import p035c9.C1151k;
import p049d9.C3025b;
import p049d9.C3026c;
import p189o7.C4146b;
import p314y8.C5911e;
import p314y8.EnumC5912f;

/* renamed from: com.roblox.client.m0 */
/* loaded from: classes.dex */
public class C2871m0 extends DialogInterfaceOnCancelListenerC0802c implements C5911e.b {

    /* renamed from: O0 */
    protected C5911e f11416O0;

    /* renamed from: E0 */
    public final String f11406E0 = "dialogHeight";

    /* renamed from: F0 */
    public final String f11407F0 = "dialogWidth";

    /* renamed from: G0 */
    public final String f11408G0 = "dialogGravity";

    /* renamed from: H0 */
    public final String f11409H0 = "dialogOffsetY";

    /* renamed from: I0 */
    public final String f11410I0 = "dialogOffsetX";

    /* renamed from: J0 */
    protected int f11411J0 = 0;

    /* renamed from: K0 */
    protected int f11412K0 = 0;

    /* renamed from: L0 */
    protected int f11413L0 = 0;

    /* renamed from: M0 */
    protected int f11414M0 = 0;

    /* renamed from: N0 */
    protected int f11415N0 = 0;

    /* renamed from: P0 */
    protected C4146b f11417P0 = mo12826v2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.roblox.client.m0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11418a;

        static {
            int[] iArr = new int[EnumC5912f.values().length];
            f11418a = iArr;
            try {
                iArr[EnumC5912f.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11418a[EnumC5912f.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11418a[EnumC5912f.DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // p314y8.C5911e.b
    /* renamed from: U */
    public void mo12200U(EnumC5912f enumC5912f) {
        int color;
        C1151k.m6707a("rbx.theme", getClass().getSimpleName() + ".onThemeChanged() " + enumC5912f);
        if (this.f11417P0 != null) {
            int i10 = a.f11418a[enumC5912f.ordinal()];
            if (i10 == 1) {
                color = m4307Q().getColor(C2909v.f11714w);
            } else if (i10 != 2) {
                color = m4307Q().getColor(C2909v.f11707p);
            } else {
                color = m4307Q().getColor(C2909v.f11693b);
            }
            this.f11417P0.m17196g(color);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo268W0() {
        super.mo268W0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: X0 */
    public void mo4327X0() {
        super.mo4327X0();
    }

    /* renamed from: p2 */
    public void m12820p2(int i10, Object... objArr) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2841k0) {
            ((AbstractActivityC2841k0) m4363p).m12667T0(i10, objArr);
        }
    }

    /* renamed from: q2 */
    public boolean m12821q2() {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2837i0) {
            return ((AbstractActivityC2837i0) m4363p).m12648g1();
        }
        C1151k.m6716j("roblox.app", "The activity containing this fragment must be of type RobloxActivity!");
        return false;
    }

    /* renamed from: r2 */
    public void m12822r2(String str) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2841k0) {
            ((AbstractActivityC2841k0) m4363p).m12668U0(str);
        }
    }

    /* renamed from: s2 */
    public void m12823s2(int i10) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2841k0) {
            ((AbstractActivityC2841k0) m4363p).m12670W0(i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo4376t0(Bundle bundle) {
        super.mo4376t0(bundle);
        Dialog m4598d2 = m4598d2();
        if (m4598d2 != null) {
            Window window = m4598d2.getWindow();
            if (window != null) {
                int i10 = this.f11411J0;
                if (i10 != 0) {
                    int i11 = this.f11412K0;
                    if (i11 == 0) {
                        i11 = -2;
                    }
                    window.setLayout(i11, i10);
                }
                window.setGravity(this.f11413L0);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.y = this.f11414M0;
                attributes.x = this.f11415N0;
                window.setAttributes(attributes);
            }
            m4598d2.setCanceledOnTouchOutside(true);
        }
        C5911e c5911e = new C5911e(this);
        this.f11416O0 = c5911e;
        c5911e.m21041b(this);
    }

    /* renamed from: t2 */
    public void m12824t2(String str) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2841k0) {
            ((AbstractActivityC2841k0) m4363p).m12671X0(str);
        }
    }

    /* renamed from: u2 */
    public synchronized void m12825u2(CharSequence charSequence) {
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

    /* renamed from: v2 */
    protected C4146b mo12826v2() {
        return null;
    }

    /* renamed from: w2 */
    public View m12827w2(LayoutInflater layoutInflater, View view) {
        C4146b c4146b = this.f11417P0;
        if (c4146b == null) {
            return view;
        }
        View m17194e = c4146b.m17194e(layoutInflater, this);
        this.f11417P0.m17193c().addView(view);
        return m17194e;
    }

    /* renamed from: x2 */
    public void m12828x2(int i10, int i11) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2841k0) {
            ((AbstractActivityC2841k0) m4363p).m12675d1(i10, i11);
        }
    }

    /* renamed from: y2 */
    public void m12829y2(String str, int i10) {
        ActivityC0803d m4363p = m4363p();
        if (m4363p instanceof AbstractActivityC2841k0) {
            ((AbstractActivityC2841k0) m4363p).m12676e1(str, i10);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0802c, androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public void mo270z0(Bundle bundle) {
        super.mo270z0(bundle);
        Bundle m4378u = m4378u();
        if (m4378u != null) {
            this.f11411J0 = m4378u.getInt("dialogHeight", 0);
            this.f11412K0 = m4378u.getInt("dialogWidth", 0);
            this.f11413L0 = m4378u.getInt("dialogGravity", 0);
            this.f11414M0 = m4378u.getInt("dialogOffsetY", 0);
            this.f11415N0 = m4378u.getInt("dialogOffsetX", 0);
        }
    }
}
