package com.roblox.client.fcm;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.AbstractServiceC0575h;
import com.google.firebase.iid.FirebaseInstanceId;
import p008a7.C0053k;
import p024bc.C1100c;
import p035c9.C1151k;
import p085g4.AbstractC3263l;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;
import p100h7.C3409b;
import p101h8.C3439m;
import p129j8.C3669l;
import p144ka.C3769a;
import p224r5.InterfaceC4429a;
import p300x7.C5560b;

/* loaded from: classes.dex */
public class RegistrationIntentService extends AbstractServiceC0575h {

    /* renamed from: w */
    private static final String[] f11187w = {"friends", "chat"};

    /* renamed from: com.roblox.client.fcm.RegistrationIntentService$a */
    /* loaded from: classes.dex */
    class C2823a implements InterfaceC3255h<InterfaceC4429a> {

        /* renamed from: a */
        final /* synthetic */ Intent f11188a;

        C2823a(Intent intent) {
            this.f11188a = intent;
        }

        @Override // p085g4.InterfaceC3255h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC4429a interfaceC4429a) {
            String mo11971a = interfaceC4429a.mo11971a();
            C1151k.m6712f("rbx.push", "RegistrationIntentService.onHandleIntent() Token: " + mo11971a);
            C3439m.m15122c().m15132l(new C3669l(mo11971a, RegistrationIntentService.this, this.f11188a.getBooleanExtra("AuthorizePushNotificationsForUser", false)));
        }
    }

    /* renamed from: com.roblox.client.fcm.RegistrationIntentService$b */
    /* loaded from: classes.dex */
    class C2824b implements InterfaceC3253g {
        C2824b() {
        }

        @Override // p085g4.InterfaceC3253g
        public void onFailure(Exception exc) {
            exc.printStackTrace();
            C1100c.m6458d().m6469j(new C0053k("PushNotificationRegistrationFailed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m12504i(Context context, Intent intent) {
        AbstractServiceC0575h.m2767c(context, intent.getComponent(), 1100, intent);
    }

    @Override // androidx.core.app.AbstractServiceC0575h
    /* renamed from: f */
    protected void mo2772f(Intent intent) {
        C5560b.m20357e().m20366k(this, C5560b.d.APP_INIT_TYPE_SHELL);
        C3409b.m15015e(this);
        if (intent == null) {
            return;
        }
        AbstractC3263l<InterfaceC4429a> m11891b = FirebaseInstanceId.m11882a().m11891b();
        m11891b.mo14499f(new C2823a(intent));
        m11891b.mo14497d(new C2824b());
    }

    @Override // androidx.core.app.AbstractServiceC0575h, android.app.Service
    public void onCreate() {
        super.onCreate();
        C3769a.m16020c(this);
    }
}
