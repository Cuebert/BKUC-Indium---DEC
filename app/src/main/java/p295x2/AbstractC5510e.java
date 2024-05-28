package p295x2;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC1348b;
import com.google.android.gms.common.api.internal.AbstractC1352d;
import com.google.android.gms.common.api.internal.C1350c;
import com.google.android.gms.common.api.internal.C1360h;
import com.google.android.gms.common.api.internal.C1367o;
import com.google.android.gms.common.internal.AbstractC1388b;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import p070f3.C3137k;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p295x2.C5506a;
import p295x2.C5506a.d;
import p308y2.BinderC5607d0;
import p308y2.C5600a;
import p308y2.C5602b;
import p308y2.C5629s;
import p308y2.InterfaceC5623m;
import p308y2.ServiceConnectionC5616i;
import p321z2.C5968b;
import p321z2.C5984j;

/* renamed from: x2.e */
/* loaded from: classes.dex */
public abstract class AbstractC5510e<O extends C5506a.d> implements InterfaceC5512g<O> {

    /* renamed from: a */
    private final Context f20540a;

    /* renamed from: b */
    private final String f20541b;

    /* renamed from: c */
    private final C5506a<O> f20542c;

    /* renamed from: d */
    private final O f20543d;

    /* renamed from: e */
    private final C5602b<O> f20544e;

    /* renamed from: f */
    private final Looper f20545f;

    /* renamed from: g */
    private final int f20546g;

    /* renamed from: h */
    private final AbstractC5511f f20547h;

    /* renamed from: i */
    private final InterfaceC5623m f20548i;

    /* renamed from: j */
    protected final C1350c f20549j;

    /* renamed from: x2.e$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f20550c = new C6062a().m20278a();

        /* renamed from: a */
        public final InterfaceC5623m f20551a;

        /* renamed from: b */
        public final Looper f20552b;

        /* renamed from: x2.e$a$a */
        /* loaded from: classes.dex */
        public static class C6062a {

            /* renamed from: a */
            private InterfaceC5623m f20553a;

            /* renamed from: b */
            private Looper f20554b;

            /* renamed from: a */
            public a m20278a() {
                if (this.f20553a == null) {
                    this.f20553a = new C5600a();
                }
                if (this.f20554b == null) {
                    this.f20554b = Looper.getMainLooper();
                }
                return new a(this.f20553a, this.f20554b);
            }

            /* renamed from: b */
            public C6062a m20279b(Looper looper) {
                C5984j.m21287k(looper, "Looper must not be null.");
                this.f20554b = looper;
                return this;
            }

            /* renamed from: c */
            public C6062a m20280c(InterfaceC5623m interfaceC5623m) {
                C5984j.m21287k(interfaceC5623m, "StatusExceptionMapper must not be null.");
                this.f20553a = interfaceC5623m;
                return this;
            }
        }

        private a(InterfaceC5623m interfaceC5623m, Account account, Looper looper) {
            this.f20551a = interfaceC5623m;
            this.f20552b = looper;
        }

