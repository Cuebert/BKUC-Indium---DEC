package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
abstract class AbstractC2457l<S> extends Fragment {

    /* renamed from: o0 */
    protected final LinkedHashSet<AbstractC2456k<S>> f9422o0 = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X1 */
    public boolean mo11064X1(AbstractC2456k<S> abstractC2456k) {
        return this.f9422o0.add(abstractC2456k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void m11118Y1() {
        this.f9422o0.clear();
    }
}
