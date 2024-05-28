package p045d5;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* renamed from: d5.f0 */
/* loaded from: classes.dex */
final class C2986f0 extends AbstractRunnableC3006y {

    /* renamed from: o */
    final /* synthetic */ IBinder f12682o;

    /* renamed from: p */
    final /* synthetic */ ServiceConnectionC2979c f12683p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2986f0(ServiceConnectionC2979c serviceConnectionC2979c, IBinder iBinder) {
        this.f12683p = serviceConnectionC2979c;
        this.f12682o = iBinder;
    }

    @Override // p045d5.AbstractRunnableC3006y
    /* renamed from: b */
    public final void mo6274b() {
        InterfaceC2984e0 interfaceC2984e0;
        List list;
        List list2;
        C2981d c2981d = this.f12683p.f12665a;
        interfaceC2984e0 = c2981d.f12676i;
        c2981d.f12681n = (IInterface) interfaceC2984e0.mo6272a(this.f12682o);
        C2981d.m13448r(this.f12683p.f12665a);
        this.f12683p.f12665a.f12674g = false;
        list = this.f12683p.f12665a.f12671d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f12683p.f12665a.f12671d;
        list2.clear();
    }
}
