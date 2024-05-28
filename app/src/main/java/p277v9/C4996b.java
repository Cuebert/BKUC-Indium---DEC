package p277v9;

import java.io.IOException;
import p035c9.C1151k;
import p091gc.C3348t;

/* renamed from: v9.b */
/* loaded from: classes.dex */
public class C4996b<T> {

    /* renamed from: a */
    public final int f19094a;

    /* renamed from: b */
    public final T f19095b;

    /* renamed from: c */
    private final C4995a f19096c;

    public C4996b(C3348t<T> c3348t) {
        String str;
        this.f19094a = c3348t.m14732b();
        if (c3348t.m14735f()) {
            this.f19095b = c3348t.m14731a();
            this.f19096c = null;
            return;
        }
        if (c3348t.m14733d() != null) {
            try {
                str = c3348t.m14733d().m17462T();
            } catch (IOException unused) {
                str = null;
            }
            try {
                C1151k.m6707a("ApiResponse", "Error message: " + str);
            } catch (IOException unused2) {
                C1151k.m6709c("ApiResponse", "error while parsing response");
                this.f19096c = new C4995a((str != null || str.trim().length() == 0) ? c3348t.m14736g() : str);
                this.f19095b = null;
            }
        } else {
            str = null;
        }
        this.f19096c = new C4995a((str != null || str.trim().length() == 0) ? c3348t.m14736g() : str);
        this.f19095b = null;
    }

    /* renamed from: a */
    public int m19446a() {
        C4995a c4995a = this.f19096c;
        if (c4995a != null) {
            return c4995a.f19089a;
        }
        return -1;
    }

    /* renamed from: b */
    public boolean m19447b() {
        int i10 = this.f19094a;
        return i10 >= 200 && i10 < 300;
    }
}
