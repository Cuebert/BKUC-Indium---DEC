package p183o1;

import com.birbit.android.jobqueue.JobQueue;
import com.birbit.android.jobqueue.QueueFactory;
import com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue;
import p196p1.C4213a;
import p208q1.C4292a;
import p220r1.C4418a;

/* renamed from: o1.b */
/* loaded from: classes.dex */
public class C4116b implements QueueFactory {

    /* renamed from: a */
    SqliteJobQueue.JobSerializer f16788a = new SqliteJobQueue.C1299c();

    @Override // com.birbit.android.jobqueue.QueueFactory
    public JobQueue createNonPersistent(C4292a c4292a, long j10) {
        return new C4213a(new C4418a(c4292a, j10));
    }

    @Override // com.birbit.android.jobqueue.QueueFactory
    public JobQueue createPersistentQueue(C4292a c4292a, long j10) {
        return new C4213a(new SqliteJobQueue(c4292a, j10, this.f16788a));
    }
}
