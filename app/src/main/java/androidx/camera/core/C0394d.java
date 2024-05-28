package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.camera.core.impl.utils.C0431k;
import java.util.concurrent.Executor;
import p279w.InterfaceC5034h1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.d */
/* loaded from: classes.dex */
public class C0394d implements InterfaceC5034h1 {

    /* renamed from: a */
    private final ImageReader f1737a;

    /* renamed from: b */
    private final Object f1738b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0394d(ImageReader imageReader) {
        this.f1737a = imageReader;
    }

    /* renamed from: k */
    private boolean m1867k(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m1868l(InterfaceC5034h1.a aVar) {
        aVar.mo1382a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m1869m(Executor executor, final InterfaceC5034h1.a aVar, ImageReader imageReader) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.c
            @Override // java.lang.Runnable
            public final void run() {
                C0394d.this.m1868l(aVar);
            }
        });
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: a */
    public Surface mo1870a() {
        Surface surface;
        synchronized (this.f1738b) {
            surface = this.f1737a.getSurface();
        }
        return surface;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: c */
    public InterfaceC0443l1 mo1871c() {
        Image image;
        synchronized (this.f1738b) {
            try {
                image = this.f1737a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!m1867k(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new C0379a(image);
        }
    }

    @Override // p279w.InterfaceC5034h1
    public void close() {
        synchronized (this.f1738b) {
            this.f1737a.close();
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: d */
    public int mo1872d() {
        int imageFormat;
        synchronized (this.f1738b) {
            imageFormat = this.f1737a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: e */
    public void mo1873e(final InterfaceC5034h1.a aVar, final Executor executor) {
        synchronized (this.f1738b) {
            this.f1737a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    C0394d.this.m1869m(executor, aVar, imageReader);
                }
            }, C0431k.m2118a());
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: f */
    public void mo1874f() {
        synchronized (this.f1738b) {
            this.f1737a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: g */
    public int mo1875g() {
        int width;
        synchronized (this.f1738b) {
            width = this.f1737a.getWidth();
        }
        return width;
    }

    @Override // p279w.InterfaceC5034h1
    public int getHeight() {
        int height;
        synchronized (this.f1738b) {
            height = this.f1737a.getHeight();
        }
        return height;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: h */
    public int mo1876h() {
        int maxImages;
        synchronized (this.f1738b) {
            maxImages = this.f1737a.getMaxImages();
        }
        return maxImages;
    }

    @Override // p279w.InterfaceC5034h1
    /* renamed from: i */
    public InterfaceC0443l1 mo1877i() {
        Image image;
        synchronized (this.f1738b) {
            try {
                image = this.f1737a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!m1867k(e10)) {
                    throw e10;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new C0379a(image);
        }
    }
}
