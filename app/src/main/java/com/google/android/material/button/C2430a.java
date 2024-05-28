package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.view.C0690v;
import com.google.android.material.internal.C2489l;
import p111i4.C3520b;
import p111i4.C3530l;
import p186o4.C4133a;
import p272v4.C4981c;
import p284w4.C5456a;
import p284w4.C5457b;
import p310y4.C5888g;
import p310y4.C5892k;
import p310y4.InterfaceC5895n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes.dex */
public class C2430a {

    /* renamed from: t */
    private static final boolean f9175t = true;

    /* renamed from: a */
    private final MaterialButton f9176a;

    /* renamed from: b */
    private C5892k f9177b;

    /* renamed from: c */
    private int f9178c;

    /* renamed from: d */
    private int f9179d;

    /* renamed from: e */
    private int f9180e;

    /* renamed from: f */
    private int f9181f;

    /* renamed from: g */
    private int f9182g;

    /* renamed from: h */
    private int f9183h;

    /* renamed from: i */
    private PorterDuff.Mode f9184i;

    /* renamed from: j */
    private ColorStateList f9185j;

    /* renamed from: k */
    private ColorStateList f9186k;

    /* renamed from: l */
    private ColorStateList f9187l;

    /* renamed from: m */
    private Drawable f9188m;

    /* renamed from: n */
    private boolean f9189n = false;

    /* renamed from: o */
    private boolean f9190o = false;

    /* renamed from: p */
    private boolean f9191p = false;

    /* renamed from: q */
    private boolean f9192q;

    /* renamed from: r */
    private LayerDrawable f9193r;

    /* renamed from: s */
    private int f9194s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2430a(MaterialButton materialButton, C5892k c5892k) {
        this.f9176a = materialButton;
        this.f9177b = c5892k;
    }

    /* renamed from: E */
    private void m10764E(int i10, int i11) {
        int m3801J = C0690v.m3801J(this.f9176a);
        int paddingTop = this.f9176a.getPaddingTop();
        int m3799I = C0690v.m3799I(this.f9176a);
        int paddingBottom = this.f9176a.getPaddingBottom();
        int i12 = this.f9180e;
        int i13 = this.f9181f;
        this.f9181f = i11;
        this.f9180e = i10;
        if (!this.f9190o) {
            m10765F();
        }
        C0690v.m3788C0(this.f9176a, m3801J, (paddingTop + i10) - i12, m3799I, (paddingBottom + i11) - i13);
    }

    /* renamed from: F */
    private void m10765F() {
        this.f9176a.setInternalBackground(m10769a());
        C5888g m10781f = m10781f();
        if (m10781f != null) {
            m10781f.m20834W(this.f9194s);
        }
    }

    /* renamed from: G */
    private void m10766G(C5892k c5892k) {
        if (m10781f() != null) {
            m10781f().setShapeAppearanceModel(c5892k);
        }
        if (m10771n() != null) {
            m10771n().setShapeAppearanceModel(c5892k);
        }
        if (m10780e() != null) {
            m10780e().setShapeAppearanceModel(c5892k);
        }
    }

