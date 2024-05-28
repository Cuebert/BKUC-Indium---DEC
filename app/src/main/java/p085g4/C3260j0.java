package p085g4;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g4.j0 */
/* loaded from: classes.dex */
public final class C3260j0 {

    /* renamed from: a */
    private final Object f13702a = new Object();

    /* renamed from: b */
    private Queue f13703b;

    /* renamed from: c */
    private boolean f13704c;

    /* renamed from: a */
    public final void m14492a(InterfaceC3258i0 interfaceC3258i0) {
        synchronized (this.f13702a) {
            if (this.f13703b == null) {
                this.f13703b = new ArrayDeque();
            }
            this.f13703b.add(interfaceC3258i0);
        }
    }

    /* renamed from: b */
    public final void m14493b(AbstractC3263l abstractC3263l) {
        InterfaceC3258i0 interfaceC3258i0;
        synchronized (this.f13702a) {
            if (this.f13703b != null && !this.f13704c) {
                this.f13704c = true;
                while (true) {
                    synchronized (this.f13702a) {
                        interfaceC3258i0 = (InterfaceC3258i0) this.f13703b.poll();
                        if (interfaceC3258i0 == null) {
                            this.f13704c = false;
                            return;
                        }
                    }
                    interfaceC3258i0.mo14483b(abstractC3263l);
                }
            }
        }
    }
}
