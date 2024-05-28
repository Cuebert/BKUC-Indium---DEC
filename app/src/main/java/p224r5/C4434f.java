package p224r5;

import android.os.Bundle;

/* renamed from: r5.f */
/* loaded from: classes.dex */
final class C4434f extends AbstractC4437i<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4434f(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224r5.AbstractC4437i
    /* renamed from: a */
    public final void mo18234a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m18238b(null);
        } else {
            m18239c(new C4436h(4, "Invalid response to one way request"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224r5.AbstractC4437i
    /* renamed from: d */
    public final boolean mo18235d() {
        return true;
    }
}
