package p295x2;

import com.google.android.gms.common.api.Status;
import p308y2.C5624n;
import p321z2.C5984j;

/* renamed from: x2.i */
/* loaded from: classes.dex */
public final class C5514i {
    /* renamed from: a */
    public static <R extends InterfaceC5518m> AbstractC5513h<R> m20287a(R r10, AbstractC5511f abstractC5511f) {
        C5984j.m21287k(r10, "Result must not be null");
        C5984j.m21278b(!r10.mo7413q().m7410B(), "Status code must not be SUCCESS");
        C5523r c5523r = new C5523r(abstractC5511f, r10);
        c5523r.m7426g(r10);
        return c5523r;
    }

    /* renamed from: b */
    public static AbstractC5513h<Status> m20288b(Status status, AbstractC5511f abstractC5511f) {
        C5984j.m21287k(status, "Result must not be null");
        C5624n c5624n = new C5624n(abstractC5511f);
        c5624n.m7426g(status);
        return c5624n;
    }
}
