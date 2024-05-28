package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.C1293f;
import com.birbit.android.jobqueue.network.NetworkEventProvider;
import com.birbit.android.jobqueue.network.NetworkUtil;
import com.birbit.android.jobqueue.p037di.DependencyInjector;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p183o1.C4115a;
import p183o1.C4119e;
import p183o1.EnumC4117c;
import p183o1.EnumC4121g;
import p208q1.C4292a;
import p233s1.C4516a;
import p244t1.AbstractC4611b;
import p244t1.AbstractC4613d;
import p244t1.C4612c;
import p244t1.C4614e;
import p244t1.EnumC4616g;
import p257u1.C4808a;
import p257u1.C4810c;
import p257u1.C4812e;
import p257u1.C4813f;
import p257u1.C4814g;
import p257u1.C4815h;
import p257u1.C4817j;
import p257u1.C4818k;
import p269v1.C4938a;

/* renamed from: com.birbit.android.jobqueue.h */
/* loaded from: classes.dex */
public class RunnableC1295h implements Runnable, NetworkEventProvider.Listener {

    /* renamed from: C */
    final C4614e f5827C;

    /* renamed from: D */
    Scheduler f5828D;

    /* renamed from: n */
    final Timer f5829n;

    /* renamed from: o */
    private final Context f5830o;

    /* renamed from: p */
    private final long f5831p;

    /* renamed from: q */
    final JobQueue f5832q;

    /* renamed from: r */
    final JobQueue f5833r;

    /* renamed from: s */
    private final NetworkUtil f5834s;

    /* renamed from: t */
    private final DependencyInjector f5835t;

    /* renamed from: u */
    private final C4612c f5836u;

    /* renamed from: v */
    final C1291d f5837v;

    /* renamed from: w */
    private List<C1289b> f5838w;

    /* renamed from: x */
    private List<C4938a> f5839x;

    /* renamed from: z */
    final C1288a f5841z;

    /* renamed from: y */
    final C1290c f5840y = new C1290c();

    /* renamed from: A */
    private boolean f5825A = true;

    /* renamed from: B */
    private boolean f5826B = false;

    /* renamed from: com.birbit.android.jobqueue.h$a */
    /* loaded from: classes.dex */
    class a extends AbstractC4613d {
        a() {
        }

        @Override // p244t1.AbstractC4613d
        /* renamed from: a */
        public void mo6989a(AbstractC4611b abstractC4611b) {
            switch (b.f5843a[abstractC4611b.f18372a.ordinal()]) {
                case 1:
                    RunnableC1295h.this.m7129x((C4808a) abstractC4611b);
                    return;
                case 2:
                    if (RunnableC1295h.this.f5837v.m7023f((C4814g) abstractC4611b)) {
                        return;
                    }
                    RunnableC1295h.this.m7108H();
                    return;
                case 3:
                    RunnableC1295h.this.m7102B((C4817j) abstractC4611b);
                    return;
                case 4:
                    RunnableC1295h.this.f5837v.m7022e();
                    return;
                case 5:
                    RunnableC1295h.this.m7130y((C4810c) abstractC4611b);
                    return;
                case 6:
                    RunnableC1295h.this.m7101A((C4815h) abstractC4611b);
                    return;
                case 7:
                    RunnableC1295h.this.m7131z((C4812e) abstractC4611b);
                    return;
                case 8:
                    RunnableC1295h.this.m7103C((C4818k) abstractC4611b);
                    return;
                default:
                    return;
            }
        }

