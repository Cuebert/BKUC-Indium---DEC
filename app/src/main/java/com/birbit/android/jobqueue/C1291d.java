package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import p183o1.C4119e;
import p183o1.C4120f;
import p183o1.EnumC4121g;
import p208q1.C4292a;
import p233s1.C4516a;
import p244t1.AbstractC4611b;
import p244t1.AbstractC4613d;
import p244t1.C4612c;
import p244t1.C4615f;
import p244t1.EnumC4616g;
import p257u1.C4812e;
import p257u1.C4814g;
import p257u1.C4816i;
import p257u1.C4817j;
import p269v1.C4938a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.birbit.android.jobqueue.d */
/* loaded from: classes.dex */
public class C1291d {

    /* renamed from: c */
    private final int f5758c;

    /* renamed from: d */
    private final int f5759d;

    /* renamed from: e */
    private final long f5760e;

    /* renamed from: f */
    private final int f5761f;

    /* renamed from: g */
    private final int f5762g;

    /* renamed from: i */
    private final RunnableC1295h f5764i;

    /* renamed from: j */
    private final Timer f5765j;

    /* renamed from: k */
    private final C4612c f5766k;

    /* renamed from: m */
    final C4120f f5768m;

    /* renamed from: a */
    private List<b> f5756a = new ArrayList();

    /* renamed from: b */
    private final List<b> f5757b = new ArrayList();

    /* renamed from: n */
    private CopyOnWriteArrayList<Runnable> f5769n = new CopyOnWriteArrayList<>();

    /* renamed from: l */
    private final Map<String, C1293f> f5767l = new HashMap();

    /* renamed from: h */
    private final ThreadGroup f5763h = new ThreadGroup("JobConsumers");

    /* renamed from: com.birbit.android.jobqueue.d$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5770a;

        static {
            int[] iArr = new int[EnumC4616g.values().length];
            f5770a = iArr;
            try {
                iArr[EnumC4616g.RUN_JOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5770a[EnumC4616g.COMMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.birbit.android.jobqueue.d$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: u */
        static final MessagePredicate f5771u = new a();

        /* renamed from: n */
        final C4615f f5772n;

        /* renamed from: o */
        final MessageQueue f5773o;

        /* renamed from: p */
        final C4612c f5774p;

        /* renamed from: q */
        final Timer f5775q;

        /* renamed from: r */
        boolean f5776r;

        /* renamed from: s */
        long f5777s;

        /* renamed from: t */
        final AbstractC4613d f5778t = new C6044b();

        /* renamed from: com.birbit.android.jobqueue.d$b$a */
        /* loaded from: classes.dex */
        static class a implements MessagePredicate {
            a() {
            }

            @Override // com.birbit.android.jobqueue.messaging.MessagePredicate
            public boolean onMessage(AbstractC4611b abstractC4611b) {
                return abstractC4611b.f18372a == EnumC4616g.COMMAND && ((C4812e) abstractC4611b).m18982c() == 2;
            }
        }

        /* renamed from: com.birbit.android.jobqueue.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C6044b extends AbstractC4613d {
            C6044b() {
            }

            @Override // p244t1.AbstractC4613d
            /* renamed from: a */
            public void mo6989a(AbstractC4611b abstractC4611b) {
                int i10 = a.f5770a[abstractC4611b.f18372a.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    b.this.m7034d((C4812e) abstractC4611b);
                } else {
                    b.this.m7035e((C4816i) abstractC4611b);
                    b bVar = b.this;
                    bVar.f5777s = bVar.f5775q.nanoTime();
                    b.this.m7036f();
                }
            }

