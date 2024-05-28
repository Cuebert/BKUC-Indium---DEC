package com.roblox.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.game.C2832c;
import com.roblox.client.implementation.AppImplementations;
import com.roblox.client.landing.ActivityStartMVP;
import na.AbstractC4089d;
import na.C4090e;
import p009a8.InterfaceC0059a;
import p022b8.InterfaceC1076a;
import p035c9.C1151k;
import p061e7.C3081b;
import p064ea.C3104d;
import p074f7.C3164b0;
import p089g8.C3317a;
import p091gc.InterfaceC3330b;
import p101h8.InterfaceC3440n;
import p131ja.C3678e;
import p165m7.InterfaceC3959a;
import p179n9.C4077a;
import p179n9.InterfaceC4082f;
import p193ob.AbstractC4183j0;
import p203p8.C4277a;
import p213q6.InterfaceC4321a;
import p213q6.InterfaceC4322b;
import p240s8.InterfaceC4538a;
import p240s8.InterfaceC4539b;
import p240s8.InterfaceC4540c;
import p240s8.InterfaceC4541d;
import p240s8.InterfaceC4542e;
import p240s8.InterfaceC4543f;
import p240s8.InterfaceC4544g;
import p240s8.InterfaceC4545h;
import p240s8.InterfaceC4546i;
import p240s8.InterfaceC4547j;
import p240s8.InterfaceC4548k;
import p252t9.C4743c;
import p274v6.InterfaceC4988c;
import p288w8.InterfaceC5479n;
import p300x7.C5561c;
import p315y9.C5924i;

/* renamed from: com.roblox.client.n */
/* loaded from: classes.dex */
public class C2872n {

    /* renamed from: c */
    private static C2872n f11419c;

    /* renamed from: a */
    private final String f11420a = "com.roblox.client.implementation.AppImplementations";

    /* renamed from: b */
    private Object f11421b;

    /* renamed from: com.roblox.client.n$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C3164b0 f11422a = new C3164b0();
    }

    private C2872n() {
        try {
            this.f11421b = AppImplementations.class.newInstance();
        } catch (ClassNotFoundException unused) {
            C1151k.m6716j("rbx.main", "Failed to find implementation class");
        } catch (IllegalAccessException | InstantiationException unused2) {
            C1151k.m6716j("rbx.main", "Failed to instantiate implementation");
        }
    }

    /* renamed from: h */
    public static C2872n m12830h() {
        if (f11419c == null) {
            synchronized (C2872n.class) {
                if (f11419c == null) {
                    f11419c = new C2872n();
                }
            }
        }
        return f11419c;
    }

    /* renamed from: a */
    public C2832c m12831a(C2832c.a aVar, C2832c.b bVar) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4539b) {
            return ((InterfaceC4539b) obj).m18591a(aVar, bVar);
        }
        C1151k.m6714h("rbx.main", "Using default DataModelNotifications");
        return new C2832c(aVar, bVar);
    }

    /* renamed from: b */
    public C3081b m12832b() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4541d) {
            return ((InterfaceC4541d) obj).m18593a();
        }
        C1151k.m6707a("rbx.main", "Using default GenericWebFragment");
        return new C3081b();
    }

    /* renamed from: c */
    public InterfaceC4321a m12833c(Context context) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4322b) {
            return ((InterfaceC4322b) obj).getRtcAudioManager(context);
        }
        C1151k.m6707a("rbx.main", "No AudioRtcManager");
        return null;
    }

    /* renamed from: d */
    public C5561c m12834d() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4538a) {
            return ((InterfaceC4538a) obj).getAppsFlyerManager();
        }
        C1151k.m6707a("rbx.main", "No AppsFlyer");
        return new C5561c();
    }

    /* renamed from: e */
    public C3104d m12835e() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4988c) {
            return ((InterfaceC4988c) obj).m19430a();
        }
        return C3104d.m13639u();
    }

    /* renamed from: f */
    public C3164b0 m12836f() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4540c) {
            return ((InterfaceC4540c) obj).m18592a();
        }
        return a.f11422a;
    }

    /* renamed from: g */
    public C3678e m12837g() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC3959a) {
            return ((InterfaceC3959a) obj).getIdentityProtocol();
        }
        return C3678e.m15631w();
    }

    /* renamed from: i */
    public Intent m12838i(Context context) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4542e) {
            return ((InterfaceC4542e) obj).m18594a(context);
        }
        C1151k.m6714h("rbx.main", "Using default Main class");
        return new Intent(context, (Class<?>) ActivityNativeMain.class);
    }

    /* renamed from: j */
    public C3317a m12839j(Activity activity) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4543f) {
            return ((InterfaceC4543f) obj).m18595a(activity);
        }
        C1151k.m6707a("rbx.main", "Using empty Midas");
        return new C3317a();
    }

    /* renamed from: k */
    public C5924i m12840k() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC0059a) {
            return ((InterfaceC0059a) obj).getNativeUtilProtocol();
        }
        return C5924i.m21048O();
    }

    /* renamed from: l */
    public AbstractC4089d m12841l() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC1076a) {
            return ((InterfaceC1076a) obj).getPermissionsProtocol();
        }
        return C4090e.m17030C();
    }

    /* renamed from: m */
    public InterfaceC4082f m12842m() throws RuntimeException {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4545h) {
            return ((InterfaceC4545h) obj).m18597a();
        }
        C1151k.m6714h("rbx.main", "Using default Provider");
        return new C4077a();
    }

    /* renamed from: n */
    public InterfaceC3440n m12843n() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4546i) {
            return ((InterfaceC4546i) obj).m18598a();
        }
        C1151k.m6707a("rbx.main", "No default push registrar");
        return null;
    }

    /* renamed from: o */
    public InterfaceC3330b<AbstractC4183j0> m12844o(C4743c c4743c) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4544g) {
            return ((InterfaceC4544g) obj).m18596a(c4743c);
        }
        C1151k.m6707a("rbx.main", "No default push registration call");
        return null;
    }

    /* renamed from: p */
    public Intent m12845p(Context context) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4547j) {
            return ((InterfaceC4547j) obj).m18599a(context);
        }
        C1151k.m6714h("rbx.main", "Using default Start class");
        return new Intent(context, (Class<?>) ActivityStartMVP.class);
    }

    /* renamed from: q */
    public C4277a m12846q() {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC4548k) {
            return ((InterfaceC4548k) obj).m18600a();
        }
        C1151k.m6707a("rbx.main", "Using empty TSS");
        return new C4277a();
    }

    /* renamed from: r */
    public void m12847r(Context context) {
        Object obj = this.f11421b;
        if (obj instanceof InterfaceC5479n) {
            ((InterfaceC5479n) obj).installSecurityProviderIfNeeded(context);
        }
    }
}