        @Override // p244t1.AbstractC4613d
        /* renamed from: b */
        public void mo6990b() {
            C4516a.m18533b("joq idle. running:? %s", Boolean.valueOf(RunnableC1295h.this.f5825A));
            if (RunnableC1295h.this.f5825A) {
                Long m7138w = RunnableC1295h.this.m7138w(true);
                C4516a.m18533b("Job queue idle. next job at: %s", m7138w);
                if (m7138w != null) {
                    RunnableC1295h.this.f5827C.postAt((C4813f) RunnableC1295h.this.f5836u.m18706a(C4813f.class), m7138w.longValue());
                    return;
                }
                RunnableC1295h runnableC1295h = RunnableC1295h.this;
                if (runnableC1295h.f5828D != null && runnableC1295h.f5826B && RunnableC1295h.this.f5832q.count() == 0) {
                    RunnableC1295h.this.f5826B = false;
                    RunnableC1295h.this.f5828D.mo7185a();
                }
            }
        }
    }

    /* renamed from: com.birbit.android.jobqueue.h$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5843a;

        static {
            int[] iArr = new int[EnumC4616g.values().length];
            f5843a = iArr;
            try {
                iArr[EnumC4616g.ADD_JOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5843a[EnumC4616g.JOB_CONSUMER_IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5843a[EnumC4616g.RUN_JOB_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5843a[EnumC4616g.CONSTRAINT_CHANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5843a[EnumC4616g.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5843a[EnumC4616g.PUBLIC_QUERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5843a[EnumC4616g.COMMAND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5843a[EnumC4616g.SCHEDULER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public RunnableC1295h(C4292a c4292a, C4614e c4614e, C4612c c4612c) {
        this.f5827C = c4614e;
        if (c4292a.m17792d() != null) {
            C4516a.m18537f(c4292a.m17792d());
        }
        this.f5836u = c4612c;
        Timer m17802n = c4292a.m17802n();
        this.f5829n = m17802n;
        this.f5830o = c4292a.m17790b();
        long nanoTime = m17802n.nanoTime();
        this.f5831p = nanoTime;
        Scheduler m17800l = c4292a.m17800l();
        this.f5828D = m17800l;
        if (m17800l != null && c4292a.m17789a() && !(this.f5828D instanceof C4115a)) {
            this.f5828D = new C4115a(this.f5828D, m17802n);
        }
        this.f5832q = c4292a.m17799k().createPersistentQueue(c4292a, nanoTime);
        this.f5833r = c4292a.m17799k().createNonPersistent(c4292a, nanoTime);
        NetworkUtil m17798j = c4292a.m17798j();
        this.f5834s = m17798j;
        this.f5835t = c4292a.m17793e();
        if (m17798j instanceof NetworkEventProvider) {
            ((NetworkEventProvider) m17798j).setListener(this);
        }
        this.f5837v = new C1291d(this, m17802n, c4612c, c4292a);
        this.f5841z = new C1288a(c4612c, m17802n);
    }

    /* renamed from: A */
    public void m7101A(C4815h c4815h) {
        int m18990e = c4815h.m18990e();
        if (m18990e != 101) {
            switch (m18990e) {
                case 0:
                    c4815h.m18988c().onResult(m7134o());
                    return;
                case 1:
                    c4815h.m18988c().onResult(m7125p(m7128t()));
                    return;
                case 2:
                    C4516a.m18533b("handling start request...", new Object[0]);
                    if (this.f5825A) {
                        return;
                    }
                    this.f5825A = true;
                    this.f5837v.m7022e();
                    return;
                case 3:
                    C4516a.m18533b("handling stop request...", new Object[0]);
                    this.f5825A = false;
                    this.f5837v.m7025h();
                    return;
                case 4:
                    c4815h.m18988c().onResult(m7127s(c4815h.m18989d()).ordinal());
                    return;
                case 5:
                    m7124n();
                    if (c4815h.m18988c() != null) {
                        c4815h.m18988c().onResult(0);
                        return;
                    }
                    return;
                case 6:
                    c4815h.m18988c().onResult(this.f5837v.m7021d());
                    return;
                default:
                    throw new IllegalArgumentException("cannot handle public query with type " + c4815h.m18990e());
            }
        }
        c4815h.m18988c().onResult(0);
    }

