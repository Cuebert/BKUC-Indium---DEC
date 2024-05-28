package p321z2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: z2.h */
/* loaded from: classes.dex */
public final class C5980h {

    /* renamed from: z2.h$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List f22046a;

        /* renamed from: b */
        private final Object f22047b;

        /* synthetic */ a(Object obj, C5987k0 c5987k0) {
            C5984j.m21286j(obj);
            this.f22047b = obj;
            this.f22046a = new ArrayList();
        }

        /* renamed from: a */
        public a m21272a(String str, Object obj) {
            List list = this.f22046a;
            C5984j.m21286j(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f22047b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f22046a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f22046a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m21268a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m21269b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m21269b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static int m21270c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static a m21271d(Object obj) {
        return new a(obj, null);
    }
}
