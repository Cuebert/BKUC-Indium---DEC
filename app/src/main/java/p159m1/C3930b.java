package p159m1;

import android.net.Uri;
import com.appsflyer.oaid.BuildConfig;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public class C3930b {

    /* renamed from: a */
    private final String f16315a = "json";

    /* renamed from: b */
    private String f16316b;

    /* renamed from: c */
    private String f16317c;

    /* renamed from: d */
    private Uri f16318d;

    public C3930b(String str, String str2) {
        this.f16316b = str;
        this.f16317c = str2;
    }

    /* renamed from: a */
    private Uri m16670a() {
        return this.f16318d;
    }

    /* renamed from: b */
    private String m16671b() {
        return this.f16316b;
    }

    /* renamed from: d */
    private Uri m16672d() {
        String m16671b = m16671b();
        return Uri.parse(String.format("%s%spost?format=%s&token=%s", m16671b, m16671b.endsWith("/") ? BuildConfig.FLAVOR : "/", "json", m16674e()));
    }

    /* renamed from: c */
    public Uri m16673c() {
        String replace;
        String uri = m16675f().toString();
        if (uri.contains("format=json")) {
            replace = uri.replace("format=json", "format=minidump");
        } else {
            if (!uri.contains("/json")) {
                return null;
            }
            replace = uri.replace("/json", "/minidump");
        }
        return Uri.parse(replace);
    }

    /* renamed from: e */
    public String m16674e() {
        String str = this.f16317c;
        if (str != null) {
            return str;
        }
        String uri = m16675f().toString();
        if (uri.contains("submit.backtrace.io")) {
            return uri.substring((uri.lastIndexOf("/") - 64) + 1, uri.lastIndexOf("/"));
        }
        return uri.substring(uri.indexOf("token=") + 6, ((uri.indexOf("token=") + 6) + 64) - 1);
    }

    /* renamed from: f */
    public Uri m16675f() {
        Uri m16670a = m16670a();
        return m16670a != null ? m16670a : m16672d();
    }

    /* renamed from: g */
    public String m16676g() {
        String uri = m16675f().toString();
        if (uri.startsWith("https://submit.backtrace.io/")) {
            int indexOf = uri.indexOf(47, 28);
            if (indexOf != -1) {
                return uri.substring(28, indexOf);
            }
            throw new IllegalArgumentException("Invalid Backtrace URL");
        }
        if (uri.indexOf("backtrace.io") != -1) {
            Uri parse = Uri.parse(uri);
            return parse.getHost().substring(0, parse.getHost().indexOf("."));
        }
        throw new IllegalArgumentException("Invalid Backtrace URL");
    }
}
