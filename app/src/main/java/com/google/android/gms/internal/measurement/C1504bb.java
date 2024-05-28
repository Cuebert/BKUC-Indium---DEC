package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.bb */
/* loaded from: classes.dex */
final class C1504bb extends AbstractC1538db {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1504bb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: a */
    public final double mo7956a(Object obj, long j10) {
        return Double.longBitsToDouble(m8063k(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: b */
    public final float mo7957b(Object obj, long j10) {
        return Float.intBitsToFloat(m8062j(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: c */
    public final void mo7958c(Object obj, long j10, boolean z10) {
        if (C1555eb.f6776i) {
            C1555eb.m8103d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            C1555eb.m8104e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: d */
    public final void mo7959d(Object obj, long j10, byte b10) {
        if (C1555eb.f6776i) {
            C1555eb.m8103d(obj, j10, b10);
        } else {
            C1555eb.m8104e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: e */
    public final void mo7960e(Object obj, long j10, double d10) {
        m8067o(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: f */
    public final void mo7961f(Object obj, long j10, float f10) {
        m8066n(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1538db
    /* renamed from: g */
    public final boolean mo7962g(Object obj, long j10) {
        if (C1555eb.f6776i) {
            return C1555eb.m8124y(obj, j10);
        }
        return C1555eb.m8125z(obj, j10);
    }
}
