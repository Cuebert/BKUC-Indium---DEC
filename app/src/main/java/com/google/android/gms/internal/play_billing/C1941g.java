package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.g */
/* loaded from: classes.dex */
public final class C1941g extends AbstractC2045u5 {

    /* renamed from: t */
    static final AbstractC2045u5 f7666t = new C1941g(null, new Object[0], 0);

    /* renamed from: q */
    private final transient Object f7667q;

    /* renamed from: r */
    final transient Object[] f7668r;

    /* renamed from: s */
    private final transient int f7669s;

    private C1941g(Object obj, Object[] objArr, int i10) {
        this.f7667q = obj;
        this.f7668r = objArr;
        this.f7669s = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* renamed from: f */
    public static C1941g m9345f(int i10, Object[] objArr, C2038t5 c2038t5) {
        short[] sArr;
        Object[] objArr2;
        int i11 = i10;
        Object[] objArr3 = objArr;
        if (i11 == 0) {
            return (C1941g) f7666t;
        }
        Object obj = null;
        if (i11 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            C1989m5.m9510a(obj2, obj3);
            return new C1941g(null, objArr3, 1);
        }
        C1968j5.m9471b(i11, objArr3.length >> 1, "index");
        char c10 = 2;
        int max = Math.max(i11, 2);
        int i12 = 1073741824;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            i12 = highestOneBit + highestOneBit;
            while (i12 * 0.7d < max) {
                i12 += i12;
            }
        } else if (max >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i11 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            C1989m5.m9510a(obj4, obj5);
        } else {
            int i13 = i12 - 1;
            char c11 = 65535;
            if (i12 <= 128) {
                byte[] bArr = new byte[i12];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    int i16 = i14 + i14;
                    int i17 = i15 + i15;
                    Object obj6 = objArr3[i17];
                    obj6.getClass();
                    Object obj7 = objArr3[i17 ^ 1];
                    obj7.getClass();
                    C1989m5.m9510a(obj6, obj7);
                    int m9514a = C1996n5.m9514a(obj6.hashCode());
                    while (true) {
                        int i18 = m9514a & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i14 < i15) {
                                objArr3[i16] = obj6;
                                objArr3[i16 ^ 1] = obj7;
                            }
                            i14++;
                        } else {
                            if (obj6.equals(objArr3[i19])) {
                                int i20 = i19 ^ 1;
                                Object obj8 = objArr3[i20];
                                obj8.getClass();
                                C2031s5 c2031s5 = new C2031s5(obj6, obj7, obj8);
                                objArr3[i20] = obj7;
                                obj = c2031s5;
                                break;
                            }
                            m9514a = i18 + 1;
                        }
                    }
                }
                if (i14 == i11) {
                    obj = bArr;
                    c10 = 2;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i14), obj};
                }
            } else if (i12 <= 32768) {
                sArr = new short[i12];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i11; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj9 = objArr3[i24];
                    obj9.getClass();
                    Object obj10 = objArr3[i24 ^ 1];
                    obj10.getClass();
                    C1989m5.m9510a(obj9, obj10);
                    int m9514a2 = C1996n5.m9514a(obj9.hashCode());
                    while (true) {
                        int i25 = m9514a2 & i13;
                        char c12 = (char) sArr[i25];
                        if (c12 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArr3[i23] = obj9;
                                objArr3[i23 ^ 1] = obj10;
                            }
                            i21++;
                        } else {
                            if (obj9.equals(objArr3[c12])) {
                                int i26 = c12 ^ 1;
                                Object obj11 = objArr3[i26];
                                obj11.getClass();
                                C2031s5 c2031s52 = new C2031s5(obj9, obj10, obj11);
                                objArr3[i26] = obj10;
                                obj = c2031s52;
                                break;
                            }
                            m9514a2 = i25 + 1;
                        }
                    }
                }
                if (i21 != i11) {
                    c10 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i21), obj};
                    obj = objArr2;
                }
            } else {
                sArr = new int[i12];
                Arrays.fill((int[]) sArr, -1);
                int i27 = 0;
                int i28 = 0;
                while (i27 < i11) {
                    int i29 = i28 + i28;
                    int i30 = i27 + i27;
                    Object obj12 = objArr3[i30];
                    obj12.getClass();
                    Object obj13 = objArr3[i30 ^ 1];
                    obj13.getClass();
                    C1989m5.m9510a(obj12, obj13);
                    int m9514a3 = C1996n5.m9514a(obj12.hashCode());
                    while (true) {
                        int i31 = m9514a3 & i13;
                        ?? r15 = sArr[i31];
                        if (r15 == c11) {
                            sArr[i31] = i29;
                            if (i28 < i27) {
                                objArr3[i29] = obj12;
                                objArr3[i29 ^ 1] = obj13;
                            }
                            i28++;
                        } else {
                            if (obj12.equals(objArr3[r15])) {
                                int i32 = r15 ^ 1;
                                Object obj14 = objArr3[i32];
                                obj14.getClass();
                                C2031s5 c2031s53 = new C2031s5(obj12, obj13, obj14);
                                objArr3[i32] = obj13;
                                obj = c2031s53;
                                break;
                            }
                            m9514a3 = i31 + 1;
                            c11 = 65535;
                        }
                    }
                    i27++;
                    c11 = 65535;
                }
                if (i28 != i11) {
                    c10 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i28), obj};
                    obj = objArr2;
                }
            }
            obj = sArr;
            c10 = 2;
        }
        boolean z10 = obj instanceof Object[];
        Object obj15 = obj;
        if (z10) {
            Object[] objArr4 = (Object[]) obj;
            c2038t5.f7804c = (C2031s5) objArr4[c10];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i11 = intValue;
        }
        return new C1941g(obj15, objArr3, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2045u5
    /* renamed from: a */
    final AbstractC2003o5 mo9346a() {
        return new C1934f(this.f7668r, 1, this.f7669s);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2045u5
    /* renamed from: c */
    final AbstractC2052v5 mo9347c() {
        return new C1920d(this, this.f7668r, 0, this.f7669s);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2045u5
    /* renamed from: d */
    final AbstractC2052v5 mo9348d() {
        return new C1927e(this, new C1934f(this.f7668r, 0, this.f7669s));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2045u5, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7667q
            java.lang.Object[] r1 = r9.f7668r
            int r2 = r9.f7669s
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.play_billing.C1996n5.m9514a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.play_billing.C1996n5.m9514a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.C1996n5.m9514a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1941g.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7669s;
    }
}
