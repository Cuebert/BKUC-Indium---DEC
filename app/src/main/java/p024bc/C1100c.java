package p024bc;

import android.os.Looper;
import android.util.Log;
import cc.InterfaceC1166b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: bc.c */
/* loaded from: classes.dex */
public class C1100c {

    /* renamed from: q */
    public static String f5364q = "EventBus";

    /* renamed from: r */
    static volatile C1100c f5365r;

    /* renamed from: s */
    private static final C1101d f5366s = new C1101d();

    /* renamed from: t */
    private static final Map<Class<?>, List<Class<?>>> f5367t = new HashMap();

    /* renamed from: a */
    private final Map<Class<?>, CopyOnWriteArrayList<C1111n>> f5368a;

    /* renamed from: b */
    private final Map<Object, List<Class<?>>> f5369b;

    /* renamed from: c */
    private final Map<Class<?>, Object> f5370c;

    /* renamed from: d */
    private final ThreadLocal<c> f5371d;

    /* renamed from: e */
    private final HandlerC1103f f5372e;

    /* renamed from: f */
    private final RunnableC1099b f5373f;

    /* renamed from: g */
    private final RunnableC1098a f5374g;

    /* renamed from: h */
    private final C1110m f5375h;

    /* renamed from: i */
    private final ExecutorService f5376i;

    /* renamed from: j */
    private final boolean f5377j;

    /* renamed from: k */
    private final boolean f5378k;

    /* renamed from: l */
    private final boolean f5379l;

    /* renamed from: m */
    private final boolean f5380m;

    /* renamed from: n */
    private final boolean f5381n;

    /* renamed from: o */
    private final boolean f5382o;

    /* renamed from: p */
    private final int f5383p;

    /* renamed from: bc.c$a */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<c> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.c$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5385a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f5385a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5385a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5385a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5385a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bc.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final List<Object> f5386a = new ArrayList();

        /* renamed from: b */
        boolean f5387b;

        /* renamed from: c */
        boolean f5388c;

        /* renamed from: d */
        C1111n f5389d;

        /* renamed from: e */
        Object f5390e;

        /* renamed from: f */
        boolean f5391f;

