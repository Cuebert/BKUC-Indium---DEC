package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.C0645d;
import androidx.core.util.C0654h;
import androidx.core.view.C0670e;
import androidx.core.view.C0690v;
import com.google.android.material.internal.C2484g;
import p125j4.C3600a;
import p207q0.C4291a;
import p272v4.C4979a;
import p272v4.C4982d;

/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes.dex */
public final class C2478a {

    /* renamed from: j0 */
    private static final boolean f9554j0 = false;

    /* renamed from: k0 */
    private static final Paint f9555k0 = null;

    /* renamed from: A */
    private C4979a f9556A;

    /* renamed from: B */
    private CharSequence f9557B;

    /* renamed from: C */
    private CharSequence f9558C;

    /* renamed from: D */
    private boolean f9559D;

    /* renamed from: F */
    private boolean f9561F;

    /* renamed from: G */
    private Bitmap f9562G;

    /* renamed from: H */
    private Paint f9563H;

    /* renamed from: I */
    private float f9564I;

    /* renamed from: J */
    private float f9565J;

    /* renamed from: K */
    private int[] f9566K;

    /* renamed from: L */
    private boolean f9567L;

    /* renamed from: M */
    private final TextPaint f9568M;

    /* renamed from: N */
    private final TextPaint f9569N;

    /* renamed from: O */
    private TimeInterpolator f9570O;

    /* renamed from: P */
    private TimeInterpolator f9571P;

    /* renamed from: Q */
    private float f9572Q;

    /* renamed from: R */
    private float f9573R;

    /* renamed from: S */
    private float f9574S;

    /* renamed from: T */
    private ColorStateList f9575T;

    /* renamed from: U */
    private float f9576U;

    /* renamed from: V */
    private float f9577V;

    /* renamed from: W */
    private float f9578W;

    /* renamed from: X */
    private ColorStateList f9579X;

    /* renamed from: Y */
    private float f9580Y;

    /* renamed from: Z */
    private float f9581Z;

    /* renamed from: a */
    private final View f9582a;

    /* renamed from: a0 */
    private StaticLayout f9583a0;

    /* renamed from: b */
    private boolean f9584b;

    /* renamed from: b0 */
    private float f9585b0;

    /* renamed from: c */
    private float f9586c;

    /* renamed from: c0 */
    private float f9587c0;

    /* renamed from: d */
    private boolean f9588d;

    /* renamed from: d0 */
    private float f9589d0;

    /* renamed from: e */
    private float f9590e;

    /* renamed from: e0 */
    private CharSequence f9591e0;

    /* renamed from: f */
    private float f9592f;

    /* renamed from: g */
    private int f9594g;

    /* renamed from: h */
    private final Rect f9596h;

    /* renamed from: i */
    private final Rect f9598i;

    /* renamed from: j */
    private final RectF f9600j;

    /* renamed from: o */
    private ColorStateList f9605o;

    /* renamed from: p */
    private ColorStateList f9606p;

    /* renamed from: q */
    private float f9607q;

    /* renamed from: r */
    private float f9608r;

    /* renamed from: s */
    private float f9609s;

    /* renamed from: t */
    private float f9610t;

    /* renamed from: u */
    private float f9611u;

    /* renamed from: v */
    private float f9612v;

    /* renamed from: w */
    private Typeface f9613w;

    /* renamed from: x */
    private Typeface f9614x;

    /* renamed from: y */
    private Typeface f9615y;

    /* renamed from: z */
    private C4979a f9616z;

    /* renamed from: k */
    private int f9601k = 16;

    /* renamed from: l */
    private int f9602l = 16;

    /* renamed from: m */
    private float f9603m = 15.0f;

    /* renamed from: n */
    private float f9604n = 15.0f;

    /* renamed from: E */
    private boolean f9560E = true;

    /* renamed from: f0 */
    private int f9593f0 = 1;

    /* renamed from: g0 */
    private float f9595g0 = 0.0f;

    /* renamed from: h0 */
    private float f9597h0 = 1.0f;

