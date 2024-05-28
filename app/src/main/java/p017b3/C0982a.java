package p017b3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import p222r3.C4422a;
import p222r3.C4424c;

/* renamed from: b3.a */
/* loaded from: classes.dex */
public final class C0982a extends C4422a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0982a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: J0 */
    public final void m6177J0(TelemetryData telemetryData) throws RemoteException {
        Parcel m18222i = m18222i();
        C4424c.m18226b(m18222i, telemetryData);
        m18224n(1, m18222i);
    }
}
