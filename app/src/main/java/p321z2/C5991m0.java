package p321z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import p004a3.C0028a;

/* renamed from: z2.m0 */
/* loaded from: classes.dex */
public final class C5991m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m167A = C0028a.m167A(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m167A) {
            int m187r = C0028a.m187r(parcel);
            switch (C0028a.m181l(m187r)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C0028a.m174e(parcel, m187r, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z10 = C0028a.m182m(parcel, m187r);
                    break;
                case 3:
                    z11 = C0028a.m182m(parcel, m187r);
                    break;
                case 4:
                    iArr = C0028a.m173d(parcel, m187r);
                    break;
                case 5:
                    i10 = C0028a.m189t(parcel, m187r);
                    break;
                case 6:
                    iArr2 = C0028a.m173d(parcel, m187r);
                    break;
                default:
                    C0028a.m195z(parcel, m187r);
                    break;
            }
        }
        C0028a.m180k(parcel, m167A);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
