package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.AbstractC0418i0;
import java.nio.ByteBuffer;
import java.util.Locale;
import p001a0.C0001a;
import p279w.InterfaceC5034h1;

/* loaded from: classes.dex */
final class ImageProcessingUtil {

    /* renamed from: a */
    private static int f1708a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.ImageProcessingUtil$a */
    /* loaded from: classes.dex */
    public enum EnumC0378a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: c */
    public static boolean m1842c(InterfaceC0443l1 interfaceC0443l1) {
        if (!m1847h(interfaceC0443l1)) {
            C0463q1.m2204c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (m1843d(interfaceC0443l1) != EnumC0378a.ERROR_CONVERSION) {
            return true;
        }
        C0463q1.m2204c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    /* renamed from: d */
    private static EnumC0378a m1843d(InterfaceC0443l1 interfaceC0443l1) {
        int mo1853g = interfaceC0443l1.mo1853g();
        int height = interfaceC0443l1.getHeight();
        int mo1858a = interfaceC0443l1.mo1855k()[0].mo1858a();
        int mo1858a2 = interfaceC0443l1.mo1855k()[1].mo1858a();
        int mo1858a3 = interfaceC0443l1.mo1855k()[2].mo1858a();
        int mo1859b = interfaceC0443l1.mo1855k()[0].mo1859b();
        int mo1859b2 = interfaceC0443l1.mo1855k()[1].mo1859b();
        if (nativeShiftPixel(interfaceC0443l1.mo1855k()[0].mo1860d(), mo1858a, interfaceC0443l1.mo1855k()[1].mo1860d(), mo1858a2, interfaceC0443l1.mo1855k()[2].mo1860d(), mo1858a3, mo1859b, mo1859b2, mo1853g, height, mo1859b, mo1859b2, mo1859b2) != 0) {
            return EnumC0378a.ERROR_CONVERSION;
        }
        return EnumC0378a.SUCCESS;
    }

    /* renamed from: e */
    public static InterfaceC0443l1 m1844e(final InterfaceC0443l1 interfaceC0443l1, InterfaceC5034h1 interfaceC5034h1, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!m1847h(interfaceC0443l1)) {
            C0463q1.m2204c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!m1846g(i10)) {
            C0463q1.m2204c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (m1845f(interfaceC0443l1, interfaceC5034h1.mo1870a(), byteBuffer, i10, z10) == EnumC0378a.ERROR_CONVERSION) {
            C0463q1.m2204c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            C0463q1.m2202a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f1708a)));
            f1708a++;
        }
        final InterfaceC0443l1 mo1871c = interfaceC5034h1.mo1871c();
        if (mo1871c == null) {
            C0463q1.m2204c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        C0456o2 c0456o2 = new C0456o2(mo1871c);
        c0456o2.m2035b(new AbstractC0418i0.a() { // from class: androidx.camera.core.k1
            @Override // androidx.camera.core.AbstractC0418i0.a
            /* renamed from: b */
            public final void mo1997b(InterfaceC0443l1 interfaceC0443l12) {
                ImageProcessingUtil.m1848i(InterfaceC0443l1.this, interfaceC0443l1, interfaceC0443l12);
            }
        });
        return c0456o2;
    }

    /* renamed from: f */
    private static EnumC0378a m1845f(InterfaceC0443l1 interfaceC0443l1, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int mo1853g = interfaceC0443l1.mo1853g();
        int height = interfaceC0443l1.getHeight();
        int mo1858a = interfaceC0443l1.mo1855k()[0].mo1858a();
        int mo1858a2 = interfaceC0443l1.mo1855k()[1].mo1858a();
        int mo1858a3 = interfaceC0443l1.mo1855k()[2].mo1858a();
        int mo1859b = interfaceC0443l1.mo1855k()[0].mo1859b();
        int mo1859b2 = interfaceC0443l1.mo1855k()[1].mo1859b();
        if (nativeConvertAndroid420ToABGR(interfaceC0443l1.mo1855k()[0].mo1860d(), mo1858a, interfaceC0443l1.mo1855k()[1].mo1860d(), mo1858a2, interfaceC0443l1.mo1855k()[2].mo1860d(), mo1858a3, mo1859b, mo1859b2, surface, byteBuffer, mo1853g, height, z10 ? mo1859b : 0, z10 ? mo1859b2 : 0, z10 ? mo1859b2 : 0, i10) != 0) {
            return EnumC0378a.ERROR_CONVERSION;
        }
        return EnumC0378a.SUCCESS;
    }

