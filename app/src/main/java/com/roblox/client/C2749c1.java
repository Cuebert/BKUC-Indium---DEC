package com.roblox.client;

import android.content.Context;
import com.appsflyer.oaid.BuildConfig;
import p035c9.C1151k;
import p035c9.C1152l;
import p035c9.C1159s;
import p035c9.InterfaceC1158r;
import p100h7.AsyncTaskC3410c;
import p100h7.C3414g;
import p100h7.C3417j;
import p100h7.InterfaceC3419l;
import p128j7.C3655b;
import p225r6.C4449b;
import p299x6.C5556b;

/* renamed from: com.roblox.client.c1 */
/* loaded from: classes.dex */
public class C2749c1 {

    /* renamed from: g */
    private static C2749c1 f10772g;

    /* renamed from: b */
    private long f10774b;

    /* renamed from: c */
    private final InterfaceC1158r f10775c;

    /* renamed from: a */
    d f10773a = new d();

    /* renamed from: d */
    private e f10776d = e.UnKnown;

    /* renamed from: e */
    private String f10777e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private String f10778f = BuildConfig.FLAVOR;

    /* renamed from: com.roblox.client.c1$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC3419l {

        /* renamed from: a */
        final /* synthetic */ c f10779a;

        a(c cVar) {
            this.f10779a = cVar;
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: a */
        public void mo12250a(C3417j c3417j) {
        }

        @Override // p100h7.InterfaceC3419l
        /* renamed from: b */
        public void mo281b(C3417j c3417j) {
            C2749c1.this.m12244c(c3417j);
            c cVar = this.f10779a;
            if (cVar != null) {
                cVar.mo12176a(C2749c1.this.f10773a);
            }
        }
    }

    /* renamed from: com.roblox.client.c1$b */
    /* loaded from: classes.dex */
    public static abstract class b implements c {
        @Override // com.roblox.client.C2749c1.c
        /* renamed from: b */
        public void mo12178b(d dVar) {
        }
    }

