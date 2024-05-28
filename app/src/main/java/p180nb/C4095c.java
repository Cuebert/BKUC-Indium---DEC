package p180nb;

/* renamed from: nb.c */
/* loaded from: classes.dex */
public final class C4095c extends C4098f {

    /* renamed from: v */
    public static final C4095c f16648v = new C4095c();

    private C4095c() {
        super(C4104l.f16661c, C4104l.f16662d, C4104l.f16663e, C4104l.f16659a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p145kb.AbstractC3826v
    public String toString() {
        return "Dispatchers.Default";
    }
}
