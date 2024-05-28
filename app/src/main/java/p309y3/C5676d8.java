package p309y3;

import java.lang.annotation.Annotation;

/* renamed from: y3.d8 */
/* loaded from: classes.dex */
final class C5676d8 implements InterfaceC5726i8 {

    /* renamed from: a */
    private final int f20910a;

    /* renamed from: b */
    private final EnumC5716h8 f20911b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5676d8(int i10, EnumC5716h8 enumC5716h8) {
        this.f20910a = i10;
        this.f20911b = enumC5716h8;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC5726i8.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5726i8)) {
            return false;
        }
        InterfaceC5726i8 interfaceC5726i8 = (InterfaceC5726i8) obj;
        return this.f20910a == interfaceC5726i8.zza() && this.f20911b.equals(interfaceC5726i8.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f20910a ^ 14552422) + (this.f20911b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f20910a + "intEncoding=" + this.f20911b + ')';
    }

    @Override // p309y3.InterfaceC5726i8
    public final int zza() {
        return this.f20910a;
    }

    @Override // p309y3.InterfaceC5726i8
    public final EnumC5716h8 zzb() {
        return this.f20911b;
    }
}
