package p220r1;

import com.birbit.android.jobqueue.C1290c;
import com.birbit.android.jobqueue.C1293f;
import com.birbit.android.jobqueue.JobQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import p208q1.C4292a;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public class C4418a implements JobQueue {

    /* renamed from: a */
    private final TreeSet<C1293f> f17996a = new TreeSet<>(new a());

    /* renamed from: b */
    private final Map<String, C1293f> f17997b = new HashMap();

    /* renamed from: c */
    private final AtomicLong f17998c = new AtomicLong(0);

    /* renamed from: d */
    private final List<String> f17999d = new ArrayList();

    /* renamed from: e */
    private final long f18000e;

    /* renamed from: r1.a$a */
    /* loaded from: classes.dex */
    class a implements Comparator<C1293f> {
        a() {
        }

        /* renamed from: b */
        private int m18218b(int i10, int i11) {
            if (i10 > i11) {
                return -1;
            }
            return i11 > i10 ? 1 : 0;
        }

        /* renamed from: c */
        private int m18219c(long j10, long j11) {
            if (j10 > j11) {
                return -1;
            }
            return j11 > j10 ? 1 : 0;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C1293f c1293f, C1293f c1293f2) {
            if (c1293f.m7065f().m7039c().equals(c1293f2.m7065f().m7039c())) {
                return 0;
            }
            int m18218b = m18218b(c1293f.m7066g(), c1293f2.m7066g());
            if (m18218b != 0) {
                return m18218b;
            }
            int i10 = -m18219c(c1293f.m7060a(), c1293f2.m7060a());
            return i10 != 0 ? i10 : -m18219c(c1293f.m7064e().longValue(), c1293f2.m7064e().longValue());
        }
    }

    public C4418a(C4292a c4292a, long j10) {
        this.f18000e = j10;
    }

    /* renamed from: a */
    private static Long m18215a(C1293f c1293f, boolean z10, boolean z11) {
        long m7067h = c1293f.m7067h();
        long m7068i = c1293f.m7068i();
        long m7061b = c1293f.m7061b();
        if (!z10) {
            if (m7067h == Long.MAX_VALUE) {
                return null;
            }
            m7061b = Math.max(m7061b, m7067h);
        }
        if (!z11) {
            if (m7068i == Long.MAX_VALUE) {
                return null;
            }
            m7061b = Math.max(m7061b, m7068i);
        }
        return Long.valueOf(m7061b);
    }

    /* renamed from: b */
    private static boolean m18216b(C1293f c1293f, C1290c c1290c) {
        return m18217c(c1293f, c1290c, false);
    }

    /* renamed from: c */
    private static boolean m18217c(C1293f c1293f, C1290c c1290c, boolean z10) {
        if (!z10) {
            if (c1290c.m7014s() && c1293f.m7080u(c1290c.m7000e())) {
                return false;
            }
            if (c1290c.m7015t() && c1293f.m7081v(c1290c.m7000e())) {
                return false;
            }
        }
        if (c1290c.m7003h() != null && c1293f.m7061b() > c1290c.m7003h().longValue()) {
            return false;
        }
        if ((c1293f.m7062c() != null && c1290c.m6998c().contains(c1293f.m7062c())) || c1290c.m6999d().contains(c1293f.m7063d())) {
            return false;
        }
        if (c1290c.m7001f() != null) {
            return (c1293f.m7072m() == null || c1290c.m7002g().isEmpty() || !c1290c.m7001f().m17120b(c1290c.m7002g(), c1293f.m7072m())) ? false : true;
        }
        return true;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void clear() {
        this.f17996a.clear();
        this.f17997b.clear();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public int count() {
        return this.f17996a.size();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public int countReadyJobs(C1290c c1290c) {
        this.f17999d.clear();
        Iterator<C1293f> it = this.f17996a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            C1293f next = it.next();
            String m7062c = next.m7062c();
            if (m7062c == null || !this.f17999d.contains(m7062c)) {
                if (m18216b(next, c1290c)) {
                    i10++;
                    if (m7062c != null) {
                        this.f17999d.add(m7062c);
                    }
                }
            }
        }
        this.f17999d.clear();
        return i10;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public C1293f findJobById(String str) {
        return this.f17997b.get(str);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public Set<C1293f> findJobs(C1290c c1290c) {
        HashSet hashSet = new HashSet();
        Iterator<C1293f> it = this.f17996a.iterator();
        while (it.hasNext()) {
            C1293f next = it.next();
            if (m18216b(next, c1290c)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public Long getNextJobDelayUntilNs(C1290c c1290c) {
        Long m18215a;
        boolean z10 = !c1290c.m7014s();
        boolean z11 = !c1290c.m7015t();
        Long l10 = null;
        if (z10 && z11) {
            Iterator<C1293f> it = this.f17996a.iterator();
            while (it.hasNext()) {
                C1293f next = it.next();
                if (m18216b(next, c1290c) && (l10 == null || next.m7061b() < l10.longValue())) {
                    l10 = Long.valueOf(next.m7061b());
                }
            }
        } else {
            Iterator<C1293f> it2 = this.f17996a.iterator();
            while (it2.hasNext()) {
                C1293f next2 = it2.next();
                if (m18217c(next2, c1290c, true) && (m18215a = m18215a(next2, z10, z11)) != null && (l10 == null || m18215a.longValue() < l10.longValue())) {
                    l10 = m18215a;
                }
            }
        }
        return l10;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public boolean insert(C1293f c1293f) {
        c1293f.m7085z(this.f17998c.incrementAndGet());
        if (this.f17997b.get(c1293f.m7063d()) == null) {
            this.f17997b.put(c1293f.m7063d(), c1293f);
            this.f17996a.add(c1293f);
            return true;
        }
        throw new IllegalArgumentException("cannot add a job with the same id twice");
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public boolean insertOrReplace(C1293f c1293f) {
        if (c1293f.m7064e() == null) {
            return insert(c1293f);
        }
        C1293f c1293f2 = this.f17997b.get(c1293f.m7063d());
        if (c1293f2 != null) {
            remove(c1293f2);
        }
        this.f17997b.put(c1293f.m7063d(), c1293f);
        this.f17996a.add(c1293f);
        return true;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public C1293f nextJobAndIncRunCount(C1290c c1290c) {
        Iterator<C1293f> it = this.f17996a.iterator();
        while (it.hasNext()) {
            C1293f next = it.next();
            if (m18216b(next, c1290c)) {
                remove(next);
                next.m7058B(next.m7070k() + 1);
                next.m7059C(this.f18000e);
                return next;
            }
        }
        return null;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void onJobCancelled(C1293f c1293f) {
        remove(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void remove(C1293f c1293f) {
        this.f17997b.remove(c1293f.m7063d());
        this.f17996a.remove(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void substitute(C1293f c1293f, C1293f c1293f2) {
        remove(c1293f2);
        insert(c1293f);
    }
}
