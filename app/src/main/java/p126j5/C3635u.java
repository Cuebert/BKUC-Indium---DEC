package p126j5;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p200p5.C4269a;
import p200p5.InterfaceC4270b;
import p200p5.InterfaceC4271c;
import p200p5.InterfaceC4272d;

/* renamed from: j5.u */
/* loaded from: classes.dex */
class C3635u implements InterfaceC4272d, InterfaceC4271c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC4270b<Object>, Executor>> f15307a = new HashMap();

    /* renamed from: b */
    private Queue<C4269a<?>> f15308b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f15309c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3635u(Executor executor) {
        this.f15309c = executor;
    }

    /* renamed from: e */
    private synchronized Set<Map.Entry<InterfaceC4270b<Object>, Executor>> m15538e(C4269a<?> c4269a) {
        ConcurrentHashMap<InterfaceC4270b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f15307a.get(c4269a.m17685b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m15539f(Map.Entry entry, C4269a c4269a) {
        ((InterfaceC4270b) entry.getKey()).mo11920a(c4269a);
    }

    @Override // p200p5.InterfaceC4272d
    /* renamed from: a */
    public <T> void mo15540a(Class<T> cls, InterfaceC4270b<? super T> interfaceC4270b) {
        mo15541b(cls, this.f15309c, interfaceC4270b);
    }

    @Override // p200p5.InterfaceC4272d
    /* renamed from: b */
    public synchronized <T> void mo15541b(Class<T> cls, Executor executor, InterfaceC4270b<? super T> interfaceC4270b) {
        C3616c0.m15457b(cls);
        C3616c0.m15457b(interfaceC4270b);
        C3616c0.m15457b(executor);
        if (!this.f15307a.containsKey(cls)) {
            this.f15307a.put(cls, new ConcurrentHashMap<>());
        }
        this.f15307a.get(cls).put(interfaceC4270b, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m15542d() {
        Queue<C4269a<?>> queue;
        synchronized (this) {
            queue = this.f15308b;
            if (queue != null) {
                this.f15308b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<C4269a<?>> it = queue.iterator();
            while (it.hasNext()) {
                m15543g(it.next());
            }
        }
    }

    /* renamed from: g */
    public void m15543g(final C4269a<?> c4269a) {
        C3616c0.m15457b(c4269a);
        synchronized (this) {
            Queue<C4269a<?>> queue = this.f15308b;
            if (queue != null) {
                queue.add(c4269a);
                return;
            }
            for (final Map.Entry<InterfaceC4270b<Object>, Executor> entry : m15538e(c4269a)) {
                entry.getValue().execute(new Runnable() { // from class: j5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3635u.m15539f(entry, c4269a);
                    }
                });
            }
        }
    }
}
