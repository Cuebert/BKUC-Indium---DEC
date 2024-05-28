package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.InterfaceC1586g8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h8 */
/* loaded from: classes.dex */
public final class C1603h8<T extends InterfaceC1586g8<T>> {

    /* renamed from: d */
    private static final C1603h8 f6821d = new C1603h8(true);

    /* renamed from: a */
    final C1734pa<T, Object> f6822a = new C1622ia(16);

    /* renamed from: b */
    private boolean f6823b;

    /* renamed from: c */
    private boolean f6824c;

    private C1603h8() {
    }

    /* renamed from: a */
    public static <T extends InterfaceC1586g8<T>> C1603h8<T> m8231a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m8232d(T r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.kb r0 = r4.zzb()
            com.google.android.gms.internal.measurement.C1860x8.m9009e(r5)
            com.google.android.gms.internal.measurement.kb r1 = com.google.android.gms.internal.measurement.EnumC1655kb.f6942o
            com.google.android.gms.internal.measurement.lb r1 = com.google.android.gms.internal.measurement.EnumC1671lb.INT
            com.google.android.gms.internal.measurement.lb r0 = r0.m8356b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.InterfaceC1813u9
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.AbstractC1731p7
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.measurement.kb r4 = r4.zzb()
            com.google.android.gms.internal.measurement.lb r4 = r4.m8356b()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1603h8.m8232d(com.google.android.gms.internal.measurement.g8, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m8233b() {
        if (this.f6823b) {
            return;
        }
        this.f6822a.mo8309a();
        this.f6823b = true;
    }

    /* renamed from: c */
    public final void m8234c(T t10, Object obj) {
        if (t10.m8197a()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m8232d(t10, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m8232d(t10, obj);
        }
        this.f6822a.put(t10, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1603h8 c1603h8 = new C1603h8();
        for (int i10 = 0; i10 < this.f6822a.m8694b(); i10++) {
            Map.Entry<T, Object> m8697g = this.f6822a.m8697g(i10);
            c1603h8.m8234c(m8697g.getKey(), m8697g.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f6822a.m8695c()) {
            c1603h8.m8234c(entry.getKey(), entry.getValue());
        }
        c1603h8.f6824c = this.f6824c;
        return c1603h8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1603h8) {
            return this.f6822a.equals(((C1603h8) obj).f6822a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6822a.hashCode();
    }

    private C1603h8(boolean z10) {
        m8233b();
        m8233b();
    }
}
