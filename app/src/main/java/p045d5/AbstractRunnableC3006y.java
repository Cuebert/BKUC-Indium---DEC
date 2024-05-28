package p045d5;

import p085g4.C3265m;

/* renamed from: d5.y */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC3006y implements Runnable {

    /* renamed from: n */
    private final C3265m f12695n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC3006y() {
        this.f12695n = null;
    }

    public AbstractRunnableC3006y(C3265m c3265m) {
        this.f12695n = c3265m;
    }

    /* renamed from: a */
    public void mo6279a(Exception exc) {
        C3265m c3265m = this.f12695n;
        if (c3265m != null) {
            c3265m.m14515d(exc);
        }
    }

    /* renamed from: b */
    protected abstract void mo6274b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3265m m13480c() {
        return this.f12695n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo6274b();
        } catch (Exception e10) {
            mo6279a(e10);
        }
    }
}
