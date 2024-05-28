package p087g6;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.atomic.AtomicReference;
import p085g4.C3267n;
import p126j5.C3617d;
import p126j5.C3621g;
import p126j5.C3628n;
import p321z2.C5984j;

/* renamed from: g6.i */
/* loaded from: classes.dex */
public class C3298i {

    /* renamed from: b */
    private static final AtomicReference<C3298i> f13754b = new AtomicReference<>();

    /* renamed from: a */
    private C3628n f13755a;

    private C3298i() {
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static C3298i m14558c() {
        C3298i c3298i = f13754b.get();
        C5984j.m21290n(c3298i != null, "MlKitContext has not been initialized");
        return c3298i;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C3298i m14559d(@RecentlyNonNull Context context) {
        C3298i c3298i = new C3298i();
        Context m14560e = m14560e(context);
        C3628n m15515e = C3628n.m15498h(C3267n.f13708a).m15514d(C3621g.m15488c(m14560e, MlKitComponentDiscoveryService.class).m15491b()).m15512b(C3617d.m15468p(m14560e, Context.class, new Class[0])).m15512b(C3617d.m15468p(c3298i, C3298i.class, new Class[0])).m15515e();
        c3298i.f13755a = m15515e;
        m15515e.m15509k(true);
        C5984j.m21290n(f13754b.getAndSet(c3298i) == null, "MlKitContext is already initialized");
        return c3298i;
    }

    /* renamed from: e */
    private static Context m14560e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public <T> T m14561a(@RecentlyNonNull Class<T> cls) {
        C5984j.m21290n(f13754b.get() == this, "MlKitContext has been deleted");
        C5984j.m21286j(this.f13755a);
        return (T) this.f13755a.mo15448a(cls);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Context m14562b() {
        return (Context) m14561a(Context.class);
    }
}
