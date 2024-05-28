package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.scheduling.Scheduler;
import java.util.concurrent.TimeUnit;
import p208q1.C4292a;
import p244t1.C4612c;
import p244t1.C4614e;
import p257u1.C4808a;
import p257u1.C4818k;
import p269v1.C4938a;

/* renamed from: com.birbit.android.jobqueue.g */
/* loaded from: classes.dex */
public class C1294g {

    /* renamed from: e */
    public static final long f5819e = TimeUnit.MILLISECONDS.toNanos(10000);

    /* renamed from: a */
    final RunnableC1295h f5820a;

    /* renamed from: b */
    private final C4614e f5821b;

    /* renamed from: c */
    private final C4612c f5822c;

    /* renamed from: d */
    private Thread f5823d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.birbit.android.jobqueue.g$a */
    /* loaded from: classes.dex */
    public class a implements Scheduler.Callback {
        a() {
        }

        @Override // com.birbit.android.jobqueue.scheduling.Scheduler.Callback
        public boolean start(C4938a c4938a) {
            C1294g.this.m7098e(c4938a);
            return true;
        }

        @Override // com.birbit.android.jobqueue.scheduling.Scheduler.Callback
        public boolean stop(C4938a c4938a) {
            C1294g.this.m7099f(c4938a);
            return false;
        }
    }

    public C1294g(C4292a c4292a) {
        C4612c c4612c = new C4612c();
        this.f5822c = c4612c;
        C4614e c4614e = new C4614e(c4292a.m17802n(), c4612c);
        this.f5821b = c4614e;
        RunnableC1295h runnableC1295h = new RunnableC1295h(c4292a, c4614e, c4612c);
        this.f5820a = runnableC1295h;
        this.f5823d = new Thread(runnableC1295h, "job-manager");
        if (c4292a.m17800l() != null) {
            c4292a.m17800l().mo7186b(c4292a.m17790b(), m7097d());
        }
        this.f5823d.start();
    }

    /* renamed from: d */
    private Scheduler.Callback m7097d() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m7098e(C4938a c4938a) {
        C4818k c4818k = (C4818k) this.f5822c.m18706a(C4818k.class);
        c4818k.m19001e(1, c4938a);
        this.f5821b.post(c4818k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m7099f(C4938a c4938a) {
        C4818k c4818k = (C4818k) this.f5822c.m18706a(C4818k.class);
        c4818k.m19001e(2, c4938a);
        this.f5821b.post(c4818k);
    }

    /* renamed from: c */
    public void m7100c(AbstractC1292e abstractC1292e) {
        C4808a c4808a = (C4808a) this.f5822c.m18706a(C4808a.class);
        c4808a.m18968d(abstractC1292e);
        this.f5821b.post(c4808a);
    }
}
