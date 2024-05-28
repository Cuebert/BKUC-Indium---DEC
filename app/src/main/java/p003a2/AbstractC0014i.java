package p003a2;

import com.appsflyer.oaid.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p003a2.C0007b;

/* renamed from: a2.i */
/* loaded from: classes.dex */
public abstract class AbstractC0014i {

    /* renamed from: a2.i$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public final a m136a(String str, int i10) {
            mo94e().put(str, String.valueOf(i10));
            return this;
        }

        /* renamed from: b */
        public final a m137b(String str, long j10) {
            mo94e().put(str, String.valueOf(j10));
            return this;
        }

        /* renamed from: c */
        public final a m138c(String str, String str2) {
            mo94e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC0014i mo93d();

        /* renamed from: e */
        protected abstract Map<String, String> mo94e();

        /* renamed from: f */
        protected abstract a mo95f(Map<String, String> map);

        /* renamed from: g */
        public abstract a mo96g(Integer num);

        /* renamed from: h */
        public abstract a mo97h(C0013h c0013h);

        /* renamed from: i */
        public abstract a mo98i(long j10);

        /* renamed from: j */
        public abstract a mo99j(String str);

        /* renamed from: k */
        public abstract a mo100k(long j10);
    }

    /* renamed from: a */
    public static a m130a() {
        return new C0007b.b().mo95f(new HashMap());
    }

    /* renamed from: b */
    public final String m131b(String str) {
        String str2 = mo87c().get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo87c();

    /* renamed from: d */
    public abstract Integer mo88d();

    /* renamed from: e */
    public abstract C0013h mo89e();

    /* renamed from: f */
    public abstract long mo90f();

    /* renamed from: g */
    public final int m132g(String str) {
        String str2 = mo87c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m133h(String str) {
        String str2 = mo87c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m134i() {
        return Collections.unmodifiableMap(mo87c());
    }

    /* renamed from: j */
    public abstract String mo91j();

    /* renamed from: k */
    public abstract long mo92k();

    /* renamed from: l */
    public a m135l() {
        return new C0007b.b().mo99j(mo91j()).mo96g(mo88d()).mo97h(mo89e()).mo98i(mo90f()).mo100k(mo92k()).mo95f(new HashMap(mo87c()));
    }
}
