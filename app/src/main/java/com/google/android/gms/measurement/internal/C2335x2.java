package com.google.android.gms.measurement.internal;

import android.content.Context;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.internal.measurement.C1499b6;
import com.google.android.gms.internal.measurement.C1761r5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.x2 */
/* loaded from: classes.dex */
public final class C2335x2 {

    /* renamed from: A0 */
    public static final C2325w2<Boolean> f8666A0;

    /* renamed from: B0 */
    public static final C2325w2<Boolean> f8668B0;

    /* renamed from: C */
    public static final C2325w2<Long> f8669C;

    /* renamed from: C0 */
    public static final C2325w2<Boolean> f8670C0;

    /* renamed from: D */
    public static final C2325w2<Integer> f8671D;

    /* renamed from: D0 */
    public static final C2325w2<Boolean> f8672D0;

    /* renamed from: E */
    public static final C2325w2<Long> f8673E;

    /* renamed from: E0 */
    public static final C2325w2<Boolean> f8674E0;

    /* renamed from: F */
    public static final C2325w2<Integer> f8675F;

    /* renamed from: G */
    public static final C2325w2<Integer> f8676G;

    /* renamed from: H */
    public static final C2325w2<Integer> f8677H;

    /* renamed from: I */
    public static final C2325w2<Integer> f8678I;

    /* renamed from: J */
    public static final C2325w2<Integer> f8679J;

    /* renamed from: K */
    public static final C2325w2<Long> f8680K;

    /* renamed from: L */
    public static final C2325w2<Boolean> f8681L;

    /* renamed from: M */
    public static final C2325w2<String> f8682M;

    /* renamed from: N */
    public static final C2325w2<Long> f8683N;

    /* renamed from: O */
    public static final C2325w2<Integer> f8684O;

    /* renamed from: P */
    public static final C2325w2<Double> f8685P;

    /* renamed from: Q */
    public static final C2325w2<Integer> f8686Q;

    /* renamed from: R */
    public static final C2325w2<Integer> f8687R;

    /* renamed from: S */
    public static final C2325w2<Long> f8688S;

    /* renamed from: T */
    public static final C2325w2<Boolean> f8689T;

    /* renamed from: U */
    public static final C2325w2<Boolean> f8690U;

    /* renamed from: V */
    public static final C2325w2<Boolean> f8691V;

    /* renamed from: W */
    public static final C2325w2<Boolean> f8692W;

    /* renamed from: X */
    public static final C2325w2<Boolean> f8693X;

    /* renamed from: Y */
    public static final C2325w2<Boolean> f8694Y;

    /* renamed from: Z */
    public static final C2325w2<Boolean> f8695Z;

    /* renamed from: a0 */
    public static final C2325w2<Boolean> f8697a0;

    /* renamed from: b0 */
    public static final C2325w2<Boolean> f8699b0;

    /* renamed from: c0 */
    public static final C2325w2<Boolean> f8701c0;

    /* renamed from: d0 */
    public static final C2325w2<Boolean> f8703d0;

    /* renamed from: e0 */
    public static final C2325w2<Boolean> f8705e0;

    /* renamed from: f0 */
    public static final C2325w2<Boolean> f8707f0;

    /* renamed from: g0 */
    public static final C2325w2<Boolean> f8709g0;

    /* renamed from: h0 */
    public static final C2325w2<Boolean> f8711h0;

    /* renamed from: i0 */
    public static final C2325w2<Boolean> f8713i0;

    /* renamed from: j0 */
    public static final C2325w2<Boolean> f8715j0;

    /* renamed from: k0 */
    public static final C2325w2<Boolean> f8717k0;

    /* renamed from: l0 */
    public static final C2325w2<Boolean> f8719l0;

    /* renamed from: m0 */
    public static final C2325w2<Boolean> f8721m0;

    /* renamed from: n0 */
    public static final C2325w2<Boolean> f8723n0;

    /* renamed from: o0 */
    public static final C2325w2<Boolean> f8725o0;

    /* renamed from: p0 */
    public static final C2325w2<Integer> f8727p0;

    /* renamed from: q0 */
    public static final C2325w2<Boolean> f8729q0;

    /* renamed from: r0 */
    public static final C2325w2<Boolean> f8731r0;

    /* renamed from: s0 */
    public static final C2325w2<Boolean> f8733s0;

    /* renamed from: t0 */
    public static final C2325w2<Boolean> f8735t0;

    /* renamed from: u0 */
    public static final C2325w2<Boolean> f8737u0;

    /* renamed from: v0 */
    public static final C2325w2<Boolean> f8739v0;

    /* renamed from: w0 */
    public static final C2325w2<Boolean> f8741w0;

    /* renamed from: x0 */
    public static final C2325w2<Boolean> f8743x0;

    /* renamed from: y0 */
    public static final C2325w2<Boolean> f8745y0;

    /* renamed from: z0 */
    public static final C2325w2<Boolean> f8747z0;

