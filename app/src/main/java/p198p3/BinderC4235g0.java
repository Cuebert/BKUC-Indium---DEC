package p198p3;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: p3.g0 */
/* loaded from: classes.dex */
final class BinderC4235g0 extends BinderC4231e0 {

    /* renamed from: c */
    final /* synthetic */ C4237h0 f17426c;

    public BinderC4235g0(C4237h0 c4237h0) {
        this.f17426c = c4237h0;
    }

    @Override // p198p3.InterfaceC4255q0
    /* renamed from: g */
    public final void mo17663g(Status status) {
        this.f17426c.m7426g(new C4233f0(status, null));
    }

    @Override // p198p3.BinderC4231e0, p198p3.InterfaceC4255q0
    /* renamed from: m0 */
    public final void mo17661m0(Status status, Credential credential) {
        this.f17426c.m7426g(new C4233f0(status, credential));
    }
}