    /* renamed from: B */
    public void m7102B(C4817j c4817j) {
        C4119e m7069j;
        int m18994d = c4817j.m18994d();
        C1293f m18993c = c4817j.m18993c();
        this.f5841z.m6988q(m18993c.m7065f(), m18994d);
        int i10 = 0;
        switch (m18994d) {
            case 1:
                m18993c.m7078s();
                m7110K(m18993c);
                m7069j = null;
                break;
            case 2:
                m7123m(m18993c, 2);
                m7110K(m18993c);
                m7069j = null;
                break;
            case 3:
                C4516a.m18533b("running job failed and cancelled, doing nothing. Will be removed after it's onCancel is called by the CancelHandler", new Object[0]);
                m7069j = null;
                break;
            case 4:
                m7069j = m18993c.m7069j();
                m7107G(m18993c);
                break;
            case 5:
                m7123m(m18993c, 5);
                m7110K(m18993c);
                m7069j = null;
                break;
            case 6:
                m7123m(m18993c, 6);
                m7110K(m18993c);
                m7069j = null;
                break;
            default:
                C4516a.m18534c("unknown job holder result", new Object[0]);
                m7069j = null;
                break;
        }
        this.f5837v.m7024g(c4817j, m18993c, m7069j);
        this.f5841z.m6983h(m18993c.m7065f(), m18994d);
        List<C1289b> list = this.f5838w;
        if (list != null) {
            int size = list.size();
            while (i10 < size) {
                C1289b c1289b = this.f5838w.get(i10);
                c1289b.m6994c(m18993c, m18994d);
                if (c1289b.m6993b()) {
                    c1289b.m6992a(this);
                    this.f5838w.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    /* renamed from: C */
    public void m7103C(C4818k c4818k) {
        int m19000d = c4818k.m19000d();
        if (m19000d == 1) {
            m7104D(c4818k.m18999c());
        } else {
            if (m19000d == 2) {
                m7105E(c4818k.m18999c());
                return;
            }
            throw new IllegalArgumentException("Unknown scheduler message with what " + m19000d);
        }
    }

    /* renamed from: D */
    private void m7104D(C4938a c4938a) {
        if (!m7132I()) {
            Scheduler scheduler = this.f5828D;
            if (scheduler != null) {
                scheduler.mo7187c(c4938a, true);
                return;
            }
            return;
        }
        if (!m7106F(c4938a)) {
            Scheduler scheduler2 = this.f5828D;
            if (scheduler2 != null) {
                scheduler2.mo7187c(c4938a, false);
                return;
            }
            return;
        }
        if (this.f5839x == null) {
            this.f5839x = new ArrayList();
        }
        this.f5839x.add(c4938a);
        this.f5837v.m7022e();
    }

    /* renamed from: E */
    private void m7105E(C4938a c4938a) {
        List<C4938a> list = this.f5839x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).m19365c().equals(c4938a.m19365c())) {
                    list.remove(size);
                }
            }
        }
        if (this.f5828D != null && m7106F(c4938a)) {
            this.f5828D.mo7188d(c4938a);
        }
    }

    /* renamed from: F */
    private boolean m7106F(C4938a c4938a) {
        if (this.f5837v.m7026i(c4938a, this.f5829n.nanoTime())) {
            return true;
        }
        this.f5840y.m6996a();
        this.f5840y.m7008m(this.f5829n.nanoTime());
        this.f5840y.m7007l(c4938a.m19364b());
        return this.f5832q.countReadyJobs(this.f5840y) > 0;
    }

    /* renamed from: G */
    private void m7107G(C1293f c1293f) {
        C4119e m7069j = c1293f.m7069j();
        if (m7069j == null) {
            m7109J(c1293f);
            return;
        }
        if (m7069j.m17111b() != null) {
            c1293f.m7057A(m7069j.m17111b().intValue());
        }
        long longValue = m7069j.m17110a() != null ? m7069j.m17110a().longValue() : -1L;
        c1293f.m7084y(longValue > 0 ? this.f5829n.nanoTime() + (longValue * 1000000) : Long.MIN_VALUE);
        m7109J(c1293f);
    }

