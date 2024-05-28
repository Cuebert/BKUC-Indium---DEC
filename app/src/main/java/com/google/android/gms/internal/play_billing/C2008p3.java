package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.p3 */
/* loaded from: classes.dex */
final class C2008p3 extends AbstractC2022r3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2008p3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: a */
    public final double mo9543a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f7777a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: b */
    public final float mo9544b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f7777a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: c */
    public final void mo9545c(Object obj, long j10, boolean z10) {
        if (C2029s3.f7796h) {
            C2029s3.m9620d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            C2029s3.m9621e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: d */
    public final void mo9546d(Object obj, long j10, byte b10) {
        if (C2029s3.f7796h) {
            C2029s3.m9620d(obj, j10, b10);
        } else {
            C2029s3.m9621e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: e */
    public final void mo9547e(Object obj, long j10, double d10) {
        this.f7777a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: f */
    public final void mo9548f(Object obj, long j10, float f10) {
        this.f7777a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2022r3
    /* renamed from: g */
    public final boolean mo9549g(Object obj, long j10) {
        if (C2029s3.f7796h) {
            return C2029s3.m9641y(obj, j10);
        }
        return C2029s3.m9642z(obj, j10);
    }
}
