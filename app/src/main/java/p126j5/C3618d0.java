package p126j5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p200p5.InterfaceC4271c;
import p248t5.InterfaceC4733b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j5.d0 */
/* loaded from: classes.dex */
public final class C3618d0 extends AbstractC3611a {

    /* renamed from: a */
    private final Set<Class<?>> f15265a;

    /* renamed from: b */
    private final Set<Class<?>> f15266b;

    /* renamed from: c */
    private final Set<Class<?>> f15267c;

    /* renamed from: d */
    private final Set<Class<?>> f15268d;

    /* renamed from: e */
    private final Set<Class<?>> f15269e;

    /* renamed from: f */
    private final Set<Class<?>> f15270f;

    /* renamed from: g */
    private final InterfaceC3619e f15271g;

    /* renamed from: j5.d0$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC4271c {

        /* renamed from: a */
        private final Set<Class<?>> f15272a;

        /* renamed from: b */
        private final InterfaceC4271c f15273b;

        public a(Set<Class<?>> set, InterfaceC4271c interfaceC4271c) {
            this.f15272a = set;
            this.f15273b = interfaceC4271c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3618d0(C3617d<?> c3617d, InterfaceC3619e interfaceC3619e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3631q c3631q : c3617d.m15469e()) {
            if (c3631q.m15534d()) {
                if (c3631q.m15536f()) {
                    hashSet4.add(c3631q.m15532b());
                } else {
                    hashSet.add(c3631q.m15532b());
                }
            } else if (c3631q.m15533c()) {
                hashSet3.add(c3631q.m15532b());
            } else if (c3631q.m15536f()) {
                hashSet5.add(c3631q.m15532b());
            } else {
                hashSet2.add(c3631q.m15532b());
            }
        }
        if (!c3617d.m15472h().isEmpty()) {
            hashSet.add(InterfaceC4271c.class);
        }
        this.f15265a = Collections.unmodifiableSet(hashSet);
        this.f15266b = Collections.unmodifiableSet(hashSet2);
        this.f15267c = Collections.unmodifiableSet(hashSet3);
        this.f15268d = Collections.unmodifiableSet(hashSet4);
        this.f15269e = Collections.unmodifiableSet(hashSet5);
        this.f15270f = c3617d.m15472h();
        this.f15271g = interfaceC3619e;
    }

    @Override // p126j5.AbstractC3611a, p126j5.InterfaceC3619e
    /* renamed from: a */
    public <T> T mo15448a(Class<T> cls) {
        if (this.f15265a.contains(cls)) {
            T t10 = (T) this.f15271g.mo15448a(cls);
            return !cls.equals(InterfaceC4271c.class) ? t10 : (T) new a(this.f15270f, (InterfaceC4271c) t10);
        }
        throw new C3633s(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p126j5.AbstractC3611a, p126j5.InterfaceC3619e
    /* renamed from: b */
    public <T> Set<T> mo15449b(Class<T> cls) {
        if (this.f15268d.contains(cls)) {
            return this.f15271g.mo15449b(cls);
        }
        throw new C3633s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p126j5.InterfaceC3619e
    /* renamed from: c */
    public <T> InterfaceC4733b<T> mo15485c(Class<T> cls) {
        if (this.f15266b.contains(cls)) {
            return this.f15271g.mo15485c(cls);
        }
        throw new C3633s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p126j5.InterfaceC3619e
    /* renamed from: d */
    public <T> InterfaceC4733b<Set<T>> mo15486d(Class<T> cls) {
        if (this.f15269e.contains(cls)) {
            return this.f15271g.mo15486d(cls);
        }
        throw new C3633s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
