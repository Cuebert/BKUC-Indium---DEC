package p183o1;

import android.content.Context;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p269v1.C4938a;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public class C4115a extends Scheduler {

    /* renamed from: h */
    public static final long f16779h = TimeUnit.SECONDS.toMillis(900);

    /* renamed from: c */
    private long f16780c;

    /* renamed from: d */
    private long f16781d;

    /* renamed from: e */
    private final Scheduler f16782e;

    /* renamed from: f */
    private final List<b> f16783f;

    /* renamed from: g */
    private final Timer f16784g;

    /* renamed from: o1.a$a */
    /* loaded from: classes.dex */
    class a implements Scheduler.Callback {
        a() {
        }

        @Override // com.birbit.android.jobqueue.scheduling.Scheduler.Callback
        public boolean start(C4938a c4938a) {
            C4115a.this.m17099j(c4938a);
            return C4115a.this.m7189e(c4938a);
        }

        @Override // com.birbit.android.jobqueue.scheduling.Scheduler.Callback
        public boolean stop(C4938a c4938a) {
            return C4115a.this.m7190f(c4938a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final long f16786a;

        /* renamed from: b */
        final C4938a f16787b;

        public b(long j10, C4938a c4938a) {
            this.f16786a = j10;
            this.f16787b = c4938a;
        }
    }

    public C4115a(Scheduler scheduler, Timer timer) {
        long j10 = f16779h;
        this.f16780c = j10;
        this.f16781d = TimeUnit.MILLISECONDS.toNanos(j10);
        this.f16783f = new ArrayList();
        this.f16782e = scheduler;
        this.f16784g = timer;
    }

    /* renamed from: i */
    private boolean m17098i(b bVar, C4938a c4938a, long j10) {
        if (bVar.f16787b.m19364b() != c4938a.m19364b()) {
            return false;
        }
        long j11 = bVar.f16786a - j10;
        return j11 > 0 && j11 <= this.f16781d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m17099j(C4938a c4938a) {
        synchronized (this.f16783f) {
            for (int size = this.f16783f.size() - 1; size >= 0; size--) {
                if (this.f16783f.get(size).f16787b.m19365c().equals(c4938a.m19365c())) {
                    this.f16783f.remove(size);
                }
            }
        }
    }

    @Override // com.birbit.android.jobqueue.scheduling.Scheduler
    /* renamed from: a */
    public void mo7185a() {
        synchronized (this.f16783f) {
            this.f16783f.clear();
        }
        this.f16782e.mo7185a();
    }

    @Override // com.birbit.android.jobqueue.scheduling.Scheduler
    /* renamed from: b */
    public void mo7186b(Context context, Scheduler.Callback callback) {
        super.mo7186b(context, callback);
        this.f16782e.mo7186b(context, new a());
    }

    @Override // com.birbit.android.jobqueue.scheduling.Scheduler
    /* renamed from: c */
    public void mo7187c(C4938a c4938a, boolean z10) {
        m17099j(c4938a);
        this.f16782e.mo7187c(c4938a, false);
        if (z10) {
            mo7188d(c4938a);
        }
    }

    @Override // com.birbit.android.jobqueue.scheduling.Scheduler
    /* renamed from: d */
    public void mo7188d(C4938a c4938a) {
        if (m17100h(c4938a)) {
            this.f16782e.mo7188d(c4938a);
        }
    }

    /* renamed from: h */
    protected boolean m17100h(C4938a c4938a) {
        long nanoTime = this.f16784g.nanoTime();
        long nanos = TimeUnit.MILLISECONDS.toNanos(c4938a.m19363a()) + nanoTime;
        synchronized (this.f16783f) {
            Iterator<b> it = this.f16783f.iterator();
            while (it.hasNext()) {
                if (m17098i(it.next(), c4938a, nanos)) {
                    return false;
                }
            }
            long m19363a = c4938a.m19363a();
            long j10 = this.f16780c;
            long j11 = ((m19363a / j10) + 1) * j10;
            c4938a.m19366d(j11);
            this.f16783f.add(new b(nanoTime + TimeUnit.MILLISECONDS.toNanos(j11), c4938a));
            return true;
        }
    }
}
