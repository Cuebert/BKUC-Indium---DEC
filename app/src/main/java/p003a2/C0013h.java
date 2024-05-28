package p003a2;

import java.util.Arrays;
import java.util.Objects;
import p307y1.C5593b;

/* renamed from: a2.h */
/* loaded from: classes.dex */
public final class C0013h {

    /* renamed from: a */
    private final C5593b f161a;

    /* renamed from: b */
    private final byte[] f162b;

    public C0013h(C5593b c5593b, byte[] bArr) {
        Objects.requireNonNull(c5593b, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f161a = c5593b;
        this.f162b = bArr;
    }

    /* renamed from: a */
    public byte[] m128a() {
        return this.f162b;
    }

    /* renamed from: b */
    public C5593b m129b() {
        return this.f161a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0013h)) {
            return false;
        }
        C0013h c0013h = (C0013h) obj;
        if (this.f161a.equals(c0013h.f161a)) {
            return Arrays.equals(this.f162b, c0013h.f162b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f161a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f162b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f161a + ", bytes=[...]}";
    }
}