    /* renamed from: i0 */
    private int f9599i0 = C2484g.f9637n;

    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    class a implements C4979a.a {
        a() {
        }

        @Override // p272v4.C4979a.a
        /* renamed from: a */
        public void mo11338a(Typeface typeface) {
            C2478a.this.m11318R(typeface);
        }
    }

    public C2478a(View view) {
        this.f9582a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f9568M = textPaint;
        this.f9569N = new TextPaint(textPaint);
        this.f9598i = new Rect();
        this.f9596h = new Rect();
        this.f9600j = new RectF();
        this.f9592f = m11294f();
    }

    /* renamed from: A */
    private void m11278A(TextPaint textPaint) {
        textPaint.setTextSize(this.f9603m);
        textPaint.setTypeface(this.f9614x);
        textPaint.setLetterSpacing(this.f9581Z);
    }

    /* renamed from: B */
    private void m11279B(float f10) {
        if (this.f9588d) {
            this.f9600j.set(f10 < this.f9592f ? this.f9596h : this.f9598i);
            return;
        }
        this.f9600j.left = m11283G(this.f9596h.left, this.f9598i.left, f10, this.f9570O);
        this.f9600j.top = m11283G(this.f9607q, this.f9608r, f10, this.f9570O);
        this.f9600j.right = m11283G(this.f9596h.right, this.f9598i.right, f10, this.f9570O);
        this.f9600j.bottom = m11283G(this.f9596h.bottom, this.f9598i.bottom, f10, this.f9570O);
    }

    /* renamed from: C */
    private static boolean m11280C(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    /* renamed from: D */
    private boolean m11281D() {
        return C0690v.m3791E(this.f9582a) == 1;
    }

    /* renamed from: F */
    private boolean m11282F(CharSequence charSequence, boolean z10) {
        return (z10 ? C0645d.f3483d : C0645d.f3482c).mo3443a(charSequence, 0, charSequence.length());
    }

    /* renamed from: G */
    private static float m11283G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return C3600a.m15417a(f10, f11, f12);
    }

