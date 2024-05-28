package p135k1;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: k1.d0 */
/* loaded from: classes.dex */
class C3722d0 extends C3720c0 {
    @Override // p135k1.C3748z, p135k1.C3724e0
    /* renamed from: c */
    public float mo15843c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p135k1.C3718b0, p135k1.C3724e0
    /* renamed from: e */
    public void mo15812e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p135k1.C3748z, p135k1.C3724e0
    /* renamed from: f */
    public void mo15844f(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p135k1.C3720c0, p135k1.C3724e0
    /* renamed from: g */
    public void mo15838g(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p135k1.C3716a0, p135k1.C3724e0
    /* renamed from: h */
    public void mo15809h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p135k1.C3716a0, p135k1.C3724e0
    /* renamed from: i */
    public void mo15810i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
