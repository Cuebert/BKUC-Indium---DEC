package p033c7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: c7.d */
/* loaded from: classes.dex */
public class C1135d implements InterfaceC1133b {

    /* renamed from: a */
    private HashMap<String, C1132a> f5471a = new HashMap<>();

    @Override // p033c7.InterfaceC1133b
    /* renamed from: r1 */
    public Set<Map.Entry<String, C1132a>> mo6536r1() {
        return this.f5471a.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public void m6538w1(String str, C1132a c1132a) {
        this.f5471a.put(str, c1132a);
    }
}
