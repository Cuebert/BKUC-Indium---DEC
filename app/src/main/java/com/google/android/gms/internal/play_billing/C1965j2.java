package com.google.android.gms.internal.play_billing;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.j2 */
/* loaded from: classes.dex */
public final class C1965j2<T> implements InterfaceC2014q2<T> {

    /* renamed from: p */
    private static final int[] f7683p = new int[0];

    /* renamed from: q */
    private static final Unsafe f7684q = C2029s3.m9628l();

    /* renamed from: a */
    private final int[] f7685a;

    /* renamed from: b */
    private final Object[] f7686b;

    /* renamed from: c */
    private final int f7687c;

    /* renamed from: d */
    private final int f7688d;

    /* renamed from: e */
    private final InterfaceC1944g2 f7689e;

    /* renamed from: f */
    private final boolean f7690f;

    /* renamed from: g */
    private final int[] f7691g;

    /* renamed from: h */
    private final int f7692h;

    /* renamed from: i */
    private final int f7693i;

    /* renamed from: j */
    private final AbstractC2034t1 f7694j;

    /* renamed from: k */
    private final AbstractC1959i3 f7695k;

    /* renamed from: l */
    private final AbstractC2012q0 f7696l;

    /* renamed from: m */
    private final int f7697m;

    /* renamed from: n */
    private final C1979l2 f7698n;

    /* renamed from: o */
    private final C1909b2 f7699o;

    private C1965j2(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC1944g2 interfaceC1944g2, int i12, boolean z10, int[] iArr2, int i13, int i14, C1979l2 c1979l2, AbstractC2034t1 abstractC2034t1, AbstractC1959i3 abstractC1959i3, AbstractC2012q0 abstractC2012q0, C1909b2 c1909b2) {
        this.f7685a = iArr;
        this.f7686b = objArr;
        this.f7687c = i10;
        this.f7688d = i11;
        this.f7697m = i12;
        boolean z11 = false;
        if (abstractC2012q0 != null && abstractC2012q0.mo9555c(interfaceC1944g2)) {
            z11 = true;
        }
        this.f7690f = z11;
        this.f7691g = iArr2;
        this.f7692h = i13;
        this.f7693i = i14;
        this.f7698n = c1979l2;
        this.f7694j = abstractC2034t1;
        this.f7695k = abstractC1959i3;
        this.f7696l = abstractC2012q0;
        this.f7689e = interfaceC1944g2;
        this.f7699o = c1909b2;
    }

    /* renamed from: A */
    private static boolean m9407A(Object obj, int i10, InterfaceC2014q2 interfaceC2014q2) {
        return interfaceC2014q2.mo9453h(C2029s3.m9627k(obj, i10 & 1048575));
    }

