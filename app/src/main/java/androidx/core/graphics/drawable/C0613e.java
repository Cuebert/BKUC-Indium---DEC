package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0613e extends C0612d {

    /* renamed from: u */
    private static Method f3352u;

    public C0613e(Drawable drawable) {
        super(drawable);
        m3286g();
    }

    /* renamed from: g */
    private void m3286g() {
        if (f3352u == null) {
            try {
                f3352u = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.C0612d
    /* renamed from: c */
    protected boolean mo3285c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3351s;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f3351s.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f3351s.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f3351s;
        if (drawable != null && (method = f3352u) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f3351s.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f3351s.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.core.graphics.drawable.C0612d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0612d, android.graphics.drawable.Drawable
    public void setTint(int i10) {
        if (mo3285c()) {
            super.setTint(i10);
        } else {
            this.f3351s.setTint(i10);
        }
    }

    @Override // androidx.core.graphics.drawable.C0612d, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (mo3285c()) {
            super.setTintList(colorStateList);
        } else {
            this.f3351s.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0612d, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo3285c()) {
            super.setTintMode(mode);
        } else {
            this.f3351s.setTintMode(mode);
        }
    }

    public C0613e(C0614f c0614f, Resources resources) {
        super(c0614f, resources);
        m3286g();
    }
}
