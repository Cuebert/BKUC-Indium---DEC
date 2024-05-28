package p283w3;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzml;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzmp;
import p004a3.C0028a;

/* renamed from: w3.db */
/* loaded from: classes.dex */
public final class C5168db implements Parcelable.Creator<zzmp> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmp createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzmi zzmiVar = null;
        zzml zzmlVar = null;
        zzmm zzmmVar = null;
        zzmo zzmoVar = null;
        zzmn zzmnVar = null;
        zzmj zzmjVar = null;
        zzmf zzmfVar = null;
        zzmg zzmgVar = null;
        zzmh zzmhVar = null;
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
                    zzmiVar = (zzmi) C0028a.m174e(parcel, m187r, zzmi.CREATOR);
                    break;
                case 8:
                    zzmlVar = (zzml) C0028a.m174e(parcel, m187r, zzml.CREATOR);
                    break;
                case 9:
                    zzmmVar = (zzmm) C0028a.m174e(parcel, m187r, zzmm.CREATOR);
                    break;
                case 10:
                    zzmoVar = (zzmo) C0028a.m174e(parcel, m187r, zzmo.CREATOR);
                    break;
                case 11:
                    zzmnVar = (zzmn) C0028a.m174e(parcel, m187r, zzmn.CREATOR);
                    break;
                case 12:
                    zzmjVar = (zzmj) C0028a.m174e(parcel, m187r, zzmj.CREATOR);
                    break;
                case 13:
                    zzmfVar = (zzmf) C0028a.m174e(parcel, m187r, zzmf.CREATOR);
                    break;
                case 14:
                    zzmgVar = (zzmg) C0028a.m174e(parcel, m187r, zzmg.CREATOR);
                    break;
                case 15:
                    zzmhVar = (zzmh) C0028a.m174e(parcel, m187r, zzmh.CREATOR);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new zzmp(i10, str, str2, bArr, pointArr, i11, zzmiVar, zzmlVar, zzmmVar, zzmoVar, zzmnVar, zzmjVar, zzmfVar, zzmgVar, zzmhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzmp[] newArray(int i10) {
        return new zzmp[i10];
    }
}
