package p191o9;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import p035c9.C1151k;
import p179n9.C4081e;
import p179n9.InterfaceC4079c;

/* renamed from: o9.g */
/* loaded from: classes.dex */
public class C4159g {

    /* renamed from: e */
    private static final Object f16932e = new Object();

    /* renamed from: f */
    private static C4159g f16933f;

    /* renamed from: a */
    private InterfaceC4079c f16934a;

    /* renamed from: b */
    private String f16935b;

    /* renamed from: c */
    private Set<c> f16936c = new LinkedHashSet();

    /* renamed from: d */
    private final Runnable f16937d = new a();

    /* renamed from: o9.g$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = C4159g.this.f16936c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).mo12586a();
            }
        }
    }

    /* renamed from: o9.g$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f16939n;

        b(String str) {
            this.f16939n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1151k.m6707a("rbx.platform", "Verifying cookies.");
            String m17243g = C4159g.this.m17243g(C4161i.m17249e().mo15046d(this.f16939n));
            if (m17243g == null || m17243g.equals(C4159g.this.f16935b)) {
                return;
            }
            C1151k.m6707a("rbx.platform", "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers.");
            C4159g.this.f16935b = m17243g;
            C4159g.this.f16934a.mo16966a().execute(C4159g.this.f16937d);
        }
    }

    /* renamed from: o9.g$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo12586a();
    }

    C4159g(InterfaceC4079c interfaceC4079c) {
        this.f16934a = interfaceC4079c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public String m17243g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(".ROBLOSECURITY")) == -1) {
            return null;
        }
        String substring = str.substring(indexOf);
        int indexOf2 = substring.indexOf(59);
        if (indexOf2 == -1) {
            indexOf2 = substring.length();
        }
        return substring.substring(0, indexOf2);
    }

    /* renamed from: h */
    public static C4159g m17244h() {
        C4159g c4159g;
        synchronized (f16932e) {
            if (f16933f == null) {
                f16933f = new C4159g(new C4081e(new ExecutorC4156d(Executors.newSingleThreadScheduledExecutor(), 200), new C4081e.a()));
            }
            c4159g = f16933f;
        }
        return c4159g;
    }

    /* renamed from: i */
    public void m17245i(c cVar) {
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.registerCookieObserver().");
        this.f16936c.add(cVar);
    }

    /* renamed from: j */
    public void m17246j(c cVar) {
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.unregisterCookieObserver().");
        this.f16936c.remove(cVar);
    }

    /* renamed from: k */
    public void m17247k(String str) {
        if (this.f16936c.size() == 0) {
            return;
        }
        this.f16934a.mo16967b().execute(new b(str));
    }
}
