package p087g6;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p087g6.C3284a;

/* renamed from: g6.s */
/* loaded from: classes.dex */
final class C3308s extends PhantomReference<Object> implements C3284a.a {

    /* renamed from: a */
    private final Set<C3308s> f13777a;

    /* renamed from: b */
    private final Runnable f13778b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3308s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C3307r c3307r) {
        super(obj, referenceQueue);
        this.f13777a = set;
        this.f13778b = runnable;
    }

    @Override // p087g6.C3284a.a
    /* renamed from: a */
    public final void mo14546a() {
        if (this.f13777a.remove(this)) {
            clear();
            this.f13778b.run();
        }
    }
}
