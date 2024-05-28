package p035c9;

import com.appsflyer.oaid.BuildConfig;
import java.util.regex.Pattern;

/* renamed from: c9.d */
/* loaded from: classes.dex */
public class C1144d {

    /* renamed from: a */
    private String f5490a;

    /* renamed from: b */
    private String f5491b;

    /* renamed from: c */
    private String f5492c;

    /* renamed from: d */
    private String f5493d;

    public C1144d(String str) {
        C1151k.m6712f("rbx.baseurl", "Incoming base url: " + str);
        String m6686f = m6686f(m6685e(str));
        if (m6686f.startsWith("www.")) {
            this.f5490a = m6686f;
            this.f5492c = m6686f.substring(4);
        } else {
            this.f5490a = "www." + m6686f;
            this.f5492c = m6686f;
        }
        this.f5491b = this.f5490a + "/";
        this.f5493d = this.f5492c + "/";
    }

    /* renamed from: e */
    private String m6685e(String str) {
        return Pattern.compile("^http:/*|^https:/*", 2).matcher(str).replaceFirst(BuildConfig.FLAVOR);
    }

    /* renamed from: f */
    private String m6686f(String str) {
        return str.replaceAll("/+$", BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public String m6687a() {
        return this.f5492c;
    }

    /* renamed from: b */
    public String m6688b() {
        return this.f5493d;
    }

    /* renamed from: c */
    public String m6689c() {
        return this.f5490a;
    }

    /* renamed from: d */
    public String m6690d() {
        return this.f5491b;
    }

    public String toString() {
        return "BaseUrl{url='" + this.f5490a + "'}";
    }
}
