package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* loaded from: classes.dex */
public abstract class AbstractC1731p7 implements Iterable<Byte>, Serializable {

    /* renamed from: o */
    public static final AbstractC1731p7 f7144o = new C1699n7(C1860x8.f7294d);

    /* renamed from: p */
    private static final Comparator<AbstractC1731p7> f7145p;

    /* renamed from: q */
    private static final C1715o7 f7146q;

    /* renamed from: n */
    private int f7147n = 0;

    static {
        int i10 = C1500b7.f6661a;
        f7146q = new C1715o7(null);
        f7145p = new C1619i7();
    }

    /* renamed from: q */
    public static int m8662q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    /* renamed from: s */
    public static AbstractC1731p7 m8663s(byte[] bArr, int i10, int i11) {
        m8662q(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C1699n7(bArr2);
    }

    /* renamed from: u */
    public static AbstractC1731p7 m8664u(String str) {
        return new C1699n7(str.getBytes(C1860x8.f7292b));
    }

    /* renamed from: c */
    public abstract byte mo8350c(int i10);

    /* renamed from: e */
    public abstract byte mo8351e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f7147n;
        if (i10 == 0) {
            int mo8352i = mo8352i();
            i10 = mo8613k(mo8352i, 0, mo8352i);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7147n = i10;
        }
        return i10;
    }

    /* renamed from: i */
    public abstract int mo8352i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new C1585g7(this);
    }

    /* renamed from: k */
    protected abstract int mo8613k(int i10, int i11, int i12);

    /* renamed from: l */
    public abstract AbstractC1731p7 mo8614l(int i10, int i11);

    /* renamed from: m */
    protected abstract String mo8615m(Charset charset);

    /* renamed from: o */
    public abstract void mo8616o(C1568f7 c1568f7) throws IOException;

    /* renamed from: p */
    public abstract boolean mo8617p();

    /* renamed from: r */
    public final int m8665r() {
        return this.f7147n;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo8352i());
        objArr[2] = mo8352i() <= 50 ? C1766ra.m8767a(this) : C1766ra.m8767a(mo8614l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: v */
    public final String m8666v(Charset charset) {
        return mo8352i() == 0 ? BuildConfig.FLAVOR : mo8615m(charset);
    }
}
