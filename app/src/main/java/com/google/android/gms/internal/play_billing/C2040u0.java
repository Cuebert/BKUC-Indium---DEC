package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.u0 */
/* loaded from: classes.dex */
public final class C2040u0 {

    /* renamed from: d */
    private static final C2040u0 f7805d = new C2040u0(true);

    /* renamed from: a */
    final C1931e3 f7806a = new C2035t2(16);

    /* renamed from: b */
    private boolean f7807b;

    /* renamed from: c */
    private boolean f7808c;

    private C2040u0() {
    }

    /* renamed from: a */
    public static C2040u0 m9655a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m9656d(com.google.android.gms.internal.play_billing.InterfaceC2033t0 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.play_billing.y3 r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.play_billing.C1950h1.f7678d
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.play_billing.y3 r1 = com.google.android.gms.internal.play_billing.EnumC2070y3.f7898o
            com.google.android.gms.internal.play_billing.z3 r1 = com.google.android.gms.internal.play_billing.EnumC2076z3.INT
            com.google.android.gms.internal.play_billing.z3 r0 = r0.m9689b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L23;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L40
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.InterfaceC1944g2
            if (r0 == 0) goto L40
            goto L3f
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L40
            goto L3f
        L23:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.AbstractC1914c0
            if (r0 != 0) goto L3f
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L40
            goto L3f
        L2c:
            boolean r0 = r5 instanceof java.lang.String
            goto L3d
        L2f:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3d
        L32:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3d
        L35:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3d
        L38:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3d
        L3b:
            boolean r0 = r5 instanceof java.lang.Integer
        L3d:
            if (r0 == 0) goto L40
        L3f:
            return
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.play_billing.y3 r4 = r4.zzb()
            com.google.android.gms.internal.play_billing.z3 r4 = r4.m9689b()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C2040u0.m9656d(com.google.android.gms.internal.play_billing.t0, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m9657b() {
        if (this.f7807b) {
            return;
        }
        for (int i10 = 0; i10 < this.f7806a.m9337b(); i10++) {
            Map.Entry m9340g = this.f7806a.m9340g(i10);
            if (m9340g.getValue() instanceof AbstractC1922d1) {
                ((AbstractC1922d1) m9340g.getValue()).m9304n();
            }
        }
        this.f7806a.mo9336a();
        this.f7807b = true;
    }

    /* renamed from: c */
    public final void m9658c(InterfaceC2033t0 interfaceC2033t0, Object obj) {
        if (interfaceC2033t0.m9645a()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m9656d(interfaceC2033t0, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m9656d(interfaceC2033t0, obj);
        }
        this.f7806a.put(interfaceC2033t0, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C2040u0 c2040u0 = new C2040u0();
        for (int i10 = 0; i10 < this.f7806a.m9337b(); i10++) {
            Map.Entry m9340g = this.f7806a.m9340g(i10);
            c2040u0.m9658c((InterfaceC2033t0) m9340g.getKey(), m9340g.getValue());
        }
        for (Map.Entry entry : this.f7806a.m9338c()) {
            c2040u0.m9658c((InterfaceC2033t0) entry.getKey(), entry.getValue());
        }
        c2040u0.f7808c = this.f7808c;
        return c2040u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2040u0) {
            return this.f7806a.equals(((C2040u0) obj).f7806a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7806a.hashCode();
    }

    private C2040u0(boolean z10) {
        m9657b();
        m9657b();
    }
}
