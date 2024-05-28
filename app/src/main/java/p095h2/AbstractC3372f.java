package p095h2;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p095h2.C3369c;
import p136k2.InterfaceC3749a;
import p307y1.EnumC5595d;

/* renamed from: h2.f */
/* loaded from: classes.dex */
public abstract class AbstractC3372f {

    /* renamed from: h2.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC3749a f14139a;

        /* renamed from: b */
        private Map<EnumC5595d, b> f14140b = new HashMap();

        /* renamed from: a */
        public a m14908a(EnumC5595d enumC5595d, b bVar) {
            this.f14140b.put(enumC5595d, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC3372f m14909b() {
            Objects.requireNonNull(this.f14139a, "missing required property: clock");
            if (this.f14140b.keySet().size() >= EnumC5595d.values().length) {
                Map<EnumC5595d, b> map = this.f14140b;
                this.f14140b = new HashMap();
                return AbstractC3372f.m14902d(this.f14139a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public a m14910c(InterfaceC3749a interfaceC3749a) {
            this.f14139a = interfaceC3749a;
            return this;
        }
    }

    /* renamed from: h2.f$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: h2.f$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo14892a();

            /* renamed from: b */
            public abstract a mo14893b(long j10);

            /* renamed from: c */
            public abstract a mo14894c(Set<c> set);

            /* renamed from: d */
            public abstract a mo14895d(long j10);
        }

        /* renamed from: a */
        public static a m14911a() {
            return new C3369c.b().mo14894c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo14889b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<c> mo14890c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo14891d();
    }

    /* renamed from: h2.f$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m14900a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    /* renamed from: b */
    public static a m14901b() {
        return new a();
    }

    /* renamed from: d */
    static AbstractC3372f m14902d(InterfaceC3749a interfaceC3749a, Map<EnumC5595d, b> map) {
        return new C3368b(interfaceC3749a, map);
    }

    /* renamed from: f */
    public static AbstractC3372f m14903f(InterfaceC3749a interfaceC3749a) {
        return m14901b().m14908a(EnumC5595d.DEFAULT, b.m14911a().mo14893b(30000L).mo14895d(86400000L).mo14892a()).m14908a(EnumC5595d.HIGHEST, b.m14911a().mo14893b(1000L).mo14895d(86400000L).mo14892a()).m14908a(EnumC5595d.VERY_LOW, b.m14911a().mo14893b(86400000L).mo14895d(86400000L).mo14894c(m14904i(c.DEVICE_IDLE)).mo14892a()).m14910c(interfaceC3749a).m14909b();
    }

    /* renamed from: i */
    private static <T> Set<T> m14904i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m14905j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m14906c(JobInfo.Builder builder, EnumC5595d enumC5595d, long j10, int i10) {
        builder.setMinimumLatency(m14907g(enumC5595d, j10, i10));
        m14905j(builder, mo14888h().get(enumC5595d).mo14890c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC3749a mo14887e();

    /* renamed from: g */
    public long m14907g(EnumC5595d enumC5595d, long j10, int i10) {
        long mo15955a = j10 - mo14887e().mo15955a();
        b bVar = mo14888h().get(enumC5595d);
        return Math.min(Math.max(m14900a(i10, bVar.mo14889b()), mo15955a), bVar.mo14891d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<EnumC5595d, b> mo14888h();
}
