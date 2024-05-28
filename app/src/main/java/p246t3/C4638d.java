package p246t3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1389c;
import p295x2.AbstractC5511f;
import p321z2.C5968b;

/* renamed from: t3.d */
/* loaded from: classes.dex */
public final class C4638d extends AbstractC1389c {
    public C4638d(Context context, Looper looper, C5968b c5968b, AbstractC5511f.a aVar, AbstractC5511f.b bVar) {
        super(context, looper, 119, c5968b, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return queryLocalInterface instanceof C4642d3 ? (C4642d3) queryLocalInterface : new C4642d3(iBinder);
    }
}
