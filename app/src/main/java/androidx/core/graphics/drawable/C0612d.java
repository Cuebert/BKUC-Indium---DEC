package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.d */
/* loaded from: classes.dex */
public class C0612d extends Drawable implements Drawable.Callback, InterfaceC0611c, InterfaceC0610b {

    /* renamed from: t */
    static final PorterDuff.Mode f3345t = PorterDuff.Mode.SRC_IN;

    /* renamed from: n */
    private int f3346n;

    /* renamed from: o */
    private PorterDuff.Mode f3347o;

    /* renamed from: p */
    private boolean f3348p;

    /* renamed from: q */
    C0614f f3349q;

    /* renamed from: r */
    private boolean f3350r;

    /* renamed from: s */
    Drawable f3351s;

    public C0612d(C0614f c0614f, Resources resources) {
        this.f3349q = c0614f;
        m3283e(resources);
    }

    /* renamed from: d */
    private C0614f m3282d() {
        return new C0614f(this.f3349q);
    }

    /* renamed from: e */
    private void m3283e(Resources resources) {
        Drawable.ConstantState constantState;
        C0614f c0614f = this.f3349q;
        if (c0614f == null || (constantState = c0614f.f3354b) == null) {
            return;
        }
        mo3280a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m3284f(int[] iArr) {
        if (!mo3285c()) {
            return false;
        }
        C0614f c0614f = this.f3349q;
        ColorStateList colorStateList = c0614f.f3355c;
        PorterDuff.Mode mode = c0614f.f3356d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f3348p || colorForState != this.f3346n || mode != this.f3347o) {
                setColorFilter(colorForState, mode);
                this.f3346n = colorForState;
                this.f3347o = mode;
                this.f3348p = true;
                return true;
            }
        } else {
            this.f3348p = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0611c
    /* renamed from: a */
    public final void mo3280a(Drawable drawable) {
        Drawable drawable2 = this.f3351s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3351s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0614f c0614f = this.f3349q;
            if (c0614f != null) {
                c0614f.f3354b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.InterfaceC0611c
    /* renamed from: b */
    public final Drawable mo3281b() {
        return this.f3351s;
    }

    /* renamed from: c */
    protected boolean mo3285c() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f3351s.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0614f c0614f = this.f3349q;
        return changingConfigurations | (c0614f != null ? c0614f.getChangingConfigurations() : 0) | this.f3351s.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0614f c0614f = this.f3349q;
        if (c0614f == null || !c0614f.m3287a()) {
            return null;
        }
        this.f3349q.f3353a = getChangingConfigurations();
        return this.f3349q;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f3351s.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3351s.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3351s.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C0609a.m3251f(this.f3351s);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f3351s.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f3351s.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3351s.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f3351s.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f3351s.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f3351s.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C0609a.m3253h(this.f3351s);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0614f c0614f;
        ColorStateList colorStateList = (!mo3285c() || (c0614f = this.f3349q) == null) ? null : c0614f.f3355c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3351s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f3351s.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f3350r && super.mutate() == this) {
            this.f3349q = m3282d();
            Drawable drawable = this.f3351s;
            if (drawable != null) {
                drawable.mutate();
            }
            C0614f c0614f = this.f3349q;
            if (c0614f != null) {
                Drawable drawable2 = this.f3351s;
                c0614f.f3354b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3350r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3351s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return C0609a.m3258m(this.f3351s, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f3351s.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3351s.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        C0609a.m3255j(this.f3351s, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f3351s.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3351s.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f3351s.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f3351s.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m3284f(iArr) || this.f3351s.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3349q.f3355c = colorStateList;
        m3284f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3349q.f3356d = mode;
        m3284f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f3351s.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C0612d(Drawable drawable) {
        this.f3349q = m3282d();
        mo3280a(drawable);
    }
}
