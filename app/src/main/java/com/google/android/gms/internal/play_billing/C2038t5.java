package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.t5 */
/* loaded from: classes.dex */
public final class C2038t5 {

    /* renamed from: a */
    Object[] f7802a = new Object[8];

    /* renamed from: b */
    int f7803b = 0;

    /* renamed from: c */
    C2031s5 f7804c;

    /* renamed from: a */
    public final C2038t5 m9653a(Object obj, Object obj2) {
        int i10 = this.f7803b + 1;
        Object[] objArr = this.f7802a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f7802a = Arrays.copyOf(objArr, i12);
        }
        C1989m5.m9510a(obj, obj2);
        Object[] objArr2 = this.f7802a;
        int i13 = this.f7803b;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.f7803b = i13 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC2045u5 m9654b() {
        C2031s5 c2031s5 = this.f7804c;
        if (c2031s5 != null) {
            throw c2031s5.m9644a();
        }
        C1941g m9345f = C1941g.m9345f(this.f7803b, this.f7802a, this);
        C2031s5 c2031s52 = this.f7804c;
        if (c2031s52 == null) {
            return m9345f;
        }
        throw c2031s52.m9644a();
    }
}
