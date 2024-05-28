package p140k6;

import android.media.Image;

/* renamed from: k6.b */
/* loaded from: classes.dex */
final class C3760b {

    /* renamed from: a */
    private final Image f15770a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3760b(Image image) {
        this.f15770a = image;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Image m15978a() {
        return this.f15770a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Image.Plane[] m15979b() {
        return this.f15770a.getPlanes();
    }
}