    /* renamed from: g */
    private static boolean m1846g(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    /* renamed from: h */
    private static boolean m1847h(InterfaceC0443l1 interfaceC0443l1) {
        return interfaceC0443l1.mo1854h0() == 35 && interfaceC0443l1.mo1855k().length == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m1848i(InterfaceC0443l1 interfaceC0443l1, InterfaceC0443l1 interfaceC0443l12, InterfaceC0443l1 interfaceC0443l13) {
        if (interfaceC0443l1 == null || interfaceC0443l12 == null) {
            return;
        }
        interfaceC0443l12.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m1849j(InterfaceC0443l1 interfaceC0443l1, InterfaceC0443l1 interfaceC0443l12, InterfaceC0443l1 interfaceC0443l13) {
        if (interfaceC0443l1 == null || interfaceC0443l12 == null) {
            return;
        }
        interfaceC0443l12.close();
    }

    /* renamed from: k */
    public static InterfaceC0443l1 m1850k(final InterfaceC0443l1 interfaceC0443l1, InterfaceC5034h1 interfaceC5034h1, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (!m1847h(interfaceC0443l1)) {
            C0463q1.m2204c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!m1846g(i10)) {
            C0463q1.m2204c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        EnumC0378a enumC0378a = EnumC0378a.ERROR_CONVERSION;
        if (((Build.VERSION.SDK_INT < 23 || i10 <= 0) ? enumC0378a : m1851l(interfaceC0443l1, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10)) == enumC0378a) {
            C0463q1.m2204c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final InterfaceC0443l1 mo1871c = interfaceC5034h1.mo1871c();
        if (mo1871c == null) {
            C0463q1.m2204c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        C0456o2 c0456o2 = new C0456o2(mo1871c);
        c0456o2.m2035b(new AbstractC0418i0.a() { // from class: androidx.camera.core.j1
            @Override // androidx.camera.core.AbstractC0418i0.a
            /* renamed from: b */
            public final void mo1997b(InterfaceC0443l1 interfaceC0443l12) {
                ImageProcessingUtil.m1849j(InterfaceC0443l1.this, interfaceC0443l1, interfaceC0443l12);
            }
        });
        return c0456o2;
    }

    /* renamed from: l */
    private static EnumC0378a m1851l(InterfaceC0443l1 interfaceC0443l1, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int mo1853g = interfaceC0443l1.mo1853g();
        int height = interfaceC0443l1.getHeight();
        int mo1858a = interfaceC0443l1.mo1855k()[0].mo1858a();
        int mo1858a2 = interfaceC0443l1.mo1855k()[1].mo1858a();
        int mo1858a3 = interfaceC0443l1.mo1855k()[2].mo1858a();
        int mo1859b = interfaceC0443l1.mo1855k()[1].mo1859b();
        Image m5b = C0001a.m5b(imageWriter);
        if (m5b == null) {
            return EnumC0378a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(interfaceC0443l1.mo1855k()[0].mo1860d(), mo1858a, interfaceC0443l1.mo1855k()[1].mo1860d(), mo1858a2, interfaceC0443l1.mo1855k()[2].mo1860d(), mo1858a3, mo1859b, m5b.getPlanes()[0].getBuffer(), m5b.getPlanes()[0].getRowStride(), m5b.getPlanes()[0].getPixelStride(), m5b.getPlanes()[1].getBuffer(), m5b.getPlanes()[1].getRowStride(), m5b.getPlanes()[1].getPixelStride(), m5b.getPlanes()[2].getBuffer(), m5b.getPlanes()[2].getRowStride(), m5b.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, mo1853g, height, i10) != 0) {
            return EnumC0378a.ERROR_CONVERSION;
        }
        C0001a.m8e(imageWriter, m5b);
        return EnumC0378a.SUCCESS;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);
}
