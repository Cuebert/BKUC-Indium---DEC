package p179n9;

import android.graphics.Point;
import java.util.Locale;

/* renamed from: n9.i */
/* loaded from: classes.dex */
public class C4085i {

    /* renamed from: a */
    int f16586a;

    /* renamed from: b */
    Point f16587b;

    /* renamed from: c */
    Point f16588c;

    /* renamed from: d */
    Point f16589d;

    /* renamed from: e */
    String f16590e;

    /* renamed from: f */
    String f16591f;

    /* renamed from: g */
    String f16592g;

    /* renamed from: h */
    String f16593h;

    /* renamed from: i */
    String f16594i;

    /* renamed from: j */
    String f16595j;

    /* renamed from: k */
    boolean f16596k;

    /* renamed from: l */
    boolean f16597l;

    /* renamed from: m */
    boolean f16598m;

    /* renamed from: a */
    public C4085i m16987a(String str) {
        this.f16591f = str;
        return this;
    }

    /* renamed from: b */
    public C4085i m16988b(String str) {
        this.f16595j = str;
        return this;
    }

    /* renamed from: c */
    public String m16989c() {
        String str = this.f16598m ? "VR" : this.f16596k ? "Phone" : "Tablet";
        Locale locale = Locale.ROOT;
        String str2 = this.f16595j;
        String format = String.format(locale, "Mozilla/5.0 (%dMB; %dx%d; %dx%d; %dx%d; %s; %s) %s (KHTML, like Gecko)  ROBLOX Android App %s %s Hybrid()  %s", Integer.valueOf(this.f16586a), Integer.valueOf(this.f16587b.x), Integer.valueOf(this.f16587b.y), Integer.valueOf(this.f16588c.x), Integer.valueOf(this.f16588c.y), Integer.valueOf(this.f16589d.x), Integer.valueOf(this.f16589d.y), m16998l(this.f16590e), this.f16591f, this.f16592g, this.f16593h, str, String.format(locale, "%s RobloxApp/%s (%s; %s)", str2, this.f16593h, this.f16594i, str2));
        if (!this.f16597l) {
            return format;
        }
        return format + " ChromeOS";
    }

    /* renamed from: d */
    public C4085i m16990d(String str) {
        this.f16590e = str;
        return this;
    }

    /* renamed from: e */
    public C4085i m16991e(String str) {
        this.f16594i = str;
        return this;
    }

    /* renamed from: f */
    public C4085i m16992f(Point point) {
        this.f16589d = point;
        return this;
    }

    /* renamed from: g */
    public C4085i m16993g(Point point) {
        this.f16588c = point;
        return this;
    }

    /* renamed from: h */
    public C4085i m16994h(boolean z10) {
        this.f16597l = z10;
        return this;
    }

    /* renamed from: i */
    public C4085i m16995i(boolean z10) {
        this.f16596k = z10;
        return this;
    }

    /* renamed from: j */
    public C4085i m16996j(boolean z10) {
        this.f16598m = z10;
        return this;
    }

    /* renamed from: k */
    public C4085i m16997k(int i10) {
        this.f16586a = i10;
        return this;
    }

    /* renamed from: l */
    public String m16998l(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt > 31 && charAt < 127) {
                sb2.append(charAt);
            } else {
                sb2.append('_');
            }
        }
        return sb2.toString();
    }

    /* renamed from: m */
    public C4085i m16999m(Point point) {
        this.f16587b = point;
        return this;
    }

    /* renamed from: n */
    public C4085i m17000n(String str) {
        this.f16593h = str;
        return this;
    }

    /* renamed from: o */
    public C4085i m17001o(String str) {
        this.f16592g = str;
        return this;
    }
}
