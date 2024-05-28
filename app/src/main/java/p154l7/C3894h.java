package p154l7;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.roblox.client.C2872n;
import na.AbstractC4089d;
import na.EnumC4091f;
import p033c7.C1134c;
import p101h8.C3439m;
import p156l9.AbstractC3900a;
import p156l9.C3901b;

/* renamed from: l7.h */
/* loaded from: classes.dex */
public class C3894h extends C3901b {

    /* renamed from: c */
    private static final String f16136c = "l7.h";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7.h$a */
    /* loaded from: classes.dex */
    public class a implements C3901b.b {

        /* renamed from: a */
        private final Context f16137a;

        a(Context context) {
            this.f16137a = context.getApplicationContext();
        }

        @Override // p156l9.C3901b.b
        /* renamed from: a */
        public void mo16503a(AbstractC3900a abstractC3900a) {
            Log.v(C3894h.f16136c, "RBHybridModulePush PushPermissionTrigger.execute() " + abstractC3900a.m16542f());
            if (C1134c.m6537a().mo6642r()) {
                if (Build.VERSION.SDK_INT >= 33) {
                    AbstractC4089d m12841l = C2872n.m12830h().m12841l();
                    EnumC4091f enumC4091f = EnumC4091f.POST_NOTIFICATIONS;
                    if (!m12841l.m17021B(enumC4091f)) {
                        C2872n.m12830h().m12841l().m17027w(new String[]{enumC4091f.toString()});
                        return;
                    }
                }
                m16507b(this.f16137a);
                return;
            }
            if ("enableAuthorizationForUser".equalsIgnoreCase(abstractC3900a.m16542f().optString("pushPermissionContext"))) {
                if (this.f16137a != null) {
                    C3439m.m15122c().m15134n(this.f16137a, true);
                }
                abstractC3900a.mo16537a(true, null);
                return;
            }
            abstractC3900a.mo16537a(false, null);
        }

        /* renamed from: b */
        public void m16507b(Context context) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                intent.addFlags(268435456);
            }
            if (i10 >= 25) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            context.startActivity(intent);
        }
    }

    public C3894h(Context context) {
        super("Push");
        m16549d("pushPermissionTrigger", new a(context));
    }
}
