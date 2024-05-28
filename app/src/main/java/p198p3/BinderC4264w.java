package p198p3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p085g4.C3265m;
import p308y2.C5625o;
import p308y2.InterfaceC5608e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p3.w */
/* loaded from: classes.dex */
public final class BinderC4264w extends InterfaceC5608e.a {

    /* renamed from: c */
    final /* synthetic */ C3265m f17448c;

    public BinderC4264w(C4267z c4267z, C3265m c3265m) {
        this.f17448c = c3265m;
    }

    @Override // p308y2.InterfaceC5608e
    /* renamed from: b0 */
    public final void mo17675b0(Status status) throws RemoteException {
        C5625o.m20648a(status, this.f17448c);
    }
}
