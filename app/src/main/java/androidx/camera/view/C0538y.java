package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: androidx.camera.view.y */
/* loaded from: classes.dex */
public class C0538y {

    /* renamed from: a */
    public static final RectF f2375a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Matrix m2483a(Rect rect) {
        return m2484b(new RectF(rect));
    }

    /* renamed from: b */
    private static Matrix m2484b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f2375a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: c */
    public static Matrix m2485c(RectF rectF, RectF rectF2, int i10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f2375a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        matrix.postConcat(m2484b(rectF2));
        return matrix;
    }

    /* renamed from: d */
    public static boolean m2486d(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    /* renamed from: e */
    public static boolean m2487e(Size size, boolean z10, Size size2, boolean z11) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z10) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z11) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    /* renamed from: f */
    public static int m2488f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i10);
    }
}
