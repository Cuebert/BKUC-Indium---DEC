package p246t3;

import java.util.Arrays;

/* renamed from: t3.n2 */
/* loaded from: classes.dex */
public final class C4682n2 extends AbstractC4702s2 {

    /* renamed from: n */
    private final long f18482n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4682n2(long j10) {
        this.f18482n = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4702s2 abstractC4702s2 = (AbstractC4702s2) obj;
        if (zza() != abstractC4702s2.zza()) {
            return zza() - abstractC4702s2.zza();
        }
        long abs = Math.abs(this.f18482n);
        long abs2 = Math.abs(((C4682n2) abstractC4702s2).f18482n);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4682n2.class == obj.getClass() && this.f18482n == ((C4682n2) obj).f18482n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f18482n)});
    }

    /* renamed from: l */
    public final long m18795l() {
        return this.f18482n;
    }

    public final String toString() {
        return Long.toString(this.f18482n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p246t3.AbstractC4702s2
    public final int zza() {
        return AbstractC4702s2.m18817d(this.f18482n >= 0 ? (byte) 0 : (byte) 32);
    }
}
