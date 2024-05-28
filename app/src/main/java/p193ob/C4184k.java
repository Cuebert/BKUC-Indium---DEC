package p193ob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: ob.k */
/* loaded from: classes.dex */
public final class C4184k {

    /* renamed from: a */
    final String f17303a;

    /* renamed from: b */
    static final Comparator<String> f17236b = new Comparator() { // from class: ob.j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m17468f;
            m17468f = C4184k.m17468f((String) obj, (String) obj2);
            return m17468f;
        }
    };

    /* renamed from: c */
    private static final Map<String, C4184k> f17239c = new LinkedHashMap();

    /* renamed from: d */
    public static final C4184k f17242d = m17467d("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: e */
    public static final C4184k f17245e = m17467d("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: f */
    public static final C4184k f17248f = m17467d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: g */
    public static final C4184k f17251g = m17467d("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: h */
    public static final C4184k f17254h = m17467d("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: i */
    public static final C4184k f17257i = m17467d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: j */
    public static final C4184k f17260j = m17467d("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: k */
    public static final C4184k f17263k = m17467d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: l */
    public static final C4184k f17266l = m17467d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: m */
    public static final C4184k f17269m = m17467d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: n */
    public static final C4184k f17272n = m17467d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: o */
    public static final C4184k f17275o = m17467d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: p */
    public static final C4184k f17278p = m17467d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: q */
    public static final C4184k f17281q = m17467d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: r */
    public static final C4184k f17284r = m17467d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: s */
    public static final C4184k f17287s = m17467d("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: t */
    public static final C4184k f17289t = m17467d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: u */
    public static final C4184k f17291u = m17467d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: v */
    public static final C4184k f17293v = m17467d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: w */
    public static final C4184k f17295w = m17467d("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: x */
    public static final C4184k f17297x = m17467d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: y */
    public static final C4184k f17299y = m17467d("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: z */
    public static final C4184k f17301z = m17467d("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: A */
    public static final C4184k f17182A = m17467d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* renamed from: B */
    public static final C4184k f17184B = m17467d("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* renamed from: C */
    public static final C4184k f17186C = m17467d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* renamed from: D */
    public static final C4184k f17188D = m17467d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* renamed from: E */
    public static final C4184k f17190E = m17467d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* renamed from: F */
    public static final C4184k f17192F = m17467d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* renamed from: G */
    public static final C4184k f17194G = m17467d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: H */
    public static final C4184k f17196H = m17467d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* renamed from: I */
    public static final C4184k f17198I = m17467d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* renamed from: J */
    public static final C4184k f17200J = m17467d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* renamed from: K */
    public static final C4184k f17202K = m17467d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: L */
    public static final C4184k f17204L = m17467d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* renamed from: M */
    public static final C4184k f17206M = m17467d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* renamed from: N */
    public static final C4184k f17208N = m17467d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* renamed from: O */
    public static final C4184k f17210O = m17467d("TLS_RSA_WITH_NULL_SHA256", 59);

    /* renamed from: P */
    public static final C4184k f17212P = m17467d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* renamed from: Q */
    public static final C4184k f17214Q = m17467d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* renamed from: R */
    public static final C4184k f17216R = m17467d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* renamed from: S */
    public static final C4184k f17218S = m17467d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* renamed from: T */
    public static final C4184k f17220T = m17467d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* renamed from: U */
    public static final C4184k f17222U = m17467d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* renamed from: V */
    public static final C4184k f17224V = m17467d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* renamed from: W */
    public static final C4184k f17226W = m17467d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* renamed from: X */
    public static final C4184k f17228X = m17467d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* renamed from: Y */
    public static final C4184k f17230Y = m17467d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* renamed from: Z */
    public static final C4184k f17232Z = m17467d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: a0 */
    public static final C4184k f17234a0 = m17467d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: b0 */
    public static final C4184k f17237b0 = m17467d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: c0 */
    public static final C4184k f17240c0 = m17467d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: d0 */
    public static final C4184k f17243d0 = m17467d("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: e0 */
    public static final C4184k f17246e0 = m17467d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: f0 */
    public static final C4184k f17249f0 = m17467d("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: g0 */
    public static final C4184k f17252g0 = m17467d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: h0 */
    public static final C4184k f17255h0 = m17467d("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: i0 */
    public static final C4184k f17258i0 = m17467d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: j0 */
    public static final C4184k f17261j0 = m17467d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: k0 */
    public static final C4184k f17264k0 = m17467d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: l0 */
    public static final C4184k f17267l0 = m17467d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: m0 */
    public static final C4184k f17270m0 = m17467d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: n0 */
    public static final C4184k f17273n0 = m17467d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: o0 */
    public static final C4184k f17276o0 = m17467d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: p0 */
    public static final C4184k f17279p0 = m17467d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: q0 */
    public static final C4184k f17282q0 = m17467d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: r0 */
    public static final C4184k f17285r0 = m17467d("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: s0 */
    public static final C4184k f17288s0 = m17467d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t0 */
    public static final C4184k f17290t0 = m17467d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u0 */
    public static final C4184k f17292u0 = m17467d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v0 */
    public static final C4184k f17294v0 = m17467d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w0 */
    public static final C4184k f17296w0 = m17467d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x0 */
    public static final C4184k f17298x0 = m17467d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y0 */
    public static final C4184k f17300y0 = m17467d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z0 */
    public static final C4184k f17302z0 = m17467d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: A0 */
    public static final C4184k f17183A0 = m17467d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* renamed from: B0 */
    public static final C4184k f17185B0 = m17467d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* renamed from: C0 */
    public static final C4184k f17187C0 = m17467d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* renamed from: D0 */
    public static final C4184k f17189D0 = m17467d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* renamed from: E0 */
    public static final C4184k f17191E0 = m17467d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* renamed from: F0 */
    public static final C4184k f17193F0 = m17467d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* renamed from: G0 */
    public static final C4184k f17195G0 = m17467d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* renamed from: H0 */
    public static final C4184k f17197H0 = m17467d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* renamed from: I0 */
    public static final C4184k f17199I0 = m17467d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* renamed from: J0 */
    public static final C4184k f17201J0 = m17467d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* renamed from: K0 */
    public static final C4184k f17203K0 = m17467d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: L0 */
    public static final C4184k f17205L0 = m17467d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: M0 */
    public static final C4184k f17207M0 = m17467d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* renamed from: N0 */
    public static final C4184k f17209N0 = m17467d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* renamed from: O0 */
    public static final C4184k f17211O0 = m17467d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* renamed from: P0 */
    public static final C4184k f17213P0 = m17467d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* renamed from: Q0 */
    public static final C4184k f17215Q0 = m17467d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* renamed from: R0 */
    public static final C4184k f17217R0 = m17467d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* renamed from: S0 */
    public static final C4184k f17219S0 = m17467d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* renamed from: T0 */
    public static final C4184k f17221T0 = m17467d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* renamed from: U0 */
    public static final C4184k f17223U0 = m17467d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* renamed from: V0 */
    public static final C4184k f17225V0 = m17467d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* renamed from: W0 */
    public static final C4184k f17227W0 = m17467d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* renamed from: X0 */
    public static final C4184k f17229X0 = m17467d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* renamed from: Y0 */
    public static final C4184k f17231Y0 = m17467d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* renamed from: Z0 */
    public static final C4184k f17233Z0 = m17467d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a1 */
    public static final C4184k f17235a1 = m17467d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b1 */
    public static final C4184k f17238b1 = m17467d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c1 */
    public static final C4184k f17241c1 = m17467d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d1 */
    public static final C4184k f17244d1 = m17467d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e1 */
    public static final C4184k f17247e1 = m17467d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f1 */
    public static final C4184k f17250f1 = m17467d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g1 */
    public static final C4184k f17253g1 = m17467d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h1 */
    public static final C4184k f17256h1 = m17467d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i1 */
    public static final C4184k f17259i1 = m17467d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j1 */
    public static final C4184k f17262j1 = m17467d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k1 */
    public static final C4184k f17265k1 = m17467d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l1 */
    public static final C4184k f17268l1 = m17467d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m1 */
    public static final C4184k f17271m1 = m17467d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n1 */
    public static final C4184k f17274n1 = m17467d("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o1 */
    public static final C4184k f17277o1 = m17467d("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p1 */
    public static final C4184k f17280p1 = m17467d("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q1 */
    public static final C4184k f17283q1 = m17467d("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r1 */
    public static final C4184k f17286r1 = m17467d("TLS_AES_128_CCM_8_SHA256", 4869);

    private C4184k(String str) {
        Objects.requireNonNull(str);
        this.f17303a = str;
    }

    /* renamed from: b */
    public static synchronized C4184k m17465b(String str) {
        C4184k c4184k;
        synchronized (C4184k.class) {
            Map<String, C4184k> map = f17239c;
            c4184k = map.get(str);
            if (c4184k == null) {
                c4184k = map.get(m17469g(str));
                if (c4184k == null) {
                    c4184k = new C4184k(str);
                }
                map.put(str, c4184k);
            }
        }
        return c4184k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static List<C4184k> m17466c(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m17465b(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: d */
    private static C4184k m17467d(String str, int i10) {
        C4184k c4184k = new C4184k(str);
        f17239c.put(str, c4184k);
        return c4184k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ int m17468f(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i10 = 4; i10 < min; i10++) {
            char charAt = str.charAt(i10);
            char charAt2 = str2.charAt(i10);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: g */
    private static String m17469g(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    /* renamed from: e */
    public String m17470e() {
        return this.f17303a;
    }

    public String toString() {
        return this.f17303a;
    }
}
