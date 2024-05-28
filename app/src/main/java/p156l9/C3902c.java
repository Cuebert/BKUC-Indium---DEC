package p156l9;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l9.c */
/* loaded from: classes.dex */
public class C3902c extends WebView {

    /* renamed from: n */
    protected Handler f16175n;

    /* renamed from: o */
    protected HashMap<String, C3901b> f16176o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l9.c$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f16177n;

        a(String str) {
            this.f16177n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3902c.this.evaluateJavascript(this.f16177n, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l9.c$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: l9.c$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: n */
            final /* synthetic */ String f16180n;

            a(String str) {
                this.f16180n = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3902c.this.mo15988d(this.f16180n);
            }
        }

        private b() {
        }

        @JavascriptInterface
        public void executeRoblox(String str) {
            C3902c.this.f16175n.post(new a(str));
        }

        /* synthetic */ b(C3902c c3902c, a aVar) {
            this();
        }
    }

    /* renamed from: l9.c$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC3900a {

        /* renamed from: e */
        private WeakReference<C3902c> f16182e;

        public c(WeakReference<C3902c> weakReference) {
            this.f16182e = weakReference;
        }

        @Override // p156l9.AbstractC3900a
        /* renamed from: a */
        public void mo16537a(boolean z10, JSONObject jSONObject) {
            this.f16182e.get().m16550b(m16538b(), z10, jSONObject);
        }

        @Override // p156l9.AbstractC3900a
        /* renamed from: c */
        public Context mo16539c() {
            return this.f16182e.get().getContext();
        }
    }

    public C3902c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16176o = new HashMap<>();
        mo12619c(context);
    }

    /* renamed from: a */
    public void mo15987a(String str) {
        if (this.f16175n.getLooper().getThread() == Thread.currentThread()) {
            evaluateJavascript(str, null);
        } else {
            this.f16175n.post(new a(str));
        }
    }

    /* renamed from: b */
    public void m16550b(String str, boolean z10, JSONObject jSONObject) {
        String jSONObject2 = jSONObject != null ? jSONObject.toString() : "{}";
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = z10 ? "true" : "false";
        objArr[2] = jSONObject2;
        mo15987a(String.format("if (window.Roblox.Hybrid && window.Roblox.Hybrid.Bridge.nativeCallback && typeof window.Roblox.Hybrid.Bridge.nativeCallback === \"function\") { window.Roblox.Hybrid.Bridge.nativeCallback('%s', %s, %s); }", objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12619c(Context context) {
        this.f16175n = new Handler(getContext().getMainLooper());
        mo12620f(context);
        addJavascriptInterface(new b(this, null), "__globalRobloxAndroidBridge__");
    }

    /* renamed from: d */
    protected void mo15988d(String str) {
        try {
            c cVar = new c(new WeakReference(this));
            JSONObject jSONObject = new JSONObject(str);
            cVar.m16545i(jSONObject.getString("moduleID"));
            cVar.m16544h(jSONObject.getString("functionName"));
            cVar.m16546j(jSONObject.getJSONObject("params"));
            cVar.m16543g(jSONObject.optString("callbackID"));
            C3901b c3901b = this.f16176o.get(cVar.m16541e());
            if (c3901b != null) {
                c3901b.mo16502a(cVar);
            } else {
                Log.e("rbx.hybrid", "Couldn't find module with ID: " + cVar.m16541e());
            }
        } catch (JSONException e10) {
            Log.e("rbx.hybrid", "There was an error parsing the JSON command: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m16551e(C3901b c3901b) {
        this.f16176o.put(c3901b.m16547b(), c3901b);
    }

    /* renamed from: f */
    protected void mo12620f(Context context) {
    }

    public C3902c(Context context) {
        super(context);
        this.f16176o = new HashMap<>();
        mo12619c(context);
    }
}
