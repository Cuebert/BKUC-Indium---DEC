package p258u2;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C1333a;
import com.google.android.gms.auth.api.signin.C1334b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p070f3.C3140n;

/* renamed from: u2.t */
/* loaded from: classes.dex */
public final class BinderC4838t extends AbstractBinderC4833o {

    /* renamed from: c */
    private final Context f18709c;

    public BinderC4838t(Context context) {
        this.f18709c = context;
    }

    /* renamed from: l */
    private final void m19030l() {
        if (C3140n.m13811a(this.f18709c, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // p258u2.InterfaceC4834p
    /* renamed from: B */
    public final void mo19026B() {
        m19030l();
        C4832n.m19022a(this.f18709c).m19024b();
    }

    @Override // p258u2.InterfaceC4834p
    /* renamed from: P */
    public final void mo19027P() {
        m19030l();
        C4820b m19005b = C4820b.m19005b(this.f18709c);
        GoogleSignInAccount m19008c = m19005b.m19008c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f6069y;
        if (m19008c != null) {
            googleSignInOptions = m19005b.m19009d();
        }
        C1334b m7365a = C1333a.m7365a(this.f18709c, googleSignInOptions);
        if (m19008c != null) {
            m7365a.m7368y();
        } else {
            m7365a.m7367d();
        }
    }
}
