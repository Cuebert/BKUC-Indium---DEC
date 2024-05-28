package p266ub;

import java.util.Arrays;

/* renamed from: ub.m */
/* loaded from: classes.dex */
public final class C4921m {

    /* renamed from: a */
    private int f18956a;

    /* renamed from: b */
    private final int[] f18957b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m19316a() {
        this.f18956a = 0;
        Arrays.fill(this.f18957b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m19317b(int i10) {
        return this.f18957b[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m19318c() {
        if ((this.f18956a & 2) != 0) {
            return this.f18957b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m19319d() {
        if ((this.f18956a & 128) != 0) {
            return this.f18957b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m19320e(int i10) {
        return (this.f18956a & 16) != 0 ? this.f18957b[4] : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m19321f(int i10) {
        return (this.f18956a & 32) != 0 ? this.f18957b[5] : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m19322g(int i10) {
        return ((1 << i10) & this.f18956a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m19323h(C4921m c4921m) {
        for (int i10 = 0; i10 < 10; i10++) {
            if (c4921m.m19322g(i10)) {
                m19324i(i10, c4921m.m19317b(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C4921m m19324i(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f18957b;
            if (i10 < iArr.length) {
                this.f18956a = (1 << i10) | this.f18956a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m19325j() {
        return Integer.bitCount(this.f18956a);
    }
}
