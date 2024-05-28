package qa;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qa.C4346g0;
import qa.C4359t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.v */
/* loaded from: classes.dex */
public class C4361v extends ThreadPoolExecutor {

    /* renamed from: qa.v$a */
    /* loaded from: classes.dex */
    private static final class a extends FutureTask<RunnableC4337c> implements Comparable<a> {

        /* renamed from: n */
        private final RunnableC4337c f17784n;

        public a(RunnableC4337c runnableC4337c) {
            super(runnableC4337c, null);
            this.f17784n = runnableC4337c;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            C4359t.f m17912p = this.f17784n.m17912p();
            C4359t.f m17912p2 = aVar.f17784n.m17912p();
            return m17912p == m17912p2 ? this.f17784n.f17647n - aVar.f17784n.f17647n : m17912p2.ordinal() - m17912p.ordinal();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4361v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C4346g0.f());
    }

    /* renamed from: b */
    private void m18025b(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m18026a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    m18025b(3);
                    return;
                } else {
                    m18025b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m18025b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m18025b(3);
                            return;
                        default:
                            m18025b(3);
                            return;
                    }
            }
            m18025b(2);
            return;
        }
        m18025b(3);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((RunnableC4337c) runnable);
        execute(aVar);
        return aVar;
    }
}
