package p272v4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0596h;
import p111i4.C3530l;

/* renamed from: v4.d */
/* loaded from: classes.dex */
public class C4982d {

    /* renamed from: a */
    public final ColorStateList f19055a;

    /* renamed from: b */
    public final ColorStateList f19056b;

    /* renamed from: c */
    public final ColorStateList f19057c;

    /* renamed from: d */
    public final ColorStateList f19058d;

    /* renamed from: e */
    public final String f19059e;

    /* renamed from: f */
    public final int f19060f;

    /* renamed from: g */
    public final int f19061g;

    /* renamed from: h */
    public final boolean f19062h;

    /* renamed from: i */
    public final float f19063i;

    /* renamed from: j */
    public final float f19064j;

    /* renamed from: k */
    public final float f19065k;

    /* renamed from: l */
    public final boolean f19066l;

    /* renamed from: m */
    public final float f19067m;

    /* renamed from: n */
    public float f19068n;

    /* renamed from: o */
    private final int f19069o;

    /* renamed from: p */
    private boolean f19070p = false;

    /* renamed from: q */
    private Typeface f19071q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.d$a */
    /* loaded from: classes.dex */
    public class a extends C0596h.e {

        /* renamed from: a */
        final /* synthetic */ AbstractC4984f f19072a;

        a(AbstractC4984f abstractC4984f) {
            this.f19072a = abstractC4984f;
        }

        @Override // androidx.core.content.res.C0596h.e
        /* renamed from: h */
        public void m3145f(int i10) {
            C4982d.this.f19070p = true;
            this.f19072a.mo10834a(i10);
        }

        @Override // androidx.core.content.res.C0596h.e
        /* renamed from: i */
        public void m3146g(Typeface typeface) {
            C4982d c4982d = C4982d.this;
            c4982d.f19071q = Typeface.create(typeface, c4982d.f19060f);
            C4982d.this.f19070p = true;
            this.f19072a.mo10835b(C4982d.this.f19071q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.d$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC4984f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f19074a;

        /* renamed from: b */
        final /* synthetic */ AbstractC4984f f19075b;

        b(TextPaint textPaint, AbstractC4984f abstractC4984f) {
            this.f19074a = textPaint;
            this.f19075b = abstractC4984f;
        }

        @Override // p272v4.AbstractC4984f
        /* renamed from: a */
        public void mo10834a(int i10) {
            this.f19075b.mo10834a(i10);
        }

        @Override // p272v4.AbstractC4984f
        /* renamed from: b */
        public void mo10835b(Typeface typeface, boolean z10) {
            C4982d.this.m19423l(this.f19074a, typeface);
            this.f19075b.mo10835b(typeface, z10);
        }
    }

    public C4982d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, C3530l.f14868U4);
        this.f19068n = obtainStyledAttributes.getDimension(C3530l.f14875V4, 0.0f);
        this.f19055a = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14896Y4);
        this.f19056b = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14903Z4);
        this.f19057c = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14911a5);
        this.f19060f = obtainStyledAttributes.getInt(C3530l.f14889X4, 0);
        this.f19061g = obtainStyledAttributes.getInt(C3530l.f14882W4, 1);
        int m19408e = C4981c.m19408e(obtainStyledAttributes, C3530l.f14959g5, C3530l.f14951f5);
        this.f19069o = obtainStyledAttributes.getResourceId(m19408e, 0);
        this.f19059e = obtainStyledAttributes.getString(m19408e);
        this.f19062h = obtainStyledAttributes.getBoolean(C3530l.f14967h5, false);
        this.f19058d = C4981c.m19404a(context, obtainStyledAttributes, C3530l.f14919b5);
        this.f19063i = obtainStyledAttributes.getFloat(C3530l.f14927c5, 0.0f);
        this.f19064j = obtainStyledAttributes.getFloat(C3530l.f14935d5, 0.0f);
        this.f19065k = obtainStyledAttributes.getFloat(C3530l.f14943e5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, C3530l.f14917b3);
        int i11 = C3530l.f14925c3;
        this.f19066l = obtainStyledAttributes2.hasValue(i11);
        this.f19067m = obtainStyledAttributes2.getFloat(i11, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m19415d() {
        String str;
        if (this.f19071q == null && (str = this.f19059e) != null) {
            this.f19071q = Typeface.create(str, this.f19060f);
        }
        if (this.f19071q == null) {
            int i10 = this.f19061g;
            if (i10 == 1) {
                this.f19071q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f19071q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f19071q = Typeface.DEFAULT;
            } else {
                this.f19071q = Typeface.MONOSPACE;
            }
            this.f19071q = Typeface.create(this.f19071q, this.f19060f);
        }
    }

    /* renamed from: i */
    private boolean m19416i(Context context) {
        if (C4983e.m19424a()) {
            return true;
        }
        int i10 = this.f19069o;
        return (i10 != 0 ? C0596h.m3127c(context, i10) : null) != null;
    }

    /* renamed from: e */
    public Typeface m19417e() {
        m19415d();
        return this.f19071q;
    }

    /* renamed from: f */
    public Typeface m19418f(Context context) {
        if (this.f19070p) {
            return this.f19071q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m3130f = C0596h.m3130f(context, this.f19069o);
                this.f19071q = m3130f;
                if (m3130f != null) {
                    this.f19071q = Typeface.create(m3130f, this.f19060f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f19059e, e10);
            }
        }
        m19415d();
        this.f19070p = true;
        return this.f19071q;
    }

    /* renamed from: g */
    public void m19419g(Context context, TextPaint textPaint, AbstractC4984f abstractC4984f) {
        m19423l(textPaint, m19417e());
        m19420h(context, new b(textPaint, abstractC4984f));
    }

    /* renamed from: h */
    public void m19420h(Context context, AbstractC4984f abstractC4984f) {
        if (m19416i(context)) {
            m19418f(context);
        } else {
            m19415d();
        }
        int i10 = this.f19069o;
        if (i10 == 0) {
            this.f19070p = true;
        }
        if (this.f19070p) {
            abstractC4984f.mo10835b(this.f19071q, true);
            return;
        }
        try {
            C0596h.m3132h(context, i10, new a(abstractC4984f), null);
        } catch (Resources.NotFoundException unused) {
            this.f19070p = true;
            abstractC4984f.mo10834a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f19059e, e10);
            this.f19070p = true;
            abstractC4984f.mo10834a(-3);
        }
    }

    /* renamed from: j */
    public void m19421j(Context context, TextPaint textPaint, AbstractC4984f abstractC4984f) {
        m19422k(context, textPaint, abstractC4984f);
        ColorStateList colorStateList = this.f19055a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f19065k;
        float f11 = this.f19063i;
        float f12 = this.f19064j;
        ColorStateList colorStateList2 = this.f19058d;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void m19422k(Context context, TextPaint textPaint, AbstractC4984f abstractC4984f) {
        if (m19416i(context)) {
            m19423l(textPaint, m19418f(context));
        } else {
            m19419g(context, textPaint, abstractC4984f);
        }
    }

    /* renamed from: l */
    public void m19423l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f19060f;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f19068n);
        if (this.f19066l) {
            textPaint.setLetterSpacing(this.f19067m);
        }
    }
}
