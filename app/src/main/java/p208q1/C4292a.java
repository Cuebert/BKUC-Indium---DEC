package p208q1;

import android.content.Context;
import com.birbit.android.jobqueue.QueueFactory;
import com.birbit.android.jobqueue.log.CustomLogger;
import com.birbit.android.jobqueue.network.C1296a;
import com.birbit.android.jobqueue.network.NetworkUtil;
import com.birbit.android.jobqueue.p037di.DependencyInjector;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.Timer;
import p183o1.C4116b;
import p281w1.C5102a;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public class C4292a {

    /* renamed from: a */
    String f17512a;

    /* renamed from: b */
    int f17513b;

    /* renamed from: c */
    int f17514c;

    /* renamed from: d */
    int f17515d;

    /* renamed from: e */
    int f17516e;

    /* renamed from: f */
    Context f17517f;

    /* renamed from: g */
    QueueFactory f17518g;

    /* renamed from: h */
    DependencyInjector f17519h;

    /* renamed from: i */
    NetworkUtil f17520i;

    /* renamed from: j */
    CustomLogger f17521j;

    /* renamed from: k */
    Timer f17522k;

    /* renamed from: l */
    Scheduler f17523l;

    /* renamed from: m */
    boolean f17524m;

    /* renamed from: n */
    boolean f17525n;

    /* renamed from: o */
    int f17526o;

    /* renamed from: p */
    boolean f17527p;

    /* renamed from: q1.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C4292a f17528a;

        public b(Context context) {
            C4292a c4292a = new C4292a();
            this.f17528a = c4292a;
            c4292a.f17517f = context.getApplicationContext();
        }

        /* renamed from: a */
        public C4292a m17805a() {
            C4292a c4292a = this.f17528a;
            if (c4292a.f17518g == null) {
                c4292a.f17518g = new C4116b();
            }
            C4292a c4292a2 = this.f17528a;
            if (c4292a2.f17520i == null) {
                c4292a2.f17520i = new C1296a(c4292a2.f17517f);
            }
            C4292a c4292a3 = this.f17528a;
            if (c4292a3.f17522k == null) {
                c4292a3.f17522k = new C5102a();
            }
            return this.f17528a;
        }

        /* renamed from: b */
        public b m17806b(int i10) {
            this.f17528a.f17515d = i10;
            return this;
        }

        /* renamed from: c */
        public b m17807c(CustomLogger customLogger) {
            this.f17528a.f17521j = customLogger;
            return this;
        }

        /* renamed from: d */
        public b m17808d(String str) {
            this.f17528a.f17512a = str;
            return this;
        }

        /* renamed from: e */
        public b m17809e(int i10) {
            this.f17528a.f17516e = i10;
            return this;
        }

        /* renamed from: f */
        public b m17810f(int i10) {
            this.f17528a.f17513b = i10;
            return this;
        }

        /* renamed from: g */
        public b m17811g(int i10) {
            this.f17528a.f17514c = i10;
            return this;
        }
    }

    /* renamed from: a */
    public boolean m17789a() {
        return this.f17527p;
    }

    /* renamed from: b */
    public Context m17790b() {
        return this.f17517f;
    }

    /* renamed from: c */
    public int m17791c() {
        return this.f17515d;
    }

    /* renamed from: d */
    public CustomLogger m17792d() {
        return this.f17521j;
    }

    /* renamed from: e */
    public DependencyInjector m17793e() {
        return this.f17519h;
    }

    /* renamed from: f */
    public String m17794f() {
        return this.f17512a;
    }

    /* renamed from: g */
    public int m17795g() {
        return this.f17516e;
    }

    /* renamed from: h */
    public int m17796h() {
        return this.f17513b;
    }

    /* renamed from: i */
    public int m17797i() {
        return this.f17514c;
    }

    /* renamed from: j */
    public NetworkUtil m17798j() {
        return this.f17520i;
    }

    /* renamed from: k */
    public QueueFactory m17799k() {
        return this.f17518g;
    }

    /* renamed from: l */
    public Scheduler m17800l() {
        return this.f17523l;
    }

    /* renamed from: m */
    public int m17801m() {
        return this.f17526o;
    }

    /* renamed from: n */
    public Timer m17802n() {
        return this.f17522k;
    }

    /* renamed from: o */
    public boolean m17803o() {
        return this.f17524m;
    }

    /* renamed from: p */
    public boolean m17804p() {
        return this.f17525n;
    }

    private C4292a() {
        this.f17512a = "default_job_manager";
        this.f17513b = 5;
        this.f17514c = 0;
        this.f17515d = 15;
        this.f17516e = 3;
        this.f17524m = false;
        this.f17525n = false;
        this.f17526o = 5;
        this.f17527p = true;
    }
}
