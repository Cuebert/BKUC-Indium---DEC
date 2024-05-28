package p138k4;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: k4.a */
/* loaded from: classes.dex */
public class C3757a {
    /* renamed from: a */
    public static int m15967a(Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
        }
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
    }
}
