package p135k1;

import android.view.View;
import android.view.WindowId;

/* renamed from: k1.g0 */
/* loaded from: classes.dex */
class C3728g0 implements InterfaceC3730h0 {

    /* renamed from: a */
    private final WindowId f15651a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3728g0(View view) {
        this.f15651a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3728g0) && ((C3728g0) obj).f15651a.equals(this.f15651a);
    }

    public int hashCode() {
        return this.f15651a.hashCode();
    }
}
