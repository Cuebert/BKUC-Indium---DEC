package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.CancelResult;
import com.birbit.android.jobqueue.callback.JobManagerCallback;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p244t1.AbstractC4611b;
import p244t1.AbstractC4613d;
import p244t1.C4612c;
import p244t1.C4615f;
import p244t1.EnumC4616g;
import p257u1.C4809b;
import p257u1.C4811d;
import p257u1.C4812e;
import p257u1.C4815h;

/* renamed from: com.birbit.android.jobqueue.a */
/* loaded from: classes.dex */
public class C1288a {

    /* renamed from: a */
    final C4615f f5732a;

    /* renamed from: c */
    private final C4612c f5734c;

    /* renamed from: e */
    private final Timer f5736e;

    /* renamed from: d */
    private final AtomicInteger f5735d = new AtomicInteger(0);

    /* renamed from: f */
    private final AtomicBoolean f5737f = new AtomicBoolean(false);

    /* renamed from: b */
    private final CopyOnWriteArrayList<JobManagerCallback> f5733b = new CopyOnWriteArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.birbit.android.jobqueue.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: com.birbit.android.jobqueue.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C6043a extends AbstractC4613d {

            /* renamed from: a */
            long f5739a = Long.MIN_VALUE;

            C6043a() {
            }

            @Override // p244t1.AbstractC4613d
            /* renamed from: a */
            public void mo6989a(AbstractC4611b abstractC4611b) {
                EnumC4616g enumC4616g = abstractC4611b.f18372a;
                if (enumC4616g == EnumC4616g.CALLBACK) {
                    C1288a.this.m6974f((C4809b) abstractC4611b);
                    this.f5739a = C1288a.this.f5736e.nanoTime();
                } else if (enumC4616g == EnumC4616g.CANCEL_RESULT_CALLBACK) {
                    C1288a.this.m6973e((C4811d) abstractC4611b);
                    this.f5739a = C1288a.this.f5736e.nanoTime();
                } else {
                    if (enumC4616g == EnumC4616g.COMMAND) {
                        if (((C4812e) abstractC4611b).m18982c() == 1) {
                            C1288a.this.f5732a.stop();
                            C1288a.this.f5737f.set(false);
                            return;
                        }
                        return;
                    }
                    if (enumC4616g == EnumC4616g.PUBLIC_QUERY) {
                        ((C4815h) abstractC4611b).m18988c().onResult(0);
                    }
                }
            }

            @Override // p244t1.AbstractC4613d
            /* renamed from: b */
            public void mo6990b() {
            }

            @Override // p244t1.AbstractC4613d
            /* renamed from: c */
            public void mo6991c() {
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1288a.this.f5732a.consume(new C6043a());
        }
    }

    public C1288a(C4612c c4612c, Timer timer) {
        this.f5736e = timer;
        this.f5732a = new C4615f(timer, c4612c, "jq_callback");
        this.f5734c = c4612c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6973e(C4811d c4811d) {
        c4811d.m18979c().onCancelled(c4811d.m18980d());
        m6982t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m6974f(C4809b c4809b) {
        int m18971e = c4809b.m18971e();
        if (m18971e == 1) {
            m6977l(c4809b.m18969c());
            return;
        }
        if (m18971e == 2) {
            m6980r(c4809b.m18969c(), c4809b.m18970d());
            return;
        }
        if (m18971e == 3) {
            m6978n(c4809b.m18969c(), c4809b.m18972f());
        } else if (m18971e == 4) {
            m6979p(c4809b.m18969c());
        } else {
            if (m18971e != 5) {
                return;
            }
            m6976i(c4809b.m18969c(), c4809b.m18970d());
        }
    }

    /* renamed from: g */
    private boolean m6975g() {
        return this.f5735d.get() > 0;
    }

    /* renamed from: i */
    private void m6976i(AbstractC1292e abstractC1292e, int i10) {
        Iterator<JobManagerCallback> it = this.f5733b.iterator();
        while (it.hasNext()) {
            it.next().onAfterJobRun(abstractC1292e, i10);
        }
    }

    /* renamed from: l */
    private void m6977l(AbstractC1292e abstractC1292e) {
        Iterator<JobManagerCallback> it = this.f5733b.iterator();
        while (it.hasNext()) {
            it.next().onJobAdded(abstractC1292e);
        }
    }

    /* renamed from: n */
    private void m6978n(AbstractC1292e abstractC1292e, boolean z10) {
        Iterator<JobManagerCallback> it = this.f5733b.iterator();
        while (it.hasNext()) {
            it.next().onJobCancelled(abstractC1292e, z10);
        }
    }

    /* renamed from: p */
    private void m6979p(AbstractC1292e abstractC1292e) {
        Iterator<JobManagerCallback> it = this.f5733b.iterator();
        while (it.hasNext()) {
            it.next().onDone(abstractC1292e);
        }
    }

    /* renamed from: r */
    private void m6980r(AbstractC1292e abstractC1292e, int i10) {
        Iterator<JobManagerCallback> it = this.f5733b.iterator();
        while (it.hasNext()) {
            it.next().onJobRun(abstractC1292e, i10);
        }
    }

    /* renamed from: s */
    private void m6981s() {
        new Thread(new a(), "job-manager-callbacks").start();
    }

    /* renamed from: t */
    private void m6982t() {
        if (this.f5737f.getAndSet(true)) {
            return;
        }
        m6981s();
    }

    /* renamed from: h */
    public void m6983h(AbstractC1292e abstractC1292e, int i10) {
        if (m6975g()) {
            C4809b c4809b = (C4809b) this.f5734c.m18706a(C4809b.class);
            c4809b.m18974h(abstractC1292e, 5, i10);
            this.f5732a.post(c4809b);
        }
    }

    /* renamed from: j */
    public void m6984j(CancelResult cancelResult, CancelResult.AsyncCancelCallback asyncCancelCallback) {
        C4811d c4811d = (C4811d) this.f5734c.m18706a(C4811d.class);
        c4811d.m18981e(asyncCancelCallback, cancelResult);
        this.f5732a.post(c4811d);
        m6982t();
    }

    /* renamed from: k */
    public void m6985k(AbstractC1292e abstractC1292e) {
        if (m6975g()) {
            C4809b c4809b = (C4809b) this.f5734c.m18706a(C4809b.class);
            c4809b.m18973g(abstractC1292e, 1);
            this.f5732a.post(c4809b);
        }
    }

    /* renamed from: m */
    public void m6986m(AbstractC1292e abstractC1292e, boolean z10) {
        if (m6975g()) {
            C4809b c4809b = (C4809b) this.f5734c.m18706a(C4809b.class);
            c4809b.m18975i(abstractC1292e, 3, z10);
            this.f5732a.post(c4809b);
        }
    }

    /* renamed from: o */
    public void m6987o(AbstractC1292e abstractC1292e) {
        if (m6975g()) {
            C4809b c4809b = (C4809b) this.f5734c.m18706a(C4809b.class);
            c4809b.m18973g(abstractC1292e, 4);
            this.f5732a.post(c4809b);
        }
    }

    /* renamed from: q */
    public void m6988q(AbstractC1292e abstractC1292e, int i10) {
        if (m6975g()) {
            C4809b c4809b = (C4809b) this.f5734c.m18706a(C4809b.class);
            c4809b.m18974h(abstractC1292e, 2, i10);
            this.f5732a.post(c4809b);
        }
    }
}
