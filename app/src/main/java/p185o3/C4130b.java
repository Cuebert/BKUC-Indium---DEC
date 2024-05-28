package p185o3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.internal.AbstractC1389c;
import p184o2.C4123b;
import p184o2.C4124c;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p321z2.C5968b;

/* renamed from: o3.b */
/* loaded from: classes.dex */
public final class C4130b extends AbstractC1389c {

    /* renamed from: I */
    private final Bundle f16840I;

    public C4130b(Context context, Looper looper, C5968b c5968b, C4124c c4124c, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
        super(context, looper, 16, c5968b, interfaceC5606d, interfaceC5618j);
        this.f16840I = c4124c == null ? new Bundle() : c4124c.m17127a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        return this.f16840I;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.auth.service.START";
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

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: o */
    public final boolean mo7672o() {
        C5968b m7686j0 = m7686j0();
        return (TextUtils.isEmpty(m7686j0.m21240b()) || m7686j0.m21243e(C4123b.f16832a).isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C4131c ? (C4131c) queryLocalInterface : new C4131c(iBinder);
    }
}
