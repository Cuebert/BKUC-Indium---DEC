package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.C1490ae;
import com.google.android.gms.internal.measurement.C1492b;
import com.google.android.gms.internal.measurement.C1497b4;
import com.google.android.gms.internal.measurement.C1514c4;
import com.google.android.gms.internal.measurement.C1518c8;
import com.google.android.gms.internal.measurement.C1531d4;
import com.google.android.gms.internal.measurement.C1547e3;
import com.google.android.gms.internal.measurement.C1581g3;
import com.google.android.gms.internal.measurement.C1582g4;
import com.google.android.gms.internal.measurement.C1599h4;
import com.google.android.gms.internal.measurement.C1663l3;
import com.google.android.gms.internal.measurement.C1664l4;
import com.google.android.gms.internal.measurement.C1680m4;
import com.google.android.gms.internal.measurement.C1696n4;
import com.google.android.gms.internal.measurement.C1792t4;
import com.google.android.gms.internal.measurement.C1824v4;
import com.google.android.gms.internal.measurement.C1840w4;
import com.google.android.gms.internal.measurement.C1854x2;
import com.google.android.gms.internal.measurement.C1856x4;
import com.google.android.gms.internal.measurement.C1886z2;
import com.google.android.gms.internal.measurement.C1887z3;
import com.google.android.gms.internal.measurement.C1892z8;
import com.google.android.gms.internal.measurement.InterfaceC1797t9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p004a3.C0028a;
import p018b4.C1000n;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* loaded from: classes.dex */
public final class C2125d9 extends AbstractC2289s8 {
    public C2125d9(C2103b9 c2103b9) {
        super(c2103b9);
    }

    /* renamed from: D */
    public static <Builder extends InterfaceC1797t9> Builder m9824D(Builder builder, byte[] bArr) throws C1892z8 {
        C1518c8 m8002b = C1518c8.m8002b();
        if (m8002b != null) {
            return (Builder) builder.mo8849Q(bArr, m8002b);
        }
        return (Builder) builder.mo8848O(bArr);
    }

