package p167m9;

import p024bc.C1100c;

/* renamed from: m9.b */
/* loaded from: classes.dex */
public class C3968b {

    /* renamed from: a */
    private static C1100c f16354a;

    private C3968b() {
    }

    /* renamed from: a */
    public static C1100c m16694a() {
        if (f16354a == null) {
            synchronized (C3968b.class) {
                if (f16354a == null) {
                    f16354a = C1100c.m6456b().m6473a();
                }
            }
        }
        return f16354a;
    }
}
