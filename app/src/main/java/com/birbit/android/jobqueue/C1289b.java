package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.CancelResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p183o1.EnumC4121g;
import p233s1.C4516a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.birbit.android.jobqueue.b */
/* loaded from: classes.dex */
public class C1289b {

    /* renamed from: a */
    private Set<String> f5741a;

    /* renamed from: b */
    private final EnumC4121g f5742b;

    /* renamed from: c */
    private final String[] f5743c;

    /* renamed from: d */
    private final Collection<C1293f> f5744d = new ArrayList();

    /* renamed from: e */
    private final Collection<C1293f> f5745e = new ArrayList();

    /* renamed from: f */
    private final CancelResult.AsyncCancelCallback f5746f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1289b(EnumC4121g enumC4121g, String[] strArr, CancelResult.AsyncCancelCallback asyncCancelCallback) {
        this.f5742b = enumC4121g;
        this.f5743c = strArr;
        this.f5746f = asyncCancelCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6992a(RunnableC1295h runnableC1295h) {
        for (C1293f c1293f : this.f5744d) {
            try {
                c1293f.m7079t(3);
            } catch (Throwable th) {
                C4516a.m18535d(th, "job's on cancel has thrown an exception. Ignoring...", new Object[0]);
            }
            if (c1293f.m7065f().m7047k()) {
                runnableC1295h.f5833r.remove(c1293f);
            }
        }
        if (this.f5746f != null) {
            ArrayList arrayList = new ArrayList(this.f5744d.size());
            ArrayList arrayList2 = new ArrayList(this.f5745e.size());
            Iterator<C1293f> it = this.f5744d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m7065f());
            }
            Iterator<C1293f> it2 = this.f5745e.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().m7065f());
            }
            runnableC1295h.f5841z.m6984j(new CancelResult(arrayList, arrayList2), this.f5746f);
        }
        Iterator<C1293f> it3 = this.f5744d.iterator();
        while (it3.hasNext()) {
            runnableC1295h.f5841z.m6986m(it3.next().m7065f(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m6993b() {
        return this.f5741a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6994c(C1293f c1293f, int i10) {
        if (this.f5741a.remove(c1293f.m7063d())) {
            if (i10 == 3) {
                this.f5744d.add(c1293f);
            } else {
                this.f5745e.add(c1293f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6995d(RunnableC1295h runnableC1295h, C1291d c1291d) {
        this.f5741a = c1291d.m7028l(this.f5742b, this.f5743c);
        C1290c c1290c = runnableC1295h.f5840y;
        c1290c.m6996a();
        c1290c.m7008m(runnableC1295h.f5829n.nanoTime());
        c1290c.m7011p(this.f5742b);
        c1290c.m7005j(this.f5741a);
        c1290c.m7012q(this.f5743c);
        c1290c.m7006k(true);
        Set<C1293f> findJobs = runnableC1295h.f5833r.findJobs(c1290c);
        Set<C1293f> findJobs2 = runnableC1295h.f5832q.findJobs(c1290c);
        for (C1293f c1293f : findJobs) {
            c1293f.m7076q();
            this.f5744d.add(c1293f);
            runnableC1295h.f5833r.onJobCancelled(c1293f);
        }
        for (C1293f c1293f2 : findJobs2) {
            c1293f2.m7076q();
            this.f5744d.add(c1293f2);
            runnableC1295h.f5832q.onJobCancelled(c1293f2);
        }
    }
}
