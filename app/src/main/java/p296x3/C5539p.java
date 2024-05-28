package p296x3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzq;
import p004a3.C0028a;

/* renamed from: x3.p */
/* loaded from: classes.dex */
public final class C5539p implements Parcelable.Creator<zzq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
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
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 2:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 3:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 4:
                    bArr = C0028a.m171b(parcel, m187r);
                    break;
                case 5:
                    pointArr = (Point[]) C0028a.m178i(parcel, m187r, Point.CREATOR);
                    break;
                case 6:
                    i11 = C0028a.m189t(parcel, m187r);
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
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzq(i10, str, str2, bArr, pointArr, i11, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq[] newArray(int i10) {
        return new zzq[i10];
    }
}
