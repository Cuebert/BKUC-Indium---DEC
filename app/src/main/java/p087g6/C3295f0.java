package p087g6;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import p321z2.C5984j;

/* renamed from: g6.f0 */
/* loaded from: classes.dex */
final class C3295f0 implements Closeable {

    /* renamed from: n */
    final /* synthetic */ C3304o f13750n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3295f0(C3304o c3304o, C3291d0 c3291d0) {
        AtomicReference atomicReference;
        this.f13750n = c3304o;
        atomicReference = c3304o.f13773d;
        C5984j.m21289m(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f13750n.f13773d;
        atomicReference.set(null);
        this.f13750n.m14581d();
    }
}
