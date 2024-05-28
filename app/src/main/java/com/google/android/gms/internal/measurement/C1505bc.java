package com.google.android.gms.internal.measurement;

import backtraceio.library.services.BacktraceMetrics;

/* renamed from: com.google.android.gms.internal.measurement.bc */
/* loaded from: classes.dex */
public final class C1505bc implements InterfaceC1488ac {

    /* renamed from: A */
    public static final AbstractC1666l6<Long> f6667A;

    /* renamed from: B */
    public static final AbstractC1666l6<Long> f6668B;

    /* renamed from: C */
    public static final AbstractC1666l6<Long> f6669C;

    /* renamed from: D */
    public static final AbstractC1666l6<Long> f6670D;

    /* renamed from: E */
    public static final AbstractC1666l6<Long> f6671E;

    /* renamed from: F */
    public static final AbstractC1666l6<Long> f6672F;

    /* renamed from: G */
    public static final AbstractC1666l6<Long> f6673G;

    /* renamed from: H */
    public static final AbstractC1666l6<Long> f6674H;

    /* renamed from: I */
    public static final AbstractC1666l6<Long> f6675I;

    /* renamed from: J */
    public static final AbstractC1666l6<Long> f6676J;

    /* renamed from: K */
    public static final AbstractC1666l6<String> f6677K;

    /* renamed from: L */
    public static final AbstractC1666l6<Long> f6678L;

    /* renamed from: a */
    public static final AbstractC1666l6<Long> f6679a;

    /* renamed from: b */
    public static final AbstractC1666l6<Long> f6680b;

    /* renamed from: c */
    public static final AbstractC1666l6<Long> f6681c;

    /* renamed from: d */
    public static final AbstractC1666l6<String> f6682d;

    /* renamed from: e */
    public static final AbstractC1666l6<String> f6683e;

    /* renamed from: f */
    public static final AbstractC1666l6<String> f6684f;

    /* renamed from: g */
    public static final AbstractC1666l6<Long> f6685g;

    /* renamed from: h */
    public static final AbstractC1666l6<Long> f6686h;

    /* renamed from: i */
    public static final AbstractC1666l6<Long> f6687i;

    /* renamed from: j */
    public static final AbstractC1666l6<Long> f6688j;

    /* renamed from: k */
    public static final AbstractC1666l6<Long> f6689k;

    /* renamed from: l */
    public static final AbstractC1666l6<Long> f6690l;

    /* renamed from: m */
    public static final AbstractC1666l6<Long> f6691m;

    /* renamed from: n */
    public static final AbstractC1666l6<Long> f6692n;

    /* renamed from: o */
    public static final AbstractC1666l6<Long> f6693o;

    /* renamed from: p */
    public static final AbstractC1666l6<Long> f6694p;

    /* renamed from: q */
    public static final AbstractC1666l6<Long> f6695q;

    /* renamed from: r */
    public static final AbstractC1666l6<Long> f6696r;

    /* renamed from: s */
    public static final AbstractC1666l6<String> f6697s;

    /* renamed from: t */
    public static final AbstractC1666l6<Long> f6698t;

    /* renamed from: u */
    public static final AbstractC1666l6<Long> f6699u;

    /* renamed from: v */
    public static final AbstractC1666l6<Long> f6700v;

    /* renamed from: w */
    public static final AbstractC1666l6<Long> f6701w;

    /* renamed from: x */
    public static final AbstractC1666l6<Long> f6702x;

    /* renamed from: y */
    public static final AbstractC1666l6<Long> f6703y;

    /* renamed from: z */
    public static final AbstractC1666l6<Long> f6704z;

