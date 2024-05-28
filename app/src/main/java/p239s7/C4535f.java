package p239s7;

import java.util.ArrayList;
import java.util.Iterator;
import p035c9.C1152l;

/* renamed from: s7.f */
/* loaded from: classes.dex */
public class C4535f {

    /* renamed from: c */
    private static ArrayList<C4535f> f18292c;

    /* renamed from: d */
    public static C4535f f18293d = new C4535f("en_us", "en");

    /* renamed from: e */
    public static C4535f f18294e = new C4535f("es_es", "es");

    /* renamed from: f */
    public static C4535f f18295f = new C4535f("fr_fr", "fr");

    /* renamed from: g */
    public static C4535f f18296g = new C4535f("it_it", "it");

    /* renamed from: a */
    private String f18297a;

    /* renamed from: b */
    private String f18298b;

    static {
        ArrayList<C4535f> arrayList = new ArrayList<>();
        f18292c = arrayList;
        arrayList.add(f18293d);
        f18292c.add(f18294e);
        f18292c.add(f18295f);
        f18292c.add(f18296g);
        f18292c.add(new C4535f("de_de", "de"));
        f18292c.add(new C4535f("id_id", "id"));
        f18292c.add(new C4535f("ja_jp", "ja"));
        f18292c.add(new C4535f("ko_kr", "ko"));
        f18292c.add(new C4535f("pt_br", "pt"));
        f18292c.add(new C4535f("ru_ru", "ru"));
        f18292c.add(new C4535f("th_th", "th"));
        f18292c.add(new C4535f("tr_tr", "tr"));
        f18292c.add(new C4535f("vi_vn", "vi"));
        f18292c.add(new C4535f("zh_tw", "zh_TW"));
        if (C1152l.m6736g()) {
            f18292c.add(new C4535f("zh_cjv", "zh_CN"));
        } else {
            f18292c.add(new C4535f("zh_cn", "zh_CN"));
        }
    }

    private C4535f(String str, String str2) {
        this.f18297a = str;
        this.f18298b = str2;
    }

    /* renamed from: a */
    public static C4535f m18583a(String str) {
        Iterator<C4535f> it = f18292c.iterator();
        while (it.hasNext()) {
            C4535f next = it.next();
            if (next.m18585c().equals(str) || next.m18585c().equals(str.split("_")[0])) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C4535f m18584b(String str) {
        Iterator<C4535f> it = f18292c.iterator();
        while (it.hasNext()) {
            C4535f next = it.next();
            if (next.m18586d().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public String m18585c() {
        return this.f18298b;
    }

    /* renamed from: d */
    public String m18586d() {
        return this.f18297a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f18297a + "','" + this.f18298b + "'}";
    }
}
