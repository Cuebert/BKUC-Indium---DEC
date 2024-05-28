package p258u2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1389c;
import java.util.Iterator;
import p198p3.C4227c0;
import p295x2.AbstractC5511f;
import p321z2.C5968b;

/* renamed from: u2.g */
/* loaded from: classes.dex */
public final class C4825g extends AbstractC1389c {

    /* renamed from: I */
    private final GoogleSignInOptions f18701I;

    public C4825g(Context context, Looper looper, C5968b c5968b, GoogleSignInOptions googleSignInOptions, AbstractC5511f.a aVar, AbstractC5511f.b bVar) {
        super(context, looper, 91, c5968b, aVar, bVar);
        GoogleSignInOptions.C1332a c1332a;
        if (googleSignInOptions != null) {
            c1332a = new GoogleSignInOptions.C1332a(googleSignInOptions);
        } else {
            c1332a = new GoogleSignInOptions.C1332a();
        }
        c1332a.m7363e(C4227c0.m17654a());
        if (!c5968b.m21242d().isEmpty()) {
            Iterator<Scope> it = c5968b.m21242d().iterator();
            while (it.hasNext()) {
                c1332a.m7362d(it.next(), new Scope[0]);
            }
        }
        this.f18701I = c1332a.m7359a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return C1381d.f6259a;
    }

    /* renamed from: m0 */
    public final GoogleSignInOptions m19018m0() {
        return this.f18701I;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4837s ? (C4837s) queryLocalInterface : new C4837s(iBinder);
    }
}
