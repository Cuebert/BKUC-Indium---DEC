package p205pb;

/* renamed from: pb.b */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC4283b implements Runnable {

    /* renamed from: n */
    protected final String f17487n;

    public AbstractRunnableC4283b(String str, Object... objArr) {
        this.f17487n = C4286e.m17753q(str, objArr);
    }

    /* renamed from: k */
    protected abstract void mo17385k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f17487n);
        try {
            mo17385k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