        /* synthetic */ a(InterfaceC5623m interfaceC5623m, Account account, Looper looper, C5522q c5522q) {
            this(interfaceC5623m, null, looper);
        }
    }

    public AbstractC5510e(Activity activity, C5506a<O> c5506a, O o10, a aVar) {
        this(activity, activity, c5506a, o10, aVar);
    }

    /* renamed from: w */
    private final <A extends C5506a.b, T extends AbstractC1348b<? extends InterfaceC5518m, A>> T m20262w(int i10, T t10) {
        t10.m7427k();
        this.f20549j.m7484G(this, i10, t10);
        return t10;
    }

    /* renamed from: x */
    private final <TResult, A extends C5506a.b> AbstractC3263l<TResult> m20263x(int i10, AbstractC1352d<A, TResult> abstractC1352d) {
        C3265m c3265m = new C3265m();
        this.f20549j.m7485H(this, i10, abstractC1352d, c3265m, this.f20548i);
        return c3265m.m14512a();
    }

    @Override // p295x2.InterfaceC5512g
    /* renamed from: h */
    public final C5602b<O> mo20264h() {
        return this.f20544e;
    }

    /* renamed from: j */
    public AbstractC5511f m20265j() {
        return this.f20547h;
    }

    /* renamed from: k */
    protected C5968b.a m20266k() {
        Account m20246e;
        Set<Scope> emptySet;
        GoogleSignInAccount m20247w;
        C5968b.a aVar = new C5968b.a();
        O o10 = this.f20543d;
        if ((o10 instanceof C5506a.d.b) && (m20247w = ((C5506a.d.b) o10).m20247w()) != null) {
            m20246e = m20247w.m7334e();
        } else {
            O o11 = this.f20543d;
            m20246e = o11 instanceof C5506a.d.a ? ((C5506a.d.a) o11).m20246e() : null;
        }
        aVar.m21253d(m20246e);
        O o12 = this.f20543d;
        if (o12 instanceof C5506a.d.b) {
            GoogleSignInAccount m20247w2 = ((C5506a.d.b) o12).m20247w();
            if (m20247w2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = m20247w2.m7330E();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        aVar.m21252c(emptySet);
        aVar.m21254e(this.f20540a.getClass().getName());
        aVar.m21251b(this.f20540a.getPackageName());
        return aVar;
    }

    /* renamed from: l */
    public <TResult, A extends C5506a.b> AbstractC3263l<TResult> m20267l(AbstractC1352d<A, TResult> abstractC1352d) {
        return m20263x(2, abstractC1352d);
    }

    /* renamed from: m */
    public <A extends C5506a.b, T extends AbstractC1348b<? extends InterfaceC5518m, A>> T m20268m(T t10) {
        m20262w(0, t10);
        return t10;
    }

    /* renamed from: n */
    public <TResult, A extends C5506a.b> AbstractC3263l<TResult> m20269n(AbstractC1352d<A, TResult> abstractC1352d) {
        return m20263x(0, abstractC1352d);
    }

    /* renamed from: o */
    public <A extends C5506a.b, T extends AbstractC1348b<? extends InterfaceC5518m, A>> T m20270o(T t10) {
        m20262w(1, t10);
        return t10;
    }

    /* renamed from: p */
    public <TResult, A extends C5506a.b> AbstractC3263l<TResult> m20271p(AbstractC1352d<A, TResult> abstractC1352d) {
        return m20263x(1, abstractC1352d);
    }

    /* renamed from: q */
    public Context m20272q() {
        return this.f20540a;
    }

    /* renamed from: r */
    protected String m20273r() {
        return this.f20541b;
    }

    /* renamed from: s */
    public Looper m20274s() {
        return this.f20545f;
    }

    /* renamed from: t */
    public final int m20275t() {
        return this.f20546g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public final C5506a.f m20276u(Looper looper, C1367o<O> c1367o) {
        C5506a.f mo13430a = ((C5506a.a) C5984j.m21286j(this.f20542c.m20243a())).mo13430a(this.f20540a, looper, m20266k().m21250a(), this.f20543d, c1367o, c1367o);
        String m20273r = m20273r();
        if (m20273r != null && (mo13430a instanceof AbstractC1388b)) {
            ((AbstractC1388b) mo13430a).m7655P(m20273r);
        }
        if (m20273r != null && (mo13430a instanceof ServiceConnectionC5616i)) {
            ((ServiceConnectionC5616i) mo13430a).m20641r(m20273r);
        }
        return mo13430a;
    }

    /* renamed from: v */
    public final BinderC5607d0 m20277v(Context context, Handler handler) {
        return new BinderC5607d0(context, handler, m20266k().m21250a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC5510e(android.app.Activity r2, p295x2.C5506a<O> r3, O r4, p308y2.InterfaceC5623m r5) {
        /*
            r1 = this;
            x2.e$a$a r0 = new x2.e$a$a
            r0.<init>()
            r0.m20280c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m20279b(r5)
            x2.e$a r5 = r0.m20278a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p295x2.AbstractC5510e.<init>(android.app.Activity, x2.a, x2.a$d, y2.m):void");
    }

    private AbstractC5510e(Context context, Activity activity, C5506a<O> c5506a, O o10, a aVar) {
        C5984j.m21287k(context, "Null context is not permitted.");
        C5984j.m21287k(c5506a, "Api must not be null.");
        C5984j.m21287k(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f20540a = context.getApplicationContext();
        String str = null;
        if (C3137k.m13807k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f20541b = str;
        this.f20542c = c5506a;
        this.f20543d = o10;
        this.f20545f = aVar.f20552b;
        C5602b<O> m20621a = C5602b.m20621a(c5506a, o10, str);
        this.f20544e = m20621a;
        this.f20547h = new C5629s(this);
        C1350c m7482z = C1350c.m7482z(this.f20540a);
        this.f20549j = m7482z;
        this.f20546g = m7482z.m7494n();
        this.f20548i = aVar.f20551a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C1360h.m7526u(activity, m7482z, m20621a);
        }
        m7482z.m7489c(this);
    }

    public AbstractC5510e(Context context, C5506a<O> c5506a, O o10, a aVar) {
        this(context, null, c5506a, o10, aVar);
    }
}
