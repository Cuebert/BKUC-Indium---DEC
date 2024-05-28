package p135k1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: k1.a0 */
/* loaded from: classes.dex */
class C3716a0 extends C3748z {

    /* renamed from: f */
    private static boolean f15570f = true;

    /* renamed from: g */
    private static boolean f15571g = true;

    @Override // p135k1.C3724e0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo15809h(View view, Matrix matrix) {
        if (f15570f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f15570f = false;
            }
        }
    }

    @Override // p135k1.C3724e0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo15810i(View view, Matrix matrix) {
        if (f15571g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f15571g = false;
            }
        }
    }
}
