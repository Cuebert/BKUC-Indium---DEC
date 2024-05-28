package p308y2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p044d4.C2968a;
import p044d4.C2972e;
import p044d4.InterfaceC2973f;
import p058e4.BinderC3065a;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p321z2.C5968b;
import p321z2.C5984j;

/* renamed from: y2.d0 */
/* loaded from: classes.dex */
public final class BinderC5607d0 extends BinderC3065a implements AbstractC5511f.a, AbstractC5511f.b {

    /* renamed from: j */
    private static final C5506a.a<? extends InterfaceC2973f, C2968a> f20779j = C2972e.f12653c;

    /* renamed from: c */
    private final Context f20780c;

    /* renamed from: d */
    private final Handler f20781d;

    /* renamed from: e */
    private final C5506a.a<? extends InterfaceC2973f, C2968a> f20782e;

    /* renamed from: f */
    private final Set<Scope> f20783f;

    /* renamed from: g */
    private final C5968b f20784g;

    /* renamed from: h */
    private InterfaceC2973f f20785h;

    /* renamed from: i */
    private InterfaceC5605c0 f20786i;

    public BinderC5607d0(Context context, Handler handler, C5968b c5968b) {
        C5506a.a<? extends InterfaceC2973f, C2968a> aVar = f20779j;
        this.f20780c = context;
        this.f20781d = handler;
        this.f20784g = (C5968b) C5984j.m21287k(c5968b, "ClientSettings must not be null");
        this.f20783f = c5968b.m21245g();
        this.f20782e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public static /* bridge */ /* synthetic */ void m20624L0(BinderC5607d0 binderC5607d0, zak zakVar) {
        ConnectionResult m10416x = zakVar.m10416x();
        if (m10416x.m7379B()) {
            zav zavVar = (zav) C5984j.m21286j(zakVar.m10417y());
            ConnectionResult m7727x = zavVar.m7727x();
            if (!m7727x.m7379B()) {
                String valueOf = String.valueOf(m7727x);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC5607d0.f20786i.mo7583c(m7727x);
                binderC5607d0.f20785h.mo20258n();
                return;
            }
            binderC5607d0.f20786i.mo7582b(zavVar.m7728y(), binderC5607d0.f20783f);
        } else {
            binderC5607d0.f20786i.mo7583c(m10416x);
        }
        binderC5607d0.f20785h.mo20258n();
    }

    /* renamed from: M0 */
    public final void m20625M0(InterfaceC5605c0 interfaceC5605c0) {
        InterfaceC2973f interfaceC2973f = this.f20785h;
        if (interfaceC2973f != null) {
            interfaceC2973f.mo20258n();
        }
        this.f20784g.m21249k(Integer.valueOf(System.identityHashCode(this)));
        C5506a.a<? extends InterfaceC2973f, C2968a> aVar = this.f20782e;
        Context context = this.f20780c;
        Looper looper = this.f20781d.getLooper();
        C5968b c5968b = this.f20784g;
        this.f20785h = aVar.mo13430a(context, looper, c5968b, c5968b.m21246h(), this, this);
        this.f20786i = interfaceC5605c0;
        Set<Scope> set = this.f20783f;
        if (set != null && !set.isEmpty()) {
            this.f20785h.mo10414p();
        } else {
            this.f20781d.post(new RunnableC5601a0(this));
        }
    }

    /* renamed from: N0 */
    public final void m20626N0() {
        InterfaceC2973f interfaceC2973f = this.f20785h;
        if (interfaceC2973f != null) {
            interfaceC2973f.mo20258n();
        }
    }

    @Override // p058e4.InterfaceC3067c
    /* renamed from: R */
    public final void mo13535R(zak zakVar) {
        this.f20781d.post(new RunnableC5603b0(this, zakVar));
    }

    @Override // p308y2.InterfaceC5606d
    /* renamed from: i */
    public final void mo7566i(int i10) {
        this.f20785h.mo20258n();
    }

    @Override // p308y2.InterfaceC5618j
    /* renamed from: l */
    public final void mo7567l(ConnectionResult connectionResult) {
        this.f20786i.mo7583c(connectionResult);
    }

    @Override // p308y2.InterfaceC5606d
    /* renamed from: n */
    public final void mo7568n(Bundle bundle) {
        this.f20785h.mo10413c(this);
    }
}
