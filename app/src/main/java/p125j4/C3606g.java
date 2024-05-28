package p125j4;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: j4.g */
/* loaded from: classes.dex */
public class C3606g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f15233a = new float[9];

    /* renamed from: b */
    private final float[] f15234b = new float[9];

    /* renamed from: c */
    private final Matrix f15235c = new Matrix();

    /* renamed from: a */
    public Matrix mo11257a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f15233a);
        matrix2.getValues(this.f15234b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f15234b;
            float f11 = fArr[i10];
            float[] fArr2 = this.f15233a;
            fArr[i10] = fArr2[i10] + ((f11 - fArr2[i10]) * f10);
        }
        this.f15235c.setValues(this.f15234b);
        return this.f15235c;
    }
}
