package androidx.camera.core;

/* renamed from: androidx.camera.core.o2 */
/* loaded from: classes.dex */
final class C0456o2 extends AbstractC0418i0 {

    /* renamed from: p */
    private boolean f2040p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0456o2(InterfaceC0443l1 interfaceC0443l1) {
        super(interfaceC0443l1);
        this.f2040p = false;
    }

    @Override // androidx.camera.core.AbstractC0418i0, androidx.camera.core.InterfaceC0443l1, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f2040p) {
            this.f2040p = true;
            super.close();
        }
    }
}
