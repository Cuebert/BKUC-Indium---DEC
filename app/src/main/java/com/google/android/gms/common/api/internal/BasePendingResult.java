package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p222r3.HandlerC4427f;
import p295x2.AbstractC5511f;
import p295x2.AbstractC5513h;
import p295x2.InterfaceC5515j;
import p295x2.InterfaceC5518m;
import p295x2.InterfaceC5519n;
import p321z2.C5984j;
import p321z2.InterfaceC5972d;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends InterfaceC5518m> extends AbstractC5513h<R> {

    /* renamed from: o */
    static final ThreadLocal<Boolean> f6137o = new C1357f0();

    /* renamed from: p */
    public static final /* synthetic */ int f6138p = 0;

    /* renamed from: a */
    private final Object f6139a;

    /* renamed from: b */
    protected final HandlerC1345a<R> f6140b;

    /* renamed from: c */
    protected final WeakReference<AbstractC5511f> f6141c;

    /* renamed from: d */
    private final CountDownLatch f6142d;

    /* renamed from: e */
    private final ArrayList<AbstractC5513h.a> f6143e;

    /* renamed from: f */
    private InterfaceC5519n<? super R> f6144f;

    /* renamed from: g */
    private final AtomicReference<C1375w> f6145g;

    /* renamed from: h */
    private R f6146h;

    /* renamed from: i */
    private Status f6147i;

    /* renamed from: j */
    private volatile boolean f6148j;

    /* renamed from: k */
    private boolean f6149k;

    /* renamed from: l */
    private boolean f6150l;

    /* renamed from: m */
    private InterfaceC5972d f6151m;

    @KeepName
    private C1359g0 mResultGuardian;

    /* renamed from: n */
    private boolean f6152n;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: classes.dex */
    public static class HandlerC1345a<R extends InterfaceC5518m> extends HandlerC4427f {
        public HandlerC1345a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m7428a(InterfaceC5519n<? super R> interfaceC5519n, R r10) {
            int i10 = BasePendingResult.f6138p;
            sendMessage(obtainMessage(1, new Pair((InterfaceC5519n) C5984j.m21286j(interfaceC5519n), r10)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                InterfaceC5519n interfaceC5519n = (InterfaceC5519n) pair.first;
                InterfaceC5518m interfaceC5518m = (InterfaceC5518m) pair.second;
                try {
                    interfaceC5519n.m20293a(interfaceC5518m);
                    return;
                } catch (RuntimeException e10) {
                    BasePendingResult.m7420l(interfaceC5518m);
                    throw e10;
                }
            }
            if (i10 != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i10);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
                return;
            }
            ((BasePendingResult) message.obj).m7424e(Status.f6128w);
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f6139a = new Object();
        this.f6142d = new CountDownLatch(1);
        this.f6143e = new ArrayList<>();
        this.f6145g = new AtomicReference<>();
        this.f6152n = false;
        this.f6140b = new HandlerC1345a<>(Looper.getMainLooper());
        this.f6141c = new WeakReference<>(null);
    }

    /* renamed from: h */
    private final R m7417h() {
        R r10;
        synchronized (this.f6139a) {
            C5984j.m21290n(!this.f6148j, "Result has already been consumed.");
            C5984j.m21290n(m7425f(), "Result is not ready.");
            r10 = this.f6146h;
            this.f6146h = null;
            this.f6144f = null;
            this.f6148j = true;
        }
        if (this.f6145g.getAndSet(null) == null) {
            return (R) C5984j.m21286j(r10);
        }
        throw null;
    }

    /* renamed from: i */
    private final void m7418i(R r10) {
        this.f6146h = r10;
        this.f6147i = r10.mo7413q();
        this.f6151m = null;
        this.f6142d.countDown();
        if (this.f6149k) {
            this.f6144f = null;
        } else {
            InterfaceC5519n<? super R> interfaceC5519n = this.f6144f;
            if (interfaceC5519n == null) {
                if (this.f6146h instanceof InterfaceC5515j) {
                    this.mResultGuardian = new C1359g0(this, null);
                }
            } else {
                this.f6140b.removeMessages(2);
                this.f6140b.m7428a(interfaceC5519n, m7417h());
            }
        }
        ArrayList<AbstractC5513h.a> arrayList = this.f6143e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).mo7508a(this.f6147i);
        }
        this.f6143e.clear();
    }

    /* renamed from: l */
    public static void m7420l(InterfaceC5518m interfaceC5518m) {
        if (interfaceC5518m instanceof InterfaceC5515j) {
            try {
                ((InterfaceC5515j) interfaceC5518m).m20289a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC5518m)), e10);
            }
        }
    }

    @Override // p295x2.AbstractC5513h
    /* renamed from: b */
    public final void mo7421b(AbstractC5513h.a aVar) {
        C5984j.m21278b(aVar != null, "Callback cannot be null.");
        synchronized (this.f6139a) {
            if (m7425f()) {
                aVar.mo7508a(this.f6147i);
            } else {
                this.f6143e.add(aVar);
            }
        }
    }

    @Override // p295x2.AbstractC5513h
    /* renamed from: c */
    public final R mo7422c(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            C5984j.m21285i("await must not be called on the UI thread when time is greater than zero.");
        }
        C5984j.m21290n(!this.f6148j, "Result has already been consumed.");
        C5984j.m21290n(true, "Cannot await if then() has been called.");
        try {
            if (!this.f6142d.await(j10, timeUnit)) {
                m7424e(Status.f6128w);
            }
        } catch (InterruptedException unused) {
            m7424e(Status.f6126u);
        }
        C5984j.m21290n(m7425f(), "Result is not ready.");
        return m7417h();
    }

    /* renamed from: d */
    public abstract R mo7423d(Status status);

    @Deprecated
    /* renamed from: e */
    public final void m7424e(Status status) {
        synchronized (this.f6139a) {
            if (!m7425f()) {
                m7426g(mo7423d(status));
                this.f6150l = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean m7425f() {
        return this.f6142d.getCount() == 0;
    }

    /* renamed from: g */
    public final void m7426g(R r10) {
        synchronized (this.f6139a) {
            if (!this.f6150l && !this.f6149k) {
                m7425f();
                C5984j.m21290n(!m7425f(), "Results have already been set");
                C5984j.m21290n(!this.f6148j, "Result has already been consumed");
                m7418i(r10);
                return;
            }
            m7420l(r10);
        }
    }

    /* renamed from: k */
    public final void m7427k() {
        boolean z10 = true;
        if (!this.f6152n && !f6137o.get().booleanValue()) {
            z10 = false;
        }
        this.f6152n = z10;
    }

    public BasePendingResult(AbstractC5511f abstractC5511f) {
        this.f6139a = new Object();
        this.f6142d = new CountDownLatch(1);
        this.f6143e = new ArrayList<>();
        this.f6145g = new AtomicReference<>();
        this.f6152n = false;
        this.f6140b = new HandlerC1345a<>(abstractC5511f != null ? abstractC5511f.mo20284d() : Looper.getMainLooper());
        this.f6141c = new WeakReference<>(abstractC5511f);
    }
}