    /* renamed from: B */
    private static boolean m9408B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1922d1) {
            return ((AbstractC1922d1) obj).m9308s();
        }
        return true;
    }

    /* renamed from: C */
    private final boolean m9409C(Object obj, int i10, int i11) {
        return C2029s3.m9624h(obj, (long) (m9423R(i11) & 1048575)) == i10;
    }

    /* renamed from: D */
    private static boolean m9410D(Object obj, long j10) {
        return ((Boolean) C2029s3.m9627k(obj, j10)).booleanValue();
    }

    /* renamed from: E */
    private static final void m9411E(int i10, Object obj, InterfaceC1904a4 interfaceC1904a4) throws IOException {
        if (obj instanceof String) {
            interfaceC1904a4.mo9227q(i10, (String) obj);
        } else {
            interfaceC1904a4.mo9236z(i10, (AbstractC1914c0) obj);
        }
    }

    /* renamed from: G */
    static C1966j3 m9412G(Object obj) {
        AbstractC1922d1 abstractC1922d1 = (AbstractC1922d1) obj;
        C1966j3 c1966j3 = abstractC1922d1.zzc;
        if (c1966j3 != C1966j3.m9455c()) {
            return c1966j3;
        }
        C1966j3 m9457f = C1966j3.m9457f();
        abstractC1922d1.zzc = m9457f;
        return m9457f;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0251  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.C1965j2 m9413H(java.lang.Class r30, com.google.android.gms.internal.play_billing.InterfaceC1923d2 r31, com.google.android.gms.internal.play_billing.C1979l2 r32, com.google.android.gms.internal.play_billing.AbstractC2034t1 r33, com.google.android.gms.internal.play_billing.AbstractC1959i3 r34, com.google.android.gms.internal.play_billing.AbstractC2012q0 r35, com.google.android.gms.internal.play_billing.C1909b2 r36) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1965j2.m9413H(java.lang.Class, com.google.android.gms.internal.play_billing.d2, com.google.android.gms.internal.play_billing.l2, com.google.android.gms.internal.play_billing.t1, com.google.android.gms.internal.play_billing.i3, com.google.android.gms.internal.play_billing.q0, com.google.android.gms.internal.play_billing.b2):com.google.android.gms.internal.play_billing.j2");
    }

    /* renamed from: I */
    private static double m9414I(Object obj, long j10) {
        return ((Double) C2029s3.m9627k(obj, j10)).doubleValue();
    }

    /* renamed from: J */
    private static float m9415J(Object obj, long j10) {
        return ((Float) C2029s3.m9627k(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x003d. Please report as an issue. */
    /* renamed from: K */
    private final int m9416K(Object obj) {
        int i10;
        int m9481y;
        int m9481y2;
        int m9482z;
        int m9481y3;
        int m9481y4;
        int m9481y5;
        int m9481y6;
        int m9579P;
        int m9567D;
        int m9481y7;
        int m9481y8;
        int i11;
        int m9481y9;
        int m9481y10;
        int m9481y11;
        int m9481y12;
        Unsafe unsafe = f7684q;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (i13 < this.f7685a.length) {
            int m9426U = m9426U(i13);
            int[] iArr = this.f7685a;
            int i17 = iArr[i13];
            int m9425T = m9425T(m9426U);
            if (m9425T <= 17) {
                int i18 = iArr[i13 + 2];
                int i19 = i18 & i12;
                int i20 = i18 >>> 20;
                if (i19 != i15) {
                    i16 = unsafe.getInt(obj, i19);
                    i15 = i19;
                }
                i10 = 1 << i20;
            } else {
                i10 = 0;
            }
            long j10 = m9426U & i12;
            switch (m9425T) {
                case 0:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y + 8;
                        i14 += m9481y4;
                        break;
                    }
                case 1:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y2 = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y2 + 4;
                        i14 += m9481y4;
                        break;
                    }
                case 2:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9482z = AbstractC1970k0.m9482z(unsafe.getLong(obj, j10));
                        m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += m9481y3 + m9482z;
                        break;
                    }
                case 3:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9482z = AbstractC1970k0.m9482z(unsafe.getLong(obj, j10));
                        m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += m9481y3 + m9482z;
                        break;
                    }
                case 4:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9482z = AbstractC1970k0.m9478v(unsafe.getInt(obj, j10));
                        m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += m9481y3 + m9482z;
                        break;
                    }
                case 5:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y + 8;
                        i14 += m9481y4;
                        break;
                    }
                case 6:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y2 = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y2 + 4;
                        i14 += m9481y4;
                        break;
                    }
                case 7:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y4 = AbstractC1970k0.m9481y(i17 << 3) + 1;
                        i14 += m9481y4;
                        break;
                    }
                case 8:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof AbstractC1914c0) {
                            int i21 = AbstractC1970k0.f7708d;
                            int mo9271i = ((AbstractC1914c0) object).mo9271i();
                            m9481y5 = AbstractC1970k0.m9481y(mo9271i) + mo9271i;
                            m9481y6 = AbstractC1970k0.m9481y(i17 << 3);
                            m9481y4 = m9481y6 + m9481y5;
                            i14 += m9481y4;
                            break;
                        } else {
                            m9482z = AbstractC1970k0.m9480x((String) object);
                            m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                            i14 += m9481y3 + m9482z;
                            break;
                        }
                    }
                case 9:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y4 = C2028s2.m9573J(i17, unsafe.getObject(obj, j10), m9429k(i13));
                        i14 += m9481y4;
                        break;
                    }
                case 10:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        AbstractC1914c0 abstractC1914c0 = (AbstractC1914c0) unsafe.getObject(obj, j10);
                        int i22 = AbstractC1970k0.f7708d;
                        int mo9271i2 = abstractC1914c0.mo9271i();
                        m9481y5 = AbstractC1970k0.m9481y(mo9271i2) + mo9271i2;
                        m9481y6 = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y6 + m9481y5;
                        i14 += m9481y4;
                        break;
                    }
                case 11:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9482z = AbstractC1970k0.m9481y(unsafe.getInt(obj, j10));
                        m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += m9481y3 + m9482z;
                        break;
                    }
                case 12:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9482z = AbstractC1970k0.m9478v(unsafe.getInt(obj, j10));
                        m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += m9481y3 + m9482z;
                        break;
                    }
                case 13:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y2 = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y2 + 4;
                        i14 += m9481y4;
                        break;
                    }
                case 14:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y = AbstractC1970k0.m9481y(i17 << 3);
                        m9481y4 = m9481y + 8;
                        i14 += m9481y4;
                        break;
                    }
                case 15:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        m9481y3 = AbstractC1970k0.m9481y(i17 << 3);
                        m9482z = AbstractC1970k0.m9481y((i23 >> 31) ^ (i23 + i23));
                        i14 += m9481y3 + m9482z;
                        break;
                    }
                case 16:
                    if ((i10 & i16) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        i14 += AbstractC1970k0.m9481y(i17 << 3) + AbstractC1970k0.m9482z((j11 >> 63) ^ (j11 + j11));
                        break;
                    }
                case 17:
                    if ((i16 & i10) == 0) {
                        break;
                    } else {
                        m9481y4 = AbstractC1970k0.m9477u(i17, (InterfaceC1944g2) unsafe.getObject(obj, j10), m9429k(i13));
                        i14 += m9481y4;
                        break;
                    }
                case 18:
                    m9481y4 = C2028s2.m9566C(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 19:
                    m9481y4 = C2028s2.m9564A(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 20:
                    m9481y4 = C2028s2.m9571H(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 21:
                    m9481y4 = C2028s2.m9582S(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 22:
                    m9481y4 = C2028s2.m9569F(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 23:
                    m9481y4 = C2028s2.m9566C(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 24:
                    m9481y4 = C2028s2.m9564A(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 25:
                    m9481y4 = C2028s2.m9608w(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9481y4;
                    break;
                case 26:
                    m9579P = C2028s2.m9579P(i17, (List) unsafe.getObject(obj, j10));
                    i14 += m9579P;
                    break;
                case 27:
                    m9579P = C2028s2.m9574K(i17, (List) unsafe.getObject(obj, j10), m9429k(i13));
                    i14 += m9579P;
                    break;
                case 28:
                    m9579P = C2028s2.m9609x(i17, (List) unsafe.getObject(obj, j10));
                    i14 += m9579P;
                    break;
                case 29:
                    m9579P = C2028s2.m9580Q(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9579P;
                    break;
                case 30:
                    m9579P = C2028s2.m9610y(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9579P;
                    break;
                case 31:
                    m9579P = C2028s2.m9564A(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9579P;
                    break;
                case 32:
                    m9579P = C2028s2.m9566C(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9579P;
                    break;
                case 33:
                    m9579P = C2028s2.m9575L(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9579P;
                    break;
                case 34:
                    m9579P = C2028s2.m9577N(i17, (List) unsafe.getObject(obj, j10), false);
                    i14 += m9579P;
                    break;
                case 35:
                    m9567D = C2028s2.m9567D((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 36:
                    m9567D = C2028s2.m9565B((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 37:
                    m9567D = C2028s2.m9572I((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 38:
                    m9567D = C2028s2.m9583T((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 39:
                    m9567D = C2028s2.m9570G((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 40:
                    m9567D = C2028s2.m9567D((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 41:
                    m9567D = C2028s2.m9565B((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i24 = C2028s2.f7788d;
                    m9567D = list.size();
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 43:
                    m9567D = C2028s2.m9581R((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 44:
                    m9567D = C2028s2.m9611z((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 45:
                    m9567D = C2028s2.m9565B((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 46:
                    m9567D = C2028s2.m9567D((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 47:
                    m9567D = C2028s2.m9576M((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 48:
                    m9567D = C2028s2.m9578O((List) unsafe.getObject(obj, j10));
                    if (m9567D > 0) {
                        m9481y7 = AbstractC1970k0.m9481y(m9567D);
                        m9481y8 = AbstractC1970k0.m9481y(i17 << 3);
                        i11 = m9481y8 + m9481y7;
                        i14 += i11 + m9567D;
                    }
                    break;
                case 49:
                    m9579P = C2028s2.m9568E(i17, (List) unsafe.getObject(obj, j10), m9429k(i13));
                    i14 += m9579P;
                    break;
                case 50:
                    C1909b2.m9254a(i17, unsafe.getObject(obj, j10), m9430l(i13));
                    break;
                case 51:
                    if (m9409C(obj, i17, i13)) {
                        m9481y9 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y9 + 8;
                        i14 += m9579P;
                    }
                    break;
                case 52:
                    if (m9409C(obj, i17, i13)) {
                        m9481y10 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y10 + 4;
                        i14 += m9579P;
                    }
                    break;
                case 53:
                    if (m9409C(obj, i17, i13)) {
                        m9567D = AbstractC1970k0.m9482z(m9427V(obj, j10));
                        i11 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += i11 + m9567D;
                    }
                    break;
                case 54:
                    if (m9409C(obj, i17, i13)) {
                        m9567D = AbstractC1970k0.m9482z(m9427V(obj, j10));
                        i11 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += i11 + m9567D;
                    }
                    break;
                case 55:
                    if (m9409C(obj, i17, i13)) {
                        m9567D = AbstractC1970k0.m9478v(m9417L(obj, j10));
                        i11 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += i11 + m9567D;
                    }
                    break;
                case 56:
                    if (m9409C(obj, i17, i13)) {
                        m9481y9 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y9 + 8;
                        i14 += m9579P;
                    }
                    break;
                case 57:
                    if (m9409C(obj, i17, i13)) {
                        m9481y10 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y10 + 4;
                        i14 += m9579P;
                    }
                    break;
                case 58:
                    if (m9409C(obj, i17, i13)) {
                        m9579P = AbstractC1970k0.m9481y(i17 << 3) + 1;
                        i14 += m9579P;
                    }
                    break;
                case 59:
                    if (m9409C(obj, i17, i13)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof AbstractC1914c0) {
                            int i25 = AbstractC1970k0.f7708d;
                            int mo9271i3 = ((AbstractC1914c0) object2).mo9271i();
                            m9481y11 = AbstractC1970k0.m9481y(mo9271i3) + mo9271i3;
                            m9481y12 = AbstractC1970k0.m9481y(i17 << 3);
                            m9579P = m9481y12 + m9481y11;
                            i14 += m9579P;
                        } else {
                            m9567D = AbstractC1970k0.m9480x((String) object2);
                            i11 = AbstractC1970k0.m9481y(i17 << 3);
                            i14 += i11 + m9567D;
                        }
                    }
                    break;
                case 60:
                    if (m9409C(obj, i17, i13)) {
                        m9579P = C2028s2.m9573J(i17, unsafe.getObject(obj, j10), m9429k(i13));
                        i14 += m9579P;
                    }
                    break;
                case 61:
                    if (m9409C(obj, i17, i13)) {
                        AbstractC1914c0 abstractC1914c02 = (AbstractC1914c0) unsafe.getObject(obj, j10);
                        int i26 = AbstractC1970k0.f7708d;
                        int mo9271i4 = abstractC1914c02.mo9271i();
                        m9481y11 = AbstractC1970k0.m9481y(mo9271i4) + mo9271i4;
                        m9481y12 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y12 + m9481y11;
                        i14 += m9579P;
                    }
                    break;
                case 62:
                    if (m9409C(obj, i17, i13)) {
                        m9567D = AbstractC1970k0.m9481y(m9417L(obj, j10));
                        i11 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += i11 + m9567D;
                    }
                    break;
                case 63:
                    if (m9409C(obj, i17, i13)) {
                        m9567D = AbstractC1970k0.m9478v(m9417L(obj, j10));
                        i11 = AbstractC1970k0.m9481y(i17 << 3);
                        i14 += i11 + m9567D;
                    }
                    break;
                case 64:
                    if (m9409C(obj, i17, i13)) {
                        m9481y10 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y10 + 4;
                        i14 += m9579P;
                    }
                    break;
                case 65:
                    if (m9409C(obj, i17, i13)) {
                        m9481y9 = AbstractC1970k0.m9481y(i17 << 3);
                        m9579P = m9481y9 + 8;
                        i14 += m9579P;
                    }
                    break;
                case 66:
                    if (m9409C(obj, i17, i13)) {
                        int m9417L = m9417L(obj, j10);
                        i11 = AbstractC1970k0.m9481y(i17 << 3);
                        m9567D = AbstractC1970k0.m9481y((m9417L >> 31) ^ (m9417L + m9417L));
                        i14 += i11 + m9567D;
                    }
                    break;
                case 67:
                    if (m9409C(obj, i17, i13)) {
                        long m9427V = m9427V(obj, j10);
                        i14 += AbstractC1970k0.m9481y(i17 << 3) + AbstractC1970k0.m9482z((m9427V >> 63) ^ (m9427V + m9427V));
                    }
                    break;
                case 68:
                    if (m9409C(obj, i17, i13)) {
                        m9579P = AbstractC1970k0.m9477u(i17, (InterfaceC1944g2) unsafe.getObject(obj, j10), m9429k(i13));
                        i14 += m9579P;
                    }
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        AbstractC1959i3 abstractC1959i3 = this.f7695k;
        int mo9390a = i14 + abstractC1959i3.mo9390a(abstractC1959i3.mo9393d(obj));
        if (!this.f7690f) {
            return mo9390a;
        }
        this.f7696l.mo9553a(obj);
        throw null;
    }

    /* renamed from: L */
    private static int m9417L(Object obj, long j10) {
        return ((Integer) C2029s3.m9627k(obj, j10)).intValue();
    }

    /* renamed from: M */
    private final int m9418M(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, C1997o c1997o) throws IOException {
        Unsafe unsafe = f7684q;
        Object m9430l = m9430l(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((C2074z1) object).m9705h()) {
            C2074z1 m9702d = C2074z1.m9699a().m9702d();
            C1909b2.m9255b(m9702d, object);
            unsafe.putObject(obj, j10, m9702d);
        }
        throw null;
    }

    /* renamed from: N */
    private final int m9419N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C1997o c1997o) throws IOException {
        Unsafe unsafe = f7684q;
        long j11 = this.f7685a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(C2004p.m9536p(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(C2004p.m9522b(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m9533m = C2004p.m9533m(bArr, i10, c1997o);
                    unsafe.putObject(obj, j10, Long.valueOf(c1997o.f7752b));
                    unsafe.putInt(obj, j11, i13);
                    return m9533m;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int m9530j = C2004p.m9530j(bArr, i10, c1997o);
                    unsafe.putObject(obj, j10, Integer.valueOf(c1997o.f7751a));
                    unsafe.putInt(obj, j11, i13);
                    return m9530j;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(C2004p.m9536p(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(obj, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(C2004p.m9522b(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(obj, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int m9533m2 = C2004p.m9533m(bArr, i10, c1997o);
                    unsafe.putObject(obj, j10, Boolean.valueOf(c1997o.f7752b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return m9533m2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int m9530j2 = C2004p.m9530j(bArr, i10, c1997o);
                    int i22 = c1997o.f7751a;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j10, BuildConfig.FLAVOR);
                    } else {
                        if ((i15 & 536870912) != 0 && !C2064x3.m9687e(bArr, m9530j2, m9530j2 + i22)) {
                            throw C1964j1.m9402c();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, m9530j2, i22, C1950h1.f7676b));
                        m9530j2 += i22;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return m9530j2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object m9432n = m9432n(obj, i13, i17);
                    int m9535o = C2004p.m9535o(m9432n, m9429k(i17), bArr, i10, i11, c1997o);
                    m9440v(obj, i13, i17, m9432n);
                    return m9535o;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int m9521a = C2004p.m9521a(bArr, i10, c1997o);
                    unsafe.putObject(obj, j10, c1997o.f7753c);
                    unsafe.putInt(obj, j11, i13);
                    return m9521a;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int m9530j3 = C2004p.m9530j(bArr, i10, c1997o);
                    int i23 = c1997o.f7751a;
                    InterfaceC1936f1 m9428j = m9428j(i17);
                    if (m9428j != null && !m9428j.mo9284f(i23)) {
                        m9412G(obj).m9465j(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i23));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return m9530j3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int m9530j4 = C2004p.m9530j(bArr, i10, c1997o);
                    unsafe.putObject(obj, j10, Integer.valueOf(C1942g0.m9349a(c1997o.f7751a)));
                    unsafe.putInt(obj, j11, i13);
                    return m9530j4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int m9533m3 = C2004p.m9533m(bArr, i10, c1997o);
                    unsafe.putObject(obj, j10, Long.valueOf(C1942g0.m9350b(c1997o.f7752b)));
                    unsafe.putInt(obj, j11, i13);
                    return m9533m3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object m9432n2 = m9432n(obj, i13, i17);
                    int m9534n = C2004p.m9534n(m9432n2, m9429k(i17), bArr, i10, i11, (i12 & (-8)) | 4, c1997o);
                    m9440v(obj, i13, i17, m9432n2);
                    return m9534n;
                }
                break;
        }
        return i10;
    }

    /* renamed from: O */
    private final int m9420O(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C1997o c1997o) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int m9532l;
        int i21 = i10;
        Unsafe unsafe = f7684q;
        InterfaceC1943g1 interfaceC1943g1 = (InterfaceC1943g1) unsafe.getObject(obj, j11);
        if (!interfaceC1943g1.mo9351a()) {
            int size = interfaceC1943g1.size();
            interfaceC1943g1 = interfaceC1943g1.mo9324g(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, interfaceC1943g1);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    C1984m0 c1984m0 = (C1984m0) interfaceC1943g1;
                    int m9530j = C2004p.m9530j(bArr, i21, c1997o);
                    int i22 = c1997o.f7751a + m9530j;
                    while (m9530j < i22) {
                        c1984m0.m9502e(Double.longBitsToDouble(C2004p.m9536p(bArr, m9530j)));
                        m9530j += 8;
                    }
                    if (m9530j == i22) {
                        return m9530j;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 1) {
                    C1984m0 c1984m02 = (C1984m0) interfaceC1943g1;
                    c1984m02.m9502e(Double.longBitsToDouble(C2004p.m9536p(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            i21 = C2004p.m9530j(bArr, i17, c1997o);
                            if (i12 == c1997o.f7751a) {
                                c1984m02.m9502e(Double.longBitsToDouble(C2004p.m9536p(bArr, i21)));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    C2054w0 c2054w0 = (C2054w0) interfaceC1943g1;
                    int m9530j2 = C2004p.m9530j(bArr, i21, c1997o);
                    int i23 = c1997o.f7751a + m9530j2;
                    while (m9530j2 < i23) {
                        c2054w0.m9671e(Float.intBitsToFloat(C2004p.m9522b(bArr, m9530j2)));
                        m9530j2 += 4;
                    }
                    if (m9530j2 == i23) {
                        return m9530j2;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 5) {
                    C2054w0 c2054w02 = (C2054w0) interfaceC1943g1;
                    c2054w02.m9671e(Float.intBitsToFloat(C2004p.m9522b(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            i21 = C2004p.m9530j(bArr, i18, c1997o);
                            if (i12 == c1997o.f7751a) {
                                c2054w02.m9671e(Float.intBitsToFloat(C2004p.m9522b(bArr, i21)));
                            }
                        }
                    }
                    return i18;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    C2041u1 c2041u1 = (C2041u1) interfaceC1943g1;
                    int m9530j3 = C2004p.m9530j(bArr, i21, c1997o);
                    int i24 = c1997o.f7751a + m9530j3;
                    while (m9530j3 < i24) {
                        m9530j3 = C2004p.m9533m(bArr, m9530j3, c1997o);
                        c2041u1.m9662i(c1997o.f7752b);
                    }
                    if (m9530j3 == i24) {
                        return m9530j3;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 0) {
                    C2041u1 c2041u12 = (C2041u1) interfaceC1943g1;
                    int m9533m = C2004p.m9533m(bArr, i21, c1997o);
                    c2041u12.m9662i(c1997o.f7752b);
                    while (m9533m < i11) {
                        int m9530j4 = C2004p.m9530j(bArr, m9533m, c1997o);
                        if (i12 != c1997o.f7751a) {
                            return m9533m;
                        }
                        m9533m = C2004p.m9533m(bArr, m9530j4, c1997o);
                        c2041u12.m9662i(c1997o.f7752b);
                    }
                    return m9533m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C2004p.m9526f(bArr, i21, interfaceC1943g1, c1997o);
                }
                if (i14 == 0) {
                    return C2004p.m9532l(i12, bArr, i10, i11, interfaceC1943g1, c1997o);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    C2041u1 c2041u13 = (C2041u1) interfaceC1943g1;
                    int m9530j5 = C2004p.m9530j(bArr, i21, c1997o);
                    int i25 = c1997o.f7751a + m9530j5;
                    while (m9530j5 < i25) {
                        c2041u13.m9662i(C2004p.m9536p(bArr, m9530j5));
                        m9530j5 += 8;
                    }
                    if (m9530j5 == i25) {
                        return m9530j5;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 1) {
                    C2041u1 c2041u14 = (C2041u1) interfaceC1943g1;
                    c2041u14.m9662i(C2004p.m9536p(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            i21 = C2004p.m9530j(bArr, i19, c1997o);
                            if (i12 == c1997o.f7751a) {
                                c2041u14.m9662i(C2004p.m9536p(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    C1929e1 c1929e1 = (C1929e1) interfaceC1943g1;
                    int m9530j6 = C2004p.m9530j(bArr, i21, c1997o);
                    int i26 = c1997o.f7751a + m9530j6;
                    while (m9530j6 < i26) {
                        c1929e1.m9325i(C2004p.m9522b(bArr, m9530j6));
                        m9530j6 += 4;
                    }
                    if (m9530j6 == i26) {
                        return m9530j6;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 5) {
                    C1929e1 c1929e12 = (C1929e1) interfaceC1943g1;
                    c1929e12.m9325i(C2004p.m9522b(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            i21 = C2004p.m9530j(bArr, i20, c1997o);
                            if (i12 == c1997o.f7751a) {
                                c1929e12.m9325i(C2004p.m9522b(bArr, i21));
                            }
                        }
                    }
                    return i20;
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    C2011q c2011q = (C2011q) interfaceC1943g1;
                    int m9530j7 = C2004p.m9530j(bArr, i21, c1997o);
                    int i27 = c1997o.f7751a + m9530j7;
                    while (m9530j7 < i27) {
                        m9530j7 = C2004p.m9533m(bArr, m9530j7, c1997o);
                        c2011q.m9552e(c1997o.f7752b != 0);
                    }
                    if (m9530j7 == i27) {
                        return m9530j7;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 0) {
                    C2011q c2011q2 = (C2011q) interfaceC1943g1;
                    int m9533m2 = C2004p.m9533m(bArr, i21, c1997o);
                    c2011q2.m9552e(c1997o.f7752b != 0);
                    while (m9533m2 < i11) {
                        int m9530j8 = C2004p.m9530j(bArr, m9533m2, c1997o);
                        if (i12 != c1997o.f7751a) {
                            return m9533m2;
                        }
                        m9533m2 = C2004p.m9533m(bArr, m9530j8, c1997o);
                        c2011q2.m9552e(c1997o.f7752b != 0);
                    }
                    return m9533m2;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        i21 = C2004p.m9530j(bArr, i21, c1997o);
                        int i28 = c1997o.f7751a;
                        if (i28 < 0) {
                            throw C1964j1.m9403d();
                        }
                        if (i28 == 0) {
                            interfaceC1943g1.add(BuildConfig.FLAVOR);
                        } else {
                            interfaceC1943g1.add(new String(bArr, i21, i28, C1950h1.f7676b));
                            i21 += i28;
                        }
                        while (i21 < i11) {
                            int m9530j9 = C2004p.m9530j(bArr, i21, c1997o);
                            if (i12 != c1997o.f7751a) {
                                break;
                            } else {
                                i21 = C2004p.m9530j(bArr, m9530j9, c1997o);
                                int i29 = c1997o.f7751a;
                                if (i29 < 0) {
                                    throw C1964j1.m9403d();
                                }
                                if (i29 == 0) {
                                    interfaceC1943g1.add(BuildConfig.FLAVOR);
                                } else {
                                    interfaceC1943g1.add(new String(bArr, i21, i29, C1950h1.f7676b));
                                    i21 += i29;
                                }
                            }
                        }
                        break;
                    } else {
                        i21 = C2004p.m9530j(bArr, i21, c1997o);
                        int i30 = c1997o.f7751a;
                        if (i30 < 0) {
                            throw C1964j1.m9403d();
                        }
                        if (i30 == 0) {
                            interfaceC1943g1.add(BuildConfig.FLAVOR);
                        } else {
                            int i31 = i21 + i30;
                            if (C2064x3.m9687e(bArr, i21, i31)) {
                                interfaceC1943g1.add(new String(bArr, i21, i30, C1950h1.f7676b));
                                i21 = i31;
                            } else {
                                throw C1964j1.m9402c();
                            }
                        }
                        while (i21 < i11) {
                            int m9530j10 = C2004p.m9530j(bArr, i21, c1997o);
                            if (i12 != c1997o.f7751a) {
                                break;
                            } else {
                                i21 = C2004p.m9530j(bArr, m9530j10, c1997o);
                                int i32 = c1997o.f7751a;
                                if (i32 < 0) {
                                    throw C1964j1.m9403d();
                                }
                                if (i32 == 0) {
                                    interfaceC1943g1.add(BuildConfig.FLAVOR);
                                } else {
                                    int i33 = i21 + i32;
                                    if (C2064x3.m9687e(bArr, i21, i33)) {
                                        interfaceC1943g1.add(new String(bArr, i21, i32, C1950h1.f7676b));
                                        i21 = i33;
                                    } else {
                                        throw C1964j1.m9402c();
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i14 == 2) {
                    return C2004p.m9525e(m9429k(i15), i12, bArr, i10, i11, interfaceC1943g1, c1997o);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int m9530j11 = C2004p.m9530j(bArr, i21, c1997o);
                    int i34 = c1997o.f7751a;
                    if (i34 >= 0) {
                        if (i34 > bArr.length - m9530j11) {
                            throw C1964j1.m9405g();
                        }
                        if (i34 == 0) {
                            interfaceC1943g1.add(AbstractC1914c0.f7634o);
                        } else {
                            interfaceC1943g1.add(AbstractC1914c0.m9268s(bArr, m9530j11, i34));
                            m9530j11 += i34;
                        }
                        while (m9530j11 < i11) {
                            int m9530j12 = C2004p.m9530j(bArr, m9530j11, c1997o);
                            if (i12 != c1997o.f7751a) {
                                return m9530j11;
                            }
                            m9530j11 = C2004p.m9530j(bArr, m9530j12, c1997o);
                            int i35 = c1997o.f7751a;
                            if (i35 >= 0) {
                                if (i35 > bArr.length - m9530j11) {
                                    throw C1964j1.m9405g();
                                }
                                if (i35 == 0) {
                                    interfaceC1943g1.add(AbstractC1914c0.f7634o);
                                } else {
                                    interfaceC1943g1.add(AbstractC1914c0.m9268s(bArr, m9530j11, i35));
                                    m9530j11 += i35;
                                }
                            } else {
                                throw C1964j1.m9403d();
                            }
                        }
                        return m9530j11;
                    }
                    throw C1964j1.m9403d();
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    m9532l = C2004p.m9526f(bArr, i21, interfaceC1943g1, c1997o);
                } else if (i14 == 0) {
                    m9532l = C2004p.m9532l(i12, bArr, i10, i11, interfaceC1943g1, c1997o);
                }
                InterfaceC1936f1 m9428j = m9428j(i15);
                AbstractC1959i3 abstractC1959i3 = this.f7695k;
                int i36 = C2028s2.f7788d;
                if (m9428j != null) {
                    Object obj2 = null;
                    if (interfaceC1943g1 instanceof RandomAccess) {
                        int size2 = interfaceC1943g1.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size2; i38++) {
                            int intValue = ((Integer) interfaceC1943g1.get(i38)).intValue();
                            if (m9428j.mo9284f(intValue)) {
                                if (i38 != i37) {
                                    interfaceC1943g1.set(i37, Integer.valueOf(intValue));
                                }
                                i37++;
                            } else {
                                obj2 = C2028s2.m9586a(obj, i13, intValue, obj2, abstractC1959i3);
                            }
                        }
                        if (i37 != size2) {
                            interfaceC1943g1.subList(i37, size2).clear();
                            return m9532l;
                        }
                    } else {
                        Iterator it = interfaceC1943g1.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m9428j.mo9284f(intValue2)) {
                                obj2 = C2028s2.m9586a(obj, i13, intValue2, obj2, abstractC1959i3);
                                it.remove();
                            }
                        }
                    }
                }
                return m9532l;
            case 33:
            case 47:
                if (i14 == 2) {
                    C1929e1 c1929e13 = (C1929e1) interfaceC1943g1;
                    int m9530j13 = C2004p.m9530j(bArr, i21, c1997o);
                    int i39 = c1997o.f7751a + m9530j13;
                    while (m9530j13 < i39) {
                        m9530j13 = C2004p.m9530j(bArr, m9530j13, c1997o);
                        c1929e13.m9325i(C1942g0.m9349a(c1997o.f7751a));
                    }
                    if (m9530j13 == i39) {
                        return m9530j13;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 0) {
                    C1929e1 c1929e14 = (C1929e1) interfaceC1943g1;
                    int m9530j14 = C2004p.m9530j(bArr, i21, c1997o);
                    c1929e14.m9325i(C1942g0.m9349a(c1997o.f7751a));
                    while (m9530j14 < i11) {
                        int m9530j15 = C2004p.m9530j(bArr, m9530j14, c1997o);
                        if (i12 != c1997o.f7751a) {
                            return m9530j14;
                        }
                        m9530j14 = C2004p.m9530j(bArr, m9530j15, c1997o);
                        c1929e14.m9325i(C1942g0.m9349a(c1997o.f7751a));
                    }
                    return m9530j14;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    C2041u1 c2041u15 = (C2041u1) interfaceC1943g1;
                    int m9530j16 = C2004p.m9530j(bArr, i21, c1997o);
                    int i40 = c1997o.f7751a + m9530j16;
                    while (m9530j16 < i40) {
                        m9530j16 = C2004p.m9533m(bArr, m9530j16, c1997o);
                        c2041u15.m9662i(C1942g0.m9350b(c1997o.f7752b));
                    }
                    if (m9530j16 == i40) {
                        return m9530j16;
                    }
                    throw C1964j1.m9405g();
                }
                if (i14 == 0) {
                    C2041u1 c2041u16 = (C2041u1) interfaceC1943g1;
                    int m9533m3 = C2004p.m9533m(bArr, i21, c1997o);
                    c2041u16.m9662i(C1942g0.m9350b(c1997o.f7752b));
                    while (m9533m3 < i11) {
                        int m9530j17 = C2004p.m9530j(bArr, m9533m3, c1997o);
                        if (i12 != c1997o.f7751a) {
                            return m9533m3;
                        }
                        m9533m3 = C2004p.m9533m(bArr, m9530j17, c1997o);
                        c2041u16.m9662i(C1942g0.m9350b(c1997o.f7752b));
                    }
                    return m9533m3;
                }
                break;
            default:
                if (i14 == 3) {
                    InterfaceC2014q2 m9429k = m9429k(i15);
                    int i41 = (i12 & (-8)) | 4;
                    int m9523c = C2004p.m9523c(m9429k, bArr, i10, i11, i41, c1997o);
                    interfaceC1943g1.add(c1997o.f7753c);
                    while (m9523c < i11) {
                        int m9530j18 = C2004p.m9530j(bArr, m9523c, c1997o);
                        if (i12 != c1997o.f7751a) {
                            return m9523c;
                        }
                        m9523c = C2004p.m9523c(m9429k, bArr, m9530j18, i11, i41, c1997o);
                        interfaceC1943g1.add(c1997o.f7753c);
                    }
                    return m9523c;
                }
                break;
        }
        return i21;
    }

    /* renamed from: P */
    private final int m9421P(int i10) {
        if (i10 < this.f7687c || i10 > this.f7688d) {
            return -1;
        }
        return m9424S(i10, 0);
    }

    /* renamed from: Q */
    private final int m9422Q(int i10, int i11) {
        if (i10 < this.f7687c || i10 > this.f7688d) {
            return -1;
        }
        return m9424S(i10, i11);
    }

    /* renamed from: R */
    private final int m9423R(int i10) {
        return this.f7685a[i10 + 2];
    }

    /* renamed from: S */
    private final int m9424S(int i10, int i11) {
        int length = (this.f7685a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f7685a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* renamed from: T */
    private static int m9425T(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: U */
    private final int m9426U(int i10) {
        return this.f7685a[i10 + 1];
    }

    /* renamed from: V */
    private static long m9427V(Object obj, long j10) {
        return ((Long) C2029s3.m9627k(obj, j10)).longValue();
    }

    /* renamed from: j */
    private final InterfaceC1936f1 m9428j(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC1936f1) this.f7686b[i11 + i11 + 1];
    }

    /* renamed from: k */
    private final InterfaceC2014q2 m9429k(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC2014q2 interfaceC2014q2 = (InterfaceC2014q2) this.f7686b[i12];
        if (interfaceC2014q2 != null) {
            return interfaceC2014q2;
        }
        InterfaceC2014q2 m9516b = C2000o2.m9515a().m9516b((Class) this.f7686b[i12 + 1]);
        this.f7686b[i12] = m9516b;
        return m9516b;
    }

    /* renamed from: l */
    private final Object m9430l(int i10) {
        int i11 = i10 / 3;
        return this.f7686b[i11 + i11];
    }

    /* renamed from: m */
    private final Object m9431m(Object obj, int i10) {
        InterfaceC2014q2 m9429k = m9429k(i10);
        int m9426U = m9426U(i10) & 1048575;
        if (!m9443y(obj, i10)) {
            return m9429k.mo9447b();
        }
        Object object = f7684q.getObject(obj, m9426U);
        if (m9408B(object)) {
            return object;
        }
        Object mo9447b = m9429k.mo9447b();
        if (object != null) {
            m9429k.mo9449d(mo9447b, object);
        }
        return mo9447b;
    }

    /* renamed from: n */
    private final Object m9432n(Object obj, int i10, int i11) {
        InterfaceC2014q2 m9429k = m9429k(i11);
        if (!m9409C(obj, i10, i11)) {
            return m9429k.mo9447b();
        }
        Object object = f7684q.getObject(obj, m9426U(i11) & 1048575);
        if (m9408B(object)) {
            return object;
        }
        Object mo9447b = m9429k.mo9447b();
        if (object != null) {
            m9429k.mo9449d(mo9447b, object);
        }
        return mo9447b;
    }

    /* renamed from: o */
    private static Field m9433o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: p */
    private static void m9434p(Object obj) {
        if (!m9408B(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: q */
    private final void m9435q(Object obj, Object obj2, int i10) {
        if (m9443y(obj2, i10)) {
            int m9426U = m9426U(i10) & 1048575;
            Unsafe unsafe = f7684q;
            long j10 = m9426U;
            Object object = unsafe.getObject(obj2, j10);
            if (object != null) {
                InterfaceC2014q2 m9429k = m9429k(i10);
                if (!m9443y(obj, i10)) {
                    if (!m9408B(object)) {
                        unsafe.putObject(obj, j10, object);
                    } else {
                        Object mo9447b = m9429k.mo9447b();
                        m9429k.mo9449d(mo9447b, object);
                        unsafe.putObject(obj, j10, mo9447b);
                    }
                    m9437s(obj, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j10);
                if (!m9408B(object2)) {
                    Object mo9447b2 = m9429k.mo9447b();
                    m9429k.mo9449d(mo9447b2, object2);
                    unsafe.putObject(obj, j10, mo9447b2);
                    object2 = mo9447b2;
                }
                m9429k.mo9449d(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f7685a[i10] + " is present but null: " + obj2.toString());
        }
    }

    /* renamed from: r */
    private final void m9436r(Object obj, Object obj2, int i10) {
        int i11 = this.f7685a[i10];
        if (m9409C(obj2, i11, i10)) {
            int m9426U = m9426U(i10) & 1048575;
            Unsafe unsafe = f7684q;
            long j10 = m9426U;
            Object object = unsafe.getObject(obj2, j10);
            if (object != null) {
                InterfaceC2014q2 m9429k = m9429k(i10);
                if (!m9409C(obj, i11, i10)) {
                    if (!m9408B(object)) {
                        unsafe.putObject(obj, j10, object);
                    } else {
                        Object mo9447b = m9429k.mo9447b();
                        m9429k.mo9449d(mo9447b, object);
                        unsafe.putObject(obj, j10, mo9447b);
                    }
                    m9438t(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j10);
                if (!m9408B(object2)) {
                    Object mo9447b2 = m9429k.mo9447b();
                    m9429k.mo9449d(mo9447b2, object2);
                    unsafe.putObject(obj, j10, mo9447b2);
                    object2 = mo9447b2;
                }
                m9429k.mo9449d(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f7685a[i10] + " is present but null: " + obj2.toString());
        }
    }

    /* renamed from: s */
    private final void m9437s(Object obj, int i10) {
        int m9423R = m9423R(i10);
        long j10 = 1048575 & m9423R;
        if (j10 == 1048575) {
            return;
        }
        C2029s3.m9638v(obj, j10, (1 << (m9423R >>> 20)) | C2029s3.m9624h(obj, j10));
    }

    /* renamed from: t */
    private final void m9438t(Object obj, int i10, int i11) {
        C2029s3.m9638v(obj, m9423R(i11) & 1048575, i10);
    }

    /* renamed from: u */
    private final void m9439u(Object obj, int i10, Object obj2) {
        f7684q.putObject(obj, m9426U(i10) & 1048575, obj2);
        m9437s(obj, i10);
    }

    /* renamed from: v */
    private final void m9440v(Object obj, int i10, int i11, Object obj2) {
        f7684q.putObject(obj, m9426U(i11) & 1048575, obj2);
        m9438t(obj, i10, i11);
    }

    /* renamed from: w */
    private final void m9441w(InterfaceC1904a4 interfaceC1904a4, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    /* renamed from: x */
    private final boolean m9442x(Object obj, Object obj2, int i10) {
        return m9443y(obj, i10) == m9443y(obj2, i10);
    }

    /* renamed from: y */
    private final boolean m9443y(Object obj, int i10) {
        int m9423R = m9423R(i10);
        long j10 = m9423R & 1048575;
        if (j10 != 1048575) {
            return (C2029s3.m9624h(obj, j10) & (1 << (m9423R >>> 20))) != 0;
        }
        int m9426U = m9426U(i10);
        long j11 = m9426U & 1048575;
        switch (m9425T(m9426U)) {
            case 0:
                return Double.doubleToRawLongBits(C2029s3.m9622f(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(C2029s3.m9623g(obj, j11)) != 0;
            case 2:
                return C2029s3.m9625i(obj, j11) != 0;
            case 3:
                return C2029s3.m9625i(obj, j11) != 0;
            case 4:
                return C2029s3.m9624h(obj, j11) != 0;
            case 5:
                return C2029s3.m9625i(obj, j11) != 0;
            case 6:
                return C2029s3.m9624h(obj, j11) != 0;
            case 7:
                return C2029s3.m9613B(obj, j11);
            case 8:
                Object m9627k = C2029s3.m9627k(obj, j11);
                if (m9627k instanceof String) {
                    return !((String) m9627k).isEmpty();
                }
                if (m9627k instanceof AbstractC1914c0) {
                    return !AbstractC1914c0.f7634o.equals(m9627k);
                }
                throw new IllegalArgumentException();
            case 9:
                return C2029s3.m9627k(obj, j11) != null;
            case 10:
                return !AbstractC1914c0.f7634o.equals(C2029s3.m9627k(obj, j11));
            case 11:
                return C2029s3.m9624h(obj, j11) != 0;
            case 12:
                return C2029s3.m9624h(obj, j11) != 0;
            case 13:
                return C2029s3.m9624h(obj, j11) != 0;
            case 14:
                return C2029s3.m9625i(obj, j11) != 0;
            case 15:
                return C2029s3.m9624h(obj, j11) != 0;
            case 16:
                return C2029s3.m9625i(obj, j11) != 0;
            case 17:
                return C2029s3.m9627k(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    private final boolean m9444z(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m9443y(obj, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0401, code lost:
    
        if (r6 == 1048575) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0403, code lost:
    
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0409, code lost:
    
        r2 = r8.f7692h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x040d, code lost:
    
        if (r2 >= r8.f7693i) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x040f, code lost:
    
        r4 = r8.f7691g[r2];
        r5 = r8.f7685a[r4];
        r5 = com.google.android.gms.internal.play_billing.C2029s3.m9627k(r12, r8.m9426U(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0421, code lost:
    
        if (r5 != null) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0428, code lost:
    
        if (r8.m9428j(r4) != null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x042d, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.C2074z1) r5;
        r0 = (com.google.android.gms.internal.play_billing.C2068y1) r8.m9430l(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0435, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x042a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0436, code lost:
    
        if (r9 != 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x043a, code lost:
    
        if (r0 != r32) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0441, code lost:
    
        throw com.google.android.gms.internal.play_billing.C1964j1.m9404e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0448, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0444, code lost:
    
        if (r0 > r32) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0446, code lost:
    
        if (r3 != r9) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x044d, code lost:
    
        throw com.google.android.gms.internal.play_billing.C1964j1.m9404e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:112:0x0092. Please report as an issue. */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m9445F(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.play_billing.C1997o r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1965j2.m9445F(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.o):int");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: a */
    public final void mo9446a(Object obj) {
        if (m9408B(obj)) {
            if (obj instanceof AbstractC1922d1) {
                AbstractC1922d1 abstractC1922d1 = (AbstractC1922d1) obj;
                abstractC1922d1.m9306q(Integer.MAX_VALUE);
                abstractC1922d1.zza = 0;
                abstractC1922d1.m9305o();
            }
            int length = this.f7685a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int m9426U = m9426U(i10);
                int i11 = 1048575 & m9426U;
                int m9425T = m9425T(m9426U);
                long j10 = i11;
                if (m9425T != 9) {
                    if (m9425T != 60 && m9425T != 68) {
                        switch (m9425T) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f7694j.mo9539a(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f7684q;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((C2074z1) object).m9703f();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (m9409C(obj, this.f7685a[i10], i10)) {
                        m9429k(i10).mo9446a(f7684q.getObject(obj, j10));
                    }
                }
                if (m9443y(obj, i10)) {
                    m9429k(i10).mo9446a(f7684q.getObject(obj, j10));
                }
            }
            this.f7695k.mo9396g(obj);
            if (this.f7690f) {
                this.f7696l.mo9554b(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: b */
    public final Object mo9447b() {
        return ((AbstractC1922d1) this.f7689e).m9303j();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: c */
    public final int mo9448c(Object obj) {
        int m9481y;
        int m9481y2;
        int m9482z;
        int m9481y3;
        int m9481y4;
        int m9481y5;
        int m9481y6;
        int m9573J;
        int m9481y7;
        int m9482z2;
        int m9481y8;
        int m9481y9;
        EnumC2070y3 enumC2070y3 = EnumC2070y3.f7898o;
        if (this.f7697m - 1 != 0) {
            Unsafe unsafe = f7684q;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f7685a.length; i11 += 3) {
                int m9426U = m9426U(i11);
                int m9425T = m9425T(m9426U);
                int i12 = this.f7685a[i11];
                int i13 = m9426U & 1048575;
                if (m9425T >= EnumC2047v0.f7841Z.zza() && m9425T <= EnumC2047v0.f7854m0.zza()) {
                    int i14 = this.f7685a[i11 + 2];
                }
                long j10 = i13;
                switch (m9425T) {
                    case 0:
                        if (m9443y(obj, i11)) {
                            m9481y = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y + 8;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m9443y(obj, i11)) {
                            m9481y2 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y2 + 4;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m9443y(obj, i11)) {
                            m9482z = AbstractC1970k0.m9482z(C2029s3.m9625i(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m9443y(obj, i11)) {
                            m9482z = AbstractC1970k0.m9482z(C2029s3.m9625i(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m9443y(obj, i11)) {
                            m9482z = AbstractC1970k0.m9478v(C2029s3.m9624h(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m9443y(obj, i11)) {
                            m9481y = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y + 8;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m9443y(obj, i11)) {
                            m9481y2 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y2 + 4;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m9443y(obj, i11)) {
                            m9481y4 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y4 + 1;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m9443y(obj, i11)) {
                            Object m9627k = C2029s3.m9627k(obj, j10);
                            if (m9627k instanceof AbstractC1914c0) {
                                int i15 = i12 << 3;
                                int i16 = AbstractC1970k0.f7708d;
                                int mo9271i = ((AbstractC1914c0) m9627k).mo9271i();
                                m9481y5 = AbstractC1970k0.m9481y(mo9271i) + mo9271i;
                                m9481y6 = AbstractC1970k0.m9481y(i15);
                                m9573J = m9481y6 + m9481y5;
                                i10 += m9573J;
                                break;
                            } else {
                                m9482z = AbstractC1970k0.m9480x((String) m9627k);
                                m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                                i10 += m9481y3 + m9482z;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (m9443y(obj, i11)) {
                            m9573J = C2028s2.m9573J(i12, C2029s3.m9627k(obj, j10), m9429k(i11));
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m9443y(obj, i11)) {
                            AbstractC1914c0 abstractC1914c0 = (AbstractC1914c0) C2029s3.m9627k(obj, j10);
                            int i17 = i12 << 3;
                            int i18 = AbstractC1970k0.f7708d;
                            int mo9271i2 = abstractC1914c0.mo9271i();
                            m9481y5 = AbstractC1970k0.m9481y(mo9271i2) + mo9271i2;
                            m9481y6 = AbstractC1970k0.m9481y(i17);
                            m9573J = m9481y6 + m9481y5;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m9443y(obj, i11)) {
                            m9482z = AbstractC1970k0.m9481y(C2029s3.m9624h(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m9443y(obj, i11)) {
                            m9482z = AbstractC1970k0.m9478v(C2029s3.m9624h(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m9443y(obj, i11)) {
                            m9481y2 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y2 + 4;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m9443y(obj, i11)) {
                            m9481y = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y + 8;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m9443y(obj, i11)) {
                            int m9624h = C2029s3.m9624h(obj, j10);
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            m9482z = AbstractC1970k0.m9481y((m9624h >> 31) ^ (m9624h + m9624h));
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m9443y(obj, i11)) {
                            long m9625i = C2029s3.m9625i(obj, j10);
                            m9481y7 = AbstractC1970k0.m9481y(i12 << 3);
                            m9482z2 = AbstractC1970k0.m9482z((m9625i + m9625i) ^ (m9625i >> 63));
                            m9573J = m9481y7 + m9482z2;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m9443y(obj, i11)) {
                            m9573J = AbstractC1970k0.m9477u(i12, (InterfaceC1944g2) C2029s3.m9627k(obj, j10), m9429k(i11));
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m9573J = C2028s2.m9566C(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 19:
                        m9573J = C2028s2.m9564A(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 20:
                        m9573J = C2028s2.m9571H(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 21:
                        m9573J = C2028s2.m9582S(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 22:
                        m9573J = C2028s2.m9569F(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 23:
                        m9573J = C2028s2.m9566C(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 24:
                        m9573J = C2028s2.m9564A(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 25:
                        m9573J = C2028s2.m9608w(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 26:
                        m9573J = C2028s2.m9579P(i12, (List) C2029s3.m9627k(obj, j10));
                        i10 += m9573J;
                        break;
                    case 27:
                        m9573J = C2028s2.m9574K(i12, (List) C2029s3.m9627k(obj, j10), m9429k(i11));
                        i10 += m9573J;
                        break;
                    case 28:
                        m9573J = C2028s2.m9609x(i12, (List) C2029s3.m9627k(obj, j10));
                        i10 += m9573J;
                        break;
                    case 29:
                        m9573J = C2028s2.m9580Q(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 30:
                        m9573J = C2028s2.m9610y(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 31:
                        m9573J = C2028s2.m9564A(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 32:
                        m9573J = C2028s2.m9566C(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 33:
                        m9573J = C2028s2.m9575L(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 34:
                        m9573J = C2028s2.m9577N(i12, (List) C2029s3.m9627k(obj, j10), false);
                        i10 += m9573J;
                        break;
                    case 35:
                        m9482z = C2028s2.m9567D((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i19 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i19);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        m9482z = C2028s2.m9565B((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i20 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i20);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        m9482z = C2028s2.m9572I((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i21 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i21);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        m9482z = C2028s2.m9583T((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i22 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i22);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        m9482z = C2028s2.m9570G((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i23 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i23);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        m9482z = C2028s2.m9567D((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i24 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i24);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        m9482z = C2028s2.m9565B((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i25 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i25);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(obj, j10);
                        int i26 = C2028s2.f7788d;
                        m9482z = list.size();
                        if (m9482z > 0) {
                            int i27 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i27);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        m9482z = C2028s2.m9581R((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i28 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i28);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        m9482z = C2028s2.m9611z((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i29 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i29);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        m9482z = C2028s2.m9565B((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i30 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i30);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        m9482z = C2028s2.m9567D((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i31 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i31);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        m9482z = C2028s2.m9576M((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i32 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i32);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        m9482z = C2028s2.m9578O((List) unsafe.getObject(obj, j10));
                        if (m9482z > 0) {
                            int i33 = i12 << 3;
                            m9481y8 = AbstractC1970k0.m9481y(m9482z);
                            m9481y9 = AbstractC1970k0.m9481y(i33);
                            m9481y3 = m9481y9 + m9481y8;
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        m9573J = C2028s2.m9568E(i12, (List) C2029s3.m9627k(obj, j10), m9429k(i11));
                        i10 += m9573J;
                        break;
                    case 50:
                        C1909b2.m9254a(i12, C2029s3.m9627k(obj, j10), m9430l(i11));
                        break;
                    case 51:
                        if (m9409C(obj, i12, i11)) {
                            m9481y = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y + 8;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m9409C(obj, i12, i11)) {
                            m9481y2 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y2 + 4;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m9409C(obj, i12, i11)) {
                            m9482z = AbstractC1970k0.m9482z(m9427V(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m9409C(obj, i12, i11)) {
                            m9482z = AbstractC1970k0.m9482z(m9427V(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m9409C(obj, i12, i11)) {
                            m9482z = AbstractC1970k0.m9478v(m9417L(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m9409C(obj, i12, i11)) {
                            m9481y = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y + 8;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m9409C(obj, i12, i11)) {
                            m9481y2 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y2 + 4;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m9409C(obj, i12, i11)) {
                            m9481y4 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y4 + 1;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m9409C(obj, i12, i11)) {
                            Object m9627k2 = C2029s3.m9627k(obj, j10);
                            if (m9627k2 instanceof AbstractC1914c0) {
                                int i34 = i12 << 3;
                                int i35 = AbstractC1970k0.f7708d;
                                int mo9271i3 = ((AbstractC1914c0) m9627k2).mo9271i();
                                m9481y5 = AbstractC1970k0.m9481y(mo9271i3) + mo9271i3;
                                m9481y6 = AbstractC1970k0.m9481y(i34);
                                m9573J = m9481y6 + m9481y5;
                                i10 += m9573J;
                                break;
                            } else {
                                m9482z = AbstractC1970k0.m9480x((String) m9627k2);
                                m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                                i10 += m9481y3 + m9482z;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m9409C(obj, i12, i11)) {
                            m9573J = C2028s2.m9573J(i12, C2029s3.m9627k(obj, j10), m9429k(i11));
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m9409C(obj, i12, i11)) {
                            AbstractC1914c0 abstractC1914c02 = (AbstractC1914c0) C2029s3.m9627k(obj, j10);
                            int i36 = i12 << 3;
                            int i37 = AbstractC1970k0.f7708d;
                            int mo9271i4 = abstractC1914c02.mo9271i();
                            m9481y5 = AbstractC1970k0.m9481y(mo9271i4) + mo9271i4;
                            m9481y6 = AbstractC1970k0.m9481y(i36);
                            m9573J = m9481y6 + m9481y5;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m9409C(obj, i12, i11)) {
                            m9482z = AbstractC1970k0.m9481y(m9417L(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m9409C(obj, i12, i11)) {
                            m9482z = AbstractC1970k0.m9478v(m9417L(obj, j10));
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m9409C(obj, i12, i11)) {
                            m9481y2 = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y2 + 4;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m9409C(obj, i12, i11)) {
                            m9481y = AbstractC1970k0.m9481y(i12 << 3);
                            m9573J = m9481y + 8;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m9409C(obj, i12, i11)) {
                            int m9417L = m9417L(obj, j10);
                            m9481y3 = AbstractC1970k0.m9481y(i12 << 3);
                            m9482z = AbstractC1970k0.m9481y((m9417L >> 31) ^ (m9417L + m9417L));
                            i10 += m9481y3 + m9482z;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m9409C(obj, i12, i11)) {
                            long m9427V = m9427V(obj, j10);
                            m9481y7 = AbstractC1970k0.m9481y(i12 << 3);
                            m9482z2 = AbstractC1970k0.m9482z((m9427V + m9427V) ^ (m9427V >> 63));
                            m9573J = m9481y7 + m9482z2;
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m9409C(obj, i12, i11)) {
                            m9573J = AbstractC1970k0.m9477u(i12, (InterfaceC1944g2) C2029s3.m9627k(obj, j10), m9429k(i11));
                            i10 += m9573J;
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC1959i3 abstractC1959i3 = this.f7695k;
            return i10 + abstractC1959i3.mo9390a(abstractC1959i3.mo9393d(obj));
        }
        return m9416K(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: d */
    public final void mo9449d(Object obj, Object obj2) {
        m9434p(obj);
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.f7685a.length; i10 += 3) {
            int m9426U = m9426U(i10);
            int i11 = this.f7685a[i10];
            long j10 = 1048575 & m9426U;
            switch (m9425T(m9426U)) {
                case 0:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9636t(obj, j10, C2029s3.m9622f(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9637u(obj, j10, C2029s3.m9623g(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9639w(obj, j10, C2029s3.m9625i(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9639w(obj, j10, C2029s3.m9625i(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9638v(obj, j10, C2029s3.m9624h(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9639w(obj, j10, C2029s3.m9625i(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9638v(obj, j10, C2029s3.m9624h(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9634r(obj, j10, C2029s3.m9613B(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9640x(obj, j10, C2029s3.m9627k(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m9435q(obj, obj2, i10);
                    break;
                case 10:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9640x(obj, j10, C2029s3.m9627k(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9638v(obj, j10, C2029s3.m9624h(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9638v(obj, j10, C2029s3.m9624h(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9638v(obj, j10, C2029s3.m9624h(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9639w(obj, j10, C2029s3.m9625i(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9638v(obj, j10, C2029s3.m9624h(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m9443y(obj2, i10)) {
                        C2029s3.m9639w(obj, j10, C2029s3.m9625i(obj2, j10));
                        m9437s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m9435q(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f7694j.mo9540b(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = C2028s2.f7788d;
                    C2029s3.m9640x(obj, j10, C1909b2.m9255b(C2029s3.m9627k(obj, j10), C2029s3.m9627k(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m9409C(obj2, i11, i10)) {
                        C2029s3.m9640x(obj, j10, C2029s3.m9627k(obj2, j10));
                        m9438t(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m9436r(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m9409C(obj2, i11, i10)) {
                        C2029s3.m9640x(obj, j10, C2029s3.m9627k(obj2, j10));
                        m9438t(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m9436r(obj, obj2, i10);
                    break;
            }
        }
        C2028s2.m9587b(this.f7695k, obj, obj2);
        if (this.f7690f) {
            this.f7696l.mo9553a(obj2);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: e */
    public final int mo9450e(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int length = this.f7685a.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int m9426U = m9426U(i13);
            int i14 = this.f7685a[i13];
            long j10 = 1048575 & m9426U;
            int i15 = 37;
            switch (m9425T(m9426U)) {
                case 0:
                    i10 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(C2029s3.m9622f(obj, j10));
                    byte[] bArr = C1950h1.f7678d;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(C2029s3.m9623g(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    doubleToLongBits = C2029s3.m9625i(obj, j10);
                    byte[] bArr2 = C1950h1.f7678d;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i12 * 53;
                    doubleToLongBits = C2029s3.m9625i(obj, j10);
                    byte[] bArr3 = C1950h1.f7678d;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9624h(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    doubleToLongBits = C2029s3.m9625i(obj, j10);
                    byte[] bArr4 = C1950h1.f7678d;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9624h(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 7:
                    i11 = i12 * 53;
                    floatToIntBits = C1950h1.m9377a(C2029s3.m9613B(obj, j10));
                    i12 = i11 + floatToIntBits;
                    break;
                case 8:
                    i11 = i12 * 53;
                    floatToIntBits = ((String) C2029s3.m9627k(obj, j10)).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 9:
                    Object m9627k = C2029s3.m9627k(obj, j10);
                    if (m9627k != null) {
                        i15 = m9627k.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9627k(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 11:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9624h(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 12:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9624h(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 13:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9624h(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    doubleToLongBits = C2029s3.m9625i(obj, j10);
                    byte[] bArr5 = C1950h1.f7678d;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9624h(obj, j10);
                    i12 = i11 + floatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    doubleToLongBits = C2029s3.m9625i(obj, j10);
                    byte[] bArr6 = C1950h1.f7678d;
                    i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object m9627k2 = C2029s3.m9627k(obj, j10);
                    if (m9627k2 != null) {
                        i15 = m9627k2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9627k(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 50:
                    i11 = i12 * 53;
                    floatToIntBits = C2029s3.m9627k(obj, j10).hashCode();
                    i12 = i11 + floatToIntBits;
                    break;
                case 51:
                    if (m9409C(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m9414I(obj, j10));
                        byte[] bArr7 = C1950h1.f7678d;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(m9415J(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m9409C(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = m9427V(obj, j10);
                        byte[] bArr8 = C1950h1.f7678d;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m9409C(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = m9427V(obj, j10);
                        byte[] bArr9 = C1950h1.f7678d;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = m9417L(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m9409C(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = m9427V(obj, j10);
                        byte[] bArr10 = C1950h1.f7678d;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = m9417L(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = C1950h1.m9377a(m9410D(obj, j10));
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = ((String) C2029s3.m9627k(obj, j10)).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = C2029s3.m9627k(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = C2029s3.m9627k(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = m9417L(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = m9417L(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = m9417L(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m9409C(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = m9427V(obj, j10);
                        byte[] bArr11 = C1950h1.f7678d;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = m9417L(obj, j10);
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m9409C(obj, i14, i13)) {
                        i10 = i12 * 53;
                        doubleToLongBits = m9427V(obj, j10);
                        byte[] bArr12 = C1950h1.f7678d;
                        i12 = i10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m9409C(obj, i14, i13)) {
                        i11 = i12 * 53;
                        floatToIntBits = C2029s3.m9627k(obj, j10).hashCode();
                        i12 = i11 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.f7695k.mo9393d(obj).hashCode();
        if (!this.f7690f) {
            return hashCode;
        }
        this.f7696l.mo9553a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: f */
    public final void mo9451f(Object obj, InterfaceC1904a4 interfaceC1904a4) throws IOException {
        int i10;
        EnumC2070y3 enumC2070y3 = EnumC2070y3.f7898o;
        int i11 = 1048575;
        if (this.f7697m - 1 != 0) {
            if (!this.f7690f) {
                int length = this.f7685a.length;
                for (int i12 = 0; i12 < length; i12 += 3) {
                    int m9426U = m9426U(i12);
                    int i13 = this.f7685a[i12];
                    switch (m9425T(m9426U)) {
                        case 0:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9212b(i13, C2029s3.m9622f(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9218h(i13, C2029s3.m9623g(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9228r(i13, C2029s3.m9625i(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9233w(i13, C2029s3.m9625i(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9210J(i13, C2029s3.m9624h(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9204D(i13, C2029s3.m9625i(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9222l(i13, C2029s3.m9624h(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9223m(i13, C2029s3.m9613B(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m9443y(obj, i12)) {
                                m9411E(i13, C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9225o(i13, C2029s3.m9627k(obj, m9426U & 1048575), m9429k(i12));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9236z(i13, (AbstractC1914c0) C2029s3.m9627k(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9213c(i13, C2029s3.m9624h(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9206F(i13, C2029s3.m9624h(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9217g(i13, C2029s3.m9624h(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9230t(i13, C2029s3.m9625i(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9226p(i13, C2029s3.m9624h(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9208H(i13, C2029s3.m9625i(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m9443y(obj, i12)) {
                                interfaceC1904a4.mo9221k(i13, C2029s3.m9627k(obj, m9426U & 1048575), m9429k(i12));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C2028s2.m9591f(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 19:
                            C2028s2.m9595j(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 20:
                            C2028s2.m9598m(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 21:
                            C2028s2.m9606u(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 22:
                            C2028s2.m9597l(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 23:
                            C2028s2.m9594i(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 24:
                            C2028s2.m9593h(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 25:
                            C2028s2.m9589d(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 26:
                            C2028s2.m9604s(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4);
                            break;
                        case 27:
                            C2028s2.m9599n(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, m9429k(i12));
                            break;
                        case 28:
                            C2028s2.m9590e(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4);
                            break;
                        case 29:
                            C2028s2.m9605t(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 30:
                            C2028s2.m9592g(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 31:
                            C2028s2.m9600o(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 32:
                            C2028s2.m9601p(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 33:
                            C2028s2.m9602q(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 34:
                            C2028s2.m9603r(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, false);
                            break;
                        case 35:
                            C2028s2.m9591f(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 36:
                            C2028s2.m9595j(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 37:
                            C2028s2.m9598m(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 38:
                            C2028s2.m9606u(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 39:
                            C2028s2.m9597l(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 40:
                            C2028s2.m9594i(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 41:
                            C2028s2.m9593h(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 42:
                            C2028s2.m9589d(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 43:
                            C2028s2.m9605t(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 44:
                            C2028s2.m9592g(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 45:
                            C2028s2.m9600o(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 46:
                            C2028s2.m9601p(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 47:
                            C2028s2.m9602q(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 48:
                            C2028s2.m9603r(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, true);
                            break;
                        case 49:
                            C2028s2.m9596k(i13, (List) C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4, m9429k(i12));
                            break;
                        case 50:
                            m9441w(interfaceC1904a4, i13, C2029s3.m9627k(obj, m9426U & 1048575), i12);
                            break;
                        case 51:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9212b(i13, m9414I(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9218h(i13, m9415J(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9228r(i13, m9427V(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9233w(i13, m9427V(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9210J(i13, m9417L(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9204D(i13, m9427V(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9222l(i13, m9417L(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9223m(i13, m9410D(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m9409C(obj, i13, i12)) {
                                m9411E(i13, C2029s3.m9627k(obj, m9426U & 1048575), interfaceC1904a4);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9225o(i13, C2029s3.m9627k(obj, m9426U & 1048575), m9429k(i12));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9236z(i13, (AbstractC1914c0) C2029s3.m9627k(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9213c(i13, m9417L(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9206F(i13, m9417L(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9217g(i13, m9417L(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9230t(i13, m9427V(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9226p(i13, m9417L(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9208H(i13, m9427V(obj, m9426U & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m9409C(obj, i13, i12)) {
                                interfaceC1904a4.mo9221k(i13, C2029s3.m9627k(obj, m9426U & 1048575), m9429k(i12));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC1959i3 abstractC1959i3 = this.f7695k;
                abstractC1959i3.mo9398i(abstractC1959i3.mo9393d(obj), interfaceC1904a4);
                return;
            }
            this.f7696l.mo9553a(obj);
            throw null;
        }
        if (!this.f7690f) {
            int length2 = this.f7685a.length;
            Unsafe unsafe = f7684q;
            int i14 = 0;
            int i15 = 1048575;
            int i16 = 0;
            while (i14 < length2) {
                int m9426U2 = m9426U(i14);
                int[] iArr = this.f7685a;
                int i17 = iArr[i14];
                int m9425T = m9425T(m9426U2);
                if (m9425T <= 17) {
                    int i18 = iArr[i14 + 2];
                    int i19 = i18 & i11;
                    if (i19 != i15) {
                        i16 = unsafe.getInt(obj, i19);
                        i15 = i19;
                    }
                    i10 = 1 << (i18 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = m9426U2 & i11;
                switch (m9425T) {
                    case 0:
                        if ((i16 & i10) == 0) {
                            break;
                        } else {
                            interfaceC1904a4.mo9212b(i17, C2029s3.m9622f(obj, j10));
                            continue;
                        }
                    case 1:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9218h(i17, C2029s3.m9623g(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9228r(i17, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9233w(i17, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9210J(i17, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9204D(i17, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9222l(i17, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9223m(i17, C2029s3.m9613B(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i16 & i10) != 0) {
                            m9411E(i17, unsafe.getObject(obj, j10), interfaceC1904a4);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9225o(i17, unsafe.getObject(obj, j10), m9429k(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9236z(i17, (AbstractC1914c0) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9213c(i17, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9206F(i17, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9217g(i17, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9230t(i17, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9226p(i17, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9208H(i17, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i16 & i10) != 0) {
                            interfaceC1904a4.mo9221k(i17, unsafe.getObject(obj, j10), m9429k(i14));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C2028s2.m9591f(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 19:
                        C2028s2.m9595j(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 20:
                        C2028s2.m9598m(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 21:
                        C2028s2.m9606u(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 22:
                        C2028s2.m9597l(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 23:
                        C2028s2.m9594i(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 24:
                        C2028s2.m9593h(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 25:
                        C2028s2.m9589d(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        continue;
                    case 26:
                        C2028s2.m9604s(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4);
                        break;
                    case 27:
                        C2028s2.m9599n(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, m9429k(i14));
                        break;
                    case 28:
                        C2028s2.m9590e(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4);
                        break;
                    case 29:
                        C2028s2.m9605t(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        break;
                    case 30:
                        C2028s2.m9592g(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        break;
                    case 31:
                        C2028s2.m9600o(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        break;
                    case 32:
                        C2028s2.m9601p(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        break;
                    case 33:
                        C2028s2.m9602q(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        break;
                    case 34:
                        C2028s2.m9603r(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, false);
                        break;
                    case 35:
                        C2028s2.m9591f(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 36:
                        C2028s2.m9595j(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 37:
                        C2028s2.m9598m(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 38:
                        C2028s2.m9606u(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 39:
                        C2028s2.m9597l(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 40:
                        C2028s2.m9594i(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 41:
                        C2028s2.m9593h(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 42:
                        C2028s2.m9589d(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 43:
                        C2028s2.m9605t(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 44:
                        C2028s2.m9592g(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 45:
                        C2028s2.m9600o(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 46:
                        C2028s2.m9601p(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 47:
                        C2028s2.m9602q(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 48:
                        C2028s2.m9603r(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, true);
                        break;
                    case 49:
                        C2028s2.m9596k(this.f7685a[i14], (List) unsafe.getObject(obj, j10), interfaceC1904a4, m9429k(i14));
                        break;
                    case 50:
                        m9441w(interfaceC1904a4, i17, unsafe.getObject(obj, j10), i14);
                        break;
                    case 51:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9212b(i17, m9414I(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9218h(i17, m9415J(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9228r(i17, m9427V(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9233w(i17, m9427V(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9210J(i17, m9417L(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9204D(i17, m9427V(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9222l(i17, m9417L(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9223m(i17, m9410D(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (m9409C(obj, i17, i14)) {
                            m9411E(i17, unsafe.getObject(obj, j10), interfaceC1904a4);
                            break;
                        }
                        break;
                    case 60:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9225o(i17, unsafe.getObject(obj, j10), m9429k(i14));
                            break;
                        }
                        break;
                    case 61:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9236z(i17, (AbstractC1914c0) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9213c(i17, m9417L(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9206F(i17, m9417L(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9217g(i17, m9417L(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9230t(i17, m9427V(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9226p(i17, m9417L(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9208H(i17, m9427V(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (m9409C(obj, i17, i14)) {
                            interfaceC1904a4.mo9221k(i17, unsafe.getObject(obj, j10), m9429k(i14));
                            break;
                        }
                        break;
                }
                i14 += 3;
                i11 = 1048575;
            }
            AbstractC1959i3 abstractC1959i32 = this.f7695k;
            abstractC1959i32.mo9398i(abstractC1959i32.mo9393d(obj), interfaceC1904a4);
            return;
        }
        this.f7696l.mo9553a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo9452g(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1965j2.mo9452g(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: h */
    public final boolean mo9453h(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f7692h) {
            int i15 = this.f7691g[i14];
            int i16 = this.f7685a[i15];
            int m9426U = m9426U(i15);
            int i17 = this.f7685a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f7684q.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & m9426U) != 0 && !m9444z(obj, i15, i10, i11, i19)) {
                return false;
            }
            int m9425T = m9425T(m9426U);
            if (m9425T != 9 && m9425T != 17) {
                if (m9425T != 27) {
                    if (m9425T == 60 || m9425T == 68) {
                        if (m9409C(obj, i16, i15) && !m9407A(obj, m9426U, m9429k(i15))) {
                            return false;
                        }
                    } else if (m9425T != 49) {
                        if (m9425T == 50 && !((C2074z1) C2029s3.m9627k(obj, m9426U & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) C2029s3.m9627k(obj, m9426U & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2014q2 m9429k = m9429k(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!m9429k.mo9453h(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (m9444z(obj, i15, i10, i11, i19) && !m9407A(obj, m9426U, m9429k(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (!this.f7690f) {
            return true;
        }
        this.f7696l.mo9553a(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a3, code lost:
    
        if (r0 != r5) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a5, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r1 = r19;
        r2 = r22;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b9, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e6, code lost:
    
        if (r0 != r15) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x030a, code lost:
    
        if (r0 != r15) goto L254;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x008e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2014q2
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9454i(java.lang.Object r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.play_billing.C1997o r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1965j2.mo9454i(java.lang.Object, byte[], int, int, com.google.android.gms.internal.play_billing.o):void");
    }
}
