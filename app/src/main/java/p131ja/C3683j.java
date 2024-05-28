package p131ja;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.AbstractC0141b;
import androidx.activity.result.IntentSenderRequest;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.common.C1342a;
import p085g4.InterfaceC3253g;
import p085g4.InterfaceC3255h;
import p131ja.C3683j;
import p209q2.C4294b;
import p295x2.InterfaceC5512g;

/* renamed from: ja.j */
/* loaded from: classes.dex */
public class C3683j {

    /* renamed from: a */
    private static String f15434a = "j";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja.j$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static C3683j f15435a = new C3683j();
    }

    /* renamed from: ja.j$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo15642a(String str);

        void onSuccess();
    }

    /* renamed from: f */
    public static C3683j m15648f() {
        return a.f15435a;
    }

    /* renamed from: j */
    public static /* synthetic */ void m15650j(b bVar, Exception exc) {
        Log.i(f15434a, "SignInClient not available: " + exc.toString());
        bVar.mo15642a("google_auth_api_not_available");
    }

    /* renamed from: k */
    public static /* synthetic */ void m15651k(AbstractC0141b abstractC0141b, b bVar, PendingIntent pendingIntent) {
        try {
            abstractC0141b.m636a(new IntentSenderRequest.C0139b(pendingIntent.getIntentSender()).m632a());
        } catch (Exception e10) {
            Log.e(f15434a, "Error occurred in launching Activity result", e10);
            bVar.mo15642a("google_auth_api_error");
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m15652l(b bVar, Exception exc) {
        Log.e("Failure occurred", "Failure getting phone number");
        bVar.mo15642a("google_auth_api_error");
    }

    /* renamed from: e */
    public String m15653e(Context context, Intent intent) {
        try {
            return C4294b.m17814c(context.getApplicationContext()).mo17681i(intent);
        } catch (Exception e10) {
            Log.e(f15434a, "Phone Number Hint failed", e10);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: g */
    public void m15654g(Context context, b bVar) {
        m15655h(context, C1342a.m7385o(), bVar);
    }

    /* renamed from: h */
    void m15655h(Context context, C1342a c1342a, b bVar) {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            Log.i(f15434a, "Telephony is not available!");
            bVar.mo15642a("telephony_not_available");
            return;
        }
        if (c1342a.mo7390g(context) != 0) {
            Log.i(f15434a, "GooglePlayServices is not available!");
            bVar.mo15642a("google_play_services_not_available");
            return;
        }
        try {
            c1342a.m7393l(C4294b.m17814c(context.getApplicationContext()), new InterfaceC5512g[0]).mo14499f(new InterfaceC3255h() { // from class: ja.i
                public /* synthetic */ C3682i() {
                }

                @Override // p085g4.InterfaceC3255h
                public final void onSuccess(Object obj) {
                    C3683j.b.this.onSuccess();
                }
            }).mo14497d(new InterfaceC3253g() { // from class: ja.g
                public /* synthetic */ C3680g() {
                }

                @Override // p085g4.InterfaceC3253g
                public final void onFailure(Exception exc) {
                    C3683j.m15650j(C3683j.b.this, exc);
                }
            });
        } catch (Exception e10) {
            Log.i(f15434a, "Error checking api availability: " + e10.toString());
            bVar.mo15642a("google_auth_api_error");
        }
    }

    /* renamed from: m */
    public void m15656m(Context context, AbstractC0141b<IntentSenderRequest> abstractC0141b, b bVar) {
        Log.d(f15434a, "Requesting phone number hint");
        C4294b.m17814c(context.getApplicationContext()).mo17677b(GetPhoneNumberHintIntentRequest.m7290x().m7291a()).mo14499f(new InterfaceC3255h() { // from class: ja.h

            /* renamed from: b */
            public final /* synthetic */ C3683j.b f15432b;

            public /* synthetic */ C3681h(C3683j.b bVar2) {
                r2 = bVar2;
            }

            @Override // p085g4.InterfaceC3255h
            public final void onSuccess(Object obj) {
                C3683j.m15651k(AbstractC0141b.this, r2, (PendingIntent) obj);
            }
        }).mo14497d(new InterfaceC3253g() { // from class: ja.f
            public /* synthetic */ C3679f() {
            }

            @Override // p085g4.InterfaceC3253g
            public final void onFailure(Exception exc) {
                C3683j.m15652l(C3683j.b.this, exc);
            }
        });
    }
}
