package p027c1;

import android.view.animation.Interpolator;

/* renamed from: c1.d */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC1122d implements Interpolator {

    /* renamed from: a */
    private final float[] f5447a;

    /* renamed from: b */
    private final float f5448b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC1122d(float[] fArr) {
        this.f5447a = fArr;
        this.f5448b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f5447a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f5448b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f5447a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
