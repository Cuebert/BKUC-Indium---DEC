package p258u2;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: u2.n */
/* loaded from: classes.dex */
public final class C4832n {

    /* renamed from: d */
    private static C4832n f18705d;

    /* renamed from: a */
    final C4820b f18706a;

    /* renamed from: b */
    GoogleSignInAccount f18707b;

    /* renamed from: c */
    GoogleSignInOptions f18708c;

    private C4832n(Context context) {
        C4820b m19005b = C4820b.m19005b(context);
        this.f18706a = m19005b;
        this.f18707b = m19005b.m19008c();
        this.f18708c = m19005b.m19009d();
    }

    /* renamed from: a */
    public static synchronized C4832n m19022a(Context context) {
        C4832n m19023d;
        synchronized (C4832n.class) {
            m19023d = m19023d(context.getApplicationContext());
        }
        return m19023d;
    }

    /* renamed from: d */
    private static synchronized C4832n m19023d(Context context) {
        synchronized (C4832n.class) {
            C4832n c4832n = f18705d;
            if (c4832n != null) {
                return c4832n;
            }
            C4832n c4832n2 = new C4832n(context);
            f18705d = c4832n2;
            return c4832n2;
        }
    }

    /* renamed from: b */
    public final synchronized void m19024b() {
        this.f18706a.m19007a();
        this.f18707b = null;
        this.f18708c = null;
    }

    /* renamed from: c */
    public final synchronized void m19025c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f18706a.m19011f(googleSignInAccount, googleSignInOptions);
        this.f18707b = googleSignInAccount;
        this.f18708c = googleSignInOptions;
    }
}
