package p283w3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import p004a3.C0028a;

/* renamed from: w3.vb */
/* loaded from: classes.dex */
public final class C5403vb implements Parcelable.Creator<zzq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzj zzjVar = null;
        zzm zzmVar = null;
        zzn zznVar = null;
        zzp zzpVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzg zzgVar = null;
        zzh zzhVar = null;
        zzi zziVar = null;
        byte[] bArr = null;
        double d10 = 0.0d;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 2:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 3:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 5:
                    i11 = C0028a.m189t(parcel, m187r);
                    break;
                case 6:
                    pointArr = (Point[]) C0028a.m178i(parcel, m187r, Point.CREATOR);
                    break;
                case 7:
                    zzjVar = (zzj) C0028a.m174e(parcel, m187r, zzj.CREATOR);
                    break;
                case 8:
                    zzmVar = (zzm) C0028a.m174e(parcel, m187r, zzm.CREATOR);
                    break;
                case 9:
                    zznVar = (zzn) C0028a.m174e(parcel, m187r, zzn.CREATOR);
                    break;
                case 10:
                    zzpVar = (zzp) C0028a.m174e(parcel, m187r, zzp.CREATOR);
                    break;
                case 11:
                    zzoVar = (zzo) C0028a.m174e(parcel, m187r, zzo.CREATOR);
                    break;
                case 12:
                    zzkVar = (zzk) C0028a.m174e(parcel, m187r, zzk.CREATOR);
                    break;
                case 13:
                    zzgVar = (zzg) C0028a.m174e(parcel, m187r, zzg.CREATOR);
                    break;
                case 14:
                    zzhVar = (zzh) C0028a.m174e(parcel, m187r, zzh.CREATOR);
                    break;
                case 15:
                    zziVar = (zzi) C0028a.m174e(parcel, m187r, zzi.CREATOR);
                    break;
                case 16:
                    bArr = C0028a.m171b(parcel, m187r);
                    break;
                case 17:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 18:
                    d10 = C0028a.m184o(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzq(i10, str, str2, i11, pointArr, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar, bArr, z10, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq[] newArray(int i10) {
        return new zzq[i10];
    }
}
