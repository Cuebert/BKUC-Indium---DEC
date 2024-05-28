package p061e7;

import java.util.HashMap;
import p035c9.C1151k;

/* renamed from: e7.j */
/* loaded from: classes.dex */
public class C3089j {

    /* renamed from: c */
    private static C3089j f12976c;

    /* renamed from: b */
    private HashMap<String, Long> f12978b = new HashMap<>();

    /* renamed from: a */
    private long f12977a = 180000;

    private C3089j() {
    }

    /* renamed from: b */
    public static C3089j m13595b() {
        C3089j c3089j = f12976c;
        if (c3089j != null) {
            return c3089j;
        }
        synchronized (C3089j.class) {
            if (f12976c == null) {
                f12976c = new C3089j();
            }
        }
        return f12976c;
    }

    /* renamed from: a */
    public boolean m13596a(String str) {
        C1151k.m6712f("WebFragmentRefreshHelper", "Checking is refresh is needed. url=" + str);
        if (this.f12978b.containsKey(str)) {
            long longValue = this.f12978b.get(str).longValue();
            this.f12978b.put(str, Long.valueOf(System.currentTimeMillis()));
            r2 = System.currentTimeMillis() - longValue >= this.f12977a;
            C1151k.m6712f("WebFragmentRefreshHelper", "Needs refresh=" + r2);
        }
        return r2;
    }

    /* renamed from: c */
    public void m13597c(String str) {
        this.f12978b.put(str, Long.MAX_VALUE);
    }

    /* renamed from: d */
    public void m13598d(long j10) {
        this.f12977a = j10;
    }
}
