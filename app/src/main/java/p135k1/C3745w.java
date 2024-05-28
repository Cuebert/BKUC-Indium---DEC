package p135k1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: k1.w */
/* loaded from: classes.dex */
class C3745w implements InterfaceC3746x {

    /* renamed from: a */
    private final ViewOverlay f15727a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3745w(View view) {
        this.f15727a = view.getOverlay();
    }

    @Override // p135k1.InterfaceC3746x
    /* renamed from: b */
    public void mo15935b(Drawable drawable) {
        this.f15727a.add(drawable);
    }

    @Override // p135k1.InterfaceC3746x
    /* renamed from: d */
    public void mo15937d(Drawable drawable) {
        this.f15727a.remove(drawable);
    }
}
