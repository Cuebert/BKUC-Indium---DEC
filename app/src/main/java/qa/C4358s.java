package qa;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import qa.InterfaceC4349j;

/* renamed from: qa.s */
/* loaded from: classes.dex */
public class C4358s implements InterfaceC4349j {

    /* renamed from: a */
    private final OkHttpClient f17734a;

    public C4358s(Context context) {
        this(C4346g0.m17935f(context));
    }

    /* renamed from: b */
    private static OkHttpClient m18001b() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        okHttpClient.setWriteTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    @Override // qa.InterfaceC4349j
    /* renamed from: a */
    public InterfaceC4349j.a mo17925a(Uri uri, int i10) throws IOException {
        CacheControl cacheControl;
        if (i10 == 0) {
            cacheControl = null;
        } else if (EnumC4356q.m17995b(i10)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!EnumC4356q.m17996c(i10)) {
                builder.noCache();
            }
            if (!EnumC4356q.m17997d(i10)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f17734a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z10 = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new InterfaceC4349j.a(body.byteStream(), z10, body.contentLength());
        }
        execute.body().close();
        throw new InterfaceC4349j.b(code + " " + execute.message(), i10, code);
    }

    public C4358s(File file) {
        this(file, C4346g0.m17930a(file));
    }

    public C4358s(File file, long j10) {
        this(m18001b());
        try {
            this.f17734a.setCache(new Cache(file, j10));
        } catch (IOException unused) {
        }
    }

    public C4358s(OkHttpClient okHttpClient) {
        this.f17734a = okHttpClient;
    }
}
