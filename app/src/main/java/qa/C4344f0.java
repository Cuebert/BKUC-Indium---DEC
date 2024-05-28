package qa;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import qa.InterfaceC4349j;

/* renamed from: qa.f0 */
/* loaded from: classes.dex */
public class C4344f0 implements InterfaceC4349j {

    /* renamed from: b */
    static volatile Object f17667b;

    /* renamed from: c */
    private static final Object f17668c = new Object();

    /* renamed from: d */
    private static final ThreadLocal<StringBuilder> f17669d = new a();

    /* renamed from: a */
    private final Context f17670a;

    /* renamed from: qa.f0$a */
    /* loaded from: classes.dex */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: qa.f0$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static Object m17928a(Context context) throws IOException {
            File m17935f = C4346g0.m17935f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(m17935f, C4346g0.m17930a(m17935f)) : installed;
        }
    }

    public C4344f0(Context context) {
        this.f17670a = context.getApplicationContext();
    }

    /* renamed from: b */
    private static void m17924b(Context context) {
        if (f17667b == null) {
            try {
                synchronized (f17668c) {
                    if (f17667b == null) {
                        f17667b = b.m17928a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // qa.InterfaceC4349j
    /* renamed from: a */
    public InterfaceC4349j.a mo17925a(Uri uri, int i10) throws IOException {
        String sb2;
        m17924b(this.f17670a);
        HttpURLConnection m17926c = m17926c(uri);
        m17926c.setUseCaches(true);
        if (i10 != 0) {
            if (EnumC4356q.m17995b(i10)) {
                sb2 = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb3 = f17669d.get();
                sb3.setLength(0);
                if (!EnumC4356q.m17996c(i10)) {
                    sb3.append("no-cache");
                }
                if (!EnumC4356q.m17997d(i10)) {
                    if (sb3.length() > 0) {
                        sb3.append(',');
                    }
                    sb3.append("no-store");
                }
                sb2 = sb3.toString();
            }
            m17926c.setRequestProperty("Cache-Control", sb2);
        }
        int responseCode = m17926c.getResponseCode();
        if (responseCode < 300) {
            return new InterfaceC4349j.a(m17926c.getInputStream(), C4346g0.m17952w(m17926c.getHeaderField("X-Android-Response-Source")), m17926c.getHeaderFieldInt("Content-Length", -1));
        }
        m17926c.disconnect();
        throw new InterfaceC4349j.b(responseCode + " " + m17926c.getResponseMessage(), i10, responseCode);
    }

    /* renamed from: c */
    protected HttpURLConnection m17926c(Uri uri) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