    /* renamed from: H */
    static List<C1599h4> m9825H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C1582g4 m8205A = C1599h4.m8205A();
                for (String str : bundle.keySet()) {
                    C1582g4 m8205A2 = C1599h4.m8205A();
                    m8205A2.m8191F(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        m8205A2.m8190E(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        m8205A2.m8192G((String) obj);
                    } else if (obj instanceof Double) {
                        m8205A2.m8189D(((Double) obj).doubleValue());
                    }
                    m8205A.m8195x(m8205A2);
                }
                if (m8205A.m8193v() > 0) {
                    arrayList.add(m8205A.m8466p());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public static List<Long> m9826J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* renamed from: N */
    public static boolean m9827N(List<Long> list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m9828P(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: m */
    public static final void m9829m(C1514c4 c1514c4, String str, Object obj) {
        List<C1599h4> m7992L = c1514c4.m7992L();
        int i10 = 0;
        while (true) {
            if (i10 >= m7992L.size()) {
                i10 = -1;
                break;
            } else if (str.equals(m7992L.get(i10).m8218C())) {
                break;
            } else {
                i10++;
            }
        }
        C1582g4 m8205A = C1599h4.m8205A();
        m8205A.m8191F(str);
        if (obj instanceof Long) {
            m8205A.m8190E(((Long) obj).longValue());
        } else if (obj instanceof String) {
            m8205A.m8192G((String) obj);
        } else if (obj instanceof Double) {
            m8205A.m8189D(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            m8205A.m8194w(m9825H((Bundle[]) obj));
        }
        if (i10 >= 0) {
            c1514c4.m7986F(i10, m8205A);
        } else {
            c1514c4.m7981A(m8205A);
        }
    }

    /* renamed from: n */
    public static final boolean m9830n(zzat zzatVar, zzp zzpVar) {
        C5984j.m21286j(zzatVar);
        C5984j.m21286j(zzpVar);
        return (TextUtils.isEmpty(zzpVar.f8859o) && TextUtils.isEmpty(zzpVar.f8852D)) ? false : true;
    }

    /* renamed from: o */
    public static final C1599h4 m9831o(C1531d4 c1531d4, String str) {
        for (C1599h4 c1599h4 : c1531d4.m8032E()) {
            if (c1599h4.m8218C().equals(str)) {
                return c1599h4;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static final Object m9832p(C1531d4 c1531d4, String str) {
        C1599h4 m9831o = m9831o(c1531d4, str);
        if (m9831o == null) {
            return null;
        }
        if (m9831o.m8225W()) {
            return m9831o.m8219D();
        }
        if (m9831o.m8223U()) {
            return Long.valueOf(m9831o.m8229z());
        }
        if (m9831o.m8221R()) {
            return Double.valueOf(m9831o.m8226w());
        }
        if (m9831o.m8228y() <= 0) {
            return null;
        }
        List<C1599h4> m8220E = m9831o.m8220E();
        ArrayList arrayList = new ArrayList();
        for (C1599h4 c1599h4 : m8220E) {
            if (c1599h4 != null) {
                Bundle bundle = new Bundle();
                for (C1599h4 c1599h42 : c1599h4.m8220E()) {
                    if (c1599h42.m8225W()) {
                        bundle.putString(c1599h42.m8218C(), c1599h42.m8219D());
                    } else if (c1599h42.m8223U()) {
                        bundle.putLong(c1599h42.m8218C(), c1599h42.m8229z());
                    } else if (c1599h42.m8221R()) {
                        bundle.putDouble(c1599h42.m8218C(), c1599h42.m8226w());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: q */
    private final void m9833q(StringBuilder sb2, int i10, List<C1599h4> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (C1599h4 c1599h4 : list) {
            if (c1599h4 != null) {
                m9835s(sb2, i11);
                sb2.append("param {\n");
                m9838v(sb2, i11, "name", c1599h4.m8224V() ? this.f8118a.m10105D().m9810e(c1599h4.m8218C()) : null);
                m9838v(sb2, i11, "string_value", c1599h4.m8225W() ? c1599h4.m8219D() : null);
                m9838v(sb2, i11, "int_value", c1599h4.m8223U() ? Long.valueOf(c1599h4.m8229z()) : null);
                m9838v(sb2, i11, "double_value", c1599h4.m8221R() ? Double.valueOf(c1599h4.m8226w()) : null);
                if (c1599h4.m8228y() > 0) {
                    m9833q(sb2, i11, c1599h4.m8220E());
                }
                m9835s(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: r */
    private final void m9834r(StringBuilder sb2, int i10, C1886z2 c1886z2) {
        String str;
        if (c1886z2 == null) {
            return;
        }
        m9835s(sb2, i10);
        sb2.append("filter {\n");
        if (c1886z2.m9122D()) {
            m9838v(sb2, i10, "complement", Boolean.valueOf(c1886z2.m9121C()));
        }
        if (c1886z2.m9124F()) {
            m9838v(sb2, i10, "param_name", this.f8118a.m10105D().m9810e(c1886z2.m9120A()));
        }
        if (c1886z2.m9125G()) {
            int i11 = i10 + 1;
            C1663l3 m9127z = c1886z2.m9127z();
            if (m9127z != null) {
                m9835s(sb2, i11);
                sb2.append("string_filter {\n");
                if (m9127z.m8366E()) {
                    switch (m9127z.m8367F()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m9838v(sb2, i11, "match_type", str);
                }
                if (m9127z.m8365D()) {
                    m9838v(sb2, i11, "expression", m9127z.m8369z());
                }
                if (m9127z.m8364C()) {
                    m9838v(sb2, i11, "case_sensitive", Boolean.valueOf(m9127z.m8363B()));
                }
                if (m9127z.m8368w() > 0) {
                    m9835s(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : m9127z.m8362A()) {
                        m9835s(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m9835s(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (c1886z2.m9123E()) {
            m9839w(sb2, i10 + 1, "number_filter", c1886z2.m9126y());
        }
        m9835s(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: s */
    private static final void m9835s(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* renamed from: t */
    private static final String m9836t(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* renamed from: u */
    private static final void m9837u(StringBuilder sb2, int i10, String str, C1792t4 c1792t4) {
        if (c1792t4 == null) {
            return;
        }
        m9835s(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c1792t4.m8842x() != 0) {
            m9835s(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : c1792t4.m8838G()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (c1792t4.m8844z() != 0) {
            m9835s(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : c1792t4.m8840I()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (c1792t4.m8841w() != 0) {
            m9835s(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (C1497b4 c1497b4 : c1792t4.m8837F()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c1497b4.m7948D() ? Integer.valueOf(c1497b4.m7949w()) : null);
                sb2.append(":");
                sb2.append(c1497b4.m7947C() ? Long.valueOf(c1497b4.m7950x()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (c1792t4.m8843y() != 0) {
            m9835s(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (C1824v4 c1824v4 : c1792t4.m8839H()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c1824v4.m8892E() ? Integer.valueOf(c1824v4.m8894x()) : null);
                sb2.append(": [");
                Iterator<Long> it = c1824v4.m8891B().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        m9835s(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: v */
    private static final void m9838v(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m9835s(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: w */
    private static final void m9839w(StringBuilder sb2, int i10, String str, C1547e3 c1547e3) {
        if (c1547e3 == null) {
            return;
        }
        m9835s(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (c1547e3.m8075C()) {
            int m8080H = c1547e3.m8080H();
            m9838v(sb2, i10, "comparison_type", m8080H != 1 ? m8080H != 2 ? m8080H != 3 ? m8080H != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c1547e3.m8077E()) {
            m9838v(sb2, i10, "match_as_float", Boolean.valueOf(c1547e3.m8074B()));
        }
        if (c1547e3.m8076D()) {
            m9838v(sb2, i10, "comparison_value", c1547e3.m8081y());
        }
        if (c1547e3.m8079G()) {
            m9838v(sb2, i10, "min_comparison_value", c1547e3.m8073A());
        }
        if (c1547e3.m8078F()) {
            m9838v(sb2, i10, "max_comparison_value", c1547e3.m8082z());
        }
        m9835s(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: x */
    public static int m9840x(C1680m4 c1680m4, String str) {
        for (int i10 = 0; i10 < c1680m4.m8444s0(); i10++) {
            if (str.equals(c1680m4.m8438m0(i10).m8981B())) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: A */
    public final <T extends Parcelable> T m9841A(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (C0028a.a unused) {
            this.f8118a.mo9765d().m10048r().m9893a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: B */
    public final zzat m9842B(C1492b c1492b) {
        Object obj;
        Bundle m9855z = m9855z(c1492b.m7936e(), true);
        String obj2 = (!m9855z.containsKey("_o") || (obj = m9855z.get("_o")) == null) ? "app" : obj.toString();
        String m6231b = C1000n.m6231b(c1492b.m7935d());
        if (m6231b == null) {
            m6231b = c1492b.m7935d();
        }
        return new zzat(m6231b, new zzar(m9855z), obj2, c1492b.m7932a());
    }

    /* renamed from: C */
    public final C1531d4 m9843C(C2225n c2225n) {
        C1514c4 m8019A = C1531d4.m8019A();
        m8019A.m7988H(c2225n.f8352e);
        C2247p c2247p = new C2247p(c2225n.f8353f);
        while (c2247p.hasNext()) {
            String next = c2247p.next();
            C1582g4 m8205A = C1599h4.m8205A();
            m8205A.m8191F(next);
            Object m10407C = c2225n.f8353f.m10407C(next);
            C5984j.m21286j(m10407C);
            m9849L(m8205A, m10407C);
            m8019A.m7981A(m8205A);
        }
        return m8019A.m8466p();
    }

    /* renamed from: E */
    public final String m9844E(C1664l4 c1664l4) {
        if (c1664l4 == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (C1696n4 c1696n4 : c1664l4.m8374z()) {
            if (c1696n4 != null) {
                m9835s(sb2, 1);
                sb2.append("bundle {\n");
                if (c1696n4.m8588l1()) {
                    m9838v(sb2, 1, "protocol_version", Integer.valueOf(c1696n4.m8596t1()));
                }
                m9838v(sb2, 1, "platform", c1696n4.m8566G());
                if (c1696n4.m8584h1()) {
                    m9838v(sb2, 1, "gmp_version", Long.valueOf(c1696n4.m8559C1()));
                }
                if (c1696n4.m8594r1()) {
                    m9838v(sb2, 1, "uploading_gmp_version", Long.valueOf(c1696n4.m8569H1()));
                }
                if (c1696n4.m8582f1()) {
                    m9838v(sb2, 1, "dynamite_version", Long.valueOf(c1696n4.m8555A1()));
                }
                if (c1696n4.m8611z0()) {
                    m9838v(sb2, 1, "config_version", Long.valueOf(c1696n4.m8609y1()));
                }
                m9838v(sb2, 1, "gmp_app_id", c1696n4.m8560D());
                m9838v(sb2, 1, "admob_app_id", c1696n4.m8576M1());
                m9838v(sb2, 1, "app_id", c1696n4.m8577N1());
                m9838v(sb2, 1, "app_version", c1696n4.m8604x());
                if (c1696n4.m8605x0()) {
                    m9838v(sb2, 1, "app_version_major", Integer.valueOf(c1696n4.m8579a0()));
                }
                m9838v(sb2, 1, "firebase_instance_id", c1696n4.m8556B());
                if (c1696n4.m8581e1()) {
                    m9838v(sb2, 1, "dev_cert_hash", Long.valueOf(c1696n4.m8612z1()));
                }
                m9838v(sb2, 1, "app_store", c1696n4.m8601w());
                if (c1696n4.m8593q1()) {
                    m9838v(sb2, 1, "upload_timestamp_millis", Long.valueOf(c1696n4.m8567G1()));
                }
                if (c1696n4.m8591o1()) {
                    m9838v(sb2, 1, "start_timestamp_millis", Long.valueOf(c1696n4.m8565F1()));
                }
                if (c1696n4.m8583g1()) {
                    m9838v(sb2, 1, "end_timestamp_millis", Long.valueOf(c1696n4.m8557B1()));
                }
                if (c1696n4.m8587k1()) {
                    m9838v(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1696n4.m8563E1()));
                }
                if (c1696n4.m8586j1()) {
                    m9838v(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1696n4.m8561D1()));
                }
                m9838v(sb2, 1, "app_instance_id", c1696n4.m8578O1());
                m9838v(sb2, 1, "resettable_device_id", c1696n4.m8568H());
                m9838v(sb2, 1, "ds_id", c1696n4.m8553A());
                if (c1696n4.m8585i1()) {
                    m9838v(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c1696n4.m8597u0()));
                }
                m9838v(sb2, 1, "os_version", c1696n4.m8564F());
                m9838v(sb2, 1, "device_model", c1696n4.m8610z());
                m9838v(sb2, 1, "user_default_language", c1696n4.m8570I());
                if (c1696n4.m8592p1()) {
                    m9838v(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c1696n4.m8600v1()));
                }
                if (c1696n4.m8608y0()) {
                    m9838v(sb2, 1, "bundle_sequential_index", Integer.valueOf(c1696n4.m8580b1()));
                }
                if (c1696n4.m8590n1()) {
                    m9838v(sb2, 1, "service_upload", Boolean.valueOf(c1696n4.m8599v0()));
                }
                m9838v(sb2, 1, "health_monitor", c1696n4.m8562E());
                if (!this.f8118a.m10134z().m9861B(null, C2335x2.f8725o0) && c1696n4.m8602w0() && c1696n4.m8606x1() != 0) {
                    m9838v(sb2, 1, "android_id", Long.valueOf(c1696n4.m8606x1()));
                }
                if (c1696n4.m8589m1()) {
                    m9838v(sb2, 1, "retry_counter", Integer.valueOf(c1696n4.m8598u1()));
                }
                if (c1696n4.m8554A0()) {
                    m9838v(sb2, 1, "consent_signals", c1696n4.m8607y());
                }
                List<C1856x4> m8574L = c1696n4.m8574L();
                if (m8574L != null) {
                    for (C1856x4 c1856x4 : m8574L) {
                        if (c1856x4 != null) {
                            m9835s(sb2, 2);
                            sb2.append("user_property {\n");
                            m9838v(sb2, 2, "set_timestamp_millis", c1856x4.m8985N() ? Long.valueOf(c1856x4.m8989y()) : null);
                            m9838v(sb2, 2, "name", this.f8118a.m10105D().m9811f(c1856x4.m8981B()));
                            m9838v(sb2, 2, "string_value", c1856x4.m8982C());
                            m9838v(sb2, 2, "int_value", c1856x4.m8984M() ? Long.valueOf(c1856x4.m8988x()) : null);
                            m9838v(sb2, 2, "double_value", c1856x4.m8983L() ? Double.valueOf(c1856x4.m8987w()) : null);
                            m9835s(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C1887z3> m8572J = c1696n4.m8572J();
                if (m8572J != null) {
                    for (C1887z3 c1887z3 : m8572J) {
                        if (c1887z3 != null) {
                            m9835s(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c1887z3.m9136G()) {
                                m9838v(sb2, 2, "audience_id", Integer.valueOf(c1887z3.m9139w()));
                            }
                            if (c1887z3.m9137H()) {
                                m9838v(sb2, 2, "new_audience", Boolean.valueOf(c1887z3.m9135F()));
                            }
                            m9837u(sb2, 2, "current_data", c1887z3.m9140z());
                            if (c1887z3.m9138I()) {
                                m9837u(sb2, 2, "previous_data", c1887z3.m9134A());
                            }
                            m9835s(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C1531d4> m8573K = c1696n4.m8573K();
                if (m8573K != null) {
                    for (C1531d4 c1531d4 : m8573K) {
                        if (c1531d4 != null) {
                            m9835s(sb2, 2);
                            sb2.append("event {\n");
                            m9838v(sb2, 2, "name", this.f8118a.m10105D().m9809d(c1531d4.m8031D()));
                            if (c1531d4.m8035R()) {
                                m9838v(sb2, 2, "timestamp_millis", Long.valueOf(c1531d4.m8039z()));
                            }
                            if (c1531d4.m8034P()) {
                                m9838v(sb2, 2, "previous_timestamp_millis", Long.valueOf(c1531d4.m8038y()));
                            }
                            if (c1531d4.m8033N()) {
                                m9838v(sb2, 2, "count", Integer.valueOf(c1531d4.m8036w()));
                            }
                            if (c1531d4.m8037x() != 0) {
                                m9833q(sb2, 2, c1531d4.m8032E());
                            }
                            m9835s(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m9835s(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: F */
    public final String m9845F(C1854x2 c1854x2) {
        if (c1854x2 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c1854x2.m8966K()) {
            m9838v(sb2, 0, "filter_id", Integer.valueOf(c1854x2.m8969x()));
        }
        m9838v(sb2, 0, "event_name", this.f8118a.m10105D().m9809d(c1854x2.m8960C()));
        String m9836t = m9836t(c1854x2.m8962G(), c1854x2.m8963H(), c1854x2.m8964I());
        if (!m9836t.isEmpty()) {
            m9838v(sb2, 0, "filter_type", m9836t);
        }
        if (c1854x2.m8965J()) {
            m9839w(sb2, 1, "event_count_filter", c1854x2.m8959B());
        }
        if (c1854x2.m8968w() > 0) {
            sb2.append("  filters {\n");
            Iterator<C1886z2> it = c1854x2.m8961D().iterator();
            while (it.hasNext()) {
                m9834r(sb2, 2, it.next());
            }
        }
        m9835s(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* renamed from: G */
    public final String m9846G(C1581g3 c1581g3) {
        if (c1581g3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (c1581g3.m8182F()) {
            m9838v(sb2, 0, "filter_id", Integer.valueOf(c1581g3.m8184w()));
        }
        m9838v(sb2, 0, "property_name", this.f8118a.m10105D().m9811f(c1581g3.m8178A()));
        String m9836t = m9836t(c1581g3.m8179C(), c1581g3.m8180D(), c1581g3.m8181E());
        if (!m9836t.isEmpty()) {
            m9838v(sb2, 0, "filter_type", m9836t);
        }
        m9834r(sb2, 1, c1581g3.m8185x());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* renamed from: I */
    public final List<Long> m9847I(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.f8118a.mo9765d().m10053w().m9894b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f8118a.mo9765d().m10053w().m9895c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7 >= r5) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r4.add(m9848K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r7 >= r5) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r4.add(m9848K((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r4.add(m9848K((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000d A[SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> m9848K(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.C1490ae.m7927b()
            com.google.android.gms.measurement.internal.m4 r4 = r10.f8118a
            com.google.android.gms.measurement.internal.f r4 = r4.m10134z()
            r5 = 0
            com.google.android.gms.measurement.internal.w2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2335x2.f8741w0
            boolean r4 = r4.m9861B(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m9848K(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m9848K(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m9848K(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2125d9.m9848K(android.os.Bundle, boolean):java.util.Map");
    }

    /* renamed from: L */
    public final void m9849L(C1582g4 c1582g4, Object obj) {
        C5984j.m21286j(obj);
        c1582g4.m8188C();
        c1582g4.m8186A();
        c1582g4.m8196y();
        c1582g4.m8187B();
        if (obj instanceof String) {
            c1582g4.m8192G((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1582g4.m8190E(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            c1582g4.m8189D(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            c1582g4.m8194w(m9825H((Bundle[]) obj));
        } else {
            this.f8118a.mo9765d().m10048r().m9894b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: M */
    public final void m9850M(C1840w4 c1840w4, Object obj) {
        C5984j.m21286j(obj);
        c1840w4.m8943x();
        c1840w4.m8942w();
        c1840w4.m8941v();
        if (obj instanceof String) {
            c1840w4.m8940D((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1840w4.m8937A(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c1840w4.m8944y(((Double) obj).doubleValue());
        } else {
            this.f8118a.mo9765d().m10048r().m9894b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: O */
    public final boolean m9851O(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f8118a.mo9767e().mo13781a() - j10) > j11;
    }

    /* renamed from: Q */
    public final byte[] m9852Q(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f8118a.mo9765d().m10048r().m9894b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2289s8
    /* renamed from: l */
    protected final boolean mo9853l() {
        return false;
    }

    /* renamed from: y */
    public final long m9854y(byte[] bArr) {
        C5984j.m21286j(bArr);
        this.f8118a.m10114N().mo9917h();
        MessageDigest m9939s = C2169h9.m9939s();
        if (m9939s == null) {
            this.f8118a.mo9765d().m10048r().m9893a("Failed to get MD5");
            return 0L;
        }
        return C2169h9.m9938q0(m9939s.digest(bArr));
    }

    /* renamed from: z */
    final Bundle m9855z(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                C1490ae.m7927b();
                if (this.f8118a.m10134z().m9861B(null, C2335x2.f8741w0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(m9855z((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList4.add(m9855z((Map) arrayList3.get(i11), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }
}
