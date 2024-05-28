package p283w3;

import p321z2.C5980h;

/* renamed from: w3.ca */
/* loaded from: classes.dex */
public final class C5153ca {

    /* renamed from: a */
    private final AbstractC5144c1<EnumC5453z9> f19488a;

    public /* synthetic */ C5153ca(C5139ba c5139ba, C5125aa c5125aa) {
        AbstractC5144c1<EnumC5453z9> abstractC5144c1;
        abstractC5144c1 = c5139ba.f19421a;
        this.f19488a = abstractC5144c1;
    }

    @InterfaceC5131b2(zza = 1)
    /* renamed from: a */
    public final AbstractC5144c1<EnumC5453z9> m19770a() {
        return this.f19488a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5153ca) {
            return C5980h.m21269b(this.f19488a, ((C5153ca) obj).f19488a);
        }
        return false;
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f19488a);
    }
}
