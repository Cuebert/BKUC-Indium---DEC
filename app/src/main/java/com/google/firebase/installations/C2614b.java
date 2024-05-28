package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.C2614b;
import com.google.firebase.installations.C2615c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p007a6.InterfaceC0042i;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p085g4.C3269o;
import p098h5.C3399c;
import p212q5.InterfaceC4319f;
import p248t5.InterfaceC4733b;
import p261u5.C4864e;
import p261u5.InterfaceC4862c;
import p273v5.InterfaceC4985a;
import p285w5.AbstractC5461d;
import p285w5.C5459b;
import p285w5.C5460c;
import p298x5.AbstractC5552d;
import p298x5.AbstractC5554f;
import p298x5.C5551c;
import p321z2.C5984j;

/* renamed from: com.google.firebase.installations.b */
/* loaded from: classes.dex */
public class C2614b implements InterfaceC4862c {

    /* renamed from: m */
    private static final Object f10247m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f10248n = new a();

    /* renamed from: a */
    private final C3399c f10249a;

    /* renamed from: b */
    private final C5551c f10250b;

    /* renamed from: c */
    private final C5460c f10251c;

    /* renamed from: d */
    private final C2618f f10252d;

    /* renamed from: e */
    private final C5459b f10253e;

    /* renamed from: f */
    private final C4864e f10254f;

    /* renamed from: g */
    private final Object f10255g;

    /* renamed from: h */
    private final ExecutorService f10256h;

    /* renamed from: i */
    private final ExecutorService f10257i;

    /* renamed from: j */
    private String f10258j;

    /* renamed from: k */
    private Set<InterfaceC4985a> f10259k;

    /* renamed from: l */
    private final List<InterfaceC2617e> f10260l;

    /* renamed from: com.google.firebase.installations.b$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f10261a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f10261a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.b$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10262a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10263b;

        static {
            int[] iArr = new int[AbstractC5554f.b.values().length];
            f10263b = iArr;
            try {
                iArr[AbstractC5554f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10263b[AbstractC5554f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10263b[AbstractC5554f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC5552d.b.values().length];
            f10262a = iArr2;
            try {
                iArr2[AbstractC5552d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10262a[AbstractC5552d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2614b(C3399c c3399c, InterfaceC4733b<InterfaceC0042i> interfaceC4733b, InterfaceC4733b<InterfaceC4319f> interfaceC4733b2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f10248n), c3399c, new C5551c(c3399c.m14987h(), interfaceC4733b, interfaceC4733b2), new C5460c(c3399c), C2618f.m12029c(), new C5459b(c3399c), new C4864e());
    }

    /* renamed from: c */
    private AbstractC3263l<String> m12003c() {
        C3265m c3265m = new C3265m();
        m12004d(new C2616d(c3265m));
        return c3265m.m14512a();
    }

