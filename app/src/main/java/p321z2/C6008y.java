package p321z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import p004a3.C0028a;

/* renamed from: z2.y */
/* loaded from: classes.dex */
public final class C6008y implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MethodInvocation createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 2:
                    i11 = C0028a.m189t(parcel, m187r);
                    break;
                case 3:
                    i12 = C0028a.m189t(parcel, m187r);
                    break;
                case 4:
                    j10 = C0028a.m191v(parcel, m187r);
                    break;
                case 5:
                    j11 = C0028a.m191v(parcel, m187r);
                    break;
                case 6:
                    str = C0028a.m175f(parcel, m187r);
                    break;
                case 7:
                    str2 = C0028a.m175f(parcel, m187r);
                    break;
                case 8:
                    i13 = C0028a.m189t(parcel, m187r);
                    break;
                case 9:
                    i14 = C0028a.m189t(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new MethodInvocation(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
