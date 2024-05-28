package p246t3;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: t3.a2 */
/* loaded from: classes.dex */
public abstract class AbstractC4626a2 implements Iterable, Serializable {

    /* renamed from: o */
    public static final AbstractC4626a2 f18420o = new C4721x1(C4650f2.f18445d);

    /* renamed from: p */
    private static final Comparator f18421p;

    /* renamed from: q */
    private static final C4729z1 f18422q;

    /* renamed from: n */
    private int f18423n = 0;

    static {
        int i10 = C4693q1.f18490a;
        f18422q = new C4729z1(null);
        f18421p = new C4701s1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m18727q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    /* renamed from: s */
    public static AbstractC4626a2 m18728s(byte[] bArr, int i10, int i11) {
        m18727q(0, i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return new C4721x1(bArr2);
    }

    /* renamed from: c */
    public abstract byte mo18729c(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract byte mo18730e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f18423n;
        if (i10 == 0) {
            int mo18731i = mo18731i();
            i10 = mo18733l(mo18731i, 0, mo18731i);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f18423n = i10;
        }
        return i10;
    }

    /* renamed from: i */
    public abstract int mo18731i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C4697r1(this);
    }

    /* renamed from: k */
    protected abstract void mo18732k(byte[] bArr, int i10, int i11, int i12);

    /* renamed from: l */
    protected abstract int mo18733l(int i10, int i11, int i12);

    /* renamed from: m */
    public abstract AbstractC4626a2 mo18734m(int i10, int i11);

    /* renamed from: o */
    public abstract InputStream mo18735o();

    /* renamed from: p */
    public abstract ByteBuffer mo18736p();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final int m18737r() {
        return this.f18423n;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo18731i());
        objArr[2] = mo18731i() <= 50 ? C4658h2.m18768a(this) : C4658h2.m18768a(mo18734m(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final byte[] m18738u() {
        int mo18731i = mo18731i();
        if (mo18731i == 0) {
            return C4650f2.f18445d;
        }
        byte[] bArr = new byte[mo18731i];
        mo18732k(bArr, 0, 0, mo18731i);
        return bArr;
    }
}
