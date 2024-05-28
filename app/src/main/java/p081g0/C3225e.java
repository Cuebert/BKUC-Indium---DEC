package p081g0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: g0.e */
/* loaded from: classes.dex */
class C3225e extends Drawable {

    /* renamed from: a */
    private float f13604a;

    /* renamed from: b */
    private final Paint f13605b;

    /* renamed from: c */
    private final RectF f13606c;

    /* renamed from: d */
    private final Rect f13607d;

    /* renamed from: e */
    private float f13608e;

    /* renamed from: f */
    private boolean f13609f;

    /* renamed from: g */
    private boolean f13610g;

    /* renamed from: h */
    private ColorStateList f13611h;

    /* renamed from: i */
    private PorterDuffColorFilter f13612i;

    /* renamed from: j */
    private ColorStateList f13613j;

    /* renamed from: k */
    private PorterDuff.Mode f13614k;

    /* renamed from: a */
    private PorterDuffColorFilter m14405a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m14406e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f13611h = colorStateList;
        this.f13605b.setColor(colorStateList.getColorForState(getState(), this.f13611h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m14407i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f13606c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f13607d.set(rect);
        if (this.f13609f) {
            this.f13607d.inset((int) Math.ceil(C3226f.m14414a(this.f13608e, this.f13604a, this.f13610g)), (int) Math.ceil(C3226f.m14415b(this.f13608e, this.f13604a, this.f13610g)));
            this.f13606c.set(this.f13607d);
        }
    }

    /* renamed from: b */
    public ColorStateList m14408b() {
        return this.f13611h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m14409c() {
        return this.f13608e;
    }

    /* renamed from: d */
    public float m14410d() {
        return this.f13604a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f13605b;
        if (this.f13612i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f13612i);
            z10 = true;
        }
        RectF rectF = this.f13606c;
        float f10 = this.f13604a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m14411f(ColorStateList colorStateList) {
        m14406e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m14412g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f13608e && this.f13609f == z10 && this.f13610g == z11) {
            return;
        }
        this.f13608e = f10;
        this.f13609f = z10;
        this.f13610g = z11;
        m14407i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f13607d, this.f13604a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m14413h(float f10) {
        if (f10 == this.f13604a) {
            return;
        }
        this.f13604a = f10;
        m14407i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f13613j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f13611h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m14407i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f13611h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f13605b.getColor();
        if (z10) {
            this.f13605b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f13613j;
        if (colorStateList2 == null || (mode = this.f13614k) == null) {
            return z10;
        }
        this.f13612i = m14405a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f13605b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13605b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f13613j = colorStateList;
        this.f13612i = m14405a(colorStateList, this.f13614k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f13614k = mode;
        this.f13612i = m14405a(this.f13613j, mode);
        invalidateSelf();
    }
}