    /* renamed from: a */
    private static final List<C2325w2<?>> f8696a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set<C2325w2<?>> f8698b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final C2325w2<Long> f8700c = m10328a("measurement.ad_id_cache_time", 10000L, 10000L, C2280s.f8524a);

    /* renamed from: d */
    public static final C2325w2<Long> f8702d = m10328a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C2127e0.f8055a);

    /* renamed from: e */
    public static final C2325w2<Long> f8704e = m10328a("measurement.config.cache_time", 86400000L, 3600000L, C2312v.f8604a);

    /* renamed from: f */
    public static final C2325w2<String> f8706f = m10328a("measurement.config.url_scheme", "https", "https", C2171i0.f8163a);

    /* renamed from: g */
    public static final C2325w2<String> f8708g = m10328a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C2303u0.f8587a);

    /* renamed from: h */
    public static final C2325w2<Integer> f8710h = m10328a("measurement.upload.max_bundles", 100, 100, C2161h1.f8131a);

    /* renamed from: i */
    public static final C2325w2<Integer> f8712i = m10328a("measurement.upload.max_batch_size", 65536, 65536, C2293t1.f8558a);

    /* renamed from: j */
    public static final C2325w2<Integer> f8714j = m10328a("measurement.upload.max_bundle_size", 65536, 65536, C2151g2.f8105a);

    /* renamed from: k */
    public static final C2325w2<Integer> f8716k = m10328a("measurement.upload.max_events_per_bundle", 1000, 1000, C2250p2.f8422a);

    /* renamed from: l */
    public static final C2325w2<Integer> f8718l = m10328a("measurement.upload.max_events_per_day", 100000, 100000, C2261q2.f8443a);

    /* renamed from: m */
    public static final C2325w2<Integer> f8720m = m10328a("measurement.upload.max_error_events_per_day", 1000, 1000, C2248p0.f8420a);

    /* renamed from: n */
    public static final C2325w2<Integer> f8722n = m10328a("measurement.upload.max_public_events_per_day", 50000, 50000, C2095b1.f7977a);

    /* renamed from: o */
    public static final C2325w2<Integer> f8724o = m10328a("measurement.upload.max_conversions_per_day", 10000, 10000, C2216m1.f8287a);

    /* renamed from: p */
    public static final C2325w2<Integer> f8726p = m10328a("measurement.upload.max_realtime_events_per_day", 10, 10, C2334x1.f8664a);

    /* renamed from: q */
    public static final C2325w2<Integer> f8728q = m10328a("measurement.store.max_stored_events_per_app", 100000, 100000, C2184j2.f8199a);

    /* renamed from: r */
    public static final C2325w2<String> f8730r = m10328a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C2272r2.f8466a);

    /* renamed from: s */
    public static final C2325w2<Long> f8732s = m10328a("measurement.upload.backoff_period", 43200000L, 43200000L, C2283s2.f8527a);

    /* renamed from: t */
    public static final C2325w2<Long> f8734t = m10328a("measurement.upload.window_interval", 3600000L, 3600000L, C2294t2.f8559a);

    /* renamed from: u */
    public static final C2325w2<Long> f8736u = m10328a("measurement.upload.interval", 3600000L, 3600000L, C2291t.f8556a);

    /* renamed from: v */
    public static final C2325w2<Long> f8738v = m10328a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C2302u.f8586a);

    /* renamed from: w */
    public static final C2325w2<Long> f8740w = m10328a("measurement.upload.debug_upload_interval", 1000L, 1000L, C2322w.f8618a);

    /* renamed from: x */
    public static final C2325w2<Long> f8742x = m10328a("measurement.upload.minimum_delay", 500L, 500L, C2342y.f8761a);

    /* renamed from: y */
    public static final C2325w2<Long> f8744y = m10328a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C2352z.f8797a);

    /* renamed from: z */
    public static final C2325w2<Long> f8746z = m10328a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C2083a0.f7943a);

    /* renamed from: A */
    public static final C2325w2<Long> f8665A = m10328a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C2094b0.f7976a);

    /* renamed from: B */
    public static final C2325w2<Long> f8667B = m10328a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C2105c0.f8021a);

    static {
        Long valueOf = Long.valueOf(BacktraceMetrics.defaultTimeIntervalMs);
        f8669C = m10328a("measurement.upload.retry_time", valueOf, valueOf, C2116d0.f8039a);
        f8671D = m10328a("measurement.upload.retry_count", 6, 6, C2138f0.f8073a);
        f8673E = m10328a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C2149g0.f8103a);
        f8675F = m10328a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C2160h0.f8130a);
        f8676G = m10328a("measurement.audience.filter_result_max_count", 200, 200, C2182j0.f8197a);
        f8677H = m10328a("measurement.upload.max_public_user_properties", 25, 25, null);
        f8678I = m10328a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f8679J = m10328a("measurement.upload.max_public_event_params", 25, 25, null);
        f8680K = m10328a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C2193k0.f8225a);
        Boolean bool = Boolean.FALSE;
        f8681L = m10328a("measurement.test.boolean_flag", bool, bool, C2204l0.f8257a);
        f8682M = m10328a("measurement.test.string_flag", "---", "---", C2215m0.f8286a);
        f8683N = m10328a("measurement.test.long_flag", -1L, -1L, C2226n0.f8354a);
        f8684O = m10328a("measurement.test.int_flag", -2, -2, C2237o0.f8388a);
        Double valueOf2 = Double.valueOf(-3.0d);
        f8685P = m10328a("measurement.test.double_flag", valueOf2, valueOf2, C2259q0.f8441a);
        f8686Q = m10328a("measurement.experiment.max_ids", 50, 50, C2270r0.f8464a);
        f8687R = m10328a("measurement.max_bundles_per_iteration", 100, 100, C2281s0.f8525a);
        f8688S = m10328a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C2292t0.f8557a);
        f8689T = m10328a("measurement.validation.internal_limits_internal_event_params", bool, bool, C2313v0.f8605a);
        Boolean bool2 = Boolean.TRUE;
        f8690U = m10328a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, C2323w0.f8619a);
        f8691V = m10328a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, C2333x0.f8663a);
        f8692W = m10328a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C2353z0.f8798a);
        f8693X = m10328a("measurement.quality.checksum", bool, bool, null);
        f8694Y = m10328a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C2084a1.f7944a);
        f8695Z = m10328a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C2106c1.f8022a);
        f8697a0 = m10328a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C2117d1.f8040a);
        f8699b0 = m10328a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C2128e1.f8056a);
        f8701c0 = m10328a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C2139f1.f8074a);
        f8703d0 = m10328a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, C2150g1.f8104a);
        f8705e0 = m10328a("measurement.ga.ga_app_id", bool, bool, C2172i1.f8164a);
        f8707f0 = m10328a("measurement.lifecycle.app_in_background_parameter", bool, bool, C2183j1.f8198a);
        f8709g0 = m10328a("measurement.integration.disable_firebase_instance_id", bool, bool, C2194k1.f8226a);
        f8711h0 = m10328a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, C2205l1.f8258a);
        f8713i0 = m10328a("measurement.collection.service.update_with_analytics_fix", bool, bool, C2227n1.f8355a);
        f8715j0 = m10328a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C2238o1.f8389a);
        f8717k0 = m10328a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C2249p1.f8421a);
        f8719l0 = m10328a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C2260q1.f8442a);
        f8721m0 = m10328a("measurement.upload.file_truncate_fix", bool, bool, C2271r1.f8465a);
        f8723n0 = m10328a("measurement.collection.synthetic_data_mitigation", bool, bool, C2282s1.f8526a);
        f8725o0 = m10328a("measurement.androidId.delete_feature", bool2, bool2, C2304u1.f8588a);
        f8727p0 = m10328a("measurement.service.storage_consent_support_version", 203600, 203600, C2314v1.f8606a);
        f8729q0 = m10328a("measurement.client.click_identifier_control.dev", bool, bool, C2324w1.f8620a);
        f8731r0 = m10328a("measurement.service.click_identifier_control", bool, bool, C2344y1.f8764a);
        f8733s0 = m10328a("measurement.config.persist_last_modified", bool2, bool2, C2085a2.f7945a);
        f8735t0 = m10328a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, C2096b2.f7978a);
        f8737u0 = m10328a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, C2107c2.f8023a);
        f8739v0 = m10328a("measurement.module.pixie.ees", bool2, bool2, C2118d2.f8041a);
        f8741w0 = m10328a("measurement.module.pixie.fix_array", bool2, bool2, C2129e2.f8057a);
        f8743x0 = m10328a("measurement.adid_zero.service", bool, bool, C2140f2.f8075a);
        f8745y0 = m10328a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, C2162h2.f8132a);
        f8747z0 = m10328a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, C2173i2.f8165a);
        f8666A0 = m10328a("measurement.adid_zero.adid_uid", bool, bool, C2195k2.f8227a);
        f8668B0 = m10328a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, C2206l2.f8259a);
        f8670C0 = m10328a("measurement.service.refactor.package_side_screen", bool2, bool2, C2217m2.f8288a);
        f8672D0 = m10328a("measurement.config.fix_feature_flags_from_config", bool2, bool2, C2228n2.f8356a);
        f8674E0 = m10328a("measurement.service.event_config_fix", bool2, bool2, C2239o2.f8390a);
    }

    /* renamed from: a */
    static <V> C2325w2<V> m10328a(String str, V v10, V v11, InterfaceC2305u2<V> interfaceC2305u2) {
        C2325w2<V> c2325w2 = new C2325w2<>(str, v10, v11, interfaceC2305u2, null);
        f8696a.add(c2325w2);
        return c2325w2;
    }

    /* renamed from: c */
    public static Map<String, String> m10330c(Context context) {
        C1761r5 m8759b = C1761r5.m8759b(context.getContentResolver(), C1499b6.m7951a("com.google.android.gms.measurement"));
        return m8759b == null ? Collections.emptyMap() : m8759b.m8761c();
    }
}
