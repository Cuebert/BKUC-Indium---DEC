package p135k1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: k1.t */
/* loaded from: classes.dex */
class C3742t implements InterfaceC3743u {

    /* renamed from: a */
    private final ViewGroupOverlay f15725a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3742t(ViewGroup viewGroup) {
        this.f15725a = viewGroup.getOverlay();
    }

    @Override // p135k1.InterfaceC3743u
    /* renamed from: a */
    public void mo15934a(View view) {
        this.f15725a.add(view);
    }

    @Override // p135k1.InterfaceC3746x
    /* renamed from: b */
    public void mo15935b(Drawable drawable) {
        this.f15725a.add(drawable);
    }

    @Override // p135k1.InterfaceC3743u
    /* renamed from: c */
    public void mo15936c(View view) {
        this.f15725a.remove(view);
    }

    @Override // p135k1.InterfaceC3746x
    /* renamed from: d */
    public void mo15937d(Drawable drawable) {
        this.f15725a.remove(drawable);
    }
}
