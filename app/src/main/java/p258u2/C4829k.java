package p258u2;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p295x2.InterfaceC5518m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u2.k */
/* loaded from: classes.dex */
public final class C4829k extends AbstractC4830l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4829k(AbstractC5511f abstractC5511f) {
        super(abstractC5511f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC5518m mo7423d(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC1348b
    /* renamed from: m */
    protected final /* bridge */ /* synthetic */ void mo7454m(C5506a.b bVar) throws RemoteException {
        C4825g c4825g = (C4825g) bVar;
        ((C4837s) c4825g.m7646D()).m19029n(new BinderC4828j(this), c4825g.m19018m0());
    }
}
