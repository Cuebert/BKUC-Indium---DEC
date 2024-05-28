package qa;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import qa.AbstractC4333a;

/* renamed from: qa.t */
/* loaded from: classes.dex */
public class C4359t {

    /* renamed from: p */
    static final Handler f17735p = new a(Looper.getMainLooper());

    /* renamed from: q */
    static volatile C4359t f17736q = null;

    /* renamed from: a */
    private final d f17737a;

    /* renamed from: b */
    private final g f17738b;

    /* renamed from: c */
    private final c f17739c;

    /* renamed from: d */
    private final List<AbstractC4364y> f17740d;

    /* renamed from: e */
    final Context f17741e;

    /* renamed from: f */
    final C4348i f17742f;

    /* renamed from: g */
    final InterfaceC4339d f17743g;

    /* renamed from: h */
    final C4334a0 f17744h;

    /* renamed from: i */
    final Map<Object, AbstractC4333a> f17745i;

    /* renamed from: j */
    final Map<ImageView, ViewTreeObserverOnPreDrawListenerC4347h> f17746j;

    /* renamed from: k */
    final ReferenceQueue<Object> f17747k;

    /* renamed from: l */
    final Bitmap.Config f17748l;

    /* renamed from: m */
    boolean f17749m;

    /* renamed from: n */
    volatile boolean f17750n;

    /* renamed from: o */
    boolean f17751o;

    /* renamed from: qa.t$a */
    /* loaded from: classes.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                AbstractC4333a abstractC4333a = (AbstractC4333a) message.obj;
                if (abstractC4333a.m17870g().f17750n) {
                    C4346g0.m17951v("Main", "canceled", abstractC4333a.f17592b.m18031d(), "target got garbage collected");
                }
                abstractC4333a.f17591a.m18003b(abstractC4333a.m17874k());
                return;
            }
            int i11 = 0;
            if (i10 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i11 < size) {
                    RunnableC4337c runnableC4337c = (RunnableC4337c) list.get(i11);
                    runnableC4337c.f17648o.m18008e(runnableC4337c);
                    i11++;
                }
                return;
            }
            if (i10 == 13) {
                List list2 = (List) message.obj;
                int size2 = list2.size();
                while (i11 < size2) {
                    AbstractC4333a abstractC4333a2 = (AbstractC4333a) list2.get(i11);
                    abstractC4333a2.f17591a.m18015m(abstractC4333a2);
                    i11++;
                }
                return;
            }
            throw new AssertionError("Unknown handler message received: " + message.what);
        }
    }

    /* renamed from: qa.t$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Context f17752a;

        /* renamed from: b */
        private InterfaceC4349j f17753b;

        /* renamed from: c */
        private ExecutorService f17754c;

        /* renamed from: d */
        private InterfaceC4339d f17755d;

        /* renamed from: e */
        private d f17756e;

        /* renamed from: f */
        private g f17757f;

        /* renamed from: g */
        private List<AbstractC4364y> f17758g;

        /* renamed from: h */
        private Bitmap.Config f17759h;

        /* renamed from: i */
        private boolean f17760i;

        /* renamed from: j */
        private boolean f17761j;

