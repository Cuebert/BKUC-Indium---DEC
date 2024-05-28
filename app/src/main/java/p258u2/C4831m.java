package p258u2;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1350c;
import java.util.Iterator;
import p029c3.C1127a;
import p295x2.AbstractC5511f;
import p295x2.AbstractC5513h;
import p295x2.C5514i;

/* renamed from: u2.m */
/* loaded from: classes.dex */
public final class C4831m {

    /* renamed from: a */
    private static final C1127a f18704a = new C1127a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static AbstractC5513h m19019a(AbstractC5511f abstractC5511f, Context context, boolean z10) {
        f18704a.m6515a("Revoking access", new Object[0]);
        String m19010e = C4820b.m19005b(context).m19010e();
        m19021c(context);
        if (z10) {
            return RunnableC4822d.m19017a(m19010e);
        }
        return abstractC5511f.mo20283b(new C4829k(abstractC5511f));
    }

    /* renamed from: b */
    public static AbstractC5513h m19020b(AbstractC5511f abstractC5511f, Context context, boolean z10) {
        f18704a.m6515a("Signing out", new Object[0]);
        m19021c(context);
        if (z10) {
            return C5514i.m20288b(Status.f6125t, abstractC5511f);
        }
        return abstractC5511f.mo20283b(new C4827i(abstractC5511f));
    }

    /* renamed from: c */
    private static void m19021c(Context context) {
        C4832n.m19022a(context).m19024b();
        Iterator<AbstractC5511f> it = AbstractC5511f.m20281c().iterator();
        while (it.hasNext()) {
            it.next().m20286f();
        }
        C1350c.m7465a();
    }
}