    /* renamed from: d */
    private void m12004d(InterfaceC2617e interfaceC2617e) {
        synchronized (this.f10255g) {
            this.f10260l.add(interfaceC2617e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12014r(boolean r3) {
        /*
            r2 = this;
            w5.d r0 = r2.m12011n()
            boolean r1 = r0.m20078i()     // Catch: com.google.firebase.installations.C2615c -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.m20081l()     // Catch: com.google.firebase.installations.C2615c -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.f r3 = r2.f10252d     // Catch: com.google.firebase.installations.C2615c -> L5f
            boolean r3 = r3.m12036f(r0)     // Catch: com.google.firebase.installations.C2615c -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            w5.d r3 = r2.m12007g(r0)     // Catch: com.google.firebase.installations.C2615c -> L5f
            goto L26
        L22:
            w5.d r3 = r2.m12018v(r0)     // Catch: com.google.firebase.installations.C2615c -> L5f
        L26:
            r2.m12013q(r3)
            r2.m12022z(r0, r3)
            boolean r0 = r3.m20080k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo20051d()
            r2.m12021y(r0)
        L39:
            boolean r0 = r3.m20078i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.c r3 = new com.google.firebase.installations.c
            com.google.firebase.installations.c$a r0 = com.google.firebase.installations.C2615c.a.BAD_CONFIG
            r3.<init>(r0)
            r2.m12019w(r3)
            goto L5e
        L4a:
            boolean r0 = r3.m20079j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m12019w(r3)
            goto L5e
        L5b:
            r2.m12020x(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.m12019w(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C2614b.m12014r(boolean):void");
    }

    /* renamed from: f */
    private final void m12006f(final boolean z10) {
        AbstractC5461d m12012o = m12012o();
        if (z10) {
            m12012o = m12012o.m20084p();
        }
        m12020x(m12012o);
        this.f10257i.execute(new Runnable() { // from class: u5.b
            @Override // java.lang.Runnable
            public final void run() {
                C2614b.this.m12014r(z10);
            }
        });
    }

    /* renamed from: g */
    private AbstractC5461d m12007g(AbstractC5461d abstractC5461d) throws C2615c {
        AbstractC5554f m20337e = this.f10250b.m20337e(m12023h(), abstractC5461d.mo20051d(), m12026p(), abstractC5461d.mo20053f());
        int i10 = b.f10263b[m20337e.mo20312b().ordinal()];
        if (i10 == 1) {
            return abstractC5461d.m20083o(m20337e.mo20313c(), m20337e.mo20314d(), this.f10252d.m12034b());
        }
        if (i10 == 2) {
            return abstractC5461d.m20085q("BAD CONFIG");
        }
        if (i10 == 3) {
            m12021y(null);
            return abstractC5461d.m20086r();
        }
        throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
    }

    /* renamed from: j */
    private synchronized String m12008j() {
        return this.f10258j;
    }

    /* renamed from: l */
    public static C2614b m12009l() {
        return m12010m(C3399c.m14978i());
    }

    /* renamed from: m */
    public static C2614b m12010m(C3399c c3399c) {
        C5984j.m21278b(c3399c != null, "Null is not a valid value of FirebaseApp.");
        return (C2614b) c3399c.m14986g(InterfaceC4862c.class);
    }

    /* renamed from: n */
    private AbstractC5461d m12011n() {
        AbstractC5461d m20076c;
        synchronized (f10247m) {
            C2613a m11999a = C2613a.m11999a(this.f10249a.m14987h(), "generatefid.lock");
            try {
                m20076c = this.f10251c.m20076c();
            } finally {
                if (m11999a != null) {
                    m11999a.m12000b();
                }
            }
        }
        return m20076c;
    }

    /* renamed from: o */
    private AbstractC5461d m12012o() {
        AbstractC5461d m20076c;
        synchronized (f10247m) {
            C2613a m11999a = C2613a.m11999a(this.f10249a.m14987h(), "generatefid.lock");
            try {
                m20076c = this.f10251c.m20076c();
                if (m20076c.m20079j()) {
                    m20076c = this.f10251c.m20075a(m20076c.m20088t(m12017u(m20076c)));
                }
            } finally {
                if (m11999a != null) {
                    m11999a.m12000b();
                }
            }
        }
        return m20076c;
    }

    /* renamed from: q */
    private void m12013q(AbstractC5461d abstractC5461d) {
        synchronized (f10247m) {
            C2613a m11999a = C2613a.m11999a(this.f10249a.m14987h(), "generatefid.lock");
            try {
                this.f10251c.m20075a(abstractC5461d);
            } finally {
                if (m11999a != null) {
                    m11999a.m12000b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m12015s() {
        m12006f(false);
    }

    /* renamed from: t */
    private void m12016t() {
        C5984j.m21283g(m12024i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5984j.m21283g(m12026p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5984j.m21283g(m12023h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5984j.m21278b(C2618f.m12032h(m12024i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C5984j.m21278b(C2618f.m12031g(m12023h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: u */
    private String m12017u(AbstractC5461d abstractC5461d) {
        if ((!this.f10249a.m14988j().equals("CHIME_ANDROID_SDK") && !this.f10249a.m14992r()) || !abstractC5461d.m20082m()) {
            return this.f10254f.m19046a();
        }
        String m20072f = this.f10253e.m20072f();
        return TextUtils.isEmpty(m20072f) ? this.f10254f.m19046a() : m20072f;
    }

    /* renamed from: v */
    private AbstractC5461d m12018v(AbstractC5461d abstractC5461d) throws C2615c {
        AbstractC5552d m20336d = this.f10250b.m20336d(m12023h(), abstractC5461d.mo20051d(), m12026p(), m12024i(), (abstractC5461d.mo20051d() == null || abstractC5461d.mo20051d().length() != 11) ? null : this.f10253e.m20073i());
        int i10 = b.f10262a[m20336d.mo20304e().ordinal()];
        if (i10 == 1) {
            return abstractC5461d.m20087s(m20336d.mo20302c(), m20336d.mo20303d(), this.f10252d.m12034b(), m20336d.mo20301b().mo20313c(), m20336d.mo20301b().mo20314d());
        }
        if (i10 == 2) {
            return abstractC5461d.m20085q("BAD CONFIG");
        }
        throw new C2615c("Firebase Installations Service is unavailable. Please try again later.", C2615c.a.UNAVAILABLE);
    }

    /* renamed from: w */
    private void m12019w(Exception exc) {
        synchronized (this.f10255g) {
            Iterator<InterfaceC2617e> it = this.f10260l.iterator();
            while (it.hasNext()) {
                if (it.next().mo12028b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    private void m12020x(AbstractC5461d abstractC5461d) {
        synchronized (this.f10255g) {
            Iterator<InterfaceC2617e> it = this.f10260l.iterator();
            while (it.hasNext()) {
                if (it.next().mo12027a(abstractC5461d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: y */
    private synchronized void m12021y(String str) {
        this.f10258j = str;
    }

    /* renamed from: z */
    private synchronized void m12022z(AbstractC5461d abstractC5461d, AbstractC5461d abstractC5461d2) {
        if (this.f10259k.size() != 0 && !abstractC5461d.mo20051d().equals(abstractC5461d2.mo20051d())) {
            Iterator<InterfaceC4985a> it = this.f10259k.iterator();
            while (it.hasNext()) {
                it.next().m19425a(abstractC5461d2.mo20051d());
            }
        }
    }

    /* renamed from: h */
    String m12023h() {
        return this.f10249a.m14989k().m15000b();
    }

    /* renamed from: i */
    String m12024i() {
        return this.f10249a.m14989k().m15001c();
    }

    /* renamed from: k */
    public AbstractC3263l<String> m12025k() {
        m12016t();
        String m12008j = m12008j();
        if (m12008j != null) {
            return C3269o.m14531f(m12008j);
        }
        AbstractC3263l<String> m12003c = m12003c();
        this.f10256h.execute(new Runnable() { // from class: u5.a
            @Override // java.lang.Runnable
            public final void run() {
                C2614b.this.m12015s();
            }
        });
        return m12003c;
    }

    /* renamed from: p */
    String m12026p() {
        return this.f10249a.m14989k().m15003e();
    }

    C2614b(ExecutorService executorService, C3399c c3399c, C5551c c5551c, C5460c c5460c, C2618f c2618f, C5459b c5459b, C4864e c4864e) {
        this.f10255g = new Object();
        this.f10259k = new HashSet();
        this.f10260l = new ArrayList();
        this.f10249a = c3399c;
        this.f10250b = c5551c;
        this.f10251c = c5460c;
        this.f10252d = c2618f;
        this.f10253e = c5459b;
        this.f10254f = c4864e;
        this.f10256h = executorService;
        this.f10257i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f10248n);
    }
}
