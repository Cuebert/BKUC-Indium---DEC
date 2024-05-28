package androidx.core.os;

import android.os.CancellationSignal;

/* renamed from: androidx.core.os.b */
/* loaded from: classes.dex */
public final class C0623b {

    /* renamed from: a */
    private boolean f3383a;

    /* renamed from: b */
    private b f3384b;

    /* renamed from: c */
    private Object f3385c;

    /* renamed from: d */
    private boolean f3386d;

    /* renamed from: androidx.core.os.b$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3340a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        static CancellationSignal m3341b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: androidx.core.os.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo3342a();
    }

    /* renamed from: d */
    private void m3336d() {
        while (this.f3386d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m3337a() {
        synchronized (this) {
            if (this.f3383a) {
                return;
            }
            this.f3383a = true;
            this.f3386d = true;
            b bVar = this.f3384b;
            Object obj = this.f3385c;
            if (bVar != null) {
                try {
                    bVar.mo3342a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f3386d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.m3340a(obj);
            }
            synchronized (this) {
                this.f3386d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m3338b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f3383a;
        }
        return z10;
    }

    /* renamed from: c */
    public void m3339c(b bVar) {
        synchronized (this) {
            m3336d();
            if (this.f3384b == bVar) {
                return;
            }
            this.f3384b = bVar;
            if (this.f3383a && bVar != null) {
                bVar.mo3342a();
            }
        }
    }
}
