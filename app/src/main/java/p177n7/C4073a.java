package p177n7;

import android.os.Build;
import com.appsflyer.oaid.BuildConfig;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import p033c7.C1134c;
import p286w6.InterfaceC5462a;
import p286w6.InterfaceC5464c;
import p301x8.AsyncTaskC5567b;
import p301x8.C5569d;
import p301x8.InterfaceC5566a;

/* renamed from: n7.a */
/* loaded from: classes.dex */
public class C4073a implements InterfaceC5464c {

    /* renamed from: g */
    private static int f16535g;

    /* renamed from: a */
    private StringBuilder f16536a;

    /* renamed from: b */
    private StringBuilder f16537b;

    /* renamed from: c */
    private String f16538c;

    /* renamed from: d */
    private boolean f16539d = false;

    /* renamed from: e */
    private long f16540e = 0;

    /* renamed from: f */
    private ArrayList<String> f16541f = new ArrayList<>();

    /* renamed from: n7.a$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC5566a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5462a f16542a;

        a(InterfaceC5462a interfaceC5462a) {
            this.f16542a = interfaceC5462a;
        }

        @Override // p301x8.InterfaceC5566a
        /* renamed from: a */
        public void mo16954a(C5569d c5569d) {
            InterfaceC5462a interfaceC5462a = this.f16542a;
            if (interfaceC5462a != null) {
                interfaceC5462a.mo20089a();
            }
        }
    }

    public C4073a(String str) {
        this.f16536a = null;
        this.f16537b = null;
        this.f16538c = BuildConfig.FLAVOR;
        this.f16538c = str;
        this.f16537b = new StringBuilder();
        this.f16536a = new StringBuilder();
    }

    /* renamed from: i */
    public static void m16940i() {
        if (C1134c.m6537a().mo6554H0()) {
            f16535g = new SecureRandom().nextInt(100);
        } else {
            f16535g = new Random().nextInt(100);
        }
    }

    /* renamed from: j */
    private long m16941j() {
        return System.currentTimeMillis() * 1000000;
    }

    /* renamed from: l */
    private static boolean m16942l() {
        return f16535g < C1134c.m6537a().mo6595b0();
    }

    /* renamed from: m */
    private String m16943m(String str) {
        int lastIndexOf = str.lastIndexOf(",");
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    @Override // p286w6.InterfaceC5464c
    /* renamed from: a */
    public boolean mo16944a() {
        return C1134c.m6537a().mo6540A0() != null;
    }

    @Override // p286w6.InterfaceC5464c
    /* renamed from: b */
    public void mo16945b(InterfaceC5462a interfaceC5462a) {
        if (this.f16539d || m16942l()) {
            if (this.f16540e == 0) {
                this.f16540e = m16941j();
            }
            new AsyncTaskC5567b(C1134c.m6537a().mo6540A0(), C1134c.m6537a().mo6599c1(), m16952k(), new a(interfaceC5462a)).m20465d();
        } else if (interfaceC5462a != null) {
            interfaceC5462a.mo20089a();
        }
    }

    /* renamed from: c */
    public C4073a m16946c(String str, int i10) {
        StringBuilder sb2 = this.f16536a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(i10);
        sb2.append("i,");
        return this;
    }

    /* renamed from: d */
    public C4073a m16947d(String str, long j10) {
        StringBuilder sb2 = this.f16536a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(j10);
        sb2.append("i,");
        return this;
    }

    /* renamed from: e */
    public C4073a m16948e(String str, Object obj) {
        StringBuilder sb2 = this.f16536a;
        sb2.append(str);
        sb2.append("=");
        sb2.append('\"');
        sb2.append(obj);
        sb2.append('\"');
        sb2.append(",");
        return this;
    }

    /* renamed from: f */
    public C4073a m16949f(String str, boolean z10) {
        StringBuilder sb2 = this.f16536a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(z10);
        sb2.append(",");
        return this;
    }

    /* renamed from: g */
    public C4073a m16950g(String str, Object obj) {
        StringBuilder sb2 = this.f16537b;
        sb2.append(str);
        sb2.append('=');
        sb2.append(obj.toString().replace(" ", "\\ ").replace(",", "\\,"));
        sb2.append(",");
        return this;
    }

    /* renamed from: h */
    public InterfaceC5464c m16951h() {
        C4074b.m16955d().m20091b(this);
        return this;
    }

    /* renamed from: k */
    protected String m16952k() {
        m16950g("appVersion", "2.622.471");
        m16948e("deviceType", Build.MODEL);
        m16950g("deviceOSVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        m16950g("platform", "Android");
        m16950g("reporter", "App");
        if (this.f16540e == 0) {
            this.f16540e = m16941j();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f16541f.size(); i10++) {
            sb2.append(this.f16541f.get(i10));
        }
        return ((CharSequence) sb2) + this.f16538c + "," + m16943m(this.f16537b.toString()) + " " + m16943m(this.f16536a.toString()) + " " + this.f16540e + "\n";
    }

    /* renamed from: n */
    public C4073a m16953n(boolean z10) {
        this.f16539d = z10;
        return this;
    }
}
