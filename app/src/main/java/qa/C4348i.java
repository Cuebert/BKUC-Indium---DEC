package qa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import qa.C4357r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qa.i */
/* loaded from: classes.dex */
public class C4348i {

    /* renamed from: a */
    final b f17676a;

    /* renamed from: b */
    final Context f17677b;

    /* renamed from: c */
    final ExecutorService f17678c;

    /* renamed from: d */
    final InterfaceC4349j f17679d;

    /* renamed from: e */
    final Map<String, RunnableC4337c> f17680e;

    /* renamed from: f */
    final Map<Object, AbstractC4333a> f17681f;

    /* renamed from: g */
    final Map<Object, AbstractC4333a> f17682g;

    /* renamed from: h */
    final Set<Object> f17683h;

    /* renamed from: i */
    final Handler f17684i;

    /* renamed from: j */
    final Handler f17685j;

    /* renamed from: k */
    final InterfaceC4339d f17686k;

    /* renamed from: l */
    final C4334a0 f17687l;

    /* renamed from: m */
    final List<RunnableC4337c> f17688m;

    /* renamed from: n */
    final c f17689n;

    /* renamed from: o */
    final boolean f17690o;

    /* renamed from: p */
    boolean f17691p;

    /* renamed from: qa.i$a */
    /* loaded from: classes.dex */
    private static class a extends Handler {

        /* renamed from: a */
        private final C4348i f17692a;

        /* renamed from: qa.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC6059a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ Message f17693n;

            RunnableC6059a(Message message) {
                this.f17693n = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f17693n.what);
            }
        }

        public a(Looper looper, C4348i c4348i) {
            super(looper);
            this.f17692a = c4348i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f17692a.m17979v((AbstractC4333a) message.obj);
                    return;
                case 2:
                    this.f17692a.m17972o((AbstractC4333a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    C4359t.f17735p.post(new RunnableC6059a(message));
                    return;
                case 4:
                    this.f17692a.m17973p((RunnableC4337c) message.obj);
                    return;
                case 5:
                    this.f17692a.m17978u((RunnableC4337c) message.obj);
                    return;
                case 6:
                    this.f17692a.m17974q((RunnableC4337c) message.obj, false);
                    return;
                case 7:
                    this.f17692a.m17971n();
                    return;
                case 9:
                    this.f17692a.m17975r((NetworkInfo) message.obj);
                    return;
                case 10:
                    this.f17692a.m17970m(message.arg1 == 1);
                    return;
                case 11:
                    this.f17692a.m17976s(message.obj);
                    return;
                case 12:
                    this.f17692a.m17977t(message.obj);
                    return;
            }
        }
    }

    /* renamed from: qa.i$b */
    /* loaded from: classes.dex */
    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* renamed from: qa.i$c */
    /* loaded from: classes.dex */
    static class c extends BroadcastReceiver {

        /* renamed from: a */
        private final C4348i f17695a;

        c(C4348i c4348i) {
            this.f17695a = c4348i;
        }

