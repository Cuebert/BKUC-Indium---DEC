package p193ob;

import java.io.IOException;

/* renamed from: ob.e0 */
/* loaded from: classes.dex */
public enum EnumC4173e0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: n */
    private final String f17089n;

    EnumC4173e0(String str) {
        this.f17089n = str;
    }

    /* renamed from: b */
    public static EnumC4173e0 m17359b(String str) throws IOException {
        EnumC4173e0 enumC4173e0 = HTTP_1_0;
        if (str.equals(enumC4173e0.f17089n)) {
            return enumC4173e0;
        }
        EnumC4173e0 enumC4173e02 = HTTP_1_1;
        if (str.equals(enumC4173e02.f17089n)) {
            return enumC4173e02;
        }
        EnumC4173e0 enumC4173e03 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC4173e03.f17089n)) {
            return enumC4173e03;
        }
        EnumC4173e0 enumC4173e04 = HTTP_2;
        if (str.equals(enumC4173e04.f17089n)) {
            return enumC4173e04;
        }
        EnumC4173e0 enumC4173e05 = SPDY_3;
        if (str.equals(enumC4173e05.f17089n)) {
            return enumC4173e05;
        }
        EnumC4173e0 enumC4173e06 = QUIC;
        if (str.equals(enumC4173e06.f17089n)) {
            return enumC4173e06;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17089n;
    }
}
