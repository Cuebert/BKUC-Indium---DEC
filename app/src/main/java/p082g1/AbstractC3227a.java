package p082g1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.C0631j;
import androidx.core.util.C0655i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public abstract class AbstractC3227a<D> extends C3228b<D> {

    /* renamed from: j */
    private final Executor f13616j;

    /* renamed from: k */
    volatile AbstractC3227a<D>.a f13617k;

    /* renamed from: l */
    volatile AbstractC3227a<D>.a f13618l;

    /* renamed from: m */
    long f13619m;

    /* renamed from: n */
    long f13620n;

    /* renamed from: o */
    Handler f13621o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1.a$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractC3229c<Void, Void, D> implements Runnable {

        /* renamed from: x */
        private final CountDownLatch f13622x = new CountDownLatch(1);

        /* renamed from: y */
        boolean f13623y;

        a() {
        }

        @Override // p082g1.AbstractC3229c
        /* renamed from: h */
        protected void mo14427h(D d10) {
            try {
                AbstractC3227a.this.m14423x(this, d10);
            } finally {
                this.f13622x.countDown();
            }
        }

        @Override // p082g1.AbstractC3229c
        /* renamed from: i */
        protected void mo14428i(D d10) {
            try {
                AbstractC3227a.this.m14424y(this, d10);
            } finally {
                this.f13622x.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p082g1.AbstractC3229c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public D mo14426b(Void... voidArr) {
            try {
                return (D) AbstractC3227a.this.m14418C();
            } catch (C0631j e10) {
                if (m14454f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13623y = false;
            AbstractC3227a.this.m14425z();
        }
    }

    public AbstractC3227a(Context context) {
        this(context, AbstractC3229c.f13636u);
    }

    /* renamed from: A */
    public abstract D mo14416A();

    /* renamed from: B */
    public void m14417B(D d10) {
    }

    /* renamed from: C */
    protected D m14418C() {
        return mo14416A();
    }

    @Override // p082g1.C3228b
    @Deprecated
    /* renamed from: g */
    public void mo14419g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo14419g(str, fileDescriptor, printWriter, strArr);
        if (this.f13617k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13617k);
            printWriter.print(" waiting=");
            printWriter.println(this.f13617k.f13623y);
        }
        if (this.f13618l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13618l);
            printWriter.print(" waiting=");
            printWriter.println(this.f13618l.f13623y);
        }
        if (this.f13619m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0655i.m3473c(this.f13619m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0655i.m3472b(this.f13620n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p082g1.C3228b
    /* renamed from: k */
    protected boolean mo14420k() {
        if (this.f13617k == null) {
            return false;
        }
        if (!this.f13629e) {
            this.f13632h = true;
        }
        if (this.f13618l != null) {
            if (this.f13617k.f13623y) {
                this.f13617k.f13623y = false;
                this.f13621o.removeCallbacks(this.f13617k);
            }
            this.f13617k = null;
            return false;
        }
        if (this.f13617k.f13623y) {
            this.f13617k.f13623y = false;
            this.f13621o.removeCallbacks(this.f13617k);
            this.f13617k = null;
            return false;
        }
        boolean m14451a = this.f13617k.m14451a(false);
        if (m14451a) {
            this.f13618l = this.f13617k;
            m14422w();
        }
        this.f13617k = null;
        return m14451a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p082g1.C3228b
    /* renamed from: m */
    public void mo14421m() {
        super.mo14421m();
        m14431b();
        this.f13617k = new a();
        m14425z();
    }

    /* renamed from: w */
    public void m14422w() {
    }

    /* renamed from: x */
    void m14423x(AbstractC3227a<D>.a aVar, D d10) {
        m14417B(d10);
        if (this.f13618l == aVar) {
            m14445s();
            this.f13620n = SystemClock.uptimeMillis();
            this.f13618l = null;
            m14434e();
            m14425z();
        }
    }

    /* renamed from: y */
    void m14424y(AbstractC3227a<D>.a aVar, D d10) {
        if (this.f13617k != aVar) {
            m14423x(aVar, d10);
            return;
        }
        if (m14437i()) {
            m14417B(d10);
            return;
        }
        m14432c();
        this.f13620n = SystemClock.uptimeMillis();
        this.f13617k = null;
        m14435f(d10);
    }

    /* renamed from: z */
    void m14425z() {
        if (this.f13618l != null || this.f13617k == null) {
            return;
        }
        if (this.f13617k.f13623y) {
            this.f13617k.f13623y = false;
            this.f13621o.removeCallbacks(this.f13617k);
        }
        if (this.f13619m > 0 && SystemClock.uptimeMillis() < this.f13620n + this.f13619m) {
            this.f13617k.f13623y = true;
            this.f13621o.postAtTime(this.f13617k, this.f13620n + this.f13619m);
        } else {
            this.f13617k.m14452c(this.f13616j, null);
        }
    }

    private AbstractC3227a(Context context, Executor executor) {
        super(context);
        this.f13620n = -10000L;
        this.f13616j = executor;
    }
}
