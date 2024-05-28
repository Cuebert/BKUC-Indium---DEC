package p150l3;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p246t3.AbstractBinderC4627a3;
import p308y2.C5625o;

/* renamed from: l3.c */
/* loaded from: classes.dex */
final class BinderC3872c extends AbstractBinderC4627a3 {

    /* renamed from: c */
    final /* synthetic */ C3265m f16110c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3872c(C3870a c3870a, C3265m c3265m) {
        this.f16110c = c3265m;
    }

    @Override // p246t3.InterfaceC4632b3
    /* renamed from: n0 */
    public final void mo16474n0(Status status, PendingIntent pendingIntent) throws RemoteException {
        C5625o.m20649b(status, pendingIntent, this.f16110c);
    }
}
