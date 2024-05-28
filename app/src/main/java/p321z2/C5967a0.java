package p321z2;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p085g4.C3265m;
import p295x2.AbstractC5513h;
import p321z2.C5982i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z2.a0 */
/* loaded from: classes.dex */
public final class C5967a0 implements AbstractC5513h.a {

    /* renamed from: a */
    final /* synthetic */ AbstractC5513h f22021a;

    /* renamed from: b */
    final /* synthetic */ C3265m f22022b;

    /* renamed from: c */
    final /* synthetic */ C5982i.a f22023c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC5973d0 f22024d;

    public C5967a0(AbstractC5513h abstractC5513h, C3265m c3265m, C5982i.a aVar, InterfaceC5973d0 interfaceC5973d0) {
        this.f22021a = abstractC5513h;
        this.f22022b = c3265m;
        this.f22023c = aVar;
        this.f22024d = interfaceC5973d0;
    }

    @Override // p295x2.AbstractC5513h.a
    /* renamed from: a */
    public final void mo7508a(Status status) {
        if (status.m7410B()) {
            this.f22022b.m14514c(this.f22023c.mo7369a(this.f22021a.mo7422c(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f22022b.m14513b(C5966a.m21238a(status));
        }
    }
}
