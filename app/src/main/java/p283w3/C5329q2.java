package p283w3;

import p321z2.C5980h;

/* renamed from: w3.q2 */
/* loaded from: classes.dex */
public final class C5329q2 {

    /* renamed from: a */
    private final EnumC5151c8 f20024a;

    /* renamed from: c */
    private final Boolean f20026c;

    /* renamed from: e */
    private final C5153ca f20028e;

    /* renamed from: f */
    private final AbstractC5144c1<EnumC5322p8> f20029f;

    /* renamed from: g */
    private final AbstractC5144c1<EnumC5335q8> f20030g;

    /* renamed from: b */
    private final Boolean f20025b = null;

    /* renamed from: d */
    private final C5360s7 f20027d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5329q2(C5316p2 c5316p2, C5290n2 c5290n2) {
        this.f20024a = C5316p2.m19892i(c5316p2);
        this.f20026c = C5316p2.m19894k(c5316p2);
        this.f20028e = C5316p2.m19893j(c5316p2);
        this.f20029f = C5316p2.m19890a(c5316p2);
        this.f20030g = C5316p2.m19891b(c5316p2);
    }

    @InterfaceC5131b2(zza = 6)
    /* renamed from: a */
    public final AbstractC5144c1<EnumC5322p8> m19912a() {
        return this.f20029f;
    }

    @InterfaceC5131b2(zza = 7)
    /* renamed from: b */
    public final AbstractC5144c1<EnumC5335q8> m19913b() {
        return this.f20030g;
    }

    @InterfaceC5131b2(zza = 1)
    /* renamed from: c */
    public final EnumC5151c8 m19914c() {
        return this.f20024a;
    }

    @InterfaceC5131b2(zza = 5)
    /* renamed from: d */
    public final C5153ca m19915d() {
        return this.f20028e;
    }

    @InterfaceC5131b2(zza = 3)
    /* renamed from: e */
    public final Boolean m19916e() {
        return this.f20026c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5329q2)) {
            return false;
        }
        C5329q2 c5329q2 = (C5329q2) obj;
        return C5980h.m21269b(this.f20024a, c5329q2.f20024a) && C5980h.m21269b(null, null) && C5980h.m21269b(this.f20026c, c5329q2.f20026c) && C5980h.m21269b(null, null) && C5980h.m21269b(this.f20028e, c5329q2.f20028e) && C5980h.m21269b(this.f20029f, c5329q2.f20029f) && C5980h.m21269b(this.f20030g, c5329q2.f20030g);
    }

    public final int hashCode() {
        return C5980h.m21270c(this.f20024a, null, this.f20026c, null, this.f20028e, this.f20029f, this.f20030g);
    }
}