    /* renamed from: H */
    public void m7108H() {
        List<C4938a> list;
        if (this.f5828D == null || (list = this.f5839x) == null || list.isEmpty() || !this.f5837v.m7020b()) {
            return;
        }
        for (int size = this.f5839x.size() - 1; size >= 0; size--) {
            C4938a remove = this.f5839x.remove(size);
            this.f5828D.mo7187c(remove, m7106F(remove));
        }
    }

    /* renamed from: J */
    private void m7109J(C1293f c1293f) {
        if (!c1293f.m7074o()) {
            if (c1293f.m7065f().m7047k()) {
                this.f5832q.insertOrReplace(c1293f);
                return;
            } else {
                this.f5833r.insertOrReplace(c1293f);
                return;
            }
        }
        C4516a.m18533b("not re-adding cancelled job " + c1293f, new Object[0]);
    }

    /* renamed from: K */
    private void m7110K(C1293f c1293f) {
        if (c1293f.m7065f().m7047k()) {
            this.f5832q.remove(c1293f);
        } else {
            this.f5833r.remove(c1293f);
        }
        this.f5841z.m6987o(c1293f.m7065f());
    }

    /* renamed from: L */
    private void m7111L(AbstractC1292e abstractC1292e) {
        if (this.f5828D == null) {
            return;
        }
        boolean m7051o = abstractC1292e.m7051o(this.f5829n);
        boolean m7052p = abstractC1292e.m7052p(this.f5829n);
        long m7038b = abstractC1292e.m7038b();
        if (m7038b <= 0) {
            m7038b = 0;
        }
        if (m7051o || m7052p || m7038b >= 30000) {
            C4938a c4938a = new C4938a(UUID.randomUUID().toString());
            c4938a.m19367e(m7052p ? 3 : m7051o ? 2 : 1);
            c4938a.m19366d(m7038b);
            this.f5828D.mo7188d(c4938a);
            this.f5826B = true;
        }
    }

    /* renamed from: m */
    private void m7123m(C1293f c1293f, int i10) {
        try {
            c1293f.m7079t(i10);
        } catch (Throwable th) {
            C4516a.m18535d(th, "job's onCancel did throw an exception, ignoring...", new Object[0]);
        }
        this.f5841z.m6986m(c1293f.m7065f(), false);
    }

    /* renamed from: n */
    private void m7124n() {
        this.f5833r.clear();
        this.f5832q.clear();
    }

    /* renamed from: p */
    private int m7125p(int i10) {
        Collection<String> m17118e = this.f5837v.f5768m.m17118e();
        this.f5840y.m6996a();
        this.f5840y.m7008m(this.f5829n.nanoTime());
        this.f5840y.m7007l(i10);
        this.f5840y.m7004i(m17118e);
        this.f5840y.m7006k(true);
        this.f5840y.m7013r(Long.valueOf(this.f5829n.nanoTime()));
        return this.f5833r.countReadyJobs(this.f5840y) + 0 + this.f5832q.countReadyJobs(this.f5840y);
    }

    /* renamed from: r */
    private C1293f m7126r(String str) {
        if (str == null) {
            return null;
        }
        this.f5840y.m6996a();
        this.f5840y.m7012q(new String[]{str});
        this.f5840y.m7011p(EnumC4121g.ANY);
        Set<C1293f> findJobs = this.f5833r.findJobs(this.f5840y);
        findJobs.addAll(this.f5832q.findJobs(this.f5840y));
        if (findJobs.isEmpty()) {
            return null;
        }
        for (C1293f c1293f : findJobs) {
            if (!this.f5837v.m7027k(c1293f.m7063d())) {
                return c1293f;
            }
        }
        return findJobs.iterator().next();
    }

