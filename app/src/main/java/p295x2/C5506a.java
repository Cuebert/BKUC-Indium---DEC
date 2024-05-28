package p295x2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1388b;
import com.google.android.gms.common.internal.InterfaceC1391e;
import java.util.Set;
import p295x2.AbstractC5511f;
import p295x2.C5506a.d;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p321z2.C5968b;
import p321z2.C5984j;

/* renamed from: x2.a */
/* loaded from: classes.dex */
public final class C5506a<O extends d> {

    /* renamed from: a */
    private final a<?, O> f20534a;

    /* renamed from: b */
    private final g<?> f20535b;

    /* renamed from: c */
    private final String f20536c;

    /* renamed from: x2.a$a */
    /* loaded from: classes.dex */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo13430a(Context context, Looper looper, C5968b c5968b, O o10, AbstractC5511f.a aVar, AbstractC5511f.b bVar) {
            return mo6179b(context, looper, c5968b, o10, aVar, bVar);
        }

        /* renamed from: b */
        public T mo6179b(Context context, Looper looper, C5968b c5968b, O o10, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: x2.a$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: x2.a$c */
    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* renamed from: x2.a$d */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: m */
        public static final c f20537m = new c(null);

        /* renamed from: x2.a$d$a */
        /* loaded from: classes.dex */
        public interface a extends d {
            /* renamed from: e */
            Account m20246e();
        }

        /* renamed from: x2.a$d$b */
        /* loaded from: classes.dex */
        public interface b extends d {
            /* renamed from: w */
            GoogleSignInAccount m20247w();
        }

        /* renamed from: x2.a$d$c */
        /* loaded from: classes.dex */
        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(C5521p c5521p) {
            }
        }
    }

    /* renamed from: x2.a$e */
    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
    }

    /* renamed from: x2.a$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        /* renamed from: a */
        void mo20248a(AbstractC1388b.e eVar);

        /* renamed from: b */
        boolean mo20249b();

        /* renamed from: d */
        Set<Scope> mo7685d();

        /* renamed from: e */
        void mo20250e(InterfaceC1391e interfaceC1391e, Set<Scope> set);

        /* renamed from: f */
        void mo20251f(String str);

        /* renamed from: g */
        boolean mo20252g();

        /* renamed from: h */
        int mo6185h();

        /* renamed from: i */
        boolean mo20253i();

        /* renamed from: j */
        Feature[] mo20254j();

        /* renamed from: k */
        String mo20255k();

        /* renamed from: l */
        String mo20256l();

        /* renamed from: m */
        void mo20257m(AbstractC1388b.c cVar);

        /* renamed from: n */
        void mo20258n();

        /* renamed from: o */
        boolean mo7672o();
    }

    /* renamed from: x2.a$g */
    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> C5506a(String str, a<C, O> aVar, g<C> gVar) {
        C5984j.m21287k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C5984j.m21287k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f20536c = str;
        this.f20534a = aVar;
        this.f20535b = gVar;
    }

    /* renamed from: a */
    public final a<?, O> m20243a() {
        return this.f20534a;
    }

    /* renamed from: b */
    public final c<?> m20244b() {
        return this.f20535b;
    }

    /* renamed from: c */
    public final String m20245c() {
        return this.f20536c;
    }
}
