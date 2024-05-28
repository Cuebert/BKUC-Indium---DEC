package p288w8;

import android.content.Context;
import com.roblox.client.C2877p0;
import java.util.concurrent.atomic.AtomicBoolean;
import p035c9.C1145e;
import p100h7.C3426s;
import p179n9.C4078b;
import p179n9.C4083g;
import p191o9.C4155c;
import p262u6.C4868d;

/* renamed from: w8.m */
/* loaded from: classes.dex */
public class C5478m {

    /* renamed from: a */
    private static AtomicBoolean f20440a = new AtomicBoolean(false);

    /* renamed from: a */
    private static C4078b m20175a() {
        C1145e c1145e = new C1145e();
        String m12864G = C2877p0.m12864G();
        String m12860E = C2877p0.m12860E();
        return new C4078b(C2877p0.m12872K(), c1145e.m6693b(m12864G), m12860E != null ? c1145e.m6693b(m12860E) : "api");
    }

    /* renamed from: b */
    public static void m20176b(Context context) {
        if (f20440a.compareAndSet(false, true)) {
            C4083g.m16985j(C2877p0.m12903Z0());
            C4083g.m16982g(m20175a());
            C4083g.m16981f(new C3426s());
            C4083g.m16983h(new C4155c());
        }
    }

    /* renamed from: c */
    public static void m20177c(Context context) {
        C2877p0.m12923g0(context, new C4868d(context).m19064a(context));
    }
}
