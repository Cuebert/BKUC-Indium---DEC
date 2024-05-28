package p172n2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.C1379b;
import com.google.android.gms.common.C1381d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p057e3.C3062a;
import p173n3.AbstractBinderC4059e;
import p173n3.InterfaceC4058d;
import p282w2.C5105c;
import p282w2.C5106d;
import p282w2.ServiceConnectionC5103a;
import p321z2.C5984j;

/* renamed from: n2.a */
/* loaded from: classes.dex */
public class C4051a {

    /* renamed from: a */
    private ServiceConnectionC5103a f16450a;

    /* renamed from: b */
    private InterfaceC4058d f16451b;

    /* renamed from: c */
    private boolean f16452c;

    /* renamed from: d */
    private final Object f16453d = new Object();

    /* renamed from: e */
    private b f16454e;

    /* renamed from: f */
    private final Context f16455f;

    /* renamed from: g */
    private final boolean f16456g;

    /* renamed from: h */
    private final long f16457h;

    /* renamed from: n2.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final String f16458a;

        /* renamed from: b */
        private final boolean f16459b;

        public a(String str, boolean z10) {
            this.f16458a = str;
            this.f16459b = z10;
        }

        /* renamed from: a */
        public final String m16848a() {
            return this.f16458a;
        }

        /* renamed from: b */
        public final boolean m16849b() {
            return this.f16459b;
        }

        public final String toString() {
            String str = this.f16458a;
            boolean z10 = this.f16459b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n2.a$b */
    /* loaded from: classes.dex */
    public static class b extends Thread {

        /* renamed from: n */
        private WeakReference<C4051a> f16460n;

        /* renamed from: o */
        private long f16461o;

        /* renamed from: p */
        CountDownLatch f16462p = new CountDownLatch(1);

        /* renamed from: q */
        boolean f16463q = false;

        public b(C4051a c4051a, long j10) {
            this.f16460n = new WeakReference<>(c4051a);
            this.f16461o = j10;
            start();
        }

        /* renamed from: a */
        private final void m16850a() {
            C4051a c4051a = this.f16460n.get();
            if (c4051a != null) {
                c4051a.m16846a();
                this.f16463q = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f16462p.await(this.f16461o, TimeUnit.MILLISECONDS)) {
                    return;
                }
                m16850a();
            } catch (InterruptedException unused) {
                m16850a();
            }
        }
    }

    private C4051a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        C5984j.m21286j(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f16455f = context;
        this.f16452c = false;
        this.f16457h = j10;
        this.f16456g = z11;
    }

    /* renamed from: b */
    public static a m16839b(Context context) throws IOException, IllegalStateException, C5105c, C5106d {
        C4053c c4053c = new C4053c(context);
        boolean m16851a = c4053c.m16851a("gads:ad_id_app_context:enabled", false);
        float m16852b = c4053c.m16852b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String m16853c = c4053c.m16853c("gads:ad_id_use_shared_preference:experiment_id", BuildConfig.FLAVOR);
        C4051a c4051a = new C4051a(context, -1L, m16851a, c4053c.m16851a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4051a.m16844h(false);
            a m16847c = c4051a.m16847c();
            c4051a.m16845i(m16847c, m16851a, m16852b, SystemClock.elapsedRealtime() - elapsedRealtime, m16853c, null);
            return m16847c;
        } finally {
        }
    }

    /* renamed from: d */
    public static void m16840d(boolean z10) {
    }

    /* renamed from: e */
    private static InterfaceC4058d m16841e(Context context, ServiceConnectionC5103a serviceConnectionC5103a) throws IOException {
        try {
            return AbstractBinderC4059e.m16860i(serviceConnectionC5103a.m19743a(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: f */
    private static ServiceConnectionC5103a m16842f(Context context, boolean z10) throws IOException, C5105c, C5106d {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int mo7391h = C1379b.m7589f().mo7391h(context, C1381d.f6259a);
            if (mo7391h != 0 && mo7391h != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z10 ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            ServiceConnectionC5103a serviceConnectionC5103a = new ServiceConnectionC5103a();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (C3062a.m13522b().m13527a(context, intent, serviceConnectionC5103a, 1)) {
                    return serviceConnectionC5103a;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C5105c(9);
        }
    }

    /* renamed from: g */
    private final void m16843g() {
        synchronized (this.f16453d) {
            b bVar = this.f16454e;
            if (bVar != null) {
                bVar.f16462p.countDown();
                try {
                    this.f16454e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f16457h > 0) {
                this.f16454e = new b(this, this.f16457h);
            }
        }
    }

    /* renamed from: h */
    private final void m16844h(boolean z10) throws IOException, IllegalStateException, C5105c, C5106d {
        C5984j.m21285i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f16452c) {
                m16846a();
            }
            ServiceConnectionC5103a m16842f = m16842f(this.f16455f, this.f16456g);
            this.f16450a = m16842f;
            this.f16451b = m16841e(this.f16455f, m16842f);
            this.f16452c = true;
            if (z10) {
                m16843g();
            }
        }
    }

    /* renamed from: i */
    private final boolean m16845i(a aVar, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > f10) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z10 ? "1" : "0");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", aVar.m16849b() ? "1" : "0");
        }
        if (aVar != null && aVar.m16848a() != null) {
            hashMap.put("ad_id_size", Integer.toString(aVar.m16848a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new C4052b(this, hashMap).start();
        return true;
    }

    /* renamed from: a */
    public final void m16846a() {
        C5984j.m21285i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f16455f == null || this.f16450a == null) {
                return;
            }
            try {
                if (this.f16452c) {
                    C3062a.m13522b().m13528c(this.f16455f, this.f16450a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f16452c = false;
            this.f16451b = null;
            this.f16450a = null;
        }
    }

    /* renamed from: c */
    public a m16847c() throws IOException {
        a aVar;
        C5984j.m21285i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f16452c) {
                synchronized (this.f16453d) {
                    b bVar = this.f16454e;
                    if (bVar == null || !bVar.f16463q) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m16844h(false);
                    if (!this.f16452c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            C5984j.m21286j(this.f16450a);
            C5984j.m21286j(this.f16451b);
            try {
                aVar = new a(this.f16451b.mo16858b(), this.f16451b.mo16859i0(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        m16843g();
        return aVar;
    }

    protected void finalize() throws Throwable {
        m16846a();
        super.finalize();
    }
}
