package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0588b;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
class C0160j {

    /* renamed from: d */
    private static C0160j f715d;

    /* renamed from: a */
    private final Context f716a;

    /* renamed from: b */
    private final LocationManager f717b;

    /* renamed from: c */
    private final a f718c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.j$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        boolean f719a;

        /* renamed from: b */
        long f720b;

        /* renamed from: c */
        long f721c;

        /* renamed from: d */
        long f722d;

        /* renamed from: e */
        long f723e;

        /* renamed from: f */
        long f724f;

        a() {
        }
    }

    C0160j(Context context, LocationManager locationManager) {
        this.f716a = context;
        this.f717b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0160j m880a(Context context) {
        if (f715d == null) {
            Context applicationContext = context.getApplicationContext();
            f715d = new C0160j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f715d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m881b() {
        Location m882c = C0588b.m3053b(this.f716a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m882c("network") : null;
        Location m882c2 = C0588b.m3053b(this.f716a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m882c("gps") : null;
        return (m882c2 == null || m882c == null) ? m882c2 != null ? m882c2 : m882c : m882c2.getTime() > m882c.getTime() ? m882c2 : m882c;
    }

    /* renamed from: c */
    private Location m882c(String str) {
        try {
            if (this.f717b.isProviderEnabled(str)) {
                return this.f717b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m883e() {
        return this.f718c.f724f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m884f(Location location) {
        long j10;
        a aVar = this.f718c;
        long currentTimeMillis = System.currentTimeMillis();
        C0159i m878b = C0159i.m878b();
        m878b.m879a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = m878b.f712a;
        m878b.m879a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = m878b.f714c == 1;
        long j12 = m878b.f713b;
        long j13 = m878b.f712a;
        boolean z11 = z10;
        m878b.m879a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = m878b.f713b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f719a = z11;
        aVar.f720b = j11;
        aVar.f721c = j12;
        aVar.f722d = j13;
        aVar.f723e = j14;
        aVar.f724f = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m885d() {
        a aVar = this.f718c;
        if (m883e()) {
            return aVar.f719a;
        }
        Location m881b = m881b();
        if (m881b != null) {
            m884f(m881b);
            return aVar.f719a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
