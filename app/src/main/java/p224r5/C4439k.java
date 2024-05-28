package p224r5;

import android.os.Bundle;

/* renamed from: r5.k */
/* loaded from: classes.dex */
final class C4439k extends AbstractC4437i<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4439k(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224r5.AbstractC4437i
    /* renamed from: a */
    public final void mo18234a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m18238b(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224r5.AbstractC4437i
    /* renamed from: d */
    public final boolean mo18235d() {
        return false;
    }
}
