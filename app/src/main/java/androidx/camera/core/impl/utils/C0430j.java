package androidx.camera.core.impl.utils;

/* renamed from: androidx.camera.core.impl.utils.j */
/* loaded from: classes.dex */
final class C0430j {

    /* renamed from: a */
    private final long f1980a;

    /* renamed from: b */
    private final long f1981b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0430j(long j10, long j11) {
        this.f1980a = j10;
        this.f1981b = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m2116a() {
        return this.f1981b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m2117b() {
        return this.f1980a;
    }

    public String toString() {
        return this.f1980a + "/" + this.f1981b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0430j(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
