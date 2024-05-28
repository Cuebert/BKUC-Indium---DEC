package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f4327a = 0;

    /* renamed from: b */
    int f4328b = 0;

    /* renamed from: c */
    int f4329c = 0;

    /* renamed from: d */
    int f4330d = -1;

    /* renamed from: a */
    public int m4982a() {
        return this.f4328b;
    }

    /* renamed from: b */
    public int m4983b() {
        int i10 = this.f4329c;
        int m4984c = m4984c();
        if (m4984c == 6) {
            i10 |= 4;
        } else if (m4984c == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    /* renamed from: c */
    public int m4984c() {
        int i10 = this.f4330d;
        return i10 != -1 ? i10 : AudioAttributesCompat.m4980a(false, this.f4329c, this.f4327a);
    }

    /* renamed from: d */
    public int m4985d() {
        return this.f4327a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f4328b == audioAttributesImplBase.m4982a() && this.f4329c == audioAttributesImplBase.m4983b() && this.f4327a == audioAttributesImplBase.m4985d() && this.f4330d == audioAttributesImplBase.f4330d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4328b), Integer.valueOf(this.f4329c), Integer.valueOf(this.f4327a), Integer.valueOf(this.f4330d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f4330d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f4330d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m4981b(this.f4327a));
        sb2.append(" content=");
        sb2.append(this.f4328b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f4329c).toUpperCase());
        return sb2.toString();
    }
}
