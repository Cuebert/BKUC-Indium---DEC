package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: androidx.camera.core.m2 */
/* loaded from: classes.dex */
final class C0448m2 extends AbstractC0418i0 {

    /* renamed from: p */
    private final InterfaceC0419i1 f2006p;

    /* renamed from: q */
    private Rect f2007q;

    /* renamed from: r */
    private final int f2008r;

    /* renamed from: s */
    private final int f2009s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0448m2(InterfaceC0443l1 interfaceC0443l1, InterfaceC0419i1 interfaceC0419i1) {
        this(interfaceC0443l1, null, interfaceC0419i1);
    }

    @Override // androidx.camera.core.AbstractC0418i0, androidx.camera.core.InterfaceC0443l1
    /* renamed from: g */
    public synchronized int mo1853g() {
        return this.f2008r;
    }

    @Override // androidx.camera.core.AbstractC0418i0, androidx.camera.core.InterfaceC0443l1
    public synchronized int getHeight() {
        return this.f2009s;
    }

    @Override // androidx.camera.core.AbstractC0418i0, androidx.camera.core.InterfaceC0443l1
    /* renamed from: o */
    public synchronized void mo1856o(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, mo1853g(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        this.f2007q = rect;
    }

    @Override // androidx.camera.core.AbstractC0418i0, androidx.camera.core.InterfaceC0443l1
    /* renamed from: q */
    public InterfaceC0419i1 mo1857q() {
        return this.f2006p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0448m2(InterfaceC0443l1 interfaceC0443l1, Size size, InterfaceC0419i1 interfaceC0419i1) {
        super(interfaceC0443l1);
        if (size == null) {
            this.f2008r = super.mo1853g();
            this.f2009s = super.getHeight();
        } else {
            this.f2008r = size.getWidth();
            this.f2009s = size.getHeight();
        }
        this.f2006p = interfaceC0419i1;
    }
}
