package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.x9 */
/* loaded from: classes.dex */
public final class C1861x9<T> implements InterfaceC1571fa<T> {

    /* renamed from: p */
    private static final int[] f7297p = new int[0];

    /* renamed from: q */
    private static final Unsafe f7298q = C1555eb.m8111l();

    /* renamed from: a */
    private final int[] f7299a;

    /* renamed from: b */
    private final Object[] f7300b;

    /* renamed from: c */
    private final int f7301c;

    /* renamed from: d */
    private final int f7302d;

    /* renamed from: e */
    private final InterfaceC1813u9 f7303e;

    /* renamed from: f */
    private final boolean f7304f;

    /* renamed from: g */
    private final boolean f7305g;

    /* renamed from: h */
    private final int[] f7306h;

    /* renamed from: i */
    private final int f7307i;

    /* renamed from: j */
    private final int f7308j;

    /* renamed from: k */
    private final AbstractC1604h9 f7309k;

    /* renamed from: l */
    private final AbstractC1814ua<?, ?> f7310l;

    /* renamed from: m */
    private final AbstractC1535d8<?> f7311m;

    /* renamed from: n */
    private final C1893z9 f7312n;

    /* renamed from: o */
    private final C1717o9 f7313o;

    /* JADX WARN: Multi-variable type inference failed */
    private C1861x9(int[] iArr, int[] iArr2, Object[] objArr, int i10, int i11, InterfaceC1813u9 interfaceC1813u9, boolean z10, boolean z11, int[] iArr3, int i12, int i13, C1893z9 c1893z9, AbstractC1604h9 abstractC1604h9, AbstractC1814ua<?, ?> abstractC1814ua, AbstractC1535d8<?> abstractC1535d8, C1717o9 c1717o9) {
        this.f7299a = iArr;
        this.f7300b = iArr2;
        this.f7301c = objArr;
        this.f7302d = i10;
        this.f7305g = interfaceC1813u9;
        boolean z12 = false;
        if (abstractC1814ua != 0 && abstractC1814ua.mo8056c((InterfaceC1813u9) i11)) {
            z12 = true;
        }
        this.f7304f = z12;
        this.f7306h = z11;
        this.f7307i = iArr3;
        this.f7308j = i12;
        this.f7312n = i13;
        this.f7309k = c1893z9;
        this.f7310l = abstractC1604h9;
        this.f7311m = abstractC1814ua;
        this.f7303e = i11;
        this.f7313o = abstractC1535d8;
    }

