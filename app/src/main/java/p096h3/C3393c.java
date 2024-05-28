package p096h3;

import android.content.Context;

/* renamed from: h3.c */
/* loaded from: classes.dex */
public class C3393c {

    /* renamed from: b */
    private static final C3393c f14201b = new C3393c();

    /* renamed from: a */
    private C3392b f14202a = null;

    /* renamed from: a */
    public static C3392b m14952a(Context context) {
        return f14201b.m14953b(context);
    }

    /* renamed from: b */
    public final synchronized C3392b m14953b(Context context) {
        if (this.f14202a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f14202a = new C3392b(context);
        }
        return this.f14202a;
    }
}
