package p210q3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC1389c;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p321z2.C5968b;

/* renamed from: q3.i */
/* loaded from: classes.dex */
public final class C4310i extends AbstractC1389c<C4307f> {
    public C4310i(Context context, Looper looper, C5968b c5968b, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
        super(context, looper, 126, c5968b, interfaceC5606d, interfaceC5618j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: S */
    public final boolean mo7658S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return C1381d.f6259a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof C4307f) {
            return (C4307f) queryLocalInterface;
        }
        return new C4307f(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: v */
    public final Feature[] mo6187v() {
        return C4304c.f17535e;
    }
}
