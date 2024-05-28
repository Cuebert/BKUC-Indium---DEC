package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.play_billing.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC1914c0 implements Iterable, Serializable {

    /* renamed from: o */
    public static final AbstractC1914c0 f7634o = new C2066y(C1950h1.f7678d);

    /* renamed from: p */
    private static final Comparator f7635p;

    /* renamed from: q */
    private static final C1900a0 f7636q;

    /* renamed from: n */
    private int f7637n = 0;

    static {
        int i10 = C1990n.f7749a;
        f7636q = new C1900a0(null);
        f7635p = new C2032t();
    }

    /* renamed from: q */
    public static int m9267q(int i10, int i11, int i12) {
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
    public static AbstractC1914c0 m9268s(byte[] bArr, int i10, int i11) {
        m9267q(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C2066y(bArr2);
    }

    /* renamed from: c */
    public abstract byte mo9269c(int i10);

    /* renamed from: e */
    public abstract byte mo9270e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f7637n;
        if (i10 == 0) {
            int mo9271i = mo9271i();
            i10 = mo9272k(mo9271i, 0, mo9271i);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7637n = i10;
        }
        return i10;
    }

    /* renamed from: i */
    public abstract int mo9271i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2025s(this);
    }

    /* renamed from: k */
    protected abstract int mo9272k(int i10, int i11, int i12);

    /* renamed from: l */
    public abstract AbstractC1914c0 mo9273l(int i10, int i11);

    /* renamed from: m */
    protected abstract String mo9274m(Charset charset);

    /* renamed from: o */
    public abstract void mo9275o(C2018r c2018r) throws IOException;

    /* renamed from: p */
    public abstract boolean mo9276p();

    /* renamed from: r */
    public final int m9277r() {
        return this.f7637n;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo9271i());
        objArr[2] = mo9271i() <= 50 ? C1945g3.m9352a(this) : C1945g3.m9352a(mo9273l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public final String m9278u(Charset charset) {
        return mo9271i() == 0 ? BuildConfig.FLAVOR : mo9274m(charset);
    }
}
