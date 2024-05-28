package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.C1342a;
import com.google.android.gms.common.C1381d;
import com.google.android.gms.dynamite.DynamiteModule;
import p085g4.AbstractC3263l;
import p184o2.C4122a;
import p258u2.C4831m;
import p295x2.AbstractC5510e;
import p308y2.C5600a;
import p321z2.C5982i;

/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes.dex */
public class C1334b extends AbstractC5510e<GoogleSignInOptions> {

    /* renamed from: k */
    private static final C1338f f6094k = new C1338f(null);

    /* renamed from: l */
    static int f6095l = 1;

    public C1334b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C4122a.f16818c, googleSignInOptions, new AbstractC5510e.a.C6062a().m20280c(new C5600a()).m20278a());
    }

    /* renamed from: z */
    private final synchronized int m7366z() {
        int i10;
        i10 = f6095l;
        if (i10 == 1) {
            Context m20272q = m20272q();
            C1342a m7385o = C1342a.m7385o();
            int mo7391h = m7385o.mo7391h(m20272q, C1381d.f6259a);
            if (mo7391h == 0) {
                f6095l = 4;
                i10 = 4;
            } else if (m7385o.mo7387b(m20272q, mo7391h, null) != null || DynamiteModule.m7754a(m20272q, "com.google.android.gms.auth.api.fallback") == 0) {
                f6095l = 2;
                i10 = 2;
            } else {
                f6095l = 3;
                i10 = 3;
            }
        }
        return i10;
    }

    /* renamed from: d */
    public AbstractC3263l<Void> m7367d() {
        return C5982i.m21276c(C4831m.m19020b(m20265j(), m20272q(), m7366z() == 3));
    }

    /* renamed from: y */
    public AbstractC3263l<Void> m7368y() {
        return C5982i.m21276c(C4831m.m19019a(m20265j(), m20272q(), m7366z() == 3));
    }
}
