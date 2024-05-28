package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
class C0264q extends C0261n {

    /* renamed from: b */
    private final WeakReference<Context> f1204b;

    public C0264q(Context context, Resources resources) {
        super(resources);
        this.f1204b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0261n, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i10);
        Context context = this.f1204b.get();
        if (drawable != null && context != null) {
            ResourceManagerInternal.get().tintDrawableUsingColorFilter(context, i10, drawable);
        }
        return drawable;
    }
}
