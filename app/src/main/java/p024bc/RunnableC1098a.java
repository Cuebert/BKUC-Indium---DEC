package p024bc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bc.a */
/* loaded from: classes.dex */
public class RunnableC1098a implements Runnable {

    /* renamed from: n */
    private final C1106i f5359n = new C1106i();

    /* renamed from: o */
    private final C1100c f5360o;

    public RunnableC1098a(C1100c c1100c) {
        this.f5360o = c1100c;
    }

    /* renamed from: a */
    public void m6453a(C1111n c1111n, Object obj) {
        this.f5359n.m6477a(C1105h.m6475a(c1111n, obj));
        this.f5360o.m6466e().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        C1105h m6478b = this.f5359n.m6478b();
        if (m6478b != null) {
            this.f5360o.m6467g(m6478b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
