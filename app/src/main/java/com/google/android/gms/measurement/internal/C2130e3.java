package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.common.internal.AbstractC1388b;
import p018b4.InterfaceC0990d;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
/* loaded from: classes.dex */
public final class C2130e3 extends AbstractC1388b<InterfaceC0990d> {
    public C2130e3(Context context, Looper looper, AbstractC1388b.a aVar, AbstractC1388b.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: E */
    public final String mo6182E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: F */
    protected final String mo6183F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b, p295x2.C5506a.f
    /* renamed from: h */
    public final int mo6185h() {
        return C1381d.f6259a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1388b
    /* renamed from: s */
    public final /* synthetic */ InterfaceC0990d mo6186s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC0990d ? (InterfaceC0990d) queryLocalInterface : new C2345y2(iBinder);
    }
}
