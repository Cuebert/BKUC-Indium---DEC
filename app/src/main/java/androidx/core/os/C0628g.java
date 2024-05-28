package androidx.core.os;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.os.g */
/* loaded from: classes.dex */
public final class C0628g implements InterfaceC0629h {

    /* renamed from: c */
    private static final Locale[] f3390c = new Locale[0];

    /* renamed from: d */
    private static final Locale f3391d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f3392e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f3393f = C0627f.m3351b("en-Latn");

    /* renamed from: a */
    private final Locale[] f3394a;

    /* renamed from: b */
    private final String f3395b;

    public C0628g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3394a = f3390c;
            this.f3395b = BuildConfig.FLAVOR;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m3358b(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f3394a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f3395b = sb2.toString();
    }

    /* renamed from: b */
    static void m3358b(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb2.append('-');
        sb2.append(locale.getCountry());
    }

    @Override // androidx.core.os.InterfaceC0629h
    /* renamed from: a */
    public Object mo3359a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0628g)) {
            return false;
        }
        Locale[] localeArr = ((C0628g) obj).f3394a;
        if (this.f3394a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3394a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.InterfaceC0629h
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f3394a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f3394a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override // androidx.core.os.InterfaceC0629h
    public int size() {
        return this.f3394a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f3394a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f3394a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
