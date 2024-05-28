package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC1788t0;
import p057e3.C3062a;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes.dex */
final class RunnableC2336x3 implements Runnable {

    /* renamed from: n */
    final /* synthetic */ InterfaceC1788t0 f8748n;

    /* renamed from: o */
    final /* synthetic */ ServiceConnection f8749o;

    /* renamed from: p */
    final /* synthetic */ ServiceConnectionC2346y3 f8750p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2336x3(ServiceConnectionC2346y3 serviceConnectionC2346y3, InterfaceC1788t0 interfaceC1788t0, ServiceConnection serviceConnection) {
        this.f8750p = serviceConnectionC2346y3;
        this.f8748n = interfaceC1788t0;
        this.f8749o = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ServiceConnectionC2346y3 serviceConnectionC2346y3 = this.f8750p;
        C2356z3 c2356z3 = serviceConnectionC2346y3.f8766b;
        str = serviceConnectionC2346y3.f8765a;
        InterfaceC1788t0 interfaceC1788t0 = this.f8748n;
        ServiceConnection serviceConnection = this.f8749o;
        c2356z3.f8802a.mo9761b().mo9917h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle mo8739m = interfaceC1788t0.mo8739m(bundle);
            if (mo8739m == null) {
                c2356z3.f8802a.mo9765d().m10048r().m9893a("Install Referrer Service returned a null response");
            } else {
                bundle2 = mo8739m;
            }
        } catch (Exception e10) {
            c2356z3.f8802a.mo9765d().m10048r().m9894b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        c2356z3.f8802a.mo9761b().mo9917h();
        C2219m4.m10098t();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c2356z3.f8802a.mo9765d().m10053w().m9893a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    c2356z3.f8802a.mo9765d().m10052v().m9894b("InstallReferrer API result", string);
                    Bundle m9979t0 = c2356z3.f8802a.m10114N().m9979t0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (m9979t0 == null) {
                        c2356z3.f8802a.mo9765d().m10048r().m9893a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m9979t0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                c2356z3.f8802a.mo9765d().m10048r().m9893a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m9979t0.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == c2356z3.f8802a.m10107F().f8633f.m10298a()) {
                            c2356z3.f8802a.mo9765d().m10052v().m9893a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c2356z3.f8802a.m10127o()) {
                            c2356z3.f8802a.m10107F().f8633f.m10299b(j10);
                            c2356z3.f8802a.mo9765d().m10052v().m9894b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m9979t0.putString("_cis", "referrer API v2");
                            c2356z3.f8802a.m10109I().m10174t("auto", "_cmp", m9979t0, str);
                        }
                    }
                } else {
                    c2356z3.f8802a.mo9765d().m10048r().m9893a("No referrer defined in Install Referrer response");
                }
            }
        }
        C3062a.m13522b().m13528c(c2356z3.f8802a.mo9763c(), serviceConnection);
    }
}
