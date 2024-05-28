package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p004a3.C0029b;
import p110i3.BinderC3517b;
import p110i3.InterfaceC3516a;
import p321z2.AbstractBinderC6001r0;

/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C1422u();

    /* renamed from: n */
    private final String f6427n;

    /* renamed from: o */
    private final AbstractBinderC1415n f6428o;

    /* renamed from: p */
    private final boolean f6429p;

    /* renamed from: q */
    private final boolean f6430q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f6427n = str;
        BinderC1416o binderC1416o = null;
        if (iBinder != null) {
            try {
                InterfaceC3516a mo7733c = AbstractBinderC6001r0.m21306l(iBinder).mo7733c();
                byte[] bArr = mo7733c == null ? null : (byte[]) BinderC3517b.m15329n(mo7733c);
                if (bArr != null) {
                    binderC1416o = new BinderC1416o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f6428o = binderC1416o;
        this.f6429p = z10;
        this.f6430q = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(String str, AbstractBinderC1415n abstractBinderC1415n, boolean z10, boolean z11) {
        this.f6427n = str;
        this.f6428o = abstractBinderC1415n;
        this.f6429p = z10;
        this.f6430q = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m197a = C0029b.m197a(parcel);
        C0029b.m215s(parcel, 1, this.f6427n, false);
        AbstractBinderC1415n abstractBinderC1415n = this.f6428o;
        if (abstractBinderC1415n == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC1415n = null;
        }
        C0029b.m207k(parcel, 2, abstractBinderC1415n, false);
        C0029b.m199c(parcel, 3, this.f6429p);
        C0029b.m199c(parcel, 4, this.f6430q);
        C0029b.m198b(parcel, m197a);
    }
}
