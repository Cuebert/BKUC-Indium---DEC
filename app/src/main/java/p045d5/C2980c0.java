package p045d5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d5.c0 */
/* loaded from: classes.dex */
public final class C2980c0 extends AbstractRunnableC3006y {

    /* renamed from: o */
    final /* synthetic */ C2981d f12666o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2980c0(C2981d c2981d) {
        this.f12666o = c2981d;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: b */
    public final void mo6274b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        C3005x c3005x;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        C3005x c3005x2;
        obj = this.f12666o.f12673f;
        synchronized (obj) {
            atomicInteger = this.f12666o.f12679l;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f12666o.f12679l;
                if (atomicInteger2.decrementAndGet() > 0) {
                    c3005x2 = this.f12666o.f12669b;
                    c3005x2.m13478b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            C2981d c2981d = this.f12666o;
            iInterface = c2981d.f12681n;
            if (iInterface != null) {
                c3005x = c2981d.f12669b;
                c3005x.m13478b("Unbind from service.", new Object[0]);
                C2981d c2981d2 = this.f12666o;
                context = c2981d2.f12668a;
                serviceConnection = c2981d2.f12680m;
                context.unbindService(serviceConnection);
                this.f12666o.f12674g = false;
                this.f12666o.f12681n = null;
                this.f12666o.f12680m = null;
            }
            this.f12666o.m13451x();
        }
    }
}
