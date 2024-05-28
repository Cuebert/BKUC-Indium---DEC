package p193ob;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p205pb.C4286e;

/* renamed from: ob.y */
/* loaded from: classes.dex */
public final class C4200y {

    /* renamed from: a */
    private final String[] f17364a;

    /* renamed from: ob.y$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final List<String> f17365a = new ArrayList(20);

        /* renamed from: a */
        public a m17561a(String str, String str2) {
            C4200y.m17551a(str);
            C4200y.m17552b(str2, str);
            return m17564d(str, str2);
        }

        /* renamed from: b */
        public a m17562b(C4200y c4200y) {
            int m17558h = c4200y.m17558h();
            for (int i10 = 0; i10 < m17558h; i10++) {
                m17564d(c4200y.m17556e(i10), c4200y.m17559i(i10));
            }
            return this;
        }

        /* renamed from: c */
        public a m17563c(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return m17564d(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return m17564d(BuildConfig.FLAVOR, str.substring(1));
            }
            return m17564d(BuildConfig.FLAVOR, str);
        }

        /* renamed from: d */
        public a m17564d(String str, String str2) {
            this.f17365a.add(str);
            this.f17365a.add(str2.trim());
            return this;
        }

        /* renamed from: e */
        public C4200y m17565e() {
            return new C4200y(this);
        }

        /* renamed from: f */
        public String m17566f(String str) {
            for (int size = this.f17365a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f17365a.get(size))) {
                    return this.f17365a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: g */
        public a m17567g(String str) {
            int i10 = 0;
            while (i10 < this.f17365a.size()) {
                if (str.equalsIgnoreCase(this.f17365a.get(i10))) {
                    this.f17365a.remove(i10);
                    this.f17365a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        /* renamed from: h */
        public a m17568h(String str, String str2) {
            C4200y.m17551a(str);
            C4200y.m17552b(str2, str);
            m17567g(str);
            m17564d(str, str2);
            return this;
        }
    }

    C4200y(a aVar) {
        List<String> list = aVar.f17365a;
        this.f17364a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    static void m17551a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C4286e.m17753q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    /* renamed from: b */
    static void m17552b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(C4286e.m17753q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: d */
    private static String m17553d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C4200y m17554g(String... strArr) {
        Objects.requireNonNull(strArr, "namesAndValues == null");
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i10 = 0; i10 < strArr2.length; i10++) {
                if (strArr2[i10] != null) {
                    strArr2[i10] = strArr2[i10].trim();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i11 = 0; i11 < strArr2.length; i11 += 2) {
                String str = strArr2[i11];
                String str2 = strArr2[i11 + 1];
                m17551a(str);
                m17552b(str2, str);
            }
            return new C4200y(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    /* renamed from: c */
    public String m17555c(String str) {
        return m17553d(this.f17364a, str);
    }

    /* renamed from: e */
    public String m17556e(int i10) {
        return this.f17364a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4200y) && Arrays.equals(((C4200y) obj).f17364a, this.f17364a);
    }

    /* renamed from: f */
    public a m17557f() {
        a aVar = new a();
        Collections.addAll(aVar.f17365a, this.f17364a);
        return aVar;
    }

    /* renamed from: h */
    public int m17558h() {
        return this.f17364a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f17364a);
    }

    /* renamed from: i */
    public String m17559i(int i10) {
        return this.f17364a[(i10 * 2) + 1];
    }

    /* renamed from: j */
    public List<String> m17560j(String str) {
        int m17558h = m17558h();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < m17558h; i10++) {
            if (str.equalsIgnoreCase(m17556e(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m17559i(i10));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int m17558h = m17558h();
        for (int i10 = 0; i10 < m17558h; i10++) {
            sb2.append(m17556e(i10));
            sb2.append(": ");
            sb2.append(m17559i(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private C4200y(String[] strArr) {
        this.f17364a = strArr;
    }
}
