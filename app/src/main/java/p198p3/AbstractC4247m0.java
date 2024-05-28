package p198p3;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.AbstractC1348b;
import p184o2.C4122a;
import p295x2.AbstractC5511f;
import p295x2.C5506a;
import p295x2.InterfaceC5518m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p3.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC4247m0 extends AbstractC1348b {
    public AbstractC4247m0(AbstractC5511f abstractC5511f) {
        super(C4122a.f16817b, abstractC5511f);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1348b, p308y2.InterfaceC5604c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7453a(Object obj) {
        super.m7426g((InterfaceC5518m) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC1348b
    /* renamed from: m */
    protected final /* bridge */ /* synthetic */ void mo7454m(C5506a.b bVar) throws RemoteException {
        C4249n0 c4249n0 = (C4249n0) bVar;
        mo17665r(c4249n0.m7679y(), (C4257r0) c4249n0.m7646D());
    }

    /* renamed from: r */
    protected abstract void mo17665r(Context context, C4257r0 c4257r0) throws DeadObjectException, RemoteException;
}
