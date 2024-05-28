package p318z;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.AbstractC0496y2;
import androidx.core.util.C0654h;
import java.util.HashMap;
import java.util.Map;
import p040d0.C2958a;

/* renamed from: z.n */
/* loaded from: classes.dex */
public class C5946n {
    /* renamed from: a */
    public static Map<AbstractC0496y2, Rect> m21135a(Rect rect, boolean z10, Rational rational, int i10, int i11, int i12, Map<AbstractC0496y2, Size> map) {
        C0654h.m3463b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<AbstractC0496y2, Size> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF m21141g = m21141g(rectF2, C2958a.m13378c(i10, rational), i11, z10, i12, i10);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, m21141g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((AbstractC0496y2) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: b */
    private static RectF m21136b(boolean z10, int i10, RectF rectF, RectF rectF2) {
        boolean z11 = i10 == 0 && !z10;
        boolean z12 = i10 == 90 && z10;
        if (z11 || z12) {
            return rectF2;
        }
        boolean z13 = i10 == 0 && z10;
        boolean z14 = i10 == 270 && !z10;
        if (z13 || z14) {
            return m21137c(rectF2, rectF.centerX());
        }
        boolean z15 = i10 == 90 && !z10;
        boolean z16 = i10 == 180 && z10;
        if (z15 || z16) {
            return m21138d(rectF2, rectF.centerY());
        }
        boolean z17 = i10 == 180 && !z10;
        boolean z18 = i10 == 270 && z10;
        if (!z17 && !z18) {
            throw new IllegalArgumentException("Invalid argument: mirrored " + z10 + " rotation " + i10);
        }
        return m21137c(m21138d(rectF2, rectF.centerY()), rectF.centerX());
    }

    /* renamed from: c */
    private static RectF m21137c(RectF rectF, float f10) {
        return new RectF(m21139e(rectF.right, f10), rectF.top, m21139e(rectF.left, f10), rectF.bottom);
    }

    /* renamed from: d */
    private static RectF m21138d(RectF rectF, float f10) {
        return new RectF(rectF.left, m21140f(rectF.bottom, f10), rectF.right, m21140f(rectF.top, f10));
    }

    /* renamed from: e */
    private static float m21139e(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    /* renamed from: f */
    private static float m21140f(float f10, float f11) {
        return (f11 + f11) - f10;
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: g */
    public static RectF m21141g(RectF rectF, Rational rational, int i10, boolean z10, int i11, int i12) {
        if (i10 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i10 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i10 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else if (i10 == 2) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        } else {
            throw new IllegalStateException("Unexpected scale type: " + i10);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m21136b(m21142h(z10, i11), i12, rectF, rectF3);
    }

    /* renamed from: h */
    private static boolean m21142h(boolean z10, int i10) {
        return z10 ^ (i10 == 1);
    }
}
