package p259u3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: u3.q */
/* loaded from: classes.dex */
final class C4857q extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f18729a;

    public C4857q(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f18729a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4857q.class) {
            if (this == obj) {
                return true;
            }
            C4857q c4857q = (C4857q) obj;
            if (this.f18729a == c4857q.f18729a && get() == c4857q.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18729a;
    }
}
