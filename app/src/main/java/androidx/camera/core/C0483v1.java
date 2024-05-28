package androidx.camera.core;

import android.graphics.Matrix;
import android.media.ImageReader;
import p279w.C5043j2;

/* renamed from: androidx.camera.core.v1 */
/* loaded from: classes.dex */
class C0483v1 extends C0394d {

    /* renamed from: c */
    private volatile C5043j2 f2123c;

    /* renamed from: d */
    private volatile Long f2124d;

    /* renamed from: e */
    private volatile Integer f2125e;

    /* renamed from: f */
    private volatile Matrix f2126f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0483v1(ImageReader imageReader) {
        super(imageReader);
        this.f2123c = null;
        this.f2124d = null;
        this.f2125e = null;
        this.f2126f = null;
    }

    /* renamed from: n */
    private InterfaceC0443l1 m2246n(InterfaceC0443l1 interfaceC0443l1) {
        InterfaceC0419i1 mo1857q = interfaceC0443l1.mo1857q();
        return new C0448m2(interfaceC0443l1, AbstractC0455o1.m2173f(this.f2123c != null ? this.f2123c : mo1857q.mo2028a(), this.f2124d != null ? this.f2124d.longValue() : mo1857q.mo2029c(), this.f2125e != null ? this.f2125e.intValue() : mo1857q.mo2030d(), this.f2126f != null ? this.f2126f : mo1857q.mo2031e()));
    }

    @Override // androidx.camera.core.C0394d, p279w.InterfaceC5034h1
    /* renamed from: c */
    public InterfaceC0443l1 mo1871c() {
        return m2246n(super.mo1877i());
    }

    @Override // androidx.camera.core.C0394d, p279w.InterfaceC5034h1
    /* renamed from: i */
    public InterfaceC0443l1 mo1877i() {
        return m2246n(super.mo1877i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2247o(C5043j2 c5043j2) {
        this.f2123c = c5043j2;
    }
}
