package p045d5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p085g4.InterfaceC3251f;

/* renamed from: d5.d */
/* loaded from: classes.dex */
public final class C2981d {

    /* renamed from: o */
    private static final Map f12667o = new HashMap();

    /* renamed from: a */
    private final Context f12668a;

    /* renamed from: b */
    private final C3005x f12669b;

    /* renamed from: c */
    private final String f12670c;

    /* renamed from: g */
    private boolean f12674g;

    /* renamed from: h */
    private final Intent f12675h;

    /* renamed from: i */
    private final InterfaceC2984e0 f12676i;

    /* renamed from: m */
    private ServiceConnection f12680m;

    /* renamed from: n */
    private IInterface f12681n;

    /* renamed from: d */
    private final List f12671d = new ArrayList();

    /* renamed from: e */
    private final Set f12672e = new HashSet();

    /* renamed from: f */
    private final Object f12673f = new Object();

    /* renamed from: k */
    private final IBinder.DeathRecipient f12678k = new IBinder.DeathRecipient() { // from class: d5.a0
        public /* synthetic */ C2976a0() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2981d.m13441k(C2981d.this);
        }
    };

    /* renamed from: l */
    private final AtomicInteger f12679l = new AtomicInteger(0);

    /* renamed from: j */
    private final WeakReference f12677j = new WeakReference(null);

    public C2981d(Context context, C3005x c3005x, String str, Intent intent, InterfaceC2984e0 interfaceC2984e0, InterfaceC2982d0 interfaceC2982d0) {
        this.f12668a = context;
        this.f12669b = c3005x;
        this.f12670c = str;
        this.f12675h = intent;
        this.f12676i = interfaceC2984e0;
    }

    /* renamed from: k */
    public static /* synthetic */ void m13441k(C2981d c2981d) {
        c2981d.f12669b.m13478b("reportBinderDeath", new Object[0]);
        InterfaceC2982d0 interfaceC2982d0 = (InterfaceC2982d0) c2981d.f12677j.get();
        if (interfaceC2982d0 != null) {
            c2981d.f12669b.m13478b("calling onBinderDied", new Object[0]);
            interfaceC2982d0.m13457a();
        } else {
            c2981d.f12669b.m13478b("%s : Binder has died.", c2981d.f12670c);
            Iterator it = c2981d.f12671d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC3006y) it.next()).mo6279a(c2981d.m13450w());
            }
            c2981d.f12671d.clear();
        }
        synchronized (c2981d.f12673f) {
            c2981d.m13451x();
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m13445o(C2981d c2981d, C3265m c3265m) {
        c2981d.f12672e.add(c3265m);
        c3265m.m14512a().mo14495b(new InterfaceC3251f() { // from class: d5.z

            /* renamed from: b */
            public final /* synthetic */ C3265m f12697b;

            public /* synthetic */ C3007z(C3265m c3265m2) {
                r2 = c3265m2;
            }

            @Override // p085g4.InterfaceC3251f
            /* renamed from: a */
            public final void mo7517a(AbstractC3263l abstractC3263l) {
                C2981d.this.m13455u(r2, abstractC3263l);
            }
        });
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m13447q(C2981d c2981d, AbstractRunnableC3006y abstractRunnableC3006y) {
        if (c2981d.f12681n != null || c2981d.f12674g) {
            if (c2981d.f12674g) {
                c2981d.f12669b.m13478b("Waiting to bind to the service.", new Object[0]);
                c2981d.f12671d.add(abstractRunnableC3006y);
                return;
            } else {
                abstractRunnableC3006y.run();
                return;
            }
        }
        c2981d.f12669b.m13478b("Initiate binding to the service.", new Object[0]);
        c2981d.f12671d.add(abstractRunnableC3006y);
        ServiceConnectionC2979c serviceConnectionC2979c = new ServiceConnectionC2979c(c2981d, null);
        c2981d.f12680m = serviceConnectionC2979c;
        c2981d.f12674g = true;
        if (c2981d.f12668a.bindService(c2981d.f12675h, serviceConnectionC2979c, 1)) {
            return;
        }
        c2981d.f12669b.m13478b("Failed to bind to the service.", new Object[0]);
        c2981d.f12674g = false;
        Iterator it = c2981d.f12671d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC3006y) it.next()).mo6279a(new C2983e());
        }
        c2981d.f12671d.clear();
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m13448r(C2981d c2981d) {
        c2981d.f12669b.m13478b("linkToDeath", new Object[0]);
        try {
            c2981d.f12681n.asBinder().linkToDeath(c2981d.f12678k, 0);
        } catch (RemoteException e10) {
            c2981d.f12669b.m13477a(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ void m13449s(C2981d c2981d) {
        c2981d.f12669b.m13478b("unlinkToDeath", new Object[0]);
        c2981d.f12681n.asBinder().unlinkToDeath(c2981d.f12678k, 0);
    }

    /* renamed from: w */
    private final RemoteException m13450w() {
        return new RemoteException(String.valueOf(this.f12670c).concat(" : Binder has died."));
    }

    /* renamed from: x */
    public final void m13451x() {
        Iterator it = this.f12672e.iterator();
        while (it.hasNext()) {
            ((C3265m) it.next()).m14515d(m13450w());
        }
        this.f12672e.clear();
    }

    /* renamed from: c */
    public final Handler m13452c() {
        Handler handler;
        Map map = f12667o;
        synchronized (map) {
            if (!map.containsKey(this.f12670c)) {
                HandlerThread handlerThread = new HandlerThread(this.f12670c, 10);
                handlerThread.start();
                map.put(this.f12670c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f12670c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m13453e() {
        return this.f12681n;
    }

    /* renamed from: t */
    public final void m13454t(AbstractRunnableC3006y abstractRunnableC3006y, C3265m c3265m) {
        m13452c().post(new C2978b0(this, abstractRunnableC3006y.m13480c(), c3265m, abstractRunnableC3006y));
    }

    /* renamed from: u */
    public final /* synthetic */ void m13455u(C3265m c3265m, AbstractC3263l abstractC3263l) {
        synchronized (this.f12673f) {
            this.f12672e.remove(c3265m);
        }
    }

    /* renamed from: v */
    public final void m13456v(C3265m c3265m) {
        synchronized (this.f12673f) {
            this.f12672e.remove(c3265m);
        }
        m13452c().post(new C2980c0(this));
    }
}
