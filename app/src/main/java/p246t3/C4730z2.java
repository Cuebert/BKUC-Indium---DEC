package p246t3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC1389c;
import p137k3.C3756b;
import p295x2.AbstractC5511f;
import p321z2.C5968b;

/* renamed from: t3.z2 */
/* loaded from: classes.dex */
public final class C4730z2 extends AbstractC1389c {
    public C4730z2(Context context, Looper looper, C5968b c5968b, AbstractC5511f.a aVar, AbstractC5511f.b bVar) {
        super(context, looper, 148, c5968b, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: S */
    public final boolean mo7658S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return 13000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof C4637c3 ? (C4637c3) queryLocalInterface : new C4637c3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: v */
    public final Feature[] mo6187v() {
        return new Feature[]{C3756b.f15744h, C3756b.f15743g};
    }
}