    /* renamed from: s */
    private EnumC4117c m7127s(String str) {
        if (this.f5837v.m7027k(str)) {
            return EnumC4117c.RUNNING;
        }
        C1293f findJobById = this.f5833r.findJobById(str);
        if (findJobById == null) {
            findJobById = this.f5832q.findJobById(str);
        }
        if (findJobById == null) {
            return EnumC4117c.UNKNOWN;
        }
        int m7128t = m7128t();
        long nanoTime = this.f5829n.nanoTime();
        if (m7128t == 1 && findJobById.m7080u(nanoTime)) {
            return EnumC4117c.WAITING_NOT_READY;
        }
        if (m7128t != 3 && findJobById.m7081v(nanoTime)) {
            return EnumC4117c.WAITING_NOT_READY;
        }
        if (findJobById.m7061b() > nanoTime) {
            return EnumC4117c.WAITING_NOT_READY;
        }
        return EnumC4117c.WAITING_READY;
    }

    /* renamed from: t */
    private int m7128t() {
        NetworkUtil networkUtil = this.f5834s;
        if (networkUtil == null) {
            return 3;
        }
        return networkUtil.getNetworkStatus(this.f5830o);
    }

    /* renamed from: x */
    public void m7129x(C4808a c4808a) {
        AbstractC1292e m18967c = c4808a.m18967c();
        long nanoTime = m18967c.m7038b() > 0 ? this.f5829n.nanoTime() + (m18967c.m7038b() * 1000000) : Long.MIN_VALUE;
        m18967c.m7054r(this.f5829n);
        C1293f m7086a = new C1293f.b().m7092g(m18967c.m7040d()).m7091f(m18967c).m7089d(m18967c.m7044h()).m7087b(this.f5829n.nanoTime()).m7088c(nanoTime).m7094i(Long.MIN_VALUE).m7086a();
        C1293f m7126r = m7126r(m18967c.m7045i());
        boolean z10 = m7126r == null || this.f5837v.m7027k(m7126r.m7063d());
        if (z10) {
            JobQueue jobQueue = m18967c.m7047k() ? this.f5832q : this.f5833r;
            if (m7126r != null) {
                this.f5837v.m7029n(EnumC4121g.ANY, new String[]{m18967c.m7045i()});
                jobQueue.substitute(m7086a, m7126r);
            } else {
                jobQueue.insert(m7086a);
            }
            if (C4516a.m18536e()) {
                C4516a.m18533b("added job class: %s priority: %d delay: %d group : %s persistent: %s requires network: %s", m18967c.getClass().getSimpleName(), Integer.valueOf(m18967c.m7040d()), Long.valueOf(m18967c.m7038b()), m18967c.m7044h(), Boolean.valueOf(m18967c.m7047k()), Boolean.valueOf(m18967c.m7051o(this.f5829n)));
            }
        } else {
            C4516a.m18533b("another job with same singleId: %s was already queued", m18967c.m7045i());
        }
        DependencyInjector dependencyInjector = this.f5835t;
        if (dependencyInjector != null) {
            dependencyInjector.inject(m18967c);
        }
        m7086a.m7083x(this.f5830o);
        try {
            m7086a.m7065f().mo7048l();
        } catch (Throwable th) {
            C4516a.m18535d(th, "job's onAdded did throw an exception, ignoring...", new Object[0]);
        }
        this.f5841z.m6985k(m7086a.m7065f());
        if (z10) {
            this.f5837v.m7030o();
            if (m18967c.m7047k()) {
                m7111L(m18967c);
                return;
            }
            return;
        }
        m7123m(m7086a, 1);
        this.f5841z.m6987o(m7086a.m7065f());
    }

    /* renamed from: y */
    public void m7130y(C4810c c4810c) {
        C1289b c1289b = new C1289b(c4810c.m18977d(), c4810c.m18978e(), c4810c.m18976c());
        c1289b.m6995d(this, this.f5837v);
        if (c1289b.m6993b()) {
            c1289b.m6992a(this);
            return;
        }
        if (this.f5838w == null) {
            this.f5838w = new ArrayList();
        }
        this.f5838w.add(c1289b);
    }

    /* renamed from: z */
    public void m7131z(C4812e c4812e) {
        if (c4812e.m18982c() == 1) {
            this.f5827C.stop();
            this.f5827C.clear();
        }
    }

