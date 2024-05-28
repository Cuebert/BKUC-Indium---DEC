package p212q5;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p126j5.C3617d;
import p126j5.C3631q;
import p126j5.C3637w;
import p126j5.InterfaceC3619e;
import p126j5.InterfaceC3622h;
import p212q5.InterfaceC4319f;
import p248t5.InterfaceC4733b;

/* renamed from: q5.d */
/* loaded from: classes.dex */
public class C4317d implements InterfaceC4319f {

    /* renamed from: d */
    private static final ThreadFactory f17542d = new ThreadFactory() { // from class: q5.b
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m17830h;
            m17830h = C4317d.m17830h(runnable);
            return m17830h;
        }
    };

    /* renamed from: a */
    private InterfaceC4733b<C4320g> f17543a;

    /* renamed from: b */
    private final Set<InterfaceC4318e> f17544b;

    /* renamed from: c */
    private final Executor f17545c;

    private C4317d(final Context context, Set<InterfaceC4318e> set) {
        this(new C3637w(new InterfaceC4733b() { // from class: q5.c
            @Override // p248t5.InterfaceC4733b
            public final Object get() {
                C4320g m17833a;
                m17833a = C4320g.m17833a(context);
                return m17833a;
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f17542d));
    }

    /* renamed from: e */
    public static C3617d<InterfaceC4319f> m17827e() {
        return C3617d.m15462c(InterfaceC4319f.class).m15480b(C3631q.m15529h(Context.class)).m15480b(C3631q.m15531j(InterfaceC4318e.class)).m15484f(new InterfaceC3622h() { // from class: q5.a
            @Override // p126j5.InterfaceC3622h
            /* renamed from: a */
            public final Object mo230a(InterfaceC3619e interfaceC3619e) {
                InterfaceC4319f m17828f;
                m17828f = C4317d.m17828f(interfaceC3619e);
                return m17828f;
            }
        }).m15482d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC4319f m17828f(InterfaceC3619e interfaceC3619e) {
        return new C4317d((Context) interfaceC3619e.mo15448a(Context.class), interfaceC3619e.mo15449b(InterfaceC4318e.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Thread m17830h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // p212q5.InterfaceC4319f
    /* renamed from: a */
    public InterfaceC4319f.a mo17831a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean m17836d = this.f17543a.get().m17836d(str, currentTimeMillis);
        boolean m17835c = this.f17543a.get().m17835c(currentTimeMillis);
        if (m17836d && m17835c) {
            return InterfaceC4319f.a.COMBINED;
        }
        if (m17835c) {
            return InterfaceC4319f.a.GLOBAL;
        }
        if (m17836d) {
            return InterfaceC4319f.a.SDK;
        }
        return InterfaceC4319f.a.NONE;
    }

    C4317d(InterfaceC4733b<C4320g> interfaceC4733b, Set<InterfaceC4318e> set, Executor executor) {
        this.f17543a = interfaceC4733b;
        this.f17544b = set;
        this.f17545c = executor;
    }
}
