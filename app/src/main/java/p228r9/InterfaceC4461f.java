package p228r9;

import p091gc.InterfaceC3330b;
import p119ic.InterfaceC3571o;
import p119ic.InterfaceC3575s;
import p193ob.AbstractC4183j0;

/* renamed from: r9.f */
/* loaded from: classes.dex */
public interface InterfaceC4461f {
    @InterfaceC3571o("/v1/users/{requesterUserId}/accept-friend-request")
    /* renamed from: a */
    InterfaceC3330b<AbstractC4183j0> m18289a(@InterfaceC3575s("requesterUserId") long j10);

    @InterfaceC3571o("/v1/users/{requesterUserId}/decline-friend-request")
    /* renamed from: b */
    InterfaceC3330b<AbstractC4183j0> m18290b(@InterfaceC3575s("requesterUserId") long j10);
}
