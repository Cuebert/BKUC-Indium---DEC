package p279w;

import androidx.camera.core.C0463q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p279w.C5015c2;
import p279w.C5055m2;

/* renamed from: w.m2 */
/* loaded from: classes.dex */
public final class C5055m2 {

    /* renamed from: a */
    private final String f19250a;

    /* renamed from: b */
    private final Map<String, b> f19251b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.m2$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo19605a(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.m2$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final C5015c2 f19252a;

        /* renamed from: b */
        private boolean f19253b = false;

        /* renamed from: c */
        private boolean f19254c = false;

        b(C5015c2 c5015c2) {
            this.f19252a = c5015c2;
        }

        /* renamed from: a */
        boolean m19625a() {
            return this.f19254c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m19626b() {
            return this.f19253b;
        }

        /* renamed from: c */
        C5015c2 m19627c() {
            return this.f19252a;
        }

        /* renamed from: d */
        void m19628d(boolean z10) {
            this.f19254c = z10;
        }

        /* renamed from: e */
        void m19629e(boolean z10) {
            this.f19253b = z10;
        }
    }

    public C5055m2(String str) {
        this.f19250a = str;
    }

    /* renamed from: g */
    private b m19610g(String str, C5015c2 c5015c2) {
        b bVar = this.f19251b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(c5015c2);
        this.f19251b.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: h */
    private Collection<C5015c2> m19611h(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f19251b.entrySet()) {
            if (aVar == null || aVar.mo19605a(entry.getValue())) {
                arrayList.add(entry.getValue().m19627c());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ boolean m19612j(b bVar) {
        return bVar.m19625a() && bVar.m19626b();
    }

    /* renamed from: c */
    public C5015c2.f m19614c() {
        C5015c2.f fVar = new C5015c2.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f19251b.entrySet()) {
            b value = entry.getValue();
            if (value.m19625a() && value.m19626b()) {
                String key = entry.getKey();
                fVar.m19521a(value.m19627c());
                arrayList.add(key);
            }
        }
        C0463q1.m2202a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f19250a);
        return fVar;
    }

    /* renamed from: d */
    public Collection<C5015c2> m19615d() {
        return Collections.unmodifiableCollection(m19611h(new a() { // from class: w.l2
            @Override // p279w.C5055m2.a
            /* renamed from: a */
            public final boolean mo19605a(C5055m2.b bVar) {
                boolean m19612j;
                m19612j = C5055m2.m19612j(bVar);
                return m19612j;
            }
        }));
    }

    /* renamed from: e */
    public C5015c2.f m19616e() {
        C5015c2.f fVar = new C5015c2.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f19251b.entrySet()) {
            b value = entry.getValue();
            if (value.m19626b()) {
                fVar.m19521a(value.m19627c());
                arrayList.add(entry.getKey());
            }
        }
        C0463q1.m2202a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f19250a);
        return fVar;
    }

    /* renamed from: f */
    public Collection<C5015c2> m19617f() {
        return Collections.unmodifiableCollection(m19611h(new a() { // from class: w.k2
            @Override // p279w.C5055m2.a
            /* renamed from: a */
            public final boolean mo19605a(C5055m2.b bVar) {
                boolean m19626b;
                m19626b = bVar.m19626b();
                return m19626b;
            }
        }));
    }

    /* renamed from: i */
    public boolean m19618i(String str) {
        if (this.f19251b.containsKey(str)) {
            return this.f19251b.get(str).m19626b();
        }
        return false;
    }

    /* renamed from: l */
    public void m19619l(String str) {
        this.f19251b.remove(str);
    }

    /* renamed from: m */
    public void m19620m(String str, C5015c2 c5015c2) {
        m19610g(str, c5015c2).m19628d(true);
    }

    /* renamed from: n */
    public void m19621n(String str, C5015c2 c5015c2) {
        m19610g(str, c5015c2).m19629e(true);
    }

    /* renamed from: o */
    public void m19622o(String str) {
        if (this.f19251b.containsKey(str)) {
            b bVar = this.f19251b.get(str);
            bVar.m19629e(false);
            if (bVar.m19625a()) {
                return;
            }
            this.f19251b.remove(str);
        }
    }

    /* renamed from: p */
    public void m19623p(String str) {
        if (this.f19251b.containsKey(str)) {
            b bVar = this.f19251b.get(str);
            bVar.m19628d(false);
            if (bVar.m19626b()) {
                return;
            }
            this.f19251b.remove(str);
        }
    }

    /* renamed from: q */
    public void m19624q(String str, C5015c2 c5015c2) {
        if (this.f19251b.containsKey(str)) {
            b bVar = new b(c5015c2);
            b bVar2 = this.f19251b.get(str);
            bVar.m19629e(bVar2.m19626b());
            bVar.m19628d(bVar2.m19625a());
            this.f19251b.put(str, bVar);
        }
    }
}
