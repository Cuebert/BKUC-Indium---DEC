package p246t3;

import java.util.Arrays;

/* renamed from: t3.k2 */
/* loaded from: classes.dex */
public final class C4670k2 extends AbstractC4702s2 {

    /* renamed from: n */
    private final boolean f18470n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4670k2(boolean z10) {
        this.f18470n = z10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4702s2 abstractC4702s2 = (AbstractC4702s2) obj;
        if (AbstractC4702s2.m18817d((byte) -32) != abstractC4702s2.zza()) {
            return AbstractC4702s2.m18817d((byte) -32) - abstractC4702s2.zza();
        }
        return (true != this.f18470n ? 20 : 21) - (true == ((C4670k2) abstractC4702s2).f18470n ? 21 : 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4670k2.class == obj.getClass() && this.f18470n == ((C4670k2) obj).f18470n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4702s2.m18817d((byte) -32)), Boolean.valueOf(this.f18470n)});
    }

    public final String toString() {
        return Boolean.toString(this.f18470n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p246t3.AbstractC4702s2
    public final int zza() {
        return AbstractC4702s2.m18817d((byte) -32);
    }
}
