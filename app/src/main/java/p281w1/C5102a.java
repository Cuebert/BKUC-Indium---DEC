package p281w1;

import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.TimeUnit;
import p233s1.C4516a;

/* renamed from: w1.a */
/* loaded from: classes.dex */
public class C5102a implements Timer {

    /* renamed from: a */
    final long f19363a;

    /* renamed from: b */
    final long f19364b;

    public C5102a() {
        C4516a.m18533b("creating system timer", new Object[0]);
        this.f19363a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f19364b = System.nanoTime();
    }

    @Override // com.birbit.android.jobqueue.timer.Timer
    public long nanoTime() {
        return (System.nanoTime() - this.f19364b) + this.f19363a;
    }

    @Override // com.birbit.android.jobqueue.timer.Timer
    public void notifyObject(Object obj) {
        obj.notifyAll();
    }

    @Override // com.birbit.android.jobqueue.timer.Timer
    public void waitOnObject(Object obj) throws InterruptedException {
        obj.wait();
    }

    @Override // com.birbit.android.jobqueue.timer.Timer
    public void waitOnObjectUntilNs(Object obj, long j10) throws InterruptedException {
        long nanoTime = nanoTime();
        if (nanoTime > j10) {
            obj.wait(1L);
        } else {
            TimeUnit.NANOSECONDS.timedWait(obj, j10 - nanoTime);
        }
    }
}
