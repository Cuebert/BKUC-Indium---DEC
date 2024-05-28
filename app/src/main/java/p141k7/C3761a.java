package p141k7;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import java.util.Iterator;
import java.util.Vector;
import p035c9.C1151k;

/* renamed from: k7.a */
/* loaded from: classes.dex */
public class C3761a extends RBHybridWebView {

    /* renamed from: q */
    private final String f15771q;

    /* renamed from: r */
    private Vector<String> f15772r;

    /* renamed from: s */
    private boolean f15773s;

    /* renamed from: t */
    private Connection f15774t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k7.a$a */
    /* loaded from: classes.dex */
    public class a implements Callback {

        /* renamed from: k7.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC6052a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ String f15776n;

            RunnableC6052a(String str) {
                this.f15776n = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3761a.this.mo15987a(this.f15776n);
            }
        }

        a() {
        }

        public void onItemSet(String str) {
            C1151k.m6707a("rbx.browserservice", "BrowserService.ExecuteJavaScript : " + str);
            C3761a.this.m15985n(new RunnableC6052a(str));
        }
    }

    /* renamed from: k7.a$b */
    /* loaded from: classes.dex */
    private class b extends WebViewClient {

        /* renamed from: a */
        private WebViewClient f15778a;

        b(WebViewClient webViewClient) {
            this.f15778a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C3761a.this.f15773s = true;
            WebViewClient webViewClient = this.f15778a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            C3761a.this.m15984m();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C3761a.this.f15773s = false;
            WebViewClient webViewClient = this.f15778a;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }
    }

    public C3761a(Context context) {
        super(context);
        this.f15771q = "rbx.browserservice";
        this.f15772r = null;
        this.f15773s = false;
    }

    /* renamed from: l */
    private void m15983l() {
        this.f15774t = MemStorage.bind("BrowserService.ExecuteJavaScript", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m15984m() {
        Vector<String> vector = this.f15772r;
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                super.mo15987a(it.next());
            }
            this.f15772r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m15985n(Runnable runnable) {
        this.f16175n.post(runnable);
    }

    /* renamed from: o */
    private void m15986o() {
        Connection connection = this.f15774t;
        if (connection != null) {
            connection.disconnect();
        }
    }

    @Override // p156l9.C3902c
    /* renamed from: a */
    public void mo15987a(String str) {
        if (this.f15773s) {
            super.mo15987a(str);
            return;
        }
        if (this.f15772r == null) {
            this.f15772r = new Vector<>();
        }
        this.f15772r.add(str);
    }

    @Override // p156l9.C3902c
    /* renamed from: d */
    protected void mo15988d(String str) {
        MemStorage.fire("BrowserService.JavaScriptCallback", str);
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, p156l9.C3902c
    /* renamed from: f */
    protected void mo12620f(Context context) {
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    /* renamed from: g */
    public void mo12621g() {
        C1151k.m6707a("rbx.browserservice", "create -> bindBrowserService");
        m15983l();
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    /* renamed from: h */
    public void mo12622h() {
        C1151k.m6707a("rbx.browserservice", "destroy -> unbindBrowserService");
        m15986o();
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new b(webViewClient));
    }
}
