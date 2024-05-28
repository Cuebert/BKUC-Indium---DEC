package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C0601a;
import androidx.core.graphics.drawable.C0609a;
import androidx.core.text.C0642a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.internal.C2485h;
import com.google.android.material.internal.C2487j;
import com.google.android.material.internal.C2489l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p066f.C3121a;
import p111i4.C3530l;
import p125j4.C3607h;
import p138k4.C3757a;
import p211q4.C4313a;
import p272v4.C4981c;
import p272v4.C4982d;
import p284w4.C5457b;
import p310y4.C5888g;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public class C2440a extends C5888g implements Drawable.Callback, C2485h.b {

    /* renamed from: V0 */
    private static final int[] f9239V0 = {R.attr.state_enabled};

    /* renamed from: W0 */
    private static final ShapeDrawable f9240W0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f9241A0;

    /* renamed from: B0 */
    private int f9242B0;

    /* renamed from: C0 */
    private int f9243C0;

    /* renamed from: D0 */
    private int f9244D0;

    /* renamed from: E0 */
    private int f9245E0;

    /* renamed from: F0 */
    private int f9246F0;

    /* renamed from: G0 */
    private boolean f9247G0;

    /* renamed from: H0 */
    private int f9248H0;

    /* renamed from: I0 */
    private int f9249I0;

    /* renamed from: J0 */
    private ColorFilter f9250J0;

    /* renamed from: K0 */
    private PorterDuffColorFilter f9251K0;

    /* renamed from: L */
    private ColorStateList f9252L;

    /* renamed from: L0 */
    private ColorStateList f9253L0;

    /* renamed from: M */
    private ColorStateList f9254M;

    /* renamed from: M0 */
    private PorterDuff.Mode f9255M0;

    /* renamed from: N */
    private float f9256N;

    /* renamed from: N0 */
    private int[] f9257N0;

    /* renamed from: O */
    private float f9258O;

    /* renamed from: O0 */
    private boolean f9259O0;

    /* renamed from: P */
    private ColorStateList f9260P;

    /* renamed from: P0 */
    private ColorStateList f9261P0;

    /* renamed from: Q */
    private float f9262Q;

    /* renamed from: Q0 */
    private WeakReference<a> f9263Q0;

    /* renamed from: R */
    private ColorStateList f9264R;

    /* renamed from: R0 */
    private TextUtils.TruncateAt f9265R0;

    /* renamed from: S */
    private CharSequence f9266S;

    /* renamed from: S0 */
    private boolean f9267S0;

    /* renamed from: T */
    private boolean f9268T;

    /* renamed from: T0 */
    private int f9269T0;

    /* renamed from: U */
    private Drawable f9270U;

    /* renamed from: U0 */
    private boolean f9271U0;

    /* renamed from: V */
    private ColorStateList f9272V;

    /* renamed from: W */
    private float f9273W;

    /* renamed from: X */
    private boolean f9274X;

    /* renamed from: Y */
    private boolean f9275Y;

    /* renamed from: Z */
    private Drawable f9276Z;

    /* renamed from: a0 */
    private Drawable f9277a0;

    /* renamed from: b0 */
    private ColorStateList f9278b0;

    /* renamed from: c0 */
    private float f9279c0;

    /* renamed from: d0 */
    private CharSequence f9280d0;

    /* renamed from: e0 */
    private boolean f9281e0;

    /* renamed from: f0 */
    private boolean f9282f0;

    /* renamed from: g0 */
    private Drawable f9283g0;

    /* renamed from: h0 */
    private ColorStateList f9284h0;

    /* renamed from: i0 */
    private C3607h f9285i0;

    /* renamed from: j0 */
    private C3607h f9286j0;

    /* renamed from: k0 */
    private float f9287k0;

    /* renamed from: l0 */
    private float f9288l0;

    /* renamed from: m0 */
    private float f9289m0;

    /* renamed from: n0 */
    private float f9290n0;

    /* renamed from: o0 */
    private float f9291o0;

    /* renamed from: p0 */
    private float f9292p0;

    /* renamed from: q0 */
    private float f9293q0;

    /* renamed from: r0 */
    private float f9294r0;

    /* renamed from: s0 */
    private final Context f9295s0;

    /* renamed from: t0 */
    private final Paint f9296t0;

    /* renamed from: u0 */
    private final Paint f9297u0;

    /* renamed from: v0 */
    private final Paint.FontMetrics f9298v0;

    /* renamed from: w0 */
    private final RectF f9299w0;

    /* renamed from: x0 */
    private final PointF f9300x0;

    /* renamed from: y0 */
    private final Path f9301y0;

    /* renamed from: z0 */
    private final C2485h f9302z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo10828a();
    }

    private C2440a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f9258O = -1.0f;
        this.f9296t0 = new Paint(1);
        this.f9298v0 = new Paint.FontMetrics();
        this.f9299w0 = new RectF();
        this.f9300x0 = new PointF();
        this.f9301y0 = new Path();
        this.f9249I0 = 255;
        this.f9255M0 = PorterDuff.Mode.SRC_IN;
        this.f9263Q0 = new WeakReference<>(null);
        m20828M(context);
        this.f9295s0 = context;
        C2485h c2485h = new C2485h(this);
        this.f9302z0 = c2485h;
        this.f9266S = BuildConfig.FLAVOR;
        c2485h.m11361e().density = context.getResources().getDisplayMetrics().density;
        this.f9297u0 = null;
        int[] iArr = f9239V0;
        setState(iArr);
        m10967j2(iArr);
        this.f9267S0 = true;
        if (C5457b.f20338a) {
            f9240W0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m10859A0(Canvas canvas, Rect rect) {
        this.f9296t0.setColor(this.f9245E0);
        this.f9296t0.setStyle(Paint.Style.FILL);
        this.f9299w0.set(rect);
        if (!this.f9271U0) {
            canvas.drawRoundRect(this.f9299w0, m10908G0(), m10908G0(), this.f9296t0);
        } else {
            m20843h(new RectF(rect), this.f9301y0);
            super.m20845p(canvas, this.f9296t0, this.f9301y0, m20848u());
        }
    }

    /* renamed from: B0 */
    private void m10860B0(Canvas canvas, Rect rect) {
        Paint paint = this.f9297u0;
        if (paint != null) {
            paint.setColor(C0601a.m3180f(-16777216, 127));
            canvas.drawRect(rect, this.f9297u0);
            if (m10863L2() || m10862K2()) {
                m10872j0(rect, this.f9299w0);
                canvas.drawRect(this.f9299w0, this.f9297u0);
            }
            if (this.f9266S != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f9297u0);
            }
            if (m10864M2()) {
                m10876m0(rect, this.f9299w0);
                canvas.drawRect(this.f9299w0, this.f9297u0);
            }
            this.f9297u0.setColor(C0601a.m3180f(-65536, 127));
            m10874l0(rect, this.f9299w0);
            canvas.drawRect(this.f9299w0, this.f9297u0);
            this.f9297u0.setColor(C0601a.m3180f(-16711936, 127));
            m10877n0(rect, this.f9299w0);
            canvas.drawRect(this.f9299w0, this.f9297u0);
        }
    }

    /* renamed from: C0 */
    private void m10861C0(Canvas canvas, Rect rect) {
        if (this.f9266S != null) {
            Paint.Align m10981r0 = m10981r0(rect, this.f9300x0);
            m10878p0(rect, this.f9299w0);
            if (this.f9302z0.m11360d() != null) {
                this.f9302z0.m11361e().drawableState = getState();
                this.f9302z0.m11366j(this.f9295s0);
            }
            this.f9302z0.m11361e().setTextAlign(m10981r0);
            int i10 = 0;
            boolean z10 = Math.round(this.f9302z0.m11362f(m10959f1().toString())) > Math.round(this.f9299w0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f9299w0);
            }
            CharSequence charSequence = this.f9266S;
            if (z10 && this.f9265R0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f9302z0.m11361e(), this.f9299w0.width(), this.f9265R0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f9300x0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f9302z0.m11361e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    /* renamed from: K2 */
    private boolean m10862K2() {
        return this.f9282f0 && this.f9283g0 != null && this.f9247G0;
    }

    /* renamed from: L2 */
    private boolean m10863L2() {
        return this.f9268T && this.f9270U != null;
    }

    /* renamed from: M2 */
    private boolean m10864M2() {
        return this.f9275Y && this.f9276Z != null;
    }

    /* renamed from: N2 */
    private void m10865N2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: O2 */
    private void m10866O2() {
        this.f9261P0 = this.f9259O0 ? C5457b.m20047d(this.f9264R) : null;
    }

    @TargetApi(21)
    /* renamed from: P2 */
    private void m10867P2() {
        this.f9277a0 = new RippleDrawable(C5457b.m20047d(m10955d1()), this.f9276Z, f9240W0);
    }

    /* renamed from: X0 */
    private float m10868X0() {
        Drawable drawable = this.f9247G0 ? this.f9283g0 : this.f9270U;
        float f10 = this.f9273W;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil(C2489l.m11380b(this.f9295s0, 24));
            if (drawable.getIntrinsicHeight() <= f10) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    /* renamed from: Y0 */
    private float m10869Y0() {
        Drawable drawable = this.f9247G0 ? this.f9283g0 : this.f9270U;
        float f10 = this.f9273W;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    /* renamed from: Z1 */
    private void m10870Z1(ColorStateList colorStateList) {
        if (this.f9252L != colorStateList) {
            this.f9252L = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: i0 */
    private void m10871i0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0609a.m3258m(drawable, C0609a.m3251f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9276Z) {
            if (drawable.isStateful()) {
                drawable.setState(m10940U0());
            }
            C0609a.m3260o(drawable, this.f9278b0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f9270U;
        if (drawable == drawable2 && this.f9274X) {
            C0609a.m3260o(drawable2, this.f9272V);
        }
    }

    /* renamed from: j0 */
    private void m10872j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10863L2() || m10862K2()) {
            float f10 = this.f9287k0 + this.f9288l0;
            float m10869Y0 = m10869Y0();
            if (C0609a.m3251f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + m10869Y0;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - m10869Y0;
            }
            float m10868X0 = m10868X0();
            float exactCenterY = rect.exactCenterY() - (m10868X0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m10868X0;
        }
    }

    /* renamed from: j1 */
    private ColorFilter m10873j1() {
        ColorFilter colorFilter = this.f9250J0;
        return colorFilter != null ? colorFilter : this.f9251K0;
    }

    /* renamed from: l0 */
    private void m10874l0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m10864M2()) {
            float f10 = this.f9294r0 + this.f9293q0 + this.f9279c0 + this.f9292p0 + this.f9291o0;
            if (C0609a.m3251f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    /* renamed from: l1 */
    private static boolean m10875l1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m0 */
    private void m10876m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10864M2()) {
            float f10 = this.f9294r0 + this.f9293q0;
            if (C0609a.m3251f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f9279c0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f9279c0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f9279c0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    /* renamed from: n0 */
    private void m10877n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10864M2()) {
            float f10 = this.f9294r0 + this.f9293q0 + this.f9279c0 + this.f9292p0 + this.f9291o0;
            if (C0609a.m3251f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: p0 */
    private void m10878p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f9266S != null) {
            float m10968k0 = this.f9287k0 + m10968k0() + this.f9290n0;
            float m10976o0 = this.f9294r0 + m10976o0() + this.f9291o0;
            if (C0609a.m3251f(this) == 0) {
                rectF.left = rect.left + m10968k0;
                rectF.right = rect.right - m10976o0;
            } else {
                rectF.left = rect.left + m10976o0;
                rectF.right = rect.right - m10968k0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: p1 */
    private static boolean m10879p1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: q0 */
    private float m10880q0() {
        this.f9302z0.m11361e().getFontMetrics(this.f9298v0);
        Paint.FontMetrics fontMetrics = this.f9298v0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: q1 */
    private static boolean m10881q1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: r1 */
    private static boolean m10882r1(C4982d c4982d) {
        ColorStateList colorStateList;
        return (c4982d == null || (colorStateList = c4982d.f19055a) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: s0 */
    private boolean m10883s0() {
        return this.f9282f0 && this.f9283g0 != null && this.f9281e0;
    }

    /* renamed from: s1 */
    private void m10884s1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray m11374h = C2487j.m11374h(this.f9295s0, attributeSet, C3530l.f14898Z, i10, i11, new int[0]);
        this.f9271U0 = m11374h.hasValue(C3530l.f14801L0);
        m10870Z1(C4981c.m19404a(this.f9295s0, m11374h, C3530l.f15098y0));
        m10900D1(C4981c.m19404a(this.f9295s0, m11374h, C3530l.f14994l0));
        m10935R1(m11374h.getDimension(C3530l.f15058t0, 0.0f));
        int i12 = C3530l.f15002m0;
        if (m11374h.hasValue(i12)) {
            m10906F1(m11374h.getDimension(i12, 0.0f));
        }
        m10943V1(C4981c.m19404a(this.f9295s0, m11374h, C3530l.f15082w0));
        m10946X1(m11374h.getDimension(C3530l.f15090x0, 0.0f));
        m10990w2(C4981c.m19404a(this.f9295s0, m11374h, C3530l.f14794K0));
        m10896B2(m11374h.getText(C3530l.f14946f0));
        C4982d m19409f = C4981c.m19409f(this.f9295s0, m11374h, C3530l.f14906a0);
        m19409f.f19068n = m11374h.getDimension(C3530l.f14914b0, m19409f.f19068n);
        m10898C2(m19409f);
        int i13 = m11374h.getInt(C3530l.f14930d0, 0);
        if (i13 == 1) {
            m10978o2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            m10978o2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            m10978o2(TextUtils.TruncateAt.END);
        }
        m10933Q1(m11374h.getBoolean(C3530l.f15050s0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m10933Q1(m11374h.getBoolean(C3530l.f15026p0, false));
        }
        m10918J1(C4981c.m19407d(this.f9295s0, m11374h, C3530l.f15018o0));
        int i14 = C3530l.f15042r0;
        if (m11374h.hasValue(i14)) {
            m10927N1(C4981c.m19404a(this.f9295s0, m11374h, i14));
        }
        m10923L1(m11374h.getDimension(C3530l.f15034q0, -1.0f));
        m10973m2(m11374h.getBoolean(C3530l.f14755F0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m10973m2(m11374h.getBoolean(C3530l.f14715A0, false));
        }
        m10950a2(C4981c.m19407d(this.f9295s0, m11374h, C3530l.f15106z0));
        m10970k2(C4981c.m19404a(this.f9295s0, m11374h, C3530l.f14747E0));
        m10960f2(m11374h.getDimension(C3530l.f14731C0, 0.0f));
        m10987v1(m11374h.getBoolean(C3530l.f14954g0, false));
        m10897C1(m11374h.getBoolean(C3530l.f14986k0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m10897C1(m11374h.getBoolean(C3530l.f14970i0, false));
        }
        m10991x1(C4981c.m19407d(this.f9295s0, m11374h, C3530l.f14962h0));
        int i15 = C3530l.f14978j0;
        if (m11374h.hasValue(i15)) {
            m10995z1(C4981c.m19404a(this.f9295s0, m11374h, i15));
        }
        m10996z2(C3607h.m15430b(this.f9295s0, m11374h, C3530l.f14808M0));
        m10979p2(C3607h.m15430b(this.f9295s0, m11374h, C3530l.f14771H0));
        m10939T1(m11374h.getDimension(C3530l.f15074v0, 0.0f));
        m10985t2(m11374h.getDimension(C3530l.f14787J0, 0.0f));
        m10982r2(m11374h.getDimension(C3530l.f14779I0, 0.0f));
        m10910G2(m11374h.getDimension(C3530l.f14822O0, 0.0f));
        m10904E2(m11374h.getDimension(C3530l.f14815N0, 0.0f));
        m10964h2(m11374h.getDimension(C3530l.f14739D0, 0.0f));
        m10954c2(m11374h.getDimension(C3530l.f14723B0, 0.0f));
        m10912H1(m11374h.getDimension(C3530l.f15010n0, 0.0f));
        m10988v2(m11374h.getDimensionPixelSize(C3530l.f14938e0, Integer.MAX_VALUE));
        m11374h.recycle();
    }

    /* renamed from: t0 */
    public static C2440a m10885t0(Context context, AttributeSet attributeSet, int i10, int i11) {
        C2440a c2440a = new C2440a(context, attributeSet, i10, i11);
        c2440a.m10884s1(attributeSet, i10, i11);
        return c2440a;
    }

    /* renamed from: u0 */
    private void m10886u0(Canvas canvas, Rect rect) {
        if (m10862K2()) {
            m10872j0(rect, this.f9299w0);
            RectF rectF = this.f9299w0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9283g0.setBounds(0, 0, (int) this.f9299w0.width(), (int) this.f9299w0.height());
            this.f9283g0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m10887u1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2440a.m10887u1(int[], int[]):boolean");
    }

    /* renamed from: v0 */
    private void m10888v0(Canvas canvas, Rect rect) {
        if (this.f9271U0) {
            return;
        }
        this.f9296t0.setColor(this.f9242B0);
        this.f9296t0.setStyle(Paint.Style.FILL);
        this.f9296t0.setColorFilter(m10873j1());
        this.f9299w0.set(rect);
        canvas.drawRoundRect(this.f9299w0, m10908G0(), m10908G0(), this.f9296t0);
    }

    /* renamed from: w0 */
    private void m10889w0(Canvas canvas, Rect rect) {
        if (m10863L2()) {
            m10872j0(rect, this.f9299w0);
            RectF rectF = this.f9299w0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9270U.setBounds(0, 0, (int) this.f9299w0.width(), (int) this.f9299w0.height());
            this.f9270U.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* renamed from: x0 */
    private void m10890x0(Canvas canvas, Rect rect) {
        if (this.f9262Q <= 0.0f || this.f9271U0) {
            return;
        }
        this.f9296t0.setColor(this.f9244D0);
        this.f9296t0.setStyle(Paint.Style.STROKE);
        if (!this.f9271U0) {
            this.f9296t0.setColorFilter(m10873j1());
        }
        RectF rectF = this.f9299w0;
        float f10 = rect.left;
        float f11 = this.f9262Q;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f9258O - (this.f9262Q / 2.0f);
        canvas.drawRoundRect(this.f9299w0, f12, f12, this.f9296t0);
    }

    /* renamed from: y0 */
    private void m10891y0(Canvas canvas, Rect rect) {
        if (this.f9271U0) {
            return;
        }
        this.f9296t0.setColor(this.f9241A0);
        this.f9296t0.setStyle(Paint.Style.FILL);
        this.f9299w0.set(rect);
        canvas.drawRoundRect(this.f9299w0, m10908G0(), m10908G0(), this.f9296t0);
    }

    /* renamed from: z0 */
    private void m10892z0(Canvas canvas, Rect rect) {
        if (m10864M2()) {
            m10876m0(rect, this.f9299w0);
            RectF rectF = this.f9299w0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f9276Z.setBounds(0, 0, (int) this.f9299w0.width(), (int) this.f9299w0.height());
            if (C5457b.f20338a) {
                this.f9277a0.setBounds(this.f9276Z.getBounds());
                this.f9277a0.jumpToCurrentState();
                this.f9277a0.draw(canvas);
            } else {
                this.f9276Z.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    /* renamed from: A1 */
    public void m10893A1(int i10) {
        m10995z1(C3121a.m13769c(this.f9295s0, i10));
    }

    /* renamed from: A2 */
    public void m10894A2(int i10) {
        m10996z2(C3607h.m15431c(this.f9295s0, i10));
    }

    /* renamed from: B1 */
    public void m10895B1(int i10) {
        m10897C1(this.f9295s0.getResources().getBoolean(i10));
    }

    /* renamed from: B2 */
    public void m10896B2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.f9266S, charSequence)) {
            return;
        }
        this.f9266S = charSequence;
        this.f9302z0.m11365i(true);
        invalidateSelf();
        m10984t1();
    }

    /* renamed from: C1 */
    public void m10897C1(boolean z10) {
        if (this.f9282f0 != z10) {
            boolean m10862K2 = m10862K2();
            this.f9282f0 = z10;
            boolean m10862K22 = m10862K2();
            if (m10862K2 != m10862K22) {
                if (m10862K22) {
                    m10871i0(this.f9283g0);
                } else {
                    m10865N2(this.f9283g0);
                }
                invalidateSelf();
                m10984t1();
            }
        }
    }

    /* renamed from: C2 */
    public void m10898C2(C4982d c4982d) {
        this.f9302z0.m11364h(c4982d, this.f9295s0);
    }

    /* renamed from: D0 */
    public Drawable m10899D0() {
        return this.f9283g0;
    }

    /* renamed from: D1 */
    public void m10900D1(ColorStateList colorStateList) {
        if (this.f9254M != colorStateList) {
            this.f9254M = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: D2 */
    public void m10901D2(int i10) {
        m10898C2(new C4982d(this.f9295s0, i10));
    }

    /* renamed from: E0 */
    public ColorStateList m10902E0() {
        return this.f9284h0;
    }

    /* renamed from: E1 */
    public void m10903E1(int i10) {
        m10900D1(C3121a.m13769c(this.f9295s0, i10));
    }

    /* renamed from: E2 */
    public void m10904E2(float f10) {
        if (this.f9291o0 != f10) {
            this.f9291o0 = f10;
            invalidateSelf();
            m10984t1();
        }
    }

    /* renamed from: F0 */
    public ColorStateList m10905F0() {
        return this.f9254M;
    }

    @Deprecated
    /* renamed from: F1 */
    public void m10906F1(float f10) {
        if (this.f9258O != f10) {
            this.f9258O = f10;
            setShapeAppearanceModel(m20822C().m20884w(f10));
        }
    }

    /* renamed from: F2 */
    public void m10907F2(int i10) {
        m10904E2(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: G0 */
    public float m10908G0() {
        return this.f9271U0 ? m20824F() : this.f9258O;
    }

    @Deprecated
    /* renamed from: G1 */
    public void m10909G1(int i10) {
        m10906F1(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: G2 */
    public void m10910G2(float f10) {
        if (this.f9290n0 != f10) {
            this.f9290n0 = f10;
            invalidateSelf();
            m10984t1();
        }
    }

    /* renamed from: H0 */
    public float m10911H0() {
        return this.f9294r0;
    }

    /* renamed from: H1 */
    public void m10912H1(float f10) {
        if (this.f9294r0 != f10) {
            this.f9294r0 = f10;
            invalidateSelf();
            m10984t1();
        }
    }

    /* renamed from: H2 */
    public void m10913H2(int i10) {
        m10910G2(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: I0 */
    public Drawable m10914I0() {
        Drawable drawable = this.f9270U;
        if (drawable != null) {
            return C0609a.m3262q(drawable);
        }
        return null;
    }

    /* renamed from: I1 */
    public void m10915I1(int i10) {
        m10912H1(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: I2 */
    public void m10916I2(boolean z10) {
        if (this.f9259O0 != z10) {
            this.f9259O0 = z10;
            m10866O2();
            onStateChange(getState());
        }
    }

    /* renamed from: J0 */
    public float m10917J0() {
        return this.f9273W;
    }

    /* renamed from: J1 */
    public void m10918J1(Drawable drawable) {
        Drawable m10914I0 = m10914I0();
        if (m10914I0 != drawable) {
            float m10968k0 = m10968k0();
            this.f9270U = drawable != null ? C0609a.m3263r(drawable).mutate() : null;
            float m10968k02 = m10968k0();
            m10865N2(m10914I0);
            if (m10863L2()) {
                m10871i0(this.f9270U);
            }
            invalidateSelf();
            if (m10968k0 != m10968k02) {
                m10984t1();
            }
        }
    }

    /* renamed from: J2 */
    public boolean m10919J2() {
        return this.f9267S0;
    }

    /* renamed from: K0 */
    public ColorStateList m10920K0() {
        return this.f9272V;
    }

    /* renamed from: K1 */
    public void m10921K1(int i10) {
        m10918J1(C3121a.m13770d(this.f9295s0, i10));
    }

    /* renamed from: L0 */
    public float m10922L0() {
        return this.f9256N;
    }

    /* renamed from: L1 */
    public void m10923L1(float f10) {
        if (this.f9273W != f10) {
            float m10968k0 = m10968k0();
            this.f9273W = f10;
            float m10968k02 = m10968k0();
            invalidateSelf();
            if (m10968k0 != m10968k02) {
                m10984t1();
            }
        }
    }

    /* renamed from: M0 */
    public float m10924M0() {
        return this.f9287k0;
    }

    /* renamed from: M1 */
    public void m10925M1(int i10) {
        m10923L1(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: N0 */
    public ColorStateList m10926N0() {
        return this.f9260P;
    }

    /* renamed from: N1 */
    public void m10927N1(ColorStateList colorStateList) {
        this.f9274X = true;
        if (this.f9272V != colorStateList) {
            this.f9272V = colorStateList;
            if (m10863L2()) {
                C0609a.m3260o(this.f9270U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: O0 */
    public float m10928O0() {
        return this.f9262Q;
    }

    /* renamed from: O1 */
    public void m10929O1(int i10) {
        m10927N1(C3121a.m13769c(this.f9295s0, i10));
    }

    /* renamed from: P0 */
    public Drawable m10930P0() {
        Drawable drawable = this.f9276Z;
        if (drawable != null) {
            return C0609a.m3262q(drawable);
        }
        return null;
    }

    /* renamed from: P1 */
    public void m10931P1(int i10) {
        m10933Q1(this.f9295s0.getResources().getBoolean(i10));
    }

    /* renamed from: Q0 */
    public CharSequence m10932Q0() {
        return this.f9280d0;
    }

    /* renamed from: Q1 */
    public void m10933Q1(boolean z10) {
        if (this.f9268T != z10) {
            boolean m10863L2 = m10863L2();
            this.f9268T = z10;
            boolean m10863L22 = m10863L2();
            if (m10863L2 != m10863L22) {
                if (m10863L22) {
                    m10871i0(this.f9270U);
                } else {
                    m10865N2(this.f9270U);
                }
                invalidateSelf();
                m10984t1();
            }
        }
    }

    /* renamed from: R0 */
    public float m10934R0() {
        return this.f9293q0;
    }

    /* renamed from: R1 */
    public void m10935R1(float f10) {
        if (this.f9256N != f10) {
            this.f9256N = f10;
            invalidateSelf();
            m10984t1();
        }
    }

    /* renamed from: S0 */
    public float m10936S0() {
        return this.f9279c0;
    }

    /* renamed from: S1 */
    public void m10937S1(int i10) {
        m10935R1(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: T0 */
    public float m10938T0() {
        return this.f9292p0;
    }

    /* renamed from: T1 */
    public void m10939T1(float f10) {
        if (this.f9287k0 != f10) {
            this.f9287k0 = f10;
            invalidateSelf();
            m10984t1();
        }
    }

    /* renamed from: U0 */
    public int[] m10940U0() {
        return this.f9257N0;
    }

    /* renamed from: U1 */
    public void m10941U1(int i10) {
        m10939T1(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: V0 */
    public ColorStateList m10942V0() {
        return this.f9278b0;
    }

    /* renamed from: V1 */
    public void m10943V1(ColorStateList colorStateList) {
        if (this.f9260P != colorStateList) {
            this.f9260P = colorStateList;
            if (this.f9271U0) {
                m20841d0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: W0 */
    public void m10944W0(RectF rectF) {
        m10877n0(getBounds(), rectF);
    }

    /* renamed from: W1 */
    public void m10945W1(int i10) {
        m10943V1(C3121a.m13769c(this.f9295s0, i10));
    }

    /* renamed from: X1 */
    public void m10946X1(float f10) {
        if (this.f9262Q != f10) {
            this.f9262Q = f10;
            this.f9296t0.setStrokeWidth(f10);
            if (this.f9271U0) {
                super.m20842e0(f10);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Y1 */
    public void m10947Y1(int i10) {
        m10946X1(this.f9295s0.getResources().getDimension(i10));
    }

    /* renamed from: Z0 */
    public TextUtils.TruncateAt m10948Z0() {
        return this.f9265R0;
    }

    @Override // com.google.android.material.internal.C2485h.b
    /* renamed from: a */
    public void mo10529a() {
        m10984t1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public C3607h m10949a1() {
        return this.f9286j0;
    }

    /* renamed from: a2 */
    public void m10950a2(Drawable drawable) {
        Drawable m10930P0 = m10930P0();
        if (m10930P0 != drawable) {
            float m10976o0 = m10976o0();
            this.f9276Z = drawable != null ? C0609a.m3263r(drawable).mutate() : null;
            if (C5457b.f20338a) {
                m10867P2();
            }
            float m10976o02 = m10976o0();
            m10865N2(m10930P0);
            if (m10864M2()) {
                m10871i0(this.f9276Z);
            }
            invalidateSelf();
            if (m10976o0 != m10976o02) {
                m10984t1();
            }
        }
    }

    /* renamed from: b1 */
    public float m10951b1() {
        return this.f9289m0;
    }

    /* renamed from: b2 */
    public void m10952b2(CharSequence charSequence) {
        if (this.f9280d0 != charSequence) {
            this.f9280d0 = C0642a.m3411c().m3416h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: c1 */
    public float m10953c1() {
        return this.f9288l0;
    }

    /* renamed from: c2 */
    public void m10954c2(float f10) {
        if (this.f9293q0 != f10) {
            this.f9293q0 = f10;
            invalidateSelf();
            if (m10864M2()) {
                m10984t1();
            }
        }
    }

    /* renamed from: d1 */
    public ColorStateList m10955d1() {
        return this.f9264R;
    }

    /* renamed from: d2 */
    public void m10956d2(int i10) {
        m10954c2(this.f9295s0.getResources().getDimension(i10));
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f9249I0;
        int m15967a = i10 < 255 ? C3757a.m15967a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        m10891y0(canvas, bounds);
        m10888v0(canvas, bounds);
        if (this.f9271U0) {
            super.draw(canvas);
        }
        m10890x0(canvas, bounds);
        m10859A0(canvas, bounds);
        m10889w0(canvas, bounds);
        m10886u0(canvas, bounds);
        if (this.f9267S0) {
            m10861C0(canvas, bounds);
        }
        m10892z0(canvas, bounds);
        m10860B0(canvas, bounds);
        if (this.f9249I0 < 255) {
            canvas.restoreToCount(m15967a);
        }
    }

    /* renamed from: e1 */
    public C3607h m10957e1() {
        return this.f9285i0;
    }

    /* renamed from: e2 */
    public void m10958e2(int i10) {
        m10950a2(C3121a.m13770d(this.f9295s0, i10));
    }

    /* renamed from: f1 */
    public CharSequence m10959f1() {
        return this.f9266S;
    }

    /* renamed from: f2 */
    public void m10960f2(float f10) {
        if (this.f9279c0 != f10) {
            this.f9279c0 = f10;
            invalidateSelf();
            if (m10864M2()) {
                m10984t1();
            }
        }
    }

    /* renamed from: g1 */
    public C4982d m10961g1() {
        return this.f9302z0.m11360d();
    }

    /* renamed from: g2 */
    public void m10962g2(int i10) {
        m10960f2(this.f9295s0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9249I0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f9250J0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f9256N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f9287k0 + m10968k0() + this.f9290n0 + this.f9302z0.m11362f(m10959f1().toString()) + this.f9291o0 + m10976o0() + this.f9294r0), this.f9269T0);
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9271U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f9258O);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f9258O);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public float m10963h1() {
        return this.f9291o0;
    }

    /* renamed from: h2 */
    public void m10964h2(float f10) {
        if (this.f9292p0 != f10) {
            this.f9292p0 = f10;
            invalidateSelf();
            if (m10864M2()) {
                m10984t1();
            }
        }
    }

    /* renamed from: i1 */
    public float m10965i1() {
        return this.f9290n0;
    }

    /* renamed from: i2 */
    public void m10966i2(int i10) {
        m10964h2(this.f9295s0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return m10879p1(this.f9252L) || m10879p1(this.f9254M) || m10879p1(this.f9260P) || (this.f9259O0 && m10879p1(this.f9261P0)) || m10882r1(this.f9302z0.m11360d()) || m10883s0() || m10881q1(this.f9270U) || m10881q1(this.f9283g0) || m10879p1(this.f9253L0);
    }

    /* renamed from: j2 */
    public boolean m10967j2(int[] iArr) {
        if (Arrays.equals(this.f9257N0, iArr)) {
            return false;
        }
        this.f9257N0 = iArr;
        if (m10864M2()) {
            return m10887u1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: k0 */
    public float m10968k0() {
        if (m10863L2() || m10862K2()) {
            return this.f9288l0 + m10869Y0() + this.f9289m0;
        }
        return 0.0f;
    }

    /* renamed from: k1 */
    public boolean m10969k1() {
        return this.f9259O0;
    }

    /* renamed from: k2 */
    public void m10970k2(ColorStateList colorStateList) {
        if (this.f9278b0 != colorStateList) {
            this.f9278b0 = colorStateList;
            if (m10864M2()) {
                C0609a.m3260o(this.f9276Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: l2 */
    public void m10971l2(int i10) {
        m10970k2(C3121a.m13769c(this.f9295s0, i10));
    }

    /* renamed from: m1 */
    public boolean m10972m1() {
        return this.f9281e0;
    }

    /* renamed from: m2 */
    public void m10973m2(boolean z10) {
        if (this.f9275Y != z10) {
            boolean m10864M2 = m10864M2();
            this.f9275Y = z10;
            boolean m10864M22 = m10864M2();
            if (m10864M2 != m10864M22) {
                if (m10864M22) {
                    m10871i0(this.f9276Z);
                } else {
                    m10865N2(this.f9276Z);
                }
                invalidateSelf();
                m10984t1();
            }
        }
    }

    /* renamed from: n1 */
    public boolean m10974n1() {
        return m10881q1(this.f9276Z);
    }

    /* renamed from: n2 */
    public void m10975n2(a aVar) {
        this.f9263Q0 = new WeakReference<>(aVar);
    }

    /* renamed from: o0 */
    public float m10976o0() {
        if (m10864M2()) {
            return this.f9292p0 + this.f9279c0 + this.f9293q0;
        }
        return 0.0f;
    }

    /* renamed from: o1 */
    public boolean m10977o1() {
        return this.f9275Y;
    }

    /* renamed from: o2 */
    public void m10978o2(TextUtils.TruncateAt truncateAt) {
        this.f9265R0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (m10863L2()) {
            onLayoutDirectionChanged |= C0609a.m3258m(this.f9270U, i10);
        }
        if (m10862K2()) {
            onLayoutDirectionChanged |= C0609a.m3258m(this.f9283g0, i10);
        }
        if (m10864M2()) {
            onLayoutDirectionChanged |= C0609a.m3258m(this.f9276Z, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (m10863L2()) {
            onLevelChange |= this.f9270U.setLevel(i10);
        }
        if (m10862K2()) {
            onLevelChange |= this.f9283g0.setLevel(i10);
        }
        if (m10864M2()) {
            onLevelChange |= this.f9276Z.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable, com.google.android.material.internal.C2485h.b
    public boolean onStateChange(int[] iArr) {
        if (this.f9271U0) {
            super.onStateChange(iArr);
        }
        return m10887u1(iArr, m10940U0());
    }

    /* renamed from: p2 */
    public void m10979p2(C3607h c3607h) {
        this.f9286j0 = c3607h;
    }

    /* renamed from: q2 */
    public void m10980q2(int i10) {
        m10979p2(C3607h.m15431c(this.f9295s0, i10));
    }

    /* renamed from: r0 */
    Paint.Align m10981r0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f9266S != null) {
            float m10968k0 = this.f9287k0 + m10968k0() + this.f9290n0;
            if (C0609a.m3251f(this) == 0) {
                pointF.x = rect.left + m10968k0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m10968k0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m10880q0();
        }
        return align;
    }

    /* renamed from: r2 */
    public void m10982r2(float f10) {
        if (this.f9289m0 != f10) {
            float m10968k0 = m10968k0();
            this.f9289m0 = f10;
            float m10968k02 = m10968k0();
            invalidateSelf();
            if (m10968k0 != m10968k02) {
                m10984t1();
            }
        }
    }

    /* renamed from: s2 */
    public void m10983s2(int i10) {
        m10982r2(this.f9295s0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f9249I0 != i10) {
            this.f9249I0 = i10;
            invalidateSelf();
        }
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f9250J0 != colorFilter) {
            this.f9250J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f9253L0 != colorStateList) {
            this.f9253L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p310y4.C5888g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f9255M0 != mode) {
            this.f9255M0 = mode;
            this.f9251K0 = C4313a.m17823a(this, this.f9253L0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (m10863L2()) {
            visible |= this.f9270U.setVisible(z10, z11);
        }
        if (m10862K2()) {
            visible |= this.f9283g0.setVisible(z10, z11);
        }
        if (m10864M2()) {
            visible |= this.f9276Z.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    protected void m10984t1() {
        a aVar = this.f9263Q0.get();
        if (aVar != null) {
            aVar.mo10828a();
        }
    }

    /* renamed from: t2 */
    public void m10985t2(float f10) {
        if (this.f9288l0 != f10) {
            float m10968k0 = m10968k0();
            this.f9288l0 = f10;
            float m10968k02 = m10968k0();
            invalidateSelf();
            if (m10968k0 != m10968k02) {
                m10984t1();
            }
        }
    }

    /* renamed from: u2 */
    public void m10986u2(int i10) {
        m10985t2(this.f9295s0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void m10987v1(boolean z10) {
        if (this.f9281e0 != z10) {
            this.f9281e0 = z10;
            float m10968k0 = m10968k0();
            if (!z10 && this.f9247G0) {
                this.f9247G0 = false;
            }
            float m10968k02 = m10968k0();
            invalidateSelf();
            if (m10968k0 != m10968k02) {
                m10984t1();
            }
        }
    }

    /* renamed from: v2 */
    public void m10988v2(int i10) {
        this.f9269T0 = i10;
    }

    /* renamed from: w1 */
    public void m10989w1(int i10) {
        m10987v1(this.f9295s0.getResources().getBoolean(i10));
    }

    /* renamed from: w2 */
    public void m10990w2(ColorStateList colorStateList) {
        if (this.f9264R != colorStateList) {
            this.f9264R = colorStateList;
            m10866O2();
            onStateChange(getState());
        }
    }

    /* renamed from: x1 */
    public void m10991x1(Drawable drawable) {
        if (this.f9283g0 != drawable) {
            float m10968k0 = m10968k0();
            this.f9283g0 = drawable;
            float m10968k02 = m10968k0();
            m10865N2(this.f9283g0);
            m10871i0(this.f9283g0);
            invalidateSelf();
            if (m10968k0 != m10968k02) {
                m10984t1();
            }
        }
    }

    /* renamed from: x2 */
    public void m10992x2(int i10) {
        m10990w2(C3121a.m13769c(this.f9295s0, i10));
    }

    /* renamed from: y1 */
    public void m10993y1(int i10) {
        m10991x1(C3121a.m13770d(this.f9295s0, i10));
    }

    /* renamed from: y2 */
    public void m10994y2(boolean z10) {
        this.f9267S0 = z10;
    }

    /* renamed from: z1 */
    public void m10995z1(ColorStateList colorStateList) {
        if (this.f9284h0 != colorStateList) {
            this.f9284h0 = colorStateList;
            if (m10883s0()) {
                C0609a.m3260o(this.f9283g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: z2 */
    public void m10996z2(C3607h c3607h) {
        this.f9285i0 = c3607h;
    }
}
