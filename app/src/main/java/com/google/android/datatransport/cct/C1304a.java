package com.google.android.datatransport.cct;

import com.appsflyer.oaid.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p003a2.InterfaceC0012g;
import p307y1.C5593b;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C1304a implements InterfaceC0012g {

    /* renamed from: c */
    static final String f5913c;

    /* renamed from: d */
    static final String f5914d;

    /* renamed from: e */
    private static final String f5915e;

    /* renamed from: f */
    private static final Set<C5593b> f5916f;

    /* renamed from: g */
    public static final C1304a f5917g;

    /* renamed from: h */
    public static final C1304a f5918h;

    /* renamed from: a */
    private final String f5919a;

    /* renamed from: b */
    private final String f5920b;

    static {
        String m7210a = C1308e.m7210a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5913c = m7210a;
        String m7210a2 = C1308e.m7210a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f5914d = m7210a2;
        String m7210a3 = C1308e.m7210a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5915e = m7210a3;
        f5916f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C5593b.m20616b("proto"), C5593b.m20616b("json"))));
        f5917g = new C1304a(m7210a, null);
        f5918h = new C1304a(m7210a2, m7210a3);
    }

    public C1304a(String str, String str2) {
        this.f5919a = str;
        this.f5920b = str2;
    }

    /* renamed from: d */
    public static C1304a m7191d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1304a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p003a2.InterfaceC0012g
    /* renamed from: a */
    public Set<C5593b> mo127a() {
        return f5916f;
    }

    @Override // p003a2.InterfaceC0011f
    /* renamed from: b */
    public String mo126b() {
        return "cct";
    }

    /* renamed from: c */
    public byte[] m7192c() {
        String str = this.f5920b;
        if (str == null && this.f5919a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f5919a;
        objArr[2] = "\\";
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String m7193e() {
        return this.f5920b;
    }

    /* renamed from: f */
    public String m7194f() {
        return this.f5919a;
    }

    @Override // p003a2.InterfaceC0011f
    public byte[] getExtras() {
        return m7192c();
    }
}
