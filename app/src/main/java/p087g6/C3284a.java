package p087g6;

import androidx.annotation.RecentlyNonNull;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g6.a */
/* loaded from: classes.dex */
public class C3284a {

    /* renamed from: a */
    private final ReferenceQueue<Object> f13735a = new ReferenceQueue<>();

    /* renamed from: b */
    private final Set<C3308s> f13736b = Collections.synchronizedSet(new HashSet());

    /* renamed from: g6.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo14546a();
    }

    private C3284a() {
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3284a m14544a() {
        C3284a c3284a = new C3284a();
        c3284a.m14545b(c3284a, new Runnable() { // from class: g6.q
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue<Object> referenceQueue = c3284a.f13735a;
        final Set<C3308s> set = c3284a.f13736b;
        Thread thread = new Thread(new Runnable() { // from class: g6.p
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        ((C3308s) referenceQueue2.remove()).mo14546a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c3284a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public a m14545b(@RecentlyNonNull Object obj, @RecentlyNonNull Runnable runnable) {
        C3308s c3308s = new C3308s(obj, this.f13735a, this.f13736b, runnable, null);
        this.f13736b.add(c3308s);
        return c3308s;
    }
}
