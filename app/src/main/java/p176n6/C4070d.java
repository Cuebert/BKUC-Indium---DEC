package p176n6;

import com.roblox.client.C2822f0;
import com.roblox.client.datastructures.NameValuePair;
import java.util.ArrayList;
import java.util.List;
import ma.C3969a;
import p035c9.C1151k;
import p035c9.C1159s;
import p035c9.InterfaceC1158r;
import p300x7.C5563e;

/* renamed from: n6.d */
/* loaded from: classes.dex */
public class C4070d {

    /* renamed from: j */
    private static C4070d f16506j;

    /* renamed from: a */
    private final String f16507a = "app_start_loadtime";

    /* renamed from: b */
    private final String f16508b = "startup_to_lua";

    /* renamed from: c */
    private final String f16509c = "startup_to_web";

    /* renamed from: d */
    private a f16510d = a.LAUNCH_STATE_NONE;

    /* renamed from: e */
    private boolean f16511e = false;

    /* renamed from: f */
    private long f16512f = 0;

    /* renamed from: g */
    private long f16513g = 0;

    /* renamed from: h */
    private final InterfaceC1158r f16514h;

    /* renamed from: i */
    private final C5563e f16515i;

    /* renamed from: n6.d$a */
    /* loaded from: classes.dex */
    public enum a {
        LAUNCH_STATE_NONE,
        LAUNCH_STATE_UI_PAUSED_BY_USER,
        LAUNCH_STATE_INIT_STARTING,
        LAUNCH_STATE_INIT_DONE_OK,
        LAUNCH_STATE_INIT_STOPPED,
        LAUNCH_STATE_SESSION_CHECK_DONE_OK,
        LAUNCH_STATE_SESSION_CHECK_STOPPED,
        LAUNCH_STATE_POST_LOGIN_DONE_OK,
        LAUNCH_STATE_UI_HOME_STARTING,
        LAUNCH_STATE_UI_HOME_LOADED_OK
    }

    C4070d(C5563e c5563e, InterfaceC1158r interfaceC1158r) {
        C1151k.m6712f("LaunchTimeReporter", "[Constructor]: ENTER.");
        this.f16515i = c5563e;
        this.f16514h = interfaceC1158r;
    }

    /* renamed from: a */
    private List<NameValuePair> m16925a(long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("target", "mobile"));
        arrayList.add(new NameValuePair("event_type", "app_start_loadtime"));
        arrayList.add(new NameValuePair("startup_state", "cold"));
        arrayList.add(new NameValuePair("startup_time", Long.toString(j10)));
        return arrayList;
    }

    /* renamed from: b */
    public static C4070d m16926b() {
        if (f16506j == null) {
            synchronized (C4070d.class) {
                if (f16506j == null) {
                    f16506j = new C4070d(C5563e.m20379h(), new C1159s());
                }
            }
        }
        return f16506j;
    }

    /* renamed from: c */
    public void m16927c(boolean z10) {
        a aVar = this.f16510d;
        if (aVar == a.LAUNCH_STATE_UI_HOME_STARTING || aVar == a.LAUNCH_STATE_INIT_STARTING || aVar == a.LAUNCH_STATE_INIT_DONE_OK || aVar == a.LAUNCH_STATE_SESSION_CHECK_DONE_OK) {
            this.f16510d = a.LAUNCH_STATE_UI_HOME_LOADED_OK;
            if (this.f16511e) {
                return;
            }
            long mo6756b = this.f16514h.mo6756b() - this.f16512f;
            if (mo6756b < 0) {
                return;
            }
            this.f16515i.m20389B("Android-AppStartup-Launch-To-Home-Time", mo6756b);
            C3969a.m16695e().m16698c("android_launch_time_reporter", mo6756b);
            C2822f0.m12486h("app_start_loadtime", z10 ? "startup_to_lua" : "startup_to_web", m16925a(mo6756b));
        }
    }

    /* renamed from: d */
    public void m16928d() {
        if (this.f16510d == a.LAUNCH_STATE_POST_LOGIN_DONE_OK) {
            this.f16510d = a.LAUNCH_STATE_UI_HOME_STARTING;
        }
    }

    /* renamed from: e */
    public void m16929e(boolean z10) {
        a aVar;
        if (this.f16510d == a.LAUNCH_STATE_INIT_STARTING) {
            if (z10) {
                aVar = a.LAUNCH_STATE_INIT_DONE_OK;
            } else {
                aVar = a.LAUNCH_STATE_INIT_STOPPED;
            }
            this.f16510d = aVar;
            this.f16513g = this.f16514h.mo6756b();
        }
    }

    /* renamed from: f */
    public void m16930f() {
        if (this.f16510d == a.LAUNCH_STATE_NONE) {
            this.f16510d = a.LAUNCH_STATE_INIT_STARTING;
            this.f16512f = this.f16514h.mo6756b();
        }
    }

    /* renamed from: g */
    public void m16931g() {
        this.f16511e = true;
    }

    /* renamed from: h */
    public void m16932h() {
        if (this.f16510d == a.LAUNCH_STATE_SESSION_CHECK_DONE_OK) {
            this.f16510d = a.LAUNCH_STATE_POST_LOGIN_DONE_OK;
        }
    }

    /* renamed from: i */
    public void m16933i(boolean z10) {
        a aVar;
        if (this.f16510d == a.LAUNCH_STATE_INIT_DONE_OK) {
            if (z10) {
                aVar = a.LAUNCH_STATE_SESSION_CHECK_DONE_OK;
            } else {
                aVar = a.LAUNCH_STATE_SESSION_CHECK_STOPPED;
            }
            this.f16510d = aVar;
            if (z10) {
                this.f16514h.mo6756b();
            }
        }
    }

    /* renamed from: j */
    public void m16934j() {
        if (this.f16510d != a.LAUNCH_STATE_UI_HOME_STARTING) {
            this.f16510d = a.LAUNCH_STATE_UI_PAUSED_BY_USER;
        }
    }
}
