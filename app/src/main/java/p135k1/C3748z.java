package p135k1;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: k1.z */
/* loaded from: classes.dex */
class C3748z extends C3724e0 {

    /* renamed from: e */
    private static boolean f15731e = true;

    @Override // p135k1.C3724e0
    /* renamed from: a */
    public void mo15848a(View view) {
    }

    @Override // p135k1.C3724e0
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo15843c(View view) {
        if (f15731e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f15731e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p135k1.C3724e0
    /* renamed from: d */
    public void mo15849d(View view) {
    }

    @Override // p135k1.C3724e0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo15844f(View view, float f10) {
        if (f15731e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f15731e = false;
            }
        }
        view.setAlpha(f10);
    }
}
