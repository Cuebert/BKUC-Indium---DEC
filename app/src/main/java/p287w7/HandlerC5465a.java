package p287w7;

import android.content.Context;
import android.os.Build;
import androidx.core.app.C0581n;
import com.roblox.client.components.AbstractHandlerC2802c;
import p033c7.C1134c;
import p035c9.C1152l;
import p075f8.C3205h;
import p101h8.C3439m;
import p314y8.C5908b;
import p314y8.EnumC5912f;

/* renamed from: w7.a */
/* loaded from: classes.dex */
public class HandlerC5465a extends AbstractHandlerC2802c {

    /* renamed from: d */
    private Context f20386d;

    /* renamed from: e */
    private long f20387e;

    /* renamed from: f */
    private String f20388f;

    /* renamed from: g */
    private e f20389g;

    /* renamed from: w7.a$b */
    /* loaded from: classes.dex */
    class b implements AbstractHandlerC2802c.a {

        /* renamed from: w7.a$b$a */
        /* loaded from: classes.dex */
        class a implements C5908b.b {
            a() {
            }

            @Override // p314y8.C5908b.b
            /* renamed from: a */
            public void mo20095a(EnumC5912f enumC5912f) {
                HandlerC5465a.this.m12418d("UserSelectedTheme");
            }
        }

        b() {
        }

        @Override // com.roblox.client.components.AbstractHandlerC2802c.a
        public void start() {
            new C5908b().m21039b(new a());
        }
    }

    /* renamed from: w7.a$c */
    /* loaded from: classes.dex */
    class c implements AbstractHandlerC2802c.a {

        /* renamed from: a */
        String f20392a;

        /* renamed from: b */
        long f20393b;

        public c(String str, long j10) {
            this.f20392a = str;
            this.f20393b = j10;
        }

        @Override // com.roblox.client.components.AbstractHandlerC2802c.a
        public void start() {
            C3205h m14141f0;
            if (HandlerC5465a.this.f20386d != null && C1152l.m6734e() && (m14141f0 = C3205h.m14141f0(HandlerC5465a.this.f20386d)) != null) {
                m14141f0.m14179a0(this.f20393b, this.f20392a, true);
            }
            HandlerC5465a.this.m12418d("GrantPendingPurchases");
        }
    }

    /* renamed from: w7.a$d */
    /* loaded from: classes.dex */
    private class d implements AbstractHandlerC2802c.a {
        private d() {
        }

        @Override // com.roblox.client.components.AbstractHandlerC2802c.a
        public void start() {
            if (HandlerC5465a.this.f20386d != null) {
                if (C1134c.m6537a().mo6642r() && !C0581n.m2959b(HandlerC5465a.this.f20386d).m2963a() && Build.VERSION.SDK_INT >= 33) {
                    HandlerC5465a.this.m12418d("PushNotificationRegistration");
                    return;
                } else if (!C1134c.m6537a().mo6575S()) {
                    C3439m.m15122c().m15133m(HandlerC5465a.this.f20386d);
                } else if (C0581n.m2959b(HandlerC5465a.this.f20386d).m2963a()) {
                    C3439m.m15122c().m15134n(HandlerC5465a.this.f20386d, true);
                }
            }
            HandlerC5465a.this.m12418d("PushNotificationRegistration");
        }
    }

    /* renamed from: w7.a$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo20096a();
    }

    public HandlerC5465a(Context context, String str, long j10, String str2) {
        super(str);
        this.f20386d = context;
        this.f20387e = j10;
        this.f20388f = str2;
        m12415a(new d());
        m12415a(new b());
        m12415a(new c(this.f20388f, this.f20387e));
    }

    @Override // com.roblox.client.components.AbstractHandlerC2802c
    /* renamed from: b */
    public void mo12416b() {
        e eVar = this.f20389g;
        if (eVar != null) {
            eVar.mo20096a();
        }
    }

    /* renamed from: g */
    public void m20094g(e eVar) {
        this.f20389g = eVar;
    }
}
