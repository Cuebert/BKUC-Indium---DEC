package p198p3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC1389c;
import p209q2.C4300h;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p321z2.C5968b;

/* renamed from: p3.a0 */
/* loaded from: classes.dex */
public final class C4223a0 extends AbstractC1389c {

    /* renamed from: I */
    private final Bundle f17412I;

    public C4223a0(Context context, Looper looper, C4300h c4300h, C5968b c5968b, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
        super(context, looper, 212, c5968b, interfaceC5606d, interfaceC5618j);
        this.f17412I = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        return this.f17412I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: I */
    protected final boolean mo6184I() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: S */
    public final boolean mo7658S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof C4242k ? (C4242k) queryLocalInterface : new C4242k(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: v */
    public final Feature[] mo6187v() {
        return C4225b0.f17421i;
    }
}
