package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.f */
/* loaded from: classes.dex */
public final class C0627f {

    /* renamed from: b */
    private static final C0627f f3388b = m3350a(new Locale[0]);

    /* renamed from: a */
    private final InterfaceC0629h f3389a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.os.f$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static LocaleList m3355a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m3356b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m3357c() {
            return LocaleList.getDefault();
        }
    }

    private C0627f(InterfaceC0629h interfaceC0629h) {
        this.f3389a = interfaceC0629h;
    }

    /* renamed from: a */
    public static C0627f m3350a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m3352e(a.m3355a(localeArr));
        }
        return new C0627f(new C0628g(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Locale m3351b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: e */
    public static C0627f m3352e(LocaleList localeList) {
        return new C0627f(new C0630i(localeList));
    }

    /* renamed from: c */
    public Locale m3353c(int i10) {
        return this.f3389a.get(i10);
    }

    /* renamed from: d */
    public int m3354d() {
        return this.f3389a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0627f) && this.f3389a.equals(((C0627f) obj).f3389a);
    }

    public int hashCode() {
        return this.f3389a.hashCode();
    }

    public String toString() {
        return this.f3389a.toString();
    }
}
