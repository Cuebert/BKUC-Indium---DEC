package p202p7;

import android.content.Context;
import p023b9.C1079c;
import p035c9.C1151k;
import p091gc.C3348t;
import p091gc.InterfaceC3330b;
import p091gc.InterfaceC3332d;
import p130j9.InterfaceC3672a;
import p179n9.C4083g;
import p193ob.AbstractC4183j0;
import p300x7.C5565g;

/* renamed from: p7.b */
/* loaded from: classes.dex */
public class C4275b implements InterfaceC3672a {

    /* renamed from: a */
    private static String f17467a;

    /* renamed from: p7.b$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC3332d<AbstractC4183j0> {
        a() {
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: a */
        public void mo12980a(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, C3348t<AbstractC4183j0> c3348t) {
            C1151k.m6707a("rbx.jni", "sendSessionReport() success:" + c3348t.m14735f());
        }

        @Override // p091gc.InterfaceC3332d
        /* renamed from: b */
        public void mo12981b(InterfaceC3330b<AbstractC4183j0> interfaceC3330b, Throwable th) {
        }
    }

    public C4275b(Context context) {
        f17467a = context.getFilesDir().getAbsolutePath();
    }

    @Override // p130j9.InterfaceC3672a
    /* renamed from: a */
    public String mo15613a() {
        return Long.toString(C5565g.m20445e().m20458g());
    }

    @Override // p130j9.InterfaceC3672a
    /* renamed from: b */
    public String mo15614b() {
        return f17467a;
    }

    @Override // p130j9.InterfaceC3672a
    /* renamed from: c */
    public String mo15615c() {
        return C1079c.m6380c().m6390k();
    }

    @Override // p130j9.InterfaceC3672a
    /* renamed from: d */
    public String mo15616d() {
        return "2.622.471";
    }

    @Override // p130j9.InterfaceC3672a
    /* renamed from: e */
    public void mo15617e(String str, String str2) {
        long j10;
        try {
            j10 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            C1151k.m6716j("rbx.jni", "sendSessionReport() could not parse placeId");
            j10 = -1;
        }
        C4083g.m16979d().mo16968a().m18292a(j10, str).mo14636W(new a());
    }

    @Override // p130j9.InterfaceC3672a
    /* renamed from: f */
    public void mo15618f(String str, String str2, String str3, long j10) {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
