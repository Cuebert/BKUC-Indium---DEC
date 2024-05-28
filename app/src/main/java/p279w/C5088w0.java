package p279w;

import android.view.Surface;
import androidx.concurrent.futures.C0541c;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p279w.AbstractC5073r0;
import p305y.C5586f;
import p305y.InterfaceC5583c;

/* renamed from: w.w0 */
/* loaded from: classes.dex */
public final class C5088w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.w0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC5583c<List<Surface>> {

        /* renamed from: a */
        final /* synthetic */ boolean f19340a;

        /* renamed from: b */
        final /* synthetic */ C0541c.a f19341b;

        /* renamed from: c */
        final /* synthetic */ ScheduledFuture f19342c;

        a(boolean z10, C0541c.a aVar, ScheduledFuture scheduledFuture) {
            this.f19340a = z10;
            this.f19341b = aVar;
            this.f19342c = scheduledFuture;
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: a */
        public void mo1361a(Throwable th) {
            this.f19341b.m2519c(Collections.unmodifiableList(Collections.emptyList()));
            this.f19342c.cancel(true);
        }

        @Override // p305y.InterfaceC5583c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f19340a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f19341b.m2519c(arrayList);
            this.f19342c.cancel(true);
        }
    }

    /* renamed from: e */
    public static void m19710e(List<AbstractC5073r0> list) {
        Iterator<AbstractC5073r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().m19677d();
        }
    }

    /* renamed from: f */
    public static void m19711f(List<AbstractC5073r0> list) throws AbstractC5073r0.a {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).m19683j();
                i10++;
            } catch (AbstractC5073r0.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).m19677d();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m19712g(InterfaceFutureC2565m interfaceFutureC2565m, C0541c.a aVar, long j10) {
        if (interfaceFutureC2565m.isDone()) {
            return;
        }
        aVar.m2521f(new TimeoutException("Cannot complete surfaceList within " + j10));
        interfaceFutureC2565m.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m19713h(Executor executor, final InterfaceFutureC2565m interfaceFutureC2565m, final C0541c.a aVar, final long j10) {
        executor.execute(new Runnable() { // from class: w.u0
            @Override // java.lang.Runnable
            public final void run() {
                C5088w0.m19712g(InterfaceFutureC2565m.this, aVar, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Object m19715j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j10, boolean z10, final C0541c.a aVar) throws Exception {
        final InterfaceFutureC2565m m20514n = C5586f.m20514n(list);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: w.v0
            @Override // java.lang.Runnable
            public final void run() {
                C5088w0.m19713h(executor, m20514n, aVar, j10);
            }
        }, j10, TimeUnit.MILLISECONDS);
        aVar.m2517a(new Runnable() { // from class: w.t0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceFutureC2565m.this.cancel(true);
            }
        }, executor);
        C5586f.m20502b(m20514n, new a(z10, aVar, schedule), executor);
        return "surfaceList";
    }

    /* renamed from: k */
    public static InterfaceFutureC2565m<List<Surface>> m19716k(Collection<AbstractC5073r0> collection, final boolean z10, final long j10, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<AbstractC5073r0> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C5586f.m20510j(it.next().m19681h()));
        }
        return C0541c.m2515a(new C0541c.c() { // from class: w.s0
            @Override // androidx.concurrent.futures.C0541c.c
            /* renamed from: a */
            public final Object mo1498a(C0541c.a aVar) {
                Object m19715j;
                m19715j = C5088w0.m19715j(arrayList, scheduledExecutorService, executor, j10, z10, aVar);
                return m19715j;
            }
        });
    }
}
