package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC0443l1;
import java.nio.ByteBuffer;
import p279w.C5043j2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.a */
/* loaded from: classes.dex */
public final class C0379a implements InterfaceC0443l1 {

    /* renamed from: n */
    private final Image f1713n;

    /* renamed from: o */
    private final a[] f1714o;

    /* renamed from: p */
    private final InterfaceC0419i1 f1715p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0443l1.a {

        /* renamed from: a */
        private final Image.Plane f1716a;

        a(Image.Plane plane) {
            this.f1716a = plane;
        }

        @Override // androidx.camera.core.InterfaceC0443l1.a
        /* renamed from: a */
        public synchronized int mo1858a() {
            return this.f1716a.getRowStride();
        }

        @Override // androidx.camera.core.InterfaceC0443l1.a
        /* renamed from: b */
        public synchronized int mo1859b() {
            return this.f1716a.getPixelStride();
        }

        @Override // androidx.camera.core.InterfaceC0443l1.a
        /* renamed from: d */
        public synchronized ByteBuffer mo1860d() {
            return this.f1716a.getBuffer();
        }
    }

    public C0379a(Image image) {
        this.f1713n = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f1714o = new a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f1714o[i10] = new a(planes[i10]);
            }
        } else {
            this.f1714o = new a[0];
        }
        this.f1715p = AbstractC0455o1.m2173f(C5043j2.m19576a(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: J */
    public synchronized Image mo1852J() {
        return this.f1713n;
    }

    @Override // androidx.camera.core.InterfaceC0443l1, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1713n.close();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: g */
    public synchronized int mo1853g() {
        return this.f1713n.getWidth();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    public synchronized int getHeight() {
        return this.f1713n.getHeight();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: h0 */
    public synchronized int mo1854h0() {
        return this.f1713n.getFormat();
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: k */
    public synchronized InterfaceC0443l1.a[] mo1855k() {
        return this.f1714o;
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: o */
    public synchronized void mo1856o(Rect rect) {
        this.f1713n.setCropRect(rect);
    }

    @Override // androidx.camera.core.InterfaceC0443l1
    /* renamed from: q */
    public InterfaceC0419i1 mo1857q() {
        return this.f1715p;
    }
}
