package p017b3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC1389c;
import p222r3.C4425d;
import p308y2.InterfaceC5606d;
import p308y2.InterfaceC5618j;
import p321z2.C5968b;
import p321z2.C5994o;

/* renamed from: b3.e */
/* loaded from: classes.dex */
public final class C0986e extends AbstractC1389c<C0982a> {

    /* renamed from: I */
    private final C5994o f5173I;

    public C0986e(Context context, Looper looper, C5968b c5968b, C5994o c5994o, InterfaceC5606d interfaceC5606d, InterfaceC5618j interfaceC5618j) {
        super(context, looper, 270, c5968b, interfaceC5606d, interfaceC5618j);
        this.f5173I = c5994o;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: A */
    protected final Bundle mo6181A() {
        return this.f5173I.m21303b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: I */
    protected final boolean mo6184I() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ IInterface mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C0982a ? (C0982a) queryLocalInterface : new C0982a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: v */
    public final Feature[] mo6187v() {
        return C4425d.f18009b;
    }
}
