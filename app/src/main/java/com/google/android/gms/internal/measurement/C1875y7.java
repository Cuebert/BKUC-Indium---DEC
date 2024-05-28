package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y7 */
/* loaded from: classes.dex */
public final class C1875y7 {

    /* renamed from: a */
    private final AbstractC1859x7 f7330a;

    private C1875y7(AbstractC1859x7 abstractC1859x7) {
        C1860x8.m9010f(abstractC1859x7, "output");
        this.f7330a = abstractC1859x7;
        abstractC1859x7.f7290a = this;
    }

    /* renamed from: l */
    public static C1875y7 m9069l(AbstractC1859x7 abstractC1859x7) {
        C1875y7 c1875y7 = abstractC1859x7.f7290a;
        return c1875y7 != null ? c1875y7 : new C1875y7(abstractC1859x7);
    }

    /* renamed from: A */
    public final void m9070A(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).floatValue();
                i12 += 4;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8903l(Float.floatToRawIntBits(list.get(i11).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8902k(i10, Float.floatToRawIntBits(list.get(i11).floatValue()));
            i11++;
        }
    }

    /* renamed from: B */
    public final void m9071B(int i10, Object obj, InterfaceC1571fa interfaceC1571fa) throws IOException {
        AbstractC1859x7 abstractC1859x7 = this.f7330a;
        abstractC1859x7.mo8910s(i10, 3);
        interfaceC1571fa.mo8166i((InterfaceC1813u9) obj, abstractC1859x7.f7290a);
        abstractC1859x7.mo8910s(i10, 4);
    }

    /* renamed from: C */
    public final void m9072C(int i10, int i11) throws IOException {
        this.f7330a.mo8906o(i10, i11);
    }

