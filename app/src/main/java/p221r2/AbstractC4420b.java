package p221r2;

import android.content.Context;
import p085g4.AbstractC3263l;
import p210q3.C4310i;
import p295x2.AbstractC5510e;
import p295x2.C5506a;

/* renamed from: r2.b */
/* loaded from: classes.dex */
public abstract class AbstractC4420b extends AbstractC5510e<C5506a.d.c> {

    /* renamed from: k */
    private static final C5506a.g<C4310i> f18002k;

    /* renamed from: l */
    private static final C5506a.a<C4310i, C5506a.d.c> f18003l;

    /* renamed from: m */
    private static final C5506a<C5506a.d.c> f18004m;

    static {
        C5506a.g<C4310i> gVar = new C5506a.g<>();
        f18002k = gVar;
        C4421c c4421c = new C4421c();
        f18003l = c4421c;
        f18004m = new C5506a<>("SmsRetriever.API", c4421c, gVar);
    }

    public AbstractC4420b(Context context) {
        super(context, f18004m, C5506a.d.f20537m, AbstractC5510e.a.f20550c);
    }

    /* renamed from: y */
    public abstract AbstractC3263l<Void> mo17817y();
}
