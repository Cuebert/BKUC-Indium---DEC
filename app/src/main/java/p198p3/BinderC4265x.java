package p198p3;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p308y2.C5625o;

/* renamed from: p3.x */
/* loaded from: classes.dex */
final class BinderC4265x extends AbstractBinderC4234g {

    /* renamed from: c */
    final /* synthetic */ C3265m f17449c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4265x(C4267z c4267z, C3265m c3265m) {
        this.f17449c = c3265m;
    }

    @Override // p198p3.InterfaceC4236h
    /* renamed from: h */
    public final void mo17664h(Status status, PendingIntent pendingIntent) throws RemoteException {
        C5625o.m20649b(status, pendingIntent, this.f17449c);
    }
}
