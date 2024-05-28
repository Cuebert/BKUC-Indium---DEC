package p321z2;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p044d4.C2968a;
import p093h0.C3357b;
import p295x2.C5506a;

/* renamed from: z2.b */
/* loaded from: classes.dex */
public final class C5968b {

    /* renamed from: a */
    private final Account f22025a;

    /* renamed from: b */
    private final Set<Scope> f22026b;

    /* renamed from: c */
    private final Set<Scope> f22027c;

    /* renamed from: d */
    private final Map<C5506a<?>, C6002s> f22028d;

    /* renamed from: e */
    private final int f22029e;

    /* renamed from: f */
    private final View f22030f;

    /* renamed from: g */
    private final String f22031g;

    /* renamed from: h */
    private final String f22032h;

    /* renamed from: i */
    private final C2968a f22033i;

    /* renamed from: j */
    private Integer f22034j;

    /* renamed from: z2.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private Account f22035a;

        /* renamed from: b */
        private C3357b<Scope> f22036b;

        /* renamed from: c */
        private String f22037c;

        /* renamed from: d */
        private String f22038d;

        /* renamed from: e */
        private C2968a f22039e = C2968a.f12641w;

        /* renamed from: a */
        public C5968b m21250a() {
            return new C5968b(this.f22035a, this.f22036b, null, 0, null, this.f22037c, this.f22038d, this.f22039e, false);
        }

        /* renamed from: b */
        public a m21251b(String str) {
            this.f22037c = str;
            return this;
        }

        /* renamed from: c */
        public final a m21252c(Collection<Scope> collection) {
            if (this.f22036b == null) {
                this.f22036b = new C3357b<>();
            }
            this.f22036b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public final a m21253d(Account account) {
            this.f22035a = account;
            return this;
        }

        /* renamed from: e */
        public final a m21254e(String str) {
            this.f22038d = str;
            return this;
        }
    }

    public C5968b(Account account, Set<Scope> set, Map<C5506a<?>, C6002s> map, int i10, View view, String str, String str2, C2968a c2968a, boolean z10) {
        this.f22025a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f22026b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f22028d = map;
        this.f22030f = view;
        this.f22029e = i10;
        this.f22031g = str;
        this.f22032h = str2;
        this.f22033i = c2968a == null ? C2968a.f12641w : c2968a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<C6002s> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f22067a);
        }
        this.f22027c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public Account m21239a() {
        return this.f22025a;
    }

    @Deprecated
    /* renamed from: b */
    public String m21240b() {
        Account account = this.f22025a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: c */
    public Account m21241c() {
        Account account = this.f22025a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m21242d() {
        return this.f22027c;
    }

    /* renamed from: e */
    public Set<Scope> m21243e(C5506a<?> c5506a) {
        C6002s c6002s = this.f22028d.get(c5506a);
        if (c6002s != null && !c6002s.f22067a.isEmpty()) {
            HashSet hashSet = new HashSet(this.f22026b);
            hashSet.addAll(c6002s.f22067a);
            return hashSet;
        }
        return this.f22026b;
    }

    /* renamed from: f */
    public String m21244f() {
        return this.f22031g;
    }

    /* renamed from: g */
    public Set<Scope> m21245g() {
        return this.f22026b;
    }

    /* renamed from: h */
    public final C2968a m21246h() {
        return this.f22033i;
    }

    /* renamed from: i */
    public final Integer m21247i() {
        return this.f22034j;
    }

    /* renamed from: j */
    public final String m21248j() {
        return this.f22032h;
    }

    /* renamed from: k */
    public final void m21249k(Integer num) {
        this.f22034j = num;
    }
}
