package p135k1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: k1.v */
/* loaded from: classes.dex */
class C3744v {

    /* renamed from: a */
    private static boolean f15726a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC3743u m15938a(ViewGroup viewGroup) {
        return new C3742t(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m15939b(ViewGroup viewGroup, boolean z10) {
        if (f15726a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f15726a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m15940c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            m15939b(viewGroup, z10);
        }
    }
}
