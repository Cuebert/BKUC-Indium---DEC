package p193ob;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p193ob.C4175f0;
import p205pb.C4286e;

/* renamed from: ob.q */
/* loaded from: classes.dex */
public final class C4192q {

    /* renamed from: c */
    private Runnable f17345c;

    /* renamed from: d */
    private ExecutorService f17346d;

    /* renamed from: a */
    private int f17343a = 64;

    /* renamed from: b */
    private int f17344b = 5;

    /* renamed from: e */
    private final Deque<C4175f0.a> f17347e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C4175f0.a> f17348f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C4175f0> f17349g = new ArrayDeque();

    /* renamed from: d */
    private C4175f0.a m17503d(String str) {
        for (C4175f0.a aVar : this.f17348f) {
            if (aVar.m17389o().equals(str)) {
                return aVar;
            }
        }
        for (C4175f0.a aVar2 : this.f17347e) {
            if (aVar2.m17389o().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    private <T> void m17504e(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f17345c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (m17505h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: h */
    private boolean m17505h() {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C4175f0.a> it = this.f17347e.iterator();
            while (it.hasNext()) {
                C4175f0.a next = it.next();
                if (this.f17348f.size() >= this.f17343a) {
                    break;
                }
                if (next.m17386l().get() < this.f17344b) {
                    it.remove();
                    next.m17386l().incrementAndGet();
                    arrayList.add(next);
                    this.f17348f.add(next);
                }
            }
            z10 = m17511i() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((C4175f0.a) arrayList.get(i10)).m17387m(m17508c());
        }
        return z10;
    }

    /* renamed from: a */
    public void m17506a(C4175f0.a aVar) {
        C4175f0.a m17503d;
        synchronized (this) {
            this.f17347e.add(aVar);
            if (!aVar.m17388n().f17116q && (m17503d = m17503d(aVar.m17389o())) != null) {
                aVar.m17390p(m17503d);
            }
        }
        m17505h();
    }

    /* renamed from: b */
    public synchronized void m17507b(C4175f0 c4175f0) {
        this.f17349g.add(c4175f0);
    }

    /* renamed from: c */
    public synchronized ExecutorService m17508c() {
        if (this.f17346d == null) {
            this.f17346d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C4286e.m17732I("OkHttp Dispatcher", false));
        }
        return this.f17346d;
    }

    /* renamed from: f */
    public void m17509f(C4175f0.a aVar) {
        aVar.m17386l().decrementAndGet();
        m17504e(this.f17348f, aVar);
    }

    /* renamed from: g */
    public void m17510g(C4175f0 c4175f0) {
        m17504e(this.f17349g, c4175f0);
    }

    /* renamed from: i */
    public synchronized int m17511i() {
        return this.f17348f.size() + this.f17349g.size();
    }
}
