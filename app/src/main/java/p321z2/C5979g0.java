package p321z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import p110i3.InterfaceC3516a;
import p235s3.C4518a;
import p235s3.C4520c;

/* renamed from: z2.g0 */
/* loaded from: classes.dex */
public final class C5979g0 extends C4518a implements InterfaceC5983i0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5979g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p321z2.InterfaceC5983i0
    /* renamed from: L */
    public final boolean mo21264L(zzs zzsVar, InterfaceC3516a interfaceC3516a) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18543c(m18539l, zzsVar);
        C4520c.m18544d(m18539l, interfaceC3516a);
        Parcel m18538i = m18538i(5, m18539l);
        boolean m18545e = C4520c.m18545e(m18538i);
        m18538i.recycle();
        return m18545e;
    }

    @Override // p321z2.InterfaceC5983i0
    /* renamed from: e */
    public final boolean mo21265e() throws RemoteException {
        Parcel m18538i = m18538i(7, m18539l());
        boolean m18545e = C4520c.m18545e(m18538i);
        m18538i.recycle();
        return m18545e;
    }

    @Override // p321z2.InterfaceC5983i0
    /* renamed from: s */
    public final zzq mo21266s(zzo zzoVar) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18543c(m18539l, zzoVar);
        Parcel m18538i = m18538i(8, m18539l);
        zzq zzqVar = (zzq) C4520c.m18541a(m18538i, zzq.CREATOR);
        m18538i.recycle();
        return zzqVar;
    }

    @Override // p321z2.InterfaceC5983i0
    /* renamed from: w0 */
    public final zzq mo21267w0(zzo zzoVar) throws RemoteException {
        Parcel m18539l = m18539l();
        C4520c.m18543c(m18539l, zzoVar);
        Parcel m18538i = m18538i(6, m18539l);
        zzq zzqVar = (zzq) C4520c.m18541a(m18538i, zzq.CREATOR);
        m18538i.recycle();
        return zzqVar;
    }
}
