package p283w3;

import p321z2.C5980h;

/* renamed from: w3.s7 */
/* loaded from: classes.dex */
public final class C5360s7 {

    /* renamed from: a */
    private final EnumC5347r7 f20138a;

    /* renamed from: b */
    private final Integer f20139b;

    /* renamed from: c */
    private final Integer f20140c;

    /* renamed from: d */
    private final Boolean f20141d;

    public /* synthetic */ C5360s7(C5334q7 c5334q7, C5321p7 c5321p7) {
        EnumC5347r7 enumC5347r7;
        Integer num;
        enumC5347r7 = c5334q7.f20054a;
        this.f20138a = enumC5347r7;
        num = c5334q7.f20055b;
        this.f20139b = num;
        this.f20140c = null;
        this.f20141d = null;
    }

    @InterfaceC5131b2(zza = 1)
    /* renamed from: a */
    public final EnumC5347r7 m19964a() {
        return this.f20138a;
    }

    @InterfaceC5131b2(zza = 2)
    /* renamed from: b */
    public final Integer m19965b() {
        return this.f20139b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5360s7)) {
            return false;
        }
        C5360s7 c5360s7 = (C5360s7) obj;
        return C5980h.m21269b(this.f20138a, c5360s7.f20138a) && C5980h.m21269b(this.f20139b, c5360s7.f20139b) && C5980h.m21269b(null, null) && C5980h.m21269b(null, null);
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f20138a, this.f20139b, null, null);
    }
}
