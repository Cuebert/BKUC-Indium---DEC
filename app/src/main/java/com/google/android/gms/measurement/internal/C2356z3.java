package com.google.android.gms.measurement.internal;

import p096h3.C3392b;
import p096h3.C3393c;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* loaded from: classes.dex */
public final class C2356z3 {

    /* renamed from: a */
    final C2219m4 f8802a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2356z3(C2103b9 c2103b9) {
        this.f8802a = c2103b9.m9762b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m10400a() {
        try {
            C3392b m14952a = C3393c.m14952a(this.f8802a.mo9763c());
            if (m14952a != null) {
                return m14952a.m14949d("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f8802a.mo9765d().m10052v().m9893a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f8802a.mo9765d().m10052v().m9894b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
