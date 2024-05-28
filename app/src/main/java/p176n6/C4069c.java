package p176n6;

import android.text.TextUtils;
import com.roblox.client.C2877p0;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeGLInterface;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import p033c7.C1134c;
import p035c9.C1143c;
import p035c9.C1151k;
import p035c9.C1159s;
import p035c9.InterfaceC1158r;
import p100h7.AsyncTaskC3424q;
import p100h7.C3417j;
import p100h7.InterfaceC3420m;

/* renamed from: n6.c */
/* loaded from: classes.dex */
public class C4069c {

    /* renamed from: f */
    private static C4069c f16499f;

    /* renamed from: a */
    private final Object f16500a = new Object();

    /* renamed from: b */
    private final List<String> f16501b = new ArrayList();

    /* renamed from: c */
    private long f16502c;

    /* renamed from: d */
    private final b f16503d;

    /* renamed from: e */
    private final InterfaceC1158r f16504e;

    /* renamed from: n6.c$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3420m {
        a() {
        }

        @Override // p100h7.InterfaceC3420m
        /* renamed from: a */
        public void mo12177a(C3417j c3417j) {
            if (c3417j.m15027b() == 200 || c3417j.m15027b() == 202) {
                return;
            }
            C1151k.m6716j("EventStreamManager", "addEvent: Failed to post events. Ignore and do nothing");
        }
    }

    /* renamed from: n6.c$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        AsyncTaskC3424q mo16924a(String str, String str2, InterfaceC3420m interfaceC3420m, String str3);
    }

    /* renamed from: n6.c$c */
    /* loaded from: classes.dex */
    public static class c implements b {
        c() {
        }

        @Override // p176n6.C4069c.b
        /* renamed from: a */
        public AsyncTaskC3424q mo16924a(String str, String str2, InterfaceC3420m interfaceC3420m, String str3) {
            return new AsyncTaskC3424q(str, str2, interfaceC3420m, str3);
        }
    }

    C4069c(b bVar, InterfaceC1158r interfaceC1158r) {
        C1151k.m6712f("EventStreamManager", "[Constructor]: ENTER.");
        this.f16503d = bVar;
        this.f16504e = interfaceC1158r;
    }

    /* renamed from: b */
    private static String m16902b(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int size = list.size();
        int i10 = 0;
        for (String str : list) {
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\"");
            i10++;
            if (i10 < size) {
                sb2.append(",");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: r */
    protected static String m16903r() {
        try {
            return URLEncoder.encode(C2877p0.m12903Z0(), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C1151k.m6709c("EventStreamManager", "Failed to URL-encode the user-agent. Exception: " + e10);
            return null;
        }
    }

    /* renamed from: s */
    public static C4069c m16904s() {
        if (f16499f == null) {
            synchronized (C4069c.class) {
                if (f16499f == null) {
                    f16499f = new C4069c(new c(), new C1159s());
                }
            }
        }
        return f16499f;
    }

    /* renamed from: v */
    private boolean m16905v() {
        return this.f16501b.size() >= Math.min(C1134c.m6537a().mo6613h0(), 900) || this.f16504e.mo6756b() - this.f16502c >= ((long) C1134c.m6537a().mo6662z()) * 1000;
    }

    /* renamed from: a */
    protected void m16906a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lt=");
        sb2.append(String.format("%tFT%<tT.%<tLZ", Calendar.getInstance(TimeZone.getTimeZone("Z"))));
        sb2.append("&mdid=");
        sb2.append(C2877p0.f11445p);
        sb2.append("&idfv=");
        sb2.append(C2877p0.f11445p);
        sb2.append("&idfa=");
        C1143c.m6680g();
        sb2.append(C1143c.m6679d());
        String str2 = sb2.toString() + "&" + str;
        synchronized (this.f16500a) {
            this.f16501b.add(str2);
            if (this.f16501b.size() == 1) {
                this.f16502c = this.f16504e.mo6756b();
            }
            if (m16905v()) {
                m16923u();
            }
        }
    }

    /* renamed from: c */
    public void m16907c(String str) {
        m16906a("evt=appLaunch&ctx=" + str + "&appStoreSource=google");
    }

    /* renamed from: d */
    public void m16908d(String str, String str2) {
        m16906a("evt=buttonClick&ctx=" + str + "&btn=" + str2);
    }

    /* renamed from: e */
    public void m16909e(String str, String str2, String str3) {
        m16906a("evt=buttonClick&ctx=" + str + "&btn=" + str2 + "&cstm=" + str3);
    }

    /* renamed from: f */
    public void m16910f(String str, String str2, String str3) {
        m16906a("evt=clientSideError&ctx=" + str + "&error=" + str2 + "&data=" + str3);
    }

    /* renamed from: g */
    public void m16911g(String str, String str2, int i10, int i11) {
        m16906a("evt=endpointFailure&ctx=" + str + "&url=" + str2 + "&errorCode=" + i10 + "&serverErrorCode=" + i11);
    }

    /* renamed from: h */
    public void m16912h(String str, String str2, List<NameValuePair> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=");
        sb2.append(str);
        sb2.append("&ctx=");
        sb2.append(str2);
        if (list != null) {
            for (NameValuePair nameValuePair : list) {
                sb2.append("&");
                sb2.append(nameValuePair.getName());
                sb2.append("=");
                sb2.append(nameValuePair.getValue());
            }
        }
        m16906a(sb2.toString());
    }

    /* renamed from: i */
    public void m16913i(String str, String str2, String str3) {
        m16906a("evt=formInteraction&ctx=" + str + "&input=" + str2 + "&aType=" + str3);
    }

    /* renamed from: j */
    public void m16914j(String str, String str2, boolean z10) {
        m16906a("evt=formValidation&ctx=" + str + "&input=" + str2 + "&vis=" + z10);
    }

    /* renamed from: k */
    public void m16915k(String str, String str2, boolean z10, String str3) {
        m16906a("evt=formValidation&ctx=" + str + "&input=" + str2 + "&vis=" + z10 + "&msg=" + str3);
    }

    /* renamed from: l */
    public void m16916l(String str, boolean z10) {
        m16906a("evt=pushNotificationOSSettingsChanged&ua=" + m16903r() + "&ctx=" + str + "&enabled=" + z10);
    }

    /* renamed from: m */
    public void m16917m(String str) {
        m16906a("evt=screenLoaded&ctx=" + str);
    }

    /* renamed from: n */
    public void m16918n(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=sharingAppSelected&ua=");
        sb2.append(m16903r());
        sb2.append("&ctx=");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(str2)) {
            str3 = sb3 + "&status=Fail";
        } else {
            str3 = sb3 + "&status=Success&appName=" + str2;
        }
        m16906a(str3);
    }

    /* renamed from: o */
    public void m16919o(String str, String str2) {
        if (C1134c.m6537a().mo6643r0()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("evt=shareSheetLoad&ua=");
            sb2.append(m16903r());
            sb2.append("&ctx=");
            if (TextUtils.isEmpty(str)) {
                str = "Unknown";
            }
            sb2.append(str);
            sb2.append("&link=");
            sb2.append(str2);
            m16906a(sb2.toString());
        }
    }

    /* renamed from: p */
    public void m16920p(String str) {
        m16906a("evt=sharingAppSelected&appName=" + str);
    }

    /* renamed from: q */
    public void m16921q() {
        m16906a("evt=switchAccount");
    }

    /* renamed from: t */
    public void m16922t() {
        NativeGLInterface.nativeReleaseAllRbxEventStreams();
    }

    /* renamed from: u */
    public void m16923u() {
        synchronized (this.f16500a) {
            if (this.f16501b.isEmpty()) {
                return;
            }
            C1151k.m6707a("EventStreamManager", "sendAllNow: # of events " + this.f16501b.size());
            String m16902b = m16902b(this.f16501b);
            C1151k.m6707a("EventStreamManager", "sendAllNow: httpPostBody: " + m16902b);
            this.f16501b.clear();
            this.f16502c = 0L;
            this.f16503d.mo16924a(C2877p0.m12863F0(), m16902b, new a(), C2877p0.m12880O()).mo15006c();
        }
    }
}