        c() {
        }
    }

    public C1100c() {
        this(f5366s);
    }

    /* renamed from: a */
    static void m6455a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m6455a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    public static C1101d m6456b() {
        return new C1101d();
    }

    /* renamed from: c */
    private void m6457c(C1111n c1111n, Object obj) {
        if (obj != null) {
            m6463m(c1111n, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    /* renamed from: d */
    public static C1100c m6458d() {
        if (f5365r == null) {
            synchronized (C1100c.class) {
                if (f5365r == null) {
                    f5365r = new C1100c();
                }
            }
        }
        return f5365r;
    }

    /* renamed from: f */
    private void m6459f(C1111n c1111n, Object obj, Throwable th) {
        if (obj instanceof C1108k) {
            if (this.f5378k) {
                Log.e(f5364q, "SubscriberExceptionEvent subscriber " + c1111n.f5438a.getClass() + " threw an exception", th);
                C1108k c1108k = (C1108k) obj;
                Log.e(f5364q, "Initial event " + c1108k.f5417c + " caused exception in " + c1108k.f5418d, c1108k.f5416b);
                return;
            }
            return;
        }
        if (!this.f5377j) {
            if (this.f5378k) {
                Log.e(f5364q, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + c1111n.f5438a.getClass(), th);
            }
            if (this.f5380m) {
                m6469j(new C1108k(this, th, obj, c1111n.f5438a));
                return;
            }
            return;
        }
        throw new C1102e("Invoking subscriber failed", th);
    }

    /* renamed from: i */
    private static List<Class<?>> m6460i(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f5367t;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m6455a(list, cls2.getInterfaces());
                }
                f5367t.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: k */
    private void m6461k(Object obj, c cVar) throws Error {
        boolean m6462l;
        Class<?> cls = obj.getClass();
        if (this.f5382o) {
            List<Class<?>> m6460i = m6460i(cls);
            int size = m6460i.size();
            m6462l = false;
            for (int i10 = 0; i10 < size; i10++) {
                m6462l |= m6462l(obj, cVar, m6460i.get(i10));
            }
        } else {
            m6462l = m6462l(obj, cVar, cls);
        }
        if (m6462l) {
            return;
        }
        if (this.f5379l) {
            Log.d(f5364q, "No subscribers registered for event " + cls);
        }
        if (!this.f5381n || cls == C1104g.class || cls == C1108k.class) {
            return;
        }
        m6469j(new C1104g(this, obj));
    }

    /* renamed from: l */
    private boolean m6462l(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList<C1111n> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f5368a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<C1111n> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1111n next = it.next();
            cVar.f5390e = obj;
            cVar.f5389d = next;
            try {
                m6463m(next, obj, cVar.f5388c);
                if (cVar.f5391f) {
                    return true;
                }
            } finally {
                cVar.f5390e = null;
                cVar.f5389d = null;
                cVar.f5391f = false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private void m6463m(C1111n c1111n, Object obj, boolean z10) {
        int i10 = b.f5385a[c1111n.f5439b.f5420b.ordinal()];
        if (i10 == 1) {
            m6468h(c1111n, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                m6468h(c1111n, obj);
                return;
            } else {
                this.f5372e.m6474a(c1111n, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f5373f.m6454a(c1111n, obj);
                return;
            } else {
                m6468h(c1111n, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f5374g.m6453a(c1111n, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + c1111n.f5439b.f5420b);
    }

    /* renamed from: o */
    private void m6464o(Object obj, C1109l c1109l) {
        Class<?> cls = c1109l.f5421c;
        C1111n c1111n = new C1111n(obj, c1109l);
        CopyOnWriteArrayList<C1111n> copyOnWriteArrayList = this.f5368a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f5368a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c1111n)) {
            throw new C1102e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || c1109l.f5422d > copyOnWriteArrayList.get(i10).f5439b.f5422d) {
                copyOnWriteArrayList.add(i10, c1111n);
                break;
            }
        }
        List<Class<?>> list = this.f5369b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f5369b.put(obj, list);
        }
        list.add(cls);
        if (c1109l.f5423e) {
            if (this.f5382o) {
                for (Map.Entry<Class<?>, Object> entry : this.f5370c.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey())) {
                        m6457c(c1111n, entry.getValue());
                    }
                }
                return;
            }
            m6457c(c1111n, this.f5370c.get(cls));
        }
    }

    /* renamed from: q */
    private void m6465q(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<C1111n> copyOnWriteArrayList = this.f5368a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                C1111n c1111n = copyOnWriteArrayList.get(i10);
                if (c1111n.f5438a == obj) {
                    c1111n.f5440c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public ExecutorService m6466e() {
        return this.f5376i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6467g(C1105h c1105h) {
        Object obj = c1105h.f5410a;
        C1111n c1111n = c1105h.f5411b;
        C1105h.m6476b(c1105h);
        if (c1111n.f5440c) {
            m6468h(c1111n, obj);
        }
    }

    /* renamed from: h */
    void m6468h(C1111n c1111n, Object obj) {
        try {
            c1111n.f5439b.f5419a.invoke(c1111n.f5438a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            m6459f(c1111n, obj, e11.getCause());
        }
    }

    /* renamed from: j */
    public void m6469j(Object obj) {
        c cVar = this.f5371d.get();
        List<Object> list = cVar.f5386a;
        list.add(obj);
        if (cVar.f5387b) {
            return;
        }
        cVar.f5388c = Looper.getMainLooper() == Looper.myLooper();
        cVar.f5387b = true;
        if (!cVar.f5391f) {
            while (!list.isEmpty()) {
                try {
                    m6461k(list.remove(0), cVar);
                } finally {
                    cVar.f5387b = false;
                    cVar.f5388c = false;
                }
            }
            return;
        }
        throw new C1102e("Internal error. Abort state was not reset");
    }

    /* renamed from: n */
    public void m6470n(Object obj) {
        List<C1109l> m6487a = this.f5375h.m6487a(obj.getClass());
        synchronized (this) {
            Iterator<C1109l> it = m6487a.iterator();
            while (it.hasNext()) {
                m6464o(obj, it.next());
            }
        }
    }

    /* renamed from: p */
    public synchronized void m6471p(Object obj) {
        List<Class<?>> list = this.f5369b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                m6465q(obj, it.next());
            }
            this.f5369b.remove(obj);
        } else {
            Log.w(f5364q, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f5383p + ", eventInheritance=" + this.f5382o + "]";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1100c(C1101d c1101d) {
        this.f5371d = new a();
        this.f5368a = new HashMap();
        this.f5369b = new HashMap();
        this.f5370c = new ConcurrentHashMap();
        this.f5372e = new HandlerC1103f(this, Looper.getMainLooper(), 10);
        this.f5373f = new RunnableC1099b(this);
        this.f5374g = new RunnableC1098a(this);
        List<InterfaceC1166b> list = c1101d.f5402j;
        this.f5383p = list != null ? list.size() : 0;
        this.f5375h = new C1110m(c1101d.f5402j, c1101d.f5400h, c1101d.f5399g);
        this.f5378k = c1101d.f5393a;
        this.f5379l = c1101d.f5394b;
        this.f5380m = c1101d.f5395c;
        this.f5381n = c1101d.f5396d;
        this.f5377j = c1101d.f5397e;
        this.f5382o = c1101d.f5398f;
        this.f5376i = c1101d.f5401i;
    }
}
