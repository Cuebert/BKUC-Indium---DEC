package p135k1;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: k1.b0 */
/* loaded from: classes.dex */
class C3718b0 extends C3716a0 {

    /* renamed from: h */
    private static boolean f15572h = true;

    @Override // p135k1.C3724e0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo15812e(View view, int i10, int i11, int i12, int i13) {
        if (f15572h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f15572h = false;
            }
        }
    }
}
