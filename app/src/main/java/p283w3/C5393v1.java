package p283w3;

import java.lang.annotation.Annotation;

/* renamed from: w3.v1 */
/* loaded from: classes.dex */
final class C5393v1 implements InterfaceC5131b2 {

    /* renamed from: a */
    private final int f20191a;

    /* renamed from: b */
    private final EnumC5445z1 f20192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5393v1(int i10, EnumC5445z1 enumC5445z1) {
        this.f20191a = i10;
        this.f20192b = enumC5445z1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC5131b2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5131b2)) {
            return false;
        }
        InterfaceC5131b2 interfaceC5131b2 = (InterfaceC5131b2) obj;
        return this.f20191a == interfaceC5131b2.zza() && this.f20192b.equals(interfaceC5131b2.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f20191a ^ 14552422) + (this.f20192b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f20191a + "intEncoding=" + this.f20192b + ')';
    }

    @Override // p283w3.InterfaceC5131b2
    public final int zza() {
        return this.f20191a;
    }

    @Override // p283w3.InterfaceC5131b2
    public final EnumC5445z1 zzb() {
        return this.f20192b;
    }
}
