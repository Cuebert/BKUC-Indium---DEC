package p020b6;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* renamed from: b6.o */
/* loaded from: classes.dex */
public final class C1064o extends AbstractC1061l {

    /* renamed from: a */
    private final LinkedTreeMap<String, AbstractC1061l> f5297a = new LinkedTreeMap<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1064o) && ((C1064o) obj).f5297a.equals(this.f5297a));
    }

    public int hashCode() {
        return this.f5297a.hashCode();
    }

    /* renamed from: p */
    public void m6341p(String str, AbstractC1061l abstractC1061l) {
        if (abstractC1061l == null) {
            abstractC1061l = C1063n.f5296a;
        }
        this.f5297a.put(str, abstractC1061l);
    }

    /* renamed from: q */
    public Set<Map.Entry<String, AbstractC1061l>> m6342q() {
        return this.f5297a.entrySet();
    }
}
