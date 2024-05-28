package p196p1;

import com.birbit.android.jobqueue.C1290c;
import com.birbit.android.jobqueue.C1293f;
import com.birbit.android.jobqueue.JobQueue;
import java.util.Set;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public class C4213a implements JobQueue {

    /* renamed from: a */
    JobQueue f17407a;

    /* renamed from: b */
    private Integer f17408b;

    public C4213a(JobQueue jobQueue) {
        this.f17407a = jobQueue;
    }

    /* renamed from: a */
    private void m17637a() {
        this.f17408b = null;
    }

    /* renamed from: b */
    private boolean m17638b() {
        Integer num = this.f17408b;
        return num != null && num.intValue() == 0;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void clear() {
        m17637a();
        this.f17407a.clear();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public int count() {
        if (this.f17408b == null) {
            this.f17408b = Integer.valueOf(this.f17407a.count());
        }
        return this.f17408b.intValue();
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public int countReadyJobs(C1290c c1290c) {
        if (m17638b()) {
            return 0;
        }
        return this.f17407a.countReadyJobs(c1290c);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public C1293f findJobById(String str) {
        return this.f17407a.findJobById(str);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public Set<C1293f> findJobs(C1290c c1290c) {
        return this.f17407a.findJobs(c1290c);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public Long getNextJobDelayUntilNs(C1290c c1290c) {
        return this.f17407a.getNextJobDelayUntilNs(c1290c);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public boolean insert(C1293f c1293f) {
        m17637a();
        return this.f17407a.insert(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public boolean insertOrReplace(C1293f c1293f) {
        m17637a();
        return this.f17407a.insertOrReplace(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public C1293f nextJobAndIncRunCount(C1290c c1290c) {
        Integer num;
        if (m17638b()) {
            return null;
        }
        C1293f nextJobAndIncRunCount = this.f17407a.nextJobAndIncRunCount(c1290c);
        if (nextJobAndIncRunCount != null && (num = this.f17408b) != null) {
            this.f17408b = Integer.valueOf(num.intValue() - 1);
        }
        return nextJobAndIncRunCount;
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void onJobCancelled(C1293f c1293f) {
        m17637a();
        this.f17407a.onJobCancelled(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void remove(C1293f c1293f) {
        m17637a();
        this.f17407a.remove(c1293f);
    }

    @Override // com.birbit.android.jobqueue.JobQueue
    public void substitute(C1293f c1293f, C1293f c1293f2) {
        m17637a();
        this.f17407a.substitute(c1293f, c1293f2);
    }
}
