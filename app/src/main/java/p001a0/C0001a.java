package p001a0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public final class C0001a {
    /* renamed from: a */
    public static void m4a(ImageWriter imageWriter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            C0002b.m9a(imageWriter);
            return;
        }
        throw new RuntimeException("Unable to call close() on API " + i10 + ". Version 23 or higher required.");
    }

    /* renamed from: b */
    public static Image m5b(ImageWriter imageWriter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return C0002b.m10b(imageWriter);
        }
        throw new RuntimeException("Unable to call dequeueInputImage() on API " + i10 + ". Version 23 or higher required.");
    }

    /* renamed from: c */
    public static ImageWriter m6c(Surface surface, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return C0002b.m11c(surface, i10);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int) on API " + i11 + ". Version 23 or higher required.");
    }

    /* renamed from: d */
    public static ImageWriter m7d(Surface surface, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            return C0004d.m14a(surface, i10, i11);
        }
        if (i12 >= 26) {
            return C0003c.m13a(surface, i10, i11);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i12 + ". Version 26 or higher required.");
    }

    /* renamed from: e */
    public static void m8e(ImageWriter imageWriter, Image image) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            C0002b.m12d(imageWriter, image);
            return;
        }
        throw new RuntimeException("Unable to call queueInputImage() on API " + i10 + ". Version 23 or higher required.");
    }
}
