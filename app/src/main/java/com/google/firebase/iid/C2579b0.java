package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.C1379b;
import java.io.IOException;
import java.util.concurrent.Executor;
import p007a6.InterfaceC0042i;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p098h5.C3399c;
import p224r5.C4438j;
import p321z2.C5978g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.b0 */
/* loaded from: classes.dex */
public final class C2579b0 {

    /* renamed from: a */
    private final C3399c f10167a;

    /* renamed from: b */
    private final C4438j f10168b;

    /* renamed from: c */
    private final C2586f f10169c;

    /* renamed from: d */
    private final Executor f10170d;

    /* renamed from: e */
    private final InterfaceC0042i f10171e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2579b0(C3399c c3399c, C4438j c4438j, Executor executor, InterfaceC0042i interfaceC0042i) {
        this(c3399c, c4438j, executor, new C2586f(c3399c.m14987h(), c4438j), interfaceC0042i);
    }

    /* renamed from: a */
    private final <T> AbstractC3263l<Void> m11921a(AbstractC3263l<T> abstractC3263l) {
        return abstractC3263l.mo14501h(C2576a.m11917b(), new C2581c0(this));
    }

    /* renamed from: c */
    private final AbstractC3263l<Bundle> m11922c(String str, String str2, String str3, final Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(AppsFlyerProperties.APP_ID, str);
        bundle.putString("gmp_app_id", this.f10167a.m14989k().m15001c());
        bundle.putString("gmsv", Integer.toString(this.f10168b.m18247g()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f10168b.m18245e());
        bundle.putString("app_ver_name", this.f10168b.m18246f());
        String m21263b = C5978g.m21262a().m21263b("firebase-iid");
        if ("UNKNOWN".equals(m21263b)) {
            int i10 = C1379b.f6256a;
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("unknown_");
            sb2.append(i10);
            m21263b = sb2.toString();
        }
        String valueOf = String.valueOf(m21263b);
        bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
        bundle.putString("Firebase-Client", this.f10171e.mo235a());
        final C3265m c3265m = new C3265m();
        this.f10170d.execute(new Runnable(this, bundle, c3265m) { // from class: com.google.firebase.iid.d0

            /* renamed from: n */
            private final C2579b0 f10175n;

            /* renamed from: o */
            private final Bundle f10176o;

            /* renamed from: p */
            private final C3265m f10177p;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f10175n = this;
                this.f10176o = bundle;
                this.f10177p = c3265m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10175n.m11927f(this.f10176o, this.f10177p);
            }
        });
        return c3265m.m14512a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m11923d(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
            sb2.append("Unexpected response: ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: g */
    private final AbstractC3263l<String> m11925g(AbstractC3263l<Bundle> abstractC3263l) {
        return abstractC3263l.mo14501h(this.f10170d, new C2587f0(this));
    }

    /* renamed from: b */
    public final AbstractC3263l<String> m11926b(String str, String str2, String str3) {
        return m11925g(m11922c(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m11927f(Bundle bundle, C3265m c3265m) {
        try {
            c3265m.m14514c(this.f10169c.m11941a(bundle));
        } catch (IOException e10) {
            c3265m.m14513b(e10);
        }
    }

    /* renamed from: h */
    public final AbstractC3263l<Void> m11928h(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return m11921a(m11925g(m11922c(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    /* renamed from: i */
    public final AbstractC3263l<Void> m11929i(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return m11921a(m11925g(m11922c(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)));
    }

    private C2579b0(C3399c c3399c, C4438j c4438j, Executor executor, C2586f c2586f, InterfaceC0042i interfaceC0042i) {
        this.f10167a = c3399c;
        this.f10168b = c4438j;
        this.f10169c = c2586f;
        this.f10170d = executor;
        this.f10171e = interfaceC0042i;
    }
}
