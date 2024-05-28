package p191o9;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p035c9.C1151k;
import p193ob.C4190o;
import p193ob.C4201z;
import p193ob.InterfaceC4191p;

/* renamed from: o9.i */
/* loaded from: classes.dex */
public class C4161i extends CookieManager implements InterfaceC4191p {

    /* renamed from: b */
    private android.webkit.CookieManager f16944b;

    public C4161i(CookiePolicy cookiePolicy) {
        super(null, cookiePolicy);
        this.f16944b = android.webkit.CookieManager.getInstance();
    }

    /* renamed from: e */
    public static C4161i m17249e() {
        return C4162j.m17253a().mo15050a();
    }

    /* renamed from: f */
    public /* synthetic */ void m17250f(String str, ValueCallback valueCallback, Boolean bool) {
        if (bool.booleanValue()) {
            this.f16944b.flush();
            C1151k.m6712f("rbx.platform", "Flushed WebViewCookieHandler with Cookies from URL " + str);
        } else {
            C1151k.m6709c("rbx.platform", "Failed to Flush WebViewCookieHandler with Cookies from URL " + str);
        }
        valueCallback.onReceiveValue(bool);
    }

    /* renamed from: a */
    public void mo15045a(C4201z c4201z, List<C4190o> list) {
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.saveFromResponse() " + list.toString());
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<C4190o> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        hashMap.put("Set-Cookie", arrayList);
        put(c4201z.m17586E(), hashMap);
    }

    @Override // p193ob.InterfaceC4191p
    /* renamed from: b */
    public List<C4190o> mo17251b(C4201z c4201z) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<String>> it = get(c4201z.m17586E(), new HashMap()).values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().split(";")) {
                    C4190o m17495e = C4190o.m17495e(c4201z, str);
                    if (m17495e != null) {
                        arrayList.add(m17495e);
                    }
                }
            }
        }
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.loadForRequest() " + arrayList.toString());
        return arrayList;
    }

    /* renamed from: d */
    public String mo15046d(String str) {
        return this.f16944b.getCookie(str);
    }

    /* renamed from: g */
    public void m17252g(String str, String str2) {
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.removeSecurityCookie() url:" + str2 + " domain:" + str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(".ROBLOSECURITY=;expires=Wed, 10 May 2000 23:59:59 GMT;path=/;domain=");
        sb2.append(str);
        mo15047h(str2, sb2.toString());
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return null;
        }
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.get() " + map.toString());
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        String mo15046d = mo15046d(uri2);
        if (!TextUtils.isEmpty(mo15046d)) {
            hashMap.put("Cookie", Collections.singletonList(mo15046d));
        }
        return hashMap;
    }

    /* renamed from: h */
    public void mo15047h(String str, String str2) {
        this.f16944b.setCookie(str, str2);
    }

    /* renamed from: i */
    public void mo15048i(String str, String str2, ValueCallback<Boolean> valueCallback) {
        this.f16944b.setCookie(str, str2, new ValueCallback() { // from class: o9.h

            /* renamed from: b */
            public final /* synthetic */ String f16942b;

            /* renamed from: c */
            public final /* synthetic */ ValueCallback f16943c;

            public /* synthetic */ C4160h(String str3, ValueCallback valueCallback2) {
                r2 = str3;
                r3 = valueCallback2;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C4161i.this.m17250f(r2, r3, (Boolean) obj);
            }
        });
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return;
        }
        C1151k.m6707a("rbx.platform", "WebViewCookieHandler.put() " + map.toString());
        String host = uri.getHost();
        for (String str : map.keySet()) {
            if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                Iterator<String> it = map.get(str).iterator();
                while (it.hasNext()) {
                    mo15047h(host, it.next());
                }
            }
        }
    }
}
