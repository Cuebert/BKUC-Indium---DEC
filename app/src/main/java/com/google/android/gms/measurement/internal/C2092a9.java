package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1531d4;
import com.google.android.gms.internal.measurement.C1696n4;
import java.util.ArrayList;
import java.util.List;
import p018b4.C1009w;
import p321z2.C5984j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a9 */
/* loaded from: classes.dex */
public final class C2092a9 {

    /* renamed from: a */
    C1696n4 f7971a;

    /* renamed from: b */
    List<Long> f7972b;

    /* renamed from: c */
    List<C1531d4> f7973c;

    /* renamed from: d */
    long f7974d;

    /* renamed from: e */
    final /* synthetic */ C2103b9 f7975e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2092a9(C2103b9 c2103b9, C1009w c1009w) {
        this.f7975e = c2103b9;
    }

    /* renamed from: b */
    private static final long m9728b(C1531d4 c1531d4) {
        return ((c1531d4.m8039z() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m9729a(long j10, C1531d4 c1531d4) {
        C5984j.m21286j(c1531d4);
        if (this.f7973c == null) {
            this.f7973c = new ArrayList();
        }
        if (this.f7972b == null) {
            this.f7972b = new ArrayList();
        }
        if (this.f7973c.size() > 0 && m9728b(this.f7973c.get(0)) != m9728b(c1531d4)) {
            return false;
        }
        long mo8680g = this.f7974d + c1531d4.mo8680g();
        this.f7975e.m9753T();
        if (mo8680g >= Math.max(0, C2335x2.f8714j.m10317a(null).intValue())) {
            return false;
        }
        this.f7974d = mo8680g;
        this.f7973c.add(c1531d4);
        this.f7972b.add(Long.valueOf(j10));
        int size = this.f7973c.size();
        this.f7975e.m9753T();
        return size < Math.max(1, C2335x2.f8716k.m10317a(null).intValue());
    }
}
