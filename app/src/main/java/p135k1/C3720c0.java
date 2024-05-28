package p135k1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: k1.c0 */
/* loaded from: classes.dex */
class C3720c0 extends C3718b0 {

    /* renamed from: i */
    private static boolean f15610i = true;

    @Override // p135k1.C3724e0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo15838g(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo15838g(view, i10);
        } else if (f15610i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f15610i = false;
            }
        }
    }
}