    /* renamed from: I */
    public boolean m7132I() {
        return this.f5825A;
    }

    /* renamed from: l */
    public boolean m7133l() {
        return this.f5834s instanceof NetworkEventProvider;
    }

    /* renamed from: o */
    int m7134o() {
        return this.f5832q.count() + this.f5833r.count();
    }

    @Override // com.birbit.android.jobqueue.network.NetworkEventProvider.Listener
    public void onNetworkChange(int i10) {
        this.f5827C.post((C4813f) this.f5836u.m18706a(C4813f.class));
    }

    /* renamed from: q */
    public int m7135q() {
        return m7125p(m7128t());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5827C.consume(new a());
    }

    /* renamed from: u */
    public C1293f m7136u(Collection<String> collection) {
        return m7137v(collection, false);
    }

    /* renamed from: v */
    C1293f m7137v(Collection<String> collection, boolean z10) {
        DependencyInjector dependencyInjector;
        if (!this.f5825A && !z10) {
            return null;
        }
        int m7128t = m7128t();
        boolean z11 = false;
        C4516a.m18533b("looking for next job", new Object[0]);
        this.f5840y.m6996a();
        this.f5840y.m7008m(this.f5829n.nanoTime());
        this.f5840y.m7007l(m7128t);
        this.f5840y.m7004i(collection);
        this.f5840y.m7006k(true);
        this.f5840y.m7013r(Long.valueOf(this.f5829n.nanoTime()));
        C1293f nextJobAndIncRunCount = this.f5833r.nextJobAndIncRunCount(this.f5840y);
        C4516a.m18533b("non persistent result %s", nextJobAndIncRunCount);
        if (nextJobAndIncRunCount == null) {
            nextJobAndIncRunCount = this.f5832q.nextJobAndIncRunCount(this.f5840y);
            C4516a.m18533b("persistent result %s", nextJobAndIncRunCount);
            z11 = true;
        }
        if (nextJobAndIncRunCount == null) {
            return null;
        }
        if (z11 && (dependencyInjector = this.f5835t) != null) {
            dependencyInjector.inject(nextJobAndIncRunCount.m7065f());
        }
        nextJobAndIncRunCount.m7083x(this.f5830o);
        return nextJobAndIncRunCount;
    }

    /* renamed from: w */
    Long m7138w(boolean z10) {
        Long m17117d = this.f5837v.f5768m.m17117d();
        int m7128t = m7128t();
        Collection<String> m17118e = this.f5837v.f5768m.m17118e();
        this.f5840y.m6996a();
        this.f5840y.m7008m(this.f5829n.nanoTime());
        this.f5840y.m7007l(m7128t);
        this.f5840y.m7004i(m17118e);
        this.f5840y.m7006k(true);
        Long nextJobDelayUntilNs = this.f5833r.getNextJobDelayUntilNs(this.f5840y);
        Long nextJobDelayUntilNs2 = this.f5832q.getNextJobDelayUntilNs(this.f5840y);
        if (m17117d == null) {
            m17117d = null;
        }
        if (nextJobDelayUntilNs != null) {
            m17117d = Long.valueOf(m17117d == null ? nextJobDelayUntilNs.longValue() : Math.min(nextJobDelayUntilNs.longValue(), m17117d.longValue()));
        }
        if (nextJobDelayUntilNs2 != null) {
            m17117d = Long.valueOf(m17117d == null ? nextJobDelayUntilNs2.longValue() : Math.min(nextJobDelayUntilNs2.longValue(), m17117d.longValue()));
        }
        if (!z10 || (this.f5834s instanceof NetworkEventProvider)) {
            return m17117d;
        }
        long nanoTime = this.f5829n.nanoTime() + C1294g.f5819e;
        if (m17117d != null) {
            nanoTime = Math.min(nanoTime, m17117d.longValue());
        }
        return Long.valueOf(nanoTime);
    }
}
