package p279w;

import android.util.ArrayMap;
import java.util.Map;

/* renamed from: w.r1 */
/* loaded from: classes.dex */
public class C5074r1 extends C5043j2 {
    private C5074r1(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: f */
    public static C5074r1 m19686f() {
        return new C5074r1(new ArrayMap());
    }

    /* renamed from: g */
    public static C5074r1 m19687g(C5043j2 c5043j2) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c5043j2.m19579d()) {
            arrayMap.put(str, c5043j2.m19578c(str));
        }
        return new C5074r1(arrayMap);
    }

    /* renamed from: e */
    public void m19688e(C5043j2 c5043j2) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f19203a;
        if (map2 == null || (map = c5043j2.f19203a) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* renamed from: h */
    public void m19689h(String str, Object obj) {
        this.f19203a.put(str, obj);
    }
}
