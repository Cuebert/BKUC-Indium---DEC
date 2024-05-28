package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public class C0850q {

    /* renamed from: a */
    private Map<String, Integer> f4289a = new HashMap();

    /* renamed from: a */
    public boolean m4924a(String str, int i10) {
        Integer num = this.f4289a.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z10 = (intValue & i10) != 0;
        this.f4289a.put(str, Integer.valueOf(i10 | intValue));
        return !z10;
    }
}