    /* renamed from: D */
    public final void m9073D(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1859x7.m9002z(list.get(i13).intValue());
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8907p(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8906o(i10, list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: E */
    public final void m9074E(int i10, long j10) throws IOException {
        this.f7330a.mo8913v(i10, j10);
    }

    /* renamed from: F */
    public final void m9075F(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1859x7.m8997b(list.get(i13).longValue());
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8914w(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8913v(i10, list.get(i11).longValue());
            i11++;
        }
    }

    /* renamed from: G */
    public final void m9076G(int i10, Object obj, InterfaceC1571fa interfaceC1571fa) throws IOException {
        InterfaceC1813u9 interfaceC1813u9 = (InterfaceC1813u9) obj;
        C1827v7 c1827v7 = (C1827v7) this.f7330a;
        c1827v7.mo8912u((i10 << 3) | 2);
        AbstractC1890z6 abstractC1890z6 = (AbstractC1890z6) interfaceC1813u9;
        int mo8677b = abstractC1890z6.mo8677b();
        if (mo8677b == -1) {
            mo8677b = interfaceC1571fa.mo8160c(abstractC1890z6);
            abstractC1890z6.mo8679e(mo8677b);
        }
        c1827v7.mo8912u(mo8677b);
        interfaceC1571fa.mo8166i(interfaceC1813u9, c1827v7.f7290a);
    }

    /* renamed from: H */
    public final void m9077H(int i10, int i11) throws IOException {
        this.f7330a.mo8902k(i10, i11);
    }

    /* renamed from: I */
    public final void m9078I(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8903l(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8902k(i10, list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: J */
    public final void m9079J(int i10, long j10) throws IOException {
        this.f7330a.mo8904m(i10, j10);
    }

    /* renamed from: K */
    public final void m9080K(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8905n(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8904m(i10, list.get(i11).longValue());
            i11++;
        }
    }

    /* renamed from: a */
    public final void m9081a(int i10, int i11) throws IOException {
        this.f7330a.mo8911t(i10, (i11 >> 31) ^ (i11 + i11));
    }

    /* renamed from: b */
    public final void m9082b(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = list.get(i13).intValue();
                i12 += AbstractC1859x7.m8996a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                AbstractC1859x7 abstractC1859x7 = this.f7330a;
                int intValue2 = list.get(i11).intValue();
                abstractC1859x7.mo8912u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            AbstractC1859x7 abstractC1859x72 = this.f7330a;
            int intValue3 = list.get(i11).intValue();
            abstractC1859x72.mo8911t(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    /* renamed from: c */
    public final void m9083c(int i10, long j10) throws IOException {
        this.f7330a.mo8913v(i10, (j10 >> 63) ^ (j10 + j10));
    }

    /* renamed from: d */
    public final void m9084d(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = list.get(i13).longValue();
                i12 += AbstractC1859x7.m8997b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                AbstractC1859x7 abstractC1859x7 = this.f7330a;
                long longValue2 = list.get(i11).longValue();
                abstractC1859x7.mo8914w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            AbstractC1859x7 abstractC1859x72 = this.f7330a;
            long longValue3 = list.get(i11).longValue();
            abstractC1859x72.mo8913v(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Deprecated
    /* renamed from: e */
    public final void m9085e(int i10) throws IOException {
        this.f7330a.mo8910s(i10, 3);
    }

    /* renamed from: f */
    public final void m9086f(int i10, String str) throws IOException {
        this.f7330a.mo8909r(i10, str);
    }

    /* renamed from: g */
    public final void m9087g(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof InterfaceC1536d9) {
            InterfaceC1536d9 interfaceC1536d9 = (InterfaceC1536d9) list;
            while (i11 < list.size()) {
                Object mo8009h = interfaceC1536d9.mo8009h(i11);
                if (mo8009h instanceof String) {
                    this.f7330a.mo8909r(i10, (String) mo8009h);
                } else {
                    this.f7330a.mo8901j(i10, (AbstractC1731p7) mo8009h);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8909r(i10, list.get(i11));
            i11++;
        }
    }

    /* renamed from: h */
    public final void m9088h(int i10, int i11) throws IOException {
        this.f7330a.mo8911t(i10, i11);
    }

    /* renamed from: i */
    public final void m9089i(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1859x7.m8996a(list.get(i13).intValue());
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8912u(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8911t(i10, list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: j */
    public final void m9090j(int i10, long j10) throws IOException {
        this.f7330a.mo8913v(i10, j10);
    }

    /* renamed from: k */
    public final void m9091k(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1859x7.m8997b(list.get(i13).longValue());
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8914w(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8913v(i10, list.get(i11).longValue());
            i11++;
        }
    }

    /* renamed from: m */
    public final void m9092m(int i10, boolean z10) throws IOException {
        this.f7330a.mo8900i(i10, z10);
    }

    /* renamed from: n */
    public final void m9093n(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).booleanValue();
                i12++;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8899h(list.get(i11).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8900i(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    /* renamed from: o */
    public final void m9094o(int i10, AbstractC1731p7 abstractC1731p7) throws IOException {
        this.f7330a.mo8901j(i10, abstractC1731p7);
    }

    /* renamed from: p */
    public final void m9095p(int i10, List<AbstractC1731p7> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7330a.mo8901j(i10, list.get(i11));
        }
    }

    /* renamed from: q */
    public final void m9096q(int i10, double d10) throws IOException {
        this.f7330a.mo8904m(i10, Double.doubleToRawLongBits(d10));
    }

    /* renamed from: r */
    public final void m9097r(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).doubleValue();
                i12 += 8;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8905n(Double.doubleToRawLongBits(list.get(i11).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8904m(i10, Double.doubleToRawLongBits(list.get(i11).doubleValue()));
            i11++;
        }
    }

    @Deprecated
    /* renamed from: s */
    public final void m9098s(int i10) throws IOException {
        this.f7330a.mo8910s(i10, 4);
    }

    /* renamed from: t */
    public final void m9099t(int i10, int i11) throws IOException {
        this.f7330a.mo8906o(i10, i11);
    }

    /* renamed from: u */
    public final void m9100u(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1859x7.m9002z(list.get(i13).intValue());
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8907p(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8906o(i10, list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: v */
    public final void m9101v(int i10, int i11) throws IOException {
        this.f7330a.mo8902k(i10, i11);
    }

    /* renamed from: w */
    public final void m9102w(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).intValue();
                i12 += 4;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8903l(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8902k(i10, list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: x */
    public final void m9103x(int i10, long j10) throws IOException {
        this.f7330a.mo8904m(i10, j10);
    }

    /* renamed from: y */
    public final void m9104y(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7330a.mo8910s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                list.get(i13).longValue();
                i12 += 8;
            }
            this.f7330a.mo8912u(i12);
            while (i11 < list.size()) {
                this.f7330a.mo8905n(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7330a.mo8904m(i10, list.get(i11).longValue());
            i11++;
        }
    }

    /* renamed from: z */
    public final void m9105z(int i10, float f10) throws IOException {
        this.f7330a.mo8902k(i10, Float.floatToRawIntBits(f10));
    }
}