        public b(Context context) {
            if (context != null) {
                this.f17752a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C4359t m18018a() {
            Context context = this.f17752a;
            if (this.f17753b == null) {
                this.f17753b = C4346g0.m17936g(context);
            }
            if (this.f17755d == null) {
                this.f17755d = new C4352m(context);
            }
            if (this.f17754c == null) {
                this.f17754c = new C4361v();
            }
            if (this.f17757f == null) {
                this.f17757f = g.f17775a;
            }
            C4334a0 c4334a0 = new C4334a0(this.f17755d);
            return new C4359t(context, new C4348i(context, this.f17754c, C4359t.f17735p, this.f17753b, this.f17755d, c4334a0), this.f17755d, this.f17756e, this.f17757f, this.f17758g, c4334a0, this.f17759h, this.f17760i, this.f17761j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qa.t$c */
    /* loaded from: classes.dex */
    public static class c extends Thread {

        /* renamed from: n */
        private final ReferenceQueue<Object> f17762n;

        /* renamed from: o */
        private final Handler f17763o;

        /* renamed from: qa.t$c$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ Exception f17764n;

            a(Exception exc) {
                this.f17764n = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f17764n);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f17762n = referenceQueue;
            this.f17763o = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC4333a.a aVar = (AbstractC4333a.a) this.f17762n.remove(1000L);
                    Message obtainMessage = this.f17763o.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f17603a;
                        this.f17763o.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.f17763o.post(new a(e10));
                    return;
                }
            }
        }
    }

    /* renamed from: qa.t$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void m18019a(C4359t c4359t, Uri uri, Exception exc);
    }

    /* renamed from: qa.t$e */
    /* loaded from: classes.dex */
    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* renamed from: n */
        final int f17770n;

        e(int i10) {
            this.f17770n = i10;
        }
    }

    /* renamed from: qa.t$f */
    /* loaded from: classes.dex */
    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: qa.t$g */
    /* loaded from: classes.dex */
    public interface g {

        /* renamed from: a */
        public static final g f17775a = new a();

        /* renamed from: qa.t$g$a */
        /* loaded from: classes.dex */
        static class a implements g {
            a() {
            }

            @Override // qa.C4359t.g
            /* renamed from: a */
            public C4362w mo18020a(C4362w c4362w) {
                return c4362w;
            }
        }

        /* renamed from: a */
        C4362w mo18020a(C4362w c4362w);
    }

    C4359t(Context context, C4348i c4348i, InterfaceC4339d interfaceC4339d, d dVar, g gVar, List<AbstractC4364y> list, C4334a0 c4334a0, Bitmap.Config config, boolean z10, boolean z11) {
        this.f17741e = context;
        this.f17742f = c4348i;
        this.f17743g = interfaceC4339d;
        this.f17737a = dVar;
        this.f17738b = gVar;
        this.f17748l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C4365z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C4343f(context));
        arrayList.add(new C4354o(context));
        arrayList.add(new C4345g(context));
        arrayList.add(new C4335b(context));
        arrayList.add(new C4350k(context));
        arrayList.add(new C4357r(c4348i.f17679d, c4334a0));
        this.f17740d = Collections.unmodifiableList(arrayList);
        this.f17744h = c4334a0;
        this.f17745i = new WeakHashMap();
        this.f17746j = new WeakHashMap();
        this.f17749m = z10;
        this.f17750n = z11;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f17747k = referenceQueue;
        c cVar = new c(referenceQueue, f17735p);
        this.f17739c = cVar;
        cVar.start();
    }

    /* renamed from: b */
    public void m18003b(Object obj) {
        C4346g0.m17932c();
        AbstractC4333a remove = this.f17745i.remove(obj);
        if (remove != null) {
            remove.mo17864a();
            this.f17742f.m17964c(remove);
        }
        if (obj instanceof ImageView) {
            ViewTreeObserverOnPreDrawListenerC4347h remove2 = this.f17746j.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.m17957a();
            }
        }
    }

    /* renamed from: g */
    private void m18004g(Bitmap bitmap, e eVar, AbstractC4333a abstractC4333a) {
        if (abstractC4333a.m17875l()) {
            return;
        }
        if (!abstractC4333a.m17876m()) {
            this.f17745i.remove(abstractC4333a.m17874k());
        }
        if (bitmap == null) {
            abstractC4333a.mo17866c();
            if (this.f17750n) {
                C4346g0.m17950u("Main", "errored", abstractC4333a.f17592b.m18031d());
                return;
            }
            return;
        }
        if (eVar != null) {
            abstractC4333a.mo17865b(bitmap, eVar);
            if (this.f17750n) {
                C4346g0.m17951v("Main", "completed", abstractC4333a.f17592b.m18031d(), "from " + eVar);
                return;
            }
            return;
        }
        throw new AssertionError("LoadedFrom cannot be null.");
    }

    /* renamed from: p */
    public static C4359t m18005p(Context context) {
        if (f17736q == null) {
            synchronized (C4359t.class) {
                if (f17736q == null) {
                    f17736q = new b(context).m18018a();
                }
            }
        }
        return f17736q;
    }

    /* renamed from: c */
    public void m18006c(ImageView imageView) {
        m18003b(imageView);
    }

    /* renamed from: d */
    public void m18007d(InterfaceC4338c0 interfaceC4338c0) {
        m18003b(interfaceC4338c0);
    }

    /* renamed from: e */
    void m18008e(RunnableC4337c runnableC4337c) {
        AbstractC4333a m17904h = runnableC4337c.m17904h();
        List<AbstractC4333a> m17905i = runnableC4337c.m17905i();
        boolean z10 = true;
        boolean z11 = (m17905i == null || m17905i.isEmpty()) ? false : true;
        if (m17904h == null && !z11) {
            z10 = false;
        }
        if (z10) {
            Uri uri = runnableC4337c.m17906j().f17789d;
            Exception m17907k = runnableC4337c.m17907k();
            Bitmap m17913q = runnableC4337c.m17913q();
            e m17909m = runnableC4337c.m17909m();
            if (m17904h != null) {
                m18004g(m17913q, m17909m, m17904h);
            }
            if (z11) {
                int size = m17905i.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m18004g(m17913q, m17909m, m17905i.get(i10));
                }
            }
            d dVar = this.f17737a;
            if (dVar == null || m17907k == null) {
                return;
            }
            dVar.m18019a(this, uri, m17907k);
        }
    }

    /* renamed from: f */
    public void m18009f(ImageView imageView, ViewTreeObserverOnPreDrawListenerC4347h viewTreeObserverOnPreDrawListenerC4347h) {
        this.f17746j.put(imageView, viewTreeObserverOnPreDrawListenerC4347h);
    }

    /* renamed from: h */
    public void m18010h(AbstractC4333a abstractC4333a) {
        Object m17874k = abstractC4333a.m17874k();
        if (m17874k != null && this.f17745i.get(m17874k) != abstractC4333a) {
            m18003b(m17874k);
            this.f17745i.put(m17874k, abstractC4333a);
        }
        m18016n(abstractC4333a);
    }

    /* renamed from: i */
    public List<AbstractC4364y> m18011i() {
        return this.f17740d;
    }

    /* renamed from: j */
    public C4363x m18012j(Uri uri) {
        return new C4363x(this, uri, 0);
    }

    /* renamed from: k */
    public C4363x m18013k(String str) {
        if (str == null) {
            return new C4363x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return m18012j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* renamed from: l */
    public Bitmap m18014l(String str) {
        Bitmap mo17919a = this.f17743g.mo17919a(str);
        if (mo17919a != null) {
            this.f17744h.m17882d();
        } else {
            this.f17744h.m17883e();
        }
        return mo17919a;
    }

    /* renamed from: m */
    void m18015m(AbstractC4333a abstractC4333a) {
        Bitmap m18014l = EnumC4355p.m17993b(abstractC4333a.f17595e) ? m18014l(abstractC4333a.m17867d()) : null;
        if (m18014l != null) {
            e eVar = e.MEMORY;
            m18004g(m18014l, eVar, abstractC4333a);
            if (this.f17750n) {
                C4346g0.m17951v("Main", "completed", abstractC4333a.f17592b.m18031d(), "from " + eVar);
                return;
            }
            return;
        }
        m18010h(abstractC4333a);
        if (this.f17750n) {
            C4346g0.m17950u("Main", "resumed", abstractC4333a.f17592b.m18031d());
        }
    }

    /* renamed from: n */
    void m18016n(AbstractC4333a abstractC4333a) {
        this.f17742f.m17969h(abstractC4333a);
    }

    /* renamed from: o */
    public C4362w m18017o(C4362w c4362w) {
        C4362w mo18020a = this.f17738b.mo18020a(c4362w);
        if (mo18020a != null) {
            return mo18020a;
        }
        throw new IllegalStateException("Request transformer " + this.f17738b.getClass().getCanonicalName() + " returned null for " + c4362w);
    }
}
