package p179n9;

import android.content.Context;
import android.os.Build;
import p191o9.C4155c;
import p191o9.C4162j;
import p191o9.InterfaceC4153a;
import p191o9.InterfaceC4157e;
import p193ob.C4171d0;
import p302x9.C5570a;

/* renamed from: n9.g */
/* loaded from: classes.dex */
public class C4083g {

    /* renamed from: a */
    private static String f16566a;

    /* renamed from: b */
    private static C4078b f16567b;

    /* renamed from: c */
    private static C4171d0 f16568c;

    /* renamed from: d */
    private static InterfaceC4157e f16569d;

    /* renamed from: e */
    private static InterfaceC4082f f16570e = new C4077a();

    /* renamed from: f */
    private static InterfaceC4080d f16571f;

    /* renamed from: a */
    public static String m16976a(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12) {
        return new C4085i().m16997k(C5570a.m20472b()).m16999m(C5570a.m20475e(context)).m16993g(C5570a.m20474d(context)).m16992f(C5570a.m20473c(context)).m16990d(C5570a.m20471a(z10)).m16987a(Build.VERSION.RELEASE).m17001o(str2).m17000n(str).m16991e(str3).m16988b(str4).m16996j(z10).m16995i(z11).m16994h(z12).m16989c();
    }

    /* renamed from: b */
    public static C4171d0 m16977b() {
        if (f16568c == null) {
            synchronized (C4083g.class) {
                if (f16568c == null) {
                    if (f16569d == null) {
                        f16569d = new C4155c();
                    }
                    f16568c = f16569d.mo17230a();
                }
            }
        }
        return f16568c;
    }

    /* renamed from: c */
    public static C4078b m16978c() {
        return f16567b;
    }

    /* renamed from: d */
    public static InterfaceC4080d m16979d() {
        if (f16571f == null) {
            synchronized (C4083g.class) {
                if (f16571f == null) {
                    f16571f = f16570e.mo16965a();
                }
            }
        }
        return f16571f;
    }

    /* renamed from: e */
    public static String m16980e() {
        return f16566a;
    }

    /* renamed from: f */
    public static void m16981f(InterfaceC4153a interfaceC4153a) {
        C4162j.m17254b(interfaceC4153a);
    }

    /* renamed from: g */
    public static void m16982g(C4078b c4078b) {
        f16567b = c4078b;
    }

    /* renamed from: h */
    public static void m16983h(InterfaceC4157e interfaceC4157e) {
        f16569d = interfaceC4157e;
    }

    /* renamed from: i */
    public static void m16984i(InterfaceC4082f interfaceC4082f) {
        f16570e = interfaceC4082f;
        synchronized (C4083g.class) {
            f16571f = null;
        }
    }

    /* renamed from: j */
    public static void m16985j(String str) {
        f16566a = str;
    }
}
