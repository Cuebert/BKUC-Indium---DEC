package p246t3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: t3.x1 */
/* loaded from: classes.dex */
public class C4721x1 extends AbstractC4717w1 {

    /* renamed from: r */
    protected final byte[] f18523r;

    public C4721x1(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f18523r = bArr;
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: c */
    public byte mo18729c(int i10) {
        return this.f18523r[i10];
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: e */
    public byte mo18730e(int i10) {
        return this.f18523r[i10];
    }

    @Override // p246t3.AbstractC4626a2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4626a2) || mo18731i() != ((AbstractC4626a2) obj).mo18731i()) {
            return false;
        }
        if (mo18731i() == 0) {
            return true;
        }
        if (obj instanceof C4721x1) {
            C4721x1 c4721x1 = (C4721x1) obj;
            int m18737r = m18737r();
            int m18737r2 = c4721x1.m18737r();
            if (m18737r != 0 && m18737r2 != 0 && m18737r != m18737r2) {
                return false;
            }
            int mo18731i = mo18731i();
            if (mo18731i <= c4721x1.mo18731i()) {
                if (mo18731i <= c4721x1.mo18731i()) {
                    byte[] bArr = this.f18523r;
                    byte[] bArr2 = c4721x1.f18523r;
                    int mo18833v = mo18833v() + mo18731i;
                    int mo18833v2 = mo18833v();
                    int mo18833v3 = c4721x1.mo18833v();
                    while (mo18833v2 < mo18833v) {
                        if (bArr[mo18833v2] != bArr2[mo18833v3]) {
                            return false;
                        }
                        mo18833v2++;
                        mo18833v3++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo18731i + ", " + c4721x1.mo18731i());
            }
            throw new IllegalArgumentException("Length too large: " + mo18731i + mo18731i());
        }
        return obj.equals(this);
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: i */
    public int mo18731i() {
        return this.f18523r.length;
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: k */
    protected void mo18732k(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f18523r, 0, bArr, 0, i12);
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: l */
    protected final int mo18733l(int i10, int i11, int i12) {
        byte[] bArr = this.f18523r;
        int mo18833v = mo18833v();
        byte[] bArr2 = C4650f2.f18445d;
        for (int i13 = mo18833v; i13 < mo18833v + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: m */
    public final AbstractC4626a2 mo18734m(int i10, int i11) {
        int m18727q = AbstractC4626a2.m18727q(i10, i11, mo18731i());
        return m18727q == 0 ? AbstractC4626a2.f18420o : new C4709u1(this.f18523r, mo18833v() + i10, m18727q);
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: o */
    public final InputStream mo18735o() {
        return new ByteArrayInputStream(this.f18523r, mo18833v(), mo18731i());
    }

    @Override // p246t3.AbstractC4626a2
    /* renamed from: p */
    public final ByteBuffer mo18736p() {
        return ByteBuffer.wrap(this.f18523r, mo18833v(), mo18731i()).asReadOnlyBuffer();
    }

    /* renamed from: v */
    protected int mo18833v() {
        return 0;
    }
}
