package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.l1 */
/* loaded from: classes.dex */
public interface InterfaceC0443l1 extends AutoCloseable {

    /* renamed from: androidx.camera.core.l1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        int mo1858a();

        /* renamed from: b */
        int mo1859b();

        /* renamed from: d */
        ByteBuffer mo1860d();
    }

    /* renamed from: J */
    Image mo1852J();

    @Override // java.lang.AutoCloseable
    void close();

    /* renamed from: g */
    int mo1853g();

    int getHeight();

    /* renamed from: h0 */
    int mo1854h0();

    @SuppressLint({"ArrayReturn"})
    /* renamed from: k */
    a[] mo1855k();

    /* renamed from: o */
    void mo1856o(Rect rect);

    /* renamed from: q */
    InterfaceC0419i1 mo1857q();
}
