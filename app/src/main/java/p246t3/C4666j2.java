package p246t3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: t3.j2 */
/* loaded from: classes.dex */
public final class C4666j2 extends AbstractC4702s2 {

    /* renamed from: n */
    private final AbstractC4624a0 f18466n;

    /* renamed from: o */
    private final int f18467o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4666j2(AbstractC4624a0 abstractC4624a0) throws C4662i2 {
        Objects.requireNonNull(abstractC4624a0);
        this.f18466n = abstractC4624a0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            AbstractC4624a0 abstractC4624a02 = this.f18466n;
            if (i10 >= abstractC4624a02.size()) {
                break;
            }
            int mo18779b = ((AbstractC4702s2) abstractC4624a02.get(i10)).mo18779b();
            if (i11 < mo18779b) {
                i11 = mo18779b;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f18467o = i12;
        if (i12 > 4) {
            throw new C4662i2("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p246t3.AbstractC4702s2
    /* renamed from: b */
    public final int mo18779b() {
        return this.f18467o;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4702s2 abstractC4702s2 = (AbstractC4702s2) obj;
        if (AbstractC4702s2.m18817d(Byte.MIN_VALUE) != abstractC4702s2.zza()) {
            return AbstractC4702s2.m18817d(Byte.MIN_VALUE) - abstractC4702s2.zza();
        }
        C4666j2 c4666j2 = (C4666j2) abstractC4702s2;
        AbstractC4624a0 abstractC4624a0 = this.f18466n;
        int size = abstractC4624a0.size();
        AbstractC4624a0 abstractC4624a02 = c4666j2.f18466n;
        if (size != abstractC4624a02.size()) {
            return abstractC4624a0.size() - abstractC4624a02.size();
        }
        int i10 = 0;
        while (true) {
            AbstractC4624a0 abstractC4624a03 = this.f18466n;
            if (i10 >= abstractC4624a03.size()) {
                return 0;
            }
            int compareTo = ((AbstractC4702s2) abstractC4624a03.get(i10)).compareTo((AbstractC4702s2) c4666j2.f18466n.get(i10));
            if (compareTo != 0) {
                return compareTo;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4666j2.class == obj.getClass()) {
            return this.f18466n.equals(((C4666j2) obj).f18466n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4702s2.m18817d(Byte.MIN_VALUE)), this.f18466n});
    }

    public final String toString() {
        if (this.f18466n.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        AbstractC4624a0 abstractC4624a0 = this.f18466n;
        int size = abstractC4624a0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((AbstractC4702s2) abstractC4624a0.get(i10)).toString().replace("\n", "\n  "));
        }
        C4655h m18761a = C4655h.m18761a(",\n  ");
        StringBuilder sb2 = new StringBuilder("[\n  ");
        try {
            m18761a.m18764b(sb2, arrayList.iterator());
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p246t3.AbstractC4702s2
    public final int zza() {
        return AbstractC4702s2.m18817d(Byte.MIN_VALUE);
    }
}
