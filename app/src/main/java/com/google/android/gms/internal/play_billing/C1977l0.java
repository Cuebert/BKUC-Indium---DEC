package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.l0 */
/* loaded from: classes.dex */
public final class C1977l0 implements InterfaceC1904a4 {

    /* renamed from: a */
    private final AbstractC1970k0 f7729a;

    private C1977l0(AbstractC1970k0 abstractC1970k0) {
        byte[] bArr = C1950h1.f7678d;
        this.f7729a = abstractC1970k0;
        abstractC1970k0.f7709a = this;
    }

    /* renamed from: K */
    public static C1977l0 m9489K(AbstractC1970k0 abstractC1970k0) {
        C1977l0 c1977l0 = abstractC1970k0.f7709a;
        return c1977l0 != null ? c1977l0 : new C1977l0(abstractC1970k0);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    @Deprecated
    /* renamed from: A */
    public final void mo9201A(int i10) throws IOException {
        this.f7729a.mo9372p(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: B */
    public final void mo9202B(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9365i(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9364h(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: C */
    public final void mo9203C(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1970k0.m9478v(((Integer) list.get(i13)).intValue());
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9369m(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9368l(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: D */
    public final void mo9204D(int i10, long j10) throws IOException {
        this.f7729a.mo9366j(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: E */
    public final void mo9205E(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += AbstractC1970k0.m9482z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                AbstractC1970k0 abstractC1970k0 = this.f7729a;
                long longValue2 = ((Long) list.get(i11)).longValue();
                abstractC1970k0.mo9376t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            AbstractC1970k0 abstractC1970k02 = this.f7729a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            abstractC1970k02.mo9375s(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: F */
    public final void mo9206F(int i10, int i11) throws IOException {
        this.f7729a.mo9368l(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: G */
    public final void mo9207G(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1970k0.m9478v(((Integer) list.get(i13)).intValue());
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9369m(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9368l(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: H */
    public final void mo9208H(int i10, long j10) throws IOException {
        this.f7729a.mo9375s(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    @Deprecated
    /* renamed from: I */
    public final void mo9209I(int i10) throws IOException {
        this.f7729a.mo9372p(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: J */
    public final void mo9210J(int i10, int i11) throws IOException {
        this.f7729a.mo9368l(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: a */
    public final void mo9211a(int i10, List list) throws IOException {
        int i11 = 0;
        if (list instanceof InterfaceC1992n1) {
            InterfaceC1992n1 interfaceC1992n1 = (InterfaceC1992n1) list;
            while (i11 < list.size()) {
                Object mo9507h = interfaceC1992n1.mo9507h(i11);
                if (mo9507h instanceof String) {
                    this.f7729a.mo9371o(i10, (String) mo9507h);
                } else {
                    this.f7729a.mo9363g(i10, (AbstractC1914c0) mo9507h);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9371o(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: b */
    public final void mo9212b(int i10, double d10) throws IOException {
        this.f7729a.mo9366j(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: c */
    public final void mo9213c(int i10, int i11) throws IOException {
        this.f7729a.mo9373q(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: d */
    public final void mo9214d(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9367k(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9366j(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: e */
    public final void mo9215e(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7729a.mo9363g(i10, (AbstractC1914c0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: f */
    public final void mo9216f(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9367k(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9366j(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: g */
    public final void mo9217g(int i10, int i11) throws IOException {
        this.f7729a.mo9364h(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: h */
    public final void mo9218h(int i10, float f10) throws IOException {
        this.f7729a.mo9364h(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: i */
    public final void mo9219i(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += AbstractC1970k0.m9481y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                AbstractC1970k0 abstractC1970k0 = this.f7729a;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                abstractC1970k0.mo9374r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            AbstractC1970k0 abstractC1970k02 = this.f7729a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            abstractC1970k02.mo9373q(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: j */
    public final void mo9220j(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1970k0.m9482z(((Long) list.get(i13)).longValue());
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9376t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9375s(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: k */
    public final void mo9221k(int i10, Object obj, InterfaceC2014q2 interfaceC2014q2) throws IOException {
        AbstractC1970k0 abstractC1970k0 = this.f7729a;
        abstractC1970k0.mo9372p(i10, 3);
        interfaceC2014q2.mo9451f((InterfaceC1944g2) obj, abstractC1970k0.f7709a);
        abstractC1970k0.mo9372p(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: l */
    public final void mo9222l(int i10, int i11) throws IOException {
        this.f7729a.mo9364h(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: m */
    public final void mo9223m(int i10, boolean z10) throws IOException {
        this.f7729a.mo9362f(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: n */
    public final void mo9224n(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1970k0.m9482z(((Long) list.get(i13)).longValue());
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9376t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9375s(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: o */
    public final void mo9225o(int i10, Object obj, InterfaceC2014q2 interfaceC2014q2) throws IOException {
        InterfaceC1944g2 interfaceC1944g2 = (InterfaceC1944g2) obj;
        C1949h0 c1949h0 = (C1949h0) this.f7729a;
        c1949h0.mo9374r((i10 << 3) | 2);
        c1949h0.mo9374r(((AbstractC1976l) interfaceC1944g2).mo9298c(interfaceC2014q2));
        interfaceC2014q2.mo9451f(interfaceC1944g2, c1949h0.f7709a);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: p */
    public final void mo9226p(int i10, int i11) throws IOException {
        this.f7729a.mo9373q(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: q */
    public final void mo9227q(int i10, String str) throws IOException {
        this.f7729a.mo9371o(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: r */
    public final void mo9228r(int i10, long j10) throws IOException {
        this.f7729a.mo9375s(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: s */
    public final void mo9229s(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9361e(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9362f(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: t */
    public final void mo9230t(int i10, long j10) throws IOException {
        this.f7729a.mo9366j(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: u */
    public final void mo9231u(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9365i(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9364h(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: v */
    public final void mo9232v(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9367k(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9366j(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: w */
    public final void mo9233w(int i10, long j10) throws IOException {
        this.f7729a.mo9375s(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: x */
    public final void mo9234x(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1970k0.m9481y(((Integer) list.get(i13)).intValue());
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9374r(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9373q(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: y */
    public final void mo9235y(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f7729a.mo9372p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f7729a.mo9374r(i12);
            while (i11 < list.size()) {
                this.f7729a.mo9365i(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7729a.mo9364h(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1904a4
    /* renamed from: z */
    public final void mo9236z(int i10, AbstractC1914c0 abstractC1914c0) throws IOException {
        this.f7729a.mo9363g(i10, abstractC1914c0);
    }
}
