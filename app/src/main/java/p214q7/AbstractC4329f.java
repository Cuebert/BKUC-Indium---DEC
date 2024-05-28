package p214q7;

import android.os.Handler;
import android.os.Looper;
import com.birbit.android.jobqueue.AbstractC1292e;
import p183o1.C4118d;
import p183o1.C4119e;

/* renamed from: q7.f */
/* loaded from: classes.dex */
public abstract class AbstractC4329f extends AbstractC1292e {

    /* renamed from: E */
    private static Handler f17582E;

    /* renamed from: C */
    private final String f17583C;

    /* renamed from: D */
    private Throwable f17584D;

    /* renamed from: q7.f$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public int f17585a;

        /* renamed from: b */
        public Throwable f17586b;

        public a(int i10, Throwable th) {
            this.f17585a = i10;
            this.f17586b = th;
        }
    }

    public AbstractC4329f() {
        this(m17857u());
    }

    /* renamed from: u */
    public static C4118d m17857u() {
        return new C4118d(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static Handler m17858v() {
        if (f17582E == null) {
            synchronized (AbstractC4329f.class) {
                if (f17582E == null) {
                    f17582E = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f17582E;
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: l */
    public void mo7048l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: m */
    public void mo7049m(int i10) {
        mo17841w(new a(i10, this.f17584D));
    }

    @Override // com.birbit.android.jobqueue.AbstractC1292e
    /* renamed from: t */
    protected C4119e mo7056t(Throwable th, int i10, int i11) {
        this.f17584D = th;
        return C4119e.f16803f;
    }

    /* renamed from: w */
    protected abstract void mo17841w(a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4329f(C4118d c4118d) {
        super(c4118d);
        this.f17583C = "RobloxJob";
        this.f17584D = null;
    }
}