            @Override // p244t1.AbstractC4613d
            /* renamed from: b */
            public void mo6990b() {
                C4516a.m18533b("consumer manager on idle", new Object[0]);
                C4814g c4814g = (C4814g) b.this.f5774p.m18706a(C4814g.class);
                c4814g.m18987f(b.this);
                c4814g.m18986e(b.this.f5777s);
                b.this.f5773o.post(c4814g);
            }
        }

        public b(MessageQueue messageQueue, C4615f c4615f, C4612c c4612c, Timer timer) {
            this.f5772n = c4615f;
            this.f5774p = c4612c;
            this.f5773o = messageQueue;
            this.f5775q = timer;
            this.f5777s = timer.nanoTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m7034d(C4812e c4812e) {
            int m18982c = c4812e.m18982c();
            if (m18982c == 1) {
                this.f5772n.stop();
            } else {
                if (m18982c != 2) {
                    return;
                }
                C4516a.m18533b("Consumer has been poked.", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m7035e(C4816i c4816i) {
            C4516a.m18533b("running job %s", c4816i.m18991c().getClass().getSimpleName());
            C1293f m18991c = c4816i.m18991c();
            int m7082w = m18991c.m7082w(m18991c.m7070k());
            C4817j c4817j = (C4817j) this.f5774p.m18706a(C4817j.class);
            c4817j.m18996f(m18991c);
            c4817j.m18997g(m7082w);
            c4817j.m18998h(this);
            this.f5773o.post(c4817j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m7036f() {
            this.f5772n.cancelMessages(f5771u);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5772n.consume(this.f5778t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1291d(RunnableC1295h runnableC1295h, Timer timer, C4612c c4612c, C4292a c4292a) {
        this.f5764i = runnableC1295h;
        this.f5765j = timer;
        this.f5766k = c4612c;
        this.f5762g = c4292a.m17795g();
        this.f5759d = c4292a.m17797i();
        this.f5758c = c4292a.m17796h();
        this.f5760e = c4292a.m17791c() * 1000 * 1000000;
        this.f5761f = c4292a.m17801m();
        this.f5768m = new C4120f(timer);
    }

    /* renamed from: a */
    private void m7016a() {
        C4516a.m18533b("adding another consumer", new Object[0]);
        b bVar = new b(this.f5764i.f5827C, new C4615f(this.f5765j, this.f5766k, "consumer"), this.f5766k, this.f5765j);
        Thread thread = new Thread(this.f5763h, bVar, "job-queue-worker-" + UUID.randomUUID());
        thread.setPriority(this.f5761f);
        this.f5757b.add(bVar);
        thread.start();
    }

    /* renamed from: c */
    private void m7017c(boolean z10) {
        C4516a.m18533b("considering adding a new consumer. Should poke all waiting? %s isRunning? %s waiting workers? %d", Boolean.valueOf(z10), Boolean.valueOf(this.f5764i.m7132I()), Integer.valueOf(this.f5756a.size()));
        if (!this.f5764i.m7132I()) {
            C4516a.m18533b("jobqueue is not running, no consumers will be added", new Object[0]);
            return;
        }
        if (this.f5756a.size() > 0) {
            C4516a.m18533b("there are waiting workers, will poke them instead", new Object[0]);
            for (int size = this.f5756a.size() - 1; size >= 0; size--) {
                b remove = this.f5756a.remove(size);
                C4812e c4812e = (C4812e) this.f5766k.m18706a(C4812e.class);
                c4812e.m18983d(2);
                remove.f5772n.post(c4812e);
                if (!z10) {
                    break;
                }
            }
            C4516a.m18533b("there were waiting workers, poked them and I'm done", new Object[0]);
            return;
        }
        boolean m7018j = m7018j();
        C4516a.m18533b("nothing has been poked. are we above load factor? %s", Boolean.valueOf(m7018j));
        if (m7018j) {
            m7016a();
        }
    }

    /* renamed from: j */
    private boolean m7018j() {
        int size = this.f5757b.size();
        if (size >= this.f5758c) {
            C4516a.m18533b("too many consumers, clearly above load factor %s", Integer.valueOf(size));
            return false;
        }
        int m7135q = this.f5764i.m7135q();
        int size2 = this.f5767l.size();
        int i10 = m7135q + size2;
        boolean z10 = this.f5762g * size < i10 || (size < this.f5759d && size < i10);
        C4516a.m18533b("check above load factor: totalCons:%s minCons:%s maxConsCount: %s, loadFactor %s remainingJobs: %s runningsHolders: %s. isAbove:%s", Integer.valueOf(size), Integer.valueOf(this.f5759d), Integer.valueOf(this.f5758c), Integer.valueOf(this.f5762g), Integer.valueOf(m7135q), Integer.valueOf(size2), Boolean.valueOf(z10));
        return z10;
    }

    /* renamed from: m */
    private Set<String> m7019m(EnumC4121g enumC4121g, String[] strArr, boolean z10) {
        HashSet hashSet = new HashSet();
        for (C1293f c1293f : this.f5767l.values()) {
            C4516a.m18533b("checking job tag %s. tags of job: %s", c1293f.m7065f(), c1293f.m7065f().m7046j());
            if (c1293f.m7073n() && !c1293f.m7074o() && enumC4121g.m17121c(strArr, c1293f.m7072m())) {
                hashSet.add(c1293f.m7063d());
                if (z10) {
                    c1293f.m7077r();
                } else {
                    c1293f.m7076q();
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public boolean m7020b() {
        return this.f5756a.size() == this.f5757b.size();
    }

    /* renamed from: d */
    public int m7021d() {
        return this.f5757b.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7022e() {
        m7017c(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m7023f(C4814g c4814g) {
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList;
        b bVar = (b) c4814g.m18985d();
        if (bVar.f5776r) {
            return true;
        }
        boolean m7132I = this.f5764i.m7132I();
        C1293f m7136u = m7132I ? this.f5764i.m7136u(this.f5768m.m17118e()) : null;
        if (m7136u != null) {
            bVar.f5776r = true;
            this.f5768m.m17115a(m7136u.m7062c());
            C4816i c4816i = (C4816i) this.f5766k.m18706a(C4816i.class);
            c4816i.m18992d(m7136u);
            this.f5767l.put(m7136u.m7065f().m7039c(), m7136u);
            if (m7136u.m7062c() != null) {
                this.f5768m.m17115a(m7136u.m7062c());
            }
            bVar.f5772n.post(c4816i);
            return true;
        }
        long m18984c = c4814g.m18984c() + this.f5760e;
        C4516a.m18533b("keep alive: %s", Long.valueOf(m18984c));
        boolean z10 = this.f5757b.size() > this.f5759d;
        boolean z11 = !m7132I || (z10 && m18984c < this.f5765j.nanoTime());
        C4516a.m18533b("Consumer idle, will kill? %s . isRunning: %s", Boolean.valueOf(z11), Boolean.valueOf(m7132I));
        if (z11) {
            C4812e c4812e = (C4812e) this.f5766k.m18706a(C4812e.class);
            c4812e.m18983d(1);
            bVar.f5772n.post(c4812e);
            this.f5756a.remove(bVar);
            this.f5757b.remove(bVar);
            C4516a.m18533b("killed consumers. remaining consumers %d", Integer.valueOf(this.f5757b.size()));
            if (this.f5757b.isEmpty() && (copyOnWriteArrayList = this.f5769n) != null) {
                Iterator<Runnable> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        } else {
            if (!this.f5756a.contains(bVar)) {
                this.f5756a.add(bVar);
            }
            if (z10 || !this.f5764i.m7133l()) {
                C4812e c4812e2 = (C4812e) this.f5766k.m18706a(C4812e.class);
                c4812e2.m18983d(2);
                if (!z10) {
                    m18984c = this.f5765j.nanoTime() + this.f5760e;
                }
                bVar.f5772n.postAt(c4812e2, m18984c);
                C4516a.m18533b("poke consumer manager at %s", Long.valueOf(m18984c));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m7024g(C4817j c4817j, C1293f c1293f, C4119e c4119e) {
        b bVar = (b) c4817j.m18995e();
        if (bVar.f5776r) {
            bVar.f5776r = false;
            this.f5767l.remove(c1293f.m7065f().m7039c());
            if (c1293f.m7062c() != null) {
                this.f5768m.m17119f(c1293f.m7062c());
                if (c4119e == null || !c4119e.m17113d() || c4119e.m17110a().longValue() <= 0) {
                    return;
                }
                this.f5768m.m17116b(c1293f.m7062c(), this.f5765j.nanoTime() + (c4119e.m17110a().longValue() * 1000000));
                return;
            }
            return;
        }
        throw new IllegalStateException("this worker should not have a job");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m7025h() {
        Iterator<b> it = this.f5757b.iterator();
        while (it.hasNext()) {
            C4615f c4615f = it.next().f5772n;
            C4812e c4812e = (C4812e) this.f5766k.m18706a(C4812e.class);
            c4812e.m18983d(2);
            c4615f.post(c4812e);
        }
        if (this.f5757b.isEmpty()) {
            Iterator<Runnable> it2 = this.f5769n.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
        }
    }

    /* renamed from: i */
    public boolean m7026i(C4938a c4938a, long j10) {
        for (C1293f c1293f : this.f5767l.values()) {
            if (c1293f.m7065f().m7047k()) {
                if (c4938a.m19364b() == 2 && c1293f.m7080u(j10)) {
                    return true;
                }
                if (c4938a.m19364b() == 3 && c1293f.m7081v(j10)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m7027k(String str) {
        return this.f5767l.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Set<String> m7028l(EnumC4121g enumC4121g, String[] strArr) {
        return m7019m(enumC4121g, strArr, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public Set<String> m7029n(EnumC4121g enumC4121g, String[] strArr) {
        return m7019m(enumC4121g, strArr, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m7030o() {
        m7017c(false);
    }
}
