package androidx.camera.lifecycle;

import androidx.camera.core.AbstractC0496y2;
import androidx.camera.core.C0403e3;
import androidx.core.util.C0654h;
import androidx.lifecycle.AbstractC0839f;
import androidx.lifecycle.InterfaceC0844k;
import androidx.lifecycle.InterfaceC0845l;
import androidx.lifecycle.InterfaceC0853t;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p318z.C5937e;

/* loaded from: classes.dex */
final class LifecycleCameraRepository {

    /* renamed from: a */
    private final Object f2240a = new Object();

    /* renamed from: b */
    private final Map<AbstractC0501a, LifecycleCamera> f2241b = new HashMap();

    /* renamed from: c */
    private final Map<LifecycleCameraRepositoryObserver, Set<AbstractC0501a>> f2242c = new HashMap();

    /* renamed from: d */
    private final ArrayDeque<InterfaceC0845l> f2243d = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements InterfaceC0844k {

        /* renamed from: n */
        private final LifecycleCameraRepository f2244n;

        /* renamed from: o */
        private final InterfaceC0845l f2245o;

        LifecycleCameraRepositoryObserver(InterfaceC0845l interfaceC0845l, LifecycleCameraRepository lifecycleCameraRepository) {
            this.f2245o = interfaceC0845l;
            this.f2244n = lifecycleCameraRepository;
        }

        /* renamed from: a */
        InterfaceC0845l m2377a() {
            return this.f2245o;
        }

        @InterfaceC0853t(AbstractC0839f.b.ON_DESTROY)
        public void onDestroy(InterfaceC0845l interfaceC0845l) {
            this.f2244n.m2376k(interfaceC0845l);
        }

        @InterfaceC0853t(AbstractC0839f.b.ON_START)
        public void onStart(InterfaceC0845l interfaceC0845l) {
            this.f2244n.m2374h(interfaceC0845l);
        }

        @InterfaceC0853t(AbstractC0839f.b.ON_STOP)
        public void onStop(InterfaceC0845l interfaceC0845l) {
            this.f2244n.m2375i(interfaceC0845l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0501a {
        /* renamed from: a */
        static AbstractC0501a m2378a(InterfaceC0845l interfaceC0845l, C5937e.b bVar) {
            return new C0502a(interfaceC0845l, bVar);
        }

        /* renamed from: b */
        public abstract C5937e.b mo2379b();

        /* renamed from: c */
        public abstract InterfaceC0845l mo2380c();
    }

    /* renamed from: d */
    private LifecycleCameraRepositoryObserver m2365d(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2242c.keySet()) {
                if (interfaceC0845l.equals(lifecycleCameraRepositoryObserver.m2377a())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    private boolean m2366f(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            LifecycleCameraRepositoryObserver m2365d = m2365d(interfaceC0845l);
            if (m2365d == null) {
                return false;
            }
            Iterator<AbstractC0501a> it = this.f2242c.get(m2365d).iterator();
            while (it.hasNext()) {
                if (!((LifecycleCamera) C0654h.m3467f(this.f2241b.get(it.next()))).m2361n().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: g */
    private void m2367g(LifecycleCamera lifecycleCamera) {
        Set<AbstractC0501a> hashSet;
        synchronized (this.f2240a) {
            InterfaceC0845l m2360m = lifecycleCamera.m2360m();
            AbstractC0501a m2378a = AbstractC0501a.m2378a(m2360m, lifecycleCamera.m2359j().m21129v());
            LifecycleCameraRepositoryObserver m2365d = m2365d(m2360m);
            if (m2365d != null) {
                hashSet = this.f2242c.get(m2365d);
            } else {
                hashSet = new HashSet<>();
            }
            hashSet.add(m2378a);
            this.f2241b.put(m2378a, lifecycleCamera);
            if (m2365d == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepositoryObserver(m2360m, this);
                this.f2242c.put(lifecycleCameraRepositoryObserver, hashSet);
                m2360m.mo583f().mo4889a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: j */
    private void m2368j(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            LifecycleCameraRepositoryObserver m2365d = m2365d(interfaceC0845l);
            if (m2365d == null) {
                return;
            }
            Iterator<AbstractC0501a> it = this.f2242c.get(m2365d).iterator();
            while (it.hasNext()) {
                ((LifecycleCamera) C0654h.m3467f(this.f2241b.get(it.next()))).m2363p();
            }
        }
    }

    /* renamed from: l */
    private void m2369l(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            Iterator<AbstractC0501a> it = this.f2242c.get(m2365d(interfaceC0845l)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.f2241b.get(it.next());
                if (!((LifecycleCamera) C0654h.m3467f(lifecycleCamera)).m2361n().isEmpty()) {
                    lifecycleCamera.m2364q();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2370a(LifecycleCamera lifecycleCamera, C0403e3 c0403e3, Collection<AbstractC0496y2> collection) {
        synchronized (this.f2240a) {
            C0654h.m3462a(!collection.isEmpty());
            InterfaceC0845l m2360m = lifecycleCamera.m2360m();
            Iterator<AbstractC0501a> it = this.f2242c.get(m2365d(m2360m)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) C0654h.m3467f(this.f2241b.get(it.next()));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.m2361n().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.m2359j().m21122H(c0403e3);
                lifecycleCamera.m2358i(collection);
                if (m2360m.mo583f().mo4890b().m4895b(AbstractC0839f.c.STARTED)) {
                    m2374h(m2360m);
                }
            } catch (C5937e.a e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public LifecycleCamera m2371b(InterfaceC0845l interfaceC0845l, C5937e c5937e) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2240a) {
            C0654h.m3463b(this.f2241b.get(AbstractC0501a.m2378a(interfaceC0845l, c5937e.m21129v())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (interfaceC0845l.mo583f().mo4890b() != AbstractC0839f.c.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(interfaceC0845l, c5937e);
                if (c5937e.m21130x().isEmpty()) {
                    lifecycleCamera.m2363p();
                }
                m2367g(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public LifecycleCamera m2372c(InterfaceC0845l interfaceC0845l, C5937e.b bVar) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.f2240a) {
            lifecycleCamera = this.f2241b.get(AbstractC0501a.m2378a(interfaceC0845l, bVar));
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Collection<LifecycleCamera> m2373e() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.f2240a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f2241b.values());
        }
        return unmodifiableCollection;
    }

    /* renamed from: h */
    void m2374h(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            if (m2366f(interfaceC0845l)) {
                if (this.f2243d.isEmpty()) {
                    this.f2243d.push(interfaceC0845l);
                } else {
                    InterfaceC0845l peek = this.f2243d.peek();
                    if (!interfaceC0845l.equals(peek)) {
                        m2368j(peek);
                        this.f2243d.remove(interfaceC0845l);
                        this.f2243d.push(interfaceC0845l);
                    }
                }
                m2369l(interfaceC0845l);
            }
        }
    }

    /* renamed from: i */
    void m2375i(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            this.f2243d.remove(interfaceC0845l);
            m2368j(interfaceC0845l);
            if (!this.f2243d.isEmpty()) {
                m2369l(this.f2243d.peek());
            }
        }
    }

    /* renamed from: k */
    void m2376k(InterfaceC0845l interfaceC0845l) {
        synchronized (this.f2240a) {
            LifecycleCameraRepositoryObserver m2365d = m2365d(interfaceC0845l);
            if (m2365d == null) {
                return;
            }
            m2375i(interfaceC0845l);
            Iterator<AbstractC0501a> it = this.f2242c.get(m2365d).iterator();
            while (it.hasNext()) {
                this.f2241b.remove(it.next());
            }
            this.f2242c.remove(m2365d);
            m2365d.m2377a().mo583f().mo4891c(m2365d);
        }
    }
}
