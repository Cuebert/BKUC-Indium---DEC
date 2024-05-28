package androidx.camera.camera2.internal;

import p218r.C4414z;

/* renamed from: androidx.camera.camera2.internal.x1 */
/* loaded from: classes.dex */
class C0368x1 {

    /* renamed from: a */
    private final Object f1655a = new Object();

    /* renamed from: b */
    private final C4414z f1656b;

    /* renamed from: c */
    private int f1657c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0368x1(C4414z c4414z, int i10) {
        this.f1656b = c4414z;
        this.f1657c = i10;
    }

    /* renamed from: a */
    public int m1803a() {
        int i10;
        synchronized (this.f1655a) {
            i10 = this.f1657c;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1804b(int i10) {
        synchronized (this.f1655a) {
            this.f1657c = i10;
        }
    }
}
