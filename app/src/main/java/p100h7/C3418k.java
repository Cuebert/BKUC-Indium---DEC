package p100h7;

import p179n9.C4083g;
import p191o9.C4155c;
import p193ob.C4171d0;

/* renamed from: h7.k */
/* loaded from: classes.dex */
public class C3418k {

    /* renamed from: d */
    private static C3418k f14292d;

    /* renamed from: a */
    private C4171d0 f14293a;

    /* renamed from: b */
    private int f14294b = 5;

    /* renamed from: c */
    private int f14295c = 5;

    /* renamed from: a */
    public static C3418k m15032a() {
        if (f14292d == null) {
            synchronized (C3418k.class) {
                if (f14292d == null) {
                    f14292d = new C3418k();
                }
            }
        }
        return f14292d;
    }

    /* renamed from: b */
    public C4171d0 m15033b() {
        if (this.f14293a == null) {
            this.f14293a = new C4155c(null, this.f14294b, this.f14295c, C4083g.m16980e()).mo17230a();
        }
        return this.f14293a;
    }
}
