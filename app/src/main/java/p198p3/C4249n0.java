package p198p3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1389c;
import p184o2.C4122a;
import p295x2.AbstractC5511f;
import p321z2.C5968b;

/* renamed from: p3.n0 */
/* loaded from: classes.dex */
public final class C4249n0 extends AbstractC1389c {

    /* renamed from: I */
    private final C4122a.a f17434I;

    public C4249n0(Context context, Looper looper, C5968b c5968b, C4122a.a aVar, AbstractC5511f.a aVar2, AbstractC5511f.b bVar) {
        super(context, looper, 68, c5968b, aVar2, bVar);
        C4122a.a.C6056a c6056a = new C4122a.a.C6056a(aVar == null ? C4122a.a.f16826q : aVar);
        c6056a.m17126a(C4227c0.m17654a());
        this.f17434I = new C4122a.a(c6056a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        return this.f17434I.m17125a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return 12800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof C4257r0 ? (C4257r0) queryLocalInterface : new C4257r0(iBinder);
    }
}
