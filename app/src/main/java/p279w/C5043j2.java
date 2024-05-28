package p279w;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* renamed from: w.j2 */
/* loaded from: classes.dex */
public class C5043j2 {

    /* renamed from: b */
    private static final C5043j2 f19202b = new C5043j2(new ArrayMap());

    /* renamed from: a */
    protected final Map<String, Object> f19203a;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5043j2(Map<String, Object> map) {
        this.f19203a = map;
    }

    /* renamed from: a */
    public static C5043j2 m19576a() {
        return f19202b;
    }

    /* renamed from: b */
    public static C5043j2 m19577b(C5043j2 c5043j2) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c5043j2.m19579d()) {
            arrayMap.put(str, c5043j2.m19578c(str));
        }
        return new C5043j2(arrayMap);
    }

    /* renamed from: c */
    public Object m19578c(String str) {
        return this.f19203a.get(str);
    }

    /* renamed from: d */
    public Set<String> m19579d() {
        return this.f19203a.keySet();
    }
}
