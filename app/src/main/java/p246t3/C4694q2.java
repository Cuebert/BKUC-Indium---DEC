package p246t3;

import java.util.Arrays;

/* renamed from: t3.q2 */
/* loaded from: classes.dex */
public final class C4694q2 extends AbstractC4702s2 {

    /* renamed from: n */
    private final String f18491n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4694q2(String str) {
        this.f18491n = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        AbstractC4702s2 abstractC4702s2 = (AbstractC4702s2) obj;
        if (AbstractC4702s2.m18817d((byte) 96) != abstractC4702s2.zza()) {
            length2 = abstractC4702s2.zza();
            length = AbstractC4702s2.m18817d((byte) 96);
        } else {
            String str = this.f18491n;
            int length3 = str.length();
            String str2 = ((C4694q2) abstractC4702s2).f18491n;
            if (length3 == str2.length()) {
                return str.compareTo(str2);
            }
            length = str.length();
            length2 = str2.length();
        }
        return length - length2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4694q2.class == obj.getClass()) {
            return this.f18491n.equals(((C4694q2) obj).f18491n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4702s2.m18817d((byte) 96)), this.f18491n});
    }

    public final String toString() {
        return "\"" + this.f18491n + "\"";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p246t3.AbstractC4702s2
    public final int zza() {
        return AbstractC4702s2.m18817d((byte) 96);
    }
}
