package p018b4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2174i3;
import com.google.android.gms.measurement.internal.C2219m4;
import p321z2.C5984j;

/* renamed from: b4.i */
/* loaded from: classes.dex */
public final class C0995i {

    /* renamed from: a */
    private final InterfaceC0994h f5177a;

    public C0995i(InterfaceC0994h interfaceC0994h) {
        C5984j.m21286j(interfaceC0994h);
        this.f5177a = interfaceC0994h;
    }

    /* renamed from: a */
    public final void m6225a(Context context, Intent intent) {
        C2219m4 m10096H = C2219m4.m10096H(context, null, null);
        C2174i3 mo9765d = m10096H.mo9765d();
        if (intent == null) {
            mo9765d.m10053w().m9893a("Receiver called with null intent");
            return;
        }
        m10096H.mo9768f();
        String action = intent.getAction();
        mo9765d.m10052v().m9894b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo9765d.m10052v().m9893a("Starting wakeful intent.");
            this.f5177a.mo6224a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            mo9765d.m10053w().m9893a("Install Referrer Broadcasts are deprecated");
        }
    }
}
