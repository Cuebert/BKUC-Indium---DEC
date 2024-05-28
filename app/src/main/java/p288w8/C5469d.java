package p288w8;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import com.google.common.util.concurrent.C2569q;
import com.google.common.util.concurrent.InterfaceFutureC2565m;
import com.roblox.client.C2877p0;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.ClientLocalFlags;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ma.C3969a;
import org.json.JSONException;
import org.json.JSONObject;
import p033c7.C1132a;
import p033c7.C1134c;
import p033c7.C1137f;
import p035c9.C1143c;
import p035c9.C1151k;
import p100h7.C3425r;
import p191o9.C4161i;
import p299x6.C5555a;
import p299x6.C5556b;
import p299x6.C5557c;

/* renamed from: w8.d */
/* loaded from: classes.dex */
public class C5469d {

    /* renamed from: b */
    private static InterfaceFutureC2565m<String> f20401b;

    /* renamed from: a */
    private static AtomicReference<a> f20400a = new AtomicReference<>(a.UNINITIALIZED);

    /* renamed from: c */
    private static boolean f20402c = true;

    /* renamed from: d */
    private static long f20403d = 0;

    /* renamed from: w8.d$a */
    /* loaded from: classes.dex */
    public enum a {
        UNINITIALIZED,
        PREFETCHED,
        ENGINE_FLAG_LOADED
    }

    /* renamed from: d */
    private static void m20100d() {
        if (C1134c.m6537a().mo6553H()) {
            C3969a.m16695e().m16699d("fetch_flag_begin", f20403d);
        }
    }

    /* renamed from: e */
    public static synchronized InterfaceFutureC2565m<String> m20101e(Context context) {
        synchronized (C5469d.class) {
            InterfaceFutureC2565m<String> interfaceFutureC2565m = f20401b;
            if (interfaceFutureC2565m != null && f20402c) {
                f20402c = false;
                return interfaceFutureC2565m;
            }
            C2569q m11863E = C2569q.m11863E();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: w8.c

                /* renamed from: n */
                public final /* synthetic */ Context f20398n;

                /* renamed from: o */
                public final /* synthetic */ C2569q f20399o;

                public /* synthetic */ RunnableC5468c(Context context2, C2569q m11863E2) {
                    r1 = context2;
                    r2 = m11863E2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5469d.m20105i(r1, r2);
                }
            });
            f20401b = m11863E2;
            return m11863E2;
        }
    }

    /* renamed from: f */
    public static void m20102f(Context context) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(C2877p0.m12884Q(context).getString("AndroidAppSettingsCache", "{}"));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        m20117u(jSONObject, 1);
    }

    /* renamed from: g */
    public static void m20103g(Context context) {
        JSONObject m20346b = C5555a.m20346b(context);
        if (m20346b != null && m20346b.length() > 0) {
            m20117u(m20346b, 2);
        }
        ClientLocalFlags readLocalFlags = NativeGLInterface.readLocalFlags();
        if (!readLocalFlags.isEmpty()) {
            C1151k.m6707a("AndroidAppSettings", "localFlags size:" + readLocalFlags.size());
            m20117u(readLocalFlags.getAll(), 3);
        }
        if (C5556b.m20348a() && C5557c.m20349a()) {
            m20117u(C5557c.m20350b(), 3);
        }
    }

    /* renamed from: h */
    public static boolean m20104h() {
        return f20400a.get() == a.ENGINE_FLAG_LOADED;
    }

    /* renamed from: i */
    public static /* synthetic */ void m20105i(Context context, C2569q c2569q) {
        m20112p();
        String m20118a = C5470e.m20118a(context);
        m20116t(m20118a, context);
        m20100d();
        m20113q();
        c2569q.mo11801B(m20118a);
        if (C4161i.m17249e() instanceof C3425r) {
            ((C3425r) C4161i.m17249e()).m15049k();
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m20106j(String str) {
        C1143c.f5488d.mo11801B(str);
    }

    /* renamed from: k */
    public static /* synthetic */ void m20107k(Context context) {
        C4161i.m17249e();
        C1143c.m6680g().m6684f(context, C5466a.f20396a);
    }

    /* renamed from: l */
    public static void m20108l(Context context) {
        m20102f(context);
        m20103g(context);
    }

    /* renamed from: m */
    public static synchronized void m20109m() {
        synchronized (C5469d.class) {
            try {
                System.loadLibrary("roblox");
            } catch (UnsatisfiedLinkError e10) {
                C1151k.m6712f("AndroidAppSettings", e10.getLocalizedMessage());
            }
        }
    }

    /* renamed from: n */
    public static String m20110n() {
        try {
            String str = f20401b.get();
            f20401b = null;
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static void m20111o(Context context) {
        f20401b = m20101e(context);
        f20400a.set(a.PREFETCHED);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: w8.b

            /* renamed from: n */
            public final /* synthetic */ Context f20397n;

            public /* synthetic */ RunnableC5467b(Context context2) {
                r1 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5469d.m20107k(r1);
            }
        });
    }

    /* renamed from: p */
    private static void m20112p() {
        if (C1134c.m6537a().mo6553H()) {
            f20403d = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: q */
    private static void m20113q() {
        if (C1134c.m6537a().mo6553H()) {
            C3969a.m16695e().m16697b("fetch_flag_end");
        }
    }

    /* renamed from: r */
    private static void m20114r(boolean z10) {
        if (C1134c.m6537a().mo6553H()) {
            if (z10) {
                C3969a.m16695e().m16697b("fastflag_load_success");
            } else {
                C3969a.m16695e().m16697b("fastflag_load_failure");
            }
        }
    }

    /* renamed from: s */
    public static void m20115s() {
        f20400a.set(a.ENGINE_FLAG_LOADED);
    }

    /* renamed from: t */
    private static boolean m20116t(String str, Context context) {
        boolean z10;
        JSONObject m20119b = C5470e.m20119b(str);
        if (m20119b != null) {
            C2877p0.m12884Q(context).edit().putString("AndroidAppSettingsCache", m20119b.toString()).apply();
            z10 = m20117u(m20119b, 1);
            m20114r(z10);
        } else {
            m20102f(context);
            z10 = false;
        }
        m20103g(context);
        C1137f.m6665c().m6666a(C2877p0.m12884Q(context));
        return z10;
    }

    /* renamed from: u */
    public static boolean m20117u(JSONObject jSONObject, int i10) {
        Object string;
        boolean z10 = false;
        for (Map.Entry<String, C1132a> entry : C1134c.m6537a().mo6536r1()) {
            String key = entry.getKey();
            C1132a value = entry.getValue();
            if (jSONObject.has(key)) {
                try {
                    if (value instanceof C1132a.b) {
                        string = Boolean.valueOf(jSONObject.getBoolean(key));
                    } else if (value instanceof C1132a.d) {
                        string = Long.valueOf(jSONObject.getLong(key));
                    } else if (value instanceof C1132a.c) {
                        string = Integer.valueOf(jSONObject.getInt(key));
                    } else {
                        string = jSONObject.getString(key);
                    }
                    value.m6531e(string, i10);
                    z10 = true;
                } catch (JSONException unused) {
                    value.m6529c(i10);
                    C1151k.m6716j("AndroidAppSettings", "Error reading value for setting: " + key);
                }
            } else {
                value.m6529c(i10);
            }
        }
        return z10;
    }
}
