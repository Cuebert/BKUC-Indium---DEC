package p198p3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1352d;
import com.google.android.gms.common.api.internal.C1350c;
import java.util.Iterator;
import p004a3.C0030c;
import p085g4.AbstractC3263l;
import p085g4.C3265m;
import p209q2.C4300h;
import p209q2.InterfaceC4295c;
import p295x2.AbstractC5510e;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p295x2.C5507b;
import p308y2.InterfaceC5620k;
import p321z2.C5984j;

/* renamed from: p3.z */
/* loaded from: classes.dex */
public final class C4267z extends AbstractC5510e implements InterfaceC4295c {

    /* renamed from: l */
    private static final C5506a.g f17451l;

    /* renamed from: m */
    private static final C5506a.a f17452m;

    /* renamed from: n */
    private static final C5506a f17453n;

    /* renamed from: k */
    private final String f17454k;

    static {
        C5506a.g gVar = new C5506a.g();
        f17451l = gVar;
        C4262u c4262u = new C4262u();
        f17452m = c4262u;
        f17453n = new C5506a("Auth.Api.Identity.SignIn.API", c4262u, gVar);
    }

    public C4267z(Activity activity, C4300h c4300h) {
        super(activity, (C5506a<C4300h>) f17453n, c4300h, AbstractC5510e.a.f20550c);
        this.f17454k = C4227c0.m17654a();
    }

    @Override // p209q2.InterfaceC4295c
    /* renamed from: a */
    public final AbstractC3263l<PendingIntent> mo17676a(GetSignInIntentRequest getSignInIntentRequest) {
        C5984j.m21286j(getSignInIntentRequest);
        GetSignInIntentRequest.C1321a m7292C = GetSignInIntentRequest.m7292C(getSignInIntentRequest);
        m7292C.m7303f(this.f17454k);
        final GetSignInIntentRequest m7298a = m7292C.m7298a();
        return m20269n(AbstractC1352d.m7497a().m7506d(C4225b0.f17418f).m7504b(new InterfaceC5620k() { // from class: p3.q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                C4267z c4267z = C4267z.this;
                GetSignInIntentRequest getSignInIntentRequest2 = m7298a;
                ((C4242k) ((C4223a0) obj).m7646D()).m17668K0(new BinderC4265x(c4267z, (C3265m) obj2), (GetSignInIntentRequest) C5984j.m21286j(getSignInIntentRequest2));
            }
        }).m7507e(1555).m7503a());
    }

    @Override // p209q2.InterfaceC4295c
    /* renamed from: b */
    public final AbstractC3263l<PendingIntent> mo17677b(final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        C5984j.m21286j(getPhoneNumberHintIntentRequest);
        return m20269n(AbstractC1352d.m7497a().m7506d(C4225b0.f17420h).m7504b(new InterfaceC5620k() { // from class: p3.t
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                C4267z.this.m17682y(getPhoneNumberHintIntentRequest, (C4223a0) obj, (C3265m) obj2);
            }
        }).m7507e(1653).m7503a());
    }

    @Override // p209q2.InterfaceC4295c
    /* renamed from: d */
    public final AbstractC3263l<Void> mo17678d() {
        m20272q().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<AbstractC5511f> it = AbstractC5511f.m20281c().iterator();
        while (it.hasNext()) {
            it.next().m20286f();
        }
        C1350c.m7465a();
        return m20271p(AbstractC1352d.m7497a().m7506d(C4225b0.f17414b).m7504b(new InterfaceC5620k() { // from class: p3.r
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                C4267z.this.m17683z((C4223a0) obj, (C3265m) obj2);
            }
        }).m7505c(false).m7507e(1554).m7503a());
    }

    @Override // p209q2.InterfaceC4295c
    /* renamed from: e */
    public final SignInCredential mo17679e(Intent intent) throws C5507b {
        if (intent != null) {
            Status status = (Status) C0030c.m224b(intent, "status", Status.CREATOR);
            if (status != null) {
                if (status.m7410B()) {
                    SignInCredential signInCredential = (SignInCredential) C0030c.m224b(intent, "sign_in_credential", SignInCredential.CREATOR);
                    if (signInCredential != null) {
                        return signInCredential;
                    }
                    throw new C5507b(Status.f6127v);
                }
                throw new C5507b(status);
            }
            throw new C5507b(Status.f6129x);
        }
        throw new C5507b(Status.f6127v);
    }

    @Override // p209q2.InterfaceC4295c
    /* renamed from: f */
    public final AbstractC3263l<BeginSignInResult> mo17680f(BeginSignInRequest beginSignInRequest) {
        C5984j.m21286j(beginSignInRequest);
        BeginSignInRequest.C1319a m7241D = BeginSignInRequest.m7241D(beginSignInRequest);
        m7241D.m7287g(this.f17454k);
        final BeginSignInRequest m7281a = m7241D.m7281a();
        return m20269n(AbstractC1352d.m7497a().m7506d(C4225b0.f17413a).m7504b(new InterfaceC5620k() { // from class: p3.p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p308y2.InterfaceC5620k
            /* renamed from: a */
            public final void mo6178a(Object obj, Object obj2) {
                C4267z c4267z = C4267z.this;
                BeginSignInRequest beginSignInRequest2 = m7281a;
                ((C4242k) ((C4223a0) obj).m7646D()).m17670n(new BinderC4263v(c4267z, (C3265m) obj2), (BeginSignInRequest) C5984j.m21286j(beginSignInRequest2));
            }
        }).m7505c(false).m7507e(1553).m7503a());
    }

    @Override // p209q2.InterfaceC4295c
    /* renamed from: i */
    public final String mo17681i(Intent intent) throws C5507b {
        if (intent != null) {
            Status status = (Status) C0030c.m224b(intent, "status", Status.CREATOR);
            if (status != null) {
                if (status.m7410B()) {
                    String stringExtra = intent.getStringExtra("phone_number_hint_result");
                    if (stringExtra != null) {
                        return stringExtra;
                    }
                    throw new C5507b(Status.f6127v);
                }
                throw new C5507b(status);
            }
            throw new C5507b(Status.f6129x);
        }
        throw new C5507b(Status.f6127v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final /* synthetic */ void m17682y(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, C4223a0 c4223a0, C3265m c3265m) throws RemoteException {
        ((C4242k) c4223a0.m7646D()).m17667J0(new BinderC4266y(this, c3265m), getPhoneNumberHintIntentRequest, this.f17454k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final /* synthetic */ void m17683z(C4223a0 c4223a0, C3265m c3265m) throws RemoteException {
        ((C4242k) c4223a0.m7646D()).m17669L0(new BinderC4264w(this, c3265m), this.f17454k);
    }

    public C4267z(Context context, C4300h c4300h) {
        super(context, (C5506a<C4300h>) f17453n, c4300h, AbstractC5510e.a.f20550c);
        this.f17454k = C4227c0.m17654a();
    }
}
