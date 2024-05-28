package p149l2;

import android.util.SparseArray;
import java.util.HashMap;
import p307y1.EnumC5595d;

/* renamed from: l2.a */
/* loaded from: classes.dex */
public final class C3869a {

    /* renamed from: a */
    private static SparseArray<EnumC5595d> f16104a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC5595d, Integer> f16105b;

    static {
        HashMap<EnumC5595d, Integer> hashMap = new HashMap<>();
        f16105b = hashMap;
        hashMap.put(EnumC5595d.DEFAULT, 0);
        f16105b.put(EnumC5595d.VERY_LOW, 1);
        f16105b.put(EnumC5595d.HIGHEST, 2);
        for (EnumC5595d enumC5595d : f16105b.keySet()) {
            f16104a.append(f16105b.get(enumC5595d).intValue(), enumC5595d);
        }
    }

    /* renamed from: a */
    public static int m16471a(EnumC5595d enumC5595d) {
        Integer num = f16105b.get(enumC5595d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC5595d);
    }

    /* renamed from: b */
    public static EnumC5595d m16472b(int i10) {
        EnumC5595d enumC5595d = f16104a.get(i10);
        if (enumC5595d != null) {
            return enumC5595d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
