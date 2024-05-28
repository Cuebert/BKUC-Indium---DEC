package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public class C0858y {

    /* renamed from: a */
    private final HashMap<String, AbstractC0856w> f4306a = new HashMap<>();

    /* renamed from: a */
    public final void m4951a() {
        Iterator<AbstractC0856w> it = this.f4306a.values().iterator();
        while (it.hasNext()) {
            it.next().m4945a();
        }
        this.f4306a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC0856w m4952b(String str) {
        return this.f4306a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> m4953c() {
        return new HashSet(this.f4306a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m4954d(String str, AbstractC0856w abstractC0856w) {
        AbstractC0856w put = this.f4306a.put(str, abstractC0856w);
        if (put != null) {
            put.mo4677d();
        }
    }
}