        /* renamed from: a */
        void m17981a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f17695a.f17690o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f17695a.f17677b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f17695a.m17963b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f17695a.m17967f(((ConnectivityManager) C4346g0.m17945p(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4348i(Context context, ExecutorService executorService, Handler handler, InterfaceC4349j interfaceC4349j, InterfaceC4339d interfaceC4339d, C4334a0 c4334a0) {
        b bVar = new b();
        this.f17676a = bVar;
        bVar.start();
        C4346g0.m17939j(bVar.getLooper());
        this.f17677b = context;
        this.f17678c = executorService;
        this.f17680e = new LinkedHashMap();
        this.f17681f = new WeakHashMap();
        this.f17682g = new WeakHashMap();
        this.f17683h = new HashSet();
        this.f17684i = new a(bVar.getLooper(), this);
        this.f17679d = interfaceC4349j;
        this.f17685j = handler;
        this.f17686k = interfaceC4339d;
        this.f17687l = c4334a0;
        this.f17688m = new ArrayList(4);
        this.f17691p = C4346g0.m17947r(context);
        this.f17690o = C4346g0.m17946q(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f17689n = cVar;
        cVar.m17981a();
    }

    /* renamed from: a */
    private void m17958a(RunnableC4337c runnableC4337c) {
        if (runnableC4337c.m17915s()) {
            return;
        }
        this.f17688m.add(runnableC4337c);
        if (this.f17684i.hasMessages(7)) {
            return;
        }
        this.f17684i.sendEmptyMessageDelayed(7, 200L);
    }

    /* renamed from: i */
    private void m17959i() {
        if (this.f17681f.isEmpty()) {
            return;
        }
        Iterator<AbstractC4333a> it = this.f17681f.values().iterator();
        while (it.hasNext()) {
            AbstractC4333a next = it.next();
            it.remove();
            if (next.m17870g().f17750n) {
                C4346g0.m17950u("Dispatcher", "replaying", next.m17872i().m18031d());
            }
            m17980w(next, false);
        }
    }

    /* renamed from: j */
    private void m17960j(List<RunnableC4337c> list) {
        if (list == null || list.isEmpty() || !list.get(0).m17911o().f17750n) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (RunnableC4337c runnableC4337c : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(C4346g0.m17941l(runnableC4337c));
        }
        C4346g0.m17950u("Dispatcher", "delivered", sb2.toString());
    }

    /* renamed from: k */
    private void m17961k(AbstractC4333a abstractC4333a) {
        Object m17874k = abstractC4333a.m17874k();
        if (m17874k != null) {
            abstractC4333a.f17601k = true;
            this.f17681f.put(m17874k, abstractC4333a);
        }
    }

    /* renamed from: l */
    private void m17962l(RunnableC4337c runnableC4337c) {
        AbstractC4333a m17904h = runnableC4337c.m17904h();
        if (m17904h != null) {
            m17961k(m17904h);
        }
        List<AbstractC4333a> m17905i = runnableC4337c.m17905i();
        if (m17905i != null) {
            int size = m17905i.size();
            for (int i10 = 0; i10 < size; i10++) {
                m17961k(m17905i.get(i10));
            }
        }
    }

    /* renamed from: b */
    void m17963b(boolean z10) {
        Handler handler = this.f17684i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m17964c(AbstractC4333a abstractC4333a) {
        Handler handler = this.f17684i;
        handler.sendMessage(handler.obtainMessage(2, abstractC4333a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m17965d(RunnableC4337c runnableC4337c) {
        Handler handler = this.f17684i;
        handler.sendMessage(handler.obtainMessage(4, runnableC4337c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m17966e(RunnableC4337c runnableC4337c) {
        Handler handler = this.f17684i;
        handler.sendMessage(handler.obtainMessage(6, runnableC4337c));
    }

    /* renamed from: f */
    void m17967f(NetworkInfo networkInfo) {
        Handler handler = this.f17684i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m17968g(RunnableC4337c runnableC4337c) {
        Handler handler = this.f17684i;
        handler.sendMessageDelayed(handler.obtainMessage(5, runnableC4337c), 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m17969h(AbstractC4333a abstractC4333a) {
        Handler handler = this.f17684i;
        handler.sendMessage(handler.obtainMessage(1, abstractC4333a));
    }

    /* renamed from: m */
    void m17970m(boolean z10) {
        this.f17691p = z10;
    }

    /* renamed from: n */
    void m17971n() {
        ArrayList arrayList = new ArrayList(this.f17688m);
        this.f17688m.clear();
        Handler handler = this.f17685j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        m17960j(arrayList);
    }

    /* renamed from: o */
    void m17972o(AbstractC4333a abstractC4333a) {
        String m17867d = abstractC4333a.m17867d();
        RunnableC4337c runnableC4337c = this.f17680e.get(m17867d);
        if (runnableC4337c != null) {
            runnableC4337c.m17903f(abstractC4333a);
            if (runnableC4337c.m17902c()) {
                this.f17680e.remove(m17867d);
                if (abstractC4333a.m17870g().f17750n) {
                    C4346g0.m17950u("Dispatcher", "canceled", abstractC4333a.m17872i().m18031d());
                }
            }
        }
        if (this.f17683h.contains(abstractC4333a.m17873j())) {
            this.f17682g.remove(abstractC4333a.m17874k());
            if (abstractC4333a.m17870g().f17750n) {
                C4346g0.m17951v("Dispatcher", "canceled", abstractC4333a.m17872i().m18031d(), "because paused request got canceled");
            }
        }
        AbstractC4333a remove = this.f17681f.remove(abstractC4333a.m17874k());
        if (remove == null || !remove.m17870g().f17750n) {
            return;
        }
        C4346g0.m17951v("Dispatcher", "canceled", remove.m17872i().m18031d(), "from replaying");
    }

    /* renamed from: p */
    void m17973p(RunnableC4337c runnableC4337c) {
        if (EnumC4355p.m17994c(runnableC4337c.m17910n())) {
            this.f17686k.mo17921c(runnableC4337c.m17908l(), runnableC4337c.m17913q());
        }
        this.f17680e.remove(runnableC4337c.m17908l());
        m17958a(runnableC4337c);
        if (runnableC4337c.m17911o().f17750n) {
            C4346g0.m17951v("Dispatcher", "batched", C4346g0.m17941l(runnableC4337c), "for completion");
        }
    }

    /* renamed from: q */
    void m17974q(RunnableC4337c runnableC4337c, boolean z10) {
        if (runnableC4337c.m17911o().f17750n) {
            String m17941l = C4346g0.m17941l(runnableC4337c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z10 ? " (will replay)" : BuildConfig.FLAVOR);
            C4346g0.m17951v("Dispatcher", "batched", m17941l, sb2.toString());
        }
        this.f17680e.remove(runnableC4337c.m17908l());
        m17958a(runnableC4337c);
    }

    /* renamed from: r */
    void m17975r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f17678c;
        if (executorService instanceof C4361v) {
            ((C4361v) executorService).m18026a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        m17959i();
    }

    /* renamed from: s */
    void m17976s(Object obj) {
        if (this.f17683h.add(obj)) {
            Iterator<RunnableC4337c> it = this.f17680e.values().iterator();
            while (it.hasNext()) {
                RunnableC4337c next = it.next();
                boolean z10 = next.m17911o().f17750n;
                AbstractC4333a m17904h = next.m17904h();
                List<AbstractC4333a> m17905i = next.m17905i();
                boolean z11 = (m17905i == null || m17905i.isEmpty()) ? false : true;
                if (m17904h != null || z11) {
                    if (m17904h != null && m17904h.m17873j().equals(obj)) {
                        next.m17903f(m17904h);
                        this.f17682g.put(m17904h.m17874k(), m17904h);
                        if (z10) {
                            C4346g0.m17951v("Dispatcher", "paused", m17904h.f17592b.m18031d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = m17905i.size() - 1; size >= 0; size--) {
                            AbstractC4333a abstractC4333a = m17905i.get(size);
                            if (abstractC4333a.m17873j().equals(obj)) {
                                next.m17903f(abstractC4333a);
                                this.f17682g.put(abstractC4333a.m17874k(), abstractC4333a);
                                if (z10) {
                                    C4346g0.m17951v("Dispatcher", "paused", abstractC4333a.f17592b.m18031d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.m17902c()) {
                        it.remove();
                        if (z10) {
                            C4346g0.m17951v("Dispatcher", "canceled", C4346g0.m17941l(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    void m17977t(Object obj) {
        if (this.f17683h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<AbstractC4333a> it = this.f17682g.values().iterator();
            while (it.hasNext()) {
                AbstractC4333a next = it.next();
                if (next.m17873j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f17685j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* renamed from: u */
    void m17978u(RunnableC4337c runnableC4337c) {
        if (runnableC4337c.m17915s()) {
            return;
        }
        boolean z10 = false;
        if (this.f17678c.isShutdown()) {
            m17974q(runnableC4337c, false);
            return;
        }
        NetworkInfo activeNetworkInfo = this.f17690o ? ((ConnectivityManager) C4346g0.m17945p(this.f17677b, "connectivity")).getActiveNetworkInfo() : null;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean m17916u = runnableC4337c.m17916u(this.f17691p, activeNetworkInfo);
        boolean m17917v = runnableC4337c.m17917v();
        if (!m17916u) {
            if (this.f17690o && m17917v) {
                z10 = true;
            }
            m17974q(runnableC4337c, z10);
            if (z10) {
                m17962l(runnableC4337c);
                return;
            }
            return;
        }
        if (this.f17690o && !z11) {
            m17974q(runnableC4337c, m17917v);
            if (m17917v) {
                m17962l(runnableC4337c);
                return;
            }
            return;
        }
        if (runnableC4337c.m17911o().f17750n) {
            C4346g0.m17950u("Dispatcher", "retrying", C4346g0.m17941l(runnableC4337c));
        }
        if (runnableC4337c.m17907k() instanceof C4357r.a) {
            runnableC4337c.f17655v |= EnumC4356q.NO_CACHE.f17731n;
        }
        runnableC4337c.f17641A = this.f17678c.submit(runnableC4337c);
    }

    /* renamed from: v */
    void m17979v(AbstractC4333a abstractC4333a) {
        m17980w(abstractC4333a, true);
    }

    /* renamed from: w */
    void m17980w(AbstractC4333a abstractC4333a, boolean z10) {
        if (this.f17683h.contains(abstractC4333a.m17873j())) {
            this.f17682g.put(abstractC4333a.m17874k(), abstractC4333a);
            if (abstractC4333a.m17870g().f17750n) {
                C4346g0.m17951v("Dispatcher", "paused", abstractC4333a.f17592b.m18031d(), "because tag '" + abstractC4333a.m17873j() + "' is paused");
                return;
            }
            return;
        }
        RunnableC4337c runnableC4337c = this.f17680e.get(abstractC4333a.m17867d());
        if (runnableC4337c != null) {
            runnableC4337c.m17901b(abstractC4333a);
            return;
        }
        if (this.f17678c.isShutdown()) {
            if (abstractC4333a.m17870g().f17750n) {
                C4346g0.m17951v("Dispatcher", "ignored", abstractC4333a.f17592b.m18031d(), "because shut down");
                return;
            }
            return;
        }
        RunnableC4337c m17897g = RunnableC4337c.m17897g(abstractC4333a.m17870g(), this, this.f17686k, this.f17687l, abstractC4333a);
        m17897g.f17641A = this.f17678c.submit(m17897g);
        this.f17680e.put(abstractC4333a.m17867d(), m17897g);
        if (z10) {
            this.f17681f.remove(abstractC4333a.m17874k());
        }
        if (abstractC4333a.m17870g().f17750n) {
            C4346g0.m17950u("Dispatcher", "enqueued", abstractC4333a.f17592b.m18031d());
        }
    }
}