    static {
        C1618i6 c1618i6 = new C1618i6(C1499b6.m7951a("com.google.android.gms.measurement"));
        f6679a = c1618i6.m8300c("measurement.ad_id_cache_time", 10000L);
        f6680b = c1618i6.m8300c("measurement.max_bundles_per_iteration", 100L);
        f6681c = c1618i6.m8300c("measurement.config.cache_time", 86400000L);
        f6682d = c1618i6.m8301d("measurement.log_tag", "FA");
        f6683e = c1618i6.m8301d("measurement.config.url_authority", "app-measurement.com");
        f6684f = c1618i6.m8301d("measurement.config.url_scheme", "https");
        f6685g = c1618i6.m8300c("measurement.upload.debug_upload_interval", 1000L);
        f6686h = c1618i6.m8300c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f6687i = c1618i6.m8300c("measurement.store.max_stored_events_per_app", 100000L);
        f6688j = c1618i6.m8300c("measurement.experiment.max_ids", 50L);
        f6689k = c1618i6.m8300c("measurement.audience.filter_result_max_count", 200L);
        f6690l = c1618i6.m8300c("measurement.alarm_manager.minimum_interval", 60000L);
        f6691m = c1618i6.m8300c("measurement.upload.minimum_delay", 500L);
        f6692n = c1618i6.m8300c("measurement.monitoring.sample_period_millis", 86400000L);
        f6693o = c1618i6.m8300c("measurement.upload.realtime_upload_interval", 10000L);
        f6694p = c1618i6.m8300c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        f6695q = c1618i6.m8300c("measurement.config.cache_time.service", 3600000L);
        f6696r = c1618i6.m8300c("measurement.service_client.idle_disconnect_millis", 5000L);
        f6697s = c1618i6.m8301d("measurement.log_tag.service", "FA-SVC");
        f6698t = c1618i6.m8300c("measurement.upload.stale_data_deletion_interval", 86400000L);
        f6699u = c1618i6.m8300c("measurement.sdk.attribution.cache.ttl", 604800000L);
        f6700v = c1618i6.m8300c("measurement.upload.backoff_period", 43200000L);
        f6701w = c1618i6.m8300c("measurement.upload.initial_upload_delay_time", 15000L);
        f6702x = c1618i6.m8300c("measurement.upload.interval", 3600000L);
        f6703y = c1618i6.m8300c("measurement.upload.max_bundle_size", 65536L);
        f6704z = c1618i6.m8300c("measurement.upload.max_bundles", 100L);
        f6667A = c1618i6.m8300c("measurement.upload.max_conversions_per_day", 500L);
        f6668B = c1618i6.m8300c("measurement.upload.max_error_events_per_day", 1000L);
        f6669C = c1618i6.m8300c("measurement.upload.max_events_per_bundle", 1000L);
        f6670D = c1618i6.m8300c("measurement.upload.max_events_per_day", 100000L);
        f6671E = c1618i6.m8300c("measurement.upload.max_public_events_per_day", 50000L);
        f6672F = c1618i6.m8300c("measurement.upload.max_queue_time", 2419200000L);
        f6673G = c1618i6.m8300c("measurement.upload.max_realtime_events_per_day", 10L);
        f6674H = c1618i6.m8300c("measurement.upload.max_batch_size", 65536L);
        f6675I = c1618i6.m8300c("measurement.upload.retry_count", 6L);
        f6676J = c1618i6.m8300c("measurement.upload.retry_time", BacktraceMetrics.defaultTimeIntervalMs);
        f6677K = c1618i6.m8301d("measurement.upload.url", "https://app-measurement.com/a");
        f6678L = c1618i6.m8300c("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: A */
    public final long mo7894A() {
        return f6675I.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: B */
    public final long mo7895B() {
        return f6698t.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: C */
    public final String mo7896C() {
        return f6677K.m8380b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: D */
    public final long mo7897D() {
        return f6676J.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: E */
    public final long mo7898E() {
        return f6669C.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: F */
    public final long mo7899F() {
        return f6672F.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: G */
    public final long mo7900G() {
        return f6703y.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: a */
    public final long mo7901a() {
        return f6681c.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: b */
    public final long mo7902b() {
        return f6686h.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: c */
    public final long mo7903c() {
        return f6685g.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: d */
    public final long mo7904d() {
        return f6689k.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: e */
    public final long mo7905e() {
        return f6690l.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: f */
    public final long mo7906f() {
        return f6687i.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: g */
    public final long mo7907g() {
        return f6692n.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: h */
    public final long mo7908h() {
        return f6699u.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: i */
    public final long mo7909i() {
        return f6693o.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: j */
    public final long mo7910j() {
        return f6700v.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: k */
    public final long mo7911k() {
        return f6696r.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: l */
    public final long mo7912l() {
        return f6691m.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: m */
    public final long mo7913m() {
        return f6688j.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: n */
    public final long mo7914n() {
        return f6678L.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: o */
    public final long mo7915o() {
        return f6670D.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: p */
    public final long mo7916p() {
        return f6673G.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: q */
    public final long mo7917q() {
        return f6704z.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: r */
    public final long mo7918r() {
        return f6671E.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: s */
    public final long mo7919s() {
        return f6694p.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: t */
    public final long mo7920t() {
        return f6667A.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: u */
    public final String mo7921u() {
        return f6683e.m8380b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: v */
    public final long mo7922v() {
        return f6701w.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: w */
    public final long mo7923w() {
        return f6674H.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: x */
    public final long mo7924x() {
        return f6668B.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: y */
    public final String mo7925y() {
        return f6684f.m8380b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    /* renamed from: z */
    public final long mo7926z() {
        return f6702x.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    public final long zza() {
        return f6679a.m8380b().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1488ac
    public final long zzb() {
        return f6680b.m8380b().longValue();
    }
}
