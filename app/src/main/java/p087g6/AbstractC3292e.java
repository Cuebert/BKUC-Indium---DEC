package p087g6;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g6.e */
/* loaded from: classes.dex */
public abstract class AbstractC3292e<K, V> {

    /* renamed from: a */
    private final Map<K, V> f13747a = new HashMap();

    @RecentlyNonNull
    /* renamed from: a */
    protected abstract V mo14550a(@RecentlyNonNull K k10);

    @RecentlyNonNull
    /* renamed from: b */
    public V m14551b(@RecentlyNonNull K k10) {
        synchronized (this.f13747a) {
            if (this.f13747a.containsKey(k10)) {
                return this.f13747a.get(k10);
            }
            V mo14550a = mo14550a(k10);
            this.f13747a.put(k10, mo14550a);
            return mo14550a;
        }
    }
}
