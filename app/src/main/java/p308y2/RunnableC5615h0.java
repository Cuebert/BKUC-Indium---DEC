package p308y2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: y2.h0 */
/* loaded from: classes.dex */
final class RunnableC5615h0 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ LifecycleCallback f20795n;

    /* renamed from: o */
    final /* synthetic */ String f20796o;

    /* renamed from: p */
    final /* synthetic */ FragmentC5617i0 f20797p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5615h0(FragmentC5617i0 fragmentC5617i0, LifecycleCallback lifecycleCallback, String str) {
        this.f20797p = fragmentC5617i0;
        this.f20795n = lifecycleCallback;
        this.f20796o = str;
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
        FragmentC5617i0 fragmentC5617i0 = this.f20797p;
        i10 = fragmentC5617i0.f20812o;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f20795n;
            bundle = fragmentC5617i0.f20813p;
            if (bundle != null) {
                bundle3 = fragmentC5617i0.f20813p;
                bundle2 = bundle3.getBundle(this.f20796o);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo7434f(bundle2);
        }
        i11 = this.f20797p.f20812o;
        if (i11 >= 2) {
            this.f20795n.mo7438j();
        }
        i12 = this.f20797p.f20812o;
        if (i12 >= 3) {
            this.f20795n.mo7436h();
        }
        i13 = this.f20797p.f20812o;
        if (i13 >= 4) {
            this.f20795n.mo7439k();
        }
        i14 = this.f20797p.f20812o;
        if (i14 >= 5) {
            this.f20795n.m7435g();
        }
    }
}
