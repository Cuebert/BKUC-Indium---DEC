package p001a0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: a0.b */
/* loaded from: classes.dex */
final class C0002b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Image m10b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ImageWriter m11c(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m12d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
