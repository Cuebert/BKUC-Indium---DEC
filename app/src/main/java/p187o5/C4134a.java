package p187o5;

import java.lang.annotation.Annotation;
import p187o5.InterfaceC4137d;

/* renamed from: o5.a */
/* loaded from: classes.dex */
public final class C4134a {

    /* renamed from: a */
    private int f16841a;

    /* renamed from: b */
    private InterfaceC4137d.a f16842b = InterfaceC4137d.a.DEFAULT;

    /* renamed from: o5.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC4137d {

        /* renamed from: a */
        private final int f16843a;

        /* renamed from: b */
        private final InterfaceC4137d.a f16844b;

        a(int i10, InterfaceC4137d.a aVar) {
            this.f16843a = i10;
            this.f16844b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC4137d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC4137d)) {
                return false;
            }
            InterfaceC4137d interfaceC4137d = (InterfaceC4137d) obj;
            return this.f16843a == interfaceC4137d.tag() && this.f16844b.equals(interfaceC4137d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f16843a ^ 14552422) + (this.f16844b.hashCode() ^ 2041407134);
        }

        @Override // p187o5.InterfaceC4137d
        public InterfaceC4137d.a intEncoding() {
            return this.f16844b;
        }

        @Override // p187o5.InterfaceC4137d
        public int tag() {
            return this.f16843a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f16843a + "intEncoding=" + this.f16844b + ')';
        }
    }

    /* renamed from: b */
    public static C4134a m17135b() {
        return new C4134a();
    }

    /* renamed from: a */
    public InterfaceC4137d m17136a() {
        return new a(this.f16841a, this.f16842b);
    }

    /* renamed from: c */
    public C4134a m17137c(int i10) {
        this.f16841a = i10;
        return this;
    }
}