    /* renamed from: A */
    private final void m9014A(T t10, C1875y7 c1875y7) throws IOException {
        int i10;
        if (!this.f7304f) {
            int length = this.f7299a.length;
            Unsafe unsafe = f7298q;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1048575;
            while (i12 < length) {
                int m9034k = m9034k(i12);
                int i15 = this.f7299a[i12];
                int m9033j = m9033j(m9034k);
                if (m9033j <= 17) {
                    int i16 = this.f7299a[i12 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i14) {
                        i13 = unsafe.getInt(t10, i17);
                        i14 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = m9034k & i11;
                switch (m9033j) {
                    case 0:
                        if ((i13 & i10) == 0) {
                            break;
                        } else {
                            c1875y7.m9096q(i15, C1555eb.m8105f(t10, j10));
                            continue;
                        }
                    case 1:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9105z(i15, C1555eb.m8106g(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9074E(i15, unsafe.getLong(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9090j(i15, unsafe.getLong(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9072C(i15, unsafe.getInt(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9103x(i15, unsafe.getLong(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9101v(i15, unsafe.getInt(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9092m(i15, C1555eb.m8096B(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i13 & i10) != 0) {
                            m9016C(i15, unsafe.getObject(t10, j10), c1875y7);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9076G(i15, unsafe.getObject(t10, j10), m9037n(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9094o(i15, (AbstractC1731p7) unsafe.getObject(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9088h(i15, unsafe.getInt(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9099t(i15, unsafe.getInt(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9077H(i15, unsafe.getInt(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9079J(i15, unsafe.getLong(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9081a(i15, unsafe.getInt(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9083c(i15, unsafe.getLong(t10, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i13 & i10) != 0) {
                            c1875y7.m9071B(i15, unsafe.getObject(t10, j10), m9037n(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C1605ha.m8276l(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 19:
                        C1605ha.m8280p(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 20:
                        C1605ha.m8283s(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 21:
                        C1605ha.m8238B(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 22:
                        C1605ha.m8282r(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 23:
                        C1605ha.m8279o(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 24:
                        C1605ha.m8278n(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 25:
                        C1605ha.m8274j(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        continue;
                    case 26:
                        C1605ha.m8289y(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7);
                        break;
                    case 27:
                        C1605ha.m8284t(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, m9037n(i12));
                        break;
                    case 28:
                        C1605ha.m8275k(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7);
                        break;
                    case 29:
                        C1605ha.m8290z(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        break;
                    case 30:
                        C1605ha.m8277m(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        break;
                    case 31:
                        C1605ha.m8285u(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        break;
                    case 32:
                        C1605ha.m8286v(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        break;
                    case 33:
                        C1605ha.m8287w(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        break;
                    case 34:
                        C1605ha.m8288x(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, false);
                        break;
                    case 35:
                        C1605ha.m8276l(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 36:
                        C1605ha.m8280p(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 37:
                        C1605ha.m8283s(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 38:
                        C1605ha.m8238B(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 39:
                        C1605ha.m8282r(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 40:
                        C1605ha.m8279o(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 41:
                        C1605ha.m8278n(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 42:
                        C1605ha.m8274j(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 43:
                        C1605ha.m8290z(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 44:
                        C1605ha.m8277m(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 45:
                        C1605ha.m8285u(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 46:
                        C1605ha.m8286v(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 47:
                        C1605ha.m8287w(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 48:
                        C1605ha.m8288x(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, true);
                        break;
                    case 49:
                        C1605ha.m8281q(this.f7299a[i12], (List) unsafe.getObject(t10, j10), c1875y7, m9037n(i12));
                        break;
                    case 50:
                        m9015B(c1875y7, i15, unsafe.getObject(t10, j10), i12);
                        break;
                    case 51:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9096q(i15, m9020H(t10, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9105z(i15, m9021I(t10, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9074E(i15, m9035l(t10, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9090j(i15, m9035l(t10, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9072C(i15, m9024L(t10, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9103x(i15, m9035l(t10, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9101v(i15, m9024L(t10, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9092m(i15, m9049z(t10, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (m9048y(t10, i15, i12)) {
                            m9016C(i15, unsafe.getObject(t10, j10), c1875y7);
                            break;
                        }
                        break;
                    case 60:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9076G(i15, unsafe.getObject(t10, j10), m9037n(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9094o(i15, (AbstractC1731p7) unsafe.getObject(t10, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9088h(i15, m9024L(t10, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9099t(i15, m9024L(t10, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9077H(i15, m9024L(t10, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9079J(i15, m9035l(t10, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9081a(i15, m9024L(t10, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9083c(i15, m9035l(t10, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (m9048y(t10, i15, i12)) {
                            c1875y7.m9071B(i15, unsafe.getObject(t10, j10), m9037n(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            AbstractC1814ua<?, ?> abstractC1814ua = this.f7310l;
            abstractC1814ua.mo8873i(abstractC1814ua.mo8867c(t10), c1875y7);
            return;
        }
        this.f7311m.mo8054a(t10);
        throw null;
    }

    /* renamed from: B */
    private final <K, V> void m9015B(C1875y7 c1875y7, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    /* renamed from: C */
    private static final void m9016C(int i10, Object obj, C1875y7 c1875y7) throws IOException {
        if (obj instanceof String) {
            c1875y7.m9086f(i10, (String) obj);
        } else {
            c1875y7.m9094o(i10, (AbstractC1731p7) obj);
        }
    }

    /* renamed from: E */
    static C1830va m9017E(Object obj) {
        AbstractC1732p8 abstractC1732p8 = (AbstractC1732p8) obj;
        C1830va c1830va = abstractC1732p8.zzc;
        if (c1830va != C1830va.m8915c()) {
            return c1830va;
        }
        C1830va m8917e = C1830va.m8917e();
        abstractC1732p8.zzc = m8917e;
        return m8917e;
    }

    /* renamed from: F */
    public static <T> C1861x9<T> m9018F(Class<T> cls, InterfaceC1749q9 interfaceC1749q9, C1893z9 c1893z9, AbstractC1604h9 abstractC1604h9, AbstractC1814ua<?, ?> abstractC1814ua, AbstractC1535d8<?> abstractC1535d8, C1717o9 c1717o9) {
        if (interfaceC1749q9 instanceof C1554ea) {
            return m9019G((C1554ea) interfaceC1749q9, c1893z9, abstractC1604h9, abstractC1814ua, abstractC1535d8, c1717o9);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.measurement.C1861x9<T> m9019G(com.google.android.gms.internal.measurement.C1554ea r34, com.google.android.gms.internal.measurement.C1893z9 r35, com.google.android.gms.internal.measurement.AbstractC1604h9 r36, com.google.android.gms.internal.measurement.AbstractC1814ua<?, ?> r37, com.google.android.gms.internal.measurement.AbstractC1535d8<?> r38, com.google.android.gms.internal.measurement.C1717o9 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1861x9.m9019G(com.google.android.gms.internal.measurement.ea, com.google.android.gms.internal.measurement.z9, com.google.android.gms.internal.measurement.h9, com.google.android.gms.internal.measurement.ua, com.google.android.gms.internal.measurement.d8, com.google.android.gms.internal.measurement.o9):com.google.android.gms.internal.measurement.x9");
    }

    /* renamed from: H */
    private static <T> double m9020H(T t10, long j10) {
        return ((Double) C1555eb.m8110k(t10, j10)).doubleValue();
    }

    /* renamed from: I */
    private static <T> float m9021I(T t10, long j10) {
        return ((Float) C1555eb.m8110k(t10, j10)).floatValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003c. Please report as an issue. */
    /* renamed from: J */
    private final int m9022J(T t10) {
        int i10;
        int m8996a;
        int m8996a2;
        int m8996a3;
        int m8997b;
        int m8996a4;
        int m9002z;
        int m8996a5;
        int m8996a6;
        int mo8352i;
        int m8996a7;
        int m8253Q;
        int m8995D;
        int m8996a8;
        int i11;
        Unsafe unsafe = f7298q;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        for (int i15 = 0; i15 < this.f7299a.length; i15 += 3) {
            int m9034k = m9034k(i15);
            int i16 = this.f7299a[i15];
            int m9033j = m9033j(m9034k);
            if (m9033j <= 17) {
                int i17 = this.f7299a[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i14) {
                    i13 = unsafe.getInt(t10, i18);
                    i14 = i18;
                }
            } else {
                i10 = 0;
            }
            long j10 = m9034k & 1048575;
            switch (m9033j) {
                case 0:
                    if ((i13 & i10) != 0) {
                        m8996a = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a + 8;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i10) != 0) {
                        m8996a2 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a2 + 4;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i13 & i10) != 0) {
                        long j11 = unsafe.getLong(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i16 << 3);
                        m8997b = AbstractC1859x7.m8997b(j11);
                        m8253Q = m8996a3 + m8997b;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i13 & i10) != 0) {
                        long j12 = unsafe.getLong(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i16 << 3);
                        m8997b = AbstractC1859x7.m8997b(j12);
                        m8253Q = m8996a3 + m8997b;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i13 & i10) != 0) {
                        int i19 = unsafe.getInt(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m9002z(i19);
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i10) != 0) {
                        m8996a = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a + 8;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i10) != 0) {
                        m8996a2 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a2 + 4;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i13 & i10) != 0) {
                        m8996a5 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a5 + 1;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i13 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t10, j10);
                        if (object instanceof AbstractC1731p7) {
                            m8996a6 = AbstractC1859x7.m8996a(i16 << 3);
                            mo8352i = ((AbstractC1731p7) object).mo8352i();
                            m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                            i11 = m8996a6 + m8996a7 + mo8352i;
                            i12 += i11;
                            break;
                        } else {
                            m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                            m9002z = AbstractC1859x7.m8994C((String) object);
                            i11 = m8996a4 + m9002z;
                            i12 += i11;
                        }
                    }
                case 9:
                    if ((i13 & i10) != 0) {
                        m8253Q = C1605ha.m8253Q(i16, unsafe.getObject(t10, j10), m9037n(i15));
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i13 & i10) != 0) {
                        AbstractC1731p7 abstractC1731p7 = (AbstractC1731p7) unsafe.getObject(t10, j10);
                        m8996a6 = AbstractC1859x7.m8996a(i16 << 3);
                        mo8352i = abstractC1731p7.mo8352i();
                        m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                        i11 = m8996a6 + m8996a7 + mo8352i;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i13 & i10) != 0) {
                        int i20 = unsafe.getInt(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m8996a(i20);
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i13 & i10) != 0) {
                        int i21 = unsafe.getInt(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m9002z(i21);
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i13 & i10) != 0) {
                        m8996a2 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a2 + 4;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i10) != 0) {
                        m8996a = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a + 8;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i13 & i10) != 0) {
                        int i22 = unsafe.getInt(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m8996a((i22 >> 31) ^ (i22 + i22));
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i13 & i10) != 0) {
                        long j13 = unsafe.getLong(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m8997b((j13 >> 63) ^ (j13 + j13));
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i13 & i10) != 0) {
                        m8253Q = AbstractC1859x7.m9001y(i16, (InterfaceC1813u9) unsafe.getObject(t10, j10), m9037n(i15));
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m8253Q = C1605ha.m8246J(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 19:
                    m8253Q = C1605ha.m8244H(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 20:
                    m8253Q = C1605ha.m8251O(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 21:
                    m8253Q = C1605ha.m8262Z(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 22:
                    m8253Q = C1605ha.m8249M(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 23:
                    m8253Q = C1605ha.m8246J(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 24:
                    m8253Q = C1605ha.m8244H(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 25:
                    m8253Q = C1605ha.m8237A(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 26:
                    m8253Q = C1605ha.m8259W(i16, (List) unsafe.getObject(t10, j10));
                    i12 += m8253Q;
                    break;
                case 27:
                    m8253Q = C1605ha.m8254R(i16, (List) unsafe.getObject(t10, j10), m9037n(i15));
                    i12 += m8253Q;
                    break;
                case 28:
                    m8253Q = C1605ha.m8241E(i16, (List) unsafe.getObject(t10, j10));
                    i12 += m8253Q;
                    break;
                case 29:
                    m8253Q = C1605ha.m8260X(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 30:
                    m8253Q = C1605ha.m8242F(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 31:
                    m8253Q = C1605ha.m8244H(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 32:
                    m8253Q = C1605ha.m8246J(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 33:
                    m8253Q = C1605ha.m8255S(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 34:
                    m8253Q = C1605ha.m8257U(i16, (List) unsafe.getObject(t10, j10), false);
                    i12 += m8253Q;
                    break;
                case 35:
                    m9002z = C1605ha.m8247K((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m9002z = C1605ha.m8245I((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m9002z = C1605ha.m8252P((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m9002z = C1605ha.m8264a0((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m9002z = C1605ha.m8250N((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m9002z = C1605ha.m8247K((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m9002z = C1605ha.m8245I((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m9002z = C1605ha.m8240D((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m9002z = C1605ha.m8261Y((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m9002z = C1605ha.m8243G((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m9002z = C1605ha.m8245I((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m9002z = C1605ha.m8247K((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m9002z = C1605ha.m8256T((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m9002z = C1605ha.m8258V((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i16);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m8253Q = C1605ha.m8248L(i16, (List) unsafe.getObject(t10, j10), m9037n(i15));
                    i12 += m8253Q;
                    break;
                case 50:
                    C1717o9.m8640a(i16, unsafe.getObject(t10, j10), m9038o(i15));
                    break;
                case 51:
                    if (m9048y(t10, i16, i15)) {
                        m8996a = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a + 8;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m9048y(t10, i16, i15)) {
                        m8996a2 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a2 + 4;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m9048y(t10, i16, i15)) {
                        long m9035l = m9035l(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i16 << 3);
                        m8997b = AbstractC1859x7.m8997b(m9035l);
                        m8253Q = m8996a3 + m8997b;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m9048y(t10, i16, i15)) {
                        long m9035l2 = m9035l(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i16 << 3);
                        m8997b = AbstractC1859x7.m8997b(m9035l2);
                        m8253Q = m8996a3 + m8997b;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m9048y(t10, i16, i15)) {
                        int m9024L = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m9002z(m9024L);
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m9048y(t10, i16, i15)) {
                        m8996a = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a + 8;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m9048y(t10, i16, i15)) {
                        m8996a2 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a2 + 4;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m9048y(t10, i16, i15)) {
                        m8996a5 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a5 + 1;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m9048y(t10, i16, i15)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t10, j10);
                        if (object2 instanceof AbstractC1731p7) {
                            m8996a6 = AbstractC1859x7.m8996a(i16 << 3);
                            mo8352i = ((AbstractC1731p7) object2).mo8352i();
                            m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                            i11 = m8996a6 + m8996a7 + mo8352i;
                            i12 += i11;
                            break;
                        } else {
                            m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                            m9002z = AbstractC1859x7.m8994C((String) object2);
                            i11 = m8996a4 + m9002z;
                            i12 += i11;
                        }
                    }
                case 60:
                    if (m9048y(t10, i16, i15)) {
                        m8253Q = C1605ha.m8253Q(i16, unsafe.getObject(t10, j10), m9037n(i15));
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m9048y(t10, i16, i15)) {
                        AbstractC1731p7 abstractC1731p72 = (AbstractC1731p7) unsafe.getObject(t10, j10);
                        m8996a6 = AbstractC1859x7.m8996a(i16 << 3);
                        mo8352i = abstractC1731p72.mo8352i();
                        m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                        i11 = m8996a6 + m8996a7 + mo8352i;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m9048y(t10, i16, i15)) {
                        int m9024L2 = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m8996a(m9024L2);
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m9048y(t10, i16, i15)) {
                        int m9024L3 = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m9002z(m9024L3);
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m9048y(t10, i16, i15)) {
                        m8996a2 = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a2 + 4;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m9048y(t10, i16, i15)) {
                        m8996a = AbstractC1859x7.m8996a(i16 << 3);
                        m8253Q = m8996a + 8;
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m9048y(t10, i16, i15)) {
                        int m9024L4 = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m8996a((m9024L4 >> 31) ^ (m9024L4 + m9024L4));
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m9048y(t10, i16, i15)) {
                        long m9035l3 = m9035l(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i16 << 3);
                        m9002z = AbstractC1859x7.m8997b((m9035l3 >> 63) ^ (m9035l3 + m9035l3));
                        i11 = m8996a4 + m9002z;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m9048y(t10, i16, i15)) {
                        m8253Q = AbstractC1859x7.m9001y(i16, (InterfaceC1813u9) unsafe.getObject(t10, j10), m9037n(i15));
                        i12 += m8253Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC1814ua<?, ?> abstractC1814ua = this.f7310l;
        int mo8865a = i12 + abstractC1814ua.mo8865a(abstractC1814ua.mo8867c(t10));
        if (!this.f7304f) {
            return mo8865a;
        }
        this.f7311m.mo8054a(t10);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0033. Please report as an issue. */
    /* renamed from: K */
    private final int m9023K(T t10) {
        int m8996a;
        int m8996a2;
        int m8996a3;
        int m8997b;
        int m8996a4;
        int m9002z;
        int m8996a5;
        int m8996a6;
        int mo8352i;
        int m8996a7;
        int m8253Q;
        int m8995D;
        int m8996a8;
        int i10;
        Unsafe unsafe = f7298q;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7299a.length; i12 += 3) {
            int m9034k = m9034k(i12);
            int m9033j = m9033j(m9034k);
            int i13 = this.f7299a[i12];
            long j10 = m9034k & 1048575;
            if (m9033j >= EnumC1620i8.f6878Z.zza() && m9033j <= EnumC1620i8.f6891m0.zza()) {
                int i14 = this.f7299a[i12 + 2];
            }
            switch (m9033j) {
                case 0:
                    if (m9045v(t10, i12)) {
                        m8996a = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a + 8;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m9045v(t10, i12)) {
                        m8996a2 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a2 + 4;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m9045v(t10, i12)) {
                        long m8108i = C1555eb.m8108i(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i13 << 3);
                        m8997b = AbstractC1859x7.m8997b(m8108i);
                        i11 += m8996a3 + m8997b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m9045v(t10, i12)) {
                        long m8108i2 = C1555eb.m8108i(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i13 << 3);
                        m8997b = AbstractC1859x7.m8997b(m8108i2);
                        i11 += m8996a3 + m8997b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m9045v(t10, i12)) {
                        int m8107h = C1555eb.m8107h(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m9002z(m8107h);
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m9045v(t10, i12)) {
                        m8996a = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a + 8;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m9045v(t10, i12)) {
                        m8996a2 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a2 + 4;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m9045v(t10, i12)) {
                        m8996a5 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a5 + 1;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m9045v(t10, i12)) {
                        break;
                    } else {
                        Object m8110k = C1555eb.m8110k(t10, j10);
                        if (m8110k instanceof AbstractC1731p7) {
                            m8996a6 = AbstractC1859x7.m8996a(i13 << 3);
                            mo8352i = ((AbstractC1731p7) m8110k).mo8352i();
                            m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                            i10 = m8996a6 + m8996a7 + mo8352i;
                            i11 += i10;
                            break;
                        } else {
                            m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                            m9002z = AbstractC1859x7.m8994C((String) m8110k);
                            i10 = m8996a4 + m9002z;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (m9045v(t10, i12)) {
                        m8253Q = C1605ha.m8253Q(i13, C1555eb.m8110k(t10, j10), m9037n(i12));
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m9045v(t10, i12)) {
                        AbstractC1731p7 abstractC1731p7 = (AbstractC1731p7) C1555eb.m8110k(t10, j10);
                        m8996a6 = AbstractC1859x7.m8996a(i13 << 3);
                        mo8352i = abstractC1731p7.mo8352i();
                        m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                        i10 = m8996a6 + m8996a7 + mo8352i;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m9045v(t10, i12)) {
                        int m8107h2 = C1555eb.m8107h(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m8996a(m8107h2);
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m9045v(t10, i12)) {
                        int m8107h3 = C1555eb.m8107h(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m9002z(m8107h3);
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m9045v(t10, i12)) {
                        m8996a2 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a2 + 4;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m9045v(t10, i12)) {
                        m8996a = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a + 8;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m9045v(t10, i12)) {
                        int m8107h4 = C1555eb.m8107h(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m8996a((m8107h4 >> 31) ^ (m8107h4 + m8107h4));
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m9045v(t10, i12)) {
                        long m8108i3 = C1555eb.m8108i(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m8997b((m8108i3 >> 63) ^ (m8108i3 + m8108i3));
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m9045v(t10, i12)) {
                        m8253Q = AbstractC1859x7.m9001y(i13, (InterfaceC1813u9) C1555eb.m8110k(t10, j10), m9037n(i12));
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m8253Q = C1605ha.m8246J(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 19:
                    m8253Q = C1605ha.m8244H(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 20:
                    m8253Q = C1605ha.m8251O(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 21:
                    m8253Q = C1605ha.m8262Z(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 22:
                    m8253Q = C1605ha.m8249M(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 23:
                    m8253Q = C1605ha.m8246J(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 24:
                    m8253Q = C1605ha.m8244H(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 25:
                    m8253Q = C1605ha.m8237A(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 26:
                    m8253Q = C1605ha.m8259W(i13, (List) C1555eb.m8110k(t10, j10));
                    i11 += m8253Q;
                    break;
                case 27:
                    m8253Q = C1605ha.m8254R(i13, (List) C1555eb.m8110k(t10, j10), m9037n(i12));
                    i11 += m8253Q;
                    break;
                case 28:
                    m8253Q = C1605ha.m8241E(i13, (List) C1555eb.m8110k(t10, j10));
                    i11 += m8253Q;
                    break;
                case 29:
                    m8253Q = C1605ha.m8260X(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 30:
                    m8253Q = C1605ha.m8242F(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 31:
                    m8253Q = C1605ha.m8244H(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 32:
                    m8253Q = C1605ha.m8246J(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 33:
                    m8253Q = C1605ha.m8255S(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 34:
                    m8253Q = C1605ha.m8257U(i13, (List) C1555eb.m8110k(t10, j10), false);
                    i11 += m8253Q;
                    break;
                case 35:
                    m9002z = C1605ha.m8247K((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m9002z = C1605ha.m8245I((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m9002z = C1605ha.m8252P((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m9002z = C1605ha.m8264a0((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m9002z = C1605ha.m8250N((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m9002z = C1605ha.m8247K((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m9002z = C1605ha.m8245I((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m9002z = C1605ha.m8240D((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m9002z = C1605ha.m8261Y((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m9002z = C1605ha.m8243G((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m9002z = C1605ha.m8245I((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m9002z = C1605ha.m8247K((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m9002z = C1605ha.m8256T((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m9002z = C1605ha.m8258V((List) unsafe.getObject(t10, j10));
                    if (m9002z > 0) {
                        m8995D = AbstractC1859x7.m8995D(i13);
                        m8996a8 = AbstractC1859x7.m8996a(m9002z);
                        m8996a4 = m8995D + m8996a8;
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m8253Q = C1605ha.m8248L(i13, (List) C1555eb.m8110k(t10, j10), m9037n(i12));
                    i11 += m8253Q;
                    break;
                case 50:
                    C1717o9.m8640a(i13, C1555eb.m8110k(t10, j10), m9038o(i12));
                    break;
                case 51:
                    if (m9048y(t10, i13, i12)) {
                        m8996a = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a + 8;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m9048y(t10, i13, i12)) {
                        m8996a2 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a2 + 4;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m9048y(t10, i13, i12)) {
                        long m9035l = m9035l(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i13 << 3);
                        m8997b = AbstractC1859x7.m8997b(m9035l);
                        i11 += m8996a3 + m8997b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m9048y(t10, i13, i12)) {
                        long m9035l2 = m9035l(t10, j10);
                        m8996a3 = AbstractC1859x7.m8996a(i13 << 3);
                        m8997b = AbstractC1859x7.m8997b(m9035l2);
                        i11 += m8996a3 + m8997b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m9048y(t10, i13, i12)) {
                        int m9024L = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m9002z(m9024L);
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m9048y(t10, i13, i12)) {
                        m8996a = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a + 8;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m9048y(t10, i13, i12)) {
                        m8996a2 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a2 + 4;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m9048y(t10, i13, i12)) {
                        m8996a5 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a5 + 1;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m9048y(t10, i13, i12)) {
                        break;
                    } else {
                        Object m8110k2 = C1555eb.m8110k(t10, j10);
                        if (m8110k2 instanceof AbstractC1731p7) {
                            m8996a6 = AbstractC1859x7.m8996a(i13 << 3);
                            mo8352i = ((AbstractC1731p7) m8110k2).mo8352i();
                            m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                            i10 = m8996a6 + m8996a7 + mo8352i;
                            i11 += i10;
                            break;
                        } else {
                            m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                            m9002z = AbstractC1859x7.m8994C((String) m8110k2);
                            i10 = m8996a4 + m9002z;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (m9048y(t10, i13, i12)) {
                        m8253Q = C1605ha.m8253Q(i13, C1555eb.m8110k(t10, j10), m9037n(i12));
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m9048y(t10, i13, i12)) {
                        AbstractC1731p7 abstractC1731p72 = (AbstractC1731p7) C1555eb.m8110k(t10, j10);
                        m8996a6 = AbstractC1859x7.m8996a(i13 << 3);
                        mo8352i = abstractC1731p72.mo8352i();
                        m8996a7 = AbstractC1859x7.m8996a(mo8352i);
                        i10 = m8996a6 + m8996a7 + mo8352i;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m9048y(t10, i13, i12)) {
                        int m9024L2 = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m8996a(m9024L2);
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m9048y(t10, i13, i12)) {
                        int m9024L3 = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m9002z(m9024L3);
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m9048y(t10, i13, i12)) {
                        m8996a2 = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a2 + 4;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m9048y(t10, i13, i12)) {
                        m8996a = AbstractC1859x7.m8996a(i13 << 3);
                        m8253Q = m8996a + 8;
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m9048y(t10, i13, i12)) {
                        int m9024L4 = m9024L(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m8996a((m9024L4 >> 31) ^ (m9024L4 + m9024L4));
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m9048y(t10, i13, i12)) {
                        long m9035l3 = m9035l(t10, j10);
                        m8996a4 = AbstractC1859x7.m8996a(i13 << 3);
                        m9002z = AbstractC1859x7.m8997b((m9035l3 >> 63) ^ (m9035l3 + m9035l3));
                        i10 = m8996a4 + m9002z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m9048y(t10, i13, i12)) {
                        m8253Q = AbstractC1859x7.m9001y(i13, (InterfaceC1813u9) C1555eb.m8110k(t10, j10), m9037n(i12));
                        i11 += m8253Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC1814ua<?, ?> abstractC1814ua = this.f7310l;
        return i11 + abstractC1814ua.mo8865a(abstractC1814ua.mo8867c(t10));
    }

    /* renamed from: L */
    private static <T> int m9024L(T t10, long j10) {
        return ((Integer) C1555eb.m8110k(t10, j10)).intValue();
    }

    /* renamed from: M */
    private final <K, V> int m9025M(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C1517c7 c1517c7) throws IOException {
        Unsafe unsafe = f7298q;
        Object m9038o = m9038o(i12);
        Object object = unsafe.getObject(t10, j10);
        if (!((C1701n9) object).m8624h()) {
            C1701n9<K, V> m8621d = C1701n9.m8618a().m8621d();
            C1717o9.m8641b(m8621d, object);
            unsafe.putObject(t10, j10, m8621d);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    /* renamed from: N */
    private final int m9026N(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C1517c7 c1517c7) throws IOException {
        Unsafe unsafe = f7298q;
        long j11 = this.f7299a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(Double.longBitsToDouble(C1534d7.m8053n(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(Float.intBitsToFloat(C1534d7.m8041b(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m8052m = C1534d7.m8052m(bArr, i10, c1517c7);
                    unsafe.putObject(t10, j10, Long.valueOf(c1517c7.f6723b));
                    unsafe.putInt(t10, j11, i13);
                    return m8052m;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    int m8049j = C1534d7.m8049j(bArr, i10, c1517c7);
                    unsafe.putObject(t10, j10, Integer.valueOf(c1517c7.f6722a));
                    unsafe.putInt(t10, j11, i13);
                    return m8049j;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(C1534d7.m8053n(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(C1534d7.m8041b(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    int m8052m2 = C1534d7.m8052m(bArr, i10, c1517c7);
                    unsafe.putObject(t10, j10, Boolean.valueOf(c1517c7.f6723b != 0));
                    unsafe.putInt(t10, j11, i13);
                    return m8052m2;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    int m8049j2 = C1534d7.m8049j(bArr, i10, c1517c7);
                    int i18 = c1517c7.f6722a;
                    if (i18 == 0) {
                        unsafe.putObject(t10, j10, BuildConfig.FLAVOR);
                    } else {
                        if ((i15 & 536870912) != 0 && !C1639jb.m8341f(bArr, m8049j2, m8049j2 + i18)) {
                            throw C1892z8.m9149c();
                        }
                        unsafe.putObject(t10, j10, new String(bArr, m8049j2, i18, C1860x8.f7292b));
                        m8049j2 += i18;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return m8049j2;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    int m8043d = C1534d7.m8043d(m9037n(i17), bArr, i10, i11, c1517c7);
                    Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, c1517c7.f6724c);
                    } else {
                        unsafe.putObject(t10, j10, C1860x8.m9011g(object, c1517c7.f6724c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return m8043d;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    int m8040a = C1534d7.m8040a(bArr, i10, c1517c7);
                    unsafe.putObject(t10, j10, c1517c7.f6724c);
                    unsafe.putInt(t10, j11, i13);
                    return m8040a;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int m8049j3 = C1534d7.m8049j(bArr, i10, c1517c7);
                    int i19 = c1517c7.f6722a;
                    InterfaceC1796t8 m9036m = m9036m(i17);
                    if (m9036m != null && !m9036m.mo7980f(i19)) {
                        m9017E(t10).m8922h(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i19));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return m8049j3;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    int m8049j4 = C1534d7.m8049j(bArr, i10, c1517c7);
                    unsafe.putObject(t10, j10, Integer.valueOf(C1795t7.m8846a(c1517c7.f6722a)));
                    unsafe.putInt(t10, j11, i13);
                    return m8049j4;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    int m8052m3 = C1534d7.m8052m(bArr, i10, c1517c7);
                    unsafe.putObject(t10, j10, Long.valueOf(C1795t7.m8847b(c1517c7.f6723b)));
                    unsafe.putInt(t10, j11, i13);
                    return m8052m3;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    int m8042c = C1534d7.m8042c(m9037n(i17), bArr, i10, i11, (i12 & (-8)) | 4, c1517c7);
                    Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t10, j10, c1517c7.f6724c);
                    } else {
                        unsafe.putObject(t10, j10, C1860x8.m9011g(object2, c1517c7.f6724c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return m8042c;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a8, code lost:
    
        if (r0 != r15) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02aa, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02be, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f1, code lost:
    
        if (r0 != r15) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0314, code lost:
    
        if (r0 != r15) goto L284;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0097. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m9027O(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C1517c7 r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1861x9.m9027O(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.c7):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    private final int m9028P(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C1517c7 c1517c7) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int m8049j;
        int i21 = i10;
        Unsafe unsafe = f7298q;
        InterfaceC1844w8 interfaceC1844w8 = (InterfaceC1844w8) unsafe.getObject(t10, j11);
        if (!interfaceC1844w8.mo7888a()) {
            int size = interfaceC1844w8.size();
            interfaceC1844w8 = interfaceC1844w8.mo8008g(size == 0 ? 10 : size + size);
            unsafe.putObject(t10, j11, interfaceC1844w8);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    C1891z7 c1891z7 = (C1891z7) interfaceC1844w8;
                    int m8049j2 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i22 = c1517c7.f6722a + m8049j2;
                    while (m8049j2 < i22) {
                        c1891z7.m9146e(Double.longBitsToDouble(C1534d7.m8053n(bArr, m8049j2)));
                        m8049j2 += 8;
                    }
                    if (m8049j2 == i22) {
                        return m8049j2;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 1) {
                    C1891z7 c1891z72 = (C1891z7) interfaceC1844w8;
                    c1891z72.m9146e(Double.longBitsToDouble(C1534d7.m8053n(bArr, i10)));
                    while (true) {
                        i17 = i21 + 8;
                        if (i17 < i11) {
                            i21 = C1534d7.m8049j(bArr, i17, c1517c7);
                            if (i12 == c1517c7.f6722a) {
                                c1891z72.m9146e(Double.longBitsToDouble(C1534d7.m8053n(bArr, i21)));
                            }
                        }
                    }
                    return i17;
                }
                return i21;
            case 19:
            case 36:
                if (i14 == 2) {
                    C1636j8 c1636j8 = (C1636j8) interfaceC1844w8;
                    int m8049j3 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i23 = c1517c7.f6722a + m8049j3;
                    while (m8049j3 < i23) {
                        c1636j8.m8333e(Float.intBitsToFloat(C1534d7.m8041b(bArr, m8049j3)));
                        m8049j3 += 4;
                    }
                    if (m8049j3 == i23) {
                        return m8049j3;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 5) {
                    C1636j8 c1636j82 = (C1636j8) interfaceC1844w8;
                    c1636j82.m8333e(Float.intBitsToFloat(C1534d7.m8041b(bArr, i10)));
                    while (true) {
                        i18 = i21 + 4;
                        if (i18 < i11) {
                            i21 = C1534d7.m8049j(bArr, i18, c1517c7);
                            if (i12 == c1517c7.f6722a) {
                                c1636j82.m8333e(Float.intBitsToFloat(C1534d7.m8041b(bArr, i21)));
                            }
                        }
                    }
                    return i18;
                }
                return i21;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    C1621i9 c1621i9 = (C1621i9) interfaceC1844w8;
                    int m8049j4 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i24 = c1517c7.f6722a + m8049j4;
                    while (m8049j4 < i24) {
                        m8049j4 = C1534d7.m8052m(bArr, m8049j4, c1517c7);
                        c1621i9.m8307i(c1517c7.f6723b);
                    }
                    if (m8049j4 == i24) {
                        return m8049j4;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 0) {
                    C1621i9 c1621i92 = (C1621i9) interfaceC1844w8;
                    int m8052m = C1534d7.m8052m(bArr, i21, c1517c7);
                    c1621i92.m8307i(c1517c7.f6723b);
                    while (m8052m < i11) {
                        int m8049j5 = C1534d7.m8049j(bArr, m8052m, c1517c7);
                        if (i12 != c1517c7.f6722a) {
                            return m8052m;
                        }
                        m8052m = C1534d7.m8052m(bArr, m8049j5, c1517c7);
                        c1621i92.m8307i(c1517c7.f6723b);
                    }
                    return m8052m;
                }
                return i21;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C1534d7.m8045f(bArr, i21, interfaceC1844w8, c1517c7);
                }
                if (i14 == 0) {
                    return C1534d7.m8051l(i12, bArr, i10, i11, interfaceC1844w8, c1517c7);
                }
                return i21;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    C1621i9 c1621i93 = (C1621i9) interfaceC1844w8;
                    int m8049j6 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i25 = c1517c7.f6722a + m8049j6;
                    while (m8049j6 < i25) {
                        c1621i93.m8307i(C1534d7.m8053n(bArr, m8049j6));
                        m8049j6 += 8;
                    }
                    if (m8049j6 == i25) {
                        return m8049j6;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 1) {
                    C1621i9 c1621i94 = (C1621i9) interfaceC1844w8;
                    c1621i94.m8307i(C1534d7.m8053n(bArr, i10));
                    while (true) {
                        i19 = i21 + 8;
                        if (i19 < i11) {
                            i21 = C1534d7.m8049j(bArr, i19, c1517c7);
                            if (i12 == c1517c7.f6722a) {
                                c1621i94.m8307i(C1534d7.m8053n(bArr, i21));
                            }
                        }
                    }
                    return i19;
                }
                return i21;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    C1748q8 c1748q8 = (C1748q8) interfaceC1844w8;
                    int m8049j7 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i26 = c1517c7.f6722a + m8049j7;
                    while (m8049j7 < i26) {
                        c1748q8.m8733k(C1534d7.m8041b(bArr, m8049j7));
                        m8049j7 += 4;
                    }
                    if (m8049j7 == i26) {
                        return m8049j7;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 5) {
                    C1748q8 c1748q82 = (C1748q8) interfaceC1844w8;
                    c1748q82.m8733k(C1534d7.m8041b(bArr, i10));
                    while (true) {
                        i20 = i21 + 4;
                        if (i20 < i11) {
                            i21 = C1534d7.m8049j(bArr, i20, c1517c7);
                            if (i12 == c1517c7.f6722a) {
                                c1748q82.m8733k(C1534d7.m8041b(bArr, i21));
                            }
                        }
                    }
                    return i20;
                }
                return i21;
            case 25:
            case 42:
                if (i14 == 2) {
                    C1551e7 c1551e7 = (C1551e7) interfaceC1844w8;
                    m8049j = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i27 = c1517c7.f6722a + m8049j;
                    while (m8049j < i27) {
                        m8049j = C1534d7.m8052m(bArr, m8049j, c1517c7);
                        c1551e7.m8091e(c1517c7.f6723b != 0);
                    }
                    if (m8049j != i27) {
                        throw C1892z8.m9152f();
                    }
                    return m8049j;
                }
                if (i14 == 0) {
                    C1551e7 c1551e72 = (C1551e7) interfaceC1844w8;
                    int m8052m2 = C1534d7.m8052m(bArr, i21, c1517c7);
                    c1551e72.m8091e(c1517c7.f6723b != 0);
                    while (m8052m2 < i11) {
                        int m8049j8 = C1534d7.m8049j(bArr, m8052m2, c1517c7);
                        if (i12 != c1517c7.f6722a) {
                            return m8052m2;
                        }
                        m8052m2 = C1534d7.m8052m(bArr, m8049j8, c1517c7);
                        c1551e72.m8091e(c1517c7.f6723b != 0);
                    }
                    return m8052m2;
                }
                return i21;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        i21 = C1534d7.m8049j(bArr, i21, c1517c7);
                        int i28 = c1517c7.f6722a;
                        if (i28 < 0) {
                            throw C1892z8.m9150d();
                        }
                        if (i28 == 0) {
                            interfaceC1844w8.add(BuildConfig.FLAVOR);
                        } else {
                            interfaceC1844w8.add(new String(bArr, i21, i28, C1860x8.f7292b));
                            i21 += i28;
                        }
                        while (i21 < i11) {
                            int m8049j9 = C1534d7.m8049j(bArr, i21, c1517c7);
                            if (i12 == c1517c7.f6722a) {
                                i21 = C1534d7.m8049j(bArr, m8049j9, c1517c7);
                                int i29 = c1517c7.f6722a;
                                if (i29 < 0) {
                                    throw C1892z8.m9150d();
                                }
                                if (i29 == 0) {
                                    interfaceC1844w8.add(BuildConfig.FLAVOR);
                                } else {
                                    interfaceC1844w8.add(new String(bArr, i21, i29, C1860x8.f7292b));
                                    i21 += i29;
                                }
                            }
                        }
                    } else {
                        i21 = C1534d7.m8049j(bArr, i21, c1517c7);
                        int i30 = c1517c7.f6722a;
                        if (i30 < 0) {
                            throw C1892z8.m9150d();
                        }
                        if (i30 == 0) {
                            interfaceC1844w8.add(BuildConfig.FLAVOR);
                        } else {
                            int i31 = i21 + i30;
                            if (C1639jb.m8341f(bArr, i21, i31)) {
                                interfaceC1844w8.add(new String(bArr, i21, i30, C1860x8.f7292b));
                                i21 = i31;
                            } else {
                                throw C1892z8.m9149c();
                            }
                        }
                        while (i21 < i11) {
                            int m8049j10 = C1534d7.m8049j(bArr, i21, c1517c7);
                            if (i12 == c1517c7.f6722a) {
                                i21 = C1534d7.m8049j(bArr, m8049j10, c1517c7);
                                int i32 = c1517c7.f6722a;
                                if (i32 < 0) {
                                    throw C1892z8.m9150d();
                                }
                                if (i32 == 0) {
                                    interfaceC1844w8.add(BuildConfig.FLAVOR);
                                } else {
                                    int i33 = i21 + i32;
                                    if (C1639jb.m8341f(bArr, i21, i33)) {
                                        interfaceC1844w8.add(new String(bArr, i21, i32, C1860x8.f7292b));
                                        i21 = i33;
                                    } else {
                                        throw C1892z8.m9149c();
                                    }
                                }
                            }
                        }
                    }
                }
                return i21;
            case 27:
                if (i14 == 2) {
                    return C1534d7.m8044e(m9037n(i15), i12, bArr, i10, i11, interfaceC1844w8, c1517c7);
                }
                return i21;
            case 28:
                if (i14 == 2) {
                    int m8049j11 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i34 = c1517c7.f6722a;
                    if (i34 >= 0) {
                        if (i34 > bArr.length - m8049j11) {
                            throw C1892z8.m9152f();
                        }
                        if (i34 == 0) {
                            interfaceC1844w8.add(AbstractC1731p7.f7144o);
                        } else {
                            interfaceC1844w8.add(AbstractC1731p7.m8663s(bArr, m8049j11, i34));
                            m8049j11 += i34;
                        }
                        while (m8049j11 < i11) {
                            int m8049j12 = C1534d7.m8049j(bArr, m8049j11, c1517c7);
                            if (i12 != c1517c7.f6722a) {
                                return m8049j11;
                            }
                            m8049j11 = C1534d7.m8049j(bArr, m8049j12, c1517c7);
                            int i35 = c1517c7.f6722a;
                            if (i35 >= 0) {
                                if (i35 > bArr.length - m8049j11) {
                                    throw C1892z8.m9152f();
                                }
                                if (i35 == 0) {
                                    interfaceC1844w8.add(AbstractC1731p7.f7144o);
                                } else {
                                    interfaceC1844w8.add(AbstractC1731p7.m8663s(bArr, m8049j11, i35));
                                    m8049j11 += i35;
                                }
                            } else {
                                throw C1892z8.m9150d();
                            }
                        }
                        return m8049j11;
                    }
                    throw C1892z8.m9150d();
                }
                return i21;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        m8049j = C1534d7.m8051l(i12, bArr, i10, i11, interfaceC1844w8, c1517c7);
                    }
                    return i21;
                }
                m8049j = C1534d7.m8045f(bArr, i21, interfaceC1844w8, c1517c7);
                AbstractC1732p8 abstractC1732p8 = (AbstractC1732p8) t10;
                C1830va c1830va = abstractC1732p8.zzc;
                if (c1830va == C1830va.m8915c()) {
                    c1830va = null;
                }
                Object m8267c = C1605ha.m8267c(i13, interfaceC1844w8, m9036m(i15), c1830va, this.f7310l);
                if (m8267c != null) {
                    abstractC1732p8.zzc = (C1830va) m8267c;
                    return m8049j;
                }
                return m8049j;
            case 33:
            case 47:
                if (i14 == 2) {
                    C1748q8 c1748q83 = (C1748q8) interfaceC1844w8;
                    int m8049j13 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i36 = c1517c7.f6722a + m8049j13;
                    while (m8049j13 < i36) {
                        m8049j13 = C1534d7.m8049j(bArr, m8049j13, c1517c7);
                        c1748q83.m8733k(C1795t7.m8846a(c1517c7.f6722a));
                    }
                    if (m8049j13 == i36) {
                        return m8049j13;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 0) {
                    C1748q8 c1748q84 = (C1748q8) interfaceC1844w8;
                    int m8049j14 = C1534d7.m8049j(bArr, i21, c1517c7);
                    c1748q84.m8733k(C1795t7.m8846a(c1517c7.f6722a));
                    while (m8049j14 < i11) {
                        int m8049j15 = C1534d7.m8049j(bArr, m8049j14, c1517c7);
                        if (i12 != c1517c7.f6722a) {
                            return m8049j14;
                        }
                        m8049j14 = C1534d7.m8049j(bArr, m8049j15, c1517c7);
                        c1748q84.m8733k(C1795t7.m8846a(c1517c7.f6722a));
                    }
                    return m8049j14;
                }
                return i21;
            case 34:
            case 48:
                if (i14 == 2) {
                    C1621i9 c1621i95 = (C1621i9) interfaceC1844w8;
                    int m8049j16 = C1534d7.m8049j(bArr, i21, c1517c7);
                    int i37 = c1517c7.f6722a + m8049j16;
                    while (m8049j16 < i37) {
                        m8049j16 = C1534d7.m8052m(bArr, m8049j16, c1517c7);
                        c1621i95.m8307i(C1795t7.m8847b(c1517c7.f6723b));
                    }
                    if (m8049j16 == i37) {
                        return m8049j16;
                    }
                    throw C1892z8.m9152f();
                }
                if (i14 == 0) {
                    C1621i9 c1621i96 = (C1621i9) interfaceC1844w8;
                    int m8052m3 = C1534d7.m8052m(bArr, i21, c1517c7);
                    c1621i96.m8307i(C1795t7.m8847b(c1517c7.f6723b));
                    while (m8052m3 < i11) {
                        int m8049j17 = C1534d7.m8049j(bArr, m8052m3, c1517c7);
                        if (i12 != c1517c7.f6722a) {
                            return m8052m3;
                        }
                        m8052m3 = C1534d7.m8052m(bArr, m8049j17, c1517c7);
                        c1621i96.m8307i(C1795t7.m8847b(c1517c7.f6723b));
                    }
                    return m8052m3;
                }
                return i21;
            default:
                if (i14 == 3) {
                    InterfaceC1571fa m9037n = m9037n(i15);
                    int i38 = (i12 & (-8)) | 4;
                    int m8042c = C1534d7.m8042c(m9037n, bArr, i10, i11, i38, c1517c7);
                    interfaceC1844w8.add(c1517c7.f6724c);
                    while (m8042c < i11) {
                        int m8049j18 = C1534d7.m8049j(bArr, m8042c, c1517c7);
                        if (i12 != c1517c7.f6722a) {
                            return m8042c;
                        }
                        m8042c = C1534d7.m8042c(m9037n, bArr, m8049j18, i11, i38, c1517c7);
                        interfaceC1844w8.add(c1517c7.f6724c);
                    }
                    return m8042c;
                }
                return i21;
        }
    }

    /* renamed from: Q */
    private final int m9029Q(int i10) {
        if (i10 < this.f7301c || i10 > this.f7302d) {
            return -1;
        }
        return m9032T(i10, 0);
    }

    /* renamed from: R */
    private final int m9030R(int i10, int i11) {
        if (i10 < this.f7301c || i10 > this.f7302d) {
            return -1;
        }
        return m9032T(i10, i11);
    }

    /* renamed from: S */
    private final int m9031S(int i10) {
        return this.f7299a[i10 + 2];
    }

    /* renamed from: T */
    private final int m9032T(int i10, int i11) {
        int length = (this.f7299a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f7299a[i13];
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

    /* renamed from: j */
    private static int m9033j(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m9034k(int i10) {
        return this.f7299a[i10 + 1];
    }

    /* renamed from: l */
    private static <T> long m9035l(T t10, long j10) {
        return ((Long) C1555eb.m8110k(t10, j10)).longValue();
    }

    /* renamed from: m */
    private final InterfaceC1796t8 m9036m(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC1796t8) this.f7300b[i11 + i11 + 1];
    }

    /* renamed from: n */
    private final InterfaceC1571fa m9037n(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC1571fa interfaceC1571fa = (InterfaceC1571fa) this.f7300b[i12];
        if (interfaceC1571fa != null) {
            return interfaceC1571fa;
        }
        InterfaceC1571fa<T> m8012b = C1520ca.m8011a().m8012b((Class) this.f7300b[i12 + 1]);
        this.f7300b[i12] = m8012b;
        return m8012b;
    }

    /* renamed from: o */
    private final Object m9038o(int i10) {
        int i11 = i10 / 3;
        return this.f7300b[i11 + i11];
    }

    /* renamed from: p */
    private static Field m9039p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: q */
    private final void m9040q(T t10, T t11, int i10) {
        long m9034k = m9034k(i10) & 1048575;
        if (m9045v(t11, i10)) {
            Object m8110k = C1555eb.m8110k(t10, m9034k);
            Object m8110k2 = C1555eb.m8110k(t11, m9034k);
            if (m8110k != null && m8110k2 != null) {
                C1555eb.m8123x(t10, m9034k, C1860x8.m9011g(m8110k, m8110k2));
                m9042s(t10, i10);
            } else if (m8110k2 != null) {
                C1555eb.m8123x(t10, m9034k, m8110k2);
                m9042s(t10, i10);
            }
        }
    }

    /* renamed from: r */
    private final void m9041r(T t10, T t11, int i10) {
        int m9034k = m9034k(i10);
        int i11 = this.f7299a[i10];
        long j10 = m9034k & 1048575;
        if (m9048y(t11, i11, i10)) {
            Object m8110k = m9048y(t10, i11, i10) ? C1555eb.m8110k(t10, j10) : null;
            Object m8110k2 = C1555eb.m8110k(t11, j10);
            if (m8110k != null && m8110k2 != null) {
                C1555eb.m8123x(t10, j10, C1860x8.m9011g(m8110k, m8110k2));
                m9043t(t10, i11, i10);
            } else if (m8110k2 != null) {
                C1555eb.m8123x(t10, j10, m8110k2);
                m9043t(t10, i11, i10);
            }
        }
    }

    /* renamed from: s */
    private final void m9042s(T t10, int i10) {
        int m9031S = m9031S(i10);
        long j10 = 1048575 & m9031S;
        if (j10 == 1048575) {
            return;
        }
        C1555eb.m8121v(t10, j10, (1 << (m9031S >>> 20)) | C1555eb.m8107h(t10, j10));
    }

    /* renamed from: t */
    private final void m9043t(T t10, int i10, int i11) {
        C1555eb.m8121v(t10, m9031S(i11) & 1048575, i10);
    }

    /* renamed from: u */
    private final boolean m9044u(T t10, T t11, int i10) {
        return m9045v(t10, i10) == m9045v(t11, i10);
    }

    /* renamed from: v */
    private final boolean m9045v(T t10, int i10) {
        int m9031S = m9031S(i10);
        long j10 = m9031S & 1048575;
        if (j10 != 1048575) {
            return (C1555eb.m8107h(t10, j10) & (1 << (m9031S >>> 20))) != 0;
        }
        int m9034k = m9034k(i10);
        long j11 = m9034k & 1048575;
        switch (m9033j(m9034k)) {
            case 0:
                return Double.doubleToRawLongBits(C1555eb.m8105f(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(C1555eb.m8106g(t10, j11)) != 0;
            case 2:
                return C1555eb.m8108i(t10, j11) != 0;
            case 3:
                return C1555eb.m8108i(t10, j11) != 0;
            case 4:
                return C1555eb.m8107h(t10, j11) != 0;
            case 5:
                return C1555eb.m8108i(t10, j11) != 0;
            case 6:
                return C1555eb.m8107h(t10, j11) != 0;
            case 7:
                return C1555eb.m8096B(t10, j11);
            case 8:
                Object m8110k = C1555eb.m8110k(t10, j11);
                if (m8110k instanceof String) {
                    return !((String) m8110k).isEmpty();
                }
                if (m8110k instanceof AbstractC1731p7) {
                    return !AbstractC1731p7.f7144o.equals(m8110k);
                }
                throw new IllegalArgumentException();
            case 9:
                return C1555eb.m8110k(t10, j11) != null;
            case 10:
                return !AbstractC1731p7.f7144o.equals(C1555eb.m8110k(t10, j11));
            case 11:
                return C1555eb.m8107h(t10, j11) != 0;
            case 12:
                return C1555eb.m8107h(t10, j11) != 0;
            case 13:
                return C1555eb.m8107h(t10, j11) != 0;
            case 14:
                return C1555eb.m8108i(t10, j11) != 0;
            case 15:
                return C1555eb.m8107h(t10, j11) != 0;
            case 16:
                return C1555eb.m8108i(t10, j11) != 0;
            case 17:
                return C1555eb.m8110k(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: w */
    private final boolean m9046w(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? m9045v(t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private static boolean m9047x(Object obj, int i10, InterfaceC1571fa interfaceC1571fa) {
        return interfaceC1571fa.mo8163f(C1555eb.m8110k(obj, i10 & 1048575));
    }

    /* renamed from: y */
    private final boolean m9048y(T t10, int i10, int i11) {
        return C1555eb.m8107h(t10, (long) (m9031S(i11) & 1048575)) == i10;
    }

    /* renamed from: z */
    private static <T> boolean m9049z(T t10, long j10) {
        return ((Boolean) C1555eb.m8110k(t10, j10)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0419, code lost:
    
        if (r6 == 1048575) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x041b, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0421, code lost:
    
        r3 = r9.f7307i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0425, code lost:
    
        if (r3 >= r9.f7308j) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0427, code lost:
    
        r4 = r9.f7306h[r3];
        r5 = r9.f7299a[r4];
        r5 = com.google.android.gms.internal.measurement.C1555eb.m8110k(r12, r9.m9034k(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0439, code lost:
    
        if (r5 != null) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0440, code lost:
    
        if (r9.m9036m(r4) != null) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0445, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.C1701n9) r5;
        r0 = (com.google.android.gms.internal.measurement.C1685m9) r9.m9038o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x044d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0442, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x044e, code lost:
    
        if (r7 != 0) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0452, code lost:
    
        if (r0 != r32) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0459, code lost:
    
        throw com.google.android.gms.internal.measurement.C1892z8.m9151e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0460, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x045c, code lost:
    
        if (r0 > r32) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x045e, code lost:
    
        if (r1 != r7) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0465, code lost:
    
        throw com.google.android.gms.internal.measurement.C1892z8.m9151e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:113:0x008b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m9050D(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.C1517c7 r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1861x9.m9050D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.c7):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: a */
    public final void mo8158a(T t10) {
        int i10;
        int i11 = this.f7307i;
        while (true) {
            i10 = this.f7308j;
            if (i11 >= i10) {
                break;
            }
            long m9034k = m9034k(this.f7306h[i11]) & 1048575;
            Object m8110k = C1555eb.m8110k(t10, m9034k);
            if (m8110k != null) {
                ((C1701n9) m8110k).m8622f();
                C1555eb.m8123x(t10, m9034k, m8110k);
            }
            i11++;
        }
        int length = this.f7306h.length;
        while (i10 < length) {
            this.f7309k.mo8156a(t10, this.f7306h[i10]);
            i10++;
        }
        this.f7310l.mo8871g(t10);
        if (this.f7304f) {
            this.f7311m.mo8055b(t10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: b */
    public final T mo8159b() {
        return (T) ((AbstractC1732p8) this.f7303e).mo7884v(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: c */
    public final int mo8160c(T t10) {
        return this.f7305g ? m9023K(t10) : m9022J(t10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: d */
    public final void mo8161d(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f7299a.length; i10 += 3) {
            int m9034k = m9034k(i10);
            long j10 = 1048575 & m9034k;
            int i11 = this.f7299a[i10];
            switch (m9033j(m9034k)) {
                case 0:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8119t(t10, j10, C1555eb.m8105f(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8120u(t10, j10, C1555eb.m8106g(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8122w(t10, j10, C1555eb.m8108i(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8122w(t10, j10, C1555eb.m8108i(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8121v(t10, j10, C1555eb.m8107h(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8122w(t10, j10, C1555eb.m8108i(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8121v(t10, j10, C1555eb.m8107h(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8117r(t10, j10, C1555eb.m8096B(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8123x(t10, j10, C1555eb.m8110k(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m9040q(t10, t11, i10);
                    break;
                case 10:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8123x(t10, j10, C1555eb.m8110k(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8121v(t10, j10, C1555eb.m8107h(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8121v(t10, j10, C1555eb.m8107h(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8121v(t10, j10, C1555eb.m8107h(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8122w(t10, j10, C1555eb.m8108i(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8121v(t10, j10, C1555eb.m8107h(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m9045v(t11, i10)) {
                        C1555eb.m8122w(t10, j10, C1555eb.m8108i(t11, j10));
                        m9042s(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m9040q(t10, t11, i10);
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
                    this.f7309k.mo8157b(t10, t11, j10);
                    break;
                case 50:
                    C1605ha.m8273i(this.f7313o, t10, t11, j10);
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
                    if (m9048y(t11, i11, i10)) {
                        C1555eb.m8123x(t10, j10, C1555eb.m8110k(t11, j10));
                        m9043t(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m9041r(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m9048y(t11, i11, i10)) {
                        C1555eb.m8123x(t10, j10, C1555eb.m8110k(t11, j10));
                        m9043t(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m9041r(t10, t11, i10);
                    break;
            }
        }
        C1605ha.m8270f(this.f7310l, t10, t11);
        if (this.f7304f) {
            C1605ha.m8269e(this.f7311m, t10, t11);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: e */
    public final int mo8162e(T t10) {
        int i10;
        int m9007c;
        int length = this.f7299a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int m9034k = m9034k(i12);
            int i13 = this.f7299a[i12];
            long j10 = 1048575 & m9034k;
            int i14 = 37;
            switch (m9033j(m9034k)) {
                case 0:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9007c(Double.doubleToLongBits(C1555eb.m8105f(t10, j10)));
                    i11 = i10 + m9007c;
                    break;
                case 1:
                    i10 = i11 * 53;
                    m9007c = Float.floatToIntBits(C1555eb.m8106g(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 2:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9007c(C1555eb.m8108i(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 3:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9007c(C1555eb.m8108i(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 4:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8107h(t10, j10);
                    i11 = i10 + m9007c;
                    break;
                case 5:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9007c(C1555eb.m8108i(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 6:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8107h(t10, j10);
                    i11 = i10 + m9007c;
                    break;
                case 7:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9005a(C1555eb.m8096B(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 8:
                    i10 = i11 * 53;
                    m9007c = ((String) C1555eb.m8110k(t10, j10)).hashCode();
                    i11 = i10 + m9007c;
                    break;
                case 9:
                    Object m8110k = C1555eb.m8110k(t10, j10);
                    if (m8110k != null) {
                        i14 = m8110k.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8110k(t10, j10).hashCode();
                    i11 = i10 + m9007c;
                    break;
                case 11:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8107h(t10, j10);
                    i11 = i10 + m9007c;
                    break;
                case 12:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8107h(t10, j10);
                    i11 = i10 + m9007c;
                    break;
                case 13:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8107h(t10, j10);
                    i11 = i10 + m9007c;
                    break;
                case 14:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9007c(C1555eb.m8108i(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 15:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8107h(t10, j10);
                    i11 = i10 + m9007c;
                    break;
                case 16:
                    i10 = i11 * 53;
                    m9007c = C1860x8.m9007c(C1555eb.m8108i(t10, j10));
                    i11 = i10 + m9007c;
                    break;
                case 17:
                    Object m8110k2 = C1555eb.m8110k(t10, j10);
                    if (m8110k2 != null) {
                        i14 = m8110k2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
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
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8110k(t10, j10).hashCode();
                    i11 = i10 + m9007c;
                    break;
                case 50:
                    i10 = i11 * 53;
                    m9007c = C1555eb.m8110k(t10, j10).hashCode();
                    i11 = i10 + m9007c;
                    break;
                case 51:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9007c(Double.doubleToLongBits(m9020H(t10, j10)));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = Float.floatToIntBits(m9021I(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9007c(m9035l(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9007c(m9035l(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = m9024L(t10, j10);
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9007c(m9035l(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = m9024L(t10, j10);
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9005a(m9049z(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = ((String) C1555eb.m8110k(t10, j10)).hashCode();
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1555eb.m8110k(t10, j10).hashCode();
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1555eb.m8110k(t10, j10).hashCode();
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = m9024L(t10, j10);
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = m9024L(t10, j10);
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = m9024L(t10, j10);
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9007c(m9035l(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = m9024L(t10, j10);
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1860x8.m9007c(m9035l(t10, j10));
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m9048y(t10, i13, i12)) {
                        i10 = i11 * 53;
                        m9007c = C1555eb.m8110k(t10, j10).hashCode();
                        i11 = i10 + m9007c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f7310l.mo8867c(t10).hashCode();
        if (!this.f7304f) {
            return hashCode;
        }
        this.f7311m.mo8054a(t10);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: f */
    public final boolean mo8163f(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f7307i) {
            int i15 = this.f7306h[i14];
            int i16 = this.f7299a[i15];
            int m9034k = m9034k(i15);
            int i17 = this.f7299a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f7298q.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & m9034k) != 0 && !m9046w(t10, i15, i10, i11, i19)) {
                return false;
            }
            int m9033j = m9033j(m9034k);
            if (m9033j != 9 && m9033j != 17) {
                if (m9033j != 27) {
                    if (m9033j == 60 || m9033j == 68) {
                        if (m9048y(t10, i16, i15) && !m9047x(t10, m9034k, m9037n(i15))) {
                            return false;
                        }
                    } else if (m9033j != 49) {
                        if (m9033j == 50 && !((C1701n9) C1555eb.m8110k(t10, m9034k & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) C1555eb.m8110k(t10, m9034k & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC1571fa m9037n = m9037n(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!m9037n.mo8163f(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (m9046w(t10, i15, i10, i11, i19) && !m9047x(t10, m9034k, m9037n(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (!this.f7304f) {
            return true;
        }
        this.f7311m.mo8054a(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: g */
    public final void mo8164g(T t10, byte[] bArr, int i10, int i11, C1517c7 c1517c7) throws IOException {
        if (this.f7305g) {
            m9027O(t10, bArr, i10, i11, c1517c7);
        } else {
            m9050D(t10, bArr, i10, i11, 0, c1517c7);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo8165h(T r9, T r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1861x9.mo8165h(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1571fa
    /* renamed from: i */
    public final void mo8166i(T t10, C1875y7 c1875y7) throws IOException {
        if (!this.f7305g) {
            m9014A(t10, c1875y7);
            return;
        }
        if (!this.f7304f) {
            int length = this.f7299a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int m9034k = m9034k(i10);
                int i11 = this.f7299a[i10];
                switch (m9033j(m9034k)) {
                    case 0:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9096q(i11, C1555eb.m8105f(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9105z(i11, C1555eb.m8106g(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9074E(i11, C1555eb.m8108i(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9090j(i11, C1555eb.m8108i(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9072C(i11, C1555eb.m8107h(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9103x(i11, C1555eb.m8108i(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9101v(i11, C1555eb.m8107h(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9092m(i11, C1555eb.m8096B(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m9045v(t10, i10)) {
                            m9016C(i11, C1555eb.m8110k(t10, m9034k & 1048575), c1875y7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9076G(i11, C1555eb.m8110k(t10, m9034k & 1048575), m9037n(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9094o(i11, (AbstractC1731p7) C1555eb.m8110k(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9088h(i11, C1555eb.m8107h(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9099t(i11, C1555eb.m8107h(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9077H(i11, C1555eb.m8107h(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9079J(i11, C1555eb.m8108i(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9081a(i11, C1555eb.m8107h(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9083c(i11, C1555eb.m8108i(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m9045v(t10, i10)) {
                            c1875y7.m9071B(i11, C1555eb.m8110k(t10, m9034k & 1048575), m9037n(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        C1605ha.m8276l(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 19:
                        C1605ha.m8280p(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 20:
                        C1605ha.m8283s(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 21:
                        C1605ha.m8238B(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 22:
                        C1605ha.m8282r(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 23:
                        C1605ha.m8279o(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 24:
                        C1605ha.m8278n(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 25:
                        C1605ha.m8274j(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 26:
                        C1605ha.m8289y(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7);
                        break;
                    case 27:
                        C1605ha.m8284t(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, m9037n(i10));
                        break;
                    case 28:
                        C1605ha.m8275k(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7);
                        break;
                    case 29:
                        C1605ha.m8290z(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 30:
                        C1605ha.m8277m(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 31:
                        C1605ha.m8285u(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 32:
                        C1605ha.m8286v(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 33:
                        C1605ha.m8287w(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 34:
                        C1605ha.m8288x(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, false);
                        break;
                    case 35:
                        C1605ha.m8276l(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 36:
                        C1605ha.m8280p(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 37:
                        C1605ha.m8283s(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 38:
                        C1605ha.m8238B(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 39:
                        C1605ha.m8282r(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 40:
                        C1605ha.m8279o(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 41:
                        C1605ha.m8278n(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 42:
                        C1605ha.m8274j(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 43:
                        C1605ha.m8290z(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 44:
                        C1605ha.m8277m(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 45:
                        C1605ha.m8285u(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 46:
                        C1605ha.m8286v(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 47:
                        C1605ha.m8287w(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 48:
                        C1605ha.m8288x(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, true);
                        break;
                    case 49:
                        C1605ha.m8281q(this.f7299a[i10], (List) C1555eb.m8110k(t10, m9034k & 1048575), c1875y7, m9037n(i10));
                        break;
                    case 50:
                        m9015B(c1875y7, i11, C1555eb.m8110k(t10, m9034k & 1048575), i10);
                        break;
                    case 51:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9096q(i11, m9020H(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9105z(i11, m9021I(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9074E(i11, m9035l(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9090j(i11, m9035l(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9072C(i11, m9024L(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9103x(i11, m9035l(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9101v(i11, m9024L(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9092m(i11, m9049z(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m9048y(t10, i11, i10)) {
                            m9016C(i11, C1555eb.m8110k(t10, m9034k & 1048575), c1875y7);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9076G(i11, C1555eb.m8110k(t10, m9034k & 1048575), m9037n(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9094o(i11, (AbstractC1731p7) C1555eb.m8110k(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9088h(i11, m9024L(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9099t(i11, m9024L(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9077H(i11, m9024L(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9079J(i11, m9035l(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9081a(i11, m9024L(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9083c(i11, m9035l(t10, m9034k & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m9048y(t10, i11, i10)) {
                            c1875y7.m9071B(i11, C1555eb.m8110k(t10, m9034k & 1048575), m9037n(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC1814ua<?, ?> abstractC1814ua = this.f7310l;
            abstractC1814ua.mo8873i(abstractC1814ua.mo8867c(t10), c1875y7);
            return;
        }
        this.f7311m.mo8054a(t10);
        throw null;
    }
}
