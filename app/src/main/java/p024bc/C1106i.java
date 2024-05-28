package p024bc;

/* renamed from: bc.i */
/* loaded from: classes.dex */
final class C1106i {

    /* renamed from: a */
    private C1105h f5413a;

    /* renamed from: b */
    private C1105h f5414b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m6477a(C1105h c1105h) {
        try {
            if (c1105h != null) {
                C1105h c1105h2 = this.f5414b;
                if (c1105h2 != null) {
                    c1105h2.f5412c = c1105h;
                    this.f5414b = c1105h;
                } else if (this.f5413a == null) {
                    this.f5414b = c1105h;
                    this.f5413a = c1105h;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C1105h m6478b() {
        C1105h c1105h;
        c1105h = this.f5413a;
        if (c1105h != null) {
            C1105h c1105h2 = c1105h.f5412c;
            this.f5413a = c1105h2;
            if (c1105h2 == null) {
                this.f5414b = null;
            }
        }
        return c1105h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C1105h m6479c(int i10) throws InterruptedException {
        if (this.f5413a == null) {
            wait(i10);
        }
        return m6478b();
    }
}
