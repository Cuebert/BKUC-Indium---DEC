package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC1388b;
import com.google.android.gms.common.internal.AbstractC1389c;
import com.google.android.gms.common.internal.zat;
import p044d4.InterfaceC2973f;
import p058e4.InterfaceC3067c;
import p258u2.C4820b;
import p295x2.AbstractC5511f;
import p321z2.C5968b;
import p321z2.C5984j;

/* renamed from: com.google.android.gms.signin.internal.a */
/* loaded from: classes.dex */
public class C2362a extends AbstractC1389c<C2364c> implements InterfaceC2973f {

    /* renamed from: M */
    public static final /* synthetic */ int f8871M = 0;

    /* renamed from: I */
    private final boolean f8872I;

    /* renamed from: J */
    private final C5968b f8873J;

    /* renamed from: K */
    private final Bundle f8874K;

    /* renamed from: L */
    private final Integer f8875L;

    public C2362a(Context context, Looper looper, boolean z10, C5968b c5968b, Bundle bundle, AbstractC5511f.a aVar, AbstractC5511f.b bVar) {
        super(context, looper, 44, c5968b, aVar, bVar);
        this.f8872I = true;
        this.f8873J = c5968b;
        this.f8874K = bundle;
        this.f8875L = c5968b.m21247i();
    }

    /* renamed from: m0 */
    public static Bundle m10412m0(C5968b c5968b) {
        c5968b.m21246h();
        Integer m21247i = c5968b.m21247i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c5968b.m21239a());
        if (m21247i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m21247i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        if (!m7679y().getPackageName().equals(this.f8873J.m21244f())) {
            this.f8874K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f8873J.m21244f());
        }
        return this.f8874K;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p044d4.InterfaceC2973f
    /* renamed from: c */
    public final void mo10413c(InterfaceC3067c interfaceC3067c) {
        C5984j.m21287k(interfaceC3067c, "Expecting a valid ISignInCallbacks");
        try {
            Account m21241c = this.f8873J.m21241c();
            ((C2364c) m7646D()).m10415J0(new zai(1, new zat(m21241c, ((Integer) C5984j.m21286j(this.f8875L)).intValue(), "<<default account>>".equals(m21241c.name) ? C4820b.m19005b(m7679y()).m19008c() : null)), interfaceC3067c);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC3067c.mo13535R(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return C1381d.f6259a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: o */
    public final boolean mo7672o() {
        return this.f8872I;
    }

    @Override // p044d4.InterfaceC2973f
    /* renamed from: p */
    public final void mo10414p() {
        m7670m(new AbstractC1388b.d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C2364c ? (C2364c) queryLocalInterface : new C2364c(iBinder);
    }
}
