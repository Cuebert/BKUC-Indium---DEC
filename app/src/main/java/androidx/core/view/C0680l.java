package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.l */
/* loaded from: classes.dex */
public class C0680l {

    /* renamed from: a */
    private ViewParent f3624a;

    /* renamed from: b */
    private ViewParent f3625b;

    /* renamed from: c */
    private final View f3626c;

    /* renamed from: d */
    private boolean f3627d;

    /* renamed from: e */
    private int[] f3628e;

    public C0680l(View view) {
        this.f3626c = view;
    }

    /* renamed from: g */
    private boolean m3752g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent m3753h;
        int i15;
        int i16;
        int[] iArr3;
        if (!m3764l() || (m3753h = m3753h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3626c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] m3754i = m3754i();
            m3754i[0] = 0;
            m3754i[1] = 0;
            iArr3 = m3754i;
        } else {
            iArr3 = iArr2;
        }
        C0694z.m4030d(m3753h, this.f3626c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f3626c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m3753h(int i10) {
        if (i10 == 0) {
            return this.f3624a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f3625b;
    }

    /* renamed from: i */
    private int[] m3754i() {
        if (this.f3628e == null) {
            this.f3628e = new int[2];
        }
        return this.f3628e;
    }

    /* renamed from: n */
    private void m3755n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f3624a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f3625b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m3756a(float f10, float f11, boolean z10) {
        ViewParent m3753h;
        if (!m3764l() || (m3753h = m3753h(0)) == null) {
            return false;
        }
        return C0694z.m4027a(m3753h, this.f3626c, f10, f11, z10);
    }

    /* renamed from: b */
    public boolean m3757b(float f10, float f11) {
        ViewParent m3753h;
        if (!m3764l() || (m3753h = m3753h(0)) == null) {
            return false;
        }
        return C0694z.m4028b(m3753h, this.f3626c, f10, f11);
    }

    /* renamed from: c */
    public boolean m3758c(int i10, int i11, int[] iArr, int[] iArr2) {
        return m3759d(i10, i11, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m3759d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent m3753h;
        int i13;
        int i14;
        if (!m3764l() || (m3753h = m3753h(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f3626c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = m3754i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0694z.m4029c(m3753h, this.f3626c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f3626c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m3760e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        m3752g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: f */
    public boolean m3761f(int i10, int i11, int i12, int i13, int[] iArr) {
        return m3752g(i10, i11, i12, i13, iArr, 0, null);
    }

    /* renamed from: j */
    public boolean m3762j() {
        return m3763k(0);
    }

    /* renamed from: k */
    public boolean m3763k(int i10) {
        return m3753h(i10) != null;
    }

    /* renamed from: l */
    public boolean m3764l() {
        return this.f3627d;
    }

    /* renamed from: m */
    public void m3765m(boolean z10) {
        if (this.f3627d) {
            C0690v.m3802J0(this.f3626c);
        }
        this.f3627d = z10;
    }

    /* renamed from: o */
    public boolean m3766o(int i10) {
        return m3767p(i10, 0);
    }

    /* renamed from: p */
    public boolean m3767p(int i10, int i11) {
        if (m3763k(i11)) {
            return true;
        }
        if (!m3764l()) {
            return false;
        }
        View view = this.f3626c;
        for (ViewParent parent = this.f3626c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0694z.m4032f(parent, view, this.f3626c, i10, i11)) {
                m3755n(i11, parent);
                C0694z.m4031e(parent, view, this.f3626c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void m3768q() {
        m3769r(0);
    }

    /* renamed from: r */
    public void m3769r(int i10) {
        ViewParent m3753h = m3753h(i10);
        if (m3753h != null) {
            C0694z.m4033g(m3753h, this.f3626c, i10);
            m3755n(i10, null);
        }
    }
}