    /* renamed from: K */
    private static boolean m11284K(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    /* renamed from: O */
    private void m11285O(float f10) {
        this.f9585b0 = f10;
        C0690v.m3835h0(this.f9582a);
    }

    /* renamed from: S */
    private boolean m11286S(Typeface typeface) {
        C4979a c4979a = this.f9556A;
        if (c4979a != null) {
            c4979a.m19399c();
        }
        if (this.f9613w == typeface) {
            return false;
        }
        this.f9613w = typeface;
        return true;
    }

    /* renamed from: V */
    private void m11287V(float f10) {
        this.f9587c0 = f10;
        C0690v.m3835h0(this.f9582a);
    }

    /* renamed from: Z */
    private boolean m11288Z(Typeface typeface) {
        C4979a c4979a = this.f9616z;
        if (c4979a != null) {
            c4979a.m19399c();
        }
        if (this.f9614x == typeface) {
            return false;
        }
        this.f9614x = typeface;
        return true;
    }

    /* renamed from: a */
    private static int m11289a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    /* renamed from: b */
    private void m11290b(boolean z10) {
        StaticLayout staticLayout;
        float f10 = this.f9565J;
        m11299j(this.f9604n, z10);
        CharSequence charSequence = this.f9558C;
        if (charSequence != null && (staticLayout = this.f9583a0) != null) {
            this.f9591e0 = TextUtils.ellipsize(charSequence, this.f9568M, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f9591e0;
        float f11 = 0.0f;
        float measureText = charSequence2 != null ? this.f9568M.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int m3641b = C0670e.m3641b(this.f9602l, this.f9559D ? 1 : 0);
        int i10 = m3641b & 112;
        if (i10 == 48) {
            this.f9608r = this.f9598i.top;
        } else if (i10 != 80) {
            this.f9608r = this.f9598i.centerY() - ((this.f9568M.descent() - this.f9568M.ascent()) / 2.0f);
        } else {
            this.f9608r = this.f9598i.bottom + this.f9568M.ascent();
        }
        int i11 = m3641b & 8388615;
        if (i11 == 1) {
            this.f9610t = this.f9598i.centerX() - (measureText / 2.0f);
        } else if (i11 != 5) {
            this.f9610t = this.f9598i.left;
        } else {
            this.f9610t = this.f9598i.right - measureText;
        }
        m11299j(this.f9603m, z10);
        float height = this.f9583a0 != null ? r13.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f9558C;
        float measureText2 = charSequence3 != null ? this.f9568M.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f9583a0;
        if (staticLayout2 != null && this.f9593f0 > 1) {
            measureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f9583a0;
        if (staticLayout3 != null) {
            f11 = this.f9593f0 > 1 ? staticLayout3.getLineStart(0) : staticLayout3.getLineLeft(0);
        }
        this.f9589d0 = f11;
        int m3641b2 = C0670e.m3641b(this.f9601k, this.f9559D ? 1 : 0);
        int i12 = m3641b2 & 112;
        if (i12 == 48) {
            this.f9607q = this.f9596h.top;
        } else if (i12 != 80) {
            this.f9607q = this.f9596h.centerY() - (height / 2.0f);
        } else {
            this.f9607q = (this.f9596h.bottom - height) + this.f9568M.descent();
        }
        int i13 = m3641b2 & 8388615;
        if (i13 == 1) {
            this.f9609s = this.f9596h.centerX() - (measureText2 / 2.0f);
        } else if (i13 != 5) {
            this.f9609s = this.f9596h.left;
        } else {
            this.f9609s = this.f9596h.right - measureText2;
        }
        m11300k();
        m11291b0(f10);
    }

    /* renamed from: b0 */
    private void m11291b0(float f10) {
        m11298i(f10);
        boolean z10 = f9554j0 && this.f9564I != 1.0f;
        this.f9561F = z10;
        if (z10) {
            m11303o();
        }
        C0690v.m3835h0(this.f9582a);
    }

    /* renamed from: d */
    private void m11292d() {
        m11296h(this.f9586c);
    }

    /* renamed from: e */
    private float m11293e(float f10) {
        float f11 = this.f9592f;
        if (f10 <= f11) {
            return C3600a.m15418b(1.0f, 0.0f, this.f9590e, f11, f10);
        }
        return C3600a.m15418b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    /* renamed from: f */
    private float m11294f() {
        float f10 = this.f9590e;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    /* renamed from: g */
    private boolean m11295g(CharSequence charSequence) {
        boolean m11281D = m11281D();
        return this.f9560E ? m11282F(charSequence, m11281D) : m11281D;
    }

    /* renamed from: h */
    private void m11296h(float f10) {
        float f11;
        m11279B(f10);
        if (!this.f9588d) {
            this.f9611u = m11283G(this.f9609s, this.f9610t, f10, this.f9570O);
            this.f9612v = m11283G(this.f9607q, this.f9608r, f10, this.f9570O);
            m11291b0(m11283G(this.f9603m, this.f9604n, f10, this.f9571P));
            f11 = f10;
        } else if (f10 < this.f9592f) {
            this.f9611u = this.f9609s;
            this.f9612v = this.f9607q;
            m11291b0(this.f9603m);
            f11 = 0.0f;
        } else {
            this.f9611u = this.f9610t;
            this.f9612v = this.f9608r - Math.max(0, this.f9594g);
            m11291b0(this.f9604n);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C3600a.f15224b;
        m11285O(1.0f - m11283G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        m11287V(m11283G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f9606p != this.f9605o) {
            this.f9568M.setColor(m11289a(m11307w(), m11335u(), f11));
        } else {
            this.f9568M.setColor(m11335u());
        }
        float f12 = this.f9580Y;
        float f13 = this.f9581Z;
        if (f12 != f13) {
            this.f9568M.setLetterSpacing(m11283G(f13, f12, f10, timeInterpolator));
        } else {
            this.f9568M.setLetterSpacing(f12);
        }
        this.f9568M.setShadowLayer(m11283G(this.f9576U, this.f9572Q, f10, null), m11283G(this.f9577V, this.f9573R, f10, null), m11283G(this.f9578W, this.f9574S, f10, null), m11289a(m11306v(this.f9579X), m11306v(this.f9575T), f10));
        if (this.f9588d) {
            this.f9568M.setAlpha((int) (m11293e(f10) * 255.0f));
        }
        C0690v.m3835h0(this.f9582a);
    }

    /* renamed from: h0 */
    private boolean m11297h0() {
        return this.f9593f0 > 1 && (!this.f9559D || this.f9588d) && !this.f9561F;
    }

    /* renamed from: i */
    private void m11298i(float f10) {
        m11299j(f10, false);
    }

    /* renamed from: j */
    private void m11299j(float f10, boolean z10) {
        boolean z11;
        float f11;
        boolean z12;
        if (this.f9557B == null) {
            return;
        }
        float width = this.f9598i.width();
        float width2 = this.f9596h.width();
        if (m11280C(f10, this.f9604n)) {
            f11 = this.f9604n;
            this.f9564I = 1.0f;
            Typeface typeface = this.f9615y;
            Typeface typeface2 = this.f9613w;
            if (typeface != typeface2) {
                this.f9615y = typeface2;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            float f12 = this.f9603m;
            Typeface typeface3 = this.f9615y;
            Typeface typeface4 = this.f9614x;
            if (typeface3 != typeface4) {
                this.f9615y = typeface4;
                z11 = true;
            } else {
                z11 = false;
            }
            if (m11280C(f10, f12)) {
                this.f9564I = 1.0f;
            } else {
                this.f9564I = f10 / this.f9603m;
            }
            float f13 = this.f9604n / this.f9603m;
            width = (!z10 && width2 * f13 > width) ? Math.min(width / f13, width2) : width2;
            f11 = f12;
            z12 = z11;
        }
        if (width > 0.0f) {
            z12 = this.f9565J != f11 || this.f9567L || z12;
            this.f9565J = f11;
            this.f9567L = false;
        }
        if (this.f9558C == null || z12) {
            this.f9568M.setTextSize(this.f9565J);
            this.f9568M.setTypeface(this.f9615y);
            this.f9568M.setLinearText(this.f9564I != 1.0f);
            this.f9559D = m11295g(this.f9557B);
            StaticLayout m11301l = m11301l(m11297h0() ? this.f9593f0 : 1, width, this.f9559D);
            this.f9583a0 = m11301l;
            this.f9558C = m11301l.getText();
        }
    }

    /* renamed from: k */
    private void m11300k() {
        Bitmap bitmap = this.f9562G;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9562G = null;
        }
    }

    /* renamed from: l */
    private StaticLayout m11301l(int i10, float f10, boolean z10) {
        StaticLayout staticLayout;
        try {
            staticLayout = C2484g.m11348c(this.f9557B, this.f9568M, (int) f10).m11351e(TextUtils.TruncateAt.END).m11354h(z10).m11350d(Layout.Alignment.ALIGN_NORMAL).m11353g(false).m11356j(i10).m11355i(this.f9595g0, this.f9597h0).m11352f(this.f9599i0).m11349a();
        } catch (C2484g.a e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayout = null;
        }
        return (StaticLayout) C0654h.m3467f(staticLayout);
    }

    /* renamed from: n */
    private void m11302n(Canvas canvas, float f10, float f11) {
        int alpha = this.f9568M.getAlpha();
        canvas.translate(f10, f11);
        float f12 = alpha;
        this.f9568M.setAlpha((int) (this.f9587c0 * f12));
        this.f9583a0.draw(canvas);
        this.f9568M.setAlpha((int) (this.f9585b0 * f12));
        int lineBaseline = this.f9583a0.getLineBaseline(0);
        CharSequence charSequence = this.f9591e0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.f9568M);
        if (this.f9588d) {
            return;
        }
        String trim = this.f9591e0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f9568M.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f9583a0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.f9568M);
    }

    /* renamed from: o */
    private void m11303o() {
        if (this.f9562G != null || this.f9596h.isEmpty() || TextUtils.isEmpty(this.f9558C)) {
            return;
        }
        m11296h(0.0f);
        int width = this.f9583a0.getWidth();
        int height = this.f9583a0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f9562G = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f9583a0.draw(new Canvas(this.f9562G));
        if (this.f9563H == null) {
            this.f9563H = new Paint(3);
        }
    }

    /* renamed from: s */
    private float m11304s(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (m11325c() / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f9559D ? this.f9598i.left : this.f9598i.right - m11325c() : this.f9559D ? this.f9598i.right - m11325c() : this.f9598i.left;
    }

    /* renamed from: t */
    private float m11305t(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (m11325c() / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f9559D ? rectF.left + m11325c() : this.f9598i.right : this.f9559D ? this.f9598i.right : rectF.left + m11325c();
    }

    /* renamed from: v */
    private int m11306v(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f9566K;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: w */
    private int m11307w() {
        return m11306v(this.f9605o);
    }

    /* renamed from: z */
    private void m11308z(TextPaint textPaint) {
        textPaint.setTextSize(this.f9604n);
        textPaint.setTypeface(this.f9613w);
        textPaint.setLetterSpacing(this.f9580Y);
    }

    /* renamed from: E */
    public final boolean m11309E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f9606p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f9605o) != null && colorStateList.isStateful());
    }

    /* renamed from: H */
    void m11310H() {
        this.f9584b = this.f9598i.width() > 0 && this.f9598i.height() > 0 && this.f9596h.width() > 0 && this.f9596h.height() > 0;
    }

    /* renamed from: I */
    public void m11311I() {
        m11312J(false);
    }

    /* renamed from: J */
    public void m11312J(boolean z10) {
        if ((this.f9582a.getHeight() <= 0 || this.f9582a.getWidth() <= 0) && !z10) {
            return;
        }
        m11290b(z10);
        m11292d();
    }

    /* renamed from: L */
    public void m11313L(int i10, int i11, int i12, int i13) {
        if (m11284K(this.f9598i, i10, i11, i12, i13)) {
            return;
        }
        this.f9598i.set(i10, i11, i12, i13);
        this.f9567L = true;
        m11310H();
    }

    /* renamed from: M */
    public void m11314M(Rect rect) {
        m11313L(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: N */
    public void m11315N(int i10) {
        C4982d c4982d = new C4982d(this.f9582a.getContext(), i10);
        ColorStateList colorStateList = c4982d.f19055a;
        if (colorStateList != null) {
            this.f9606p = colorStateList;
        }
        float f10 = c4982d.f19068n;
        if (f10 != 0.0f) {
            this.f9604n = f10;
        }
        ColorStateList colorStateList2 = c4982d.f19058d;
        if (colorStateList2 != null) {
            this.f9575T = colorStateList2;
        }
        this.f9573R = c4982d.f19063i;
        this.f9574S = c4982d.f19064j;
        this.f9572Q = c4982d.f19065k;
        this.f9580Y = c4982d.f19067m;
        C4979a c4979a = this.f9556A;
        if (c4979a != null) {
            c4979a.m19399c();
        }
        this.f9556A = new C4979a(new a(), c4982d.m19417e());
        c4982d.m19420h(this.f9582a.getContext(), this.f9556A);
        m11311I();
    }

    /* renamed from: P */
    public void m11316P(ColorStateList colorStateList) {
        if (this.f9606p != colorStateList) {
            this.f9606p = colorStateList;
            m11311I();
        }
    }

    /* renamed from: Q */
    public void m11317Q(int i10) {
        if (this.f9602l != i10) {
            this.f9602l = i10;
            m11311I();
        }
    }

    /* renamed from: R */
    public void m11318R(Typeface typeface) {
        if (m11286S(typeface)) {
            m11311I();
        }
    }

    /* renamed from: T */
    public void m11319T(int i10, int i11, int i12, int i13) {
        if (m11284K(this.f9596h, i10, i11, i12, i13)) {
            return;
        }
        this.f9596h.set(i10, i11, i12, i13);
        this.f9567L = true;
        m11310H();
    }

    /* renamed from: U */
    public void m11320U(Rect rect) {
        m11319T(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: W */
    public void m11321W(ColorStateList colorStateList) {
        if (this.f9605o != colorStateList) {
            this.f9605o = colorStateList;
            m11311I();
        }
    }

    /* renamed from: X */
    public void m11322X(int i10) {
        if (this.f9601k != i10) {
            this.f9601k = i10;
            m11311I();
        }
    }

    /* renamed from: Y */
    public void m11323Y(float f10) {
        if (this.f9603m != f10) {
            this.f9603m = f10;
            m11311I();
        }
    }

    /* renamed from: a0 */
    public void m11324a0(float f10) {
        float m17787a = C4291a.m17787a(f10, 0.0f, 1.0f);
        if (m17787a != this.f9586c) {
            this.f9586c = m17787a;
            m11292d();
        }
    }

    /* renamed from: c */
    public float m11325c() {
        if (this.f9557B == null) {
            return 0.0f;
        }
        m11308z(this.f9569N);
        TextPaint textPaint = this.f9569N;
        CharSequence charSequence = this.f9557B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c0 */
    public void m11326c0(TimeInterpolator timeInterpolator) {
        this.f9570O = timeInterpolator;
        m11311I();
    }

    /* renamed from: d0 */
    public final boolean m11327d0(int[] iArr) {
        this.f9566K = iArr;
        if (!m11309E()) {
            return false;
        }
        m11311I();
        return true;
    }

    /* renamed from: e0 */
    public void m11328e0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f9557B, charSequence)) {
            this.f9557B = charSequence;
            this.f9558C = null;
            m11300k();
            m11311I();
        }
    }

    /* renamed from: f0 */
    public void m11329f0(TimeInterpolator timeInterpolator) {
        this.f9571P = timeInterpolator;
        m11311I();
    }

    /* renamed from: g0 */
    public void m11330g0(Typeface typeface) {
        boolean m11286S = m11286S(typeface);
        boolean m11288Z = m11288Z(typeface);
        if (m11286S || m11288Z) {
            m11311I();
        }
    }

    /* renamed from: m */
    public void m11331m(Canvas canvas) {
        int save = canvas.save();
        if (this.f9558C == null || !this.f9584b) {
            return;
        }
        float lineStart = (this.f9611u + (this.f9593f0 > 1 ? this.f9583a0.getLineStart(0) : this.f9583a0.getLineLeft(0))) - (this.f9589d0 * 2.0f);
        this.f9568M.setTextSize(this.f9565J);
        float f10 = this.f9611u;
        float f11 = this.f9612v;
        boolean z10 = this.f9561F && this.f9562G != null;
        float f12 = this.f9564I;
        if (f12 != 1.0f && !this.f9588d) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.f9562G, f10, f11, this.f9563H);
            canvas.restoreToCount(save);
            return;
        }
        if (m11297h0() && (!this.f9588d || this.f9586c > this.f9592f)) {
            m11302n(canvas, lineStart, f11);
        } else {
            canvas.translate(f10, f11);
            this.f9583a0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: p */
    public void m11332p(RectF rectF, int i10, int i11) {
        this.f9559D = m11295g(this.f9557B);
        rectF.left = m11304s(i10, i11);
        rectF.top = this.f9598i.top;
        rectF.right = m11305t(rectF, i10, i11);
        rectF.bottom = this.f9598i.top + m11334r();
    }

    /* renamed from: q */
    public ColorStateList m11333q() {
        return this.f9606p;
    }

    /* renamed from: r */
    public float m11334r() {
        m11308z(this.f9569N);
        return -this.f9569N.ascent();
    }

    /* renamed from: u */
    public int m11335u() {
        return m11306v(this.f9606p);
    }

    /* renamed from: x */
    public float m11336x() {
        m11278A(this.f9569N);
        return -this.f9569N.ascent();
    }

    /* renamed from: y */
    public float m11337y() {
        return this.f9586c;
    }
}
