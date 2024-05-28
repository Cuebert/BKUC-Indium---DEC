package p258u2;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p082g1.AbstractC3227a;
import p295x2.AbstractC5511f;
import p308y2.InterfaceC5622l;

/* renamed from: u2.e */
/* loaded from: classes.dex */
public final class C4823e extends AbstractC3227a implements InterfaceC5622l {

    /* renamed from: p */
    private final Semaphore f18699p;

    /* renamed from: q */
    private final Set f18700q;

    public C4823e(Context context, Set set) {
        super(context);
        this.f18699p = new Semaphore(0);
        this.f18700q = set;
    }

    @Override // p082g1.AbstractC3227a
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo14416A() {
        Iterator it = this.f18700q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((AbstractC5511f) it.next()).m20285e(this)) {
                i10++;
            }
        }
        try {
            this.f18699p.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p082g1.C3228b
    /* renamed from: o */
    protected final void mo14441o() {
        this.f18699p.drainPermits();
        m14436h();
    }
}
