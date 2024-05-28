package p246t3;

/* renamed from: t3.c2 */
/* loaded from: classes.dex */
final class C4636c2 extends C4646e2 {

    /* renamed from: b */
    private final byte[] f18426b;

    /* renamed from: c */
    private int f18427c;

    /* renamed from: d */
    private int f18428d;

    /* renamed from: e */
    private int f18429e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4636c2(byte[] bArr, int i10, int i11, boolean z10, C4631b2 c4631b2) {
        super(null);
        this.f18429e = Integer.MAX_VALUE;
        this.f18426b = bArr;
        this.f18427c = 0;
    }

    /* renamed from: a */
    public final int m18744a(int i10) throws C4654g2 {
        int i11 = this.f18429e;
        this.f18429e = 0;
        int i12 = this.f18427c + this.f18428d;
        this.f18427c = i12;
        if (i12 > 0) {
            this.f18428d = i12;
            this.f18427c = i12 - i12;
        } else {
            this.f18428d = 0;
        }
        return i11;
    }
}
