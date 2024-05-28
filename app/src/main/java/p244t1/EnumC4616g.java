package p244t1;

import java.util.HashMap;
import java.util.Map;
import p257u1.C4808a;
import p257u1.C4809b;
import p257u1.C4810c;
import p257u1.C4811d;
import p257u1.C4812e;
import p257u1.C4813f;
import p257u1.C4814g;
import p257u1.C4815h;
import p257u1.C4816i;
import p257u1.C4817j;
import p257u1.C4818k;

/* renamed from: t1.g */
/* loaded from: classes.dex */
public enum EnumC4616g {
    CALLBACK(C4809b.class, 0),
    CANCEL_RESULT_CALLBACK(C4811d.class, 0),
    RUN_JOB(C4816i.class, 0),
    COMMAND(C4812e.class, 0),
    PUBLIC_QUERY(C4815h.class, 0),
    JOB_CONSUMER_IDLE(C4814g.class, 0),
    ADD_JOB(C4808a.class, 1),
    CANCEL(C4810c.class, 1),
    CONSTRAINT_CHANGE(C4813f.class, 2),
    RUN_JOB_RESULT(C4817j.class, 3),
    SCHEDULER(C4818k.class, 4);


    /* renamed from: A */
    static final Map<Class<? extends AbstractC4611b>, EnumC4616g> f18390A = new HashMap();

    /* renamed from: B */
    static final int f18391B;

    /* renamed from: n */
    final Class<? extends AbstractC4611b> f18404n;

    /* renamed from: o */
    final int f18405o;

    static {
        int i10 = 0;
        for (EnumC4616g enumC4616g : values()) {
            f18390A.put(enumC4616g.f18404n, enumC4616g);
            int i11 = enumC4616g.f18405o;
            if (i11 > i10) {
                i10 = i11;
            }
        }
        f18391B = i10;
    }

    EnumC4616g(Class cls, int i10) {
        this.f18404n = cls;
        this.f18405o = i10;
    }
}