    /* renamed from: com.roblox.client.c1$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo12176a(d dVar);

        /* renamed from: b */
        void mo12178b(d dVar);
    }

    /* renamed from: com.roblox.client.c1$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public e f10781a = e.UnKnown;

        /* renamed from: b */
        public String f10782b;

        /* renamed from: c */
        public String f10783c;

        /* renamed from: a */
        public boolean m12251a() {
            return this.f10781a == e.NewAppRequired;
        }

        /* renamed from: b */
        public boolean m12252b() {
            return this.f10781a == e.Recommended;
        }

        /* renamed from: c */
        public boolean m12253c() {
            return this.f10781a == e.Required;
        }

        /* renamed from: d */
        public void m12254d() {
            this.f10781a = e.Recommended;
        }

        /* renamed from: e */
        public void m12255e() {
            this.f10781a = e.Required;
        }

        /* renamed from: f */
        public void m12256f() {
            this.f10781a = e.NotRequired;
        }
    }

    /* renamed from: com.roblox.client.c1$e */
    /* loaded from: classes.dex */
    public enum e {
        UnKnown,
        Recommended,
        Required,
        NotRequired,
        NewAppRequired
    }

    C2749c1(InterfaceC1158r interfaceC1158r) {
        this.f10775c = interfaceC1158r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r2 == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r2 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r7.f10773a.f10781a = com.roblox.client.C2749c1.e.NotRequired;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r7.f10773a.f10781a = com.roblox.client.C2749c1.e.NewAppRequired;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r7.f10773a.f10781a = com.roblox.client.C2749c1.e.Recommended;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12244c(p100h7.C3417j r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = r8.m15026a()     // Catch: java.lang.Exception -> L8c
            r1.<init>(r8)     // Catch: java.lang.Exception -> L8c
            java.lang.String r8 = "data"
            org.json.JSONObject r8 = r1.getJSONObject(r8)     // Catch: java.lang.Exception -> L8c
            if (r8 != 0) goto L14
            return
        L14:
            java.lang.String r2 = "UpgradeAction"
            java.lang.String r8 = r8.getString(r2)     // Catch: java.lang.Exception -> L8c
            r2 = -1
            int r3 = r8.hashCode()     // Catch: java.lang.Exception -> L8c
            r4 = -1189181893(0xffffffffb91e863b, float:-1.5118059E-4)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L45
            r4 = -328495169(0xffffffffec6b8fbf, float:-1.13910556E27)
            if (r3 == r4) goto L3b
            r4 = -144187584(0xfffffffff767df40, float:-4.7029243E33)
            if (r3 == r4) goto L31
            goto L4e
        L31:
            java.lang.String r3 = "NewAppRequired"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Exception -> L8c
            if (r8 == 0) goto L4e
            r2 = 2
            goto L4e
        L3b:
            java.lang.String r3 = "Required"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Exception -> L8c
            if (r8 == 0) goto L4e
            r2 = 0
            goto L4e
        L45:
            java.lang.String r3 = "Recommended"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Exception -> L8c
            if (r8 == 0) goto L4e
            r2 = 1
        L4e:
            if (r2 == 0) goto L69
            if (r2 == r6) goto L62
            if (r2 == r5) goto L5b
            com.roblox.client.c1$d r8 = r7.f10773a     // Catch: java.lang.Exception -> L8c
            com.roblox.client.c1$e r2 = com.roblox.client.C2749c1.e.NotRequired     // Catch: java.lang.Exception -> L8c
            r8.f10781a = r2     // Catch: java.lang.Exception -> L8c
            goto L6f
        L5b:
            com.roblox.client.c1$d r8 = r7.f10773a     // Catch: java.lang.Exception -> L8c
            com.roblox.client.c1$e r2 = com.roblox.client.C2749c1.e.NewAppRequired     // Catch: java.lang.Exception -> L8c
            r8.f10781a = r2     // Catch: java.lang.Exception -> L8c
            goto L6f
        L62:
            com.roblox.client.c1$d r8 = r7.f10773a     // Catch: java.lang.Exception -> L8c
            com.roblox.client.c1$e r2 = com.roblox.client.C2749c1.e.Recommended     // Catch: java.lang.Exception -> L8c
            r8.f10781a = r2     // Catch: java.lang.Exception -> L8c
            goto L6f
        L69:
            com.roblox.client.c1$d r8 = r7.f10773a     // Catch: java.lang.Exception -> L8c
            com.roblox.client.c1$e r2 = com.roblox.client.C2749c1.e.Required     // Catch: java.lang.Exception -> L8c
            r8.f10781a = r2     // Catch: java.lang.Exception -> L8c
        L6f:
            com.roblox.client.c1$d r8 = r7.f10773a     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = "upgradeSource"
            java.lang.String r2 = r1.optString(r2, r0)     // Catch: java.lang.Exception -> L8c
            r8.f10782b = r2     // Catch: java.lang.Exception -> L8c
            com.roblox.client.c1$d r8 = r7.f10773a     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = "MD5Sum"
            java.lang.String r0 = r1.optString(r2, r0)     // Catch: java.lang.Exception -> L8c
            r8.f10783c = r0     // Catch: java.lang.Exception -> L8c
            c9.r r8 = r7.f10775c     // Catch: java.lang.Exception -> L8c
            long r0 = r8.mo6756b()     // Catch: java.lang.Exception -> L8c
            r7.f10774b = r0     // Catch: java.lang.Exception -> L8c
            goto La3
        L8c:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "evaluateResponse: Exception caught: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "UpgradeCheckHelper"
            p035c9.C1151k.m6716j(r0, r8)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.C2749c1.m12244c(h7.j):void");
    }

    /* renamed from: e */
    public static C2749c1 m12245e() {
        if (f10772g == null) {
            synchronized (C2749c1.class) {
                if (f10772g == null) {
                    f10772g = new C2749c1(new C1159s());
                }
            }
        }
        return f10772g;
    }

    /* renamed from: b */
    public void m12246b(c cVar) {
        Context m12215a;
        if (C1152l.m6736g() && cVar != null && (m12215a = RobloxApplication.m12215a()) != null && C5556b.m20348a()) {
            C4449b c4449b = new C4449b();
            c4449b.m18270c(m12215a);
            if (c4449b.m18268a()) {
                cVar.mo12176a(c4449b.m18269b());
                return;
            }
        }
        e eVar = this.f10776d;
        e eVar2 = e.UnKnown;
        if (eVar != eVar2) {
            C1151k.m6712f("UpgradeCheckHelper", "Rely on the upgrade-status set by the Init process: " + this.f10776d);
            d dVar = this.f10773a;
            dVar.f10781a = this.f10776d;
            this.f10776d = eVar2;
            dVar.f10782b = this.f10777e;
            this.f10777e = BuildConfig.FLAVOR;
            dVar.f10783c = this.f10778f;
            this.f10778f = BuildConfig.FLAVOR;
            this.f10774b = this.f10775c.mo6756b();
            if (cVar != null) {
                cVar.mo12176a(this.f10773a);
                return;
            }
            return;
        }
        long mo6756b = this.f10775c.mo6756b() - this.f10774b;
        if (C1152l.m6736g()) {
            d dVar2 = this.f10773a;
            if (dVar2.f10781a == e.NewAppRequired) {
                if (mo6756b < 3600000) {
                    if (cVar != null) {
                        cVar.mo12176a(dVar2);
                        return;
                    }
                    return;
                }
                this.f10773a.f10781a = eVar2;
                C1151k.m6712f("UpgradeCheckHelper", "Perform upgrade check with the server...");
                AsyncTaskC3410c mo15024b = C3414g.m15025a().mo15024b(C2877p0.m12901Y0(), null, new a(cVar));
                mo15024b.m15010g(new C3655b());
                mo15024b.mo15006c();
            }
        }
        if (this.f10773a.f10781a != eVar2 && mo6756b < 3600000) {
            C1151k.m6707a("UpgradeCheckHelper", "Skip upgrade check because it was completed not long ago: " + mo6756b + " ms.");
            if (cVar != null) {
                cVar.mo12178b(this.f10773a);
                return;
            }
            return;
        }
        this.f10773a.f10781a = eVar2;
        C1151k.m6712f("UpgradeCheckHelper", "Perform upgrade check with the server...");
        AsyncTaskC3410c mo15024b2 = C3414g.m15025a().mo15024b(C2877p0.m12901Y0(), null, new a(cVar));
        mo15024b2.m15010g(new C3655b());
        mo15024b2.mo15006c();
    }

    /* renamed from: d */
    public d m12247d() {
        return this.f10773a;
    }

    /* renamed from: f */
    public boolean m12248f() {
        e eVar = this.f10776d;
        e eVar2 = e.Required;
        boolean z10 = eVar == eVar2;
        boolean z11 = this.f10773a.f10781a == eVar2;
        C1151k.m6714h("UpgradeCheckHelper", "isUpgradeRequired: [" + z10 + ", " + z11 + "]");
        return z10 || z11;
    }

    /* renamed from: g */
    public void m12249g(d dVar) {
        C1151k.m6712f("UpgradeCheckHelper", "Set upgrade-status (from Init) = " + dVar.f10781a);
        this.f10776d = dVar.f10781a;
        this.f10777e = dVar.f10782b;
        this.f10778f = dVar.f10783c;
    }
}
