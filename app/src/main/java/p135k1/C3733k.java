package p135k1;

import android.view.ViewGroup;

/* renamed from: k1.k */
/* loaded from: classes.dex */
public class C3733k {

    /* renamed from: a */
    private ViewGroup f15655a;

    /* renamed from: b */
    private Runnable f15656b;

    /* renamed from: b */
    public static C3733k m15862b(ViewGroup viewGroup) {
        return (C3733k) viewGroup.getTag(C3731i.f15653b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m15863c(ViewGroup viewGroup, C3733k c3733k) {
        viewGroup.setTag(C3731i.f15653b, c3733k);
    }

    /* renamed from: a */
    public void m15864a() {
        Runnable runnable;
        if (m15862b(this.f15655a) != this || (runnable = this.f15656b) == null) {
            return;
        }
        runnable.run();
    }
}
