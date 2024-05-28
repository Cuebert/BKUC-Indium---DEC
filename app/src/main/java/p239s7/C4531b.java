package p239s7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p035c9.C1151k;
import p239s7.InterfaceC4532c;

/* renamed from: s7.b */
/* loaded from: classes.dex */
public class C4531b {

    /* renamed from: j */
    private static C4531b f18277j;

    /* renamed from: f */
    private b f18283f;

    /* renamed from: g */
    private InterfaceC4532c f18284g;

    /* renamed from: h */
    private Connection f18285h;

    /* renamed from: a */
    private C4535f f18278a = null;

    /* renamed from: b */
    private C4535f f18279b = null;

    /* renamed from: c */
    private Locale f18280c = null;

    /* renamed from: d */
    private C4535f f18281d = null;

    /* renamed from: e */
    private String f18282e = null;

    /* renamed from: i */
    private InterfaceC4532c.a f18286i = new a();

    /* renamed from: s7.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC4532c.a {
        a() {
        }

        @Override // p239s7.InterfaceC4532c.a
        /* renamed from: a */
        public InterfaceC4532c mo18571a(Context context) {
            return new C4533d(context);
        }
    }

    /* renamed from: s7.b$b */
    /* loaded from: classes.dex */
    public enum b {
        LOCALE_MODE_LOGIN_SIGN_UP,
        LOCALE_MODE_GENERAL_EXPERIENCE
    }

    C4531b() {
    }

    /* renamed from: b */
    public static Locale m18548b(String str) {
        if (str.contains("_")) {
            String[] split = str.split("_");
            return new Locale(split[0], split[1]);
        }
        return new Locale(str);
    }

    /* renamed from: c */
    private C4535f m18549c() {
        Locale m18557e = m18557e();
        if (m18557e != null) {
            String country = m18557e.getCountry();
            String language = m18557e.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                if (!TextUtils.isEmpty(country)) {
                    language = language + "_" + country;
                }
                C4535f m18583a = C4535f.m18583a(language);
                return m18583a != null ? m18583a : C4535f.f18293d;
            }
        }
        return C4535f.f18293d;
    }

    /* renamed from: f */
    public static C4531b m18550f() {
        if (f18277j == null) {
            synchronized (C4531b.class) {
                if (f18277j == null) {
                    f18277j = new C4531b();
                }
            }
        }
        return f18277j;
    }

    /* renamed from: h */
    private InterfaceC4532c m18551h(Context context) {
        if (this.f18284g == null) {
            this.f18284g = this.f18286i.mo18571a(context);
        }
        return this.f18284g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m18552l(Context context, JSONObject jSONObject) {
        C4535f m18584b;
        try {
            String string = jSONObject.getString("localeId");
            if (string == null || string.isEmpty() || (m18584b = C4535f.m18584b(string)) == null || m18550f().m18561k(m18584b)) {
                return;
            }
            C1151k.m6712f("rbx.locale", "Receive new locale value from LUA " + m18584b.m18586d() + " " + m18584b.m18585c());
            m18564o(m18584b, context);
            m18567r(m18584b);
            m18569t(context, string);
            m18563n(m18584b, context);
        } catch (JSONException unused) {
            C1151k.m6709c("MessageBus", "Failed to get QR code image userId");
        }
    }

    @TargetApi(24)
    /* renamed from: v */
    private Context m18553v(Context context, String str, Resources resources, Configuration configuration) {
        Locale m18548b = m18548b(str);
        Locale.setDefault(m18548b);
        configuration.setLocale(m18548b);
        configuration.setLayoutDirection(m18548b);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: w */
    private Context m18554w(Context context, C4535f c4535f) {
        this.f18278a = c4535f;
        String m18585c = c4535f.m18585c();
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT >= 24) {
            return m18553v(context, m18585c, resources, resources.getConfiguration());
        }
        return m18555x(context, m18585c, resources, resources.getConfiguration());
    }

    /* renamed from: x */
    private Context m18555x(Context context, String str, Resources resources, Configuration configuration) {
        Locale m18548b = m18548b(str);
        Locale.setDefault(m18548b);
        configuration.locale = m18548b;
        configuration.setLayoutDirection(m18548b);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }

    /* renamed from: d */
    public C4535f m18556d(Context context) {
        C4535f c4535f = this.f18279b;
        if (c4535f != null) {
            return c4535f;
        }
        C4535f mo18572a = m18551h(context).mo18572a();
        return mo18572a == null ? m18549c() : mo18572a;
    }

    /* renamed from: e */
    public Locale m18557e() {
        return this.f18280c;
    }

    /* renamed from: g */
    public b m18558g() {
        return this.f18283f;
    }

    /* renamed from: i */
    public String m18559i(Context context) {
        String str = this.f18282e;
        if (str == null && context != null) {
            C1151k.m6714h("rbx.locale", "mUGCLocaleCode is Empty");
            C4535f mo18577f = m18551h(context).mo18577f();
            if (mo18577f != null) {
                str = mo18577f.m18586d();
            }
            if (str == null) {
                C1151k.m6712f("rbx.locale", "No stored value for mUGCLocaleCode. Use English");
                str = C4535f.f18293d.m18586d();
            }
        }
        C1151k.m6714h("rbx.locale", "mUGCLocaleCode value is: " + str);
        return str;
    }

    /* renamed from: j */
    public C4535f m18560j() {
        return this.f18278a;
    }

    /* renamed from: k */
    public boolean m18561k(C4535f c4535f) {
        return this.f18278a.equals(c4535f);
    }

    /* renamed from: m */
    public void m18562m(final Context context) {
        this.f18285h = MessageBus.m13364e().m13372m("Locale.RobloxLocaleIdChanged", new Callback() { // from class: s7.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* renamed from: a */
            public final void mo6401a(JSONObject jSONObject) {
                C4531b.this.m18552l(context, jSONObject);
            }
        });
    }

    /* renamed from: n */
    public boolean m18563n(C4535f c4535f, Context context) {
        if (c4535f == null) {
            return false;
        }
        boolean z10 = !m18561k(c4535f);
        if (!z10 || context == null) {
            return z10;
        }
        m18551h(context).mo18575d(c4535f);
        m18554w(context, c4535f);
        return z10;
    }

    /* renamed from: o */
    public void m18564o(C4535f c4535f, Context context) {
        m18565p(c4535f);
        m18551h(context).mo18576e(this.f18279b);
    }

    /* renamed from: p */
    void m18565p(C4535f c4535f) {
        this.f18279b = c4535f;
    }

    /* renamed from: q */
    public void m18566q(Locale locale) {
        this.f18280c = locale;
    }

    /* renamed from: r */
    public void m18567r(C4535f c4535f) {
        this.f18281d = c4535f;
    }

    /* renamed from: s */
    public void m18568s(b bVar) {
        this.f18283f = bVar;
    }

    /* renamed from: t */
    public void m18569t(Context context, String str) {
        this.f18282e = str;
        m18551h(context).mo18573b(this.f18282e);
    }

    /* renamed from: u */
    public void m18570u(Context context) {
        C4535f c4535f = this.f18278a;
        if (c4535f == null) {
            C1151k.m6712f("rbx.locale", "mUserLocale is empty");
            c4535f = m18551h(context).mo18574c();
            if (c4535f == null) {
                C1151k.m6712f("rbx.locale", "No stored value for mUserLocale.");
                c4535f = m18549c();
            }
        }
        C1151k.m6712f("rbx.locale", "Updating App configuration based on locale = " + c4535f);
        m18554w(context, c4535f);
    }
}