    /* renamed from: I */
    private void m10767I() {
        C5888g m10781f = m10781f();
        C5888g m10771n = m10771n();
        if (m10781f != null) {
            m10781f.m20840c0(this.f9183h, this.f9186k);
            if (m10771n != null) {
                m10771n.m20839b0(this.f9183h, this.f9189n ? C4133a.m17130c(this.f9176a, C3520b.f14526l) : 0);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m10768J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f9178c, this.f9180e, this.f9179d, this.f9181f);
    }

    /* renamed from: a */
    private Drawable m10769a() {
        C5888g c5888g = new C5888g(this.f9177b);
        c5888g.m20828M(this.f9176a.getContext());
        C0609a.m3260o(c5888g, this.f9185j);
        PorterDuff.Mode mode = this.f9184i;
        if (mode != null) {
            C0609a.m3261p(c5888g, mode);
        }
        c5888g.m20840c0(this.f9183h, this.f9186k);
        C5888g c5888g2 = new C5888g(this.f9177b);
        c5888g2.setTint(0);
        c5888g2.m20839b0(this.f9183h, this.f9189n ? C4133a.m17130c(this.f9176a, C3520b.f14526l) : 0);
        if (f9175t) {
            C5888g c5888g3 = new C5888g(this.f9177b);
            this.f9188m = c5888g3;
            C0609a.m3259n(c5888g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C5457b.m20047d(this.f9187l), m10768J(new LayerDrawable(new Drawable[]{c5888g2, c5888g})), this.f9188m);
            this.f9193r = rippleDrawable;
            return rippleDrawable;
        }
        C5456a c5456a = new C5456a(this.f9177b);
        this.f9188m = c5456a;
        C0609a.m3260o(c5456a, C5457b.m20047d(this.f9187l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c5888g2, c5888g, this.f9188m});
        this.f9193r = layerDrawable;
        return m10768J(layerDrawable);
    }

    /* renamed from: g */
    private C5888g m10770g(boolean z10) {
        LayerDrawable layerDrawable = this.f9193r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f9175t) {
            return (C5888g) ((LayerDrawable) ((InsetDrawable) this.f9193r.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return (C5888g) this.f9193r.getDrawable(!z10 ? 1 : 0);
    }

    /* renamed from: n */
    private C5888g m10771n() {
        return m10770g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m10772A(ColorStateList colorStateList) {
        if (this.f9186k != colorStateList) {
            this.f9186k = colorStateList;
            m10767I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m10773B(int i10) {
        if (this.f9183h != i10) {
            this.f9183h = i10;
            m10767I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m10774C(ColorStateList colorStateList) {
        if (this.f9185j != colorStateList) {
            this.f9185j = colorStateList;
            if (m10781f() != null) {
                C0609a.m3260o(m10781f(), this.f9185j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m10775D(PorterDuff.Mode mode) {
        if (this.f9184i != mode) {
            this.f9184i = mode;
            if (m10781f() == null || this.f9184i == null) {
                return;
            }
            C0609a.m3261p(m10781f(), this.f9184i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m10776H(int i10, int i11) {
        Drawable drawable = this.f9188m;
        if (drawable != null) {
            drawable.setBounds(this.f9178c, this.f9180e, i11 - this.f9179d, i10 - this.f9181f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m10777b() {
        return this.f9182g;
    }

    /* renamed from: c */
    public int m10778c() {
        return this.f9181f;
    }

    /* renamed from: d */
    public int m10779d() {
        return this.f9180e;
    }

    /* renamed from: e */
    public InterfaceC5895n m10780e() {
        LayerDrawable layerDrawable = this.f9193r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f9193r.getNumberOfLayers() > 2) {
            return (InterfaceC5895n) this.f9193r.getDrawable(2);
        }
        return (InterfaceC5895n) this.f9193r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C5888g m10781f() {
        return m10770g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m10782h() {
        return this.f9187l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C5892k m10783i() {
        return this.f9177b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m10784j() {
        return this.f9186k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m10785k() {
        return this.f9183h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m10786l() {
        return this.f9185j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode m10787m() {
        return this.f9184i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m10788o() {
        return this.f9190o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m10789p() {
        return this.f9192q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m10790q(TypedArray typedArray) {
        this.f9178c = typedArray.getDimensionPixelOffset(C3530l.f14916b2, 0);
        this.f9179d = typedArray.getDimensionPixelOffset(C3530l.f14924c2, 0);
        this.f9180e = typedArray.getDimensionPixelOffset(C3530l.f14932d2, 0);
        this.f9181f = typedArray.getDimensionPixelOffset(C3530l.f14940e2, 0);
        int i10 = C3530l.f14972i2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f9182g = dimensionPixelSize;
            m10798y(this.f9177b.m20884w(dimensionPixelSize));
            this.f9191p = true;
        }
        this.f9183h = typedArray.getDimensionPixelSize(C3530l.f15052s2, 0);
        this.f9184i = C2489l.m11383e(typedArray.getInt(C3530l.f14964h2, -1), PorterDuff.Mode.SRC_IN);
        this.f9185j = C4981c.m19404a(this.f9176a.getContext(), typedArray, C3530l.f14956g2);
        this.f9186k = C4981c.m19404a(this.f9176a.getContext(), typedArray, C3530l.f15044r2);
        this.f9187l = C4981c.m19404a(this.f9176a.getContext(), typedArray, C3530l.f15036q2);
        this.f9192q = typedArray.getBoolean(C3530l.f14948f2, false);
        this.f9194s = typedArray.getDimensionPixelSize(C3530l.f14980j2, 0);
        int m3801J = C0690v.m3801J(this.f9176a);
        int paddingTop = this.f9176a.getPaddingTop();
        int m3799I = C0690v.m3799I(this.f9176a);
        int paddingBottom = this.f9176a.getPaddingBottom();
        if (typedArray.hasValue(C3530l.f14908a2)) {
            m10792s();
        } else {
            m10765F();
        }
        C0690v.m3788C0(this.f9176a, m3801J + this.f9178c, paddingTop + this.f9180e, m3799I + this.f9179d, paddingBottom + this.f9181f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m10791r(int i10) {
        if (m10781f() != null) {
            m10781f().setTint(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m10792s() {
        this.f9190o = true;
        this.f9176a.setSupportBackgroundTintList(this.f9185j);
        this.f9176a.setSupportBackgroundTintMode(this.f9184i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m10793t(boolean z10) {
        this.f9192q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m10794u(int i10) {
        if (this.f9191p && this.f9182g == i10) {
            return;
        }
        this.f9182g = i10;
        this.f9191p = true;
        m10798y(this.f9177b.m20884w(i10));
    }

    /* renamed from: v */
    public void m10795v(int i10) {
        m10764E(this.f9180e, i10);
    }

    /* renamed from: w */
    public void m10796w(int i10) {
        m10764E(i10, this.f9181f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m10797x(ColorStateList colorStateList) {
        if (this.f9187l != colorStateList) {
            this.f9187l = colorStateList;
            boolean z10 = f9175t;
            if (z10 && (this.f9176a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f9176a.getBackground()).setColor(C5457b.m20047d(colorStateList));
            } else {
                if (z10 || !(this.f9176a.getBackground() instanceof C5456a)) {
                    return;
                }
                ((C5456a) this.f9176a.getBackground()).setTintList(C5457b.m20047d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m10798y(C5892k c5892k) {
        this.f9177b = c5892k;
        m10766G(c5892k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m10799z(boolean z10) {
        this.f9189n = z10;
        m10767I();
    }
}
