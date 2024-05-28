package p246t3;

/* renamed from: t3.u2 */
/* loaded from: classes.dex */
public final class C4710u2 {

    /* renamed from: a */
    private final byte f18512a;

    /* renamed from: b */
    private final byte f18513b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4710u2(int i10) {
        this.f18512a = (byte) (i10 & 224);
        this.f18513b = (byte) (i10 & 31);
    }

    /* renamed from: a */
    public final byte m18834a() {
        return this.f18513b;
    }

    /* renamed from: b */
    public final byte m18835b() {
        return this.f18512a;
    }

    /* renamed from: c */
    public final int m18836c() {
        return (this.f18512a >> 5) & 7;
    }
}
