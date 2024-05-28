package p145kb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C3840e;

/* renamed from: kb.p */
/* loaded from: classes.dex */
public class C3814p {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f15875b = AtomicIntegerFieldUpdater.newUpdater(C3814p.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f15876a;

    public C3814p(Throwable th, boolean z10) {
        this.f15876a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m16217a() {
        return f15875b.get(this) != 0;
    }

    /* renamed from: b */
    public final boolean m16218b() {
        return f15875b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C3834z.m16239a(this) + '[' + this.f15876a + ']';
    }

    public /* synthetic */ C3814p(Throwable th, boolean z10, int i10, C3840e c3840e) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
