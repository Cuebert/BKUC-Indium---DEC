package p246t3;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: t3.p2 */
/* loaded from: classes.dex */
public final class C4690p2 extends AbstractC4702s2 {

    /* renamed from: n */
    private final int f18488n;

    /* renamed from: o */
    private final C4660i0 f18489o;

    public C4690p2(C4660i0 c4660i0) throws C4662i2 {
        Objects.requireNonNull(c4660i0);
        this.f18489o = c4660i0;
        AbstractC4635c1 it = c4660i0.m18743c().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int mo18779b = ((AbstractC4702s2) entry.getKey()).mo18779b();
            i10 = i10 < mo18779b ? mo18779b : i10;
            int mo18779b2 = ((AbstractC4702s2) entry.getValue()).mo18779b();
            if (i10 < mo18779b2) {
                i10 = mo18779b2;
            }
        }
        int i11 = i10 + 1;
        this.f18488n = i11;
        if (i11 > 4) {
            throw new C4662i2("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p246t3.AbstractC4702s2
    /* renamed from: b */
    public final int mo18779b() {
        return this.f18488n;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        AbstractC4702s2 abstractC4702s2 = (AbstractC4702s2) obj;
        if (AbstractC4702s2.m18817d((byte) -96) != abstractC4702s2.zza()) {
            size2 = abstractC4702s2.zza();
            size = AbstractC4702s2.m18817d((byte) -96);
        } else {
            C4690p2 c4690p2 = (C4690p2) abstractC4702s2;
            if (this.f18489o.size() != c4690p2.f18489o.size()) {
                size = this.f18489o.size();
                size2 = c4690p2.f18489o.size();
            } else {
                AbstractC4635c1 it = this.f18489o.m18743c().iterator();
                AbstractC4635c1 it2 = c4690p2.f18489o.m18743c().iterator();
                do {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    int compareTo2 = ((AbstractC4702s2) entry.getKey()).compareTo((AbstractC4702s2) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((AbstractC4702s2) entry.getValue()).compareTo((AbstractC4702s2) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4690p2.class == obj.getClass()) {
            return this.f18489o.equals(((C4690p2) obj).f18489o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4702s2.m18817d((byte) -96)), this.f18489o});
    }

    /* renamed from: l */
    public final C4660i0 m18802l() {
        return this.f18489o;
    }

    public final String toString() {
        if (this.f18489o.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC4635c1 it = this.f18489o.m18743c().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((AbstractC4702s2) entry.getKey()).toString().replace("\n", "\n  "), ((AbstractC4702s2) entry.getValue()).toString().replace("\n", "\n  "));
        }
        C4655h m18761a = C4655h.m18761a(",\n  ");
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            C4651g.m18760a(sb2, linkedHashMap.entrySet().iterator(), m18761a, " : ");
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p246t3.AbstractC4702s2
    public final int zza() {
        return AbstractC4702s2.m18817d((byte) -96);
    }
}
