package p098h5;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.os.C0633l;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1346a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p070f3.C3129c;
import p070f3.C3137k;
import p070f3.C3138l;
import p093h0.C3356a;
import p126j5.C3617d;
import p126j5.C3621g;
import p126j5.C3628n;
import p126j5.C3637w;
import p200p5.InterfaceC4271c;
import p248t5.InterfaceC4733b;
import p321z2.C5980h;
import p321z2.C5984j;
import p324z5.C6012a;

/* renamed from: h5.c */
/* loaded from: classes.dex */
public class C3399c {

    /* renamed from: j */
    private static final Object f14233j = new Object();

    /* renamed from: k */
    private static final Executor f14234k = new d();

    /* renamed from: l */
    static final Map<String, C3399c> f14235l = new C3356a();

    /* renamed from: a */
    private final Context f14236a;

    /* renamed from: b */
    private final String f14237b;

    /* renamed from: c */
    private final C3405i f14238c;

    /* renamed from: d */
    private final C3628n f14239d;

    /* renamed from: g */
    private final C3637w<C6012a> f14242g;

    /* renamed from: e */
    private final AtomicBoolean f14240e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f14241f = new AtomicBoolean();

    /* renamed from: h */
    private final List<b> f14243h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final List<Object> f14244i = new CopyOnWriteArrayList();

    /* renamed from: h5.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void m14993a(boolean z10);
    }

    @TargetApi(14)
    /* renamed from: h5.c$c */
    /* loaded from: classes.dex */
    public static class c implements ComponentCallbacks2C1346a.a {

        /* renamed from: a */
        private static AtomicReference<c> f14245a = new AtomicReference<>();

        private c() {
        }

        /* renamed from: c */
        public static void m14995c(Context context) {
            if (C3137k.m13797a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f14245a.get() == null) {
                    c cVar = new c();
                    if (f14245a.compareAndSet(null, cVar)) {
                        ComponentCallbacks2C1346a.m7441c(application);
                        ComponentCallbacks2C1346a.m7440b().m7443a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1346a.a
        /* renamed from: a */
        public void mo7446a(boolean z10) {
            synchronized (C3399c.f14233j) {
                Iterator it = new ArrayList(C3399c.f14235l.values()).iterator();
                while (it.hasNext()) {
                    C3399c c3399c = (C3399c) it.next();
                    if (c3399c.f14240e.get()) {
                        c3399c.m14985u(z10);
                    }
                }
            }
        }
    }

    /* renamed from: h5.c$d */
    /* loaded from: classes.dex */
    private static class d implements Executor {

        /* renamed from: n */
        private static final Handler f14246n = new Handler(Looper.getMainLooper());

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f14246n.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: h5.c$e */
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<e> f14247b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f14248a;

        public e(Context context) {
            this.f14248a = context;
        }

        /* renamed from: b */
        public static void m14997b(Context context) {
            if (f14247b.get() == null) {
                e eVar = new e(context);
                if (f14247b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m14998c() {
            this.f14248a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C3399c.f14233j) {
                Iterator<C3399c> it = C3399c.f14235l.values().iterator();
                while (it.hasNext()) {
                    it.next().m14979m();
                }
            }
            m14998c();
        }
    }

    protected C3399c(Context context, String str, C3405i c3405i) {
        this.f14236a = (Context) C5984j.m21286j(context);
        this.f14237b = C5984j.m21282f(str);
        this.f14238c = (C3405i) C5984j.m21286j(c3405i);
        this.f14239d = C3628n.m15498h(f14234k).m15514d(C3621g.m15488c(context, ComponentDiscoveryService.class).m15491b()).m15513c(new FirebaseCommonRegistrar()).m15512b(C3617d.m15468p(context, Context.class, new Class[0])).m15512b(C3617d.m15468p(this, C3399c.class, new Class[0])).m15512b(C3617d.m15468p(c3405i, C3405i.class, new Class[0])).m15515e();
        this.f14242g = new C3637w<>(new InterfaceC4733b() { // from class: h5.b

            /* renamed from: b */
            public final /* synthetic */ Context f14232b;

            public /* synthetic */ C3398b(Context context2) {
                r2 = context2;
            }

            @Override // p248t5.InterfaceC4733b
            public final Object get() {
                C6012a m14983s;
                m14983s = C3399c.this.m14983s(r2);
                return m14983s;
            }
        });
    }

    /* renamed from: f */
    private void m14977f() {
        C5984j.m21290n(!this.f14241f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    public static C3399c m14978i() {
        C3399c c3399c;
        synchronized (f14233j) {
            c3399c = f14235l.get("[DEFAULT]");
            if (c3399c == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C3138l.m13809a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c3399c;
    }

    /* renamed from: m */
    public void m14979m() {
        if (!C0633l.m3364a(this.f14236a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m14988j());
            e.m14997b(this.f14236a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m14988j());
        this.f14239d.m15509k(m14992r());
    }

    /* renamed from: n */
    public static C3399c m14980n(Context context) {
        synchronized (f14233j) {
            if (f14235l.containsKey("[DEFAULT]")) {
                return m14978i();
            }
            C3405i m14999a = C3405i.m14999a(context);
            if (m14999a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m14981o(context, m14999a);
        }
    }

    /* renamed from: o */
    public static C3399c m14981o(Context context, C3405i c3405i) {
        return m14982p(context, c3405i, "[DEFAULT]");
    }

    /* renamed from: p */
    public static C3399c m14982p(Context context, C3405i c3405i, String str) {
        C3399c c3399c;
        c.m14995c(context);
        String m14984t = m14984t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f14233j) {
            Map<String, C3399c> map = f14235l;
            C5984j.m21290n(!map.containsKey(m14984t), "FirebaseApp name " + m14984t + " already exists!");
            C5984j.m21287k(context, "Application context cannot be null.");
            c3399c = new C3399c(context, m14984t, c3405i);
            map.put(m14984t, c3399c);
        }
        c3399c.m14979m();
        return c3399c;
    }

    /* renamed from: s */
    public /* synthetic */ C6012a m14983s(Context context) {
        return new C6012a(context, m14990l(), (InterfaceC4271c) this.f14239d.mo15448a(InterfaceC4271c.class));
    }

    /* renamed from: t */
    private static String m14984t(String str) {
        return str.trim();
    }

    /* renamed from: u */
    public void m14985u(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f14243h.iterator();
        while (it.hasNext()) {
            it.next().m14993a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3399c) {
            return this.f14237b.equals(((C3399c) obj).m14988j());
        }
        return false;
    }

    /* renamed from: g */
    public <T> T m14986g(Class<T> cls) {
        m14977f();
        return (T) this.f14239d.mo15448a(cls);
    }

    /* renamed from: h */
    public Context m14987h() {
        m14977f();
        return this.f14236a;
    }

    public int hashCode() {
        return this.f14237b.hashCode();
    }

    /* renamed from: j */
    public String m14988j() {
        m14977f();
        return this.f14237b;
    }

    /* renamed from: k */
    public C3405i m14989k() {
        m14977f();
        return this.f14238c;
    }

    /* renamed from: l */
    public String m14990l() {
        return C3129c.m13780a(m14988j().getBytes(Charset.defaultCharset())) + "+" + C3129c.m13780a(m14989k().m15001c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: q */
    public boolean m14991q() {
        m14977f();
        return this.f14242g.get().m21328b();
    }

    /* renamed from: r */
    public boolean m14992r() {
        return "[DEFAULT]".equals(m14988j());
    }

    public String toString() {
        return C5980h.m21271d(this).m21272a("name", this.f14237b).m21272a("options", this.f14238c).toString();
    }
}
