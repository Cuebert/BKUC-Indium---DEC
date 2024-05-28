package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes.dex */
public final class C0614f extends Drawable.ConstantState {

    /* renamed from: a */
    int f3353a;

    /* renamed from: b */
    Drawable.ConstantState f3354b;

    /* renamed from: c */
    ColorStateList f3355c;

    /* renamed from: d */
    PorterDuff.Mode f3356d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0614f(C0614f c0614f) {
        this.f3355c = null;
        this.f3356d = C0612d.f3345t;
        if (c0614f != null) {
            this.f3353a = c0614f.f3353a;
            this.f3354b = c0614f.f3354b;
            this.f3355c = c0614f.f3355c;
            this.f3356d = c0614f.f3356d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m3287a() {
        return this.f3354b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f3353a;
        Drawable.ConstantState constantState = this.f3354b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C0613e(this, resources);
    }
}
