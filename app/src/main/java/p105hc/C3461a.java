package p105hc;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import p020b6.C1055f;
import p091gc.C3349u;
import p091gc.InterfaceC3334f;
import p193ob.AbstractC4179h0;
import p193ob.AbstractC4183j0;

/* renamed from: hc.a */
/* loaded from: classes.dex */
public final class C3461a extends InterfaceC3334f.a {

    /* renamed from: a */
    private final C1055f f14377a;

    private C3461a(C1055f c1055f) {
        this.f14377a = c1055f;
    }

    /* renamed from: f */
    public static C3461a m15181f() {
        return m15182g(new C1055f());
    }

    /* renamed from: g */
    public static C3461a m15182g(C1055f c1055f) {
        Objects.requireNonNull(c1055f, "gson == null");
        return new C3461a(c1055f);
    }

    @Override // p091gc.InterfaceC3334f.a
    /* renamed from: c */
    public InterfaceC3334f<?, AbstractC4179h0> mo14627c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3349u c3349u) {
        return new C3462b(this.f14377a, this.f14377a.m6307l(TypeToken.get(type)));
    }

    @Override // p091gc.InterfaceC3334f.a
    /* renamed from: d */
    public InterfaceC3334f<AbstractC4183j0, ?> mo14628d(Type type, Annotation[] annotationArr, C3349u c3349u) {
        return new C3463c(this.f14377a, this.f14377a.m6307l(TypeToken.get(type)));
    }
}
