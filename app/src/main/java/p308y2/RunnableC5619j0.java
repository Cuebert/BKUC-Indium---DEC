package p308y2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: y2.j0 */
/* loaded from: classes.dex */
final class RunnableC5619j0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ LifecycleCallback f20814n;

    /* renamed from: o */
    final /* synthetic */ String f20815o;

    /* renamed from: p */
    final /* synthetic */ C5621k0 f20816p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5619j0(C5621k0 c5621k0, LifecycleCallback lifecycleCallback, String str) {
        this.f20816p = c5621k0;
        this.f20814n = lifecycleCallback;
        this.f20815o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C5621k0 c5621k0 = this.f20816p;
        i10 = c5621k0.f20819p0;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f20814n;
            bundle = c5621k0.f20820q0;
            if (bundle != null) {
                bundle3 = c5621k0.f20820q0;
                bundle2 = bundle3.getBundle(this.f20815o);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo7434f(bundle2);
        }
        i11 = this.f20816p.f20819p0;
        if (i11 >= 2) {
            this.f20814n.mo7438j();
        }
        i12 = this.f20816p.f20819p0;
        if (i12 >= 3) {
            this.f20814n.mo7436h();
        }
        i13 = this.f20816p.f20819p0;
        if (i13 >= 4) {
            this.f20814n.mo7439k();
        }
        i14 = this.f20816p.f20819p0;
        if (i14 >= 5) {
            this.f20814n.m7435g();
        }
    }
}
