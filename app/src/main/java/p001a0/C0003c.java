package p001a0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.core.util.C0654h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a0.c */
/* loaded from: classes.dex */
final class C0003c {

    /* renamed from: a */
    private static Method f2a;

    static {
        try {
            Class cls = Integer.TYPE;
            f2a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e10) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ImageWriter m13a(Surface surface, int i10, int i11) {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) C0654h.m3467f(f2a.invoke(null, surface, Integer.valueOf(i10), Integer.valueOf(i11)));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                th = e10;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
