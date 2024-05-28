package p073f6;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p248t5.InterfaceC4733b;

/* renamed from: f6.c */
/* loaded from: classes.dex */
public class C3160c {

    /* renamed from: a */
    private final Map<Class<? extends AbstractC3159b>, InterfaceC4733b<Object>> f13194a = new HashMap();

    /* renamed from: f6.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final Class<? extends AbstractC3159b> f13195a;

        /* renamed from: b */
        private final InterfaceC4733b<Object> f13196b;

        /* JADX WARN: Multi-variable type inference failed */
        public <RemoteT extends AbstractC3159b> a(@RecentlyNonNull Class<RemoteT> cls, @RecentlyNonNull InterfaceC4733b<Object> interfaceC4733b) {
            this.f13195a = cls;
            this.f13196b = interfaceC4733b;
        }

        /* renamed from: a */
        final InterfaceC4733b<Object> m13856a() {
            return this.f13196b;
        }

        /* renamed from: b */
        final Class<? extends AbstractC3159b> m13857b() {
            return this.f13195a;
        }
    }

    public C3160c(@RecentlyNonNull Set<a> set) {
        for (a aVar : set) {
            this.f13194a.put(aVar.m13857b(), aVar.m13856a());
        }
    }
}
