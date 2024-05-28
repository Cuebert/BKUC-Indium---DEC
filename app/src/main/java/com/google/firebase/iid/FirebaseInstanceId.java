package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C2619a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007a6.InterfaceC0042i;
import p084g3.ThreadFactoryC3239a;
import p085g4.AbstractC3263l;
import p085g4.C3269o;
import p085g4.InterfaceC3245c;
import p085g4.InterfaceC3261k;
import p098h5.C3397a;
import p098h5.C3399c;
import p200p5.C4269a;
import p200p5.InterfaceC4270b;
import p200p5.InterfaceC4272d;
import p224r5.C4438j;
import p224r5.InterfaceC4429a;

/* loaded from: classes.dex */
public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f10145i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C2596k f10146j;

    /* renamed from: k */
    private static ScheduledExecutorService f10147k;

    /* renamed from: a */
    private final Executor f10148a;

    /* renamed from: b */
    private final C3399c f10149b;

    /* renamed from: c */
    private final C4438j f10150c;

    /* renamed from: d */
    private final C2579b0 f10151d;

    /* renamed from: e */
    private final C2584e f10152e;

    /* renamed from: f */
    private final C2599n f10153f;

    /* renamed from: g */
    private boolean f10154g;

    /* renamed from: h */
    private final C2574a f10155h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    /* loaded from: classes.dex */
    public class C2574a {

        /* renamed from: a */
        private boolean f10156a;

        /* renamed from: b */
        private final InterfaceC4272d f10157b;

        /* renamed from: c */
        private boolean f10158c;

        /* renamed from: d */
        private InterfaceC4270b<C3397a> f10159d;

        /* renamed from: e */
        private Boolean f10160e;

        C2574a(InterfaceC4272d interfaceC4272d) {
            this.f10157b = interfaceC4272d;
        }

        /* renamed from: b */
        private final synchronized void m11908b() {
            if (this.f10158c) {
                return;
            }
            this.f10156a = m11910d();
            Boolean m11909c = m11909c();
            this.f10160e = m11909c;
            if (m11909c == null && this.f10156a) {
                C2577a0 c2577a0 = new InterfaceC4270b(this) { // from class: com.google.firebase.iid.a0

                    /* renamed from: a */
                    private final FirebaseInstanceId.C2574a f10165a;

                    public C2577a0(FirebaseInstanceId.C2574a this) {
                        this.f10165a = this;
                    }

                    @Override // p200p5.InterfaceC4270b
                    /* renamed from: a */
                    public final void mo11920a(C4269a c4269a) {
                        FirebaseInstanceId.C2574a c2574a = this.f10165a;
                        synchronized (c2574a) {
                            if (c2574a.m11911a()) {
                                FirebaseInstanceId.this.m11879A();
                            }
                        }
                    }
                };
                this.f10159d = c2577a0;
                this.f10157b.mo15540a(C3397a.class, c2577a0);
            }
            this.f10158c = true;
        }

        /* renamed from: c */
        private final Boolean m11909c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m14987h = FirebaseInstanceId.this.f10149b.m14987h();
            SharedPreferences sharedPreferences = m14987h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m14987h.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m14987h.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: d */
        private final boolean m11910d() {
            try {
                int i10 = C2619a.f10277b;
                return true;
            } catch (ClassNotFoundException unused) {
                Context m14987h = FirebaseInstanceId.this.f10149b.m14987h();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(m14987h.getPackageName());
                ResolveInfo resolveService = m14987h.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* renamed from: a */
        public final synchronized boolean m11911a() {
            m11908b();
            Boolean bool = this.f10160e;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.f10156a && FirebaseInstanceId.this.f10149b.m14991q();
        }
    }

    public FirebaseInstanceId(C3399c c3399c, InterfaceC4272d interfaceC4272d, InterfaceC0042i interfaceC0042i) {
        this(c3399c, new C4438j(c3399c.m14987h()), C2576a.m11918c(), C2576a.m11918c(), interfaceC4272d, interfaceC0042i);
    }

    /* renamed from: A */
    public final void m11879A() {
        if (m11899n(m11900o()) || this.f10153f.m11989a()) {
            m11880B();
        }
    }

    /* renamed from: B */
    private final synchronized void m11880B() {
        if (!this.f10154g) {
            m11897k(0L);
        }
    }

    /* renamed from: C */
    private static String m11881C() {
        return f10146j.m11979f(BuildConfig.FLAVOR).m11967b();
    }

    /* renamed from: a */
    public static FirebaseInstanceId m11882a() {
        return getInstance(C3399c.m14978i());
    }

    /* renamed from: d */
    private final AbstractC3263l<InterfaceC4429a> m11883d(String str, String str2) {
        return C3269o.m14531f(null).mo14502i(this.f10148a, new InterfaceC3245c(this, str, m11889u(str2)) { // from class: com.google.firebase.iid.w

            /* renamed from: a */
            private final FirebaseInstanceId f10231a;

            /* renamed from: b */
            private final String f10232b;

            /* renamed from: c */
            private final String f10233c;

            public C2608w(FirebaseInstanceId this, String str3, String str4) {
                this.f10231a = this;
                this.f10232b = str3;
                this.f10233c = str4;
            }

            @Override // p085g4.InterfaceC3245c
            /* renamed from: a */
            public final Object mo11930a(AbstractC3263l abstractC3263l) {
                return this.f10231a.m11893e(this.f10232b, this.f10233c, abstractC3263l);
            }
        });
    }

    @Keep
    public static FirebaseInstanceId getInstance(C3399c c3399c) {
        return (FirebaseInstanceId) c3399c.m14986g(FirebaseInstanceId.class);
    }

    /* renamed from: j */
    private final <T> T m11885j(AbstractC3263l<T> abstractC3263l) throws IOException {
        try {
            return (T) C3269o.m14527b(abstractC3263l, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m11904w();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e10);
        }
    }

    /* renamed from: l */
    public static void m11886l(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            if (f10147k == null) {
                f10147k = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC3239a("FirebaseInstanceId"));
            }
            f10147k.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* renamed from: p */
    private static C2594j m11887p(String str, String str2) {
        return f10146j.m11975a(BuildConfig.FLAVOR, str, str2);
    }

    /* renamed from: u */
    private static String m11889u(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: v */
    public static boolean m11890v() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    /* renamed from: b */
    public AbstractC3263l<InterfaceC4429a> m11891b() {
        return m11883d(C4438j.m18241c(this.f10149b), "*");
    }

    /* renamed from: c */
    public String m11892c(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InterfaceC4429a) m11885j(m11883d(str, str2))).mo11971a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: e */
    public final /* synthetic */ AbstractC3263l m11893e(String str, String str2, AbstractC3263l abstractC3263l) throws Exception {
        String m11881C = m11881C();
        C2594j m11887p = m11887p(str, str2);
        if (!m11899n(m11887p)) {
            return C3269o.m14531f(new C2595j0(m11881C, m11887p.f10198a));
        }
        return this.f10152e.m11932b(str, str2, new InterfaceC2588g(this, m11881C, str, str2) { // from class: com.google.firebase.iid.z

            /* renamed from: a */
            private final FirebaseInstanceId f10239a;

            /* renamed from: b */
            private final String f10240b;

            /* renamed from: c */
            private final String f10241c;

            /* renamed from: d */
            private final String f10242d;

            public C2611z(FirebaseInstanceId this, String m11881C2, String str3, String str22) {
                this.f10239a = this;
                this.f10240b = m11881C2;
                this.f10241c = str3;
                this.f10242d = str22;
            }

            @Override // com.google.firebase.iid.InterfaceC2588g
            public final AbstractC3263l zza() {
                return this.f10239a.m11894f(this.f10240b, this.f10241c, this.f10242d);
            }
        });
    }

    /* renamed from: f */
    public final /* synthetic */ AbstractC3263l m11894f(String str, String str2, String str3) {
        return this.f10151d.m11926b(str, str2, str3).mo14510q(this.f10148a, new InterfaceC3261k(this, str2, str3, str) { // from class: com.google.firebase.iid.y

            /* renamed from: a */
            private final FirebaseInstanceId f10235a;

            /* renamed from: b */
            private final String f10236b;

            /* renamed from: c */
            private final String f10237c;

            /* renamed from: d */
            private final String f10238d;

            public C2610y(FirebaseInstanceId this, String str22, String str32, String str4) {
                this.f10235a = this;
                this.f10236b = str22;
                this.f10237c = str32;
                this.f10238d = str4;
            }

            @Override // p085g4.InterfaceC3261k
            /* renamed from: a */
            public final AbstractC3263l mo6267a(Object obj) {
                return this.f10235a.m11895g(this.f10236b, this.f10237c, this.f10238d, (String) obj);
            }
        });
    }

    /* renamed from: g */
    public final /* synthetic */ AbstractC3263l m11895g(String str, String str2, String str3, String str4) throws Exception {
        f10146j.m11978e(BuildConfig.FLAVOR, str, str2, str4, this.f10150c.m18245e());
        return C3269o.m14531f(new C2595j0(str3, str4));
    }

    /* renamed from: h */
    public final C3399c m11896h() {
        return this.f10149b;
    }

    /* renamed from: k */
    public final synchronized void m11897k(long j10) {
        m11886l(new RunnableC2598m(this, this.f10150c, this.f10153f, Math.min(Math.max(30L, j10 << 1), f10145i)), j10);
        this.f10154g = true;
    }

    /* renamed from: m */
    public final synchronized void m11898m(boolean z10) {
        this.f10154g = z10;
    }

    /* renamed from: n */
    public final boolean m11899n(C2594j c2594j) {
        return c2594j == null || c2594j.m11970c(this.f10150c.m18245e());
    }

    /* renamed from: o */
    public final C2594j m11900o() {
        return m11887p(C4438j.m18241c(this.f10149b), "*");
    }

    /* renamed from: r */
    public final void m11901r(String str) throws IOException {
        C2594j m11900o = m11900o();
        if (!m11899n(m11900o)) {
            m11885j(this.f10151d.m11928h(m11881C(), m11900o.f10198a, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* renamed from: s */
    public final String m11902s() throws IOException {
        return m11892c(C4438j.m18241c(this.f10149b), "*");
    }

    /* renamed from: t */
    public final void m11903t(String str) throws IOException {
        C2594j m11900o = m11900o();
        if (!m11899n(m11900o)) {
            m11885j(this.f10151d.m11929i(m11881C(), m11900o.f10198a, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* renamed from: w */
    public final synchronized void m11904w() {
        f10146j.m11980g();
        if (this.f10155h.m11911a()) {
            m11880B();
        }
    }

    /* renamed from: x */
    public final boolean m11905x() {
        return this.f10150c.m18244a() != 0;
    }

    /* renamed from: y */
    public final void m11906y() {
        f10146j.m11981i(BuildConfig.FLAVOR);
        m11880B();
    }

    /* renamed from: z */
    public final /* synthetic */ void m11907z() {
        if (this.f10155h.m11911a()) {
            m11879A();
        }
    }

    private FirebaseInstanceId(C3399c c3399c, C4438j c4438j, Executor executor, Executor executor2, InterfaceC4272d interfaceC4272d, InterfaceC0042i interfaceC0042i) {
        this.f10154g = false;
        if (C4438j.m18241c(c3399c) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f10146j == null) {
                    f10146j = new C2596k(c3399c.m14987h());
                }
            }
            this.f10149b = c3399c;
            this.f10150c = c4438j;
            this.f10151d = new C2579b0(c3399c, c4438j, executor, interfaceC0042i);
            this.f10148a = executor2;
            this.f10153f = new C2599n(f10146j);
            this.f10155h = new C2574a(interfaceC4272d);
            this.f10152e = new C2584e(executor);
            executor2.execute(new Runnable(this) { // from class: com.google.firebase.iid.x

                /* renamed from: n */
                private final FirebaseInstanceId f10234n;

                public RunnableC2609x(FirebaseInstanceId this) {
                    this.f10234n = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10234n.m11907z();
                }
            });
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
