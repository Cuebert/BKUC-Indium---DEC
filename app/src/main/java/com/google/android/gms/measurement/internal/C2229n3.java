package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
/* loaded from: classes.dex */
public final class C2229n3 extends AbstractC2289s8 {
    public C2229n3(C2103b9 c2103b9) {
        super(c2103b9);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m10185m() {
        m10300i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8118a.mo9763c().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
