package p246t3;

/* renamed from: t3.u1 */
/* loaded from: classes.dex */
final class C4709u1 extends C4721x1 {

    /* renamed from: s */
    private final int f18510s;

    /* renamed from: t */
    private final int f18511t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4709u1(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC4626a2.m18727q(i10, i10 + i11, bArr.length);
        this.f18510s = i10;
        this.f18511t = i11;
    }

    @Override // p246t3.C4721x1, p246t3.AbstractC4626a2
    /* renamed from: c */
    public final byte mo18729c(int i10) {
        int i11 = this.f18511t;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f18523r[this.f18510s + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p246t3.C4721x1, p246t3.AbstractC4626a2
    /* renamed from: e */
    public final byte mo18730e(int i10) {
        return this.f18523r[this.f18510s + i10];
    }

    @Override // p246t3.C4721x1, p246t3.AbstractC4626a2
    /* renamed from: i */
    public final int mo18731i() {
        return this.f18511t;
    }

    @Override // p246t3.C4721x1, p246t3.AbstractC4626a2
    /* renamed from: k */
    protected final void mo18732k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f18523r, this.f18510s, bArr, 0, i12);
    }

    @Override // p246t3.C4721x1
    /* renamed from: v */
    protected final int mo18833v() {
        return this.f18510s;
    }
}
