package p100h7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.roblox.client.C2877p0;
import com.roblox.client.RobloxApplication;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p035c9.C1151k;
import p191o9.C4159g;
import p191o9.C4161i;
import p193ob.C4190o;
import p193ob.C4201z;
import p299x6.C5558d;
import p312y6.C5898a;

/* renamed from: h7.r */
/* loaded from: classes.dex */
public class C3425r extends C4161i {

    /* renamed from: c */
    private SharedPreferences f14306c;

    /* renamed from: d */
    private final Executor f14307d;

    /* renamed from: e */
    private AtomicBoolean f14308e;

    /* renamed from: f */
    private AtomicBoolean f14309f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h7.r$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n */
        final /* synthetic */ String f14310n;

        /* renamed from: o */
        final /* synthetic */ String f14311o;

        a(String str, String str2) {
            this.f14310n = str;
            this.f14311o = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5898a.a m20985b = C5898a.m20985b(this.f14310n);
            if (m20985b != null) {
                C3425r.this.f14306c.edit().putString(this.f14311o, m20985b.m20988a()).apply();
                C3425r.this.f14306c.edit().putString(this.f14311o + "-2", m20985b.m20989b()).commit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3425r(CookiePolicy cookiePolicy) {
        super(cookiePolicy);
        this.f14307d = Executors.newSingleThreadExecutor();
        this.f14308e = new AtomicBoolean(true);
        this.f14309f = new AtomicBoolean(false);
        Context m12215a = RobloxApplication.m12215a();
        if (m12215a != null) {
            this.f14306c = m12215a.getSharedPreferences("webView_backup", 0);
        }
    }

    /* renamed from: l */
    private void m15039l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("auth." + C2877p0.m12872K())) {
            m15044q(C2877p0.m12872K(), str2);
        }
    }

    /* renamed from: m */
    private boolean m15040m() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: n */
    private String m15041n(String str) {
        URL url;
        SharedPreferences sharedPreferences;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
        }
        if (TextUtils.isEmpty(url.getHost()) || !url.getHost().endsWith(C2877p0.m12872K()) || (sharedPreferences = this.f14306c) == null) {
            return null;
        }
        String string = sharedPreferences.getString(C2877p0.m12872K(), null);
        String string2 = this.f14306c.getString(C2877p0.m12872K() + "-2", null);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            return C5898a.m20984a(string, string2);
        }
        return null;
    }

    /* renamed from: o */
    private boolean m15042o() {
        SharedPreferences sharedPreferences = this.f14306c;
        return (sharedPreferences == null || sharedPreferences.getString(C2877p0.m12872K(), null) == null) ? false : true;
    }

    /* renamed from: p */
    public static String m15043p(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.equals("auth." + C2877p0.m12872K()) || !str2.startsWith(".ROBLOSECURITY")) {
            return str;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (String str3 : str2.split(";")) {
            String trim = str3.trim();
            if (!z10 && trim.startsWith("domain")) {
                String[] split = trim.split("=");
                if (split.length == 2 && split[1].equals(C2877p0.m12872K())) {
                    z10 = true;
                }
            }
            if (z11 || !trim.equals("secure")) {
                if (z10 && z11) {
                    break;
                }
            } else {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return str;
        }
        return "https://" + str;
    }

    /* renamed from: q */
    private void m15044q(String str, String str2) {
        if (!m15040m() || this.f14306c == null) {
            return;
        }
        this.f14307d.execute(new a(str2, str));
    }

    @Override // p191o9.C4161i, p193ob.InterfaceC4191p
    /* renamed from: a */
    public void mo15045a(C4201z c4201z, List<C4190o> list) {
        super.mo15045a(c4201z, list);
        C4159g.m17244h().m17247k(c4201z.m17586E().toString());
    }

    @Override // p191o9.C4161i
    /* renamed from: d */
    public String mo15046d(String str) {
        String mo15046d = super.mo15046d(str);
        if (this.f14308e.getAndSet(false) && ((mo15046d == null || C5558d.m20351a(mo15046d)) && m15042o())) {
            C1151k.m6707a("ShellCookieHandler", "Cookie is invalid at first check.");
            this.f14309f.set(true);
        }
        if (m15040m() && this.f14309f.get()) {
            URL url = null;
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
            }
            if (url != null) {
                C1151k.m6707a("ShellCookieHandler", "no cookie for " + url.getHost());
                String m15041n = m15041n(str);
                if (!TextUtils.isEmpty(url.getHost()) && !TextUtils.isEmpty(m15041n) && ((mo15046d == null || !mo15046d.contains(".ROBLOSECURITY")) && m15041n.contains(".ROBLOSECURITY"))) {
                    C1151k.m6707a("ShellCookieHandler", "Use back up.");
                    super.mo15047h(C2877p0.m12872K(), m15041n);
                    return m15041n;
                }
                C1151k.m6707a("ShellCookieHandler", "No backup found.");
            }
        }
        return mo15046d;
    }

    @Override // p191o9.C4161i
    /* renamed from: h */
    public void mo15047h(String str, String str2) {
        m15039l(str, str2);
        super.mo15047h(m15043p(str, str2), str2);
    }

    @Override // p191o9.C4161i
    /* renamed from: i */
    public void mo15048i(String str, String str2, ValueCallback<Boolean> valueCallback) {
        super.mo15048i(m15043p(str, str2), str2, valueCallback);
    }

    /* renamed from: k */
    public void m15049k() {
        String mo15046d = super.mo15046d(C2877p0.m12872K());
        if (mo15046d == null || !mo15046d.contains(".ROBLOSECURITY")) {
            return;
        }
        String[] split = mo15046d.split(";");
        if (split.length == 0) {
            return;
        }
        String str = null;
        int length = split.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String str2 = split[i10];
            if (str2.contains(".ROBLOSECURITY")) {
                str = str2;
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        m15044q(C2877p0.m12872K(), String.format("%s; domain=%s; path=/", str, C2877p0.m12872K()));
    }
}
